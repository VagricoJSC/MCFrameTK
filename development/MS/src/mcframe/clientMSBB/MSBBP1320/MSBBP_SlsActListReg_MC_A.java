package mcframe.clientMSBB.MSBBP1320;

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
import mcframe.clientMSBB.MSBBP1320.MSBBP_SlsActListReg_MC.MS_MSBBL1320_Srch01Caller;
import mcframe.clientMSBB.MSBBP1320.MSBBP_SlsActListReg_MC.MS_MSBBL1320_Srch02Caller;
import mcframe.clientMSBB.MSBBP1320.MSBBP_SlsActListReg_MC.MS_MSBBL1320_Ins01Caller;
import mcframe.clientMSBB.MSBBP1320.MSBBP_SlsActListReg_MC.MS_MSBBL1320_Upd01Caller;
import mcframe.clientMSBB.MSBBP1320.MSBBP_SlsActListReg_MC.MS_MSBBL1320_Del01Caller;

/**
 * 画面"MSBBP_SlsActListReg"パネルクラスです。<p>
 *
 * 受注もしくは出荷実績に対して売上を一覧形式で登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SlsActListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1320";

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
	// [SrchMode]ブロック関連のField定義
	public MCPanel SrchModePanel = null;
	public MCTitledBorder SrchModeTitledBorder = null;
	// [SrchMode]ブロックの項目のField定義
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
	// [OpeTyp]ブロック関連のField定義
	public MCPanel OpeTypPanel = null;
	public MCTitledBorder OpeTypTitledBorder = null;
	// [OpeTyp]ブロックの項目のField定義
	// [CstIv]ブロック関連のField定義
	public MCPanel CstIvPanel = null;
	public MCTitledBorder CstIvTitledBorder = null;
	// [CstIv]ブロックの項目のField定義
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [CstCnd]ブロック関連のField定義
	public MCPanel CstCndPanel = null;
	// [CstCnd]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [AcstCnd]ブロック関連のField定義
	public MCPanel AcstCndPanel = null;
	// [AcstCnd]ブロックの項目のField定義
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [SpplCnd]ブロック関連のField定義
	public MCPanel SpplCndPanel = null;
	// [SpplCnd]ブロックの項目のField定義
	// [Tab6]ブロック関連のField定義
	public MCPanel Tab6Panel = null;
	// [Tab6]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create,INS;UPD,Modify,UPD;DEL,Cancel,DEL;REF,View,REF; INS,登録する,INS;UPD,訂正する,UPD;DEL,取り消す,DEL;REF,参照する,REF;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * DTL,Details,DTL;HDR,Header,HDR DTL,明細,DTL;HDR,ヘッダ,HDR.<p>
	 *
	 */
	public MCButtonGroup Cnd_mode_Group = null;
	public MCRadioButton Cnd_mode_DTL = null;
	public MCRadioButton Cnd_mode_HDR = null;
	/**
	 * Arrival sales 着荷売上.<p>
	 *
	 */
	public MCCheckBox Cnd_arrv_base_sls_flg = null;
	/**
	 * Acceptance sales 検収売上.<p>
	 *
	 */
	public MCCheckBox Cnd_arrv_sls_flg = null;
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_cststk_flg = null;
	/**
	 * Direct delivery sales 仕入直送売上.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_ddlv_flg = null;
	/**
	 * Sales not for shipping order 出荷指図対象外売上.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ship_ord_sls_flg = null;
	/**
	 * Not scheduled 予定なし.<p>
	 *
	 */
	public MCCheckBox Cnd_non_schd_flg = null;
	/**
	 * Sales for shipping order 出荷指図対象売上.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_ord_sls_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_iv_flg = null;
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
	public MCLabel Cnd_sls_schd_dt_fr_Label = null;
	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sls_schd_dt_fr = null;
	public MCLabel Cnd_sls_schd_dt_to_Label = null;
	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sls_schd_dt_to = null;
	public MCLabel Cnd_sls_dt_fr_Label = null;
	/**
	 * Sales date FROM 売上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sls_dt_fr = null;
	public MCLabel Cnd_sls_dt_to_Label = null;
	/**
	 * Sales date TO 売上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sls_dt_to = null;
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_dt_p_PPanel;
	public MCDateField Cnd_ship_dt_fr;	// [Cnd]の[ship_dt_p.ymd_fr]を[Cnd_ship_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_fr;	// [Cnd]の[ship_dt_p.hm_fr]を[Cnd_ship_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_dt_to;	// [Cnd]の[ship_dt_p.ymd_to]を[Cnd_ship_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_to;	// [Cnd]の[ship_dt_p.hm_to]を[Cnd_ship_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_dt_p_PPanel;
	public MCDateField Cnd_dlv_dt_fr;	// [Cnd]の[dlv_dt_p.ymd_fr]を[Cnd_dlv_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_hm_fr;	// [Cnd]の[dlv_dt_p.hm_fr]を[Cnd_dlv_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_dt_to;	// [Cnd]の[dlv_dt_p.ymd_to]を[Cnd_dlv_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_hm_to;	// [Cnd]の[dlv_dt_p.hm_to]を[Cnd_dlv_hm_to]としてエイリアス定義。
	public MCLabel Cnd_sls_usr_cd_Label = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_nm = null;
	public MCLabel Cnd_sls_dpt_cd_Label = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_nm = null;
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
	public MCLabel Cnd_dest_cd1_Label = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm1 = null;
	public MCLabel Cnd_dest_cd2_Label = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm2 = null;
	public MCLabel Cnd_dest_cd3_Label = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm3 = null;
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
	public MCLabel Cnd_ship_lg_grp_cd_Label = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_ship_lg_grp_nm = null;
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
	public MCLabel Cnd_ship_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_dlv_slip_no = null;
	public MCLabel Cnd_purc_ddlv_dlv_slip_no_Label = null;
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_ddlv_dlv_slip_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_ship_act_no_Label = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_act_no = null;
	public MCLabel Cnd_sls_act_no_Label = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_act_no = null;
	public MCLabel Cnd_cst_po_no_Label = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_po_no = null;
	public MCLabel Cnd_ext_purc_act_d_no_Label = null;
	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_purc_act_d_no = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Cnd_trd_nm = null;
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sublot_no = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_d_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_acst_grp_p_PPanel;
	public MCLabel Cnd_acst_grp_lab1;	// [Cnd]の[acst_grp_p.bp_grp_lab1]を[Cnd_acst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg1;	// [Cnd]の[acst_grp_p.bp_grp_flg1]を[Cnd_acst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd1;	// [Cnd]の[acst_grp_p.bp_grp_cd1]を[Cnd_acst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm1;	// [Cnd]の[acst_grp_p.bp_grp_nm1]を[Cnd_acst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab2;	// [Cnd]の[acst_grp_p.bp_grp_lab2]を[Cnd_acst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg2;	// [Cnd]の[acst_grp_p.bp_grp_flg2]を[Cnd_acst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd2;	// [Cnd]の[acst_grp_p.bp_grp_cd2]を[Cnd_acst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm2;	// [Cnd]の[acst_grp_p.bp_grp_nm2]を[Cnd_acst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab3;	// [Cnd]の[acst_grp_p.bp_grp_lab3]を[Cnd_acst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg3;	// [Cnd]の[acst_grp_p.bp_grp_flg3]を[Cnd_acst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd3;	// [Cnd]の[acst_grp_p.bp_grp_cd3]を[Cnd_acst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm3;	// [Cnd]の[acst_grp_p.bp_grp_nm3]を[Cnd_acst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab4;	// [Cnd]の[acst_grp_p.bp_grp_lab4]を[Cnd_acst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg4;	// [Cnd]の[acst_grp_p.bp_grp_flg4]を[Cnd_acst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd4;	// [Cnd]の[acst_grp_p.bp_grp_cd4]を[Cnd_acst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm4;	// [Cnd]の[acst_grp_p.bp_grp_nm4]を[Cnd_acst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab5;	// [Cnd]の[acst_grp_p.bp_grp_lab5]を[Cnd_acst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg5;	// [Cnd]の[acst_grp_p.bp_grp_flg5]を[Cnd_acst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd5;	// [Cnd]の[acst_grp_p.bp_grp_cd5]を[Cnd_acst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm5;	// [Cnd]の[acst_grp_p.bp_grp_nm5]を[Cnd_acst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab6;	// [Cnd]の[acst_grp_p.bp_grp_lab6]を[Cnd_acst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg6;	// [Cnd]の[acst_grp_p.bp_grp_flg6]を[Cnd_acst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd6;	// [Cnd]の[acst_grp_p.bp_grp_cd6]を[Cnd_acst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm6;	// [Cnd]の[acst_grp_p.bp_grp_nm6]を[Cnd_acst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab7;	// [Cnd]の[acst_grp_p.bp_grp_lab7]を[Cnd_acst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg7;	// [Cnd]の[acst_grp_p.bp_grp_flg7]を[Cnd_acst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd7;	// [Cnd]の[acst_grp_p.bp_grp_cd7]を[Cnd_acst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm7;	// [Cnd]の[acst_grp_p.bp_grp_nm7]を[Cnd_acst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab8;	// [Cnd]の[acst_grp_p.bp_grp_lab8]を[Cnd_acst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg8;	// [Cnd]の[acst_grp_p.bp_grp_flg8]を[Cnd_acst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd8;	// [Cnd]の[acst_grp_p.bp_grp_cd8]を[Cnd_acst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm8;	// [Cnd]の[acst_grp_p.bp_grp_nm8]を[Cnd_acst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab9;	// [Cnd]の[acst_grp_p.bp_grp_lab9]を[Cnd_acst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg9;	// [Cnd]の[acst_grp_p.bp_grp_flg9]を[Cnd_acst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd9;	// [Cnd]の[acst_grp_p.bp_grp_cd9]を[Cnd_acst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm9;	// [Cnd]の[acst_grp_p.bp_grp_nm9]を[Cnd_acst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab10;	// [Cnd]の[acst_grp_p.bp_grp_lab10]を[Cnd_acst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg10;	// [Cnd]の[acst_grp_p.bp_grp_flg10]を[Cnd_acst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd10;	// [Cnd]の[acst_grp_p.bp_grp_cd10]を[Cnd_acst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm10;	// [Cnd]の[acst_grp_p.bp_grp_nm10]を[Cnd_acst_grp_nm10]としてエイリアス定義。
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
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_sls_dt_Label = null;
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDateField BulkSet_sls_dt = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H BulkSet_ac_dt_p_PPanel;
	public MCDateField BulkSet_ac_dt;	// [BulkSet]の[ac_dt_p.ac_dt]を[BulkSet_ac_dt]としてエイリアス定義。
	public MCLabel BulkSet_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField BulkSet_bill_basis_dt = null;
	public MCLabel BulkSet_rcv_schd_dt_Label = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDateField BulkSet_rcv_schd_dt = null;
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_ship_dt_p_PPanel;
	public MCDateField BulkSet_ship_dt;	// [BulkSet]の[ship_dt_p.ymd]を[BulkSet_ship_dt]としてエイリアス定義。
	public MCDateField BulkSet_ship_hm;	// [BulkSet]の[ship_dt_p.hm]を[BulkSet_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_dlv_dt_p_PPanel;
	public MCDateField BulkSet_dlv_dt;	// [BulkSet]の[dlv_dt_p.ymd]を[BulkSet_dlv_dt]としてエイリアス定義。
	public MCDateField BulkSet_dlv_hm;	// [BulkSet]の[dlv_dt_p.hm]を[BulkSet_dlv_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_sls_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_sls_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_sls_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_sls_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_sls_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_sls_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_sls_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_sls_dpt_nm]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1320.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	/**
	 * Purchase simultaneously recorded 仕入同時計上.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sync_flg = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * Sales target type 売上対象区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_tgt_typ = null;
	/**
	 * Sales target type name 売上対象区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_tgt_typ_nm = null;
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_flg = null;
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_schd_dt = null;
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dt = null;
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_ac_dt;// [Rslt]の[ac_dt_p.ac_dt]を[columnRslt_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D Rslt_can_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_can_ac_dt_for_input;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_input]を[columnRslt_can_ac_dt_for_input]としてエイリアス定義。
	public MCColumnConfig columnRslt_can_ac_dt;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_call]を[columnRslt_can_ac_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ac_dt_after_srch;// [Rslt]の[can_ac_dt_p.ac_dt_after_srch]を[columnRslt_ac_dt_after_srch]としてエイリアス定義。
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_basis_dt = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_tm_p_PPanel;
	public MCColumnConfig columnRslt_ship_dt;// [Rslt]の[ship_tm_p.ymd]を[columnRslt_ship_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_hm;// [Rslt]の[ship_tm_p.hm]を[columnRslt_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_tm_p_PPanel;
	public MCColumnConfig columnRslt_dlv_dt;// [Rslt]の[dlv_tm_p.ymd]を[columnRslt_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_hm;// [Rslt]の[dlv_tm_p.hm]を[columnRslt_dlv_hm]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_sls_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_sls_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_sls_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_sls_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_sls_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_sls_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_sls_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_sls_dpt_nm]としてエイリアス定義。
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
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_upri_dec_place = null;
	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_xrate_p_PPanel;
	public MCColumnConfig columnRslt_xrate;// [Rslt]の[xrate_p.xrate]を[columnRslt_xrate]としてエイリアス定義。
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
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
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_upri_dec_place = null;
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
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_amt_dec_place = null;
	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_upri_dec_place = null;
	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_ptax_xrate_p_PPanel;
	public MCColumnConfig columnRslt_ptax_xrate;// [Rslt]の[ptax_xrate_p.xrate]を[columnRslt_ptax_xrate]としてエイリアス定義。
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_d_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_d_no = null;
	/**
	 * Multiple delivery note details at shipping 出荷時納品書明細複数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_multi_flg = null;
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_no = null;
	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_d_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_no = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_no = null;
	/**
	 * Delivery recording month 納品計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_ac_ym = null;
	/**
	 * Delivery recording date 納品計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_ac_dt = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_no = null;
	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_rev = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_no = null;
	/**
	 * Revenue recording month 売上計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_basis_ym = null;
	/**
	 * Revenue recording date 売上計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_basis_dt = null;
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
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_no = null;
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_rev = null;
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
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
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_nm = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_acst_grp_p_PPanel;
	public MCColumnConfig columnRslt_acst_grp_cd1;// [Rslt]の[acst_grp_p.bp_grp_cd1]を[columnRslt_acst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm1;// [Rslt]の[acst_grp_p.bp_grp_nm1]を[columnRslt_acst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd2;// [Rslt]の[acst_grp_p.bp_grp_cd2]を[columnRslt_acst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm2;// [Rslt]の[acst_grp_p.bp_grp_nm2]を[columnRslt_acst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd3;// [Rslt]の[acst_grp_p.bp_grp_cd3]を[columnRslt_acst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm3;// [Rslt]の[acst_grp_p.bp_grp_nm3]を[columnRslt_acst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd4;// [Rslt]の[acst_grp_p.bp_grp_cd4]を[columnRslt_acst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm4;// [Rslt]の[acst_grp_p.bp_grp_nm4]を[columnRslt_acst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd5;// [Rslt]の[acst_grp_p.bp_grp_cd5]を[columnRslt_acst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm5;// [Rslt]の[acst_grp_p.bp_grp_nm5]を[columnRslt_acst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd6;// [Rslt]の[acst_grp_p.bp_grp_cd6]を[columnRslt_acst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm6;// [Rslt]の[acst_grp_p.bp_grp_nm6]を[columnRslt_acst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd7;// [Rslt]の[acst_grp_p.bp_grp_cd7]を[columnRslt_acst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm7;// [Rslt]の[acst_grp_p.bp_grp_nm7]を[columnRslt_acst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd8;// [Rslt]の[acst_grp_p.bp_grp_cd8]を[columnRslt_acst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm8;// [Rslt]の[acst_grp_p.bp_grp_nm8]を[columnRslt_acst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd9;// [Rslt]の[acst_grp_p.bp_grp_cd9]を[columnRslt_acst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm9;// [Rslt]の[acst_grp_p.bp_grp_nm9]を[columnRslt_acst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd10;// [Rslt]の[acst_grp_p.bp_grp_cd10]を[columnRslt_acst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm10;// [Rslt]の[acst_grp_p.bp_grp_nm10]を[columnRslt_acst_grp_nm10]としてエイリアス定義。
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_nm = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_dlv_p_PPanel;
	public MCColumnConfig columnRslt_dlv_cd;// [Rslt]の[dlv_p.bp_cd]を[columnRslt_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_nm;// [Rslt]の[dlv_p.bp_nm]を[columnRslt_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_zip_cd;// [Rslt]の[dlv_p.zip_cd]を[columnRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr1;// [Rslt]の[dlv_p.addr1]を[columnRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr2;// [Rslt]の[dlv_p.addr2]を[columnRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr3;// [Rslt]の[dlv_p.addr3]を[columnRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr4;// [Rslt]の[dlv_p.addr4]を[columnRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_dpt;// [Rslt]の[dlv_p.dlv_cntct_dpt]を[columnRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_psn;// [Rslt]の[dlv_p.dlv_cntct_psn]を[columnRslt_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_tel;// [Rslt]の[dlv_p.tel]を[columnRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_fax;// [Rslt]の[dlv_p.fax]を[columnRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_pri_prnt_flg;// [Rslt]の[dlv_p.pri_prnt_flg]を[columnRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_cd;// [Rslt]の[dlv_p.cntry_cd]を[columnRslt_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_nm;// [Rslt]の[dlv_p.cntry_nm]を[columnRslt_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_sundry_flg;// [Rslt]の[dlv_p.dlv_sundry_flg]を[columnRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lg_grp_cd;// [Rslt]の[dlv_p.lg_grp_cd]を[columnRslt_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_lg_grp_nm;// [Rslt]の[dlv_p.lg_grp_nm]を[columnRslt_lg_grp_nm]としてエイリアス定義。
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
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm3 = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_lg_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no_typ = null;
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
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_sublot_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_sublot_mix_flg = null;
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_valid_dt = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
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
	/**
	 * Multiple details 複数詳細.<p>
	 *
	 */
	public MCColumnConfig columnRslt_multi_io_flg = null;
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
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_qty = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sls_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_sls_schd_qty;// [Rslt]の[sls_schd_qty_p.qty]を[columnRslt_sls_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_abort_qty_p_PPanel;
	public MCColumnConfig columnRslt_abort_qty;// [Rslt]の[abort_qty_p.qty]を[columnRslt_abort_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sls_qty_p_PPanel;
	public MCColumnConfig columnRslt_sls_qty;// [Rslt]の[sls_qty_p.qty]を[columnRslt_sls_qty]としてエイリアス定義。
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dtl_upd_flg = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Rslt_trd_upri_amt_p_PPanel;
	public MCColumnConfig columnRslt_upri_not_tgt_flg;// [Rslt]の[trd_upri_amt_p.upri_not_tgt_flg]を[columnRslt_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_upri_amt_p.trd_cur_upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnRslt_interim_flg;// [Rslt]の[trd_upri_amt_p.interim_flg]を[columnRslt_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_upri_amt_p.trd_cur_amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_upri_amt_p.trd_cur_inc_tax_amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_fix_flg;// [Rslt]の[trd_upri_amt_p.tax_fix_flg]を[columnRslt_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_cd;// [Rslt]の[trd_upri_amt_p.tax_cd]を[columnRslt_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_nm;// [Rslt]の[trd_upri_amt_p.tax_nm]を[columnRslt_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_rate;// [Rslt]の[trd_upri_amt_p.tax_rate]を[columnRslt_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_typ;// [Rslt]の[trd_upri_amt_p.tax_typ]を[columnRslt_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_inc_tax_flg;// [Rslt]の[trd_upri_amt_p.inc_tax_flg]を[columnRslt_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_upri_amt_p.trd_cur_tax_amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_upri_amt_p.trd_cur_dscnt_amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dscnt_rsn_cd;// [Rslt]の[trd_upri_amt_p.dscnt_rsn_cd]を[columnRslt_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dscnt_rsn_nm;// [Rslt]の[trd_upri_amt_p.dscnt_rsn_nm]を[columnRslt_dscnt_rsn_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_cost_upri_p_PPanel;
	public MCColumnConfig columnRslt_cost_upri;// [Rslt]の[cost_upri_p.upri]を[columnRslt_cost_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_cost_amt_p_PPanel;
	public MCColumnConfig columnRslt_cost_amt;// [Rslt]の[cost_amt_p.amt]を[columnRslt_cost_amt]としてエイリアス定義。
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prof_rate = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_inc_tax_amt;// [Rslt]の[base_cur_inc_tax_amt_p.amt]を[columnRslt_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_upri;// [Rslt]の[ptax_cur_upri_p.upri]を[columnRslt_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_amt;// [Rslt]の[ptax_cur_amt_p.amt]を[columnRslt_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_tax_amt;// [Rslt]の[ptax_cur_tax_amt_p.amt]を[columnRslt_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_inc_tax_amt;// [Rslt]の[ptax_cur_inc_tax_amt_p.amt]を[columnRslt_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_dscnt_amt;// [Rslt]の[ptax_cur_dscnt_amt_p.amt]を[columnRslt_ptax_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_crryovr_times = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_nm = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_d_no = null;
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_rsn_cd = null;
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_rsn_nm = null;
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_acxfr_flg = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_nm = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_amt = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_dlv_slip_no = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_dlv_slip_d_no = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_nm = null;
	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_purc_act_d_no = null;
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_dt = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_d_rmrks = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Allow unit price change (BP ) 単価変更許可（取引先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_sls_upri_cng_flg = null;
	/**
	 * Allow unit price change (Item) 単価変更許可（品目）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_sls_upri_cng_flg = null;
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_itm_flg = null;
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_amt_rnd_typ = null;
	/**
	 * Rounding type (Sales unit price) 売上単価端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_upri_rnd_typ = null;
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_tax_rnd_typ = null;
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_rnd_typ = null;
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rnd_typ = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_no = null;
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_iv_flg = null;
	/**
	 * Base unit price (Transaction currency) 基準取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_org_trd_cur_upri = null;
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_schd_no = null;
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_out_flg = null;
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_seq = null;
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_seq = null;
	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_trd_unit_conv_qty = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_pr_upd_cntr = null;
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_qty_bef = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
	/**
	 * Sales return schedule 売上返品予定.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1330 = null;
	/**
	 * Sales return entry 売上返品登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1340 = null;
	/**
	 * Sales discount entry 売上値引登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1380 = null;
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
	 * Delivery note immediate issue 納品書即時発行.<p>
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
	/** [SRCH_INS]モードを表す定数 */
	public static final String SRCH_INS = "SRCH_INS";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_INS, INS, SRCH_UPD, UPD, SRCH_DEL, DEL, REF_DTL, REF_HDR};
	
	/** [MS_MSBBL1320_Srch01]のCallerの作成 */
	protected MSBBP_SlsActListReg_MC.MS_MSBBL1320_Srch01Caller createMS_MSBBL1320_Srch01() {
		MSBBP_SlsActListReg_MC.MS_MSBBL1320_Srch01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Srch01Bridge>
		caller = ((MSBBP_SlsActListReg_MC)this).new MS_MSBBL1320_Srch01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Srch01Bridge>(
					(MSBBP_SlsActListReg)this, new MS_MSBBL1320_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1320_Srch01]の呼び出し */
	protected void callMS_MSBBL1320_Srch01() {
		MCCaller caller = createMS_MSBBL1320_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1320_Srch02]のCallerの作成 */
	protected MSBBP_SlsActListReg_MC.MS_MSBBL1320_Srch02Caller createMS_MSBBL1320_Srch02() {
		MSBBP_SlsActListReg_MC.MS_MSBBL1320_Srch02Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Srch02Bridge>
		caller = ((MSBBP_SlsActListReg_MC)this).new MS_MSBBL1320_Srch02Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Srch02Bridge>(
					(MSBBP_SlsActListReg)this, new MS_MSBBL1320_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL1320_Srch02]の呼び出し */
	protected void callMS_MSBBL1320_Srch02() {
		MCCaller caller = createMS_MSBBL1320_Srch02();
		caller.exec();
	}
	/** [MS_MSBBL1320_Ins01]のCallerの作成 */
	protected MSBBP_SlsActListReg_MC.MS_MSBBL1320_Ins01Caller createMS_MSBBL1320_Ins01() {
		MSBBP_SlsActListReg_MC.MS_MSBBL1320_Ins01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Ins01Bridge>
		caller = ((MSBBP_SlsActListReg_MC)this).new MS_MSBBL1320_Ins01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Ins01Bridge>(
					(MSBBP_SlsActListReg)this, new MS_MSBBL1320_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBBL1320_Ins01]の呼び出し */
	protected void callMS_MSBBL1320_Ins01() {
		MCCaller caller = createMS_MSBBL1320_Ins01();
		caller.exec();
	}
	/** [MS_MSBBL1320_Upd01]のCallerの作成 */
	protected MSBBP_SlsActListReg_MC.MS_MSBBL1320_Upd01Caller createMS_MSBBL1320_Upd01() {
		MSBBP_SlsActListReg_MC.MS_MSBBL1320_Upd01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Upd01Bridge>
		caller = ((MSBBP_SlsActListReg_MC)this).new MS_MSBBL1320_Upd01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Upd01Bridge>(
					(MSBBP_SlsActListReg)this, new MS_MSBBL1320_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1320_Upd01]の呼び出し */
	protected void callMS_MSBBL1320_Upd01() {
		MCCaller caller = createMS_MSBBL1320_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1320_Del01]のCallerの作成 */
	protected MSBBP_SlsActListReg_MC.MS_MSBBL1320_Del01Caller createMS_MSBBL1320_Del01() {
		MSBBP_SlsActListReg_MC.MS_MSBBL1320_Del01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Del01Bridge>
		caller = ((MSBBP_SlsActListReg_MC)this).new MS_MSBBL1320_Del01Caller<MSBBP_SlsActListReg, MS_MSBBL1320_Del01Bridge>(
					(MSBBP_SlsActListReg)this, new MS_MSBBL1320_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1320_Del01]の呼び出し */
	protected void callMS_MSBBL1320_Del01() {
		MCCaller caller = createMS_MSBBL1320_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1320.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1320.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1320.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1320.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1320.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1320.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1320.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1320.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBB.MSBBP1320.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1320.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1320.BulkSetR createBulkSetR() {
		return mcframe.clientMSBB.MSBBP1320.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP1320.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1320.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP1320.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP1320.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1320.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBB.MSBBP1320.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1320.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1320.BtnR createBtnR() {
		return mcframe.clientMSBB.MSBBP1320.BtnR.create();
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
		ret.add(SrchModePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(OpeTypPanel);
		ret.add(CstIvPanel);
		ret.add(EdiPanel);
		ret.add(Tab2Panel);
		ret.add(CstCndPanel);
		ret.add(Tab3Panel);
		ret.add(DlvCndPanel);
		ret.add(Tab4Panel);
		ret.add(AcstCndPanel);
		ret.add(Tab5Panel);
		ret.add(SpplCndPanel);
		ret.add(Tab6Panel);
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
	public MSBBP_SlsActListReg_MC_A() {
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
	public MSBBP_SlsActListReg_MC_A(String name) {
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
		MSBBP_SlsActListReg_MC.jbCreateScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateSrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTop((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateFold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateOpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateCstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateEdi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateCstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateDlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateAcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateSpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateTab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateCtrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateRPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateBulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateRslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateBtn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbCreateEastBtn((MSBBP_SlsActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SlsActListReg p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_SlsActListReg p) {
	}

	/**
	 * [OpeTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOpeTyp(MSBBP_SlsActListReg p) {
	}

	/**
	 * [CstIv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstIv(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_SlsActListReg p) {
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_SlsActListReg p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_SlsActListReg p) {
	}

	/**
	 * [AcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAcstCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MSBBP_SlsActListReg p) {
	}

	/**
	 * [SpplCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Tab6]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab6(MSBBP_SlsActListReg p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SlsActListReg p) {
		p.Cnd_ship_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_dt_p());
		p.Cnd_ship_dt_p_PPanel.setName("Cnd.ship_dt_p");
		p.Cnd_ship_dt_fr = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_dt_fr.addAliasName("Cnd.ship_dt_fr", p);
		p.Cnd_ship_hm_fr = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_hm_fr.addAliasName("Cnd.ship_hm_fr", p);
		p.Cnd_ship_dt_to = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_dt_to.addAliasName("Cnd.ship_dt_to", p);
		p.Cnd_ship_hm_to = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_hm_to.addAliasName("Cnd.ship_hm_to", p);
		p.Cnd_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_dt_p());
		p.Cnd_dlv_dt_p_PPanel.setName("Cnd.dlv_dt_p");
		p.Cnd_dlv_dt_fr = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_dt_fr.addAliasName("Cnd.dlv_dt_fr", p);
		p.Cnd_dlv_hm_fr = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_hm_fr.addAliasName("Cnd.dlv_hm_fr", p);
		p.Cnd_dlv_dt_to = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_dt_to.addAliasName("Cnd.dlv_dt_to", p);
		p.Cnd_dlv_hm_to = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_hm_to.addAliasName("Cnd.dlv_hm_to", p);
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
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
		p.Cnd_sno_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
		p.Cnd_acst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().acst_grp_p());
		p.Cnd_acst_grp_p_PPanel.setName("Cnd.acst_grp_p");
		p.Cnd_acst_grp_lab1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_acst_grp_lab1.addAliasName("Cnd.acst_grp_lab1", p);
		p.Cnd_acst_grp_flg1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_acst_grp_flg1.addAliasName("Cnd.acst_grp_flg1", p);
		p.Cnd_acst_grp_cd1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_acst_grp_cd1.addAliasName("Cnd.acst_grp_cd1", p);
		p.Cnd_acst_grp_nm1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_acst_grp_nm1.addAliasName("Cnd.acst_grp_nm1", p);
		p.Cnd_acst_grp_lab2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_acst_grp_lab2.addAliasName("Cnd.acst_grp_lab2", p);
		p.Cnd_acst_grp_flg2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_acst_grp_flg2.addAliasName("Cnd.acst_grp_flg2", p);
		p.Cnd_acst_grp_cd2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_acst_grp_cd2.addAliasName("Cnd.acst_grp_cd2", p);
		p.Cnd_acst_grp_nm2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_acst_grp_nm2.addAliasName("Cnd.acst_grp_nm2", p);
		p.Cnd_acst_grp_lab3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_acst_grp_lab3.addAliasName("Cnd.acst_grp_lab3", p);
		p.Cnd_acst_grp_flg3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_acst_grp_flg3.addAliasName("Cnd.acst_grp_flg3", p);
		p.Cnd_acst_grp_cd3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_acst_grp_cd3.addAliasName("Cnd.acst_grp_cd3", p);
		p.Cnd_acst_grp_nm3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_acst_grp_nm3.addAliasName("Cnd.acst_grp_nm3", p);
		p.Cnd_acst_grp_lab4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_acst_grp_lab4.addAliasName("Cnd.acst_grp_lab4", p);
		p.Cnd_acst_grp_flg4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_acst_grp_flg4.addAliasName("Cnd.acst_grp_flg4", p);
		p.Cnd_acst_grp_cd4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_acst_grp_cd4.addAliasName("Cnd.acst_grp_cd4", p);
		p.Cnd_acst_grp_nm4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_acst_grp_nm4.addAliasName("Cnd.acst_grp_nm4", p);
		p.Cnd_acst_grp_lab5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_acst_grp_lab5.addAliasName("Cnd.acst_grp_lab5", p);
		p.Cnd_acst_grp_flg5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_acst_grp_flg5.addAliasName("Cnd.acst_grp_flg5", p);
		p.Cnd_acst_grp_cd5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_acst_grp_cd5.addAliasName("Cnd.acst_grp_cd5", p);
		p.Cnd_acst_grp_nm5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_acst_grp_nm5.addAliasName("Cnd.acst_grp_nm5", p);
		p.Cnd_acst_grp_lab6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_acst_grp_lab6.addAliasName("Cnd.acst_grp_lab6", p);
		p.Cnd_acst_grp_flg6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_acst_grp_flg6.addAliasName("Cnd.acst_grp_flg6", p);
		p.Cnd_acst_grp_cd6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_acst_grp_cd6.addAliasName("Cnd.acst_grp_cd6", p);
		p.Cnd_acst_grp_nm6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_acst_grp_nm6.addAliasName("Cnd.acst_grp_nm6", p);
		p.Cnd_acst_grp_lab7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_acst_grp_lab7.addAliasName("Cnd.acst_grp_lab7", p);
		p.Cnd_acst_grp_flg7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_acst_grp_flg7.addAliasName("Cnd.acst_grp_flg7", p);
		p.Cnd_acst_grp_cd7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_acst_grp_cd7.addAliasName("Cnd.acst_grp_cd7", p);
		p.Cnd_acst_grp_nm7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_acst_grp_nm7.addAliasName("Cnd.acst_grp_nm7", p);
		p.Cnd_acst_grp_lab8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_acst_grp_lab8.addAliasName("Cnd.acst_grp_lab8", p);
		p.Cnd_acst_grp_flg8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_acst_grp_flg8.addAliasName("Cnd.acst_grp_flg8", p);
		p.Cnd_acst_grp_cd8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_acst_grp_cd8.addAliasName("Cnd.acst_grp_cd8", p);
		p.Cnd_acst_grp_nm8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_acst_grp_nm8.addAliasName("Cnd.acst_grp_nm8", p);
		p.Cnd_acst_grp_lab9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_acst_grp_lab9.addAliasName("Cnd.acst_grp_lab9", p);
		p.Cnd_acst_grp_flg9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_acst_grp_flg9.addAliasName("Cnd.acst_grp_flg9", p);
		p.Cnd_acst_grp_cd9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_acst_grp_cd9.addAliasName("Cnd.acst_grp_cd9", p);
		p.Cnd_acst_grp_nm9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_acst_grp_nm9.addAliasName("Cnd.acst_grp_nm9", p);
		p.Cnd_acst_grp_lab10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_acst_grp_lab10.addAliasName("Cnd.acst_grp_lab10", p);
		p.Cnd_acst_grp_flg10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_acst_grp_flg10.addAliasName("Cnd.acst_grp_flg10", p);
		p.Cnd_acst_grp_cd10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_acst_grp_cd10.addAliasName("Cnd.acst_grp_cd10", p);
		p.Cnd_acst_grp_nm10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_acst_grp_nm10.addAliasName("Cnd.acst_grp_nm10", p);
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
	protected static void jbCreateCtrl(MSBBP_SlsActListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_SlsActListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBBP_SlsActListReg p) {
		p.BulkSet_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getBulkSetR().ac_dt_p());
		p.BulkSet_ac_dt_p_PPanel.setName("BulkSet.ac_dt_p");
		p.BulkSet_ac_dt = p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt;
		p.BulkSet_ac_dt.addAliasName("BulkSet.ac_dt", p);
		p.BulkSet_ship_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().ship_dt_p());
		p.BulkSet_ship_dt_p_PPanel.setName("BulkSet.ship_dt_p");
		p.BulkSet_ship_dt = p.BulkSet_ship_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_ship_dt.addAliasName("BulkSet.ship_dt", p);
		p.BulkSet_ship_hm = p.BulkSet_ship_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_ship_hm.addAliasName("BulkSet.ship_hm", p);
		p.BulkSet_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().dlv_dt_p());
		p.BulkSet_dlv_dt_p_PPanel.setName("BulkSet.dlv_dt_p");
		p.BulkSet_dlv_dt = p.BulkSet_dlv_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_dlv_dt.addAliasName("BulkSet.dlv_dt", p);
		p.BulkSet_dlv_hm = p.BulkSet_dlv_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_dlv_hm.addAliasName("BulkSet.dlv_hm", p);
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_sls_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_sls_usr_cd.addAliasName("BulkSet.sls_usr_cd", p);
		p.BulkSet_sls_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_sls_usr_nm.addAliasName("BulkSet.sls_usr_nm", p);
		p.BulkSet_sls_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_sls_dpt_cd.addAliasName("BulkSet.sls_dpt_cd", p);
		p.BulkSet_sls_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_sls_dpt_nm.addAliasName("BulkSet.sls_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_SlsActListReg p) {
		p.Rslt_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ac_dt_p);
		p.Rslt_ac_dt_p_PPanel.setName("Rslt.ac_dt_p");
		p.columnRslt_ac_dt = p.Rslt_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_ac_dt.addAliasName("Rslt.ac_dt", p);
		p.Rslt_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$can_ac_dt_p);
		p.Rslt_can_ac_dt_p_PPanel.setName("Rslt.can_ac_dt_p");
		p.columnRslt_can_ac_dt_for_input = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_input;
		p.columnRslt_can_ac_dt_for_input.addAliasName("Rslt.can_ac_dt_for_input", p);
		p.columnRslt_can_ac_dt = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_call;
		p.columnRslt_can_ac_dt.addAliasName("Rslt.can_ac_dt", p);
		p.columnRslt_ac_dt_after_srch = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_ac_dt_after_srch;
		p.columnRslt_ac_dt_after_srch.addAliasName("Rslt.ac_dt_after_srch", p);
		p.Rslt_ship_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ship_tm_p);
		p.Rslt_ship_tm_p_PPanel.setName("Rslt.ship_tm_p");
		p.columnRslt_ship_dt = p.Rslt_ship_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_dt.addAliasName("Rslt.ship_dt", p);
		p.columnRslt_ship_hm = p.Rslt_ship_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_hm.addAliasName("Rslt.ship_hm", p);
		p.Rslt_dlv_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$dlv_tm_p);
		p.Rslt_dlv_tm_p_PPanel.setName("Rslt.dlv_tm_p");
		p.columnRslt_dlv_dt = p.Rslt_dlv_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_dt.addAliasName("Rslt.dlv_dt", p);
		p.columnRslt_dlv_hm = p.Rslt_dlv_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_hm.addAliasName("Rslt.dlv_hm", p);
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$cst_grp_p);
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
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_sls_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_sls_usr_cd.addAliasName("Rslt.sls_usr_cd", p);
		p.columnRslt_sls_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_sls_usr_nm.addAliasName("Rslt.sls_usr_nm", p);
		p.columnRslt_sls_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_sls_dpt_cd.addAliasName("Rslt.sls_dpt_cd", p);
		p.columnRslt_sls_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_sls_dpt_nm.addAliasName("Rslt.sls_dpt_nm", p);
		p.Rslt_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$xrate_p);
		p.Rslt_xrate_p_PPanel.setName("Rslt.xrate_p");
		p.columnRslt_xrate = p.Rslt_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_xrate.addAliasName("Rslt.xrate", p);
		p.Rslt_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ptax_xrate_p);
		p.Rslt_ptax_xrate_p_PPanel.setName("Rslt.ptax_xrate_p");
		p.columnRslt_ptax_xrate = p.Rslt_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_ptax_xrate.addAliasName("Rslt.ptax_xrate", p);
		p.Rslt_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$sppl_grp_p);
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
		p.Rslt_acst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$acst_grp_p);
		p.Rslt_acst_grp_p_PPanel.setName("Rslt.acst_grp_p");
		p.columnRslt_acst_grp_cd1 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_acst_grp_cd1.addAliasName("Rslt.acst_grp_cd1", p);
		p.columnRslt_acst_grp_nm1 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_acst_grp_nm1.addAliasName("Rslt.acst_grp_nm1", p);
		p.columnRslt_acst_grp_cd2 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_acst_grp_cd2.addAliasName("Rslt.acst_grp_cd2", p);
		p.columnRslt_acst_grp_nm2 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_acst_grp_nm2.addAliasName("Rslt.acst_grp_nm2", p);
		p.columnRslt_acst_grp_cd3 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_acst_grp_cd3.addAliasName("Rslt.acst_grp_cd3", p);
		p.columnRslt_acst_grp_nm3 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_acst_grp_nm3.addAliasName("Rslt.acst_grp_nm3", p);
		p.columnRslt_acst_grp_cd4 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_acst_grp_cd4.addAliasName("Rslt.acst_grp_cd4", p);
		p.columnRslt_acst_grp_nm4 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_acst_grp_nm4.addAliasName("Rslt.acst_grp_nm4", p);
		p.columnRslt_acst_grp_cd5 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_acst_grp_cd5.addAliasName("Rslt.acst_grp_cd5", p);
		p.columnRslt_acst_grp_nm5 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_acst_grp_nm5.addAliasName("Rslt.acst_grp_nm5", p);
		p.columnRslt_acst_grp_cd6 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_acst_grp_cd6.addAliasName("Rslt.acst_grp_cd6", p);
		p.columnRslt_acst_grp_nm6 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_acst_grp_nm6.addAliasName("Rslt.acst_grp_nm6", p);
		p.columnRslt_acst_grp_cd7 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_acst_grp_cd7.addAliasName("Rslt.acst_grp_cd7", p);
		p.columnRslt_acst_grp_nm7 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_acst_grp_nm7.addAliasName("Rslt.acst_grp_nm7", p);
		p.columnRslt_acst_grp_cd8 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_acst_grp_cd8.addAliasName("Rslt.acst_grp_cd8", p);
		p.columnRslt_acst_grp_nm8 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_acst_grp_nm8.addAliasName("Rslt.acst_grp_nm8", p);
		p.columnRslt_acst_grp_cd9 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_acst_grp_cd9.addAliasName("Rslt.acst_grp_cd9", p);
		p.columnRslt_acst_grp_nm9 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_acst_grp_nm9.addAliasName("Rslt.acst_grp_nm9", p);
		p.columnRslt_acst_grp_cd10 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_acst_grp_cd10.addAliasName("Rslt.acst_grp_cd10", p);
		p.columnRslt_acst_grp_nm10 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_acst_grp_nm10.addAliasName("Rslt.acst_grp_nm10", p);
		p.Rslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$dlv_p);
		p.Rslt_dlv_p_PPanel.setName("Rslt.dlv_p");
		p.columnRslt_dlv_cd = p.Rslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_dlv_cd.addAliasName("Rslt.dlv_cd", p);
		p.columnRslt_dlv_nm = p.Rslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_dlv_nm.addAliasName("Rslt.dlv_nm", p);
		p.columnRslt_dlv_zip_cd = p.Rslt_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnRslt_dlv_zip_cd.addAliasName("Rslt.dlv_zip_cd", p);
		p.columnRslt_dlv_addr1 = p.Rslt_dlv_p_PPanel.columnDlv_addr1;
		p.columnRslt_dlv_addr1.addAliasName("Rslt.dlv_addr1", p);
		p.columnRslt_dlv_addr2 = p.Rslt_dlv_p_PPanel.columnDlv_addr2;
		p.columnRslt_dlv_addr2.addAliasName("Rslt.dlv_addr2", p);
		p.columnRslt_dlv_addr3 = p.Rslt_dlv_p_PPanel.columnDlv_addr3;
		p.columnRslt_dlv_addr3.addAliasName("Rslt.dlv_addr3", p);
		p.columnRslt_dlv_addr4 = p.Rslt_dlv_p_PPanel.columnDlv_addr4;
		p.columnRslt_dlv_addr4.addAliasName("Rslt.dlv_addr4", p);
		p.columnRslt_dlv_cntct_dpt = p.Rslt_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt_dlv_cntct_dpt.addAliasName("Rslt.dlv_cntct_dpt", p);
		p.columnRslt_dlv_cntct_psn = p.Rslt_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt_dlv_cntct_psn.addAliasName("Rslt.dlv_cntct_psn", p);
		p.columnRslt_dlv_tel = p.Rslt_dlv_p_PPanel.columnDlv_tel;
		p.columnRslt_dlv_tel.addAliasName("Rslt.dlv_tel", p);
		p.columnRslt_dlv_fax = p.Rslt_dlv_p_PPanel.columnDlv_fax;
		p.columnRslt_dlv_fax.addAliasName("Rslt.dlv_fax", p);
		p.columnRslt_pri_prnt_flg = p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_pri_prnt_flg.addAliasName("Rslt.pri_prnt_flg", p);
		p.columnRslt_cntry_cd = p.Rslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_cntry_cd.addAliasName("Rslt.cntry_cd", p);
		p.columnRslt_cntry_nm = p.Rslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_cntry_nm.addAliasName("Rslt.cntry_nm", p);
		p.columnRslt_dlv_sundry_flg = p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_dlv_sundry_flg.addAliasName("Rslt.dlv_sundry_flg", p);
		p.columnRslt_lg_grp_cd = p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt_lg_grp_cd.addAliasName("Rslt.lg_grp_cd", p);
		p.columnRslt_lg_grp_nm = p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt_lg_grp_nm.addAliasName("Rslt.lg_grp_nm", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$dlv_grp_p);
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
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$itm_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$itm_grp_p);
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
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_sls_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$sls_schd_qty_p);
		p.Rslt_sls_schd_qty_p_PPanel.setName("Rslt.sls_schd_qty_p");
		p.columnRslt_sls_schd_qty = p.Rslt_sls_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_sls_schd_qty.addAliasName("Rslt.sls_schd_qty", p);
		p.Rslt_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$abort_qty_p);
		p.Rslt_abort_qty_p_PPanel.setName("Rslt.abort_qty_p");
		p.columnRslt_abort_qty = p.Rslt_abort_qty_p_PPanel.columnQty_qty;
		p.columnRslt_abort_qty.addAliasName("Rslt.abort_qty", p);
		p.Rslt_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$sls_qty_p);
		p.Rslt_sls_qty_p_PPanel.setName("Rslt.sls_qty_p");
		p.columnRslt_sls_qty = p.Rslt_sls_qty_p_PPanel.columnQty_qty;
		p.columnRslt_sls_qty.addAliasName("Rslt.sls_qty", p);
		p.Rslt_trd_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$trd_upri_amt_p);
		p.Rslt_trd_upri_amt_p_PPanel.setName("Rslt.trd_upri_amt_p");
		p.columnRslt_upri_not_tgt_flg = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnRslt_upri_not_tgt_flg.addAliasName("Rslt.upri_not_tgt_flg", p);
		p.columnRslt_trd_cur_upri = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.columnRslt_interim_flg = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnRslt_interim_flg.addAliasName("Rslt.interim_flg", p);
		p.columnRslt_trd_cur_amt = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.columnRslt_tax_fix_flg = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnRslt_tax_fix_flg.addAliasName("Rslt.tax_fix_flg", p);
		p.columnRslt_tax_cd = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnRslt_tax_cd.addAliasName("Rslt.tax_cd", p);
		p.columnRslt_tax_nm = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnRslt_tax_nm.addAliasName("Rslt.tax_nm", p);
		p.columnRslt_tax_rate = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnRslt_tax_rate.addAliasName("Rslt.tax_rate", p);
		p.columnRslt_tax_typ = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnRslt_tax_typ.addAliasName("Rslt.tax_typ", p);
		p.columnRslt_inc_tax_flg = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnRslt_inc_tax_flg.addAliasName("Rslt.inc_tax_flg", p);
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.columnRslt_dscnt_rsn_cd = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnRslt_dscnt_rsn_cd.addAliasName("Rslt.dscnt_rsn_cd", p);
		p.columnRslt_dscnt_rsn_nm = p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnRslt_dscnt_rsn_nm.addAliasName("Rslt.dscnt_rsn_nm", p);
		p.Rslt_cost_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$cost_upri_p);
		p.Rslt_cost_upri_p_PPanel.setName("Rslt.cost_upri_p");
		p.columnRslt_cost_upri = p.Rslt_cost_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_cost_upri.addAliasName("Rslt.cost_upri", p);
		p.Rslt_cost_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$cost_amt_p);
		p.Rslt_cost_amt_p_PPanel.setName("Rslt.cost_amt_p");
		p.columnRslt_cost_amt = p.Rslt_cost_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_cost_amt.addAliasName("Rslt.cost_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$base_cur_inc_tax_amt_p);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.setName("Rslt.base_cur_inc_tax_amt_p");
		p.columnRslt_base_cur_inc_tax_amt = p.Rslt_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_inc_tax_amt.addAliasName("Rslt.base_cur_inc_tax_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ptax_cur_upri_p);
		p.Rslt_ptax_cur_upri_p_PPanel.setName("Rslt.ptax_cur_upri_p");
		p.columnRslt_ptax_cur_upri = p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_upri.addAliasName("Rslt.ptax_cur_upri", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ptax_cur_tax_amt_p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.setName("Rslt.ptax_cur_tax_amt_p");
		p.columnRslt_ptax_cur_tax_amt = p.Rslt_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_tax_amt.addAliasName("Rslt.ptax_cur_tax_amt", p);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ptax_cur_inc_tax_amt_p);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.setName("Rslt.ptax_cur_inc_tax_amt_p");
		p.columnRslt_ptax_cur_inc_tax_amt = p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_inc_tax_amt.addAliasName("Rslt.ptax_cur_inc_tax_amt", p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$ptax_cur_dscnt_amt_p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.setName("Rslt.ptax_cur_dscnt_amt_p");
		p.columnRslt_ptax_cur_dscnt_amt = p.Rslt_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_dscnt_amt.addAliasName("Rslt.ptax_cur_dscnt_amt", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP1320.RsltR.$rts_msg_p);
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
	protected static void jbCreateBtn(MSBBP_SlsActListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_SlsActListReg p) {
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

	
	/** [Cnd_sls_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_usr_cd_p = null;

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_usr_cd_ListPutter() {
		if (Cnd_sls_usr_cd_p == null) {
			Cnd_sls_usr_cd_p = createCnd_sls_usr_cd_ListPutter(Cnd_sls_usr_cd, "sls_usr_cd", "sls_usr_nm");

		}
		return Cnd_sls_usr_cd_p;
	}
	
	
	/** [Cnd_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_dpt_cd_p = null;

	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_dpt_cd_ListPutter() {
		if (Cnd_sls_dpt_cd_p == null) {
			Cnd_sls_dpt_cd_p = createCnd_sls_dpt_cd_ListPutter(Cnd_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Cnd_sls_dpt_cd_p;
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
	
	
	/** [Cnd_dest_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd1_p = null;

	/**
	 * [Cnd_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd1_ListPutter() {
		if (Cnd_dest_cd1_p == null) {
			Cnd_dest_cd1_p = createCnd_dest_cd1_ListPutter(Cnd_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Cnd_dest_cd1_p;
	}
	
	
	/** [Cnd_dest_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd2_p = null;

	/**
	 * [Cnd_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd2_ListPutter() {
		if (Cnd_dest_cd2_p == null) {
			Cnd_dest_cd2_p = createCnd_dest_cd2_ListPutter(Cnd_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Cnd_dest_cd2_p;
	}
	
	
	/** [Cnd_dest_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd3_p = null;

	/**
	 * [Cnd_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd3_ListPutter() {
		if (Cnd_dest_cd3_p == null) {
			Cnd_dest_cd3_p = createCnd_dest_cd3_ListPutter(Cnd_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Cnd_dest_cd3_p;
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
	
	
	/** [Cnd_ship_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_lg_grp_cd_p = null;

	/**
	 * [Cnd_ship_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_lg_grp_cd_ListPutter() {
		if (Cnd_ship_lg_grp_cd_p == null) {
			Cnd_ship_lg_grp_cd_p = createCnd_ship_lg_grp_cd_ListPutter(Cnd_ship_lg_grp_cd, "ship_lg_grp_cd", "ship_lg_grp_nm");

		}
		return Cnd_ship_lg_grp_cd_p;
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
	
	
	/** [Cnd_trd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cd_p = null;

	/**
	 * [Cnd_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cd_ListPutter() {
		if (Cnd_trd_cd_p == null) {
			Cnd_trd_cd_p = createCnd_trd_cd_ListPutter(Cnd_trd_cd, "trd_cd", "trd_nm");

		}
		return Cnd_trd_cd_p;
	}
	
	
	/** [Cnd_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_lot_no_p = null;

	/**
	 * [Cnd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_no_ListPutter() {
		if (Cnd_lot_no_p == null) {
			Cnd_lot_no_p = createCnd_lot_no_ListPutter(Cnd_lot_no, "lot_no");

		}
		return Cnd_lot_no_p;
	}
	
	
	/** [Cnd_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_sublot_no_p = null;

	/**
	 * [Cnd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sublot_no_ListPutter() {
		if (Cnd_sublot_no_p == null) {
			Cnd_sublot_no_p = createCnd_sublot_no_ListPutter(Cnd_sublot_no, "sublot_no");

		}
		return Cnd_sublot_no_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "sls_dpt_cd", "sls_dpt_nm","wg_cd","wg_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ar_dpt_cd_p = null;

	/**
	 * [Rslt_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ar_dpt_cd_ListPutter() {
		if (Rslt_ar_dpt_cd_p == null) {
			Rslt_ar_dpt_cd_p = createRslt_ar_dpt_cd_ListPutter(columnRslt_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Rslt_ar_dpt_cd_p;
	}
	
	
	/** [Rslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p = createRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Rslt_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no");
		}
		return Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p = createRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Rslt_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no");
		}
		return Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [Rslt_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_unit_cd_p = null;

	/**
	 * [Rslt_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_unit_cd_ListPutter() {
		if (Rslt_trd_unit_cd_p == null) {
			Rslt_trd_unit_cd_p = createRslt_trd_unit_cd_ListPutter(columnRslt_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Rslt_trd_unit_cd_p;
	}
	
	
	/** [Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","inc_tax_flg","tax_typ");
		}
		return Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Rslt_sls_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_sls_rsn_cd_p = null;

	/**
	 * [Rslt_sls_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sls_rsn_cd_ListPutter() {
		if (Rslt_sls_rsn_cd_p == null) {
			Rslt_sls_rsn_cd_p = createRslt_sls_rsn_cd_ListPutter(columnRslt_sls_rsn_cd, "sls_rsn_cd", "sls_rsn_nm","sls_acxfr_flg");

		}
		return Rslt_sls_rsn_cd_p;
	}
	
	
	/** [Rslt_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_bd_dpt_cd_p = null;

	/**
	 * [Rslt_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bd_dpt_cd_ListPutter() {
		if (Rslt_bd_dpt_cd_p == null) {
			Rslt_bd_dpt_cd_p = createRslt_bd_dpt_cd_ListPutter(columnRslt_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Rslt_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsActListReg create(){
		MSBBP_SlsActListReg p = new MSBBP_SlsActListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsActListReg create(String name){
		MSBBP_SlsActListReg p = new MSBBP_SlsActListReg(name);
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
		MSBBP_SlsActListReg_MC.jbfInitScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitSrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTop((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitFold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitOpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitCstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitEdi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitCstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitDlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitAcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitSpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitTab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitCtrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitRPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitBulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitRslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitBtn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbfInitEastBtn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitSrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTop((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitFold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitOpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitCstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitEdi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitCstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitDlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitAcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitSpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitTab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitCtrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitRPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitBulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitRslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitBtn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.jbInitEastBtn((MSBBP_SlsActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_SlsActListReg p) {
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
	protected static void jbfInitTab1(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [OpeTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOpeTyp(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.OpeTypPanel = p.beansFactory.createPanel("OpeTyp");
		p.OpeTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [CstIv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstIv(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CstIvPanel = p.beansFactory.createPanel("CstIv");
		p.CstIvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [AcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAcstCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.AcstCndPanel = p.beansFactory.createPanel("AcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.SpplCndPanel = p.beansFactory.createPanel("SpplCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab6]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab6(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab6Panel = p.beansFactory.createPanel("Tab6");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_mode_Group = p.beansFactory.createButtonGroup("Cnd.mode");
		p.Cnd_mode_DTL = p.beansFactory.createRadioButton("Cnd.mode_DTL");
		p.Cnd_mode_HDR = p.beansFactory.createRadioButton("Cnd.mode_HDR");
		p.Cnd_arrv_base_sls_flg = p.beansFactory.createCheckBox("Cnd.arrv_base_sls_flg");
		p.Cnd_arrv_sls_flg = p.beansFactory.createCheckBox("Cnd.arrv_sls_flg");
		p.Cnd_sls_cststk_flg = p.beansFactory.createCheckBox("Cnd.sls_cststk_flg");
		p.Cnd_sls_ddlv_flg = p.beansFactory.createCheckBox("Cnd.sls_ddlv_flg");
		p.Cnd_not_ship_ord_sls_flg = p.beansFactory.createCheckBox("Cnd.not_ship_ord_sls_flg");
		p.Cnd_non_schd_flg = p.beansFactory.createCheckBox("Cnd.non_schd_flg");
		p.Cnd_ship_ord_sls_flg = p.beansFactory.createCheckBox("Cnd.ship_ord_sls_flg");
		p.Cnd_iv_flg = p.beansFactory.createCheckBox("Cnd.iv_flg");
		p.Cnd_not_iv_flg = p.beansFactory.createCheckBox("Cnd.not_iv_flg");
		p.Cnd_edi_flg = p.beansFactory.createCheckBox("Cnd.edi_flg");
		p.Cnd_not_edi_flg = p.beansFactory.createCheckBox("Cnd.not_edi_flg");
		p.Cnd_sls_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.sls_schd_dt_fr_Label");
		p.Cnd_sls_schd_dt_fr = p.beansFactory.createDateField("Cnd.sls_schd_dt_fr");
		p.Cnd_sls_schd_dt_fr.setLabel(p.Cnd_sls_schd_dt_fr_Label);
		p.Cnd_sls_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.sls_schd_dt_to_Label");
		p.Cnd_sls_schd_dt_to = p.beansFactory.createDateField("Cnd.sls_schd_dt_to");
		p.Cnd_sls_schd_dt_to.setLabel(p.Cnd_sls_schd_dt_to_Label);
		p.Cnd_sls_dt_fr_Label = p.beansFactory.createLabel("Cnd.sls_dt_fr_Label");
		p.Cnd_sls_dt_fr = p.beansFactory.createDateField("Cnd.sls_dt_fr");
		p.Cnd_sls_dt_fr.setLabel(p.Cnd_sls_dt_fr_Label);
		p.Cnd_sls_dt_to_Label = p.beansFactory.createLabel("Cnd.sls_dt_to_Label");
		p.Cnd_sls_dt_to = p.beansFactory.createDateField("Cnd.sls_dt_to");
		p.Cnd_sls_dt_to.setLabel(p.Cnd_sls_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextField("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_dest_cd1_Label = p.beansFactory.createLabel("Cnd.dest_cd1_Label");
		p.Cnd_dest_cd1 = p.beansFactory.createTextField("Cnd.dest_cd1");
		p.Cnd_dest_cd1.setLabel(p.Cnd_dest_cd1_Label);
		p.Cnd_dest_nm1 = p.beansFactory.createTextField("Cnd.dest_nm1");
		p.Cnd_dest_cd2_Label = p.beansFactory.createLabel("Cnd.dest_cd2_Label");
		p.Cnd_dest_cd2 = p.beansFactory.createTextField("Cnd.dest_cd2");
		p.Cnd_dest_cd2.setLabel(p.Cnd_dest_cd2_Label);
		p.Cnd_dest_nm2 = p.beansFactory.createTextField("Cnd.dest_nm2");
		p.Cnd_dest_cd3_Label = p.beansFactory.createLabel("Cnd.dest_cd3_Label");
		p.Cnd_dest_cd3 = p.beansFactory.createTextField("Cnd.dest_cd3");
		p.Cnd_dest_cd3.setLabel(p.Cnd_dest_cd3_Label);
		p.Cnd_dest_nm3 = p.beansFactory.createTextField("Cnd.dest_nm3");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_ship_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_lg_grp_cd_Label");
		p.Cnd_ship_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_lg_grp_cd");
		p.Cnd_ship_lg_grp_cd.setLabel(p.Cnd_ship_lg_grp_cd_Label);
		p.Cnd_ship_lg_grp_nm = p.beansFactory.createTextField("Cnd.ship_lg_grp_nm");
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_ship_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.ship_dlv_slip_no_Label");
		p.Cnd_ship_dlv_slip_no = p.beansFactory.createTextField("Cnd.ship_dlv_slip_no");
		p.Cnd_ship_dlv_slip_no.setLabel(p.Cnd_ship_dlv_slip_no_Label);
		p.Cnd_purc_ddlv_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.purc_ddlv_dlv_slip_no_Label");
		p.Cnd_purc_ddlv_dlv_slip_no = p.beansFactory.createTextField("Cnd.purc_ddlv_dlv_slip_no");
		p.Cnd_purc_ddlv_dlv_slip_no.setLabel(p.Cnd_purc_ddlv_dlv_slip_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_ship_act_no_Label = p.beansFactory.createLabel("Cnd.ship_act_no_Label");
		p.Cnd_ship_act_no = p.beansFactory.createTextField("Cnd.ship_act_no");
		p.Cnd_ship_act_no.setLabel(p.Cnd_ship_act_no_Label);
		p.Cnd_sls_act_no_Label = p.beansFactory.createLabel("Cnd.sls_act_no_Label");
		p.Cnd_sls_act_no = p.beansFactory.createTextField("Cnd.sls_act_no");
		p.Cnd_sls_act_no.setLabel(p.Cnd_sls_act_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_ext_purc_act_d_no_Label = p.beansFactory.createLabel("Cnd.ext_purc_act_d_no_Label");
		p.Cnd_ext_purc_act_d_no = p.beansFactory.createTextField("Cnd.ext_purc_act_d_no");
		p.Cnd_ext_purc_act_d_no.setLabel(p.Cnd_ext_purc_act_d_no_Label);
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_d_rmrks_Label");
		p.Cnd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.intr_d_rmrks");
		p.Cnd_intr_d_rmrks.setLabel(p.Cnd_intr_d_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_dtl_sub_char1_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char1_Label");
		p.Cnd_dtl_sub_char1 = p.beansFactory.createTextField("Cnd.dtl_sub_char1");
		p.Cnd_dtl_sub_char1.setLabel(p.Cnd_dtl_sub_char1_Label);
		p.Cnd_dtl_sub_char2_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char2_Label");
		p.Cnd_dtl_sub_char2 = p.beansFactory.createTextField("Cnd.dtl_sub_char2");
		p.Cnd_dtl_sub_char2.setLabel(p.Cnd_dtl_sub_char2_Label);
		p.Cnd_dtl_sub_char3_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char3_Label");
		p.Cnd_dtl_sub_char3 = p.beansFactory.createTextField("Cnd.dtl_sub_char3");
		p.Cnd_dtl_sub_char3.setLabel(p.Cnd_dtl_sub_char3_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_sls_dt_Label = p.beansFactory.createLabel("BulkSet.sls_dt_Label");
		p.BulkSet_sls_dt = p.beansFactory.createDateField("BulkSet.sls_dt");
		p.BulkSet_sls_dt.setLabel(p.BulkSet_sls_dt_Label);
		p.BulkSet_bill_basis_dt_Label = p.beansFactory.createLabel("BulkSet.bill_basis_dt_Label");
		p.BulkSet_bill_basis_dt = p.beansFactory.createDateField("BulkSet.bill_basis_dt");
		p.BulkSet_bill_basis_dt.setLabel(p.BulkSet_bill_basis_dt_Label);
		p.BulkSet_rcv_schd_dt_Label = p.beansFactory.createLabel("BulkSet.rcv_schd_dt_Label");
		p.BulkSet_rcv_schd_dt = p.beansFactory.createDateField("BulkSet.rcv_schd_dt");
		p.BulkSet_rcv_schd_dt.setLabel(p.BulkSet_rcv_schd_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_sync_flg = p.beansFactory.createTableColumn("Rslt.sync_flg", MCColumnType.CHECK);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_sls_tgt_typ = p.beansFactory.createTableColumn("Rslt.sls_tgt_typ", MCColumnType.TEXT);
		p.columnRslt_sls_tgt_typ_nm = p.beansFactory.createTableColumn("Rslt.sls_tgt_typ_nm", MCColumnType.TEXT);
		p.columnRslt_edi_flg = p.beansFactory.createTableColumn("Rslt.edi_flg", MCColumnType.CHECK);
		p.columnRslt_sls_schd_dt = p.beansFactory.createTableColumn("Rslt.sls_schd_dt", MCColumnType.DATE);
		p.columnRslt_sls_dt = p.beansFactory.createTableColumn("Rslt.sls_dt", MCColumnType.DATE);
		p.columnRslt_bill_basis_dt = p.beansFactory.createTableColumn("Rslt.bill_basis_dt", MCColumnType.DATE);
		p.columnRslt_rcv_schd_dt = p.beansFactory.createTableColumn("Rslt.rcv_schd_dt", MCColumnType.DATE);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnRslt_purc_ddlv_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_purc_ddlv_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_iv_d_no = p.beansFactory.createTableColumn("Rslt.iv_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_act_no = p.beansFactory.createTableColumn("Rslt.ship_act_no", MCColumnType.TEXT);
		p.columnRslt_dlv_ac_ym = p.beansFactory.createTableColumn("Rslt.dlv_ac_ym", MCColumnType.DATE);
		p.columnRslt_dlv_ac_dt = p.beansFactory.createTableColumn("Rslt.dlv_ac_dt", MCColumnType.DATE);
		p.columnRslt_sls_act_no = p.beansFactory.createTableColumn("Rslt.sls_act_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_rev = p.beansFactory.createTableColumn("Rslt.sls_act_rev", MCColumnType.NUMBER);
		p.columnRslt_sls_act_d_no = p.beansFactory.createTableColumn("Rslt.sls_act_d_no", MCColumnType.TEXT);
		p.columnRslt_sls_basis_ym = p.beansFactory.createTableColumn("Rslt.sls_basis_ym", MCColumnType.DATE);
		p.columnRslt_sls_basis_dt = p.beansFactory.createTableColumn("Rslt.sls_basis_dt", MCColumnType.DATE);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_qtn_no = p.beansFactory.createTableColumn("Rslt.qtn_no", MCColumnType.TEXT);
		p.columnRslt_qtn_rev = p.beansFactory.createTableColumn("Rslt.qtn_rev", MCColumnType.NUMBER);
		p.columnRslt_qtn_d_no = p.beansFactory.createTableColumn("Rslt.qtn_d_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_acst_cd = p.beansFactory.createTableColumn("Rslt.acst_cd", MCColumnType.TEXT);
		p.columnRslt_acst_nm = p.beansFactory.createTableColumn("Rslt.acst_nm", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_nm = p.beansFactory.createTableColumn("Rslt.ar_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_dest_cd1 = p.beansFactory.createTableColumn("Rslt.dest_cd1", MCColumnType.TEXT);
		p.columnRslt_dest_nm1 = p.beansFactory.createTableColumn("Rslt.dest_nm1", MCColumnType.TEXT);
		p.columnRslt_dest_cd2 = p.beansFactory.createTableColumn("Rslt.dest_cd2", MCColumnType.TEXT);
		p.columnRslt_dest_nm2 = p.beansFactory.createTableColumn("Rslt.dest_nm2", MCColumnType.TEXT);
		p.columnRslt_dest_cd3 = p.beansFactory.createTableColumn("Rslt.dest_cd3", MCColumnType.TEXT);
		p.columnRslt_dest_nm3 = p.beansFactory.createTableColumn("Rslt.dest_nm3", MCColumnType.TEXT);
		p.columnRslt_ship_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_lot_no_typ = p.beansFactory.createTableColumn("Rslt.lot_no_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_no_typ = p.beansFactory.createTableColumn("Rslt.sublot_no_typ", MCColumnType.TEXT);
		p.columnRslt_not_lot_mix_flg = p.beansFactory.createTableColumn("Rslt.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_not_sublot_mix_flg = p.beansFactory.createTableColumn("Rslt.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_ship_fr_valid_dt = p.beansFactory.createTableColumn("Rslt.ship_fr_valid_dt", MCColumnType.DATE);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_multi_io_flg = p.beansFactory.createTableColumn("Rslt.multi_io_flg", MCColumnType.CHECK);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_sls_dtl_upd_flg = p.beansFactory.createTableColumn("Rslt.sls_dtl_upd_flg", MCColumnType.CHECK);
		p.columnRslt_prof_rate = p.beansFactory.createTableColumn("Rslt.prof_rate", MCColumnType.NUMBER);
		p.columnRslt_bill_crryovr_times = p.beansFactory.createTableColumn("Rslt.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_cst_po_d_no = p.beansFactory.createTableColumn("Rslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnRslt_sls_rsn_cd = p.beansFactory.createTableColumn("Rslt.sls_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_sls_rsn_nm = p.beansFactory.createTableColumn("Rslt.sls_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_sls_acxfr_flg = p.beansFactory.createTableColumn("Rslt.sls_acxfr_flg", MCColumnType.CHECK);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_wtax_amt = p.beansFactory.createTableColumn("Rslt.wtax_amt", MCColumnType.NUMBER);
		p.columnRslt_bp_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_flg = p.beansFactory.createTableColumn("Rslt.mrkt_judg_flg", MCColumnType.CHECK);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_purc_act_d_no = p.beansFactory.createTableColumn("Rslt.ext_purc_act_d_no", MCColumnType.TEXT);
		p.columnRslt_ptax_dt = p.beansFactory.createTableColumn("Rslt.ptax_dt", MCColumnType.DATE);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char1 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char1", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char2 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char2", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char3 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char3", MCColumnType.TEXT);
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
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_bp_sls_upri_cng_flg = p.beansFactory.createTableColumn("Rslt.bp_sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnRslt_itm_sls_upri_cng_flg = p.beansFactory.createTableColumn("Rslt.itm_sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnRslt_dscnt_itm_flg = p.beansFactory.createTableColumn("Rslt.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnRslt_sls_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.sls_amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_sls_upri_rnd_typ = p.beansFactory.createTableColumn("Rslt.sls_upri_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_sls_tax_rnd_typ = p.beansFactory.createTableColumn("Rslt.sls_tax_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_xrate_rnd_typ = p.beansFactory.createTableColumn("Rslt.xrate_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_wtax_rnd_typ = p.beansFactory.createTableColumn("Rslt.wtax_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_purc_schd_no = p.beansFactory.createTableColumn("Rslt.purc_schd_no", MCColumnType.TEXT);
		p.columnRslt_cst_iv_flg = p.beansFactory.createTableColumn("Rslt.cst_iv_flg", MCColumnType.CHECK);
		p.columnRslt_org_trd_cur_upri = p.beansFactory.createTableColumn("Rslt.org_trd_cur_upri", MCColumnType.NUMBER);
		p.columnRslt_sls_schd_no = p.beansFactory.createTableColumn("Rslt.sls_schd_no", MCColumnType.TEXT);
		p.columnRslt_prnt_out_flg = p.beansFactory.createTableColumn("Rslt.prnt_out_flg", MCColumnType.CHECK);
		p.columnRslt_sls_act_seq = p.beansFactory.createTableColumn("Rslt.sls_act_seq", MCColumnType.NUMBER);
		p.columnRslt_sls_act_d_seq = p.beansFactory.createTableColumn("Rslt.sls_act_d_seq", MCColumnType.NUMBER);
		p.columnRslt_schd_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.schd_trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_schd_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.schd_trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_ship_pr_upd_cntr = p.beansFactory.createTableColumn("Rslt.ship_pr_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_base_unit_qty_bef = p.beansFactory.createTableColumn("Rslt.base_unit_qty_bef", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_open_MSBBP1330 = p.beansFactory.createButton("Btn.open_MSBBP1330", "open");
		p.Btn_open_MSBBP1340 = p.beansFactory.createButton("Btn.open_MSBBP1340", "open");
		p.Btn_open_MSBBP1380 = p.beansFactory.createButton("Btn.open_MSBBP1380", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_prnt_out_flg = p.beansFactory.createCheckBox("Btn.prnt_out_flg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.SrchModePanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.TopPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_SlsActListReg p) {
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
	protected static void jbInitFold(MSBBP_SlsActListReg p) {
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
		p.FoldTab.add(p.Tab4Panel, "Fold.tab4");
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.FoldTab.add(p.Tab5Panel, "Fold.tab5");
		p.Tab5Panel.setNextBeans(p.Tab6Panel);
		p.FoldTab.add(p.Tab6Panel, "Fold.tab6");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.OpeTypPanel, null);
		p.Tab1Panel.setLastBeans(p.OpeTypPanel);
		p.OpeTypPanel.setNextBeans(p.CstIvPanel);
		p.Tab1Panel.add(p.CstIvPanel, null);
		p.CstIvPanel.setNextBeans(p.EdiPanel);
		p.Tab1Panel.add(p.EdiPanel, null);
		p.EdiPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [OpeTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOpeTyp(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.OpeTypPanel.setBorder(p.OpeTypTitledBorder);
		p.OpeTypPanel.setValueCheck(false);
		p.OpeTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OpeTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [CstIv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstIv(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CstIvPanel.setBorder(p.CstIvTitledBorder);
		p.CstIvPanel.setValueCheck(false);
		p.CstIvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstIvPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.CstCndPanel, null);
		p.Tab2Panel.setLastBeans(p.CstCndPanel);
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DlvCndPanel, null);
		p.Tab3Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.AcstCndPanel, null);
		p.Tab4Panel.setLastBeans(p.AcstCndPanel);
	}

	/**
	 * [AcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAcstCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.AcstCndPanel.setValueCheck(false);
		p.AcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab5Panel.setNextBeans(p.Tab6Panel);
		p.Tab5Panel.setValueCheck(false);
		p.Tab5Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab5Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab5Panel.add(p.SpplCndPanel, null);
		p.Tab5Panel.setLastBeans(p.SpplCndPanel);
	}

	/**
	 * [SpplCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.SpplCndPanel.setValueCheck(false);
		p.SpplCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab6]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab6(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.Tab6Panel.setValueCheck(false);
		p.Tab6Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab6Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab6Panel.add(p.ItmCndPanel, null);
		p.Tab6Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("INS");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("UPD");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("DEL");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ope_META);
		p.SrchModePanel.setLastBeans(p.Cnd_mode_Group);
		p.Cnd_mode_Group.setFirstBeans(p.Cnd_mode_DTL);
		p.Cnd_mode_DTL.setActionCommand("DTL");
		p.Cnd_mode_Group.add(p.Cnd_mode_DTL);
		p.SrchModePanel.add(p.Cnd_mode_DTL);
		p.Cnd_mode_DTL.setNextBeans(p.Cnd_mode_HDR);
		p.Cnd_mode_HDR.setActionCommand("HDR");
		p.Cnd_mode_Group.add(p.Cnd_mode_HDR);
		p.SrchModePanel.add(p.Cnd_mode_HDR);
		p.Cnd_mode_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.mode_META);
		p.OpeTypPanel.add(p.Cnd_arrv_base_sls_flg);
		p.OpeTypPanel.setLastBeans(p.Cnd_arrv_base_sls_flg);
		p.Cnd_arrv_base_sls_flg.setNextBeans(p.Cnd_arrv_sls_flg);
		p.Cnd_arrv_base_sls_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.arrv_base_sls_flg_META);
		p.OpeTypPanel.add(p.Cnd_arrv_sls_flg);
		p.Cnd_arrv_sls_flg.setNextBeans(p.Cnd_sls_cststk_flg);
		p.Cnd_arrv_sls_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.arrv_sls_flg_META);
		p.OpeTypPanel.add(p.Cnd_sls_cststk_flg);
		p.Cnd_sls_cststk_flg.setNextBeans(p.Cnd_sls_ddlv_flg);
		p.Cnd_sls_cststk_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_cststk_flg_META);
		p.OpeTypPanel.add(p.Cnd_sls_ddlv_flg);
		p.Cnd_sls_ddlv_flg.setNextBeans(p.Cnd_not_ship_ord_sls_flg);
		p.Cnd_sls_ddlv_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_ddlv_flg_META);
		p.OpeTypPanel.add(p.Cnd_not_ship_ord_sls_flg);
		p.Cnd_not_ship_ord_sls_flg.setNextBeans(p.Cnd_non_schd_flg);
		p.Cnd_not_ship_ord_sls_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.not_ship_ord_sls_flg_META);
		p.OpeTypPanel.add(p.Cnd_non_schd_flg);
		p.Cnd_non_schd_flg.setNextBeans(p.Cnd_ship_ord_sls_flg);
		p.Cnd_non_schd_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.non_schd_flg_META);
		p.OpeTypPanel.add(p.Cnd_ship_ord_sls_flg);
		p.Cnd_ship_ord_sls_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ship_ord_sls_flg_META);
		p.CstIvPanel.add(p.Cnd_iv_flg);
		p.CstIvPanel.setLastBeans(p.Cnd_iv_flg);
		p.Cnd_iv_flg.setNextBeans(p.Cnd_not_iv_flg);
		p.Cnd_iv_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.iv_flg_META);
		p.CstIvPanel.add(p.Cnd_not_iv_flg);
		p.Cnd_not_iv_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.not_iv_flg_META);
		p.EdiPanel.add(p.Cnd_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_edi_flg);
		p.Cnd_edi_flg.setNextBeans(p.Cnd_not_edi_flg);
		p.Cnd_edi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.edi_flg_META);
		p.EdiPanel.add(p.Cnd_not_edi_flg);
		p.Cnd_not_edi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.not_edi_flg_META);
		p.CndPanel.add(p.Cnd_sls_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_sls_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_sls_schd_dt_fr);
		p.Cnd_sls_schd_dt_fr.setNextBeans(p.Cnd_sls_schd_dt_to);
		p.Cnd_sls_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_schd_dt_fr_META);
		p.Cnd_sls_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_sls_schd_dt_to);
		p.Cnd_sls_schd_dt_to.setNextBeans(p.Cnd_sls_dt_fr);
		p.Cnd_sls_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_schd_dt_to_META);
		p.Cnd_sls_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_dt_fr_Label);
		p.CndPanel.add(p.Cnd_sls_dt_fr);
		p.Cnd_sls_dt_fr.setNextBeans(p.Cnd_sls_dt_to);
		p.Cnd_sls_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_dt_fr_META);
		p.Cnd_sls_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_dt_to_Label);
		p.CndPanel.add(p.Cnd_sls_dt_to);
		p.Cnd_sls_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_sls_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_dt_to_META);
		p.Cnd_sls_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_ship_dt_p_PPanel);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ship_dt_p_PPanel);
		p.Cnd_ship_dt_p_PPanel.setNextBeans(p.Cnd_dlv_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_dt_p_PPanel);
		p.Cnd_dlv_dt_p_PPanel.setNextBeans(p.Cnd_sls_usr_cd);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_ship_lg_grp_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_ship_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_lg_grp_cd, true);
		p.Cnd_ship_lg_grp_cd.setLinkBeans(p.Cnd_ship_lg_grp_nm);
		p.CndPanel.add(p.Cnd_ship_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_lg_grp_cd);
		p.Cnd_ship_lg_grp_cd.setNextBeans(p.Cnd_ship_lg_grp_nm);
		p.Cnd_ship_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ship_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_lg_grp_nm);
		p.Cnd_ship_lg_grp_nm.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_ship_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ship_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_ship_dlv_slip_no);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_ship_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_ship_dlv_slip_no);
		p.Cnd_ship_dlv_slip_no.setNextBeans(p.Cnd_purc_ddlv_dlv_slip_no);
		p.Cnd_ship_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ship_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_ship_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_purc_ddlv_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_purc_ddlv_dlv_slip_no);
		p.Cnd_purc_ddlv_dlv_slip_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_purc_ddlv_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.purc_ddlv_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ddlv_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_ship_act_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_ship_act_no_Label);
		p.CndPanel.add(p.Cnd_ship_act_no);
		p.Cnd_ship_act_no.setNextBeans(p.Cnd_sls_act_no);
		p.Cnd_ship_act_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ship_act_no_META);
		p.setPluralValueEnable(p.Cnd_ship_act_no, true);
		p.CndPanel.add(p.Cnd_sls_act_no_Label);
		p.CndPanel.add(p.Cnd_sls_act_no);
		p.Cnd_sls_act_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_sls_act_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sls_act_no_META);
		p.setPluralValueEnable(p.Cnd_sls_act_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_ext_purc_act_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_ext_purc_act_d_no_Label);
		p.CndPanel.add(p.Cnd_ext_purc_act_d_no);
		p.Cnd_ext_purc_act_d_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ext_purc_act_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.ext_purc_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_ext_purc_act_d_no, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_trd_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_lot_no);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.trd_nm_META);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1320.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.CstCndPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstCndPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.AcstCndPanel.add(p.Cnd_acst_grp_p_PPanel);
		p.AcstCndPanel.setLastBeans(p.Cnd_acst_grp_p_PPanel);
		p.SpplCndPanel.add(p.Cnd_sppl_grp_p_PPanel);
		p.SpplCndPanel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_SlsActListReg p) {
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
	protected static void jbInitRPnl(MSBBP_SlsActListReg p) {
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
	protected static void jbInitBulkSet(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_sls_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_sls_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_sls_dt);
		p.BulkSet_sls_dt.setNextBeans(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_sls_dt.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP1320.BulkSetR.sls_dt_META);
		p.BulkSet_sls_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_ac_dt_p_PPanel.setNextBeans(p.BulkSet_bill_basis_dt);
		p.BulkSetPanel.add(p.BulkSet_bill_basis_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_bill_basis_dt);
		p.BulkSet_bill_basis_dt.setNextBeans(p.BulkSet_rcv_schd_dt);
		p.BulkSet_bill_basis_dt.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP1320.BulkSetR.bill_basis_dt_META);
		p.BulkSet_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_rcv_schd_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_rcv_schd_dt);
		p.BulkSet_rcv_schd_dt.setNextBeans(p.BulkSet_ship_dt_p_PPanel);
		p.BulkSet_rcv_schd_dt.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP1320.BulkSetR.rcv_schd_dt_META);
		p.BulkSet_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_ship_dt_p_PPanel);
		p.BulkSet_ship_dt_p_PPanel.setNextBeans(p.BulkSet_dlv_dt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_dlv_dt_p_PPanel);
		p.BulkSet_dlv_dt_p_PPanel.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBBP_SlsActListReg p) {
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
	protected static void jbInitBtn(MSBBP_SlsActListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_open_MSBBP1330);
		p.Btn_open_MSBBP1330.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBBP1330);
		p.Btn_open_MSBBP1330.setNextBeans(p.Btn_open_MSBBP1340);
		p.Btn_open_MSBBP1340.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBBP1340);
		p.Btn_open_MSBBP1340.setNextBeans(p.Btn_open_MSBBP1380);
		p.Btn_open_MSBBP1380.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBBP1380);
		p.Btn_open_MSBBP1380.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_prnt_out_flg);
		p.BtnPanel.add(p.Btn_prnt_out_flg);
		p.Btn_prnt_out_flg.setNextBeans(p.Btn_indiv_prnt_flg);
		p.Btn_prnt_out_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1320.BtnR.prnt_out_flg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1320.BtnR.indiv_prnt_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_SlsActListReg p) {
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
		MSBBP_SlsActListReg_MC.mcInitScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitSrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTop((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitFold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitOpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitCstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitEdi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitCstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitDlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitAcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitSpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitTab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitCtrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitRPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitBulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitRslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitBtn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.mcInitEastBtn((MSBBP_SlsActListReg)this);

		// [SRCH_INS]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__INS_EastBtn((MSBBP_SlsActListReg)this);

		// [INS]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitINS_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitINS_EastBtn((MSBBP_SlsActListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__UPD_EastBtn((MSBBP_SlsActListReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitUPD_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitUPD_EastBtn((MSBBP_SlsActListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitSRCH__DEL_EastBtn((MSBBP_SlsActListReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitDEL_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitDEL_EastBtn((MSBBP_SlsActListReg)this);

		// [REF_DTL]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__DTL_EastBtn((MSBBP_SlsActListReg)this);

		// [REF_HDR]ステータスのモードの設定
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_ScreenOpe((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_SrchMode((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Top((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Fold((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Tab1((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_OpeTyp((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_CstIv((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Edi((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Tab2((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_CstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Tab3((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_DlvCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Tab4((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_AcstCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Tab5((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_SpplCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Tab6((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_ItmCnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Cnd((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Ctrl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_RPnl((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_BulkSet((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Rslt((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_Btn((MSBBP_SlsActListReg)this);
		MSBBP_SlsActListReg_MC.statusInitREF__HDR_EastBtn((MSBBP_SlsActListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_SlsActListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [OpeTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOpeTyp(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [CstIv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstIv(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [AcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAcstCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [SpplCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Tab6]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab6(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBBP_SlsActListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SlsActListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_mode_Group.addAllListener(p);
		p.Cnd_mode_DTL.addAllListener(p);
		p.Cnd_mode_HDR.addAllListener(p);
		p.Cnd_arrv_base_sls_flg.addAllListener(p);
		p.Cnd_arrv_sls_flg.addAllListener(p);
		p.Cnd_sls_cststk_flg.addAllListener(p);
		p.Cnd_sls_ddlv_flg.addAllListener(p);
		p.Cnd_not_ship_ord_sls_flg.addAllListener(p);
		p.Cnd_non_schd_flg.addAllListener(p);
		p.Cnd_ship_ord_sls_flg.addAllListener(p);
		p.Cnd_iv_flg.addAllListener(p);
		p.Cnd_not_iv_flg.addAllListener(p);
		p.Cnd_edi_flg.addAllListener(p);
		p.Cnd_not_edi_flg.addAllListener(p);
		p.Cnd_sls_schd_dt_fr.setListListener(p);
		p.Cnd_sls_schd_dt_fr.addAllListener(p);
		p.Cnd_sls_schd_dt_to.setListListener(p);
		p.Cnd_sls_schd_dt_to.addAllListener(p);
		p.Cnd_sls_dt_fr.setListListener(p);
		p.Cnd_sls_dt_fr.addAllListener(p);
		p.Cnd_sls_dt_to.setListListener(p);
		p.Cnd_sls_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_dest_cd1.setListListener(p);
		p.Cnd_dest_cd1.addAllListener(p);
		p.Cnd_dest_nm1.setListListener(p);
		p.Cnd_dest_nm1.addAllListener(p);
		p.Cnd_dest_cd2.setListListener(p);
		p.Cnd_dest_cd2.addAllListener(p);
		p.Cnd_dest_nm2.setListListener(p);
		p.Cnd_dest_nm2.addAllListener(p);
		p.Cnd_dest_cd3.setListListener(p);
		p.Cnd_dest_cd3.addAllListener(p);
		p.Cnd_dest_nm3.setListListener(p);
		p.Cnd_dest_nm3.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_ship_lg_grp_cd.setListListener(p);
		p.Cnd_ship_lg_grp_cd.addAllListener(p);
		p.Cnd_ship_lg_grp_nm.setListListener(p);
		p.Cnd_ship_lg_grp_nm.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_ship_dlv_slip_no.setListListener(p);
		p.Cnd_ship_dlv_slip_no.addAllListener(p);
		p.Cnd_purc_ddlv_dlv_slip_no.setListListener(p);
		p.Cnd_purc_ddlv_dlv_slip_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_ship_act_no.setListListener(p);
		p.Cnd_ship_act_no.addAllListener(p);
		p.Cnd_sls_act_no.setListListener(p);
		p.Cnd_sls_act_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_ext_purc_act_d_no.setListListener(p);
		p.Cnd_ext_purc_act_d_no.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_intr_d_rmrks.setListListener(p);
		p.Cnd_intr_d_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_dtl_sub_char1.setListListener(p);
		p.Cnd_dtl_sub_char1.addAllListener(p);
		p.Cnd_dtl_sub_char2.setListListener(p);
		p.Cnd_dtl_sub_char2.addAllListener(p);
		p.Cnd_dtl_sub_char3.setListListener(p);
		p.Cnd_dtl_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_SlsActListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_SlsActListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBBP_SlsActListReg p) {
		p.BulkSet_sls_dt.setListListener(p);
		p.BulkSet_sls_dt.addAllListener(p);
		p.BulkSet_bill_basis_dt.setListListener(p);
		p.BulkSet_bill_basis_dt.addAllListener(p);
		p.BulkSet_rcv_schd_dt.setListListener(p);
		p.BulkSet_rcv_schd_dt.addAllListener(p);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_SlsActListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_sync_flg.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_sls_tgt_typ.addAllListener(p);
		p.columnRslt_sls_tgt_typ.setListListener(p);
		p.columnRslt_sls_tgt_typ_nm.addAllListener(p);
		p.columnRslt_sls_tgt_typ_nm.setListListener(p);
		p.columnRslt_edi_flg.addAllListener(p);
		p.columnRslt_sls_schd_dt.addAllListener(p);
		p.columnRslt_sls_schd_dt.setListListener(p);
		p.columnRslt_sls_dt.addAllListener(p);
		p.columnRslt_sls_dt.setListListener(p);
		p.columnRslt_bill_basis_dt.addAllListener(p);
		p.columnRslt_bill_basis_dt.setListListener(p);
		p.columnRslt_rcv_schd_dt.addAllListener(p);
		p.columnRslt_rcv_schd_dt.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_trd_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_upri_dec_place.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_base_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_base_cur_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_cur_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_ptax_cur_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_dlv_slip_d_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_no.addAllListener(p);
		p.columnRslt_ship_dlv_slip_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_ship_dlv_slip_d_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_no.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_no.setListListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_iv_d_no.addAllListener(p);
		p.columnRslt_iv_d_no.setListListener(p);
		p.columnRslt_ship_act_no.addAllListener(p);
		p.columnRslt_ship_act_no.setListListener(p);
		p.columnRslt_dlv_ac_ym.addAllListener(p);
		p.columnRslt_dlv_ac_ym.setListListener(p);
		p.columnRslt_dlv_ac_dt.addAllListener(p);
		p.columnRslt_dlv_ac_dt.setListListener(p);
		p.columnRslt_sls_act_no.addAllListener(p);
		p.columnRslt_sls_act_no.setListListener(p);
		p.columnRslt_sls_act_rev.addAllListener(p);
		p.columnRslt_sls_act_rev.setListListener(p);
		p.columnRslt_sls_act_d_no.addAllListener(p);
		p.columnRslt_sls_act_d_no.setListListener(p);
		p.columnRslt_sls_basis_ym.addAllListener(p);
		p.columnRslt_sls_basis_ym.setListListener(p);
		p.columnRslt_sls_basis_dt.addAllListener(p);
		p.columnRslt_sls_basis_dt.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_qtn_no.addAllListener(p);
		p.columnRslt_qtn_no.setListListener(p);
		p.columnRslt_qtn_rev.addAllListener(p);
		p.columnRslt_qtn_rev.setListListener(p);
		p.columnRslt_qtn_d_no.addAllListener(p);
		p.columnRslt_qtn_d_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_acst_cd.addAllListener(p);
		p.columnRslt_acst_cd.setListListener(p);
		p.columnRslt_acst_nm.addAllListener(p);
		p.columnRslt_acst_nm.setListListener(p);
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_nm.addAllListener(p);
		p.columnRslt_ar_dpt_nm.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_dest_cd1.addAllListener(p);
		p.columnRslt_dest_cd1.setListListener(p);
		p.columnRslt_dest_nm1.addAllListener(p);
		p.columnRslt_dest_nm1.setListListener(p);
		p.columnRslt_dest_cd2.addAllListener(p);
		p.columnRslt_dest_cd2.setListListener(p);
		p.columnRslt_dest_nm2.addAllListener(p);
		p.columnRslt_dest_nm2.setListListener(p);
		p.columnRslt_dest_cd3.addAllListener(p);
		p.columnRslt_dest_cd3.setListListener(p);
		p.columnRslt_dest_nm3.addAllListener(p);
		p.columnRslt_dest_nm3.setListListener(p);
		p.columnRslt_ship_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_lg_grp_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_lot_no_typ.addAllListener(p);
		p.columnRslt_lot_no_typ.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sublot_no_typ.addAllListener(p);
		p.columnRslt_sublot_no_typ.setListListener(p);
		p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_not_lot_mix_flg.addAllListener(p);
		p.columnRslt_not_sublot_mix_flg.addAllListener(p);
		p.columnRslt_ship_fr_valid_dt.addAllListener(p);
		p.columnRslt_ship_fr_valid_dt.setListListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_asset_mng_typ_nm.addAllListener(p);
		p.columnRslt_asset_mng_typ_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_multi_io_flg.addAllListener(p);
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
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_sls_dtl_upd_flg.addAllListener(p);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_prof_rate.addAllListener(p);
		p.columnRslt_prof_rate.setListListener(p);
		p.columnRslt_bill_crryovr_times.addAllListener(p);
		p.columnRslt_bill_crryovr_times.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_cst_po_d_no.addAllListener(p);
		p.columnRslt_cst_po_d_no.setListListener(p);
		p.columnRslt_sls_rsn_cd.addAllListener(p);
		p.columnRslt_sls_rsn_cd.setListListener(p);
		p.columnRslt_sls_rsn_nm.addAllListener(p);
		p.columnRslt_sls_rsn_nm.setListListener(p);
		p.columnRslt_sls_acxfr_flg.addAllListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_wtax_amt.addAllListener(p);
		p.columnRslt_wtax_amt.setListListener(p);
		p.columnRslt_bp_dlv_slip_no.addAllListener(p);
		p.columnRslt_bp_dlv_slip_no.setListListener(p);
		p.columnRslt_bp_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_bp_dlv_slip_d_no.setListListener(p);
		p.columnRslt_bp_lot_no.addAllListener(p);
		p.columnRslt_bp_lot_no.setListListener(p);
		p.columnRslt_mrkt_judg_flg.addAllListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_purc_act_d_no.addAllListener(p);
		p.columnRslt_ext_purc_act_d_no.setListListener(p);
		p.columnRslt_ptax_dt.addAllListener(p);
		p.columnRslt_ptax_dt.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_dtl_sub_char1.addAllListener(p);
		p.columnRslt_dtl_sub_char1.setListListener(p);
		p.columnRslt_dtl_sub_char2.addAllListener(p);
		p.columnRslt_dtl_sub_char2.setListListener(p);
		p.columnRslt_dtl_sub_char3.addAllListener(p);
		p.columnRslt_dtl_sub_char3.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_bp_sls_upri_cng_flg.addAllListener(p);
		p.columnRslt_itm_sls_upri_cng_flg.addAllListener(p);
		p.columnRslt_dscnt_itm_flg.addAllListener(p);
		p.columnRslt_sls_amt_rnd_typ.addAllListener(p);
		p.columnRslt_sls_amt_rnd_typ.setListListener(p);
		p.columnRslt_sls_upri_rnd_typ.addAllListener(p);
		p.columnRslt_sls_upri_rnd_typ.setListListener(p);
		p.columnRslt_sls_tax_rnd_typ.addAllListener(p);
		p.columnRslt_sls_tax_rnd_typ.setListListener(p);
		p.columnRslt_xrate_rnd_typ.addAllListener(p);
		p.columnRslt_xrate_rnd_typ.setListListener(p);
		p.columnRslt_wtax_rnd_typ.addAllListener(p);
		p.columnRslt_wtax_rnd_typ.setListListener(p);
		p.columnRslt_purc_schd_no.addAllListener(p);
		p.columnRslt_purc_schd_no.setListListener(p);
		p.columnRslt_cst_iv_flg.addAllListener(p);
		p.columnRslt_org_trd_cur_upri.addAllListener(p);
		p.columnRslt_org_trd_cur_upri.setListListener(p);
		p.columnRslt_sls_schd_no.addAllListener(p);
		p.columnRslt_sls_schd_no.setListListener(p);
		p.columnRslt_prnt_out_flg.addAllListener(p);
		p.columnRslt_sls_act_seq.addAllListener(p);
		p.columnRslt_sls_act_seq.setListListener(p);
		p.columnRslt_sls_act_d_seq.addAllListener(p);
		p.columnRslt_sls_act_d_seq.setListListener(p);
		p.columnRslt_schd_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_schd_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_schd_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_schd_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_ver_flg.addAllListener(p);
		p.columnRslt_ship_pr_upd_cntr.addAllListener(p);
		p.columnRslt_ship_pr_upd_cntr.setListListener(p);
		p.columnRslt_base_unit_qty_bef.addAllListener(p);
		p.columnRslt_base_unit_qty_bef.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_SlsActListReg p) {
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_open_MSBBP1330.addAllListener(p);
		p.Btn_open_MSBBP1330.setAPMethodName("doBtn_open_MSBBP1330");
		p.Btn_open_MSBBP1340.addAllListener(p);
		p.Btn_open_MSBBP1340.setAPMethodName("doBtn_open_MSBBP1340");
		p.Btn_open_MSBBP1380.addAllListener(p);
		p.Btn_open_MSBBP1380.setAPMethodName("doBtn_open_MSBBP1380");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
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
	protected static void mcInitEastBtn(MSBBP_SlsActListReg p) {
	}

	/**
	 * [SRCH_INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_arrv_base_sls_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ship_ord_sls_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_iv_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_to.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sls_dt_to.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ship_dlv_slip_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_RPnl(MSBBP_SlsActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_INS, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.BulkSet_bill_basis_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.BulkSet_rcv_schd_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.BulkSet_ship_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_dlv_tm_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_cst_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_cost_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ext_purc_act_d_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, SRCH_INS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1330.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1380.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_INS, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitINS_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitINS_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitINS_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitINS_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_arrv_base_sls_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ship_ord_sls_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_iv_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sls_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ship_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ship_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBBP_SlsActListReg p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_bill_basis_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_rcv_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_ship_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_sync_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_dlv_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_cst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_cst_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_ar_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Rslt_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Rslt_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnRslt_not_lot_mix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, INS, MCMode.ENABLE);
		p.Rslt_sno_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Rslt_cost_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sls_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_bp_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_mrkt_judg_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ext_purc_act_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MSBBP1330.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1380.putMode(p, INS, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_prnt_out_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_arrv_base_sls_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_ord_sls_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_iv_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sls_schd_dt_to.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sls_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBBP_SlsActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_ship_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_dlv_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_cst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_cost_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_purc_act_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_dt.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1330.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1380.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_arrv_base_sls_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_ord_sls_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_iv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sls_schd_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sls_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBBP_SlsActListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_ship_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sync_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnRslt_bill_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_dlv_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnRslt_not_lot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Rslt_cost_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sls_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mrkt_judg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
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
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBBP1330.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1380.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_arrv_base_sls_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_ord_sls_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_iv_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_sls_schd_dt_to.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_sls_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBBP_SlsActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_ship_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_cost_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_purc_act_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1330.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1380.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_arrv_base_sls_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_ord_sls_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_iv_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sls_schd_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sls_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBBP_SlsActListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_ship_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnRslt_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_cost_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBBP1330.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1380.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_arrv_base_sls_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_ship_ord_sls_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_iv_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_schd_dt_to.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.BulkSet_ship_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_tm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_ym.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_valid_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_multi_io_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_cost_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_prof_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_acxfr_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_purc_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBBP1330.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBBP1380.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ScreenOpe(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SrchMode(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_OpeTyp(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[CstIv]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_CstIv(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Edi(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_CstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DlvCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab4(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_AcstCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab5(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SpplCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab6(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmCnd(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBBP_SlsActListReg p){
		p.Cnd_ope_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_arrv_base_sls_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_arrv_sls_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_ddlv_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_not_ship_ord_sls_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_non_schd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_ship_ord_sls_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_iv_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_edi_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_schd_dt_fr.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_schd_dt_to.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_lg_grp_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_ddlv_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBBP_SlsActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_BulkSet(MSBBP_SlsActListReg p){
		p.BulkSet_sls_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.BulkSet_ship_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Rslt(MSBBP_SlsActListReg p){
		p.columnRslt_check.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_tgt_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_tgt_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_edi_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_ship_tm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_tm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_ym.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_ac_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_basis_ym.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_acst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_lg_grp_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_lg_grp_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_not_sublot_mix_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_valid_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_multi_io_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_schd_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_abort_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_sls_dtl_upd_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_upri_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_cost_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_prof_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_acxfr_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_amt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bp_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_purc_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bp_sls_upri_cng_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_sls_upri_cng_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_amt_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_upri_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_tax_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_iv_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_org_trd_cur_upri.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_schd_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_prnt_out_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_base_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_unit_conv_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_qty_bef.putMode(p, REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBBP_SlsActListReg p){
		p.Btn_open_dtl.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBBP1330.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBBP1380.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_EastBtn(MSBBP_SlsActListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_SlsActListReg_MC.setTableConfigRslt((MSBBP_SlsActListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_SlsActListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.columnRslt_sync_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sync_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sync_flg);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_sls_tgt_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_tgt_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_tgt_typ);
		p.columnRslt_sls_tgt_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_tgt_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_tgt_typ_nm);
		p.columnRslt_edi_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.edi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_flg);
		p.columnRslt_sls_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_schd_dt_META);
		p.columnRslt_sls_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_schd_dt);
		p.columnRslt_sls_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_dt_META);
		p.columnRslt_sls_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dt);
		p.RsltTable.addTable(p.Rslt_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_can_ac_dt_p_PPanel.CanAcDtTable);
		p.columnRslt_bill_basis_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bill_basis_dt_META);
		p.columnRslt_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_basis_dt);
		p.columnRslt_rcv_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.rcv_schd_dt_META);
		p.columnRslt_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_dt);
		p.RsltTable.addTable(p.Rslt_ship_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_tm_p_PPanel.YmdHmTable);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_sls_dpt_nm, p.columnRslt_wg_cd, p.columnRslt_wg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_upri_dec_place);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_xrate_p_PPanel.XrateTable);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.columnRslt_base_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_upri_dec_place);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ptax_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_amt_dec_place);
		p.columnRslt_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ptax_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_upri_dec_place);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_ptax_xrate_p_PPanel.XrateTable);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_dlv_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_d_no);
		p.columnRslt_ship_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_no);
		p.columnRslt_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_d_no);
		p.columnRslt_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_dlv_slip_multi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_multi_flg);
		p.columnRslt_purc_ddlv_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.purc_ddlv_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_no);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.purc_ddlv_dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_d_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_iv_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.iv_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_no);
		p.columnRslt_ship_act_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_no);
		p.columnRslt_dlv_ac_ym.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dlv_ac_ym_META);
		p.columnRslt_dlv_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_ac_ym);
		p.columnRslt_dlv_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dlv_ac_dt_META);
		p.columnRslt_dlv_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_ac_dt);
		p.columnRslt_sls_act_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_no);
		p.columnRslt_sls_act_rev.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_rev);
		p.columnRslt_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_no);
		p.columnRslt_sls_basis_ym.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_basis_ym_META);
		p.columnRslt_sls_basis_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_ym);
		p.columnRslt_sls_basis_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_basis_dt_META);
		p.columnRslt_sls_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_dt);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_qtn_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.qtn_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_no);
		p.columnRslt_qtn_rev.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.qtn_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_rev);
		p.columnRslt_qtn_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.qtn_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.RsltTable.addTable(p.Rslt_sppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_acst_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.acst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_cd);
		p.columnRslt_acst_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.acst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_nm);
		p.RsltTable.addTable(p.Rslt_acst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ar_dpt_cd_META);
		p.columnRslt_ar_dpt_cd.setListType(MCListType.STRICT);
		p.columnRslt_ar_dpt_cd.addLinkBeans(p.columnRslt_ar_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_ar_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ar_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_nm);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_dlv_p_PPanel.DlvTable);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.columnRslt_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dest_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd1);
		p.columnRslt_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dest_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm1);
		p.columnRslt_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dest_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd2);
		p.columnRslt_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dest_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm2);
		p.columnRslt_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dest_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd3);
		p.columnRslt_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dest_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm3);
		p.columnRslt_ship_lg_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_lg_grp_cd);
		p.columnRslt_ship_lg_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_lg_grp_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_lot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.lot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no_typ);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sublot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sublot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no_typ);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnRslt_sublot_no, p.columnRslt_ver_no);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnRslt_ver_no);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_not_lot_mix_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.not_lot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_lot_mix_flg);
		p.columnRslt_not_sublot_mix_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.not_sublot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_sublot_mix_flg);
		p.columnRslt_ship_fr_valid_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_fr_valid_dt_META);
		p.columnRslt_ship_fr_valid_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_valid_dt);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.asset_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_multi_io_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.multi_io_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_multi_io_flg);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_unit_cd_META);
		p.columnRslt_trd_unit_cd.addLinkBeans(p.columnRslt_trd_unit_nm,p.columnRslt_trd_unit_dec_place,p.columnRslt_trd_unit_conv_base_qty,p.columnRslt_trd_unit_conv_qty,p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sls_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_abort_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sls_qty_p_PPanel.QtyTable);
		p.columnRslt_sls_dtl_upd_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_dtl_upd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dtl_upd_flg);
		p.RsltTable.addTable(p.Rslt_trd_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnRslt_tax_nm, p.columnRslt_tax_rate, p.columnRslt_inc_tax_flg, p.columnRslt_tax_typ);
		p.Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnRslt_dscnt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_cost_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_cost_amt_p_PPanel.AmtTable);
		p.columnRslt_prof_rate.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.prof_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prof_rate);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bill_crryovr_times_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_crryovr_times);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_d_no);
		p.columnRslt_sls_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_rsn_cd_META);
		p.columnRslt_sls_rsn_cd.addLinkBeans(p.columnRslt_sls_rsn_nm,p.columnRslt_sls_acxfr_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_rsn_cd);
		p.columnRslt_sls_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_rsn_nm);
		p.columnRslt_sls_acxfr_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_acxfr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_acxfr_flg);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bd_dpt_cd_META);
		p.columnRslt_bd_dpt_cd.addLinkBeans(p.columnRslt_bd_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.columnRslt_wtax_amt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.wtax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_amt);
		p.columnRslt_bp_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bp_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_dlv_slip_no);
		p.columnRslt_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bp_dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_dlv_slip_d_no);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.columnRslt_mrkt_judg_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.mrkt_judg_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_purc_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ext_purc_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_purc_act_d_no);
		p.columnRslt_ptax_dt.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ptax_dt_META);
		p.columnRslt_ptax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_dt);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_dtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dtl_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char1);
		p.columnRslt_dtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dtl_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char2);
		p.columnRslt_dtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dtl_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_bp_sls_upri_cng_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.bp_sls_upri_cng_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_sls_upri_cng_flg);
		p.columnRslt_itm_sls_upri_cng_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.itm_sls_upri_cng_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_sls_upri_cng_flg);
		p.columnRslt_dscnt_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.dscnt_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_itm_flg);
		p.columnRslt_sls_amt_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_amt_rnd_typ);
		p.columnRslt_sls_upri_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_upri_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_upri_rnd_typ);
		p.columnRslt_sls_tax_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_tax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_tax_rnd_typ);
		p.columnRslt_xrate_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.xrate_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_rnd_typ);
		p.columnRslt_wtax_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.wtax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rnd_typ);
		p.columnRslt_purc_schd_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.purc_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_no);
		p.columnRslt_cst_iv_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.cst_iv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_iv_flg);
		p.columnRslt_org_trd_cur_upri.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.org_trd_cur_upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_org_trd_cur_upri);
		p.columnRslt_sls_schd_no.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_schd_no);
		p.columnRslt_prnt_out_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.prnt_out_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_out_flg);
		p.columnRslt_sls_act_seq.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_act_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_seq);
		p.columnRslt_sls_act_d_seq.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.sls_act_d_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_seq);
		p.columnRslt_schd_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.schd_trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_trd_unit_conv_base_qty);
		p.columnRslt_schd_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.schd_trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_trd_unit_conv_qty);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.columnRslt_ship_pr_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.ship_pr_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_pr_upd_cntr);
		p.columnRslt_base_unit_qty_bef.setMeta(mcframe.clientMSBB.MSBBP1320.RsltR.base_unit_qty_bef_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_qty_bef);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_ship_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_lg_grp_cd.getListConfig().setPutter(getCnd_ship_lg_grp_cd_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_ar_dpt_cd.getListConfig().setPutter(getRslt_ar_dpt_cd_ListPutter());
		Rslt_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnRslt_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_unit_cd.getListConfig().setPutter(getRslt_trd_unit_cd_ListPutter());
		Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnRslt_sls_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sls_rsn_cd.getListConfig().setPutter(getRslt_sls_rsn_cd_ListPutter());
		columnRslt_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_bd_dpt_cd.getListConfig().setPutter(getRslt_bd_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSStatus() {
		status = SRCH_INS;
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
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
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
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
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
	 * この画面を[REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DTLStatus() {
		status = REF_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_HDRStatus() {
		status = REF_HDR;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_INS.equals(status)) {
			setSRCH_INSStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
	}

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
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
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_ship_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
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
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Cnd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
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
	 * [Rslt_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
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
	 * [Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}

	/**
	 * [Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDscntBizRsn");
		return lp;
	}

	/**
	 * [Rslt_sls_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sls_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsBizRsn");
		return lp;
	}
	 
	/**
	 * [Rslt_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_ship_lg_grp_cd) return getCnd_ship_lg_grp_cd(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_ar_dpt_cd) return getRslt_ar_dpt_cd(row, info);
		if(combo == Rslt_lot_no_p_PPanel.columnLotNo_lot_no) return getRslt_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Rslt_lot_no_p_PPanel.columnLotNo_sublot_no) return getRslt_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnRslt_trd_unit_cd) return getRslt_trd_unit_cd(row, info);
		if(combo == Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Rslt_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnRslt_sls_rsn_cd) return getRslt_sls_rsn_cd(row, info);
		if(combo == columnRslt_bd_dpt_cd) return getRslt_bd_dpt_cd(row, info);
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
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_open_MSBBP1330) doBtn_open_MSBBP1330(info);
		else if (ap == Btn_open_MSBBP1340) doBtn_open_MSBBP1340(info);
		else if (ap == Btn_open_MSBBP1380) doBtn_open_MSBBP1380(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_ins) doBtn_ins(info);
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
	 * [Btn]パネルの[open_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1330]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1330(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1340]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1340(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1380]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1380(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_mode_Group) return doCnd_mode_VC(info);
		if (vc == Cnd_arrv_base_sls_flg) return doCnd_arrv_base_sls_flg_VC(info);
		if (vc == Cnd_arrv_sls_flg) return doCnd_arrv_sls_flg_VC(info);
		if (vc == Cnd_sls_cststk_flg) return doCnd_sls_cststk_flg_VC(info);
		if (vc == Cnd_sls_ddlv_flg) return doCnd_sls_ddlv_flg_VC(info);
		if (vc == Cnd_not_ship_ord_sls_flg) return doCnd_not_ship_ord_sls_flg_VC(info);
		if (vc == Cnd_non_schd_flg) return doCnd_non_schd_flg_VC(info);
		if (vc == Cnd_ship_ord_sls_flg) return doCnd_ship_ord_sls_flg_VC(info);
		if (vc == Cnd_iv_flg) return doCnd_iv_flg_VC(info);
		if (vc == Cnd_not_iv_flg) return doCnd_not_iv_flg_VC(info);
		if (vc == Cnd_edi_flg) return doCnd_edi_flg_VC(info);
		if (vc == Cnd_not_edi_flg) return doCnd_not_edi_flg_VC(info);
		if (vc == Cnd_sls_schd_dt_fr) return doCnd_sls_schd_dt_fr_VC(info);
		if (vc == Cnd_sls_schd_dt_to) return doCnd_sls_schd_dt_to_VC(info);
		if (vc == Cnd_sls_dt_fr) return doCnd_sls_dt_fr_VC(info);
		if (vc == Cnd_sls_dt_to) return doCnd_sls_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_dest_cd1) return doCnd_dest_cd1_VC(info);
		if (vc == Cnd_dest_nm1) return doCnd_dest_nm1_VC(info);
		if (vc == Cnd_dest_cd2) return doCnd_dest_cd2_VC(info);
		if (vc == Cnd_dest_nm2) return doCnd_dest_nm2_VC(info);
		if (vc == Cnd_dest_cd3) return doCnd_dest_cd3_VC(info);
		if (vc == Cnd_dest_nm3) return doCnd_dest_nm3_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_ship_lg_grp_cd) return doCnd_ship_lg_grp_cd_VC(info);
		if (vc == Cnd_ship_lg_grp_nm) return doCnd_ship_lg_grp_nm_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_ship_dlv_slip_no) return doCnd_ship_dlv_slip_no_VC(info);
		if (vc == Cnd_purc_ddlv_dlv_slip_no) return doCnd_purc_ddlv_dlv_slip_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_ship_act_no) return doCnd_ship_act_no_VC(info);
		if (vc == Cnd_sls_act_no) return doCnd_sls_act_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_ext_purc_act_d_no) return doCnd_ext_purc_act_d_no_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dtl_sub_char1) return doCnd_dtl_sub_char1_VC(info);
		if (vc == Cnd_dtl_sub_char2) return doCnd_dtl_sub_char2_VC(info);
		if (vc == Cnd_dtl_sub_char3) return doCnd_dtl_sub_char3_VC(info);
		if (vc == BulkSet_sls_dt) return doBulkSet_sls_dt_VC(info);
		if (vc == BulkSet_bill_basis_dt) return doBulkSet_bill_basis_dt_VC(info);
		if (vc == BulkSet_rcv_schd_dt) return doBulkSet_rcv_schd_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_sync_flg) return doRslt_sync_flg_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_sls_tgt_typ) return doRslt_sls_tgt_typ_VC(info);
		if (vc == columnRslt_sls_tgt_typ_nm) return doRslt_sls_tgt_typ_nm_VC(info);
		if (vc == columnRslt_edi_flg) return doRslt_edi_flg_VC(info);
		if (vc == columnRslt_sls_schd_dt) return doRslt_sls_schd_dt_VC(info);
		if (vc == columnRslt_sls_dt) return doRslt_sls_dt_VC(info);
		if (vc == columnRslt_bill_basis_dt) return doRslt_bill_basis_dt_VC(info);
		if (vc == columnRslt_rcv_schd_dt) return doRslt_rcv_schd_dt_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_upri_dec_place) return doRslt_trd_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_base_cur_upri_dec_place) return doRslt_base_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_ptax_cur_amt_dec_place) return doRslt_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_upri_dec_place) return doRslt_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_dlv_slip_d_no) return doRslt_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_no) return doRslt_ship_dlv_slip_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_d_no) return doRslt_ship_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_multi_flg) return doRslt_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_no) return doRslt_purc_ddlv_dlv_slip_no_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_d_no) return doRslt_purc_ddlv_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_iv_d_no) return doRslt_iv_d_no_VC(info);
		if (vc == columnRslt_ship_act_no) return doRslt_ship_act_no_VC(info);
		if (vc == columnRslt_dlv_ac_ym) return doRslt_dlv_ac_ym_VC(info);
		if (vc == columnRslt_dlv_ac_dt) return doRslt_dlv_ac_dt_VC(info);
		if (vc == columnRslt_sls_act_no) return doRslt_sls_act_no_VC(info);
		if (vc == columnRslt_sls_act_rev) return doRslt_sls_act_rev_VC(info);
		if (vc == columnRslt_sls_act_d_no) return doRslt_sls_act_d_no_VC(info);
		if (vc == columnRslt_sls_basis_ym) return doRslt_sls_basis_ym_VC(info);
		if (vc == columnRslt_sls_basis_dt) return doRslt_sls_basis_dt_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_qtn_no) return doRslt_qtn_no_VC(info);
		if (vc == columnRslt_qtn_rev) return doRslt_qtn_rev_VC(info);
		if (vc == columnRslt_qtn_d_no) return doRslt_qtn_d_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_acst_cd) return doRslt_acst_cd_VC(info);
		if (vc == columnRslt_acst_nm) return doRslt_acst_nm_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_nm) return doRslt_ar_dpt_nm_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_dest_cd1) return doRslt_dest_cd1_VC(info);
		if (vc == columnRslt_dest_nm1) return doRslt_dest_nm1_VC(info);
		if (vc == columnRslt_dest_cd2) return doRslt_dest_cd2_VC(info);
		if (vc == columnRslt_dest_nm2) return doRslt_dest_nm2_VC(info);
		if (vc == columnRslt_dest_cd3) return doRslt_dest_cd3_VC(info);
		if (vc == columnRslt_dest_nm3) return doRslt_dest_nm3_VC(info);
		if (vc == columnRslt_ship_lg_grp_cd) return doRslt_ship_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_lg_grp_nm) return doRslt_ship_lg_grp_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_lot_no_typ) return doRslt_lot_no_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_no_typ) return doRslt_sublot_no_typ_VC(info);
		if (vc == columnRslt_not_lot_mix_flg) return doRslt_not_lot_mix_flg_VC(info);
		if (vc == columnRslt_not_sublot_mix_flg) return doRslt_not_sublot_mix_flg_VC(info);
		if (vc == columnRslt_ship_fr_valid_dt) return doRslt_ship_fr_valid_dt_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ_nm) return doRslt_asset_mng_typ_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_multi_io_flg) return doRslt_multi_io_flg_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_sls_dtl_upd_flg) return doRslt_sls_dtl_upd_flg_VC(info);
		if (vc == columnRslt_prof_rate) return doRslt_prof_rate_VC(info);
		if (vc == columnRslt_bill_crryovr_times) return doRslt_bill_crryovr_times_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_cst_po_d_no) return doRslt_cst_po_d_no_VC(info);
		if (vc == columnRslt_sls_rsn_cd) return doRslt_sls_rsn_cd_VC(info);
		if (vc == columnRslt_sls_rsn_nm) return doRslt_sls_rsn_nm_VC(info);
		if (vc == columnRslt_sls_acxfr_flg) return doRslt_sls_acxfr_flg_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_wtax_amt) return doRslt_wtax_amt_VC(info);
		if (vc == columnRslt_bp_dlv_slip_no) return doRslt_bp_dlv_slip_no_VC(info);
		if (vc == columnRslt_bp_dlv_slip_d_no) return doRslt_bp_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_mrkt_judg_flg) return doRslt_mrkt_judg_flg_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_purc_act_d_no) return doRslt_ext_purc_act_d_no_VC(info);
		if (vc == columnRslt_ptax_dt) return doRslt_ptax_dt_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_dtl_sub_char1) return doRslt_dtl_sub_char1_VC(info);
		if (vc == columnRslt_dtl_sub_char2) return doRslt_dtl_sub_char2_VC(info);
		if (vc == columnRslt_dtl_sub_char3) return doRslt_dtl_sub_char3_VC(info);
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
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_bp_sls_upri_cng_flg) return doRslt_bp_sls_upri_cng_flg_VC(info);
		if (vc == columnRslt_itm_sls_upri_cng_flg) return doRslt_itm_sls_upri_cng_flg_VC(info);
		if (vc == columnRslt_dscnt_itm_flg) return doRslt_dscnt_itm_flg_VC(info);
		if (vc == columnRslt_sls_amt_rnd_typ) return doRslt_sls_amt_rnd_typ_VC(info);
		if (vc == columnRslt_sls_upri_rnd_typ) return doRslt_sls_upri_rnd_typ_VC(info);
		if (vc == columnRslt_sls_tax_rnd_typ) return doRslt_sls_tax_rnd_typ_VC(info);
		if (vc == columnRslt_xrate_rnd_typ) return doRslt_xrate_rnd_typ_VC(info);
		if (vc == columnRslt_wtax_rnd_typ) return doRslt_wtax_rnd_typ_VC(info);
		if (vc == columnRslt_purc_schd_no) return doRslt_purc_schd_no_VC(info);
		if (vc == columnRslt_cst_iv_flg) return doRslt_cst_iv_flg_VC(info);
		if (vc == columnRslt_org_trd_cur_upri) return doRslt_org_trd_cur_upri_VC(info);
		if (vc == columnRslt_sls_schd_no) return doRslt_sls_schd_no_VC(info);
		if (vc == columnRslt_prnt_out_flg) return doRslt_prnt_out_flg_VC(info);
		if (vc == columnRslt_sls_act_seq) return doRslt_sls_act_seq_VC(info);
		if (vc == columnRslt_sls_act_d_seq) return doRslt_sls_act_d_seq_VC(info);
		if (vc == columnRslt_schd_trd_unit_conv_base_qty) return doRslt_schd_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_schd_trd_unit_conv_qty) return doRslt_schd_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_ship_pr_upd_cntr) return doRslt_ship_pr_upd_cntr_VC(info);
		if (vc == columnRslt_base_unit_qty_bef) return doRslt_base_unit_qty_bef_VC(info);
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
	 * [Cnd]パネルの[mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[arrv_base_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arrv_base_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[arrv_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arrv_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_cststk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ddlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ddlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ship_ord_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ship_ord_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_ord_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_ord_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_iv_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_dlv_slip_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_purc_act_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[sls_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_sls_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rcv_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_upri_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ddlv_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ddlv_dlv_slip_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_basis_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_basis_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_basis_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_fr_valid_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_fr_valid_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[multi_io_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_multi_io_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dtl_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dtl_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prof_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prof_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_acxfr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_acxfr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_upri_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_upri_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[org_trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_org_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prnt_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prnt_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty_bef]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_qty_bef_VC(MCEventInfo info){
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
		else if (nc == Cnd_mode_Group) doCnd_mode_NC(info);
		else if (nc == Cnd_arrv_base_sls_flg) doCnd_arrv_base_sls_flg_NC(info);
		else if (nc == Cnd_arrv_sls_flg) doCnd_arrv_sls_flg_NC(info);
		else if (nc == Cnd_sls_cststk_flg) doCnd_sls_cststk_flg_NC(info);
		else if (nc == Cnd_sls_ddlv_flg) doCnd_sls_ddlv_flg_NC(info);
		else if (nc == Cnd_not_ship_ord_sls_flg) doCnd_not_ship_ord_sls_flg_NC(info);
		else if (nc == Cnd_non_schd_flg) doCnd_non_schd_flg_NC(info);
		else if (nc == Cnd_ship_ord_sls_flg) doCnd_ship_ord_sls_flg_NC(info);
		else if (nc == Cnd_iv_flg) doCnd_iv_flg_NC(info);
		else if (nc == Cnd_not_iv_flg) doCnd_not_iv_flg_NC(info);
		else if (nc == Cnd_edi_flg) doCnd_edi_flg_NC(info);
		else if (nc == Cnd_not_edi_flg) doCnd_not_edi_flg_NC(info);
		else if (nc == Cnd_sls_schd_dt_fr) doCnd_sls_schd_dt_fr_NC(info);
		else if (nc == Cnd_sls_schd_dt_to) doCnd_sls_schd_dt_to_NC(info);
		else if (nc == Cnd_sls_dt_fr) doCnd_sls_dt_fr_NC(info);
		else if (nc == Cnd_sls_dt_to) doCnd_sls_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_dest_cd1) doCnd_dest_cd1_NC(info);
		else if (nc == Cnd_dest_nm1) doCnd_dest_nm1_NC(info);
		else if (nc == Cnd_dest_cd2) doCnd_dest_cd2_NC(info);
		else if (nc == Cnd_dest_nm2) doCnd_dest_nm2_NC(info);
		else if (nc == Cnd_dest_cd3) doCnd_dest_cd3_NC(info);
		else if (nc == Cnd_dest_nm3) doCnd_dest_nm3_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NC(info);
		else if (nc == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NC(info);
		else if (nc == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_ship_act_no) doCnd_ship_act_no_NC(info);
		else if (nc == Cnd_sls_act_no) doCnd_sls_act_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NC(info);
		else if (nc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NC(info);
		else if (nc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NC(info);
		else if (nc == BulkSet_sls_dt) doBulkSet_sls_dt_NC(info);
		else if (nc == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_NC(info);
		else if (nc == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_sync_flg) doRslt_sync_flg_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_sls_tgt_typ) doRslt_sls_tgt_typ_NC(info);
		else if (nc == columnRslt_sls_tgt_typ_nm) doRslt_sls_tgt_typ_nm_NC(info);
		else if (nc == columnRslt_edi_flg) doRslt_edi_flg_NC(info);
		else if (nc == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_NC(info);
		else if (nc == columnRslt_sls_dt) doRslt_sls_dt_NC(info);
		else if (nc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NC(info);
		else if (nc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_upri_dec_place) doRslt_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_multi_flg) doRslt_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_iv_d_no) doRslt_iv_d_no_NC(info);
		else if (nc == columnRslt_ship_act_no) doRslt_ship_act_no_NC(info);
		else if (nc == columnRslt_dlv_ac_ym) doRslt_dlv_ac_ym_NC(info);
		else if (nc == columnRslt_dlv_ac_dt) doRslt_dlv_ac_dt_NC(info);
		else if (nc == columnRslt_sls_act_no) doRslt_sls_act_no_NC(info);
		else if (nc == columnRslt_sls_act_rev) doRslt_sls_act_rev_NC(info);
		else if (nc == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NC(info);
		else if (nc == columnRslt_sls_basis_ym) doRslt_sls_basis_ym_NC(info);
		else if (nc == columnRslt_sls_basis_dt) doRslt_sls_basis_dt_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_qtn_no) doRslt_qtn_no_NC(info);
		else if (nc == columnRslt_qtn_rev) doRslt_qtn_rev_NC(info);
		else if (nc == columnRslt_qtn_d_no) doRslt_qtn_d_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_acst_cd) doRslt_acst_cd_NC(info);
		else if (nc == columnRslt_acst_nm) doRslt_acst_nm_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_dest_cd1) doRslt_dest_cd1_NC(info);
		else if (nc == columnRslt_dest_nm1) doRslt_dest_nm1_NC(info);
		else if (nc == columnRslt_dest_cd2) doRslt_dest_cd2_NC(info);
		else if (nc == columnRslt_dest_nm2) doRslt_dest_nm2_NC(info);
		else if (nc == columnRslt_dest_cd3) doRslt_dest_cd3_NC(info);
		else if (nc == columnRslt_dest_nm3) doRslt_dest_nm3_NC(info);
		else if (nc == columnRslt_ship_lg_grp_cd) doRslt_ship_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_lg_grp_nm) doRslt_ship_lg_grp_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_lot_no_typ) doRslt_lot_no_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NC(info);
		else if (nc == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NC(info);
		else if (nc == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NC(info);
		else if (nc == columnRslt_ship_fr_valid_dt) doRslt_ship_fr_valid_dt_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_multi_io_flg) doRslt_multi_io_flg_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_sls_dtl_upd_flg) doRslt_sls_dtl_upd_flg_NC(info);
		else if (nc == columnRslt_prof_rate) doRslt_prof_rate_NC(info);
		else if (nc == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NC(info);
		else if (nc == columnRslt_sls_rsn_cd) doRslt_sls_rsn_cd_NC(info);
		else if (nc == columnRslt_sls_rsn_nm) doRslt_sls_rsn_nm_NC(info);
		else if (nc == columnRslt_sls_acxfr_flg) doRslt_sls_acxfr_flg_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_wtax_amt) doRslt_wtax_amt_NC(info);
		else if (nc == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_NC(info);
		else if (nc == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_mrkt_judg_flg) doRslt_mrkt_judg_flg_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_purc_act_d_no) doRslt_ext_purc_act_d_no_NC(info);
		else if (nc == columnRslt_ptax_dt) doRslt_ptax_dt_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NC(info);
		else if (nc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NC(info);
		else if (nc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NC(info);
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
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_bp_sls_upri_cng_flg) doRslt_bp_sls_upri_cng_flg_NC(info);
		else if (nc == columnRslt_itm_sls_upri_cng_flg) doRslt_itm_sls_upri_cng_flg_NC(info);
		else if (nc == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NC(info);
		else if (nc == columnRslt_sls_amt_rnd_typ) doRslt_sls_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_sls_upri_rnd_typ) doRslt_sls_upri_rnd_typ_NC(info);
		else if (nc == columnRslt_sls_tax_rnd_typ) doRslt_sls_tax_rnd_typ_NC(info);
		else if (nc == columnRslt_xrate_rnd_typ) doRslt_xrate_rnd_typ_NC(info);
		else if (nc == columnRslt_wtax_rnd_typ) doRslt_wtax_rnd_typ_NC(info);
		else if (nc == columnRslt_purc_schd_no) doRslt_purc_schd_no_NC(info);
		else if (nc == columnRslt_cst_iv_flg) doRslt_cst_iv_flg_NC(info);
		else if (nc == columnRslt_org_trd_cur_upri) doRslt_org_trd_cur_upri_NC(info);
		else if (nc == columnRslt_sls_schd_no) doRslt_sls_schd_no_NC(info);
		else if (nc == columnRslt_prnt_out_flg) doRslt_prnt_out_flg_NC(info);
		else if (nc == columnRslt_sls_act_seq) doRslt_sls_act_seq_NC(info);
		else if (nc == columnRslt_sls_act_d_seq) doRslt_sls_act_d_seq_NC(info);
		else if (nc == columnRslt_schd_trd_unit_conv_base_qty) doRslt_schd_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_schd_trd_unit_conv_qty) doRslt_schd_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NC(info);
		else if (nc == columnRslt_base_unit_qty_bef) doRslt_base_unit_qty_bef_NC(info);
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
	 * [Cnd]パネルの[mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arrv_base_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arrv_base_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arrv_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arrv_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ddlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ddlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_ord_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_ord_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_ord_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_ord_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_iv_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_purc_act_d_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[sls_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_sls_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_valid_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_valid_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[multi_io_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_io_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dtl_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dtl_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prof_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_acxfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_acxfr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty_bef]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_bef_NC(MCEventInfo info){
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
		else if (ne == Cnd_mode_Group) doCnd_mode_NE(info);
		else if (ne == Cnd_arrv_base_sls_flg) doCnd_arrv_base_sls_flg_NE(info);
		else if (ne == Cnd_arrv_sls_flg) doCnd_arrv_sls_flg_NE(info);
		else if (ne == Cnd_sls_cststk_flg) doCnd_sls_cststk_flg_NE(info);
		else if (ne == Cnd_sls_ddlv_flg) doCnd_sls_ddlv_flg_NE(info);
		else if (ne == Cnd_not_ship_ord_sls_flg) doCnd_not_ship_ord_sls_flg_NE(info);
		else if (ne == Cnd_non_schd_flg) doCnd_non_schd_flg_NE(info);
		else if (ne == Cnd_ship_ord_sls_flg) doCnd_ship_ord_sls_flg_NE(info);
		else if (ne == Cnd_iv_flg) doCnd_iv_flg_NE(info);
		else if (ne == Cnd_not_iv_flg) doCnd_not_iv_flg_NE(info);
		else if (ne == Cnd_edi_flg) doCnd_edi_flg_NE(info);
		else if (ne == Cnd_not_edi_flg) doCnd_not_edi_flg_NE(info);
		else if (ne == Cnd_sls_schd_dt_fr) doCnd_sls_schd_dt_fr_NE(info);
		else if (ne == Cnd_sls_schd_dt_to) doCnd_sls_schd_dt_to_NE(info);
		else if (ne == Cnd_sls_dt_fr) doCnd_sls_dt_fr_NE(info);
		else if (ne == Cnd_sls_dt_to) doCnd_sls_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_dest_cd1) doCnd_dest_cd1_NE(info);
		else if (ne == Cnd_dest_nm1) doCnd_dest_nm1_NE(info);
		else if (ne == Cnd_dest_cd2) doCnd_dest_cd2_NE(info);
		else if (ne == Cnd_dest_nm2) doCnd_dest_nm2_NE(info);
		else if (ne == Cnd_dest_cd3) doCnd_dest_cd3_NE(info);
		else if (ne == Cnd_dest_nm3) doCnd_dest_nm3_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NE(info);
		else if (ne == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NE(info);
		else if (ne == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_ship_act_no) doCnd_ship_act_no_NE(info);
		else if (ne == Cnd_sls_act_no) doCnd_sls_act_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NE(info);
		else if (ne == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NE(info);
		else if (ne == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NE(info);
		else if (ne == BulkSet_sls_dt) doBulkSet_sls_dt_NE(info);
		else if (ne == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_NE(info);
		else if (ne == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_sync_flg) doRslt_sync_flg_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_sls_tgt_typ) doRslt_sls_tgt_typ_NE(info);
		else if (ne == columnRslt_sls_tgt_typ_nm) doRslt_sls_tgt_typ_nm_NE(info);
		else if (ne == columnRslt_edi_flg) doRslt_edi_flg_NE(info);
		else if (ne == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_NE(info);
		else if (ne == columnRslt_sls_dt) doRslt_sls_dt_NE(info);
		else if (ne == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NE(info);
		else if (ne == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_upri_dec_place) doRslt_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_multi_flg) doRslt_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_iv_d_no) doRslt_iv_d_no_NE(info);
		else if (ne == columnRslt_ship_act_no) doRslt_ship_act_no_NE(info);
		else if (ne == columnRslt_dlv_ac_ym) doRslt_dlv_ac_ym_NE(info);
		else if (ne == columnRslt_dlv_ac_dt) doRslt_dlv_ac_dt_NE(info);
		else if (ne == columnRslt_sls_act_no) doRslt_sls_act_no_NE(info);
		else if (ne == columnRslt_sls_act_rev) doRslt_sls_act_rev_NE(info);
		else if (ne == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NE(info);
		else if (ne == columnRslt_sls_basis_ym) doRslt_sls_basis_ym_NE(info);
		else if (ne == columnRslt_sls_basis_dt) doRslt_sls_basis_dt_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_qtn_no) doRslt_qtn_no_NE(info);
		else if (ne == columnRslt_qtn_rev) doRslt_qtn_rev_NE(info);
		else if (ne == columnRslt_qtn_d_no) doRslt_qtn_d_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_acst_cd) doRslt_acst_cd_NE(info);
		else if (ne == columnRslt_acst_nm) doRslt_acst_nm_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_dest_cd1) doRslt_dest_cd1_NE(info);
		else if (ne == columnRslt_dest_nm1) doRslt_dest_nm1_NE(info);
		else if (ne == columnRslt_dest_cd2) doRslt_dest_cd2_NE(info);
		else if (ne == columnRslt_dest_nm2) doRslt_dest_nm2_NE(info);
		else if (ne == columnRslt_dest_cd3) doRslt_dest_cd3_NE(info);
		else if (ne == columnRslt_dest_nm3) doRslt_dest_nm3_NE(info);
		else if (ne == columnRslt_ship_lg_grp_cd) doRslt_ship_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_lg_grp_nm) doRslt_ship_lg_grp_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_lot_no_typ) doRslt_lot_no_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NE(info);
		else if (ne == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NE(info);
		else if (ne == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NE(info);
		else if (ne == columnRslt_ship_fr_valid_dt) doRslt_ship_fr_valid_dt_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_multi_io_flg) doRslt_multi_io_flg_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_sls_dtl_upd_flg) doRslt_sls_dtl_upd_flg_NE(info);
		else if (ne == columnRslt_prof_rate) doRslt_prof_rate_NE(info);
		else if (ne == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NE(info);
		else if (ne == columnRslt_sls_rsn_cd) doRslt_sls_rsn_cd_NE(info);
		else if (ne == columnRslt_sls_rsn_nm) doRslt_sls_rsn_nm_NE(info);
		else if (ne == columnRslt_sls_acxfr_flg) doRslt_sls_acxfr_flg_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_wtax_amt) doRslt_wtax_amt_NE(info);
		else if (ne == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_NE(info);
		else if (ne == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_mrkt_judg_flg) doRslt_mrkt_judg_flg_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_purc_act_d_no) doRslt_ext_purc_act_d_no_NE(info);
		else if (ne == columnRslt_ptax_dt) doRslt_ptax_dt_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NE(info);
		else if (ne == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NE(info);
		else if (ne == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NE(info);
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
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_bp_sls_upri_cng_flg) doRslt_bp_sls_upri_cng_flg_NE(info);
		else if (ne == columnRslt_itm_sls_upri_cng_flg) doRslt_itm_sls_upri_cng_flg_NE(info);
		else if (ne == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NE(info);
		else if (ne == columnRslt_sls_amt_rnd_typ) doRslt_sls_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_sls_upri_rnd_typ) doRslt_sls_upri_rnd_typ_NE(info);
		else if (ne == columnRslt_sls_tax_rnd_typ) doRslt_sls_tax_rnd_typ_NE(info);
		else if (ne == columnRslt_xrate_rnd_typ) doRslt_xrate_rnd_typ_NE(info);
		else if (ne == columnRslt_wtax_rnd_typ) doRslt_wtax_rnd_typ_NE(info);
		else if (ne == columnRslt_purc_schd_no) doRslt_purc_schd_no_NE(info);
		else if (ne == columnRslt_cst_iv_flg) doRslt_cst_iv_flg_NE(info);
		else if (ne == columnRslt_org_trd_cur_upri) doRslt_org_trd_cur_upri_NE(info);
		else if (ne == columnRslt_sls_schd_no) doRslt_sls_schd_no_NE(info);
		else if (ne == columnRslt_prnt_out_flg) doRslt_prnt_out_flg_NE(info);
		else if (ne == columnRslt_sls_act_seq) doRslt_sls_act_seq_NE(info);
		else if (ne == columnRslt_sls_act_d_seq) doRslt_sls_act_d_seq_NE(info);
		else if (ne == columnRslt_schd_trd_unit_conv_base_qty) doRslt_schd_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_schd_trd_unit_conv_qty) doRslt_schd_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NE(info);
		else if (ne == columnRslt_base_unit_qty_bef) doRslt_base_unit_qty_bef_NE(info);
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
	 * [Cnd]パネルの[mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arrv_base_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arrv_base_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arrv_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arrv_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ddlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ddlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_ord_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_ord_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_ord_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_ord_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_iv_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_purc_act_d_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[sls_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_sls_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_valid_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_valid_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[multi_io_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_io_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dtl_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dtl_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prof_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_acxfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_acxfr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty_bef]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_bef_NE(MCEventInfo info){
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
		else if (nx == Cnd_mode_Group) doCnd_mode_NX(info);
		else if (nx == Cnd_arrv_base_sls_flg) doCnd_arrv_base_sls_flg_NX(info);
		else if (nx == Cnd_arrv_sls_flg) doCnd_arrv_sls_flg_NX(info);
		else if (nx == Cnd_sls_cststk_flg) doCnd_sls_cststk_flg_NX(info);
		else if (nx == Cnd_sls_ddlv_flg) doCnd_sls_ddlv_flg_NX(info);
		else if (nx == Cnd_not_ship_ord_sls_flg) doCnd_not_ship_ord_sls_flg_NX(info);
		else if (nx == Cnd_non_schd_flg) doCnd_non_schd_flg_NX(info);
		else if (nx == Cnd_ship_ord_sls_flg) doCnd_ship_ord_sls_flg_NX(info);
		else if (nx == Cnd_iv_flg) doCnd_iv_flg_NX(info);
		else if (nx == Cnd_not_iv_flg) doCnd_not_iv_flg_NX(info);
		else if (nx == Cnd_edi_flg) doCnd_edi_flg_NX(info);
		else if (nx == Cnd_not_edi_flg) doCnd_not_edi_flg_NX(info);
		else if (nx == Cnd_sls_schd_dt_fr) doCnd_sls_schd_dt_fr_NX(info);
		else if (nx == Cnd_sls_schd_dt_to) doCnd_sls_schd_dt_to_NX(info);
		else if (nx == Cnd_sls_dt_fr) doCnd_sls_dt_fr_NX(info);
		else if (nx == Cnd_sls_dt_to) doCnd_sls_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_dest_cd1) doCnd_dest_cd1_NX(info);
		else if (nx == Cnd_dest_nm1) doCnd_dest_nm1_NX(info);
		else if (nx == Cnd_dest_cd2) doCnd_dest_cd2_NX(info);
		else if (nx == Cnd_dest_nm2) doCnd_dest_nm2_NX(info);
		else if (nx == Cnd_dest_cd3) doCnd_dest_cd3_NX(info);
		else if (nx == Cnd_dest_nm3) doCnd_dest_nm3_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NX(info);
		else if (nx == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NX(info);
		else if (nx == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_ship_act_no) doCnd_ship_act_no_NX(info);
		else if (nx == Cnd_sls_act_no) doCnd_sls_act_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NX(info);
		else if (nx == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NX(info);
		else if (nx == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NX(info);
		else if (nx == BulkSet_sls_dt) doBulkSet_sls_dt_NX(info);
		else if (nx == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_NX(info);
		else if (nx == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_sync_flg) doRslt_sync_flg_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_sls_tgt_typ) doRslt_sls_tgt_typ_NX(info);
		else if (nx == columnRslt_sls_tgt_typ_nm) doRslt_sls_tgt_typ_nm_NX(info);
		else if (nx == columnRslt_edi_flg) doRslt_edi_flg_NX(info);
		else if (nx == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_NX(info);
		else if (nx == columnRslt_sls_dt) doRslt_sls_dt_NX(info);
		else if (nx == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NX(info);
		else if (nx == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_upri_dec_place) doRslt_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_multi_flg) doRslt_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_iv_d_no) doRslt_iv_d_no_NX(info);
		else if (nx == columnRslt_ship_act_no) doRslt_ship_act_no_NX(info);
		else if (nx == columnRslt_dlv_ac_ym) doRslt_dlv_ac_ym_NX(info);
		else if (nx == columnRslt_dlv_ac_dt) doRslt_dlv_ac_dt_NX(info);
		else if (nx == columnRslt_sls_act_no) doRslt_sls_act_no_NX(info);
		else if (nx == columnRslt_sls_act_rev) doRslt_sls_act_rev_NX(info);
		else if (nx == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NX(info);
		else if (nx == columnRslt_sls_basis_ym) doRslt_sls_basis_ym_NX(info);
		else if (nx == columnRslt_sls_basis_dt) doRslt_sls_basis_dt_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_qtn_no) doRslt_qtn_no_NX(info);
		else if (nx == columnRslt_qtn_rev) doRslt_qtn_rev_NX(info);
		else if (nx == columnRslt_qtn_d_no) doRslt_qtn_d_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_acst_cd) doRslt_acst_cd_NX(info);
		else if (nx == columnRslt_acst_nm) doRslt_acst_nm_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_dest_cd1) doRslt_dest_cd1_NX(info);
		else if (nx == columnRslt_dest_nm1) doRslt_dest_nm1_NX(info);
		else if (nx == columnRslt_dest_cd2) doRslt_dest_cd2_NX(info);
		else if (nx == columnRslt_dest_nm2) doRslt_dest_nm2_NX(info);
		else if (nx == columnRslt_dest_cd3) doRslt_dest_cd3_NX(info);
		else if (nx == columnRslt_dest_nm3) doRslt_dest_nm3_NX(info);
		else if (nx == columnRslt_ship_lg_grp_cd) doRslt_ship_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_lg_grp_nm) doRslt_ship_lg_grp_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_lot_no_typ) doRslt_lot_no_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NX(info);
		else if (nx == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NX(info);
		else if (nx == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NX(info);
		else if (nx == columnRslt_ship_fr_valid_dt) doRslt_ship_fr_valid_dt_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_multi_io_flg) doRslt_multi_io_flg_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_sls_dtl_upd_flg) doRslt_sls_dtl_upd_flg_NX(info);
		else if (nx == columnRslt_prof_rate) doRslt_prof_rate_NX(info);
		else if (nx == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NX(info);
		else if (nx == columnRslt_sls_rsn_cd) doRslt_sls_rsn_cd_NX(info);
		else if (nx == columnRslt_sls_rsn_nm) doRslt_sls_rsn_nm_NX(info);
		else if (nx == columnRslt_sls_acxfr_flg) doRslt_sls_acxfr_flg_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_wtax_amt) doRslt_wtax_amt_NX(info);
		else if (nx == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_NX(info);
		else if (nx == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_mrkt_judg_flg) doRslt_mrkt_judg_flg_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_purc_act_d_no) doRslt_ext_purc_act_d_no_NX(info);
		else if (nx == columnRslt_ptax_dt) doRslt_ptax_dt_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NX(info);
		else if (nx == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NX(info);
		else if (nx == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NX(info);
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
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_bp_sls_upri_cng_flg) doRslt_bp_sls_upri_cng_flg_NX(info);
		else if (nx == columnRslt_itm_sls_upri_cng_flg) doRslt_itm_sls_upri_cng_flg_NX(info);
		else if (nx == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NX(info);
		else if (nx == columnRslt_sls_amt_rnd_typ) doRslt_sls_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_sls_upri_rnd_typ) doRslt_sls_upri_rnd_typ_NX(info);
		else if (nx == columnRslt_sls_tax_rnd_typ) doRslt_sls_tax_rnd_typ_NX(info);
		else if (nx == columnRslt_xrate_rnd_typ) doRslt_xrate_rnd_typ_NX(info);
		else if (nx == columnRslt_wtax_rnd_typ) doRslt_wtax_rnd_typ_NX(info);
		else if (nx == columnRslt_purc_schd_no) doRslt_purc_schd_no_NX(info);
		else if (nx == columnRslt_cst_iv_flg) doRslt_cst_iv_flg_NX(info);
		else if (nx == columnRslt_org_trd_cur_upri) doRslt_org_trd_cur_upri_NX(info);
		else if (nx == columnRslt_sls_schd_no) doRslt_sls_schd_no_NX(info);
		else if (nx == columnRslt_prnt_out_flg) doRslt_prnt_out_flg_NX(info);
		else if (nx == columnRslt_sls_act_seq) doRslt_sls_act_seq_NX(info);
		else if (nx == columnRslt_sls_act_d_seq) doRslt_sls_act_d_seq_NX(info);
		else if (nx == columnRslt_schd_trd_unit_conv_base_qty) doRslt_schd_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_schd_trd_unit_conv_qty) doRslt_schd_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NX(info);
		else if (nx == columnRslt_base_unit_qty_bef) doRslt_base_unit_qty_bef_NX(info);
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
	 * [Cnd]パネルの[mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arrv_base_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arrv_base_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arrv_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arrv_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ddlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ddlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_ord_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_ord_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_ord_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_ord_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_iv_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_purc_act_d_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[sls_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_sls_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_valid_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_valid_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[multi_io_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_io_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dtl_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dtl_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prof_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_acxfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_acxfr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty_bef]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_bef_NX(MCEventInfo info){
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
		if (lc == Cnd_sls_schd_dt_fr) doCnd_sls_schd_dt_fr_LC(info);
		else if (lc == Cnd_sls_schd_dt_to) doCnd_sls_schd_dt_to_LC(info);
		else if (lc == Cnd_sls_dt_fr) doCnd_sls_dt_fr_LC(info);
		else if (lc == Cnd_sls_dt_to) doCnd_sls_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_dest_cd1) doCnd_dest_cd1_LC(info);
		else if (lc == Cnd_dest_nm1) doCnd_dest_nm1_LC(info);
		else if (lc == Cnd_dest_cd2) doCnd_dest_cd2_LC(info);
		else if (lc == Cnd_dest_nm2) doCnd_dest_nm2_LC(info);
		else if (lc == Cnd_dest_cd3) doCnd_dest_cd3_LC(info);
		else if (lc == Cnd_dest_nm3) doCnd_dest_nm3_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_LC(info);
		else if (lc == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_LC(info);
		else if (lc == Cnd_purc_ddlv_dlv_slip_no) doCnd_purc_ddlv_dlv_slip_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_ship_act_no) doCnd_ship_act_no_LC(info);
		else if (lc == Cnd_sls_act_no) doCnd_sls_act_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_LC(info);
		else if (lc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_LC(info);
		else if (lc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_LC(info);
		else if (lc == BulkSet_sls_dt) doBulkSet_sls_dt_LC(info);
		else if (lc == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_LC(info);
		else if (lc == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_sls_tgt_typ) doRslt_sls_tgt_typ_LC(info);
		else if (lc == columnRslt_sls_tgt_typ_nm) doRslt_sls_tgt_typ_nm_LC(info);
		else if (lc == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_LC(info);
		else if (lc == columnRslt_sls_dt) doRslt_sls_dt_LC(info);
		else if (lc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_LC(info);
		else if (lc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_upri_dec_place) doRslt_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_LC(info);
		else if (lc == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_LC(info);
		else if (lc == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_iv_d_no) doRslt_iv_d_no_LC(info);
		else if (lc == columnRslt_ship_act_no) doRslt_ship_act_no_LC(info);
		else if (lc == columnRslt_dlv_ac_ym) doRslt_dlv_ac_ym_LC(info);
		else if (lc == columnRslt_dlv_ac_dt) doRslt_dlv_ac_dt_LC(info);
		else if (lc == columnRslt_sls_act_no) doRslt_sls_act_no_LC(info);
		else if (lc == columnRslt_sls_act_rev) doRslt_sls_act_rev_LC(info);
		else if (lc == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_LC(info);
		else if (lc == columnRslt_sls_basis_ym) doRslt_sls_basis_ym_LC(info);
		else if (lc == columnRslt_sls_basis_dt) doRslt_sls_basis_dt_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_qtn_no) doRslt_qtn_no_LC(info);
		else if (lc == columnRslt_qtn_rev) doRslt_qtn_rev_LC(info);
		else if (lc == columnRslt_qtn_d_no) doRslt_qtn_d_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_acst_cd) doRslt_acst_cd_LC(info);
		else if (lc == columnRslt_acst_nm) doRslt_acst_nm_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_dest_cd1) doRslt_dest_cd1_LC(info);
		else if (lc == columnRslt_dest_nm1) doRslt_dest_nm1_LC(info);
		else if (lc == columnRslt_dest_cd2) doRslt_dest_cd2_LC(info);
		else if (lc == columnRslt_dest_nm2) doRslt_dest_nm2_LC(info);
		else if (lc == columnRslt_dest_cd3) doRslt_dest_cd3_LC(info);
		else if (lc == columnRslt_dest_nm3) doRslt_dest_nm3_LC(info);
		else if (lc == columnRslt_ship_lg_grp_cd) doRslt_ship_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_lg_grp_nm) doRslt_ship_lg_grp_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_lot_no_typ) doRslt_lot_no_typ_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_LC(info);
		else if (lc == columnRslt_ship_fr_valid_dt) doRslt_ship_fr_valid_dt_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_prof_rate) doRslt_prof_rate_LC(info);
		else if (lc == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_LC(info);
		else if (lc == columnRslt_sls_rsn_cd) doRslt_sls_rsn_cd_LC(info);
		else if (lc == columnRslt_sls_rsn_nm) doRslt_sls_rsn_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_wtax_amt) doRslt_wtax_amt_LC(info);
		else if (lc == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_LC(info);
		else if (lc == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_purc_act_d_no) doRslt_ext_purc_act_d_no_LC(info);
		else if (lc == columnRslt_ptax_dt) doRslt_ptax_dt_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_LC(info);
		else if (lc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_LC(info);
		else if (lc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_LC(info);
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
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_sls_amt_rnd_typ) doRslt_sls_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_sls_upri_rnd_typ) doRslt_sls_upri_rnd_typ_LC(info);
		else if (lc == columnRslt_sls_tax_rnd_typ) doRslt_sls_tax_rnd_typ_LC(info);
		else if (lc == columnRslt_xrate_rnd_typ) doRslt_xrate_rnd_typ_LC(info);
		else if (lc == columnRslt_wtax_rnd_typ) doRslt_wtax_rnd_typ_LC(info);
		else if (lc == columnRslt_purc_schd_no) doRslt_purc_schd_no_LC(info);
		else if (lc == columnRslt_org_trd_cur_upri) doRslt_org_trd_cur_upri_LC(info);
		else if (lc == columnRslt_sls_schd_no) doRslt_sls_schd_no_LC(info);
		else if (lc == columnRslt_sls_act_seq) doRslt_sls_act_seq_LC(info);
		else if (lc == columnRslt_sls_act_d_seq) doRslt_sls_act_d_seq_LC(info);
		else if (lc == columnRslt_schd_trd_unit_conv_base_qty) doRslt_schd_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_schd_trd_unit_conv_qty) doRslt_schd_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_LC(info);
		else if (lc == columnRslt_base_unit_qty_bef) doRslt_base_unit_qty_bef_LC(info);
	}

	/**
	 * [Cnd]パネルの[sls_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ddlv_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ddlv_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_purc_act_d_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[sls_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_sls_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_valid_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_valid_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prof_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty_bef]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_bef_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sls_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_dest_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lot_no]の作成メソッド
	 */
	public MCList getCnd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sublot_no]の作成メソッド
	 */
	public MCList getCnd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ar_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getRslt_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getRslt_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sls_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_sls_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1320.Srch01")) {
			return new MS_MSBBL1320_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1320.Srch02")) {
			return new MS_MSBBL1320_Srch02Bridge();
		}
		if (id.equals("MS.MSBBL1320.Ins01")) {
			return new MS_MSBBL1320_Ins01Bridge();
		}
		if (id.equals("MS.MSBBL1320.Upd01")) {
			return new MS_MSBBL1320_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1320.Del01")) {
			return new MS_MSBBL1320_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1320_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1320_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1320_Srch01Bridge() {
			p_MS_MSBBL1320_Srch01 = new MCParam(PDef.MS_MSBBL1320_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1320_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1320.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));

			p_MS_MSBBL1320_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1320_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1320_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1320_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1320_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1320.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1320.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1320_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1320_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)p_MS_MSBBL1320_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1320_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1320_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL1320_Srch02Bridge() {
			p_MS_MSBBL1320_Srch02 = new MCParam(PDef.MS_MSBBL1320_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1320_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1320.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));

			p_MS_MSBBL1320_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1320_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1320_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1320_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1320_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1320.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1320.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1320_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1320_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)p_MS_MSBBL1320_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1320_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1320_Ins01;

		/** コンストラクタ */
		protected MS_MSBBL1320_Ins01Bridge() {
			p_MS_MSBBL1320_Ins01 = new MCParam(PDef.MS_MSBBL1320_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1320_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1320.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));

			p_MS_MSBBL1320_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1320_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1320_Ins01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1320_Ins01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1320_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1320_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1320.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1320.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1320_Ins01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1320_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)p_MS_MSBBL1320_Ins01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1320_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1320_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1320_Upd01Bridge() {
			p_MS_MSBBL1320_Upd01 = new MCParam(PDef.MS_MSBBL1320_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1320_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1320.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));

			p_MS_MSBBL1320_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1320_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1320_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1320_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1320_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1320_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1320.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1320.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1320_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1320_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)p_MS_MSBBL1320_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1320_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1320_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1320_Del01Bridge() {
			p_MS_MSBBL1320_Del01 = new MCParam(PDef.MS_MSBBL1320_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1320_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1320.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));

			p_MS_MSBBL1320_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1320_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1320_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1320_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1320_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1320_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1320.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1320.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1320.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1320_Del01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1320.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1320_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1320.RsltR>)p_MS_MSBBL1320_Del01.getContainerParam().getDownBlock(0));
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