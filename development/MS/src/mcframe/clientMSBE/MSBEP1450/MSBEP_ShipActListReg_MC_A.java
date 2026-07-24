package mcframe.clientMSBE.MSBEP1450;

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
import mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg_MC.MS_MSBEL1450_Srch01Caller;
import mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg_MC.MS_MSBEL1450_Ins01Caller;
import mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg_MC.MS_MSBEL1450_Del01Caller;
import mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg_MC.MS_MSBEL1450_Prnt01Caller;

/**
 * 画面"MSBEP_ShipActListReg"パネルクラスです。<p>
 *
 * 出荷実績の一覧登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipActListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP1450";

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
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [PrSts]ブロック関連のField定義
	public MCPanel PrStsPanel = null;
	public MCTitledBorder PrStsTitledBorder = null;
	// [PrSts]ブロックの項目のField定義
	// [WmsTrgt]ブロック関連のField定義
	public MCPanel WmsTrgtPanel = null;
	public MCTitledBorder WmsTrgtTitledBorder = null;
	// [WmsTrgt]ブロックの項目のField定義
	// [ShipSts]ブロック関連のField定義
	public MCPanel ShipStsPanel = null;
	public MCTitledBorder ShipStsTitledBorder = null;
	// [ShipSts]ブロックの項目のField定義
	// [DlvPrnt]ブロック関連のField定義
	public MCPanel DlvPrntPanel = null;
	public MCTitledBorder DlvPrntTitledBorder = null;
	// [DlvPrnt]ブロックの項目のField定義
	// [AdvPrnt]ブロック関連のField定義
	public MCPanel AdvPrntPanel = null;
	public MCTitledBorder AdvPrntTitledBorder = null;
	// [AdvPrnt]ブロックの項目のField定義
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [CstCnd]ブロック関連のField定義
	public MCPanel CstCndPanel = null;
	// [CstCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create;DEL,Cancel;PRNT,Issue report;REF,View UPD,登録する;DEL,取り消す;PRNT,帳票発行;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Hdr,Header;Dtl,Details;Dlv,Delivery note HDR,ヘッダ;DTL,明細;DLV,納品書.<p>
	 *
	 */
	public MCButtonGroup Cnd_md_Group = null;
	public MCRadioButton Cnd_md_HDR = null;
	public MCRadioButton Cnd_md_DTL = null;
	public MCRadioButton Cnd_md_DLV = null;
	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ship_flg = null;
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_wms_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_wms_flg = null;
	/**
	 * Desired delivery date delayed 納入希望日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_rqst_flg = null;
	/**
	 * Desired shipping date delayed 出荷希望日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_rqst_flg = null;
	/**
	 * Delivery request date delayed 納品依頼日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_pd_inst_dlv_flg = null;
	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_not_prnted = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_prnted = null;
	/**
	 * Shipping guide unissued 出荷案内書未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_adv_not_prnted = null;
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_adv_prnted = null;
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
	public MCLabel Cnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_site_nm = null;
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
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ssdt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ssdt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ssdt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ssdt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ssdt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_sidt_p_PPanel;
	public MCDateField Cnd_ship_inst_dt_fr;	// [Cnd]の[sidt_p.ymd_fr]を[Cnd_ship_inst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_hm_fr;	// [Cnd]の[sidt_p.hm_fr]を[Cnd_ship_inst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_dt_to;	// [Cnd]の[sidt_p.ymd_to]を[Cnd_ship_inst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_hm_to;	// [Cnd]の[sidt_p.hm_to]を[Cnd_ship_inst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_sdt_p_PPanel;
	public MCDateField Cnd_ship_dt_fr;	// [Cnd]の[sdt_p.ymd_fr]を[Cnd_ship_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_fr;	// [Cnd]の[sdt_p.hm_fr]を[Cnd_ship_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_dt_to;	// [Cnd]の[sdt_p.ymd_to]を[Cnd_ship_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_to;	// [Cnd]の[sdt_p.hm_to]を[Cnd_ship_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dsdt_p_PPanel;
	public MCDateField Cnd_dlv_schd_dt_fr;	// [Cnd]の[dsdt_p.ymd_fr]を[Cnd_dlv_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_fr;	// [Cnd]の[dsdt_p.hm_fr]を[Cnd_dlv_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_dt_to;	// [Cnd]の[dsdt_p.ymd_to]を[Cnd_dlv_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_to;	// [Cnd]の[dsdt_p.hm_to]を[Cnd_dlv_schd_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_ship_loc_cd_Label = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_nm = null;
	public MCLabel Cnd_ship_str_ln_cd_Label = null;
	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_str_ln_cd = null;
	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_ship_str_ln_nm = null;
	public MCLabel Cnd_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_grp_nm = null;
	public MCLabel Cnd_ship_to_id_typ_Label = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_typ_nm = null;
	public MCLabel Cnd_ship_to_id_cd_Label = null;
	/**
	 * Receiving point cd. 送付先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_cd = null;
	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_nm = null;
	public MCLabel Cnd_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_typ_nm = null;
	public MCLabel Cnd_dlv_id_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_nm = null;
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
	public MCLabel Cnd_ship_term_cd_Label = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCTextField Cnd_ship_term_nm = null;
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
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Cnd_act_usr_dpt_p_PPanel;
	public MCTextField Cnd_act_usr_cd;	// [Cnd]の[act_usr_dpt_p.usr_cd]を[Cnd_act_usr_cd]としてエイリアス定義。
	public MCTextField Cnd_act_usr_nm;	// [Cnd]の[act_usr_dpt_p.usr_nm]を[Cnd_act_usr_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_act_dpt_cd;	// [Cnd]の[act_usr_dpt_p.dpt_cd]を[Cnd_act_dpt_cd]としてエイリアス定義。
	public MCTextField Cnd_act_dpt_nm;	// [Cnd]の[act_usr_dpt_p.dpt_nm]を[Cnd_act_dpt_nm]としてエイリアス定義。
	public MCLabel Cnd_ship_schd_no_Label = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_schd_no = null;
	public MCLabel Cnd_ship_inst_no_Label = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_inst_no = null;
	public MCLabel Cnd_ship_act_no_Label = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_act_no = null;
	public MCLabel Cnd_ship_act_d_no_Label = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_act_d_no = null;
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_ext_ship_act_no_Label = null;
	/**
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_ship_act_no = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_can_disp_flg = null;
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
	public MCLabel Cnd_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_d_rmrks = null;
	public MCLabel Cnd_d_sub_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_d_sub_char1 = null;
	public MCLabel Cnd_d_sub_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_d_sub_char2 = null;
	public MCLabel Cnd_d_sub_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_d_sub_char3 = null;
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
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_sdt_p_PPanel;
	public MCDateField BulkSet_ship_dt;	// [BulkSet]の[sdt_p.ymd]を[BulkSet_ship_dt]としてエイリアス定義。
	public MCDateField BulkSet_ship_hm;	// [BulkSet]の[sdt_p.hm]を[BulkSet_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_ddt_p_PPanel;
	public MCDateField BulkSet_dlv_dt;	// [BulkSet]の[ddt_p.ymd]を[BulkSet_dlv_dt]としてエイリアス定義。
	public MCDateField BulkSet_dlv_hm;	// [BulkSet]の[ddt_p.hm]を[BulkSet_dlv_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H BulkSet_ac_dt_p_PPanel;
	public MCDateField BulkSet_ac_dt;	// [BulkSet]の[ac_dt_p.ac_dt]を[BulkSet_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_act_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_act_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_act_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_act_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_act_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_act_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_act_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_act_dpt_nm]としてエイリアス定義。
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox BulkSet_indiv_prnt_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox BulkSet_wms_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox BulkSet_not_wms_flg = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1450.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_p_PPanel;
	public MCColumnConfig columnRslt_ship_dt;// [Rslt]の[ship_p.ymd]を[columnRslt_ship_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_hm;// [Rslt]の[ship_p.hm]を[columnRslt_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_p_PPanel;
	public MCColumnConfig columnRslt_dlv_dt;// [Rslt]の[dlv_p.ymd]を[columnRslt_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_hm;// [Rslt]の[dlv_p.hm]を[columnRslt_dlv_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_ac_dt;// [Rslt]の[ac_dt_p.ac_dt]を[columnRslt_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_inst_p_PPanel;
	public MCColumnConfig columnRslt_ship_inst_dt;// [Rslt]の[ship_inst_p.ymd]を[columnRslt_ship_inst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_inst_hm;// [Rslt]の[ship_inst_p.hm]を[columnRslt_ship_inst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_schd_p_PPanel;
	public MCColumnConfig columnRslt_ship_schd_dt;// [Rslt]の[ship_schd_p.ymd]を[columnRslt_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_schd_hm;// [Rslt]の[ship_schd_p.hm]を[columnRslt_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_schd_p_PPanel;
	public MCColumnConfig columnRslt_dlv_schd_dt;// [Rslt]の[dlv_schd_p.ymd]を[columnRslt_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_schd_hm;// [Rslt]の[dlv_schd_p.hm]を[columnRslt_dlv_schd_hm]としてエイリアス定義。
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_term_nm = null;
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_prnt_flg = null;
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_prnt_flg = null;
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_nm = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_ship_to_p_PPanel;
	public MCColumnConfig columnRslt_show_dtl;// [Rslt]の[ship_to_p.show_dtl]を[columnRslt_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_id_cd;// [Rslt]の[ship_to_p.bp_cd]を[columnRslt_ship_to_id_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_id_nm;// [Rslt]の[ship_to_p.bp_nm]を[columnRslt_ship_to_id_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_sundry_flg;// [Rslt]の[ship_to_p.dlv_sundry_flg]を[columnRslt_ship_to_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_pri_prnt_flg;// [Rslt]の[ship_to_p.pri_prnt_flg]を[columnRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_lg_grp_cd;// [Rslt]の[ship_to_p.lg_grp_cd]を[columnRslt_ship_to_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_lg_grp_nm;// [Rslt]の[ship_to_p.lg_grp_nm]を[columnRslt_ship_to_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntry_cd;// [Rslt]の[ship_to_p.cntry_cd]を[columnRslt_ship_to_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntry_nm;// [Rslt]の[ship_to_p.cntry_nm]を[columnRslt_ship_to_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_zip_cd;// [Rslt]の[ship_to_p.zip_cd]を[columnRslt_ship_to_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr1;// [Rslt]の[ship_to_p.addr1]を[columnRslt_ship_to_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr2;// [Rslt]の[ship_to_p.addr2]を[columnRslt_ship_to_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr3;// [Rslt]の[ship_to_p.addr3]を[columnRslt_ship_to_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr4;// [Rslt]の[ship_to_p.addr4]を[columnRslt_ship_to_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_tel;// [Rslt]の[ship_to_p.tel]を[columnRslt_ship_to_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_fax;// [Rslt]の[ship_to_p.fax]を[columnRslt_ship_to_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_dpt;// [Rslt]の[ship_to_p.dlv_cntct_dpt]を[columnRslt_ship_to_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_psn;// [Rslt]の[ship_to_p.dlv_cntct_psn]を[columnRslt_ship_to_cntct_psn]としてエイリアス定義。
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_nm = null;
	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_str_ln_cd = null;
	/**
	 * Delivery rack/line name 納品棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_str_ln_nm = null;
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
	/**
	 * Request PIC cd. 依頼担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_cd = null;
	/**
	 * Request PIC name 依頼担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_nm = null;
	/**
	 * Request dept. cd. 依頼部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_cd = null;
	/**
	 * Request dept. name 依頼部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
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
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_schd_qty;// [Rslt]の[schd_qty_p.qty]を[columnRslt_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_inst_qty;// [Rslt]の[inst_qty_p.qty]を[columnRslt_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_act_cont_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_qty;// [Rslt]の[act_cont_p.cont_qty]を[columnRslt_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_std_cont_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_qty;// [Rslt]の[std_cont_p.cont_qty]を[columnRslt_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_rqst_p_PPanel;
	public MCColumnConfig columnRslt_dlv_rqst_dt;// [Rslt]の[dlv_rqst_p.ymd]を[columnRslt_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_rqst_hm;// [Rslt]の[dlv_rqst_p.hm]を[columnRslt_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_pd_inst_dlv_p_PPanel;
	public MCColumnConfig columnRslt_pd_inst_dlv_dt;// [Rslt]の[pd_inst_dlv_p.ymd]を[columnRslt_pd_inst_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_pd_inst_dlv_hm;// [Rslt]の[pd_inst_dlv_p.hm]を[columnRslt_pd_inst_dlv_hm]としてエイリアス定義。
	/**
	 * Arrival day type (Week) 着曜日区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_day_week_typ = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_day_week_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_rqst_p_PPanel;
	public MCColumnConfig columnRslt_ship_rqst_dt;// [Rslt]の[ship_rqst_p.ymd]を[columnRslt_ship_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_hm;// [Rslt]の[ship_rqst_p.hm]を[columnRslt_ship_rqst_hm]としてエイリアス定義。
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_dlv_slip_no = null;
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_prov_act_no = null;
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_ac_dt = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_cnt_rmrks = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_ship_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_ship_str_ln_cd;// [Rslt]の[ship_str_ln_p.str_ln_cd]を[columnRslt_ship_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_str_ln_nm;// [Rslt]の[ship_str_ln_p.str_ln_nm]を[columnRslt_ship_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_str_ln_cd_none_flg;// [Rslt]の[ship_str_ln_p.str_ln_cd_none_flg]を[columnRslt_ship_str_ln_cd_none_flg]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_sublot_no]としてエイリアス定義。
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
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_cnt = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dim = null;
	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_cnt = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_no = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_d_no = null;
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
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_ship_act_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_no = null;
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wms_flg = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_d_no = null;
	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_disp_seq = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_seq = null;
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_rev = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_d_no = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_act_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_act_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_act_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_act_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_act_dpt_nm]としてエイリアス定義。
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_prnted_flg = null;
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_prnted_flg = null;
	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_dlv_prnt_flg = null;
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
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_d_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_sub_char3 = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1450.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_no = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_no = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_pr_no = null;
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_pr_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Shipping result entry 出荷実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1440 = null;
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public MCButton Btn_prnt_dlv_slip = null;
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public MCButton Btn_prnt_ship_adv = null;
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public MCButton Btn_prnt_stklst = null;
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
	 * Select delivery note immediate issue 納品書即時発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_dlv_prnt = null;
	/**
	 * Select all delivery note immediate issue 納品書即時発行全選択.<p>
	 *
	 */
	public MCButton Btn_dlv_prnt_select_all = null;
	/**
	 * Release all delivery note immediate issue 納品書即時発行全解除.<p>
	 *
	 */
	public MCButton Btn_dlv_prnt_deselect_all = null;
	/**
	 * Select shipping guide?immediate issue 出荷案内書即時発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_adv_prnt = null;
	/**
	 * Select all shipping guide immediate issue 出荷案内書即時発行全選択.<p>
	 *
	 */
	public MCButton Btn_adv_prnt_select_all = null;
	/**
	 * Release all shipping guide?immediate issue 出荷案内書即時発行全解除.<p>
	 *
	 */
	public MCButton Btn_adv_prnt_deselect_all = null;
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
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [SRCH_REF_HDR]モードを表す定数 */
	public static final String SRCH_REF_HDR = "SRCH_REF_HDR";
	/** [SRCH_REF_DTL]モードを表す定数 */
	public static final String SRCH_REF_DTL = "SRCH_REF_DTL";
	/** [SRCH_PRNT_DLV]モードを表す定数 */
	public static final String SRCH_PRNT_DLV = "SRCH_PRNT_DLV";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";
	/** [PRNT_DLV]モードを表す定数 */
	public static final String PRNT_DLV = "PRNT_DLV";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UPD, SRCH_DEL, SRCH_REF_HDR, SRCH_REF_DTL, SRCH_PRNT_DLV, UPD, FIX_U, DEL, FIX_D, PRNT, PRNT_DLV, REF_HDR, REF_DTL};
	
	/** [MS_MSBEL1450_Srch01]のCallerの作成 */
	protected MSBEP_ShipActListReg_MC.MS_MSBEL1450_Srch01Caller createMS_MSBEL1450_Srch01() {
		MSBEP_ShipActListReg_MC.MS_MSBEL1450_Srch01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Srch01Bridge>
		caller = ((MSBEP_ShipActListReg_MC)this).new MS_MSBEL1450_Srch01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Srch01Bridge>(
					(MSBEP_ShipActListReg)this, new MS_MSBEL1450_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1450_Srch01]の呼び出し */
	protected void callMS_MSBEL1450_Srch01() {
		MCCaller caller = createMS_MSBEL1450_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1450_Ins01]のCallerの作成 */
	protected MSBEP_ShipActListReg_MC.MS_MSBEL1450_Ins01Caller createMS_MSBEL1450_Ins01() {
		MSBEP_ShipActListReg_MC.MS_MSBEL1450_Ins01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Ins01Bridge>
		caller = ((MSBEP_ShipActListReg_MC)this).new MS_MSBEL1450_Ins01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Ins01Bridge>(
					(MSBEP_ShipActListReg)this, new MS_MSBEL1450_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL1450_Ins01]の呼び出し */
	protected void callMS_MSBEL1450_Ins01() {
		MCCaller caller = createMS_MSBEL1450_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL1450_Del01]のCallerの作成 */
	protected MSBEP_ShipActListReg_MC.MS_MSBEL1450_Del01Caller createMS_MSBEL1450_Del01() {
		MSBEP_ShipActListReg_MC.MS_MSBEL1450_Del01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Del01Bridge>
		caller = ((MSBEP_ShipActListReg_MC)this).new MS_MSBEL1450_Del01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Del01Bridge>(
					(MSBEP_ShipActListReg)this, new MS_MSBEL1450_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1450_Del01]の呼び出し */
	protected void callMS_MSBEL1450_Del01() {
		MCCaller caller = createMS_MSBEL1450_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1450_Prnt01]のCallerの作成 */
	protected MSBEP_ShipActListReg_MC.MS_MSBEL1450_Prnt01Caller createMS_MSBEL1450_Prnt01() {
		MSBEP_ShipActListReg_MC.MS_MSBEL1450_Prnt01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Prnt01Bridge>
		caller = ((MSBEP_ShipActListReg_MC)this).new MS_MSBEL1450_Prnt01Caller<MSBEP_ShipActListReg, MS_MSBEL1450_Prnt01Bridge>(
					(MSBEP_ShipActListReg)this, new MS_MSBEL1450_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1450_Prnt01]の呼び出し */
	protected void callMS_MSBEL1450_Prnt01() {
		MCCaller caller = createMS_MSBEL1450_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1450.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1450.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1450.RsltR> aRsltL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1450.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1450.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1450.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1450.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1450.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBE.MSBEP1450.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1450.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1450.BulkSetR createBulkSetR() {
		return mcframe.clientMSBE.MSBEP1450.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1450.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1450.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1450.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1450.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1450.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class);
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
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1450.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1450.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1450.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1450.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1450.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1450.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(SrchModePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(PrStsPanel);
		ret.add(WmsTrgtPanel);
		ret.add(ShipStsPanel);
		ret.add(DlvPrntPanel);
		ret.add(AdvPrntPanel);
		ret.add(DlvCndPanel);
		ret.add(CstCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipActListReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipActListReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_ShipActListReg_MC.jbCreateScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateSrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateTop((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateFold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateTab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateTab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateTab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateTab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreatePrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateWmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateDlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateAdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateDlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateCstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateCtrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateRPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateBulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateRslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateDtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateBtn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbCreateEastBtn((MSBEP_ShipActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ShipActListReg p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBEP_ShipActListReg p) {
	}

	/**
	 * [PrSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrSts(MSBEP_ShipActListReg p) {
	}

	/**
	 * [WmsTrgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWmsTrgt(MSBEP_ShipActListReg p) {
	}

	/**
	 * [ShipSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipSts(MSBEP_ShipActListReg p) {
	}

	/**
	 * [DlvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvPrnt(MSBEP_ShipActListReg p) {
	}

	/**
	 * [AdvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdvPrnt(MSBEP_ShipActListReg p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBEP_ShipActListReg p) {
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBEP_ShipActListReg p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipActListReg p) {
		p.Cnd_ssdt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ssdt_p());
		p.Cnd_ssdt_p_PPanel.setName("Cnd.ssdt_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
		p.Cnd_sidt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().sidt_p());
		p.Cnd_sidt_p_PPanel.setName("Cnd.sidt_p");
		p.Cnd_ship_inst_dt_fr = p.Cnd_sidt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_inst_dt_fr.addAliasName("Cnd.ship_inst_dt_fr", p);
		p.Cnd_ship_inst_hm_fr = p.Cnd_sidt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_inst_hm_fr.addAliasName("Cnd.ship_inst_hm_fr", p);
		p.Cnd_ship_inst_dt_to = p.Cnd_sidt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_inst_dt_to.addAliasName("Cnd.ship_inst_dt_to", p);
		p.Cnd_ship_inst_hm_to = p.Cnd_sidt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_inst_hm_to.addAliasName("Cnd.ship_inst_hm_to", p);
		p.Cnd_sdt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().sdt_p());
		p.Cnd_sdt_p_PPanel.setName("Cnd.sdt_p");
		p.Cnd_ship_dt_fr = p.Cnd_sdt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_dt_fr.addAliasName("Cnd.ship_dt_fr", p);
		p.Cnd_ship_hm_fr = p.Cnd_sdt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_hm_fr.addAliasName("Cnd.ship_hm_fr", p);
		p.Cnd_ship_dt_to = p.Cnd_sdt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_dt_to.addAliasName("Cnd.ship_dt_to", p);
		p.Cnd_ship_hm_to = p.Cnd_sdt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_hm_to.addAliasName("Cnd.ship_hm_to", p);
		p.Cnd_dsdt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dsdt_p());
		p.Cnd_dsdt_p_PPanel.setName("Cnd.dsdt_p");
		p.Cnd_dlv_schd_dt_fr = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_schd_dt_fr.addAliasName("Cnd.dlv_schd_dt_fr", p);
		p.Cnd_dlv_schd_hm_fr = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_schd_hm_fr.addAliasName("Cnd.dlv_schd_hm_fr", p);
		p.Cnd_dlv_schd_dt_to = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_schd_dt_to.addAliasName("Cnd.dlv_schd_dt_to", p);
		p.Cnd_dlv_schd_hm_to = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_schd_hm_to.addAliasName("Cnd.dlv_schd_hm_to", p);
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
		p.Cnd_act_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getCndR().act_usr_dpt_p());
		p.Cnd_act_usr_dpt_p_PPanel.setName("Cnd.act_usr_dpt_p");
		p.Cnd_act_usr_cd = p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Cnd_act_usr_cd.addAliasName("Cnd.act_usr_cd", p);
		p.Cnd_act_usr_nm = p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Cnd_act_usr_nm.addAliasName("Cnd.act_usr_nm", p);
		p.Cnd_act_dpt_cd = p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Cnd_act_dpt_cd.addAliasName("Cnd.act_dpt_cd", p);
		p.Cnd_act_dpt_nm = p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Cnd_act_dpt_nm.addAliasName("Cnd.act_dpt_nm", p);
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_ShipActListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_ShipActListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_ShipActListReg p) {
		p.BulkSet_sdt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().sdt_p());
		p.BulkSet_sdt_p_PPanel.setName("BulkSet.sdt_p");
		p.BulkSet_ship_dt = p.BulkSet_sdt_p_PPanel.YmdHm_ymd;
		p.BulkSet_ship_dt.addAliasName("BulkSet.ship_dt", p);
		p.BulkSet_ship_hm = p.BulkSet_sdt_p_PPanel.YmdHm_hm;
		p.BulkSet_ship_hm.addAliasName("BulkSet.ship_hm", p);
		p.BulkSet_ddt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().ddt_p());
		p.BulkSet_ddt_p_PPanel.setName("BulkSet.ddt_p");
		p.BulkSet_dlv_dt = p.BulkSet_ddt_p_PPanel.YmdHm_ymd;
		p.BulkSet_dlv_dt.addAliasName("BulkSet.dlv_dt", p);
		p.BulkSet_dlv_hm = p.BulkSet_ddt_p_PPanel.YmdHm_hm;
		p.BulkSet_dlv_hm.addAliasName("BulkSet.dlv_hm", p);
		p.BulkSet_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getBulkSetR().ac_dt_p());
		p.BulkSet_ac_dt_p_PPanel.setName("BulkSet.ac_dt_p");
		p.BulkSet_ac_dt = p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt;
		p.BulkSet_ac_dt.addAliasName("BulkSet.ac_dt", p);
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_act_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_act_usr_cd.addAliasName("BulkSet.act_usr_cd", p);
		p.BulkSet_act_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_act_usr_nm.addAliasName("BulkSet.act_usr_nm", p);
		p.BulkSet_act_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_act_dpt_cd.addAliasName("BulkSet.act_dpt_cd", p);
		p.BulkSet_act_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_act_dpt_nm.addAliasName("BulkSet.act_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_ShipActListReg p) {
		p.Rslt_ship_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ship_p);
		p.Rslt_ship_p_PPanel.setName("Rslt.ship_p");
		p.columnRslt_ship_dt = p.Rslt_ship_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_dt.addAliasName("Rslt.ship_dt", p);
		p.columnRslt_ship_hm = p.Rslt_ship_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_hm.addAliasName("Rslt.ship_hm", p);
		p.Rslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$dlv_p);
		p.Rslt_dlv_p_PPanel.setName("Rslt.dlv_p");
		p.columnRslt_dlv_dt = p.Rslt_dlv_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_dt.addAliasName("Rslt.dlv_dt", p);
		p.columnRslt_dlv_hm = p.Rslt_dlv_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_hm.addAliasName("Rslt.dlv_hm", p);
		p.Rslt_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ac_dt_p);
		p.Rslt_ac_dt_p_PPanel.setName("Rslt.ac_dt_p");
		p.columnRslt_ac_dt = p.Rslt_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_ac_dt.addAliasName("Rslt.ac_dt", p);
		p.Rslt_ship_inst_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ship_inst_p);
		p.Rslt_ship_inst_p_PPanel.setName("Rslt.ship_inst_p");
		p.columnRslt_ship_inst_dt = p.Rslt_ship_inst_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_inst_dt.addAliasName("Rslt.ship_inst_dt", p);
		p.columnRslt_ship_inst_hm = p.Rslt_ship_inst_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_inst_hm.addAliasName("Rslt.ship_inst_hm", p);
		p.Rslt_ship_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ship_schd_p);
		p.Rslt_ship_schd_p_PPanel.setName("Rslt.ship_schd_p");
		p.columnRslt_ship_schd_dt = p.Rslt_ship_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_schd_dt.addAliasName("Rslt.ship_schd_dt", p);
		p.columnRslt_ship_schd_hm = p.Rslt_ship_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_schd_hm.addAliasName("Rslt.ship_schd_hm", p);
		p.Rslt_dlv_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$dlv_schd_p);
		p.Rslt_dlv_schd_p_PPanel.setName("Rslt.dlv_schd_p");
		p.columnRslt_dlv_schd_dt = p.Rslt_dlv_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_schd_dt.addAliasName("Rslt.dlv_schd_dt", p);
		p.columnRslt_dlv_schd_hm = p.Rslt_dlv_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_schd_hm.addAliasName("Rslt.dlv_schd_hm", p);
		p.Rslt_ship_to_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ship_to_p);
		p.Rslt_ship_to_p_PPanel.setName("Rslt.ship_to_p");
		p.columnRslt_show_dtl = p.Rslt_ship_to_p_PPanel.columnDlv_show_dtl;
		p.columnRslt_show_dtl.addAliasName("Rslt.show_dtl", p);
		p.columnRslt_ship_to_id_cd = p.Rslt_ship_to_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_ship_to_id_cd.addAliasName("Rslt.ship_to_id_cd", p);
		p.columnRslt_ship_to_id_nm = p.Rslt_ship_to_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_ship_to_id_nm.addAliasName("Rslt.ship_to_id_nm", p);
		p.columnRslt_ship_to_sundry_flg = p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_ship_to_sundry_flg.addAliasName("Rslt.ship_to_sundry_flg", p);
		p.columnRslt_pri_prnt_flg = p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_pri_prnt_flg.addAliasName("Rslt.pri_prnt_flg", p);
		p.columnRslt_ship_to_lg_grp_cd = p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt_ship_to_lg_grp_cd.addAliasName("Rslt.ship_to_lg_grp_cd", p);
		p.columnRslt_ship_to_lg_grp_nm = p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt_ship_to_lg_grp_nm.addAliasName("Rslt.ship_to_lg_grp_nm", p);
		p.columnRslt_ship_to_cntry_cd = p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_ship_to_cntry_cd.addAliasName("Rslt.ship_to_cntry_cd", p);
		p.columnRslt_ship_to_cntry_nm = p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_ship_to_cntry_nm.addAliasName("Rslt.ship_to_cntry_nm", p);
		p.columnRslt_ship_to_zip_cd = p.Rslt_ship_to_p_PPanel.columnDlv_zip_cd;
		p.columnRslt_ship_to_zip_cd.addAliasName("Rslt.ship_to_zip_cd", p);
		p.columnRslt_ship_to_addr1 = p.Rslt_ship_to_p_PPanel.columnDlv_addr1;
		p.columnRslt_ship_to_addr1.addAliasName("Rslt.ship_to_addr1", p);
		p.columnRslt_ship_to_addr2 = p.Rslt_ship_to_p_PPanel.columnDlv_addr2;
		p.columnRslt_ship_to_addr2.addAliasName("Rslt.ship_to_addr2", p);
		p.columnRslt_ship_to_addr3 = p.Rslt_ship_to_p_PPanel.columnDlv_addr3;
		p.columnRslt_ship_to_addr3.addAliasName("Rslt.ship_to_addr3", p);
		p.columnRslt_ship_to_addr4 = p.Rslt_ship_to_p_PPanel.columnDlv_addr4;
		p.columnRslt_ship_to_addr4.addAliasName("Rslt.ship_to_addr4", p);
		p.columnRslt_ship_to_tel = p.Rslt_ship_to_p_PPanel.columnDlv_tel;
		p.columnRslt_ship_to_tel.addAliasName("Rslt.ship_to_tel", p);
		p.columnRslt_ship_to_fax = p.Rslt_ship_to_p_PPanel.columnDlv_fax;
		p.columnRslt_ship_to_fax.addAliasName("Rslt.ship_to_fax", p);
		p.columnRslt_ship_to_cntct_dpt = p.Rslt_ship_to_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt_ship_to_cntct_dpt.addAliasName("Rslt.ship_to_cntct_dpt", p);
		p.columnRslt_ship_to_cntct_psn = p.Rslt_ship_to_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt_ship_to_cntct_psn.addAliasName("Rslt.ship_to_cntct_psn", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$itm_p);
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
		p.Rslt_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.Rslt_ver_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ver_p);
		p.Rslt_ver_p_PPanel.setName("Rslt.ver_p");
		p.columnRslt_ver_no = p.Rslt_ver_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$base_qty_p);
		p.Rslt_base_qty_p_PPanel.setName("Rslt.base_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$schd_qty_p);
		p.Rslt_schd_qty_p_PPanel.setName("Rslt.schd_qty_p");
		p.columnRslt_schd_qty = p.Rslt_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_schd_qty.addAliasName("Rslt.schd_qty", p);
		p.Rslt_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$inst_qty_p);
		p.Rslt_inst_qty_p_PPanel.setName("Rslt.inst_qty_p");
		p.columnRslt_inst_qty = p.Rslt_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_inst_qty.addAliasName("Rslt.inst_qty", p);
		p.Rslt_act_cont_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$act_cont_p);
		p.Rslt_act_cont_p_PPanel.setName("Rslt.act_cont_p");
		p.columnRslt_act_cont_qty = p.Rslt_act_cont_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_act_cont_qty.addAliasName("Rslt.act_cont_qty", p);
		p.Rslt_act_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$act_fctr_p);
		p.Rslt_act_fctr_p_PPanel.setName("Rslt.act_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$std_cont_p);
		p.Rslt_std_cont_p_PPanel.setName("Rslt.std_cont_p");
		p.columnRslt_std_cont_qty = p.Rslt_std_cont_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_std_cont_qty.addAliasName("Rslt.std_cont_qty", p);
		p.Rslt_std_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$std_fctr_p);
		p.Rslt_std_fctr_p_PPanel.setName("Rslt.std_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$cont_unit_p);
		p.Rslt_cont_unit_p_PPanel.setName("Rslt.cont_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_dlv_rqst_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$dlv_rqst_p);
		p.Rslt_dlv_rqst_p_PPanel.setName("Rslt.dlv_rqst_p");
		p.columnRslt_dlv_rqst_dt = p.Rslt_dlv_rqst_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_rqst_dt.addAliasName("Rslt.dlv_rqst_dt", p);
		p.columnRslt_dlv_rqst_hm = p.Rslt_dlv_rqst_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_rqst_hm.addAliasName("Rslt.dlv_rqst_hm", p);
		p.Rslt_pd_inst_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$pd_inst_dlv_p);
		p.Rslt_pd_inst_dlv_p_PPanel.setName("Rslt.pd_inst_dlv_p");
		p.columnRslt_pd_inst_dlv_dt = p.Rslt_pd_inst_dlv_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_pd_inst_dlv_dt.addAliasName("Rslt.pd_inst_dlv_dt", p);
		p.columnRslt_pd_inst_dlv_hm = p.Rslt_pd_inst_dlv_p_PPanel.columnYmdHm_hm;
		p.columnRslt_pd_inst_dlv_hm.addAliasName("Rslt.pd_inst_dlv_hm", p);
		p.Rslt_ship_rqst_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ship_rqst_p);
		p.Rslt_ship_rqst_p_PPanel.setName("Rslt.ship_rqst_p");
		p.columnRslt_ship_rqst_dt = p.Rslt_ship_rqst_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_rqst_dt.addAliasName("Rslt.ship_rqst_dt", p);
		p.columnRslt_ship_rqst_hm = p.Rslt_ship_rqst_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_rqst_hm.addAliasName("Rslt.ship_rqst_hm", p);
		p.Rslt_ship_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$ship_str_ln_p);
		p.Rslt_ship_str_ln_p_PPanel.setName("Rslt.ship_str_ln_p");
		p.columnRslt_ship_str_ln_cd = p.Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_ship_str_ln_cd.addAliasName("Rslt.ship_str_ln_cd", p);
		p.columnRslt_ship_str_ln_nm = p.Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_ship_str_ln_nm.addAliasName("Rslt.ship_str_ln_nm", p);
		p.columnRslt_ship_str_ln_cd_none_flg = p.Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_ship_str_ln_cd_none_flg.addAliasName("Rslt.ship_str_ln_cd_none_flg", p);
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_act_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_act_usr_cd.addAliasName("Rslt.act_usr_cd", p);
		p.columnRslt_act_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_act_usr_nm.addAliasName("Rslt.act_usr_nm", p);
		p.columnRslt_act_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_act_dpt_cd.addAliasName("Rslt.act_dpt_cd", p);
		p.columnRslt_act_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_act_dpt_nm.addAliasName("Rslt.act_dpt_nm", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$dlv_grp_p);
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
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$cst_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$itm_grp_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1450.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_ShipActListReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ShipActListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_ShipActListReg p) {
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

	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
	}
	
	
	/** [Cnd_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_site_cd_p = null;

	/**
	 * [Cnd_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_site_cd_ListPutter() {
		if (Cnd_site_cd_p == null) {
			Cnd_site_cd_p = createCnd_site_cd_ListPutter(Cnd_site_cd, "site_cd", "site_nm");

		}
		return Cnd_site_cd_p;
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
	
	
	/** [Cnd_ship_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_loc_cd_p = null;

	/**
	 * [Cnd_ship_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_loc_cd_ListPutter() {
		if (Cnd_ship_loc_cd_p == null) {
			Cnd_ship_loc_cd_p = createCnd_ship_loc_cd_ListPutter(Cnd_ship_loc_cd, "ship_loc_cd", "ship_loc_nm");

		}
		return Cnd_ship_loc_cd_p;
	}
	
	
	/** [Cnd_ship_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_str_ln_cd_p = null;

	/**
	 * [Cnd_ship_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_str_ln_cd_ListPutter() {
		if (Cnd_ship_str_ln_cd_p == null) {
			Cnd_ship_str_ln_cd_p = createCnd_ship_str_ln_cd_ListPutter(Cnd_ship_str_ln_cd, "ship_str_ln_cd", "ship_str_ln_nm");

		}
		return Cnd_ship_str_ln_cd_p;
	}
	
	
	/** [Cnd_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_grp_cd_p = null;

	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_grp_cd_ListPutter() {
		if (Cnd_alloc_grp_cd_p == null) {
			Cnd_alloc_grp_cd_p = createCnd_alloc_grp_cd_ListPutter(Cnd_alloc_grp_cd, "alloc_grp_cd", "alloc_grp_nm");

		}
		return Cnd_alloc_grp_cd_p;
	}
	
	
	/** [Cnd_ship_to_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_to_id_typ_p = null;

	/**
	 * [Cnd_ship_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_to_id_typ_ListPutter() {
		if (Cnd_ship_to_id_typ_p == null) {
			Cnd_ship_to_id_typ_p = createCnd_ship_to_id_typ_ListPutter(Cnd_ship_to_id_typ, "ship_to_id_typ", "ship_to_id_typ_nm");

		}
		return Cnd_ship_to_id_typ_p;
	}
	
	
	/** [Cnd_ship_to_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_to_id_cd_p = null;

	/**
	 * [Cnd_ship_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_to_id_cd_ListPutter() {
		if (Cnd_ship_to_id_cd_p == null) {
			Cnd_ship_to_id_cd_p = createCnd_ship_to_id_cd_ListPutter(Cnd_ship_to_id_cd, "ship_to_id_cd", "ship_to_id_nm");

		}
		return Cnd_ship_to_id_cd_p;
	}
	
	
	/** [Cnd_dlv_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_typ_p = null;

	/**
	 * [Cnd_dlv_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_typ_ListPutter() {
		if (Cnd_dlv_id_typ_p == null) {
			Cnd_dlv_id_typ_p = createCnd_dlv_id_typ_ListPutter(Cnd_dlv_id_typ, "dlv_id_typ", "dlv_id_typ_nm");

		}
		return Cnd_dlv_id_typ_p;
	}
	
	
	/** [Cnd_dlv_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_cd_p = null;

	/**
	 * [Cnd_dlv_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_cd_ListPutter() {
		if (Cnd_dlv_id_cd_p == null) {
			Cnd_dlv_id_cd_p = createCnd_dlv_id_cd_ListPutter(Cnd_dlv_id_cd, "dlv_id_cd", "dlv_id_nm");

		}
		return Cnd_dlv_id_cd_p;
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
	
	
	/** [Cnd_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_term_cd_p = null;

	/**
	 * [Cnd_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_term_cd_ListPutter() {
		if (Cnd_ship_term_cd_p == null) {
			Cnd_ship_term_cd_p = createCnd_ship_term_cd_ListPutter(Cnd_ship_term_cd, "ship_term_cd", "ship_term_nm");

		}
		return Cnd_ship_term_cd_p;
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
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm");
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
	
	
	/** [Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "act_dpt_cd", "act_dpt_nm");
		}
		return Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "act_dpt_cd", "act_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd, "ship_str_ln_cd", "ship_str_ln_nm");
		}
		return Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "act_dpt_cd", "act_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipActListReg create(){
		MSBEP_ShipActListReg p = new MSBEP_ShipActListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipActListReg create(String name){
		MSBEP_ShipActListReg p = new MSBEP_ShipActListReg(name);
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
		MSBEP_ShipActListReg_MC.jbfInitScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitSrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitTop((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitFold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitTab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitTab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitTab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitTab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitPrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitWmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitDlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitAdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitDlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitCstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitCtrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitRPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitBulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitRslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitDtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitBtn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbfInitEastBtn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitSrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitTop((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitFold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitTab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitTab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitTab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitTab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitPrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitWmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitDlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitAdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitDlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitCstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitCtrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitRPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitBulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitRslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitDtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitBtn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.jbInitEastBtn((MSBEP_ShipActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ShipActListReg p) {
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
	protected static void jbfInitTab1(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrSts(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.PrStsPanel = p.beansFactory.createPanel("PrSts");
		p.PrStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [WmsTrgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWmsTrgt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.WmsTrgtPanel = p.beansFactory.createPanel("WmsTrgt");
		p.WmsTrgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ShipSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipSts(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.ShipStsPanel = p.beansFactory.createPanel("ShipSts");
		p.ShipStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvPrnt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.DlvPrntPanel = p.beansFactory.createPanel("DlvPrnt");
		p.DlvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [AdvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdvPrnt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.AdvPrntPanel = p.beansFactory.createPanel("AdvPrnt");
		p.AdvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_md_Group = p.beansFactory.createButtonGroup("Cnd.md");
		p.Cnd_md_HDR = p.beansFactory.createRadioButton("Cnd.md_HDR");
		p.Cnd_md_DTL = p.beansFactory.createRadioButton("Cnd.md_DTL");
		p.Cnd_md_DLV = p.beansFactory.createRadioButton("Cnd.md_DLV");
		p.Cnd_not_ship_flg = p.beansFactory.createCheckBox("Cnd.not_ship_flg");
		p.Cnd_ship_flg = p.beansFactory.createCheckBox("Cnd.ship_flg");
		p.Cnd_wms_flg = p.beansFactory.createCheckBox("Cnd.wms_flg");
		p.Cnd_not_wms_flg = p.beansFactory.createCheckBox("Cnd.not_wms_flg");
		p.Cnd_dlv_rqst_flg = p.beansFactory.createCheckBox("Cnd.dlv_rqst_flg");
		p.Cnd_ship_rqst_flg = p.beansFactory.createCheckBox("Cnd.ship_rqst_flg");
		p.Cnd_pd_inst_dlv_flg = p.beansFactory.createCheckBox("Cnd.pd_inst_dlv_flg");
		p.Cnd_dlv_not_prnted = p.beansFactory.createCheckBox("Cnd.dlv_not_prnted");
		p.Cnd_dlv_prnted = p.beansFactory.createCheckBox("Cnd.dlv_prnted");
		p.Cnd_adv_not_prnted = p.beansFactory.createCheckBox("Cnd.adv_not_prnted");
		p.Cnd_adv_prnted = p.beansFactory.createCheckBox("Cnd.adv_prnted");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_ship_loc_cd_Label = p.beansFactory.createLabel("Cnd.ship_loc_cd_Label");
		p.Cnd_ship_loc_cd = p.beansFactory.createTextComboBox("Cnd.ship_loc_cd");
		p.Cnd_ship_loc_cd.setLabel(p.Cnd_ship_loc_cd_Label);
		p.Cnd_ship_loc_nm = p.beansFactory.createTextField("Cnd.ship_loc_nm");
		p.Cnd_ship_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.ship_str_ln_cd_Label");
		p.Cnd_ship_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.ship_str_ln_cd");
		p.Cnd_ship_str_ln_cd.setLabel(p.Cnd_ship_str_ln_cd_Label);
		p.Cnd_ship_str_ln_nm = p.beansFactory.createTextField("Cnd.ship_str_ln_nm");
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_ship_to_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_to_id_typ_Label");
		p.Cnd_ship_to_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_to_id_typ");
		p.Cnd_ship_to_id_typ.setLabel(p.Cnd_ship_to_id_typ_Label);
		p.Cnd_ship_to_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_to_id_typ_nm");
		p.Cnd_ship_to_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_to_id_cd_Label");
		p.Cnd_ship_to_id_cd = p.beansFactory.createTextField("Cnd.ship_to_id_cd");
		p.Cnd_ship_to_id_cd.setLabel(p.Cnd_ship_to_id_cd_Label);
		p.Cnd_ship_to_id_nm = p.beansFactory.createTextField("Cnd.ship_to_id_nm");
		p.Cnd_dlv_id_typ_Label = p.beansFactory.createLabel("Cnd.dlv_id_typ_Label");
		p.Cnd_dlv_id_typ = p.beansFactory.createTextComboBox("Cnd.dlv_id_typ");
		p.Cnd_dlv_id_typ.setLabel(p.Cnd_dlv_id_typ_Label);
		p.Cnd_dlv_id_typ_nm = p.beansFactory.createTextField("Cnd.dlv_id_typ_nm");
		p.Cnd_dlv_id_cd_Label = p.beansFactory.createLabel("Cnd.dlv_id_cd_Label");
		p.Cnd_dlv_id_cd = p.beansFactory.createTextField("Cnd.dlv_id_cd");
		p.Cnd_dlv_id_cd.setLabel(p.Cnd_dlv_id_cd_Label);
		p.Cnd_dlv_id_nm = p.beansFactory.createTextField("Cnd.dlv_id_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_ship_term_cd_Label = p.beansFactory.createLabel("Cnd.ship_term_cd_Label");
		p.Cnd_ship_term_cd = p.beansFactory.createTextComboBox("Cnd.ship_term_cd");
		p.Cnd_ship_term_cd.setLabel(p.Cnd_ship_term_cd_Label);
		p.Cnd_ship_term_nm = p.beansFactory.createTextField("Cnd.ship_term_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_ship_schd_no_Label = p.beansFactory.createLabel("Cnd.ship_schd_no_Label");
		p.Cnd_ship_schd_no = p.beansFactory.createTextField("Cnd.ship_schd_no");
		p.Cnd_ship_schd_no.setLabel(p.Cnd_ship_schd_no_Label);
		p.Cnd_ship_inst_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_no_Label");
		p.Cnd_ship_inst_no = p.beansFactory.createTextField("Cnd.ship_inst_no");
		p.Cnd_ship_inst_no.setLabel(p.Cnd_ship_inst_no_Label);
		p.Cnd_ship_act_no_Label = p.beansFactory.createLabel("Cnd.ship_act_no_Label");
		p.Cnd_ship_act_no = p.beansFactory.createTextField("Cnd.ship_act_no");
		p.Cnd_ship_act_no.setLabel(p.Cnd_ship_act_no_Label);
		p.Cnd_ship_act_d_no_Label = p.beansFactory.createLabel("Cnd.ship_act_d_no_Label");
		p.Cnd_ship_act_d_no = p.beansFactory.createTextField("Cnd.ship_act_d_no");
		p.Cnd_ship_act_d_no.setLabel(p.Cnd_ship_act_d_no_Label);
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_ext_ship_act_no_Label = p.beansFactory.createLabel("Cnd.ext_ship_act_no_Label");
		p.Cnd_ext_ship_act_no = p.beansFactory.createTextField("Cnd.ext_ship_act_no");
		p.Cnd_ext_ship_act_no.setLabel(p.Cnd_ext_ship_act_no_Label);
		p.Cnd_can_disp_flg = p.beansFactory.createCheckBox("Cnd.can_disp_flg");
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
		p.Cnd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_d_rmrks_Label");
		p.Cnd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.intr_d_rmrks");
		p.Cnd_intr_d_rmrks.setLabel(p.Cnd_intr_d_rmrks_Label);
		p.Cnd_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.d_sub_char1_Label");
		p.Cnd_d_sub_char1 = p.beansFactory.createTextField("Cnd.d_sub_char1");
		p.Cnd_d_sub_char1.setLabel(p.Cnd_d_sub_char1_Label);
		p.Cnd_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.d_sub_char2_Label");
		p.Cnd_d_sub_char2 = p.beansFactory.createTextField("Cnd.d_sub_char2");
		p.Cnd_d_sub_char2.setLabel(p.Cnd_d_sub_char2_Label);
		p.Cnd_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.d_sub_char3_Label");
		p.Cnd_d_sub_char3 = p.beansFactory.createTextField("Cnd.d_sub_char3");
		p.Cnd_d_sub_char3.setLabel(p.Cnd_d_sub_char3_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		p.BulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.BulkSet_indiv_prnt_flg = p.beansFactory.createCheckBox("BulkSet.indiv_prnt_flg");
		p.BulkSet_wms_flg = p.beansFactory.createCheckBox("BulkSet.wms_flg");
		p.BulkSet_not_wms_flg = p.beansFactory.createCheckBox("BulkSet.not_wms_flg");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_ship_term_cd = p.beansFactory.createTableColumn("Rslt.ship_term_cd", MCColumnType.TEXT);
		p.columnRslt_ship_term_nm = p.beansFactory.createTableColumn("Rslt.ship_term_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_prnt_flg = p.beansFactory.createTableColumn("Rslt.dlv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_adv_prnt_flg = p.beansFactory.createTableColumn("Rslt.adv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_typ = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_cd = p.beansFactory.createTableColumn("Rslt.dlv_id_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_id_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_str_ln_cd = p.beansFactory.createTableColumn("Rslt.dlv_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_str_ln_nm = p.beansFactory.createTableColumn("Rslt.dlv_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_cd = p.beansFactory.createTableColumn("Rslt.rqst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_nm = p.beansFactory.createTableColumn("Rslt.rqst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_cd = p.beansFactory.createTableColumn("Rslt.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_nm = p.beansFactory.createTableColumn("Rslt.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_dlv_day_week_typ = p.beansFactory.createTableColumn("Rslt.dlv_day_week_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_day_week_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_day_week_typ_nm", MCColumnType.TEXT);
		p.columnRslt_base_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_base_prov_act_no = p.beansFactory.createTableColumn("Rslt.base_prov_act_no", MCColumnType.TEXT);
		p.columnRslt_base_ac_dt = p.beansFactory.createTableColumn("Rslt.base_ac_dt", MCColumnType.DATE);
		p.columnRslt_ship_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_ship_loc_cd = p.beansFactory.createTableColumn("Rslt.ship_loc_cd", MCColumnType.TEXT);
		p.columnRslt_ship_loc_nm = p.beansFactory.createTableColumn("Rslt.ship_loc_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_d_cnt = p.beansFactory.createTableColumn("Rslt.d_cnt", MCColumnType.NUMBER);
		p.columnRslt_wt = p.beansFactory.createTableColumn("Rslt.wt", MCColumnType.NUMBER);
		p.columnRslt_dim = p.beansFactory.createTableColumn("Rslt.dim", MCColumnType.NUMBER);
		p.columnRslt_slip_cnt = p.beansFactory.createTableColumn("Rslt.slip_cnt", MCColumnType.NUMBER);
		p.columnRslt_ship_act_no = p.beansFactory.createTableColumn("Rslt.ship_act_no", MCColumnType.TEXT);
		p.columnRslt_ship_act_d_no = p.beansFactory.createTableColumn("Rslt.ship_act_d_no", MCColumnType.TEXT);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_ship_act_no = p.beansFactory.createTableColumn("Rslt.ext_ship_act_no", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_ship_inst_no = p.beansFactory.createTableColumn("Rslt.ship_inst_no", MCColumnType.TEXT);
		p.columnRslt_wms_flg = p.beansFactory.createTableColumn("Rslt.wms_flg", MCColumnType.CHECK);
		p.columnRslt_ship_inst_d_no = p.beansFactory.createTableColumn("Rslt.ship_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_disp_seq = p.beansFactory.createTableColumn("Rslt.ship_inst_disp_seq", MCColumnType.NUMBER);
		p.columnRslt_ship_schd_no = p.beansFactory.createTableColumn("Rslt.ship_schd_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_seq = p.beansFactory.createTableColumn("Rslt.dlv_slip_seq", MCColumnType.NUMBER);
		p.columnRslt_dlv_slip_rev = p.beansFactory.createTableColumn("Rslt.dlv_slip_rev", MCColumnType.NUMBER);
		p.columnRslt_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_dlv_prnted_flg = p.beansFactory.createTableColumn("Rslt.dlv_prnted_flg", MCColumnType.CHECK);
		p.columnRslt_adv_prnted_flg = p.beansFactory.createTableColumn("Rslt.adv_prnted_flg", MCColumnType.CHECK);
		p.columnRslt_non_dlv_prnt_flg = p.beansFactory.createTableColumn("Rslt.non_dlv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_ship_inst_no = p.beansFactory.createTableColumn("Dtl.ship_inst_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_no = p.beansFactory.createTableColumn("Dtl.ship_act_no", MCColumnType.TEXT);
		p.columnDtl_ship_pr_no = p.beansFactory.createTableColumn("Dtl.ship_pr_no", MCColumnType.TEXT);
		p.columnDtl_ship_pr_upd_cntr = p.beansFactory.createTableColumn("Dtl.ship_pr_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1440 = p.beansFactory.createButton("Btn.open_MSBEP1440", "open");
		p.Btn_prnt_dlv_slip = p.beansFactory.createButton("Btn.prnt_dlv_slip", "prnt");
		p.Btn_prnt_ship_adv = p.beansFactory.createButton("Btn.prnt_ship_adv", "prnt");
		p.Btn_prnt_stklst = p.beansFactory.createButton("Btn.prnt_stklst", "prnt");
		p.Btn_label_check = p.beansFactory.createLabel("Btn.label_check");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_label_dlv_prnt = p.beansFactory.createLabel("Btn.label_dlv_prnt");
		p.Btn_dlv_prnt_select_all = p.beansFactory.createButton("Btn.dlv_prnt_select_all", "no_border");
		p.Btn_dlv_prnt_deselect_all = p.beansFactory.createButton("Btn.dlv_prnt_deselect_all", "no_border");
		p.Btn_label_adv_prnt = p.beansFactory.createLabel("Btn.label_adv_prnt");
		p.Btn_adv_prnt_select_all = p.beansFactory.createButton("Btn.adv_prnt_select_all", "no_border");
		p.Btn_adv_prnt_deselect_all = p.beansFactory.createButton("Btn.adv_prnt_deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ShipActListReg p) {
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
	protected static void jbInitSrchMode(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.TopPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_ShipActListReg p) {
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
	protected static void jbInitFold(MSBEP_ShipActListReg p) {
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.PrStsPanel, null);
		p.Tab1Panel.setLastBeans(p.PrStsPanel);
		p.PrStsPanel.setNextBeans(p.WmsTrgtPanel);
		p.Tab1Panel.add(p.WmsTrgtPanel, null);
		p.WmsTrgtPanel.setNextBeans(p.ShipStsPanel);
		p.Tab1Panel.add(p.ShipStsPanel, null);
		p.ShipStsPanel.setNextBeans(p.DlvPrntPanel);
		p.Tab1Panel.add(p.DlvPrntPanel, null);
		p.DlvPrntPanel.setNextBeans(p.AdvPrntPanel);
		p.Tab1Panel.add(p.AdvPrntPanel, null);
		p.AdvPrntPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.DlvCndPanel, null);
		p.Tab2Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.CstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.CstCndPanel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrSts(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.PrStsPanel.setBorder(p.PrStsTitledBorder);
		p.PrStsPanel.setValueCheck(false);
		p.PrStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrStsPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [WmsTrgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWmsTrgt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.WmsTrgtPanel.setBorder(p.WmsTrgtTitledBorder);
		p.WmsTrgtPanel.setValueCheck(false);
		p.WmsTrgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.WmsTrgtPanel.setLayoutPosition("NNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [ShipSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipSts(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.ShipStsPanel.setBorder(p.ShipStsTitledBorder);
		p.ShipStsPanel.setValueCheck(false);
		p.ShipStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ShipStsPanel.setLayoutPosition("NNWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvPrnt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.DlvPrntPanel.setBorder(p.DlvPrntTitledBorder);
		p.DlvPrntPanel.setValueCheck(false);
		p.DlvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvPrntPanel.setLayoutPosition("NSW");
		// ブロックの項目の初期化
	}

	/**
	 * [AdvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdvPrnt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.AdvPrntPanel.setBorder(p.AdvPrntTitledBorder);
		p.AdvPrntPanel.setValueCheck(false);
		p.AdvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AdvPrntPanel.setLayoutPosition("NSWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ShipActListReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ope_META);
		p.SrchModePanel.setLastBeans(p.Cnd_md_Group);
		p.Cnd_md_Group.setFirstBeans(p.Cnd_md_HDR);
		p.Cnd_md_HDR.setActionCommand("0");
		p.Cnd_md_Group.add(p.Cnd_md_HDR);
		p.SrchModePanel.add(p.Cnd_md_HDR);
		p.Cnd_md_HDR.setNextBeans(p.Cnd_md_DTL);
		p.Cnd_md_DTL.setActionCommand("1");
		p.Cnd_md_Group.add(p.Cnd_md_DTL);
		p.SrchModePanel.add(p.Cnd_md_DTL);
		p.Cnd_md_DTL.setNextBeans(p.Cnd_md_DLV);
		p.Cnd_md_DLV.setActionCommand("2");
		p.Cnd_md_Group.add(p.Cnd_md_DLV);
		p.SrchModePanel.add(p.Cnd_md_DLV);
		p.Cnd_md_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.md_META);
		p.PrStsPanel.add(p.Cnd_not_ship_flg);
		p.PrStsPanel.setLastBeans(p.Cnd_not_ship_flg);
		p.Cnd_not_ship_flg.setNextBeans(p.Cnd_ship_flg);
		p.Cnd_not_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.not_ship_flg_META);
		p.PrStsPanel.add(p.Cnd_ship_flg);
		p.Cnd_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_flg_META);
		p.WmsTrgtPanel.add(p.Cnd_wms_flg);
		p.WmsTrgtPanel.setLastBeans(p.Cnd_wms_flg);
		p.Cnd_wms_flg.setNextBeans(p.Cnd_not_wms_flg);
		p.Cnd_wms_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.wms_flg_META);
		p.WmsTrgtPanel.add(p.Cnd_not_wms_flg);
		p.Cnd_not_wms_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.not_wms_flg_META);
		p.ShipStsPanel.add(p.Cnd_dlv_rqst_flg);
		p.ShipStsPanel.setLastBeans(p.Cnd_dlv_rqst_flg);
		p.Cnd_dlv_rqst_flg.setNextBeans(p.Cnd_ship_rqst_flg);
		p.Cnd_dlv_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_rqst_flg_META);
		p.ShipStsPanel.add(p.Cnd_ship_rqst_flg);
		p.Cnd_ship_rqst_flg.setNextBeans(p.Cnd_pd_inst_dlv_flg);
		p.Cnd_ship_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_rqst_flg_META);
		p.ShipStsPanel.add(p.Cnd_pd_inst_dlv_flg);
		p.Cnd_pd_inst_dlv_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.pd_inst_dlv_flg_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_not_prnted);
		p.DlvPrntPanel.setLastBeans(p.Cnd_dlv_not_prnted);
		p.Cnd_dlv_not_prnted.setNextBeans(p.Cnd_dlv_prnted);
		p.Cnd_dlv_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_not_prnted_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_prnted);
		p.Cnd_dlv_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_prnted_META);
		p.AdvPrntPanel.add(p.Cnd_adv_not_prnted);
		p.AdvPrntPanel.setLastBeans(p.Cnd_adv_not_prnted);
		p.Cnd_adv_not_prnted.setNextBeans(p.Cnd_adv_prnted);
		p.Cnd_adv_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.adv_not_prnted_META);
		p.AdvPrntPanel.add(p.Cnd_adv_prnted);
		p.Cnd_adv_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.adv_prnted_META);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ssdt_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_ssdt_p_PPanel);
		p.Cnd_ssdt_p_PPanel.setNextBeans(p.Cnd_sidt_p_PPanel);
		p.CndPanel.add(p.Cnd_sidt_p_PPanel);
		p.Cnd_sidt_p_PPanel.setNextBeans(p.Cnd_sdt_p_PPanel);
		p.CndPanel.add(p.Cnd_sdt_p_PPanel);
		p.Cnd_sdt_p_PPanel.setNextBeans(p.Cnd_dsdt_p_PPanel);
		p.CndPanel.add(p.Cnd_dsdt_p_PPanel);
		p.Cnd_dsdt_p_PPanel.setNextBeans(p.Cnd_ac_dt_fr);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_ship_loc_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_ship_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_loc_cd, true);
		p.Cnd_ship_loc_cd.setLinkBeans(p.Cnd_ship_loc_nm);
		p.CndPanel.add(p.Cnd_ship_loc_cd_Label);
		p.CndPanel.add(p.Cnd_ship_loc_cd);
		p.Cnd_ship_loc_cd.setNextBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_loc_cd_META);
		p.CndPanel.add(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_nm.setNextBeans(p.Cnd_ship_str_ln_cd);
		p.Cnd_ship_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_loc_nm, true);
		p.Cnd_ship_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_str_ln_cd, true);
		p.Cnd_ship_str_ln_cd.setLinkBeans(p.Cnd_ship_str_ln_nm);
		p.CndPanel.add(p.Cnd_ship_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_ship_str_ln_cd);
		p.Cnd_ship_str_ln_cd.setNextBeans(p.Cnd_ship_str_ln_nm);
		p.Cnd_ship_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_ship_str_ln_nm);
		p.Cnd_ship_str_ln_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_ship_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_str_ln_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_ship_to_id_typ);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_ship_to_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_typ, true);
		p.Cnd_ship_to_id_typ.setLinkBeans(p.Cnd_ship_to_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_typ);
		p.Cnd_ship_to_id_typ.setNextBeans(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_to_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ_nm.setNextBeans(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_to_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_to_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_cd.setNextBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_to_id_cd_META);
		p.Cnd_ship_to_id_cd.addLinkBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_nm.setNextBeans(p.Cnd_dlv_id_typ);
		p.Cnd_ship_to_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_to_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_to_id_nm, true);
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_id_cd_META);
		p.Cnd_dlv_id_cd.addLinkBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_ship_term_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_ship_term_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_term_cd, true);
		p.Cnd_ship_term_cd.setLinkBeans(p.Cnd_ship_term_nm);
		p.CndPanel.add(p.Cnd_ship_term_cd_Label);
		p.CndPanel.add(p.Cnd_ship_term_cd);
		p.Cnd_ship_term_cd.setNextBeans(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_term_cd_META);
		p.CndPanel.add(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_ship_term_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_term_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_term_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_itm_nm);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_itm_nm);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_sub3,p.Cnd_itm_nm);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_act_usr_dpt_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_act_usr_dpt_p_PPanel);
		p.Cnd_act_usr_dpt_p_PPanel.setNextBeans(p.Cnd_ship_schd_no);
		p.setPluralValueEnable(p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_usr_cd, true);
		p.setPluralValueEnable(p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_usr_nm, true);
		p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd, true);
		p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Cnd_act_dpt_nm);
		p.setPluralValueEnable(p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_nm, true);
		p.CndPanel.add(p.Cnd_ship_schd_no_Label);
		p.CndPanel.add(p.Cnd_ship_schd_no);
		p.Cnd_ship_schd_no.setNextBeans(p.Cnd_ship_inst_no);
		p.Cnd_ship_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_schd_no_META);
		p.setPluralValueEnable(p.Cnd_ship_schd_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_no);
		p.Cnd_ship_inst_no.setNextBeans(p.Cnd_ship_act_no);
		p.Cnd_ship_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_inst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_no, true);
		p.CndPanel.add(p.Cnd_ship_act_no_Label);
		p.CndPanel.add(p.Cnd_ship_act_no);
		p.Cnd_ship_act_no.setNextBeans(p.Cnd_ship_act_d_no);
		p.Cnd_ship_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_act_no_META);
		p.setPluralValueEnable(p.Cnd_ship_act_no, true);
		p.CndPanel.add(p.Cnd_ship_act_d_no_Label);
		p.CndPanel.add(p.Cnd_ship_act_d_no);
		p.Cnd_ship_act_d_no.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_ship_act_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ship_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_ship_act_d_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_ext_ship_act_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_ext_ship_act_no_Label);
		p.CndPanel.add(p.Cnd_ext_ship_act_no);
		p.Cnd_ext_ship_act_no.setNextBeans(p.Cnd_can_disp_flg);
		p.Cnd_ext_ship_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.ext_ship_act_no_META);
		p.setPluralValueEnable(p.Cnd_ext_ship_act_no, true);
		p.CndPanel.add(p.Cnd_can_disp_flg);
		p.Cnd_can_disp_flg.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_can_disp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.can_disp_flg_META);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_d_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_d_sub_char1);
		p.Cnd_d_sub_char1.setNextBeans(p.Cnd_d_sub_char2);
		p.Cnd_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_d_sub_char2);
		p.Cnd_d_sub_char2.setNextBeans(p.Cnd_d_sub_char3);
		p.Cnd_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_d_sub_char3);
		p.Cnd_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1450.CndR.d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_d_sub_char3, true);
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
	protected static void jbInitCtrl(MSBEP_ShipActListReg p) {
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
	protected static void jbInitRPnl(MSBEP_ShipActListReg p) {
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
	protected static void jbInitBulkSet(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setBorder(p.BulkSetTitledBorder);
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_sdt_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_sdt_p_PPanel);
		p.BulkSet_sdt_p_PPanel.setNextBeans(p.BulkSet_ddt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_ddt_p_PPanel);
		p.BulkSet_ddt_p_PPanel.setNextBeans(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_ac_dt_p_PPanel.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_indiv_prnt_flg);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_act_dpt_nm);
		p.BulkSetPanel.add(p.BulkSet_indiv_prnt_flg);
		p.BulkSet_indiv_prnt_flg.setNextBeans(p.BulkSet_wms_flg);
		p.BulkSet_indiv_prnt_flg.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1450.BulkSetR.indiv_prnt_flg_META);
		p.BulkSetPanel.add(p.BulkSet_wms_flg);
		p.BulkSet_wms_flg.setNextBeans(p.BulkSet_not_wms_flg);
		p.BulkSet_wms_flg.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1450.BulkSetR.wms_flg_META);
		p.BulkSetPanel.add(p.BulkSet_not_wms_flg);
		p.BulkSet_not_wms_flg.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1450.BulkSetR.not_wms_flg_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.DtlPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_ShipActListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1440.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1440);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1440);
		p.Btn_open_MSBEP1440.setNextBeans(p.Btn_prnt_dlv_slip);
		p.Btn_prnt_dlv_slip.setIcon("PRINT");
		p.Btn_prnt_dlv_slip.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_prnt_dlv_slip);
		p.Btn_prnt_dlv_slip.setNextBeans(p.Btn_prnt_ship_adv);
		p.Btn_prnt_ship_adv.setIcon("PRINT");
		p.Btn_prnt_ship_adv.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_prnt_ship_adv);
		p.Btn_prnt_ship_adv.setNextBeans(p.Btn_prnt_stklst);
		p.Btn_prnt_stklst.setIcon("PRINT");
		p.Btn_prnt_stklst.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_prnt_stklst);
		p.Btn_prnt_stklst.setNextBeans(p.Btn_select_all);
		p.BtnPanel.add(p.Btn_label_check);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_dlv_prnt_select_all);
		p.BtnPanel.add(p.Btn_label_dlv_prnt);
		p.Btn_dlv_prnt_select_all.setIcon("SELECT_ALL");
		p.Btn_dlv_prnt_select_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_dlv_prnt_select_all);
		p.Btn_dlv_prnt_select_all.setNextBeans(p.Btn_dlv_prnt_deselect_all);
		p.Btn_dlv_prnt_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_dlv_prnt_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_dlv_prnt_deselect_all);
		p.Btn_dlv_prnt_deselect_all.setNextBeans(p.Btn_adv_prnt_select_all);
		p.BtnPanel.add(p.Btn_label_adv_prnt);
		p.Btn_adv_prnt_select_all.setIcon("SELECT_ALL");
		p.Btn_adv_prnt_select_all.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_adv_prnt_select_all);
		p.Btn_adv_prnt_select_all.setNextBeans(p.Btn_adv_prnt_deselect_all);
		p.Btn_adv_prnt_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_adv_prnt_deselect_all.setFunctionKey(MCFunctionKey.F18);
		p.BtnPanel.add(p.Btn_adv_prnt_deselect_all);
		p.Btn_adv_prnt_deselect_all.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MSBEP_ShipActListReg p) {
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
		MSBEP_ShipActListReg_MC.mcInitScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitSrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitTop((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitFold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitTab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitTab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitTab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitTab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitPrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitWmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitDlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitAdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitDlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitCstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitCtrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitRPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitBulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitRslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitDtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitBtn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.mcInitEastBtn((MSBEP_ShipActListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__UPD_EastBtn((MSBEP_ShipActListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__DEL_EastBtn((MSBEP_ShipActListReg)this);

		// [SRCH_REF_HDR]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__HDR_EastBtn((MSBEP_ShipActListReg)this);

		// [SRCH_REF_DTL]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__REF__DTL_EastBtn((MSBEP_ShipActListReg)this);

		// [SRCH_PRNT_DLV]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitSRCH__PRNT__DLV_EastBtn((MSBEP_ShipActListReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitUPD_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitUPD_EastBtn((MSBEP_ShipActListReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__U_EastBtn((MSBEP_ShipActListReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitDEL_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitDEL_EastBtn((MSBEP_ShipActListReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitFIX__D_EastBtn((MSBEP_ShipActListReg)this);

		// [PRNT]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitPRNT_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT_EastBtn((MSBEP_ShipActListReg)this);

		// [PRNT_DLV]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitPRNT__DLV_EastBtn((MSBEP_ShipActListReg)this);

		// [REF_HDR]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__HDR_EastBtn((MSBEP_ShipActListReg)this);

		// [REF_DTL]ステータスのモードの設定
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_ScreenOpe((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_SrchMode((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Top((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Fold((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Tab1((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Tab2((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Tab3((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Tab4((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_PrSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_WmsTrgt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_ShipSts((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_DlvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_AdvPrnt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_DlvCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_CstCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_ItmCnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Cnd((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Ctrl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_RPnl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_BulkSet((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Rslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Dtl((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_Btn((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.statusInitREF__DTL_EastBtn((MSBEP_ShipActListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ShipActListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [PrSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrSts(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [WmsTrgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWmsTrgt(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [ShipSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipSts(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [DlvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvPrnt(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [AdvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdvPrnt(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_ShipActListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipActListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_md_Group.addAllListener(p);
		p.Cnd_md_HDR.addAllListener(p);
		p.Cnd_md_DTL.addAllListener(p);
		p.Cnd_md_DLV.addAllListener(p);
		p.Cnd_not_ship_flg.addAllListener(p);
		p.Cnd_ship_flg.addAllListener(p);
		p.Cnd_wms_flg.addAllListener(p);
		p.Cnd_not_wms_flg.addAllListener(p);
		p.Cnd_dlv_rqst_flg.addAllListener(p);
		p.Cnd_ship_rqst_flg.addAllListener(p);
		p.Cnd_pd_inst_dlv_flg.addAllListener(p);
		p.Cnd_dlv_not_prnted.addAllListener(p);
		p.Cnd_dlv_prnted.addAllListener(p);
		p.Cnd_adv_not_prnted.addAllListener(p);
		p.Cnd_adv_prnted.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_ship_loc_cd.setListListener(p);
		p.Cnd_ship_loc_cd.addAllListener(p);
		p.Cnd_ship_loc_nm.setListListener(p);
		p.Cnd_ship_loc_nm.addAllListener(p);
		p.Cnd_ship_str_ln_cd.setListListener(p);
		p.Cnd_ship_str_ln_cd.addAllListener(p);
		p.Cnd_ship_str_ln_nm.setListListener(p);
		p.Cnd_ship_str_ln_nm.addAllListener(p);
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_ship_to_id_typ.setListListener(p);
		p.Cnd_ship_to_id_typ.addAllListener(p);
		p.Cnd_ship_to_id_typ_nm.setListListener(p);
		p.Cnd_ship_to_id_typ_nm.addAllListener(p);
		p.Cnd_ship_to_id_cd.setListListener(p);
		p.Cnd_ship_to_id_cd.addAllListener(p);
		p.Cnd_ship_to_id_nm.setListListener(p);
		p.Cnd_ship_to_id_nm.addAllListener(p);
		p.Cnd_dlv_id_typ.setListListener(p);
		p.Cnd_dlv_id_typ.addAllListener(p);
		p.Cnd_dlv_id_typ_nm.setListListener(p);
		p.Cnd_dlv_id_typ_nm.addAllListener(p);
		p.Cnd_dlv_id_cd.setListListener(p);
		p.Cnd_dlv_id_cd.addAllListener(p);
		p.Cnd_dlv_id_nm.setListListener(p);
		p.Cnd_dlv_id_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_ship_term_cd.setListListener(p);
		p.Cnd_ship_term_cd.addAllListener(p);
		p.Cnd_ship_term_nm.setListListener(p);
		p.Cnd_ship_term_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ship_schd_no.setListListener(p);
		p.Cnd_ship_schd_no.addAllListener(p);
		p.Cnd_ship_inst_no.setListListener(p);
		p.Cnd_ship_inst_no.addAllListener(p);
		p.Cnd_ship_act_no.setListListener(p);
		p.Cnd_ship_act_no.addAllListener(p);
		p.Cnd_ship_act_d_no.setListListener(p);
		p.Cnd_ship_act_d_no.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_ext_ship_act_no.setListListener(p);
		p.Cnd_ext_ship_act_no.addAllListener(p);
		p.Cnd_can_disp_flg.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_intr_d_rmrks.setListListener(p);
		p.Cnd_intr_d_rmrks.addAllListener(p);
		p.Cnd_d_sub_char1.setListListener(p);
		p.Cnd_d_sub_char1.addAllListener(p);
		p.Cnd_d_sub_char2.setListListener(p);
		p.Cnd_d_sub_char2.addAllListener(p);
		p.Cnd_d_sub_char3.setListListener(p);
		p.Cnd_d_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_ShipActListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_ShipActListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_ShipActListReg p) {
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_indiv_prnt_flg.addAllListener(p);
		p.BulkSet_wms_flg.addAllListener(p);
		p.BulkSet_not_wms_flg.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_ShipActListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_ship_term_cd.addAllListener(p);
		p.columnRslt_ship_term_cd.setListListener(p);
		p.columnRslt_ship_term_nm.addAllListener(p);
		p.columnRslt_ship_term_nm.setListListener(p);
		p.columnRslt_dlv_prnt_flg.addAllListener(p);
		p.columnRslt_adv_prnt_flg.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnRslt_ship_to_id_typ.addAllListener(p);
		p.columnRslt_ship_to_id_typ.setListListener(p);
		p.columnRslt_ship_to_id_typ_nm.addAllListener(p);
		p.columnRslt_ship_to_id_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_cd.addAllListener(p);
		p.columnRslt_dlv_id_cd.setListListener(p);
		p.columnRslt_dlv_id_nm.addAllListener(p);
		p.columnRslt_dlv_id_nm.setListListener(p);
		p.columnRslt_dlv_str_ln_cd.addAllListener(p);
		p.columnRslt_dlv_str_ln_cd.setListListener(p);
		p.columnRslt_dlv_str_ln_nm.addAllListener(p);
		p.columnRslt_dlv_str_ln_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_rqst_usr_cd.addAllListener(p);
		p.columnRslt_rqst_usr_cd.setListListener(p);
		p.columnRslt_rqst_usr_nm.addAllListener(p);
		p.columnRslt_rqst_usr_nm.setListListener(p);
		p.columnRslt_rqst_dpt_cd.addAllListener(p);
		p.columnRslt_rqst_dpt_cd.setListListener(p);
		p.columnRslt_rqst_dpt_nm.addAllListener(p);
		p.columnRslt_rqst_dpt_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_dlv_day_week_typ.addAllListener(p);
		p.columnRslt_dlv_day_week_typ.setListListener(p);
		p.columnRslt_dlv_day_week_typ_nm.addAllListener(p);
		p.columnRslt_dlv_day_week_typ_nm.setListListener(p);
		p.columnRslt_base_dlv_slip_no.addAllListener(p);
		p.columnRslt_base_dlv_slip_no.setListListener(p);
		p.columnRslt_base_prov_act_no.addAllListener(p);
		p.columnRslt_base_prov_act_no.setListListener(p);
		p.columnRslt_base_ac_dt.addAllListener(p);
		p.columnRslt_base_ac_dt.setListListener(p);
		p.columnRslt_ship_cnt_rmrks.addAllListener(p);
		p.columnRslt_ship_cnt_rmrks.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_ship_loc_cd.addAllListener(p);
		p.columnRslt_ship_loc_cd.setListListener(p);
		p.columnRslt_ship_loc_nm.addAllListener(p);
		p.columnRslt_ship_loc_nm.setListListener(p);
		p.Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_d_cnt.addAllListener(p);
		p.columnRslt_d_cnt.setListListener(p);
		p.columnRslt_wt.addAllListener(p);
		p.columnRslt_wt.setListListener(p);
		p.columnRslt_dim.addAllListener(p);
		p.columnRslt_dim.setListListener(p);
		p.columnRslt_slip_cnt.addAllListener(p);
		p.columnRslt_slip_cnt.setListListener(p);
		p.columnRslt_ship_act_no.addAllListener(p);
		p.columnRslt_ship_act_no.setListListener(p);
		p.columnRslt_ship_act_d_no.addAllListener(p);
		p.columnRslt_ship_act_d_no.setListListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_ship_act_no.addAllListener(p);
		p.columnRslt_ext_ship_act_no.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_ship_inst_no.addAllListener(p);
		p.columnRslt_ship_inst_no.setListListener(p);
		p.columnRslt_wms_flg.addAllListener(p);
		p.columnRslt_ship_inst_d_no.addAllListener(p);
		p.columnRslt_ship_inst_d_no.setListListener(p);
		p.columnRslt_ship_inst_disp_seq.addAllListener(p);
		p.columnRslt_ship_inst_disp_seq.setListListener(p);
		p.columnRslt_ship_schd_no.addAllListener(p);
		p.columnRslt_ship_schd_no.setListListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_dlv_slip_seq.addAllListener(p);
		p.columnRslt_dlv_slip_seq.setListListener(p);
		p.columnRslt_dlv_slip_rev.addAllListener(p);
		p.columnRslt_dlv_slip_rev.setListListener(p);
		p.columnRslt_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_dlv_slip_d_no.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_dlv_prnted_flg.addAllListener(p);
		p.columnRslt_adv_prnted_flg.addAllListener(p);
		p.columnRslt_non_dlv_prnt_flg.addAllListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_d_sub_char1.addAllListener(p);
		p.columnRslt_d_sub_char1.setListListener(p);
		p.columnRslt_d_sub_char2.addAllListener(p);
		p.columnRslt_d_sub_char2.setListListener(p);
		p.columnRslt_d_sub_char3.addAllListener(p);
		p.columnRslt_d_sub_char3.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
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
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_ShipActListReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_ship_inst_no.addAllListener(p);
		p.columnDtl_ship_inst_no.setListListener(p);
		p.columnDtl_ship_act_no.addAllListener(p);
		p.columnDtl_ship_act_no.setListListener(p);
		p.columnDtl_ship_pr_no.addAllListener(p);
		p.columnDtl_ship_pr_no.setListListener(p);
		p.columnDtl_ship_pr_upd_cntr.addAllListener(p);
		p.columnDtl_ship_pr_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ShipActListReg p) {
		p.Btn_open_MSBEP1440.addAllListener(p);
		p.Btn_open_MSBEP1440.setAPMethodName("doBtn_open_MSBEP1440");
		p.Btn_prnt_dlv_slip.addAllListener(p);
		p.Btn_prnt_dlv_slip.setAPMethodName("doBtn_prnt_dlv_slip");
		p.Btn_prnt_ship_adv.addAllListener(p);
		p.Btn_prnt_ship_adv.setAPMethodName("doBtn_prnt_ship_adv");
		p.Btn_prnt_stklst.addAllListener(p);
		p.Btn_prnt_stklst.setAPMethodName("doBtn_prnt_stklst");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_dlv_prnt_select_all.addAllListener(p);
		p.Btn_dlv_prnt_select_all.setAPMethodName("doBtn_dlv_prnt_select_all");
		p.Btn_dlv_prnt_deselect_all.addAllListener(p);
		p.Btn_dlv_prnt_deselect_all.setAPMethodName("doBtn_dlv_prnt_deselect_all");
		p.Btn_adv_prnt_select_all.addAllListener(p);
		p.Btn_adv_prnt_select_all.setAPMethodName("doBtn_adv_prnt_select_all");
		p.Btn_adv_prnt_deselect_all.addAllListener(p);
		p.Btn_adv_prnt_deselect_all.setAPMethodName("doBtn_adv_prnt_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_ShipActListReg p) {
	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ddt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sidt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sdt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ext_ship_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_wms_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wt.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_wms_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_d_sub_char1.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_d_sub_char2.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_d_sub_char3.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_str_ln_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_str_ln_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_qty_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_ship_act_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_disp_seq.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sidt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sdt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ext_ship_act_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT_DLV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_str_ln_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dim.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_slip_cnt.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT_DLV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PRNT_DLV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_PRNT_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_PRNT_DLV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRNT_DLV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT__DLV_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dsdt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ddt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.BulkSet_wms_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_ship_inst_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_adv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_dlv_prnted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_intr_d_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_adv_prnt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dsdt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ddt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sidt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sdt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ext_ship_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.BulkSet_wms_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_adv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_adv_prnt_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sidt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sdt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_ext_ship_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [FIX_D]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ddt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_indiv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sidt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sdt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ext_ship_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.BulkSet_wms_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_ship_adv.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_stklst.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_pd_inst_dlv_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sidt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sdt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_act_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ext_ship_act_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT_DLV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, PRNT_DLV, MCMode.ENABLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.BulkSet_wms_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_str_ln_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dim.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_slip_cnt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT_DLV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, PRNT_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_prnt_ship_adv.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_prnt_stklst.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_del.putMode(p, PRNT_DLV, MCMode.DISABLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wms_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ssdt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_str_ln_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_fctr_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_fctr_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_unit_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ext_ship_act_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_disp_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_EastBtn(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ScreenOpe(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SrchMode(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab4(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_PrSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_WmsTrgt(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ShipSts(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DlvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_AdvPrnt(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DlvCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_CstCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmCnd(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBEP_ShipActListReg p){
		p.Cnd_ope_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wms_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_adv_not_prnted.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_adv_prnted.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sidt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sdt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_str_ln_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_str_ln_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_act_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ext_ship_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_d_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_d_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_d_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBEP_ShipActListReg p){

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBEP_ShipActListReg p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_BulkSet(MSBEP_ShipActListReg p){
		p.BulkSet_sdt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ddt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.BulkSet_wms_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.BulkSet_not_wms_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Rslt(MSBEP_ShipActListReg p){
		p.columnRslt_check.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_ship_inst_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_ship_to_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ship_to_p_PPanel.columnDlv_cntry_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_str_ln_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_str_ln_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_ver_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_ship_str_ln_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_cnt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ext_ship_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_disp_seq.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_DTL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Dtl(MSBEP_ShipActListReg p){
		p.columnDtl_ship_inst_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Btn(MSBEP_ShipActListReg p){
		p.Btn_open_MSBEP1440.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_stklst.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_EastBtn(MSBEP_ShipActListReg p){

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
		MSBEP_ShipActListReg_MC.setTableConfigRslt((MSBEP_ShipActListReg)this);
		MSBEP_ShipActListReg_MC.setTableConfigDtl((MSBEP_ShipActListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_ShipActListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.RsltTable.addTable(p.Rslt_ship_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_ship_inst_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ship_schd_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_schd_p_PPanel.YmdHmTable);
		p.columnRslt_ship_term_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_term_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_cd);
		p.columnRslt_ship_term_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_term_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_nm);
		p.columnRslt_dlv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_prnt_flg);
		p.columnRslt_adv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.adv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_prnt_flg);
		p.columnRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_fr_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_cd);
		p.columnRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_fr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_nm);
		p.columnRslt_ship_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_to_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ);
		p.columnRslt_ship_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_to_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ_nm);
		p.RsltTable.addTable(p.Rslt_ship_to_p_PPanel.DlvTable);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.columnRslt_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_cd);
		p.columnRslt_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_nm);
		p.columnRslt_dlv_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_str_ln_cd);
		p.columnRslt_dlv_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_str_ln_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_rqst_usr_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.rqst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_cd);
		p.columnRslt_rqst_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.rqst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_nm);
		p.columnRslt_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.rqst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_cd);
		p.columnRslt_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.rqst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoTable);
		p.RsltTable.addTable(p.Rslt_ver_p_PPanel.VerNoTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_base_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_act_cont_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_act_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_std_cont_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_std_fctr_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_cont_unit_p_PPanel.ContFctrUnitTable);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.RsltTable.addTable(p.Rslt_dlv_rqst_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_pd_inst_dlv_p_PPanel.YmdHmTable);
		p.columnRslt_dlv_day_week_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_day_week_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_day_week_typ);
		p.columnRslt_dlv_day_week_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_day_week_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_day_week_typ_nm);
		p.RsltTable.addTable(p.Rslt_ship_rqst_p_PPanel.YmdHmTable);
		p.columnRslt_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.base_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dlv_slip_no);
		p.columnRslt_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.base_prov_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_prov_act_no);
		p.columnRslt_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.base_ac_dt_META);
		p.columnRslt_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_ac_dt);
		p.columnRslt_ship_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_cnt_rmrks);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_ship_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_cd);
		p.columnRslt_ship_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_nm);
		p.RsltTable.addTable(p.Rslt_ship_str_ln_p_PPanel.StrLnTable);
		p.Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt_ship_str_ln_nm);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_d_cnt.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.d_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_cnt);
		p.columnRslt_wt.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wt);
		p.columnRslt_dim.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dim_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dim);
		p.columnRslt_slip_cnt.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.slip_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_cnt);
		p.columnRslt_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_no);
		p.columnRslt_ship_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_d_no);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ext_ship_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_ship_act_no);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_no);
		p.columnRslt_wms_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.wms_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wms_flg);
		p.columnRslt_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_no);
		p.columnRslt_ship_inst_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_inst_disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_disp_seq);
		p.columnRslt_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ship_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_no);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_dlv_slip_seq.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_slip_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_seq);
		p.columnRslt_dlv_slip_rev.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_slip_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_rev);
		p.columnRslt_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_d_no);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_act_dpt_nm);
		p.columnRslt_dlv_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.dlv_prnted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_prnted_flg);
		p.columnRslt_adv_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.adv_prnted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_prnted_flg);
		p.columnRslt_non_dlv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.non_dlv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_dlv_prnt_flg);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_sub_char1);
		p.columnRslt_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_sub_char2);
		p.columnRslt_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_sub_char3);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1450.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_ShipActListReg p) {
		p.columnDtl_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1450.DtlR.ship_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_no);
		p.columnDtl_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1450.DtlR.ship_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_no);
		p.columnDtl_ship_pr_no.setMeta(mcframe.clientMSBE.MSBEP1450.DtlR.ship_pr_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_no);
		p.columnDtl_ship_pr_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1450.DtlR.ship_pr_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_upd_cntr);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ship_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_loc_cd.getListConfig().setPutter(getCnd_ship_loc_cd_ListPutter());
		Cnd_ship_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_str_ln_cd.getListConfig().setPutter(getCnd_ship_str_ln_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_ship_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_to_id_typ.getListConfig().setPutter(getCnd_ship_to_id_typ_ListPutter());
		Cnd_ship_to_id_cd.getListConfig().setPutter(getCnd_ship_to_id_cd_ListPutter());
		Cnd_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_id_typ.getListConfig().setPutter(getCnd_dlv_id_typ_ListPutter());
		Cnd_dlv_id_cd.getListConfig().setPutter(getCnd_dlv_id_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_term_cd.getListConfig().setPutter(getCnd_ship_term_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
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
	 * この画面を[SRCH_REF_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF_HDRStatus() {
		status = SRCH_REF_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF_DTLStatus() {
		status = SRCH_REF_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_PRNT_DLV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRNT_DLVStatus() {
		status = SRCH_PRNT_DLV;
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
	 * この画面を[PRNT_DLV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_DLVStatus() {
		status = PRNT_DLV;
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
	 * この画面を[REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DTLStatus() {
		status = REF_DTL;
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
		else if (SRCH_REF_HDR.equals(status)) {
			setSRCH_REF_HDRStatus();
		}
		else if (SRCH_REF_DTL.equals(status)) {
			setSRCH_REF_DTLStatus();
		}
		else if (SRCH_PRNT_DLV.equals(status)) {
			setSRCH_PRNT_DLVStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
		else if (PRNT_DLV.equals(status)) {
			setPRNT_DLVStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
	}

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipToIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipToId");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DlvIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.DlvId");
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
	 * [Cnd_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
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
	 * [Cnd_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	 
	/**
	 * [Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ship_loc_cd) return getCnd_ship_loc_cd(row, info);
		if(combo == Cnd_ship_str_ln_cd) return getCnd_ship_str_ln_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_ship_to_id_typ) return getCnd_ship_to_id_typ(row, info);
		if(combo == Cnd_ship_to_id_cd) return getCnd_ship_to_id_cd(row, info);
		if(combo == Cnd_dlv_id_typ) return getCnd_dlv_id_typ(row, info);
		if(combo == Cnd_dlv_id_cd) return getCnd_dlv_id_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_ship_term_cd) return getCnd_ship_term_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Rslt_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
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
		else if (ap == Btn_open_MSBEP1440) doBtn_open_MSBEP1440(info);
		else if (ap == Btn_prnt_dlv_slip) doBtn_prnt_dlv_slip(info);
		else if (ap == Btn_prnt_ship_adv) doBtn_prnt_ship_adv(info);
		else if (ap == Btn_prnt_stklst) doBtn_prnt_stklst(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_dlv_prnt_select_all) doBtn_dlv_prnt_select_all(info);
		else if (ap == Btn_dlv_prnt_deselect_all) doBtn_dlv_prnt_deselect_all(info);
		else if (ap == Btn_adv_prnt_select_all) doBtn_adv_prnt_select_all(info);
		else if (ap == Btn_adv_prnt_deselect_all) doBtn_adv_prnt_deselect_all(info);
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
	 * [Btn]パネルの[open_MSBEP1440]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1440(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_dlv_slip]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_dlv_slip(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_ship_adv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_ship_adv(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_stklst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_stklst(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[dlv_prnt_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dlv_prnt_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[dlv_prnt_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dlv_prnt_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[adv_prnt_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_adv_prnt_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[adv_prnt_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_adv_prnt_deselect_all(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_md_Group) return doCnd_md_VC(info);
		if (vc == Cnd_not_ship_flg) return doCnd_not_ship_flg_VC(info);
		if (vc == Cnd_ship_flg) return doCnd_ship_flg_VC(info);
		if (vc == Cnd_wms_flg) return doCnd_wms_flg_VC(info);
		if (vc == Cnd_not_wms_flg) return doCnd_not_wms_flg_VC(info);
		if (vc == Cnd_dlv_rqst_flg) return doCnd_dlv_rqst_flg_VC(info);
		if (vc == Cnd_ship_rqst_flg) return doCnd_ship_rqst_flg_VC(info);
		if (vc == Cnd_pd_inst_dlv_flg) return doCnd_pd_inst_dlv_flg_VC(info);
		if (vc == Cnd_dlv_not_prnted) return doCnd_dlv_not_prnted_VC(info);
		if (vc == Cnd_dlv_prnted) return doCnd_dlv_prnted_VC(info);
		if (vc == Cnd_adv_not_prnted) return doCnd_adv_not_prnted_VC(info);
		if (vc == Cnd_adv_prnted) return doCnd_adv_prnted_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_ship_loc_cd) return doCnd_ship_loc_cd_VC(info);
		if (vc == Cnd_ship_loc_nm) return doCnd_ship_loc_nm_VC(info);
		if (vc == Cnd_ship_str_ln_cd) return doCnd_ship_str_ln_cd_VC(info);
		if (vc == Cnd_ship_str_ln_nm) return doCnd_ship_str_ln_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_ship_to_id_typ) return doCnd_ship_to_id_typ_VC(info);
		if (vc == Cnd_ship_to_id_typ_nm) return doCnd_ship_to_id_typ_nm_VC(info);
		if (vc == Cnd_ship_to_id_cd) return doCnd_ship_to_id_cd_VC(info);
		if (vc == Cnd_ship_to_id_nm) return doCnd_ship_to_id_nm_VC(info);
		if (vc == Cnd_dlv_id_typ) return doCnd_dlv_id_typ_VC(info);
		if (vc == Cnd_dlv_id_typ_nm) return doCnd_dlv_id_typ_nm_VC(info);
		if (vc == Cnd_dlv_id_cd) return doCnd_dlv_id_cd_VC(info);
		if (vc == Cnd_dlv_id_nm) return doCnd_dlv_id_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_ship_term_cd) return doCnd_ship_term_cd_VC(info);
		if (vc == Cnd_ship_term_nm) return doCnd_ship_term_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_ship_schd_no) return doCnd_ship_schd_no_VC(info);
		if (vc == Cnd_ship_inst_no) return doCnd_ship_inst_no_VC(info);
		if (vc == Cnd_ship_act_no) return doCnd_ship_act_no_VC(info);
		if (vc == Cnd_ship_act_d_no) return doCnd_ship_act_d_no_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_ext_ship_act_no) return doCnd_ext_ship_act_no_VC(info);
		if (vc == Cnd_can_disp_flg) return doCnd_can_disp_flg_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_d_sub_char1) return doCnd_d_sub_char1_VC(info);
		if (vc == Cnd_d_sub_char2) return doCnd_d_sub_char2_VC(info);
		if (vc == Cnd_d_sub_char3) return doCnd_d_sub_char3_VC(info);
		if (vc == BulkSet_indiv_prnt_flg) return doBulkSet_indiv_prnt_flg_VC(info);
		if (vc == BulkSet_wms_flg) return doBulkSet_wms_flg_VC(info);
		if (vc == BulkSet_not_wms_flg) return doBulkSet_not_wms_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_ship_term_cd) return doRslt_ship_term_cd_VC(info);
		if (vc == columnRslt_ship_term_nm) return doRslt_ship_term_nm_VC(info);
		if (vc == columnRslt_dlv_prnt_flg) return doRslt_dlv_prnt_flg_VC(info);
		if (vc == columnRslt_adv_prnt_flg) return doRslt_adv_prnt_flg_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_cd) return doRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_nm) return doRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnRslt_ship_to_id_typ) return doRslt_ship_to_id_typ_VC(info);
		if (vc == columnRslt_ship_to_id_typ_nm) return doRslt_ship_to_id_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_cd) return doRslt_dlv_id_cd_VC(info);
		if (vc == columnRslt_dlv_id_nm) return doRslt_dlv_id_nm_VC(info);
		if (vc == columnRslt_dlv_str_ln_cd) return doRslt_dlv_str_ln_cd_VC(info);
		if (vc == columnRslt_dlv_str_ln_nm) return doRslt_dlv_str_ln_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_rqst_usr_cd) return doRslt_rqst_usr_cd_VC(info);
		if (vc == columnRslt_rqst_usr_nm) return doRslt_rqst_usr_nm_VC(info);
		if (vc == columnRslt_rqst_dpt_cd) return doRslt_rqst_dpt_cd_VC(info);
		if (vc == columnRslt_rqst_dpt_nm) return doRslt_rqst_dpt_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_dlv_day_week_typ) return doRslt_dlv_day_week_typ_VC(info);
		if (vc == columnRslt_dlv_day_week_typ_nm) return doRslt_dlv_day_week_typ_nm_VC(info);
		if (vc == columnRslt_base_dlv_slip_no) return doRslt_base_dlv_slip_no_VC(info);
		if (vc == columnRslt_base_prov_act_no) return doRslt_base_prov_act_no_VC(info);
		if (vc == columnRslt_base_ac_dt) return doRslt_base_ac_dt_VC(info);
		if (vc == columnRslt_ship_cnt_rmrks) return doRslt_ship_cnt_rmrks_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_ship_loc_cd) return doRslt_ship_loc_cd_VC(info);
		if (vc == columnRslt_ship_loc_nm) return doRslt_ship_loc_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_d_cnt) return doRslt_d_cnt_VC(info);
		if (vc == columnRslt_wt) return doRslt_wt_VC(info);
		if (vc == columnRslt_dim) return doRslt_dim_VC(info);
		if (vc == columnRslt_slip_cnt) return doRslt_slip_cnt_VC(info);
		if (vc == columnRslt_ship_act_no) return doRslt_ship_act_no_VC(info);
		if (vc == columnRslt_ship_act_d_no) return doRslt_ship_act_d_no_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_ship_act_no) return doRslt_ext_ship_act_no_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_ship_inst_no) return doRslt_ship_inst_no_VC(info);
		if (vc == columnRslt_wms_flg) return doRslt_wms_flg_VC(info);
		if (vc == columnRslt_ship_inst_d_no) return doRslt_ship_inst_d_no_VC(info);
		if (vc == columnRslt_ship_inst_disp_seq) return doRslt_ship_inst_disp_seq_VC(info);
		if (vc == columnRslt_ship_schd_no) return doRslt_ship_schd_no_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_dlv_slip_seq) return doRslt_dlv_slip_seq_VC(info);
		if (vc == columnRslt_dlv_slip_rev) return doRslt_dlv_slip_rev_VC(info);
		if (vc == columnRslt_dlv_slip_d_no) return doRslt_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_dlv_prnted_flg) return doRslt_dlv_prnted_flg_VC(info);
		if (vc == columnRslt_adv_prnted_flg) return doRslt_adv_prnted_flg_VC(info);
		if (vc == columnRslt_non_dlv_prnt_flg) return doRslt_non_dlv_prnt_flg_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_d_sub_char1) return doRslt_d_sub_char1_VC(info);
		if (vc == columnRslt_d_sub_char2) return doRslt_d_sub_char2_VC(info);
		if (vc == columnRslt_d_sub_char3) return doRslt_d_sub_char3_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnDtl_ship_inst_no) return doDtl_ship_inst_no_VC(info);
		if (vc == columnDtl_ship_act_no) return doDtl_ship_act_no_VC(info);
		if (vc == columnDtl_ship_pr_no) return doDtl_ship_pr_no_VC(info);
		if (vc == columnDtl_ship_pr_upd_cntr) return doDtl_ship_pr_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[md]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_md_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pd_inst_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_not_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_not_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_not_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_not_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_term_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_act_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_can_disp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_indiv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[not_wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_not_wms_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_prnt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_str_ln_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_cnt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_disp_seq_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_non_dlv_prnt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_pr_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_md_Group) doCnd_md_NC(info);
		else if (nc == Cnd_not_ship_flg) doCnd_not_ship_flg_NC(info);
		else if (nc == Cnd_ship_flg) doCnd_ship_flg_NC(info);
		else if (nc == Cnd_wms_flg) doCnd_wms_flg_NC(info);
		else if (nc == Cnd_not_wms_flg) doCnd_not_wms_flg_NC(info);
		else if (nc == Cnd_dlv_rqst_flg) doCnd_dlv_rqst_flg_NC(info);
		else if (nc == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NC(info);
		else if (nc == Cnd_pd_inst_dlv_flg) doCnd_pd_inst_dlv_flg_NC(info);
		else if (nc == Cnd_dlv_not_prnted) doCnd_dlv_not_prnted_NC(info);
		else if (nc == Cnd_dlv_prnted) doCnd_dlv_prnted_NC(info);
		else if (nc == Cnd_adv_not_prnted) doCnd_adv_not_prnted_NC(info);
		else if (nc == Cnd_adv_prnted) doCnd_adv_prnted_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NC(info);
		else if (nc == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NC(info);
		else if (nc == Cnd_ship_str_ln_cd) doCnd_ship_str_ln_cd_NC(info);
		else if (nc == Cnd_ship_str_ln_nm) doCnd_ship_str_ln_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NC(info);
		else if (nc == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NC(info);
		else if (nc == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NC(info);
		else if (nc == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NC(info);
		else if (nc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NC(info);
		else if (nc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NC(info);
		else if (nc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NC(info);
		else if (nc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_ship_term_cd) doCnd_ship_term_cd_NC(info);
		else if (nc == Cnd_ship_term_nm) doCnd_ship_term_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_ship_schd_no) doCnd_ship_schd_no_NC(info);
		else if (nc == Cnd_ship_inst_no) doCnd_ship_inst_no_NC(info);
		else if (nc == Cnd_ship_act_no) doCnd_ship_act_no_NC(info);
		else if (nc == Cnd_ship_act_d_no) doCnd_ship_act_d_no_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_ext_ship_act_no) doCnd_ext_ship_act_no_NC(info);
		else if (nc == Cnd_can_disp_flg) doCnd_can_disp_flg_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_d_sub_char1) doCnd_d_sub_char1_NC(info);
		else if (nc == Cnd_d_sub_char2) doCnd_d_sub_char2_NC(info);
		else if (nc == Cnd_d_sub_char3) doCnd_d_sub_char3_NC(info);
		else if (nc == BulkSet_indiv_prnt_flg) doBulkSet_indiv_prnt_flg_NC(info);
		else if (nc == BulkSet_wms_flg) doBulkSet_wms_flg_NC(info);
		else if (nc == BulkSet_not_wms_flg) doBulkSet_not_wms_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_ship_term_cd) doRslt_ship_term_cd_NC(info);
		else if (nc == columnRslt_ship_term_nm) doRslt_ship_term_nm_NC(info);
		else if (nc == columnRslt_dlv_prnt_flg) doRslt_dlv_prnt_flg_NC(info);
		else if (nc == columnRslt_adv_prnt_flg) doRslt_adv_prnt_flg_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NC(info);
		else if (nc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NC(info);
		else if (nc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NC(info);
		else if (nc == columnRslt_dlv_str_ln_cd) doRslt_dlv_str_ln_cd_NC(info);
		else if (nc == columnRslt_dlv_str_ln_nm) doRslt_dlv_str_ln_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NC(info);
		else if (nc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NC(info);
		else if (nc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NC(info);
		else if (nc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NC(info);
		else if (nc == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NC(info);
		else if (nc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NC(info);
		else if (nc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NC(info);
		else if (nc == columnRslt_base_ac_dt) doRslt_base_ac_dt_NC(info);
		else if (nc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NC(info);
		else if (nc == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_d_cnt) doRslt_d_cnt_NC(info);
		else if (nc == columnRslt_wt) doRslt_wt_NC(info);
		else if (nc == columnRslt_dim) doRslt_dim_NC(info);
		else if (nc == columnRslt_slip_cnt) doRslt_slip_cnt_NC(info);
		else if (nc == columnRslt_ship_act_no) doRslt_ship_act_no_NC(info);
		else if (nc == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_ship_act_no) doRslt_ext_ship_act_no_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_ship_inst_no) doRslt_ship_inst_no_NC(info);
		else if (nc == columnRslt_wms_flg) doRslt_wms_flg_NC(info);
		else if (nc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NC(info);
		else if (nc == columnRslt_ship_inst_disp_seq) doRslt_ship_inst_disp_seq_NC(info);
		else if (nc == columnRslt_ship_schd_no) doRslt_ship_schd_no_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NC(info);
		else if (nc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NC(info);
		else if (nc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_dlv_prnted_flg) doRslt_dlv_prnted_flg_NC(info);
		else if (nc == columnRslt_adv_prnted_flg) doRslt_adv_prnted_flg_NC(info);
		else if (nc == columnRslt_non_dlv_prnt_flg) doRslt_non_dlv_prnt_flg_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_d_sub_char1) doRslt_d_sub_char1_NC(info);
		else if (nc == columnRslt_d_sub_char2) doRslt_d_sub_char2_NC(info);
		else if (nc == columnRslt_d_sub_char3) doRslt_d_sub_char3_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_ship_inst_no) doDtl_ship_inst_no_NC(info);
		else if (nc == columnDtl_ship_act_no) doDtl_ship_act_no_NC(info);
		else if (nc == columnDtl_ship_pr_no) doDtl_ship_pr_no_NC(info);
		else if (nc == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[md]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pd_inst_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_not_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_not_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_not_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_not_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_disp_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[not_wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_not_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_prnt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dlv_prnt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_md_Group) doCnd_md_NE(info);
		else if (ne == Cnd_not_ship_flg) doCnd_not_ship_flg_NE(info);
		else if (ne == Cnd_ship_flg) doCnd_ship_flg_NE(info);
		else if (ne == Cnd_wms_flg) doCnd_wms_flg_NE(info);
		else if (ne == Cnd_not_wms_flg) doCnd_not_wms_flg_NE(info);
		else if (ne == Cnd_dlv_rqst_flg) doCnd_dlv_rqst_flg_NE(info);
		else if (ne == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NE(info);
		else if (ne == Cnd_pd_inst_dlv_flg) doCnd_pd_inst_dlv_flg_NE(info);
		else if (ne == Cnd_dlv_not_prnted) doCnd_dlv_not_prnted_NE(info);
		else if (ne == Cnd_dlv_prnted) doCnd_dlv_prnted_NE(info);
		else if (ne == Cnd_adv_not_prnted) doCnd_adv_not_prnted_NE(info);
		else if (ne == Cnd_adv_prnted) doCnd_adv_prnted_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NE(info);
		else if (ne == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NE(info);
		else if (ne == Cnd_ship_str_ln_cd) doCnd_ship_str_ln_cd_NE(info);
		else if (ne == Cnd_ship_str_ln_nm) doCnd_ship_str_ln_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NE(info);
		else if (ne == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NE(info);
		else if (ne == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NE(info);
		else if (ne == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NE(info);
		else if (ne == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NE(info);
		else if (ne == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NE(info);
		else if (ne == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NE(info);
		else if (ne == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_ship_term_cd) doCnd_ship_term_cd_NE(info);
		else if (ne == Cnd_ship_term_nm) doCnd_ship_term_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_ship_schd_no) doCnd_ship_schd_no_NE(info);
		else if (ne == Cnd_ship_inst_no) doCnd_ship_inst_no_NE(info);
		else if (ne == Cnd_ship_act_no) doCnd_ship_act_no_NE(info);
		else if (ne == Cnd_ship_act_d_no) doCnd_ship_act_d_no_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_ext_ship_act_no) doCnd_ext_ship_act_no_NE(info);
		else if (ne == Cnd_can_disp_flg) doCnd_can_disp_flg_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_d_sub_char1) doCnd_d_sub_char1_NE(info);
		else if (ne == Cnd_d_sub_char2) doCnd_d_sub_char2_NE(info);
		else if (ne == Cnd_d_sub_char3) doCnd_d_sub_char3_NE(info);
		else if (ne == BulkSet_indiv_prnt_flg) doBulkSet_indiv_prnt_flg_NE(info);
		else if (ne == BulkSet_wms_flg) doBulkSet_wms_flg_NE(info);
		else if (ne == BulkSet_not_wms_flg) doBulkSet_not_wms_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_ship_term_cd) doRslt_ship_term_cd_NE(info);
		else if (ne == columnRslt_ship_term_nm) doRslt_ship_term_nm_NE(info);
		else if (ne == columnRslt_dlv_prnt_flg) doRslt_dlv_prnt_flg_NE(info);
		else if (ne == columnRslt_adv_prnt_flg) doRslt_adv_prnt_flg_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NE(info);
		else if (ne == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NE(info);
		else if (ne == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NE(info);
		else if (ne == columnRslt_dlv_str_ln_cd) doRslt_dlv_str_ln_cd_NE(info);
		else if (ne == columnRslt_dlv_str_ln_nm) doRslt_dlv_str_ln_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NE(info);
		else if (ne == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NE(info);
		else if (ne == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NE(info);
		else if (ne == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NE(info);
		else if (ne == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NE(info);
		else if (ne == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NE(info);
		else if (ne == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NE(info);
		else if (ne == columnRslt_base_ac_dt) doRslt_base_ac_dt_NE(info);
		else if (ne == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NE(info);
		else if (ne == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_d_cnt) doRslt_d_cnt_NE(info);
		else if (ne == columnRslt_wt) doRslt_wt_NE(info);
		else if (ne == columnRslt_dim) doRslt_dim_NE(info);
		else if (ne == columnRslt_slip_cnt) doRslt_slip_cnt_NE(info);
		else if (ne == columnRslt_ship_act_no) doRslt_ship_act_no_NE(info);
		else if (ne == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_ship_act_no) doRslt_ext_ship_act_no_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_ship_inst_no) doRslt_ship_inst_no_NE(info);
		else if (ne == columnRslt_wms_flg) doRslt_wms_flg_NE(info);
		else if (ne == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NE(info);
		else if (ne == columnRslt_ship_inst_disp_seq) doRslt_ship_inst_disp_seq_NE(info);
		else if (ne == columnRslt_ship_schd_no) doRslt_ship_schd_no_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NE(info);
		else if (ne == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NE(info);
		else if (ne == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_dlv_prnted_flg) doRslt_dlv_prnted_flg_NE(info);
		else if (ne == columnRslt_adv_prnted_flg) doRslt_adv_prnted_flg_NE(info);
		else if (ne == columnRslt_non_dlv_prnt_flg) doRslt_non_dlv_prnt_flg_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_d_sub_char1) doRslt_d_sub_char1_NE(info);
		else if (ne == columnRslt_d_sub_char2) doRslt_d_sub_char2_NE(info);
		else if (ne == columnRslt_d_sub_char3) doRslt_d_sub_char3_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_ship_inst_no) doDtl_ship_inst_no_NE(info);
		else if (ne == columnDtl_ship_act_no) doDtl_ship_act_no_NE(info);
		else if (ne == columnDtl_ship_pr_no) doDtl_ship_pr_no_NE(info);
		else if (ne == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[md]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pd_inst_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_not_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_not_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_not_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_not_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_disp_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[not_wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_not_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_prnt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dlv_prnt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_md_Group) doCnd_md_NX(info);
		else if (nx == Cnd_not_ship_flg) doCnd_not_ship_flg_NX(info);
		else if (nx == Cnd_ship_flg) doCnd_ship_flg_NX(info);
		else if (nx == Cnd_wms_flg) doCnd_wms_flg_NX(info);
		else if (nx == Cnd_not_wms_flg) doCnd_not_wms_flg_NX(info);
		else if (nx == Cnd_dlv_rqst_flg) doCnd_dlv_rqst_flg_NX(info);
		else if (nx == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NX(info);
		else if (nx == Cnd_pd_inst_dlv_flg) doCnd_pd_inst_dlv_flg_NX(info);
		else if (nx == Cnd_dlv_not_prnted) doCnd_dlv_not_prnted_NX(info);
		else if (nx == Cnd_dlv_prnted) doCnd_dlv_prnted_NX(info);
		else if (nx == Cnd_adv_not_prnted) doCnd_adv_not_prnted_NX(info);
		else if (nx == Cnd_adv_prnted) doCnd_adv_prnted_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NX(info);
		else if (nx == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NX(info);
		else if (nx == Cnd_ship_str_ln_cd) doCnd_ship_str_ln_cd_NX(info);
		else if (nx == Cnd_ship_str_ln_nm) doCnd_ship_str_ln_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NX(info);
		else if (nx == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NX(info);
		else if (nx == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NX(info);
		else if (nx == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NX(info);
		else if (nx == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NX(info);
		else if (nx == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NX(info);
		else if (nx == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NX(info);
		else if (nx == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_ship_term_cd) doCnd_ship_term_cd_NX(info);
		else if (nx == Cnd_ship_term_nm) doCnd_ship_term_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_ship_schd_no) doCnd_ship_schd_no_NX(info);
		else if (nx == Cnd_ship_inst_no) doCnd_ship_inst_no_NX(info);
		else if (nx == Cnd_ship_act_no) doCnd_ship_act_no_NX(info);
		else if (nx == Cnd_ship_act_d_no) doCnd_ship_act_d_no_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_ext_ship_act_no) doCnd_ext_ship_act_no_NX(info);
		else if (nx == Cnd_can_disp_flg) doCnd_can_disp_flg_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_d_sub_char1) doCnd_d_sub_char1_NX(info);
		else if (nx == Cnd_d_sub_char2) doCnd_d_sub_char2_NX(info);
		else if (nx == Cnd_d_sub_char3) doCnd_d_sub_char3_NX(info);
		else if (nx == BulkSet_indiv_prnt_flg) doBulkSet_indiv_prnt_flg_NX(info);
		else if (nx == BulkSet_wms_flg) doBulkSet_wms_flg_NX(info);
		else if (nx == BulkSet_not_wms_flg) doBulkSet_not_wms_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_ship_term_cd) doRslt_ship_term_cd_NX(info);
		else if (nx == columnRslt_ship_term_nm) doRslt_ship_term_nm_NX(info);
		else if (nx == columnRslt_dlv_prnt_flg) doRslt_dlv_prnt_flg_NX(info);
		else if (nx == columnRslt_adv_prnt_flg) doRslt_adv_prnt_flg_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NX(info);
		else if (nx == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NX(info);
		else if (nx == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NX(info);
		else if (nx == columnRslt_dlv_str_ln_cd) doRslt_dlv_str_ln_cd_NX(info);
		else if (nx == columnRslt_dlv_str_ln_nm) doRslt_dlv_str_ln_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NX(info);
		else if (nx == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NX(info);
		else if (nx == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NX(info);
		else if (nx == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NX(info);
		else if (nx == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NX(info);
		else if (nx == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NX(info);
		else if (nx == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NX(info);
		else if (nx == columnRslt_base_ac_dt) doRslt_base_ac_dt_NX(info);
		else if (nx == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NX(info);
		else if (nx == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_d_cnt) doRslt_d_cnt_NX(info);
		else if (nx == columnRslt_wt) doRslt_wt_NX(info);
		else if (nx == columnRslt_dim) doRslt_dim_NX(info);
		else if (nx == columnRslt_slip_cnt) doRslt_slip_cnt_NX(info);
		else if (nx == columnRslt_ship_act_no) doRslt_ship_act_no_NX(info);
		else if (nx == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_ship_act_no) doRslt_ext_ship_act_no_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_ship_inst_no) doRslt_ship_inst_no_NX(info);
		else if (nx == columnRslt_wms_flg) doRslt_wms_flg_NX(info);
		else if (nx == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NX(info);
		else if (nx == columnRslt_ship_inst_disp_seq) doRslt_ship_inst_disp_seq_NX(info);
		else if (nx == columnRslt_ship_schd_no) doRslt_ship_schd_no_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NX(info);
		else if (nx == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NX(info);
		else if (nx == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_dlv_prnted_flg) doRslt_dlv_prnted_flg_NX(info);
		else if (nx == columnRslt_adv_prnted_flg) doRslt_adv_prnted_flg_NX(info);
		else if (nx == columnRslt_non_dlv_prnt_flg) doRslt_non_dlv_prnt_flg_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_d_sub_char1) doRslt_d_sub_char1_NX(info);
		else if (nx == columnRslt_d_sub_char2) doRslt_d_sub_char2_NX(info);
		else if (nx == columnRslt_d_sub_char3) doRslt_d_sub_char3_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_ship_inst_no) doDtl_ship_inst_no_NX(info);
		else if (nx == columnDtl_ship_act_no) doDtl_ship_act_no_NX(info);
		else if (nx == columnDtl_ship_pr_no) doDtl_ship_pr_no_NX(info);
		else if (nx == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[md]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pd_inst_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_not_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_not_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_not_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_not_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_disp_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[not_wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_not_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_prnt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dlv_prnt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_ship_loc_cd) doCnd_ship_loc_cd_LC(info);
		else if (lc == Cnd_ship_loc_nm) doCnd_ship_loc_nm_LC(info);
		else if (lc == Cnd_ship_str_ln_cd) doCnd_ship_str_ln_cd_LC(info);
		else if (lc == Cnd_ship_str_ln_nm) doCnd_ship_str_ln_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_LC(info);
		else if (lc == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_LC(info);
		else if (lc == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_LC(info);
		else if (lc == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_LC(info);
		else if (lc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_LC(info);
		else if (lc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_LC(info);
		else if (lc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_LC(info);
		else if (lc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_ship_term_cd) doCnd_ship_term_cd_LC(info);
		else if (lc == Cnd_ship_term_nm) doCnd_ship_term_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_ship_schd_no) doCnd_ship_schd_no_LC(info);
		else if (lc == Cnd_ship_inst_no) doCnd_ship_inst_no_LC(info);
		else if (lc == Cnd_ship_act_no) doCnd_ship_act_no_LC(info);
		else if (lc == Cnd_ship_act_d_no) doCnd_ship_act_d_no_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_ext_ship_act_no) doCnd_ext_ship_act_no_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_d_sub_char1) doCnd_d_sub_char1_LC(info);
		else if (lc == Cnd_d_sub_char2) doCnd_d_sub_char2_LC(info);
		else if (lc == Cnd_d_sub_char3) doCnd_d_sub_char3_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_ship_term_cd) doRslt_ship_term_cd_LC(info);
		else if (lc == columnRslt_ship_term_nm) doRslt_ship_term_nm_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_LC(info);
		else if (lc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_LC(info);
		else if (lc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_LC(info);
		else if (lc == columnRslt_dlv_str_ln_cd) doRslt_dlv_str_ln_cd_LC(info);
		else if (lc == columnRslt_dlv_str_ln_nm) doRslt_dlv_str_ln_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_LC(info);
		else if (lc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_LC(info);
		else if (lc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_LC(info);
		else if (lc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_LC(info);
		else if (lc == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_LC(info);
		else if (lc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_LC(info);
		else if (lc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_LC(info);
		else if (lc == columnRslt_base_ac_dt) doRslt_base_ac_dt_LC(info);
		else if (lc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_LC(info);
		else if (lc == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_d_cnt) doRslt_d_cnt_LC(info);
		else if (lc == columnRslt_wt) doRslt_wt_LC(info);
		else if (lc == columnRslt_dim) doRslt_dim_LC(info);
		else if (lc == columnRslt_slip_cnt) doRslt_slip_cnt_LC(info);
		else if (lc == columnRslt_ship_act_no) doRslt_ship_act_no_LC(info);
		else if (lc == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_ship_act_no) doRslt_ext_ship_act_no_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_ship_inst_no) doRslt_ship_inst_no_LC(info);
		else if (lc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_LC(info);
		else if (lc == columnRslt_ship_inst_disp_seq) doRslt_ship_inst_disp_seq_LC(info);
		else if (lc == columnRslt_ship_schd_no) doRslt_ship_schd_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_LC(info);
		else if (lc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_LC(info);
		else if (lc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_d_sub_char1) doRslt_d_sub_char1_LC(info);
		else if (lc == columnRslt_d_sub_char2) doRslt_d_sub_char2_LC(info);
		else if (lc == columnRslt_d_sub_char3) doRslt_d_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_ship_inst_no) doDtl_ship_inst_no_LC(info);
		else if (lc == columnDtl_ship_act_no) doDtl_ship_act_no_LC(info);
		else if (lc == columnDtl_ship_pr_no) doDtl_ship_pr_no_LC(info);
		else if (lc == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_ship_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_d_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_str_ln_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_sub_char3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_loc_cd]の作成メソッド
	 */
	public MCList getCnd_ship_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_ship_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_to_id_typ]の作成メソッド
	 */
	public MCList getCnd_ship_to_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipToIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_to_id_cd]の作成メソッド
	 */
	public MCList getCnd_ship_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_typ]の作成メソッド
	 */
	public MCList getCnd_dlv_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDlvIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getDlvId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_term_cd]の作成メソッド
	 */
	public MCList getCnd_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
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
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt_ship_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1450.Srch01")) {
			return new MS_MSBEL1450_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1450.Ins01")) {
			return new MS_MSBEL1450_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL1450.Del01")) {
			return new MS_MSBEL1450_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1450.Prnt01")) {
			return new MS_MSBEL1450_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1450_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1450_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1450_Srch01Bridge() {
			p_MS_MSBEL1450_Srch01 = new MCParam(PDef.MS_MSBEL1450_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1450_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1450.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.DtlR.class));

			p_MS_MSBEL1450_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1450_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1450_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1450_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1450_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1450.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1450.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1450.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1450_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
			p_MS_MSBEL1450_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1450_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)p_MS_MSBEL1450_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1450.DtlR>)p_MS_MSBEL1450_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1450_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1450_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL1450_Ins01Bridge() {
			p_MS_MSBEL1450_Ins01 = new MCParam(PDef.MS_MSBEL1450_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1450_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1450.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));

			p_MS_MSBEL1450_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1450_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1450_Ins01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1450_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1450_Ins01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1450_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1450_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1450.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1450.BulkSetR up2() {
			return (mcframe.clientMSBE.MSBEP1450.BulkSetR)up(2);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1450_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1450_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)p_MS_MSBEL1450_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getDtlL());
			result.add(getBulkSetR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1450_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1450_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1450_Del01Bridge() {
			p_MS_MSBEL1450_Del01 = new MCParam(PDef.MS_MSBEL1450_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1450_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1450.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));

			p_MS_MSBEL1450_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1450_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1450_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1450_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1450_Del01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1450_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1450_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1450.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1450.BulkSetR up2() {
			return (mcframe.clientMSBE.MSBEP1450.BulkSetR)up(2);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1450_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1450_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)p_MS_MSBEL1450_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getDtlL());
			result.add(getBulkSetR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1450_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1450_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1450_Prnt01Bridge() {
			p_MS_MSBEL1450_Prnt01 = new MCParam(PDef.MS_MSBEL1450_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1450_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1450.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));

			p_MS_MSBEL1450_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1450_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1450_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1450_Prnt01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1450_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1450_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1450.BulkSetR up1() {
			return (mcframe.clientMSBE.MSBEP1450.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1450.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1450_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1450.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1450_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1450.RsltR>)p_MS_MSBEL1450_Prnt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBulkSetR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}