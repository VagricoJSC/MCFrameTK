package mcframe.clientMSBE.MSBEP1770;

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
import mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch_MC.MS_MSBEL1770_Srch01Caller;
import mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch_MC.MS_MSBEL1770_Prnt01Caller;
import mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch_MC.MS_MSBEL1770_Prnt02Caller;

/**
 * 画面"MSBEP_IvSrch"パネルクラスです。<p>
 *
 * インボイス情報、インボイスに紐づく出荷指図、出荷実績、売上実績を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_IvSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1770";

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
	// [ExIm]ブロック関連のField定義
	public MCPanel ExImPanel = null;
	public MCTitledBorder ExImTitledBorder = null;
	// [ExIm]ブロックの項目のField定義
	// [PurcIm]ブロック関連のField定義
	public MCPanel PurcImPanel = null;
	public MCTitledBorder PurcImTitledBorder = null;
	// [PurcIm]ブロックの項目のField定義
	// [IvReg]ブロック関連のField定義
	public MCPanel IvRegPanel = null;
	public MCTitledBorder IvRegTitledBorder = null;
	// [IvReg]ブロックの項目のField定義
	// [PlReg]ブロック関連のField定義
	public MCPanel PlRegPanel = null;
	public MCTitledBorder PlRegTitledBorder = null;
	// [PlReg]ブロックの項目のField定義
	// [IvPrnt]ブロック関連のField定義
	public MCPanel IvPrntPanel = null;
	public MCTitledBorder IvPrntTitledBorder = null;
	// [IvPrnt]ブロックの項目のField定義
	// [PlPrnt]ブロック関連のField定義
	public MCPanel PlPrntPanel = null;
	public MCTitledBorder PlPrntTitledBorder = null;
	// [PlPrnt]ブロックの項目のField定義
	// [PrSts]ブロック関連のField定義
	public MCPanel PrStsPanel = null;
	public MCTitledBorder PrStsTitledBorder = null;
	// [PrSts]ブロックの項目のField定義
	// [IvIm]ブロック関連のField定義
	public MCPanel IvImPanel = null;
	public MCTitledBorder IvImTitledBorder = null;
	// [IvIm]ブロックの項目のField定義
	// [SlsCststk]ブロック関連のField定義
	public MCPanel SlsCststkPanel = null;
	public MCTitledBorder SlsCststkTitledBorder = null;
	// [SlsCststk]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * REF,View,3;PRNT,Issue report,4 REF,参照する,3;PRNT,帳票発行する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	/**
	 * HDR,Header,0;DTL,Details,1;SHIP_INST,I/V Shipping order,2;SHIP_ACT,I/V Shipping result,3;SLS_ACT,I/V Sales result,4 HDR,ヘッダ,0;DTL,明細,1;SHIP_INST,Ｉ／Ｖ出荷指図,2;SHIP_ACT,Ｉ／Ｖ出荷実績,3;SLS_ACT,Ｉ／Ｖ売上実績,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_srch_mode_Group = null;
	public MCRadioButton Cnd_srch_mode_HDR = null;
	public MCRadioButton Cnd_srch_mode_DTL = null;
	public MCRadioButton Cnd_srch_mode_SHIP_INST = null;
	public MCRadioButton Cnd_srch_mode_SHIP_ACT = null;
	public MCRadioButton Cnd_srch_mode_SLS_ACT = null;
	/**
	 * Export status_uncompleted 輸出状況_未完了.<p>
	 *
	 */
	public MCCheckBox Cnd_ex_im_not_comp_flg = null;
	/**
	 * Export status_completed 輸出状況_完了.<p>
	 *
	 */
	public MCCheckBox Cnd_ex_im_comp_flg = null;
	/**
	 * Purchase status_uncompleted 仕入状況_未完了.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_im_not_comp_flg = null;
	/**
	 * Purchase status_ completed 仕入状況_完了.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_im_comp_flg = null;
	/**
	 * Invoice not-entered インボイス未登録.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_not_reg_flg = null;
	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_reg_flg = null;
	/**
	 * Packing list not-entered パッキングリスト未登録.<p>
	 *
	 */
	public MCCheckBox Cnd_pl_not_reg_flg = null;
	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public MCCheckBox Cnd_pl_reg_flg = null;
	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public MCCheckBox Cnd_pl_skip_flg = null;
	/**
	 * Invoice unissued インボイス未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_prnt_yet_flg = null;
	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_prnt_done_flg = null;
	/**
	 * Packing list unissued パッキングリスト未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_pl_prnt_yet_flg = null;
	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_pl_prnt_done_flg = null;
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public MCCheckBox Cnd_not_iv_flg = null;
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public MCCheckBox Cnd_not_inst_flg = null;
	/**
	 * Partially ordered 一部指図.<p>
	 *
	 */
	public MCCheckBox Cnd_part_inst_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_flg = null;
	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ship_flg = null;
	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public MCCheckBox Cnd_part_ship_flg = null;
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_flg = null;
	/**
	 * Unsold 未売上.<p>
	 *
	 */
	public MCCheckBox Cnd_not_sls_flg = null;
	/**
	 * Sold 売上済.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_comp_flg = null;
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_not_comp_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_comp_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_cststk_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_cststk_invalid_flg = null;
	public MCLabel Cnd_iv_dt_fr_Label = null;
	/**
	 * Invoice date FROM インボイス日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_iv_dt_fr = null;
	public MCLabel Cnd_iv_dt_to_Label = null;
	/**
	 * Invoice date TO インボイス日付ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_iv_dt_to = null;
	public MCLabel Cnd_cmpl_schd_dt_fr_Label = null;
	/**
	 * Scheduled completion date FROM 完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_cmpl_schd_dt_fr = null;
	public MCLabel Cnd_cmpl_schd_dt_to_Label = null;
	/**
	 * Scheduled completion date TO 完了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_cmpl_schd_dt_to = null;
	public MCLabel Cnd_cmpl_dt_fr_Label = null;
	/**
	 * Completion date FROM 完了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_cmpl_dt_fr = null;
	public MCLabel Cnd_cmpl_dt_to_Label = null;
	/**
	 * Completion date TO 完了日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_cmpl_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_rqst_dt_p_PPanel;
	public MCDateField Cnd_dlv_rqst_dt_fr;	// [Cnd]の[dlv_rqst_dt_p.ymd_fr]を[Cnd_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_fr;	// [Cnd]の[dlv_rqst_dt_p.hm_fr]を[Cnd_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_dt_to;	// [Cnd]の[dlv_rqst_dt_p.ymd_to]を[Cnd_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_to;	// [Cnd]の[dlv_rqst_dt_p.hm_to]を[Cnd_dlv_rqst_hm_to]としてエイリアス定義。
	public MCLabel Cnd_ship_fr_lg_grp_cd_Label = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_ship_fr_lg_grp_nm = null;
	public MCLabel Cnd_tdlv_cd_Label = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCTextField Cnd_tdlv_nm = null;
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
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_nm = null;
	public MCLabel Cnd_ship_rqst_id_typ_Label = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_typ_nm = null;
	public MCLabel Cnd_ship_rqst_id_cd_Label = null;
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_cd = null;
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_nm = null;
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
	public MCLabel Cnd_ship_rqst_no_Label = null;
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_no = null;
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
	public MCLabel Cnd_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_no = null;
	public MCLabel Cnd_ship_inst_no_Label = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_inst_no = null;
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
	public MCLabel Cnd_ship_loc_cd_Label = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCTextField Cnd_ship_loc_nm = null;
	public MCLabel Cnd_ship_site_cd_Label = null;
	/**
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_site_cd = null;
	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_ship_site_nm = null;
	public MCLabel Cnd_iv_rmrks_Label = null;
	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public MCTextField Cnd_iv_rmrks = null;
	public MCLabel Cnd_iv_d_rmrks_Label = null;
	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public MCTextField Cnd_iv_d_rmrks = null;
	public MCLabel Cnd_pl_rmrks_Label = null;
	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public MCTextField Cnd_pl_rmrks = null;
	public MCLabel Cnd_iv_intr_rmrks_Label = null;
	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public MCTextField Cnd_iv_intr_rmrks = null;
	public MCLabel Cnd_iv_d_intr_rmrks_Label = null;
	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public MCTextField Cnd_iv_d_intr_rmrks = null;
	public MCLabel Cnd_iv_sub_char1_Label = null;
	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public MCTextField Cnd_iv_sub_char1 = null;
	public MCLabel Cnd_iv_sub_char2_Label = null;
	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public MCTextField Cnd_iv_sub_char2 = null;
	public MCLabel Cnd_iv_sub_char3_Label = null;
	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public MCTextField Cnd_iv_sub_char3 = null;
	public MCLabel Cnd_iv_d_sub_char1_Label = null;
	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_iv_d_sub_char1 = null;
	public MCLabel Cnd_iv_d_sub_char2_Label = null;
	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_iv_d_sub_char2 = null;
	public MCLabel Cnd_iv_d_sub_char3_Label = null;
	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_iv_d_sub_char3 = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_past_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_ship_rqst_id_grp_p_PPanel;
	public MCLabel Cnd_ship_rqst_id_grp_lab1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab1]を[Cnd_ship_rqst_id_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg1]を[Cnd_ship_rqst_id_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd1]を[Cnd_ship_rqst_id_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm1]を[Cnd_ship_rqst_id_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab2]を[Cnd_ship_rqst_id_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg2]を[Cnd_ship_rqst_id_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd2]を[Cnd_ship_rqst_id_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm2]を[Cnd_ship_rqst_id_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab3]を[Cnd_ship_rqst_id_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg3]を[Cnd_ship_rqst_id_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd3]を[Cnd_ship_rqst_id_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm3]を[Cnd_ship_rqst_id_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab4]を[Cnd_ship_rqst_id_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg4]を[Cnd_ship_rqst_id_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd4]を[Cnd_ship_rqst_id_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm4]を[Cnd_ship_rqst_id_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab5]を[Cnd_ship_rqst_id_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg5]を[Cnd_ship_rqst_id_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd5]を[Cnd_ship_rqst_id_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm5]を[Cnd_ship_rqst_id_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab6]を[Cnd_ship_rqst_id_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg6]を[Cnd_ship_rqst_id_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd6]を[Cnd_ship_rqst_id_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm6]を[Cnd_ship_rqst_id_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab7]を[Cnd_ship_rqst_id_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg7]を[Cnd_ship_rqst_id_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd7]を[Cnd_ship_rqst_id_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm7]を[Cnd_ship_rqst_id_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab8]を[Cnd_ship_rqst_id_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg8]を[Cnd_ship_rqst_id_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd8]を[Cnd_ship_rqst_id_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm8]を[Cnd_ship_rqst_id_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab9]を[Cnd_ship_rqst_id_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg9]を[Cnd_ship_rqst_id_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd9]を[Cnd_ship_rqst_id_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm9]を[Cnd_ship_rqst_id_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab10]を[Cnd_ship_rqst_id_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg10]を[Cnd_ship_rqst_id_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd10]を[Cnd_ship_rqst_id_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm10]を[Cnd_ship_rqst_id_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_dlv_id_grp_p_PPanel;
	public MCLabel Cnd_dlv_id_grp_lab1;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab1]を[Cnd_dlv_id_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg1;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg1]を[Cnd_dlv_id_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd1;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd1]を[Cnd_dlv_id_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm1;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm1]を[Cnd_dlv_id_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab2;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab2]を[Cnd_dlv_id_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg2;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg2]を[Cnd_dlv_id_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd2;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd2]を[Cnd_dlv_id_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm2;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm2]を[Cnd_dlv_id_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab3;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab3]を[Cnd_dlv_id_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg3;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg3]を[Cnd_dlv_id_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd3;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd3]を[Cnd_dlv_id_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm3;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm3]を[Cnd_dlv_id_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab4;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab4]を[Cnd_dlv_id_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg4;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg4]を[Cnd_dlv_id_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd4;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd4]を[Cnd_dlv_id_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm4;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm4]を[Cnd_dlv_id_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab5;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab5]を[Cnd_dlv_id_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg5;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg5]を[Cnd_dlv_id_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd5;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd5]を[Cnd_dlv_id_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm5;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm5]を[Cnd_dlv_id_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab6;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab6]を[Cnd_dlv_id_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg6;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg6]を[Cnd_dlv_id_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd6;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd6]を[Cnd_dlv_id_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm6;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm6]を[Cnd_dlv_id_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab7;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab7]を[Cnd_dlv_id_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg7;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg7]を[Cnd_dlv_id_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd7;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd7]を[Cnd_dlv_id_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm7;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm7]を[Cnd_dlv_id_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab8;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab8]を[Cnd_dlv_id_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg8;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg8]を[Cnd_dlv_id_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd8;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd8]を[Cnd_dlv_id_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm8;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm8]を[Cnd_dlv_id_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab9;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab9]を[Cnd_dlv_id_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg9;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg9]を[Cnd_dlv_id_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd9;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd9]を[Cnd_dlv_id_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm9;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm9]を[Cnd_dlv_id_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_dlv_id_grp_lab10;	// [Cnd]の[dlv_id_grp_p.bp_grp_lab10]を[Cnd_dlv_id_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_id_grp_flg10;	// [Cnd]の[dlv_id_grp_p.bp_grp_flg10]を[Cnd_dlv_id_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_id_grp_cd10;	// [Cnd]の[dlv_id_grp_p.bp_grp_cd10]を[Cnd_dlv_id_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_dlv_id_grp_nm10;	// [Cnd]の[dlv_id_grp_p.bp_grp_nm10]を[Cnd_dlv_id_grp_nm10]としてエイリアス定義。
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
	// [ShipRqstIdCnd]ブロック関連のField定義
	public MCPanel ShipRqstIdCndPanel = null;
	// [ShipRqstIdCnd]ブロックの項目のField定義
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBE.MSBEP1770.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pl_skip_flg = null;
	/**
	 * Exported 輸出済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ex_im_comp_flg = null;
	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_cmpl_flg = null;
	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_ship_flg = null;
	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_prnt_flg = null;
	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pl_prnt_flg = null;
	/**
	 * Invoice transaction completed インボイス取引完了.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_comp_flg = null;
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_rev = null;
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_no = null;
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_mng_no = null;
	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cmpl_schd_dt = null;
	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_schd_dt = null;
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cmpl_dt = null;
	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_dt = null;
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_cststk_flg = null;
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
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_dlv_p_PPanel;
	public MCColumnConfig columnRslt_dlv_id_cd;// [Rslt]の[dlv_p.bp_cd]を[columnRslt_dlv_id_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_nm;// [Rslt]の[dlv_p.bp_nm]を[columnRslt_dlv_id_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_sundry_flg;// [Rslt]の[dlv_p.dlv_sundry_flg]を[columnRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_pri_prnt_flg;// [Rslt]の[dlv_p.pri_prnt_flg]を[columnRslt_dlv_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_lg_grp_cd;// [Rslt]の[dlv_p.lg_grp_cd]を[columnRslt_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_lg_grp_nm;// [Rslt]の[dlv_p.lg_grp_nm]を[columnRslt_dlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntry_cd;// [Rslt]の[dlv_p.cntry_cd]を[columnRslt_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntry_nm;// [Rslt]の[dlv_p.cntry_nm]を[columnRslt_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_zip_cd;// [Rslt]の[dlv_p.zip_cd]を[columnRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr1;// [Rslt]の[dlv_p.addr1]を[columnRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr2;// [Rslt]の[dlv_p.addr2]を[columnRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr3;// [Rslt]の[dlv_p.addr3]を[columnRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr4;// [Rslt]の[dlv_p.addr4]を[columnRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_tel;// [Rslt]の[dlv_p.tel]を[columnRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_fax;// [Rslt]の[dlv_p.fax]を[columnRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_dpt;// [Rslt]の[dlv_p.dlv_cntct_dpt]を[columnRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_psn;// [Rslt]の[dlv_p.dlv_cntct_psn]を[columnRslt_dlv_cntct_psn]としてエイリアス定義。
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_typ_nm = null;
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_cd = null;
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_nm = null;
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
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_tdlv_p_PPanel;
	public MCColumnConfig columnRslt_show_dtl;// [Rslt]の[tdlv_p.show_dtl]を[columnRslt_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cd;// [Rslt]の[tdlv_p.bp_cd]を[columnRslt_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_nm;// [Rslt]の[tdlv_p.bp_nm]を[columnRslt_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_sundry_flg;// [Rslt]の[tdlv_p.dlv_sundry_flg]を[columnRslt_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_pri_prnt_flg;// [Rslt]の[tdlv_p.pri_prnt_flg]を[columnRslt_tdlv_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_lg_grp_cd;// [Rslt]の[tdlv_p.lg_grp_cd]を[columnRslt_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_lg_grp_nm;// [Rslt]の[tdlv_p.lg_grp_nm]を[columnRslt_tdlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntry_cd;// [Rslt]の[tdlv_p.cntry_cd]を[columnRslt_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntry_nm;// [Rslt]の[tdlv_p.cntry_nm]を[columnRslt_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_zip_cd;// [Rslt]の[tdlv_p.zip_cd]を[columnRslt_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr1;// [Rslt]の[tdlv_p.addr1]を[columnRslt_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr2;// [Rslt]の[tdlv_p.addr2]を[columnRslt_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr3;// [Rslt]の[tdlv_p.addr3]を[columnRslt_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr4;// [Rslt]の[tdlv_p.addr4]を[columnRslt_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_tel;// [Rslt]の[tdlv_p.tel]を[columnRslt_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_fax;// [Rslt]の[tdlv_p.fax]を[columnRslt_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntct_dpt;// [Rslt]の[tdlv_p.dlv_cntct_dpt]を[columnRslt_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntct_psn;// [Rslt]の[tdlv_p.dlv_cntct_psn]を[columnRslt_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_cd = null;
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_nm = null;
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vssl_flght = null;
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_cd = null;
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_nm = null;
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_etd_dt = null;
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_cd = null;
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_nm = null;
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_eta_dt = null;
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_cd = null;
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_nm = null;
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_schd_dt = null;
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd1 = null;
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm1 = null;
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks1 = null;
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd2 = null;
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm2 = null;
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks2 = null;
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
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_inpt_flg = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_inpt_flg = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_trd_cur_amt;// [Rslt]の[ttl_trd_cur_amt_p.amt]を[columnRslt_ttl_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_trd_cur_inc_tax_amt;// [Rslt]の[ttl_trd_cur_inc_tax_amt_p.amt]を[columnRslt_ttl_trd_cur_inc_tax_amt]としてエイリアス定義。
	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl_net_wt = null;
	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl_grss_wt = null;
	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl_dim = null;
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd3 = null;
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm3 = null;
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks3 = null;
	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_case_mrk1 = null;
	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_case_mrk2 = null;
	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_case_mrk3 = null;
	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_case_mrk4 = null;
	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_case_mrk5 = null;
	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_case_mrk6 = null;
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
	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lc_no = null;
	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lc_dt = null;
	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lc_rmrks = null;
	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bl_no = null;
	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bl_dt = null;
	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bl_rmrks = null;
	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_rmrks = null;
	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pl_reg_flg = null;
	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pl_rmrks = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Purchase invoice temporary entry 受領インボイス仮登録.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_rcpt_iv_flg = null;
	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_reg_flg = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_mng_no = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_no = null;
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_cmpl_flg = null;
	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_intr_rmrks = null;
	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_sub_char1 = null;
	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_sub_char2 = null;
	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_sub_char3 = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_d_no = null;
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
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_no = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_no = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_hm = null;
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bndl_flg = null;
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_cd = null;
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_site_cd = null;
	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_site_nm = null;
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
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_iv_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_iv_amt;// [Rslt]の[ttl_iv_amt_p.amt]を[columnRslt_ttl_iv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_ncv_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_ncv_amt;// [Rslt]の[ttl_ncv_amt_p.amt]を[columnRslt_ttl_ncv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_base_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_base_amt;// [Rslt]の[ttl_base_amt_p.amt]を[columnRslt_ttl_base_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_freight_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_freight_amt;// [Rslt]の[ttl_freight_amt_p.amt]を[columnRslt_ttl_freight_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_insurance_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_insurance_amt;// [Rslt]の[ttl_insurance_amt_p.amt]を[columnRslt_ttl_insurance_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_oth_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_oth_amt;// [Rslt]の[ttl_oth_amt_p.amt]を[columnRslt_ttl_oth_amt]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_ship_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_ship_inst_qty;// [Rslt]の[ship_inst_qty_p.qty]を[columnRslt_ship_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sum_ship_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_sum_ship_inst_qty;// [Rslt]の[sum_ship_inst_qty_p.qty]を[columnRslt_sum_ship_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_ship_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_ship_act_qty;// [Rslt]の[ship_act_qty_p.qty]を[columnRslt_ship_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sls_qty_p_PPanel;
	public MCColumnConfig columnRslt_sls_qty;// [Rslt]の[sls_qty_p.qty]を[columnRslt_sls_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_cur_inc_tax_amt_p.amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
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
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_tax_amt_p.amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_cur_dscnt_amt_p.amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_rsn_cd = null;
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_iv_upri_p_PPanel;
	public MCColumnConfig columnRslt_iv_upri;// [Rslt]の[iv_upri_p.amt]を[columnRslt_iv_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_iv_amt_p_PPanel;
	public MCColumnConfig columnRslt_iv_amt;// [Rslt]の[iv_amt_p.amt]を[columnRslt_iv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_amt;// [Rslt]の[ptax_cur_amt_p.amt]を[columnRslt_ptax_cur_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsn_cd = null;
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsn_nm = null;
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
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_nm = null;
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
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public MCColumnConfig columnRslt_manual_add_flg = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_rmrks = null;
	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_intr_rmrks = null;
	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_sub_char1 = null;
	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_sub_char2 = null;
	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_d_sub_char3 = null;
	/**
	 * Shipping order details spare 1 出荷指図明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_d_sub_char1 = null;
	/**
	 * Shipping order details spare 2 出荷指図明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_d_sub_char2 = null;
	/**
	 * Shipping order details spare 3 出荷指図明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_d_sub_char3 = null;
	/**
	 * Shipping result details spare 1 出荷実績明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_d_sub_char1 = null;
	/**
	 * Shipping result details spare 2 出荷実績明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_d_sub_char2 = null;
	/**
	 * Shipping result details spare 3 出荷実績明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_d_sub_char3 = null;
	/**
	 * Invoice shipping result details spare 1 インボイス出荷実績明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_ship_act_d_sub_char1 = null;
	/**
	 * Invoice shipping result details spare 2 インボイス出荷実績明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_ship_act_d_sub_char2 = null;
	/**
	 * Invoice shipping result details spare 3 インボイス出荷実績明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_ship_act_d_sub_char3 = null;
	/**
	 * Sales result details spare 1 売上実績明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_sub_char1 = null;
	/**
	 * Sales result details spare 2 売上実績明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_sub_char2 = null;
	/**
	 * Sales result details spare 3 売上実績明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_ship_rqst_id_grp_p_PPanel;
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd1;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd1]を[columnRslt_ship_rqst_id_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm1;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm1]を[columnRslt_ship_rqst_id_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd2;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd2]を[columnRslt_ship_rqst_id_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm2;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm2]を[columnRslt_ship_rqst_id_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd3;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd3]を[columnRslt_ship_rqst_id_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm3;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm3]を[columnRslt_ship_rqst_id_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd4;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd4]を[columnRslt_ship_rqst_id_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm4;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm4]を[columnRslt_ship_rqst_id_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd5;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd5]を[columnRslt_ship_rqst_id_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm5;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm5]を[columnRslt_ship_rqst_id_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd6;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd6]を[columnRslt_ship_rqst_id_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm6;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm6]を[columnRslt_ship_rqst_id_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd7;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd7]を[columnRslt_ship_rqst_id_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm7;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm7]を[columnRslt_ship_rqst_id_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd8;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd8]を[columnRslt_ship_rqst_id_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm8;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm8]を[columnRslt_ship_rqst_id_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd9;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd9]を[columnRslt_ship_rqst_id_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm9;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm9]を[columnRslt_ship_rqst_id_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd10;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd10]を[columnRslt_ship_rqst_id_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm10;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm10]を[columnRslt_ship_rqst_id_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_dlv_id_grp_p_PPanel;
	public MCColumnConfig columnRslt_dlv_id_grp_cd1;// [Rslt]の[dlv_id_grp_p.bp_grp_cd1]を[columnRslt_dlv_id_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm1;// [Rslt]の[dlv_id_grp_p.bp_grp_nm1]を[columnRslt_dlv_id_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd2;// [Rslt]の[dlv_id_grp_p.bp_grp_cd2]を[columnRslt_dlv_id_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm2;// [Rslt]の[dlv_id_grp_p.bp_grp_nm2]を[columnRslt_dlv_id_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd3;// [Rslt]の[dlv_id_grp_p.bp_grp_cd3]を[columnRslt_dlv_id_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm3;// [Rslt]の[dlv_id_grp_p.bp_grp_nm3]を[columnRslt_dlv_id_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd4;// [Rslt]の[dlv_id_grp_p.bp_grp_cd4]を[columnRslt_dlv_id_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm4;// [Rslt]の[dlv_id_grp_p.bp_grp_nm4]を[columnRslt_dlv_id_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd5;// [Rslt]の[dlv_id_grp_p.bp_grp_cd5]を[columnRslt_dlv_id_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm5;// [Rslt]の[dlv_id_grp_p.bp_grp_nm5]を[columnRslt_dlv_id_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd6;// [Rslt]の[dlv_id_grp_p.bp_grp_cd6]を[columnRslt_dlv_id_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm6;// [Rslt]の[dlv_id_grp_p.bp_grp_nm6]を[columnRslt_dlv_id_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd7;// [Rslt]の[dlv_id_grp_p.bp_grp_cd7]を[columnRslt_dlv_id_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm7;// [Rslt]の[dlv_id_grp_p.bp_grp_nm7]を[columnRslt_dlv_id_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd8;// [Rslt]の[dlv_id_grp_p.bp_grp_cd8]を[columnRslt_dlv_id_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm8;// [Rslt]の[dlv_id_grp_p.bp_grp_nm8]を[columnRslt_dlv_id_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd9;// [Rslt]の[dlv_id_grp_p.bp_grp_cd9]を[columnRslt_dlv_id_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm9;// [Rslt]の[dlv_id_grp_p.bp_grp_nm9]を[columnRslt_dlv_id_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_cd10;// [Rslt]の[dlv_id_grp_p.bp_grp_cd10]を[columnRslt_dlv_id_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_grp_nm10;// [Rslt]の[dlv_id_grp_p.bp_grp_nm10]を[columnRslt_dlv_id_grp_nm10]としてエイリアス定義。
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
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_mng_typ = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
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
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_amt_dec_place = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Print sales invoice インボイス登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1730 = null;
	/**
	 * Print packing list パッキングリスト登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1750 = null;
	/**
	 * Export result list entry 輸出実績一覧登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1760 = null;
	/**
	 * Invoice インボイス.<p>
	 *
	 */
	public MCButton Btn_prnt_iv = null;
	/**
	 * Packing list パッキングリスト.<p>
	 *
	 */
	public MCButton Btn_prnt_pl = null;
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
	/** [HDR]モードを表す定数 */
	public static final String HDR = "HDR";
	/** [DTL]モードを表す定数 */
	public static final String DTL = "DTL";
	/** [SHIP_INST]モードを表す定数 */
	public static final String SHIP_INST = "SHIP_INST";
	/** [SHIP_ACT]モードを表す定数 */
	public static final String SHIP_ACT = "SHIP_ACT";
	/** [SLS_ACT]モードを表す定数 */
	public static final String SLS_ACT = "SLS_ACT";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{HDR, DTL, SHIP_INST, SHIP_ACT, SLS_ACT, SRCH_PRNT, PRNT};
	
	/** [MS_MSBEL1770_Srch01]のCallerの作成 */
	protected MSBEP_IvSrch_MC.MS_MSBEL1770_Srch01Caller createMS_MSBEL1770_Srch01() {
		MSBEP_IvSrch_MC.MS_MSBEL1770_Srch01Caller<MSBEP_IvSrch, MS_MSBEL1770_Srch01Bridge>
		caller = ((MSBEP_IvSrch_MC)this).new MS_MSBEL1770_Srch01Caller<MSBEP_IvSrch, MS_MSBEL1770_Srch01Bridge>(
					(MSBEP_IvSrch)this, new MS_MSBEL1770_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1770_Srch01]の呼び出し */
	protected void callMS_MSBEL1770_Srch01() {
		MCCaller caller = createMS_MSBEL1770_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1770_Prnt01]のCallerの作成 */
	protected MSBEP_IvSrch_MC.MS_MSBEL1770_Prnt01Caller createMS_MSBEL1770_Prnt01() {
		MSBEP_IvSrch_MC.MS_MSBEL1770_Prnt01Caller<MSBEP_IvSrch, MS_MSBEL1770_Prnt01Bridge>
		caller = ((MSBEP_IvSrch_MC)this).new MS_MSBEL1770_Prnt01Caller<MSBEP_IvSrch, MS_MSBEL1770_Prnt01Bridge>(
					(MSBEP_IvSrch)this, new MS_MSBEL1770_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1770_Prnt01]の呼び出し */
	protected void callMS_MSBEL1770_Prnt01() {
		MCCaller caller = createMS_MSBEL1770_Prnt01();
		caller.exec();
	}
	/** [MS_MSBEL1770_Prnt02]のCallerの作成 */
	protected MSBEP_IvSrch_MC.MS_MSBEL1770_Prnt02Caller createMS_MSBEL1770_Prnt02() {
		MSBEP_IvSrch_MC.MS_MSBEL1770_Prnt02Caller<MSBEP_IvSrch, MS_MSBEL1770_Prnt02Bridge>
		caller = ((MSBEP_IvSrch_MC)this).new MS_MSBEL1770_Prnt02Caller<MSBEP_IvSrch, MS_MSBEL1770_Prnt02Bridge>(
					(MSBEP_IvSrch)this, new MS_MSBEL1770_Prnt02Bridge());
		return caller;
	}
	/** [MS_MSBEL1770_Prnt02]の呼び出し */
	protected void callMS_MSBEL1770_Prnt02() {
		MCCaller caller = createMS_MSBEL1770_Prnt02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1770.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1770.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1770.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1770.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1770.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1770.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1770.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1770.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1770.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1770.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1770.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1770.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBE.MSBEP1770.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1770.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1770.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1770.BtnR.create();
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
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(ExImPanel);
		ret.add(PurcImPanel);
		ret.add(IvRegPanel);
		ret.add(PlRegPanel);
		ret.add(IvPrntPanel);
		ret.add(PlPrntPanel);
		ret.add(PrStsPanel);
		ret.add(IvImPanel);
		ret.add(SlsCststkPanel);
		ret.add(CndPanel);
		ret.add(ShipRqstIdCndPanel);
		ret.add(DlvCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IvSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_IvSrch_MC_A(String name) {
		aCndR = createCndR();
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
		MSBEP_IvSrch_MC.jbCreateScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateSrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateTop((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateFold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateTab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateTab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateTab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateTab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreatePurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateIvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreatePlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateIvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreatePlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreatePrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateIvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateSlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateDlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateCtrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateRPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateRslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbCreateBtn((MSBEP_IvSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_IvSrch p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBEP_IvSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_IvSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_IvSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_IvSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_IvSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_IvSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBEP_IvSrch p) {
	}

	/**
	 * [ExIm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExIm(MSBEP_IvSrch p) {
	}

	/**
	 * [PurcIm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePurcIm(MSBEP_IvSrch p) {
	}

	/**
	 * [IvReg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIvReg(MSBEP_IvSrch p) {
	}

	/**
	 * [PlReg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePlReg(MSBEP_IvSrch p) {
	}

	/**
	 * [IvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIvPrnt(MSBEP_IvSrch p) {
	}

	/**
	 * [PlPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePlPrnt(MSBEP_IvSrch p) {
	}

	/**
	 * [PrSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrSts(MSBEP_IvSrch p) {
	}

	/**
	 * [IvIm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIvIm(MSBEP_IvSrch p) {
	}

	/**
	 * [SlsCststk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlsCststk(MSBEP_IvSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_IvSrch p) {
		p.Cnd_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_rqst_dt_p());
		p.Cnd_dlv_rqst_dt_p_PPanel.setName("Cnd.dlv_rqst_dt_p");
		p.Cnd_dlv_rqst_dt_fr = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_rqst_dt_fr.addAliasName("Cnd.dlv_rqst_dt_fr", p);
		p.Cnd_dlv_rqst_hm_fr = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_rqst_hm_fr.addAliasName("Cnd.dlv_rqst_hm_fr", p);
		p.Cnd_dlv_rqst_dt_to = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_rqst_dt_to.addAliasName("Cnd.dlv_rqst_dt_to", p);
		p.Cnd_dlv_rqst_hm_to = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_rqst_hm_to.addAliasName("Cnd.dlv_rqst_hm_to", p);
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
		p.Cnd_ship_rqst_id_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().ship_rqst_id_grp_p());
		p.Cnd_ship_rqst_id_grp_p_PPanel.setName("Cnd.ship_rqst_id_grp_p");
		p.Cnd_ship_rqst_id_grp_lab1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_ship_rqst_id_grp_lab1.addAliasName("Cnd.ship_rqst_id_grp_lab1", p);
		p.Cnd_ship_rqst_id_grp_flg1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_ship_rqst_id_grp_flg1.addAliasName("Cnd.ship_rqst_id_grp_flg1", p);
		p.Cnd_ship_rqst_id_grp_cd1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_ship_rqst_id_grp_cd1.addAliasName("Cnd.ship_rqst_id_grp_cd1", p);
		p.Cnd_ship_rqst_id_grp_nm1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_ship_rqst_id_grp_nm1.addAliasName("Cnd.ship_rqst_id_grp_nm1", p);
		p.Cnd_ship_rqst_id_grp_lab2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_ship_rqst_id_grp_lab2.addAliasName("Cnd.ship_rqst_id_grp_lab2", p);
		p.Cnd_ship_rqst_id_grp_flg2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_ship_rqst_id_grp_flg2.addAliasName("Cnd.ship_rqst_id_grp_flg2", p);
		p.Cnd_ship_rqst_id_grp_cd2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_ship_rqst_id_grp_cd2.addAliasName("Cnd.ship_rqst_id_grp_cd2", p);
		p.Cnd_ship_rqst_id_grp_nm2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_ship_rqst_id_grp_nm2.addAliasName("Cnd.ship_rqst_id_grp_nm2", p);
		p.Cnd_ship_rqst_id_grp_lab3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_ship_rqst_id_grp_lab3.addAliasName("Cnd.ship_rqst_id_grp_lab3", p);
		p.Cnd_ship_rqst_id_grp_flg3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_ship_rqst_id_grp_flg3.addAliasName("Cnd.ship_rqst_id_grp_flg3", p);
		p.Cnd_ship_rqst_id_grp_cd3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_ship_rqst_id_grp_cd3.addAliasName("Cnd.ship_rqst_id_grp_cd3", p);
		p.Cnd_ship_rqst_id_grp_nm3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_ship_rqst_id_grp_nm3.addAliasName("Cnd.ship_rqst_id_grp_nm3", p);
		p.Cnd_ship_rqst_id_grp_lab4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_ship_rqst_id_grp_lab4.addAliasName("Cnd.ship_rqst_id_grp_lab4", p);
		p.Cnd_ship_rqst_id_grp_flg4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_ship_rqst_id_grp_flg4.addAliasName("Cnd.ship_rqst_id_grp_flg4", p);
		p.Cnd_ship_rqst_id_grp_cd4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_ship_rqst_id_grp_cd4.addAliasName("Cnd.ship_rqst_id_grp_cd4", p);
		p.Cnd_ship_rqst_id_grp_nm4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_ship_rqst_id_grp_nm4.addAliasName("Cnd.ship_rqst_id_grp_nm4", p);
		p.Cnd_ship_rqst_id_grp_lab5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_ship_rqst_id_grp_lab5.addAliasName("Cnd.ship_rqst_id_grp_lab5", p);
		p.Cnd_ship_rqst_id_grp_flg5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_ship_rqst_id_grp_flg5.addAliasName("Cnd.ship_rqst_id_grp_flg5", p);
		p.Cnd_ship_rqst_id_grp_cd5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_ship_rqst_id_grp_cd5.addAliasName("Cnd.ship_rqst_id_grp_cd5", p);
		p.Cnd_ship_rqst_id_grp_nm5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_ship_rqst_id_grp_nm5.addAliasName("Cnd.ship_rqst_id_grp_nm5", p);
		p.Cnd_ship_rqst_id_grp_lab6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_ship_rqst_id_grp_lab6.addAliasName("Cnd.ship_rqst_id_grp_lab6", p);
		p.Cnd_ship_rqst_id_grp_flg6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_ship_rqst_id_grp_flg6.addAliasName("Cnd.ship_rqst_id_grp_flg6", p);
		p.Cnd_ship_rqst_id_grp_cd6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_ship_rqst_id_grp_cd6.addAliasName("Cnd.ship_rqst_id_grp_cd6", p);
		p.Cnd_ship_rqst_id_grp_nm6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_ship_rqst_id_grp_nm6.addAliasName("Cnd.ship_rqst_id_grp_nm6", p);
		p.Cnd_ship_rqst_id_grp_lab7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_ship_rqst_id_grp_lab7.addAliasName("Cnd.ship_rqst_id_grp_lab7", p);
		p.Cnd_ship_rqst_id_grp_flg7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_ship_rqst_id_grp_flg7.addAliasName("Cnd.ship_rqst_id_grp_flg7", p);
		p.Cnd_ship_rqst_id_grp_cd7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_ship_rqst_id_grp_cd7.addAliasName("Cnd.ship_rqst_id_grp_cd7", p);
		p.Cnd_ship_rqst_id_grp_nm7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_ship_rqst_id_grp_nm7.addAliasName("Cnd.ship_rqst_id_grp_nm7", p);
		p.Cnd_ship_rqst_id_grp_lab8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_ship_rqst_id_grp_lab8.addAliasName("Cnd.ship_rqst_id_grp_lab8", p);
		p.Cnd_ship_rqst_id_grp_flg8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_ship_rqst_id_grp_flg8.addAliasName("Cnd.ship_rqst_id_grp_flg8", p);
		p.Cnd_ship_rqst_id_grp_cd8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_ship_rqst_id_grp_cd8.addAliasName("Cnd.ship_rqst_id_grp_cd8", p);
		p.Cnd_ship_rqst_id_grp_nm8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_ship_rqst_id_grp_nm8.addAliasName("Cnd.ship_rqst_id_grp_nm8", p);
		p.Cnd_ship_rqst_id_grp_lab9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_ship_rqst_id_grp_lab9.addAliasName("Cnd.ship_rqst_id_grp_lab9", p);
		p.Cnd_ship_rqst_id_grp_flg9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_ship_rqst_id_grp_flg9.addAliasName("Cnd.ship_rqst_id_grp_flg9", p);
		p.Cnd_ship_rqst_id_grp_cd9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_ship_rqst_id_grp_cd9.addAliasName("Cnd.ship_rqst_id_grp_cd9", p);
		p.Cnd_ship_rqst_id_grp_nm9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_ship_rqst_id_grp_nm9.addAliasName("Cnd.ship_rqst_id_grp_nm9", p);
		p.Cnd_ship_rqst_id_grp_lab10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_ship_rqst_id_grp_lab10.addAliasName("Cnd.ship_rqst_id_grp_lab10", p);
		p.Cnd_ship_rqst_id_grp_flg10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_ship_rqst_id_grp_flg10.addAliasName("Cnd.ship_rqst_id_grp_flg10", p);
		p.Cnd_ship_rqst_id_grp_cd10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_ship_rqst_id_grp_cd10.addAliasName("Cnd.ship_rqst_id_grp_cd10", p);
		p.Cnd_ship_rqst_id_grp_nm10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_ship_rqst_id_grp_nm10.addAliasName("Cnd.ship_rqst_id_grp_nm10", p);
		p.Cnd_dlv_id_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().dlv_id_grp_p());
		p.Cnd_dlv_id_grp_p_PPanel.setName("Cnd.dlv_id_grp_p");
		p.Cnd_dlv_id_grp_lab1 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_dlv_id_grp_lab1.addAliasName("Cnd.dlv_id_grp_lab1", p);
		p.Cnd_dlv_id_grp_flg1 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_dlv_id_grp_flg1.addAliasName("Cnd.dlv_id_grp_flg1", p);
		p.Cnd_dlv_id_grp_cd1 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_dlv_id_grp_cd1.addAliasName("Cnd.dlv_id_grp_cd1", p);
		p.Cnd_dlv_id_grp_nm1 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_dlv_id_grp_nm1.addAliasName("Cnd.dlv_id_grp_nm1", p);
		p.Cnd_dlv_id_grp_lab2 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_dlv_id_grp_lab2.addAliasName("Cnd.dlv_id_grp_lab2", p);
		p.Cnd_dlv_id_grp_flg2 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_dlv_id_grp_flg2.addAliasName("Cnd.dlv_id_grp_flg2", p);
		p.Cnd_dlv_id_grp_cd2 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_dlv_id_grp_cd2.addAliasName("Cnd.dlv_id_grp_cd2", p);
		p.Cnd_dlv_id_grp_nm2 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_dlv_id_grp_nm2.addAliasName("Cnd.dlv_id_grp_nm2", p);
		p.Cnd_dlv_id_grp_lab3 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_dlv_id_grp_lab3.addAliasName("Cnd.dlv_id_grp_lab3", p);
		p.Cnd_dlv_id_grp_flg3 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_dlv_id_grp_flg3.addAliasName("Cnd.dlv_id_grp_flg3", p);
		p.Cnd_dlv_id_grp_cd3 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_dlv_id_grp_cd3.addAliasName("Cnd.dlv_id_grp_cd3", p);
		p.Cnd_dlv_id_grp_nm3 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_dlv_id_grp_nm3.addAliasName("Cnd.dlv_id_grp_nm3", p);
		p.Cnd_dlv_id_grp_lab4 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_dlv_id_grp_lab4.addAliasName("Cnd.dlv_id_grp_lab4", p);
		p.Cnd_dlv_id_grp_flg4 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_dlv_id_grp_flg4.addAliasName("Cnd.dlv_id_grp_flg4", p);
		p.Cnd_dlv_id_grp_cd4 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_dlv_id_grp_cd4.addAliasName("Cnd.dlv_id_grp_cd4", p);
		p.Cnd_dlv_id_grp_nm4 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_dlv_id_grp_nm4.addAliasName("Cnd.dlv_id_grp_nm4", p);
		p.Cnd_dlv_id_grp_lab5 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_dlv_id_grp_lab5.addAliasName("Cnd.dlv_id_grp_lab5", p);
		p.Cnd_dlv_id_grp_flg5 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_dlv_id_grp_flg5.addAliasName("Cnd.dlv_id_grp_flg5", p);
		p.Cnd_dlv_id_grp_cd5 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_dlv_id_grp_cd5.addAliasName("Cnd.dlv_id_grp_cd5", p);
		p.Cnd_dlv_id_grp_nm5 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_dlv_id_grp_nm5.addAliasName("Cnd.dlv_id_grp_nm5", p);
		p.Cnd_dlv_id_grp_lab6 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_dlv_id_grp_lab6.addAliasName("Cnd.dlv_id_grp_lab6", p);
		p.Cnd_dlv_id_grp_flg6 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_dlv_id_grp_flg6.addAliasName("Cnd.dlv_id_grp_flg6", p);
		p.Cnd_dlv_id_grp_cd6 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_dlv_id_grp_cd6.addAliasName("Cnd.dlv_id_grp_cd6", p);
		p.Cnd_dlv_id_grp_nm6 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_dlv_id_grp_nm6.addAliasName("Cnd.dlv_id_grp_nm6", p);
		p.Cnd_dlv_id_grp_lab7 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_dlv_id_grp_lab7.addAliasName("Cnd.dlv_id_grp_lab7", p);
		p.Cnd_dlv_id_grp_flg7 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_dlv_id_grp_flg7.addAliasName("Cnd.dlv_id_grp_flg7", p);
		p.Cnd_dlv_id_grp_cd7 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_dlv_id_grp_cd7.addAliasName("Cnd.dlv_id_grp_cd7", p);
		p.Cnd_dlv_id_grp_nm7 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_dlv_id_grp_nm7.addAliasName("Cnd.dlv_id_grp_nm7", p);
		p.Cnd_dlv_id_grp_lab8 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_dlv_id_grp_lab8.addAliasName("Cnd.dlv_id_grp_lab8", p);
		p.Cnd_dlv_id_grp_flg8 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_dlv_id_grp_flg8.addAliasName("Cnd.dlv_id_grp_flg8", p);
		p.Cnd_dlv_id_grp_cd8 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_dlv_id_grp_cd8.addAliasName("Cnd.dlv_id_grp_cd8", p);
		p.Cnd_dlv_id_grp_nm8 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_dlv_id_grp_nm8.addAliasName("Cnd.dlv_id_grp_nm8", p);
		p.Cnd_dlv_id_grp_lab9 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_dlv_id_grp_lab9.addAliasName("Cnd.dlv_id_grp_lab9", p);
		p.Cnd_dlv_id_grp_flg9 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_dlv_id_grp_flg9.addAliasName("Cnd.dlv_id_grp_flg9", p);
		p.Cnd_dlv_id_grp_cd9 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_dlv_id_grp_cd9.addAliasName("Cnd.dlv_id_grp_cd9", p);
		p.Cnd_dlv_id_grp_nm9 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_dlv_id_grp_nm9.addAliasName("Cnd.dlv_id_grp_nm9", p);
		p.Cnd_dlv_id_grp_lab10 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_dlv_id_grp_lab10.addAliasName("Cnd.dlv_id_grp_lab10", p);
		p.Cnd_dlv_id_grp_flg10 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_dlv_id_grp_flg10.addAliasName("Cnd.dlv_id_grp_flg10", p);
		p.Cnd_dlv_id_grp_cd10 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_dlv_id_grp_cd10.addAliasName("Cnd.dlv_id_grp_cd10", p);
		p.Cnd_dlv_id_grp_nm10 = p.Cnd_dlv_id_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_dlv_id_grp_nm10.addAliasName("Cnd.dlv_id_grp_nm10", p);
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
	 * [ShipRqstIdCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipRqstIdCnd(MSBEP_IvSrch p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBEP_IvSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_IvSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_IvSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_IvSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_IvSrch p) {
		p.Rslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$dlv_p);
		p.Rslt_dlv_p_PPanel.setName("Rslt.dlv_p");
		p.columnRslt_dlv_id_cd = p.Rslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_dlv_id_cd.addAliasName("Rslt.dlv_id_cd", p);
		p.columnRslt_dlv_id_nm = p.Rslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_dlv_id_nm.addAliasName("Rslt.dlv_id_nm", p);
		p.columnRslt_dlv_sundry_flg = p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_dlv_sundry_flg.addAliasName("Rslt.dlv_sundry_flg", p);
		p.columnRslt_dlv_pri_prnt_flg = p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_dlv_pri_prnt_flg.addAliasName("Rslt.dlv_pri_prnt_flg", p);
		p.columnRslt_dlv_lg_grp_cd = p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt_dlv_lg_grp_cd.addAliasName("Rslt.dlv_lg_grp_cd", p);
		p.columnRslt_dlv_lg_grp_nm = p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt_dlv_lg_grp_nm.addAliasName("Rslt.dlv_lg_grp_nm", p);
		p.columnRslt_dlv_cntry_cd = p.Rslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_dlv_cntry_cd.addAliasName("Rslt.dlv_cntry_cd", p);
		p.columnRslt_dlv_cntry_nm = p.Rslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_dlv_cntry_nm.addAliasName("Rslt.dlv_cntry_nm", p);
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
		p.columnRslt_dlv_tel = p.Rslt_dlv_p_PPanel.columnDlv_tel;
		p.columnRslt_dlv_tel.addAliasName("Rslt.dlv_tel", p);
		p.columnRslt_dlv_fax = p.Rslt_dlv_p_PPanel.columnDlv_fax;
		p.columnRslt_dlv_fax.addAliasName("Rslt.dlv_fax", p);
		p.columnRslt_dlv_cntct_dpt = p.Rslt_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt_dlv_cntct_dpt.addAliasName("Rslt.dlv_cntct_dpt", p);
		p.columnRslt_dlv_cntct_psn = p.Rslt_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt_dlv_cntct_psn.addAliasName("Rslt.dlv_cntct_psn", p);
		p.Rslt_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$tdlv_p);
		p.Rslt_tdlv_p_PPanel.setName("Rslt.tdlv_p");
		p.columnRslt_show_dtl = p.Rslt_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt_show_dtl.addAliasName("Rslt.show_dtl", p);
		p.columnRslt_tdlv_cd = p.Rslt_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_tdlv_cd.addAliasName("Rslt.tdlv_cd", p);
		p.columnRslt_tdlv_nm = p.Rslt_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_tdlv_nm.addAliasName("Rslt.tdlv_nm", p);
		p.columnRslt_tdlv_sundry_flg = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_tdlv_sundry_flg.addAliasName("Rslt.tdlv_sundry_flg", p);
		p.columnRslt_tdlv_pri_prnt_flg = p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_tdlv_pri_prnt_flg.addAliasName("Rslt.tdlv_pri_prnt_flg", p);
		p.columnRslt_tdlv_lg_grp_cd = p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt_tdlv_lg_grp_cd.addAliasName("Rslt.tdlv_lg_grp_cd", p);
		p.columnRslt_tdlv_lg_grp_nm = p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt_tdlv_lg_grp_nm.addAliasName("Rslt.tdlv_lg_grp_nm", p);
		p.columnRslt_tdlv_cntry_cd = p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_tdlv_cntry_cd.addAliasName("Rslt.tdlv_cntry_cd", p);
		p.columnRslt_tdlv_cntry_nm = p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_tdlv_cntry_nm.addAliasName("Rslt.tdlv_cntry_nm", p);
		p.columnRslt_tdlv_zip_cd = p.Rslt_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnRslt_tdlv_zip_cd.addAliasName("Rslt.tdlv_zip_cd", p);
		p.columnRslt_tdlv_addr1 = p.Rslt_tdlv_p_PPanel.columnDlv_addr1;
		p.columnRslt_tdlv_addr1.addAliasName("Rslt.tdlv_addr1", p);
		p.columnRslt_tdlv_addr2 = p.Rslt_tdlv_p_PPanel.columnDlv_addr2;
		p.columnRslt_tdlv_addr2.addAliasName("Rslt.tdlv_addr2", p);
		p.columnRslt_tdlv_addr3 = p.Rslt_tdlv_p_PPanel.columnDlv_addr3;
		p.columnRslt_tdlv_addr3.addAliasName("Rslt.tdlv_addr3", p);
		p.columnRslt_tdlv_addr4 = p.Rslt_tdlv_p_PPanel.columnDlv_addr4;
		p.columnRslt_tdlv_addr4.addAliasName("Rslt.tdlv_addr4", p);
		p.columnRslt_tdlv_tel = p.Rslt_tdlv_p_PPanel.columnDlv_tel;
		p.columnRslt_tdlv_tel.addAliasName("Rslt.tdlv_tel", p);
		p.columnRslt_tdlv_fax = p.Rslt_tdlv_p_PPanel.columnDlv_fax;
		p.columnRslt_tdlv_fax.addAliasName("Rslt.tdlv_fax", p);
		p.columnRslt_tdlv_cntct_dpt = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt_tdlv_cntct_dpt.addAliasName("Rslt.tdlv_cntct_dpt", p);
		p.columnRslt_tdlv_cntct_psn = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt_tdlv_cntct_psn.addAliasName("Rslt.tdlv_cntct_psn", p);
		p.Rslt_ttl_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_trd_cur_amt_p);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.setName("Rslt.ttl_trd_cur_amt_p");
		p.columnRslt_ttl_trd_cur_amt = p.Rslt_ttl_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_trd_cur_amt.addAliasName("Rslt.ttl_trd_cur_amt", p);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_trd_cur_inc_tax_amt_p);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.ttl_trd_cur_inc_tax_amt_p");
		p.columnRslt_ttl_trd_cur_inc_tax_amt = p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_trd_cur_inc_tax_amt.addAliasName("Rslt.ttl_trd_cur_inc_tax_amt", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$itm_p);
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
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$sno_wrk_no_p);
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
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_ttl_iv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_iv_amt_p);
		p.Rslt_ttl_iv_amt_p_PPanel.setName("Rslt.ttl_iv_amt_p");
		p.columnRslt_ttl_iv_amt = p.Rslt_ttl_iv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_iv_amt.addAliasName("Rslt.ttl_iv_amt", p);
		p.Rslt_ttl_ncv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_ncv_amt_p);
		p.Rslt_ttl_ncv_amt_p_PPanel.setName("Rslt.ttl_ncv_amt_p");
		p.columnRslt_ttl_ncv_amt = p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_ncv_amt.addAliasName("Rslt.ttl_ncv_amt", p);
		p.Rslt_ttl_base_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_base_amt_p);
		p.Rslt_ttl_base_amt_p_PPanel.setName("Rslt.ttl_base_amt_p");
		p.columnRslt_ttl_base_amt = p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_base_amt.addAliasName("Rslt.ttl_base_amt", p);
		p.Rslt_ttl_freight_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_freight_amt_p);
		p.Rslt_ttl_freight_amt_p_PPanel.setName("Rslt.ttl_freight_amt_p");
		p.columnRslt_ttl_freight_amt = p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_freight_amt.addAliasName("Rslt.ttl_freight_amt", p);
		p.Rslt_ttl_insurance_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_insurance_amt_p);
		p.Rslt_ttl_insurance_amt_p_PPanel.setName("Rslt.ttl_insurance_amt_p");
		p.columnRslt_ttl_insurance_amt = p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_insurance_amt.addAliasName("Rslt.ttl_insurance_amt", p);
		p.Rslt_ttl_oth_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ttl_oth_amt_p);
		p.Rslt_ttl_oth_amt_p_PPanel.setName("Rslt.ttl_oth_amt_p");
		p.columnRslt_ttl_oth_amt = p.Rslt_ttl_oth_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_oth_amt.addAliasName("Rslt.ttl_oth_amt", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_ship_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ship_inst_qty_p);
		p.Rslt_ship_inst_qty_p_PPanel.setName("Rslt.ship_inst_qty_p");
		p.columnRslt_ship_inst_qty = p.Rslt_ship_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_ship_inst_qty.addAliasName("Rslt.ship_inst_qty", p);
		p.Rslt_sum_ship_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$sum_ship_inst_qty_p);
		p.Rslt_sum_ship_inst_qty_p_PPanel.setName("Rslt.sum_ship_inst_qty_p");
		p.columnRslt_sum_ship_inst_qty = p.Rslt_sum_ship_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_sum_ship_inst_qty.addAliasName("Rslt.sum_ship_inst_qty", p);
		p.Rslt_ship_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ship_act_qty_p);
		p.Rslt_ship_act_qty_p_PPanel.setName("Rslt.ship_act_qty_p");
		p.columnRslt_ship_act_qty = p.Rslt_ship_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_ship_act_qty.addAliasName("Rslt.ship_act_qty", p);
		p.Rslt_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$sls_qty_p);
		p.Rslt_sls_qty_p_PPanel.setName("Rslt.sls_qty_p");
		p.columnRslt_sls_qty = p.Rslt_sls_qty_p_PPanel.columnQty_qty;
		p.columnRslt_sls_qty.addAliasName("Rslt.sls_qty", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$trd_cur_inc_tax_amt_p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_inc_tax_amt_p");
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_iv_upri_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$iv_upri_p);
		p.Rslt_iv_upri_p_PPanel.setName("Rslt.iv_upri_p");
		p.columnRslt_iv_upri = p.Rslt_iv_upri_p_PPanel.columnAmt_amt;
		p.columnRslt_iv_upri.addAliasName("Rslt.iv_upri", p);
		p.Rslt_iv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$iv_amt_p);
		p.Rslt_iv_amt_p_PPanel.setName("Rslt.iv_amt_p");
		p.columnRslt_iv_amt = p.Rslt_iv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_iv_amt.addAliasName("Rslt.iv_amt", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_ship_rqst_id_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$ship_rqst_id_grp_p);
		p.Rslt_ship_rqst_id_grp_p_PPanel.setName("Rslt.ship_rqst_id_grp_p");
		p.columnRslt_ship_rqst_id_grp_cd1 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_ship_rqst_id_grp_cd1.addAliasName("Rslt.ship_rqst_id_grp_cd1", p);
		p.columnRslt_ship_rqst_id_grp_nm1 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_ship_rqst_id_grp_nm1.addAliasName("Rslt.ship_rqst_id_grp_nm1", p);
		p.columnRslt_ship_rqst_id_grp_cd2 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_ship_rqst_id_grp_cd2.addAliasName("Rslt.ship_rqst_id_grp_cd2", p);
		p.columnRslt_ship_rqst_id_grp_nm2 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_ship_rqst_id_grp_nm2.addAliasName("Rslt.ship_rqst_id_grp_nm2", p);
		p.columnRslt_ship_rqst_id_grp_cd3 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_ship_rqst_id_grp_cd3.addAliasName("Rslt.ship_rqst_id_grp_cd3", p);
		p.columnRslt_ship_rqst_id_grp_nm3 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_ship_rqst_id_grp_nm3.addAliasName("Rslt.ship_rqst_id_grp_nm3", p);
		p.columnRslt_ship_rqst_id_grp_cd4 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_ship_rqst_id_grp_cd4.addAliasName("Rslt.ship_rqst_id_grp_cd4", p);
		p.columnRslt_ship_rqst_id_grp_nm4 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_ship_rqst_id_grp_nm4.addAliasName("Rslt.ship_rqst_id_grp_nm4", p);
		p.columnRslt_ship_rqst_id_grp_cd5 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_ship_rqst_id_grp_cd5.addAliasName("Rslt.ship_rqst_id_grp_cd5", p);
		p.columnRslt_ship_rqst_id_grp_nm5 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_ship_rqst_id_grp_nm5.addAliasName("Rslt.ship_rqst_id_grp_nm5", p);
		p.columnRslt_ship_rqst_id_grp_cd6 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_ship_rqst_id_grp_cd6.addAliasName("Rslt.ship_rqst_id_grp_cd6", p);
		p.columnRslt_ship_rqst_id_grp_nm6 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_ship_rqst_id_grp_nm6.addAliasName("Rslt.ship_rqst_id_grp_nm6", p);
		p.columnRslt_ship_rqst_id_grp_cd7 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_ship_rqst_id_grp_cd7.addAliasName("Rslt.ship_rqst_id_grp_cd7", p);
		p.columnRslt_ship_rqst_id_grp_nm7 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_ship_rqst_id_grp_nm7.addAliasName("Rslt.ship_rqst_id_grp_nm7", p);
		p.columnRslt_ship_rqst_id_grp_cd8 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_ship_rqst_id_grp_cd8.addAliasName("Rslt.ship_rqst_id_grp_cd8", p);
		p.columnRslt_ship_rqst_id_grp_nm8 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_ship_rqst_id_grp_nm8.addAliasName("Rslt.ship_rqst_id_grp_nm8", p);
		p.columnRslt_ship_rqst_id_grp_cd9 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_ship_rqst_id_grp_cd9.addAliasName("Rslt.ship_rqst_id_grp_cd9", p);
		p.columnRslt_ship_rqst_id_grp_nm9 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_ship_rqst_id_grp_nm9.addAliasName("Rslt.ship_rqst_id_grp_nm9", p);
		p.columnRslt_ship_rqst_id_grp_cd10 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_ship_rqst_id_grp_cd10.addAliasName("Rslt.ship_rqst_id_grp_cd10", p);
		p.columnRslt_ship_rqst_id_grp_nm10 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_ship_rqst_id_grp_nm10.addAliasName("Rslt.ship_rqst_id_grp_nm10", p);
		p.Rslt_dlv_id_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$dlv_id_grp_p);
		p.Rslt_dlv_id_grp_p_PPanel.setName("Rslt.dlv_id_grp_p");
		p.columnRslt_dlv_id_grp_cd1 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_dlv_id_grp_cd1.addAliasName("Rslt.dlv_id_grp_cd1", p);
		p.columnRslt_dlv_id_grp_nm1 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_dlv_id_grp_nm1.addAliasName("Rslt.dlv_id_grp_nm1", p);
		p.columnRslt_dlv_id_grp_cd2 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_dlv_id_grp_cd2.addAliasName("Rslt.dlv_id_grp_cd2", p);
		p.columnRslt_dlv_id_grp_nm2 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_dlv_id_grp_nm2.addAliasName("Rslt.dlv_id_grp_nm2", p);
		p.columnRslt_dlv_id_grp_cd3 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_dlv_id_grp_cd3.addAliasName("Rslt.dlv_id_grp_cd3", p);
		p.columnRslt_dlv_id_grp_nm3 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_dlv_id_grp_nm3.addAliasName("Rslt.dlv_id_grp_nm3", p);
		p.columnRslt_dlv_id_grp_cd4 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_dlv_id_grp_cd4.addAliasName("Rslt.dlv_id_grp_cd4", p);
		p.columnRslt_dlv_id_grp_nm4 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_dlv_id_grp_nm4.addAliasName("Rslt.dlv_id_grp_nm4", p);
		p.columnRslt_dlv_id_grp_cd5 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_dlv_id_grp_cd5.addAliasName("Rslt.dlv_id_grp_cd5", p);
		p.columnRslt_dlv_id_grp_nm5 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_dlv_id_grp_nm5.addAliasName("Rslt.dlv_id_grp_nm5", p);
		p.columnRslt_dlv_id_grp_cd6 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_dlv_id_grp_cd6.addAliasName("Rslt.dlv_id_grp_cd6", p);
		p.columnRslt_dlv_id_grp_nm6 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_dlv_id_grp_nm6.addAliasName("Rslt.dlv_id_grp_nm6", p);
		p.columnRslt_dlv_id_grp_cd7 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_dlv_id_grp_cd7.addAliasName("Rslt.dlv_id_grp_cd7", p);
		p.columnRslt_dlv_id_grp_nm7 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_dlv_id_grp_nm7.addAliasName("Rslt.dlv_id_grp_nm7", p);
		p.columnRslt_dlv_id_grp_cd8 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_dlv_id_grp_cd8.addAliasName("Rslt.dlv_id_grp_cd8", p);
		p.columnRslt_dlv_id_grp_nm8 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_dlv_id_grp_nm8.addAliasName("Rslt.dlv_id_grp_nm8", p);
		p.columnRslt_dlv_id_grp_cd9 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_dlv_id_grp_cd9.addAliasName("Rslt.dlv_id_grp_cd9", p);
		p.columnRslt_dlv_id_grp_nm9 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_dlv_id_grp_nm9.addAliasName("Rslt.dlv_id_grp_nm9", p);
		p.columnRslt_dlv_id_grp_cd10 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_dlv_id_grp_cd10.addAliasName("Rslt.dlv_id_grp_cd10", p);
		p.columnRslt_dlv_id_grp_nm10 = p.Rslt_dlv_id_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_dlv_id_grp_nm10.addAliasName("Rslt.dlv_id_grp_nm10", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1770.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBEP_IvSrch p) {
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

	
	/** [Cnd_ship_fr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_fr_lg_grp_cd_p = null;

	/**
	 * [Cnd_ship_fr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_fr_lg_grp_cd_ListPutter() {
		if (Cnd_ship_fr_lg_grp_cd_p == null) {
			Cnd_ship_fr_lg_grp_cd_p = createCnd_ship_fr_lg_grp_cd_ListPutter(Cnd_ship_fr_lg_grp_cd, "ship_fr_lg_grp_cd", "ship_fr_lg_grp_nm");

		}
		return Cnd_ship_fr_lg_grp_cd_p;
	}
	
	
	/** [Cnd_tdlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tdlv_cd_p = null;

	/**
	 * [Cnd_tdlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tdlv_cd_ListPutter() {
		if (Cnd_tdlv_cd_p == null) {
			Cnd_tdlv_cd_p = createCnd_tdlv_cd_ListPutter(Cnd_tdlv_cd, "tdlv_cd", "tdlv_nm");

		}
		return Cnd_tdlv_cd_p;
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
	
	
	/** [Cnd_ship_rqst_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_typ_p = null;

	/**
	 * [Cnd_ship_rqst_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_typ_ListPutter() {
		if (Cnd_ship_rqst_id_typ_p == null) {
			Cnd_ship_rqst_id_typ_p = createCnd_ship_rqst_id_typ_ListPutter(Cnd_ship_rqst_id_typ, "ship_rqst_id_typ", "ship_rqst_id_typ_nm");

		}
		return Cnd_ship_rqst_id_typ_p;
	}
	
	
	/** [Cnd_ship_rqst_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_cd_p = null;

	/**
	 * [Cnd_ship_rqst_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_cd_ListPutter() {
		if (Cnd_ship_rqst_id_cd_p == null) {
			Cnd_ship_rqst_id_cd_p = createCnd_ship_rqst_id_cd_ListPutter(Cnd_ship_rqst_id_cd, "ship_rqst_id_cd", "ship_rqst_id_nm");

		}
		return Cnd_ship_rqst_id_cd_p;
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
	
	
	/** [Cnd_ship_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_site_cd_p = null;

	/**
	 * [Cnd_ship_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_site_cd_ListPutter() {
		if (Cnd_ship_site_cd_p == null) {
			Cnd_ship_site_cd_p = createCnd_ship_site_cd_ListPutter(Cnd_ship_site_cd, "ship_site_cd", "ship_site_nm");

		}
		return Cnd_ship_site_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IvSrch create(){
		MSBEP_IvSrch p = new MSBEP_IvSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IvSrch create(String name){
		MSBEP_IvSrch p = new MSBEP_IvSrch(name);
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
		MSBEP_IvSrch_MC.jbfInitScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitSrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitTop((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitFold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitTab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitTab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitTab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitTab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitPurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitIvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitPlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitIvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitPlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitPrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitIvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitSlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitDlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitCtrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitRPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitRslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbfInitBtn((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitSrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitTop((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitFold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitTab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitTab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitTab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitTab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitPurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitIvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitPlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitIvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitPlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitPrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitIvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitSlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitDlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitCtrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitRPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitRslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.jbInitBtn((MSBEP_IvSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_IvSrch p) {
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
	protected static void jbfInitTab1(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [ExIm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExIm(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ExImPanel = p.beansFactory.createPanel("ExIm");
		p.ExImTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PurcIm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPurcIm(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PurcImPanel = p.beansFactory.createPanel("PurcIm");
		p.PurcImTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [IvReg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIvReg(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.IvRegPanel = p.beansFactory.createPanel("IvReg");
		p.IvRegTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PlReg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPlReg(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PlRegPanel = p.beansFactory.createPanel("PlReg");
		p.PlRegTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [IvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIvPrnt(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.IvPrntPanel = p.beansFactory.createPanel("IvPrnt");
		p.IvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PlPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPlPrnt(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PlPrntPanel = p.beansFactory.createPanel("PlPrnt");
		p.PlPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrSts(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PrStsPanel = p.beansFactory.createPanel("PrSts");
		p.PrStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [IvIm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIvIm(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.IvImPanel = p.beansFactory.createPanel("IvIm");
		p.IvImTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SlsCststk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlsCststk(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.SlsCststkPanel = p.beansFactory.createPanel("SlsCststk");
		p.SlsCststkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_srch_mode_Group = p.beansFactory.createButtonGroup("Cnd.srch_mode");
		p.Cnd_srch_mode_HDR = p.beansFactory.createRadioButton("Cnd.srch_mode_HDR");
		p.Cnd_srch_mode_DTL = p.beansFactory.createRadioButton("Cnd.srch_mode_DTL");
		p.Cnd_srch_mode_SHIP_INST = p.beansFactory.createRadioButton("Cnd.srch_mode_SHIP_INST");
		p.Cnd_srch_mode_SHIP_ACT = p.beansFactory.createRadioButton("Cnd.srch_mode_SHIP_ACT");
		p.Cnd_srch_mode_SLS_ACT = p.beansFactory.createRadioButton("Cnd.srch_mode_SLS_ACT");
		p.Cnd_ex_im_not_comp_flg = p.beansFactory.createCheckBox("Cnd.ex_im_not_comp_flg");
		p.Cnd_ex_im_comp_flg = p.beansFactory.createCheckBox("Cnd.ex_im_comp_flg");
		p.Cnd_purc_im_not_comp_flg = p.beansFactory.createCheckBox("Cnd.purc_im_not_comp_flg");
		p.Cnd_purc_im_comp_flg = p.beansFactory.createCheckBox("Cnd.purc_im_comp_flg");
		p.Cnd_iv_not_reg_flg = p.beansFactory.createCheckBox("Cnd.iv_not_reg_flg");
		p.Cnd_iv_reg_flg = p.beansFactory.createCheckBox("Cnd.iv_reg_flg");
		p.Cnd_pl_not_reg_flg = p.beansFactory.createCheckBox("Cnd.pl_not_reg_flg");
		p.Cnd_pl_reg_flg = p.beansFactory.createCheckBox("Cnd.pl_reg_flg");
		p.Cnd_pl_skip_flg = p.beansFactory.createCheckBox("Cnd.pl_skip_flg");
		p.Cnd_iv_prnt_yet_flg = p.beansFactory.createCheckBox("Cnd.iv_prnt_yet_flg");
		p.Cnd_iv_prnt_done_flg = p.beansFactory.createCheckBox("Cnd.iv_prnt_done_flg");
		p.Cnd_pl_prnt_yet_flg = p.beansFactory.createCheckBox("Cnd.pl_prnt_yet_flg");
		p.Cnd_pl_prnt_done_flg = p.beansFactory.createCheckBox("Cnd.pl_prnt_done_flg");
		p.Cnd_not_iv_flg = p.beansFactory.createCheckBox("Cnd.not_iv_flg");
		p.Cnd_not_inst_flg = p.beansFactory.createCheckBox("Cnd.not_inst_flg");
		p.Cnd_part_inst_flg = p.beansFactory.createCheckBox("Cnd.part_inst_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_not_ship_flg = p.beansFactory.createCheckBox("Cnd.not_ship_flg");
		p.Cnd_part_ship_flg = p.beansFactory.createCheckBox("Cnd.part_ship_flg");
		p.Cnd_ship_flg = p.beansFactory.createCheckBox("Cnd.ship_flg");
		p.Cnd_not_sls_flg = p.beansFactory.createCheckBox("Cnd.not_sls_flg");
		p.Cnd_sls_flg = p.beansFactory.createCheckBox("Cnd.sls_flg");
		p.Cnd_comp_flg = p.beansFactory.createCheckBox("Cnd.comp_flg");
		p.Cnd_iv_not_comp_flg = p.beansFactory.createCheckBox("Cnd.iv_not_comp_flg");
		p.Cnd_iv_comp_flg = p.beansFactory.createCheckBox("Cnd.iv_comp_flg");
		p.Cnd_sls_cststk_flg = p.beansFactory.createCheckBox("Cnd.sls_cststk_flg");
		p.Cnd_sls_cststk_invalid_flg = p.beansFactory.createCheckBox("Cnd.sls_cststk_invalid_flg");
		p.Cnd_iv_dt_fr_Label = p.beansFactory.createLabel("Cnd.iv_dt_fr_Label");
		p.Cnd_iv_dt_fr = p.beansFactory.createDateField("Cnd.iv_dt_fr");
		p.Cnd_iv_dt_fr.setLabel(p.Cnd_iv_dt_fr_Label);
		p.Cnd_iv_dt_to_Label = p.beansFactory.createLabel("Cnd.iv_dt_to_Label");
		p.Cnd_iv_dt_to = p.beansFactory.createDateField("Cnd.iv_dt_to");
		p.Cnd_iv_dt_to.setLabel(p.Cnd_iv_dt_to_Label);
		p.Cnd_cmpl_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.cmpl_schd_dt_fr_Label");
		p.Cnd_cmpl_schd_dt_fr = p.beansFactory.createDateField("Cnd.cmpl_schd_dt_fr");
		p.Cnd_cmpl_schd_dt_fr.setLabel(p.Cnd_cmpl_schd_dt_fr_Label);
		p.Cnd_cmpl_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.cmpl_schd_dt_to_Label");
		p.Cnd_cmpl_schd_dt_to = p.beansFactory.createDateField("Cnd.cmpl_schd_dt_to");
		p.Cnd_cmpl_schd_dt_to.setLabel(p.Cnd_cmpl_schd_dt_to_Label);
		p.Cnd_cmpl_dt_fr_Label = p.beansFactory.createLabel("Cnd.cmpl_dt_fr_Label");
		p.Cnd_cmpl_dt_fr = p.beansFactory.createDateField("Cnd.cmpl_dt_fr");
		p.Cnd_cmpl_dt_fr.setLabel(p.Cnd_cmpl_dt_fr_Label);
		p.Cnd_cmpl_dt_to_Label = p.beansFactory.createLabel("Cnd.cmpl_dt_to_Label");
		p.Cnd_cmpl_dt_to = p.beansFactory.createDateField("Cnd.cmpl_dt_to");
		p.Cnd_cmpl_dt_to.setLabel(p.Cnd_cmpl_dt_to_Label);
		p.Cnd_ship_fr_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_fr_lg_grp_cd_Label");
		p.Cnd_ship_fr_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_fr_lg_grp_cd");
		p.Cnd_ship_fr_lg_grp_cd.setLabel(p.Cnd_ship_fr_lg_grp_cd_Label);
		p.Cnd_ship_fr_lg_grp_nm = p.beansFactory.createTextField("Cnd.ship_fr_lg_grp_nm");
		p.Cnd_tdlv_cd_Label = p.beansFactory.createLabel("Cnd.tdlv_cd_Label");
		p.Cnd_tdlv_cd = p.beansFactory.createTextField("Cnd.tdlv_cd");
		p.Cnd_tdlv_cd.setLabel(p.Cnd_tdlv_cd_Label);
		p.Cnd_tdlv_nm = p.beansFactory.createTextField("Cnd.tdlv_nm");
		p.Cnd_dlv_id_typ_Label = p.beansFactory.createLabel("Cnd.dlv_id_typ_Label");
		p.Cnd_dlv_id_typ = p.beansFactory.createTextComboBox("Cnd.dlv_id_typ");
		p.Cnd_dlv_id_typ.setLabel(p.Cnd_dlv_id_typ_Label);
		p.Cnd_dlv_id_typ_nm = p.beansFactory.createTextField("Cnd.dlv_id_typ_nm");
		p.Cnd_dlv_id_cd_Label = p.beansFactory.createLabel("Cnd.dlv_id_cd_Label");
		p.Cnd_dlv_id_cd = p.beansFactory.createTextField("Cnd.dlv_id_cd");
		p.Cnd_dlv_id_cd.setLabel(p.Cnd_dlv_id_cd_Label);
		p.Cnd_dlv_id_nm = p.beansFactory.createTextField("Cnd.dlv_id_nm");
		p.Cnd_ship_rqst_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_typ_Label");
		p.Cnd_ship_rqst_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_rqst_id_typ");
		p.Cnd_ship_rqst_id_typ.setLabel(p.Cnd_ship_rqst_id_typ_Label);
		p.Cnd_ship_rqst_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_typ_nm");
		p.Cnd_ship_rqst_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_cd_Label");
		p.Cnd_ship_rqst_id_cd = p.beansFactory.createTextField("Cnd.ship_rqst_id_cd");
		p.Cnd_ship_rqst_id_cd.setLabel(p.Cnd_ship_rqst_id_cd_Label);
		p.Cnd_ship_rqst_id_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_nm");
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextField("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_ship_rqst_no_Label = p.beansFactory.createLabel("Cnd.ship_rqst_no_Label");
		p.Cnd_ship_rqst_no = p.beansFactory.createTextField("Cnd.ship_rqst_no");
		p.Cnd_ship_rqst_no.setLabel(p.Cnd_ship_rqst_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_ship_inst_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_no_Label");
		p.Cnd_ship_inst_no = p.beansFactory.createTextField("Cnd.ship_inst_no");
		p.Cnd_ship_inst_no.setLabel(p.Cnd_ship_inst_no_Label);
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_ship_loc_cd_Label = p.beansFactory.createLabel("Cnd.ship_loc_cd_Label");
		p.Cnd_ship_loc_cd = p.beansFactory.createTextField("Cnd.ship_loc_cd");
		p.Cnd_ship_loc_cd.setLabel(p.Cnd_ship_loc_cd_Label);
		p.Cnd_ship_loc_nm = p.beansFactory.createTextField("Cnd.ship_loc_nm");
		p.Cnd_ship_site_cd_Label = p.beansFactory.createLabel("Cnd.ship_site_cd_Label");
		p.Cnd_ship_site_cd = p.beansFactory.createTextComboBox("Cnd.ship_site_cd");
		p.Cnd_ship_site_cd.setLabel(p.Cnd_ship_site_cd_Label);
		p.Cnd_ship_site_nm = p.beansFactory.createTextField("Cnd.ship_site_nm");
		p.Cnd_iv_rmrks_Label = p.beansFactory.createLabel("Cnd.iv_rmrks_Label");
		p.Cnd_iv_rmrks = p.beansFactory.createTextField("Cnd.iv_rmrks");
		p.Cnd_iv_rmrks.setLabel(p.Cnd_iv_rmrks_Label);
		p.Cnd_iv_d_rmrks_Label = p.beansFactory.createLabel("Cnd.iv_d_rmrks_Label");
		p.Cnd_iv_d_rmrks = p.beansFactory.createTextField("Cnd.iv_d_rmrks");
		p.Cnd_iv_d_rmrks.setLabel(p.Cnd_iv_d_rmrks_Label);
		p.Cnd_pl_rmrks_Label = p.beansFactory.createLabel("Cnd.pl_rmrks_Label");
		p.Cnd_pl_rmrks = p.beansFactory.createTextField("Cnd.pl_rmrks");
		p.Cnd_pl_rmrks.setLabel(p.Cnd_pl_rmrks_Label);
		p.Cnd_iv_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.iv_intr_rmrks_Label");
		p.Cnd_iv_intr_rmrks = p.beansFactory.createTextField("Cnd.iv_intr_rmrks");
		p.Cnd_iv_intr_rmrks.setLabel(p.Cnd_iv_intr_rmrks_Label);
		p.Cnd_iv_d_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.iv_d_intr_rmrks_Label");
		p.Cnd_iv_d_intr_rmrks = p.beansFactory.createTextField("Cnd.iv_d_intr_rmrks");
		p.Cnd_iv_d_intr_rmrks.setLabel(p.Cnd_iv_d_intr_rmrks_Label);
		p.Cnd_iv_sub_char1_Label = p.beansFactory.createLabel("Cnd.iv_sub_char1_Label");
		p.Cnd_iv_sub_char1 = p.beansFactory.createTextField("Cnd.iv_sub_char1");
		p.Cnd_iv_sub_char1.setLabel(p.Cnd_iv_sub_char1_Label);
		p.Cnd_iv_sub_char2_Label = p.beansFactory.createLabel("Cnd.iv_sub_char2_Label");
		p.Cnd_iv_sub_char2 = p.beansFactory.createTextField("Cnd.iv_sub_char2");
		p.Cnd_iv_sub_char2.setLabel(p.Cnd_iv_sub_char2_Label);
		p.Cnd_iv_sub_char3_Label = p.beansFactory.createLabel("Cnd.iv_sub_char3_Label");
		p.Cnd_iv_sub_char3 = p.beansFactory.createTextField("Cnd.iv_sub_char3");
		p.Cnd_iv_sub_char3.setLabel(p.Cnd_iv_sub_char3_Label);
		p.Cnd_iv_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.iv_d_sub_char1_Label");
		p.Cnd_iv_d_sub_char1 = p.beansFactory.createTextField("Cnd.iv_d_sub_char1");
		p.Cnd_iv_d_sub_char1.setLabel(p.Cnd_iv_d_sub_char1_Label);
		p.Cnd_iv_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.iv_d_sub_char2_Label");
		p.Cnd_iv_d_sub_char2 = p.beansFactory.createTextField("Cnd.iv_d_sub_char2");
		p.Cnd_iv_d_sub_char2.setLabel(p.Cnd_iv_d_sub_char2_Label);
		p.Cnd_iv_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.iv_d_sub_char3_Label");
		p.Cnd_iv_d_sub_char3 = p.beansFactory.createTextField("Cnd.iv_d_sub_char3");
		p.Cnd_iv_d_sub_char3.setLabel(p.Cnd_iv_d_sub_char3_Label);
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
		p.Cnd_inc_past_flg = p.beansFactory.createCheckBox("Cnd.inc_past_flg");
	}

	/**
	 * [ShipRqstIdCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipRqstIdCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ShipRqstIdCndPanel = p.beansFactory.createPanel("ShipRqstIdCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_pl_skip_flg = p.beansFactory.createTableColumn("Rslt.pl_skip_flg", MCColumnType.CHECK);
		p.columnRslt_ex_im_comp_flg = p.beansFactory.createTableColumn("Rslt.ex_im_comp_flg", MCColumnType.CHECK);
		p.columnRslt_non_cmpl_flg = p.beansFactory.createTableColumn("Rslt.non_cmpl_flg", MCColumnType.CHECK);
		p.columnRslt_iv_ship_flg = p.beansFactory.createTableColumn("Rslt.iv_ship_flg", MCColumnType.CHECK);
		p.columnRslt_iv_prnt_flg = p.beansFactory.createTableColumn("Rslt.iv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_pl_prnt_flg = p.beansFactory.createTableColumn("Rslt.pl_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_iv_comp_flg = p.beansFactory.createTableColumn("Rslt.iv_comp_flg", MCColumnType.CHECK);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_iv_rev = p.beansFactory.createTableColumn("Rslt.iv_rev", MCColumnType.NUMBER);
		p.columnRslt_iv_d_no = p.beansFactory.createTableColumn("Rslt.iv_d_no", MCColumnType.TEXT);
		p.columnRslt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_cmpl_schd_dt = p.beansFactory.createTableColumn("Rslt.cmpl_schd_dt", MCColumnType.DATE);
		p.columnRslt_trd_schd_dt = p.beansFactory.createTableColumn("Rslt.trd_schd_dt", MCColumnType.DATE);
		p.columnRslt_cmpl_dt = p.beansFactory.createTableColumn("Rslt.cmpl_dt", MCColumnType.DATE);
		p.columnRslt_iv_dt = p.beansFactory.createTableColumn("Rslt.iv_dt", MCColumnType.DATE);
		p.columnRslt_sls_cststk_flg = p.beansFactory.createTableColumn("Rslt.sls_cststk_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_typ = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_typ", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_cd = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_nm", MCColumnType.TEXT);
		p.columnRslt_via_dlv_typ = p.beansFactory.createTableColumn("Rslt.via_dlv_typ", MCColumnType.TEXT);
		p.columnRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("Rslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trnspt_cd = p.beansFactory.createTableColumn("Rslt.trnspt_cd", MCColumnType.TEXT);
		p.columnRslt_trnspt_nm = p.beansFactory.createTableColumn("Rslt.trnspt_nm", MCColumnType.TEXT);
		p.columnRslt_vssl_flght = p.beansFactory.createTableColumn("Rslt.vssl_flght", MCColumnType.TEXT);
		p.columnRslt_load_port_cd = p.beansFactory.createTableColumn("Rslt.load_port_cd", MCColumnType.TEXT);
		p.columnRslt_load_port_nm = p.beansFactory.createTableColumn("Rslt.load_port_nm", MCColumnType.TEXT);
		p.columnRslt_etd_dt = p.beansFactory.createTableColumn("Rslt.etd_dt", MCColumnType.DATE);
		p.columnRslt_dschrg_port_cd = p.beansFactory.createTableColumn("Rslt.dschrg_port_cd", MCColumnType.TEXT);
		p.columnRslt_dschrg_port_nm = p.beansFactory.createTableColumn("Rslt.dschrg_port_nm", MCColumnType.TEXT);
		p.columnRslt_eta_dt = p.beansFactory.createTableColumn("Rslt.eta_dt", MCColumnType.DATE);
		p.columnRslt_via_port_cd = p.beansFactory.createTableColumn("Rslt.via_port_cd", MCColumnType.TEXT);
		p.columnRslt_via_port_nm = p.beansFactory.createTableColumn("Rslt.via_port_nm", MCColumnType.TEXT);
		p.columnRslt_via_schd_dt = p.beansFactory.createTableColumn("Rslt.via_schd_dt", MCColumnType.DATE);
		p.columnRslt_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_ttl_net_wt = p.beansFactory.createTableColumn("Rslt.ttl_net_wt", MCColumnType.NUMBER);
		p.columnRslt_ttl_grss_wt = p.beansFactory.createTableColumn("Rslt.ttl_grss_wt", MCColumnType.NUMBER);
		p.columnRslt_ttl_dim = p.beansFactory.createTableColumn("Rslt.ttl_dim", MCColumnType.NUMBER);
		p.columnRslt_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_case_mrk1 = p.beansFactory.createTableColumn("Rslt.case_mrk1", MCColumnType.TEXT);
		p.columnRslt_case_mrk2 = p.beansFactory.createTableColumn("Rslt.case_mrk2", MCColumnType.TEXT);
		p.columnRslt_case_mrk3 = p.beansFactory.createTableColumn("Rslt.case_mrk3", MCColumnType.TEXT);
		p.columnRslt_case_mrk4 = p.beansFactory.createTableColumn("Rslt.case_mrk4", MCColumnType.TEXT);
		p.columnRslt_case_mrk5 = p.beansFactory.createTableColumn("Rslt.case_mrk5", MCColumnType.TEXT);
		p.columnRslt_case_mrk6 = p.beansFactory.createTableColumn("Rslt.case_mrk6", MCColumnType.TEXT);
		p.columnRslt_bill_basis_dt = p.beansFactory.createTableColumn("Rslt.bill_basis_dt", MCColumnType.DATE);
		p.columnRslt_rcv_schd_dt = p.beansFactory.createTableColumn("Rslt.rcv_schd_dt", MCColumnType.DATE);
		p.columnRslt_lc_no = p.beansFactory.createTableColumn("Rslt.lc_no", MCColumnType.TEXT);
		p.columnRslt_lc_dt = p.beansFactory.createTableColumn("Rslt.lc_dt", MCColumnType.DATE);
		p.columnRslt_lc_rmrks = p.beansFactory.createTableColumn("Rslt.lc_rmrks", MCColumnType.TEXT);
		p.columnRslt_bl_no = p.beansFactory.createTableColumn("Rslt.bl_no", MCColumnType.TEXT);
		p.columnRslt_bl_dt = p.beansFactory.createTableColumn("Rslt.bl_dt", MCColumnType.DATE);
		p.columnRslt_bl_rmrks = p.beansFactory.createTableColumn("Rslt.bl_rmrks", MCColumnType.TEXT);
		p.columnRslt_iv_rmrks = p.beansFactory.createTableColumn("Rslt.iv_rmrks", MCColumnType.TEXT);
		p.columnRslt_pl_reg_flg = p.beansFactory.createTableColumn("Rslt.pl_reg_flg", MCColumnType.CHECK);
		p.columnRslt_pl_rmrks = p.beansFactory.createTableColumn("Rslt.pl_rmrks", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_pre_rcpt_iv_flg = p.beansFactory.createTableColumn("Rslt.pre_rcpt_iv_flg", MCColumnType.CHECK);
		p.columnRslt_iv_reg_flg = p.beansFactory.createTableColumn("Rslt.iv_reg_flg", MCColumnType.CHECK);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_no = p.beansFactory.createTableColumn("Rslt.purc_schd_no", MCColumnType.TEXT);
		p.columnRslt_purc_cmpl_flg = p.beansFactory.createTableColumn("Rslt.purc_cmpl_flg", MCColumnType.CHECK);
		p.columnRslt_iv_intr_rmrks = p.beansFactory.createTableColumn("Rslt.iv_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_iv_sub_char1 = p.beansFactory.createTableColumn("Rslt.iv_sub_char1", MCColumnType.TEXT);
		p.columnRslt_iv_sub_char2 = p.beansFactory.createTableColumn("Rslt.iv_sub_char2", MCColumnType.TEXT);
		p.columnRslt_iv_sub_char3 = p.beansFactory.createTableColumn("Rslt.iv_sub_char3", MCColumnType.TEXT);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_no = p.beansFactory.createTableColumn("Rslt.ship_rqst_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_d_no = p.beansFactory.createTableColumn("Rslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_no = p.beansFactory.createTableColumn("Rslt.ship_inst_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_no = p.beansFactory.createTableColumn("Rslt.ship_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_act_no = p.beansFactory.createTableColumn("Rslt.ship_act_no", MCColumnType.TEXT);
		p.columnRslt_ship_act_d_no = p.beansFactory.createTableColumn("Rslt.ship_act_d_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_no = p.beansFactory.createTableColumn("Rslt.sls_act_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_d_no = p.beansFactory.createTableColumn("Rslt.sls_act_d_no", MCColumnType.TEXT);
		p.columnRslt_dlv_rqst_dt = p.beansFactory.createTableColumn("Rslt.dlv_rqst_dt", MCColumnType.DATE);
		p.columnRslt_dlv_rqst_hm = p.beansFactory.createTableColumn("Rslt.dlv_rqst_hm", MCColumnType.DATE);
		p.columnRslt_bndl_flg = p.beansFactory.createTableColumn("Rslt.bndl_flg", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_cntry_org_cd = p.beansFactory.createTableColumn("Rslt.cntry_org_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_org_nm = p.beansFactory.createTableColumn("Rslt.cntry_org_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_loc_cd = p.beansFactory.createTableColumn("Rslt.ship_loc_cd", MCColumnType.TEXT);
		p.columnRslt_ship_loc_nm = p.beansFactory.createTableColumn("Rslt.ship_loc_nm", MCColumnType.TEXT);
		p.columnRslt_ship_str_ln_cd = p.beansFactory.createTableColumn("Rslt.ship_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_ship_str_ln_nm = p.beansFactory.createTableColumn("Rslt.ship_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_ship_site_cd = p.beansFactory.createTableColumn("Rslt.ship_site_cd", MCColumnType.TEXT);
		p.columnRslt_ship_site_nm = p.beansFactory.createTableColumn("Rslt.ship_site_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_dscnt_rsn_cd = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_dscnt_rsn_nm = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_rsn_cd = p.beansFactory.createTableColumn("Rslt.rsn_cd", MCColumnType.TEXT);
		p.columnRslt_rsn_nm = p.beansFactory.createTableColumn("Rslt.rsn_nm", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sls_usr_cd = p.beansFactory.createTableColumn("Rslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnRslt_sls_usr_nm = p.beansFactory.createTableColumn("Rslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_nm = p.beansFactory.createTableColumn("Rslt.ar_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_manual_add_flg = p.beansFactory.createTableColumn("Rslt.manual_add_flg", MCColumnType.CHECK);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_iv_d_rmrks = p.beansFactory.createTableColumn("Rslt.iv_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_iv_d_intr_rmrks = p.beansFactory.createTableColumn("Rslt.iv_d_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_iv_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.iv_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_iv_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.iv_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_iv_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.iv_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.ship_inst_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.ship_inst_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.ship_inst_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_ship_act_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.ship_act_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_ship_act_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.ship_act_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_ship_act_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.ship_act_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_iv_ship_act_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.iv_ship_act_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_iv_ship_act_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.iv_ship_act_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_iv_ship_act_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.iv_ship_act_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_sls_act_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.sls_act_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_sls_act_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.sls_act_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_sls_act_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.sls_act_d_sub_char3", MCColumnType.TEXT);
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
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1730 = p.beansFactory.createButton("Btn.open_MSBEP1730", "open");
		p.Btn_open_MSBEP1750 = p.beansFactory.createButton("Btn.open_MSBEP1750", "open");
		p.Btn_open_MSBEP1760 = p.beansFactory.createButton("Btn.open_MSBEP1760", "open");
		p.Btn_prnt_iv = p.beansFactory.createButton("Btn.prnt_iv", "prnt");
		p.Btn_prnt_pl = p.beansFactory.createButton("Btn.prnt_pl", "prnt");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_IvSrch p) {
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
	protected static void jbInitSrchMode(MSBEP_IvSrch p) {
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
	protected static void jbInitTop(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
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
	protected static void jbInitFold(MSBEP_IvSrch p) {
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
	protected static void jbInitTab1(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.ExImPanel, null);
		p.Tab1Panel.setLastBeans(p.ExImPanel);
		p.ExImPanel.setNextBeans(p.PurcImPanel);
		p.Tab1Panel.add(p.PurcImPanel, null);
		p.PurcImPanel.setNextBeans(p.IvRegPanel);
		p.Tab1Panel.add(p.IvRegPanel, null);
		p.IvRegPanel.setNextBeans(p.PlRegPanel);
		p.Tab1Panel.add(p.PlRegPanel, null);
		p.PlRegPanel.setNextBeans(p.IvPrntPanel);
		p.Tab1Panel.add(p.IvPrntPanel, null);
		p.IvPrntPanel.setNextBeans(p.PlPrntPanel);
		p.Tab1Panel.add(p.PlPrntPanel, null);
		p.PlPrntPanel.setNextBeans(p.PrStsPanel);
		p.Tab1Panel.add(p.PrStsPanel, null);
		p.PrStsPanel.setNextBeans(p.IvImPanel);
		p.Tab1Panel.add(p.IvImPanel, null);
		p.IvImPanel.setNextBeans(p.SlsCststkPanel);
		p.Tab1Panel.add(p.SlsCststkPanel, null);
		p.SlsCststkPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ShipRqstIdCndPanel, null);
		p.Tab2Panel.setLastBeans(p.ShipRqstIdCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_IvSrch p) {
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
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [ExIm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExIm(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ExImPanel.setBorder(p.ExImTitledBorder);
		p.ExImPanel.setValueCheck(false);
		p.ExImPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ExImPanel.setLayoutPosition("NWN");
		// ブロックの項目の初期化
	}

	/**
	 * [PurcIm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPurcIm(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PurcImPanel.setBorder(p.PurcImTitledBorder);
		p.PurcImPanel.setValueCheck(false);
		p.PurcImPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PurcImPanel.setLayoutPosition("NWNXC");
		// ブロックの項目の初期化
	}

	/**
	 * [IvReg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIvReg(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.IvRegPanel.setBorder(p.IvRegTitledBorder);
		p.IvRegPanel.setValueCheck(false);
		p.IvRegPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvRegPanel.setLayoutPosition("NWNXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PlReg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPlReg(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PlRegPanel.setBorder(p.PlRegTitledBorder);
		p.PlRegPanel.setValueCheck(false);
		p.PlRegPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PlRegPanel.setLayoutPosition("NWNXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [IvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIvPrnt(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.IvPrntPanel.setBorder(p.IvPrntTitledBorder);
		p.IvPrntPanel.setValueCheck(false);
		p.IvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvPrntPanel.setLayoutPosition("NWNXCXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PlPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPlPrnt(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PlPrntPanel.setBorder(p.PlPrntTitledBorder);
		p.PlPrntPanel.setValueCheck(false);
		p.PlPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PlPrntPanel.setLayoutPosition("NWNXCXCXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrSts(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.PrStsPanel.setBorder(p.PrStsTitledBorder);
		p.PrStsPanel.setValueCheck(false);
		p.PrStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrStsPanel.setLayoutPosition("NWS");
		// ブロックの項目の初期化
	}

	/**
	 * [IvIm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIvIm(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.IvImPanel.setBorder(p.IvImTitledBorder);
		p.IvImPanel.setValueCheck(false);
		p.IvImPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvImPanel.setLayoutPosition("NWSXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SlsCststk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlsCststk(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.SlsCststkPanel.setBorder(p.SlsCststkTitledBorder);
		p.SlsCststkPanel.setValueCheck(false);
		p.SlsCststkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SlsCststkPanel.setLayoutPosition("NWSXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ope_META);
		p.SrchModePanel.setLastBeans(p.Cnd_srch_mode_Group);
		p.Cnd_srch_mode_Group.setFirstBeans(p.Cnd_srch_mode_HDR);
		p.Cnd_srch_mode_HDR.setActionCommand("0");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_HDR);
		p.SrchModePanel.add(p.Cnd_srch_mode_HDR);
		p.Cnd_srch_mode_HDR.setNextBeans(p.Cnd_srch_mode_DTL);
		p.Cnd_srch_mode_DTL.setActionCommand("1");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_DTL);
		p.SrchModePanel.add(p.Cnd_srch_mode_DTL);
		p.Cnd_srch_mode_DTL.setNextBeans(p.Cnd_srch_mode_SHIP_INST);
		p.Cnd_srch_mode_SHIP_INST.setActionCommand("2");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_SHIP_INST);
		p.SrchModePanel.add(p.Cnd_srch_mode_SHIP_INST);
		p.Cnd_srch_mode_SHIP_INST.setNextBeans(p.Cnd_srch_mode_SHIP_ACT);
		p.Cnd_srch_mode_SHIP_ACT.setActionCommand("3");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_SHIP_ACT);
		p.SrchModePanel.add(p.Cnd_srch_mode_SHIP_ACT);
		p.Cnd_srch_mode_SHIP_ACT.setNextBeans(p.Cnd_srch_mode_SLS_ACT);
		p.Cnd_srch_mode_SLS_ACT.setActionCommand("4");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_SLS_ACT);
		p.SrchModePanel.add(p.Cnd_srch_mode_SLS_ACT);
		p.Cnd_srch_mode_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.srch_mode_META);
		p.ExImPanel.add(p.Cnd_ex_im_not_comp_flg);
		p.ExImPanel.setLastBeans(p.Cnd_ex_im_not_comp_flg);
		p.Cnd_ex_im_not_comp_flg.setNextBeans(p.Cnd_ex_im_comp_flg);
		p.Cnd_ex_im_not_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ex_im_not_comp_flg_META);
		p.ExImPanel.add(p.Cnd_ex_im_comp_flg);
		p.Cnd_ex_im_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ex_im_comp_flg_META);
		p.PurcImPanel.add(p.Cnd_purc_im_not_comp_flg);
		p.PurcImPanel.setLastBeans(p.Cnd_purc_im_not_comp_flg);
		p.Cnd_purc_im_not_comp_flg.setNextBeans(p.Cnd_purc_im_comp_flg);
		p.Cnd_purc_im_not_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.purc_im_not_comp_flg_META);
		p.PurcImPanel.add(p.Cnd_purc_im_comp_flg);
		p.Cnd_purc_im_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.purc_im_comp_flg_META);
		p.IvRegPanel.add(p.Cnd_iv_not_reg_flg);
		p.IvRegPanel.setLastBeans(p.Cnd_iv_not_reg_flg);
		p.Cnd_iv_not_reg_flg.setNextBeans(p.Cnd_iv_reg_flg);
		p.Cnd_iv_not_reg_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_not_reg_flg_META);
		p.IvRegPanel.add(p.Cnd_iv_reg_flg);
		p.Cnd_iv_reg_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_reg_flg_META);
		p.PlRegPanel.add(p.Cnd_pl_not_reg_flg);
		p.PlRegPanel.setLastBeans(p.Cnd_pl_not_reg_flg);
		p.Cnd_pl_not_reg_flg.setNextBeans(p.Cnd_pl_reg_flg);
		p.Cnd_pl_not_reg_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.pl_not_reg_flg_META);
		p.PlRegPanel.add(p.Cnd_pl_reg_flg);
		p.Cnd_pl_reg_flg.setNextBeans(p.Cnd_pl_skip_flg);
		p.Cnd_pl_reg_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.pl_reg_flg_META);
		p.PlRegPanel.add(p.Cnd_pl_skip_flg);
		p.Cnd_pl_skip_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.pl_skip_flg_META);
		p.IvPrntPanel.add(p.Cnd_iv_prnt_yet_flg);
		p.IvPrntPanel.setLastBeans(p.Cnd_iv_prnt_yet_flg);
		p.Cnd_iv_prnt_yet_flg.setNextBeans(p.Cnd_iv_prnt_done_flg);
		p.Cnd_iv_prnt_yet_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_prnt_yet_flg_META);
		p.IvPrntPanel.add(p.Cnd_iv_prnt_done_flg);
		p.Cnd_iv_prnt_done_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_prnt_done_flg_META);
		p.PlPrntPanel.add(p.Cnd_pl_prnt_yet_flg);
		p.PlPrntPanel.setLastBeans(p.Cnd_pl_prnt_yet_flg);
		p.Cnd_pl_prnt_yet_flg.setNextBeans(p.Cnd_pl_prnt_done_flg);
		p.Cnd_pl_prnt_yet_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.pl_prnt_yet_flg_META);
		p.PlPrntPanel.add(p.Cnd_pl_prnt_done_flg);
		p.Cnd_pl_prnt_done_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.pl_prnt_done_flg_META);
		p.PrStsPanel.add(p.Cnd_not_iv_flg);
		p.PrStsPanel.setLastBeans(p.Cnd_not_iv_flg);
		p.Cnd_not_iv_flg.setNextBeans(p.Cnd_not_inst_flg);
		p.Cnd_not_iv_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.not_iv_flg_META);
		p.PrStsPanel.add(p.Cnd_not_inst_flg);
		p.Cnd_not_inst_flg.setNextBeans(p.Cnd_part_inst_flg);
		p.Cnd_not_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.not_inst_flg_META);
		p.PrStsPanel.add(p.Cnd_part_inst_flg);
		p.Cnd_part_inst_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_part_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.part_inst_flg_META);
		p.PrStsPanel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_not_ship_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.inst_flg_META);
		p.PrStsPanel.add(p.Cnd_not_ship_flg);
		p.Cnd_not_ship_flg.setNextBeans(p.Cnd_part_ship_flg);
		p.Cnd_not_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.not_ship_flg_META);
		p.PrStsPanel.add(p.Cnd_part_ship_flg);
		p.Cnd_part_ship_flg.setNextBeans(p.Cnd_ship_flg);
		p.Cnd_part_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.part_ship_flg_META);
		p.PrStsPanel.add(p.Cnd_ship_flg);
		p.Cnd_ship_flg.setNextBeans(p.Cnd_not_sls_flg);
		p.Cnd_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_flg_META);
		p.PrStsPanel.add(p.Cnd_not_sls_flg);
		p.Cnd_not_sls_flg.setNextBeans(p.Cnd_sls_flg);
		p.Cnd_not_sls_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.not_sls_flg_META);
		p.PrStsPanel.add(p.Cnd_sls_flg);
		p.Cnd_sls_flg.setNextBeans(p.Cnd_comp_flg);
		p.Cnd_sls_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_flg_META);
		p.PrStsPanel.add(p.Cnd_comp_flg);
		p.Cnd_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.comp_flg_META);
		p.IvImPanel.add(p.Cnd_iv_not_comp_flg);
		p.IvImPanel.setLastBeans(p.Cnd_iv_not_comp_flg);
		p.Cnd_iv_not_comp_flg.setNextBeans(p.Cnd_iv_comp_flg);
		p.Cnd_iv_not_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_not_comp_flg_META);
		p.IvImPanel.add(p.Cnd_iv_comp_flg);
		p.Cnd_iv_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_comp_flg_META);
		p.SlsCststkPanel.add(p.Cnd_sls_cststk_flg);
		p.SlsCststkPanel.setLastBeans(p.Cnd_sls_cststk_flg);
		p.Cnd_sls_cststk_flg.setNextBeans(p.Cnd_sls_cststk_invalid_flg);
		p.Cnd_sls_cststk_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_cststk_flg_META);
		p.SlsCststkPanel.add(p.Cnd_sls_cststk_invalid_flg);
		p.Cnd_sls_cststk_invalid_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_cststk_invalid_flg_META);
		p.CndPanel.add(p.Cnd_iv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_iv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_iv_dt_fr);
		p.Cnd_iv_dt_fr.setNextBeans(p.Cnd_iv_dt_to);
		p.Cnd_iv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_dt_fr_META);
		p.Cnd_iv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_iv_dt_to_Label);
		p.CndPanel.add(p.Cnd_iv_dt_to);
		p.Cnd_iv_dt_to.setNextBeans(p.Cnd_cmpl_schd_dt_fr);
		p.Cnd_iv_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_dt_to_META);
		p.Cnd_iv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_fr);
		p.Cnd_cmpl_schd_dt_fr.setNextBeans(p.Cnd_cmpl_schd_dt_to);
		p.Cnd_cmpl_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cmpl_schd_dt_fr_META);
		p.Cnd_cmpl_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_to);
		p.Cnd_cmpl_schd_dt_to.setNextBeans(p.Cnd_cmpl_dt_fr);
		p.Cnd_cmpl_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cmpl_schd_dt_to_META);
		p.Cnd_cmpl_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cmpl_dt_fr_Label);
		p.CndPanel.add(p.Cnd_cmpl_dt_fr);
		p.Cnd_cmpl_dt_fr.setNextBeans(p.Cnd_cmpl_dt_to);
		p.Cnd_cmpl_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cmpl_dt_fr_META);
		p.Cnd_cmpl_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cmpl_dt_to_Label);
		p.CndPanel.add(p.Cnd_cmpl_dt_to);
		p.Cnd_cmpl_dt_to.setNextBeans(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.Cnd_cmpl_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cmpl_dt_to_META);
		p.Cnd_cmpl_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.Cnd_dlv_rqst_dt_p_PPanel.setNextBeans(p.Cnd_ship_fr_lg_grp_cd);
		p.Cnd_ship_fr_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_fr_lg_grp_cd, true);
		p.Cnd_ship_fr_lg_grp_cd.setLinkBeans(p.Cnd_ship_fr_lg_grp_nm);
		p.CndPanel.add(p.Cnd_ship_fr_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_fr_lg_grp_cd);
		p.Cnd_ship_fr_lg_grp_cd.setNextBeans(p.Cnd_ship_fr_lg_grp_nm);
		p.Cnd_ship_fr_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_fr_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_fr_lg_grp_nm);
		p.Cnd_ship_fr_lg_grp_nm.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_ship_fr_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_fr_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_fr_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_dlv_id_typ);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.tdlv_nm_META);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.dlv_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.dlv_id_cd_META);
		p.Cnd_dlv_id_cd.addLinkBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_ship_rqst_id_typ);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.Cnd_ship_rqst_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_typ, true);
		p.Cnd_ship_rqst_id_typ.setLinkBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ);
		p.Cnd_ship_rqst_id_typ.setNextBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_rqst_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ_nm.setNextBeans(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_rqst_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_cd.setNextBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_rqst_id_cd_META);
		p.Cnd_ship_rqst_id_cd.addLinkBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_nm.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_ship_rqst_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_rqst_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_nm, true);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_iv_no);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_ship_rqst_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_ship_rqst_no_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_no);
		p.Cnd_ship_rqst_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_ship_rqst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_rqst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_ship_inst_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_no);
		p.Cnd_ship_inst_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ship_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_inst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_no, true);
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
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_ship_loc_cd);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.cst_itm_nm_META);
		p.CndPanel.add(p.Cnd_ship_loc_cd_Label);
		p.CndPanel.add(p.Cnd_ship_loc_cd);
		p.Cnd_ship_loc_cd.setNextBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_loc_cd_META);
		p.Cnd_ship_loc_cd.addLinkBeans(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_loc_cd, true);
		p.CndPanel.add(p.Cnd_ship_loc_nm);
		p.Cnd_ship_loc_nm.setNextBeans(p.Cnd_ship_site_cd);
		p.Cnd_ship_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_loc_nm, true);
		p.Cnd_ship_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_site_cd, true);
		p.Cnd_ship_site_cd.setLinkBeans(p.Cnd_ship_site_nm);
		p.CndPanel.add(p.Cnd_ship_site_cd_Label);
		p.CndPanel.add(p.Cnd_ship_site_cd);
		p.Cnd_ship_site_cd.setNextBeans(p.Cnd_ship_site_nm);
		p.Cnd_ship_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_site_cd_META);
		p.CndPanel.add(p.Cnd_ship_site_nm);
		p.Cnd_ship_site_nm.setNextBeans(p.Cnd_iv_rmrks);
		p.Cnd_ship_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.ship_site_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_site_nm, true);
		p.CndPanel.add(p.Cnd_iv_rmrks_Label);
		p.CndPanel.add(p.Cnd_iv_rmrks);
		p.Cnd_iv_rmrks.setNextBeans(p.Cnd_iv_d_rmrks);
		p.Cnd_iv_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_rmrks_META);
		p.setPluralValueEnable(p.Cnd_iv_rmrks, true);
		p.CndPanel.add(p.Cnd_iv_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_iv_d_rmrks);
		p.Cnd_iv_d_rmrks.setNextBeans(p.Cnd_pl_rmrks);
		p.Cnd_iv_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_iv_d_rmrks, true);
		p.CndPanel.add(p.Cnd_pl_rmrks_Label);
		p.CndPanel.add(p.Cnd_pl_rmrks);
		p.Cnd_pl_rmrks.setNextBeans(p.Cnd_iv_intr_rmrks);
		p.Cnd_pl_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.pl_rmrks_META);
		p.setPluralValueEnable(p.Cnd_pl_rmrks, true);
		p.CndPanel.add(p.Cnd_iv_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_iv_intr_rmrks);
		p.Cnd_iv_intr_rmrks.setNextBeans(p.Cnd_iv_d_intr_rmrks);
		p.Cnd_iv_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_iv_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_iv_d_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_iv_d_intr_rmrks);
		p.Cnd_iv_d_intr_rmrks.setNextBeans(p.Cnd_iv_sub_char1);
		p.Cnd_iv_d_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_d_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_iv_d_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_iv_sub_char1_Label);
		p.CndPanel.add(p.Cnd_iv_sub_char1);
		p.Cnd_iv_sub_char1.setNextBeans(p.Cnd_iv_sub_char2);
		p.Cnd_iv_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_iv_sub_char1, true);
		p.CndPanel.add(p.Cnd_iv_sub_char2_Label);
		p.CndPanel.add(p.Cnd_iv_sub_char2);
		p.Cnd_iv_sub_char2.setNextBeans(p.Cnd_iv_sub_char3);
		p.Cnd_iv_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_iv_sub_char2, true);
		p.CndPanel.add(p.Cnd_iv_sub_char3_Label);
		p.CndPanel.add(p.Cnd_iv_sub_char3);
		p.Cnd_iv_sub_char3.setNextBeans(p.Cnd_iv_d_sub_char1);
		p.Cnd_iv_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_iv_sub_char3, true);
		p.CndPanel.add(p.Cnd_iv_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_iv_d_sub_char1);
		p.Cnd_iv_d_sub_char1.setNextBeans(p.Cnd_iv_d_sub_char2);
		p.Cnd_iv_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_iv_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_iv_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_iv_d_sub_char2);
		p.Cnd_iv_d_sub_char2.setNextBeans(p.Cnd_iv_d_sub_char3);
		p.Cnd_iv_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_iv_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_iv_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_iv_d_sub_char3);
		p.Cnd_iv_d_sub_char3.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_iv_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.iv_d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_iv_d_sub_char3, true);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setNextBeans(p.Cnd_inc_past_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.inc_can_flg_META);
		p.CndPanel.add(p.Cnd_inc_past_flg);
		p.Cnd_inc_past_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1770.CndR.inc_past_flg_META);
		p.ShipRqstIdCndPanel.add(p.Cnd_ship_rqst_id_grp_p_PPanel);
		p.ShipRqstIdCndPanel.setLastBeans(p.Cnd_ship_rqst_id_grp_p_PPanel);
		p.DlvCndPanel.add(p.Cnd_dlv_id_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_id_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [ShipRqstIdCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipRqstIdCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ShipRqstIdCndPanel.setValueCheck(false);
		p.ShipRqstIdCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ShipRqstIdCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_IvSrch p) {
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
	protected static void jbInitRPnl(MSBEP_IvSrch p) {
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
	protected static void jbInitRslt(MSBEP_IvSrch p) {
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
	protected static void jbInitBtn(MSBEP_IvSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1730.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1730);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1730);
		p.Btn_open_MSBEP1730.setNextBeans(p.Btn_open_MSBEP1750);
		p.Btn_open_MSBEP1750.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP1750);
		p.Btn_open_MSBEP1750.setNextBeans(p.Btn_open_MSBEP1760);
		p.Btn_open_MSBEP1760.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBEP1760);
		p.Btn_open_MSBEP1760.setNextBeans(p.Btn_prnt_iv);
		p.Btn_prnt_iv.setIcon("PRINT");
		p.Btn_prnt_iv.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt_iv);
		p.Btn_prnt_iv.setNextBeans(p.Btn_prnt_pl);
		p.Btn_prnt_pl.setIcon("PRINT");
		p.Btn_prnt_pl.setFunctionKey(MCFunctionKey.F23);
		p.BtnPanel.add(p.Btn_prnt_pl);
		p.Btn_prnt_pl.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setNextBeans(p.Btn_select_all);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1770.BtnR.indiv_prnt_flg_META);
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
		MSBEP_IvSrch_MC.mcInitScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitSrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitTop((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitFold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitTab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitTab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitTab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitTab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitPurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitIvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitPlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitIvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitPlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitPrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitIvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitSlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitDlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitCtrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitRPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitRslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.mcInitBtn((MSBEP_IvSrch)this);

		// [HDR]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitHDR_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitHDR_Btn((MSBEP_IvSrch)this);

		// [DTL]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitDTL_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitDTL_Btn((MSBEP_IvSrch)this);

		// [SHIP_INST]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitSHIP__INST_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__INST_Btn((MSBEP_IvSrch)this);

		// [SHIP_ACT]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSHIP__ACT_Btn((MSBEP_IvSrch)this);

		// [SLS_ACT]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitSLS__ACT_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSLS__ACT_Btn((MSBEP_IvSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitSRCH__PRNT_Btn((MSBEP_IvSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBEP_IvSrch_MC.statusInitPRNT_ScreenOpe((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_SrchMode((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Top((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Fold((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Tab1((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Tab2((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Tab3((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Tab4((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_ExIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_PurcIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_IvReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_PlReg((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_IvPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_PlPrnt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_PrSts((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_IvIm((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_SlsCststk((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Cnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_ShipRqstIdCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_DlvCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_ItmCnd((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Ctrl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_RPnl((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Rslt((MSBEP_IvSrch)this);
		MSBEP_IvSrch_MC.statusInitPRNT_Btn((MSBEP_IvSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_IvSrch p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBEP_IvSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_IvSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_IvSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_IvSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_IvSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_IvSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBEP_IvSrch p) {
	}

	/**
	 *  [ExIm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExIm(MSBEP_IvSrch p) {
	}

	/**
	 *  [PurcIm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPurcIm(MSBEP_IvSrch p) {
	}

	/**
	 *  [IvReg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIvReg(MSBEP_IvSrch p) {
	}

	/**
	 *  [PlReg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPlReg(MSBEP_IvSrch p) {
	}

	/**
	 *  [IvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIvPrnt(MSBEP_IvSrch p) {
	}

	/**
	 *  [PlPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPlPrnt(MSBEP_IvSrch p) {
	}

	/**
	 *  [PrSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrSts(MSBEP_IvSrch p) {
	}

	/**
	 *  [IvIm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIvIm(MSBEP_IvSrch p) {
	}

	/**
	 *  [SlsCststk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlsCststk(MSBEP_IvSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_IvSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_srch_mode_Group.addAllListener(p);
		p.Cnd_srch_mode_HDR.addAllListener(p);
		p.Cnd_srch_mode_DTL.addAllListener(p);
		p.Cnd_srch_mode_SHIP_INST.addAllListener(p);
		p.Cnd_srch_mode_SHIP_ACT.addAllListener(p);
		p.Cnd_srch_mode_SLS_ACT.addAllListener(p);
		p.Cnd_ex_im_not_comp_flg.addAllListener(p);
		p.Cnd_ex_im_comp_flg.addAllListener(p);
		p.Cnd_purc_im_not_comp_flg.addAllListener(p);
		p.Cnd_purc_im_comp_flg.addAllListener(p);
		p.Cnd_iv_not_reg_flg.addAllListener(p);
		p.Cnd_iv_reg_flg.addAllListener(p);
		p.Cnd_pl_not_reg_flg.addAllListener(p);
		p.Cnd_pl_reg_flg.addAllListener(p);
		p.Cnd_pl_skip_flg.addAllListener(p);
		p.Cnd_iv_prnt_yet_flg.addAllListener(p);
		p.Cnd_iv_prnt_done_flg.addAllListener(p);
		p.Cnd_pl_prnt_yet_flg.addAllListener(p);
		p.Cnd_pl_prnt_done_flg.addAllListener(p);
		p.Cnd_not_iv_flg.addAllListener(p);
		p.Cnd_not_inst_flg.addAllListener(p);
		p.Cnd_part_inst_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_not_ship_flg.addAllListener(p);
		p.Cnd_part_ship_flg.addAllListener(p);
		p.Cnd_ship_flg.addAllListener(p);
		p.Cnd_not_sls_flg.addAllListener(p);
		p.Cnd_sls_flg.addAllListener(p);
		p.Cnd_comp_flg.addAllListener(p);
		p.Cnd_iv_not_comp_flg.addAllListener(p);
		p.Cnd_iv_comp_flg.addAllListener(p);
		p.Cnd_sls_cststk_flg.addAllListener(p);
		p.Cnd_sls_cststk_invalid_flg.addAllListener(p);
		p.Cnd_iv_dt_fr.setListListener(p);
		p.Cnd_iv_dt_fr.addAllListener(p);
		p.Cnd_iv_dt_to.setListListener(p);
		p.Cnd_iv_dt_to.addAllListener(p);
		p.Cnd_cmpl_schd_dt_fr.setListListener(p);
		p.Cnd_cmpl_schd_dt_fr.addAllListener(p);
		p.Cnd_cmpl_schd_dt_to.setListListener(p);
		p.Cnd_cmpl_schd_dt_to.addAllListener(p);
		p.Cnd_cmpl_dt_fr.setListListener(p);
		p.Cnd_cmpl_dt_fr.addAllListener(p);
		p.Cnd_cmpl_dt_to.setListListener(p);
		p.Cnd_cmpl_dt_to.addAllListener(p);
		p.Cnd_ship_fr_lg_grp_cd.setListListener(p);
		p.Cnd_ship_fr_lg_grp_cd.addAllListener(p);
		p.Cnd_ship_fr_lg_grp_nm.setListListener(p);
		p.Cnd_ship_fr_lg_grp_nm.addAllListener(p);
		p.Cnd_tdlv_cd.setListListener(p);
		p.Cnd_tdlv_cd.addAllListener(p);
		p.Cnd_tdlv_nm.setListListener(p);
		p.Cnd_tdlv_nm.addAllListener(p);
		p.Cnd_dlv_id_typ.setListListener(p);
		p.Cnd_dlv_id_typ.addAllListener(p);
		p.Cnd_dlv_id_typ_nm.setListListener(p);
		p.Cnd_dlv_id_typ_nm.addAllListener(p);
		p.Cnd_dlv_id_cd.setListListener(p);
		p.Cnd_dlv_id_cd.addAllListener(p);
		p.Cnd_dlv_id_nm.setListListener(p);
		p.Cnd_dlv_id_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_typ.setListListener(p);
		p.Cnd_ship_rqst_id_typ.addAllListener(p);
		p.Cnd_ship_rqst_id_typ_nm.setListListener(p);
		p.Cnd_ship_rqst_id_typ_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_cd.setListListener(p);
		p.Cnd_ship_rqst_id_cd.addAllListener(p);
		p.Cnd_ship_rqst_id_nm.setListListener(p);
		p.Cnd_ship_rqst_id_nm.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_ship_rqst_no.setListListener(p);
		p.Cnd_ship_rqst_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_ship_inst_no.setListListener(p);
		p.Cnd_ship_inst_no.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_ship_loc_cd.setListListener(p);
		p.Cnd_ship_loc_cd.addAllListener(p);
		p.Cnd_ship_loc_nm.setListListener(p);
		p.Cnd_ship_loc_nm.addAllListener(p);
		p.Cnd_ship_site_cd.setListListener(p);
		p.Cnd_ship_site_cd.addAllListener(p);
		p.Cnd_ship_site_nm.setListListener(p);
		p.Cnd_ship_site_nm.addAllListener(p);
		p.Cnd_iv_rmrks.setListListener(p);
		p.Cnd_iv_rmrks.addAllListener(p);
		p.Cnd_iv_d_rmrks.setListListener(p);
		p.Cnd_iv_d_rmrks.addAllListener(p);
		p.Cnd_pl_rmrks.setListListener(p);
		p.Cnd_pl_rmrks.addAllListener(p);
		p.Cnd_iv_intr_rmrks.setListListener(p);
		p.Cnd_iv_intr_rmrks.addAllListener(p);
		p.Cnd_iv_d_intr_rmrks.setListListener(p);
		p.Cnd_iv_d_intr_rmrks.addAllListener(p);
		p.Cnd_iv_sub_char1.setListListener(p);
		p.Cnd_iv_sub_char1.addAllListener(p);
		p.Cnd_iv_sub_char2.setListListener(p);
		p.Cnd_iv_sub_char2.addAllListener(p);
		p.Cnd_iv_sub_char3.setListListener(p);
		p.Cnd_iv_sub_char3.addAllListener(p);
		p.Cnd_iv_d_sub_char1.setListListener(p);
		p.Cnd_iv_d_sub_char1.addAllListener(p);
		p.Cnd_iv_d_sub_char2.setListListener(p);
		p.Cnd_iv_d_sub_char2.addAllListener(p);
		p.Cnd_iv_d_sub_char3.setListListener(p);
		p.Cnd_iv_d_sub_char3.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
		p.Cnd_inc_past_flg.addAllListener(p);
	}

	/**
	 *  [ShipRqstIdCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipRqstIdCnd(MSBEP_IvSrch p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBEP_IvSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_IvSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_IvSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_IvSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_IvSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_pl_skip_flg.addAllListener(p);
		p.columnRslt_ex_im_comp_flg.addAllListener(p);
		p.columnRslt_non_cmpl_flg.addAllListener(p);
		p.columnRslt_iv_ship_flg.addAllListener(p);
		p.columnRslt_iv_prnt_flg.addAllListener(p);
		p.columnRslt_pl_prnt_flg.addAllListener(p);
		p.columnRslt_iv_comp_flg.addAllListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_iv_rev.addAllListener(p);
		p.columnRslt_iv_rev.setListListener(p);
		p.columnRslt_iv_d_no.addAllListener(p);
		p.columnRslt_iv_d_no.setListListener(p);
		p.columnRslt_iv_mng_no.addAllListener(p);
		p.columnRslt_iv_mng_no.setListListener(p);
		p.columnRslt_cmpl_schd_dt.addAllListener(p);
		p.columnRslt_cmpl_schd_dt.setListListener(p);
		p.columnRslt_trd_schd_dt.addAllListener(p);
		p.columnRslt_trd_schd_dt.setListListener(p);
		p.columnRslt_cmpl_dt.addAllListener(p);
		p.columnRslt_cmpl_dt.setListListener(p);
		p.columnRslt_iv_dt.addAllListener(p);
		p.columnRslt_iv_dt.setListListener(p);
		p.columnRslt_sls_cststk_flg.addAllListener(p);
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_typ.addAllListener(p);
		p.columnRslt_ship_rqst_id_typ.setListListener(p);
		p.columnRslt_ship_rqst_id_typ_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_typ_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_cd.addAllListener(p);
		p.columnRslt_ship_rqst_id_cd.setListListener(p);
		p.columnRslt_ship_rqst_id_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_nm.setListListener(p);
		p.columnRslt_via_dlv_typ.addAllListener(p);
		p.columnRslt_via_dlv_typ.setListListener(p);
		p.columnRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnRslt_via_dlv_typ_nm.setListListener(p);
		p.columnRslt_trnspt_cd.addAllListener(p);
		p.columnRslt_trnspt_cd.setListListener(p);
		p.columnRslt_trnspt_nm.addAllListener(p);
		p.columnRslt_trnspt_nm.setListListener(p);
		p.columnRslt_vssl_flght.addAllListener(p);
		p.columnRslt_vssl_flght.setListListener(p);
		p.columnRslt_load_port_cd.addAllListener(p);
		p.columnRslt_load_port_cd.setListListener(p);
		p.columnRslt_load_port_nm.addAllListener(p);
		p.columnRslt_load_port_nm.setListListener(p);
		p.columnRslt_etd_dt.addAllListener(p);
		p.columnRslt_etd_dt.setListListener(p);
		p.columnRslt_dschrg_port_cd.addAllListener(p);
		p.columnRslt_dschrg_port_cd.setListListener(p);
		p.columnRslt_dschrg_port_nm.addAllListener(p);
		p.columnRslt_dschrg_port_nm.setListListener(p);
		p.columnRslt_eta_dt.addAllListener(p);
		p.columnRslt_eta_dt.setListListener(p);
		p.columnRslt_via_port_cd.addAllListener(p);
		p.columnRslt_via_port_cd.setListListener(p);
		p.columnRslt_via_port_nm.addAllListener(p);
		p.columnRslt_via_port_nm.setListListener(p);
		p.columnRslt_via_schd_dt.addAllListener(p);
		p.columnRslt_via_schd_dt.setListListener(p);
		p.columnRslt_tterm_cd1.addAllListener(p);
		p.columnRslt_tterm_cd1.setListListener(p);
		p.columnRslt_tterm_nm1.addAllListener(p);
		p.columnRslt_tterm_nm1.setListListener(p);
		p.columnRslt_tterm_rmrks1.addAllListener(p);
		p.columnRslt_tterm_rmrks1.setListListener(p);
		p.columnRslt_tterm_cd2.addAllListener(p);
		p.columnRslt_tterm_cd2.setListListener(p);
		p.columnRslt_tterm_nm2.addAllListener(p);
		p.columnRslt_tterm_nm2.setListListener(p);
		p.columnRslt_tterm_rmrks2.addAllListener(p);
		p.columnRslt_tterm_rmrks2.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_ttl_net_wt.addAllListener(p);
		p.columnRslt_ttl_net_wt.setListListener(p);
		p.columnRslt_ttl_grss_wt.addAllListener(p);
		p.columnRslt_ttl_grss_wt.setListListener(p);
		p.columnRslt_ttl_dim.addAllListener(p);
		p.columnRslt_ttl_dim.setListListener(p);
		p.columnRslt_tterm_cd3.addAllListener(p);
		p.columnRslt_tterm_cd3.setListListener(p);
		p.columnRslt_tterm_nm3.addAllListener(p);
		p.columnRslt_tterm_nm3.setListListener(p);
		p.columnRslt_tterm_rmrks3.addAllListener(p);
		p.columnRslt_tterm_rmrks3.setListListener(p);
		p.columnRslt_case_mrk1.addAllListener(p);
		p.columnRslt_case_mrk1.setListListener(p);
		p.columnRslt_case_mrk2.addAllListener(p);
		p.columnRslt_case_mrk2.setListListener(p);
		p.columnRslt_case_mrk3.addAllListener(p);
		p.columnRslt_case_mrk3.setListListener(p);
		p.columnRslt_case_mrk4.addAllListener(p);
		p.columnRslt_case_mrk4.setListListener(p);
		p.columnRslt_case_mrk5.addAllListener(p);
		p.columnRslt_case_mrk5.setListListener(p);
		p.columnRslt_case_mrk6.addAllListener(p);
		p.columnRslt_case_mrk6.setListListener(p);
		p.columnRslt_bill_basis_dt.addAllListener(p);
		p.columnRslt_bill_basis_dt.setListListener(p);
		p.columnRslt_rcv_schd_dt.addAllListener(p);
		p.columnRslt_rcv_schd_dt.setListListener(p);
		p.columnRslt_lc_no.addAllListener(p);
		p.columnRslt_lc_no.setListListener(p);
		p.columnRslt_lc_dt.addAllListener(p);
		p.columnRslt_lc_dt.setListListener(p);
		p.columnRslt_lc_rmrks.addAllListener(p);
		p.columnRslt_lc_rmrks.setListListener(p);
		p.columnRslt_bl_no.addAllListener(p);
		p.columnRslt_bl_no.setListListener(p);
		p.columnRslt_bl_dt.addAllListener(p);
		p.columnRslt_bl_dt.setListListener(p);
		p.columnRslt_bl_rmrks.addAllListener(p);
		p.columnRslt_bl_rmrks.setListListener(p);
		p.columnRslt_iv_rmrks.addAllListener(p);
		p.columnRslt_iv_rmrks.setListListener(p);
		p.columnRslt_pl_reg_flg.addAllListener(p);
		p.columnRslt_pl_rmrks.addAllListener(p);
		p.columnRslt_pl_rmrks.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_pre_rcpt_iv_flg.addAllListener(p);
		p.columnRslt_iv_reg_flg.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.setListListener(p);
		p.columnRslt_purc_schd_no.addAllListener(p);
		p.columnRslt_purc_schd_no.setListListener(p);
		p.columnRslt_purc_cmpl_flg.addAllListener(p);
		p.columnRslt_iv_intr_rmrks.addAllListener(p);
		p.columnRslt_iv_intr_rmrks.setListListener(p);
		p.columnRslt_iv_sub_char1.addAllListener(p);
		p.columnRslt_iv_sub_char1.setListListener(p);
		p.columnRslt_iv_sub_char2.addAllListener(p);
		p.columnRslt_iv_sub_char2.setListListener(p);
		p.columnRslt_iv_sub_char3.addAllListener(p);
		p.columnRslt_iv_sub_char3.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_ship_rqst_no.addAllListener(p);
		p.columnRslt_ship_rqst_no.setListListener(p);
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_cst_po_d_no.addAllListener(p);
		p.columnRslt_cst_po_d_no.setListListener(p);
		p.columnRslt_ship_inst_no.addAllListener(p);
		p.columnRslt_ship_inst_no.setListListener(p);
		p.columnRslt_ship_inst_d_no.addAllListener(p);
		p.columnRslt_ship_inst_d_no.setListListener(p);
		p.columnRslt_ship_act_no.addAllListener(p);
		p.columnRslt_ship_act_no.setListListener(p);
		p.columnRslt_ship_act_d_no.addAllListener(p);
		p.columnRslt_ship_act_d_no.setListListener(p);
		p.columnRslt_sls_act_no.addAllListener(p);
		p.columnRslt_sls_act_no.setListListener(p);
		p.columnRslt_sls_act_d_no.addAllListener(p);
		p.columnRslt_sls_act_d_no.setListListener(p);
		p.columnRslt_dlv_rqst_dt.addAllListener(p);
		p.columnRslt_dlv_rqst_dt.setListListener(p);
		p.columnRslt_dlv_rqst_hm.addAllListener(p);
		p.columnRslt_dlv_rqst_hm.setListListener(p);
		p.columnRslt_bndl_flg.addAllListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_cntry_org_cd.addAllListener(p);
		p.columnRslt_cntry_org_cd.setListListener(p);
		p.columnRslt_cntry_org_nm.addAllListener(p);
		p.columnRslt_cntry_org_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnRslt_ship_loc_cd.addAllListener(p);
		p.columnRslt_ship_loc_cd.setListListener(p);
		p.columnRslt_ship_loc_nm.addAllListener(p);
		p.columnRslt_ship_loc_nm.setListListener(p);
		p.columnRslt_ship_str_ln_cd.addAllListener(p);
		p.columnRslt_ship_str_ln_cd.setListListener(p);
		p.columnRslt_ship_str_ln_nm.addAllListener(p);
		p.columnRslt_ship_str_ln_nm.setListListener(p);
		p.columnRslt_ship_site_cd.addAllListener(p);
		p.columnRslt_ship_site_cd.setListListener(p);
		p.columnRslt_ship_site_nm.addAllListener(p);
		p.columnRslt_ship_site_nm.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_tax_rate.addAllListener(p);
		p.columnRslt_tax_rate.setListListener(p);
		p.columnRslt_dscnt_rsn_cd.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.setListListener(p);
		p.columnRslt_dscnt_rsn_nm.addAllListener(p);
		p.columnRslt_dscnt_rsn_nm.setListListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_rsn_cd.addAllListener(p);
		p.columnRslt_rsn_cd.setListListener(p);
		p.columnRslt_rsn_nm.addAllListener(p);
		p.columnRslt_rsn_nm.setListListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_sls_usr_cd.addAllListener(p);
		p.columnRslt_sls_usr_cd.setListListener(p);
		p.columnRslt_sls_usr_nm.addAllListener(p);
		p.columnRslt_sls_usr_nm.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_nm.addAllListener(p);
		p.columnRslt_ar_dpt_nm.setListListener(p);
		p.columnRslt_manual_add_flg.addAllListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_iv_d_rmrks.addAllListener(p);
		p.columnRslt_iv_d_rmrks.setListListener(p);
		p.columnRslt_iv_d_intr_rmrks.addAllListener(p);
		p.columnRslt_iv_d_intr_rmrks.setListListener(p);
		p.columnRslt_iv_d_sub_char1.addAllListener(p);
		p.columnRslt_iv_d_sub_char1.setListListener(p);
		p.columnRslt_iv_d_sub_char2.addAllListener(p);
		p.columnRslt_iv_d_sub_char2.setListListener(p);
		p.columnRslt_iv_d_sub_char3.addAllListener(p);
		p.columnRslt_iv_d_sub_char3.setListListener(p);
		p.columnRslt_ship_inst_d_sub_char1.addAllListener(p);
		p.columnRslt_ship_inst_d_sub_char1.setListListener(p);
		p.columnRslt_ship_inst_d_sub_char2.addAllListener(p);
		p.columnRslt_ship_inst_d_sub_char2.setListListener(p);
		p.columnRslt_ship_inst_d_sub_char3.addAllListener(p);
		p.columnRslt_ship_inst_d_sub_char3.setListListener(p);
		p.columnRslt_ship_act_d_sub_char1.addAllListener(p);
		p.columnRslt_ship_act_d_sub_char1.setListListener(p);
		p.columnRslt_ship_act_d_sub_char2.addAllListener(p);
		p.columnRslt_ship_act_d_sub_char2.setListListener(p);
		p.columnRslt_ship_act_d_sub_char3.addAllListener(p);
		p.columnRslt_ship_act_d_sub_char3.setListListener(p);
		p.columnRslt_iv_ship_act_d_sub_char1.addAllListener(p);
		p.columnRslt_iv_ship_act_d_sub_char1.setListListener(p);
		p.columnRslt_iv_ship_act_d_sub_char2.addAllListener(p);
		p.columnRslt_iv_ship_act_d_sub_char2.setListListener(p);
		p.columnRslt_iv_ship_act_d_sub_char3.addAllListener(p);
		p.columnRslt_iv_ship_act_d_sub_char3.setListListener(p);
		p.columnRslt_sls_act_d_sub_char1.addAllListener(p);
		p.columnRslt_sls_act_d_sub_char1.setListListener(p);
		p.columnRslt_sls_act_d_sub_char2.addAllListener(p);
		p.columnRslt_sls_act_d_sub_char2.setListListener(p);
		p.columnRslt_sls_act_d_sub_char3.addAllListener(p);
		p.columnRslt_sls_act_d_sub_char3.setListListener(p);
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
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_trd_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_cur_amt_dec_place.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_IvSrch p) {
		p.Btn_open_MSBEP1730.addAllListener(p);
		p.Btn_open_MSBEP1730.setAPMethodName("doBtn_open_MSBEP1730");
		p.Btn_open_MSBEP1750.addAllListener(p);
		p.Btn_open_MSBEP1750.setAPMethodName("doBtn_open_MSBEP1750");
		p.Btn_open_MSBEP1760.addAllListener(p);
		p.Btn_open_MSBEP1760.setAPMethodName("doBtn_open_MSBEP1760");
		p.Btn_prnt_iv.addAllListener(p);
		p.Btn_prnt_iv.setAPMethodName("doBtn_prnt_iv");
		p.Btn_prnt_pl.addAllListener(p);
		p.Btn_prnt_pl.setAPMethodName("doBtn_prnt_pl");
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitHDR_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitHDR_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Top(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitHDR_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitHDR_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitHDR_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitHDR_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitHDR_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitHDR_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitHDR_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitHDR_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitHDR_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, HDR, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, HDR, MCMode.REQUIRED);
		p.Cnd_ex_im_not_comp_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_purc_im_comp_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_not_reg_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_reg_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_pl_not_reg_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_not_sls_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_iv_not_comp_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_comp_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_cd.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_sls_usr_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_sls_dpt_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_sls_dpt_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_cst_po_d_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_no.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_site_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_ship_site_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_iv_rmrks.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_pl_rmrks.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_iv_sub_char1.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_iv_d_sub_char2.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_iv_d_sub_char3.putMode(p, HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, HDR, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [HDR]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitHDR_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(HDR, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitHDR_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, HDR, MCMode.ENABLE);

	}

	/**
	 * [HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_pl_skip_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_mng_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ttl_net_wt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ttl_grss_wt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ttl_dim.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_cmpl_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_intr_rmrks.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_bndl_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_site_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_site_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_qty_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_iv_upri_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_iv_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rsn_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_rsn_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_usr_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_usr_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dpt_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dpt_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_cd.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_nm.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_manual_add_flg.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_io_schd_pr_no.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_d_rmrks.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char1.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char2.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char3.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, HDR, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, HDR, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, HDR, MCMode.INVISIBLE);

	}

	/**
	 * [HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitHDR_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, HDR, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, HDR, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, HDR, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, HDR, MCMode.DISABLE);
		p.Btn_prnt_pl.putMode(p, HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, HDR, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, HDR, MCMode.DISABLE);

	}

	/**
	 * [DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitDTL_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Top(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitDTL_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitDTL_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitDTL_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitDTL_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDTL_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDTL_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitDTL_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitDTL_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_ex_im_not_comp_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_purc_im_comp_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_not_reg_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_reg_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_pl_not_reg_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_not_inst_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_part_inst_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_not_ship_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_not_sls_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_sls_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_comp_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_not_comp_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_iv_comp_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_sls_cststk_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_ship_site_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_ship_site_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_iv_rmrks.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_pl_rmrks.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_sub_char1.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char2.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char3.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DTL]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(DTL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDTL_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, DTL, MCMode.ENABLE);

	}

	/**
	 * [DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_pl_skip_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_mng_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate_inpt_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_ttl_net_wt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ttl_grss_wt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ttl_dim.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_tterm_cd3.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_cmpl_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_intr_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bndl_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_site_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_site_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_iv_upri_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_iv_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_manual_add_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_iv_d_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char1.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char2.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char3.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, DTL, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, DTL, MCMode.INVISIBLE);

	}

	/**
	 * [DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, DTL, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, DTL, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, DTL, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, DTL, MCMode.DISABLE);
		p.Btn_prnt_pl.putMode(p, DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DTL, MCMode.DISABLE);

	}

	/**
	 * [SHIP_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Top(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, SHIP_INST, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, SHIP_INST, MCMode.REQUIRED);
		p.Cnd_ex_im_not_comp_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_purc_im_comp_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_iv_not_reg_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_iv_reg_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_pl_not_reg_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_not_ship_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_not_sls_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_not_comp_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_iv_comp_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_sls_cststk_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_site_cd.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_site_nm.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_rmrks.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_pl_rmrks.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_sub_char1.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char2.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char3.putMode(p, SHIP_INST, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SHIP_INST]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SHIP_INST, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SHIP_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, SHIP_INST, MCMode.ENABLE);

	}

	/**
	 * [SHIP_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_pl_skip_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_mng_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_nm.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_ttl_net_wt.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ttl_grss_wt.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ttl_dim.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_tterm_cd3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_purc_cmpl_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_iv_intr_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bndl_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SHIP_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_site_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_site_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_qty_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_iv_upri_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_iv_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rsn_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_manual_add_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_d_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SHIP_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SHIP_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SHIP_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__INST_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, SHIP_INST, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, SHIP_INST, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, SHIP_INST, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, SHIP_INST, MCMode.DISABLE);
		p.Btn_prnt_pl.putMode(p, SHIP_INST, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SHIP_INST, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SHIP_INST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SHIP_INST, MCMode.DISABLE);

	}

	/**
	 * [SHIP_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Top(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, SHIP_ACT, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, SHIP_ACT, MCMode.REQUIRED);
		p.Cnd_ex_im_not_comp_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_purc_im_comp_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_iv_not_reg_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_iv_reg_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_pl_not_reg_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_not_sls_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_not_comp_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_iv_comp_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_sls_cststk_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_site_cd.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_site_nm.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_rmrks.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_pl_rmrks.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_sub_char1.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char2.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char3.putMode(p, SHIP_ACT, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SHIP_ACT]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SHIP_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SHIP_ACT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SHIP_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, SHIP_ACT, MCMode.ENABLE);

	}

	/**
	 * [SHIP_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_pl_skip_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_mng_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_nm.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_ttl_net_wt.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ttl_grss_wt.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ttl_dim.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_tterm_cd3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_cmpl_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_intr_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bndl_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_site_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_site_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_qty_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_iv_upri_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_iv_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rsn_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_manual_add_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SHIP_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SHIP_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [SHIP_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSHIP__ACT_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, SHIP_ACT, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, SHIP_ACT, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, SHIP_ACT, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, SHIP_ACT, MCMode.DISABLE);
		p.Btn_prnt_pl.putMode(p, SHIP_ACT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SHIP_ACT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SHIP_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SHIP_ACT, MCMode.DISABLE);

	}

	/**
	 * [SLS_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Top(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, SLS_ACT, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, SLS_ACT, MCMode.REQUIRED);
		p.Cnd_ex_im_not_comp_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_purc_im_comp_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_iv_not_reg_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_iv_reg_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_pl_not_reg_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_not_ship_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_not_sls_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_comp_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_not_comp_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_iv_comp_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_sls_cststk_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_inst_no.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_loc_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_loc_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_site_cd.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_ship_site_nm.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_rmrks.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_pl_rmrks.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_sub_char1.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char2.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char3.putMode(p, SLS_ACT, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SLS_ACT]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SLS_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SLS_ACT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SLS_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, SLS_ACT, MCMode.ENABLE);

	}

	/**
	 * [SLS_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_pl_skip_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_mng_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_ttl_net_wt.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ttl_grss_wt.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ttl_dim.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_tterm_cd3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_cmpl_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_intr_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_act_d_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_dt.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bndl_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SLS_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_str_ln_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_site_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_site_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_qty_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_iv_upri_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_iv_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rsn_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_manual_add_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_sub_char3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SLS_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SLS_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SLS_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [SLS_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSLS__ACT_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, SLS_ACT, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, SLS_ACT, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, SLS_ACT, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, SLS_ACT, MCMode.DISABLE);
		p.Btn_prnt_pl.putMode(p, SLS_ACT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SLS_ACT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SLS_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SLS_ACT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ex_im_not_comp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_im_comp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_not_reg_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_reg_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_pl_not_reg_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_sls_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_not_comp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_comp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_tdlv_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_site_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_site_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_pl_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_PRNT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_skip_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_mng_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ttl_net_wt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ttl_grss_wt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ttl_dim.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_cmpl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bndl_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_site_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_site_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_iv_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_iv_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_manual_add_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_pl.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SrchMode(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[ExIm]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ExIm(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[PurcIm]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PurcIm(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[IvReg]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_IvReg(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[PlReg]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PlReg(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[IvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_IvPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[PlPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PlPrnt(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrSts(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[IvIm]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_IvIm(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[SlsCststk]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SlsCststk(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBEP_IvSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_srch_mode_Group.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ex_im_not_comp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ex_im_comp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_im_not_comp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_im_comp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_not_reg_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_reg_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pl_not_reg_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pl_reg_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pl_skip_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_prnt_yet_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_prnt_done_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pl_prnt_yet_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pl_prnt_done_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_iv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_sls_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_not_comp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_comp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_cststk_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_cststk_invalid_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cmpl_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_tdlv_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sls_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_po_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ship_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pl_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_d_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_d_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_d_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_d_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_id_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ShipRqstIdCnd(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvCnd(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmCnd(MSBEP_IvSrch p){

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBEP_IvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBEP_IvSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBEP_IvSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_pl_skip_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ex_im_comp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_non_cmpl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_comp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_mng_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cmpl_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_cststk_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trnspt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ttl_net_wt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ttl_grss_wt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ttl_dim.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk4.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk5.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_case_mrk6.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lc_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lc_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lc_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_reg_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pl_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pre_rcpt_iv_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_cmpl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_rqst_hm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bndl_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_loc_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_str_ln_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_site_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_site_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_oth_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_inst_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sum_ship_inst_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ship_act_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_iv_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_iv_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_usr_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_usr_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_manual_add_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_io_schd_pr_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_intr_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_ship_act_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_id_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
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
		p.columnRslt_sno1_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBEP_IvSrch p){
		p.Btn_open_MSBEP1730.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP1760.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt_iv.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_pl.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return HDR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_IvSrch_MC.setTableConfigRslt((MSBEP_IvSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_IvSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_pl_skip_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pl_skip_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pl_skip_flg);
		p.columnRslt_ex_im_comp_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ex_im_comp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ex_im_comp_flg);
		p.columnRslt_non_cmpl_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.non_cmpl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_cmpl_flg);
		p.columnRslt_iv_ship_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_ship_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_ship_flg);
		p.columnRslt_iv_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_prnt_flg);
		p.columnRslt_pl_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pl_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pl_prnt_flg);
		p.columnRslt_iv_comp_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_comp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_comp_flg);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_iv_rev.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_rev);
		p.columnRslt_iv_d_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_no);
		p.columnRslt_iv_mng_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_mng_no);
		p.columnRslt_cmpl_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cmpl_schd_dt_META);
		p.columnRslt_cmpl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_cmpl_schd_dt);
		p.columnRslt_trd_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_schd_dt_META);
		p.columnRslt_trd_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_schd_dt);
		p.columnRslt_cmpl_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cmpl_dt_META);
		p.columnRslt_cmpl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_cmpl_dt);
		p.columnRslt_iv_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_dt_META);
		p.columnRslt_iv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_dt);
		p.columnRslt_sls_cststk_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_cststk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_cststk_flg);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.RsltTable.addTable(p.Rslt_dlv_p_PPanel.DlvTable);
		p.columnRslt_ship_rqst_id_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_rqst_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_typ);
		p.columnRslt_ship_rqst_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_rqst_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_typ_nm);
		p.columnRslt_ship_rqst_id_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_rqst_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_cd);
		p.columnRslt_ship_rqst_id_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_rqst_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_nm);
		p.columnRslt_via_dlv_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.via_dlv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ);
		p.columnRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.via_dlv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ_nm);
		p.RsltTable.addTable(p.Rslt_tdlv_p_PPanel.DlvTable);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_vssl_flght.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.vssl_flght_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vssl_flght);
		p.columnRslt_load_port_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.load_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_cd);
		p.columnRslt_load_port_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.load_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_nm);
		p.columnRslt_etd_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.etd_dt_META);
		p.columnRslt_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_etd_dt);
		p.columnRslt_dschrg_port_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dschrg_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_cd);
		p.columnRslt_dschrg_port_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dschrg_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_nm);
		p.columnRslt_eta_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.eta_dt_META);
		p.columnRslt_eta_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_eta_dt);
		p.columnRslt_via_port_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.via_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_cd);
		p.columnRslt_via_port_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.via_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_nm);
		p.columnRslt_via_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.via_schd_dt_META);
		p.columnRslt_via_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_via_schd_dt);
		p.columnRslt_tterm_cd1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd1);
		p.columnRslt_tterm_nm1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm1);
		p.columnRslt_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks1);
		p.columnRslt_tterm_cd2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd2);
		p.columnRslt_tterm_nm2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm2);
		p.columnRslt_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks2);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.RsltTable.addTable(p.Rslt_ttl_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_ttl_net_wt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ttl_net_wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl_net_wt);
		p.columnRslt_ttl_grss_wt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ttl_grss_wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl_grss_wt);
		p.columnRslt_ttl_dim.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ttl_dim_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl_dim);
		p.columnRslt_tterm_cd3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd3);
		p.columnRslt_tterm_nm3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm3);
		p.columnRslt_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks3);
		p.columnRslt_case_mrk1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.case_mrk1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_case_mrk1);
		p.columnRslt_case_mrk2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.case_mrk2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_case_mrk2);
		p.columnRslt_case_mrk3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.case_mrk3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_case_mrk3);
		p.columnRslt_case_mrk4.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.case_mrk4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_case_mrk4);
		p.columnRslt_case_mrk5.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.case_mrk5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_case_mrk5);
		p.columnRslt_case_mrk6.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.case_mrk6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_case_mrk6);
		p.columnRslt_bill_basis_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bill_basis_dt_META);
		p.columnRslt_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_basis_dt);
		p.columnRslt_rcv_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.rcv_schd_dt_META);
		p.columnRslt_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_dt);
		p.columnRslt_lc_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.lc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lc_no);
		p.columnRslt_lc_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.lc_dt_META);
		p.columnRslt_lc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lc_dt);
		p.columnRslt_lc_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.lc_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lc_rmrks);
		p.columnRslt_bl_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bl_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bl_no);
		p.columnRslt_bl_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bl_dt_META);
		p.columnRslt_bl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bl_dt);
		p.columnRslt_bl_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bl_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bl_rmrks);
		p.columnRslt_iv_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_rmrks);
		p.columnRslt_pl_reg_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pl_reg_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pl_reg_flg);
		p.columnRslt_pl_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pl_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pl_rmrks);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_pre_rcpt_iv_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.pre_rcpt_iv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_rcpt_iv_flg);
		p.columnRslt_iv_reg_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_reg_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_reg_flg);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.columnRslt_purc_schd_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.purc_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_no);
		p.columnRslt_purc_cmpl_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.purc_cmpl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_cmpl_flg);
		p.columnRslt_iv_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_intr_rmrks);
		p.columnRslt_iv_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_sub_char1);
		p.columnRslt_iv_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_sub_char2);
		p.columnRslt_iv_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_sub_char3);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_ship_rqst_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_rqst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_no);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_cst_po_d_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cst_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_d_no);
		p.columnRslt_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_no);
		p.columnRslt_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_no);
		p.columnRslt_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_no);
		p.columnRslt_ship_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_d_no);
		p.columnRslt_sls_act_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_no);
		p.columnRslt_sls_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_no);
		p.columnRslt_dlv_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dlv_rqst_dt_META);
		p.columnRslt_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_dt);
		p.columnRslt_dlv_rqst_hm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dlv_rqst_hm_META);
		p.columnRslt_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_hm);
		p.columnRslt_bndl_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bndl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bndl_flg);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_cntry_org_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cntry_org_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_cd);
		p.columnRslt_cntry_org_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.cntry_org_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_fr_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_cd);
		p.columnRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_fr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_nm);
		p.columnRslt_ship_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_cd);
		p.columnRslt_ship_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_nm);
		p.columnRslt_ship_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_str_ln_cd);
		p.columnRslt_ship_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_str_ln_nm);
		p.columnRslt_ship_site_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_site_cd);
		p.columnRslt_ship_site_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_site_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.RsltTable.addTable(p.Rslt_ttl_iv_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_ncv_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_base_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_freight_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_insurance_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_oth_amt_p_PPanel.AmtTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_ship_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sum_ship_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_ship_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sls_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_dscnt_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dscnt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_cd);
		p.columnRslt_dscnt_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.dscnt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_iv_upri_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_iv_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsn_cd);
		p.columnRslt_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsn_nm);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.columnRslt_sls_usr_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_cd);
		p.columnRslt_sls_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_nm);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_ar_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ar_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_nm);
		p.columnRslt_manual_add_flg.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.manual_add_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_manual_add_flg);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_iv_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_rmrks);
		p.columnRslt_iv_d_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_d_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_intr_rmrks);
		p.columnRslt_iv_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_sub_char1);
		p.columnRslt_iv_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_sub_char2);
		p.columnRslt_iv_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_d_sub_char3);
		p.columnRslt_ship_inst_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_inst_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_sub_char1);
		p.columnRslt_ship_inst_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_inst_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_sub_char2);
		p.columnRslt_ship_inst_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_inst_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_sub_char3);
		p.columnRslt_ship_act_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_act_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_d_sub_char1);
		p.columnRslt_ship_act_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_act_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_d_sub_char2);
		p.columnRslt_ship_act_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ship_act_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_d_sub_char3);
		p.columnRslt_iv_ship_act_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_ship_act_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_ship_act_d_sub_char1);
		p.columnRslt_iv_ship_act_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_ship_act_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_ship_act_d_sub_char2);
		p.columnRslt_iv_ship_act_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.iv_ship_act_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_ship_act_d_sub_char3);
		p.columnRslt_sls_act_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_act_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_sub_char1);
		p.columnRslt_sls_act_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_act_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_sub_char2);
		p.columnRslt_sls_act_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sls_act_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_ship_rqst_id_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_dlv_id_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.trd_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_upri_dec_place);
		p.columnRslt_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1770.RsltR.ptax_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_amt_dec_place);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ship_fr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_fr_lg_grp_cd.getListConfig().setPutter(getCnd_ship_fr_lg_grp_cd_ListPutter());
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_id_typ.getListConfig().setPutter(getCnd_dlv_id_typ_ListPutter());
		Cnd_dlv_id_cd.getListConfig().setPutter(getCnd_dlv_id_cd_ListPutter());
		Cnd_ship_rqst_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_rqst_id_typ.getListConfig().setPutter(getCnd_ship_rqst_id_typ_ListPutter());
		Cnd_ship_rqst_id_cd.getListConfig().setPutter(getCnd_ship_rqst_id_cd_ListPutter());
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
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
		Cnd_ship_loc_cd.getListConfig().setPutter(getCnd_ship_loc_cd_ListPutter());
		Cnd_ship_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_site_cd.getListConfig().setPutter(getCnd_ship_site_cd_ListPutter());
	}

	/**
	 * この画面を[HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setHDRStatus() {
		status = HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTLStatus() {
		status = DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SHIP_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSHIP_INSTStatus() {
		status = SHIP_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[SHIP_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSHIP_ACTStatus() {
		status = SHIP_ACT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SLS_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSLS_ACTStatus() {
		status = SLS_ACT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRNTStatus() {
		status = SRCH_PRNT;
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
		if (HDR.equals(status)) {
			setHDRStatus();
		}
		else if (DTL.equals(status)) {
			setDTLStatus();
		}
		else if (SHIP_INST.equals(status)) {
			setSHIP_INSTStatus();
		}
		else if (SHIP_ACT.equals(status)) {
			setSHIP_ACTStatus();
		}
		else if (SLS_ACT.equals(status)) {
			setSLS_ACTStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
	}

	/**
	 * [Cnd_ship_fr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_fr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_tdlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tdlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_ship_rqst_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipRqstIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_rqst_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipRqstId");
		return lp;
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
	 * [Cnd_ship_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ship_fr_lg_grp_cd) return getCnd_ship_fr_lg_grp_cd(row, info);
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_dlv_id_typ) return getCnd_dlv_id_typ(row, info);
		if(combo == Cnd_dlv_id_cd) return getCnd_dlv_id_cd(row, info);
		if(combo == Cnd_ship_rqst_id_typ) return getCnd_ship_rqst_id_typ(row, info);
		if(combo == Cnd_ship_rqst_id_cd) return getCnd_ship_rqst_id_cd(row, info);
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_ship_loc_cd) return getCnd_ship_loc_cd(row, info);
		if(combo == Cnd_ship_site_cd) return getCnd_ship_site_cd(row, info);
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
		else if (ap == Btn_open_MSBEP1730) doBtn_open_MSBEP1730(info);
		else if (ap == Btn_open_MSBEP1750) doBtn_open_MSBEP1750(info);
		else if (ap == Btn_open_MSBEP1760) doBtn_open_MSBEP1760(info);
		else if (ap == Btn_prnt_iv) doBtn_prnt_iv(info);
		else if (ap == Btn_prnt_pl) doBtn_prnt_pl(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
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
	 * [Btn]パネルの[open_MSBEP1730]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1730(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1750]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1750(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1760]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1760(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_iv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_iv(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_pl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_pl(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_srch_mode_Group) return doCnd_srch_mode_VC(info);
		if (vc == Cnd_ex_im_not_comp_flg) return doCnd_ex_im_not_comp_flg_VC(info);
		if (vc == Cnd_ex_im_comp_flg) return doCnd_ex_im_comp_flg_VC(info);
		if (vc == Cnd_purc_im_not_comp_flg) return doCnd_purc_im_not_comp_flg_VC(info);
		if (vc == Cnd_purc_im_comp_flg) return doCnd_purc_im_comp_flg_VC(info);
		if (vc == Cnd_iv_not_reg_flg) return doCnd_iv_not_reg_flg_VC(info);
		if (vc == Cnd_iv_reg_flg) return doCnd_iv_reg_flg_VC(info);
		if (vc == Cnd_pl_not_reg_flg) return doCnd_pl_not_reg_flg_VC(info);
		if (vc == Cnd_pl_reg_flg) return doCnd_pl_reg_flg_VC(info);
		if (vc == Cnd_pl_skip_flg) return doCnd_pl_skip_flg_VC(info);
		if (vc == Cnd_iv_prnt_yet_flg) return doCnd_iv_prnt_yet_flg_VC(info);
		if (vc == Cnd_iv_prnt_done_flg) return doCnd_iv_prnt_done_flg_VC(info);
		if (vc == Cnd_pl_prnt_yet_flg) return doCnd_pl_prnt_yet_flg_VC(info);
		if (vc == Cnd_pl_prnt_done_flg) return doCnd_pl_prnt_done_flg_VC(info);
		if (vc == Cnd_not_iv_flg) return doCnd_not_iv_flg_VC(info);
		if (vc == Cnd_not_inst_flg) return doCnd_not_inst_flg_VC(info);
		if (vc == Cnd_part_inst_flg) return doCnd_part_inst_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_not_ship_flg) return doCnd_not_ship_flg_VC(info);
		if (vc == Cnd_part_ship_flg) return doCnd_part_ship_flg_VC(info);
		if (vc == Cnd_ship_flg) return doCnd_ship_flg_VC(info);
		if (vc == Cnd_not_sls_flg) return doCnd_not_sls_flg_VC(info);
		if (vc == Cnd_sls_flg) return doCnd_sls_flg_VC(info);
		if (vc == Cnd_comp_flg) return doCnd_comp_flg_VC(info);
		if (vc == Cnd_iv_not_comp_flg) return doCnd_iv_not_comp_flg_VC(info);
		if (vc == Cnd_iv_comp_flg) return doCnd_iv_comp_flg_VC(info);
		if (vc == Cnd_sls_cststk_flg) return doCnd_sls_cststk_flg_VC(info);
		if (vc == Cnd_sls_cststk_invalid_flg) return doCnd_sls_cststk_invalid_flg_VC(info);
		if (vc == Cnd_iv_dt_fr) return doCnd_iv_dt_fr_VC(info);
		if (vc == Cnd_iv_dt_to) return doCnd_iv_dt_to_VC(info);
		if (vc == Cnd_cmpl_schd_dt_fr) return doCnd_cmpl_schd_dt_fr_VC(info);
		if (vc == Cnd_cmpl_schd_dt_to) return doCnd_cmpl_schd_dt_to_VC(info);
		if (vc == Cnd_cmpl_dt_fr) return doCnd_cmpl_dt_fr_VC(info);
		if (vc == Cnd_cmpl_dt_to) return doCnd_cmpl_dt_to_VC(info);
		if (vc == Cnd_ship_fr_lg_grp_cd) return doCnd_ship_fr_lg_grp_cd_VC(info);
		if (vc == Cnd_ship_fr_lg_grp_nm) return doCnd_ship_fr_lg_grp_nm_VC(info);
		if (vc == Cnd_tdlv_cd) return doCnd_tdlv_cd_VC(info);
		if (vc == Cnd_tdlv_nm) return doCnd_tdlv_nm_VC(info);
		if (vc == Cnd_dlv_id_typ) return doCnd_dlv_id_typ_VC(info);
		if (vc == Cnd_dlv_id_typ_nm) return doCnd_dlv_id_typ_nm_VC(info);
		if (vc == Cnd_dlv_id_cd) return doCnd_dlv_id_cd_VC(info);
		if (vc == Cnd_dlv_id_nm) return doCnd_dlv_id_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_typ) return doCnd_ship_rqst_id_typ_VC(info);
		if (vc == Cnd_ship_rqst_id_typ_nm) return doCnd_ship_rqst_id_typ_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_cd) return doCnd_ship_rqst_id_cd_VC(info);
		if (vc == Cnd_ship_rqst_id_nm) return doCnd_ship_rqst_id_nm_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_ship_rqst_no) return doCnd_ship_rqst_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_ship_inst_no) return doCnd_ship_inst_no_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_ship_loc_cd) return doCnd_ship_loc_cd_VC(info);
		if (vc == Cnd_ship_loc_nm) return doCnd_ship_loc_nm_VC(info);
		if (vc == Cnd_ship_site_cd) return doCnd_ship_site_cd_VC(info);
		if (vc == Cnd_ship_site_nm) return doCnd_ship_site_nm_VC(info);
		if (vc == Cnd_iv_rmrks) return doCnd_iv_rmrks_VC(info);
		if (vc == Cnd_iv_d_rmrks) return doCnd_iv_d_rmrks_VC(info);
		if (vc == Cnd_pl_rmrks) return doCnd_pl_rmrks_VC(info);
		if (vc == Cnd_iv_intr_rmrks) return doCnd_iv_intr_rmrks_VC(info);
		if (vc == Cnd_iv_d_intr_rmrks) return doCnd_iv_d_intr_rmrks_VC(info);
		if (vc == Cnd_iv_sub_char1) return doCnd_iv_sub_char1_VC(info);
		if (vc == Cnd_iv_sub_char2) return doCnd_iv_sub_char2_VC(info);
		if (vc == Cnd_iv_sub_char3) return doCnd_iv_sub_char3_VC(info);
		if (vc == Cnd_iv_d_sub_char1) return doCnd_iv_d_sub_char1_VC(info);
		if (vc == Cnd_iv_d_sub_char2) return doCnd_iv_d_sub_char2_VC(info);
		if (vc == Cnd_iv_d_sub_char3) return doCnd_iv_d_sub_char3_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == Cnd_inc_past_flg) return doCnd_inc_past_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_pl_skip_flg) return doRslt_pl_skip_flg_VC(info);
		if (vc == columnRslt_ex_im_comp_flg) return doRslt_ex_im_comp_flg_VC(info);
		if (vc == columnRslt_non_cmpl_flg) return doRslt_non_cmpl_flg_VC(info);
		if (vc == columnRslt_iv_ship_flg) return doRslt_iv_ship_flg_VC(info);
		if (vc == columnRslt_iv_prnt_flg) return doRslt_iv_prnt_flg_VC(info);
		if (vc == columnRslt_pl_prnt_flg) return doRslt_pl_prnt_flg_VC(info);
		if (vc == columnRslt_iv_comp_flg) return doRslt_iv_comp_flg_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_iv_rev) return doRslt_iv_rev_VC(info);
		if (vc == columnRslt_iv_d_no) return doRslt_iv_d_no_VC(info);
		if (vc == columnRslt_iv_mng_no) return doRslt_iv_mng_no_VC(info);
		if (vc == columnRslt_cmpl_schd_dt) return doRslt_cmpl_schd_dt_VC(info);
		if (vc == columnRslt_trd_schd_dt) return doRslt_trd_schd_dt_VC(info);
		if (vc == columnRslt_cmpl_dt) return doRslt_cmpl_dt_VC(info);
		if (vc == columnRslt_iv_dt) return doRslt_iv_dt_VC(info);
		if (vc == columnRslt_sls_cststk_flg) return doRslt_sls_cststk_flg_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_typ) return doRslt_ship_rqst_id_typ_VC(info);
		if (vc == columnRslt_ship_rqst_id_typ_nm) return doRslt_ship_rqst_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_cd) return doRslt_ship_rqst_id_cd_VC(info);
		if (vc == columnRslt_ship_rqst_id_nm) return doRslt_ship_rqst_id_nm_VC(info);
		if (vc == columnRslt_via_dlv_typ) return doRslt_via_dlv_typ_VC(info);
		if (vc == columnRslt_via_dlv_typ_nm) return doRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnRslt_trnspt_cd) return doRslt_trnspt_cd_VC(info);
		if (vc == columnRslt_trnspt_nm) return doRslt_trnspt_nm_VC(info);
		if (vc == columnRslt_vssl_flght) return doRslt_vssl_flght_VC(info);
		if (vc == columnRslt_load_port_cd) return doRslt_load_port_cd_VC(info);
		if (vc == columnRslt_load_port_nm) return doRslt_load_port_nm_VC(info);
		if (vc == columnRslt_etd_dt) return doRslt_etd_dt_VC(info);
		if (vc == columnRslt_dschrg_port_cd) return doRslt_dschrg_port_cd_VC(info);
		if (vc == columnRslt_dschrg_port_nm) return doRslt_dschrg_port_nm_VC(info);
		if (vc == columnRslt_eta_dt) return doRslt_eta_dt_VC(info);
		if (vc == columnRslt_via_port_cd) return doRslt_via_port_cd_VC(info);
		if (vc == columnRslt_via_port_nm) return doRslt_via_port_nm_VC(info);
		if (vc == columnRslt_via_schd_dt) return doRslt_via_schd_dt_VC(info);
		if (vc == columnRslt_tterm_cd1) return doRslt_tterm_cd1_VC(info);
		if (vc == columnRslt_tterm_nm1) return doRslt_tterm_nm1_VC(info);
		if (vc == columnRslt_tterm_rmrks1) return doRslt_tterm_rmrks1_VC(info);
		if (vc == columnRslt_tterm_cd2) return doRslt_tterm_cd2_VC(info);
		if (vc == columnRslt_tterm_nm2) return doRslt_tterm_nm2_VC(info);
		if (vc == columnRslt_tterm_rmrks2) return doRslt_tterm_rmrks2_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_ttl_net_wt) return doRslt_ttl_net_wt_VC(info);
		if (vc == columnRslt_ttl_grss_wt) return doRslt_ttl_grss_wt_VC(info);
		if (vc == columnRslt_ttl_dim) return doRslt_ttl_dim_VC(info);
		if (vc == columnRslt_tterm_cd3) return doRslt_tterm_cd3_VC(info);
		if (vc == columnRslt_tterm_nm3) return doRslt_tterm_nm3_VC(info);
		if (vc == columnRslt_tterm_rmrks3) return doRslt_tterm_rmrks3_VC(info);
		if (vc == columnRslt_case_mrk1) return doRslt_case_mrk1_VC(info);
		if (vc == columnRslt_case_mrk2) return doRslt_case_mrk2_VC(info);
		if (vc == columnRslt_case_mrk3) return doRslt_case_mrk3_VC(info);
		if (vc == columnRslt_case_mrk4) return doRslt_case_mrk4_VC(info);
		if (vc == columnRslt_case_mrk5) return doRslt_case_mrk5_VC(info);
		if (vc == columnRslt_case_mrk6) return doRslt_case_mrk6_VC(info);
		if (vc == columnRslt_bill_basis_dt) return doRslt_bill_basis_dt_VC(info);
		if (vc == columnRslt_rcv_schd_dt) return doRslt_rcv_schd_dt_VC(info);
		if (vc == columnRslt_lc_no) return doRslt_lc_no_VC(info);
		if (vc == columnRslt_lc_dt) return doRslt_lc_dt_VC(info);
		if (vc == columnRslt_lc_rmrks) return doRslt_lc_rmrks_VC(info);
		if (vc == columnRslt_bl_no) return doRslt_bl_no_VC(info);
		if (vc == columnRslt_bl_dt) return doRslt_bl_dt_VC(info);
		if (vc == columnRslt_bl_rmrks) return doRslt_bl_rmrks_VC(info);
		if (vc == columnRslt_iv_rmrks) return doRslt_iv_rmrks_VC(info);
		if (vc == columnRslt_pl_reg_flg) return doRslt_pl_reg_flg_VC(info);
		if (vc == columnRslt_pl_rmrks) return doRslt_pl_rmrks_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_pre_rcpt_iv_flg) return doRslt_pre_rcpt_iv_flg_VC(info);
		if (vc == columnRslt_iv_reg_flg) return doRslt_iv_reg_flg_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_purc_schd_no) return doRslt_purc_schd_no_VC(info);
		if (vc == columnRslt_purc_cmpl_flg) return doRslt_purc_cmpl_flg_VC(info);
		if (vc == columnRslt_iv_intr_rmrks) return doRslt_iv_intr_rmrks_VC(info);
		if (vc == columnRslt_iv_sub_char1) return doRslt_iv_sub_char1_VC(info);
		if (vc == columnRslt_iv_sub_char2) return doRslt_iv_sub_char2_VC(info);
		if (vc == columnRslt_iv_sub_char3) return doRslt_iv_sub_char3_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_ship_rqst_no) return doRslt_ship_rqst_no_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_cst_po_d_no) return doRslt_cst_po_d_no_VC(info);
		if (vc == columnRslt_ship_inst_no) return doRslt_ship_inst_no_VC(info);
		if (vc == columnRslt_ship_inst_d_no) return doRslt_ship_inst_d_no_VC(info);
		if (vc == columnRslt_ship_act_no) return doRslt_ship_act_no_VC(info);
		if (vc == columnRslt_ship_act_d_no) return doRslt_ship_act_d_no_VC(info);
		if (vc == columnRslt_sls_act_no) return doRslt_sls_act_no_VC(info);
		if (vc == columnRslt_sls_act_d_no) return doRslt_sls_act_d_no_VC(info);
		if (vc == columnRslt_dlv_rqst_dt) return doRslt_dlv_rqst_dt_VC(info);
		if (vc == columnRslt_dlv_rqst_hm) return doRslt_dlv_rqst_hm_VC(info);
		if (vc == columnRslt_bndl_flg) return doRslt_bndl_flg_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_cntry_org_cd) return doRslt_cntry_org_cd_VC(info);
		if (vc == columnRslt_cntry_org_nm) return doRslt_cntry_org_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_cd) return doRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_nm) return doRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnRslt_ship_loc_cd) return doRslt_ship_loc_cd_VC(info);
		if (vc == columnRslt_ship_loc_nm) return doRslt_ship_loc_nm_VC(info);
		if (vc == columnRslt_ship_str_ln_cd) return doRslt_ship_str_ln_cd_VC(info);
		if (vc == columnRslt_ship_str_ln_nm) return doRslt_ship_str_ln_nm_VC(info);
		if (vc == columnRslt_ship_site_cd) return doRslt_ship_site_cd_VC(info);
		if (vc == columnRslt_ship_site_nm) return doRslt_ship_site_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_dscnt_rsn_cd) return doRslt_dscnt_rsn_cd_VC(info);
		if (vc == columnRslt_dscnt_rsn_nm) return doRslt_dscnt_rsn_nm_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_rsn_cd) return doRslt_rsn_cd_VC(info);
		if (vc == columnRslt_rsn_nm) return doRslt_rsn_nm_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_sls_usr_cd) return doRslt_sls_usr_cd_VC(info);
		if (vc == columnRslt_sls_usr_nm) return doRslt_sls_usr_nm_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_nm) return doRslt_ar_dpt_nm_VC(info);
		if (vc == columnRslt_manual_add_flg) return doRslt_manual_add_flg_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_iv_d_rmrks) return doRslt_iv_d_rmrks_VC(info);
		if (vc == columnRslt_iv_d_intr_rmrks) return doRslt_iv_d_intr_rmrks_VC(info);
		if (vc == columnRslt_iv_d_sub_char1) return doRslt_iv_d_sub_char1_VC(info);
		if (vc == columnRslt_iv_d_sub_char2) return doRslt_iv_d_sub_char2_VC(info);
		if (vc == columnRslt_iv_d_sub_char3) return doRslt_iv_d_sub_char3_VC(info);
		if (vc == columnRslt_ship_inst_d_sub_char1) return doRslt_ship_inst_d_sub_char1_VC(info);
		if (vc == columnRslt_ship_inst_d_sub_char2) return doRslt_ship_inst_d_sub_char2_VC(info);
		if (vc == columnRslt_ship_inst_d_sub_char3) return doRslt_ship_inst_d_sub_char3_VC(info);
		if (vc == columnRslt_ship_act_d_sub_char1) return doRslt_ship_act_d_sub_char1_VC(info);
		if (vc == columnRslt_ship_act_d_sub_char2) return doRslt_ship_act_d_sub_char2_VC(info);
		if (vc == columnRslt_ship_act_d_sub_char3) return doRslt_ship_act_d_sub_char3_VC(info);
		if (vc == columnRslt_iv_ship_act_d_sub_char1) return doRslt_iv_ship_act_d_sub_char1_VC(info);
		if (vc == columnRslt_iv_ship_act_d_sub_char2) return doRslt_iv_ship_act_d_sub_char2_VC(info);
		if (vc == columnRslt_iv_ship_act_d_sub_char3) return doRslt_iv_ship_act_d_sub_char3_VC(info);
		if (vc == columnRslt_sls_act_d_sub_char1) return doRslt_sls_act_d_sub_char1_VC(info);
		if (vc == columnRslt_sls_act_d_sub_char2) return doRslt_sls_act_d_sub_char2_VC(info);
		if (vc == columnRslt_sls_act_d_sub_char3) return doRslt_sls_act_d_sub_char3_VC(info);
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
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_upri_dec_place) return doRslt_trd_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_amt_dec_place) return doRslt_ptax_cur_amt_dec_place_VC(info);
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
	 * [Cnd]パネルの[srch_mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ex_im_not_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ex_im_not_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ex_im_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ex_im_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_im_not_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_im_not_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_im_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_im_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_not_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_not_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pl_not_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pl_not_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pl_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pl_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pl_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pl_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_prnt_yet_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_prnt_yet_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_prnt_done_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_prnt_done_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pl_prnt_yet_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pl_prnt_yet_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pl_prnt_done_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pl_prnt_done_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[part_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_ship_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_not_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_not_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_comp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_cststk_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_cststk_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tdlv_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_d_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_d_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_d_sub_char3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_past_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_past_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pl_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pl_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ex_im_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ex_im_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[non_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_non_cmpl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pl_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pl_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_comp_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cmpl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cmpl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_cststk_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trnspt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vssl_flght_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[etd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_etd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[eta_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_eta_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks2_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ttl_net_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_net_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl_grss_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_grss_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[case_mrk1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_case_mrk1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[case_mrk2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_case_mrk2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[case_mrk3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_case_mrk3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[case_mrk4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_case_mrk4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[case_mrk5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_case_mrk5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[case_mrk6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_case_mrk6_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lc_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lc_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pl_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pl_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_rcpt_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_rcpt_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_mng_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bndl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bndl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_site_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[manual_add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_manual_add_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_d_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_d_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_ship_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_ship_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_ship_act_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_d_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_amt_dec_place_VC(MCEventInfo info){
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
		else if (nc == Cnd_srch_mode_Group) doCnd_srch_mode_NC(info);
		else if (nc == Cnd_ex_im_not_comp_flg) doCnd_ex_im_not_comp_flg_NC(info);
		else if (nc == Cnd_ex_im_comp_flg) doCnd_ex_im_comp_flg_NC(info);
		else if (nc == Cnd_purc_im_not_comp_flg) doCnd_purc_im_not_comp_flg_NC(info);
		else if (nc == Cnd_purc_im_comp_flg) doCnd_purc_im_comp_flg_NC(info);
		else if (nc == Cnd_iv_not_reg_flg) doCnd_iv_not_reg_flg_NC(info);
		else if (nc == Cnd_iv_reg_flg) doCnd_iv_reg_flg_NC(info);
		else if (nc == Cnd_pl_not_reg_flg) doCnd_pl_not_reg_flg_NC(info);
		else if (nc == Cnd_pl_reg_flg) doCnd_pl_reg_flg_NC(info);
		else if (nc == Cnd_pl_skip_flg) doCnd_pl_skip_flg_NC(info);
		else if (nc == Cnd_iv_prnt_yet_flg) doCnd_iv_prnt_yet_flg_NC(info);
		else if (nc == Cnd_iv_prnt_done_flg) doCnd_iv_prnt_done_flg_NC(info);
		else if (nc == Cnd_pl_prnt_yet_flg) doCnd_pl_prnt_yet_flg_NC(info);
		else if (nc == Cnd_pl_prnt_done_flg) doCnd_pl_prnt_done_flg_NC(info);
		else if (nc == Cnd_not_iv_flg) doCnd_not_iv_flg_NC(info);
		else if (nc == Cnd_not_inst_flg) doCnd_not_inst_flg_NC(info);
		else if (nc == Cnd_part_inst_flg) doCnd_part_inst_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_not_ship_flg) doCnd_not_ship_flg_NC(info);
		else if (nc == Cnd_part_ship_flg) doCnd_part_ship_flg_NC(info);
		else if (nc == Cnd_ship_flg) doCnd_ship_flg_NC(info);
		else if (nc == Cnd_not_sls_flg) doCnd_not_sls_flg_NC(info);
		else if (nc == Cnd_sls_flg) doCnd_sls_flg_NC(info);
		else if (nc == Cnd_comp_flg) doCnd_comp_flg_NC(info);
		else if (nc == Cnd_iv_not_comp_flg) doCnd_iv_not_comp_flg_NC(info);
		else if (nc == Cnd_iv_comp_flg) doCnd_iv_comp_flg_NC(info);
		else if (nc == Cnd_sls_cststk_flg) doCnd_sls_cststk_flg_NC(info);
		else if (nc == Cnd_sls_cststk_invalid_flg) doCnd_sls_cststk_invalid_flg_NC(info);
		else if (nc == Cnd_iv_dt_fr) doCnd_iv_dt_fr_NC(info);
		else if (nc == Cnd_iv_dt_to) doCnd_iv_dt_to_NC(info);
		else if (nc == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_NC(info);
		else if (nc == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_NC(info);
		else if (nc == Cnd_cmpl_dt_fr) doCnd_cmpl_dt_fr_NC(info);
		else if (nc == Cnd_cmpl_dt_to) doCnd_cmpl_dt_to_NC(info);
		else if (nc == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_NC(info);
		else if (nc == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_NC(info);
		else if (nc == Cnd_tdlv_cd) doCnd_tdlv_cd_NC(info);
		else if (nc == Cnd_tdlv_nm) doCnd_tdlv_nm_NC(info);
		else if (nc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NC(info);
		else if (nc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NC(info);
		else if (nc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NC(info);
		else if (nc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NC(info);
		else if (nc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_ship_inst_no) doCnd_ship_inst_no_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NC(info);
		else if (nc == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NC(info);
		else if (nc == Cnd_ship_site_cd) doCnd_ship_site_cd_NC(info);
		else if (nc == Cnd_ship_site_nm) doCnd_ship_site_nm_NC(info);
		else if (nc == Cnd_iv_rmrks) doCnd_iv_rmrks_NC(info);
		else if (nc == Cnd_iv_d_rmrks) doCnd_iv_d_rmrks_NC(info);
		else if (nc == Cnd_pl_rmrks) doCnd_pl_rmrks_NC(info);
		else if (nc == Cnd_iv_intr_rmrks) doCnd_iv_intr_rmrks_NC(info);
		else if (nc == Cnd_iv_d_intr_rmrks) doCnd_iv_d_intr_rmrks_NC(info);
		else if (nc == Cnd_iv_sub_char1) doCnd_iv_sub_char1_NC(info);
		else if (nc == Cnd_iv_sub_char2) doCnd_iv_sub_char2_NC(info);
		else if (nc == Cnd_iv_sub_char3) doCnd_iv_sub_char3_NC(info);
		else if (nc == Cnd_iv_d_sub_char1) doCnd_iv_d_sub_char1_NC(info);
		else if (nc == Cnd_iv_d_sub_char2) doCnd_iv_d_sub_char2_NC(info);
		else if (nc == Cnd_iv_d_sub_char3) doCnd_iv_d_sub_char3_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == Cnd_inc_past_flg) doCnd_inc_past_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_pl_skip_flg) doRslt_pl_skip_flg_NC(info);
		else if (nc == columnRslt_ex_im_comp_flg) doRslt_ex_im_comp_flg_NC(info);
		else if (nc == columnRslt_non_cmpl_flg) doRslt_non_cmpl_flg_NC(info);
		else if (nc == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NC(info);
		else if (nc == columnRslt_iv_prnt_flg) doRslt_iv_prnt_flg_NC(info);
		else if (nc == columnRslt_pl_prnt_flg) doRslt_pl_prnt_flg_NC(info);
		else if (nc == columnRslt_iv_comp_flg) doRslt_iv_comp_flg_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_iv_rev) doRslt_iv_rev_NC(info);
		else if (nc == columnRslt_iv_d_no) doRslt_iv_d_no_NC(info);
		else if (nc == columnRslt_iv_mng_no) doRslt_iv_mng_no_NC(info);
		else if (nc == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_NC(info);
		else if (nc == columnRslt_trd_schd_dt) doRslt_trd_schd_dt_NC(info);
		else if (nc == columnRslt_cmpl_dt) doRslt_cmpl_dt_NC(info);
		else if (nc == columnRslt_iv_dt) doRslt_iv_dt_NC(info);
		else if (nc == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NC(info);
		else if (nc == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NC(info);
		else if (nc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NC(info);
		else if (nc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NC(info);
		else if (nc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnRslt_trnspt_cd) doRslt_trnspt_cd_NC(info);
		else if (nc == columnRslt_trnspt_nm) doRslt_trnspt_nm_NC(info);
		else if (nc == columnRslt_vssl_flght) doRslt_vssl_flght_NC(info);
		else if (nc == columnRslt_load_port_cd) doRslt_load_port_cd_NC(info);
		else if (nc == columnRslt_load_port_nm) doRslt_load_port_nm_NC(info);
		else if (nc == columnRslt_etd_dt) doRslt_etd_dt_NC(info);
		else if (nc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NC(info);
		else if (nc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NC(info);
		else if (nc == columnRslt_eta_dt) doRslt_eta_dt_NC(info);
		else if (nc == columnRslt_via_port_cd) doRslt_via_port_cd_NC(info);
		else if (nc == columnRslt_via_port_nm) doRslt_via_port_nm_NC(info);
		else if (nc == columnRslt_via_schd_dt) doRslt_via_schd_dt_NC(info);
		else if (nc == columnRslt_tterm_cd1) doRslt_tterm_cd1_NC(info);
		else if (nc == columnRslt_tterm_nm1) doRslt_tterm_nm1_NC(info);
		else if (nc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_tterm_cd2) doRslt_tterm_cd2_NC(info);
		else if (nc == columnRslt_tterm_nm2) doRslt_tterm_nm2_NC(info);
		else if (nc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_ttl_net_wt) doRslt_ttl_net_wt_NC(info);
		else if (nc == columnRslt_ttl_grss_wt) doRslt_ttl_grss_wt_NC(info);
		else if (nc == columnRslt_ttl_dim) doRslt_ttl_dim_NC(info);
		else if (nc == columnRslt_tterm_cd3) doRslt_tterm_cd3_NC(info);
		else if (nc == columnRslt_tterm_nm3) doRslt_tterm_nm3_NC(info);
		else if (nc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_case_mrk1) doRslt_case_mrk1_NC(info);
		else if (nc == columnRslt_case_mrk2) doRslt_case_mrk2_NC(info);
		else if (nc == columnRslt_case_mrk3) doRslt_case_mrk3_NC(info);
		else if (nc == columnRslt_case_mrk4) doRslt_case_mrk4_NC(info);
		else if (nc == columnRslt_case_mrk5) doRslt_case_mrk5_NC(info);
		else if (nc == columnRslt_case_mrk6) doRslt_case_mrk6_NC(info);
		else if (nc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NC(info);
		else if (nc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_lc_no) doRslt_lc_no_NC(info);
		else if (nc == columnRslt_lc_dt) doRslt_lc_dt_NC(info);
		else if (nc == columnRslt_lc_rmrks) doRslt_lc_rmrks_NC(info);
		else if (nc == columnRslt_bl_no) doRslt_bl_no_NC(info);
		else if (nc == columnRslt_bl_dt) doRslt_bl_dt_NC(info);
		else if (nc == columnRslt_bl_rmrks) doRslt_bl_rmrks_NC(info);
		else if (nc == columnRslt_iv_rmrks) doRslt_iv_rmrks_NC(info);
		else if (nc == columnRslt_pl_reg_flg) doRslt_pl_reg_flg_NC(info);
		else if (nc == columnRslt_pl_rmrks) doRslt_pl_rmrks_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_pre_rcpt_iv_flg) doRslt_pre_rcpt_iv_flg_NC(info);
		else if (nc == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_purc_schd_no) doRslt_purc_schd_no_NC(info);
		else if (nc == columnRslt_purc_cmpl_flg) doRslt_purc_cmpl_flg_NC(info);
		else if (nc == columnRslt_iv_intr_rmrks) doRslt_iv_intr_rmrks_NC(info);
		else if (nc == columnRslt_iv_sub_char1) doRslt_iv_sub_char1_NC(info);
		else if (nc == columnRslt_iv_sub_char2) doRslt_iv_sub_char2_NC(info);
		else if (nc == columnRslt_iv_sub_char3) doRslt_iv_sub_char3_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NC(info);
		else if (nc == columnRslt_ship_inst_no) doRslt_ship_inst_no_NC(info);
		else if (nc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NC(info);
		else if (nc == columnRslt_ship_act_no) doRslt_ship_act_no_NC(info);
		else if (nc == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NC(info);
		else if (nc == columnRslt_sls_act_no) doRslt_sls_act_no_NC(info);
		else if (nc == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NC(info);
		else if (nc == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NC(info);
		else if (nc == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NC(info);
		else if (nc == columnRslt_bndl_flg) doRslt_bndl_flg_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NC(info);
		else if (nc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NC(info);
		else if (nc == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NC(info);
		else if (nc == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_NC(info);
		else if (nc == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_NC(info);
		else if (nc == columnRslt_ship_site_cd) doRslt_ship_site_cd_NC(info);
		else if (nc == columnRslt_ship_site_nm) doRslt_ship_site_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NC(info);
		else if (nc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_rsn_cd) doRslt_rsn_cd_NC(info);
		else if (nc == columnRslt_rsn_nm) doRslt_rsn_nm_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NC(info);
		else if (nc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NC(info);
		else if (nc == columnRslt_manual_add_flg) doRslt_manual_add_flg_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_iv_d_rmrks) doRslt_iv_d_rmrks_NC(info);
		else if (nc == columnRslt_iv_d_intr_rmrks) doRslt_iv_d_intr_rmrks_NC(info);
		else if (nc == columnRslt_iv_d_sub_char1) doRslt_iv_d_sub_char1_NC(info);
		else if (nc == columnRslt_iv_d_sub_char2) doRslt_iv_d_sub_char2_NC(info);
		else if (nc == columnRslt_iv_d_sub_char3) doRslt_iv_d_sub_char3_NC(info);
		else if (nc == columnRslt_ship_inst_d_sub_char1) doRslt_ship_inst_d_sub_char1_NC(info);
		else if (nc == columnRslt_ship_inst_d_sub_char2) doRslt_ship_inst_d_sub_char2_NC(info);
		else if (nc == columnRslt_ship_inst_d_sub_char3) doRslt_ship_inst_d_sub_char3_NC(info);
		else if (nc == columnRslt_ship_act_d_sub_char1) doRslt_ship_act_d_sub_char1_NC(info);
		else if (nc == columnRslt_ship_act_d_sub_char2) doRslt_ship_act_d_sub_char2_NC(info);
		else if (nc == columnRslt_ship_act_d_sub_char3) doRslt_ship_act_d_sub_char3_NC(info);
		else if (nc == columnRslt_iv_ship_act_d_sub_char1) doRslt_iv_ship_act_d_sub_char1_NC(info);
		else if (nc == columnRslt_iv_ship_act_d_sub_char2) doRslt_iv_ship_act_d_sub_char2_NC(info);
		else if (nc == columnRslt_iv_ship_act_d_sub_char3) doRslt_iv_ship_act_d_sub_char3_NC(info);
		else if (nc == columnRslt_sls_act_d_sub_char1) doRslt_sls_act_d_sub_char1_NC(info);
		else if (nc == columnRslt_sls_act_d_sub_char2) doRslt_sls_act_d_sub_char2_NC(info);
		else if (nc == columnRslt_sls_act_d_sub_char3) doRslt_sls_act_d_sub_char3_NC(info);
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
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NC(info);
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
	 * [Cnd]パネルの[srch_mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ex_im_not_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ex_im_not_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ex_im_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ex_im_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_im_not_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_im_not_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_im_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_im_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_not_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_not_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_prnt_yet_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_prnt_yet_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_prnt_done_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_prnt_done_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_prnt_yet_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_prnt_yet_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_prnt_done_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_prnt_done_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ex_im_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ex_im_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_comp_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trnspt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_net_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_net_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_grss_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_grss_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_dim_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk6_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_rcpt_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_rcpt_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bndl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[manual_add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_add_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NC(MCEventInfo info){
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
		else if (ne == Cnd_srch_mode_Group) doCnd_srch_mode_NE(info);
		else if (ne == Cnd_ex_im_not_comp_flg) doCnd_ex_im_not_comp_flg_NE(info);
		else if (ne == Cnd_ex_im_comp_flg) doCnd_ex_im_comp_flg_NE(info);
		else if (ne == Cnd_purc_im_not_comp_flg) doCnd_purc_im_not_comp_flg_NE(info);
		else if (ne == Cnd_purc_im_comp_flg) doCnd_purc_im_comp_flg_NE(info);
		else if (ne == Cnd_iv_not_reg_flg) doCnd_iv_not_reg_flg_NE(info);
		else if (ne == Cnd_iv_reg_flg) doCnd_iv_reg_flg_NE(info);
		else if (ne == Cnd_pl_not_reg_flg) doCnd_pl_not_reg_flg_NE(info);
		else if (ne == Cnd_pl_reg_flg) doCnd_pl_reg_flg_NE(info);
		else if (ne == Cnd_pl_skip_flg) doCnd_pl_skip_flg_NE(info);
		else if (ne == Cnd_iv_prnt_yet_flg) doCnd_iv_prnt_yet_flg_NE(info);
		else if (ne == Cnd_iv_prnt_done_flg) doCnd_iv_prnt_done_flg_NE(info);
		else if (ne == Cnd_pl_prnt_yet_flg) doCnd_pl_prnt_yet_flg_NE(info);
		else if (ne == Cnd_pl_prnt_done_flg) doCnd_pl_prnt_done_flg_NE(info);
		else if (ne == Cnd_not_iv_flg) doCnd_not_iv_flg_NE(info);
		else if (ne == Cnd_not_inst_flg) doCnd_not_inst_flg_NE(info);
		else if (ne == Cnd_part_inst_flg) doCnd_part_inst_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_not_ship_flg) doCnd_not_ship_flg_NE(info);
		else if (ne == Cnd_part_ship_flg) doCnd_part_ship_flg_NE(info);
		else if (ne == Cnd_ship_flg) doCnd_ship_flg_NE(info);
		else if (ne == Cnd_not_sls_flg) doCnd_not_sls_flg_NE(info);
		else if (ne == Cnd_sls_flg) doCnd_sls_flg_NE(info);
		else if (ne == Cnd_comp_flg) doCnd_comp_flg_NE(info);
		else if (ne == Cnd_iv_not_comp_flg) doCnd_iv_not_comp_flg_NE(info);
		else if (ne == Cnd_iv_comp_flg) doCnd_iv_comp_flg_NE(info);
		else if (ne == Cnd_sls_cststk_flg) doCnd_sls_cststk_flg_NE(info);
		else if (ne == Cnd_sls_cststk_invalid_flg) doCnd_sls_cststk_invalid_flg_NE(info);
		else if (ne == Cnd_iv_dt_fr) doCnd_iv_dt_fr_NE(info);
		else if (ne == Cnd_iv_dt_to) doCnd_iv_dt_to_NE(info);
		else if (ne == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_NE(info);
		else if (ne == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_NE(info);
		else if (ne == Cnd_cmpl_dt_fr) doCnd_cmpl_dt_fr_NE(info);
		else if (ne == Cnd_cmpl_dt_to) doCnd_cmpl_dt_to_NE(info);
		else if (ne == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_NE(info);
		else if (ne == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_NE(info);
		else if (ne == Cnd_tdlv_cd) doCnd_tdlv_cd_NE(info);
		else if (ne == Cnd_tdlv_nm) doCnd_tdlv_nm_NE(info);
		else if (ne == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NE(info);
		else if (ne == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NE(info);
		else if (ne == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NE(info);
		else if (ne == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NE(info);
		else if (ne == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_ship_inst_no) doCnd_ship_inst_no_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NE(info);
		else if (ne == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NE(info);
		else if (ne == Cnd_ship_site_cd) doCnd_ship_site_cd_NE(info);
		else if (ne == Cnd_ship_site_nm) doCnd_ship_site_nm_NE(info);
		else if (ne == Cnd_iv_rmrks) doCnd_iv_rmrks_NE(info);
		else if (ne == Cnd_iv_d_rmrks) doCnd_iv_d_rmrks_NE(info);
		else if (ne == Cnd_pl_rmrks) doCnd_pl_rmrks_NE(info);
		else if (ne == Cnd_iv_intr_rmrks) doCnd_iv_intr_rmrks_NE(info);
		else if (ne == Cnd_iv_d_intr_rmrks) doCnd_iv_d_intr_rmrks_NE(info);
		else if (ne == Cnd_iv_sub_char1) doCnd_iv_sub_char1_NE(info);
		else if (ne == Cnd_iv_sub_char2) doCnd_iv_sub_char2_NE(info);
		else if (ne == Cnd_iv_sub_char3) doCnd_iv_sub_char3_NE(info);
		else if (ne == Cnd_iv_d_sub_char1) doCnd_iv_d_sub_char1_NE(info);
		else if (ne == Cnd_iv_d_sub_char2) doCnd_iv_d_sub_char2_NE(info);
		else if (ne == Cnd_iv_d_sub_char3) doCnd_iv_d_sub_char3_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == Cnd_inc_past_flg) doCnd_inc_past_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_pl_skip_flg) doRslt_pl_skip_flg_NE(info);
		else if (ne == columnRslt_ex_im_comp_flg) doRslt_ex_im_comp_flg_NE(info);
		else if (ne == columnRslt_non_cmpl_flg) doRslt_non_cmpl_flg_NE(info);
		else if (ne == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NE(info);
		else if (ne == columnRslt_iv_prnt_flg) doRslt_iv_prnt_flg_NE(info);
		else if (ne == columnRslt_pl_prnt_flg) doRslt_pl_prnt_flg_NE(info);
		else if (ne == columnRslt_iv_comp_flg) doRslt_iv_comp_flg_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_iv_rev) doRslt_iv_rev_NE(info);
		else if (ne == columnRslt_iv_d_no) doRslt_iv_d_no_NE(info);
		else if (ne == columnRslt_iv_mng_no) doRslt_iv_mng_no_NE(info);
		else if (ne == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_NE(info);
		else if (ne == columnRslt_trd_schd_dt) doRslt_trd_schd_dt_NE(info);
		else if (ne == columnRslt_cmpl_dt) doRslt_cmpl_dt_NE(info);
		else if (ne == columnRslt_iv_dt) doRslt_iv_dt_NE(info);
		else if (ne == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NE(info);
		else if (ne == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NE(info);
		else if (ne == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NE(info);
		else if (ne == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NE(info);
		else if (ne == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnRslt_trnspt_cd) doRslt_trnspt_cd_NE(info);
		else if (ne == columnRslt_trnspt_nm) doRslt_trnspt_nm_NE(info);
		else if (ne == columnRslt_vssl_flght) doRslt_vssl_flght_NE(info);
		else if (ne == columnRslt_load_port_cd) doRslt_load_port_cd_NE(info);
		else if (ne == columnRslt_load_port_nm) doRslt_load_port_nm_NE(info);
		else if (ne == columnRslt_etd_dt) doRslt_etd_dt_NE(info);
		else if (ne == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NE(info);
		else if (ne == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NE(info);
		else if (ne == columnRslt_eta_dt) doRslt_eta_dt_NE(info);
		else if (ne == columnRslt_via_port_cd) doRslt_via_port_cd_NE(info);
		else if (ne == columnRslt_via_port_nm) doRslt_via_port_nm_NE(info);
		else if (ne == columnRslt_via_schd_dt) doRslt_via_schd_dt_NE(info);
		else if (ne == columnRslt_tterm_cd1) doRslt_tterm_cd1_NE(info);
		else if (ne == columnRslt_tterm_nm1) doRslt_tterm_nm1_NE(info);
		else if (ne == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_tterm_cd2) doRslt_tterm_cd2_NE(info);
		else if (ne == columnRslt_tterm_nm2) doRslt_tterm_nm2_NE(info);
		else if (ne == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_ttl_net_wt) doRslt_ttl_net_wt_NE(info);
		else if (ne == columnRslt_ttl_grss_wt) doRslt_ttl_grss_wt_NE(info);
		else if (ne == columnRslt_ttl_dim) doRslt_ttl_dim_NE(info);
		else if (ne == columnRslt_tterm_cd3) doRslt_tterm_cd3_NE(info);
		else if (ne == columnRslt_tterm_nm3) doRslt_tterm_nm3_NE(info);
		else if (ne == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_case_mrk1) doRslt_case_mrk1_NE(info);
		else if (ne == columnRslt_case_mrk2) doRslt_case_mrk2_NE(info);
		else if (ne == columnRslt_case_mrk3) doRslt_case_mrk3_NE(info);
		else if (ne == columnRslt_case_mrk4) doRslt_case_mrk4_NE(info);
		else if (ne == columnRslt_case_mrk5) doRslt_case_mrk5_NE(info);
		else if (ne == columnRslt_case_mrk6) doRslt_case_mrk6_NE(info);
		else if (ne == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NE(info);
		else if (ne == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_lc_no) doRslt_lc_no_NE(info);
		else if (ne == columnRslt_lc_dt) doRslt_lc_dt_NE(info);
		else if (ne == columnRslt_lc_rmrks) doRslt_lc_rmrks_NE(info);
		else if (ne == columnRslt_bl_no) doRslt_bl_no_NE(info);
		else if (ne == columnRslt_bl_dt) doRslt_bl_dt_NE(info);
		else if (ne == columnRslt_bl_rmrks) doRslt_bl_rmrks_NE(info);
		else if (ne == columnRslt_iv_rmrks) doRslt_iv_rmrks_NE(info);
		else if (ne == columnRslt_pl_reg_flg) doRslt_pl_reg_flg_NE(info);
		else if (ne == columnRslt_pl_rmrks) doRslt_pl_rmrks_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_pre_rcpt_iv_flg) doRslt_pre_rcpt_iv_flg_NE(info);
		else if (ne == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_purc_schd_no) doRslt_purc_schd_no_NE(info);
		else if (ne == columnRslt_purc_cmpl_flg) doRslt_purc_cmpl_flg_NE(info);
		else if (ne == columnRslt_iv_intr_rmrks) doRslt_iv_intr_rmrks_NE(info);
		else if (ne == columnRslt_iv_sub_char1) doRslt_iv_sub_char1_NE(info);
		else if (ne == columnRslt_iv_sub_char2) doRslt_iv_sub_char2_NE(info);
		else if (ne == columnRslt_iv_sub_char3) doRslt_iv_sub_char3_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NE(info);
		else if (ne == columnRslt_ship_inst_no) doRslt_ship_inst_no_NE(info);
		else if (ne == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NE(info);
		else if (ne == columnRslt_ship_act_no) doRslt_ship_act_no_NE(info);
		else if (ne == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NE(info);
		else if (ne == columnRslt_sls_act_no) doRslt_sls_act_no_NE(info);
		else if (ne == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NE(info);
		else if (ne == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NE(info);
		else if (ne == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NE(info);
		else if (ne == columnRslt_bndl_flg) doRslt_bndl_flg_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NE(info);
		else if (ne == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NE(info);
		else if (ne == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NE(info);
		else if (ne == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_NE(info);
		else if (ne == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_NE(info);
		else if (ne == columnRslt_ship_site_cd) doRslt_ship_site_cd_NE(info);
		else if (ne == columnRslt_ship_site_nm) doRslt_ship_site_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NE(info);
		else if (ne == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_rsn_cd) doRslt_rsn_cd_NE(info);
		else if (ne == columnRslt_rsn_nm) doRslt_rsn_nm_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NE(info);
		else if (ne == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NE(info);
		else if (ne == columnRslt_manual_add_flg) doRslt_manual_add_flg_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_iv_d_rmrks) doRslt_iv_d_rmrks_NE(info);
		else if (ne == columnRslt_iv_d_intr_rmrks) doRslt_iv_d_intr_rmrks_NE(info);
		else if (ne == columnRslt_iv_d_sub_char1) doRslt_iv_d_sub_char1_NE(info);
		else if (ne == columnRslt_iv_d_sub_char2) doRslt_iv_d_sub_char2_NE(info);
		else if (ne == columnRslt_iv_d_sub_char3) doRslt_iv_d_sub_char3_NE(info);
		else if (ne == columnRslt_ship_inst_d_sub_char1) doRslt_ship_inst_d_sub_char1_NE(info);
		else if (ne == columnRslt_ship_inst_d_sub_char2) doRslt_ship_inst_d_sub_char2_NE(info);
		else if (ne == columnRslt_ship_inst_d_sub_char3) doRslt_ship_inst_d_sub_char3_NE(info);
		else if (ne == columnRslt_ship_act_d_sub_char1) doRslt_ship_act_d_sub_char1_NE(info);
		else if (ne == columnRslt_ship_act_d_sub_char2) doRslt_ship_act_d_sub_char2_NE(info);
		else if (ne == columnRslt_ship_act_d_sub_char3) doRslt_ship_act_d_sub_char3_NE(info);
		else if (ne == columnRslt_iv_ship_act_d_sub_char1) doRslt_iv_ship_act_d_sub_char1_NE(info);
		else if (ne == columnRslt_iv_ship_act_d_sub_char2) doRslt_iv_ship_act_d_sub_char2_NE(info);
		else if (ne == columnRslt_iv_ship_act_d_sub_char3) doRslt_iv_ship_act_d_sub_char3_NE(info);
		else if (ne == columnRslt_sls_act_d_sub_char1) doRslt_sls_act_d_sub_char1_NE(info);
		else if (ne == columnRslt_sls_act_d_sub_char2) doRslt_sls_act_d_sub_char2_NE(info);
		else if (ne == columnRslt_sls_act_d_sub_char3) doRslt_sls_act_d_sub_char3_NE(info);
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
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NE(info);
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
	 * [Cnd]パネルの[srch_mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ex_im_not_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ex_im_not_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ex_im_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ex_im_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_im_not_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_im_not_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_im_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_im_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_not_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_not_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_prnt_yet_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_prnt_yet_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_prnt_done_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_prnt_done_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_prnt_yet_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_prnt_yet_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_prnt_done_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_prnt_done_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ex_im_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ex_im_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_comp_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trnspt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_net_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_net_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_grss_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_grss_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_dim_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk6_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_rcpt_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_rcpt_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bndl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[manual_add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_add_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NE(MCEventInfo info){
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
		else if (nx == Cnd_srch_mode_Group) doCnd_srch_mode_NX(info);
		else if (nx == Cnd_ex_im_not_comp_flg) doCnd_ex_im_not_comp_flg_NX(info);
		else if (nx == Cnd_ex_im_comp_flg) doCnd_ex_im_comp_flg_NX(info);
		else if (nx == Cnd_purc_im_not_comp_flg) doCnd_purc_im_not_comp_flg_NX(info);
		else if (nx == Cnd_purc_im_comp_flg) doCnd_purc_im_comp_flg_NX(info);
		else if (nx == Cnd_iv_not_reg_flg) doCnd_iv_not_reg_flg_NX(info);
		else if (nx == Cnd_iv_reg_flg) doCnd_iv_reg_flg_NX(info);
		else if (nx == Cnd_pl_not_reg_flg) doCnd_pl_not_reg_flg_NX(info);
		else if (nx == Cnd_pl_reg_flg) doCnd_pl_reg_flg_NX(info);
		else if (nx == Cnd_pl_skip_flg) doCnd_pl_skip_flg_NX(info);
		else if (nx == Cnd_iv_prnt_yet_flg) doCnd_iv_prnt_yet_flg_NX(info);
		else if (nx == Cnd_iv_prnt_done_flg) doCnd_iv_prnt_done_flg_NX(info);
		else if (nx == Cnd_pl_prnt_yet_flg) doCnd_pl_prnt_yet_flg_NX(info);
		else if (nx == Cnd_pl_prnt_done_flg) doCnd_pl_prnt_done_flg_NX(info);
		else if (nx == Cnd_not_iv_flg) doCnd_not_iv_flg_NX(info);
		else if (nx == Cnd_not_inst_flg) doCnd_not_inst_flg_NX(info);
		else if (nx == Cnd_part_inst_flg) doCnd_part_inst_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_not_ship_flg) doCnd_not_ship_flg_NX(info);
		else if (nx == Cnd_part_ship_flg) doCnd_part_ship_flg_NX(info);
		else if (nx == Cnd_ship_flg) doCnd_ship_flg_NX(info);
		else if (nx == Cnd_not_sls_flg) doCnd_not_sls_flg_NX(info);
		else if (nx == Cnd_sls_flg) doCnd_sls_flg_NX(info);
		else if (nx == Cnd_comp_flg) doCnd_comp_flg_NX(info);
		else if (nx == Cnd_iv_not_comp_flg) doCnd_iv_not_comp_flg_NX(info);
		else if (nx == Cnd_iv_comp_flg) doCnd_iv_comp_flg_NX(info);
		else if (nx == Cnd_sls_cststk_flg) doCnd_sls_cststk_flg_NX(info);
		else if (nx == Cnd_sls_cststk_invalid_flg) doCnd_sls_cststk_invalid_flg_NX(info);
		else if (nx == Cnd_iv_dt_fr) doCnd_iv_dt_fr_NX(info);
		else if (nx == Cnd_iv_dt_to) doCnd_iv_dt_to_NX(info);
		else if (nx == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_NX(info);
		else if (nx == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_NX(info);
		else if (nx == Cnd_cmpl_dt_fr) doCnd_cmpl_dt_fr_NX(info);
		else if (nx == Cnd_cmpl_dt_to) doCnd_cmpl_dt_to_NX(info);
		else if (nx == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_NX(info);
		else if (nx == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_NX(info);
		else if (nx == Cnd_tdlv_cd) doCnd_tdlv_cd_NX(info);
		else if (nx == Cnd_tdlv_nm) doCnd_tdlv_nm_NX(info);
		else if (nx == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NX(info);
		else if (nx == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NX(info);
		else if (nx == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NX(info);
		else if (nx == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NX(info);
		else if (nx == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_ship_inst_no) doCnd_ship_inst_no_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_ship_loc_cd) doCnd_ship_loc_cd_NX(info);
		else if (nx == Cnd_ship_loc_nm) doCnd_ship_loc_nm_NX(info);
		else if (nx == Cnd_ship_site_cd) doCnd_ship_site_cd_NX(info);
		else if (nx == Cnd_ship_site_nm) doCnd_ship_site_nm_NX(info);
		else if (nx == Cnd_iv_rmrks) doCnd_iv_rmrks_NX(info);
		else if (nx == Cnd_iv_d_rmrks) doCnd_iv_d_rmrks_NX(info);
		else if (nx == Cnd_pl_rmrks) doCnd_pl_rmrks_NX(info);
		else if (nx == Cnd_iv_intr_rmrks) doCnd_iv_intr_rmrks_NX(info);
		else if (nx == Cnd_iv_d_intr_rmrks) doCnd_iv_d_intr_rmrks_NX(info);
		else if (nx == Cnd_iv_sub_char1) doCnd_iv_sub_char1_NX(info);
		else if (nx == Cnd_iv_sub_char2) doCnd_iv_sub_char2_NX(info);
		else if (nx == Cnd_iv_sub_char3) doCnd_iv_sub_char3_NX(info);
		else if (nx == Cnd_iv_d_sub_char1) doCnd_iv_d_sub_char1_NX(info);
		else if (nx == Cnd_iv_d_sub_char2) doCnd_iv_d_sub_char2_NX(info);
		else if (nx == Cnd_iv_d_sub_char3) doCnd_iv_d_sub_char3_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == Cnd_inc_past_flg) doCnd_inc_past_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_pl_skip_flg) doRslt_pl_skip_flg_NX(info);
		else if (nx == columnRslt_ex_im_comp_flg) doRslt_ex_im_comp_flg_NX(info);
		else if (nx == columnRslt_non_cmpl_flg) doRslt_non_cmpl_flg_NX(info);
		else if (nx == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NX(info);
		else if (nx == columnRslt_iv_prnt_flg) doRslt_iv_prnt_flg_NX(info);
		else if (nx == columnRslt_pl_prnt_flg) doRslt_pl_prnt_flg_NX(info);
		else if (nx == columnRslt_iv_comp_flg) doRslt_iv_comp_flg_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_iv_rev) doRslt_iv_rev_NX(info);
		else if (nx == columnRslt_iv_d_no) doRslt_iv_d_no_NX(info);
		else if (nx == columnRslt_iv_mng_no) doRslt_iv_mng_no_NX(info);
		else if (nx == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_NX(info);
		else if (nx == columnRslt_trd_schd_dt) doRslt_trd_schd_dt_NX(info);
		else if (nx == columnRslt_cmpl_dt) doRslt_cmpl_dt_NX(info);
		else if (nx == columnRslt_iv_dt) doRslt_iv_dt_NX(info);
		else if (nx == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NX(info);
		else if (nx == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NX(info);
		else if (nx == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NX(info);
		else if (nx == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NX(info);
		else if (nx == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnRslt_trnspt_cd) doRslt_trnspt_cd_NX(info);
		else if (nx == columnRslt_trnspt_nm) doRslt_trnspt_nm_NX(info);
		else if (nx == columnRslt_vssl_flght) doRslt_vssl_flght_NX(info);
		else if (nx == columnRslt_load_port_cd) doRslt_load_port_cd_NX(info);
		else if (nx == columnRslt_load_port_nm) doRslt_load_port_nm_NX(info);
		else if (nx == columnRslt_etd_dt) doRslt_etd_dt_NX(info);
		else if (nx == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NX(info);
		else if (nx == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NX(info);
		else if (nx == columnRslt_eta_dt) doRslt_eta_dt_NX(info);
		else if (nx == columnRslt_via_port_cd) doRslt_via_port_cd_NX(info);
		else if (nx == columnRslt_via_port_nm) doRslt_via_port_nm_NX(info);
		else if (nx == columnRslt_via_schd_dt) doRslt_via_schd_dt_NX(info);
		else if (nx == columnRslt_tterm_cd1) doRslt_tterm_cd1_NX(info);
		else if (nx == columnRslt_tterm_nm1) doRslt_tterm_nm1_NX(info);
		else if (nx == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_tterm_cd2) doRslt_tterm_cd2_NX(info);
		else if (nx == columnRslt_tterm_nm2) doRslt_tterm_nm2_NX(info);
		else if (nx == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_ttl_net_wt) doRslt_ttl_net_wt_NX(info);
		else if (nx == columnRslt_ttl_grss_wt) doRslt_ttl_grss_wt_NX(info);
		else if (nx == columnRslt_ttl_dim) doRslt_ttl_dim_NX(info);
		else if (nx == columnRslt_tterm_cd3) doRslt_tterm_cd3_NX(info);
		else if (nx == columnRslt_tterm_nm3) doRslt_tterm_nm3_NX(info);
		else if (nx == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_case_mrk1) doRslt_case_mrk1_NX(info);
		else if (nx == columnRslt_case_mrk2) doRslt_case_mrk2_NX(info);
		else if (nx == columnRslt_case_mrk3) doRslt_case_mrk3_NX(info);
		else if (nx == columnRslt_case_mrk4) doRslt_case_mrk4_NX(info);
		else if (nx == columnRslt_case_mrk5) doRslt_case_mrk5_NX(info);
		else if (nx == columnRslt_case_mrk6) doRslt_case_mrk6_NX(info);
		else if (nx == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NX(info);
		else if (nx == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_lc_no) doRslt_lc_no_NX(info);
		else if (nx == columnRslt_lc_dt) doRslt_lc_dt_NX(info);
		else if (nx == columnRslt_lc_rmrks) doRslt_lc_rmrks_NX(info);
		else if (nx == columnRslt_bl_no) doRslt_bl_no_NX(info);
		else if (nx == columnRslt_bl_dt) doRslt_bl_dt_NX(info);
		else if (nx == columnRslt_bl_rmrks) doRslt_bl_rmrks_NX(info);
		else if (nx == columnRslt_iv_rmrks) doRslt_iv_rmrks_NX(info);
		else if (nx == columnRslt_pl_reg_flg) doRslt_pl_reg_flg_NX(info);
		else if (nx == columnRslt_pl_rmrks) doRslt_pl_rmrks_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_pre_rcpt_iv_flg) doRslt_pre_rcpt_iv_flg_NX(info);
		else if (nx == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_purc_schd_no) doRslt_purc_schd_no_NX(info);
		else if (nx == columnRslt_purc_cmpl_flg) doRslt_purc_cmpl_flg_NX(info);
		else if (nx == columnRslt_iv_intr_rmrks) doRslt_iv_intr_rmrks_NX(info);
		else if (nx == columnRslt_iv_sub_char1) doRslt_iv_sub_char1_NX(info);
		else if (nx == columnRslt_iv_sub_char2) doRslt_iv_sub_char2_NX(info);
		else if (nx == columnRslt_iv_sub_char3) doRslt_iv_sub_char3_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NX(info);
		else if (nx == columnRslt_ship_inst_no) doRslt_ship_inst_no_NX(info);
		else if (nx == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NX(info);
		else if (nx == columnRslt_ship_act_no) doRslt_ship_act_no_NX(info);
		else if (nx == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NX(info);
		else if (nx == columnRslt_sls_act_no) doRslt_sls_act_no_NX(info);
		else if (nx == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NX(info);
		else if (nx == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NX(info);
		else if (nx == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NX(info);
		else if (nx == columnRslt_bndl_flg) doRslt_bndl_flg_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NX(info);
		else if (nx == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_NX(info);
		else if (nx == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_NX(info);
		else if (nx == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_NX(info);
		else if (nx == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_NX(info);
		else if (nx == columnRslt_ship_site_cd) doRslt_ship_site_cd_NX(info);
		else if (nx == columnRslt_ship_site_nm) doRslt_ship_site_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NX(info);
		else if (nx == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_rsn_cd) doRslt_rsn_cd_NX(info);
		else if (nx == columnRslt_rsn_nm) doRslt_rsn_nm_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NX(info);
		else if (nx == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NX(info);
		else if (nx == columnRslt_manual_add_flg) doRslt_manual_add_flg_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_iv_d_rmrks) doRslt_iv_d_rmrks_NX(info);
		else if (nx == columnRslt_iv_d_intr_rmrks) doRslt_iv_d_intr_rmrks_NX(info);
		else if (nx == columnRslt_iv_d_sub_char1) doRslt_iv_d_sub_char1_NX(info);
		else if (nx == columnRslt_iv_d_sub_char2) doRslt_iv_d_sub_char2_NX(info);
		else if (nx == columnRslt_iv_d_sub_char3) doRslt_iv_d_sub_char3_NX(info);
		else if (nx == columnRslt_ship_inst_d_sub_char1) doRslt_ship_inst_d_sub_char1_NX(info);
		else if (nx == columnRslt_ship_inst_d_sub_char2) doRslt_ship_inst_d_sub_char2_NX(info);
		else if (nx == columnRslt_ship_inst_d_sub_char3) doRslt_ship_inst_d_sub_char3_NX(info);
		else if (nx == columnRslt_ship_act_d_sub_char1) doRslt_ship_act_d_sub_char1_NX(info);
		else if (nx == columnRslt_ship_act_d_sub_char2) doRslt_ship_act_d_sub_char2_NX(info);
		else if (nx == columnRslt_ship_act_d_sub_char3) doRslt_ship_act_d_sub_char3_NX(info);
		else if (nx == columnRslt_iv_ship_act_d_sub_char1) doRslt_iv_ship_act_d_sub_char1_NX(info);
		else if (nx == columnRslt_iv_ship_act_d_sub_char2) doRslt_iv_ship_act_d_sub_char2_NX(info);
		else if (nx == columnRslt_iv_ship_act_d_sub_char3) doRslt_iv_ship_act_d_sub_char3_NX(info);
		else if (nx == columnRslt_sls_act_d_sub_char1) doRslt_sls_act_d_sub_char1_NX(info);
		else if (nx == columnRslt_sls_act_d_sub_char2) doRslt_sls_act_d_sub_char2_NX(info);
		else if (nx == columnRslt_sls_act_d_sub_char3) doRslt_sls_act_d_sub_char3_NX(info);
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
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NX(info);
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
	 * [Cnd]パネルの[srch_mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ex_im_not_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ex_im_not_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ex_im_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ex_im_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_im_not_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_im_not_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_im_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_im_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_not_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_not_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_prnt_yet_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_prnt_yet_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_prnt_done_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_prnt_done_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_prnt_yet_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_prnt_yet_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_prnt_done_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_prnt_done_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_cststk_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_cststk_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ex_im_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ex_im_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_comp_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trnspt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_net_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_net_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_grss_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_grss_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_dim_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk6_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_rcpt_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_rcpt_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bndl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[manual_add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_add_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NX(MCEventInfo info){
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
		if (lc == Cnd_iv_dt_fr) doCnd_iv_dt_fr_LC(info);
		else if (lc == Cnd_iv_dt_to) doCnd_iv_dt_to_LC(info);
		else if (lc == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_LC(info);
		else if (lc == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_LC(info);
		else if (lc == Cnd_cmpl_dt_fr) doCnd_cmpl_dt_fr_LC(info);
		else if (lc == Cnd_cmpl_dt_to) doCnd_cmpl_dt_to_LC(info);
		else if (lc == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_LC(info);
		else if (lc == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_LC(info);
		else if (lc == Cnd_tdlv_cd) doCnd_tdlv_cd_LC(info);
		else if (lc == Cnd_tdlv_nm) doCnd_tdlv_nm_LC(info);
		else if (lc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_LC(info);
		else if (lc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_LC(info);
		else if (lc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_LC(info);
		else if (lc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_LC(info);
		else if (lc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_ship_rqst_no) doCnd_ship_rqst_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_ship_inst_no) doCnd_ship_inst_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_ship_loc_cd) doCnd_ship_loc_cd_LC(info);
		else if (lc == Cnd_ship_loc_nm) doCnd_ship_loc_nm_LC(info);
		else if (lc == Cnd_ship_site_cd) doCnd_ship_site_cd_LC(info);
		else if (lc == Cnd_ship_site_nm) doCnd_ship_site_nm_LC(info);
		else if (lc == Cnd_iv_rmrks) doCnd_iv_rmrks_LC(info);
		else if (lc == Cnd_iv_d_rmrks) doCnd_iv_d_rmrks_LC(info);
		else if (lc == Cnd_pl_rmrks) doCnd_pl_rmrks_LC(info);
		else if (lc == Cnd_iv_intr_rmrks) doCnd_iv_intr_rmrks_LC(info);
		else if (lc == Cnd_iv_d_intr_rmrks) doCnd_iv_d_intr_rmrks_LC(info);
		else if (lc == Cnd_iv_sub_char1) doCnd_iv_sub_char1_LC(info);
		else if (lc == Cnd_iv_sub_char2) doCnd_iv_sub_char2_LC(info);
		else if (lc == Cnd_iv_sub_char3) doCnd_iv_sub_char3_LC(info);
		else if (lc == Cnd_iv_d_sub_char1) doCnd_iv_d_sub_char1_LC(info);
		else if (lc == Cnd_iv_d_sub_char2) doCnd_iv_d_sub_char2_LC(info);
		else if (lc == Cnd_iv_d_sub_char3) doCnd_iv_d_sub_char3_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_iv_rev) doRslt_iv_rev_LC(info);
		else if (lc == columnRslt_iv_d_no) doRslt_iv_d_no_LC(info);
		else if (lc == columnRslt_iv_mng_no) doRslt_iv_mng_no_LC(info);
		else if (lc == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_LC(info);
		else if (lc == columnRslt_trd_schd_dt) doRslt_trd_schd_dt_LC(info);
		else if (lc == columnRslt_cmpl_dt) doRslt_cmpl_dt_LC(info);
		else if (lc == columnRslt_iv_dt) doRslt_iv_dt_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_LC(info);
		else if (lc == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_LC(info);
		else if (lc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_LC(info);
		else if (lc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_LC(info);
		else if (lc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnRslt_trnspt_cd) doRslt_trnspt_cd_LC(info);
		else if (lc == columnRslt_trnspt_nm) doRslt_trnspt_nm_LC(info);
		else if (lc == columnRslt_vssl_flght) doRslt_vssl_flght_LC(info);
		else if (lc == columnRslt_load_port_cd) doRslt_load_port_cd_LC(info);
		else if (lc == columnRslt_load_port_nm) doRslt_load_port_nm_LC(info);
		else if (lc == columnRslt_etd_dt) doRslt_etd_dt_LC(info);
		else if (lc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_LC(info);
		else if (lc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_LC(info);
		else if (lc == columnRslt_eta_dt) doRslt_eta_dt_LC(info);
		else if (lc == columnRslt_via_port_cd) doRslt_via_port_cd_LC(info);
		else if (lc == columnRslt_via_port_nm) doRslt_via_port_nm_LC(info);
		else if (lc == columnRslt_via_schd_dt) doRslt_via_schd_dt_LC(info);
		else if (lc == columnRslt_tterm_cd1) doRslt_tterm_cd1_LC(info);
		else if (lc == columnRslt_tterm_nm1) doRslt_tterm_nm1_LC(info);
		else if (lc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_tterm_cd2) doRslt_tterm_cd2_LC(info);
		else if (lc == columnRslt_tterm_nm2) doRslt_tterm_nm2_LC(info);
		else if (lc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_ttl_net_wt) doRslt_ttl_net_wt_LC(info);
		else if (lc == columnRslt_ttl_grss_wt) doRslt_ttl_grss_wt_LC(info);
		else if (lc == columnRslt_ttl_dim) doRslt_ttl_dim_LC(info);
		else if (lc == columnRslt_tterm_cd3) doRslt_tterm_cd3_LC(info);
		else if (lc == columnRslt_tterm_nm3) doRslt_tterm_nm3_LC(info);
		else if (lc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_case_mrk1) doRslt_case_mrk1_LC(info);
		else if (lc == columnRslt_case_mrk2) doRslt_case_mrk2_LC(info);
		else if (lc == columnRslt_case_mrk3) doRslt_case_mrk3_LC(info);
		else if (lc == columnRslt_case_mrk4) doRslt_case_mrk4_LC(info);
		else if (lc == columnRslt_case_mrk5) doRslt_case_mrk5_LC(info);
		else if (lc == columnRslt_case_mrk6) doRslt_case_mrk6_LC(info);
		else if (lc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_LC(info);
		else if (lc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_lc_no) doRslt_lc_no_LC(info);
		else if (lc == columnRslt_lc_dt) doRslt_lc_dt_LC(info);
		else if (lc == columnRslt_lc_rmrks) doRslt_lc_rmrks_LC(info);
		else if (lc == columnRslt_bl_no) doRslt_bl_no_LC(info);
		else if (lc == columnRslt_bl_dt) doRslt_bl_dt_LC(info);
		else if (lc == columnRslt_bl_rmrks) doRslt_bl_rmrks_LC(info);
		else if (lc == columnRslt_iv_rmrks) doRslt_iv_rmrks_LC(info);
		else if (lc == columnRslt_pl_rmrks) doRslt_pl_rmrks_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_purc_schd_no) doRslt_purc_schd_no_LC(info);
		else if (lc == columnRslt_iv_intr_rmrks) doRslt_iv_intr_rmrks_LC(info);
		else if (lc == columnRslt_iv_sub_char1) doRslt_iv_sub_char1_LC(info);
		else if (lc == columnRslt_iv_sub_char2) doRslt_iv_sub_char2_LC(info);
		else if (lc == columnRslt_iv_sub_char3) doRslt_iv_sub_char3_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_LC(info);
		else if (lc == columnRslt_ship_inst_no) doRslt_ship_inst_no_LC(info);
		else if (lc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_LC(info);
		else if (lc == columnRslt_ship_act_no) doRslt_ship_act_no_LC(info);
		else if (lc == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_LC(info);
		else if (lc == columnRslt_sls_act_no) doRslt_sls_act_no_LC(info);
		else if (lc == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_LC(info);
		else if (lc == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_LC(info);
		else if (lc == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_LC(info);
		else if (lc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_ship_loc_cd) doRslt_ship_loc_cd_LC(info);
		else if (lc == columnRslt_ship_loc_nm) doRslt_ship_loc_nm_LC(info);
		else if (lc == columnRslt_ship_str_ln_cd) doRslt_ship_str_ln_cd_LC(info);
		else if (lc == columnRslt_ship_str_ln_nm) doRslt_ship_str_ln_nm_LC(info);
		else if (lc == columnRslt_ship_site_cd) doRslt_ship_site_cd_LC(info);
		else if (lc == columnRslt_ship_site_nm) doRslt_ship_site_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_tax_rate) doRslt_tax_rate_LC(info);
		else if (lc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_LC(info);
		else if (lc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_rsn_cd) doRslt_rsn_cd_LC(info);
		else if (lc == columnRslt_rsn_nm) doRslt_rsn_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		else if (lc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_iv_d_rmrks) doRslt_iv_d_rmrks_LC(info);
		else if (lc == columnRslt_iv_d_intr_rmrks) doRslt_iv_d_intr_rmrks_LC(info);
		else if (lc == columnRslt_iv_d_sub_char1) doRslt_iv_d_sub_char1_LC(info);
		else if (lc == columnRslt_iv_d_sub_char2) doRslt_iv_d_sub_char2_LC(info);
		else if (lc == columnRslt_iv_d_sub_char3) doRslt_iv_d_sub_char3_LC(info);
		else if (lc == columnRslt_ship_inst_d_sub_char1) doRslt_ship_inst_d_sub_char1_LC(info);
		else if (lc == columnRslt_ship_inst_d_sub_char2) doRslt_ship_inst_d_sub_char2_LC(info);
		else if (lc == columnRslt_ship_inst_d_sub_char3) doRslt_ship_inst_d_sub_char3_LC(info);
		else if (lc == columnRslt_ship_act_d_sub_char1) doRslt_ship_act_d_sub_char1_LC(info);
		else if (lc == columnRslt_ship_act_d_sub_char2) doRslt_ship_act_d_sub_char2_LC(info);
		else if (lc == columnRslt_ship_act_d_sub_char3) doRslt_ship_act_d_sub_char3_LC(info);
		else if (lc == columnRslt_iv_ship_act_d_sub_char1) doRslt_iv_ship_act_d_sub_char1_LC(info);
		else if (lc == columnRslt_iv_ship_act_d_sub_char2) doRslt_iv_ship_act_d_sub_char2_LC(info);
		else if (lc == columnRslt_iv_ship_act_d_sub_char3) doRslt_iv_ship_act_d_sub_char3_LC(info);
		else if (lc == columnRslt_sls_act_d_sub_char1) doRslt_sls_act_d_sub_char1_LC(info);
		else if (lc == columnRslt_sls_act_d_sub_char2) doRslt_sls_act_d_sub_char2_LC(info);
		else if (lc == columnRslt_sls_act_d_sub_char3) doRslt_sls_act_d_sub_char3_LC(info);
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
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_LC(info);
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_d_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trnspt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_net_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_net_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_grss_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_grss_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_dim_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[case_mrk6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_case_mrk6_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lc_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lc_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cntry_org_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_site_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_act_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_fr_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_fr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_cd]の作成メソッド
	 */
	public MCList getCnd_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_typ]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipRqstIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_cd]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipRqstId(row, info);
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
	 * コンボ／リストのリスト[Cnd_ship_loc_cd]の作成メソッド
	 */
	public MCList getCnd_ship_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_site_cd]の作成メソッド
	 */
	public MCList getCnd_ship_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1770.Srch01")) {
			return new MS_MSBEL1770_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1770.Prnt01")) {
			return new MS_MSBEL1770_Prnt01Bridge();
		}
		if (id.equals("MS.MSBEL1770.Prnt02")) {
			return new MS_MSBEL1770_Prnt02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1770_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1770_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1770_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1770_Srch01Bridge() {
			p_MS_MSBEL1770_Srch01 = new MCParam(PDef.MS_MSBEL1770_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1770_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1770.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));

			p_MS_MSBEL1770_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1770_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1770_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1770_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1770_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1770.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1770.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1770.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1770_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1770_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)p_MS_MSBEL1770_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1770_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1770_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1770_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1770_Prnt01Bridge() {
			p_MS_MSBEL1770_Prnt01 = new MCParam(PDef.MS_MSBEL1770_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1770_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1770.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));

			p_MS_MSBEL1770_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1770_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1770_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1770_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1770_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1770_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1770.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1770.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1770.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1770.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1770_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1770_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)p_MS_MSBEL1770_Prnt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1770_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1770_Prnt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1770_Prnt02;

		/** コンストラクタ */
		protected MS_MSBEL1770_Prnt02Bridge() {
			p_MS_MSBEL1770_Prnt02 = new MCParam(PDef.MS_MSBEL1770_Prnt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1770_Prnt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1770.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));

			p_MS_MSBEL1770_Prnt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1770_Prnt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1770_Prnt02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1770_Prnt02.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1770_Prnt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1770_Prnt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1770.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1770.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1770.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1770.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1770_Prnt02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1770.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1770_Prnt02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1770.RsltR>)p_MS_MSBEL1770_Prnt02.getContainerParam().getDownBlock(0));
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