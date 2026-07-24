package mcframe.clientMSBB.MSBBP1260;

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
import mcframe.clientMSBB.MSBBP1260.MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Srch01Caller;
import mcframe.clientMSBB.MSBBP1260.MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Srch02Caller;
import mcframe.clientMSBB.MSBBP1260.MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Upd01Caller;
import mcframe.clientMSBB.MSBBP1260.MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Del01Caller;
import mcframe.clientMSBB.MSBBP1260.MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Prnt01Caller;

/**
 * 画面"MSBBP_SloPrmsListReg"パネルクラスです。<p>
 *
 * 得意先への納期回答を一覧形式で登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SloPrmsListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1260";

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
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
	// [PrmsSts]ブロック関連のField定義
	public MCPanel PrmsStsPanel = null;
	public MCTitledBorder PrmsStsTitledBorder = null;
	// [PrmsSts]ブロックの項目のField定義
	// [PrmsPrnt]ブロック関連のField定義
	public MCPanel PrmsPrntPanel = null;
	public MCTitledBorder PrmsPrntTitledBorder = null;
	// [PrmsPrnt]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [CstCnd]ブロック関連のField定義
	public MCPanel CstCndPanel = null;
	// [CstCnd]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View;PRNT,Issue report UPD,登録・訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_edi_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_edi_flg = null;
	/**
	 * Unanswered 未回答.<p>
	 *
	 */
	public MCCheckBox Cnd_not_prms_flg = null;
	/**
	 * Replied 回答済.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_not_prnted = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_prnted = null;
	public MCLabel Cnd_slo_dt_fr_Label = null;
	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_slo_dt_fr = null;
	public MCLabel Cnd_slo_dt_to_Label = null;
	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_slo_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_inst_dt_p_PPanel;
	public MCDateField Cnd_dlv_inst_dt_fr;	// [Cnd]の[dlv_inst_dt_p.ymd_fr]を[Cnd_dlv_inst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_inst_hm_fr;	// [Cnd]の[dlv_inst_dt_p.hm_fr]を[Cnd_dlv_inst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_inst_dt_to;	// [Cnd]の[dlv_inst_dt_p.ymd_to]を[Cnd_dlv_inst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_inst_hm_to;	// [Cnd]の[dlv_inst_dt_p.hm_to]を[Cnd_dlv_inst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_rqst_dt_p_PPanel;
	public MCDateField Cnd_ship_rqst_dt_fr;	// [Cnd]の[ship_rqst_dt_p.ymd_fr]を[Cnd_ship_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_rqst_hm_fr;	// [Cnd]の[ship_rqst_dt_p.hm_fr]を[Cnd_ship_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_rqst_dt_to;	// [Cnd]の[ship_rqst_dt_p.ymd_to]を[Cnd_ship_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_rqst_hm_to;	// [Cnd]の[ship_rqst_dt_p.hm_to]を[Cnd_ship_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_pd_inst_dlv_dt_p_PPanel;
	public MCDateField Cnd_pd_inst_dlv_dt_fr;	// [Cnd]の[pd_inst_dlv_dt_p.ymd_fr]を[Cnd_pd_inst_dlv_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_pd_inst_dlv_hm_fr;	// [Cnd]の[pd_inst_dlv_dt_p.hm_fr]を[Cnd_pd_inst_dlv_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_pd_inst_dlv_dt_to;	// [Cnd]の[pd_inst_dlv_dt_p.ymd_to]を[Cnd_pd_inst_dlv_dt_to]としてエイリアス定義。
	public MCDateField Cnd_pd_inst_dlv_hm_to;	// [Cnd]の[pd_inst_dlv_dt_p.hm_to]を[Cnd_pd_inst_dlv_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_schd_dt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ship_schd_dt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ship_schd_dt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ship_schd_dt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ship_schd_dt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_schd_dt_p_PPanel;
	public MCDateField Cnd_dlv_schd_dt_fr;	// [Cnd]の[dlv_schd_dt_p.ymd_fr]を[Cnd_dlv_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_fr;	// [Cnd]の[dlv_schd_dt_p.hm_fr]を[Cnd_dlv_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_dt_to;	// [Cnd]の[dlv_schd_dt_p.ymd_to]を[Cnd_dlv_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_to;	// [Cnd]の[dlv_schd_dt_p.hm_to]を[Cnd_dlv_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_prms_dt_p_PPanel;
	public MCDateField Cnd_prms_dt_fr;	// [Cnd]の[prms_dt_p.ymd_fr]を[Cnd_prms_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_prms_hm_fr;	// [Cnd]の[prms_dt_p.hm_fr]を[Cnd_prms_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_prms_dt_to;	// [Cnd]の[prms_dt_p.ymd_to]を[Cnd_prms_dt_to]としてエイリアス定義。
	public MCDateField Cnd_prms_hm_to;	// [Cnd]の[prms_dt_p.hm_to]を[Cnd_prms_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_cst_itm_cd_Label = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_d_no = null;
	public MCLabel Cnd_cst_po_no_Label = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_po_no = null;
	public MCLabel Cnd_cst_po_d_no_Label = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_po_d_no = null;
	public MCLabel Cnd_cst_dlv_inst_no_Label = null;
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_dlv_inst_no = null;
	public MCLabel Cnd_cst_dlv_inst_d_no_Label = null;
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_dlv_inst_d_no = null;
	public MCLabel Cnd_ship_schd_no_Label = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_schd_no = null;
	public MCLabel Cnd_slo_prms_h_no_Label = null;
	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_prms_h_no = null;
	public MCLabel Cnd_slo_prms_no_Label = null;
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_prms_no = null;
	public MCLabel Cnd_prms_rmrks_Label = null;
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public MCTextField Cnd_prms_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
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
	public MCCheckBox Cnd_incl_can_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_dlv_grp_p_PPanel;
	public MCLabel Cnd_dlv_grp_lab1;	// [Cnd]の[dlv_grp_p.bp_grp_lab1]を[Cnd_dlv_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg1;	// [Cnd]の[dlv_grp_p.bp_grp_flg1]を[Cnd_dlv_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd1;	// [Cnd]の[dlv_grp_p.bp_grp_cd1]を[Cnd_dlv_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm1;	// [Cnd]の[dlv_grp_p.bp_grp_nm1]を[Cnd_dlv_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab2;	// [Cnd]の[dlv_grp_p.bp_grp_lab2]を[Cnd_dlv_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg2;	// [Cnd]の[dlv_grp_p.bp_grp_flg2]を[Cnd_dlv_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd2;	// [Cnd]の[dlv_grp_p.bp_grp_cd2]を[Cnd_dlv_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm2;	// [Cnd]の[dlv_grp_p.bp_grp_nm2]を[Cnd_dlv_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab3;	// [Cnd]の[dlv_grp_p.bp_grp_lab3]を[Cnd_dlv_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg3;	// [Cnd]の[dlv_grp_p.bp_grp_flg3]を[Cnd_dlv_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd3;	// [Cnd]の[dlv_grp_p.bp_grp_cd3]を[Cnd_dlv_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm3;	// [Cnd]の[dlv_grp_p.bp_grp_nm3]を[Cnd_dlv_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab4;	// [Cnd]の[dlv_grp_p.bp_grp_lab4]を[Cnd_dlv_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg4;	// [Cnd]の[dlv_grp_p.bp_grp_flg4]を[Cnd_dlv_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd4;	// [Cnd]の[dlv_grp_p.bp_grp_cd4]を[Cnd_dlv_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm4;	// [Cnd]の[dlv_grp_p.bp_grp_nm4]を[Cnd_dlv_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab5;	// [Cnd]の[dlv_grp_p.bp_grp_lab5]を[Cnd_dlv_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg5;	// [Cnd]の[dlv_grp_p.bp_grp_flg5]を[Cnd_dlv_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd5;	// [Cnd]の[dlv_grp_p.bp_grp_cd5]を[Cnd_dlv_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm5;	// [Cnd]の[dlv_grp_p.bp_grp_nm5]を[Cnd_dlv_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab6;	// [Cnd]の[dlv_grp_p.bp_grp_lab6]を[Cnd_dlv_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg6;	// [Cnd]の[dlv_grp_p.bp_grp_flg6]を[Cnd_dlv_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd6;	// [Cnd]の[dlv_grp_p.bp_grp_cd6]を[Cnd_dlv_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm6;	// [Cnd]の[dlv_grp_p.bp_grp_nm6]を[Cnd_dlv_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab7;	// [Cnd]の[dlv_grp_p.bp_grp_lab7]を[Cnd_dlv_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg7;	// [Cnd]の[dlv_grp_p.bp_grp_flg7]を[Cnd_dlv_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd7;	// [Cnd]の[dlv_grp_p.bp_grp_cd7]を[Cnd_dlv_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm7;	// [Cnd]の[dlv_grp_p.bp_grp_nm7]を[Cnd_dlv_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab8;	// [Cnd]の[dlv_grp_p.bp_grp_lab8]を[Cnd_dlv_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg8;	// [Cnd]の[dlv_grp_p.bp_grp_flg8]を[Cnd_dlv_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd8;	// [Cnd]の[dlv_grp_p.bp_grp_cd8]を[Cnd_dlv_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm8;	// [Cnd]の[dlv_grp_p.bp_grp_nm8]を[Cnd_dlv_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab9;	// [Cnd]の[dlv_grp_p.bp_grp_lab9]を[Cnd_dlv_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg9;	// [Cnd]の[dlv_grp_p.bp_grp_flg9]を[Cnd_dlv_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd9;	// [Cnd]の[dlv_grp_p.bp_grp_cd9]を[Cnd_dlv_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm9;	// [Cnd]の[dlv_grp_p.bp_grp_nm9]を[Cnd_dlv_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab10;	// [Cnd]の[dlv_grp_p.bp_grp_lab10]を[Cnd_dlv_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg10;	// [Cnd]の[dlv_grp_p.bp_grp_flg10]を[Cnd_dlv_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd10;	// [Cnd]の[dlv_grp_p.bp_grp_cd10]を[Cnd_dlv_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm10;	// [Cnd]の[dlv_grp_p.bp_grp_nm10]を[Cnd_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_cst_grp_p_PPanel;
	public MCLabel Cnd_cst_grp_lab1;	// [Cnd]の[cst_grp_p.bp_grp_lab1]を[Cnd_cst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg1;	// [Cnd]の[cst_grp_p.bp_grp_flg1]を[Cnd_cst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd1;	// [Cnd]の[cst_grp_p.bp_grp_cd1]を[Cnd_cst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm1;	// [Cnd]の[cst_grp_p.bp_grp_nm1]を[Cnd_cst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab2;	// [Cnd]の[cst_grp_p.bp_grp_lab2]を[Cnd_cst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg2;	// [Cnd]の[cst_grp_p.bp_grp_flg2]を[Cnd_cst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd2;	// [Cnd]の[cst_grp_p.bp_grp_cd2]を[Cnd_cst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm2;	// [Cnd]の[cst_grp_p.bp_grp_nm2]を[Cnd_cst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab3;	// [Cnd]の[cst_grp_p.bp_grp_lab3]を[Cnd_cst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg3;	// [Cnd]の[cst_grp_p.bp_grp_flg3]を[Cnd_cst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd3;	// [Cnd]の[cst_grp_p.bp_grp_cd3]を[Cnd_cst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm3;	// [Cnd]の[cst_grp_p.bp_grp_nm3]を[Cnd_cst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab4;	// [Cnd]の[cst_grp_p.bp_grp_lab4]を[Cnd_cst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg4;	// [Cnd]の[cst_grp_p.bp_grp_flg4]を[Cnd_cst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd4;	// [Cnd]の[cst_grp_p.bp_grp_cd4]を[Cnd_cst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm4;	// [Cnd]の[cst_grp_p.bp_grp_nm4]を[Cnd_cst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab5;	// [Cnd]の[cst_grp_p.bp_grp_lab5]を[Cnd_cst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg5;	// [Cnd]の[cst_grp_p.bp_grp_flg5]を[Cnd_cst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd5;	// [Cnd]の[cst_grp_p.bp_grp_cd5]を[Cnd_cst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm5;	// [Cnd]の[cst_grp_p.bp_grp_nm5]を[Cnd_cst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab6;	// [Cnd]の[cst_grp_p.bp_grp_lab6]を[Cnd_cst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg6;	// [Cnd]の[cst_grp_p.bp_grp_flg6]を[Cnd_cst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd6;	// [Cnd]の[cst_grp_p.bp_grp_cd6]を[Cnd_cst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm6;	// [Cnd]の[cst_grp_p.bp_grp_nm6]を[Cnd_cst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab7;	// [Cnd]の[cst_grp_p.bp_grp_lab7]を[Cnd_cst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg7;	// [Cnd]の[cst_grp_p.bp_grp_flg7]を[Cnd_cst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd7;	// [Cnd]の[cst_grp_p.bp_grp_cd7]を[Cnd_cst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm7;	// [Cnd]の[cst_grp_p.bp_grp_nm7]を[Cnd_cst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab8;	// [Cnd]の[cst_grp_p.bp_grp_lab8]を[Cnd_cst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg8;	// [Cnd]の[cst_grp_p.bp_grp_flg8]を[Cnd_cst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd8;	// [Cnd]の[cst_grp_p.bp_grp_cd8]を[Cnd_cst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm8;	// [Cnd]の[cst_grp_p.bp_grp_nm8]を[Cnd_cst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab9;	// [Cnd]の[cst_grp_p.bp_grp_lab9]を[Cnd_cst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg9;	// [Cnd]の[cst_grp_p.bp_grp_flg9]を[Cnd_cst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd9;	// [Cnd]の[cst_grp_p.bp_grp_cd9]を[Cnd_cst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm9;	// [Cnd]の[cst_grp_p.bp_grp_nm9]を[Cnd_cst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab10;	// [Cnd]の[cst_grp_p.bp_grp_lab10]を[Cnd_cst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg10;	// [Cnd]の[cst_grp_p.bp_grp_flg10]を[Cnd_cst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd10;	// [Cnd]の[cst_grp_p.bp_grp_cd10]を[Cnd_cst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm10;	// [Cnd]の[cst_grp_p.bp_grp_nm10]を[Cnd_cst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCLabel Cnd_itm_grp_lab1;	// [Cnd]の[itm_grp_p.itm_grp_lab1]を[Cnd_itm_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab2;	// [Cnd]の[itm_grp_p.itm_grp_lab2]を[Cnd_itm_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab3;	// [Cnd]の[itm_grp_p.itm_grp_lab3]を[Cnd_itm_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab4;	// [Cnd]の[itm_grp_p.itm_grp_lab4]を[Cnd_itm_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab5;	// [Cnd]の[itm_grp_p.itm_grp_lab5]を[Cnd_itm_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab6;	// [Cnd]の[itm_grp_p.itm_grp_lab6]を[Cnd_itm_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab7;	// [Cnd]の[itm_grp_p.itm_grp_lab7]を[Cnd_itm_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab8;	// [Cnd]の[itm_grp_p.itm_grp_lab8]を[Cnd_itm_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab9;	// [Cnd]の[itm_grp_p.itm_grp_lab9]を[Cnd_itm_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab10;	// [Cnd]の[itm_grp_p.itm_grp_lab10]を[Cnd_itm_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
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
	public MCTitledBorder BulkSetTitledBorder = null;
	// [BulkSet]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_prms_dlv_dt_p_PPanel;
	public MCDateField BulkSet_prms_dlv_dt;	// [BulkSet]の[prms_dlv_dt_p.ymd]を[BulkSet_prms_dlv_dt]としてエイリアス定義。
	public MCDateField BulkSet_prms_dlv_hm;	// [BulkSet]の[prms_dlv_dt_p.hm]を[BulkSet_prms_dlv_hm]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1260.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_sts_typ_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_dt = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_nm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_sls_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_sls_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_sls_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_sls_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_sls_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_sls_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_sls_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_sls_dpt_nm]としてエイリアス定義。
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_rev = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_d_no = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Sales order unit number of decimal places 受注単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_trd_unit_dec_place = null;
	/**
	 * Sales order unit cd. 受注単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_trd_unit_cd = null;
	/**
	 * Sales order unit name 受注単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_slo_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_slo_trd_unit_qty;// [Rslt]の[slo_trd_unit_qty_p.qty]を[columnRslt_slo_trd_unit_qty]としてエイリアス定義。
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_rcpt_no = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_dlv_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_dlv_inst_qty;// [Rslt]の[dlv_inst_qty_p.qty]を[columnRslt_dlv_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_inst_dt_p_PPanel;
	public MCColumnConfig columnRslt_dlv_inst_dt;// [Rslt]の[dlv_inst_dt_p.ymd]を[columnRslt_dlv_inst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_inst_hm;// [Rslt]の[dlv_inst_dt_p.hm]を[columnRslt_dlv_inst_hm]としてエイリアス定義。
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_dlv_inst_no = null;
	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_dlv_inst_rev = null;
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_dlv_inst_d_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_no = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_pr_no = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_nm = null;
	/**
	 * Shipping distribution group WG cd. 出荷物流グループワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_wg_cd = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_rqst_dt_p_PPanel;
	public MCColumnConfig columnRslt_ship_rqst_dt;// [Rslt]の[ship_rqst_dt_p.ymd]を[columnRslt_ship_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_hm;// [Rslt]の[ship_rqst_dt_p.hm]を[columnRslt_ship_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_pd_inst_dlv_dt_p_PPanel;
	public MCColumnConfig columnRslt_pd_inst_dlv_dt;// [Rslt]の[pd_inst_dlv_dt_p.ymd]を[columnRslt_pd_inst_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_pd_inst_dlv_hm;// [Rslt]の[pd_inst_dlv_dt_p.hm]を[columnRslt_pd_inst_dlv_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_ship_schd_dt;// [Rslt]の[ship_schd_dt_p.ymd]を[columnRslt_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_schd_hm;// [Rslt]の[ship_schd_dt_p.hm]を[columnRslt_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_dlv_schd_dt;// [Rslt]の[dlv_schd_dt_p.ymd]を[columnRslt_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_schd_hm;// [Rslt]の[dlv_schd_dt_p.hm]を[columnRslt_dlv_schd_hm]としてエイリアス定義。
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_nm = null;
	/**
	 * Reply unit number of decimal places 回答単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Reply unit cd. 回答単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Reply unit name 回答単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_prms_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_prms_qty;// [Rslt]の[trd_unit_prms_qty_p.qty]を[columnRslt_trd_unit_prms_qty]としてエイリアス定義。
	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_prms_h_no = null;
	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_org_slo_prms_h_no = null;
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_prms_no = null;
	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_prms_rev = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_prms_dlv_dt_p_PPanel;
	public MCColumnConfig columnRslt_prms_dlv_dt;// [Rslt]の[prms_dlv_dt_p.ymd]を[columnRslt_prms_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_prms_dlv_hm;// [Rslt]の[prms_dlv_dt_p.hm]を[columnRslt_prms_dlv_hm]としてエイリアス定義。
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Order promising note issue date and time 納期回答書発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prms_prnt_tm = null;
	/**
	 * Order promising note rev. number 納期回答書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_prms_rev = null;
	/**
	 * Order promising note issued flg. 納期回答書発行済ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_prms_prnt_flg = null;
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prms_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_prms_flg = null;
	/**
	 * Last EDI 前回ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_edi_prms_flg = null;
	/**
	 * For EDI order promising export ＥＤＩ納期回答送信対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_send_flg = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_dlv_grp_p_PPanel;
	public MCColumnConfig columnRslt_dlv_grp_cd1;// [Rslt]の[dlv_grp_p.bp_grp_cd1]を[columnRslt_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm1;// [Rslt]の[dlv_grp_p.bp_grp_nm1]を[columnRslt_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd2;// [Rslt]の[dlv_grp_p.bp_grp_cd2]を[columnRslt_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm2;// [Rslt]の[dlv_grp_p.bp_grp_nm2]を[columnRslt_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd3;// [Rslt]の[dlv_grp_p.bp_grp_cd3]を[columnRslt_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm3;// [Rslt]の[dlv_grp_p.bp_grp_nm3]を[columnRslt_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd4;// [Rslt]の[dlv_grp_p.bp_grp_cd4]を[columnRslt_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm4;// [Rslt]の[dlv_grp_p.bp_grp_nm4]を[columnRslt_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd5;// [Rslt]の[dlv_grp_p.bp_grp_cd5]を[columnRslt_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm5;// [Rslt]の[dlv_grp_p.bp_grp_nm5]を[columnRslt_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd6;// [Rslt]の[dlv_grp_p.bp_grp_cd6]を[columnRslt_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm6;// [Rslt]の[dlv_grp_p.bp_grp_nm6]を[columnRslt_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd7;// [Rslt]の[dlv_grp_p.bp_grp_cd7]を[columnRslt_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm7;// [Rslt]の[dlv_grp_p.bp_grp_nm7]を[columnRslt_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd8;// [Rslt]の[dlv_grp_p.bp_grp_cd8]を[columnRslt_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm8;// [Rslt]の[dlv_grp_p.bp_grp_nm8]を[columnRslt_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd9;// [Rslt]の[dlv_grp_p.bp_grp_cd9]を[columnRslt_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm9;// [Rslt]の[dlv_grp_p.bp_grp_nm9]を[columnRslt_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd10;// [Rslt]の[dlv_grp_p.bp_grp_cd10]を[columnRslt_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm10;// [Rslt]の[dlv_grp_p.bp_grp_nm10]を[columnRslt_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_cst_grp_p_PPanel;
	public MCColumnConfig columnRslt_cst_grp_cd1;// [Rslt]の[cst_grp_p.bp_grp_cd1]を[columnRslt_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm1;// [Rslt]の[cst_grp_p.bp_grp_nm1]を[columnRslt_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd2;// [Rslt]の[cst_grp_p.bp_grp_cd2]を[columnRslt_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm2;// [Rslt]の[cst_grp_p.bp_grp_nm2]を[columnRslt_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd3;// [Rslt]の[cst_grp_p.bp_grp_cd3]を[columnRslt_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm3;// [Rslt]の[cst_grp_p.bp_grp_nm3]を[columnRslt_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd4;// [Rslt]の[cst_grp_p.bp_grp_cd4]を[columnRslt_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm4;// [Rslt]の[cst_grp_p.bp_grp_nm4]を[columnRslt_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd5;// [Rslt]の[cst_grp_p.bp_grp_cd5]を[columnRslt_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm5;// [Rslt]の[cst_grp_p.bp_grp_nm5]を[columnRslt_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd6;// [Rslt]の[cst_grp_p.bp_grp_cd6]を[columnRslt_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm6;// [Rslt]の[cst_grp_p.bp_grp_nm6]を[columnRslt_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd7;// [Rslt]の[cst_grp_p.bp_grp_cd7]を[columnRslt_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm7;// [Rslt]の[cst_grp_p.bp_grp_nm7]を[columnRslt_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd8;// [Rslt]の[cst_grp_p.bp_grp_cd8]を[columnRslt_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm8;// [Rslt]の[cst_grp_p.bp_grp_nm8]を[columnRslt_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd9;// [Rslt]の[cst_grp_p.bp_grp_cd9]を[columnRslt_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm9;// [Rslt]の[cst_grp_p.bp_grp_nm9]を[columnRslt_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd10;// [Rslt]の[cst_grp_p.bp_grp_cd10]を[columnRslt_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm10;// [Rslt]の[cst_grp_p.bp_grp_nm10]を[columnRslt_cst_grp_nm10]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_rtn_sts_typ_nm;// [Rslt]の[rts_msg_p.rtn_sts_typ_nm]を[columnRslt_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_msg_id;// [Rslt]の[rts_msg_p.msg_id]を[columnRslt_msg_id]としてエイリアス定義。
	public MCColumnConfig columnRslt_msg;// [Rslt]の[rts_msg_p.msg]を[columnRslt_msg]としてエイリアス定義。
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
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_pr_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales order promising entry 販売納期調整登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1230 = null;
	/**
	 * Order promising note issue 納期回答書発行.<p>
	 *
	 */
	public MCButton Btn_prnt_prms = null;
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
	 * Select current EDI order promising 今回ＥＤＩ納期回答選択.<p>
	 *
	 */
	public MCLabel Btn_label_edi_prms = null;
	/**
	 * Select all current EDI order promising 今回ＥＤＩ納期回答全選択.<p>
	 *
	 */
	public MCButton Btn_edi_prms_select_all = null;
	/**
	 * Release all current EDI order promising 今回ＥＤＩ納期回答全解除.<p>
	 *
	 */
	public MCButton Btn_edi_prms_deselect_all = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Order promising note immediate issue 納期回答書即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_out_flg = null;
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
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UPD, SRCH_DEL, SRCH_REF, UPD, DEL, REF, PRNT};
	
	/** [MS_MSBBL1260_Srch01]のCallerの作成 */
	protected MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Srch01Caller createMS_MSBBL1260_Srch01() {
		MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Srch01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Srch01Bridge>
		caller = ((MSBBP_SloPrmsListReg_MC)this).new MS_MSBBL1260_Srch01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Srch01Bridge>(
					(MSBBP_SloPrmsListReg)this, new MS_MSBBL1260_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1260_Srch01]の呼び出し */
	protected void callMS_MSBBL1260_Srch01() {
		MCCaller caller = createMS_MSBBL1260_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1260_Srch02]のCallerの作成 */
	protected MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Srch02Caller createMS_MSBBL1260_Srch02() {
		MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Srch02Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Srch02Bridge>
		caller = ((MSBBP_SloPrmsListReg_MC)this).new MS_MSBBL1260_Srch02Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Srch02Bridge>(
					(MSBBP_SloPrmsListReg)this, new MS_MSBBL1260_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL1260_Srch02]の呼び出し */
	protected void callMS_MSBBL1260_Srch02() {
		MCCaller caller = createMS_MSBBL1260_Srch02();
		caller.exec();
	}
	/** [MS_MSBBL1260_Upd01]のCallerの作成 */
	protected MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Upd01Caller createMS_MSBBL1260_Upd01() {
		MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Upd01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Upd01Bridge>
		caller = ((MSBBP_SloPrmsListReg_MC)this).new MS_MSBBL1260_Upd01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Upd01Bridge>(
					(MSBBP_SloPrmsListReg)this, new MS_MSBBL1260_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1260_Upd01]の呼び出し */
	protected void callMS_MSBBL1260_Upd01() {
		MCCaller caller = createMS_MSBBL1260_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1260_Del01]のCallerの作成 */
	protected MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Del01Caller createMS_MSBBL1260_Del01() {
		MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Del01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Del01Bridge>
		caller = ((MSBBP_SloPrmsListReg_MC)this).new MS_MSBBL1260_Del01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Del01Bridge>(
					(MSBBP_SloPrmsListReg)this, new MS_MSBBL1260_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1260_Del01]の呼び出し */
	protected void callMS_MSBBL1260_Del01() {
		MCCaller caller = createMS_MSBBL1260_Del01();
		caller.exec();
	}
	/** [MS_MSBBL1260_Prnt01]のCallerの作成 */
	protected MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Prnt01Caller createMS_MSBBL1260_Prnt01() {
		MSBBP_SloPrmsListReg_MC.MS_MSBBL1260_Prnt01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Prnt01Bridge>
		caller = ((MSBBP_SloPrmsListReg_MC)this).new MS_MSBBL1260_Prnt01Caller<MSBBP_SloPrmsListReg, MS_MSBBL1260_Prnt01Bridge>(
					(MSBBP_SloPrmsListReg)this, new MS_MSBBL1260_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1260_Prnt01]の呼び出し */
	protected void callMS_MSBBL1260_Prnt01() {
		MCCaller caller = createMS_MSBBL1260_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1260.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1260.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1260.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1260.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1260.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1260.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1260.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1260.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBB.MSBBP1260.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1260.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1260.BulkSetR createBulkSetR() {
		return mcframe.clientMSBB.MSBBP1260.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP1260.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1260.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP1260.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP1260.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1260.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBB.MSBBP1260.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1260.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1260.BtnR createBtnR() {
		return mcframe.clientMSBB.MSBBP1260.BtnR.create();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(EdiPanel);
		ret.add(PrmsStsPanel);
		ret.add(PrmsPrntPanel);
		ret.add(Tab2Panel);
		ret.add(DlvCndPanel);
		ret.add(Tab3Panel);
		ret.add(CstCndPanel);
		ret.add(Tab4Panel);
		ret.add(ItmCndPanel);
		ret.add(CndPanel);
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
	public MSBBP_SloPrmsListReg_MC_A() {
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
	public MSBBP_SloPrmsListReg_MC_A(String name) {
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
		MSBBP_SloPrmsListReg_MC.jbCreateScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateTop((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateFold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateTab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateEdi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreatePrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreatePrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateTab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateDlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateTab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateCstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateTab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateCtrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateRPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateBulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateRslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateBtn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbCreateEastBtn((MSBBP_SloPrmsListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [PrmsSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrmsSts(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [PrmsPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrmsPrnt(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SloPrmsListReg p) {
		p.Cnd_dlv_inst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_inst_dt_p());
		p.Cnd_dlv_inst_dt_p_PPanel.setName("Cnd.dlv_inst_dt_p");
		p.Cnd_dlv_inst_dt_fr = p.Cnd_dlv_inst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_inst_dt_fr.addAliasName("Cnd.dlv_inst_dt_fr", p);
		p.Cnd_dlv_inst_hm_fr = p.Cnd_dlv_inst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_inst_hm_fr.addAliasName("Cnd.dlv_inst_hm_fr", p);
		p.Cnd_dlv_inst_dt_to = p.Cnd_dlv_inst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_inst_dt_to.addAliasName("Cnd.dlv_inst_dt_to", p);
		p.Cnd_dlv_inst_hm_to = p.Cnd_dlv_inst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_inst_hm_to.addAliasName("Cnd.dlv_inst_hm_to", p);
		p.Cnd_ship_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_rqst_dt_p());
		p.Cnd_ship_rqst_dt_p_PPanel.setName("Cnd.ship_rqst_dt_p");
		p.Cnd_ship_rqst_dt_fr = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_rqst_dt_fr.addAliasName("Cnd.ship_rqst_dt_fr", p);
		p.Cnd_ship_rqst_hm_fr = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_rqst_hm_fr.addAliasName("Cnd.ship_rqst_hm_fr", p);
		p.Cnd_ship_rqst_dt_to = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_rqst_dt_to.addAliasName("Cnd.ship_rqst_dt_to", p);
		p.Cnd_ship_rqst_hm_to = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_rqst_hm_to.addAliasName("Cnd.ship_rqst_hm_to", p);
		p.Cnd_pd_inst_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().pd_inst_dlv_dt_p());
		p.Cnd_pd_inst_dlv_dt_p_PPanel.setName("Cnd.pd_inst_dlv_dt_p");
		p.Cnd_pd_inst_dlv_dt_fr = p.Cnd_pd_inst_dlv_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_pd_inst_dlv_dt_fr.addAliasName("Cnd.pd_inst_dlv_dt_fr", p);
		p.Cnd_pd_inst_dlv_hm_fr = p.Cnd_pd_inst_dlv_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_pd_inst_dlv_hm_fr.addAliasName("Cnd.pd_inst_dlv_hm_fr", p);
		p.Cnd_pd_inst_dlv_dt_to = p.Cnd_pd_inst_dlv_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_pd_inst_dlv_dt_to.addAliasName("Cnd.pd_inst_dlv_dt_to", p);
		p.Cnd_pd_inst_dlv_hm_to = p.Cnd_pd_inst_dlv_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_pd_inst_dlv_hm_to.addAliasName("Cnd.pd_inst_dlv_hm_to", p);
		p.Cnd_ship_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_schd_dt_p());
		p.Cnd_ship_schd_dt_p_PPanel.setName("Cnd.ship_schd_dt_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
		p.Cnd_dlv_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_schd_dt_p());
		p.Cnd_dlv_schd_dt_p_PPanel.setName("Cnd.dlv_schd_dt_p");
		p.Cnd_dlv_schd_dt_fr = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_schd_dt_fr.addAliasName("Cnd.dlv_schd_dt_fr", p);
		p.Cnd_dlv_schd_hm_fr = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_schd_hm_fr.addAliasName("Cnd.dlv_schd_hm_fr", p);
		p.Cnd_dlv_schd_dt_to = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_schd_dt_to.addAliasName("Cnd.dlv_schd_dt_to", p);
		p.Cnd_dlv_schd_hm_to = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_schd_hm_to.addAliasName("Cnd.dlv_schd_hm_to", p);
		p.Cnd_prms_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().prms_dt_p());
		p.Cnd_prms_dt_p_PPanel.setName("Cnd.prms_dt_p");
		p.Cnd_prms_dt_fr = p.Cnd_prms_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_prms_dt_fr.addAliasName("Cnd.prms_dt_fr", p);
		p.Cnd_prms_hm_fr = p.Cnd_prms_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_prms_hm_fr.addAliasName("Cnd.prms_hm_fr", p);
		p.Cnd_prms_dt_to = p.Cnd_prms_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_prms_dt_to.addAliasName("Cnd.prms_dt_to", p);
		p.Cnd_prms_hm_to = p.Cnd_prms_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_prms_hm_to.addAliasName("Cnd.prms_hm_to", p);
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
		p.Cnd_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().dlv_grp_p());
		p.Cnd_dlv_grp_p_PPanel.setName("Cnd.dlv_grp_p");
		p.Cnd_dlv_grp_lab1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_dlv_grp_lab1.addAliasName("Cnd.dlv_grp_lab1", p);
		p.Cnd_dlv_grp_flg1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_dlv_grp_flg1.addAliasName("Cnd.dlv_grp_flg1", p);
		p.Cnd_dlv_grp_cd1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_dlv_grp_cd1.addAliasName("Cnd.dlv_grp_cd1", p);
		p.Cnd_dlv_grp_nm1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_dlv_grp_nm1.addAliasName("Cnd.dlv_grp_nm1", p);
		p.Cnd_dlv_grp_lab2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_dlv_grp_lab2.addAliasName("Cnd.dlv_grp_lab2", p);
		p.Cnd_dlv_grp_flg2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_dlv_grp_flg2.addAliasName("Cnd.dlv_grp_flg2", p);
		p.Cnd_dlv_grp_cd2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_dlv_grp_cd2.addAliasName("Cnd.dlv_grp_cd2", p);
		p.Cnd_dlv_grp_nm2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_dlv_grp_nm2.addAliasName("Cnd.dlv_grp_nm2", p);
		p.Cnd_dlv_grp_lab3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_dlv_grp_lab3.addAliasName("Cnd.dlv_grp_lab3", p);
		p.Cnd_dlv_grp_flg3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_dlv_grp_flg3.addAliasName("Cnd.dlv_grp_flg3", p);
		p.Cnd_dlv_grp_cd3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_dlv_grp_cd3.addAliasName("Cnd.dlv_grp_cd3", p);
		p.Cnd_dlv_grp_nm3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_dlv_grp_nm3.addAliasName("Cnd.dlv_grp_nm3", p);
		p.Cnd_dlv_grp_lab4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_dlv_grp_lab4.addAliasName("Cnd.dlv_grp_lab4", p);
		p.Cnd_dlv_grp_flg4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_dlv_grp_flg4.addAliasName("Cnd.dlv_grp_flg4", p);
		p.Cnd_dlv_grp_cd4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_dlv_grp_cd4.addAliasName("Cnd.dlv_grp_cd4", p);
		p.Cnd_dlv_grp_nm4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_dlv_grp_nm4.addAliasName("Cnd.dlv_grp_nm4", p);
		p.Cnd_dlv_grp_lab5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_dlv_grp_lab5.addAliasName("Cnd.dlv_grp_lab5", p);
		p.Cnd_dlv_grp_flg5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_dlv_grp_flg5.addAliasName("Cnd.dlv_grp_flg5", p);
		p.Cnd_dlv_grp_cd5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_dlv_grp_cd5.addAliasName("Cnd.dlv_grp_cd5", p);
		p.Cnd_dlv_grp_nm5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_dlv_grp_nm5.addAliasName("Cnd.dlv_grp_nm5", p);
		p.Cnd_dlv_grp_lab6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_dlv_grp_lab6.addAliasName("Cnd.dlv_grp_lab6", p);
		p.Cnd_dlv_grp_flg6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_dlv_grp_flg6.addAliasName("Cnd.dlv_grp_flg6", p);
		p.Cnd_dlv_grp_cd6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_dlv_grp_cd6.addAliasName("Cnd.dlv_grp_cd6", p);
		p.Cnd_dlv_grp_nm6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_dlv_grp_nm6.addAliasName("Cnd.dlv_grp_nm6", p);
		p.Cnd_dlv_grp_lab7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_dlv_grp_lab7.addAliasName("Cnd.dlv_grp_lab7", p);
		p.Cnd_dlv_grp_flg7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_dlv_grp_flg7.addAliasName("Cnd.dlv_grp_flg7", p);
		p.Cnd_dlv_grp_cd7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_dlv_grp_cd7.addAliasName("Cnd.dlv_grp_cd7", p);
		p.Cnd_dlv_grp_nm7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_dlv_grp_nm7.addAliasName("Cnd.dlv_grp_nm7", p);
		p.Cnd_dlv_grp_lab8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_dlv_grp_lab8.addAliasName("Cnd.dlv_grp_lab8", p);
		p.Cnd_dlv_grp_flg8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_dlv_grp_flg8.addAliasName("Cnd.dlv_grp_flg8", p);
		p.Cnd_dlv_grp_cd8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_dlv_grp_cd8.addAliasName("Cnd.dlv_grp_cd8", p);
		p.Cnd_dlv_grp_nm8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_dlv_grp_nm8.addAliasName("Cnd.dlv_grp_nm8", p);
		p.Cnd_dlv_grp_lab9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_dlv_grp_lab9.addAliasName("Cnd.dlv_grp_lab9", p);
		p.Cnd_dlv_grp_flg9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_dlv_grp_flg9.addAliasName("Cnd.dlv_grp_flg9", p);
		p.Cnd_dlv_grp_cd9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_dlv_grp_cd9.addAliasName("Cnd.dlv_grp_cd9", p);
		p.Cnd_dlv_grp_nm9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_dlv_grp_nm9.addAliasName("Cnd.dlv_grp_nm9", p);
		p.Cnd_dlv_grp_lab10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_dlv_grp_lab10.addAliasName("Cnd.dlv_grp_lab10", p);
		p.Cnd_dlv_grp_flg10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_dlv_grp_flg10.addAliasName("Cnd.dlv_grp_flg10", p);
		p.Cnd_dlv_grp_cd10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_dlv_grp_cd10.addAliasName("Cnd.dlv_grp_cd10", p);
		p.Cnd_dlv_grp_nm10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_dlv_grp_nm10.addAliasName("Cnd.dlv_grp_nm10", p);
		p.Cnd_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().cst_grp_p());
		p.Cnd_cst_grp_p_PPanel.setName("Cnd.cst_grp_p");
		p.Cnd_cst_grp_lab1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_cst_grp_lab1.addAliasName("Cnd.cst_grp_lab1", p);
		p.Cnd_cst_grp_flg1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_cst_grp_flg1.addAliasName("Cnd.cst_grp_flg1", p);
		p.Cnd_cst_grp_cd1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_cst_grp_cd1.addAliasName("Cnd.cst_grp_cd1", p);
		p.Cnd_cst_grp_nm1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_cst_grp_nm1.addAliasName("Cnd.cst_grp_nm1", p);
		p.Cnd_cst_grp_lab2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_cst_grp_lab2.addAliasName("Cnd.cst_grp_lab2", p);
		p.Cnd_cst_grp_flg2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_cst_grp_flg2.addAliasName("Cnd.cst_grp_flg2", p);
		p.Cnd_cst_grp_cd2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_cst_grp_cd2.addAliasName("Cnd.cst_grp_cd2", p);
		p.Cnd_cst_grp_nm2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_cst_grp_nm2.addAliasName("Cnd.cst_grp_nm2", p);
		p.Cnd_cst_grp_lab3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_cst_grp_lab3.addAliasName("Cnd.cst_grp_lab3", p);
		p.Cnd_cst_grp_flg3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_cst_grp_flg3.addAliasName("Cnd.cst_grp_flg3", p);
		p.Cnd_cst_grp_cd3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_cst_grp_cd3.addAliasName("Cnd.cst_grp_cd3", p);
		p.Cnd_cst_grp_nm3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_cst_grp_nm3.addAliasName("Cnd.cst_grp_nm3", p);
		p.Cnd_cst_grp_lab4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_cst_grp_lab4.addAliasName("Cnd.cst_grp_lab4", p);
		p.Cnd_cst_grp_flg4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_cst_grp_flg4.addAliasName("Cnd.cst_grp_flg4", p);
		p.Cnd_cst_grp_cd4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_cst_grp_cd4.addAliasName("Cnd.cst_grp_cd4", p);
		p.Cnd_cst_grp_nm4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_cst_grp_nm4.addAliasName("Cnd.cst_grp_nm4", p);
		p.Cnd_cst_grp_lab5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_cst_grp_lab5.addAliasName("Cnd.cst_grp_lab5", p);
		p.Cnd_cst_grp_flg5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_cst_grp_flg5.addAliasName("Cnd.cst_grp_flg5", p);
		p.Cnd_cst_grp_cd5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_cst_grp_cd5.addAliasName("Cnd.cst_grp_cd5", p);
		p.Cnd_cst_grp_nm5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_cst_grp_nm5.addAliasName("Cnd.cst_grp_nm5", p);
		p.Cnd_cst_grp_lab6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_cst_grp_lab6.addAliasName("Cnd.cst_grp_lab6", p);
		p.Cnd_cst_grp_flg6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_cst_grp_flg6.addAliasName("Cnd.cst_grp_flg6", p);
		p.Cnd_cst_grp_cd6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_cst_grp_cd6.addAliasName("Cnd.cst_grp_cd6", p);
		p.Cnd_cst_grp_nm6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_cst_grp_nm6.addAliasName("Cnd.cst_grp_nm6", p);
		p.Cnd_cst_grp_lab7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_cst_grp_lab7.addAliasName("Cnd.cst_grp_lab7", p);
		p.Cnd_cst_grp_flg7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_cst_grp_flg7.addAliasName("Cnd.cst_grp_flg7", p);
		p.Cnd_cst_grp_cd7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_cst_grp_cd7.addAliasName("Cnd.cst_grp_cd7", p);
		p.Cnd_cst_grp_nm7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_cst_grp_nm7.addAliasName("Cnd.cst_grp_nm7", p);
		p.Cnd_cst_grp_lab8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_cst_grp_lab8.addAliasName("Cnd.cst_grp_lab8", p);
		p.Cnd_cst_grp_flg8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_cst_grp_flg8.addAliasName("Cnd.cst_grp_flg8", p);
		p.Cnd_cst_grp_cd8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_cst_grp_cd8.addAliasName("Cnd.cst_grp_cd8", p);
		p.Cnd_cst_grp_nm8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_cst_grp_nm8.addAliasName("Cnd.cst_grp_nm8", p);
		p.Cnd_cst_grp_lab9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_cst_grp_lab9.addAliasName("Cnd.cst_grp_lab9", p);
		p.Cnd_cst_grp_flg9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_cst_grp_flg9.addAliasName("Cnd.cst_grp_flg9", p);
		p.Cnd_cst_grp_cd9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_cst_grp_cd9.addAliasName("Cnd.cst_grp_cd9", p);
		p.Cnd_cst_grp_nm9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_cst_grp_nm9.addAliasName("Cnd.cst_grp_nm9", p);
		p.Cnd_cst_grp_lab10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_cst_grp_lab10.addAliasName("Cnd.cst_grp_lab10", p);
		p.Cnd_cst_grp_flg10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_cst_grp_flg10.addAliasName("Cnd.cst_grp_flg10", p);
		p.Cnd_cst_grp_cd10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_cst_grp_cd10.addAliasName("Cnd.cst_grp_cd10", p);
		p.Cnd_cst_grp_nm10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_cst_grp_nm10.addAliasName("Cnd.cst_grp_nm10", p);
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_lab1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab1;
		p.Cnd_itm_grp_lab1.addAliasName("Cnd.itm_grp_lab1", p);
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_lab2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab2;
		p.Cnd_itm_grp_lab2.addAliasName("Cnd.itm_grp_lab2", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_lab3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab3;
		p.Cnd_itm_grp_lab3.addAliasName("Cnd.itm_grp_lab3", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_lab4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab4;
		p.Cnd_itm_grp_lab4.addAliasName("Cnd.itm_grp_lab4", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_lab5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab5;
		p.Cnd_itm_grp_lab5.addAliasName("Cnd.itm_grp_lab5", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_lab6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab6;
		p.Cnd_itm_grp_lab6.addAliasName("Cnd.itm_grp_lab6", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_lab7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab7;
		p.Cnd_itm_grp_lab7.addAliasName("Cnd.itm_grp_lab7", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_lab8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab8;
		p.Cnd_itm_grp_lab8.addAliasName("Cnd.itm_grp_lab8", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_lab9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab9;
		p.Cnd_itm_grp_lab9.addAliasName("Cnd.itm_grp_lab9", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_lab10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab10;
		p.Cnd_itm_grp_lab10.addAliasName("Cnd.itm_grp_lab10", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_SloPrmsListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBBP_SloPrmsListReg p) {
		p.BulkSet_prms_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().prms_dlv_dt_p());
		p.BulkSet_prms_dlv_dt_p_PPanel.setName("BulkSet.prms_dlv_dt_p");
		p.BulkSet_prms_dlv_dt = p.BulkSet_prms_dlv_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_prms_dlv_dt.addAliasName("BulkSet.prms_dlv_dt", p);
		p.BulkSet_prms_dlv_hm = p.BulkSet_prms_dlv_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_prms_dlv_hm.addAliasName("BulkSet.prms_dlv_hm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_SloPrmsListReg p) {
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_sls_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_sls_usr_cd.addAliasName("Rslt.sls_usr_cd", p);
		p.columnRslt_sls_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_sls_usr_nm.addAliasName("Rslt.sls_usr_nm", p);
		p.columnRslt_sls_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_sls_dpt_cd.addAliasName("Rslt.sls_dpt_cd", p);
		p.columnRslt_sls_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_sls_dpt_nm.addAliasName("Rslt.sls_dpt_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$itm_p);
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
		p.Rslt_slo_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$slo_trd_unit_qty_p);
		p.Rslt_slo_trd_unit_qty_p_PPanel.setName("Rslt.slo_trd_unit_qty_p");
		p.columnRslt_slo_trd_unit_qty = p.Rslt_slo_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_slo_trd_unit_qty.addAliasName("Rslt.slo_trd_unit_qty", p);
		p.Rslt_dlv_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$dlv_inst_qty_p);
		p.Rslt_dlv_inst_qty_p_PPanel.setName("Rslt.dlv_inst_qty_p");
		p.columnRslt_dlv_inst_qty = p.Rslt_dlv_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_dlv_inst_qty.addAliasName("Rslt.dlv_inst_qty", p);
		p.Rslt_dlv_inst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$dlv_inst_dt_p);
		p.Rslt_dlv_inst_dt_p_PPanel.setName("Rslt.dlv_inst_dt_p");
		p.columnRslt_dlv_inst_dt = p.Rslt_dlv_inst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_inst_dt.addAliasName("Rslt.dlv_inst_dt", p);
		p.columnRslt_dlv_inst_hm = p.Rslt_dlv_inst_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_inst_hm.addAliasName("Rslt.dlv_inst_hm", p);
		p.Rslt_ship_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$ship_rqst_dt_p);
		p.Rslt_ship_rqst_dt_p_PPanel.setName("Rslt.ship_rqst_dt_p");
		p.columnRslt_ship_rqst_dt = p.Rslt_ship_rqst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_rqst_dt.addAliasName("Rslt.ship_rqst_dt", p);
		p.columnRslt_ship_rqst_hm = p.Rslt_ship_rqst_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_rqst_hm.addAliasName("Rslt.ship_rqst_hm", p);
		p.Rslt_pd_inst_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$pd_inst_dlv_dt_p);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.setName("Rslt.pd_inst_dlv_dt_p");
		p.columnRslt_pd_inst_dlv_dt = p.Rslt_pd_inst_dlv_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_pd_inst_dlv_dt.addAliasName("Rslt.pd_inst_dlv_dt", p);
		p.columnRslt_pd_inst_dlv_hm = p.Rslt_pd_inst_dlv_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_pd_inst_dlv_hm.addAliasName("Rslt.pd_inst_dlv_hm", p);
		p.Rslt_ship_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$ship_schd_dt_p);
		p.Rslt_ship_schd_dt_p_PPanel.setName("Rslt.ship_schd_dt_p");
		p.columnRslt_ship_schd_dt = p.Rslt_ship_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_schd_dt.addAliasName("Rslt.ship_schd_dt", p);
		p.columnRslt_ship_schd_hm = p.Rslt_ship_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_schd_hm.addAliasName("Rslt.ship_schd_hm", p);
		p.Rslt_dlv_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$dlv_schd_dt_p);
		p.Rslt_dlv_schd_dt_p_PPanel.setName("Rslt.dlv_schd_dt_p");
		p.columnRslt_dlv_schd_dt = p.Rslt_dlv_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_schd_dt.addAliasName("Rslt.dlv_schd_dt", p);
		p.columnRslt_dlv_schd_hm = p.Rslt_dlv_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_schd_hm.addAliasName("Rslt.dlv_schd_hm", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_trd_unit_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$trd_unit_prms_qty_p);
		p.Rslt_trd_unit_prms_qty_p_PPanel.setName("Rslt.trd_unit_prms_qty_p");
		p.columnRslt_trd_unit_prms_qty = p.Rslt_trd_unit_prms_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_prms_qty.addAliasName("Rslt.trd_unit_prms_qty", p);
		p.Rslt_prms_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$prms_dlv_dt_p);
		p.Rslt_prms_dlv_dt_p_PPanel.setName("Rslt.prms_dlv_dt_p");
		p.columnRslt_prms_dlv_dt = p.Rslt_prms_dlv_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_prms_dlv_dt.addAliasName("Rslt.prms_dlv_dt", p);
		p.columnRslt_prms_dlv_hm = p.Rslt_prms_dlv_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_prms_dlv_hm.addAliasName("Rslt.prms_dlv_hm", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$dlv_grp_p);
		p.Rslt_dlv_grp_p_PPanel.setName("Rslt.dlv_grp_p");
		p.columnRslt_dlv_grp_cd1 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_dlv_grp_cd1.addAliasName("Rslt.dlv_grp_cd1", p);
		p.columnRslt_dlv_grp_nm1 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_dlv_grp_nm1.addAliasName("Rslt.dlv_grp_nm1", p);
		p.columnRslt_dlv_grp_cd2 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_dlv_grp_cd2.addAliasName("Rslt.dlv_grp_cd2", p);
		p.columnRslt_dlv_grp_nm2 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_dlv_grp_nm2.addAliasName("Rslt.dlv_grp_nm2", p);
		p.columnRslt_dlv_grp_cd3 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_dlv_grp_cd3.addAliasName("Rslt.dlv_grp_cd3", p);
		p.columnRslt_dlv_grp_nm3 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_dlv_grp_nm3.addAliasName("Rslt.dlv_grp_nm3", p);
		p.columnRslt_dlv_grp_cd4 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_dlv_grp_cd4.addAliasName("Rslt.dlv_grp_cd4", p);
		p.columnRslt_dlv_grp_nm4 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_dlv_grp_nm4.addAliasName("Rslt.dlv_grp_nm4", p);
		p.columnRslt_dlv_grp_cd5 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_dlv_grp_cd5.addAliasName("Rslt.dlv_grp_cd5", p);
		p.columnRslt_dlv_grp_nm5 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_dlv_grp_nm5.addAliasName("Rslt.dlv_grp_nm5", p);
		p.columnRslt_dlv_grp_cd6 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_dlv_grp_cd6.addAliasName("Rslt.dlv_grp_cd6", p);
		p.columnRslt_dlv_grp_nm6 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_dlv_grp_nm6.addAliasName("Rslt.dlv_grp_nm6", p);
		p.columnRslt_dlv_grp_cd7 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_dlv_grp_cd7.addAliasName("Rslt.dlv_grp_cd7", p);
		p.columnRslt_dlv_grp_nm7 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_dlv_grp_nm7.addAliasName("Rslt.dlv_grp_nm7", p);
		p.columnRslt_dlv_grp_cd8 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_dlv_grp_cd8.addAliasName("Rslt.dlv_grp_cd8", p);
		p.columnRslt_dlv_grp_nm8 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_dlv_grp_nm8.addAliasName("Rslt.dlv_grp_nm8", p);
		p.columnRslt_dlv_grp_cd9 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_dlv_grp_cd9.addAliasName("Rslt.dlv_grp_cd9", p);
		p.columnRslt_dlv_grp_nm9 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_dlv_grp_nm9.addAliasName("Rslt.dlv_grp_nm9", p);
		p.columnRslt_dlv_grp_cd10 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_dlv_grp_cd10.addAliasName("Rslt.dlv_grp_cd10", p);
		p.columnRslt_dlv_grp_nm10 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_dlv_grp_nm10.addAliasName("Rslt.dlv_grp_nm10", p);
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$cst_grp_p);
		p.Rslt_cst_grp_p_PPanel.setName("Rslt.cst_grp_p");
		p.columnRslt_cst_grp_cd1 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_cst_grp_cd1.addAliasName("Rslt.cst_grp_cd1", p);
		p.columnRslt_cst_grp_nm1 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_cst_grp_nm1.addAliasName("Rslt.cst_grp_nm1", p);
		p.columnRslt_cst_grp_cd2 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_cst_grp_cd2.addAliasName("Rslt.cst_grp_cd2", p);
		p.columnRslt_cst_grp_nm2 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_cst_grp_nm2.addAliasName("Rslt.cst_grp_nm2", p);
		p.columnRslt_cst_grp_cd3 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_cst_grp_cd3.addAliasName("Rslt.cst_grp_cd3", p);
		p.columnRslt_cst_grp_nm3 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_cst_grp_nm3.addAliasName("Rslt.cst_grp_nm3", p);
		p.columnRslt_cst_grp_cd4 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_cst_grp_cd4.addAliasName("Rslt.cst_grp_cd4", p);
		p.columnRslt_cst_grp_nm4 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_cst_grp_nm4.addAliasName("Rslt.cst_grp_nm4", p);
		p.columnRslt_cst_grp_cd5 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_cst_grp_cd5.addAliasName("Rslt.cst_grp_cd5", p);
		p.columnRslt_cst_grp_nm5 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_cst_grp_nm5.addAliasName("Rslt.cst_grp_nm5", p);
		p.columnRslt_cst_grp_cd6 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_cst_grp_cd6.addAliasName("Rslt.cst_grp_cd6", p);
		p.columnRslt_cst_grp_nm6 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_cst_grp_nm6.addAliasName("Rslt.cst_grp_nm6", p);
		p.columnRslt_cst_grp_cd7 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_cst_grp_cd7.addAliasName("Rslt.cst_grp_cd7", p);
		p.columnRslt_cst_grp_nm7 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_cst_grp_nm7.addAliasName("Rslt.cst_grp_nm7", p);
		p.columnRslt_cst_grp_cd8 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_cst_grp_cd8.addAliasName("Rslt.cst_grp_cd8", p);
		p.columnRslt_cst_grp_nm8 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_cst_grp_nm8.addAliasName("Rslt.cst_grp_nm8", p);
		p.columnRslt_cst_grp_cd9 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_cst_grp_cd9.addAliasName("Rslt.cst_grp_cd9", p);
		p.columnRslt_cst_grp_nm9 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_cst_grp_nm9.addAliasName("Rslt.cst_grp_nm9", p);
		p.columnRslt_cst_grp_cd10 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_cst_grp_cd10.addAliasName("Rslt.cst_grp_cd10", p);
		p.columnRslt_cst_grp_nm10 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_cst_grp_nm10.addAliasName("Rslt.cst_grp_nm10", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$itm_grp_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP1260.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.columnRslt_rtn_sts_typ_nm = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ_nm;
		p.columnRslt_rtn_sts_typ_nm.addAliasName("Rslt.rtn_sts_typ_nm", p);
		p.columnRslt_msg_id = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_msg_id;
		p.columnRslt_msg_id.addAliasName("Rslt.msg_id", p);
		p.columnRslt_msg = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_msg;
		p.columnRslt_msg.addAliasName("Rslt.msg", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_SloPrmsListReg p) {
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
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
	}
	
	
	/** [Cnd_cst_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_itm_cd_p = null;

	/**
	 * [Cnd_cst_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_itm_cd_ListPutter() {
		if (Cnd_cst_itm_cd_p == null) {
			Cnd_cst_itm_cd_p = createCnd_cst_itm_cd_ListPutter(Cnd_cst_itm_cd, "cst_itm_cd", "cst_itm_nm");

		}
		return Cnd_cst_itm_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_slo_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_slo_trd_unit_cd_p = null;

	/**
	 * [Rslt_slo_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_slo_trd_unit_cd_ListPutter() {
		if (Rslt_slo_trd_unit_cd_p == null) {
			Rslt_slo_trd_unit_cd_p = createRslt_slo_trd_unit_cd_ListPutter(columnRslt_slo_trd_unit_cd, "slo_trd_unit_cd", "slo_trd_unit_nm");

		}
		return Rslt_slo_trd_unit_cd_p;
	}
	
	
	/** [Rslt_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_unit_cd_p = null;

	/**
	 * [Rslt_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_unit_cd_ListPutter() {
		if (Rslt_trd_unit_cd_p == null) {
			Rslt_trd_unit_cd_p = createRslt_trd_unit_cd_ListPutter(columnRslt_trd_unit_cd, "trd_unit_cd", "trd_unit_nm");

		}
		return Rslt_trd_unit_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SloPrmsListReg create(){
		MSBBP_SloPrmsListReg p = new MSBBP_SloPrmsListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SloPrmsListReg create(String name){
		MSBBP_SloPrmsListReg p = new MSBBP_SloPrmsListReg(name);
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
		MSBBP_SloPrmsListReg_MC.jbfInitScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitTop((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitFold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitTab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitEdi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitPrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitPrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitTab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitDlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitTab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitCstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitTab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitCtrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitRPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitBulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitRslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitBtn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbfInitEastBtn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitTop((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitFold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitTab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitEdi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitPrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitPrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitTab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitDlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitTab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitCstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitTab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitCtrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitRPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitBulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitRslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitBtn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.jbInitEastBtn((MSBBP_SloPrmsListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_SloPrmsListReg p) {
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
	protected static void jbfInitTab1(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrmsSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrmsSts(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.PrmsStsPanel = p.beansFactory.createPanel("PrmsSts");
		p.PrmsStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrmsPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrmsPrnt(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.PrmsPrntPanel = p.beansFactory.createPanel("PrmsPrnt");
		p.PrmsPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_edi_flg = p.beansFactory.createCheckBox("Cnd.edi_flg");
		p.Cnd_not_edi_flg = p.beansFactory.createCheckBox("Cnd.not_edi_flg");
		p.Cnd_not_prms_flg = p.beansFactory.createCheckBox("Cnd.not_prms_flg");
		p.Cnd_prms_flg = p.beansFactory.createCheckBox("Cnd.prms_flg");
		p.Cnd_prms_not_prnted = p.beansFactory.createCheckBox("Cnd.prms_not_prnted");
		p.Cnd_prms_prnted = p.beansFactory.createCheckBox("Cnd.prms_prnted");
		p.Cnd_slo_dt_fr_Label = p.beansFactory.createLabel("Cnd.slo_dt_fr_Label");
		p.Cnd_slo_dt_fr = p.beansFactory.createDateField("Cnd.slo_dt_fr");
		p.Cnd_slo_dt_fr.setLabel(p.Cnd_slo_dt_fr_Label);
		p.Cnd_slo_dt_to_Label = p.beansFactory.createLabel("Cnd.slo_dt_to_Label");
		p.Cnd_slo_dt_to = p.beansFactory.createDateField("Cnd.slo_dt_to");
		p.Cnd_slo_dt_to.setLabel(p.Cnd_slo_dt_to_Label);
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
		p.Cnd_cst_dlv_inst_no_Label = p.beansFactory.createLabel("Cnd.cst_dlv_inst_no_Label");
		p.Cnd_cst_dlv_inst_no = p.beansFactory.createTextField("Cnd.cst_dlv_inst_no");
		p.Cnd_cst_dlv_inst_no.setLabel(p.Cnd_cst_dlv_inst_no_Label);
		p.Cnd_cst_dlv_inst_d_no_Label = p.beansFactory.createLabel("Cnd.cst_dlv_inst_d_no_Label");
		p.Cnd_cst_dlv_inst_d_no = p.beansFactory.createTextField("Cnd.cst_dlv_inst_d_no");
		p.Cnd_cst_dlv_inst_d_no.setLabel(p.Cnd_cst_dlv_inst_d_no_Label);
		p.Cnd_ship_schd_no_Label = p.beansFactory.createLabel("Cnd.ship_schd_no_Label");
		p.Cnd_ship_schd_no = p.beansFactory.createTextField("Cnd.ship_schd_no");
		p.Cnd_ship_schd_no.setLabel(p.Cnd_ship_schd_no_Label);
		p.Cnd_slo_prms_h_no_Label = p.beansFactory.createLabel("Cnd.slo_prms_h_no_Label");
		p.Cnd_slo_prms_h_no = p.beansFactory.createTextField("Cnd.slo_prms_h_no");
		p.Cnd_slo_prms_h_no.setLabel(p.Cnd_slo_prms_h_no_Label);
		p.Cnd_slo_prms_no_Label = p.beansFactory.createLabel("Cnd.slo_prms_no_Label");
		p.Cnd_slo_prms_no = p.beansFactory.createTextField("Cnd.slo_prms_no");
		p.Cnd_slo_prms_no.setLabel(p.Cnd_slo_prms_no_Label);
		p.Cnd_prms_rmrks_Label = p.beansFactory.createLabel("Cnd.prms_rmrks_Label");
		p.Cnd_prms_rmrks = p.beansFactory.createTextField("Cnd.prms_rmrks");
		p.Cnd_prms_rmrks.setLabel(p.Cnd_prms_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_incl_can_flg = p.beansFactory.createCheckBox("Cnd.incl_can_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		p.BulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_slo_dt = p.beansFactory.createTableColumn("Rslt.slo_dt", MCColumnType.DATE);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_rev = p.beansFactory.createTableColumn("Rslt.cst_po_rev", MCColumnType.NUMBER);
		p.columnRslt_cst_po_d_no = p.beansFactory.createTableColumn("Rslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_slo_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.slo_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_slo_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.slo_trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_slo_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.slo_trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_inst_rcpt_no = p.beansFactory.createTableColumn("Rslt.dlv_inst_rcpt_no", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cst_dlv_inst_no = p.beansFactory.createTableColumn("Rslt.cst_dlv_inst_no", MCColumnType.TEXT);
		p.columnRslt_cst_dlv_inst_rev = p.beansFactory.createTableColumn("Rslt.cst_dlv_inst_rev", MCColumnType.NUMBER);
		p.columnRslt_cst_dlv_inst_d_no = p.beansFactory.createTableColumn("Rslt.cst_dlv_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_schd_no = p.beansFactory.createTableColumn("Rslt.ship_schd_no", MCColumnType.TEXT);
		p.columnRslt_ship_pr_no = p.beansFactory.createTableColumn("Rslt.ship_pr_no", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_wg_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_wg_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_nm = p.beansFactory.createTableColumn("Rslt.dlv_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_slo_prms_h_no = p.beansFactory.createTableColumn("Rslt.slo_prms_h_no", MCColumnType.TEXT);
		p.columnRslt_org_slo_prms_h_no = p.beansFactory.createTableColumn("Rslt.org_slo_prms_h_no", MCColumnType.TEXT);
		p.columnRslt_slo_prms_no = p.beansFactory.createTableColumn("Rslt.slo_prms_no", MCColumnType.TEXT);
		p.columnRslt_slo_prms_rev = p.beansFactory.createTableColumn("Rslt.slo_prms_rev", MCColumnType.NUMBER);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_prms_prnt_tm = p.beansFactory.createTableColumn("Rslt.prms_prnt_tm", MCColumnType.DATE);
		p.columnRslt_last_prms_rev = p.beansFactory.createTableColumn("Rslt.last_prms_rev", MCColumnType.NUMBER);
		p.columnRslt_slo_prms_prnt_flg = p.beansFactory.createTableColumn("Rslt.slo_prms_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_prms_rmrks = p.beansFactory.createTableColumn("Rslt.prms_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_edi_prms_flg = p.beansFactory.createTableColumn("Rslt.edi_prms_flg", MCColumnType.CHECK);
		p.columnRslt_last_edi_prms_flg = p.beansFactory.createTableColumn("Rslt.last_edi_prms_flg", MCColumnType.CHECK);
		p.columnRslt_edi_send_flg = p.beansFactory.createTableColumn("Rslt.edi_send_flg", MCColumnType.CHECK);
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
		p.columnRslt_ship_pr_upd_cntr = p.beansFactory.createTableColumn("Rslt.ship_pr_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1230 = p.beansFactory.createButton("Btn.open_MSBBP1230", "open");
		p.Btn_prnt_prms = p.beansFactory.createButton("Btn.prnt_prms", "prnt");
		p.Btn_label_check = p.beansFactory.createLabel("Btn.label_check");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_label_edi_prms = p.beansFactory.createLabel("Btn.label_edi_prms");
		p.Btn_edi_prms_select_all = p.beansFactory.createButton("Btn.edi_prms_select_all", "no_border");
		p.Btn_edi_prms_deselect_all = p.beansFactory.createButton("Btn.edi_prms_deselect_all", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_prnt_out_flg = p.beansFactory.createCheckBox("Btn.prnt_out_flg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_SloPrmsListReg p) {
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBBP_SloPrmsListReg p) {
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
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.FoldTab.add(p.Tab4Panel, "Fold.tab6");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.EdiPanel, null);
		p.Tab1Panel.setLastBeans(p.EdiPanel);
		p.EdiPanel.setNextBeans(p.PrmsStsPanel);
		p.Tab1Panel.add(p.PrmsStsPanel, null);
		p.PrmsStsPanel.setNextBeans(p.PrmsPrntPanel);
		p.Tab1Panel.add(p.PrmsPrntPanel, null);
		p.PrmsPrntPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PrmsSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrmsSts(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.PrmsStsPanel.setBorder(p.PrmsStsTitledBorder);
		p.PrmsStsPanel.setValueCheck(false);
		p.PrmsStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrmsStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PrmsPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrmsPrnt(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.PrmsPrntPanel.setBorder(p.PrmsPrntTitledBorder);
		p.PrmsPrntPanel.setValueCheck(false);
		p.PrmsPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrmsPrntPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.DlvCndPanel, null);
		p.Tab2Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.CstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.CstCndPanel);
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.ope_META);
		p.EdiPanel.add(p.Cnd_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_edi_flg);
		p.Cnd_edi_flg.setNextBeans(p.Cnd_not_edi_flg);
		p.Cnd_edi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.edi_flg_META);
		p.EdiPanel.add(p.Cnd_not_edi_flg);
		p.Cnd_not_edi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.not_edi_flg_META);
		p.PrmsStsPanel.add(p.Cnd_not_prms_flg);
		p.PrmsStsPanel.setLastBeans(p.Cnd_not_prms_flg);
		p.Cnd_not_prms_flg.setNextBeans(p.Cnd_prms_flg);
		p.Cnd_not_prms_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.not_prms_flg_META);
		p.PrmsStsPanel.add(p.Cnd_prms_flg);
		p.Cnd_prms_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.prms_flg_META);
		p.PrmsPrntPanel.add(p.Cnd_prms_not_prnted);
		p.PrmsPrntPanel.setLastBeans(p.Cnd_prms_not_prnted);
		p.Cnd_prms_not_prnted.setNextBeans(p.Cnd_prms_prnted);
		p.Cnd_prms_not_prnted.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.prms_not_prnted_META);
		p.PrmsPrntPanel.add(p.Cnd_prms_prnted);
		p.Cnd_prms_prnted.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.prms_prnted_META);
		p.CndPanel.add(p.Cnd_slo_dt_fr_Label);
		p.CndPanel.add(p.Cnd_slo_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_slo_dt_fr);
		p.Cnd_slo_dt_fr.setNextBeans(p.Cnd_slo_dt_to);
		p.Cnd_slo_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.slo_dt_fr_META);
		p.Cnd_slo_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_slo_dt_to_Label);
		p.CndPanel.add(p.Cnd_slo_dt_to);
		p.Cnd_slo_dt_to.setNextBeans(p.Cnd_dlv_inst_dt_p_PPanel);
		p.Cnd_slo_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.slo_dt_to_META);
		p.Cnd_slo_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_inst_dt_p_PPanel);
		p.Cnd_dlv_inst_dt_p_PPanel.setNextBeans(p.Cnd_ship_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_rqst_dt_p_PPanel);
		p.Cnd_ship_rqst_dt_p_PPanel.setNextBeans(p.Cnd_pd_inst_dlv_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_pd_inst_dlv_dt_p_PPanel);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.setNextBeans(p.Cnd_ship_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_schd_dt_p_PPanel);
		p.Cnd_ship_schd_dt_p_PPanel.setNextBeans(p.Cnd_dlv_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_schd_dt_p_PPanel);
		p.Cnd_dlv_schd_dt_p_PPanel.setNextBeans(p.Cnd_prms_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_prms_dt_p_PPanel);
		p.Cnd_prms_dt_p_PPanel.setNextBeans(p.Cnd_cst_cd);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_slo_no);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_cst_dlv_inst_no);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_cst_dlv_inst_no_Label);
		p.CndPanel.add(p.Cnd_cst_dlv_inst_no);
		p.Cnd_cst_dlv_inst_no.setNextBeans(p.Cnd_cst_dlv_inst_d_no);
		p.Cnd_cst_dlv_inst_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_dlv_inst_no_META);
		p.setPluralValueEnable(p.Cnd_cst_dlv_inst_no, true);
		p.CndPanel.add(p.Cnd_cst_dlv_inst_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_dlv_inst_d_no);
		p.Cnd_cst_dlv_inst_d_no.setNextBeans(p.Cnd_ship_schd_no);
		p.Cnd_cst_dlv_inst_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.cst_dlv_inst_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_dlv_inst_d_no, true);
		p.CndPanel.add(p.Cnd_ship_schd_no_Label);
		p.CndPanel.add(p.Cnd_ship_schd_no);
		p.Cnd_ship_schd_no.setNextBeans(p.Cnd_slo_prms_h_no);
		p.Cnd_ship_schd_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.ship_schd_no_META);
		p.setPluralValueEnable(p.Cnd_ship_schd_no, true);
		p.CndPanel.add(p.Cnd_slo_prms_h_no_Label);
		p.CndPanel.add(p.Cnd_slo_prms_h_no);
		p.Cnd_slo_prms_h_no.setNextBeans(p.Cnd_slo_prms_no);
		p.Cnd_slo_prms_h_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.slo_prms_h_no_META);
		p.setPluralValueEnable(p.Cnd_slo_prms_h_no, true);
		p.CndPanel.add(p.Cnd_slo_prms_no_Label);
		p.CndPanel.add(p.Cnd_slo_prms_no);
		p.Cnd_slo_prms_no.setNextBeans(p.Cnd_prms_rmrks);
		p.Cnd_slo_prms_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.slo_prms_no_META);
		p.setPluralValueEnable(p.Cnd_slo_prms_no, true);
		p.CndPanel.add(p.Cnd_prms_rmrks_Label);
		p.CndPanel.add(p.Cnd_prms_rmrks);
		p.Cnd_prms_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_prms_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.prms_rmrks_META);
		p.setPluralValueEnable(p.Cnd_prms_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_incl_can_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_incl_can_flg);
		p.Cnd_incl_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1260.CndR.incl_can_flg_META);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.CstCndPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstCndPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_SloPrmsListReg p) {
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
	protected static void jbInitRPnl(MSBBP_SloPrmsListReg p) {
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
	protected static void jbInitBulkSet(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setBorder(p.BulkSetTitledBorder);
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_prms_dlv_dt_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_prms_dlv_dt_p_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(true);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_SloPrmsListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1230.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1230);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1230);
		p.Btn_open_MSBBP1230.setNextBeans(p.Btn_prnt_prms);
		p.Btn_prnt_prms.setIcon("PRINT");
		p.Btn_prnt_prms.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_prnt_prms);
		p.Btn_prnt_prms.setNextBeans(p.Btn_select_all);
		p.BtnPanel.add(p.Btn_label_check);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_edi_prms_select_all);
		p.BtnPanel.add(p.Btn_label_edi_prms);
		p.Btn_edi_prms_select_all.setIcon("SELECT_ALL");
		p.Btn_edi_prms_select_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_edi_prms_select_all);
		p.Btn_edi_prms_select_all.setNextBeans(p.Btn_edi_prms_deselect_all);
		p.Btn_edi_prms_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_edi_prms_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_edi_prms_deselect_all);
		p.Btn_edi_prms_deselect_all.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_prnt_out_flg);
		p.BtnPanel.add(p.Btn_prnt_out_flg);
		p.Btn_prnt_out_flg.setNextBeans(p.Btn_indiv_prnt_flg);
		p.Btn_prnt_out_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1260.BtnR.prnt_out_flg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1260.BtnR.indiv_prnt_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_SloPrmsListReg p) {
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
		MSBBP_SloPrmsListReg_MC.mcInitScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitTop((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitFold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitTab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitEdi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitPrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitPrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitTab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitDlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitTab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitCstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitTab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitCtrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitRPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitBulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitRslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitBtn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.mcInitEastBtn((MSBBP_SloPrmsListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__UPD_EastBtn((MSBBP_SloPrmsListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__DEL_EastBtn((MSBBP_SloPrmsListReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitSRCH__REF_EastBtn((MSBBP_SloPrmsListReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitUPD_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitUPD_EastBtn((MSBBP_SloPrmsListReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitDEL_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitDEL_EastBtn((MSBBP_SloPrmsListReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitREF_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitREF_EastBtn((MSBBP_SloPrmsListReg)this);

		// [PRNT]ステータスのモードの設定
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_ScreenOpe((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Top((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Fold((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Tab1((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Edi((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_PrmsSts((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_PrmsPrnt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Tab2((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_DlvCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Tab3((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_CstCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Tab4((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_ItmCnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Cnd((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Ctrl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_RPnl((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_BulkSet((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Rslt((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_Btn((MSBBP_SloPrmsListReg)this);
		MSBBP_SloPrmsListReg_MC.statusInitPRNT_EastBtn((MSBBP_SloPrmsListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_SloPrmsListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [PrmsSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrmsSts(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [PrmsPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrmsPrnt(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SloPrmsListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_edi_flg.addAllListener(p);
		p.Cnd_not_edi_flg.addAllListener(p);
		p.Cnd_not_prms_flg.addAllListener(p);
		p.Cnd_prms_flg.addAllListener(p);
		p.Cnd_prms_not_prnted.addAllListener(p);
		p.Cnd_prms_prnted.addAllListener(p);
		p.Cnd_slo_dt_fr.setListListener(p);
		p.Cnd_slo_dt_fr.addAllListener(p);
		p.Cnd_slo_dt_to.setListListener(p);
		p.Cnd_slo_dt_to.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_cst_dlv_inst_no.setListListener(p);
		p.Cnd_cst_dlv_inst_no.addAllListener(p);
		p.Cnd_cst_dlv_inst_d_no.setListListener(p);
		p.Cnd_cst_dlv_inst_d_no.addAllListener(p);
		p.Cnd_ship_schd_no.setListListener(p);
		p.Cnd_ship_schd_no.addAllListener(p);
		p.Cnd_slo_prms_h_no.setListListener(p);
		p.Cnd_slo_prms_h_no.addAllListener(p);
		p.Cnd_slo_prms_no.setListListener(p);
		p.Cnd_slo_prms_no.addAllListener(p);
		p.Cnd_prms_rmrks.setListListener(p);
		p.Cnd_prms_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_incl_can_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_SloPrmsListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_SloPrmsListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBBP_SloPrmsListReg p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_SloPrmsListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_slo_dt.addAllListener(p);
		p.columnRslt_slo_dt.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_cst_po_rev.addAllListener(p);
		p.columnRslt_cst_po_rev.setListListener(p);
		p.columnRslt_cst_po_d_no.addAllListener(p);
		p.columnRslt_cst_po_d_no.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_slo_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_slo_trd_unit_dec_place.setListListener(p);
		p.columnRslt_slo_trd_unit_cd.addAllListener(p);
		p.columnRslt_slo_trd_unit_cd.setListListener(p);
		p.columnRslt_slo_trd_unit_nm.addAllListener(p);
		p.columnRslt_slo_trd_unit_nm.setListListener(p);
		p.columnRslt_dlv_inst_rcpt_no.addAllListener(p);
		p.columnRslt_dlv_inst_rcpt_no.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_cst_dlv_inst_no.addAllListener(p);
		p.columnRslt_cst_dlv_inst_no.setListListener(p);
		p.columnRslt_cst_dlv_inst_rev.addAllListener(p);
		p.columnRslt_cst_dlv_inst_rev.setListListener(p);
		p.columnRslt_cst_dlv_inst_d_no.addAllListener(p);
		p.columnRslt_cst_dlv_inst_d_no.setListListener(p);
		p.columnRslt_ship_schd_no.addAllListener(p);
		p.columnRslt_ship_schd_no.setListListener(p);
		p.columnRslt_ship_pr_no.addAllListener(p);
		p.columnRslt_ship_pr_no.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_wg_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_wg_cd.setListListener(p);
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dlv_nm.addAllListener(p);
		p.columnRslt_dlv_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_slo_prms_h_no.addAllListener(p);
		p.columnRslt_slo_prms_h_no.setListListener(p);
		p.columnRslt_org_slo_prms_h_no.addAllListener(p);
		p.columnRslt_org_slo_prms_h_no.setListListener(p);
		p.columnRslt_slo_prms_no.addAllListener(p);
		p.columnRslt_slo_prms_no.setListListener(p);
		p.columnRslt_slo_prms_rev.addAllListener(p);
		p.columnRslt_slo_prms_rev.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_prms_prnt_tm.addAllListener(p);
		p.columnRslt_prms_prnt_tm.setListListener(p);
		p.columnRslt_last_prms_rev.addAllListener(p);
		p.columnRslt_last_prms_rev.setListListener(p);
		p.columnRslt_slo_prms_prnt_flg.addAllListener(p);
		p.columnRslt_prms_rmrks.addAllListener(p);
		p.columnRslt_prms_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_edi_prms_flg.addAllListener(p);
		p.columnRslt_last_edi_prms_flg.addAllListener(p);
		p.columnRslt_edi_send_flg.addAllListener(p);
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
		p.columnRslt_ship_pr_upd_cntr.addAllListener(p);
		p.columnRslt_ship_pr_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_SloPrmsListReg p) {
		p.Btn_open_MSBBP1230.addAllListener(p);
		p.Btn_open_MSBBP1230.setAPMethodName("doBtn_open_MSBBP1230");
		p.Btn_prnt_prms.addAllListener(p);
		p.Btn_prnt_prms.setAPMethodName("doBtn_prnt_prms");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_edi_prms_select_all.addAllListener(p);
		p.Btn_edi_prms_select_all.setAPMethodName("doBtn_edi_prms_select_all");
		p.Btn_edi_prms_deselect_all.addAllListener(p);
		p.Btn_edi_prms_deselect_all.setAPMethodName("doBtn_edi_prms_deselect_all");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_prnt_out_flg.addAllListener(p);
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_SloPrmsListReg p) {
	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_prms_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_prms_not_prnted.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_prms_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_prms_h_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_edi_prms_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_last_edi_prms_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_edi_prms_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_prms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_prms_not_prnted.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_prms_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_slo_prms_h_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_edi_prms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_last_edi_prms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_edi_prms_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_prms_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_prms_not_prnted.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_prms_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_slo_prms_h_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_edi_prms_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_last_edi_prms_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_edi_prms_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_not_prnted.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_prms_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_prms_h_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_edi_prms_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_last_edi_prms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_edi_prms_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_prms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_prms_not_prnted.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_prms_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_slo_prms_h_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_edi_prms_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_last_edi_prms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_edi_prms_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitREF_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_prms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_prms_not_prnted.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_prms_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_slo_prms_h_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_prms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_last_edi_prms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_ship_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_edi_prms_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Edi(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[PrmsSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrmsSts(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[PrmsPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrmsPrnt(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CstCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmCnd(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBBP_SloPrmsListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_prms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prms_not_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prms_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_slo_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_pd_inst_dlv_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_prms_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_slo_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_dlv_inst_d_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_slo_prms_h_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_slo_prms_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prms_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBBP_SloPrmsListReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBBP_SloPrmsListReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBBP_SloPrmsListReg p){
		p.BulkSet_prms_dlv_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBBP_SloPrmsListReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_slo_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_trd_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_slo_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_inst_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dlv_inst_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_dlv_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_dlv_inst_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_wg_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_prms_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_slo_prms_h_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_org_slo_prms_h_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_prms_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_prms_prnt_tm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_last_prms_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slo_prms_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_prms_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_edi_prms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_last_edi_prms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_edi_send_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBBP_SloPrmsListReg p){
		p.Btn_open_MSBBP1230.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_prms.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_edi_prms_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_edi_prms_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Btn_del.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBBP_SloPrmsListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_SloPrmsListReg_MC.setTableConfigRslt((MSBBP_SloPrmsListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_SloPrmsListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_slo_dt.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_dt_META);
		p.columnRslt_slo_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_dt);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_sls_dpt_nm);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_cst_po_rev.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_po_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_rev);
		p.columnRslt_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_d_no);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_slo_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_trd_unit_dec_place);
		p.columnRslt_slo_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_trd_unit_cd_META);
		p.columnRslt_slo_trd_unit_cd.addLinkBeans(p.columnRslt_slo_trd_unit_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_trd_unit_cd);
		p.columnRslt_slo_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_slo_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_dlv_inst_rcpt_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.dlv_inst_rcpt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_rcpt_no);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_dlv_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_dlv_inst_dt_p_PPanel.YmdHmTable);
		p.columnRslt_cst_dlv_inst_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_dlv_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_dlv_inst_no);
		p.columnRslt_cst_dlv_inst_rev.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_dlv_inst_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_dlv_inst_rev);
		p.columnRslt_cst_dlv_inst_d_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.cst_dlv_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_dlv_inst_d_no);
		p.columnRslt_ship_schd_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ship_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_no);
		p.columnRslt_ship_pr_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ship_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_pr_no);
		p.columnRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ship_fr_lg_grp_cd_META);
		p.columnRslt_ship_fr_lg_grp_cd.addLinkBeans(p.columnRslt_ship_fr_lg_grp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_cd);
		p.columnRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ship_fr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_nm);
		p.columnRslt_ship_fr_lg_grp_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ship_fr_lg_grp_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_wg_cd);
		p.RsltTable.addTable(p.Rslt_ship_rqst_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_pd_inst_dlv_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ship_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_schd_dt_p_PPanel.YmdHmTable);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dlv_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.trd_unit_cd_META);
		p.columnRslt_trd_unit_cd.addLinkBeans(p.columnRslt_trd_unit_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_unit_prms_qty_p_PPanel.QtyTable);
		p.columnRslt_slo_prms_h_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_prms_h_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_prms_h_no);
		p.columnRslt_org_slo_prms_h_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.org_slo_prms_h_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_org_slo_prms_h_no);
		p.columnRslt_slo_prms_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_prms_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_prms_no);
		p.columnRslt_slo_prms_rev.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_prms_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_prms_rev);
		p.RsltTable.addTable(p.Rslt_prms_dlv_dt_p_PPanel.YmdHmTable);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_prms_prnt_tm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.prms_prnt_tm_META);
		p.columnRslt_prms_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_prms_prnt_tm);
		p.columnRslt_last_prms_rev.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.last_prms_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_last_prms_rev);
		p.columnRslt_slo_prms_prnt_flg.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.slo_prms_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_prms_prnt_flg);
		p.columnRslt_prms_rmrks.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.prms_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prms_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_edi_prms_flg.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.edi_prms_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_prms_flg);
		p.columnRslt_last_edi_prms_flg.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.last_edi_prms_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_last_edi_prms_flg);
		p.columnRslt_edi_send_flg.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.edi_send_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_send_flg);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_ship_pr_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1260.RsltR.ship_pr_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_pr_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_slo_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_slo_trd_unit_cd.getListConfig().setPutter(getRslt_slo_trd_unit_cd_ListPutter());
		columnRslt_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_unit_cd.getListConfig().setPutter(getRslt_trd_unit_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNTStatus() {
		status = PRNT;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
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
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
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
	 * [Rslt_slo_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_slo_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Rslt_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_slo_trd_unit_cd) return getRslt_slo_trd_unit_cd(row, info);
		if(combo == columnRslt_trd_unit_cd) return getRslt_trd_unit_cd(row, info);
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
		else if (ap == Btn_open_MSBBP1230) doBtn_open_MSBBP1230(info);
		else if (ap == Btn_prnt_prms) doBtn_prnt_prms(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_edi_prms_select_all) doBtn_edi_prms_select_all(info);
		else if (ap == Btn_edi_prms_deselect_all) doBtn_edi_prms_deselect_all(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
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
	 * [Btn]パネルの[open_MSBBP1230]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1230(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_prms]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_prms(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[edi_prms_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_edi_prms_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[edi_prms_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_edi_prms_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

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
		if (vc == Cnd_edi_flg) return doCnd_edi_flg_VC(info);
		if (vc == Cnd_not_edi_flg) return doCnd_not_edi_flg_VC(info);
		if (vc == Cnd_not_prms_flg) return doCnd_not_prms_flg_VC(info);
		if (vc == Cnd_prms_flg) return doCnd_prms_flg_VC(info);
		if (vc == Cnd_prms_not_prnted) return doCnd_prms_not_prnted_VC(info);
		if (vc == Cnd_prms_prnted) return doCnd_prms_prnted_VC(info);
		if (vc == Cnd_slo_dt_fr) return doCnd_slo_dt_fr_VC(info);
		if (vc == Cnd_slo_dt_to) return doCnd_slo_dt_to_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_cst_dlv_inst_no) return doCnd_cst_dlv_inst_no_VC(info);
		if (vc == Cnd_cst_dlv_inst_d_no) return doCnd_cst_dlv_inst_d_no_VC(info);
		if (vc == Cnd_ship_schd_no) return doCnd_ship_schd_no_VC(info);
		if (vc == Cnd_slo_prms_h_no) return doCnd_slo_prms_h_no_VC(info);
		if (vc == Cnd_slo_prms_no) return doCnd_slo_prms_no_VC(info);
		if (vc == Cnd_prms_rmrks) return doCnd_prms_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_incl_can_flg) return doCnd_incl_can_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_slo_dt) return doRslt_slo_dt_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_cst_po_rev) return doRslt_cst_po_rev_VC(info);
		if (vc == columnRslt_cst_po_d_no) return doRslt_cst_po_d_no_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_slo_trd_unit_dec_place) return doRslt_slo_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_slo_trd_unit_cd) return doRslt_slo_trd_unit_cd_VC(info);
		if (vc == columnRslt_slo_trd_unit_nm) return doRslt_slo_trd_unit_nm_VC(info);
		if (vc == columnRslt_dlv_inst_rcpt_no) return doRslt_dlv_inst_rcpt_no_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_cst_dlv_inst_no) return doRslt_cst_dlv_inst_no_VC(info);
		if (vc == columnRslt_cst_dlv_inst_rev) return doRslt_cst_dlv_inst_rev_VC(info);
		if (vc == columnRslt_cst_dlv_inst_d_no) return doRslt_cst_dlv_inst_d_no_VC(info);
		if (vc == columnRslt_ship_schd_no) return doRslt_ship_schd_no_VC(info);
		if (vc == columnRslt_ship_pr_no) return doRslt_ship_pr_no_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_cd) return doRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_nm) return doRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_wg_cd) return doRslt_ship_fr_lg_grp_wg_cd_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dlv_nm) return doRslt_dlv_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_slo_prms_h_no) return doRslt_slo_prms_h_no_VC(info);
		if (vc == columnRslt_org_slo_prms_h_no) return doRslt_org_slo_prms_h_no_VC(info);
		if (vc == columnRslt_slo_prms_no) return doRslt_slo_prms_no_VC(info);
		if (vc == columnRslt_slo_prms_rev) return doRslt_slo_prms_rev_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_prms_prnt_tm) return doRslt_prms_prnt_tm_VC(info);
		if (vc == columnRslt_last_prms_rev) return doRslt_last_prms_rev_VC(info);
		if (vc == columnRslt_slo_prms_prnt_flg) return doRslt_slo_prms_prnt_flg_VC(info);
		if (vc == columnRslt_prms_rmrks) return doRslt_prms_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_edi_prms_flg) return doRslt_edi_prms_flg_VC(info);
		if (vc == columnRslt_last_edi_prms_flg) return doRslt_last_edi_prms_flg_VC(info);
		if (vc == columnRslt_edi_send_flg) return doRslt_edi_send_flg_VC(info);
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
		if (vc == columnRslt_ship_pr_upd_cntr) return doRslt_ship_pr_upd_cntr_VC(info);
		if (vc == Btn_prnt_out_flg) return doBtn_prnt_out_flg_VC(info);
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
	 * [Cnd]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_prms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_prms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_not_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_not_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_dlv_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_prms_h_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_prms_h_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_prms_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_prms_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_can_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_rcpt_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_dlv_inst_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_dlv_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_fr_lg_grp_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_prms_h_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_prms_h_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[org_slo_prms_h_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_org_slo_prms_h_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_prms_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_prms_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_prms_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_prms_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[prms_prnt_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prms_prnt_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_prms_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_prms_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_prms_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_prms_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prms_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prms_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_prms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_prms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_edi_prms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_edi_prms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_send_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_send_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_pr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_prnt_out_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_edi_flg) doCnd_edi_flg_NC(info);
		else if (nc == Cnd_not_edi_flg) doCnd_not_edi_flg_NC(info);
		else if (nc == Cnd_not_prms_flg) doCnd_not_prms_flg_NC(info);
		else if (nc == Cnd_prms_flg) doCnd_prms_flg_NC(info);
		else if (nc == Cnd_prms_not_prnted) doCnd_prms_not_prnted_NC(info);
		else if (nc == Cnd_prms_prnted) doCnd_prms_prnted_NC(info);
		else if (nc == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NC(info);
		else if (nc == Cnd_slo_dt_to) doCnd_slo_dt_to_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_cst_dlv_inst_no) doCnd_cst_dlv_inst_no_NC(info);
		else if (nc == Cnd_cst_dlv_inst_d_no) doCnd_cst_dlv_inst_d_no_NC(info);
		else if (nc == Cnd_ship_schd_no) doCnd_ship_schd_no_NC(info);
		else if (nc == Cnd_slo_prms_h_no) doCnd_slo_prms_h_no_NC(info);
		else if (nc == Cnd_slo_prms_no) doCnd_slo_prms_no_NC(info);
		else if (nc == Cnd_prms_rmrks) doCnd_prms_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_incl_can_flg) doCnd_incl_can_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_slo_dt) doRslt_slo_dt_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_cst_po_rev) doRslt_cst_po_rev_NC(info);
		else if (nc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_slo_trd_unit_dec_place) doRslt_slo_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_slo_trd_unit_cd) doRslt_slo_trd_unit_cd_NC(info);
		else if (nc == columnRslt_slo_trd_unit_nm) doRslt_slo_trd_unit_nm_NC(info);
		else if (nc == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_cst_dlv_inst_no) doRslt_cst_dlv_inst_no_NC(info);
		else if (nc == columnRslt_cst_dlv_inst_rev) doRslt_cst_dlv_inst_rev_NC(info);
		else if (nc == columnRslt_cst_dlv_inst_d_no) doRslt_cst_dlv_inst_d_no_NC(info);
		else if (nc == columnRslt_ship_schd_no) doRslt_ship_schd_no_NC(info);
		else if (nc == columnRslt_ship_pr_no) doRslt_ship_pr_no_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_wg_cd) doRslt_ship_fr_lg_grp_wg_cd_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dlv_nm) doRslt_dlv_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_slo_prms_h_no) doRslt_slo_prms_h_no_NC(info);
		else if (nc == columnRslt_org_slo_prms_h_no) doRslt_org_slo_prms_h_no_NC(info);
		else if (nc == columnRslt_slo_prms_no) doRslt_slo_prms_no_NC(info);
		else if (nc == columnRslt_slo_prms_rev) doRslt_slo_prms_rev_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_prms_prnt_tm) doRslt_prms_prnt_tm_NC(info);
		else if (nc == columnRslt_last_prms_rev) doRslt_last_prms_rev_NC(info);
		else if (nc == columnRslt_slo_prms_prnt_flg) doRslt_slo_prms_prnt_flg_NC(info);
		else if (nc == columnRslt_prms_rmrks) doRslt_prms_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_edi_prms_flg) doRslt_edi_prms_flg_NC(info);
		else if (nc == columnRslt_last_edi_prms_flg) doRslt_last_edi_prms_flg_NC(info);
		else if (nc == columnRslt_edi_send_flg) doRslt_edi_send_flg_NC(info);
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
		else if (nc == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NC(info);
		else if (nc == Btn_prnt_out_flg) doBtn_prnt_out_flg_NC(info);
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
	 * [Cnd]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_not_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_not_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_h_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_h_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_prms_h_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_h_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_slo_prms_h_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_slo_prms_h_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_prnt_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_prnt_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_prms_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_prms_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_prms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_prms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_edi_prms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_edi_prms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_send_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_send_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_out_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_edi_flg) doCnd_edi_flg_NE(info);
		else if (ne == Cnd_not_edi_flg) doCnd_not_edi_flg_NE(info);
		else if (ne == Cnd_not_prms_flg) doCnd_not_prms_flg_NE(info);
		else if (ne == Cnd_prms_flg) doCnd_prms_flg_NE(info);
		else if (ne == Cnd_prms_not_prnted) doCnd_prms_not_prnted_NE(info);
		else if (ne == Cnd_prms_prnted) doCnd_prms_prnted_NE(info);
		else if (ne == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NE(info);
		else if (ne == Cnd_slo_dt_to) doCnd_slo_dt_to_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_cst_dlv_inst_no) doCnd_cst_dlv_inst_no_NE(info);
		else if (ne == Cnd_cst_dlv_inst_d_no) doCnd_cst_dlv_inst_d_no_NE(info);
		else if (ne == Cnd_ship_schd_no) doCnd_ship_schd_no_NE(info);
		else if (ne == Cnd_slo_prms_h_no) doCnd_slo_prms_h_no_NE(info);
		else if (ne == Cnd_slo_prms_no) doCnd_slo_prms_no_NE(info);
		else if (ne == Cnd_prms_rmrks) doCnd_prms_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_incl_can_flg) doCnd_incl_can_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_slo_dt) doRslt_slo_dt_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_cst_po_rev) doRslt_cst_po_rev_NE(info);
		else if (ne == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_slo_trd_unit_dec_place) doRslt_slo_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_slo_trd_unit_cd) doRslt_slo_trd_unit_cd_NE(info);
		else if (ne == columnRslt_slo_trd_unit_nm) doRslt_slo_trd_unit_nm_NE(info);
		else if (ne == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_cst_dlv_inst_no) doRslt_cst_dlv_inst_no_NE(info);
		else if (ne == columnRslt_cst_dlv_inst_rev) doRslt_cst_dlv_inst_rev_NE(info);
		else if (ne == columnRslt_cst_dlv_inst_d_no) doRslt_cst_dlv_inst_d_no_NE(info);
		else if (ne == columnRslt_ship_schd_no) doRslt_ship_schd_no_NE(info);
		else if (ne == columnRslt_ship_pr_no) doRslt_ship_pr_no_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_wg_cd) doRslt_ship_fr_lg_grp_wg_cd_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dlv_nm) doRslt_dlv_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_slo_prms_h_no) doRslt_slo_prms_h_no_NE(info);
		else if (ne == columnRslt_org_slo_prms_h_no) doRslt_org_slo_prms_h_no_NE(info);
		else if (ne == columnRslt_slo_prms_no) doRslt_slo_prms_no_NE(info);
		else if (ne == columnRslt_slo_prms_rev) doRslt_slo_prms_rev_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_prms_prnt_tm) doRslt_prms_prnt_tm_NE(info);
		else if (ne == columnRslt_last_prms_rev) doRslt_last_prms_rev_NE(info);
		else if (ne == columnRslt_slo_prms_prnt_flg) doRslt_slo_prms_prnt_flg_NE(info);
		else if (ne == columnRslt_prms_rmrks) doRslt_prms_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_edi_prms_flg) doRslt_edi_prms_flg_NE(info);
		else if (ne == columnRslt_last_edi_prms_flg) doRslt_last_edi_prms_flg_NE(info);
		else if (ne == columnRslt_edi_send_flg) doRslt_edi_send_flg_NE(info);
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
		else if (ne == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NE(info);
		else if (ne == Btn_prnt_out_flg) doBtn_prnt_out_flg_NE(info);
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
	 * [Cnd]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_not_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_not_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_h_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_h_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_prms_h_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_h_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_slo_prms_h_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_slo_prms_h_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_prnt_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_prnt_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_prms_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_prms_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_prms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_prms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_edi_prms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_edi_prms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_send_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_send_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_out_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_edi_flg) doCnd_edi_flg_NX(info);
		else if (nx == Cnd_not_edi_flg) doCnd_not_edi_flg_NX(info);
		else if (nx == Cnd_not_prms_flg) doCnd_not_prms_flg_NX(info);
		else if (nx == Cnd_prms_flg) doCnd_prms_flg_NX(info);
		else if (nx == Cnd_prms_not_prnted) doCnd_prms_not_prnted_NX(info);
		else if (nx == Cnd_prms_prnted) doCnd_prms_prnted_NX(info);
		else if (nx == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NX(info);
		else if (nx == Cnd_slo_dt_to) doCnd_slo_dt_to_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_cst_dlv_inst_no) doCnd_cst_dlv_inst_no_NX(info);
		else if (nx == Cnd_cst_dlv_inst_d_no) doCnd_cst_dlv_inst_d_no_NX(info);
		else if (nx == Cnd_ship_schd_no) doCnd_ship_schd_no_NX(info);
		else if (nx == Cnd_slo_prms_h_no) doCnd_slo_prms_h_no_NX(info);
		else if (nx == Cnd_slo_prms_no) doCnd_slo_prms_no_NX(info);
		else if (nx == Cnd_prms_rmrks) doCnd_prms_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_incl_can_flg) doCnd_incl_can_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_slo_dt) doRslt_slo_dt_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_cst_po_rev) doRslt_cst_po_rev_NX(info);
		else if (nx == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_slo_trd_unit_dec_place) doRslt_slo_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_slo_trd_unit_cd) doRslt_slo_trd_unit_cd_NX(info);
		else if (nx == columnRslt_slo_trd_unit_nm) doRslt_slo_trd_unit_nm_NX(info);
		else if (nx == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_cst_dlv_inst_no) doRslt_cst_dlv_inst_no_NX(info);
		else if (nx == columnRslt_cst_dlv_inst_rev) doRslt_cst_dlv_inst_rev_NX(info);
		else if (nx == columnRslt_cst_dlv_inst_d_no) doRslt_cst_dlv_inst_d_no_NX(info);
		else if (nx == columnRslt_ship_schd_no) doRslt_ship_schd_no_NX(info);
		else if (nx == columnRslt_ship_pr_no) doRslt_ship_pr_no_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_wg_cd) doRslt_ship_fr_lg_grp_wg_cd_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dlv_nm) doRslt_dlv_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_slo_prms_h_no) doRslt_slo_prms_h_no_NX(info);
		else if (nx == columnRslt_org_slo_prms_h_no) doRslt_org_slo_prms_h_no_NX(info);
		else if (nx == columnRslt_slo_prms_no) doRslt_slo_prms_no_NX(info);
		else if (nx == columnRslt_slo_prms_rev) doRslt_slo_prms_rev_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_prms_prnt_tm) doRslt_prms_prnt_tm_NX(info);
		else if (nx == columnRslt_last_prms_rev) doRslt_last_prms_rev_NX(info);
		else if (nx == columnRslt_slo_prms_prnt_flg) doRslt_slo_prms_prnt_flg_NX(info);
		else if (nx == columnRslt_prms_rmrks) doRslt_prms_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_edi_prms_flg) doRslt_edi_prms_flg_NX(info);
		else if (nx == columnRslt_last_edi_prms_flg) doRslt_last_edi_prms_flg_NX(info);
		else if (nx == columnRslt_edi_send_flg) doRslt_edi_send_flg_NX(info);
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
		else if (nx == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NX(info);
		else if (nx == Btn_prnt_out_flg) doBtn_prnt_out_flg_NX(info);
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
	 * [Cnd]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_not_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_not_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_h_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_h_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_prms_h_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_h_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_slo_prms_h_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_slo_prms_h_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_prnt_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_prnt_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_prms_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_prms_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_prms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_prms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_edi_prms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_edi_prms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_send_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_send_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_out_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_slo_dt_fr) doCnd_slo_dt_fr_LC(info);
		else if (lc == Cnd_slo_dt_to) doCnd_slo_dt_to_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_cst_dlv_inst_no) doCnd_cst_dlv_inst_no_LC(info);
		else if (lc == Cnd_cst_dlv_inst_d_no) doCnd_cst_dlv_inst_d_no_LC(info);
		else if (lc == Cnd_ship_schd_no) doCnd_ship_schd_no_LC(info);
		else if (lc == Cnd_slo_prms_h_no) doCnd_slo_prms_h_no_LC(info);
		else if (lc == Cnd_slo_prms_no) doCnd_slo_prms_no_LC(info);
		else if (lc == Cnd_prms_rmrks) doCnd_prms_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_slo_dt) doRslt_slo_dt_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_cst_po_rev) doRslt_cst_po_rev_LC(info);
		else if (lc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_slo_trd_unit_dec_place) doRslt_slo_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_slo_trd_unit_cd) doRslt_slo_trd_unit_cd_LC(info);
		else if (lc == columnRslt_slo_trd_unit_nm) doRslt_slo_trd_unit_nm_LC(info);
		else if (lc == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_cst_dlv_inst_no) doRslt_cst_dlv_inst_no_LC(info);
		else if (lc == columnRslt_cst_dlv_inst_rev) doRslt_cst_dlv_inst_rev_LC(info);
		else if (lc == columnRslt_cst_dlv_inst_d_no) doRslt_cst_dlv_inst_d_no_LC(info);
		else if (lc == columnRslt_ship_schd_no) doRslt_ship_schd_no_LC(info);
		else if (lc == columnRslt_ship_pr_no) doRslt_ship_pr_no_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_wg_cd) doRslt_ship_fr_lg_grp_wg_cd_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dlv_nm) doRslt_dlv_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_slo_prms_h_no) doRslt_slo_prms_h_no_LC(info);
		else if (lc == columnRslt_org_slo_prms_h_no) doRslt_org_slo_prms_h_no_LC(info);
		else if (lc == columnRslt_slo_prms_no) doRslt_slo_prms_no_LC(info);
		else if (lc == columnRslt_slo_prms_rev) doRslt_slo_prms_rev_LC(info);
		else if (lc == columnRslt_prms_prnt_tm) doRslt_prms_prnt_tm_LC(info);
		else if (lc == columnRslt_last_prms_rev) doRslt_last_prms_rev_LC(info);
		else if (lc == columnRslt_prms_rmrks) doRslt_prms_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
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
		else if (lc == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_dlv_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_h_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_h_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_prms_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_prms_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_dlv_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_prms_h_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_h_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_slo_prms_h_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_slo_prms_h_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_prms_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_prms_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_prnt_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_prms_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_prms_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prms_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prms_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_slo_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt_slo_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1260.Srch01")) {
			return new MS_MSBBL1260_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1260.Srch02")) {
			return new MS_MSBBL1260_Srch02Bridge();
		}
		if (id.equals("MS.MSBBL1260.Upd01")) {
			return new MS_MSBBL1260_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1260.Del01")) {
			return new MS_MSBBL1260_Del01Bridge();
		}
		if (id.equals("MS.MSBBL1260.Prnt01")) {
			return new MS_MSBBL1260_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1260_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1260_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1260_Srch01Bridge() {
			p_MS_MSBBL1260_Srch01 = new MCParam(PDef.MS_MSBBL1260_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1260_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1260.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));

			p_MS_MSBBL1260_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1260_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1260_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1260_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1260_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1260.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1260.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1260_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1260_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)p_MS_MSBBL1260_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1260_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1260_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL1260_Srch02Bridge() {
			p_MS_MSBBL1260_Srch02 = new MCParam(PDef.MS_MSBBL1260_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1260_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1260.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));

			p_MS_MSBBL1260_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1260_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1260_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1260_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1260_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1260.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1260.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1260_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1260_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)p_MS_MSBBL1260_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1260_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1260_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1260_Upd01Bridge() {
			p_MS_MSBBL1260_Upd01 = new MCParam(PDef.MS_MSBBL1260_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1260_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1260.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));

			p_MS_MSBBL1260_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1260_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1260_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1260_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1260_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1260_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1260.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1260.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1260_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1260_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)p_MS_MSBBL1260_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1260_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1260_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1260_Del01Bridge() {
			p_MS_MSBBL1260_Del01 = new MCParam(PDef.MS_MSBBL1260_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1260_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1260.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));

			p_MS_MSBBL1260_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1260_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1260_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1260_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1260_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1260_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1260.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1260.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1260_Del01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1260_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)p_MS_MSBBL1260_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1260_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1260_Prnt01;

		/** コンストラクタ */
		protected MS_MSBBL1260_Prnt01Bridge() {
			p_MS_MSBBL1260_Prnt01 = new MCParam(PDef.MS_MSBBL1260_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1260_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1260.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));

			p_MS_MSBBL1260_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1260_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1260_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1260_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1260_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1260_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1260.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1260.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1260.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1260_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1260.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1260_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1260.RsltR>)p_MS_MSBBL1260_Prnt01.getContainerParam().getDownBlock(0));
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