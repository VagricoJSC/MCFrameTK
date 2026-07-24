package mcframe.clientMSBB.MSBBP1370;

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
import mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Srch01Caller;
import mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Upd01Caller;
import mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt01Caller;
import mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt02Caller;
import mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt03Caller;

/**
 * 画面"MSBBP_SlsDtlModReg"パネルクラスです。<p>
 *
 * 売上に関する実績を訂正、照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SlsDtlModReg_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1370";

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
	// [SrchTyp]ブロック関連のField定義
	public MCPanel SrchTypPanel = null;
	public MCTitledBorder SrchTypTitledBorder = null;
	// [SrchTyp]ブロックの項目のField定義
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
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [Tab6]ブロック関連のField定義
	public MCPanel Tab6Panel = null;
	// [Tab6]ブロックの項目のField定義
	// [Iv]ブロック関連のField定義
	public MCPanel IvPanel = null;
	public MCTitledBorder IvTitledBorder = null;
	// [Iv]ブロックの項目のField定義
	// [Upri]ブロック関連のField定義
	public MCPanel UpriPanel = null;
	public MCTitledBorder UpriTitledBorder = null;
	// [Upri]ブロックの項目のField定義
	// [AprvSts]ブロック関連のField定義
	public MCPanel AprvStsPanel = null;
	public MCTitledBorder AprvStsTitledBorder = null;
	// [AprvSts]ブロックの項目のField定義
	// [CstGrp]ブロック関連のField定義
	public MCPanel CstGrpPanel = null;
	// [CstGrp]ブロックの項目のField定義
	// [DlvGrp]ブロック関連のField定義
	public MCPanel DlvGrpPanel = null;
	// [DlvGrp]ブロックの項目のField定義
	// [BcstGrp]ブロック関連のField定義
	public MCPanel BcstGrpPanel = null;
	// [BcstGrp]ブロックの項目のField定義
	// [AcstGrp]ブロック関連のField定義
	public MCPanel AcstGrpPanel = null;
	// [AcstGrp]ブロックの項目のField定義
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Modify,1;REF,View,5; UPD,訂正する,1;REF,参照する,5;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * IO,Breakdown of details;DTL,Details;HDR,Header IO,詳細;DTL,明細;HDR,ヘッダ.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_unit_Group = null;
	public MCRadioButton Cnd_disp_unit_IO = null;
	public MCRadioButton Cnd_disp_unit_DTL = null;
	public MCRadioButton Cnd_disp_unit_HDR = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCCheckBox Cnd_sls = null;
	/**
	 * Return 返品.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_ret = null;
	/**
	 * Discount 値引.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_dscnt = null;
	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_tgt_flg = null;
	/**
	 * Not for invoice transaction インボイス取引対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_not_tgt_flg = null;
	/**
	 * Unit price 本単価.<p>
	 *
	 */
	public MCCheckBox Cnd_not_interim_flg = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCCheckBox Cnd_interim_flg = null;
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_acpt_flg = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCCheckBox Cnd_rjct_flg = null;
	/**
	 * Denied 否認.<p>
	 *
	 */
	public MCCheckBox Cnd_last_rjct_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_aprv_flg = null;
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
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
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
	public MCLabel Cnd_sls_act_no_Label = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_act_no = null;
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
	public MCLabel Cnd_sls_ret_schd_no_Label = null;
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_ret_schd_no = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
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
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_foreign_flg = null;
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
	public MCLabel Cnd_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Cnd_bcst_nm = null;
	public MCLabel Cnd_acst_cd_Label = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCTextField Cnd_acst_nm = null;
	public MCLabel Cnd_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_nm = null;
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
	public MCLabel Cnd_gd_cd_Label = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCTextField Cnd_gd_nm = null;
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
	public MCLabel Cnd_io_sub_char1_Label = null;
	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public MCTextField Cnd_io_sub_char1 = null;
	public MCLabel Cnd_io_sub_char2_Label = null;
	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public MCTextField Cnd_io_sub_char2 = null;
	public MCLabel Cnd_io_sub_char3_Label = null;
	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public MCTextField Cnd_io_sub_char3 = null;
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_dis_can_disp_flg = null;
	/**
	 * Reverse the sign of the return/discount amount 返品・値引金額の符号を反転する.<p>
	 *
	 */
	public MCCheckBox Cnd_sign_rev_flg = null;
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_past_flg = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bcst_grp_p_PPanel;
	public MCLabel Cnd_bcst_grp_lab1;	// [Cnd]の[bcst_grp_p.bp_grp_lab1]を[Cnd_bcst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg1;	// [Cnd]の[bcst_grp_p.bp_grp_flg1]を[Cnd_bcst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd1;	// [Cnd]の[bcst_grp_p.bp_grp_cd1]を[Cnd_bcst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm1;	// [Cnd]の[bcst_grp_p.bp_grp_nm1]を[Cnd_bcst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab2;	// [Cnd]の[bcst_grp_p.bp_grp_lab2]を[Cnd_bcst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg2;	// [Cnd]の[bcst_grp_p.bp_grp_flg2]を[Cnd_bcst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd2;	// [Cnd]の[bcst_grp_p.bp_grp_cd2]を[Cnd_bcst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm2;	// [Cnd]の[bcst_grp_p.bp_grp_nm2]を[Cnd_bcst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab3;	// [Cnd]の[bcst_grp_p.bp_grp_lab3]を[Cnd_bcst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg3;	// [Cnd]の[bcst_grp_p.bp_grp_flg3]を[Cnd_bcst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd3;	// [Cnd]の[bcst_grp_p.bp_grp_cd3]を[Cnd_bcst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm3;	// [Cnd]の[bcst_grp_p.bp_grp_nm3]を[Cnd_bcst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab4;	// [Cnd]の[bcst_grp_p.bp_grp_lab4]を[Cnd_bcst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg4;	// [Cnd]の[bcst_grp_p.bp_grp_flg4]を[Cnd_bcst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd4;	// [Cnd]の[bcst_grp_p.bp_grp_cd4]を[Cnd_bcst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm4;	// [Cnd]の[bcst_grp_p.bp_grp_nm4]を[Cnd_bcst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab5;	// [Cnd]の[bcst_grp_p.bp_grp_lab5]を[Cnd_bcst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg5;	// [Cnd]の[bcst_grp_p.bp_grp_flg5]を[Cnd_bcst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd5;	// [Cnd]の[bcst_grp_p.bp_grp_cd5]を[Cnd_bcst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm5;	// [Cnd]の[bcst_grp_p.bp_grp_nm5]を[Cnd_bcst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab6;	// [Cnd]の[bcst_grp_p.bp_grp_lab6]を[Cnd_bcst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg6;	// [Cnd]の[bcst_grp_p.bp_grp_flg6]を[Cnd_bcst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd6;	// [Cnd]の[bcst_grp_p.bp_grp_cd6]を[Cnd_bcst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm6;	// [Cnd]の[bcst_grp_p.bp_grp_nm6]を[Cnd_bcst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab7;	// [Cnd]の[bcst_grp_p.bp_grp_lab7]を[Cnd_bcst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg7;	// [Cnd]の[bcst_grp_p.bp_grp_flg7]を[Cnd_bcst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd7;	// [Cnd]の[bcst_grp_p.bp_grp_cd7]を[Cnd_bcst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm7;	// [Cnd]の[bcst_grp_p.bp_grp_nm7]を[Cnd_bcst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab8;	// [Cnd]の[bcst_grp_p.bp_grp_lab8]を[Cnd_bcst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg8;	// [Cnd]の[bcst_grp_p.bp_grp_flg8]を[Cnd_bcst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd8;	// [Cnd]の[bcst_grp_p.bp_grp_cd8]を[Cnd_bcst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm8;	// [Cnd]の[bcst_grp_p.bp_grp_nm8]を[Cnd_bcst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab9;	// [Cnd]の[bcst_grp_p.bp_grp_lab9]を[Cnd_bcst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg9;	// [Cnd]の[bcst_grp_p.bp_grp_flg9]を[Cnd_bcst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd9;	// [Cnd]の[bcst_grp_p.bp_grp_cd9]を[Cnd_bcst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm9;	// [Cnd]の[bcst_grp_p.bp_grp_nm9]を[Cnd_bcst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab10;	// [Cnd]の[bcst_grp_p.bp_grp_lab10]を[Cnd_bcst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg10;	// [Cnd]の[bcst_grp_p.bp_grp_flg10]を[Cnd_bcst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd10;	// [Cnd]の[bcst_grp_p.bp_grp_cd10]を[Cnd_bcst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm10;	// [Cnd]の[bcst_grp_p.bp_grp_nm10]を[Cnd_bcst_grp_nm10]としてエイリアス定義。
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
	// [BulkSet]ブロックの項目のField定義
	// [BulkSetTab]ブロック関連のField定義
	public MCPanel BulkSetTabPanel = null;
	public MCTabbedPane BulkSetTabTab = null;
	// [BulkSetTab]ブロックの項目のField定義
	// [UpriXrate]ブロック関連のField定義
	public MCPanel UpriXratePanel = null;
	// [UpriXrate]ブロックの項目のField定義
	// [UpriBulkSet]ブロック関連のField定義
	public MCPanel UpriBulkSetPanel = null;
	public MCTitledBorder UpriBulkSetTitledBorder = null;
	// [UpriBulkSet]ブロックの項目のField定義
	public MCLabel UpriBulkSet_upri_dt_Label = null;
	/**
	 * Adoption date of unit price 単価採用日.<p>
	 *
	 */
	public MCDateField UpriBulkSet_upri_dt = null;
	/**
	 * Unit price bulk acquisition 単価一括取得.<p>
	 *
	 */
	public MCButton UpriBulkSet_upri_replace = null;
	/**
	 * Temporary unit price bulk setting 仮単価一括設定.<p>
	 *
	 */
	public MCLabel UpriBulkSet_label_interim_flg = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton UpriBulkSet_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton UpriBulkSet_deselect_all = null;
	// [XrateBulkSet]ブロック関連のField定義
	public MCPanel XrateBulkSetPanel = null;
	public MCTitledBorder XrateBulkSetTitledBorder = null;
	// [XrateBulkSet]ブロックの項目のField定義
	public MCLabel XrateBulkSet_xrate_dt_Label = null;
	/**
	 * Adoption date of exchange rate 為替レート採用日.<p>
	 *
	 */
	public MCDateField XrateBulkSet_xrate_dt = null;
	/**
	 * Exchange rate bulk acquisition 為替レート一括取得.<p>
	 *
	 */
	public MCButton XrateBulkSet_xrate_replace = null;
	// [TaxBulkSet]ブロック関連のField定義
	public MCPanel TaxBulkSetPanel = null;
	public MCTitledBorder TaxBulkSetTitledBorder = null;
	// [TaxBulkSet]ブロックの項目のField定義
	public MCLabel TaxBulkSet_tax_dt_Label = null;
	/**
	 * Tax adoption date 税採用日.<p>
	 *
	 */
	public MCDateField TaxBulkSet_tax_dt = null;
	/**
	 * Tax bulk acquisition 税一括取得.<p>
	 *
	 */
	public MCButton TaxBulkSet_tax_replace = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1370.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_nm = null;
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_dt = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_dt = null;
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_can_ac_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_basis_dt = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_ship_tm_p_PPanel;
	public MCColumnConfig columnDtl_ship_dt;// [Dtl]の[ship_tm_p.ymd]を[columnDtl_ship_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_ship_hm;// [Dtl]の[ship_tm_p.hm]を[columnDtl_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_dlv_tm_p_PPanel;
	public MCColumnConfig columnDtl_dlv_dt;// [Dtl]の[dlv_tm_p.ymd]を[columnDtl_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_hm;// [Dtl]の[dlv_tm_p.hm]を[columnDtl_dlv_hm]としてエイリアス定義。
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_sls_usr_cd;// [Dtl]の[usr_dpt_p.usr_cd]を[columnDtl_sls_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_usr_nm;// [Dtl]の[usr_dpt_p.usr_nm]を[columnDtl_sls_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_dpt_cd;// [Dtl]の[usr_dpt_p.dpt_cd]を[columnDtl_sls_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_dpt_nm;// [Dtl]の[usr_dpt_p.dpt_nm]を[columnDtl_sls_dpt_nm]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_nm = null;
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ_nm = null;
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_spec_typ = null;
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_spec_typ_nm = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_nm = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_trd_upri_amt_p_PPanel;
	public MCColumnConfig columnDtl_upri_not_tgt_flg;// [Dtl]の[trd_upri_amt_p.upri_not_tgt_flg]を[columnDtl_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_upri;// [Dtl]の[trd_upri_amt_p.trd_cur_upri]を[columnDtl_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_interim_flg;// [Dtl]の[trd_upri_amt_p.interim_flg]を[columnDtl_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_inc_tax_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_inc_tax_amt]を[columnDtl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_fix_flg;// [Dtl]の[trd_upri_amt_p.tax_fix_flg]を[columnDtl_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_cd;// [Dtl]の[trd_upri_amt_p.tax_cd]を[columnDtl_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_nm;// [Dtl]の[trd_upri_amt_p.tax_nm]を[columnDtl_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_rate;// [Dtl]の[trd_upri_amt_p.tax_rate]を[columnDtl_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_typ;// [Dtl]の[trd_upri_amt_p.tax_typ]を[columnDtl_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_inc_tax_flg;// [Dtl]の[trd_upri_amt_p.inc_tax_flg]を[columnDtl_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_tax_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_tax_amt]を[columnDtl_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_dscnt_amt]を[columnDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_cd;// [Dtl]の[trd_upri_amt_p.dscnt_rsn_cd]を[columnDtl_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_nm;// [Dtl]の[trd_upri_amt_p.dscnt_rsn_nm]を[columnDtl_dscnt_rsn_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_old_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_upri;// [Dtl]の[old_trd_cur_upri_p.upri]を[columnDtl_old_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_sls_cost_upri_p_PPanel;
	public MCColumnConfig columnDtl_sls_cost_upri;// [Dtl]の[sls_cost_upri_p.upri]を[columnDtl_sls_cost_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_sls_cost_amt_p_PPanel;
	public MCColumnConfig columnDtl_sls_cost_amt;// [Dtl]の[sls_cost_amt_p.amt]を[columnDtl_sls_cost_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_prof_amt_p_PPanel;
	public MCColumnConfig columnDtl_prof_amt;// [Dtl]の[prof_amt_p.amt]を[columnDtl_prof_amt]としてエイリアス定義。
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prof_rate = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl_wtax_amt;// [Dtl]の[wtax_amt_p.amt]を[columnDtl_wtax_amt]としてエイリアス定義。
	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_trd_unit_cd = null;
	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_for_upri_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty_for_upri;// [Dtl]の[trd_unit_qty_for_upri_p.qty]を[columnDtl_trd_unit_qty_for_upri]としてエイリアス定義。
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_req_typ = null;
	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_req_typ_nm = null;
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl_dlv_rqst_dt;// [Dtl]の[dlv_rqst_tm_p.ymd]を[columnDtl_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_rqst_hm;// [Dtl]の[dlv_rqst_tm_p.hm]を[columnDtl_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_schd_dt = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_nm = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_xrate_p_PPanel;
	public MCColumnConfig columnDtl_xrate;// [Dtl]の[xrate_p.xrate]を[columnDtl_xrate]としてエイリアス定義。
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_cd = null;
	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_dscnt_amt;// [Dtl]の[base_cur_dscnt_amt_p.amt]を[columnDtl_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_nm = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_xrate = null;
	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_upri;// [Dtl]の[ptax_cur_upri_p.upri]を[columnDtl_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_amt;// [Dtl]の[ptax_cur_amt_p.amt]を[columnDtl_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_inc_tax_amt;// [Dtl]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_tax_amt;// [Dtl]の[ptax_cur_tax_amt_p.amt]を[columnDtl_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_dscnt_amt;// [Dtl]の[ptax_cur_dscnt_amt_p.amt]を[columnDtl_ptax_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_dlv_p_PPanel;
	public MCColumnConfig columnDtl_dlv_cd;// [Dtl]の[dlv_p.bp_cd]を[columnDtl_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_nm;// [Dtl]の[dlv_p.bp_nm]を[columnDtl_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_zip_cd;// [Dtl]の[dlv_p.zip_cd]を[columnDtl_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr1;// [Dtl]の[dlv_p.addr1]を[columnDtl_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr2;// [Dtl]の[dlv_p.addr2]を[columnDtl_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr3;// [Dtl]の[dlv_p.addr3]を[columnDtl_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr4;// [Dtl]の[dlv_p.addr4]を[columnDtl_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_dpt;// [Dtl]の[dlv_p.dlv_cntct_dpt]を[columnDtl_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_psn;// [Dtl]の[dlv_p.dlv_cntct_psn]を[columnDtl_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_tel;// [Dtl]の[dlv_p.tel]を[columnDtl_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_fax;// [Dtl]の[dlv_p.fax]を[columnDtl_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_pri_prnt_flg;// [Dtl]の[dlv_p.pri_prnt_flg]を[columnDtl_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_cntry_cd;// [Dtl]の[dlv_p.cntry_cd]を[columnDtl_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cntry_nm;// [Dtl]の[dlv_p.cntry_nm]を[columnDtl_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_sundry_flg;// [Dtl]の[dlv_p.dlv_sundry_flg]を[columnDtl_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lg_grp_cd;// [Dtl]の[dlv_p.lg_grp_cd]を[columnDtl_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_lg_grp_nm;// [Dtl]の[dlv_p.lg_grp_nm]を[columnDtl_lg_grp_nm]としてエイリアス定義。
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm3 = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tdlv_nm = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_lg_grp_nm = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_nm = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_nm = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_nm = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_dlv_slip_no = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_no = null;
	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_rev = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_d_no = null;
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_sls_ac_dt = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_flg = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_no = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_sts_typ_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_ret_schd_no = null;
	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_ret_schd_d_no = null;
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_no = null;
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_rev = null;
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_d_no = null;
	/**
	 * Direct delivery PO No. 仕入直送発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_po_no = null;
	/**
	 * Direct delivery PO details No. 仕入直送発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_po_d_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_no = null;
	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_iv_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_no = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_act_no = null;
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_io_no = null;
	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_io_no = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_crryovr_times = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_biz_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_biz_rsn_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_nm = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_purc_act_d_no = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char3 = null;
	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_sub_char1 = null;
	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_sub_char2 = null;
	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_CstGrp_p_PPanel;
	public MCColumnConfig columnDtl_cst_grp_cd1;// [Dtl]の[CstGrp_p.bp_grp_cd1]を[columnDtl_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm1;// [Dtl]の[CstGrp_p.bp_grp_nm1]を[columnDtl_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd2;// [Dtl]の[CstGrp_p.bp_grp_cd2]を[columnDtl_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm2;// [Dtl]の[CstGrp_p.bp_grp_nm2]を[columnDtl_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd3;// [Dtl]の[CstGrp_p.bp_grp_cd3]を[columnDtl_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm3;// [Dtl]の[CstGrp_p.bp_grp_nm3]を[columnDtl_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd4;// [Dtl]の[CstGrp_p.bp_grp_cd4]を[columnDtl_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm4;// [Dtl]の[CstGrp_p.bp_grp_nm4]を[columnDtl_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd5;// [Dtl]の[CstGrp_p.bp_grp_cd5]を[columnDtl_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm5;// [Dtl]の[CstGrp_p.bp_grp_nm5]を[columnDtl_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd6;// [Dtl]の[CstGrp_p.bp_grp_cd6]を[columnDtl_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm6;// [Dtl]の[CstGrp_p.bp_grp_nm6]を[columnDtl_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd7;// [Dtl]の[CstGrp_p.bp_grp_cd7]を[columnDtl_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm7;// [Dtl]の[CstGrp_p.bp_grp_nm7]を[columnDtl_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd8;// [Dtl]の[CstGrp_p.bp_grp_cd8]を[columnDtl_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm8;// [Dtl]の[CstGrp_p.bp_grp_nm8]を[columnDtl_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd9;// [Dtl]の[CstGrp_p.bp_grp_cd9]を[columnDtl_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm9;// [Dtl]の[CstGrp_p.bp_grp_nm9]を[columnDtl_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_cd10;// [Dtl]の[CstGrp_p.bp_grp_cd10]を[columnDtl_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_cst_grp_nm10;// [Dtl]の[CstGrp_p.bp_grp_nm10]を[columnDtl_cst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_DlvGrp_p_PPanel;
	public MCColumnConfig columnDtl_dlv_grp_cd1;// [Dtl]の[DlvGrp_p.bp_grp_cd1]を[columnDtl_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm1;// [Dtl]の[DlvGrp_p.bp_grp_nm1]を[columnDtl_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd2;// [Dtl]の[DlvGrp_p.bp_grp_cd2]を[columnDtl_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm2;// [Dtl]の[DlvGrp_p.bp_grp_nm2]を[columnDtl_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd3;// [Dtl]の[DlvGrp_p.bp_grp_cd3]を[columnDtl_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm3;// [Dtl]の[DlvGrp_p.bp_grp_nm3]を[columnDtl_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd4;// [Dtl]の[DlvGrp_p.bp_grp_cd4]を[columnDtl_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm4;// [Dtl]の[DlvGrp_p.bp_grp_nm4]を[columnDtl_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd5;// [Dtl]の[DlvGrp_p.bp_grp_cd5]を[columnDtl_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm5;// [Dtl]の[DlvGrp_p.bp_grp_nm5]を[columnDtl_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd6;// [Dtl]の[DlvGrp_p.bp_grp_cd6]を[columnDtl_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm6;// [Dtl]の[DlvGrp_p.bp_grp_nm6]を[columnDtl_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd7;// [Dtl]の[DlvGrp_p.bp_grp_cd7]を[columnDtl_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm7;// [Dtl]の[DlvGrp_p.bp_grp_nm7]を[columnDtl_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd8;// [Dtl]の[DlvGrp_p.bp_grp_cd8]を[columnDtl_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm8;// [Dtl]の[DlvGrp_p.bp_grp_nm8]を[columnDtl_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd9;// [Dtl]の[DlvGrp_p.bp_grp_cd9]を[columnDtl_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm9;// [Dtl]の[DlvGrp_p.bp_grp_nm9]を[columnDtl_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_cd10;// [Dtl]の[DlvGrp_p.bp_grp_cd10]を[columnDtl_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_grp_nm10;// [Dtl]の[DlvGrp_p.bp_grp_nm10]を[columnDtl_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_BcstGrp_p_PPanel;
	public MCColumnConfig columnDtl_bcst_grp_cd1;// [Dtl]の[BcstGrp_p.bp_grp_cd1]を[columnDtl_bcst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm1;// [Dtl]の[BcstGrp_p.bp_grp_nm1]を[columnDtl_bcst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd2;// [Dtl]の[BcstGrp_p.bp_grp_cd2]を[columnDtl_bcst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm2;// [Dtl]の[BcstGrp_p.bp_grp_nm2]を[columnDtl_bcst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd3;// [Dtl]の[BcstGrp_p.bp_grp_cd3]を[columnDtl_bcst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm3;// [Dtl]の[BcstGrp_p.bp_grp_nm3]を[columnDtl_bcst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd4;// [Dtl]の[BcstGrp_p.bp_grp_cd4]を[columnDtl_bcst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm4;// [Dtl]の[BcstGrp_p.bp_grp_nm4]を[columnDtl_bcst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd5;// [Dtl]の[BcstGrp_p.bp_grp_cd5]を[columnDtl_bcst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm5;// [Dtl]の[BcstGrp_p.bp_grp_nm5]を[columnDtl_bcst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd6;// [Dtl]の[BcstGrp_p.bp_grp_cd6]を[columnDtl_bcst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm6;// [Dtl]の[BcstGrp_p.bp_grp_nm6]を[columnDtl_bcst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd7;// [Dtl]の[BcstGrp_p.bp_grp_cd7]を[columnDtl_bcst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm7;// [Dtl]の[BcstGrp_p.bp_grp_nm7]を[columnDtl_bcst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd8;// [Dtl]の[BcstGrp_p.bp_grp_cd8]を[columnDtl_bcst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm8;// [Dtl]の[BcstGrp_p.bp_grp_nm8]を[columnDtl_bcst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd9;// [Dtl]の[BcstGrp_p.bp_grp_cd9]を[columnDtl_bcst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm9;// [Dtl]の[BcstGrp_p.bp_grp_nm9]を[columnDtl_bcst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_cd10;// [Dtl]の[BcstGrp_p.bp_grp_cd10]を[columnDtl_bcst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_bcst_grp_nm10;// [Dtl]の[BcstGrp_p.bp_grp_nm10]を[columnDtl_bcst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_AcstGrp_p_PPanel;
	public MCColumnConfig columnDtl_acst_grp_cd1;// [Dtl]の[AcstGrp_p.bp_grp_cd1]を[columnDtl_acst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm1;// [Dtl]の[AcstGrp_p.bp_grp_nm1]を[columnDtl_acst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd2;// [Dtl]の[AcstGrp_p.bp_grp_cd2]を[columnDtl_acst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm2;// [Dtl]の[AcstGrp_p.bp_grp_nm2]を[columnDtl_acst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd3;// [Dtl]の[AcstGrp_p.bp_grp_cd3]を[columnDtl_acst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm3;// [Dtl]の[AcstGrp_p.bp_grp_nm3]を[columnDtl_acst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd4;// [Dtl]の[AcstGrp_p.bp_grp_cd4]を[columnDtl_acst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm4;// [Dtl]の[AcstGrp_p.bp_grp_nm4]を[columnDtl_acst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd5;// [Dtl]の[AcstGrp_p.bp_grp_cd5]を[columnDtl_acst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm5;// [Dtl]の[AcstGrp_p.bp_grp_nm5]を[columnDtl_acst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd6;// [Dtl]の[AcstGrp_p.bp_grp_cd6]を[columnDtl_acst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm6;// [Dtl]の[AcstGrp_p.bp_grp_nm6]を[columnDtl_acst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd7;// [Dtl]の[AcstGrp_p.bp_grp_cd7]を[columnDtl_acst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm7;// [Dtl]の[AcstGrp_p.bp_grp_nm7]を[columnDtl_acst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd8;// [Dtl]の[AcstGrp_p.bp_grp_cd8]を[columnDtl_acst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm8;// [Dtl]の[AcstGrp_p.bp_grp_nm8]を[columnDtl_acst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd9;// [Dtl]の[AcstGrp_p.bp_grp_cd9]を[columnDtl_acst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm9;// [Dtl]の[AcstGrp_p.bp_grp_nm9]を[columnDtl_acst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_cd10;// [Dtl]の[AcstGrp_p.bp_grp_cd10]を[columnDtl_acst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_acst_grp_nm10;// [Dtl]の[AcstGrp_p.bp_grp_nm10]を[columnDtl_acst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Dtl_itm_grp_p_PPanel;
	public MCColumnConfig columnDtl_itm_grp_cd1;// [Dtl]の[itm_grp_p.itm_grp_cd1]を[columnDtl_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm1;// [Dtl]の[itm_grp_p.itm_grp_nm1]を[columnDtl_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd2;// [Dtl]の[itm_grp_p.itm_grp_cd2]を[columnDtl_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm2;// [Dtl]の[itm_grp_p.itm_grp_nm2]を[columnDtl_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd3;// [Dtl]の[itm_grp_p.itm_grp_cd3]を[columnDtl_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm3;// [Dtl]の[itm_grp_p.itm_grp_nm3]を[columnDtl_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd4;// [Dtl]の[itm_grp_p.itm_grp_cd4]を[columnDtl_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm4;// [Dtl]の[itm_grp_p.itm_grp_nm4]を[columnDtl_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd5;// [Dtl]の[itm_grp_p.itm_grp_cd5]を[columnDtl_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm5;// [Dtl]の[itm_grp_p.itm_grp_nm5]を[columnDtl_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd6;// [Dtl]の[itm_grp_p.itm_grp_cd6]を[columnDtl_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm6;// [Dtl]の[itm_grp_p.itm_grp_nm6]を[columnDtl_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd7;// [Dtl]の[itm_grp_p.itm_grp_cd7]を[columnDtl_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm7;// [Dtl]の[itm_grp_p.itm_grp_nm7]を[columnDtl_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd8;// [Dtl]の[itm_grp_p.itm_grp_cd8]を[columnDtl_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm8;// [Dtl]の[itm_grp_p.itm_grp_nm8]を[columnDtl_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd9;// [Dtl]の[itm_grp_p.itm_grp_cd9]を[columnDtl_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm9;// [Dtl]の[itm_grp_p.itm_grp_nm9]を[columnDtl_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd10;// [Dtl]の[itm_grp_p.itm_grp_cd10]を[columnDtl_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm10;// [Dtl]の[itm_grp_p.itm_grp_nm10]を[columnDtl_itm_grp_nm10]としてエイリアス定義。
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
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_seq = null;
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_d_seq = null;
	/**
	 * Header update counter ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_hdr_upd_cntr = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_amt_rnd_typ = null;
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_tax_rnd_typ = null;
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_upri_dec_place = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_amt_dec_place = null;
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_upri_dec_place = null;
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_amt_dec_place = null;
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_upri_dec_place = null;
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_rnd_typ = null;
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rnd_typ = null;
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_acxfr_flg = null;
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_iv_flg = null;
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_cng_flg = null;
	/**
	 * Sales closed 売上締済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_close_flg = null;
	/**
	 * Charged dept. cd. (Before change) 変更前負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_bd_dpt_cd = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_cl_typ = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [SRCH_HDR]モードを表す定数 */
	public static final String SRCH_HDR = "SRCH_HDR";
	/** [REF_IO]モードを表す定数 */
	public static final String REF_IO = "REF_IO";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_HDR, REF_IO, REF_DTL, REF_HDR, UPD, FIX_U};
	
	/** [MS_MSBBL1370_Srch01]のCallerの作成 */
	protected MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Srch01Caller createMS_MSBBL1370_Srch01() {
		MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Srch01Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Srch01Bridge>
		caller = ((MSBBP_SlsDtlModReg_MC)this).new MS_MSBBL1370_Srch01Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Srch01Bridge>(
					(MSBBP_SlsDtlModReg)this, new MS_MSBBL1370_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1370_Srch01]の呼び出し */
	protected void callMS_MSBBL1370_Srch01() {
		MCCaller caller = createMS_MSBBL1370_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1370_Upd01]のCallerの作成 */
	protected MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Upd01Caller createMS_MSBBL1370_Upd01() {
		MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Upd01Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Upd01Bridge>
		caller = ((MSBBP_SlsDtlModReg_MC)this).new MS_MSBBL1370_Upd01Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Upd01Bridge>(
					(MSBBP_SlsDtlModReg)this, new MS_MSBBL1370_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1370_Upd01]の呼び出し */
	protected void callMS_MSBBL1370_Upd01() {
		MCCaller caller = createMS_MSBBL1370_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1370_Sprt01]のCallerの作成 */
	protected MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt01Caller createMS_MSBBL1370_Sprt01() {
		MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt01Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Sprt01Bridge>
		caller = ((MSBBP_SlsDtlModReg_MC)this).new MS_MSBBL1370_Sprt01Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Sprt01Bridge>(
					(MSBBP_SlsDtlModReg)this, new MS_MSBBL1370_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1370_Sprt01]の呼び出し */
	protected void callMS_MSBBL1370_Sprt01() {
		MCCaller caller = createMS_MSBBL1370_Sprt01();
		caller.exec();
	}
	/** [MS_MSBBL1370_Sprt02]のCallerの作成 */
	protected MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt02Caller createMS_MSBBL1370_Sprt02() {
		MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt02Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Sprt02Bridge>
		caller = ((MSBBP_SlsDtlModReg_MC)this).new MS_MSBBL1370_Sprt02Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Sprt02Bridge>(
					(MSBBP_SlsDtlModReg)this, new MS_MSBBL1370_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBBL1370_Sprt02]の呼び出し */
	protected void callMS_MSBBL1370_Sprt02() {
		MCCaller caller = createMS_MSBBL1370_Sprt02();
		caller.exec();
	}
	/** [MS_MSBBL1370_Sprt03]のCallerの作成 */
	protected MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt03Caller createMS_MSBBL1370_Sprt03() {
		MSBBP_SlsDtlModReg_MC.MS_MSBBL1370_Sprt03Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Sprt03Bridge>
		caller = ((MSBBP_SlsDtlModReg_MC)this).new MS_MSBBL1370_Sprt03Caller<MSBBP_SlsDtlModReg, MS_MSBBL1370_Sprt03Bridge>(
					(MSBBP_SlsDtlModReg)this, new MS_MSBBL1370_Sprt03Bridge());
		return caller;
	}
	/** [MS_MSBBL1370_Sprt03]の呼び出し */
	protected void callMS_MSBBL1370_Sprt03() {
		MCCaller caller = createMS_MSBBL1370_Sprt03();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1370.CndR aCndR;
	/** [UpriBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1370.UpriBulkSetR aUpriBulkSetR;
	/** [XrateBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1370.XrateBulkSetR aXrateBulkSetR;
	/** [TaxBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1370.TaxBulkSetR aTaxBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1370.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1370.BtnR aBtnR;
	/** [UpriSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR> aUpriSrchL;
	/** [XrateSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR> aXrateSrchL;
	/** [TaxSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR> aTaxSrchL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1370.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1370.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1370.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1370.CndR.create();
	}

	/**
	 * 項目コピーによってaUpriBulkSetRを設定します。
	 *
	 * aUpriBulkSetRのインスタンスは変更されません。
	 *
	 * @param row UpriBulkSetR
	 */
	public void setUpriBulkSetR(mcframe.clientMSBB.MSBBP1370.UpriBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getUpriBulkSetR(), row);
		}
	}

	/**
	 * [UpriBulkSet]ブロックのコンテナaUpriBulkSetRを返します。
	 *
	 * @return UpriBulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1370.UpriBulkSetR getUpriBulkSetR() {
		return aUpriBulkSetR;
	}

	/**
	 * aUpriBulkSetRを作成します。
	 *
	 * @return UpriBulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1370.UpriBulkSetR createUpriBulkSetR() {
		return mcframe.clientMSBB.MSBBP1370.UpriBulkSetR.create();
	}

	/**
	 * 項目コピーによってaXrateBulkSetRを設定します。
	 *
	 * aXrateBulkSetRのインスタンスは変更されません。
	 *
	 * @param row XrateBulkSetR
	 */
	public void setXrateBulkSetR(mcframe.clientMSBB.MSBBP1370.XrateBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getXrateBulkSetR(), row);
		}
	}

	/**
	 * [XrateBulkSet]ブロックのコンテナaXrateBulkSetRを返します。
	 *
	 * @return XrateBulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1370.XrateBulkSetR getXrateBulkSetR() {
		return aXrateBulkSetR;
	}

	/**
	 * aXrateBulkSetRを作成します。
	 *
	 * @return XrateBulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1370.XrateBulkSetR createXrateBulkSetR() {
		return mcframe.clientMSBB.MSBBP1370.XrateBulkSetR.create();
	}

	/**
	 * 項目コピーによってaTaxBulkSetRを設定します。
	 *
	 * aTaxBulkSetRのインスタンスは変更されません。
	 *
	 * @param row TaxBulkSetR
	 */
	public void setTaxBulkSetR(mcframe.clientMSBB.MSBBP1370.TaxBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getTaxBulkSetR(), row);
		}
	}

	/**
	 * [TaxBulkSet]ブロックのコンテナaTaxBulkSetRを返します。
	 *
	 * @return TaxBulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1370.TaxBulkSetR getTaxBulkSetR() {
		return aTaxBulkSetR;
	}

	/**
	 * aTaxBulkSetRを作成します。
	 *
	 * @return TaxBulkSetR
	 */
	public mcframe.clientMSBB.MSBBP1370.TaxBulkSetR createTaxBulkSetR() {
		return mcframe.clientMSBB.MSBBP1370.TaxBulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP1370.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP1370.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP1370.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1370.DtlR.class);
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
	public void setBtnR(mcframe.clientMSBB.MSBBP1370.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1370.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1370.BtnR createBtnR() {
		return mcframe.clientMSBB.MSBBP1370.BtnR.create();
	}

	/**
	 * コピーによってaUpriSrchLを設定します。
	 *
	 * aUpriSrchLのインスタンスは変更されません。
	 *
	 * @param dataset UpriSrchL
	 */
	public void setUpriSrchL(MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR> aList) {
		if (getUpriSrchL() != aList) {
			getUpriSrchL().setAll(aList);
		}
	}

	/**
	 * [UpriSrch]ブロックのコンテナaUpriSrchLを返します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR> getUpriSrchL() {
		return aUpriSrchL;
	}

	/**
	 * aUpriSrchRを作成します。
	 *
	 * @return UpriSrchR
	 */
	public mcframe.clientMSBB.MSBBP1370.UpriSrchR createUpriSrchR() {
		return mcframe.clientMSBB.MSBBP1370.UpriSrchR.create();
	}

	/**
	 * aUpriSrchLを作成します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR> createUpriSrchL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1370.UpriSrchR.class);
	}

	/**
	 * コピーによってaXrateSrchLを設定します。
	 *
	 * aXrateSrchLのインスタンスは変更されません。
	 *
	 * @param dataset XrateSrchL
	 */
	public void setXrateSrchL(MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR> aList) {
		if (getXrateSrchL() != aList) {
			getXrateSrchL().setAll(aList);
		}
	}

	/**
	 * [XrateSrch]ブロックのコンテナaXrateSrchLを返します。
	 *
	 * @return XrateSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR> getXrateSrchL() {
		return aXrateSrchL;
	}

	/**
	 * aXrateSrchRを作成します。
	 *
	 * @return XrateSrchR
	 */
	public mcframe.clientMSBB.MSBBP1370.XrateSrchR createXrateSrchR() {
		return mcframe.clientMSBB.MSBBP1370.XrateSrchR.create();
	}

	/**
	 * aXrateSrchLを作成します。
	 *
	 * @return XrateSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR> createXrateSrchL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1370.XrateSrchR.class);
	}

	/**
	 * コピーによってaTaxSrchLを設定します。
	 *
	 * aTaxSrchLのインスタンスは変更されません。
	 *
	 * @param dataset TaxSrchL
	 */
	public void setTaxSrchL(MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR> aList) {
		if (getTaxSrchL() != aList) {
			getTaxSrchL().setAll(aList);
		}
	}

	/**
	 * [TaxSrch]ブロックのコンテナaTaxSrchLを返します。
	 *
	 * @return TaxSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR> getTaxSrchL() {
		return aTaxSrchL;
	}

	/**
	 * aTaxSrchRを作成します。
	 *
	 * @return TaxSrchR
	 */
	public mcframe.clientMSBB.MSBBP1370.TaxSrchR createTaxSrchR() {
		return mcframe.clientMSBB.MSBBP1370.TaxSrchR.create();
	}

	/**
	 * aTaxSrchLを作成します。
	 *
	 * @return TaxSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR> createTaxSrchL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1370.TaxSrchR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getUpriBulkSetR())) ret.add(getUpriBulkSetR());
		if(!MCCollectionUtil.contains(ret, getXrateBulkSetR())) ret.add(getXrateBulkSetR());
		if(!MCCollectionUtil.contains(ret, getTaxBulkSetR())) ret.add(getTaxBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
		if(!MCCollectionUtil.contains(ret, getUpriSrchL())) ret.add(getUpriSrchL());
		if(!MCCollectionUtil.contains(ret, getXrateSrchL())) ret.add(getXrateSrchL());
		if(!MCCollectionUtil.contains(ret, getTaxSrchL())) ret.add(getTaxSrchL());
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
		if(aCnt == getUpriBulkSetR()) return "UpriBulkSet";
		if(aCnt == getXrateBulkSetR()) return "XrateBulkSet";
		if(aCnt == getTaxBulkSetR()) return "TaxBulkSet";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getBtnR()) return "Btn";
		if(aCnt == getUpriSrchL()) return "UpriSrch";
		if(aCnt == getXrateSrchL()) return "XrateSrch";
		if(aCnt == getTaxSrchL()) return "TaxSrch";
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
		if(bId.equals("UpriBulkSet")) return getUpriBulkSetR();
		if(bId.equals("XrateBulkSet")) return getXrateBulkSetR();
		if(bId.equals("TaxBulkSet")) return getTaxBulkSetR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Btn")) return getBtnR();
		if(bId.equals("UpriSrch")) return getUpriSrchL();
		if(bId.equals("XrateSrch")) return getXrateSrchL();
		if(bId.equals("TaxSrch")) return getTaxSrchL();
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
		ret.add(SrchTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(Tab5Panel);
		ret.add(Tab6Panel);
		ret.add(IvPanel);
		ret.add(UpriPanel);
		ret.add(AprvStsPanel);
		ret.add(CstGrpPanel);
		ret.add(DlvGrpPanel);
		ret.add(BcstGrpPanel);
		ret.add(AcstGrpPanel);
		ret.add(ItmGrpPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(BulkSetTabPanel);
		ret.add(UpriXratePanel);
		ret.add(UpriBulkSetPanel);
		ret.add(XrateBulkSetPanel);
		ret.add(TaxBulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsDtlModReg_MC_A() {
		aCndR = createCndR();
		aUpriBulkSetR = createUpriBulkSetR();
		aXrateBulkSetR = createXrateBulkSetR();
		aTaxBulkSetR = createTaxBulkSetR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();
		aUpriSrchL = createUpriSrchL();
		aXrateSrchL = createXrateSrchL();
		aTaxSrchL = createTaxSrchL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SlsDtlModReg_MC_A(String name) {
		aCndR = createCndR();
		aUpriBulkSetR = createUpriBulkSetR();
		aXrateBulkSetR = createXrateBulkSetR();
		aTaxBulkSetR = createTaxBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
		aUpriSrchL = createUpriSrchL();
		aXrateSrchL = createXrateSrchL();
		aTaxSrchL = createTaxSrchL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_SlsDtlModReg_MC.jbCreateScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateDispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateSrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTop((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateFold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateIv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateUpri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateAprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateCstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateDlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateBcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateAcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateCnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateCtrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateRPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateBulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateUpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateUpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateXrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateTaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateDtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbCreateBtn((MSBBP_SlsDtlModReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [SrchTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchTyp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Tab6]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab6(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Iv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIv(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Upri]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpri(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [AprvSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvSts(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [CstGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [DlvGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [BcstGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBcstGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [AcstGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAcstGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SlsDtlModReg p) {
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
		p.Cnd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_wrk_no_p());
		p.Cnd_sno_wrk_no_p_PPanel.setName("Cnd.sno_wrk_no_p");
		p.Cnd_sno1 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
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
		p.Cnd_bcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bcst_grp_p());
		p.Cnd_bcst_grp_p_PPanel.setName("Cnd.bcst_grp_p");
		p.Cnd_bcst_grp_lab1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bcst_grp_lab1.addAliasName("Cnd.bcst_grp_lab1", p);
		p.Cnd_bcst_grp_flg1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bcst_grp_flg1.addAliasName("Cnd.bcst_grp_flg1", p);
		p.Cnd_bcst_grp_cd1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bcst_grp_cd1.addAliasName("Cnd.bcst_grp_cd1", p);
		p.Cnd_bcst_grp_nm1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bcst_grp_nm1.addAliasName("Cnd.bcst_grp_nm1", p);
		p.Cnd_bcst_grp_lab2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bcst_grp_lab2.addAliasName("Cnd.bcst_grp_lab2", p);
		p.Cnd_bcst_grp_flg2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bcst_grp_flg2.addAliasName("Cnd.bcst_grp_flg2", p);
		p.Cnd_bcst_grp_cd2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bcst_grp_cd2.addAliasName("Cnd.bcst_grp_cd2", p);
		p.Cnd_bcst_grp_nm2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bcst_grp_nm2.addAliasName("Cnd.bcst_grp_nm2", p);
		p.Cnd_bcst_grp_lab3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bcst_grp_lab3.addAliasName("Cnd.bcst_grp_lab3", p);
		p.Cnd_bcst_grp_flg3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bcst_grp_flg3.addAliasName("Cnd.bcst_grp_flg3", p);
		p.Cnd_bcst_grp_cd3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bcst_grp_cd3.addAliasName("Cnd.bcst_grp_cd3", p);
		p.Cnd_bcst_grp_nm3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bcst_grp_nm3.addAliasName("Cnd.bcst_grp_nm3", p);
		p.Cnd_bcst_grp_lab4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bcst_grp_lab4.addAliasName("Cnd.bcst_grp_lab4", p);
		p.Cnd_bcst_grp_flg4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bcst_grp_flg4.addAliasName("Cnd.bcst_grp_flg4", p);
		p.Cnd_bcst_grp_cd4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bcst_grp_cd4.addAliasName("Cnd.bcst_grp_cd4", p);
		p.Cnd_bcst_grp_nm4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bcst_grp_nm4.addAliasName("Cnd.bcst_grp_nm4", p);
		p.Cnd_bcst_grp_lab5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bcst_grp_lab5.addAliasName("Cnd.bcst_grp_lab5", p);
		p.Cnd_bcst_grp_flg5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bcst_grp_flg5.addAliasName("Cnd.bcst_grp_flg5", p);
		p.Cnd_bcst_grp_cd5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bcst_grp_cd5.addAliasName("Cnd.bcst_grp_cd5", p);
		p.Cnd_bcst_grp_nm5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bcst_grp_nm5.addAliasName("Cnd.bcst_grp_nm5", p);
		p.Cnd_bcst_grp_lab6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bcst_grp_lab6.addAliasName("Cnd.bcst_grp_lab6", p);
		p.Cnd_bcst_grp_flg6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bcst_grp_flg6.addAliasName("Cnd.bcst_grp_flg6", p);
		p.Cnd_bcst_grp_cd6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bcst_grp_cd6.addAliasName("Cnd.bcst_grp_cd6", p);
		p.Cnd_bcst_grp_nm6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bcst_grp_nm6.addAliasName("Cnd.bcst_grp_nm6", p);
		p.Cnd_bcst_grp_lab7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bcst_grp_lab7.addAliasName("Cnd.bcst_grp_lab7", p);
		p.Cnd_bcst_grp_flg7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bcst_grp_flg7.addAliasName("Cnd.bcst_grp_flg7", p);
		p.Cnd_bcst_grp_cd7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bcst_grp_cd7.addAliasName("Cnd.bcst_grp_cd7", p);
		p.Cnd_bcst_grp_nm7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bcst_grp_nm7.addAliasName("Cnd.bcst_grp_nm7", p);
		p.Cnd_bcst_grp_lab8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bcst_grp_lab8.addAliasName("Cnd.bcst_grp_lab8", p);
		p.Cnd_bcst_grp_flg8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bcst_grp_flg8.addAliasName("Cnd.bcst_grp_flg8", p);
		p.Cnd_bcst_grp_cd8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bcst_grp_cd8.addAliasName("Cnd.bcst_grp_cd8", p);
		p.Cnd_bcst_grp_nm8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bcst_grp_nm8.addAliasName("Cnd.bcst_grp_nm8", p);
		p.Cnd_bcst_grp_lab9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bcst_grp_lab9.addAliasName("Cnd.bcst_grp_lab9", p);
		p.Cnd_bcst_grp_flg9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bcst_grp_flg9.addAliasName("Cnd.bcst_grp_flg9", p);
		p.Cnd_bcst_grp_cd9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bcst_grp_cd9.addAliasName("Cnd.bcst_grp_cd9", p);
		p.Cnd_bcst_grp_nm9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bcst_grp_nm9.addAliasName("Cnd.bcst_grp_nm9", p);
		p.Cnd_bcst_grp_lab10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bcst_grp_lab10.addAliasName("Cnd.bcst_grp_lab10", p);
		p.Cnd_bcst_grp_flg10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bcst_grp_flg10.addAliasName("Cnd.bcst_grp_flg10", p);
		p.Cnd_bcst_grp_cd10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bcst_grp_cd10.addAliasName("Cnd.bcst_grp_cd10", p);
		p.Cnd_bcst_grp_nm10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bcst_grp_nm10.addAliasName("Cnd.bcst_grp_nm10", p);
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
	protected static void jbCreateCtrl(MSBBP_SlsDtlModReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [BulkSetTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSetTab(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [UpriXrate]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpriXrate(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [UpriBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpriBulkSet(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [XrateBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateXrateBulkSet(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [TaxBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTaxBulkSet(MSBBP_SlsDtlModReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_SlsDtlModReg p) {
		p.Dtl_ship_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$ship_tm_p);
		p.Dtl_ship_tm_p_PPanel.setName("Dtl.ship_tm_p");
		p.columnDtl_ship_dt = p.Dtl_ship_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_ship_dt.addAliasName("Dtl.ship_dt", p);
		p.columnDtl_ship_hm = p.Dtl_ship_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_ship_hm.addAliasName("Dtl.ship_hm", p);
		p.Dtl_dlv_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$dlv_tm_p);
		p.Dtl_dlv_tm_p_PPanel.setName("Dtl.dlv_tm_p");
		p.columnDtl_dlv_dt = p.Dtl_dlv_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_dlv_dt.addAliasName("Dtl.dlv_dt", p);
		p.columnDtl_dlv_hm = p.Dtl_dlv_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_dlv_hm.addAliasName("Dtl.dlv_hm", p);
		p.Dtl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$usr_dpt_p);
		p.Dtl_usr_dpt_p_PPanel.setName("Dtl.usr_dpt_p");
		p.columnDtl_sls_usr_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_sls_usr_cd.addAliasName("Dtl.sls_usr_cd", p);
		p.columnDtl_sls_usr_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_sls_usr_nm.addAliasName("Dtl.sls_usr_nm", p);
		p.columnDtl_sls_dpt_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_sls_dpt_cd.addAliasName("Dtl.sls_dpt_cd", p);
		p.columnDtl_sls_dpt_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_sls_dpt_nm.addAliasName("Dtl.sls_dpt_nm", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_trd_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$trd_upri_amt_p);
		p.Dtl_trd_upri_amt_p_PPanel.setName("Dtl.trd_upri_amt_p");
		p.columnDtl_upri_not_tgt_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_upri_not_tgt_flg.addAliasName("Dtl.upri_not_tgt_flg", p);
		p.columnDtl_trd_cur_upri = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_trd_cur_upri.addAliasName("Dtl.trd_cur_upri", p);
		p.columnDtl_interim_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_interim_flg.addAliasName("Dtl.interim_flg", p);
		p.columnDtl_trd_cur_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.columnDtl_trd_cur_inc_tax_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_trd_cur_inc_tax_amt.addAliasName("Dtl.trd_cur_inc_tax_amt", p);
		p.columnDtl_tax_fix_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_tax_fix_flg.addAliasName("Dtl.tax_fix_flg", p);
		p.columnDtl_tax_cd = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_tax_cd.addAliasName("Dtl.tax_cd", p);
		p.columnDtl_tax_nm = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_tax_nm.addAliasName("Dtl.tax_nm", p);
		p.columnDtl_tax_rate = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_tax_rate.addAliasName("Dtl.tax_rate", p);
		p.columnDtl_tax_typ = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_tax_typ.addAliasName("Dtl.tax_typ", p);
		p.columnDtl_inc_tax_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_inc_tax_flg.addAliasName("Dtl.inc_tax_flg", p);
		p.columnDtl_trd_cur_tax_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_trd_cur_tax_amt.addAliasName("Dtl.trd_cur_tax_amt", p);
		p.columnDtl_trd_cur_dscnt_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_trd_cur_dscnt_amt.addAliasName("Dtl.trd_cur_dscnt_amt", p);
		p.columnDtl_dscnt_rsn_cd = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_dscnt_rsn_cd.addAliasName("Dtl.dscnt_rsn_cd", p);
		p.columnDtl_dscnt_rsn_nm = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_dscnt_rsn_nm.addAliasName("Dtl.dscnt_rsn_nm", p);
		p.Dtl_old_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$old_trd_cur_upri_p);
		p.Dtl_old_trd_cur_upri_p_PPanel.setName("Dtl.old_trd_cur_upri_p");
		p.columnDtl_old_trd_cur_upri = p.Dtl_old_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_upri.addAliasName("Dtl.old_trd_cur_upri", p);
		p.Dtl_sls_cost_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$sls_cost_upri_p);
		p.Dtl_sls_cost_upri_p_PPanel.setName("Dtl.sls_cost_upri_p");
		p.columnDtl_sls_cost_upri = p.Dtl_sls_cost_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_sls_cost_upri.addAliasName("Dtl.sls_cost_upri", p);
		p.Dtl_sls_cost_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$sls_cost_amt_p);
		p.Dtl_sls_cost_amt_p_PPanel.setName("Dtl.sls_cost_amt_p");
		p.columnDtl_sls_cost_amt = p.Dtl_sls_cost_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_sls_cost_amt.addAliasName("Dtl.sls_cost_amt", p);
		p.Dtl_prof_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$prof_amt_p);
		p.Dtl_prof_amt_p_PPanel.setName("Dtl.prof_amt_p");
		p.columnDtl_prof_amt = p.Dtl_prof_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_prof_amt.addAliasName("Dtl.prof_amt", p);
		p.Dtl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$wtax_amt_p);
		p.Dtl_wtax_amt_p_PPanel.setName("Dtl.wtax_amt_p");
		p.columnDtl_wtax_amt = p.Dtl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_wtax_amt.addAliasName("Dtl.wtax_amt", p);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$trd_unit_qty_for_upri_p);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.setName("Dtl.trd_unit_qty_for_upri_p");
		p.columnDtl_trd_unit_qty_for_upri = p.Dtl_trd_unit_qty_for_upri_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty_for_upri.addAliasName("Dtl.trd_unit_qty_for_upri", p);
		p.Dtl_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$dlv_rqst_tm_p);
		p.Dtl_dlv_rqst_tm_p_PPanel.setName("Dtl.dlv_rqst_tm_p");
		p.columnDtl_dlv_rqst_dt = p.Dtl_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_dlv_rqst_dt.addAliasName("Dtl.dlv_rqst_dt", p);
		p.columnDtl_dlv_rqst_hm = p.Dtl_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_dlv_rqst_hm.addAliasName("Dtl.dlv_rqst_hm", p);
		p.Dtl_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$xrate_p);
		p.Dtl_xrate_p_PPanel.setName("Dtl.xrate_p");
		p.columnDtl_xrate = p.Dtl_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_xrate.addAliasName("Dtl.xrate", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$base_cur_dscnt_amt_p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.setName("Dtl.base_cur_dscnt_amt_p");
		p.columnDtl_base_cur_dscnt_amt = p.Dtl_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_dscnt_amt.addAliasName("Dtl.base_cur_dscnt_amt", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$ptax_cur_dscnt_amt_p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.setName("Dtl.ptax_cur_dscnt_amt_p");
		p.columnDtl_ptax_cur_dscnt_amt = p.Dtl_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_dscnt_amt.addAliasName("Dtl.ptax_cur_dscnt_amt", p);
		p.Dtl_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$dlv_p);
		p.Dtl_dlv_p_PPanel.setName("Dtl.dlv_p");
		p.columnDtl_dlv_cd = p.Dtl_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_dlv_cd.addAliasName("Dtl.dlv_cd", p);
		p.columnDtl_dlv_nm = p.Dtl_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_dlv_nm.addAliasName("Dtl.dlv_nm", p);
		p.columnDtl_dlv_zip_cd = p.Dtl_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnDtl_dlv_zip_cd.addAliasName("Dtl.dlv_zip_cd", p);
		p.columnDtl_dlv_addr1 = p.Dtl_dlv_p_PPanel.columnDlv_addr1;
		p.columnDtl_dlv_addr1.addAliasName("Dtl.dlv_addr1", p);
		p.columnDtl_dlv_addr2 = p.Dtl_dlv_p_PPanel.columnDlv_addr2;
		p.columnDtl_dlv_addr2.addAliasName("Dtl.dlv_addr2", p);
		p.columnDtl_dlv_addr3 = p.Dtl_dlv_p_PPanel.columnDlv_addr3;
		p.columnDtl_dlv_addr3.addAliasName("Dtl.dlv_addr3", p);
		p.columnDtl_dlv_addr4 = p.Dtl_dlv_p_PPanel.columnDlv_addr4;
		p.columnDtl_dlv_addr4.addAliasName("Dtl.dlv_addr4", p);
		p.columnDtl_dlv_cntct_dpt = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDtl_dlv_cntct_dpt.addAliasName("Dtl.dlv_cntct_dpt", p);
		p.columnDtl_dlv_cntct_psn = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDtl_dlv_cntct_psn.addAliasName("Dtl.dlv_cntct_psn", p);
		p.columnDtl_dlv_tel = p.Dtl_dlv_p_PPanel.columnDlv_tel;
		p.columnDtl_dlv_tel.addAliasName("Dtl.dlv_tel", p);
		p.columnDtl_dlv_fax = p.Dtl_dlv_p_PPanel.columnDlv_fax;
		p.columnDtl_dlv_fax.addAliasName("Dtl.dlv_fax", p);
		p.columnDtl_pri_prnt_flg = p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnDtl_pri_prnt_flg.addAliasName("Dtl.pri_prnt_flg", p);
		p.columnDtl_cntry_cd = p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_cntry_cd.addAliasName("Dtl.cntry_cd", p);
		p.columnDtl_cntry_nm = p.Dtl_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_cntry_nm.addAliasName("Dtl.cntry_nm", p);
		p.columnDtl_dlv_sundry_flg = p.Dtl_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_dlv_sundry_flg.addAliasName("Dtl.dlv_sundry_flg", p);
		p.columnDtl_lg_grp_cd = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDtl_lg_grp_cd.addAliasName("Dtl.lg_grp_cd", p);
		p.columnDtl_lg_grp_nm = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnDtl_lg_grp_nm.addAliasName("Dtl.lg_grp_nm", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
		p.Dtl_CstGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$CstGrp_p);
		p.Dtl_CstGrp_p_PPanel.setName("Dtl.CstGrp_p");
		p.columnDtl_cst_grp_cd1 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_cst_grp_cd1.addAliasName("Dtl.cst_grp_cd1", p);
		p.columnDtl_cst_grp_nm1 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_cst_grp_nm1.addAliasName("Dtl.cst_grp_nm1", p);
		p.columnDtl_cst_grp_cd2 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_cst_grp_cd2.addAliasName("Dtl.cst_grp_cd2", p);
		p.columnDtl_cst_grp_nm2 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_cst_grp_nm2.addAliasName("Dtl.cst_grp_nm2", p);
		p.columnDtl_cst_grp_cd3 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_cst_grp_cd3.addAliasName("Dtl.cst_grp_cd3", p);
		p.columnDtl_cst_grp_nm3 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_cst_grp_nm3.addAliasName("Dtl.cst_grp_nm3", p);
		p.columnDtl_cst_grp_cd4 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_cst_grp_cd4.addAliasName("Dtl.cst_grp_cd4", p);
		p.columnDtl_cst_grp_nm4 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_cst_grp_nm4.addAliasName("Dtl.cst_grp_nm4", p);
		p.columnDtl_cst_grp_cd5 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_cst_grp_cd5.addAliasName("Dtl.cst_grp_cd5", p);
		p.columnDtl_cst_grp_nm5 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_cst_grp_nm5.addAliasName("Dtl.cst_grp_nm5", p);
		p.columnDtl_cst_grp_cd6 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_cst_grp_cd6.addAliasName("Dtl.cst_grp_cd6", p);
		p.columnDtl_cst_grp_nm6 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_cst_grp_nm6.addAliasName("Dtl.cst_grp_nm6", p);
		p.columnDtl_cst_grp_cd7 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_cst_grp_cd7.addAliasName("Dtl.cst_grp_cd7", p);
		p.columnDtl_cst_grp_nm7 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_cst_grp_nm7.addAliasName("Dtl.cst_grp_nm7", p);
		p.columnDtl_cst_grp_cd8 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_cst_grp_cd8.addAliasName("Dtl.cst_grp_cd8", p);
		p.columnDtl_cst_grp_nm8 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_cst_grp_nm8.addAliasName("Dtl.cst_grp_nm8", p);
		p.columnDtl_cst_grp_cd9 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_cst_grp_cd9.addAliasName("Dtl.cst_grp_cd9", p);
		p.columnDtl_cst_grp_nm9 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_cst_grp_nm9.addAliasName("Dtl.cst_grp_nm9", p);
		p.columnDtl_cst_grp_cd10 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_cst_grp_cd10.addAliasName("Dtl.cst_grp_cd10", p);
		p.columnDtl_cst_grp_nm10 = p.Dtl_CstGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_cst_grp_nm10.addAliasName("Dtl.cst_grp_nm10", p);
		p.Dtl_DlvGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$DlvGrp_p);
		p.Dtl_DlvGrp_p_PPanel.setName("Dtl.DlvGrp_p");
		p.columnDtl_dlv_grp_cd1 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_dlv_grp_cd1.addAliasName("Dtl.dlv_grp_cd1", p);
		p.columnDtl_dlv_grp_nm1 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_dlv_grp_nm1.addAliasName("Dtl.dlv_grp_nm1", p);
		p.columnDtl_dlv_grp_cd2 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_dlv_grp_cd2.addAliasName("Dtl.dlv_grp_cd2", p);
		p.columnDtl_dlv_grp_nm2 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_dlv_grp_nm2.addAliasName("Dtl.dlv_grp_nm2", p);
		p.columnDtl_dlv_grp_cd3 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_dlv_grp_cd3.addAliasName("Dtl.dlv_grp_cd3", p);
		p.columnDtl_dlv_grp_nm3 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_dlv_grp_nm3.addAliasName("Dtl.dlv_grp_nm3", p);
		p.columnDtl_dlv_grp_cd4 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_dlv_grp_cd4.addAliasName("Dtl.dlv_grp_cd4", p);
		p.columnDtl_dlv_grp_nm4 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_dlv_grp_nm4.addAliasName("Dtl.dlv_grp_nm4", p);
		p.columnDtl_dlv_grp_cd5 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_dlv_grp_cd5.addAliasName("Dtl.dlv_grp_cd5", p);
		p.columnDtl_dlv_grp_nm5 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_dlv_grp_nm5.addAliasName("Dtl.dlv_grp_nm5", p);
		p.columnDtl_dlv_grp_cd6 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_dlv_grp_cd6.addAliasName("Dtl.dlv_grp_cd6", p);
		p.columnDtl_dlv_grp_nm6 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_dlv_grp_nm6.addAliasName("Dtl.dlv_grp_nm6", p);
		p.columnDtl_dlv_grp_cd7 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_dlv_grp_cd7.addAliasName("Dtl.dlv_grp_cd7", p);
		p.columnDtl_dlv_grp_nm7 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_dlv_grp_nm7.addAliasName("Dtl.dlv_grp_nm7", p);
		p.columnDtl_dlv_grp_cd8 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_dlv_grp_cd8.addAliasName("Dtl.dlv_grp_cd8", p);
		p.columnDtl_dlv_grp_nm8 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_dlv_grp_nm8.addAliasName("Dtl.dlv_grp_nm8", p);
		p.columnDtl_dlv_grp_cd9 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_dlv_grp_cd9.addAliasName("Dtl.dlv_grp_cd9", p);
		p.columnDtl_dlv_grp_nm9 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_dlv_grp_nm9.addAliasName("Dtl.dlv_grp_nm9", p);
		p.columnDtl_dlv_grp_cd10 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_dlv_grp_cd10.addAliasName("Dtl.dlv_grp_cd10", p);
		p.columnDtl_dlv_grp_nm10 = p.Dtl_DlvGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_dlv_grp_nm10.addAliasName("Dtl.dlv_grp_nm10", p);
		p.Dtl_BcstGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$BcstGrp_p);
		p.Dtl_BcstGrp_p_PPanel.setName("Dtl.BcstGrp_p");
		p.columnDtl_bcst_grp_cd1 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_bcst_grp_cd1.addAliasName("Dtl.bcst_grp_cd1", p);
		p.columnDtl_bcst_grp_nm1 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_bcst_grp_nm1.addAliasName("Dtl.bcst_grp_nm1", p);
		p.columnDtl_bcst_grp_cd2 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_bcst_grp_cd2.addAliasName("Dtl.bcst_grp_cd2", p);
		p.columnDtl_bcst_grp_nm2 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_bcst_grp_nm2.addAliasName("Dtl.bcst_grp_nm2", p);
		p.columnDtl_bcst_grp_cd3 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_bcst_grp_cd3.addAliasName("Dtl.bcst_grp_cd3", p);
		p.columnDtl_bcst_grp_nm3 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_bcst_grp_nm3.addAliasName("Dtl.bcst_grp_nm3", p);
		p.columnDtl_bcst_grp_cd4 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_bcst_grp_cd4.addAliasName("Dtl.bcst_grp_cd4", p);
		p.columnDtl_bcst_grp_nm4 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_bcst_grp_nm4.addAliasName("Dtl.bcst_grp_nm4", p);
		p.columnDtl_bcst_grp_cd5 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_bcst_grp_cd5.addAliasName("Dtl.bcst_grp_cd5", p);
		p.columnDtl_bcst_grp_nm5 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_bcst_grp_nm5.addAliasName("Dtl.bcst_grp_nm5", p);
		p.columnDtl_bcst_grp_cd6 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_bcst_grp_cd6.addAliasName("Dtl.bcst_grp_cd6", p);
		p.columnDtl_bcst_grp_nm6 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_bcst_grp_nm6.addAliasName("Dtl.bcst_grp_nm6", p);
		p.columnDtl_bcst_grp_cd7 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_bcst_grp_cd7.addAliasName("Dtl.bcst_grp_cd7", p);
		p.columnDtl_bcst_grp_nm7 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_bcst_grp_nm7.addAliasName("Dtl.bcst_grp_nm7", p);
		p.columnDtl_bcst_grp_cd8 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_bcst_grp_cd8.addAliasName("Dtl.bcst_grp_cd8", p);
		p.columnDtl_bcst_grp_nm8 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_bcst_grp_nm8.addAliasName("Dtl.bcst_grp_nm8", p);
		p.columnDtl_bcst_grp_cd9 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_bcst_grp_cd9.addAliasName("Dtl.bcst_grp_cd9", p);
		p.columnDtl_bcst_grp_nm9 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_bcst_grp_nm9.addAliasName("Dtl.bcst_grp_nm9", p);
		p.columnDtl_bcst_grp_cd10 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_bcst_grp_cd10.addAliasName("Dtl.bcst_grp_cd10", p);
		p.columnDtl_bcst_grp_nm10 = p.Dtl_BcstGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_bcst_grp_nm10.addAliasName("Dtl.bcst_grp_nm10", p);
		p.Dtl_AcstGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$AcstGrp_p);
		p.Dtl_AcstGrp_p_PPanel.setName("Dtl.AcstGrp_p");
		p.columnDtl_acst_grp_cd1 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_acst_grp_cd1.addAliasName("Dtl.acst_grp_cd1", p);
		p.columnDtl_acst_grp_nm1 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_acst_grp_nm1.addAliasName("Dtl.acst_grp_nm1", p);
		p.columnDtl_acst_grp_cd2 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_acst_grp_cd2.addAliasName("Dtl.acst_grp_cd2", p);
		p.columnDtl_acst_grp_nm2 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_acst_grp_nm2.addAliasName("Dtl.acst_grp_nm2", p);
		p.columnDtl_acst_grp_cd3 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_acst_grp_cd3.addAliasName("Dtl.acst_grp_cd3", p);
		p.columnDtl_acst_grp_nm3 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_acst_grp_nm3.addAliasName("Dtl.acst_grp_nm3", p);
		p.columnDtl_acst_grp_cd4 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_acst_grp_cd4.addAliasName("Dtl.acst_grp_cd4", p);
		p.columnDtl_acst_grp_nm4 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_acst_grp_nm4.addAliasName("Dtl.acst_grp_nm4", p);
		p.columnDtl_acst_grp_cd5 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_acst_grp_cd5.addAliasName("Dtl.acst_grp_cd5", p);
		p.columnDtl_acst_grp_nm5 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_acst_grp_nm5.addAliasName("Dtl.acst_grp_nm5", p);
		p.columnDtl_acst_grp_cd6 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_acst_grp_cd6.addAliasName("Dtl.acst_grp_cd6", p);
		p.columnDtl_acst_grp_nm6 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_acst_grp_nm6.addAliasName("Dtl.acst_grp_nm6", p);
		p.columnDtl_acst_grp_cd7 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_acst_grp_cd7.addAliasName("Dtl.acst_grp_cd7", p);
		p.columnDtl_acst_grp_nm7 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_acst_grp_nm7.addAliasName("Dtl.acst_grp_nm7", p);
		p.columnDtl_acst_grp_cd8 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_acst_grp_cd8.addAliasName("Dtl.acst_grp_cd8", p);
		p.columnDtl_acst_grp_nm8 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_acst_grp_nm8.addAliasName("Dtl.acst_grp_nm8", p);
		p.columnDtl_acst_grp_cd9 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_acst_grp_cd9.addAliasName("Dtl.acst_grp_cd9", p);
		p.columnDtl_acst_grp_nm9 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_acst_grp_nm9.addAliasName("Dtl.acst_grp_nm9", p);
		p.columnDtl_acst_grp_cd10 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_acst_grp_cd10.addAliasName("Dtl.acst_grp_cd10", p);
		p.columnDtl_acst_grp_nm10 = p.Dtl_AcstGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_acst_grp_nm10.addAliasName("Dtl.acst_grp_nm10", p);
		p.Dtl_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBB.MSBBP1370.DtlR.$itm_grp_p);
		p.Dtl_itm_grp_p_PPanel.setName("Dtl.itm_grp_p");
		p.columnDtl_itm_grp_cd1 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnDtl_itm_grp_cd1.addAliasName("Dtl.itm_grp_cd1", p);
		p.columnDtl_itm_grp_nm1 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnDtl_itm_grp_nm1.addAliasName("Dtl.itm_grp_nm1", p);
		p.columnDtl_itm_grp_cd2 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnDtl_itm_grp_cd2.addAliasName("Dtl.itm_grp_cd2", p);
		p.columnDtl_itm_grp_nm2 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnDtl_itm_grp_nm2.addAliasName("Dtl.itm_grp_nm2", p);
		p.columnDtl_itm_grp_cd3 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnDtl_itm_grp_cd3.addAliasName("Dtl.itm_grp_cd3", p);
		p.columnDtl_itm_grp_nm3 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnDtl_itm_grp_nm3.addAliasName("Dtl.itm_grp_nm3", p);
		p.columnDtl_itm_grp_cd4 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnDtl_itm_grp_cd4.addAliasName("Dtl.itm_grp_cd4", p);
		p.columnDtl_itm_grp_nm4 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnDtl_itm_grp_nm4.addAliasName("Dtl.itm_grp_nm4", p);
		p.columnDtl_itm_grp_cd5 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnDtl_itm_grp_cd5.addAliasName("Dtl.itm_grp_cd5", p);
		p.columnDtl_itm_grp_nm5 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnDtl_itm_grp_nm5.addAliasName("Dtl.itm_grp_nm5", p);
		p.columnDtl_itm_grp_cd6 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnDtl_itm_grp_cd6.addAliasName("Dtl.itm_grp_cd6", p);
		p.columnDtl_itm_grp_nm6 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnDtl_itm_grp_nm6.addAliasName("Dtl.itm_grp_nm6", p);
		p.columnDtl_itm_grp_cd7 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnDtl_itm_grp_cd7.addAliasName("Dtl.itm_grp_cd7", p);
		p.columnDtl_itm_grp_nm7 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnDtl_itm_grp_nm7.addAliasName("Dtl.itm_grp_nm7", p);
		p.columnDtl_itm_grp_cd8 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnDtl_itm_grp_cd8.addAliasName("Dtl.itm_grp_cd8", p);
		p.columnDtl_itm_grp_nm8 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnDtl_itm_grp_nm8.addAliasName("Dtl.itm_grp_nm8", p);
		p.columnDtl_itm_grp_cd9 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnDtl_itm_grp_cd9.addAliasName("Dtl.itm_grp_cd9", p);
		p.columnDtl_itm_grp_nm9 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnDtl_itm_grp_nm9.addAliasName("Dtl.itm_grp_nm9", p);
		p.columnDtl_itm_grp_cd10 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnDtl_itm_grp_cd10.addAliasName("Dtl.itm_grp_cd10", p);
		p.columnDtl_itm_grp_nm10 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnDtl_itm_grp_nm10.addAliasName("Dtl.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_SlsDtlModReg p) {
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
	
	
	/** [Cnd_bcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bcst_cd_p = null;

	/**
	 * [Cnd_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bcst_cd_ListPutter() {
		if (Cnd_bcst_cd_p == null) {
			Cnd_bcst_cd_p = createCnd_bcst_cd_ListPutter(Cnd_bcst_cd, "bcst_cd", "bcst_nm");

		}
		return Cnd_bcst_cd_p;
	}
	
	
	/** [Cnd_acst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_acst_cd_p = null;

	/**
	 * [Cnd_acst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_acst_cd_ListPutter() {
		if (Cnd_acst_cd_p == null) {
			Cnd_acst_cd_p = createCnd_acst_cd_ListPutter(Cnd_acst_cd, "acst_cd", "acst_nm");

		}
		return Cnd_acst_cd_p;
	}
	
	
	/** [Cnd_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ar_dpt_cd_p = null;

	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_dpt_cd_ListPutter() {
		if (Cnd_ar_dpt_cd_p == null) {
			Cnd_ar_dpt_cd_p = createCnd_ar_dpt_cd_ListPutter(Cnd_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Cnd_ar_dpt_cd_p;
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
	
	
	/** [Cnd_gd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gd_cd_p = null;

	/**
	 * [Cnd_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gd_cd_ListPutter() {
		if (Cnd_gd_cd_p == null) {
			Cnd_gd_cd_p = createCnd_gd_cd_ListPutter(Cnd_gd_cd, "gd_cd", "gd_nm");

		}
		return Cnd_gd_cd_p;
	}
	
	
	/** [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "sls_dpt_cd", "sls_dpt_nm","wg_cd","wg_nm");
		}
		return Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_cd_p = null;

	/**
	 * [Dtl_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_cd_ListPutter() {
		if (Dtl_trd_cur_cd_p == null) {
			Dtl_trd_cur_cd_p = createDtl_trd_cur_cd_ListPutter(columnDtl_trd_cur_cd, "trd_cur_cd");

		}
		return Dtl_trd_cur_cd_p;
	}
	
	
	/** [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","tax_typ","inc_tax_flg");
		}
		return Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ar_dpt_cd_p = null;

	/**
	 * [Dtl_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ar_dpt_cd_ListPutter() {
		if (Dtl_ar_dpt_cd_p == null) {
			Dtl_ar_dpt_cd_p = createDtl_ar_dpt_cd_ListPutter(columnDtl_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Dtl_ar_dpt_cd_p;
	}
	
	
	/** [Dtl_biz_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_biz_rsn_cd_p = null;

	/**
	 * [Dtl_biz_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_biz_rsn_cd_ListPutter() {
		if (Dtl_biz_rsn_cd_p == null) {
			Dtl_biz_rsn_cd_p = createDtl_biz_rsn_cd_ListPutter(columnDtl_biz_rsn_cd, "biz_rsn_cd", "biz_rsn_nm","sls_acxfr_flg");

		}
		return Dtl_biz_rsn_cd_p;
	}
	
	
	/** [Dtl_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bd_dpt_cd_p = null;

	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bd_dpt_cd_ListPutter() {
		if (Dtl_bd_dpt_cd_p == null) {
			Dtl_bd_dpt_cd_p = createDtl_bd_dpt_cd_ListPutter(columnDtl_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Dtl_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsDtlModReg create(){
		MSBBP_SlsDtlModReg p = new MSBBP_SlsDtlModReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsDtlModReg create(String name){
		MSBBP_SlsDtlModReg p = new MSBBP_SlsDtlModReg(name);
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
		MSBBP_SlsDtlModReg_MC.jbfInitScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitDispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitSrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTop((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitFold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitIv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitUpri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitAprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitCstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitDlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitBcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitAcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitCnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitCtrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitRPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitBulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitUpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitUpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitXrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitTaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitDtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbfInitBtn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitDispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitSrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTop((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitFold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitIv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitUpri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitAprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitCstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitDlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitBcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitAcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitCnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitCtrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitRPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitBulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitUpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitUpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitXrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitTaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitDtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.jbInitBtn((MSBBP_SlsDtlModReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchTyp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.SrchTypPanel = p.beansFactory.createPanel("SrchTyp");
		p.SrchTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_SlsDtlModReg p) {
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
	protected static void jbfInitTab1(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab6]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab6(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab6Panel = p.beansFactory.createPanel("Tab6");
		// ブロックの項目の初期化
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIv(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.IvPanel = p.beansFactory.createPanel("Iv");
		p.IvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Upri]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpri(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.UpriPanel = p.beansFactory.createPanel("Upri");
		p.UpriTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [AprvSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvSts(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.AprvStsPanel = p.beansFactory.createPanel("AprvSts");
		p.AprvStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [CstGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.CstGrpPanel = p.beansFactory.createPanel("CstGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.DlvGrpPanel = p.beansFactory.createPanel("DlvGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBcstGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.BcstGrpPanel = p.beansFactory.createPanel("BcstGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [AcstGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAcstGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.AcstGrpPanel = p.beansFactory.createPanel("AcstGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_disp_unit_Group = p.beansFactory.createButtonGroup("Cnd.disp_unit");
		p.Cnd_disp_unit_IO = p.beansFactory.createRadioButton("Cnd.disp_unit_IO");
		p.Cnd_disp_unit_DTL = p.beansFactory.createRadioButton("Cnd.disp_unit_DTL");
		p.Cnd_disp_unit_HDR = p.beansFactory.createRadioButton("Cnd.disp_unit_HDR");
		p.Cnd_sls = p.beansFactory.createCheckBox("Cnd.sls");
		p.Cnd_sls_ret = p.beansFactory.createCheckBox("Cnd.sls_ret");
		p.Cnd_sls_dscnt = p.beansFactory.createCheckBox("Cnd.sls_dscnt");
		p.Cnd_iv_tgt_flg = p.beansFactory.createCheckBox("Cnd.iv_tgt_flg");
		p.Cnd_iv_not_tgt_flg = p.beansFactory.createCheckBox("Cnd.iv_not_tgt_flg");
		p.Cnd_not_interim_flg = p.beansFactory.createCheckBox("Cnd.not_interim_flg");
		p.Cnd_interim_flg = p.beansFactory.createCheckBox("Cnd.interim_flg");
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_acpt_flg = p.beansFactory.createCheckBox("Cnd.acpt_flg");
		p.Cnd_rjct_flg = p.beansFactory.createCheckBox("Cnd.rjct_flg");
		p.Cnd_last_rjct_flg = p.beansFactory.createCheckBox("Cnd.last_rjct_flg");
		p.Cnd_not_aprv_flg = p.beansFactory.createCheckBox("Cnd.not_aprv_flg");
		p.Cnd_sls_dt_fr_Label = p.beansFactory.createLabel("Cnd.sls_dt_fr_Label");
		p.Cnd_sls_dt_fr = p.beansFactory.createDateField("Cnd.sls_dt_fr");
		p.Cnd_sls_dt_fr.setLabel(p.Cnd_sls_dt_fr_Label);
		p.Cnd_sls_dt_to_Label = p.beansFactory.createLabel("Cnd.sls_dt_to_Label");
		p.Cnd_sls_dt_to = p.beansFactory.createDateField("Cnd.sls_dt_to");
		p.Cnd_sls_dt_to.setLabel(p.Cnd_sls_dt_to_Label);
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
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
		p.Cnd_ship_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_lg_grp_cd_Label");
		p.Cnd_ship_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_lg_grp_cd");
		p.Cnd_ship_lg_grp_cd.setLabel(p.Cnd_ship_lg_grp_cd_Label);
		p.Cnd_ship_lg_grp_nm = p.beansFactory.createTextField("Cnd.ship_lg_grp_nm");
		p.Cnd_sls_act_no_Label = p.beansFactory.createLabel("Cnd.sls_act_no_Label");
		p.Cnd_sls_act_no = p.beansFactory.createTextField("Cnd.sls_act_no");
		p.Cnd_sls_act_no.setLabel(p.Cnd_sls_act_no_Label);
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_ship_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.ship_dlv_slip_no_Label");
		p.Cnd_ship_dlv_slip_no = p.beansFactory.createTextField("Cnd.ship_dlv_slip_no");
		p.Cnd_ship_dlv_slip_no.setLabel(p.Cnd_ship_dlv_slip_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_sls_ret_schd_no_Label = p.beansFactory.createLabel("Cnd.sls_ret_schd_no_Label");
		p.Cnd_sls_ret_schd_no = p.beansFactory.createTextField("Cnd.sls_ret_schd_no");
		p.Cnd_sls_ret_schd_no.setLabel(p.Cnd_sls_ret_schd_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
		p.Cnd_ext_purc_act_d_no_Label = p.beansFactory.createLabel("Cnd.ext_purc_act_d_no_Label");
		p.Cnd_ext_purc_act_d_no = p.beansFactory.createTextField("Cnd.ext_purc_act_d_no");
		p.Cnd_ext_purc_act_d_no.setLabel(p.Cnd_ext_purc_act_d_no_Label);
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_foreign_flg = p.beansFactory.createCheckBox("Cnd.foreign_flg");
		p.Cnd_tax_cd_Label = p.beansFactory.createLabel("Cnd.tax_cd_Label");
		p.Cnd_tax_cd = p.beansFactory.createTextComboBox("Cnd.tax_cd");
		p.Cnd_tax_cd.setLabel(p.Cnd_tax_cd_Label);
		p.Cnd_tax_nm = p.beansFactory.createTextField("Cnd.tax_nm");
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_acst_cd_Label = p.beansFactory.createLabel("Cnd.acst_cd_Label");
		p.Cnd_acst_cd = p.beansFactory.createTextField("Cnd.acst_cd");
		p.Cnd_acst_cd.setLabel(p.Cnd_acst_cd_Label);
		p.Cnd_acst_nm = p.beansFactory.createTextField("Cnd.acst_nm");
		p.Cnd_ar_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ar_dpt_cd_Label");
		p.Cnd_ar_dpt_cd = p.beansFactory.createTextField("Cnd.ar_dpt_cd");
		p.Cnd_ar_dpt_cd.setLabel(p.Cnd_ar_dpt_cd_Label);
		p.Cnd_ar_dpt_nm = p.beansFactory.createTextField("Cnd.ar_dpt_nm");
		p.Cnd_tdlv_cd_Label = p.beansFactory.createLabel("Cnd.tdlv_cd_Label");
		p.Cnd_tdlv_cd = p.beansFactory.createTextField("Cnd.tdlv_cd");
		p.Cnd_tdlv_cd.setLabel(p.Cnd_tdlv_cd_Label);
		p.Cnd_tdlv_nm = p.beansFactory.createTextField("Cnd.tdlv_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
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
		p.Cnd_io_sub_char1_Label = p.beansFactory.createLabel("Cnd.io_sub_char1_Label");
		p.Cnd_io_sub_char1 = p.beansFactory.createTextField("Cnd.io_sub_char1");
		p.Cnd_io_sub_char1.setLabel(p.Cnd_io_sub_char1_Label);
		p.Cnd_io_sub_char2_Label = p.beansFactory.createLabel("Cnd.io_sub_char2_Label");
		p.Cnd_io_sub_char2 = p.beansFactory.createTextField("Cnd.io_sub_char2");
		p.Cnd_io_sub_char2.setLabel(p.Cnd_io_sub_char2_Label);
		p.Cnd_io_sub_char3_Label = p.beansFactory.createLabel("Cnd.io_sub_char3_Label");
		p.Cnd_io_sub_char3 = p.beansFactory.createTextField("Cnd.io_sub_char3");
		p.Cnd_io_sub_char3.setLabel(p.Cnd_io_sub_char3_Label);
		p.Cnd_dis_can_disp_flg = p.beansFactory.createCheckBox("Cnd.dis_can_disp_flg");
		p.Cnd_sign_rev_flg = p.beansFactory.createCheckBox("Cnd.sign_rev_flg");
		p.Cnd_inc_past_flg = p.beansFactory.createCheckBox("Cnd.inc_past_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSetTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSetTab(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.BulkSetTabPanel = p.beansFactory.createPanel("BulkSetTab");
		p.BulkSetTabTab = p.beansFactory.createTabbedPane("BulkSetTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [UpriXrate]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpriXrate(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.UpriXratePanel = p.beansFactory.createPanel("UpriXrate");
		// ブロックの項目の初期化
	}

	/**
	 * [UpriBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpriBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.UpriBulkSetPanel = p.beansFactory.createPanel("UpriBulkSet");
		p.UpriBulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.UpriBulkSet_upri_dt_Label = p.beansFactory.createLabel("UpriBulkSet.upri_dt_Label");
		p.UpriBulkSet_upri_dt = p.beansFactory.createDateField("UpriBulkSet.upri_dt");
		p.UpriBulkSet_upri_dt.setLabel(p.UpriBulkSet_upri_dt_Label);
		p.UpriBulkSet_upri_replace = p.beansFactory.createButton("UpriBulkSet.upri_replace");
		p.UpriBulkSet_label_interim_flg = p.beansFactory.createLabel("UpriBulkSet.label_interim_flg");
		p.UpriBulkSet_select_all = p.beansFactory.createButton("UpriBulkSet.select_all", "no_border");
		p.UpriBulkSet_deselect_all = p.beansFactory.createButton("UpriBulkSet.deselect_all", "no_border");
	}

	/**
	 * [XrateBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitXrateBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.XrateBulkSetPanel = p.beansFactory.createPanel("XrateBulkSet");
		p.XrateBulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.XrateBulkSet_xrate_dt_Label = p.beansFactory.createLabel("XrateBulkSet.xrate_dt_Label");
		p.XrateBulkSet_xrate_dt = p.beansFactory.createDateField("XrateBulkSet.xrate_dt");
		p.XrateBulkSet_xrate_dt.setLabel(p.XrateBulkSet_xrate_dt_Label);
		p.XrateBulkSet_xrate_replace = p.beansFactory.createButton("XrateBulkSet.xrate_replace");
	}

	/**
	 * [TaxBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTaxBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.TaxBulkSetPanel = p.beansFactory.createPanel("TaxBulkSet");
		p.TaxBulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.TaxBulkSet_tax_dt_Label = p.beansFactory.createLabel("TaxBulkSet.tax_dt_Label");
		p.TaxBulkSet_tax_dt = p.beansFactory.createDateField("TaxBulkSet.tax_dt");
		p.TaxBulkSet_tax_dt.setLabel(p.TaxBulkSet_tax_dt_Label);
		p.TaxBulkSet_tax_replace = p.beansFactory.createButton("TaxBulkSet.tax_replace");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_sls_dt = p.beansFactory.createTableColumn("Dtl.sls_dt", MCColumnType.DATE);
		p.columnDtl_ac_ym = p.beansFactory.createTableColumn("Dtl.ac_ym", MCColumnType.DATE);
		p.columnDtl_ac_dt = p.beansFactory.createTableColumn("Dtl.ac_dt", MCColumnType.DATE);
		p.columnDtl_can_ac_dt = p.beansFactory.createTableColumn("Dtl.can_ac_dt", MCColumnType.DATE);
		p.columnDtl_bill_basis_dt = p.beansFactory.createTableColumn("Dtl.bill_basis_dt", MCColumnType.DATE);
		p.columnDtl_rcv_schd_dt = p.beansFactory.createTableColumn("Dtl.rcv_schd_dt", MCColumnType.DATE);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_comp_spec_typ = p.beansFactory.createTableColumn("Dtl.comp_spec_typ", MCColumnType.TEXT);
		p.columnDtl_comp_spec_typ_nm = p.beansFactory.createTableColumn("Dtl.comp_spec_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_prof_rate = p.beansFactory.createTableColumn("Dtl.prof_rate", MCColumnType.NUMBER);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_schd_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.schd_trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_schd_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.schd_trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_sls_upri_req_typ = p.beansFactory.createTableColumn("Dtl.sls_upri_req_typ", MCColumnType.TEXT);
		p.columnDtl_sls_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl.sls_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_dt = p.beansFactory.createTableColumn("Dtl.slo_dt", MCColumnType.DATE);
		p.columnDtl_sls_schd_dt = p.beansFactory.createTableColumn("Dtl.sls_schd_dt", MCColumnType.DATE);
		p.columnDtl_base_cur_cd = p.beansFactory.createTableColumn("Dtl.base_cur_cd", MCColumnType.TEXT);
		p.columnDtl_base_cur_nm = p.beansFactory.createTableColumn("Dtl.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl_xrate_cd = p.beansFactory.createTableColumn("Dtl.xrate_cd", MCColumnType.TEXT);
		p.columnDtl_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl.ptax_cur_cd", MCColumnType.TEXT);
		p.columnDtl_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl_ptax_xrate = p.beansFactory.createTableColumn("Dtl.ptax_xrate", MCColumnType.NUMBER);
		p.columnDtl_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_trd_rmrks = p.beansFactory.createTableColumn("Dtl.trd_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_dest_cd1 = p.beansFactory.createTableColumn("Dtl.dest_cd1", MCColumnType.TEXT);
		p.columnDtl_dest_nm1 = p.beansFactory.createTableColumn("Dtl.dest_nm1", MCColumnType.TEXT);
		p.columnDtl_dest_cd2 = p.beansFactory.createTableColumn("Dtl.dest_cd2", MCColumnType.TEXT);
		p.columnDtl_dest_nm2 = p.beansFactory.createTableColumn("Dtl.dest_nm2", MCColumnType.TEXT);
		p.columnDtl_dest_cd3 = p.beansFactory.createTableColumn("Dtl.dest_cd3", MCColumnType.TEXT);
		p.columnDtl_dest_nm3 = p.beansFactory.createTableColumn("Dtl.dest_nm3", MCColumnType.TEXT);
		p.columnDtl_tdlv_cd = p.beansFactory.createTableColumn("Dtl.tdlv_cd", MCColumnType.TEXT);
		p.columnDtl_tdlv_nm = p.beansFactory.createTableColumn("Dtl.tdlv_nm", MCColumnType.TEXT);
		p.columnDtl_ship_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_ship_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.ship_lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_acst_cd = p.beansFactory.createTableColumn("Dtl.acst_cd", MCColumnType.TEXT);
		p.columnDtl_acst_nm = p.beansFactory.createTableColumn("Dtl.acst_nm", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_cd = p.beansFactory.createTableColumn("Dtl.ar_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_nm = p.beansFactory.createTableColumn("Dtl.ar_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_bcst_cd = p.beansFactory.createTableColumn("Dtl.bcst_cd", MCColumnType.TEXT);
		p.columnDtl_bcst_nm = p.beansFactory.createTableColumn("Dtl.bcst_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_ship_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_sls_act_no = p.beansFactory.createTableColumn("Dtl.sls_act_no", MCColumnType.TEXT);
		p.columnDtl_sls_act_rev = p.beansFactory.createTableColumn("Dtl.sls_act_rev", MCColumnType.NUMBER);
		p.columnDtl_sls_act_d_no = p.beansFactory.createTableColumn("Dtl.sls_act_d_no", MCColumnType.TEXT);
		p.columnDtl_base_sls_ac_dt = p.beansFactory.createTableColumn("Dtl.base_sls_ac_dt", MCColumnType.DATE);
		p.columnDtl_aprv_flg = p.beansFactory.createTableColumn("Dtl.aprv_flg", MCColumnType.CHECK);
		p.columnDtl_aprv_no = p.beansFactory.createTableColumn("Dtl.aprv_no", MCColumnType.TEXT);
		p.columnDtl_aprv_sts_typ = p.beansFactory.createTableColumn("Dtl.aprv_sts_typ", MCColumnType.TEXT);
		p.columnDtl_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_sls_ret_schd_no = p.beansFactory.createTableColumn("Dtl.sls_ret_schd_no", MCColumnType.TEXT);
		p.columnDtl_sls_ret_schd_d_no = p.beansFactory.createTableColumn("Dtl.sls_ret_schd_d_no", MCColumnType.TEXT);
		p.columnDtl_qtn_no = p.beansFactory.createTableColumn("Dtl.qtn_no", MCColumnType.TEXT);
		p.columnDtl_qtn_rev = p.beansFactory.createTableColumn("Dtl.qtn_rev", MCColumnType.NUMBER);
		p.columnDtl_qtn_d_no = p.beansFactory.createTableColumn("Dtl.qtn_d_no", MCColumnType.TEXT);
		p.columnDtl_purc_ddlv_po_no = p.beansFactory.createTableColumn("Dtl.purc_ddlv_po_no", MCColumnType.TEXT);
		p.columnDtl_purc_ddlv_po_d_no = p.beansFactory.createTableColumn("Dtl.purc_ddlv_po_d_no", MCColumnType.TEXT);
		p.columnDtl_iv_no = p.beansFactory.createTableColumn("Dtl.iv_no", MCColumnType.TEXT);
		p.columnDtl_ref_iv_no = p.beansFactory.createTableColumn("Dtl.ref_iv_no", MCColumnType.TEXT);
		p.columnDtl_cst_po_no = p.beansFactory.createTableColumn("Dtl.cst_po_no", MCColumnType.TEXT);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_no = p.beansFactory.createTableColumn("Dtl.ship_act_d_no", MCColumnType.TEXT);
		p.columnDtl_arr_act_no = p.beansFactory.createTableColumn("Dtl.arr_act_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_io_no = p.beansFactory.createTableColumn("Dtl.purc_act_io_no", MCColumnType.TEXT);
		p.columnDtl_sls_act_io_no = p.beansFactory.createTableColumn("Dtl.sls_act_io_no", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_lot_no = p.beansFactory.createTableColumn("Dtl.lot_no", MCColumnType.TEXT);
		p.columnDtl_sublot_no = p.beansFactory.createTableColumn("Dtl.sublot_no", MCColumnType.TEXT);
		p.columnDtl_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_biz_rsn_cd = p.beansFactory.createTableColumn("Dtl.biz_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_biz_rsn_nm = p.beansFactory.createTableColumn("Dtl.biz_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bd_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_ext_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.ext_purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char1", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char2", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char3", MCColumnType.TEXT);
		p.columnDtl_io_sub_char1 = p.beansFactory.createTableColumn("Dtl.io_sub_char1", MCColumnType.TEXT);
		p.columnDtl_io_sub_char2 = p.beansFactory.createTableColumn("Dtl.io_sub_char2", MCColumnType.TEXT);
		p.columnDtl_io_sub_char3 = p.beansFactory.createTableColumn("Dtl.io_sub_char3", MCColumnType.TEXT);
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
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_sls_act_seq = p.beansFactory.createTableColumn("Dtl.sls_act_seq", MCColumnType.NUMBER);
		p.columnDtl_sls_act_d_seq = p.beansFactory.createTableColumn("Dtl.sls_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl_hdr_upd_cntr = p.beansFactory.createTableColumn("Dtl.hdr_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_sls_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.sls_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_sls_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.sls_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_xrate_rnd_typ = p.beansFactory.createTableColumn("Dtl.xrate_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_wtax_rnd_typ = p.beansFactory.createTableColumn("Dtl.wtax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_sls_acxfr_flg = p.beansFactory.createTableColumn("Dtl.sls_acxfr_flg", MCColumnType.CHECK);
		p.columnDtl_cst_iv_flg = p.beansFactory.createTableColumn("Dtl.cst_iv_flg", MCColumnType.CHECK);
		p.columnDtl_sls_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_sls_close_flg = p.beansFactory.createTableColumn("Dtl.sls_close_flg", MCColumnType.CHECK);
		p.columnDtl_bef_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bef_bd_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bill_cl_typ = p.beansFactory.createTableColumn("Dtl.bill_cl_typ", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_prnt_out_flg = p.beansFactory.createCheckBox("Btn.prnt_out_flg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.DispUnitPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.SrchTypPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchTyp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.SrchTypPanel.setBorder(p.SrchTypTitledBorder);
		p.add(p.SrchTypPanel);
		p.SrchTypPanel.setNextBeans(p.TopPanel);
		p.SrchTypPanel.setValueCheck(false);
		p.SrchTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchTypPanel.setLayoutPosition("NNWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBBP_SlsDtlModReg p) {
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
	protected static void jbInitTab1(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.IvPanel, null);
		p.Tab1Panel.setLastBeans(p.IvPanel);
		p.IvPanel.setNextBeans(p.UpriPanel);
		p.Tab1Panel.add(p.UpriPanel, null);
		p.UpriPanel.setNextBeans(p.AprvStsPanel);
		p.Tab1Panel.add(p.AprvStsPanel, null);
		p.AprvStsPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.CstGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.CstGrpPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DlvGrpPanel, null);
		p.Tab3Panel.setLastBeans(p.DlvGrpPanel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.BcstGrpPanel, null);
		p.Tab4Panel.setLastBeans(p.BcstGrpPanel);
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab5Panel.setNextBeans(p.Tab6Panel);
		p.Tab5Panel.setValueCheck(false);
		p.Tab5Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab5Panel.add(p.AcstGrpPanel, null);
		p.Tab5Panel.setLastBeans(p.AcstGrpPanel);
	}

	/**
	 * [Tab6]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab6(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.Tab6Panel.setValueCheck(false);
		p.Tab6Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab6Panel.add(p.ItmGrpPanel, null);
		p.Tab6Panel.setLastBeans(p.ItmGrpPanel);
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIv(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.IvPanel.setBorder(p.IvTitledBorder);
		p.IvPanel.setValueCheck(false);
		p.IvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Upri]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpri(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.UpriPanel.setBorder(p.UpriTitledBorder);
		p.UpriPanel.setValueCheck(false);
		p.UpriPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.UpriPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvSts(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.AprvStsPanel.setBorder(p.AprvStsTitledBorder);
		p.AprvStsPanel.setValueCheck(false);
		p.AprvStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AprvStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [CstGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [DlvGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [BcstGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBcstGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [AcstGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAcstGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_disp_unit_Group);
		p.Cnd_disp_unit_Group.setFirstBeans(p.Cnd_disp_unit_IO);
		p.Cnd_disp_unit_IO.setActionCommand("0");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_IO);
		p.DispUnitPanel.add(p.Cnd_disp_unit_IO);
		p.Cnd_disp_unit_IO.setNextBeans(p.Cnd_disp_unit_DTL);
		p.Cnd_disp_unit_DTL.setActionCommand("1");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_DTL);
		p.DispUnitPanel.add(p.Cnd_disp_unit_DTL);
		p.Cnd_disp_unit_DTL.setNextBeans(p.Cnd_disp_unit_HDR);
		p.Cnd_disp_unit_HDR.setActionCommand("2");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_HDR);
		p.DispUnitPanel.add(p.Cnd_disp_unit_HDR);
		p.Cnd_disp_unit_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.disp_unit_META);
		p.SrchTypPanel.add(p.Cnd_sls);
		p.SrchTypPanel.setLastBeans(p.Cnd_sls);
		p.Cnd_sls.setNextBeans(p.Cnd_sls_ret);
		p.Cnd_sls.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_META);
		p.SrchTypPanel.add(p.Cnd_sls_ret);
		p.Cnd_sls_ret.setNextBeans(p.Cnd_sls_dscnt);
		p.Cnd_sls_ret.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_ret_META);
		p.SrchTypPanel.add(p.Cnd_sls_dscnt);
		p.Cnd_sls_dscnt.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_dscnt_META);
		p.IvPanel.add(p.Cnd_iv_tgt_flg);
		p.IvPanel.setLastBeans(p.Cnd_iv_tgt_flg);
		p.Cnd_iv_tgt_flg.setNextBeans(p.Cnd_iv_not_tgt_flg);
		p.Cnd_iv_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.iv_tgt_flg_META);
		p.IvPanel.add(p.Cnd_iv_not_tgt_flg);
		p.Cnd_iv_not_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.iv_not_tgt_flg_META);
		p.UpriPanel.add(p.Cnd_not_interim_flg);
		p.UpriPanel.setLastBeans(p.Cnd_not_interim_flg);
		p.Cnd_not_interim_flg.setNextBeans(p.Cnd_interim_flg);
		p.Cnd_not_interim_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.not_interim_flg_META);
		p.UpriPanel.add(p.Cnd_interim_flg);
		p.Cnd_interim_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.interim_flg_META);
		p.AprvStsPanel.add(p.Cnd_opn_flg);
		p.AprvStsPanel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.opn_flg_META);
		p.AprvStsPanel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_acpt_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.fix_flg_META);
		p.AprvStsPanel.add(p.Cnd_acpt_flg);
		p.Cnd_acpt_flg.setNextBeans(p.Cnd_rjct_flg);
		p.Cnd_acpt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.acpt_flg_META);
		p.AprvStsPanel.add(p.Cnd_rjct_flg);
		p.Cnd_rjct_flg.setNextBeans(p.Cnd_last_rjct_flg);
		p.Cnd_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.rjct_flg_META);
		p.AprvStsPanel.add(p.Cnd_last_rjct_flg);
		p.Cnd_last_rjct_flg.setNextBeans(p.Cnd_not_aprv_flg);
		p.Cnd_last_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.last_rjct_flg_META);
		p.AprvStsPanel.add(p.Cnd_not_aprv_flg);
		p.Cnd_not_aprv_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.not_aprv_flg_META);
		p.CndPanel.add(p.Cnd_sls_dt_fr_Label);
		p.CndPanel.add(p.Cnd_sls_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_sls_dt_fr);
		p.Cnd_sls_dt_fr.setNextBeans(p.Cnd_sls_dt_to);
		p.Cnd_sls_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_dt_fr_META);
		p.Cnd_sls_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_dt_to_Label);
		p.CndPanel.add(p.Cnd_sls_dt_to);
		p.Cnd_sls_dt_to.setNextBeans(p.Cnd_ac_ym_fr);
		p.Cnd_sls_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_dt_to_META);
		p.Cnd_sls_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_ship_dt_p_PPanel);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ship_dt_p_PPanel);
		p.Cnd_ship_dt_p_PPanel.setNextBeans(p.Cnd_dlv_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_dt_p_PPanel);
		p.Cnd_dlv_dt_p_PPanel.setNextBeans(p.Cnd_sls_usr_cd);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_ship_lg_grp_cd);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.Cnd_ship_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_lg_grp_cd, true);
		p.Cnd_ship_lg_grp_cd.setLinkBeans(p.Cnd_ship_lg_grp_nm);
		p.CndPanel.add(p.Cnd_ship_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_lg_grp_cd);
		p.Cnd_ship_lg_grp_cd.setNextBeans(p.Cnd_ship_lg_grp_nm);
		p.Cnd_ship_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ship_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_lg_grp_nm);
		p.Cnd_ship_lg_grp_nm.setNextBeans(p.Cnd_sls_act_no);
		p.Cnd_ship_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ship_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_sls_act_no_Label);
		p.CndPanel.add(p.Cnd_sls_act_no);
		p.Cnd_sls_act_no.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_sls_act_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_act_no_META);
		p.setPluralValueEnable(p.Cnd_sls_act_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_ship_dlv_slip_no);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_ship_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_ship_dlv_slip_no);
		p.Cnd_ship_dlv_slip_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_ship_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ship_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_ship_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_sls_ret_schd_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_sls_ret_schd_no_Label);
		p.CndPanel.add(p.Cnd_sls_ret_schd_no);
		p.Cnd_sls_ret_schd_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_sls_ret_schd_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sls_ret_schd_no_META);
		p.setPluralValueEnable(p.Cnd_sls_ret_schd_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_ext_purc_act_d_no);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_ext_purc_act_d_no_Label);
		p.CndPanel.add(p.Cnd_ext_purc_act_d_no);
		p.Cnd_ext_purc_act_d_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ext_purc_act_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ext_purc_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_ext_purc_act_d_no, true);
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
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_lot_no);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_trd_cd);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_foreign_flg);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_foreign_flg);
		p.Cnd_foreign_flg.setNextBeans(p.Cnd_tax_cd);
		p.Cnd_foreign_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.foreign_flg_META);
		p.Cnd_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_cd, true);
		p.Cnd_tax_cd.setLinkBeans(p.Cnd_tax_nm);
		p.CndPanel.add(p.Cnd_tax_cd_Label);
		p.CndPanel.add(p.Cnd_tax_cd);
		p.Cnd_tax_cd.setNextBeans(p.Cnd_tax_nm);
		p.Cnd_tax_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.tax_cd_META);
		p.CndPanel.add(p.Cnd_tax_nm);
		p.Cnd_tax_nm.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_tax_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.tax_nm_META);
		p.setPluralValueEnable(p.Cnd_tax_nm, true);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_acst_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_acst_cd_Label);
		p.CndPanel.add(p.Cnd_acst_cd);
		p.Cnd_acst_cd.setNextBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.acst_cd_META);
		p.Cnd_acst_cd.addLinkBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_acst_cd, true);
		p.CndPanel.add(p.Cnd_acst_nm);
		p.Cnd_acst_nm.setNextBeans(p.Cnd_ar_dpt_cd);
		p.Cnd_acst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.acst_nm_META);
		p.setPluralValueEnable(p.Cnd_acst_nm, true);
		p.CndPanel.add(p.Cnd_ar_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ar_dpt_cd);
		p.Cnd_ar_dpt_cd.setNextBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ar_dpt_cd_META);
		p.Cnd_ar_dpt_cd.addLinkBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_nm.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_ar_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.ar_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ar_dpt_nm, true);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.tdlv_nm_META);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setNextBeans(p.Cnd_io_sub_char1);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.CndPanel.add(p.Cnd_io_sub_char1_Label);
		p.CndPanel.add(p.Cnd_io_sub_char1);
		p.Cnd_io_sub_char1.setNextBeans(p.Cnd_io_sub_char2);
		p.Cnd_io_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.io_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_io_sub_char1, true);
		p.CndPanel.add(p.Cnd_io_sub_char2_Label);
		p.CndPanel.add(p.Cnd_io_sub_char2);
		p.Cnd_io_sub_char2.setNextBeans(p.Cnd_io_sub_char3);
		p.Cnd_io_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.io_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_io_sub_char2, true);
		p.CndPanel.add(p.Cnd_io_sub_char3_Label);
		p.CndPanel.add(p.Cnd_io_sub_char3);
		p.Cnd_io_sub_char3.setNextBeans(p.Cnd_dis_can_disp_flg);
		p.Cnd_io_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.io_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_io_sub_char3, true);
		p.CndPanel.add(p.Cnd_dis_can_disp_flg);
		p.Cnd_dis_can_disp_flg.setNextBeans(p.Cnd_sign_rev_flg);
		p.Cnd_dis_can_disp_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.dis_can_disp_flg_META);
		p.CndPanel.add(p.Cnd_sign_rev_flg);
		p.Cnd_sign_rev_flg.setNextBeans(p.Cnd_inc_past_flg);
		p.Cnd_sign_rev_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.sign_rev_flg_META);
		p.CndPanel.add(p.Cnd_inc_past_flg);
		p.Cnd_inc_past_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1370.CndR.inc_past_flg_META);
		p.CstGrpPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstGrpPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.DlvGrpPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvGrpPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.BcstGrpPanel.add(p.Cnd_bcst_grp_p_PPanel);
		p.BcstGrpPanel.setLastBeans(p.Cnd_bcst_grp_p_PPanel);
		p.AcstGrpPanel.add(p.Cnd_acst_grp_p_PPanel);
		p.AcstGrpPanel.setLastBeans(p.Cnd_acst_grp_p_PPanel);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_SlsDtlModReg p) {
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
	protected static void jbInitRPnl(MSBBP_SlsDtlModReg p) {
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
	protected static void jbInitBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN+");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSetTabPanel, null);
		p.BulkSetPanel.setLastBeans(p.BulkSetTabPanel);
	}

	/**
	 * [BulkSetTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSetTab(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.BulkSetTabPanel.add(p.BulkSetTabTab);
		p.BulkSetTabPanel.setLastBeans(p.BulkSetTabTab);
		p.BulkSetTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BulkSetTabTab.add(p.UpriXratePanel, "BulkSetTab.upri_xrate");
		p.BulkSetTabTab.setLastBeans(p.UpriXratePanel);
		p.UpriXratePanel.setNextBeans(p.TaxBulkSetPanel);
		p.BulkSetTabTab.add(p.TaxBulkSetPanel, "BulkSetTab.tax");
	}

	/**
	 * [UpriXrate]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpriXrate(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.UpriXratePanel.setNextBeans(p.TaxBulkSetPanel);
		p.UpriXratePanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.UpriXratePanel.add(p.UpriBulkSetPanel, null);
		p.UpriXratePanel.setLastBeans(p.UpriBulkSetPanel);
		p.UpriBulkSetPanel.setNextBeans(p.XrateBulkSetPanel);
		p.UpriXratePanel.add(p.XrateBulkSetPanel, null);
	}

	/**
	 * [UpriBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpriBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.UpriBulkSetPanel.setBorder(p.UpriBulkSetTitledBorder);
		p.UpriBulkSetPanel.setValueCheck(false);
		p.UpriBulkSetPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.UpriBulkSetPanel.add(p.UpriBulkSet_upri_dt_Label);
		p.UpriBulkSetPanel.add(p.UpriBulkSet_upri_dt);
		p.UpriBulkSetPanel.setLastBeans(p.UpriBulkSet_upri_dt);
		p.UpriBulkSet_upri_dt.setNextBeans(p.UpriBulkSet_upri_replace);
		p.UpriBulkSet_upri_dt.setRow(p.getUpriBulkSetR(), mcframe.clientMSBB.MSBBP1370.UpriBulkSetR.upri_dt_META);
		p.UpriBulkSet_upri_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.UpriBulkSetPanel.add(p.UpriBulkSet_upri_replace);
		p.UpriBulkSet_upri_replace.setNextBeans(p.UpriBulkSet_select_all);
		p.UpriBulkSetPanel.add(p.UpriBulkSet_label_interim_flg);
		p.UpriBulkSet_select_all.setIcon("SELECT_ALL");
		p.UpriBulkSetPanel.add(p.UpriBulkSet_select_all);
		p.UpriBulkSet_select_all.setNextBeans(p.UpriBulkSet_deselect_all);
		p.UpriBulkSet_deselect_all.setIcon("DESELECT_ALL");
		p.UpriBulkSetPanel.add(p.UpriBulkSet_deselect_all);
	}

	/**
	 * [XrateBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitXrateBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.XrateBulkSetPanel.setBorder(p.XrateBulkSetTitledBorder);
		p.XrateBulkSetPanel.setValueCheck(false);
		p.XrateBulkSetPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.XrateBulkSetPanel.add(p.XrateBulkSet_xrate_dt_Label);
		p.XrateBulkSetPanel.add(p.XrateBulkSet_xrate_dt);
		p.XrateBulkSetPanel.setLastBeans(p.XrateBulkSet_xrate_dt);
		p.XrateBulkSet_xrate_dt.setNextBeans(p.XrateBulkSet_xrate_replace);
		p.XrateBulkSet_xrate_dt.setRow(p.getXrateBulkSetR(), mcframe.clientMSBB.MSBBP1370.XrateBulkSetR.xrate_dt_META);
		p.XrateBulkSet_xrate_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.XrateBulkSetPanel.add(p.XrateBulkSet_xrate_replace);
	}

	/**
	 * [TaxBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTaxBulkSet(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.TaxBulkSetPanel.setBorder(p.TaxBulkSetTitledBorder);
		p.TaxBulkSetPanel.setValueCheck(false);
		p.TaxBulkSetPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.TaxBulkSetPanel.add(p.TaxBulkSet_tax_dt_Label);
		p.TaxBulkSetPanel.add(p.TaxBulkSet_tax_dt);
		p.TaxBulkSetPanel.setLastBeans(p.TaxBulkSet_tax_dt);
		p.TaxBulkSet_tax_dt.setNextBeans(p.TaxBulkSet_tax_replace);
		p.TaxBulkSet_tax_dt.setRow(p.getTaxBulkSetR(), mcframe.clientMSBB.MSBBP1370.TaxBulkSetR.tax_dt_META);
		p.TaxBulkSet_tax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.TaxBulkSetPanel.add(p.TaxBulkSet_tax_replace);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_SlsDtlModReg p) {
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
	protected static void jbInitBtn(MSBBP_SlsDtlModReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_prnt_out_flg);
		p.BtnPanel.add(p.Btn_prnt_out_flg);
		p.Btn_prnt_out_flg.setNextBeans(p.Btn_indiv_prnt_flg);
		p.Btn_prnt_out_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1370.BtnR.prnt_out_flg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1370.BtnR.indiv_prnt_flg_META);
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
		MSBBP_SlsDtlModReg_MC.mcInitScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitDispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitSrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTop((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitFold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitIv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitUpri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitAprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitCstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitDlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitBcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitAcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitCnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitCtrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitRPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitBulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitUpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitUpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitXrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitTaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitDtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.mcInitBtn((MSBBP_SlsDtlModReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH_TaxSrch((MSBBP_SlsDtlModReg)this);

		// [SRCH_HDR]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitSRCH__HDR_TaxSrch((MSBBP_SlsDtlModReg)this);

		// [REF_IO]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__IO_TaxSrch((MSBBP_SlsDtlModReg)this);

		// [REF_DTL]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__DTL_TaxSrch((MSBBP_SlsDtlModReg)this);

		// [REF_HDR]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitREF__HDR_TaxSrch((MSBBP_SlsDtlModReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitUPD_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitUPD_TaxSrch((MSBBP_SlsDtlModReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_DispUnit((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_SrchTyp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Top((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Fold((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Tab1((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Tab2((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Tab3((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Tab4((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Tab5((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Tab6((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Iv((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Upri((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_AprvSts((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_CstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_DlvGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_BcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_AcstGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_ItmGrp((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Cnd((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Ctrl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_RPnl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_BulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_BulkSetTab((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_UpriXrate((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_UpriBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_XrateBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_TaxBulkSet((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Dtl((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_Btn((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_UpriSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_XrateSrch((MSBBP_SlsDtlModReg)this);
		MSBBP_SlsDtlModReg_MC.statusInitFIX__U_TaxSrch((MSBBP_SlsDtlModReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [SrchTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchTyp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_SlsDtlModReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Tab6]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab6(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Iv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIv(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Upri]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpri(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [AprvSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvSts(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [CstGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [DlvGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [BcstGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBcstGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [AcstGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAcstGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SlsDtlModReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_disp_unit_Group.addAllListener(p);
		p.Cnd_disp_unit_IO.addAllListener(p);
		p.Cnd_disp_unit_DTL.addAllListener(p);
		p.Cnd_disp_unit_HDR.addAllListener(p);
		p.Cnd_sls.addAllListener(p);
		p.Cnd_sls_ret.addAllListener(p);
		p.Cnd_sls_dscnt.addAllListener(p);
		p.Cnd_iv_tgt_flg.addAllListener(p);
		p.Cnd_iv_not_tgt_flg.addAllListener(p);
		p.Cnd_not_interim_flg.addAllListener(p);
		p.Cnd_interim_flg.addAllListener(p);
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_acpt_flg.addAllListener(p);
		p.Cnd_rjct_flg.addAllListener(p);
		p.Cnd_last_rjct_flg.addAllListener(p);
		p.Cnd_not_aprv_flg.addAllListener(p);
		p.Cnd_sls_dt_fr.setListListener(p);
		p.Cnd_sls_dt_fr.addAllListener(p);
		p.Cnd_sls_dt_to.setListListener(p);
		p.Cnd_sls_dt_to.addAllListener(p);
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
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
		p.Cnd_ship_lg_grp_cd.setListListener(p);
		p.Cnd_ship_lg_grp_cd.addAllListener(p);
		p.Cnd_ship_lg_grp_nm.setListListener(p);
		p.Cnd_ship_lg_grp_nm.addAllListener(p);
		p.Cnd_sls_act_no.setListListener(p);
		p.Cnd_sls_act_no.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_ship_dlv_slip_no.setListListener(p);
		p.Cnd_ship_dlv_slip_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_sls_ret_schd_no.setListListener(p);
		p.Cnd_sls_ret_schd_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_ext_purc_act_d_no.setListListener(p);
		p.Cnd_ext_purc_act_d_no.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_foreign_flg.addAllListener(p);
		p.Cnd_tax_cd.setListListener(p);
		p.Cnd_tax_cd.addAllListener(p);
		p.Cnd_tax_nm.setListListener(p);
		p.Cnd_tax_nm.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_acst_cd.setListListener(p);
		p.Cnd_acst_cd.addAllListener(p);
		p.Cnd_acst_nm.setListListener(p);
		p.Cnd_acst_nm.addAllListener(p);
		p.Cnd_ar_dpt_cd.setListListener(p);
		p.Cnd_ar_dpt_cd.addAllListener(p);
		p.Cnd_ar_dpt_nm.setListListener(p);
		p.Cnd_ar_dpt_nm.addAllListener(p);
		p.Cnd_tdlv_cd.setListListener(p);
		p.Cnd_tdlv_cd.addAllListener(p);
		p.Cnd_tdlv_nm.setListListener(p);
		p.Cnd_tdlv_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
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
		p.Cnd_io_sub_char1.setListListener(p);
		p.Cnd_io_sub_char1.addAllListener(p);
		p.Cnd_io_sub_char2.setListListener(p);
		p.Cnd_io_sub_char2.addAllListener(p);
		p.Cnd_io_sub_char3.setListListener(p);
		p.Cnd_io_sub_char3.addAllListener(p);
		p.Cnd_dis_can_disp_flg.addAllListener(p);
		p.Cnd_sign_rev_flg.addAllListener(p);
		p.Cnd_inc_past_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_SlsDtlModReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_SlsDtlModReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [BulkSetTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSetTab(MSBBP_SlsDtlModReg p) {
		p.BulkSetTabTab.addAllListener(p);
	}

	/**
	 *  [UpriXrate]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpriXrate(MSBBP_SlsDtlModReg p) {
	}

	/**
	 *  [UpriBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpriBulkSet(MSBBP_SlsDtlModReg p) {
		p.UpriBulkSet_upri_dt.setListListener(p);
		p.UpriBulkSet_upri_dt.addAllListener(p);
		p.UpriBulkSet_upri_replace.addAllListener(p);
		p.UpriBulkSet_upri_replace.setAPMethodName("doUpriBulkSet_upri_replace");
		p.UpriBulkSet_select_all.addAllListener(p);
		p.UpriBulkSet_select_all.setAPMethodName("doUpriBulkSet_select_all");
		p.UpriBulkSet_deselect_all.addAllListener(p);
		p.UpriBulkSet_deselect_all.setAPMethodName("doUpriBulkSet_deselect_all");
	}

	/**
	 *  [XrateBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitXrateBulkSet(MSBBP_SlsDtlModReg p) {
		p.XrateBulkSet_xrate_dt.setListListener(p);
		p.XrateBulkSet_xrate_dt.addAllListener(p);
		p.XrateBulkSet_xrate_replace.addAllListener(p);
		p.XrateBulkSet_xrate_replace.setAPMethodName("doXrateBulkSet_xrate_replace");
	}

	/**
	 *  [TaxBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTaxBulkSet(MSBBP_SlsDtlModReg p) {
		p.TaxBulkSet_tax_dt.setListListener(p);
		p.TaxBulkSet_tax_dt.addAllListener(p);
		p.TaxBulkSet_tax_replace.addAllListener(p);
		p.TaxBulkSet_tax_replace.setAPMethodName("doTaxBulkSet_tax_replace");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_SlsDtlModReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_sls_dt.addAllListener(p);
		p.columnDtl_sls_dt.setListListener(p);
		p.columnDtl_ac_ym.addAllListener(p);
		p.columnDtl_ac_ym.setListListener(p);
		p.columnDtl_ac_dt.addAllListener(p);
		p.columnDtl_ac_dt.setListListener(p);
		p.columnDtl_can_ac_dt.addAllListener(p);
		p.columnDtl_can_ac_dt.setListListener(p);
		p.columnDtl_bill_basis_dt.addAllListener(p);
		p.columnDtl_bill_basis_dt.setListListener(p);
		p.columnDtl_rcv_schd_dt.addAllListener(p);
		p.columnDtl_rcv_schd_dt.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_comp_spec_typ.addAllListener(p);
		p.columnDtl_comp_spec_typ.setListListener(p);
		p.columnDtl_comp_spec_typ_nm.addAllListener(p);
		p.columnDtl_comp_spec_typ_nm.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_trd_cur_cd.addAllListener(p);
		p.columnDtl_trd_cur_cd.setListListener(p);
		p.columnDtl_trd_cur_nm.addAllListener(p);
		p.columnDtl_trd_cur_nm.setListListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_prof_rate.addAllListener(p);
		p.columnDtl_prof_rate.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_schd_trd_unit_cd.addAllListener(p);
		p.columnDtl_schd_trd_unit_cd.setListListener(p);
		p.columnDtl_schd_trd_unit_nm.addAllListener(p);
		p.columnDtl_schd_trd_unit_nm.setListListener(p);
		p.columnDtl_sls_upri_req_typ.addAllListener(p);
		p.columnDtl_sls_upri_req_typ.setListListener(p);
		p.columnDtl_sls_upri_req_typ_nm.addAllListener(p);
		p.columnDtl_sls_upri_req_typ_nm.setListListener(p);
		p.columnDtl_slo_dt.addAllListener(p);
		p.columnDtl_slo_dt.setListListener(p);
		p.columnDtl_sls_schd_dt.addAllListener(p);
		p.columnDtl_sls_schd_dt.setListListener(p);
		p.columnDtl_base_cur_cd.addAllListener(p);
		p.columnDtl_base_cur_cd.setListListener(p);
		p.columnDtl_base_cur_nm.addAllListener(p);
		p.columnDtl_base_cur_nm.setListListener(p);
		p.columnDtl_xrate_cd.addAllListener(p);
		p.columnDtl_xrate_cd.setListListener(p);
		p.columnDtl_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_ptax_cur_cd.addAllListener(p);
		p.columnDtl_ptax_cur_cd.setListListener(p);
		p.columnDtl_ptax_cur_nm.addAllListener(p);
		p.columnDtl_ptax_cur_nm.setListListener(p);
		p.columnDtl_ptax_xrate.addAllListener(p);
		p.columnDtl_ptax_xrate.setListListener(p);
		p.columnDtl_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_trd_rmrks.addAllListener(p);
		p.columnDtl_trd_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_dest_cd1.addAllListener(p);
		p.columnDtl_dest_cd1.setListListener(p);
		p.columnDtl_dest_nm1.addAllListener(p);
		p.columnDtl_dest_nm1.setListListener(p);
		p.columnDtl_dest_cd2.addAllListener(p);
		p.columnDtl_dest_cd2.setListListener(p);
		p.columnDtl_dest_nm2.addAllListener(p);
		p.columnDtl_dest_nm2.setListListener(p);
		p.columnDtl_dest_cd3.addAllListener(p);
		p.columnDtl_dest_cd3.setListListener(p);
		p.columnDtl_dest_nm3.addAllListener(p);
		p.columnDtl_dest_nm3.setListListener(p);
		p.columnDtl_tdlv_cd.addAllListener(p);
		p.columnDtl_tdlv_cd.setListListener(p);
		p.columnDtl_tdlv_nm.addAllListener(p);
		p.columnDtl_tdlv_nm.setListListener(p);
		p.columnDtl_ship_lg_grp_cd.addAllListener(p);
		p.columnDtl_ship_lg_grp_cd.setListListener(p);
		p.columnDtl_ship_lg_grp_nm.addAllListener(p);
		p.columnDtl_ship_lg_grp_nm.setListListener(p);
		p.columnDtl_acst_cd.addAllListener(p);
		p.columnDtl_acst_cd.setListListener(p);
		p.columnDtl_acst_nm.addAllListener(p);
		p.columnDtl_acst_nm.setListListener(p);
		p.columnDtl_ar_dpt_cd.addAllListener(p);
		p.columnDtl_ar_dpt_cd.setListListener(p);
		p.columnDtl_ar_dpt_nm.addAllListener(p);
		p.columnDtl_ar_dpt_nm.setListListener(p);
		p.columnDtl_bcst_cd.addAllListener(p);
		p.columnDtl_bcst_cd.setListListener(p);
		p.columnDtl_bcst_nm.addAllListener(p);
		p.columnDtl_bcst_nm.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_ship_dlv_slip_no.addAllListener(p);
		p.columnDtl_ship_dlv_slip_no.setListListener(p);
		p.columnDtl_sls_act_no.addAllListener(p);
		p.columnDtl_sls_act_no.setListListener(p);
		p.columnDtl_sls_act_rev.addAllListener(p);
		p.columnDtl_sls_act_rev.setListListener(p);
		p.columnDtl_sls_act_d_no.addAllListener(p);
		p.columnDtl_sls_act_d_no.setListListener(p);
		p.columnDtl_base_sls_ac_dt.addAllListener(p);
		p.columnDtl_base_sls_ac_dt.setListListener(p);
		p.columnDtl_aprv_flg.addAllListener(p);
		p.columnDtl_aprv_no.addAllListener(p);
		p.columnDtl_aprv_no.setListListener(p);
		p.columnDtl_aprv_sts_typ.addAllListener(p);
		p.columnDtl_aprv_sts_typ.setListListener(p);
		p.columnDtl_aprv_sts_typ_nm.addAllListener(p);
		p.columnDtl_aprv_sts_typ_nm.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_sls_ret_schd_no.addAllListener(p);
		p.columnDtl_sls_ret_schd_no.setListListener(p);
		p.columnDtl_sls_ret_schd_d_no.addAllListener(p);
		p.columnDtl_sls_ret_schd_d_no.setListListener(p);
		p.columnDtl_qtn_no.addAllListener(p);
		p.columnDtl_qtn_no.setListListener(p);
		p.columnDtl_qtn_rev.addAllListener(p);
		p.columnDtl_qtn_rev.setListListener(p);
		p.columnDtl_qtn_d_no.addAllListener(p);
		p.columnDtl_qtn_d_no.setListListener(p);
		p.columnDtl_purc_ddlv_po_no.addAllListener(p);
		p.columnDtl_purc_ddlv_po_no.setListListener(p);
		p.columnDtl_purc_ddlv_po_d_no.addAllListener(p);
		p.columnDtl_purc_ddlv_po_d_no.setListListener(p);
		p.columnDtl_iv_no.addAllListener(p);
		p.columnDtl_iv_no.setListListener(p);
		p.columnDtl_ref_iv_no.addAllListener(p);
		p.columnDtl_ref_iv_no.setListListener(p);
		p.columnDtl_cst_po_no.addAllListener(p);
		p.columnDtl_cst_po_no.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_ship_act_d_no.addAllListener(p);
		p.columnDtl_ship_act_d_no.setListListener(p);
		p.columnDtl_arr_act_no.addAllListener(p);
		p.columnDtl_arr_act_no.setListListener(p);
		p.columnDtl_purc_act_io_no.addAllListener(p);
		p.columnDtl_purc_act_io_no.setListListener(p);
		p.columnDtl_sls_act_io_no.addAllListener(p);
		p.columnDtl_sls_act_io_no.setListListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_lot_no.addAllListener(p);
		p.columnDtl_lot_no.setListListener(p);
		p.columnDtl_sublot_no.addAllListener(p);
		p.columnDtl_sublot_no.setListListener(p);
		p.columnDtl_bill_crryovr_times.addAllListener(p);
		p.columnDtl_bill_crryovr_times.setListListener(p);
		p.columnDtl_biz_rsn_cd.addAllListener(p);
		p.columnDtl_biz_rsn_cd.setListListener(p);
		p.columnDtl_biz_rsn_nm.addAllListener(p);
		p.columnDtl_biz_rsn_nm.setListListener(p);
		p.columnDtl_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bd_dpt_cd.setListListener(p);
		p.columnDtl_bd_dpt_nm.addAllListener(p);
		p.columnDtl_bd_dpt_nm.setListListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_ext_purc_act_d_no.addAllListener(p);
		p.columnDtl_ext_purc_act_d_no.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_dtl_sub_char1.addAllListener(p);
		p.columnDtl_dtl_sub_char1.setListListener(p);
		p.columnDtl_dtl_sub_char2.addAllListener(p);
		p.columnDtl_dtl_sub_char2.setListListener(p);
		p.columnDtl_dtl_sub_char3.addAllListener(p);
		p.columnDtl_dtl_sub_char3.setListListener(p);
		p.columnDtl_io_sub_char1.addAllListener(p);
		p.columnDtl_io_sub_char1.setListListener(p);
		p.columnDtl_io_sub_char2.addAllListener(p);
		p.columnDtl_io_sub_char2.setListListener(p);
		p.columnDtl_io_sub_char3.addAllListener(p);
		p.columnDtl_io_sub_char3.setListListener(p);
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
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_sls_act_seq.addAllListener(p);
		p.columnDtl_sls_act_seq.setListListener(p);
		p.columnDtl_sls_act_d_seq.addAllListener(p);
		p.columnDtl_sls_act_d_seq.setListListener(p);
		p.columnDtl_hdr_upd_cntr.addAllListener(p);
		p.columnDtl_hdr_upd_cntr.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_sls_amt_rnd_typ.addAllListener(p);
		p.columnDtl_sls_amt_rnd_typ.setListListener(p);
		p.columnDtl_sls_tax_rnd_typ.addAllListener(p);
		p.columnDtl_sls_tax_rnd_typ.setListListener(p);
		p.columnDtl_trd_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_trd_cur_amt_dec_place.setListListener(p);
		p.columnDtl_trd_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_trd_cur_upri_dec_place.setListListener(p);
		p.columnDtl_base_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_base_cur_amt_dec_place.setListListener(p);
		p.columnDtl_base_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_base_cur_upri_dec_place.setListListener(p);
		p.columnDtl_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_ptax_cur_amt_dec_place.setListListener(p);
		p.columnDtl_ptax_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_ptax_cur_upri_dec_place.setListListener(p);
		p.columnDtl_xrate_rnd_typ.addAllListener(p);
		p.columnDtl_xrate_rnd_typ.setListListener(p);
		p.columnDtl_wtax_rnd_typ.addAllListener(p);
		p.columnDtl_wtax_rnd_typ.setListListener(p);
		p.columnDtl_sls_acxfr_flg.addAllListener(p);
		p.columnDtl_cst_iv_flg.addAllListener(p);
		p.columnDtl_sls_upri_cng_flg.addAllListener(p);
		p.columnDtl_sls_close_flg.addAllListener(p);
		p.columnDtl_bef_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bef_bd_dpt_cd.setListListener(p);
		p.columnDtl_bill_cl_typ.addAllListener(p);
		p.columnDtl_bill_cl_typ.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_SlsDtlModReg p) {
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_prnt_out_flg.addAllListener(p);
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_opn_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_io_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_io_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_io_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, SRCH, MCMode.DISABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, SRCH, MCMode.DISABLE);
		p.UpriBulkSet_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.UpriBulkSet_deselect_all.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ship_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_prof_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_schd_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_upri_req_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_sls_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_sls_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qtn_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_io_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_io_sub_char1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_CstGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_BcstGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TaxSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_interim_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_opn_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_ship_lg_grp_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_ext_purc_act_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_tax_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_bcst_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_io_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_io_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_io_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_bcst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.UpriBulkSet_select_all.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.UpriBulkSet_deselect_all.putMode(p, SRCH_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, SRCH_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, SRCH_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_ship_tm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_prof_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_schd_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_slo_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_sls_schd_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_nm1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_nm2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_nm3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_tdlv_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_tdlv_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_lg_grp_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_aprv_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_ret_schd_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_qtn_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_po_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_act_io_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bill_crryovr_times.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_biz_rsn_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_biz_rsn_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ext_purc_act_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dtl_sub_char2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dtl_sub_char3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_CstGrp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Dtl_BcstGrp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_TaxSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_opn_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_io_sub_char1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_io_sub_char2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_io_sub_char3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_inc_past_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_IO, MCMode.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, REF_IO, MCMode.DISABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, REF_IO, MCMode.DISABLE);
		p.UpriBulkSet_select_all.putMode(p, REF_IO, MCMode.DISABLE);
		p.UpriBulkSet_deselect_all.putMode(p, REF_IO, MCMode.DISABLE);

	}

	/**
	 * [REF_IO]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, REF_IO, MCMode.DISABLE);

	}

	/**
	 * [REF_IO]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, REF_IO, MCMode.DISABLE);

	}

	/**
	 * [REF_IO]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_ship_tm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_prof_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_schd_trd_unit_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_sls_schd_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_sls_ac_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_aprv_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_qtn_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_io_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sls_act_io_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_io_sub_char1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_io_sub_char2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_io_sub_char3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_CstGrp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_BcstGrp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, REF_IO, MCMode.INVISIBLE);

	}

	/**
	 * [REF_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_IO, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_IO, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_IO, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_IO, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_IO, MCMode.READ_ONLY);

	}

	/**
	 * [REF_IO]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_TaxSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_opn_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_DTL, MCMode.ENABLE);
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
		p.Cnd_ship_lg_grp_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
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
		p.Cnd_io_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_io_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_io_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_inc_past_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, REF_DTL, MCMode.DISABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, REF_DTL, MCMode.DISABLE);
		p.UpriBulkSet_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.UpriBulkSet_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_ship_tm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_prof_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_schd_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_schd_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_upri_req_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_sls_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_sls_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_aprv_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_qtn_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_act_io_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_io_sub_char1.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char2.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char3.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_CstGrp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_BcstGrp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_DTL]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_TaxSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_interim_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_opn_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_HDR, MCMode.ENABLE);
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
		p.Cnd_ship_lg_grp_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ext_purc_act_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_tax_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_bcst_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
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
		p.Cnd_io_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_io_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_io_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_bcst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, REF_HDR, MCMode.DISABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, REF_HDR, MCMode.DISABLE);
		p.UpriBulkSet_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.UpriBulkSet_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_ship_tm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_prof_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_schd_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_slo_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_sls_schd_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_nm1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_nm2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dest_nm3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_tdlv_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_tdlv_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_lg_grp_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_aprv_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_ret_schd_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_qtn_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_po_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_act_io_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bill_crryovr_times.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_biz_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_biz_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ext_purc_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dtl_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dtl_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_CstGrp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Dtl_BcstGrp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_TaxSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_opn_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, UPD, MCMode.ENABLE);
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
		p.Cnd_ship_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, UPD, MCMode.ENABLE);
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
		p.Cnd_io_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_io_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_io_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, UPD, MCMode.ENABLE);
		p.UpriBulkSet_upri_replace.putMode(p, UPD, MCMode.ENABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.UpriBulkSet_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.UpriBulkSet_deselect_all.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.XrateBulkSet_xrate_replace.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.TaxBulkSet_tax_replace.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slip_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_can_ac_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_ship_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_prof_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_schd_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_schd_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_upri_req_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_sls_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_sls_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qtn_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_act_io_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_biz_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_biz_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_io_sub_char1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char3.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_CstGrp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_BcstGrp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TaxSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DispUnit(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SrchTyp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab5(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab6(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Iv(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Upri(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AprvSts(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[CstGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_CstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[BcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[AcstGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AcstGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ItmGrp(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_SlsDtlModReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_ret.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dscnt.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_iv_tgt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_iv_not_tgt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_opn_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_last_rjct_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_not_aprv_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_purc_act_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_io_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_io_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_io_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBBP_SlsDtlModReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSetTab(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriXrate(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriBulkSet(MSBBP_SlsDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, FIX_U, MCMode.DISABLE);
		p.UpriBulkSet_label_interim_flg.putMode(p, FIX_U, MCMode.DISABLE);
		p.UpriBulkSet_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.UpriBulkSet_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_XrateBulkSet(MSBBP_SlsDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TaxBulkSet(MSBBP_SlsDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_SlsDtlModReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ship_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_dlv_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_sls_cost_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_prof_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_prof_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_schd_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_schd_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_for_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_upri_req_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_sls_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_sls_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_ret_schd_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qtn_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qtn_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_act_io_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_biz_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_io_sub_char1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_io_sub_char3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_CstGrp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_DlvGrp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_BcstGrp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_AcstGrp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_close_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bef_bd_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_SlsDtlModReg p){
		p.Btn_open_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_XrateSrch(MSBBP_SlsDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TaxSrch(MSBBP_SlsDtlModReg p){

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
		MSBBP_SlsDtlModReg_MC.setTableConfigDtl((MSBBP_SlsDtlModReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_SlsDtlModReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_slip_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.slip_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_sts_typ_nm);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_sls_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_dt_META);
		p.columnDtl_sls_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_dt);
		p.columnDtl_ac_ym.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ac_ym_META);
		p.columnDtl_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_ym);
		p.columnDtl_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ac_dt_META);
		p.columnDtl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dt);
		p.columnDtl_can_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.can_ac_dt_META);
		p.columnDtl_can_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_can_ac_dt);
		p.columnDtl_bill_basis_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bill_basis_dt_META);
		p.columnDtl_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_basis_dt);
		p.columnDtl_rcv_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.rcv_schd_dt_META);
		p.columnDtl_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_schd_dt);
		p.DtlTable.addTable(p.Dtl_ship_tm_p_PPanel.YmdHmTable);
		p.DtlTable.addTable(p.Dtl_dlv_tm_p_PPanel.YmdHmTable);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.DtlTable.addTable(p.Dtl_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_sls_dpt_nm, p.columnDtl_wg_cd, p.columnDtl_wg_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_comp_spec_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.comp_spec_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_spec_typ);
		p.columnDtl_comp_spec_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.comp_spec_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_spec_typ_nm);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_trd_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_cd);
		p.columnDtl_trd_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_nm);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.DtlTable.addTable(p.Dtl_trd_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_rate, p.columnDtl_tax_typ, p.columnDtl_inc_tax_flg);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_sls_cost_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_sls_cost_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_prof_amt_p_PPanel.AmtTable);
		p.columnDtl_prof_rate.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.prof_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prof_rate);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.DtlTable.addTable(p.Dtl_wtax_amt_p_PPanel.AmtTable);
		p.columnDtl_schd_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.schd_trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_trd_unit_cd);
		p.columnDtl_schd_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.schd_trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_trd_unit_nm);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_for_upri_p_PPanel.QtyTable);
		p.columnDtl_sls_upri_req_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_upri_req_typ_META);
		p.columnDtl_sls_upri_req_typ.addLinkBeans(p.columnDtl_sls_upri_req_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_req_typ);
		p.columnDtl_sls_upri_req_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_upri_req_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_req_typ_nm);
		p.columnDtl_slo_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.slo_dt_META);
		p.columnDtl_slo_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_dt);
		p.DtlTable.addTable(p.Dtl_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.columnDtl_sls_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_schd_dt_META);
		p.columnDtl_sls_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_schd_dt);
		p.columnDtl_base_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_cd);
		p.columnDtl_base_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_nm);
		p.DtlTable.addTable(p.Dtl_xrate_p_PPanel.XrateTable);
		p.columnDtl_xrate_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_cd);
		p.columnDtl_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnDtl_ptax_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ptax_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_cd);
		p.columnDtl_ptax_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ptax_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_nm);
		p.columnDtl_ptax_xrate.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ptax_xrate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_xrate);
		p.columnDtl_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ptax_xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnDtl_trd_rmrks.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.DtlTable.addTable(p.Dtl_dlv_p_PPanel.DlvTable);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dest_cd1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dest_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dest_cd2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dest_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dest_cd3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dest_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm3);
		p.columnDtl_tdlv_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.tdlv_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tdlv_cd);
		p.columnDtl_tdlv_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.tdlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tdlv_nm);
		p.columnDtl_ship_lg_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ship_lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_lg_grp_cd);
		p.columnDtl_ship_lg_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ship_lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_lg_grp_nm);
		p.columnDtl_acst_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.acst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_cd);
		p.columnDtl_acst_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.acst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_nm);
		p.columnDtl_ar_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ar_dpt_cd_META);
		p.columnDtl_ar_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_ar_dpt_cd.addLinkBeans(p.columnDtl_ar_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_cd);
		p.columnDtl_ar_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ar_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_nm);
		p.columnDtl_bcst_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bcst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_cd);
		p.columnDtl_bcst_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bcst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_nm);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_ship_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ship_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_dlv_slip_no);
		p.columnDtl_sls_act_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_no);
		p.columnDtl_sls_act_rev.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_rev);
		p.columnDtl_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_d_no);
		p.columnDtl_base_sls_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_sls_ac_dt_META);
		p.columnDtl_base_sls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_sls_ac_dt);
		p.columnDtl_aprv_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.aprv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_flg);
		p.columnDtl_aprv_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.aprv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_no);
		p.columnDtl_aprv_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.aprv_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_sts_typ);
		p.columnDtl_aprv_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.aprv_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_sts_typ_nm);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_sls_ret_schd_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_ret_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_ret_schd_no);
		p.columnDtl_sls_ret_schd_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_ret_schd_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_ret_schd_d_no);
		p.columnDtl_qtn_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.qtn_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_no);
		p.columnDtl_qtn_rev.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.qtn_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_rev);
		p.columnDtl_qtn_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.qtn_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_d_no);
		p.columnDtl_purc_ddlv_po_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.purc_ddlv_po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_po_no);
		p.columnDtl_purc_ddlv_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.purc_ddlv_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_po_d_no);
		p.columnDtl_iv_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_no);
		p.columnDtl_ref_iv_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ref_iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_iv_no);
		p.columnDtl_cst_po_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_no);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.columnDtl_ship_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ship_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_no);
		p.columnDtl_arr_act_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.arr_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_act_no);
		p.columnDtl_purc_act_io_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.purc_act_io_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_io_no);
		p.columnDtl_sls_act_io_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_act_io_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_io_no);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_lot_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no);
		p.columnDtl_sublot_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no);
		p.columnDtl_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bill_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_crryovr_times);
		p.columnDtl_biz_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.biz_rsn_cd_META);
		p.columnDtl_biz_rsn_cd.addLinkBeans(p.columnDtl_biz_rsn_nm,p.columnDtl_sls_acxfr_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_biz_rsn_cd);
		p.columnDtl_biz_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.biz_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_biz_rsn_nm);
		p.columnDtl_bd_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bd_dpt_cd_META);
		p.columnDtl_bd_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_bd_dpt_cd.addLinkBeans(p.columnDtl_bd_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_cd);
		p.columnDtl_bd_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_nm);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_ext_purc_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ext_purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_purc_act_d_no);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_dtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dtl_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char1);
		p.columnDtl_dtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dtl_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char2);
		p.columnDtl_dtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.dtl_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char3);
		p.columnDtl_io_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.io_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_sub_char1);
		p.columnDtl_io_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.io_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_sub_char2);
		p.columnDtl_io_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.io_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_sub_char3);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.DtlTable.addTable(p.Dtl_CstGrp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_DlvGrp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_BcstGrp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_AcstGrp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_itm_grp_p_PPanel.ItmGrpTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_sls_act_seq.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_act_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_seq);
		p.columnDtl_sls_act_d_seq.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_act_d_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_d_seq);
		p.columnDtl_hdr_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.hdr_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_hdr_upd_cntr);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.columnDtl_sls_amt_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_amt_rnd_typ);
		p.columnDtl_sls_tax_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_tax_rnd_typ);
		p.columnDtl_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_amt_dec_place);
		p.columnDtl_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.trd_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_upri_dec_place);
		p.columnDtl_base_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_amt_dec_place);
		p.columnDtl_base_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.base_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_upri_dec_place);
		p.columnDtl_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ptax_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_amt_dec_place);
		p.columnDtl_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.ptax_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_upri_dec_place);
		p.columnDtl_xrate_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.xrate_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_rnd_typ);
		p.columnDtl_wtax_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.wtax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rnd_typ);
		p.columnDtl_sls_acxfr_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_acxfr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_acxfr_flg);
		p.columnDtl_cst_iv_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.cst_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_iv_flg);
		p.columnDtl_sls_upri_cng_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_cng_flg);
		p.columnDtl_sls_close_flg.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.sls_close_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_close_flg);
		p.columnDtl_bef_bd_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bef_bd_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_bd_dpt_cd);
		p.columnDtl_bill_cl_typ.setMeta(mcframe.clientMSBB.MSBBP1370.DtlR.bill_cl_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_cl_typ);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
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
		Cnd_ship_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_lg_grp_cd.getListConfig().setPutter(getCnd_ship_lg_grp_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_cd.getListConfig().setPutter(getCnd_tax_cd_ListPutter());
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_acst_cd.getListConfig().setPutter(getCnd_acst_cd_ListPutter());
		Cnd_ar_dpt_cd.getListConfig().setPutter(getCnd_ar_dpt_cd_ListPutter());
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cur_cd.getListConfig().setPutter(getDtl_trd_cur_cd_ListPutter());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_ar_dpt_cd.getListConfig().setPutter(getDtl_ar_dpt_cd_ListPutter());
		columnDtl_biz_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_biz_rsn_cd.getListConfig().setPutter(getDtl_biz_rsn_cd_ListPutter());
		columnDtl_bd_dpt_cd.getListConfig().setPutter(getDtl_bd_dpt_cd_ListPutter());
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
	 * この画面を[SRCH_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_HDRStatus() {
		status = SRCH_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_IOStatus() {
		status = REF_IO;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (SRCH_HDR.equals(status)) {
			setSRCH_HDRStatus();
		}
		else if (REF_IO.equals(status)) {
			setREF_IOStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
	 * [Cnd_ship_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
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
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
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
	 * [Cnd_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}
	 
	/**
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_acst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_acst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SloStkGd");
		return lp;
	}
	 
	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}

	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_biz_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_biz_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsAllBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_ship_lg_grp_cd) return getCnd_ship_lg_grp_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_tax_cd) return getCnd_tax_cd(row, info);
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_acst_cd) return getCnd_acst_cd(row, info);
		if(combo == Cnd_ar_dpt_cd) return getCnd_ar_dpt_cd(row, info);
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_trd_cur_cd) return getDtl_trd_cur_cd(row, info);
		if(combo == Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_ar_dpt_cd) return getDtl_ar_dpt_cd(row, info);
		if(combo == columnDtl_biz_rsn_cd) return getDtl_biz_rsn_cd(row, info);
		if(combo == columnDtl_bd_dpt_cd) return getDtl_bd_dpt_cd(row, info);
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
		else if (ap == UpriBulkSet_upri_replace) doUpriBulkSet_upri_replace(info);
		else if (ap == UpriBulkSet_select_all) doUpriBulkSet_select_all(info);
		else if (ap == UpriBulkSet_deselect_all) doUpriBulkSet_deselect_all(info);
		else if (ap == XrateBulkSet_xrate_replace) doXrateBulkSet_xrate_replace(info);
		else if (ap == TaxBulkSet_tax_replace) doTaxBulkSet_tax_replace(info);
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
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
	 * [UpriBulkSet]パネルの[upri_replace]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doUpriBulkSet_upri_replace(MCEventInfo info);

	/**
	 * [UpriBulkSet]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doUpriBulkSet_select_all(MCEventInfo info);

	/**
	 * [UpriBulkSet]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doUpriBulkSet_deselect_all(MCEventInfo info);

	/**
	 * [XrateBulkSet]パネルの[xrate_replace]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doXrateBulkSet_xrate_replace(MCEventInfo info);

	/**
	 * [TaxBulkSet]パネルの[tax_replace]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTaxBulkSet_tax_replace(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == BulkSetTabTab) return doBulkSetTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_disp_unit_Group) return doCnd_disp_unit_VC(info);
		if (vc == Cnd_sls) return doCnd_sls_VC(info);
		if (vc == Cnd_sls_ret) return doCnd_sls_ret_VC(info);
		if (vc == Cnd_sls_dscnt) return doCnd_sls_dscnt_VC(info);
		if (vc == Cnd_iv_tgt_flg) return doCnd_iv_tgt_flg_VC(info);
		if (vc == Cnd_iv_not_tgt_flg) return doCnd_iv_not_tgt_flg_VC(info);
		if (vc == Cnd_not_interim_flg) return doCnd_not_interim_flg_VC(info);
		if (vc == Cnd_interim_flg) return doCnd_interim_flg_VC(info);
		if (vc == Cnd_opn_flg) return doCnd_opn_flg_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_acpt_flg) return doCnd_acpt_flg_VC(info);
		if (vc == Cnd_rjct_flg) return doCnd_rjct_flg_VC(info);
		if (vc == Cnd_last_rjct_flg) return doCnd_last_rjct_flg_VC(info);
		if (vc == Cnd_not_aprv_flg) return doCnd_not_aprv_flg_VC(info);
		if (vc == Cnd_sls_dt_fr) return doCnd_sls_dt_fr_VC(info);
		if (vc == Cnd_sls_dt_to) return doCnd_sls_dt_to_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
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
		if (vc == Cnd_ship_lg_grp_cd) return doCnd_ship_lg_grp_cd_VC(info);
		if (vc == Cnd_ship_lg_grp_nm) return doCnd_ship_lg_grp_nm_VC(info);
		if (vc == Cnd_sls_act_no) return doCnd_sls_act_no_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_ship_dlv_slip_no) return doCnd_ship_dlv_slip_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_sls_ret_schd_no) return doCnd_sls_ret_schd_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_ext_purc_act_d_no) return doCnd_ext_purc_act_d_no_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_foreign_flg) return doCnd_foreign_flg_VC(info);
		if (vc == Cnd_tax_cd) return doCnd_tax_cd_VC(info);
		if (vc == Cnd_tax_nm) return doCnd_tax_nm_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_acst_cd) return doCnd_acst_cd_VC(info);
		if (vc == Cnd_acst_nm) return doCnd_acst_nm_VC(info);
		if (vc == Cnd_ar_dpt_cd) return doCnd_ar_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_nm) return doCnd_ar_dpt_nm_VC(info);
		if (vc == Cnd_tdlv_cd) return doCnd_tdlv_cd_VC(info);
		if (vc == Cnd_tdlv_nm) return doCnd_tdlv_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
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
		if (vc == Cnd_io_sub_char1) return doCnd_io_sub_char1_VC(info);
		if (vc == Cnd_io_sub_char2) return doCnd_io_sub_char2_VC(info);
		if (vc == Cnd_io_sub_char3) return doCnd_io_sub_char3_VC(info);
		if (vc == Cnd_dis_can_disp_flg) return doCnd_dis_can_disp_flg_VC(info);
		if (vc == Cnd_sign_rev_flg) return doCnd_sign_rev_flg_VC(info);
		if (vc == Cnd_inc_past_flg) return doCnd_inc_past_flg_VC(info);
		if (vc == UpriBulkSet_upri_dt) return doUpriBulkSet_upri_dt_VC(info);
		if (vc == XrateBulkSet_xrate_dt) return doXrateBulkSet_xrate_dt_VC(info);
		if (vc == TaxBulkSet_tax_dt) return doTaxBulkSet_tax_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_slip_sts_typ_nm) return doDtl_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_sls_dt) return doDtl_sls_dt_VC(info);
		if (vc == columnDtl_ac_ym) return doDtl_ac_ym_VC(info);
		if (vc == columnDtl_ac_dt) return doDtl_ac_dt_VC(info);
		if (vc == columnDtl_can_ac_dt) return doDtl_can_ac_dt_VC(info);
		if (vc == columnDtl_bill_basis_dt) return doDtl_bill_basis_dt_VC(info);
		if (vc == columnDtl_rcv_schd_dt) return doDtl_rcv_schd_dt_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_comp_spec_typ) return doDtl_comp_spec_typ_VC(info);
		if (vc == columnDtl_comp_spec_typ_nm) return doDtl_comp_spec_typ_nm_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_trd_cur_cd) return doDtl_trd_cur_cd_VC(info);
		if (vc == columnDtl_trd_cur_nm) return doDtl_trd_cur_nm_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_prof_rate) return doDtl_prof_rate_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_schd_trd_unit_cd) return doDtl_schd_trd_unit_cd_VC(info);
		if (vc == columnDtl_schd_trd_unit_nm) return doDtl_schd_trd_unit_nm_VC(info);
		if (vc == columnDtl_sls_upri_req_typ) return doDtl_sls_upri_req_typ_VC(info);
		if (vc == columnDtl_sls_upri_req_typ_nm) return doDtl_sls_upri_req_typ_nm_VC(info);
		if (vc == columnDtl_slo_dt) return doDtl_slo_dt_VC(info);
		if (vc == columnDtl_sls_schd_dt) return doDtl_sls_schd_dt_VC(info);
		if (vc == columnDtl_base_cur_cd) return doDtl_base_cur_cd_VC(info);
		if (vc == columnDtl_base_cur_nm) return doDtl_base_cur_nm_VC(info);
		if (vc == columnDtl_xrate_cd) return doDtl_xrate_cd_VC(info);
		if (vc == columnDtl_xrate_inpt_flg) return doDtl_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_ptax_cur_cd) return doDtl_ptax_cur_cd_VC(info);
		if (vc == columnDtl_ptax_cur_nm) return doDtl_ptax_cur_nm_VC(info);
		if (vc == columnDtl_ptax_xrate) return doDtl_ptax_xrate_VC(info);
		if (vc == columnDtl_ptax_xrate_inpt_flg) return doDtl_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_trd_rmrks) return doDtl_trd_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_dest_cd1) return doDtl_dest_cd1_VC(info);
		if (vc == columnDtl_dest_nm1) return doDtl_dest_nm1_VC(info);
		if (vc == columnDtl_dest_cd2) return doDtl_dest_cd2_VC(info);
		if (vc == columnDtl_dest_nm2) return doDtl_dest_nm2_VC(info);
		if (vc == columnDtl_dest_cd3) return doDtl_dest_cd3_VC(info);
		if (vc == columnDtl_dest_nm3) return doDtl_dest_nm3_VC(info);
		if (vc == columnDtl_tdlv_cd) return doDtl_tdlv_cd_VC(info);
		if (vc == columnDtl_tdlv_nm) return doDtl_tdlv_nm_VC(info);
		if (vc == columnDtl_ship_lg_grp_cd) return doDtl_ship_lg_grp_cd_VC(info);
		if (vc == columnDtl_ship_lg_grp_nm) return doDtl_ship_lg_grp_nm_VC(info);
		if (vc == columnDtl_acst_cd) return doDtl_acst_cd_VC(info);
		if (vc == columnDtl_acst_nm) return doDtl_acst_nm_VC(info);
		if (vc == columnDtl_ar_dpt_cd) return doDtl_ar_dpt_cd_VC(info);
		if (vc == columnDtl_ar_dpt_nm) return doDtl_ar_dpt_nm_VC(info);
		if (vc == columnDtl_bcst_cd) return doDtl_bcst_cd_VC(info);
		if (vc == columnDtl_bcst_nm) return doDtl_bcst_nm_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_ship_dlv_slip_no) return doDtl_ship_dlv_slip_no_VC(info);
		if (vc == columnDtl_sls_act_no) return doDtl_sls_act_no_VC(info);
		if (vc == columnDtl_sls_act_rev) return doDtl_sls_act_rev_VC(info);
		if (vc == columnDtl_sls_act_d_no) return doDtl_sls_act_d_no_VC(info);
		if (vc == columnDtl_base_sls_ac_dt) return doDtl_base_sls_ac_dt_VC(info);
		if (vc == columnDtl_aprv_flg) return doDtl_aprv_flg_VC(info);
		if (vc == columnDtl_aprv_no) return doDtl_aprv_no_VC(info);
		if (vc == columnDtl_aprv_sts_typ) return doDtl_aprv_sts_typ_VC(info);
		if (vc == columnDtl_aprv_sts_typ_nm) return doDtl_aprv_sts_typ_nm_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_sls_ret_schd_no) return doDtl_sls_ret_schd_no_VC(info);
		if (vc == columnDtl_sls_ret_schd_d_no) return doDtl_sls_ret_schd_d_no_VC(info);
		if (vc == columnDtl_qtn_no) return doDtl_qtn_no_VC(info);
		if (vc == columnDtl_qtn_rev) return doDtl_qtn_rev_VC(info);
		if (vc == columnDtl_qtn_d_no) return doDtl_qtn_d_no_VC(info);
		if (vc == columnDtl_purc_ddlv_po_no) return doDtl_purc_ddlv_po_no_VC(info);
		if (vc == columnDtl_purc_ddlv_po_d_no) return doDtl_purc_ddlv_po_d_no_VC(info);
		if (vc == columnDtl_iv_no) return doDtl_iv_no_VC(info);
		if (vc == columnDtl_ref_iv_no) return doDtl_ref_iv_no_VC(info);
		if (vc == columnDtl_cst_po_no) return doDtl_cst_po_no_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_ship_act_d_no) return doDtl_ship_act_d_no_VC(info);
		if (vc == columnDtl_arr_act_no) return doDtl_arr_act_no_VC(info);
		if (vc == columnDtl_purc_act_io_no) return doDtl_purc_act_io_no_VC(info);
		if (vc == columnDtl_sls_act_io_no) return doDtl_sls_act_io_no_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_lot_no) return doDtl_lot_no_VC(info);
		if (vc == columnDtl_sublot_no) return doDtl_sublot_no_VC(info);
		if (vc == columnDtl_bill_crryovr_times) return doDtl_bill_crryovr_times_VC(info);
		if (vc == columnDtl_biz_rsn_cd) return doDtl_biz_rsn_cd_VC(info);
		if (vc == columnDtl_biz_rsn_nm) return doDtl_biz_rsn_nm_VC(info);
		if (vc == columnDtl_bd_dpt_cd) return doDtl_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bd_dpt_nm) return doDtl_bd_dpt_nm_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_ext_purc_act_d_no) return doDtl_ext_purc_act_d_no_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_dtl_sub_char1) return doDtl_dtl_sub_char1_VC(info);
		if (vc == columnDtl_dtl_sub_char2) return doDtl_dtl_sub_char2_VC(info);
		if (vc == columnDtl_dtl_sub_char3) return doDtl_dtl_sub_char3_VC(info);
		if (vc == columnDtl_io_sub_char1) return doDtl_io_sub_char1_VC(info);
		if (vc == columnDtl_io_sub_char2) return doDtl_io_sub_char2_VC(info);
		if (vc == columnDtl_io_sub_char3) return doDtl_io_sub_char3_VC(info);
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
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_sls_act_seq) return doDtl_sls_act_seq_VC(info);
		if (vc == columnDtl_sls_act_d_seq) return doDtl_sls_act_d_seq_VC(info);
		if (vc == columnDtl_hdr_upd_cntr) return doDtl_hdr_upd_cntr_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_sls_amt_rnd_typ) return doDtl_sls_amt_rnd_typ_VC(info);
		if (vc == columnDtl_sls_tax_rnd_typ) return doDtl_sls_tax_rnd_typ_VC(info);
		if (vc == columnDtl_trd_cur_amt_dec_place) return doDtl_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_trd_cur_upri_dec_place) return doDtl_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_base_cur_amt_dec_place) return doDtl_base_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_base_cur_upri_dec_place) return doDtl_base_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_ptax_cur_amt_dec_place) return doDtl_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_ptax_cur_upri_dec_place) return doDtl_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_xrate_rnd_typ) return doDtl_xrate_rnd_typ_VC(info);
		if (vc == columnDtl_wtax_rnd_typ) return doDtl_wtax_rnd_typ_VC(info);
		if (vc == columnDtl_sls_acxfr_flg) return doDtl_sls_acxfr_flg_VC(info);
		if (vc == columnDtl_cst_iv_flg) return doDtl_cst_iv_flg_VC(info);
		if (vc == columnDtl_sls_upri_cng_flg) return doDtl_sls_upri_cng_flg_VC(info);
		if (vc == columnDtl_sls_close_flg) return doDtl_sls_close_flg_VC(info);
		if (vc == columnDtl_bef_bd_dpt_cd) return doDtl_bef_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bill_cl_typ) return doDtl_bill_cl_typ_VC(info);
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
	 * [BulkSetTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSetTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ret]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dscnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dscnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_not_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_not_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_last_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_aprv_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_foreign_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[io_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dis_can_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sign_rev_flg_VC(MCEventInfo info){
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
	 * [UpriBulkSet]パネルの[upri_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUpriBulkSet_upri_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [XrateBulkSet]パネルの[xrate_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doXrateBulkSet_xrate_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TaxBulkSet]パネルの[tax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTaxBulkSet_tax_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_can_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_spec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_spec_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prof_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prof_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_sls_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_ret_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_ret_schd_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[biz_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_biz_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[biz_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_biz_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[hdr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_hdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_acxfr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_close_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_close_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_cl_typ_VC(MCEventInfo info){
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
		else if (nc == BulkSetTabTab) doBulkSetTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_disp_unit_Group) doCnd_disp_unit_NC(info);
		else if (nc == Cnd_sls) doCnd_sls_NC(info);
		else if (nc == Cnd_sls_ret) doCnd_sls_ret_NC(info);
		else if (nc == Cnd_sls_dscnt) doCnd_sls_dscnt_NC(info);
		else if (nc == Cnd_iv_tgt_flg) doCnd_iv_tgt_flg_NC(info);
		else if (nc == Cnd_iv_not_tgt_flg) doCnd_iv_not_tgt_flg_NC(info);
		else if (nc == Cnd_not_interim_flg) doCnd_not_interim_flg_NC(info);
		else if (nc == Cnd_interim_flg) doCnd_interim_flg_NC(info);
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_acpt_flg) doCnd_acpt_flg_NC(info);
		else if (nc == Cnd_rjct_flg) doCnd_rjct_flg_NC(info);
		else if (nc == Cnd_last_rjct_flg) doCnd_last_rjct_flg_NC(info);
		else if (nc == Cnd_not_aprv_flg) doCnd_not_aprv_flg_NC(info);
		else if (nc == Cnd_sls_dt_fr) doCnd_sls_dt_fr_NC(info);
		else if (nc == Cnd_sls_dt_to) doCnd_sls_dt_to_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
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
		else if (nc == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NC(info);
		else if (nc == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NC(info);
		else if (nc == Cnd_sls_act_no) doCnd_sls_act_no_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_foreign_flg) doCnd_foreign_flg_NC(info);
		else if (nc == Cnd_tax_cd) doCnd_tax_cd_NC(info);
		else if (nc == Cnd_tax_nm) doCnd_tax_nm_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_acst_cd) doCnd_acst_cd_NC(info);
		else if (nc == Cnd_acst_nm) doCnd_acst_nm_NC(info);
		else if (nc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NC(info);
		else if (nc == Cnd_tdlv_cd) doCnd_tdlv_cd_NC(info);
		else if (nc == Cnd_tdlv_nm) doCnd_tdlv_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
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
		else if (nc == Cnd_io_sub_char1) doCnd_io_sub_char1_NC(info);
		else if (nc == Cnd_io_sub_char2) doCnd_io_sub_char2_NC(info);
		else if (nc == Cnd_io_sub_char3) doCnd_io_sub_char3_NC(info);
		else if (nc == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NC(info);
		else if (nc == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NC(info);
		else if (nc == Cnd_inc_past_flg) doCnd_inc_past_flg_NC(info);
		else if (nc == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_NC(info);
		else if (nc == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_NC(info);
		else if (nc == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_sls_dt) doDtl_sls_dt_NC(info);
		else if (nc == columnDtl_ac_ym) doDtl_ac_ym_NC(info);
		else if (nc == columnDtl_ac_dt) doDtl_ac_dt_NC(info);
		else if (nc == columnDtl_can_ac_dt) doDtl_can_ac_dt_NC(info);
		else if (nc == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_NC(info);
		else if (nc == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NC(info);
		else if (nc == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NC(info);
		else if (nc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_prof_rate) doDtl_prof_rate_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_schd_trd_unit_cd) doDtl_schd_trd_unit_cd_NC(info);
		else if (nc == columnDtl_schd_trd_unit_nm) doDtl_schd_trd_unit_nm_NC(info);
		else if (nc == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_NC(info);
		else if (nc == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl_slo_dt) doDtl_slo_dt_NC(info);
		else if (nc == columnDtl_sls_schd_dt) doDtl_sls_schd_dt_NC(info);
		else if (nc == columnDtl_base_cur_cd) doDtl_base_cur_cd_NC(info);
		else if (nc == columnDtl_base_cur_nm) doDtl_base_cur_nm_NC(info);
		else if (nc == columnDtl_xrate_cd) doDtl_xrate_cd_NC(info);
		else if (nc == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NC(info);
		else if (nc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NC(info);
		else if (nc == columnDtl_ptax_xrate) doDtl_ptax_xrate_NC(info);
		else if (nc == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_trd_rmrks) doDtl_trd_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_dest_cd1) doDtl_dest_cd1_NC(info);
		else if (nc == columnDtl_dest_nm1) doDtl_dest_nm1_NC(info);
		else if (nc == columnDtl_dest_cd2) doDtl_dest_cd2_NC(info);
		else if (nc == columnDtl_dest_nm2) doDtl_dest_nm2_NC(info);
		else if (nc == columnDtl_dest_cd3) doDtl_dest_cd3_NC(info);
		else if (nc == columnDtl_dest_nm3) doDtl_dest_nm3_NC(info);
		else if (nc == columnDtl_tdlv_cd) doDtl_tdlv_cd_NC(info);
		else if (nc == columnDtl_tdlv_nm) doDtl_tdlv_nm_NC(info);
		else if (nc == columnDtl_ship_lg_grp_cd) doDtl_ship_lg_grp_cd_NC(info);
		else if (nc == columnDtl_ship_lg_grp_nm) doDtl_ship_lg_grp_nm_NC(info);
		else if (nc == columnDtl_acst_cd) doDtl_acst_cd_NC(info);
		else if (nc == columnDtl_acst_nm) doDtl_acst_nm_NC(info);
		else if (nc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NC(info);
		else if (nc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NC(info);
		else if (nc == columnDtl_bcst_cd) doDtl_bcst_cd_NC(info);
		else if (nc == columnDtl_bcst_nm) doDtl_bcst_nm_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_NC(info);
		else if (nc == columnDtl_sls_act_no) doDtl_sls_act_no_NC(info);
		else if (nc == columnDtl_sls_act_rev) doDtl_sls_act_rev_NC(info);
		else if (nc == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NC(info);
		else if (nc == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_NC(info);
		else if (nc == columnDtl_aprv_flg) doDtl_aprv_flg_NC(info);
		else if (nc == columnDtl_aprv_no) doDtl_aprv_no_NC(info);
		else if (nc == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NC(info);
		else if (nc == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_sls_ret_schd_no) doDtl_sls_ret_schd_no_NC(info);
		else if (nc == columnDtl_sls_ret_schd_d_no) doDtl_sls_ret_schd_d_no_NC(info);
		else if (nc == columnDtl_qtn_no) doDtl_qtn_no_NC(info);
		else if (nc == columnDtl_qtn_rev) doDtl_qtn_rev_NC(info);
		else if (nc == columnDtl_qtn_d_no) doDtl_qtn_d_no_NC(info);
		else if (nc == columnDtl_purc_ddlv_po_no) doDtl_purc_ddlv_po_no_NC(info);
		else if (nc == columnDtl_purc_ddlv_po_d_no) doDtl_purc_ddlv_po_d_no_NC(info);
		else if (nc == columnDtl_iv_no) doDtl_iv_no_NC(info);
		else if (nc == columnDtl_ref_iv_no) doDtl_ref_iv_no_NC(info);
		else if (nc == columnDtl_cst_po_no) doDtl_cst_po_no_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NC(info);
		else if (nc == columnDtl_arr_act_no) doDtl_arr_act_no_NC(info);
		else if (nc == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_NC(info);
		else if (nc == columnDtl_sls_act_io_no) doDtl_sls_act_io_no_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_lot_no) doDtl_lot_no_NC(info);
		else if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		else if (nc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NC(info);
		else if (nc == columnDtl_biz_rsn_cd) doDtl_biz_rsn_cd_NC(info);
		else if (nc == columnDtl_biz_rsn_nm) doDtl_biz_rsn_nm_NC(info);
		else if (nc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NC(info);
		else if (nc == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NC(info);
		else if (nc == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NC(info);
		else if (nc == columnDtl_io_sub_char1) doDtl_io_sub_char1_NC(info);
		else if (nc == columnDtl_io_sub_char2) doDtl_io_sub_char2_NC(info);
		else if (nc == columnDtl_io_sub_char3) doDtl_io_sub_char3_NC(info);
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
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_sls_act_seq) doDtl_sls_act_seq_NC(info);
		else if (nc == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_NC(info);
		else if (nc == columnDtl_hdr_upd_cntr) doDtl_hdr_upd_cntr_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_sls_amt_rnd_typ) doDtl_sls_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_sls_tax_rnd_typ) doDtl_sls_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NC(info);
		else if (nc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NC(info);
		else if (nc == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NC(info);
		else if (nc == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NC(info);
		else if (nc == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NC(info);
		else if (nc == columnDtl_sls_close_flg) doDtl_sls_close_flg_NC(info);
		else if (nc == columnDtl_bef_bd_dpt_cd) doDtl_bef_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bill_cl_typ) doDtl_bill_cl_typ_NC(info);
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
	 * [BulkSetTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSetTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dscnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dscnt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_aprv_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[io_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dis_can_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NC(MCEventInfo info){
	}

	/**
	 * [UpriBulkSet]パネルの[upri_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriBulkSet_upri_dt_NC(MCEventInfo info){
	}

	/**
	 * [XrateBulkSet]パネルの[xrate_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateBulkSet_xrate_dt_NC(MCEventInfo info){
	}

	/**
	 * [TaxBulkSet]パネルの[tax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxBulkSet_tax_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_close_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_close_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_typ_NC(MCEventInfo info){
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
		else if (ne == BulkSetTabTab) doBulkSetTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_disp_unit_Group) doCnd_disp_unit_NE(info);
		else if (ne == Cnd_sls) doCnd_sls_NE(info);
		else if (ne == Cnd_sls_ret) doCnd_sls_ret_NE(info);
		else if (ne == Cnd_sls_dscnt) doCnd_sls_dscnt_NE(info);
		else if (ne == Cnd_iv_tgt_flg) doCnd_iv_tgt_flg_NE(info);
		else if (ne == Cnd_iv_not_tgt_flg) doCnd_iv_not_tgt_flg_NE(info);
		else if (ne == Cnd_not_interim_flg) doCnd_not_interim_flg_NE(info);
		else if (ne == Cnd_interim_flg) doCnd_interim_flg_NE(info);
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_acpt_flg) doCnd_acpt_flg_NE(info);
		else if (ne == Cnd_rjct_flg) doCnd_rjct_flg_NE(info);
		else if (ne == Cnd_last_rjct_flg) doCnd_last_rjct_flg_NE(info);
		else if (ne == Cnd_not_aprv_flg) doCnd_not_aprv_flg_NE(info);
		else if (ne == Cnd_sls_dt_fr) doCnd_sls_dt_fr_NE(info);
		else if (ne == Cnd_sls_dt_to) doCnd_sls_dt_to_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
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
		else if (ne == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NE(info);
		else if (ne == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NE(info);
		else if (ne == Cnd_sls_act_no) doCnd_sls_act_no_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_foreign_flg) doCnd_foreign_flg_NE(info);
		else if (ne == Cnd_tax_cd) doCnd_tax_cd_NE(info);
		else if (ne == Cnd_tax_nm) doCnd_tax_nm_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_acst_cd) doCnd_acst_cd_NE(info);
		else if (ne == Cnd_acst_nm) doCnd_acst_nm_NE(info);
		else if (ne == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NE(info);
		else if (ne == Cnd_tdlv_cd) doCnd_tdlv_cd_NE(info);
		else if (ne == Cnd_tdlv_nm) doCnd_tdlv_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
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
		else if (ne == Cnd_io_sub_char1) doCnd_io_sub_char1_NE(info);
		else if (ne == Cnd_io_sub_char2) doCnd_io_sub_char2_NE(info);
		else if (ne == Cnd_io_sub_char3) doCnd_io_sub_char3_NE(info);
		else if (ne == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NE(info);
		else if (ne == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NE(info);
		else if (ne == Cnd_inc_past_flg) doCnd_inc_past_flg_NE(info);
		else if (ne == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_NE(info);
		else if (ne == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_NE(info);
		else if (ne == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_sls_dt) doDtl_sls_dt_NE(info);
		else if (ne == columnDtl_ac_ym) doDtl_ac_ym_NE(info);
		else if (ne == columnDtl_ac_dt) doDtl_ac_dt_NE(info);
		else if (ne == columnDtl_can_ac_dt) doDtl_can_ac_dt_NE(info);
		else if (ne == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_NE(info);
		else if (ne == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NE(info);
		else if (ne == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NE(info);
		else if (ne == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_prof_rate) doDtl_prof_rate_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_schd_trd_unit_cd) doDtl_schd_trd_unit_cd_NE(info);
		else if (ne == columnDtl_schd_trd_unit_nm) doDtl_schd_trd_unit_nm_NE(info);
		else if (ne == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_NE(info);
		else if (ne == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl_slo_dt) doDtl_slo_dt_NE(info);
		else if (ne == columnDtl_sls_schd_dt) doDtl_sls_schd_dt_NE(info);
		else if (ne == columnDtl_base_cur_cd) doDtl_base_cur_cd_NE(info);
		else if (ne == columnDtl_base_cur_nm) doDtl_base_cur_nm_NE(info);
		else if (ne == columnDtl_xrate_cd) doDtl_xrate_cd_NE(info);
		else if (ne == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NE(info);
		else if (ne == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NE(info);
		else if (ne == columnDtl_ptax_xrate) doDtl_ptax_xrate_NE(info);
		else if (ne == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_trd_rmrks) doDtl_trd_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_dest_cd1) doDtl_dest_cd1_NE(info);
		else if (ne == columnDtl_dest_nm1) doDtl_dest_nm1_NE(info);
		else if (ne == columnDtl_dest_cd2) doDtl_dest_cd2_NE(info);
		else if (ne == columnDtl_dest_nm2) doDtl_dest_nm2_NE(info);
		else if (ne == columnDtl_dest_cd3) doDtl_dest_cd3_NE(info);
		else if (ne == columnDtl_dest_nm3) doDtl_dest_nm3_NE(info);
		else if (ne == columnDtl_tdlv_cd) doDtl_tdlv_cd_NE(info);
		else if (ne == columnDtl_tdlv_nm) doDtl_tdlv_nm_NE(info);
		else if (ne == columnDtl_ship_lg_grp_cd) doDtl_ship_lg_grp_cd_NE(info);
		else if (ne == columnDtl_ship_lg_grp_nm) doDtl_ship_lg_grp_nm_NE(info);
		else if (ne == columnDtl_acst_cd) doDtl_acst_cd_NE(info);
		else if (ne == columnDtl_acst_nm) doDtl_acst_nm_NE(info);
		else if (ne == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NE(info);
		else if (ne == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NE(info);
		else if (ne == columnDtl_bcst_cd) doDtl_bcst_cd_NE(info);
		else if (ne == columnDtl_bcst_nm) doDtl_bcst_nm_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_NE(info);
		else if (ne == columnDtl_sls_act_no) doDtl_sls_act_no_NE(info);
		else if (ne == columnDtl_sls_act_rev) doDtl_sls_act_rev_NE(info);
		else if (ne == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NE(info);
		else if (ne == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_NE(info);
		else if (ne == columnDtl_aprv_flg) doDtl_aprv_flg_NE(info);
		else if (ne == columnDtl_aprv_no) doDtl_aprv_no_NE(info);
		else if (ne == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NE(info);
		else if (ne == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_sls_ret_schd_no) doDtl_sls_ret_schd_no_NE(info);
		else if (ne == columnDtl_sls_ret_schd_d_no) doDtl_sls_ret_schd_d_no_NE(info);
		else if (ne == columnDtl_qtn_no) doDtl_qtn_no_NE(info);
		else if (ne == columnDtl_qtn_rev) doDtl_qtn_rev_NE(info);
		else if (ne == columnDtl_qtn_d_no) doDtl_qtn_d_no_NE(info);
		else if (ne == columnDtl_purc_ddlv_po_no) doDtl_purc_ddlv_po_no_NE(info);
		else if (ne == columnDtl_purc_ddlv_po_d_no) doDtl_purc_ddlv_po_d_no_NE(info);
		else if (ne == columnDtl_iv_no) doDtl_iv_no_NE(info);
		else if (ne == columnDtl_ref_iv_no) doDtl_ref_iv_no_NE(info);
		else if (ne == columnDtl_cst_po_no) doDtl_cst_po_no_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NE(info);
		else if (ne == columnDtl_arr_act_no) doDtl_arr_act_no_NE(info);
		else if (ne == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_NE(info);
		else if (ne == columnDtl_sls_act_io_no) doDtl_sls_act_io_no_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_lot_no) doDtl_lot_no_NE(info);
		else if (ne == columnDtl_sublot_no) doDtl_sublot_no_NE(info);
		else if (ne == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NE(info);
		else if (ne == columnDtl_biz_rsn_cd) doDtl_biz_rsn_cd_NE(info);
		else if (ne == columnDtl_biz_rsn_nm) doDtl_biz_rsn_nm_NE(info);
		else if (ne == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NE(info);
		else if (ne == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NE(info);
		else if (ne == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NE(info);
		else if (ne == columnDtl_io_sub_char1) doDtl_io_sub_char1_NE(info);
		else if (ne == columnDtl_io_sub_char2) doDtl_io_sub_char2_NE(info);
		else if (ne == columnDtl_io_sub_char3) doDtl_io_sub_char3_NE(info);
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
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_sls_act_seq) doDtl_sls_act_seq_NE(info);
		else if (ne == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_NE(info);
		else if (ne == columnDtl_hdr_upd_cntr) doDtl_hdr_upd_cntr_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_sls_amt_rnd_typ) doDtl_sls_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_sls_tax_rnd_typ) doDtl_sls_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NE(info);
		else if (ne == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NE(info);
		else if (ne == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NE(info);
		else if (ne == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NE(info);
		else if (ne == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NE(info);
		else if (ne == columnDtl_sls_close_flg) doDtl_sls_close_flg_NE(info);
		else if (ne == columnDtl_bef_bd_dpt_cd) doDtl_bef_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bill_cl_typ) doDtl_bill_cl_typ_NE(info);
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
	 * [BulkSetTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSetTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dscnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dscnt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_aprv_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[io_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dis_can_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NE(MCEventInfo info){
	}

	/**
	 * [UpriBulkSet]パネルの[upri_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriBulkSet_upri_dt_NE(MCEventInfo info){
	}

	/**
	 * [XrateBulkSet]パネルの[xrate_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateBulkSet_xrate_dt_NE(MCEventInfo info){
	}

	/**
	 * [TaxBulkSet]パネルの[tax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxBulkSet_tax_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_close_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_close_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_typ_NE(MCEventInfo info){
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
		else if (nx == BulkSetTabTab) doBulkSetTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_disp_unit_Group) doCnd_disp_unit_NX(info);
		else if (nx == Cnd_sls) doCnd_sls_NX(info);
		else if (nx == Cnd_sls_ret) doCnd_sls_ret_NX(info);
		else if (nx == Cnd_sls_dscnt) doCnd_sls_dscnt_NX(info);
		else if (nx == Cnd_iv_tgt_flg) doCnd_iv_tgt_flg_NX(info);
		else if (nx == Cnd_iv_not_tgt_flg) doCnd_iv_not_tgt_flg_NX(info);
		else if (nx == Cnd_not_interim_flg) doCnd_not_interim_flg_NX(info);
		else if (nx == Cnd_interim_flg) doCnd_interim_flg_NX(info);
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_acpt_flg) doCnd_acpt_flg_NX(info);
		else if (nx == Cnd_rjct_flg) doCnd_rjct_flg_NX(info);
		else if (nx == Cnd_last_rjct_flg) doCnd_last_rjct_flg_NX(info);
		else if (nx == Cnd_not_aprv_flg) doCnd_not_aprv_flg_NX(info);
		else if (nx == Cnd_sls_dt_fr) doCnd_sls_dt_fr_NX(info);
		else if (nx == Cnd_sls_dt_to) doCnd_sls_dt_to_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
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
		else if (nx == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_NX(info);
		else if (nx == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_NX(info);
		else if (nx == Cnd_sls_act_no) doCnd_sls_act_no_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_foreign_flg) doCnd_foreign_flg_NX(info);
		else if (nx == Cnd_tax_cd) doCnd_tax_cd_NX(info);
		else if (nx == Cnd_tax_nm) doCnd_tax_nm_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_acst_cd) doCnd_acst_cd_NX(info);
		else if (nx == Cnd_acst_nm) doCnd_acst_nm_NX(info);
		else if (nx == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NX(info);
		else if (nx == Cnd_tdlv_cd) doCnd_tdlv_cd_NX(info);
		else if (nx == Cnd_tdlv_nm) doCnd_tdlv_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
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
		else if (nx == Cnd_io_sub_char1) doCnd_io_sub_char1_NX(info);
		else if (nx == Cnd_io_sub_char2) doCnd_io_sub_char2_NX(info);
		else if (nx == Cnd_io_sub_char3) doCnd_io_sub_char3_NX(info);
		else if (nx == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NX(info);
		else if (nx == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NX(info);
		else if (nx == Cnd_inc_past_flg) doCnd_inc_past_flg_NX(info);
		else if (nx == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_NX(info);
		else if (nx == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_NX(info);
		else if (nx == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_sls_dt) doDtl_sls_dt_NX(info);
		else if (nx == columnDtl_ac_ym) doDtl_ac_ym_NX(info);
		else if (nx == columnDtl_ac_dt) doDtl_ac_dt_NX(info);
		else if (nx == columnDtl_can_ac_dt) doDtl_can_ac_dt_NX(info);
		else if (nx == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_NX(info);
		else if (nx == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NX(info);
		else if (nx == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NX(info);
		else if (nx == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_prof_rate) doDtl_prof_rate_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_schd_trd_unit_cd) doDtl_schd_trd_unit_cd_NX(info);
		else if (nx == columnDtl_schd_trd_unit_nm) doDtl_schd_trd_unit_nm_NX(info);
		else if (nx == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_NX(info);
		else if (nx == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl_slo_dt) doDtl_slo_dt_NX(info);
		else if (nx == columnDtl_sls_schd_dt) doDtl_sls_schd_dt_NX(info);
		else if (nx == columnDtl_base_cur_cd) doDtl_base_cur_cd_NX(info);
		else if (nx == columnDtl_base_cur_nm) doDtl_base_cur_nm_NX(info);
		else if (nx == columnDtl_xrate_cd) doDtl_xrate_cd_NX(info);
		else if (nx == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NX(info);
		else if (nx == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NX(info);
		else if (nx == columnDtl_ptax_xrate) doDtl_ptax_xrate_NX(info);
		else if (nx == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_trd_rmrks) doDtl_trd_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_dest_cd1) doDtl_dest_cd1_NX(info);
		else if (nx == columnDtl_dest_nm1) doDtl_dest_nm1_NX(info);
		else if (nx == columnDtl_dest_cd2) doDtl_dest_cd2_NX(info);
		else if (nx == columnDtl_dest_nm2) doDtl_dest_nm2_NX(info);
		else if (nx == columnDtl_dest_cd3) doDtl_dest_cd3_NX(info);
		else if (nx == columnDtl_dest_nm3) doDtl_dest_nm3_NX(info);
		else if (nx == columnDtl_tdlv_cd) doDtl_tdlv_cd_NX(info);
		else if (nx == columnDtl_tdlv_nm) doDtl_tdlv_nm_NX(info);
		else if (nx == columnDtl_ship_lg_grp_cd) doDtl_ship_lg_grp_cd_NX(info);
		else if (nx == columnDtl_ship_lg_grp_nm) doDtl_ship_lg_grp_nm_NX(info);
		else if (nx == columnDtl_acst_cd) doDtl_acst_cd_NX(info);
		else if (nx == columnDtl_acst_nm) doDtl_acst_nm_NX(info);
		else if (nx == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NX(info);
		else if (nx == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NX(info);
		else if (nx == columnDtl_bcst_cd) doDtl_bcst_cd_NX(info);
		else if (nx == columnDtl_bcst_nm) doDtl_bcst_nm_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_NX(info);
		else if (nx == columnDtl_sls_act_no) doDtl_sls_act_no_NX(info);
		else if (nx == columnDtl_sls_act_rev) doDtl_sls_act_rev_NX(info);
		else if (nx == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NX(info);
		else if (nx == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_NX(info);
		else if (nx == columnDtl_aprv_flg) doDtl_aprv_flg_NX(info);
		else if (nx == columnDtl_aprv_no) doDtl_aprv_no_NX(info);
		else if (nx == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NX(info);
		else if (nx == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_sls_ret_schd_no) doDtl_sls_ret_schd_no_NX(info);
		else if (nx == columnDtl_sls_ret_schd_d_no) doDtl_sls_ret_schd_d_no_NX(info);
		else if (nx == columnDtl_qtn_no) doDtl_qtn_no_NX(info);
		else if (nx == columnDtl_qtn_rev) doDtl_qtn_rev_NX(info);
		else if (nx == columnDtl_qtn_d_no) doDtl_qtn_d_no_NX(info);
		else if (nx == columnDtl_purc_ddlv_po_no) doDtl_purc_ddlv_po_no_NX(info);
		else if (nx == columnDtl_purc_ddlv_po_d_no) doDtl_purc_ddlv_po_d_no_NX(info);
		else if (nx == columnDtl_iv_no) doDtl_iv_no_NX(info);
		else if (nx == columnDtl_ref_iv_no) doDtl_ref_iv_no_NX(info);
		else if (nx == columnDtl_cst_po_no) doDtl_cst_po_no_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NX(info);
		else if (nx == columnDtl_arr_act_no) doDtl_arr_act_no_NX(info);
		else if (nx == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_NX(info);
		else if (nx == columnDtl_sls_act_io_no) doDtl_sls_act_io_no_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_lot_no) doDtl_lot_no_NX(info);
		else if (nx == columnDtl_sublot_no) doDtl_sublot_no_NX(info);
		else if (nx == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NX(info);
		else if (nx == columnDtl_biz_rsn_cd) doDtl_biz_rsn_cd_NX(info);
		else if (nx == columnDtl_biz_rsn_nm) doDtl_biz_rsn_nm_NX(info);
		else if (nx == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NX(info);
		else if (nx == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NX(info);
		else if (nx == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NX(info);
		else if (nx == columnDtl_io_sub_char1) doDtl_io_sub_char1_NX(info);
		else if (nx == columnDtl_io_sub_char2) doDtl_io_sub_char2_NX(info);
		else if (nx == columnDtl_io_sub_char3) doDtl_io_sub_char3_NX(info);
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
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_sls_act_seq) doDtl_sls_act_seq_NX(info);
		else if (nx == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_NX(info);
		else if (nx == columnDtl_hdr_upd_cntr) doDtl_hdr_upd_cntr_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_sls_amt_rnd_typ) doDtl_sls_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_sls_tax_rnd_typ) doDtl_sls_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NX(info);
		else if (nx == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NX(info);
		else if (nx == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NX(info);
		else if (nx == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NX(info);
		else if (nx == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NX(info);
		else if (nx == columnDtl_sls_close_flg) doDtl_sls_close_flg_NX(info);
		else if (nx == columnDtl_bef_bd_dpt_cd) doDtl_bef_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bill_cl_typ) doDtl_bill_cl_typ_NX(info);
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
	 * [BulkSetTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSetTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dscnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dscnt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_aprv_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[io_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dis_can_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NX(MCEventInfo info){
	}

	/**
	 * [UpriBulkSet]パネルの[upri_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriBulkSet_upri_dt_NX(MCEventInfo info){
	}

	/**
	 * [XrateBulkSet]パネルの[xrate_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateBulkSet_xrate_dt_NX(MCEventInfo info){
	}

	/**
	 * [TaxBulkSet]パネルの[tax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxBulkSet_tax_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_close_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_close_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_typ_NX(MCEventInfo info){
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
		if (lc == Cnd_sls_dt_fr) doCnd_sls_dt_fr_LC(info);
		else if (lc == Cnd_sls_dt_to) doCnd_sls_dt_to_LC(info);
		else if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
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
		else if (lc == Cnd_ship_lg_grp_cd) doCnd_ship_lg_grp_cd_LC(info);
		else if (lc == Cnd_ship_lg_grp_nm) doCnd_ship_lg_grp_nm_LC(info);
		else if (lc == Cnd_sls_act_no) doCnd_sls_act_no_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_ext_purc_act_d_no) doCnd_ext_purc_act_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_tax_cd) doCnd_tax_cd_LC(info);
		else if (lc == Cnd_tax_nm) doCnd_tax_nm_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_acst_cd) doCnd_acst_cd_LC(info);
		else if (lc == Cnd_acst_nm) doCnd_acst_nm_LC(info);
		else if (lc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_LC(info);
		else if (lc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_LC(info);
		else if (lc == Cnd_tdlv_cd) doCnd_tdlv_cd_LC(info);
		else if (lc == Cnd_tdlv_nm) doCnd_tdlv_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
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
		else if (lc == Cnd_io_sub_char1) doCnd_io_sub_char1_LC(info);
		else if (lc == Cnd_io_sub_char2) doCnd_io_sub_char2_LC(info);
		else if (lc == Cnd_io_sub_char3) doCnd_io_sub_char3_LC(info);
		else if (lc == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_LC(info);
		else if (lc == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_LC(info);
		else if (lc == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_LC(info);
		else if (lc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_sls_dt) doDtl_sls_dt_LC(info);
		else if (lc == columnDtl_ac_ym) doDtl_ac_ym_LC(info);
		else if (lc == columnDtl_ac_dt) doDtl_ac_dt_LC(info);
		else if (lc == columnDtl_can_ac_dt) doDtl_can_ac_dt_LC(info);
		else if (lc == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_LC(info);
		else if (lc == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_LC(info);
		else if (lc == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_LC(info);
		else if (lc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_LC(info);
		else if (lc == columnDtl_prof_rate) doDtl_prof_rate_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_schd_trd_unit_cd) doDtl_schd_trd_unit_cd_LC(info);
		else if (lc == columnDtl_schd_trd_unit_nm) doDtl_schd_trd_unit_nm_LC(info);
		else if (lc == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_LC(info);
		else if (lc == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl_slo_dt) doDtl_slo_dt_LC(info);
		else if (lc == columnDtl_sls_schd_dt) doDtl_sls_schd_dt_LC(info);
		else if (lc == columnDtl_base_cur_cd) doDtl_base_cur_cd_LC(info);
		else if (lc == columnDtl_base_cur_nm) doDtl_base_cur_nm_LC(info);
		else if (lc == columnDtl_xrate_cd) doDtl_xrate_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_LC(info);
		else if (lc == columnDtl_ptax_xrate) doDtl_ptax_xrate_LC(info);
		else if (lc == columnDtl_trd_rmrks) doDtl_trd_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_dest_cd1) doDtl_dest_cd1_LC(info);
		else if (lc == columnDtl_dest_nm1) doDtl_dest_nm1_LC(info);
		else if (lc == columnDtl_dest_cd2) doDtl_dest_cd2_LC(info);
		else if (lc == columnDtl_dest_nm2) doDtl_dest_nm2_LC(info);
		else if (lc == columnDtl_dest_cd3) doDtl_dest_cd3_LC(info);
		else if (lc == columnDtl_dest_nm3) doDtl_dest_nm3_LC(info);
		else if (lc == columnDtl_tdlv_cd) doDtl_tdlv_cd_LC(info);
		else if (lc == columnDtl_tdlv_nm) doDtl_tdlv_nm_LC(info);
		else if (lc == columnDtl_ship_lg_grp_cd) doDtl_ship_lg_grp_cd_LC(info);
		else if (lc == columnDtl_ship_lg_grp_nm) doDtl_ship_lg_grp_nm_LC(info);
		else if (lc == columnDtl_acst_cd) doDtl_acst_cd_LC(info);
		else if (lc == columnDtl_acst_nm) doDtl_acst_nm_LC(info);
		else if (lc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_LC(info);
		else if (lc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_LC(info);
		else if (lc == columnDtl_bcst_cd) doDtl_bcst_cd_LC(info);
		else if (lc == columnDtl_bcst_nm) doDtl_bcst_nm_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_LC(info);
		else if (lc == columnDtl_sls_act_no) doDtl_sls_act_no_LC(info);
		else if (lc == columnDtl_sls_act_rev) doDtl_sls_act_rev_LC(info);
		else if (lc == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_LC(info);
		else if (lc == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_LC(info);
		else if (lc == columnDtl_aprv_no) doDtl_aprv_no_LC(info);
		else if (lc == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_LC(info);
		else if (lc == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_sls_ret_schd_no) doDtl_sls_ret_schd_no_LC(info);
		else if (lc == columnDtl_sls_ret_schd_d_no) doDtl_sls_ret_schd_d_no_LC(info);
		else if (lc == columnDtl_qtn_no) doDtl_qtn_no_LC(info);
		else if (lc == columnDtl_qtn_rev) doDtl_qtn_rev_LC(info);
		else if (lc == columnDtl_qtn_d_no) doDtl_qtn_d_no_LC(info);
		else if (lc == columnDtl_purc_ddlv_po_no) doDtl_purc_ddlv_po_no_LC(info);
		else if (lc == columnDtl_purc_ddlv_po_d_no) doDtl_purc_ddlv_po_d_no_LC(info);
		else if (lc == columnDtl_iv_no) doDtl_iv_no_LC(info);
		else if (lc == columnDtl_ref_iv_no) doDtl_ref_iv_no_LC(info);
		else if (lc == columnDtl_cst_po_no) doDtl_cst_po_no_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_LC(info);
		else if (lc == columnDtl_arr_act_no) doDtl_arr_act_no_LC(info);
		else if (lc == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_LC(info);
		else if (lc == columnDtl_sls_act_io_no) doDtl_sls_act_io_no_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		else if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		else if (lc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_LC(info);
		else if (lc == columnDtl_biz_rsn_cd) doDtl_biz_rsn_cd_LC(info);
		else if (lc == columnDtl_biz_rsn_nm) doDtl_biz_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_LC(info);
		else if (lc == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_LC(info);
		else if (lc == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_LC(info);
		else if (lc == columnDtl_io_sub_char1) doDtl_io_sub_char1_LC(info);
		else if (lc == columnDtl_io_sub_char2) doDtl_io_sub_char2_LC(info);
		else if (lc == columnDtl_io_sub_char3) doDtl_io_sub_char3_LC(info);
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
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_sls_act_seq) doDtl_sls_act_seq_LC(info);
		else if (lc == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_LC(info);
		else if (lc == columnDtl_hdr_upd_cntr) doDtl_hdr_upd_cntr_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_sls_amt_rnd_typ) doDtl_sls_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_sls_tax_rnd_typ) doDtl_sls_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_LC(info);
		else if (lc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_LC(info);
		else if (lc == columnDtl_bef_bd_dpt_cd) doDtl_bef_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bill_cl_typ) doDtl_bill_cl_typ_LC(info);
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
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[io_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [UpriBulkSet]パネルの[upri_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriBulkSet_upri_dt_LC(MCEventInfo info){
	}

	/**
	 * [XrateBulkSet]パネルの[xrate_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateBulkSet_xrate_dt_LC(MCEventInfo info){
	}

	/**
	 * [TaxBulkSet]パネルの[tax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxBulkSet_tax_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_ret_schd_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_ret_schd_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_sub_char3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_typ_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_ship_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
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
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tax_cd]の作成メソッド
	 */
	public MCList getCnd_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_acst_cd]の作成メソッド
	 */
	public MCList getCnd_acst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_cd]の作成メソッド
	 */
	public MCList getCnd_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSloStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cur_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ar_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_biz_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_biz_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsAllBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1370.Srch01")) {
			return new MS_MSBBL1370_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1370.Upd01")) {
			return new MS_MSBBL1370_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1370.Sprt01")) {
			return new MS_MSBBL1370_Sprt01Bridge();
		}
		if (id.equals("MS.MSBBL1370.Sprt02")) {
			return new MS_MSBBL1370_Sprt02Bridge();
		}
		if (id.equals("MS.MSBBL1370.Sprt03")) {
			return new MS_MSBBL1370_Sprt03Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1370_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1370_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1370_Srch01Bridge() {
			p_MS_MSBBL1370_Srch01 = new MCParam(PDef.MS_MSBBL1370_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1370_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1370.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.DtlR.class));

			p_MS_MSBBL1370_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1370_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1370_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1370_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1370_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1370.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1370.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1370.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1370_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1370_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1370.DtlR>)p_MS_MSBBL1370_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1370_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1370_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1370_Upd01Bridge() {
			p_MS_MSBBL1370_Upd01 = new MCParam(PDef.MS_MSBBL1370_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1370_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.DtlR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1370.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.DtlR.class));

			p_MS_MSBBL1370_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1370_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1370_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBBL1370_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1370_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1370_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1370.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.DtlR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1370.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1370.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1370.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1370_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1370_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1370.DtlR>)p_MS_MSBBL1370_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1370_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1370_Sprt01;

		/** コンストラクタ */
		protected MS_MSBBL1370_Sprt01Bridge() {
			p_MS_MSBBL1370_Sprt01 = new MCParam(PDef.MS_MSBBL1370_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1370_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.UpriSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.UpriSrchR.class));

			p_MS_MSBBL1370_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1370_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1370_Sprt01.addUpBlock(getUpriSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1370_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1370_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1370_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.UpriSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1370_Sprt01;
		}

		protected void show() {
			setUpriSrchL((MCList<mcframe.clientMSBB.MSBBP1370.UpriSrchR>)p_MS_MSBBL1370_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getUpriSrchL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getUpriSrchL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getUpriSrchL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1370_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1370_Sprt02;

		/** コンストラクタ */
		protected MS_MSBBL1370_Sprt02Bridge() {
			p_MS_MSBBL1370_Sprt02 = new MCParam(PDef.MS_MSBBL1370_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1370_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.XrateSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.XrateSrchR.class));

			p_MS_MSBBL1370_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1370_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1370_Sprt02.addUpBlock(getXrateSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1370_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1370_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1370_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.XrateSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1370_Sprt02;
		}

		protected void show() {
			setXrateSrchL((MCList<mcframe.clientMSBB.MSBBP1370.XrateSrchR>)p_MS_MSBBL1370_Sprt02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getXrateSrchL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getXrateSrchL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getXrateSrchL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1370_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Sprt03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1370_Sprt03;

		/** コンストラクタ */
		protected MS_MSBBL1370_Sprt03Bridge() {
			p_MS_MSBBL1370_Sprt03 = new MCParam(PDef.MS_MSBBL1370_Sprt03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1370_Sprt03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.TaxSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.TaxSrchR.class));

			p_MS_MSBBL1370_Sprt03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1370_Sprt03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1370_Sprt03.addUpBlock(getTaxSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1370_Sprt03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1370_Sprt03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1370_Sprt03.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1370.TaxSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1370_Sprt03;
		}

		protected void show() {
			setTaxSrchL((MCList<mcframe.clientMSBB.MSBBP1370.TaxSrchR>)p_MS_MSBBL1370_Sprt03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getTaxSrchL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getTaxSrchL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getTaxSrchL());
			return result;
		}
	}
}