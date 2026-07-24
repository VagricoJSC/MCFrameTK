package mcframe.clientMSBE.MSBEP1410;

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
import mcframe.clientMSBE.MSBEP1410.MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Srch01Caller;
import mcframe.clientMSBE.MSBEP1410.MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Ins01Caller;
import mcframe.clientMSBE.MSBEP1410.MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Del01Caller;
import mcframe.clientMSBE.MSBEP1410.MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Prnt01Caller;

/**
 * 画面"MSBEP_ShipInstListReg"パネルクラスです。<p>
 *
 * 出荷元物流グループ単位で一括で指図を実施します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipInstListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1410";

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
	// [PrSts]ブロック関連のField定義
	public MCPanel PrStsPanel = null;
	public MCTitledBorder PrStsTitledBorder = null;
	// [PrSts]ブロックの項目のField定義
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
	// [ShipToGrp]ブロック関連のField定義
	public MCPanel ShipToGrpPanel = null;
	// [ShipToGrp]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [DlvGrp]ブロック関連のField定義
	public MCPanel DlvGrpPanel = null;
	// [DlvGrp]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [CstGrp]ブロック関連のField定義
	public MCPanel CstGrpPanel = null;
	// [CstGrp]ブロックの項目のField定義
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [AllocSts]ブロック関連のField定義
	public MCPanel AllocStsPanel = null;
	public MCTitledBorder AllocStsTitledBorder = null;
	// [AllocSts]ブロックの項目のField定義
	// [SchdSts]ブロック関連のField定義
	public MCPanel SchdStsPanel = null;
	public MCTitledBorder SchdStsTitledBorder = null;
	// [SchdSts]ブロックの項目のField定義
	// [PickPrnt]ブロック関連のField定義
	public MCPanel PickPrntPanel = null;
	public MCTitledBorder PickPrntTitledBorder = null;
	// [PickPrnt]ブロックの項目のField定義
	// [InstPrnt]ブロック関連のField定義
	public MCPanel InstPrntPanel = null;
	public MCTitledBorder InstPrntTitledBorder = null;
	// [InstPrnt]ブロックの項目のField定義
	// [DlvPrnt]ブロック関連のField定義
	public MCPanel DlvPrntPanel = null;
	public MCTitledBorder DlvPrntTitledBorder = null;
	// [DlvPrnt]ブロックの項目のField定義
	// [AdvPrnt]ブロック関連のField定義
	public MCPanel AdvPrntPanel = null;
	public MCTitledBorder AdvPrntTitledBorder = null;
	// [AdvPrnt]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Hdr,Header;Dtl,Details;Dlv,Delivery note Hdr,ヘッダ;Dtl,明細;Dlv,納品書.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_unit_Group = null;
	public MCRadioButton Cnd_disp_unit_Hdr = null;
	public MCRadioButton Cnd_disp_unit_Dtl = null;
	public MCRadioButton Cnd_disp_unit_Dlv = null;
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public MCCheckBox Cnd_uninst = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst = null;
	/**
	 * Partially shipped 一部出荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_p_ship = null;
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_ship = null;
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public MCCheckBox Cnd_not_alloc_flg = null;
	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public MCCheckBox Cnd_part_alloc_flg = null;
	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public MCCheckBox Cnd_all_alloc_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_invalid_flg = null;
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
	 * Desired shipping date delayed 出荷希望日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_late_ship = null;
	/**
	 * Delivery request date delayed 納品依頼日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_late_rqst = null;
	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_pick_not_prnted = null;
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_pick_prnted = null;
	/**
	 * Shipping order sheet unissued 出荷指図書未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_not_prnted = null;
	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_prnted = null;
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
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_schd_dt_frto_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ship_schd_dt_frto_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ship_schd_dt_frto_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ship_schd_dt_frto_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ship_schd_dt_frto_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_inst_dt_frto_p_PPanel;
	public MCDateField Cnd_ship_inst_dt_fr;	// [Cnd]の[ship_inst_dt_frto_p.ymd_fr]を[Cnd_ship_inst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_hm_fr;	// [Cnd]の[ship_inst_dt_frto_p.hm_fr]を[Cnd_ship_inst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_dt_to;	// [Cnd]の[ship_inst_dt_frto_p.ymd_to]を[Cnd_ship_inst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_hm_to;	// [Cnd]の[ship_inst_dt_frto_p.hm_to]を[Cnd_ship_inst_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_ship_loc_cd_Label = null;
	/**
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_cd = null;
	/**
	 * Shipping point location name 出荷元場所名.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_nm = null;
	public MCLabel Cnd_ship_str_ln_cd_Label = null;
	/**
	 * Shipping point rack/line cd. 出荷元棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_str_ln_cd = null;
	/**
	 * Shipping point rack/line name 出荷元棚・ライン名.<p>
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
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
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
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
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
	public MCLabel Cnd_ship_wk_cd_Label = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCTextField Cnd_ship_wk_nm = null;
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
	public MCLabel Cnd_iv_itm_nm_Label = null;
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCTextField Cnd_iv_itm_nm = null;
	public MCLabel Cnd_inst_usr_cd_Label = null;
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_inst_usr_cd = null;
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public MCTextField Cnd_inst_usr_nm = null;
	public MCLabel Cnd_inst_dpt_cd_Label = null;
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_inst_dpt_cd = null;
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public MCTextField Cnd_inst_dpt_nm = null;
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
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
	public MCLabel Cnd_xfr_schd_no_Label = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_xfr_schd_no = null;
	public MCLabel Cnd_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_d_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_inst_rmrks_Label = null;
	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public MCTextField Cnd_inst_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_can_disp_flg = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_ship_to_grp_p_PPanel;
	public MCLabel Cnd_ship_to_grp_lab1;	// [Cnd]の[ship_to_grp_p.bp_grp_lab1]を[Cnd_ship_to_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg1;	// [Cnd]の[ship_to_grp_p.bp_grp_flg1]を[Cnd_ship_to_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd1;	// [Cnd]の[ship_to_grp_p.bp_grp_cd1]を[Cnd_ship_to_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm1;	// [Cnd]の[ship_to_grp_p.bp_grp_nm1]を[Cnd_ship_to_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab2;	// [Cnd]の[ship_to_grp_p.bp_grp_lab2]を[Cnd_ship_to_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg2;	// [Cnd]の[ship_to_grp_p.bp_grp_flg2]を[Cnd_ship_to_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd2;	// [Cnd]の[ship_to_grp_p.bp_grp_cd2]を[Cnd_ship_to_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm2;	// [Cnd]の[ship_to_grp_p.bp_grp_nm2]を[Cnd_ship_to_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab3;	// [Cnd]の[ship_to_grp_p.bp_grp_lab3]を[Cnd_ship_to_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg3;	// [Cnd]の[ship_to_grp_p.bp_grp_flg3]を[Cnd_ship_to_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd3;	// [Cnd]の[ship_to_grp_p.bp_grp_cd3]を[Cnd_ship_to_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm3;	// [Cnd]の[ship_to_grp_p.bp_grp_nm3]を[Cnd_ship_to_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab4;	// [Cnd]の[ship_to_grp_p.bp_grp_lab4]を[Cnd_ship_to_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg4;	// [Cnd]の[ship_to_grp_p.bp_grp_flg4]を[Cnd_ship_to_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd4;	// [Cnd]の[ship_to_grp_p.bp_grp_cd4]を[Cnd_ship_to_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm4;	// [Cnd]の[ship_to_grp_p.bp_grp_nm4]を[Cnd_ship_to_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab5;	// [Cnd]の[ship_to_grp_p.bp_grp_lab5]を[Cnd_ship_to_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg5;	// [Cnd]の[ship_to_grp_p.bp_grp_flg5]を[Cnd_ship_to_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd5;	// [Cnd]の[ship_to_grp_p.bp_grp_cd5]を[Cnd_ship_to_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm5;	// [Cnd]の[ship_to_grp_p.bp_grp_nm5]を[Cnd_ship_to_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab6;	// [Cnd]の[ship_to_grp_p.bp_grp_lab6]を[Cnd_ship_to_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg6;	// [Cnd]の[ship_to_grp_p.bp_grp_flg6]を[Cnd_ship_to_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd6;	// [Cnd]の[ship_to_grp_p.bp_grp_cd6]を[Cnd_ship_to_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm6;	// [Cnd]の[ship_to_grp_p.bp_grp_nm6]を[Cnd_ship_to_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab7;	// [Cnd]の[ship_to_grp_p.bp_grp_lab7]を[Cnd_ship_to_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg7;	// [Cnd]の[ship_to_grp_p.bp_grp_flg7]を[Cnd_ship_to_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd7;	// [Cnd]の[ship_to_grp_p.bp_grp_cd7]を[Cnd_ship_to_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm7;	// [Cnd]の[ship_to_grp_p.bp_grp_nm7]を[Cnd_ship_to_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab8;	// [Cnd]の[ship_to_grp_p.bp_grp_lab8]を[Cnd_ship_to_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg8;	// [Cnd]の[ship_to_grp_p.bp_grp_flg8]を[Cnd_ship_to_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd8;	// [Cnd]の[ship_to_grp_p.bp_grp_cd8]を[Cnd_ship_to_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm8;	// [Cnd]の[ship_to_grp_p.bp_grp_nm8]を[Cnd_ship_to_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab9;	// [Cnd]の[ship_to_grp_p.bp_grp_lab9]を[Cnd_ship_to_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg9;	// [Cnd]の[ship_to_grp_p.bp_grp_flg9]を[Cnd_ship_to_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd9;	// [Cnd]の[ship_to_grp_p.bp_grp_cd9]を[Cnd_ship_to_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm9;	// [Cnd]の[ship_to_grp_p.bp_grp_nm9]を[Cnd_ship_to_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_ship_to_grp_lab10;	// [Cnd]の[ship_to_grp_p.bp_grp_lab10]を[Cnd_ship_to_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_ship_to_grp_flg10;	// [Cnd]の[ship_to_grp_p.bp_grp_flg10]を[Cnd_ship_to_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_to_grp_cd10;	// [Cnd]の[ship_to_grp_p.bp_grp_cd10]を[Cnd_ship_to_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_ship_to_grp_nm10;	// [Cnd]の[ship_to_grp_p.bp_grp_nm10]を[Cnd_ship_to_grp_nm10]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_ship_inst_tm_p_PPanel;
	public MCDateField BulkSet_ship_inst_dt;	// [BulkSet]の[ship_inst_tm_p.ymd]を[BulkSet_ship_inst_dt]としてエイリアス定義。
	public MCDateField BulkSet_ship_inst_hm;	// [BulkSet]の[ship_inst_tm_p.hm]を[BulkSet_ship_inst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_inst_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_inst_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_inst_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_inst_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_inst_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_inst_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_inst_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_inst_dpt_nm]としてエイリアス定義。
	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public MCCheckBox BulkSet_indiv_inst_prnt_flg = null;
	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public MCCheckBox BulkSet_indiv_prnt_flg = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1410.RsltR> RsltTable = null;
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
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_abl_flg = null;
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_tgt_flg = null;
	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_prop_flg = null;
	/**
	 * Packing 梱包.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_flg = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_ship_schd_dt;// [Rslt]の[ship_schd_tm_p.ymd]を[columnRslt_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_schd_hm;// [Rslt]の[ship_schd_tm_p.hm]を[columnRslt_ship_schd_hm]としてエイリアス定義。
	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_time = null;
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_dt = null;
	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_hm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_dlv_schd_dt;// [Rslt]の[dlv_schd_tm_p.ymd]を[columnRslt_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_schd_hm;// [Rslt]の[dlv_schd_tm_p.hm]を[columnRslt_dlv_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_inst_tm_p_PPanel;
	public MCColumnConfig columnRslt_ship_inst_dt;// [Rslt]の[ship_inst_tm_p.ymd]を[columnRslt_ship_inst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_inst_hm;// [Rslt]の[ship_inst_tm_p.hm]を[columnRslt_ship_inst_hm]としてエイリアス定義。
	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_tm = null;
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_lg_grp_cd = null;
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
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_nm = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Rslt_ship_to_addr_p_PPanel;
	public MCColumnConfig columnRslt_cntry_cd;// [Rslt]の[ship_to_addr_p.cntry_cd]を[columnRslt_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_nm;// [Rslt]の[ship_to_addr_p.cntry_nm]を[columnRslt_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_zip_cd;// [Rslt]の[ship_to_addr_p.zip_cd]を[columnRslt_ship_to_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr1;// [Rslt]の[ship_to_addr_p.addr1]を[columnRslt_ship_to_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr2;// [Rslt]の[ship_to_addr_p.addr2]を[columnRslt_ship_to_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr3;// [Rslt]の[ship_to_addr_p.addr3]を[columnRslt_ship_to_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr4;// [Rslt]の[ship_to_addr_p.addr4]を[columnRslt_ship_to_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_dpt;// [Rslt]の[ship_to_addr_p.cntct_dpt]を[columnRslt_ship_to_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_psn;// [Rslt]の[ship_to_addr_p.cntct_psn]を[columnRslt_ship_to_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_tel;// [Rslt]の[ship_to_addr_p.tel]を[columnRslt_ship_to_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_fax;// [Rslt]の[ship_to_addr_p.fax]を[columnRslt_ship_to_fax]としてエイリアス定義。
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_sundry_flg = null;
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_dlv_typ_nm = null;
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
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_grp_nm = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_nm = null;
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pick_prnt_flg = null;
	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_prnt_flg = null;
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
	 * Number of details 明細件数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_num_of_details = null;
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
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_nm = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_nm = null;
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_block_flg = null;
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pd_inst_dlv_dt = null;
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pd_inst_dlv_hm = null;
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_day_week_typ = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_day_week_typ_nm = null;
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_dt = null;
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_hm = null;
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_assort_typ = null;
	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_assort_typ_nm = null;
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_itm_grp_no = null;
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
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
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
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_act_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_qty;// [Rslt]の[act_cont_qty_p.cont_qty]を[columnRslt_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_std_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_qty;// [Rslt]の[std_cont_qty_p.cont_qty]を[columnRslt_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_scope_typ = null;
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_typ = null;
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_typ_nm = null;
	/**
	 * Location allocated 場所引当済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
	/**
	 * Gross allocated 総量引当済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_grp_alloc_flg = null;
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
	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_str_ln_cd = null;
	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_str_ln_nm = null;
	/**
	 * Without Shipping rack/line 出荷棚・ラインなし.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_str_ln_cd_none_flg = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_ship_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_ship_act_qty;// [Rslt]の[ship_act_qty_p.qty]を[columnRslt_ship_act_qty]としてエイリアス定義。
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dim = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_inst_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_inst_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_inst_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_inst_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_inst_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_inst_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_inst_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_inst_dpt_nm]としてエイリアス定義。
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
	 * Order remarks 指図備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_rmrks = null;
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
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_d_rmrks = null;
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
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_no = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_no = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_d_no = null;
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wms_flg = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_schd_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_ship_flg = null;
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
	 * Result split 実績分割.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_split_flg = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_alloc_sts_no = null;
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pick_prnted_flg = null;
	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_prnted_flg = null;
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
	 * Not for packing 梱包不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_disable_flg = null;
	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_dlv_prnt_flg = null;
	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_adv_prnt_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_ship_to_grp_p_PPanel;
	public MCColumnConfig columnRslt_ship_to_grp_cd1;// [Rslt]の[ship_to_grp_p.bp_grp_cd1]を[columnRslt_ship_to_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm1;// [Rslt]の[ship_to_grp_p.bp_grp_nm1]を[columnRslt_ship_to_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd2;// [Rslt]の[ship_to_grp_p.bp_grp_cd2]を[columnRslt_ship_to_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm2;// [Rslt]の[ship_to_grp_p.bp_grp_nm2]を[columnRslt_ship_to_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd3;// [Rslt]の[ship_to_grp_p.bp_grp_cd3]を[columnRslt_ship_to_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm3;// [Rslt]の[ship_to_grp_p.bp_grp_nm3]を[columnRslt_ship_to_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd4;// [Rslt]の[ship_to_grp_p.bp_grp_cd4]を[columnRslt_ship_to_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm4;// [Rslt]の[ship_to_grp_p.bp_grp_nm4]を[columnRslt_ship_to_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd5;// [Rslt]の[ship_to_grp_p.bp_grp_cd5]を[columnRslt_ship_to_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm5;// [Rslt]の[ship_to_grp_p.bp_grp_nm5]を[columnRslt_ship_to_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd6;// [Rslt]の[ship_to_grp_p.bp_grp_cd6]を[columnRslt_ship_to_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm6;// [Rslt]の[ship_to_grp_p.bp_grp_nm6]を[columnRslt_ship_to_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd7;// [Rslt]の[ship_to_grp_p.bp_grp_cd7]を[columnRslt_ship_to_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm7;// [Rslt]の[ship_to_grp_p.bp_grp_nm7]を[columnRslt_ship_to_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd8;// [Rslt]の[ship_to_grp_p.bp_grp_cd8]を[columnRslt_ship_to_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm8;// [Rslt]の[ship_to_grp_p.bp_grp_nm8]を[columnRslt_ship_to_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd9;// [Rslt]の[ship_to_grp_p.bp_grp_cd9]を[columnRslt_ship_to_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm9;// [Rslt]の[ship_to_grp_p.bp_grp_nm9]を[columnRslt_ship_to_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_cd10;// [Rslt]の[ship_to_grp_p.bp_grp_cd10]を[columnRslt_ship_to_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_grp_nm10;// [Rslt]の[ship_to_grp_p.bp_grp_nm10]を[columnRslt_ship_to_grp_nm10]としてエイリアス定義。
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
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_upd_cntr = null;
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
	 * List No. リストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_list_no = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1410.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_list_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_no = null;
	/**
	 * Shipping schedule update counter 出荷予定更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_upd_cntr = null;
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
	 * Change shipping schedule 出荷予定変更.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1420 = null;
	/**
	 * Shipping order entry 出荷指図登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1400 = null;
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0110 = null;
	/**
	 * Picking list ピッキングリスト.<p>
	 *
	 */
	public MCButton Btn_prnt_pick = null;
	/**
	 * Shipping order sheet 出荷指図書.<p>
	 *
	 */
	public MCButton Btn_prnt_inst = null;
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public MCButton Btn_prnt_dlv = null;
	/**
	 * Shipping guide 出荷案内書.<p>
	 *
	 */
	public MCButton Btn_prnt_adv = null;
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
	 * Select location allocation 場所引当選択.<p>
	 *
	 */
	public MCLabel Btn_label_alloc = null;
	/**
	 * Select all location allocation 場所引当全選択.<p>
	 *
	 */
	public MCButton Btn_alloc_select_all = null;
	/**
	 * Release all location allocation 場所引当全解除.<p>
	 *
	 */
	public MCButton Btn_alloc_deselect_all = null;
	/**
	 * Select lot suggestion ロット提案選択.<p>
	 *
	 */
	public MCLabel Btn_label_lot_prop = null;
	/**
	 * Select all lot suggestion ロット提案全選択.<p>
	 *
	 */
	public MCButton Btn_lot_prop_select_all = null;
	/**
	 * Release all lot suggestion ロット提案全解除.<p>
	 *
	 */
	public MCButton Btn_lot_prop_deselect_all = null;
	/**
	 * Select packing 梱包選択.<p>
	 *
	 */
	public MCLabel Btn_label_pack = null;
	/**
	 * Select all packing 梱包全選択.<p>
	 *
	 */
	public MCButton Btn_pack_select_all = null;
	/**
	 * Release all packing 梱包全解除.<p>
	 *
	 */
	public MCButton Btn_pack_deselect_all = null;
	/**
	 * Select picking list immediate issue ピッキングリスト即時発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_pick_prnt = null;
	/**
	 * Select all picking list immediate issue ピッキングリスト即時発行全選択.<p>
	 *
	 */
	public MCButton Btn_pick_prnt_select_all = null;
	/**
	 * Release all picking list immediate issue ピッキングリスト即時発行全解除.<p>
	 *
	 */
	public MCButton Btn_pick_prnt_deselect_all = null;
	/**
	 * Select shipping order sheet immediate issue 出荷指図書即時発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_inst_prnt = null;
	/**
	 * Select all shipping order sheet immediate issue 出荷指図書即時発行全選択.<p>
	 *
	 */
	public MCButton Btn_inst_prnt_select_all = null;
	/**
	 * Release all shipping order sheet immediate issue 出荷指図書即時発行全解除.<p>
	 *
	 */
	public MCButton Btn_inst_prnt_deselect_all = null;
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
	public MCButton Btn_ins01 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del01 = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	// [WmsTrgt]ブロック関連のField定義
	public MCPanel WmsTrgtPanel = null;
	public MCTitledBorder WmsTrgtTitledBorder = null;
	// [WmsTrgt]ブロックの項目のField定義
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [SRCH_PR]モードを表す定数 */
	public static final String SRCH_PR = "SRCH_PR";
	/** [SRCH_PR_DLV]モードを表す定数 */
	public static final String SRCH_PR_DLV = "SRCH_PR_DLV";
	/** [SRCH_REF_H]モードを表す定数 */
	public static final String SRCH_REF_H = "SRCH_REF_H";
	/** [SRCH_REF_D]モードを表す定数 */
	public static final String SRCH_REF_D = "SRCH_REF_D";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";
	/** [PRNT_DLV]モードを表す定数 */
	public static final String PRNT_DLV = "PRNT_DLV";
	/** [REF_H]モードを表す定数 */
	public static final String REF_H = "REF_H";
	/** [REF_D]モードを表す定数 */
	public static final String REF_D = "REF_D";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UPD, SRCH_DEL, SRCH_PR, SRCH_PR_DLV, SRCH_REF_H, SRCH_REF_D, UPD, DEL, PRNT, PRNT_DLV, REF_H, REF_D, FIX_U};
	
	/** [MS_MSBEL1410_Srch01]のCallerの作成 */
	protected MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Srch01Caller createMS_MSBEL1410_Srch01() {
		MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Srch01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Srch01Bridge>
		caller = ((MSBEP_ShipInstListReg_MC)this).new MS_MSBEL1410_Srch01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Srch01Bridge>(
					(MSBEP_ShipInstListReg)this, new MS_MSBEL1410_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1410_Srch01]の呼び出し */
	protected void callMS_MSBEL1410_Srch01() {
		MCCaller caller = createMS_MSBEL1410_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1410_Ins01]のCallerの作成 */
	protected MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Ins01Caller createMS_MSBEL1410_Ins01() {
		MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Ins01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Ins01Bridge>
		caller = ((MSBEP_ShipInstListReg_MC)this).new MS_MSBEL1410_Ins01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Ins01Bridge>(
					(MSBEP_ShipInstListReg)this, new MS_MSBEL1410_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL1410_Ins01]の呼び出し */
	protected void callMS_MSBEL1410_Ins01() {
		MCCaller caller = createMS_MSBEL1410_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL1410_Del01]のCallerの作成 */
	protected MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Del01Caller createMS_MSBEL1410_Del01() {
		MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Del01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Del01Bridge>
		caller = ((MSBEP_ShipInstListReg_MC)this).new MS_MSBEL1410_Del01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Del01Bridge>(
					(MSBEP_ShipInstListReg)this, new MS_MSBEL1410_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1410_Del01]の呼び出し */
	protected void callMS_MSBEL1410_Del01() {
		MCCaller caller = createMS_MSBEL1410_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1410_Prnt01]のCallerの作成 */
	protected MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Prnt01Caller createMS_MSBEL1410_Prnt01() {
		MSBEP_ShipInstListReg_MC.MS_MSBEL1410_Prnt01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Prnt01Bridge>
		caller = ((MSBEP_ShipInstListReg_MC)this).new MS_MSBEL1410_Prnt01Caller<MSBEP_ShipInstListReg, MS_MSBEL1410_Prnt01Bridge>(
					(MSBEP_ShipInstListReg)this, new MS_MSBEL1410_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1410_Prnt01]の呼び出し */
	protected void callMS_MSBEL1410_Prnt01() {
		MCCaller caller = createMS_MSBEL1410_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1410.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1410.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1410.RsltR> aRsltL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1410.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1410.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1410.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1410.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1410.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBE.MSBEP1410.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1410.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1410.BulkSetR createBulkSetR() {
		return mcframe.clientMSBE.MSBEP1410.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1410.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1410.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1410.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1410.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1410.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class);
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
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1410.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1410.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1410.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1410.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1410.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1410.DtlR.class);
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
		ret.add(DispUnitPanel);
		ret.add(PrStsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(ShipToGrpPanel);
		ret.add(Tab3Panel);
		ret.add(DlvGrpPanel);
		ret.add(Tab4Panel);
		ret.add(CstGrpPanel);
		ret.add(Tab5Panel);
		ret.add(ItmGrpPanel);
		ret.add(AllocStsPanel);
		ret.add(SchdStsPanel);
		ret.add(PickPrntPanel);
		ret.add(InstPrntPanel);
		ret.add(DlvPrntPanel);
		ret.add(AdvPrntPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		ret.add(WmsTrgtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipInstListReg_MC_A() {
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
	public MSBEP_ShipInstListReg_MC_A(String name) {
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
		MSBEP_ShipInstListReg_MC.jbCreateScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateDispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreatePrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateTop((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateFold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateTab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateTab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateTab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateDlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateTab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateCstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateTab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateAllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateSchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreatePickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateInstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateDlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateAdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateCnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateCtrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateRPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateBulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateRslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateDtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateEastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbCreateWmsTrgt((MSBEP_ShipInstListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [PrSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrSts(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [ShipToGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipToGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [DlvGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [CstGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [AllocSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocSts(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [SchdSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSchdSts(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [PickPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePickPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [InstPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInstPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [DlvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [AdvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdvPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipInstListReg p) {
		p.Cnd_ship_schd_dt_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_schd_dt_frto_p());
		p.Cnd_ship_schd_dt_frto_p_PPanel.setName("Cnd.ship_schd_dt_frto_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ship_schd_dt_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ship_schd_dt_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ship_schd_dt_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ship_schd_dt_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
		p.Cnd_ship_inst_dt_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_inst_dt_frto_p());
		p.Cnd_ship_inst_dt_frto_p_PPanel.setName("Cnd.ship_inst_dt_frto_p");
		p.Cnd_ship_inst_dt_fr = p.Cnd_ship_inst_dt_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_inst_dt_fr.addAliasName("Cnd.ship_inst_dt_fr", p);
		p.Cnd_ship_inst_hm_fr = p.Cnd_ship_inst_dt_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_inst_hm_fr.addAliasName("Cnd.ship_inst_hm_fr", p);
		p.Cnd_ship_inst_dt_to = p.Cnd_ship_inst_dt_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_inst_dt_to.addAliasName("Cnd.ship_inst_dt_to", p);
		p.Cnd_ship_inst_hm_to = p.Cnd_ship_inst_dt_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_inst_hm_to.addAliasName("Cnd.ship_inst_hm_to", p);
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
		p.Cnd_ship_to_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().ship_to_grp_p());
		p.Cnd_ship_to_grp_p_PPanel.setName("Cnd.ship_to_grp_p");
		p.Cnd_ship_to_grp_lab1 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_ship_to_grp_lab1.addAliasName("Cnd.ship_to_grp_lab1", p);
		p.Cnd_ship_to_grp_flg1 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_ship_to_grp_flg1.addAliasName("Cnd.ship_to_grp_flg1", p);
		p.Cnd_ship_to_grp_cd1 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_ship_to_grp_cd1.addAliasName("Cnd.ship_to_grp_cd1", p);
		p.Cnd_ship_to_grp_nm1 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_ship_to_grp_nm1.addAliasName("Cnd.ship_to_grp_nm1", p);
		p.Cnd_ship_to_grp_lab2 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_ship_to_grp_lab2.addAliasName("Cnd.ship_to_grp_lab2", p);
		p.Cnd_ship_to_grp_flg2 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_ship_to_grp_flg2.addAliasName("Cnd.ship_to_grp_flg2", p);
		p.Cnd_ship_to_grp_cd2 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_ship_to_grp_cd2.addAliasName("Cnd.ship_to_grp_cd2", p);
		p.Cnd_ship_to_grp_nm2 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_ship_to_grp_nm2.addAliasName("Cnd.ship_to_grp_nm2", p);
		p.Cnd_ship_to_grp_lab3 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_ship_to_grp_lab3.addAliasName("Cnd.ship_to_grp_lab3", p);
		p.Cnd_ship_to_grp_flg3 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_ship_to_grp_flg3.addAliasName("Cnd.ship_to_grp_flg3", p);
		p.Cnd_ship_to_grp_cd3 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_ship_to_grp_cd3.addAliasName("Cnd.ship_to_grp_cd3", p);
		p.Cnd_ship_to_grp_nm3 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_ship_to_grp_nm3.addAliasName("Cnd.ship_to_grp_nm3", p);
		p.Cnd_ship_to_grp_lab4 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_ship_to_grp_lab4.addAliasName("Cnd.ship_to_grp_lab4", p);
		p.Cnd_ship_to_grp_flg4 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_ship_to_grp_flg4.addAliasName("Cnd.ship_to_grp_flg4", p);
		p.Cnd_ship_to_grp_cd4 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_ship_to_grp_cd4.addAliasName("Cnd.ship_to_grp_cd4", p);
		p.Cnd_ship_to_grp_nm4 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_ship_to_grp_nm4.addAliasName("Cnd.ship_to_grp_nm4", p);
		p.Cnd_ship_to_grp_lab5 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_ship_to_grp_lab5.addAliasName("Cnd.ship_to_grp_lab5", p);
		p.Cnd_ship_to_grp_flg5 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_ship_to_grp_flg5.addAliasName("Cnd.ship_to_grp_flg5", p);
		p.Cnd_ship_to_grp_cd5 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_ship_to_grp_cd5.addAliasName("Cnd.ship_to_grp_cd5", p);
		p.Cnd_ship_to_grp_nm5 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_ship_to_grp_nm5.addAliasName("Cnd.ship_to_grp_nm5", p);
		p.Cnd_ship_to_grp_lab6 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_ship_to_grp_lab6.addAliasName("Cnd.ship_to_grp_lab6", p);
		p.Cnd_ship_to_grp_flg6 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_ship_to_grp_flg6.addAliasName("Cnd.ship_to_grp_flg6", p);
		p.Cnd_ship_to_grp_cd6 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_ship_to_grp_cd6.addAliasName("Cnd.ship_to_grp_cd6", p);
		p.Cnd_ship_to_grp_nm6 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_ship_to_grp_nm6.addAliasName("Cnd.ship_to_grp_nm6", p);
		p.Cnd_ship_to_grp_lab7 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_ship_to_grp_lab7.addAliasName("Cnd.ship_to_grp_lab7", p);
		p.Cnd_ship_to_grp_flg7 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_ship_to_grp_flg7.addAliasName("Cnd.ship_to_grp_flg7", p);
		p.Cnd_ship_to_grp_cd7 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_ship_to_grp_cd7.addAliasName("Cnd.ship_to_grp_cd7", p);
		p.Cnd_ship_to_grp_nm7 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_ship_to_grp_nm7.addAliasName("Cnd.ship_to_grp_nm7", p);
		p.Cnd_ship_to_grp_lab8 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_ship_to_grp_lab8.addAliasName("Cnd.ship_to_grp_lab8", p);
		p.Cnd_ship_to_grp_flg8 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_ship_to_grp_flg8.addAliasName("Cnd.ship_to_grp_flg8", p);
		p.Cnd_ship_to_grp_cd8 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_ship_to_grp_cd8.addAliasName("Cnd.ship_to_grp_cd8", p);
		p.Cnd_ship_to_grp_nm8 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_ship_to_grp_nm8.addAliasName("Cnd.ship_to_grp_nm8", p);
		p.Cnd_ship_to_grp_lab9 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_ship_to_grp_lab9.addAliasName("Cnd.ship_to_grp_lab9", p);
		p.Cnd_ship_to_grp_flg9 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_ship_to_grp_flg9.addAliasName("Cnd.ship_to_grp_flg9", p);
		p.Cnd_ship_to_grp_cd9 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_ship_to_grp_cd9.addAliasName("Cnd.ship_to_grp_cd9", p);
		p.Cnd_ship_to_grp_nm9 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_ship_to_grp_nm9.addAliasName("Cnd.ship_to_grp_nm9", p);
		p.Cnd_ship_to_grp_lab10 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_ship_to_grp_lab10.addAliasName("Cnd.ship_to_grp_lab10", p);
		p.Cnd_ship_to_grp_flg10 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_ship_to_grp_flg10.addAliasName("Cnd.ship_to_grp_flg10", p);
		p.Cnd_ship_to_grp_cd10 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_ship_to_grp_cd10.addAliasName("Cnd.ship_to_grp_cd10", p);
		p.Cnd_ship_to_grp_nm10 = p.Cnd_ship_to_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_ship_to_grp_nm10.addAliasName("Cnd.ship_to_grp_nm10", p);
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
	protected static void jbCreateCtrl(MSBEP_ShipInstListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_ShipInstListReg p) {
		p.BulkSet_ship_inst_tm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().ship_inst_tm_p());
		p.BulkSet_ship_inst_tm_p_PPanel.setName("BulkSet.ship_inst_tm_p");
		p.BulkSet_ship_inst_dt = p.BulkSet_ship_inst_tm_p_PPanel.YmdHm_ymd;
		p.BulkSet_ship_inst_dt.addAliasName("BulkSet.ship_inst_dt", p);
		p.BulkSet_ship_inst_hm = p.BulkSet_ship_inst_tm_p_PPanel.YmdHm_hm;
		p.BulkSet_ship_inst_hm.addAliasName("BulkSet.ship_inst_hm", p);
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_inst_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_inst_usr_cd.addAliasName("BulkSet.inst_usr_cd", p);
		p.BulkSet_inst_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_inst_usr_nm.addAliasName("BulkSet.inst_usr_nm", p);
		p.BulkSet_inst_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_inst_dpt_cd.addAliasName("BulkSet.inst_dpt_cd", p);
		p.BulkSet_inst_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_inst_dpt_nm.addAliasName("BulkSet.inst_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_ShipInstListReg p) {
		p.Rslt_ship_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$ship_schd_tm_p);
		p.Rslt_ship_schd_tm_p_PPanel.setName("Rslt.ship_schd_tm_p");
		p.columnRslt_ship_schd_dt = p.Rslt_ship_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_schd_dt.addAliasName("Rslt.ship_schd_dt", p);
		p.columnRslt_ship_schd_hm = p.Rslt_ship_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_schd_hm.addAliasName("Rslt.ship_schd_hm", p);
		p.Rslt_dlv_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$dlv_schd_tm_p);
		p.Rslt_dlv_schd_tm_p_PPanel.setName("Rslt.dlv_schd_tm_p");
		p.columnRslt_dlv_schd_dt = p.Rslt_dlv_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_schd_dt.addAliasName("Rslt.dlv_schd_dt", p);
		p.columnRslt_dlv_schd_hm = p.Rslt_dlv_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_schd_hm.addAliasName("Rslt.dlv_schd_hm", p);
		p.Rslt_ship_inst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$ship_inst_tm_p);
		p.Rslt_ship_inst_tm_p_PPanel.setName("Rslt.ship_inst_tm_p");
		p.columnRslt_ship_inst_dt = p.Rslt_ship_inst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_inst_dt.addAliasName("Rslt.ship_inst_dt", p);
		p.columnRslt_ship_inst_hm = p.Rslt_ship_inst_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_inst_hm.addAliasName("Rslt.ship_inst_hm", p);
		p.Rslt_ship_to_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$ship_to_addr_p);
		p.Rslt_ship_to_addr_p_PPanel.setName("Rslt.ship_to_addr_p");
		p.columnRslt_cntry_cd = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnRslt_cntry_cd.addAliasName("Rslt.cntry_cd", p);
		p.columnRslt_cntry_nm = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnRslt_cntry_nm.addAliasName("Rslt.cntry_nm", p);
		p.columnRslt_ship_to_zip_cd = p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd;
		p.columnRslt_ship_to_zip_cd.addAliasName("Rslt.ship_to_zip_cd", p);
		p.columnRslt_ship_to_addr1 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1;
		p.columnRslt_ship_to_addr1.addAliasName("Rslt.ship_to_addr1", p);
		p.columnRslt_ship_to_addr2 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2;
		p.columnRslt_ship_to_addr2.addAliasName("Rslt.ship_to_addr2", p);
		p.columnRslt_ship_to_addr3 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3;
		p.columnRslt_ship_to_addr3.addAliasName("Rslt.ship_to_addr3", p);
		p.columnRslt_ship_to_addr4 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4;
		p.columnRslt_ship_to_addr4.addAliasName("Rslt.ship_to_addr4", p);
		p.columnRslt_ship_to_cntct_dpt = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt;
		p.columnRslt_ship_to_cntct_dpt.addAliasName("Rslt.ship_to_cntct_dpt", p);
		p.columnRslt_ship_to_cntct_psn = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn;
		p.columnRslt_ship_to_cntct_psn.addAliasName("Rslt.ship_to_cntct_psn", p);
		p.columnRslt_ship_to_tel = p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel;
		p.columnRslt_ship_to_tel.addAliasName("Rslt.ship_to_tel", p);
		p.columnRslt_ship_to_fax = p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax;
		p.columnRslt_ship_to_fax.addAliasName("Rslt.ship_to_fax", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$itm_p);
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
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$act_cont_qty_p);
		p.Rslt_act_cont_qty_p_PPanel.setName("Rslt.act_cont_qty_p");
		p.columnRslt_act_cont_qty = p.Rslt_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_act_cont_qty.addAliasName("Rslt.act_cont_qty", p);
		p.Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$act_cont_fctr_p);
		p.Rslt_act_cont_fctr_p_PPanel.setName("Rslt.act_cont_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$std_cont_qty_p);
		p.Rslt_std_cont_qty_p_PPanel.setName("Rslt.std_cont_qty_p");
		p.columnRslt_std_cont_qty = p.Rslt_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_std_cont_qty.addAliasName("Rslt.std_cont_qty", p);
		p.Rslt_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$cont_fctr_unit_p);
		p.Rslt_cont_fctr_unit_p_PPanel.setName("Rslt.cont_fctr_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_ship_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$ship_act_qty_p);
		p.Rslt_ship_act_qty_p_PPanel.setName("Rslt.ship_act_qty_p");
		p.columnRslt_ship_act_qty = p.Rslt_ship_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_ship_act_qty.addAliasName("Rslt.ship_act_qty", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_inst_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_inst_usr_cd.addAliasName("Rslt.inst_usr_cd", p);
		p.columnRslt_inst_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_inst_usr_nm.addAliasName("Rslt.inst_usr_nm", p);
		p.columnRslt_inst_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_inst_dpt_cd.addAliasName("Rslt.inst_dpt_cd", p);
		p.columnRslt_inst_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_inst_dpt_nm.addAliasName("Rslt.inst_dpt_nm", p);
		p.Rslt_ship_to_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$ship_to_grp_p);
		p.Rslt_ship_to_grp_p_PPanel.setName("Rslt.ship_to_grp_p");
		p.columnRslt_ship_to_grp_cd1 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_ship_to_grp_cd1.addAliasName("Rslt.ship_to_grp_cd1", p);
		p.columnRslt_ship_to_grp_nm1 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_ship_to_grp_nm1.addAliasName("Rslt.ship_to_grp_nm1", p);
		p.columnRslt_ship_to_grp_cd2 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_ship_to_grp_cd2.addAliasName("Rslt.ship_to_grp_cd2", p);
		p.columnRslt_ship_to_grp_nm2 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_ship_to_grp_nm2.addAliasName("Rslt.ship_to_grp_nm2", p);
		p.columnRslt_ship_to_grp_cd3 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_ship_to_grp_cd3.addAliasName("Rslt.ship_to_grp_cd3", p);
		p.columnRslt_ship_to_grp_nm3 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_ship_to_grp_nm3.addAliasName("Rslt.ship_to_grp_nm3", p);
		p.columnRslt_ship_to_grp_cd4 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_ship_to_grp_cd4.addAliasName("Rslt.ship_to_grp_cd4", p);
		p.columnRslt_ship_to_grp_nm4 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_ship_to_grp_nm4.addAliasName("Rslt.ship_to_grp_nm4", p);
		p.columnRslt_ship_to_grp_cd5 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_ship_to_grp_cd5.addAliasName("Rslt.ship_to_grp_cd5", p);
		p.columnRslt_ship_to_grp_nm5 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_ship_to_grp_nm5.addAliasName("Rslt.ship_to_grp_nm5", p);
		p.columnRslt_ship_to_grp_cd6 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_ship_to_grp_cd6.addAliasName("Rslt.ship_to_grp_cd6", p);
		p.columnRslt_ship_to_grp_nm6 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_ship_to_grp_nm6.addAliasName("Rslt.ship_to_grp_nm6", p);
		p.columnRslt_ship_to_grp_cd7 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_ship_to_grp_cd7.addAliasName("Rslt.ship_to_grp_cd7", p);
		p.columnRslt_ship_to_grp_nm7 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_ship_to_grp_nm7.addAliasName("Rslt.ship_to_grp_nm7", p);
		p.columnRslt_ship_to_grp_cd8 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_ship_to_grp_cd8.addAliasName("Rslt.ship_to_grp_cd8", p);
		p.columnRslt_ship_to_grp_nm8 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_ship_to_grp_nm8.addAliasName("Rslt.ship_to_grp_nm8", p);
		p.columnRslt_ship_to_grp_cd9 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_ship_to_grp_cd9.addAliasName("Rslt.ship_to_grp_cd9", p);
		p.columnRslt_ship_to_grp_nm9 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_ship_to_grp_nm9.addAliasName("Rslt.ship_to_grp_nm9", p);
		p.columnRslt_ship_to_grp_cd10 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_ship_to_grp_cd10.addAliasName("Rslt.ship_to_grp_cd10", p);
		p.columnRslt_ship_to_grp_nm10 = p.Rslt_ship_to_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_ship_to_grp_nm10.addAliasName("Rslt.ship_to_grp_nm10", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$dlv_grp_p);
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
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$cst_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$itm_grp_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1410.RsltR.$rts_msg_p);
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
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [WmsTrgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWmsTrgt(MSBEP_ShipInstListReg p) {
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
	
	
	/** [Cnd_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_wk_cd_p = null;

	/**
	 * [Cnd_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_wk_cd_ListPutter() {
		if (Cnd_ship_wk_cd_p == null) {
			Cnd_ship_wk_cd_p = createCnd_ship_wk_cd_ListPutter(Cnd_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Cnd_ship_wk_cd_p;
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
	
	
	/** [Cnd_inst_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inst_usr_cd_p = null;

	/**
	 * [Cnd_inst_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inst_usr_cd_ListPutter() {
		if (Cnd_inst_usr_cd_p == null) {
			Cnd_inst_usr_cd_p = createCnd_inst_usr_cd_ListPutter(Cnd_inst_usr_cd, "inst_usr_cd", "inst_usr_nm");

		}
		return Cnd_inst_usr_cd_p;
	}
	
	
	/** [Cnd_inst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inst_dpt_cd_p = null;

	/**
	 * [Cnd_inst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inst_dpt_cd_ListPutter() {
		if (Cnd_inst_dpt_cd_p == null) {
			Cnd_inst_dpt_cd_p = createCnd_inst_dpt_cd_ListPutter(Cnd_inst_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");

		}
		return Cnd_inst_dpt_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_wk_cd_p = null;

	/**
	 * [Rslt_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_wk_cd_ListPutter() {
		if (Rslt_ship_wk_cd_p == null) {
			Rslt_ship_wk_cd_p = createRslt_ship_wk_cd_ListPutter(columnRslt_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Rslt_ship_wk_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipInstListReg create(){
		MSBEP_ShipInstListReg p = new MSBEP_ShipInstListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipInstListReg create(String name){
		MSBEP_ShipInstListReg p = new MSBEP_ShipInstListReg(name);
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
		MSBEP_ShipInstListReg_MC.jbfInitScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitDispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitPrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitTop((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitFold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitTab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitTab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitTab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitDlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitTab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitCstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitTab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitAllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitSchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitPickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitInstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitDlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitAdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitCnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitCtrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitRPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitBulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitRslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitDtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitEastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbfInitWmsTrgt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitDispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitPrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitTop((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitFold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitTab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitTab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitTab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitDlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitTab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitCstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitTab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitAllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitSchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitPickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitInstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitDlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitAdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitCnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitCtrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitRPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitBulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitRslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitDtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitEastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.jbInitWmsTrgt((MSBEP_ShipInstListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrSts(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.PrStsPanel = p.beansFactory.createPanel("PrSts");
		p.PrStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ShipInstListReg p) {
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
	protected static void jbfInitTab1(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [ShipToGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipToGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.ShipToGrpPanel = p.beansFactory.createPanel("ShipToGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DlvGrpPanel = p.beansFactory.createPanel("DlvGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [CstGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.CstGrpPanel = p.beansFactory.createPanel("CstGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocSts(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.AllocStsPanel = p.beansFactory.createPanel("AllocSts");
		p.AllocStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SchdSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSchdSts(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.SchdStsPanel = p.beansFactory.createPanel("SchdSts");
		p.SchdStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PickPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPickPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.PickPrntPanel = p.beansFactory.createPanel("PickPrnt");
		p.PickPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [InstPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInstPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.InstPrntPanel = p.beansFactory.createPanel("InstPrnt");
		p.InstPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DlvPrntPanel = p.beansFactory.createPanel("DlvPrnt");
		p.DlvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [AdvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdvPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.AdvPrntPanel = p.beansFactory.createPanel("AdvPrnt");
		p.AdvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_disp_unit_Group = p.beansFactory.createButtonGroup("Cnd.disp_unit");
		p.Cnd_disp_unit_Hdr = p.beansFactory.createRadioButton("Cnd.disp_unit_Hdr");
		p.Cnd_disp_unit_Dtl = p.beansFactory.createRadioButton("Cnd.disp_unit_Dtl");
		p.Cnd_disp_unit_Dlv = p.beansFactory.createRadioButton("Cnd.disp_unit_Dlv");
		p.Cnd_uninst = p.beansFactory.createCheckBox("Cnd.uninst");
		p.Cnd_inst = p.beansFactory.createCheckBox("Cnd.inst");
		p.Cnd_p_ship = p.beansFactory.createCheckBox("Cnd.p_ship");
		p.Cnd_ship = p.beansFactory.createCheckBox("Cnd.ship");
		p.Cnd_not_alloc_flg = p.beansFactory.createCheckBox("Cnd.not_alloc_flg");
		p.Cnd_part_alloc_flg = p.beansFactory.createCheckBox("Cnd.part_alloc_flg");
		p.Cnd_all_alloc_flg = p.beansFactory.createCheckBox("Cnd.all_alloc_flg");
		p.Cnd_alloc_invalid_flg = p.beansFactory.createCheckBox("Cnd.alloc_invalid_flg");
		p.Cnd_wms_flg = p.beansFactory.createCheckBox("Cnd.wms_flg");
		p.Cnd_not_wms_flg = p.beansFactory.createCheckBox("Cnd.not_wms_flg");
		p.Cnd_late_ship = p.beansFactory.createCheckBox("Cnd.late_ship");
		p.Cnd_late_rqst = p.beansFactory.createCheckBox("Cnd.late_rqst");
		p.Cnd_pick_not_prnted = p.beansFactory.createCheckBox("Cnd.pick_not_prnted");
		p.Cnd_pick_prnted = p.beansFactory.createCheckBox("Cnd.pick_prnted");
		p.Cnd_inst_not_prnted = p.beansFactory.createCheckBox("Cnd.inst_not_prnted");
		p.Cnd_inst_prnted = p.beansFactory.createCheckBox("Cnd.inst_prnted");
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
		p.Cnd_ship_loc_cd_Label = p.beansFactory.createLabel("Cnd.ship_loc_cd_Label");
		p.Cnd_ship_loc_cd = p.beansFactory.createTextField("Cnd.ship_loc_cd");
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
		p.Cnd_ship_wk_cd_Label = p.beansFactory.createLabel("Cnd.ship_wk_cd_Label");
		p.Cnd_ship_wk_cd = p.beansFactory.createTextComboBox("Cnd.ship_wk_cd");
		p.Cnd_ship_wk_cd.setLabel(p.Cnd_ship_wk_cd_Label);
		p.Cnd_ship_wk_nm = p.beansFactory.createTextField("Cnd.ship_wk_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_iv_itm_nm_Label = p.beansFactory.createLabel("Cnd.iv_itm_nm_Label");
		p.Cnd_iv_itm_nm = p.beansFactory.createTextField("Cnd.iv_itm_nm");
		p.Cnd_iv_itm_nm.setLabel(p.Cnd_iv_itm_nm_Label);
		p.Cnd_inst_usr_cd_Label = p.beansFactory.createLabel("Cnd.inst_usr_cd_Label");
		p.Cnd_inst_usr_cd = p.beansFactory.createTextField("Cnd.inst_usr_cd");
		p.Cnd_inst_usr_cd.setLabel(p.Cnd_inst_usr_cd_Label);
		p.Cnd_inst_usr_nm = p.beansFactory.createTextField("Cnd.inst_usr_nm");
		p.Cnd_inst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.inst_dpt_cd_Label");
		p.Cnd_inst_dpt_cd = p.beansFactory.createTextField("Cnd.inst_dpt_cd");
		p.Cnd_inst_dpt_cd.setLabel(p.Cnd_inst_dpt_cd_Label);
		p.Cnd_inst_dpt_nm = p.beansFactory.createTextField("Cnd.inst_dpt_nm");
		p.Cnd_ship_schd_no_Label = p.beansFactory.createLabel("Cnd.ship_schd_no_Label");
		p.Cnd_ship_schd_no = p.beansFactory.createTextField("Cnd.ship_schd_no");
		p.Cnd_ship_schd_no.setLabel(p.Cnd_ship_schd_no_Label);
		p.Cnd_ship_inst_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_no_Label");
		p.Cnd_ship_inst_no = p.beansFactory.createTextField("Cnd.ship_inst_no");
		p.Cnd_ship_inst_no.setLabel(p.Cnd_ship_inst_no_Label);
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_xfr_schd_no_Label = p.beansFactory.createLabel("Cnd.xfr_schd_no_Label");
		p.Cnd_xfr_schd_no = p.beansFactory.createTextField("Cnd.xfr_schd_no");
		p.Cnd_xfr_schd_no.setLabel(p.Cnd_xfr_schd_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_inst_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_rmrks_Label");
		p.Cnd_inst_rmrks = p.beansFactory.createTextField("Cnd.inst_rmrks");
		p.Cnd_inst_rmrks.setLabel(p.Cnd_inst_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_can_disp_flg = p.beansFactory.createCheckBox("Cnd.can_disp_flg");
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
	protected static void jbfInitCtrl(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		p.BulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.BulkSet_indiv_inst_prnt_flg = p.beansFactory.createCheckBox("BulkSet.indiv_inst_prnt_flg");
		p.BulkSet_indiv_prnt_flg = p.beansFactory.createCheckBox("BulkSet.indiv_prnt_flg");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_abl_flg = p.beansFactory.createTableColumn("Rslt.ship_abl_flg", MCColumnType.CHECK);
		p.columnRslt_alloc_tgt_flg = p.beansFactory.createTableColumn("Rslt.alloc_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_lot_prop_flg = p.beansFactory.createTableColumn("Rslt.lot_prop_flg", MCColumnType.CHECK);
		p.columnRslt_pack_flg = p.beansFactory.createTableColumn("Rslt.pack_flg", MCColumnType.CHECK);
		p.columnRslt_ship_schd_time = p.beansFactory.createTableColumn("Rslt.ship_schd_time", MCColumnType.TEXT);
		p.columnRslt_dlv_rqst_dt = p.beansFactory.createTableColumn("Rslt.dlv_rqst_dt", MCColumnType.DATE);
		p.columnRslt_dlv_rqst_hm = p.beansFactory.createTableColumn("Rslt.dlv_rqst_hm", MCColumnType.DATE);
		p.columnRslt_dlv_rqst_tm = p.beansFactory.createTableColumn("Rslt.dlv_rqst_tm", MCColumnType.DATE);
		p.columnRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_ship_to_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_to_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_typ = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_cd = p.beansFactory.createTableColumn("Rslt.ship_to_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_sundry_flg = p.beansFactory.createTableColumn("Rslt.ship_to_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_via_dlv_typ = p.beansFactory.createTableColumn("Rslt.via_dlv_typ", MCColumnType.TEXT);
		p.columnRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("Rslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_cd = p.beansFactory.createTableColumn("Rslt.dlv_id_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_id_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_nm", MCColumnType.TEXT);
		p.columnRslt_ship_term_cd = p.beansFactory.createTableColumn("Rslt.ship_term_cd", MCColumnType.TEXT);
		p.columnRslt_ship_term_nm = p.beansFactory.createTableColumn("Rslt.ship_term_nm", MCColumnType.TEXT);
		p.columnRslt_ship_wk_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_wk_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_wk_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_wk_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_wk_cd = p.beansFactory.createTableColumn("Rslt.ship_wk_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ship_wk_nm = p.beansFactory.createTableColumn("Rslt.ship_wk_nm", MCColumnType.TEXT);
		p.columnRslt_pick_prnt_flg = p.beansFactory.createTableColumn("Rslt.pick_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_inst_prnt_flg = p.beansFactory.createTableColumn("Rslt.inst_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_prnt_flg = p.beansFactory.createTableColumn("Rslt.dlv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_adv_prnt_flg = p.beansFactory.createTableColumn("Rslt.adv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_num_of_details = p.beansFactory.createTableColumn("Rslt.num_of_details", MCColumnType.NUMBER);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_cd = p.beansFactory.createTableColumn("Rslt.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_nm = p.beansFactory.createTableColumn("Rslt.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_cd = p.beansFactory.createTableColumn("Rslt.rqst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_nm = p.beansFactory.createTableColumn("Rslt.rqst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ship_block_flg = p.beansFactory.createTableColumn("Rslt.ship_block_flg", MCColumnType.CHECK);
		p.columnRslt_pd_inst_dlv_dt = p.beansFactory.createTableColumn("Rslt.pd_inst_dlv_dt", MCColumnType.DATE);
		p.columnRslt_pd_inst_dlv_hm = p.beansFactory.createTableColumn("Rslt.pd_inst_dlv_hm", MCColumnType.DATE);
		p.columnRslt_dlv_day_week_typ = p.beansFactory.createTableColumn("Rslt.dlv_day_week_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_day_week_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_day_week_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_dt = p.beansFactory.createTableColumn("Rslt.ship_rqst_dt", MCColumnType.DATE);
		p.columnRslt_ship_rqst_hm = p.beansFactory.createTableColumn("Rslt.ship_rqst_hm", MCColumnType.DATE);
		p.columnRslt_assort_typ = p.beansFactory.createTableColumn("Rslt.assort_typ", MCColumnType.TEXT);
		p.columnRslt_assort_typ_nm = p.beansFactory.createTableColumn("Rslt.assort_typ_nm", MCColumnType.TEXT);
		p.columnRslt_set_itm_grp_no = p.beansFactory.createTableColumn("Rslt.set_itm_grp_no", MCColumnType.NUMBER);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_scope_typ = p.beansFactory.createTableColumn("Rslt.alloc_scope_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_typ = p.beansFactory.createTableColumn("Rslt.alloc_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_grp_alloc_flg = p.beansFactory.createTableColumn("Rslt.grp_alloc_flg", MCColumnType.CHECK);
		p.columnRslt_ship_loc_cd = p.beansFactory.createTableColumn("Rslt.ship_loc_cd", MCColumnType.TEXT);
		p.columnRslt_ship_loc_nm = p.beansFactory.createTableColumn("Rslt.ship_loc_nm", MCColumnType.TEXT);
		p.columnRslt_ship_str_ln_cd = p.beansFactory.createTableColumn("Rslt.ship_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_ship_str_ln_nm = p.beansFactory.createTableColumn("Rslt.ship_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_ship_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.ship_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
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
		p.columnRslt_ship_wt = p.beansFactory.createTableColumn("Rslt.ship_wt", MCColumnType.NUMBER);
		p.columnRslt_ship_dim = p.beansFactory.createTableColumn("Rslt.ship_dim", MCColumnType.NUMBER);
		p.columnRslt_base_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_base_prov_act_no = p.beansFactory.createTableColumn("Rslt.base_prov_act_no", MCColumnType.TEXT);
		p.columnRslt_base_ac_dt = p.beansFactory.createTableColumn("Rslt.base_ac_dt", MCColumnType.DATE);
		p.columnRslt_ship_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_rmrks = p.beansFactory.createTableColumn("Rslt.inst_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_inst_d_rmrks = p.beansFactory.createTableColumn("Rslt.inst_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_ship_schd_no = p.beansFactory.createTableColumn("Rslt.ship_schd_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_no = p.beansFactory.createTableColumn("Rslt.ship_inst_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_no = p.beansFactory.createTableColumn("Rslt.ship_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_wms_flg = p.beansFactory.createTableColumn("Rslt.wms_flg", MCColumnType.CHECK);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_xfr_schd_no = p.beansFactory.createTableColumn("Rslt.xfr_schd_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_iv_ship_flg = p.beansFactory.createTableColumn("Rslt.iv_ship_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_seq = p.beansFactory.createTableColumn("Rslt.dlv_slip_seq", MCColumnType.NUMBER);
		p.columnRslt_dlv_slip_rev = p.beansFactory.createTableColumn("Rslt.dlv_slip_rev", MCColumnType.NUMBER);
		p.columnRslt_act_split_flg = p.beansFactory.createTableColumn("Rslt.act_split_flg", MCColumnType.CHECK);
		p.columnRslt_ship_alloc_sts_no = p.beansFactory.createTableColumn("Rslt.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnRslt_pick_prnted_flg = p.beansFactory.createTableColumn("Rslt.pick_prnted_flg", MCColumnType.CHECK);
		p.columnRslt_inst_prnted_flg = p.beansFactory.createTableColumn("Rslt.inst_prnted_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_prnted_flg = p.beansFactory.createTableColumn("Rslt.dlv_prnted_flg", MCColumnType.CHECK);
		p.columnRslt_adv_prnted_flg = p.beansFactory.createTableColumn("Rslt.adv_prnted_flg", MCColumnType.CHECK);
		p.columnRslt_pack_disable_flg = p.beansFactory.createTableColumn("Rslt.pack_disable_flg", MCColumnType.CHECK);
		p.columnRslt_non_dlv_prnt_flg = p.beansFactory.createTableColumn("Rslt.non_dlv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_non_adv_prnt_flg = p.beansFactory.createTableColumn("Rslt.non_adv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ship_inst_upd_cntr = p.beansFactory.createTableColumn("Rslt.ship_inst_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_list_no = p.beansFactory.createTableColumn("Rslt.list_no", MCColumnType.NUMBER);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_list_no = p.beansFactory.createTableColumn("Dtl.list_no", MCColumnType.NUMBER);
		p.columnDtl_ship_schd_no = p.beansFactory.createTableColumn("Dtl.ship_schd_no", MCColumnType.TEXT);
		p.columnDtl_ship_schd_upd_cntr = p.beansFactory.createTableColumn("Dtl.ship_schd_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_ship_pr_no = p.beansFactory.createTableColumn("Dtl.ship_pr_no", MCColumnType.TEXT);
		p.columnDtl_ship_pr_upd_cntr = p.beansFactory.createTableColumn("Dtl.ship_pr_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1420 = p.beansFactory.createButton("Btn.open_MSBEP1420", "open");
		p.Btn_open_MSBEP1400 = p.beansFactory.createButton("Btn.open_MSBEP1400", "open");
		p.Btn_open_MSBEP0110 = p.beansFactory.createButton("Btn.open_MSBEP0110", "prnt");
		p.Btn_prnt_pick = p.beansFactory.createButton("Btn.prnt_pick", "prnt");
		p.Btn_prnt_inst = p.beansFactory.createButton("Btn.prnt_inst", "prnt");
		p.Btn_prnt_dlv = p.beansFactory.createButton("Btn.prnt_dlv", "prnt");
		p.Btn_prnt_adv = p.beansFactory.createButton("Btn.prnt_adv", "prnt");
		p.Btn_label_check = p.beansFactory.createLabel("Btn.label_check");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_label_alloc = p.beansFactory.createLabel("Btn.label_alloc");
		p.Btn_alloc_select_all = p.beansFactory.createButton("Btn.alloc_select_all", "no_border");
		p.Btn_alloc_deselect_all = p.beansFactory.createButton("Btn.alloc_deselect_all", "no_border");
		p.Btn_label_lot_prop = p.beansFactory.createLabel("Btn.label_lot_prop");
		p.Btn_lot_prop_select_all = p.beansFactory.createButton("Btn.lot_prop_select_all", "no_border");
		p.Btn_lot_prop_deselect_all = p.beansFactory.createButton("Btn.lot_prop_deselect_all", "no_border");
		p.Btn_label_pack = p.beansFactory.createLabel("Btn.label_pack");
		p.Btn_pack_select_all = p.beansFactory.createButton("Btn.pack_select_all", "no_border");
		p.Btn_pack_deselect_all = p.beansFactory.createButton("Btn.pack_deselect_all", "no_border");
		p.Btn_label_pick_prnt = p.beansFactory.createLabel("Btn.label_pick_prnt");
		p.Btn_pick_prnt_select_all = p.beansFactory.createButton("Btn.pick_prnt_select_all", "no_border");
		p.Btn_pick_prnt_deselect_all = p.beansFactory.createButton("Btn.pick_prnt_deselect_all", "no_border");
		p.Btn_label_inst_prnt = p.beansFactory.createLabel("Btn.label_inst_prnt");
		p.Btn_inst_prnt_select_all = p.beansFactory.createButton("Btn.inst_prnt_select_all", "no_border");
		p.Btn_inst_prnt_deselect_all = p.beansFactory.createButton("Btn.inst_prnt_deselect_all", "no_border");
		p.Btn_label_dlv_prnt = p.beansFactory.createLabel("Btn.label_dlv_prnt");
		p.Btn_dlv_prnt_select_all = p.beansFactory.createButton("Btn.dlv_prnt_select_all", "no_border");
		p.Btn_dlv_prnt_deselect_all = p.beansFactory.createButton("Btn.dlv_prnt_deselect_all", "no_border");
		p.Btn_label_adv_prnt = p.beansFactory.createLabel("Btn.label_adv_prnt");
		p.Btn_adv_prnt_select_all = p.beansFactory.createButton("Btn.adv_prnt_select_all", "no_border");
		p.Btn_adv_prnt_deselect_all = p.beansFactory.createButton("Btn.adv_prnt_deselect_all", "no_border");
		p.Btn_ins01 = p.beansFactory.createButton("Btn.ins01", "upd");
		p.Btn_del01 = p.beansFactory.createButton("Btn.del01", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [WmsTrgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWmsTrgt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.WmsTrgtPanel = p.beansFactory.createPanel("WmsTrgt");
		p.WmsTrgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ShipInstListReg p) {
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
	protected static void jbInitDispUnit(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.PrStsPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrSts(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.PrStsPanel.setBorder(p.PrStsTitledBorder);
		p.add(p.PrStsPanel);
		p.PrStsPanel.setNextBeans(p.TopPanel);
		p.PrStsPanel.setValueCheck(false);
		p.PrStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_ShipInstListReg p) {
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
	protected static void jbInitFold(MSBEP_ShipInstListReg p) {
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.AllocStsPanel, null);
		p.Tab1Panel.setLastBeans(p.AllocStsPanel);
		p.AllocStsPanel.setNextBeans(p.WmsTrgtPanel);
		p.Tab1Panel.add(p.WmsTrgtPanel, null);
		p.WmsTrgtPanel.setNextBeans(p.SchdStsPanel);
		p.Tab1Panel.add(p.SchdStsPanel, null);
		p.SchdStsPanel.setNextBeans(p.PickPrntPanel);
		p.Tab1Panel.add(p.PickPrntPanel, null);
		p.PickPrntPanel.setNextBeans(p.InstPrntPanel);
		p.Tab1Panel.add(p.InstPrntPanel, null);
		p.InstPrntPanel.setNextBeans(p.DlvPrntPanel);
		p.Tab1Panel.add(p.DlvPrntPanel, null);
		p.DlvPrntPanel.setNextBeans(p.AdvPrntPanel);
		p.Tab1Panel.add(p.AdvPrntPanel, null);
		p.AdvPrntPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ShipToGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.ShipToGrpPanel);
	}

	/**
	 * [ShipToGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipToGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.ShipToGrpPanel.setValueCheck(false);
		p.ShipToGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ShipToGrpPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DlvGrpPanel, null);
		p.Tab3Panel.setLastBeans(p.DlvGrpPanel);
	}

	/**
	 * [DlvGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DlvGrpPanel.setValueCheck(false);
		p.DlvGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvGrpPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.CstGrpPanel, null);
		p.Tab4Panel.setLastBeans(p.CstGrpPanel);
	}

	/**
	 * [CstGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.CstGrpPanel.setValueCheck(false);
		p.CstGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstGrpPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.Tab5Panel.setValueCheck(false);
		p.Tab5Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab5Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab5Panel.add(p.ItmGrpPanel, null);
		p.Tab5Panel.setLastBeans(p.ItmGrpPanel);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel.setValueCheck(false);
		p.ItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmGrpPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocSts(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.AllocStsPanel.setBorder(p.AllocStsTitledBorder);
		p.AllocStsPanel.setValueCheck(false);
		p.AllocStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AllocStsPanel.setLayoutPosition("NNWN");
		// ブロックの項目の初期化
	}

	/**
	 * [SchdSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSchdSts(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.SchdStsPanel.setBorder(p.SchdStsTitledBorder);
		p.SchdStsPanel.setValueCheck(false);
		p.SchdStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SchdStsPanel.setLayoutPosition("NNWNXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PickPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPickPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.PickPrntPanel.setBorder(p.PickPrntTitledBorder);
		p.PickPrntPanel.setValueCheck(false);
		p.PickPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PickPrntPanel.setLayoutPosition("NNWNXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [InstPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInstPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.InstPrntPanel.setBorder(p.InstPrntTitledBorder);
		p.InstPrntPanel.setValueCheck(false);
		p.InstPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InstPrntPanel.setLayoutPosition("NNWS");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.DlvPrntPanel.setBorder(p.DlvPrntTitledBorder);
		p.DlvPrntPanel.setValueCheck(false);
		p.DlvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvPrntPanel.setLayoutPosition("NNWSXC");
		// ブロックの項目の初期化
	}

	/**
	 * [AdvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdvPrnt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.AdvPrntPanel.setBorder(p.AdvPrntTitledBorder);
		p.AdvPrntPanel.setValueCheck(false);
		p.AdvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AdvPrntPanel.setLayoutPosition("NNWSXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_disp_unit_Group);
		p.Cnd_disp_unit_Group.setFirstBeans(p.Cnd_disp_unit_Hdr);
		p.Cnd_disp_unit_Hdr.setActionCommand("0");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_Hdr);
		p.DispUnitPanel.add(p.Cnd_disp_unit_Hdr);
		p.Cnd_disp_unit_Hdr.setNextBeans(p.Cnd_disp_unit_Dtl);
		p.Cnd_disp_unit_Dtl.setActionCommand("1");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_Dtl);
		p.DispUnitPanel.add(p.Cnd_disp_unit_Dtl);
		p.Cnd_disp_unit_Dtl.setNextBeans(p.Cnd_disp_unit_Dlv);
		p.Cnd_disp_unit_Dlv.setActionCommand("2");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_Dlv);
		p.DispUnitPanel.add(p.Cnd_disp_unit_Dlv);
		p.Cnd_disp_unit_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.disp_unit_META);
		p.PrStsPanel.add(p.Cnd_uninst);
		p.PrStsPanel.setLastBeans(p.Cnd_uninst);
		p.Cnd_uninst.setNextBeans(p.Cnd_inst);
		p.Cnd_uninst.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.uninst_META);
		p.PrStsPanel.add(p.Cnd_inst);
		p.Cnd_inst.setNextBeans(p.Cnd_p_ship);
		p.Cnd_inst.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_META);
		p.PrStsPanel.add(p.Cnd_p_ship);
		p.Cnd_p_ship.setNextBeans(p.Cnd_ship);
		p.Cnd_p_ship.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.p_ship_META);
		p.PrStsPanel.add(p.Cnd_ship);
		p.Cnd_ship.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_META);
		p.AllocStsPanel.add(p.Cnd_not_alloc_flg);
		p.AllocStsPanel.setLastBeans(p.Cnd_not_alloc_flg);
		p.Cnd_not_alloc_flg.setNextBeans(p.Cnd_part_alloc_flg);
		p.Cnd_not_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.not_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_part_alloc_flg);
		p.Cnd_part_alloc_flg.setNextBeans(p.Cnd_all_alloc_flg);
		p.Cnd_part_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.part_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_all_alloc_flg);
		p.Cnd_all_alloc_flg.setNextBeans(p.Cnd_alloc_invalid_flg);
		p.Cnd_all_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.all_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_alloc_invalid_flg);
		p.Cnd_alloc_invalid_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.alloc_invalid_flg_META);
		p.WmsTrgtPanel.add(p.Cnd_wms_flg);
		p.WmsTrgtPanel.setLastBeans(p.Cnd_wms_flg);
		p.Cnd_wms_flg.setNextBeans(p.Cnd_not_wms_flg);
		p.Cnd_wms_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.wms_flg_META);
		p.WmsTrgtPanel.add(p.Cnd_not_wms_flg);
		p.Cnd_not_wms_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.not_wms_flg_META);
		p.SchdStsPanel.add(p.Cnd_late_ship);
		p.SchdStsPanel.setLastBeans(p.Cnd_late_ship);
		p.Cnd_late_ship.setNextBeans(p.Cnd_late_rqst);
		p.Cnd_late_ship.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.late_ship_META);
		p.SchdStsPanel.add(p.Cnd_late_rqst);
		p.Cnd_late_rqst.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.late_rqst_META);
		p.PickPrntPanel.add(p.Cnd_pick_not_prnted);
		p.PickPrntPanel.setLastBeans(p.Cnd_pick_not_prnted);
		p.Cnd_pick_not_prnted.setNextBeans(p.Cnd_pick_prnted);
		p.Cnd_pick_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.pick_not_prnted_META);
		p.PickPrntPanel.add(p.Cnd_pick_prnted);
		p.Cnd_pick_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.pick_prnted_META);
		p.InstPrntPanel.add(p.Cnd_inst_not_prnted);
		p.InstPrntPanel.setLastBeans(p.Cnd_inst_not_prnted);
		p.Cnd_inst_not_prnted.setNextBeans(p.Cnd_inst_prnted);
		p.Cnd_inst_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_not_prnted_META);
		p.InstPrntPanel.add(p.Cnd_inst_prnted);
		p.Cnd_inst_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_prnted_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_not_prnted);
		p.DlvPrntPanel.setLastBeans(p.Cnd_dlv_not_prnted);
		p.Cnd_dlv_not_prnted.setNextBeans(p.Cnd_dlv_prnted);
		p.Cnd_dlv_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_not_prnted_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_prnted);
		p.Cnd_dlv_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_prnted_META);
		p.AdvPrntPanel.add(p.Cnd_adv_not_prnted);
		p.AdvPrntPanel.setLastBeans(p.Cnd_adv_not_prnted);
		p.Cnd_adv_not_prnted.setNextBeans(p.Cnd_adv_prnted);
		p.Cnd_adv_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.adv_not_prnted_META);
		p.AdvPrntPanel.add(p.Cnd_adv_prnted);
		p.Cnd_adv_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.adv_prnted_META);
		p.CndPanel.add(p.Cnd_ship_schd_dt_frto_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_ship_schd_dt_frto_p_PPanel);
		p.Cnd_ship_schd_dt_frto_p_PPanel.setNextBeans(p.Cnd_ship_inst_dt_frto_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_inst_dt_frto_p_PPanel);
		p.Cnd_ship_inst_dt_frto_p_PPanel.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ship_loc_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_ship_loc_cd_Label);
		p.CndPanel.add(p.Cnd_ship_loc_cd);
		p.Cnd_ship_loc_cd.setNextBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_loc_cd_META);
		p.Cnd_ship_loc_cd.addLinkBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_loc_cd, true);
		p.CndPanel.add(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_nm.setNextBeans(p.Cnd_ship_str_ln_cd);
		p.Cnd_ship_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_loc_nm, true);
		p.Cnd_ship_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_str_ln_cd, true);
		p.Cnd_ship_str_ln_cd.setLinkBeans(p.Cnd_ship_str_ln_nm);
		p.CndPanel.add(p.Cnd_ship_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_ship_str_ln_cd);
		p.Cnd_ship_str_ln_cd.setNextBeans(p.Cnd_ship_str_ln_nm);
		p.Cnd_ship_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_ship_str_ln_nm);
		p.Cnd_ship_str_ln_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_ship_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_str_ln_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_ship_to_id_typ);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_ship_to_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_typ, true);
		p.Cnd_ship_to_id_typ.setLinkBeans(p.Cnd_ship_to_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_typ);
		p.Cnd_ship_to_id_typ.setNextBeans(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_to_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ_nm.setNextBeans(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_to_id_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_to_id_typ_nm, true);
		p.CndPanel.add(p.Cnd_ship_to_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_cd.setNextBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_to_id_cd_META);
		p.Cnd_ship_to_id_cd.addLinkBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_nm.setNextBeans(p.Cnd_dlv_id_typ);
		p.Cnd_ship_to_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_to_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_to_id_nm, true);
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_id_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ_nm, true);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_id_cd_META);
		p.Cnd_dlv_id_cd.addLinkBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_ship_term_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_ship_term_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_term_cd, true);
		p.Cnd_ship_term_cd.setLinkBeans(p.Cnd_ship_term_nm);
		p.CndPanel.add(p.Cnd_ship_term_cd_Label);
		p.CndPanel.add(p.Cnd_ship_term_cd);
		p.Cnd_ship_term_cd.setNextBeans(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_term_cd_META);
		p.CndPanel.add(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_nm.setNextBeans(p.Cnd_ship_wk_cd);
		p.Cnd_ship_term_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_term_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_term_nm, true);
		p.Cnd_ship_wk_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_wk_cd, true);
		p.Cnd_ship_wk_cd.setLinkBeans(p.Cnd_ship_wk_nm);
		p.CndPanel.add(p.Cnd_ship_wk_cd_Label);
		p.CndPanel.add(p.Cnd_ship_wk_cd);
		p.Cnd_ship_wk_cd.setNextBeans(p.Cnd_ship_wk_nm);
		p.Cnd_ship_wk_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_wk_cd_META);
		p.CndPanel.add(p.Cnd_ship_wk_nm);
		p.Cnd_ship_wk_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_ship_wk_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_wk_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_wk_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
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
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_iv_itm_nm);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.cst_itm_nm_META);
		p.CndPanel.add(p.Cnd_iv_itm_nm_Label);
		p.CndPanel.add(p.Cnd_iv_itm_nm);
		p.Cnd_iv_itm_nm.setNextBeans(p.Cnd_inst_usr_cd);
		p.Cnd_iv_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.iv_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_iv_itm_nm, true);
		p.CndPanel.add(p.Cnd_inst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_inst_usr_cd);
		p.Cnd_inst_usr_cd.setNextBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_usr_cd_META);
		p.Cnd_inst_usr_cd.addLinkBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_usr_cd, true);
		p.CndPanel.add(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_nm.setNextBeans(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_usr_nm, true);
		p.CndPanel.add(p.Cnd_inst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_dpt_cd.setNextBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_dpt_cd_META);
		p.Cnd_inst_dpt_cd.addLinkBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_nm.setNextBeans(p.Cnd_ship_schd_no);
		p.Cnd_inst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_dpt_nm, true);
		p.CndPanel.add(p.Cnd_ship_schd_no_Label);
		p.CndPanel.add(p.Cnd_ship_schd_no);
		p.Cnd_ship_schd_no.setNextBeans(p.Cnd_ship_inst_no);
		p.Cnd_ship_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_schd_no_META);
		p.setPluralValueEnable(p.Cnd_ship_schd_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_no);
		p.Cnd_ship_inst_no.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_ship_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.ship_inst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_xfr_schd_no);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_xfr_schd_no_Label);
		p.CndPanel.add(p.Cnd_xfr_schd_no);
		p.Cnd_xfr_schd_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_xfr_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.xfr_schd_no_META);
		p.setPluralValueEnable(p.Cnd_xfr_schd_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_inst_rmrks);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_inst_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_rmrks);
		p.Cnd_inst_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_inst_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.inst_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inst_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_can_disp_flg);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_can_disp_flg);
		p.Cnd_can_disp_flg.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_can_disp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.can_disp_flg_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_d_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_d_sub_char1);
		p.Cnd_d_sub_char1.setNextBeans(p.Cnd_d_sub_char2);
		p.Cnd_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_d_sub_char2);
		p.Cnd_d_sub_char2.setNextBeans(p.Cnd_d_sub_char3);
		p.Cnd_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_d_sub_char3);
		p.Cnd_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1410.CndR.d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_d_sub_char3, true);
		p.ShipToGrpPanel.add(p.Cnd_ship_to_grp_p_PPanel);
		p.ShipToGrpPanel.setLastBeans(p.Cnd_ship_to_grp_p_PPanel);
		p.DlvGrpPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvGrpPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.CstGrpPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstGrpPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_ShipInstListReg p) {
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
	protected static void jbInitRPnl(MSBEP_ShipInstListReg p) {
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
	protected static void jbInitBulkSet(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setBorder(p.BulkSetTitledBorder);
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_ship_inst_tm_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_ship_inst_tm_p_PPanel);
		p.BulkSet_ship_inst_tm_p_PPanel.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_indiv_inst_prnt_flg);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_inst_dpt_nm);
		p.BulkSetPanel.add(p.BulkSet_indiv_inst_prnt_flg);
		p.BulkSet_indiv_inst_prnt_flg.setNextBeans(p.BulkSet_indiv_prnt_flg);
		p.BulkSet_indiv_inst_prnt_flg.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1410.BulkSetR.indiv_inst_prnt_flg_META);
		p.BulkSetPanel.add(p.BulkSet_indiv_prnt_flg);
		p.BulkSet_indiv_prnt_flg.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1410.BulkSetR.indiv_prnt_flg_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.DtlPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_ShipInstListReg p) {
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
	protected static void jbInitBtn(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1420.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1420);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1420);
		p.Btn_open_MSBEP1420.setNextBeans(p.Btn_open_MSBEP1400);
		p.Btn_open_MSBEP1400.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP1400);
		p.Btn_open_MSBEP1400.setNextBeans(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setIcon("PRINT");
		p.Btn_open_MSBEP0110.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setNextBeans(p.Btn_prnt_pick);
		p.Btn_prnt_pick.setIcon("PRINT");
		p.Btn_prnt_pick.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_prnt_pick);
		p.Btn_prnt_pick.setNextBeans(p.Btn_prnt_inst);
		p.Btn_prnt_inst.setIcon("PRINT");
		p.Btn_prnt_inst.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt_inst);
		p.Btn_prnt_inst.setNextBeans(p.Btn_prnt_dlv);
		p.Btn_prnt_dlv.setIcon("PRINT");
		p.Btn_prnt_dlv.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt_dlv);
		p.Btn_prnt_dlv.setNextBeans(p.Btn_prnt_adv);
		p.Btn_prnt_adv.setIcon("PRINT");
		p.Btn_prnt_adv.setFunctionKey(MCFunctionKey.F21);
		p.BtnPanel.add(p.Btn_prnt_adv);
		p.Btn_prnt_adv.setNextBeans(p.Btn_select_all);
		p.BtnPanel.add(p.Btn_label_check);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_alloc_select_all);
		p.BtnPanel.add(p.Btn_label_alloc);
		p.Btn_alloc_select_all.setIcon("SELECT_ALL");
		p.Btn_alloc_select_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_alloc_select_all);
		p.Btn_alloc_select_all.setNextBeans(p.Btn_alloc_deselect_all);
		p.Btn_alloc_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_alloc_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_alloc_deselect_all);
		p.Btn_alloc_deselect_all.setNextBeans(p.Btn_lot_prop_select_all);
		p.BtnPanel.add(p.Btn_label_lot_prop);
		p.Btn_lot_prop_select_all.setIcon("SELECT_ALL");
		p.Btn_lot_prop_select_all.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_lot_prop_select_all);
		p.Btn_lot_prop_select_all.setNextBeans(p.Btn_lot_prop_deselect_all);
		p.Btn_lot_prop_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_lot_prop_deselect_all.setFunctionKey(MCFunctionKey.F18);
		p.BtnPanel.add(p.Btn_lot_prop_deselect_all);
		p.Btn_lot_prop_deselect_all.setNextBeans(p.Btn_pack_select_all);
		p.BtnPanel.add(p.Btn_label_pack);
		p.Btn_pack_select_all.setIcon("SELECT_ALL");
		p.Btn_pack_select_all.setFunctionKey(MCFunctionKey.F19);
		p.BtnPanel.add(p.Btn_pack_select_all);
		p.Btn_pack_select_all.setNextBeans(p.Btn_pack_deselect_all);
		p.Btn_pack_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_pack_deselect_all.setFunctionKey(MCFunctionKey.F20);
		p.BtnPanel.add(p.Btn_pack_deselect_all);
		p.Btn_pack_deselect_all.setNextBeans(p.Btn_pick_prnt_select_all);
		p.BtnPanel.add(p.Btn_label_pick_prnt);
		p.Btn_pick_prnt_select_all.setIcon("SELECT_ALL");
		p.BtnPanel.add(p.Btn_pick_prnt_select_all);
		p.Btn_pick_prnt_select_all.setNextBeans(p.Btn_pick_prnt_deselect_all);
		p.Btn_pick_prnt_deselect_all.setIcon("DESELECT_ALL");
		p.BtnPanel.add(p.Btn_pick_prnt_deselect_all);
		p.Btn_pick_prnt_deselect_all.setNextBeans(p.Btn_inst_prnt_select_all);
		p.BtnPanel.add(p.Btn_label_inst_prnt);
		p.Btn_inst_prnt_select_all.setIcon("SELECT_ALL");
		p.BtnPanel.add(p.Btn_inst_prnt_select_all);
		p.Btn_inst_prnt_select_all.setNextBeans(p.Btn_inst_prnt_deselect_all);
		p.Btn_inst_prnt_deselect_all.setIcon("DESELECT_ALL");
		p.BtnPanel.add(p.Btn_inst_prnt_deselect_all);
		p.Btn_inst_prnt_deselect_all.setNextBeans(p.Btn_dlv_prnt_select_all);
		p.BtnPanel.add(p.Btn_label_dlv_prnt);
		p.Btn_dlv_prnt_select_all.setIcon("SELECT_ALL");
		p.BtnPanel.add(p.Btn_dlv_prnt_select_all);
		p.Btn_dlv_prnt_select_all.setNextBeans(p.Btn_dlv_prnt_deselect_all);
		p.Btn_dlv_prnt_deselect_all.setIcon("DESELECT_ALL");
		p.BtnPanel.add(p.Btn_dlv_prnt_deselect_all);
		p.Btn_dlv_prnt_deselect_all.setNextBeans(p.Btn_adv_prnt_select_all);
		p.BtnPanel.add(p.Btn_label_adv_prnt);
		p.Btn_adv_prnt_select_all.setIcon("SELECT_ALL");
		p.BtnPanel.add(p.Btn_adv_prnt_select_all);
		p.Btn_adv_prnt_select_all.setNextBeans(p.Btn_adv_prnt_deselect_all);
		p.Btn_adv_prnt_deselect_all.setIcon("DESELECT_ALL");
		p.BtnPanel.add(p.Btn_adv_prnt_deselect_all);
		p.Btn_adv_prnt_deselect_all.setNextBeans(p.Btn_ins01);
		p.Btn_ins01.setIcon("REGISTER");
		p.Btn_ins01.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins01);
		p.Btn_del01.setIcon("CANCEL");
		p.Btn_del01.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del01);
		p.EastBtnPanel.add(p.Btn_del01);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * [WmsTrgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWmsTrgt(MSBEP_ShipInstListReg p) {
		// ブロック関連の初期化
		p.WmsTrgtPanel.setBorder(p.WmsTrgtTitledBorder);
		p.WmsTrgtPanel.setValueCheck(false);
		p.WmsTrgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.WmsTrgtPanel.setLayoutPosition("NNWNXC");
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
		MSBEP_ShipInstListReg_MC.mcInitScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitDispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitPrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitTop((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitFold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitTab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitTab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitTab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitDlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitTab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitCstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitTab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitAllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitSchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitPickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitInstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitDlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitAdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitCnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitCtrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitRPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitBulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitRslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitDtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitEastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.mcInitWmsTrgt((MSBEP_ShipInstListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__UPD_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__DEL_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [SRCH_PR]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [SRCH_PR_DLV]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__PR__DLV_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [SRCH_REF_H]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__H_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [SRCH_REF_D]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitSRCH__REF__D_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitUPD_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitUPD_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitDEL_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitDEL_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [PRNT]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitPRNT_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [PRNT_DLV]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitPRNT__DLV_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [REF_H]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitREF__H_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__H_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [REF_D]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitREF__D_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitREF__D_WmsTrgt((MSBEP_ShipInstListReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_DispUnit((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_PrSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Top((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Fold((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Tab1((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Tab2((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_ShipToGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Tab3((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_DlvGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Tab4((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_CstGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Tab5((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_ItmGrp((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_AllocSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_SchdSts((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_PickPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_InstPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_DlvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_AdvPrnt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Cnd((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Ctrl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_RPnl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_BulkSet((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Rslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Dtl((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_Btn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_EastBtn((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.statusInitFIX__U_WmsTrgt((MSBEP_ShipInstListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [PrSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrSts(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ShipInstListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [ShipToGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipToGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [DlvGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [CstGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [AllocSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocSts(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [SchdSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSchdSts(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [PickPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPickPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [InstPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInstPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [DlvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [AdvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdvPrnt(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipInstListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_disp_unit_Group.addAllListener(p);
		p.Cnd_disp_unit_Hdr.addAllListener(p);
		p.Cnd_disp_unit_Dtl.addAllListener(p);
		p.Cnd_disp_unit_Dlv.addAllListener(p);
		p.Cnd_uninst.addAllListener(p);
		p.Cnd_inst.addAllListener(p);
		p.Cnd_p_ship.addAllListener(p);
		p.Cnd_ship.addAllListener(p);
		p.Cnd_not_alloc_flg.addAllListener(p);
		p.Cnd_part_alloc_flg.addAllListener(p);
		p.Cnd_all_alloc_flg.addAllListener(p);
		p.Cnd_alloc_invalid_flg.addAllListener(p);
		p.Cnd_wms_flg.addAllListener(p);
		p.Cnd_not_wms_flg.addAllListener(p);
		p.Cnd_late_ship.addAllListener(p);
		p.Cnd_late_rqst.addAllListener(p);
		p.Cnd_pick_not_prnted.addAllListener(p);
		p.Cnd_pick_prnted.addAllListener(p);
		p.Cnd_inst_not_prnted.addAllListener(p);
		p.Cnd_inst_prnted.addAllListener(p);
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
		p.Cnd_ship_wk_cd.setListListener(p);
		p.Cnd_ship_wk_cd.addAllListener(p);
		p.Cnd_ship_wk_nm.setListListener(p);
		p.Cnd_ship_wk_nm.addAllListener(p);
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
		p.Cnd_iv_itm_nm.setListListener(p);
		p.Cnd_iv_itm_nm.addAllListener(p);
		p.Cnd_inst_usr_cd.setListListener(p);
		p.Cnd_inst_usr_cd.addAllListener(p);
		p.Cnd_inst_usr_nm.setListListener(p);
		p.Cnd_inst_usr_nm.addAllListener(p);
		p.Cnd_inst_dpt_cd.setListListener(p);
		p.Cnd_inst_dpt_cd.addAllListener(p);
		p.Cnd_inst_dpt_nm.setListListener(p);
		p.Cnd_inst_dpt_nm.addAllListener(p);
		p.Cnd_ship_schd_no.setListListener(p);
		p.Cnd_ship_schd_no.addAllListener(p);
		p.Cnd_ship_inst_no.setListListener(p);
		p.Cnd_ship_inst_no.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_xfr_schd_no.setListListener(p);
		p.Cnd_xfr_schd_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_inst_rmrks.setListListener(p);
		p.Cnd_inst_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_can_disp_flg.addAllListener(p);
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
	protected static void mcInitCtrl(MSBEP_ShipInstListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_ShipInstListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_ShipInstListReg p) {
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_indiv_inst_prnt_flg.addAllListener(p);
		p.BulkSet_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_ShipInstListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_ship_abl_flg.addAllListener(p);
		p.columnRslt_alloc_tgt_flg.addAllListener(p);
		p.columnRslt_lot_prop_flg.addAllListener(p);
		p.columnRslt_pack_flg.addAllListener(p);
		p.columnRslt_ship_schd_time.addAllListener(p);
		p.columnRslt_ship_schd_time.setListListener(p);
		p.columnRslt_dlv_rqst_dt.addAllListener(p);
		p.columnRslt_dlv_rqst_dt.setListListener(p);
		p.columnRslt_dlv_rqst_hm.addAllListener(p);
		p.columnRslt_dlv_rqst_hm.setListListener(p);
		p.columnRslt_dlv_rqst_tm.addAllListener(p);
		p.columnRslt_dlv_rqst_tm.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_ship_to_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_to_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_to_id_typ.addAllListener(p);
		p.columnRslt_ship_to_id_typ.setListListener(p);
		p.columnRslt_ship_to_id_typ_nm.addAllListener(p);
		p.columnRslt_ship_to_id_typ_nm.setListListener(p);
		p.columnRslt_ship_to_id_cd.addAllListener(p);
		p.columnRslt_ship_to_id_cd.setListListener(p);
		p.columnRslt_ship_to_id_nm.addAllListener(p);
		p.columnRslt_ship_to_id_nm.setListListener(p);
		p.columnRslt_ship_to_sundry_flg.addAllListener(p);
		p.columnRslt_via_dlv_typ.addAllListener(p);
		p.columnRslt_via_dlv_typ.setListListener(p);
		p.columnRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnRslt_via_dlv_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_cd.addAllListener(p);
		p.columnRslt_dlv_id_cd.setListListener(p);
		p.columnRslt_dlv_id_nm.addAllListener(p);
		p.columnRslt_dlv_id_nm.setListListener(p);
		p.columnRslt_ship_term_cd.addAllListener(p);
		p.columnRslt_ship_term_cd.setListListener(p);
		p.columnRslt_ship_term_nm.addAllListener(p);
		p.columnRslt_ship_term_nm.setListListener(p);
		p.columnRslt_ship_wk_grp_cd.addAllListener(p);
		p.columnRslt_ship_wk_grp_cd.setListListener(p);
		p.columnRslt_ship_wk_grp_nm.addAllListener(p);
		p.columnRslt_ship_wk_grp_nm.setListListener(p);
		p.columnRslt_ship_wk_cd.addAllListener(p);
		p.columnRslt_ship_wk_cd.setListListener(p);
		p.columnRslt_ship_wk_nm.addAllListener(p);
		p.columnRslt_ship_wk_nm.setListListener(p);
		p.columnRslt_pick_prnt_flg.addAllListener(p);
		p.columnRslt_inst_prnt_flg.addAllListener(p);
		p.columnRslt_dlv_prnt_flg.addAllListener(p);
		p.columnRslt_adv_prnt_flg.addAllListener(p);
		p.columnRslt_num_of_details.addAllListener(p);
		p.columnRslt_num_of_details.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_rqst_dpt_cd.addAllListener(p);
		p.columnRslt_rqst_dpt_cd.setListListener(p);
		p.columnRslt_rqst_dpt_nm.addAllListener(p);
		p.columnRslt_rqst_dpt_nm.setListListener(p);
		p.columnRslt_rqst_usr_cd.addAllListener(p);
		p.columnRslt_rqst_usr_cd.setListListener(p);
		p.columnRslt_rqst_usr_nm.addAllListener(p);
		p.columnRslt_rqst_usr_nm.setListListener(p);
		p.columnRslt_ship_block_flg.addAllListener(p);
		p.columnRslt_pd_inst_dlv_dt.addAllListener(p);
		p.columnRslt_pd_inst_dlv_dt.setListListener(p);
		p.columnRslt_pd_inst_dlv_hm.addAllListener(p);
		p.columnRslt_pd_inst_dlv_hm.setListListener(p);
		p.columnRslt_dlv_day_week_typ.addAllListener(p);
		p.columnRslt_dlv_day_week_typ.setListListener(p);
		p.columnRslt_dlv_day_week_typ_nm.addAllListener(p);
		p.columnRslt_dlv_day_week_typ_nm.setListListener(p);
		p.columnRslt_ship_rqst_dt.addAllListener(p);
		p.columnRslt_ship_rqst_dt.setListListener(p);
		p.columnRslt_ship_rqst_hm.addAllListener(p);
		p.columnRslt_ship_rqst_hm.setListListener(p);
		p.columnRslt_assort_typ.addAllListener(p);
		p.columnRslt_assort_typ.setListListener(p);
		p.columnRslt_assort_typ_nm.addAllListener(p);
		p.columnRslt_assort_typ_nm.setListListener(p);
		p.columnRslt_set_itm_grp_no.addAllListener(p);
		p.columnRslt_set_itm_grp_no.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
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
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_alloc_scope_typ.addAllListener(p);
		p.columnRslt_alloc_scope_typ.setListListener(p);
		p.columnRslt_alloc_typ.addAllListener(p);
		p.columnRslt_alloc_typ.setListListener(p);
		p.columnRslt_alloc_typ_nm.addAllListener(p);
		p.columnRslt_alloc_typ_nm.setListListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_grp_alloc_flg.addAllListener(p);
		p.columnRslt_ship_loc_cd.addAllListener(p);
		p.columnRslt_ship_loc_cd.setListListener(p);
		p.columnRslt_ship_loc_nm.addAllListener(p);
		p.columnRslt_ship_loc_nm.setListListener(p);
		p.columnRslt_ship_str_ln_cd.addAllListener(p);
		p.columnRslt_ship_str_ln_cd.setListListener(p);
		p.columnRslt_ship_str_ln_nm.addAllListener(p);
		p.columnRslt_ship_str_ln_nm.setListListener(p);
		p.columnRslt_ship_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
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
		p.columnRslt_ship_wt.addAllListener(p);
		p.columnRslt_ship_wt.setListListener(p);
		p.columnRslt_ship_dim.addAllListener(p);
		p.columnRslt_ship_dim.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnRslt_inst_rmrks.addAllListener(p);
		p.columnRslt_inst_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_inst_d_rmrks.addAllListener(p);
		p.columnRslt_inst_d_rmrks.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_d_sub_char1.addAllListener(p);
		p.columnRslt_d_sub_char1.setListListener(p);
		p.columnRslt_d_sub_char2.addAllListener(p);
		p.columnRslt_d_sub_char2.setListListener(p);
		p.columnRslt_d_sub_char3.addAllListener(p);
		p.columnRslt_d_sub_char3.setListListener(p);
		p.columnRslt_ship_schd_no.addAllListener(p);
		p.columnRslt_ship_schd_no.setListListener(p);
		p.columnRslt_ship_inst_no.addAllListener(p);
		p.columnRslt_ship_inst_no.setListListener(p);
		p.columnRslt_ship_inst_d_no.addAllListener(p);
		p.columnRslt_ship_inst_d_no.setListListener(p);
		p.columnRslt_wms_flg.addAllListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_xfr_schd_no.addAllListener(p);
		p.columnRslt_xfr_schd_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_iv_ship_flg.addAllListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_dlv_slip_seq.addAllListener(p);
		p.columnRslt_dlv_slip_seq.setListListener(p);
		p.columnRslt_dlv_slip_rev.addAllListener(p);
		p.columnRslt_dlv_slip_rev.setListListener(p);
		p.columnRslt_act_split_flg.addAllListener(p);
		p.columnRslt_ship_alloc_sts_no.addAllListener(p);
		p.columnRslt_ship_alloc_sts_no.setListListener(p);
		p.columnRslt_pick_prnted_flg.addAllListener(p);
		p.columnRslt_inst_prnted_flg.addAllListener(p);
		p.columnRslt_dlv_prnted_flg.addAllListener(p);
		p.columnRslt_adv_prnted_flg.addAllListener(p);
		p.columnRslt_pack_disable_flg.addAllListener(p);
		p.columnRslt_non_dlv_prnt_flg.addAllListener(p);
		p.columnRslt_non_adv_prnt_flg.addAllListener(p);
		p.columnRslt_can_flg.addAllListener(p);
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
		p.columnRslt_ship_inst_upd_cntr.addAllListener(p);
		p.columnRslt_ship_inst_upd_cntr.setListListener(p);
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
		p.columnRslt_list_no.addAllListener(p);
		p.columnRslt_list_no.setListListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_ShipInstListReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_list_no.addAllListener(p);
		p.columnDtl_list_no.setListListener(p);
		p.columnDtl_ship_schd_no.addAllListener(p);
		p.columnDtl_ship_schd_no.setListListener(p);
		p.columnDtl_ship_schd_upd_cntr.addAllListener(p);
		p.columnDtl_ship_schd_upd_cntr.setListListener(p);
		p.columnDtl_ship_pr_no.addAllListener(p);
		p.columnDtl_ship_pr_no.setListListener(p);
		p.columnDtl_ship_pr_upd_cntr.addAllListener(p);
		p.columnDtl_ship_pr_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ShipInstListReg p) {
		p.Btn_open_MSBEP1420.addAllListener(p);
		p.Btn_open_MSBEP1420.setAPMethodName("doBtn_open_MSBEP1420");
		p.Btn_open_MSBEP1400.addAllListener(p);
		p.Btn_open_MSBEP1400.setAPMethodName("doBtn_open_MSBEP1400");
		p.Btn_open_MSBEP0110.addAllListener(p);
		p.Btn_open_MSBEP0110.setAPMethodName("doBtn_open_MSBEP0110");
		p.Btn_prnt_pick.addAllListener(p);
		p.Btn_prnt_pick.setAPMethodName("doBtn_prnt_pick");
		p.Btn_prnt_inst.addAllListener(p);
		p.Btn_prnt_inst.setAPMethodName("doBtn_prnt_inst");
		p.Btn_prnt_dlv.addAllListener(p);
		p.Btn_prnt_dlv.setAPMethodName("doBtn_prnt_dlv");
		p.Btn_prnt_adv.addAllListener(p);
		p.Btn_prnt_adv.setAPMethodName("doBtn_prnt_adv");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_alloc_select_all.addAllListener(p);
		p.Btn_alloc_select_all.setAPMethodName("doBtn_alloc_select_all");
		p.Btn_alloc_deselect_all.addAllListener(p);
		p.Btn_alloc_deselect_all.setAPMethodName("doBtn_alloc_deselect_all");
		p.Btn_lot_prop_select_all.addAllListener(p);
		p.Btn_lot_prop_select_all.setAPMethodName("doBtn_lot_prop_select_all");
		p.Btn_lot_prop_deselect_all.addAllListener(p);
		p.Btn_lot_prop_deselect_all.setAPMethodName("doBtn_lot_prop_deselect_all");
		p.Btn_pack_select_all.addAllListener(p);
		p.Btn_pack_select_all.setAPMethodName("doBtn_pack_select_all");
		p.Btn_pack_deselect_all.addAllListener(p);
		p.Btn_pack_deselect_all.setAPMethodName("doBtn_pack_deselect_all");
		p.Btn_pick_prnt_select_all.addAllListener(p);
		p.Btn_pick_prnt_select_all.setAPMethodName("doBtn_pick_prnt_select_all");
		p.Btn_pick_prnt_deselect_all.addAllListener(p);
		p.Btn_pick_prnt_deselect_all.setAPMethodName("doBtn_pick_prnt_deselect_all");
		p.Btn_inst_prnt_select_all.addAllListener(p);
		p.Btn_inst_prnt_select_all.setAPMethodName("doBtn_inst_prnt_select_all");
		p.Btn_inst_prnt_deselect_all.addAllListener(p);
		p.Btn_inst_prnt_deselect_all.setAPMethodName("doBtn_inst_prnt_deselect_all");
		p.Btn_dlv_prnt_select_all.addAllListener(p);
		p.Btn_dlv_prnt_select_all.setAPMethodName("doBtn_dlv_prnt_select_all");
		p.Btn_dlv_prnt_deselect_all.addAllListener(p);
		p.Btn_dlv_prnt_deselect_all.setAPMethodName("doBtn_dlv_prnt_deselect_all");
		p.Btn_adv_prnt_select_all.addAllListener(p);
		p.Btn_adv_prnt_select_all.setAPMethodName("doBtn_adv_prnt_select_all");
		p.Btn_adv_prnt_deselect_all.addAllListener(p);
		p.Btn_adv_prnt_deselect_all.setAPMethodName("doBtn_adv_prnt_deselect_all");
		p.Btn_ins01.addAllListener(p);
		p.Btn_ins01.setAPMethodName("doBtn_ins01");
		p.Btn_del01.addAllListener(p);
		p.Btn_del01.setAPMethodName("doBtn_del01");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_ShipInstListReg p) {
	}

	/**
	 *  [WmsTrgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWmsTrgt(MSBEP_ShipInstListReg p) {
	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_uninst.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_p_ship.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
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
		p.Cnd_dlv_id_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_prop_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pack_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_inst_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_num_of_details.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_inst_prnted_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_disable_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_uninst.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_p_ship.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
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
		p.Cnd_ship_wk_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_pick_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_inst_not_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_inst_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, SRCH_PR, MCMode.REQUIRED);
		p.Cnd_sub_char1.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PR, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_PR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_PR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_non_adv_prnt_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PR, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_PR, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_PR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_PR, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH_PR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, SRCH_PR_DLV, MCMode.REQUIRED);
		p.Cnd_sub_char1.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PR_DLV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_dim.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_act_split_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_inst_prnted_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_non_adv_prnt_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PR_DLV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PR_DLV, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_PR_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH_PR_DLV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_PR_DLV]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PR__DLV_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_pick_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_inst_not_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_inst_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, SRCH_REF_H, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF_H, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_REF_H]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF_H, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF_H]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF_H]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF_H, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF_H, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_REF_H, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_REF_H, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH_REF_H, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_H]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__H_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_not_wms_flg.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_late_ship.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_late_rqst.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_pick_not_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_pick_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_inst_not_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_inst_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, SRCH_REF_D, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_str_ln_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_str_ln_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_d_sub_char1.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_d_sub_char2.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_d_sub_char3.putMode(p, SRCH_REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF_D, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF_D]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF_D]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_alloc_tgt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_dt.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_hm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_assort_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_ship_wt.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char1.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char2.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char3.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_act_split_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF_D, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH_REF_D, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_REF_D, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH_REF_D, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [SRCH_REF_D]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__D_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_uninst.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_p_ship.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Cnd_dlv_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.BulkSet_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_lot_prop_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_pack_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.columnRslt_ship_schd_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_dlv_rqst_tm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ship_wk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_inst_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dlv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_adv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_num_of_details.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_base_dlv_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_inst_d_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_inst_prnted_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnted_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_adv_prnted_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_disable_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP1400.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_alloc_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_alloc_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_lot_prop_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_pack_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_pack_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_pick_prnt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_inst_prnt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_adv_prnt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins01.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del01.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [UPD]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_uninst.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_p_ship.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Cnd_ship_wk_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_adv_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, DEL, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_alloc_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_adv_prnt_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del01.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [DEL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pick_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_inst_not_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_inst_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_dlv_not_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
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
		p.Cnd_ship_wk_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.BulkSet_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, PRNT, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_non_adv_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_pick.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_inst.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_dlv.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_adv.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_alloc_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del01.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
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
		p.Cnd_ship_wk_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.Cnd_sub_char1.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT_DLV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, PRNT_DLV, MCMode.ENABLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, PRNT_DLV, MCMode.REQUIRED);

	}

	/**
	 * [PRNT_DLV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, PRNT_DLV, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_dim.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_act_split_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_inst_prnted_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnted_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_non_adv_prnt_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT_DLV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT_DLV, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, PRNT_DLV, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, PRNT_DLV, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_prnt_adv.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_DLV, MCMode.ENABLE);
		p.Btn_alloc_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, PRNT_DLV, MCMode.DISABLE);
		p.Btn_del01.putMode(p, PRNT_DLV, MCMode.DISABLE);

	}

	/**
	 * [PRNT_DLV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [PRNT_DLV]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DLV_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_pick_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_inst_not_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_inst_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_dlv_not_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, REF_H, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_str_ln_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_typ.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_dlv_id_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_cst_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_H, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_H]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, REF_H, MCMode.ENABLE);

	}

	/**
	 * [REF_H]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, REF_H, MCMode.READ_ONLY);

	}

	/**
	 * [REF_H]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_H, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, REF_H, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_H, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_H, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_H, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, REF_H, MCMode.INVISIBLE);

	}

	/**
	 * [REF_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF_H, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, REF_H, MCMode.INVISIBLE);

	}

	/**
	 * [REF_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, REF_H, MCMode.ENABLE);
		p.Btn_open_MSBEP1400.putMode(p, REF_H, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, REF_H, MCMode.DISABLE);
		p.Btn_del01.putMode(p, REF_H, MCMode.DISABLE);

	}

	/**
	 * [REF_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_H]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__H_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_uninst.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_p_ship.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_ship.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_not_alloc_flg.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_not_wms_flg.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_late_ship.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_late_rqst.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_pick_not_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_pick_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_inst_not_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_inst_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_dlv_not_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_dlv_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_adv_not_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_adv_prnted.putMode(p, REF_D, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_str_ln_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_str_ln_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_can_disp_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_d_sub_char1.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_d_sub_char2.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_d_sub_char3.putMode(p, REF_D, MCMode.ENABLE);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, REF_D, MCMode.ENABLE);

	}

	/**
	 * [REF_D]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, REF_D, MCMode.READ_ONLY);

	}

	/**
	 * [REF_D]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_alloc_tgt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_lot_prop_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_pack_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_inst_prnt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_prnt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_adv_prnt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_num_of_details.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_dt.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_hm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_assort_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF_D, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF_D, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_grp_alloc_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_ship_wt.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_inst_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char1.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char2.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_d_sub_char3.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_act_split_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_D, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_D, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, REF_D, MCMode.INVISIBLE);

	}

	/**
	 * [REF_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, REF_D, MCMode.INVISIBLE);

	}

	/**
	 * [REF_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, REF_D, MCMode.ENABLE);
		p.Btn_open_MSBEP1400.putMode(p, REF_D, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, REF_D, MCMode.DISABLE);
		p.Btn_del01.putMode(p, REF_D, MCMode.DISABLE);

	}

	/**
	 * [REF_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [REF_D]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__D_WmsTrgt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DispUnit(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PrSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ShipToGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipToGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_CstGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab5(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ItmGrp(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[SchdSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SchdSts(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[PickPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PickPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[InstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_InstPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[AdvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AdvPrnt(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_ShipInstListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_uninst.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_p_ship.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_part_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_all_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_alloc_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_late_ship.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_late_rqst.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_pick_not_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_pick_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_not_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_not_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_adv_not_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_adv_prnted.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_schd_dt_frto_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_frto_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Cnd_ship_wk_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_can_disp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_d_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_d_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_d_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_to_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBEP_ShipInstListReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBEP_ShipInstListReg p){
		p.BulkSet_ship_inst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_indiv_inst_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBEP_ShipInstListReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_abl_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alloc_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_prop_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pack_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ship_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_schd_time.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_dlv_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_inst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_rqst_tm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_wk_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pick_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_inst_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_adv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_num_of_details.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_pd_inst_dlv_hm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_hm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_assort_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alloc_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd_none_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, FIX_U, MCMode.INVISIBLE);
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
		p.Rslt_ship_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_ship_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_prov_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_ac_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_d_sub_char3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_xfr_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_rev.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_act_split_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_alloc_sts_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_pick_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_inst_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_adv_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pack_disable_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_non_dlv_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_non_adv_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_list_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_ShipInstListReg p){
		p.columnDtl_list_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_ShipInstListReg p){
		p.Btn_open_MSBEP1420.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBEP1400.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_alloc_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_alloc_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_lot_prop_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_lot_prop_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_pack_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_pack_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_pick_prnt_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_pick_prnt_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_inst_prnt_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_inst_prnt_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_dlv_prnt_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_dlv_prnt_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_adv_prnt_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_adv_prnt_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del01.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_ShipInstListReg p){

	}

	/**
	 * [FIX_U]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_WmsTrgt(MSBEP_ShipInstListReg p){

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
		MSBEP_ShipInstListReg_MC.setTableConfigRslt((MSBEP_ShipInstListReg)this);
		MSBEP_ShipInstListReg_MC.setTableConfigDtl((MSBEP_ShipInstListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_ShipInstListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_ship_abl_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_abl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_abl_flg);
		p.columnRslt_alloc_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.alloc_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_tgt_flg);
		p.columnRslt_lot_prop_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.lot_prop_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_prop_flg);
		p.columnRslt_pack_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pack_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_flg);
		p.RsltTable.addTable(p.Rslt_ship_schd_tm_p_PPanel.YmdHmTable);
		p.columnRslt_ship_schd_time.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_schd_time_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_time);
		p.columnRslt_dlv_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_rqst_dt_META);
		p.columnRslt_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_dt);
		p.columnRslt_dlv_rqst_hm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_rqst_hm_META);
		p.columnRslt_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_hm);
		p.RsltTable.addTable(p.Rslt_dlv_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ship_inst_tm_p_PPanel.YmdHmTable);
		p.columnRslt_dlv_rqst_tm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_rqst_tm_META);
		p.columnRslt_dlv_rqst_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_tm);
		p.columnRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_fr_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_cd);
		p.columnRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_fr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_ship_to_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_to_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_lg_grp_cd);
		p.columnRslt_ship_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_to_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ);
		p.columnRslt_ship_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_to_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ_nm);
		p.columnRslt_ship_to_id_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_to_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_cd);
		p.columnRslt_ship_to_id_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_to_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_nm);
		p.RsltTable.addTable(p.Rslt_ship_to_addr_p_PPanel.AddrTable);
		p.columnRslt_ship_to_sundry_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_to_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_sundry_flg);
		p.columnRslt_via_dlv_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.via_dlv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ);
		p.columnRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.via_dlv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ_nm);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.columnRslt_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_cd);
		p.columnRslt_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_nm);
		p.columnRslt_ship_term_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_term_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_cd);
		p.columnRslt_ship_term_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_term_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_nm);
		p.columnRslt_ship_wk_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_wk_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_grp_cd);
		p.columnRslt_ship_wk_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_wk_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_grp_nm);
		p.columnRslt_ship_wk_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_wk_cd_META);
		p.columnRslt_ship_wk_cd.addLinkBeans(p.columnRslt_ship_wk_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_cd);
		p.columnRslt_ship_wk_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_wk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_nm);
		p.columnRslt_pick_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pick_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pick_prnt_flg);
		p.columnRslt_inst_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.inst_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_prnt_flg);
		p.columnRslt_dlv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_prnt_flg);
		p.columnRslt_adv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.adv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_prnt_flg);
		p.columnRslt_num_of_details.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.num_of_details_META);
		p.RsltTable.addColumnConfig(p.columnRslt_num_of_details);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.rqst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_cd);
		p.columnRslt_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.rqst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_nm);
		p.columnRslt_rqst_usr_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.rqst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_cd);
		p.columnRslt_rqst_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.rqst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_nm);
		p.columnRslt_ship_block_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_block_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_block_flg);
		p.columnRslt_pd_inst_dlv_dt.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pd_inst_dlv_dt_META);
		p.columnRslt_pd_inst_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pd_inst_dlv_dt);
		p.columnRslt_pd_inst_dlv_hm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pd_inst_dlv_hm_META);
		p.columnRslt_pd_inst_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pd_inst_dlv_hm);
		p.columnRslt_dlv_day_week_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_day_week_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_day_week_typ);
		p.columnRslt_dlv_day_week_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_day_week_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_day_week_typ_nm);
		p.columnRslt_ship_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_rqst_dt_META);
		p.columnRslt_ship_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_dt);
		p.columnRslt_ship_rqst_hm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_rqst_hm_META);
		p.columnRslt_ship_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_hm);
		p.columnRslt_assort_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.assort_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_assort_typ);
		p.columnRslt_assort_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.assort_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_assort_typ_nm);
		p.columnRslt_set_itm_grp_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.set_itm_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_itm_grp_no);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_act_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_std_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_alloc_scope_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.alloc_scope_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_scope_typ);
		p.columnRslt_alloc_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.alloc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_typ);
		p.columnRslt_alloc_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.alloc_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_typ_nm);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_grp_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.grp_alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_grp_alloc_flg);
		p.columnRslt_ship_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_cd);
		p.columnRslt_ship_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_nm);
		p.columnRslt_ship_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_str_ln_cd);
		p.columnRslt_ship_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_str_ln_nm);
		p.columnRslt_ship_str_ln_cd_none_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_str_ln_cd_none_flg);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.RsltTable.addTable(p.Rslt_ship_act_qty_p_PPanel.QtyTable);
		p.columnRslt_ship_wt.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wt);
		p.columnRslt_ship_dim.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_dim_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dim);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_inst_dpt_nm);
		p.columnRslt_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dlv_slip_no);
		p.columnRslt_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_prov_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_prov_act_no);
		p.columnRslt_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.base_ac_dt_META);
		p.columnRslt_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_ac_dt);
		p.columnRslt_ship_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_cnt_rmrks);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_inst_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.inst_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_inst_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.inst_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_d_rmrks);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_sub_char1);
		p.columnRslt_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_sub_char2);
		p.columnRslt_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_sub_char3);
		p.columnRslt_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_no);
		p.columnRslt_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_no);
		p.columnRslt_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_no);
		p.columnRslt_wms_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.wms_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wms_flg);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.xfr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_schd_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_iv_ship_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.iv_ship_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_ship_flg);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_dlv_slip_seq.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_slip_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_seq);
		p.columnRslt_dlv_slip_rev.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_slip_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_rev);
		p.columnRslt_act_split_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.act_split_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_split_flg);
		p.columnRslt_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_alloc_sts_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_alloc_sts_no);
		p.columnRslt_pick_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pick_prnted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pick_prnted_flg);
		p.columnRslt_inst_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.inst_prnted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_prnted_flg);
		p.columnRslt_dlv_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.dlv_prnted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_prnted_flg);
		p.columnRslt_adv_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.adv_prnted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_prnted_flg);
		p.columnRslt_pack_disable_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.pack_disable_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_disable_flg);
		p.columnRslt_non_dlv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.non_dlv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_dlv_prnt_flg);
		p.columnRslt_non_adv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.non_adv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_adv_prnt_flg);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.RsltTable.addTable(p.Rslt_ship_to_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ship_inst_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.ship_inst_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_list_no.setMeta(mcframe.clientMSBE.MSBEP1410.RsltR.list_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_list_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_ShipInstListReg p) {
		p.columnDtl_list_no.setMeta(mcframe.clientMSBE.MSBEP1410.DtlR.list_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_list_no);
		p.columnDtl_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1410.DtlR.ship_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_no);
		p.columnDtl_ship_schd_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1410.DtlR.ship_schd_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_upd_cntr);
		p.columnDtl_ship_pr_no.setMeta(mcframe.clientMSBE.MSBEP1410.DtlR.ship_pr_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_no);
		p.columnDtl_ship_pr_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1410.DtlR.ship_pr_upd_cntr_META);
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
		Cnd_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_wk_cd.getListConfig().setPutter(getCnd_ship_wk_cd_ListPutter());
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
		Cnd_inst_usr_cd.getListConfig().setPutter(getCnd_inst_usr_cd_ListPutter());
		Cnd_inst_dpt_cd.getListConfig().setPutter(getCnd_inst_dpt_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnRslt_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_wk_cd.getListConfig().setPutter(getRslt_ship_wk_cd_ListPutter());
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
	 * この画面を[SRCH_PR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRStatus() {
		status = SRCH_PR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_PR_DLV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PR_DLVStatus() {
		status = SRCH_PR_DLV;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF_HStatus() {
		status = SRCH_REF_H;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF_DStatus() {
		status = SRCH_REF_D;
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
	 * この画面を[REF_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_HStatus() {
		status = REF_H;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DStatus() {
		status = REF_D;
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
		else if (SRCH_PR.equals(status)) {
			setSRCH_PRStatus();
		}
		else if (SRCH_PR_DLV.equals(status)) {
			setSRCH_PR_DLVStatus();
		}
		else if (SRCH_REF_H.equals(status)) {
			setSRCH_REF_HStatus();
		}
		else if (SRCH_REF_D.equals(status)) {
			setSRCH_REF_DStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
		else if (PRNT_DLV.equals(status)) {
			setPRNT_DLVStatus();
		}
		else if (REF_H.equals(status)) {
			setREF_HStatus();
		}
		else if (REF_D.equals(status)) {
			setREF_DStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
	 * [Cnd_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
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
	 * [Cnd_inst_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inst_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_inst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Rslt_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
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
		if(combo == Cnd_ship_wk_cd) return getCnd_ship_wk_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_inst_usr_cd) return getCnd_inst_usr_cd(row, info);
		if(combo == Cnd_inst_dpt_cd) return getCnd_inst_dpt_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_ship_wk_cd) return getRslt_ship_wk_cd(row, info);
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
		else if (ap == Btn_open_MSBEP1420) doBtn_open_MSBEP1420(info);
		else if (ap == Btn_open_MSBEP1400) doBtn_open_MSBEP1400(info);
		else if (ap == Btn_open_MSBEP0110) doBtn_open_MSBEP0110(info);
		else if (ap == Btn_prnt_pick) doBtn_prnt_pick(info);
		else if (ap == Btn_prnt_inst) doBtn_prnt_inst(info);
		else if (ap == Btn_prnt_dlv) doBtn_prnt_dlv(info);
		else if (ap == Btn_prnt_adv) doBtn_prnt_adv(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_alloc_select_all) doBtn_alloc_select_all(info);
		else if (ap == Btn_alloc_deselect_all) doBtn_alloc_deselect_all(info);
		else if (ap == Btn_lot_prop_select_all) doBtn_lot_prop_select_all(info);
		else if (ap == Btn_lot_prop_deselect_all) doBtn_lot_prop_deselect_all(info);
		else if (ap == Btn_pack_select_all) doBtn_pack_select_all(info);
		else if (ap == Btn_pack_deselect_all) doBtn_pack_deselect_all(info);
		else if (ap == Btn_pick_prnt_select_all) doBtn_pick_prnt_select_all(info);
		else if (ap == Btn_pick_prnt_deselect_all) doBtn_pick_prnt_deselect_all(info);
		else if (ap == Btn_inst_prnt_select_all) doBtn_inst_prnt_select_all(info);
		else if (ap == Btn_inst_prnt_deselect_all) doBtn_inst_prnt_deselect_all(info);
		else if (ap == Btn_dlv_prnt_select_all) doBtn_dlv_prnt_select_all(info);
		else if (ap == Btn_dlv_prnt_deselect_all) doBtn_dlv_prnt_deselect_all(info);
		else if (ap == Btn_adv_prnt_select_all) doBtn_adv_prnt_select_all(info);
		else if (ap == Btn_adv_prnt_deselect_all) doBtn_adv_prnt_deselect_all(info);
		else if (ap == Btn_ins01) doBtn_ins01(info);
		else if (ap == Btn_del01) doBtn_del01(info);
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
	 * [Btn]パネルの[open_MSBEP1420]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1420(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1400]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1400(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0110(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_pick]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_pick(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_inst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_inst(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_dlv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_dlv(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_adv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_adv(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[alloc_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_alloc_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[alloc_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_alloc_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[lot_prop_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_lot_prop_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[lot_prop_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_lot_prop_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[pack_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_pack_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[pack_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_pack_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[pick_prnt_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_pick_prnt_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[pick_prnt_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_pick_prnt_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[inst_prnt_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_inst_prnt_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[inst_prnt_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_inst_prnt_deselect_all(MCEventInfo info);

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
	 * [Btn]パネルの[ins01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins01(MCEventInfo info);

	/**
	 * [Btn]パネルの[del01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del01(MCEventInfo info);

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
		if (vc == Cnd_disp_unit_Group) return doCnd_disp_unit_VC(info);
		if (vc == Cnd_uninst) return doCnd_uninst_VC(info);
		if (vc == Cnd_inst) return doCnd_inst_VC(info);
		if (vc == Cnd_p_ship) return doCnd_p_ship_VC(info);
		if (vc == Cnd_ship) return doCnd_ship_VC(info);
		if (vc == Cnd_not_alloc_flg) return doCnd_not_alloc_flg_VC(info);
		if (vc == Cnd_part_alloc_flg) return doCnd_part_alloc_flg_VC(info);
		if (vc == Cnd_all_alloc_flg) return doCnd_all_alloc_flg_VC(info);
		if (vc == Cnd_alloc_invalid_flg) return doCnd_alloc_invalid_flg_VC(info);
		if (vc == Cnd_wms_flg) return doCnd_wms_flg_VC(info);
		if (vc == Cnd_not_wms_flg) return doCnd_not_wms_flg_VC(info);
		if (vc == Cnd_late_ship) return doCnd_late_ship_VC(info);
		if (vc == Cnd_late_rqst) return doCnd_late_rqst_VC(info);
		if (vc == Cnd_pick_not_prnted) return doCnd_pick_not_prnted_VC(info);
		if (vc == Cnd_pick_prnted) return doCnd_pick_prnted_VC(info);
		if (vc == Cnd_inst_not_prnted) return doCnd_inst_not_prnted_VC(info);
		if (vc == Cnd_inst_prnted) return doCnd_inst_prnted_VC(info);
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
		if (vc == Cnd_ship_wk_cd) return doCnd_ship_wk_cd_VC(info);
		if (vc == Cnd_ship_wk_nm) return doCnd_ship_wk_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_iv_itm_nm) return doCnd_iv_itm_nm_VC(info);
		if (vc == Cnd_inst_usr_cd) return doCnd_inst_usr_cd_VC(info);
		if (vc == Cnd_inst_usr_nm) return doCnd_inst_usr_nm_VC(info);
		if (vc == Cnd_inst_dpt_cd) return doCnd_inst_dpt_cd_VC(info);
		if (vc == Cnd_inst_dpt_nm) return doCnd_inst_dpt_nm_VC(info);
		if (vc == Cnd_ship_schd_no) return doCnd_ship_schd_no_VC(info);
		if (vc == Cnd_ship_inst_no) return doCnd_ship_inst_no_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_xfr_schd_no) return doCnd_xfr_schd_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_inst_rmrks) return doCnd_inst_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_can_disp_flg) return doCnd_can_disp_flg_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_d_sub_char1) return doCnd_d_sub_char1_VC(info);
		if (vc == Cnd_d_sub_char2) return doCnd_d_sub_char2_VC(info);
		if (vc == Cnd_d_sub_char3) return doCnd_d_sub_char3_VC(info);
		if (vc == BulkSet_indiv_inst_prnt_flg) return doBulkSet_indiv_inst_prnt_flg_VC(info);
		if (vc == BulkSet_indiv_prnt_flg) return doBulkSet_indiv_prnt_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_ship_abl_flg) return doRslt_ship_abl_flg_VC(info);
		if (vc == columnRslt_alloc_tgt_flg) return doRslt_alloc_tgt_flg_VC(info);
		if (vc == columnRslt_lot_prop_flg) return doRslt_lot_prop_flg_VC(info);
		if (vc == columnRslt_pack_flg) return doRslt_pack_flg_VC(info);
		if (vc == columnRslt_ship_schd_time) return doRslt_ship_schd_time_VC(info);
		if (vc == columnRslt_dlv_rqst_dt) return doRslt_dlv_rqst_dt_VC(info);
		if (vc == columnRslt_dlv_rqst_hm) return doRslt_dlv_rqst_hm_VC(info);
		if (vc == columnRslt_dlv_rqst_tm) return doRslt_dlv_rqst_tm_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_cd) return doRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_nm) return doRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_ship_to_lg_grp_cd) return doRslt_ship_to_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_to_id_typ) return doRslt_ship_to_id_typ_VC(info);
		if (vc == columnRslt_ship_to_id_typ_nm) return doRslt_ship_to_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_to_id_cd) return doRslt_ship_to_id_cd_VC(info);
		if (vc == columnRslt_ship_to_id_nm) return doRslt_ship_to_id_nm_VC(info);
		if (vc == columnRslt_ship_to_sundry_flg) return doRslt_ship_to_sundry_flg_VC(info);
		if (vc == columnRslt_via_dlv_typ) return doRslt_via_dlv_typ_VC(info);
		if (vc == columnRslt_via_dlv_typ_nm) return doRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_cd) return doRslt_dlv_id_cd_VC(info);
		if (vc == columnRslt_dlv_id_nm) return doRslt_dlv_id_nm_VC(info);
		if (vc == columnRslt_ship_term_cd) return doRslt_ship_term_cd_VC(info);
		if (vc == columnRslt_ship_term_nm) return doRslt_ship_term_nm_VC(info);
		if (vc == columnRslt_ship_wk_grp_cd) return doRslt_ship_wk_grp_cd_VC(info);
		if (vc == columnRslt_ship_wk_grp_nm) return doRslt_ship_wk_grp_nm_VC(info);
		if (vc == columnRslt_ship_wk_cd) return doRslt_ship_wk_cd_VC(info);
		if (vc == columnRslt_ship_wk_nm) return doRslt_ship_wk_nm_VC(info);
		if (vc == columnRslt_pick_prnt_flg) return doRslt_pick_prnt_flg_VC(info);
		if (vc == columnRslt_inst_prnt_flg) return doRslt_inst_prnt_flg_VC(info);
		if (vc == columnRslt_dlv_prnt_flg) return doRslt_dlv_prnt_flg_VC(info);
		if (vc == columnRslt_adv_prnt_flg) return doRslt_adv_prnt_flg_VC(info);
		if (vc == columnRslt_num_of_details) return doRslt_num_of_details_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_rqst_dpt_cd) return doRslt_rqst_dpt_cd_VC(info);
		if (vc == columnRslt_rqst_dpt_nm) return doRslt_rqst_dpt_nm_VC(info);
		if (vc == columnRslt_rqst_usr_cd) return doRslt_rqst_usr_cd_VC(info);
		if (vc == columnRslt_rqst_usr_nm) return doRslt_rqst_usr_nm_VC(info);
		if (vc == columnRslt_ship_block_flg) return doRslt_ship_block_flg_VC(info);
		if (vc == columnRslt_pd_inst_dlv_dt) return doRslt_pd_inst_dlv_dt_VC(info);
		if (vc == columnRslt_pd_inst_dlv_hm) return doRslt_pd_inst_dlv_hm_VC(info);
		if (vc == columnRslt_dlv_day_week_typ) return doRslt_dlv_day_week_typ_VC(info);
		if (vc == columnRslt_dlv_day_week_typ_nm) return doRslt_dlv_day_week_typ_nm_VC(info);
		if (vc == columnRslt_ship_rqst_dt) return doRslt_ship_rqst_dt_VC(info);
		if (vc == columnRslt_ship_rqst_hm) return doRslt_ship_rqst_hm_VC(info);
		if (vc == columnRslt_assort_typ) return doRslt_assort_typ_VC(info);
		if (vc == columnRslt_assort_typ_nm) return doRslt_assort_typ_nm_VC(info);
		if (vc == columnRslt_set_itm_grp_no) return doRslt_set_itm_grp_no_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_alloc_scope_typ) return doRslt_alloc_scope_typ_VC(info);
		if (vc == columnRslt_alloc_typ) return doRslt_alloc_typ_VC(info);
		if (vc == columnRslt_alloc_typ_nm) return doRslt_alloc_typ_nm_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_grp_alloc_flg) return doRslt_grp_alloc_flg_VC(info);
		if (vc == columnRslt_ship_loc_cd) return doRslt_ship_loc_cd_VC(info);
		if (vc == columnRslt_ship_loc_nm) return doRslt_ship_loc_nm_VC(info);
		if (vc == columnRslt_ship_str_ln_cd) return doRslt_ship_str_ln_cd_VC(info);
		if (vc == columnRslt_ship_str_ln_nm) return doRslt_ship_str_ln_nm_VC(info);
		if (vc == columnRslt_ship_str_ln_cd_none_flg) return doRslt_ship_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
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
		if (vc == columnRslt_ship_wt) return doRslt_ship_wt_VC(info);
		if (vc == columnRslt_ship_dim) return doRslt_ship_dim_VC(info);
		if (vc == columnRslt_base_dlv_slip_no) return doRslt_base_dlv_slip_no_VC(info);
		if (vc == columnRslt_base_prov_act_no) return doRslt_base_prov_act_no_VC(info);
		if (vc == columnRslt_base_ac_dt) return doRslt_base_ac_dt_VC(info);
		if (vc == columnRslt_ship_cnt_rmrks) return doRslt_ship_cnt_rmrks_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_inst_rmrks) return doRslt_inst_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_inst_d_rmrks) return doRslt_inst_d_rmrks_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_d_sub_char1) return doRslt_d_sub_char1_VC(info);
		if (vc == columnRslt_d_sub_char2) return doRslt_d_sub_char2_VC(info);
		if (vc == columnRslt_d_sub_char3) return doRslt_d_sub_char3_VC(info);
		if (vc == columnRslt_ship_schd_no) return doRslt_ship_schd_no_VC(info);
		if (vc == columnRslt_ship_inst_no) return doRslt_ship_inst_no_VC(info);
		if (vc == columnRslt_ship_inst_d_no) return doRslt_ship_inst_d_no_VC(info);
		if (vc == columnRslt_wms_flg) return doRslt_wms_flg_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_xfr_schd_no) return doRslt_xfr_schd_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_iv_ship_flg) return doRslt_iv_ship_flg_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_dlv_slip_seq) return doRslt_dlv_slip_seq_VC(info);
		if (vc == columnRslt_dlv_slip_rev) return doRslt_dlv_slip_rev_VC(info);
		if (vc == columnRslt_act_split_flg) return doRslt_act_split_flg_VC(info);
		if (vc == columnRslt_ship_alloc_sts_no) return doRslt_ship_alloc_sts_no_VC(info);
		if (vc == columnRslt_pick_prnted_flg) return doRslt_pick_prnted_flg_VC(info);
		if (vc == columnRslt_inst_prnted_flg) return doRslt_inst_prnted_flg_VC(info);
		if (vc == columnRslt_dlv_prnted_flg) return doRslt_dlv_prnted_flg_VC(info);
		if (vc == columnRslt_adv_prnted_flg) return doRslt_adv_prnted_flg_VC(info);
		if (vc == columnRslt_pack_disable_flg) return doRslt_pack_disable_flg_VC(info);
		if (vc == columnRslt_non_dlv_prnt_flg) return doRslt_non_dlv_prnt_flg_VC(info);
		if (vc == columnRslt_non_adv_prnt_flg) return doRslt_non_adv_prnt_flg_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ship_inst_upd_cntr) return doRslt_ship_inst_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_list_no) return doRslt_list_no_VC(info);
		if (vc == columnDtl_list_no) return doDtl_list_no_VC(info);
		if (vc == columnDtl_ship_schd_no) return doDtl_ship_schd_no_VC(info);
		if (vc == columnDtl_ship_schd_upd_cntr) return doDtl_ship_schd_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[disp_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[uninst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_uninst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[p_ship]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_p_ship_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_all_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_invalid_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[late_ship]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_late_ship_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[late_rqst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_late_rqst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pick_not_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pick_not_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pick_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pick_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_not_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_not_prnted_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_prnted]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_prnted_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[can_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_can_disp_flg_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[indiv_inst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_indiv_inst_prnt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_abl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_abl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_prop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_prop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_rqst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_rqst_tm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_lg_grp_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_dlv_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pick_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pick_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_prnt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[num_of_details]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_num_of_details_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_block_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pd_inst_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pd_inst_dlv_hm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[assort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_assort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_assort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_itm_grp_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abort_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_grp_alloc_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dim_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_ship_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_split_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_split_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pick_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pick_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_prnted_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_disable_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_disable_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[non_adv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_non_adv_prnt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[list_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_list_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[list_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_list_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_disp_unit_Group) doCnd_disp_unit_NC(info);
		else if (nc == Cnd_uninst) doCnd_uninst_NC(info);
		else if (nc == Cnd_inst) doCnd_inst_NC(info);
		else if (nc == Cnd_p_ship) doCnd_p_ship_NC(info);
		else if (nc == Cnd_ship) doCnd_ship_NC(info);
		else if (nc == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NC(info);
		else if (nc == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NC(info);
		else if (nc == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NC(info);
		else if (nc == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NC(info);
		else if (nc == Cnd_wms_flg) doCnd_wms_flg_NC(info);
		else if (nc == Cnd_not_wms_flg) doCnd_not_wms_flg_NC(info);
		else if (nc == Cnd_late_ship) doCnd_late_ship_NC(info);
		else if (nc == Cnd_late_rqst) doCnd_late_rqst_NC(info);
		else if (nc == Cnd_pick_not_prnted) doCnd_pick_not_prnted_NC(info);
		else if (nc == Cnd_pick_prnted) doCnd_pick_prnted_NC(info);
		else if (nc == Cnd_inst_not_prnted) doCnd_inst_not_prnted_NC(info);
		else if (nc == Cnd_inst_prnted) doCnd_inst_prnted_NC(info);
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
		else if (nc == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NC(info);
		else if (nc == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_iv_itm_nm) doCnd_iv_itm_nm_NC(info);
		else if (nc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NC(info);
		else if (nc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NC(info);
		else if (nc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NC(info);
		else if (nc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NC(info);
		else if (nc == Cnd_ship_schd_no) doCnd_ship_schd_no_NC(info);
		else if (nc == Cnd_ship_inst_no) doCnd_ship_inst_no_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_inst_rmrks) doCnd_inst_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_can_disp_flg) doCnd_can_disp_flg_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_d_sub_char1) doCnd_d_sub_char1_NC(info);
		else if (nc == Cnd_d_sub_char2) doCnd_d_sub_char2_NC(info);
		else if (nc == Cnd_d_sub_char3) doCnd_d_sub_char3_NC(info);
		else if (nc == BulkSet_indiv_inst_prnt_flg) doBulkSet_indiv_inst_prnt_flg_NC(info);
		else if (nc == BulkSet_indiv_prnt_flg) doBulkSet_indiv_prnt_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_ship_abl_flg) doRslt_ship_abl_flg_NC(info);
		else if (nc == columnRslt_alloc_tgt_flg) doRslt_alloc_tgt_flg_NC(info);
		else if (nc == columnRslt_lot_prop_flg) doRslt_lot_prop_flg_NC(info);
		else if (nc == columnRslt_pack_flg) doRslt_pack_flg_NC(info);
		else if (nc == columnRslt_ship_schd_time) doRslt_ship_schd_time_NC(info);
		else if (nc == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NC(info);
		else if (nc == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NC(info);
		else if (nc == columnRslt_dlv_rqst_tm) doRslt_dlv_rqst_tm_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NC(info);
		else if (nc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NC(info);
		else if (nc == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NC(info);
		else if (nc == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NC(info);
		else if (nc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NC(info);
		else if (nc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NC(info);
		else if (nc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NC(info);
		else if (nc == columnRslt_ship_term_cd) doRslt_ship_term_cd_NC(info);
		else if (nc == columnRslt_ship_term_nm) doRslt_ship_term_nm_NC(info);
		else if (nc == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_NC(info);
		else if (nc == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_NC(info);
		else if (nc == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NC(info);
		else if (nc == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NC(info);
		else if (nc == columnRslt_pick_prnt_flg) doRslt_pick_prnt_flg_NC(info);
		else if (nc == columnRslt_inst_prnt_flg) doRslt_inst_prnt_flg_NC(info);
		else if (nc == columnRslt_dlv_prnt_flg) doRslt_dlv_prnt_flg_NC(info);
		else if (nc == columnRslt_adv_prnt_flg) doRslt_adv_prnt_flg_NC(info);
		else if (nc == columnRslt_num_of_details) doRslt_num_of_details_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NC(info);
		else if (nc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NC(info);
		else if (nc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NC(info);
		else if (nc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NC(info);
		else if (nc == columnRslt_ship_block_flg) doRslt_ship_block_flg_NC(info);
		else if (nc == columnRslt_pd_inst_dlv_dt) doRslt_pd_inst_dlv_dt_NC(info);
		else if (nc == columnRslt_pd_inst_dlv_hm) doRslt_pd_inst_dlv_hm_NC(info);
		else if (nc == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NC(info);
		else if (nc == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_dt) doRslt_ship_rqst_dt_NC(info);
		else if (nc == columnRslt_ship_rqst_hm) doRslt_ship_rqst_hm_NC(info);
		else if (nc == columnRslt_assort_typ) doRslt_assort_typ_NC(info);
		else if (nc == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_NC(info);
		else if (nc == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NC(info);
		else if (nc == columnRslt_alloc_typ) doRslt_alloc_typ_NC(info);
		else if (nc == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_grp_alloc_flg) doRslt_grp_alloc_flg_NC(info);
		else if (nc == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NC(info);
		else if (nc == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NC(info);
		else if (nc == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_NC(info);
		else if (nc == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_NC(info);
		else if (nc == columnRslt_ship_str_ln_cd_none_flg) doRslt_ship_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
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
		else if (nc == columnRslt_ship_wt) doRslt_ship_wt_NC(info);
		else if (nc == columnRslt_ship_dim) doRslt_ship_dim_NC(info);
		else if (nc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NC(info);
		else if (nc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NC(info);
		else if (nc == columnRslt_base_ac_dt) doRslt_base_ac_dt_NC(info);
		else if (nc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_inst_rmrks) doRslt_inst_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_d_sub_char1) doRslt_d_sub_char1_NC(info);
		else if (nc == columnRslt_d_sub_char2) doRslt_d_sub_char2_NC(info);
		else if (nc == columnRslt_d_sub_char3) doRslt_d_sub_char3_NC(info);
		else if (nc == columnRslt_ship_schd_no) doRslt_ship_schd_no_NC(info);
		else if (nc == columnRslt_ship_inst_no) doRslt_ship_inst_no_NC(info);
		else if (nc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NC(info);
		else if (nc == columnRslt_wms_flg) doRslt_wms_flg_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NC(info);
		else if (nc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NC(info);
		else if (nc == columnRslt_act_split_flg) doRslt_act_split_flg_NC(info);
		else if (nc == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_NC(info);
		else if (nc == columnRslt_pick_prnted_flg) doRslt_pick_prnted_flg_NC(info);
		else if (nc == columnRslt_inst_prnted_flg) doRslt_inst_prnted_flg_NC(info);
		else if (nc == columnRslt_dlv_prnted_flg) doRslt_dlv_prnted_flg_NC(info);
		else if (nc == columnRslt_adv_prnted_flg) doRslt_adv_prnted_flg_NC(info);
		else if (nc == columnRslt_pack_disable_flg) doRslt_pack_disable_flg_NC(info);
		else if (nc == columnRslt_non_dlv_prnt_flg) doRslt_non_dlv_prnt_flg_NC(info);
		else if (nc == columnRslt_non_adv_prnt_flg) doRslt_non_adv_prnt_flg_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ship_inst_upd_cntr) doRslt_ship_inst_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_list_no) doRslt_list_no_NC(info);
		else if (nc == columnDtl_list_no) doDtl_list_no_NC(info);
		else if (nc == columnDtl_ship_schd_no) doDtl_ship_schd_no_NC(info);
		else if (nc == columnDtl_ship_schd_upd_cntr) doDtl_ship_schd_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[disp_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[uninst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_uninst_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[p_ship]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_p_ship_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[late_ship]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_late_ship_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[late_rqst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_late_rqst_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pick_not_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pick_not_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pick_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pick_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_not_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_not_prnted_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_prnted]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_prnted_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_disp_flg_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[indiv_inst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_inst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_prnt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_abl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_abl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_prop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_prop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_tm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pick_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pick_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_prnt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[num_of_details]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_num_of_details_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_hm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_alloc_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dim_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_split_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_split_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pick_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pick_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_prnted_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_disable_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_disable_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_adv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_adv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[list_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_disp_unit_Group) doCnd_disp_unit_NE(info);
		else if (ne == Cnd_uninst) doCnd_uninst_NE(info);
		else if (ne == Cnd_inst) doCnd_inst_NE(info);
		else if (ne == Cnd_p_ship) doCnd_p_ship_NE(info);
		else if (ne == Cnd_ship) doCnd_ship_NE(info);
		else if (ne == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NE(info);
		else if (ne == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NE(info);
		else if (ne == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NE(info);
		else if (ne == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NE(info);
		else if (ne == Cnd_wms_flg) doCnd_wms_flg_NE(info);
		else if (ne == Cnd_not_wms_flg) doCnd_not_wms_flg_NE(info);
		else if (ne == Cnd_late_ship) doCnd_late_ship_NE(info);
		else if (ne == Cnd_late_rqst) doCnd_late_rqst_NE(info);
		else if (ne == Cnd_pick_not_prnted) doCnd_pick_not_prnted_NE(info);
		else if (ne == Cnd_pick_prnted) doCnd_pick_prnted_NE(info);
		else if (ne == Cnd_inst_not_prnted) doCnd_inst_not_prnted_NE(info);
		else if (ne == Cnd_inst_prnted) doCnd_inst_prnted_NE(info);
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
		else if (ne == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NE(info);
		else if (ne == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_iv_itm_nm) doCnd_iv_itm_nm_NE(info);
		else if (ne == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NE(info);
		else if (ne == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NE(info);
		else if (ne == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NE(info);
		else if (ne == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NE(info);
		else if (ne == Cnd_ship_schd_no) doCnd_ship_schd_no_NE(info);
		else if (ne == Cnd_ship_inst_no) doCnd_ship_inst_no_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_inst_rmrks) doCnd_inst_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_can_disp_flg) doCnd_can_disp_flg_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_d_sub_char1) doCnd_d_sub_char1_NE(info);
		else if (ne == Cnd_d_sub_char2) doCnd_d_sub_char2_NE(info);
		else if (ne == Cnd_d_sub_char3) doCnd_d_sub_char3_NE(info);
		else if (ne == BulkSet_indiv_inst_prnt_flg) doBulkSet_indiv_inst_prnt_flg_NE(info);
		else if (ne == BulkSet_indiv_prnt_flg) doBulkSet_indiv_prnt_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_ship_abl_flg) doRslt_ship_abl_flg_NE(info);
		else if (ne == columnRslt_alloc_tgt_flg) doRslt_alloc_tgt_flg_NE(info);
		else if (ne == columnRslt_lot_prop_flg) doRslt_lot_prop_flg_NE(info);
		else if (ne == columnRslt_pack_flg) doRslt_pack_flg_NE(info);
		else if (ne == columnRslt_ship_schd_time) doRslt_ship_schd_time_NE(info);
		else if (ne == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NE(info);
		else if (ne == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NE(info);
		else if (ne == columnRslt_dlv_rqst_tm) doRslt_dlv_rqst_tm_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NE(info);
		else if (ne == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NE(info);
		else if (ne == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NE(info);
		else if (ne == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NE(info);
		else if (ne == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NE(info);
		else if (ne == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NE(info);
		else if (ne == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NE(info);
		else if (ne == columnRslt_ship_term_cd) doRslt_ship_term_cd_NE(info);
		else if (ne == columnRslt_ship_term_nm) doRslt_ship_term_nm_NE(info);
		else if (ne == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_NE(info);
		else if (ne == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_NE(info);
		else if (ne == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NE(info);
		else if (ne == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NE(info);
		else if (ne == columnRslt_pick_prnt_flg) doRslt_pick_prnt_flg_NE(info);
		else if (ne == columnRslt_inst_prnt_flg) doRslt_inst_prnt_flg_NE(info);
		else if (ne == columnRslt_dlv_prnt_flg) doRslt_dlv_prnt_flg_NE(info);
		else if (ne == columnRslt_adv_prnt_flg) doRslt_adv_prnt_flg_NE(info);
		else if (ne == columnRslt_num_of_details) doRslt_num_of_details_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NE(info);
		else if (ne == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NE(info);
		else if (ne == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NE(info);
		else if (ne == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NE(info);
		else if (ne == columnRslt_ship_block_flg) doRslt_ship_block_flg_NE(info);
		else if (ne == columnRslt_pd_inst_dlv_dt) doRslt_pd_inst_dlv_dt_NE(info);
		else if (ne == columnRslt_pd_inst_dlv_hm) doRslt_pd_inst_dlv_hm_NE(info);
		else if (ne == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NE(info);
		else if (ne == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_dt) doRslt_ship_rqst_dt_NE(info);
		else if (ne == columnRslt_ship_rqst_hm) doRslt_ship_rqst_hm_NE(info);
		else if (ne == columnRslt_assort_typ) doRslt_assort_typ_NE(info);
		else if (ne == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_NE(info);
		else if (ne == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NE(info);
		else if (ne == columnRslt_alloc_typ) doRslt_alloc_typ_NE(info);
		else if (ne == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_grp_alloc_flg) doRslt_grp_alloc_flg_NE(info);
		else if (ne == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NE(info);
		else if (ne == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NE(info);
		else if (ne == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_NE(info);
		else if (ne == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_NE(info);
		else if (ne == columnRslt_ship_str_ln_cd_none_flg) doRslt_ship_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
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
		else if (ne == columnRslt_ship_wt) doRslt_ship_wt_NE(info);
		else if (ne == columnRslt_ship_dim) doRslt_ship_dim_NE(info);
		else if (ne == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NE(info);
		else if (ne == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NE(info);
		else if (ne == columnRslt_base_ac_dt) doRslt_base_ac_dt_NE(info);
		else if (ne == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_inst_rmrks) doRslt_inst_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_d_sub_char1) doRslt_d_sub_char1_NE(info);
		else if (ne == columnRslt_d_sub_char2) doRslt_d_sub_char2_NE(info);
		else if (ne == columnRslt_d_sub_char3) doRslt_d_sub_char3_NE(info);
		else if (ne == columnRslt_ship_schd_no) doRslt_ship_schd_no_NE(info);
		else if (ne == columnRslt_ship_inst_no) doRslt_ship_inst_no_NE(info);
		else if (ne == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NE(info);
		else if (ne == columnRslt_wms_flg) doRslt_wms_flg_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NE(info);
		else if (ne == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NE(info);
		else if (ne == columnRslt_act_split_flg) doRslt_act_split_flg_NE(info);
		else if (ne == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_NE(info);
		else if (ne == columnRslt_pick_prnted_flg) doRslt_pick_prnted_flg_NE(info);
		else if (ne == columnRslt_inst_prnted_flg) doRslt_inst_prnted_flg_NE(info);
		else if (ne == columnRslt_dlv_prnted_flg) doRslt_dlv_prnted_flg_NE(info);
		else if (ne == columnRslt_adv_prnted_flg) doRslt_adv_prnted_flg_NE(info);
		else if (ne == columnRslt_pack_disable_flg) doRslt_pack_disable_flg_NE(info);
		else if (ne == columnRslt_non_dlv_prnt_flg) doRslt_non_dlv_prnt_flg_NE(info);
		else if (ne == columnRslt_non_adv_prnt_flg) doRslt_non_adv_prnt_flg_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ship_inst_upd_cntr) doRslt_ship_inst_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_list_no) doRslt_list_no_NE(info);
		else if (ne == columnDtl_list_no) doDtl_list_no_NE(info);
		else if (ne == columnDtl_ship_schd_no) doDtl_ship_schd_no_NE(info);
		else if (ne == columnDtl_ship_schd_upd_cntr) doDtl_ship_schd_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[disp_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[uninst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_uninst_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[p_ship]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_p_ship_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[late_ship]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_late_ship_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[late_rqst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_late_rqst_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pick_not_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pick_not_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pick_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pick_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_not_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_not_prnted_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_prnted]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_prnted_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_disp_flg_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[indiv_inst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_inst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_prnt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_abl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_abl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_prop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_prop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_tm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pick_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pick_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_prnt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[num_of_details]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_num_of_details_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_hm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_alloc_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dim_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[act_split_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_split_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pick_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pick_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_prnted_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_disable_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_disable_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_adv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_adv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[list_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_disp_unit_Group) doCnd_disp_unit_NX(info);
		else if (nx == Cnd_uninst) doCnd_uninst_NX(info);
		else if (nx == Cnd_inst) doCnd_inst_NX(info);
		else if (nx == Cnd_p_ship) doCnd_p_ship_NX(info);
		else if (nx == Cnd_ship) doCnd_ship_NX(info);
		else if (nx == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NX(info);
		else if (nx == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NX(info);
		else if (nx == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NX(info);
		else if (nx == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NX(info);
		else if (nx == Cnd_wms_flg) doCnd_wms_flg_NX(info);
		else if (nx == Cnd_not_wms_flg) doCnd_not_wms_flg_NX(info);
		else if (nx == Cnd_late_ship) doCnd_late_ship_NX(info);
		else if (nx == Cnd_late_rqst) doCnd_late_rqst_NX(info);
		else if (nx == Cnd_pick_not_prnted) doCnd_pick_not_prnted_NX(info);
		else if (nx == Cnd_pick_prnted) doCnd_pick_prnted_NX(info);
		else if (nx == Cnd_inst_not_prnted) doCnd_inst_not_prnted_NX(info);
		else if (nx == Cnd_inst_prnted) doCnd_inst_prnted_NX(info);
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
		else if (nx == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NX(info);
		else if (nx == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_iv_itm_nm) doCnd_iv_itm_nm_NX(info);
		else if (nx == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NX(info);
		else if (nx == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NX(info);
		else if (nx == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NX(info);
		else if (nx == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NX(info);
		else if (nx == Cnd_ship_schd_no) doCnd_ship_schd_no_NX(info);
		else if (nx == Cnd_ship_inst_no) doCnd_ship_inst_no_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_inst_rmrks) doCnd_inst_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_can_disp_flg) doCnd_can_disp_flg_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_d_sub_char1) doCnd_d_sub_char1_NX(info);
		else if (nx == Cnd_d_sub_char2) doCnd_d_sub_char2_NX(info);
		else if (nx == Cnd_d_sub_char3) doCnd_d_sub_char3_NX(info);
		else if (nx == BulkSet_indiv_inst_prnt_flg) doBulkSet_indiv_inst_prnt_flg_NX(info);
		else if (nx == BulkSet_indiv_prnt_flg) doBulkSet_indiv_prnt_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_ship_abl_flg) doRslt_ship_abl_flg_NX(info);
		else if (nx == columnRslt_alloc_tgt_flg) doRslt_alloc_tgt_flg_NX(info);
		else if (nx == columnRslt_lot_prop_flg) doRslt_lot_prop_flg_NX(info);
		else if (nx == columnRslt_pack_flg) doRslt_pack_flg_NX(info);
		else if (nx == columnRslt_ship_schd_time) doRslt_ship_schd_time_NX(info);
		else if (nx == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NX(info);
		else if (nx == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NX(info);
		else if (nx == columnRslt_dlv_rqst_tm) doRslt_dlv_rqst_tm_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NX(info);
		else if (nx == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NX(info);
		else if (nx == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NX(info);
		else if (nx == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NX(info);
		else if (nx == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NX(info);
		else if (nx == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NX(info);
		else if (nx == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NX(info);
		else if (nx == columnRslt_ship_term_cd) doRslt_ship_term_cd_NX(info);
		else if (nx == columnRslt_ship_term_nm) doRslt_ship_term_nm_NX(info);
		else if (nx == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_NX(info);
		else if (nx == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_NX(info);
		else if (nx == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NX(info);
		else if (nx == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NX(info);
		else if (nx == columnRslt_pick_prnt_flg) doRslt_pick_prnt_flg_NX(info);
		else if (nx == columnRslt_inst_prnt_flg) doRslt_inst_prnt_flg_NX(info);
		else if (nx == columnRslt_dlv_prnt_flg) doRslt_dlv_prnt_flg_NX(info);
		else if (nx == columnRslt_adv_prnt_flg) doRslt_adv_prnt_flg_NX(info);
		else if (nx == columnRslt_num_of_details) doRslt_num_of_details_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NX(info);
		else if (nx == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NX(info);
		else if (nx == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NX(info);
		else if (nx == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NX(info);
		else if (nx == columnRslt_ship_block_flg) doRslt_ship_block_flg_NX(info);
		else if (nx == columnRslt_pd_inst_dlv_dt) doRslt_pd_inst_dlv_dt_NX(info);
		else if (nx == columnRslt_pd_inst_dlv_hm) doRslt_pd_inst_dlv_hm_NX(info);
		else if (nx == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NX(info);
		else if (nx == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_dt) doRslt_ship_rqst_dt_NX(info);
		else if (nx == columnRslt_ship_rqst_hm) doRslt_ship_rqst_hm_NX(info);
		else if (nx == columnRslt_assort_typ) doRslt_assort_typ_NX(info);
		else if (nx == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_NX(info);
		else if (nx == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NX(info);
		else if (nx == columnRslt_alloc_typ) doRslt_alloc_typ_NX(info);
		else if (nx == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_grp_alloc_flg) doRslt_grp_alloc_flg_NX(info);
		else if (nx == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NX(info);
		else if (nx == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NX(info);
		else if (nx == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_NX(info);
		else if (nx == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_NX(info);
		else if (nx == columnRslt_ship_str_ln_cd_none_flg) doRslt_ship_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
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
		else if (nx == columnRslt_ship_wt) doRslt_ship_wt_NX(info);
		else if (nx == columnRslt_ship_dim) doRslt_ship_dim_NX(info);
		else if (nx == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NX(info);
		else if (nx == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NX(info);
		else if (nx == columnRslt_base_ac_dt) doRslt_base_ac_dt_NX(info);
		else if (nx == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_inst_rmrks) doRslt_inst_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_d_sub_char1) doRslt_d_sub_char1_NX(info);
		else if (nx == columnRslt_d_sub_char2) doRslt_d_sub_char2_NX(info);
		else if (nx == columnRslt_d_sub_char3) doRslt_d_sub_char3_NX(info);
		else if (nx == columnRslt_ship_schd_no) doRslt_ship_schd_no_NX(info);
		else if (nx == columnRslt_ship_inst_no) doRslt_ship_inst_no_NX(info);
		else if (nx == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NX(info);
		else if (nx == columnRslt_wms_flg) doRslt_wms_flg_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NX(info);
		else if (nx == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NX(info);
		else if (nx == columnRslt_act_split_flg) doRslt_act_split_flg_NX(info);
		else if (nx == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_NX(info);
		else if (nx == columnRslt_pick_prnted_flg) doRslt_pick_prnted_flg_NX(info);
		else if (nx == columnRslt_inst_prnted_flg) doRslt_inst_prnted_flg_NX(info);
		else if (nx == columnRslt_dlv_prnted_flg) doRslt_dlv_prnted_flg_NX(info);
		else if (nx == columnRslt_adv_prnted_flg) doRslt_adv_prnted_flg_NX(info);
		else if (nx == columnRslt_pack_disable_flg) doRslt_pack_disable_flg_NX(info);
		else if (nx == columnRslt_non_dlv_prnt_flg) doRslt_non_dlv_prnt_flg_NX(info);
		else if (nx == columnRslt_non_adv_prnt_flg) doRslt_non_adv_prnt_flg_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ship_inst_upd_cntr) doRslt_ship_inst_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_list_no) doRslt_list_no_NX(info);
		else if (nx == columnDtl_list_no) doDtl_list_no_NX(info);
		else if (nx == columnDtl_ship_schd_no) doDtl_ship_schd_no_NX(info);
		else if (nx == columnDtl_ship_schd_upd_cntr) doDtl_ship_schd_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[disp_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[uninst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_uninst_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[p_ship]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_p_ship_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[late_ship]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_late_ship_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[late_rqst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_late_rqst_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pick_not_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pick_not_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pick_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pick_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_not_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_not_prnted_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_prnted]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_prnted_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_disp_flg_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[indiv_inst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_inst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_indiv_prnt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_abl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_abl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_prop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_prop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_tm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pick_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pick_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_prnt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[num_of_details]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_num_of_details_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_hm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_alloc_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dim_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[act_split_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_split_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pick_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pick_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_prnted_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_disable_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_disable_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_adv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_adv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[list_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_upd_cntr_NX(MCEventInfo info){
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
		else if (lc == Cnd_ship_wk_cd) doCnd_ship_wk_cd_LC(info);
		else if (lc == Cnd_ship_wk_nm) doCnd_ship_wk_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_iv_itm_nm) doCnd_iv_itm_nm_LC(info);
		else if (lc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_LC(info);
		else if (lc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_LC(info);
		else if (lc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_LC(info);
		else if (lc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_LC(info);
		else if (lc == Cnd_ship_schd_no) doCnd_ship_schd_no_LC(info);
		else if (lc == Cnd_ship_inst_no) doCnd_ship_inst_no_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_xfr_schd_no) doCnd_xfr_schd_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_inst_rmrks) doCnd_inst_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_d_sub_char1) doCnd_d_sub_char1_LC(info);
		else if (lc == Cnd_d_sub_char2) doCnd_d_sub_char2_LC(info);
		else if (lc == Cnd_d_sub_char3) doCnd_d_sub_char3_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_ship_schd_time) doRslt_ship_schd_time_LC(info);
		else if (lc == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_LC(info);
		else if (lc == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_LC(info);
		else if (lc == columnRslt_dlv_rqst_tm) doRslt_dlv_rqst_tm_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_LC(info);
		else if (lc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_LC(info);
		else if (lc == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_LC(info);
		else if (lc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_LC(info);
		else if (lc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_LC(info);
		else if (lc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_LC(info);
		else if (lc == columnRslt_ship_term_cd) doRslt_ship_term_cd_LC(info);
		else if (lc == columnRslt_ship_term_nm) doRslt_ship_term_nm_LC(info);
		else if (lc == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_LC(info);
		else if (lc == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_LC(info);
		else if (lc == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_LC(info);
		else if (lc == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_LC(info);
		else if (lc == columnRslt_num_of_details) doRslt_num_of_details_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_LC(info);
		else if (lc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_LC(info);
		else if (lc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_LC(info);
		else if (lc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_LC(info);
		else if (lc == columnRslt_pd_inst_dlv_dt) doRslt_pd_inst_dlv_dt_LC(info);
		else if (lc == columnRslt_pd_inst_dlv_hm) doRslt_pd_inst_dlv_hm_LC(info);
		else if (lc == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_LC(info);
		else if (lc == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_dt) doRslt_ship_rqst_dt_LC(info);
		else if (lc == columnRslt_ship_rqst_hm) doRslt_ship_rqst_hm_LC(info);
		else if (lc == columnRslt_assort_typ) doRslt_assort_typ_LC(info);
		else if (lc == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_LC(info);
		else if (lc == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_LC(info);
		else if (lc == columnRslt_alloc_typ) doRslt_alloc_typ_LC(info);
		else if (lc == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_LC(info);
		else if (lc == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_LC(info);
		else if (lc == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_LC(info);
		else if (lc == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_LC(info);
		else if (lc == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
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
		else if (lc == columnRslt_ship_wt) doRslt_ship_wt_LC(info);
		else if (lc == columnRslt_ship_dim) doRslt_ship_dim_LC(info);
		else if (lc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_LC(info);
		else if (lc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_LC(info);
		else if (lc == columnRslt_base_ac_dt) doRslt_base_ac_dt_LC(info);
		else if (lc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_inst_rmrks) doRslt_inst_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_d_sub_char1) doRslt_d_sub_char1_LC(info);
		else if (lc == columnRslt_d_sub_char2) doRslt_d_sub_char2_LC(info);
		else if (lc == columnRslt_d_sub_char3) doRslt_d_sub_char3_LC(info);
		else if (lc == columnRslt_ship_schd_no) doRslt_ship_schd_no_LC(info);
		else if (lc == columnRslt_ship_inst_no) doRslt_ship_inst_no_LC(info);
		else if (lc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_LC(info);
		else if (lc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_LC(info);
		else if (lc == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ship_inst_upd_cntr) doRslt_ship_inst_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnRslt_list_no) doRslt_list_no_LC(info);
		else if (lc == columnDtl_list_no) doDtl_list_no_LC(info);
		else if (lc == columnDtl_ship_schd_no) doDtl_ship_schd_no_LC(info);
		else if (lc == columnDtl_ship_schd_upd_cntr) doDtl_ship_schd_upd_cntr_LC(info);
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
	 * [Cnd]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_schd_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_tm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[num_of_details]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_num_of_details_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pd_inst_dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pd_inst_dlv_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pd_inst_dlv_hm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dim_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[list_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_ship_wk_cd]の作成メソッド
	 */
	public MCList getCnd_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
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
	 * コンボ／リストのリスト[Cnd_inst_usr_cd]の作成メソッド
	 */
	public MCList getCnd_inst_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inst_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_inst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_wk_cd]の作成メソッド
	 */
	public MCList getRslt_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1410.Srch01")) {
			return new MS_MSBEL1410_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1410.Ins01")) {
			return new MS_MSBEL1410_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL1410.Del01")) {
			return new MS_MSBEL1410_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1410.Prnt01")) {
			return new MS_MSBEL1410_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1410_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1410_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1410_Srch01Bridge() {
			p_MS_MSBEL1410_Srch01 = new MCParam(PDef.MS_MSBEL1410_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1410_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1410.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.DtlR.class));

			p_MS_MSBEL1410_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1410_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1410_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1410_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1410_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1410.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1410.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1410.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1410_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
			p_MS_MSBEL1410_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1410_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)p_MS_MSBEL1410_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1410.DtlR>)p_MS_MSBEL1410_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBEL1410_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1410_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL1410_Ins01Bridge() {
			p_MS_MSBEL1410_Ins01 = new MCParam(PDef.MS_MSBEL1410_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1410_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1410.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));

			p_MS_MSBEL1410_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1410_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1410_Ins01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1410_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1410_Ins01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1410_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1410_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1410.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1410.BulkSetR up2() {
			return (mcframe.clientMSBE.MSBEP1410.BulkSetR)up(2);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1410_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1410_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)p_MS_MSBEL1410_Ins01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1410_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1410_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1410_Del01Bridge() {
			p_MS_MSBEL1410_Del01 = new MCParam(PDef.MS_MSBEL1410_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1410_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1410.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));

			p_MS_MSBEL1410_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1410_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1410_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1410_Del01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1410_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1410_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1410.BulkSetR up1() {
			return (mcframe.clientMSBE.MSBEP1410.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1410_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1410_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)p_MS_MSBEL1410_Del01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MS_MSBEL1410_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1410_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1410_Prnt01Bridge() {
			p_MS_MSBEL1410_Prnt01 = new MCParam(PDef.MS_MSBEL1410_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1410_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1410.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));

			p_MS_MSBEL1410_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1410_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1410_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1410_Prnt01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1410_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1410_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1410.BulkSetR up1() {
			return (mcframe.clientMSBE.MSBEP1410.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1410.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1410_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1410.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1410_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1410.RsltR>)p_MS_MSBEL1410_Prnt01.getContainerParam().getDownBlock(0));
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