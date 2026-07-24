package mcframe.clientMSBE.MSBEP1160;

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
import mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Srch01Caller;
import mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Upd01Caller;
import mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt01Caller;
import mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt02Caller;
import mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt03Caller;
import mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Prnt01Caller;

/**
 * 画面"MSBEP_ProvDtlModReg"パネルクラスです。<p>
 *
 * 支給予定の照会、支給実績の照会と単価の訂正をする画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ProvDtlModReg_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1160";

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
	// [ProvTyp]ブロック関連のField定義
	public MCPanel ProvTypPanel = null;
	public MCTitledBorder ProvTypTitledBorder = null;
	// [ProvTyp]ブロックの項目のField定義
	// [SubconSts]ブロック関連のField定義
	public MCPanel SubconStsPanel = null;
	public MCTitledBorder SubconStsTitledBorder = null;
	// [SubconSts]ブロックの項目のField定義
	// [DlvPrnt]ブロック関連のField定義
	public MCPanel DlvPrntPanel = null;
	public MCTitledBorder DlvPrntTitledBorder = null;
	// [DlvPrnt]ブロックの項目のField定義
	// [PrspplGrp]ブロック関連のField定義
	public MCPanel PrspplGrpPanel = null;
	// [PrspplGrp]ブロックの項目のField定義
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Modify (Result),1;PRNT,Issue report,2;REF_ACT,View (Result),3;REF_SCHD,View (Schedule),4; UPD,訂正する（実績）,1;PRNT,帳票発行,2;REF_ACT,参照する（実績）,3;REF_SCHD,参照する（予定）,4;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF_ACT = null;
	public MCRadioButton Cnd_ope_REF_SCHD = null;
	/**
	 * Supply 支給.<p>
	 *
	 */
	public MCCheckBox Cnd_prov = null;
	/**
	 * Return 返品.<p>
	 *
	 */
	public MCCheckBox Cnd_prov_rtn = null;
	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public MCCheckBox Cnd_ffr_prov_flg = null;
	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public MCCheckBox Cnd_onr_prov_flg = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCCheckBox Cnd_subcon_flg = null;
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_subcon_flg = null;
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
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public MCCheckBox Cnd_on_edi_flg = null;
	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_off_edi_flg = null;
	public MCLabel Cnd_accpt_dt_fr_Label = null;
	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_dt_fr = null;
	public MCLabel Cnd_accpt_dt_to_Label = null;
	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_dt_to = null;
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
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_arr_act_dt_p_PPanel;
	public MCDateField Cnd_arr_act_dt_fr;	// [Cnd]の[arr_act_dt_p.ymd_fr]を[Cnd_arr_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_act_hm_fr;	// [Cnd]の[arr_act_dt_p.hm_fr]を[Cnd_arr_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_act_dt_to;	// [Cnd]の[arr_act_dt_p.ymd_to]を[Cnd_arr_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_arr_act_hm_to;	// [Cnd]の[arr_act_dt_p.hm_to]を[Cnd_arr_act_hm_to]としてエイリアス定義。
	public MCLabel Cnd_accpt_schd_dt_fr_Label = null;
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_schd_dt_fr = null;
	public MCLabel Cnd_accpt_schd_dt_to_Label = null;
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_schd_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_arr_schd_dt_p_PPanel;
	public MCDateField Cnd_arr_schd_dt_fr;	// [Cnd]の[arr_schd_dt_p.ymd_fr]を[Cnd_arr_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_hm_fr;	// [Cnd]の[arr_schd_dt_p.hm_fr]を[Cnd_arr_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_dt_to;	// [Cnd]の[arr_schd_dt_p.ymd_to]を[Cnd_arr_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_hm_to;	// [Cnd]の[arr_schd_dt_p.hm_to]を[Cnd_arr_schd_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_prsppl_cd_Label = null;
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_cd = null;
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_nm = null;
	public MCLabel Cnd_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_nm = null;
	public MCLabel Cnd_prsppl_loc_cd_Label = null;
	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_loc_cd = null;
	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_loc_nm = null;
	public MCLabel Cnd_prsppl_str_ln_cd_Label = null;
	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_str_ln_cd = null;
	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_str_ln_nm = null;
	public MCLabel Cnd_prsppl_wg_cd_Label = null;
	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_wg_cd = null;
	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_wg_nm = null;
	public MCLabel Cnd_prsppl_lg_grp_cd_Label = null;
	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_lg_grp_cd = null;
	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_lg_grp_nm = null;
	public MCLabel Cnd_prsppl_site_cd_Label = null;
	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_site_cd = null;
	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_site_nm = null;
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
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
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
	public MCLabel Cnd_stk_id_typ_Label = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_id_typ_nm = null;
	public MCLabel Cnd_prov_basis_typ_Label = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_basis_typ = null;
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public MCTextField Cnd_prov_basis_typ_nm = null;
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
	public MCLabel Cnd_dlv_slip_d_no_Label = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_d_no = null;
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
	public MCLabel Cnd_prov_src_act_typ_Label = null;
	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_src_act_typ = null;
	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public MCTextField Cnd_prov_src_act_typ_nm = null;
	public MCLabel Cnd_prov_src_act_no_Label = null;
	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_prov_src_act_no = null;
	public MCLabel Cnd_prov_act_no_Label = null;
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_prov_act_no = null;
	public MCLabel Cnd_prov_src_schd_typ_Label = null;
	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_src_schd_typ = null;
	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public MCTextField Cnd_prov_src_schd_typ_nm = null;
	public MCLabel Cnd_prov_src_schd_no1_Label = null;
	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_prov_src_schd_no1 = null;
	public MCLabel Cnd_prov_src_schd_no2_Label = null;
	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_prov_src_schd_no2 = null;
	public MCLabel Cnd_prov_schd_no_Label = null;
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_prov_schd_no = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
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
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_dis_can_disp_flg = null;
	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public MCCheckBox Cnd_sign_rev_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_prsppl_grp_p_PPanel;
	public MCLabel Cnd_prsppl_grp_lab1;	// [Cnd]の[prsppl_grp_p.bp_grp_lab1]を[Cnd_prsppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg1;	// [Cnd]の[prsppl_grp_p.bp_grp_flg1]を[Cnd_prsppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd1;	// [Cnd]の[prsppl_grp_p.bp_grp_cd1]を[Cnd_prsppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm1;	// [Cnd]の[prsppl_grp_p.bp_grp_nm1]を[Cnd_prsppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab2;	// [Cnd]の[prsppl_grp_p.bp_grp_lab2]を[Cnd_prsppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg2;	// [Cnd]の[prsppl_grp_p.bp_grp_flg2]を[Cnd_prsppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd2;	// [Cnd]の[prsppl_grp_p.bp_grp_cd2]を[Cnd_prsppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm2;	// [Cnd]の[prsppl_grp_p.bp_grp_nm2]を[Cnd_prsppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab3;	// [Cnd]の[prsppl_grp_p.bp_grp_lab3]を[Cnd_prsppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg3;	// [Cnd]の[prsppl_grp_p.bp_grp_flg3]を[Cnd_prsppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd3;	// [Cnd]の[prsppl_grp_p.bp_grp_cd3]を[Cnd_prsppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm3;	// [Cnd]の[prsppl_grp_p.bp_grp_nm3]を[Cnd_prsppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab4;	// [Cnd]の[prsppl_grp_p.bp_grp_lab4]を[Cnd_prsppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg4;	// [Cnd]の[prsppl_grp_p.bp_grp_flg4]を[Cnd_prsppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd4;	// [Cnd]の[prsppl_grp_p.bp_grp_cd4]を[Cnd_prsppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm4;	// [Cnd]の[prsppl_grp_p.bp_grp_nm4]を[Cnd_prsppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab5;	// [Cnd]の[prsppl_grp_p.bp_grp_lab5]を[Cnd_prsppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg5;	// [Cnd]の[prsppl_grp_p.bp_grp_flg5]を[Cnd_prsppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd5;	// [Cnd]の[prsppl_grp_p.bp_grp_cd5]を[Cnd_prsppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm5;	// [Cnd]の[prsppl_grp_p.bp_grp_nm5]を[Cnd_prsppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab6;	// [Cnd]の[prsppl_grp_p.bp_grp_lab6]を[Cnd_prsppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg6;	// [Cnd]の[prsppl_grp_p.bp_grp_flg6]を[Cnd_prsppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd6;	// [Cnd]の[prsppl_grp_p.bp_grp_cd6]を[Cnd_prsppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm6;	// [Cnd]の[prsppl_grp_p.bp_grp_nm6]を[Cnd_prsppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab7;	// [Cnd]の[prsppl_grp_p.bp_grp_lab7]を[Cnd_prsppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg7;	// [Cnd]の[prsppl_grp_p.bp_grp_flg7]を[Cnd_prsppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd7;	// [Cnd]の[prsppl_grp_p.bp_grp_cd7]を[Cnd_prsppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm7;	// [Cnd]の[prsppl_grp_p.bp_grp_nm7]を[Cnd_prsppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab8;	// [Cnd]の[prsppl_grp_p.bp_grp_lab8]を[Cnd_prsppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg8;	// [Cnd]の[prsppl_grp_p.bp_grp_flg8]を[Cnd_prsppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd8;	// [Cnd]の[prsppl_grp_p.bp_grp_cd8]を[Cnd_prsppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm8;	// [Cnd]の[prsppl_grp_p.bp_grp_nm8]を[Cnd_prsppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab9;	// [Cnd]の[prsppl_grp_p.bp_grp_lab9]を[Cnd_prsppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg9;	// [Cnd]の[prsppl_grp_p.bp_grp_flg9]を[Cnd_prsppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd9;	// [Cnd]の[prsppl_grp_p.bp_grp_cd9]を[Cnd_prsppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm9;	// [Cnd]の[prsppl_grp_p.bp_grp_nm9]を[Cnd_prsppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_prsppl_grp_lab10;	// [Cnd]の[prsppl_grp_p.bp_grp_lab10]を[Cnd_prsppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_prsppl_grp_flg10;	// [Cnd]の[prsppl_grp_p.bp_grp_flg10]を[Cnd_prsppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_prsppl_grp_cd10;	// [Cnd]の[prsppl_grp_p.bp_grp_cd10]を[Cnd_prsppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_prsppl_grp_nm10;	// [Cnd]の[prsppl_grp_p.bp_grp_nm10]を[Cnd_prsppl_grp_nm10]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMSBE.MSBEP1160.DtlR> DtlTable = null;
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
	 * Acceptance date 検収日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_accpt_dt = null;
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
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_ac_dt = null;
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_can_ac_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_arr_acr_tm_p_PPanel;
	public MCColumnConfig columnDtl_arr_act_dt;// [Dtl]の[arr_acr_tm_p.ymd]を[columnDtl_arr_act_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_arr_act_hm;// [Dtl]の[arr_acr_tm_p.hm]を[columnDtl_arr_act_hm]としてエイリアス定義。
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_accpt_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_arr_schd_tm_p_PPanel;
	public MCColumnConfig columnDtl_arr_schd_dt;// [Dtl]の[arr_schd_tm_p.ymd]を[columnDtl_arr_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_arr_schd_hm;// [Dtl]の[arr_schd_tm_p.hm]を[columnDtl_arr_schd_hm]としてエイリアス定義。
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prsppl_cd = null;
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prsppl_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_nm = null;
	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prsppl_loc_cd = null;
	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prsppl_loc_nm = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd_none_flg = null;
	/**
	 * Subcontractor WG cd. 支給先ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prsppl_wg_cd = null;
	/**
	 * Subcontractor WG name 支給先ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prsppl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
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
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ_nm = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_schd_qty;// [Dtl]の[schd_qty_p.qty]を[columnDtl_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_act_qty_p_PPanel;
	public MCColumnConfig columnDtl_act_qty;// [Dtl]の[act_qty_p.qty]を[columnDtl_act_qty]としてエイリアス定義。
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_typ_nm = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_basis_typ = null;
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_basis_typ_nm = null;
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
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl_wtax_amt;// [Dtl]の[wtax_amt_p.amt]を[columnDtl_wtax_amt]としてエイリアス定義。
	/**
	 * Transport reason cd. 移送理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_rsn_cd = null;
	/**
	 * Transport reason name 移送理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_rsn_nm = null;
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acxfr_gi_flg = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_no = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_prnted_flg = null;
	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_act_typ = null;
	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_act_typ_nm = null;
	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_act_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_no = null;
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_act_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_act_no = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_act_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_act_rev = null;
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_flg = null;
	/**
	 * For I/V Ｉ／Ｖ対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_trd_flg = null;
	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_schd_typ = null;
	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_schd_typ_nm = null;
	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_schd_no1 = null;
	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_src_schd_no2 = null;
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_schd_no = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_prsppl_Grp_p_PPanel;
	public MCColumnConfig columnDtl_prsppl_grp_cd1;// [Dtl]の[prsppl_Grp_p.bp_grp_cd1]を[columnDtl_prsppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm1;// [Dtl]の[prsppl_Grp_p.bp_grp_nm1]を[columnDtl_prsppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd2;// [Dtl]の[prsppl_Grp_p.bp_grp_cd2]を[columnDtl_prsppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm2;// [Dtl]の[prsppl_Grp_p.bp_grp_nm2]を[columnDtl_prsppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd3;// [Dtl]の[prsppl_Grp_p.bp_grp_cd3]を[columnDtl_prsppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm3;// [Dtl]の[prsppl_Grp_p.bp_grp_nm3]を[columnDtl_prsppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd4;// [Dtl]の[prsppl_Grp_p.bp_grp_cd4]を[columnDtl_prsppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm4;// [Dtl]の[prsppl_Grp_p.bp_grp_nm4]を[columnDtl_prsppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd5;// [Dtl]の[prsppl_Grp_p.bp_grp_cd5]を[columnDtl_prsppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm5;// [Dtl]の[prsppl_Grp_p.bp_grp_nm5]を[columnDtl_prsppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd6;// [Dtl]の[prsppl_Grp_p.bp_grp_cd6]を[columnDtl_prsppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm6;// [Dtl]の[prsppl_Grp_p.bp_grp_nm6]を[columnDtl_prsppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd7;// [Dtl]の[prsppl_Grp_p.bp_grp_cd7]を[columnDtl_prsppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm7;// [Dtl]の[prsppl_Grp_p.bp_grp_nm7]を[columnDtl_prsppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd8;// [Dtl]の[prsppl_Grp_p.bp_grp_cd8]を[columnDtl_prsppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm8;// [Dtl]の[prsppl_Grp_p.bp_grp_nm8]を[columnDtl_prsppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd9;// [Dtl]の[prsppl_Grp_p.bp_grp_cd9]を[columnDtl_prsppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm9;// [Dtl]の[prsppl_Grp_p.bp_grp_nm9]を[columnDtl_prsppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_cd10;// [Dtl]の[prsppl_Grp_p.bp_grp_cd10]を[columnDtl_prsppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_prsppl_grp_nm10;// [Dtl]の[prsppl_Grp_p.bp_grp_nm10]を[columnDtl_prsppl_grp_nm10]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
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
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_amt_rnd_typ = null;
	/**
	 * Supply tax rounding type 支給税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_tax_rnd_typ = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH_ACT]モードを表す定数 */
	public static final String SRCH_ACT = "SRCH_ACT";
	/** [REF_ACT]モードを表す定数 */
	public static final String REF_ACT = "REF_ACT";
	/** [SRCH_SCHD]モードを表す定数 */
	public static final String SRCH_SCHD = "SRCH_SCHD";
	/** [REF_SCHD]モードを表す定数 */
	public static final String REF_SCHD = "REF_SCHD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, PRNT, FIX_U, SRCH_ACT, REF_ACT, SRCH_SCHD, REF_SCHD};
	
	/** [MS_MSBEL1160_Srch01]のCallerの作成 */
	protected MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Srch01Caller createMS_MSBEL1160_Srch01() {
		MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Srch01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Srch01Bridge>
		caller = ((MSBEP_ProvDtlModReg_MC)this).new MS_MSBEL1160_Srch01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Srch01Bridge>(
					(MSBEP_ProvDtlModReg)this, new MS_MSBEL1160_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1160_Srch01]の呼び出し */
	protected void callMS_MSBEL1160_Srch01() {
		MCCaller caller = createMS_MSBEL1160_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1160_Upd01]のCallerの作成 */
	protected MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Upd01Caller createMS_MSBEL1160_Upd01() {
		MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Upd01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Upd01Bridge>
		caller = ((MSBEP_ProvDtlModReg_MC)this).new MS_MSBEL1160_Upd01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Upd01Bridge>(
					(MSBEP_ProvDtlModReg)this, new MS_MSBEL1160_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1160_Upd01]の呼び出し */
	protected void callMS_MSBEL1160_Upd01() {
		MCCaller caller = createMS_MSBEL1160_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1160_Sprt01]のCallerの作成 */
	protected MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt01Caller createMS_MSBEL1160_Sprt01() {
		MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Sprt01Bridge>
		caller = ((MSBEP_ProvDtlModReg_MC)this).new MS_MSBEL1160_Sprt01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Sprt01Bridge>(
					(MSBEP_ProvDtlModReg)this, new MS_MSBEL1160_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1160_Sprt01]の呼び出し */
	protected void callMS_MSBEL1160_Sprt01() {
		MCCaller caller = createMS_MSBEL1160_Sprt01();
		caller.exec();
	}
	/** [MS_MSBEL1160_Sprt02]のCallerの作成 */
	protected MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt02Caller createMS_MSBEL1160_Sprt02() {
		MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt02Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Sprt02Bridge>
		caller = ((MSBEP_ProvDtlModReg_MC)this).new MS_MSBEL1160_Sprt02Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Sprt02Bridge>(
					(MSBEP_ProvDtlModReg)this, new MS_MSBEL1160_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBEL1160_Sprt02]の呼び出し */
	protected void callMS_MSBEL1160_Sprt02() {
		MCCaller caller = createMS_MSBEL1160_Sprt02();
		caller.exec();
	}
	/** [MS_MSBEL1160_Sprt03]のCallerの作成 */
	protected MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt03Caller createMS_MSBEL1160_Sprt03() {
		MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Sprt03Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Sprt03Bridge>
		caller = ((MSBEP_ProvDtlModReg_MC)this).new MS_MSBEL1160_Sprt03Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Sprt03Bridge>(
					(MSBEP_ProvDtlModReg)this, new MS_MSBEL1160_Sprt03Bridge());
		return caller;
	}
	/** [MS_MSBEL1160_Sprt03]の呼び出し */
	protected void callMS_MSBEL1160_Sprt03() {
		MCCaller caller = createMS_MSBEL1160_Sprt03();
		caller.exec();
	}
	/** [MS_MSBEL1160_Prnt01]のCallerの作成 */
	protected MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Prnt01Caller createMS_MSBEL1160_Prnt01() {
		MSBEP_ProvDtlModReg_MC.MS_MSBEL1160_Prnt01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Prnt01Bridge>
		caller = ((MSBEP_ProvDtlModReg_MC)this).new MS_MSBEL1160_Prnt01Caller<MSBEP_ProvDtlModReg, MS_MSBEL1160_Prnt01Bridge>(
					(MSBEP_ProvDtlModReg)this, new MS_MSBEL1160_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1160_Prnt01]の呼び出し */
	protected void callMS_MSBEL1160_Prnt01() {
		MCCaller caller = createMS_MSBEL1160_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1160.CndR aCndR;
	/** [UpriBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1160.UpriBulkSetR aUpriBulkSetR;
	/** [XrateBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1160.XrateBulkSetR aXrateBulkSetR;
	/** [TaxBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1160.TaxBulkSetR aTaxBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1160.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1160.BtnR aBtnR;
	/** [UpriSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR> aUpriSrchL;
	/** [XrateSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR> aXrateSrchL;
	/** [TaxSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR> aTaxSrchL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1160.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1160.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1160.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1160.CndR.create();
	}

	/**
	 * 項目コピーによってaUpriBulkSetRを設定します。
	 *
	 * aUpriBulkSetRのインスタンスは変更されません。
	 *
	 * @param row UpriBulkSetR
	 */
	public void setUpriBulkSetR(mcframe.clientMSBE.MSBEP1160.UpriBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getUpriBulkSetR(), row);
		}
	}

	/**
	 * [UpriBulkSet]ブロックのコンテナaUpriBulkSetRを返します。
	 *
	 * @return UpriBulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1160.UpriBulkSetR getUpriBulkSetR() {
		return aUpriBulkSetR;
	}

	/**
	 * aUpriBulkSetRを作成します。
	 *
	 * @return UpriBulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1160.UpriBulkSetR createUpriBulkSetR() {
		return mcframe.clientMSBE.MSBEP1160.UpriBulkSetR.create();
	}

	/**
	 * 項目コピーによってaXrateBulkSetRを設定します。
	 *
	 * aXrateBulkSetRのインスタンスは変更されません。
	 *
	 * @param row XrateBulkSetR
	 */
	public void setXrateBulkSetR(mcframe.clientMSBE.MSBEP1160.XrateBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getXrateBulkSetR(), row);
		}
	}

	/**
	 * [XrateBulkSet]ブロックのコンテナaXrateBulkSetRを返します。
	 *
	 * @return XrateBulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1160.XrateBulkSetR getXrateBulkSetR() {
		return aXrateBulkSetR;
	}

	/**
	 * aXrateBulkSetRを作成します。
	 *
	 * @return XrateBulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1160.XrateBulkSetR createXrateBulkSetR() {
		return mcframe.clientMSBE.MSBEP1160.XrateBulkSetR.create();
	}

	/**
	 * 項目コピーによってaTaxBulkSetRを設定します。
	 *
	 * aTaxBulkSetRのインスタンスは変更されません。
	 *
	 * @param row TaxBulkSetR
	 */
	public void setTaxBulkSetR(mcframe.clientMSBE.MSBEP1160.TaxBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getTaxBulkSetR(), row);
		}
	}

	/**
	 * [TaxBulkSet]ブロックのコンテナaTaxBulkSetRを返します。
	 *
	 * @return TaxBulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1160.TaxBulkSetR getTaxBulkSetR() {
		return aTaxBulkSetR;
	}

	/**
	 * aTaxBulkSetRを作成します。
	 *
	 * @return TaxBulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1160.TaxBulkSetR createTaxBulkSetR() {
		return mcframe.clientMSBE.MSBEP1160.TaxBulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1160.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1160.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1160.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class);
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
	public void setBtnR(mcframe.clientMSBE.MSBEP1160.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1160.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1160.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1160.BtnR.create();
	}

	/**
	 * コピーによってaUpriSrchLを設定します。
	 *
	 * aUpriSrchLのインスタンスは変更されません。
	 *
	 * @param dataset UpriSrchL
	 */
	public void setUpriSrchL(MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR> aList) {
		if (getUpriSrchL() != aList) {
			getUpriSrchL().setAll(aList);
		}
	}

	/**
	 * [UpriSrch]ブロックのコンテナaUpriSrchLを返します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR> getUpriSrchL() {
		return aUpriSrchL;
	}

	/**
	 * aUpriSrchRを作成します。
	 *
	 * @return UpriSrchR
	 */
	public mcframe.clientMSBE.MSBEP1160.UpriSrchR createUpriSrchR() {
		return mcframe.clientMSBE.MSBEP1160.UpriSrchR.create();
	}

	/**
	 * aUpriSrchLを作成します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR> createUpriSrchL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1160.UpriSrchR.class);
	}

	/**
	 * コピーによってaXrateSrchLを設定します。
	 *
	 * aXrateSrchLのインスタンスは変更されません。
	 *
	 * @param dataset XrateSrchL
	 */
	public void setXrateSrchL(MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR> aList) {
		if (getXrateSrchL() != aList) {
			getXrateSrchL().setAll(aList);
		}
	}

	/**
	 * [XrateSrch]ブロックのコンテナaXrateSrchLを返します。
	 *
	 * @return XrateSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR> getXrateSrchL() {
		return aXrateSrchL;
	}

	/**
	 * aXrateSrchRを作成します。
	 *
	 * @return XrateSrchR
	 */
	public mcframe.clientMSBE.MSBEP1160.XrateSrchR createXrateSrchR() {
		return mcframe.clientMSBE.MSBEP1160.XrateSrchR.create();
	}

	/**
	 * aXrateSrchLを作成します。
	 *
	 * @return XrateSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR> createXrateSrchL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1160.XrateSrchR.class);
	}

	/**
	 * コピーによってaTaxSrchLを設定します。
	 *
	 * aTaxSrchLのインスタンスは変更されません。
	 *
	 * @param dataset TaxSrchL
	 */
	public void setTaxSrchL(MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR> aList) {
		if (getTaxSrchL() != aList) {
			getTaxSrchL().setAll(aList);
		}
	}

	/**
	 * [TaxSrch]ブロックのコンテナaTaxSrchLを返します。
	 *
	 * @return TaxSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR> getTaxSrchL() {
		return aTaxSrchL;
	}

	/**
	 * aTaxSrchRを作成します。
	 *
	 * @return TaxSrchR
	 */
	public mcframe.clientMSBE.MSBEP1160.TaxSrchR createTaxSrchR() {
		return mcframe.clientMSBE.MSBEP1160.TaxSrchR.create();
	}

	/**
	 * aTaxSrchLを作成します。
	 *
	 * @return TaxSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR> createTaxSrchL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1160.TaxSrchR.class);
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
		ret.add(SrchTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(ProvTypPanel);
		ret.add(SubconStsPanel);
		ret.add(DlvPrntPanel);
		ret.add(PrspplGrpPanel);
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
		ret.add(EdiPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ProvDtlModReg_MC_A() {
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
	public MSBEP_ProvDtlModReg_MC_A(String name) {
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
		MSBEP_ProvDtlModReg_MC.jbCreateScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateSrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateTop((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateFold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateTab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateTab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateTab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateSubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateDlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreatePrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateCnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateCtrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateRPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateBulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateUpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateUpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateXrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateTaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateDtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateBtn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbCreateEdi((MSBEP_ProvDtlModReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [SrchTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchTyp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [ProvTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProvTyp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [SubconSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSubconSts(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [DlvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvPrnt(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [PrspplGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrspplGrp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ProvDtlModReg p) {
		p.Cnd_arr_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().arr_act_dt_p());
		p.Cnd_arr_act_dt_p_PPanel.setName("Cnd.arr_act_dt_p");
		p.Cnd_arr_act_dt_fr = p.Cnd_arr_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_arr_act_dt_fr.addAliasName("Cnd.arr_act_dt_fr", p);
		p.Cnd_arr_act_hm_fr = p.Cnd_arr_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_arr_act_hm_fr.addAliasName("Cnd.arr_act_hm_fr", p);
		p.Cnd_arr_act_dt_to = p.Cnd_arr_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_arr_act_dt_to.addAliasName("Cnd.arr_act_dt_to", p);
		p.Cnd_arr_act_hm_to = p.Cnd_arr_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_arr_act_hm_to.addAliasName("Cnd.arr_act_hm_to", p);
		p.Cnd_arr_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().arr_schd_dt_p());
		p.Cnd_arr_schd_dt_p_PPanel.setName("Cnd.arr_schd_dt_p");
		p.Cnd_arr_schd_dt_fr = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_arr_schd_dt_fr.addAliasName("Cnd.arr_schd_dt_fr", p);
		p.Cnd_arr_schd_hm_fr = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_arr_schd_hm_fr.addAliasName("Cnd.arr_schd_hm_fr", p);
		p.Cnd_arr_schd_dt_to = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_arr_schd_dt_to.addAliasName("Cnd.arr_schd_dt_to", p);
		p.Cnd_arr_schd_hm_to = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_arr_schd_hm_to.addAliasName("Cnd.arr_schd_hm_to", p);
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
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
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
		p.Cnd_prsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().prsppl_grp_p());
		p.Cnd_prsppl_grp_p_PPanel.setName("Cnd.prsppl_grp_p");
		p.Cnd_prsppl_grp_lab1 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_prsppl_grp_lab1.addAliasName("Cnd.prsppl_grp_lab1", p);
		p.Cnd_prsppl_grp_flg1 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_prsppl_grp_flg1.addAliasName("Cnd.prsppl_grp_flg1", p);
		p.Cnd_prsppl_grp_cd1 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_prsppl_grp_cd1.addAliasName("Cnd.prsppl_grp_cd1", p);
		p.Cnd_prsppl_grp_nm1 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_prsppl_grp_nm1.addAliasName("Cnd.prsppl_grp_nm1", p);
		p.Cnd_prsppl_grp_lab2 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_prsppl_grp_lab2.addAliasName("Cnd.prsppl_grp_lab2", p);
		p.Cnd_prsppl_grp_flg2 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_prsppl_grp_flg2.addAliasName("Cnd.prsppl_grp_flg2", p);
		p.Cnd_prsppl_grp_cd2 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_prsppl_grp_cd2.addAliasName("Cnd.prsppl_grp_cd2", p);
		p.Cnd_prsppl_grp_nm2 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_prsppl_grp_nm2.addAliasName("Cnd.prsppl_grp_nm2", p);
		p.Cnd_prsppl_grp_lab3 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_prsppl_grp_lab3.addAliasName("Cnd.prsppl_grp_lab3", p);
		p.Cnd_prsppl_grp_flg3 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_prsppl_grp_flg3.addAliasName("Cnd.prsppl_grp_flg3", p);
		p.Cnd_prsppl_grp_cd3 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_prsppl_grp_cd3.addAliasName("Cnd.prsppl_grp_cd3", p);
		p.Cnd_prsppl_grp_nm3 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_prsppl_grp_nm3.addAliasName("Cnd.prsppl_grp_nm3", p);
		p.Cnd_prsppl_grp_lab4 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_prsppl_grp_lab4.addAliasName("Cnd.prsppl_grp_lab4", p);
		p.Cnd_prsppl_grp_flg4 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_prsppl_grp_flg4.addAliasName("Cnd.prsppl_grp_flg4", p);
		p.Cnd_prsppl_grp_cd4 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_prsppl_grp_cd4.addAliasName("Cnd.prsppl_grp_cd4", p);
		p.Cnd_prsppl_grp_nm4 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_prsppl_grp_nm4.addAliasName("Cnd.prsppl_grp_nm4", p);
		p.Cnd_prsppl_grp_lab5 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_prsppl_grp_lab5.addAliasName("Cnd.prsppl_grp_lab5", p);
		p.Cnd_prsppl_grp_flg5 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_prsppl_grp_flg5.addAliasName("Cnd.prsppl_grp_flg5", p);
		p.Cnd_prsppl_grp_cd5 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_prsppl_grp_cd5.addAliasName("Cnd.prsppl_grp_cd5", p);
		p.Cnd_prsppl_grp_nm5 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_prsppl_grp_nm5.addAliasName("Cnd.prsppl_grp_nm5", p);
		p.Cnd_prsppl_grp_lab6 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_prsppl_grp_lab6.addAliasName("Cnd.prsppl_grp_lab6", p);
		p.Cnd_prsppl_grp_flg6 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_prsppl_grp_flg6.addAliasName("Cnd.prsppl_grp_flg6", p);
		p.Cnd_prsppl_grp_cd6 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_prsppl_grp_cd6.addAliasName("Cnd.prsppl_grp_cd6", p);
		p.Cnd_prsppl_grp_nm6 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_prsppl_grp_nm6.addAliasName("Cnd.prsppl_grp_nm6", p);
		p.Cnd_prsppl_grp_lab7 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_prsppl_grp_lab7.addAliasName("Cnd.prsppl_grp_lab7", p);
		p.Cnd_prsppl_grp_flg7 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_prsppl_grp_flg7.addAliasName("Cnd.prsppl_grp_flg7", p);
		p.Cnd_prsppl_grp_cd7 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_prsppl_grp_cd7.addAliasName("Cnd.prsppl_grp_cd7", p);
		p.Cnd_prsppl_grp_nm7 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_prsppl_grp_nm7.addAliasName("Cnd.prsppl_grp_nm7", p);
		p.Cnd_prsppl_grp_lab8 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_prsppl_grp_lab8.addAliasName("Cnd.prsppl_grp_lab8", p);
		p.Cnd_prsppl_grp_flg8 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_prsppl_grp_flg8.addAliasName("Cnd.prsppl_grp_flg8", p);
		p.Cnd_prsppl_grp_cd8 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_prsppl_grp_cd8.addAliasName("Cnd.prsppl_grp_cd8", p);
		p.Cnd_prsppl_grp_nm8 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_prsppl_grp_nm8.addAliasName("Cnd.prsppl_grp_nm8", p);
		p.Cnd_prsppl_grp_lab9 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_prsppl_grp_lab9.addAliasName("Cnd.prsppl_grp_lab9", p);
		p.Cnd_prsppl_grp_flg9 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_prsppl_grp_flg9.addAliasName("Cnd.prsppl_grp_flg9", p);
		p.Cnd_prsppl_grp_cd9 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_prsppl_grp_cd9.addAliasName("Cnd.prsppl_grp_cd9", p);
		p.Cnd_prsppl_grp_nm9 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_prsppl_grp_nm9.addAliasName("Cnd.prsppl_grp_nm9", p);
		p.Cnd_prsppl_grp_lab10 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_prsppl_grp_lab10.addAliasName("Cnd.prsppl_grp_lab10", p);
		p.Cnd_prsppl_grp_flg10 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_prsppl_grp_flg10.addAliasName("Cnd.prsppl_grp_flg10", p);
		p.Cnd_prsppl_grp_cd10 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_prsppl_grp_cd10.addAliasName("Cnd.prsppl_grp_cd10", p);
		p.Cnd_prsppl_grp_nm10 = p.Cnd_prsppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_prsppl_grp_nm10.addAliasName("Cnd.prsppl_grp_nm10", p);
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
	protected static void jbCreateCtrl(MSBEP_ProvDtlModReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [BulkSetTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSetTab(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [UpriXrate]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpriXrate(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [UpriBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpriBulkSet(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [XrateBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateXrateBulkSet(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [TaxBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTaxBulkSet(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_ProvDtlModReg p) {
		p.Dtl_arr_acr_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$arr_acr_tm_p);
		p.Dtl_arr_acr_tm_p_PPanel.setName("Dtl.arr_acr_tm_p");
		p.columnDtl_arr_act_dt = p.Dtl_arr_acr_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_arr_act_dt.addAliasName("Dtl.arr_act_dt", p);
		p.columnDtl_arr_act_hm = p.Dtl_arr_acr_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_arr_act_hm.addAliasName("Dtl.arr_act_hm", p);
		p.Dtl_arr_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$arr_schd_tm_p);
		p.Dtl_arr_schd_tm_p_PPanel.setName("Dtl.arr_schd_tm_p");
		p.columnDtl_arr_schd_dt = p.Dtl_arr_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_arr_schd_dt.addAliasName("Dtl.arr_schd_dt", p);
		p.columnDtl_arr_schd_hm = p.Dtl_arr_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_arr_schd_hm.addAliasName("Dtl.arr_schd_hm", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$itm_p);
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
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$sno_wrk_no_p);
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
		p.Dtl_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$schd_qty_p);
		p.Dtl_schd_qty_p_PPanel.setName("Dtl.schd_qty_p");
		p.columnDtl_schd_qty = p.Dtl_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_schd_qty.addAliasName("Dtl.schd_qty", p);
		p.Dtl_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$act_qty_p);
		p.Dtl_act_qty_p_PPanel.setName("Dtl.act_qty_p");
		p.columnDtl_act_qty = p.Dtl_act_qty_p_PPanel.columnQty_qty;
		p.columnDtl_act_qty.addAliasName("Dtl.act_qty", p);
		p.Dtl_trd_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$trd_upri_amt_p);
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
		p.Dtl_old_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$old_trd_cur_upri_p);
		p.Dtl_old_trd_cur_upri_p_PPanel.setName("Dtl.old_trd_cur_upri_p");
		p.columnDtl_old_trd_cur_upri = p.Dtl_old_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_upri.addAliasName("Dtl.old_trd_cur_upri", p);
		p.Dtl_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$xrate_p);
		p.Dtl_xrate_p_PPanel.setName("Dtl.xrate_p");
		p.columnDtl_xrate = p.Dtl_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_xrate.addAliasName("Dtl.xrate", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$wtax_amt_p);
		p.Dtl_wtax_amt_p_PPanel.setName("Dtl.wtax_amt_p");
		p.columnDtl_wtax_amt = p.Dtl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_wtax_amt.addAliasName("Dtl.wtax_amt", p);
		p.Dtl_prsppl_Grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$prsppl_Grp_p);
		p.Dtl_prsppl_Grp_p_PPanel.setName("Dtl.prsppl_Grp_p");
		p.columnDtl_prsppl_grp_cd1 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_prsppl_grp_cd1.addAliasName("Dtl.prsppl_grp_cd1", p);
		p.columnDtl_prsppl_grp_nm1 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_prsppl_grp_nm1.addAliasName("Dtl.prsppl_grp_nm1", p);
		p.columnDtl_prsppl_grp_cd2 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_prsppl_grp_cd2.addAliasName("Dtl.prsppl_grp_cd2", p);
		p.columnDtl_prsppl_grp_nm2 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_prsppl_grp_nm2.addAliasName("Dtl.prsppl_grp_nm2", p);
		p.columnDtl_prsppl_grp_cd3 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_prsppl_grp_cd3.addAliasName("Dtl.prsppl_grp_cd3", p);
		p.columnDtl_prsppl_grp_nm3 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_prsppl_grp_nm3.addAliasName("Dtl.prsppl_grp_nm3", p);
		p.columnDtl_prsppl_grp_cd4 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_prsppl_grp_cd4.addAliasName("Dtl.prsppl_grp_cd4", p);
		p.columnDtl_prsppl_grp_nm4 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_prsppl_grp_nm4.addAliasName("Dtl.prsppl_grp_nm4", p);
		p.columnDtl_prsppl_grp_cd5 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_prsppl_grp_cd5.addAliasName("Dtl.prsppl_grp_cd5", p);
		p.columnDtl_prsppl_grp_nm5 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_prsppl_grp_nm5.addAliasName("Dtl.prsppl_grp_nm5", p);
		p.columnDtl_prsppl_grp_cd6 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_prsppl_grp_cd6.addAliasName("Dtl.prsppl_grp_cd6", p);
		p.columnDtl_prsppl_grp_nm6 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_prsppl_grp_nm6.addAliasName("Dtl.prsppl_grp_nm6", p);
		p.columnDtl_prsppl_grp_cd7 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_prsppl_grp_cd7.addAliasName("Dtl.prsppl_grp_cd7", p);
		p.columnDtl_prsppl_grp_nm7 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_prsppl_grp_nm7.addAliasName("Dtl.prsppl_grp_nm7", p);
		p.columnDtl_prsppl_grp_cd8 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_prsppl_grp_cd8.addAliasName("Dtl.prsppl_grp_cd8", p);
		p.columnDtl_prsppl_grp_nm8 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_prsppl_grp_nm8.addAliasName("Dtl.prsppl_grp_nm8", p);
		p.columnDtl_prsppl_grp_cd9 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_prsppl_grp_cd9.addAliasName("Dtl.prsppl_grp_cd9", p);
		p.columnDtl_prsppl_grp_nm9 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_prsppl_grp_nm9.addAliasName("Dtl.prsppl_grp_nm9", p);
		p.columnDtl_prsppl_grp_cd10 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_prsppl_grp_cd10.addAliasName("Dtl.prsppl_grp_cd10", p);
		p.columnDtl_prsppl_grp_nm10 = p.Dtl_prsppl_Grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_prsppl_grp_nm10.addAliasName("Dtl.prsppl_grp_nm10", p);
		p.Dtl_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$itm_grp_p);
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
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1160.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBEP_ProvDtlModReg p) {
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
	
	
	/** [Cnd_prsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_cd_p = null;

	/**
	 * [Cnd_prsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_cd_ListPutter() {
		if (Cnd_prsppl_cd_p == null) {
			Cnd_prsppl_cd_p = createCnd_prsppl_cd_ListPutter(Cnd_prsppl_cd, "prsppl_cd", "prsppl_nm");

		}
		return Cnd_prsppl_cd_p;
	}
	
	
	/** [Cnd_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_dpt_cd_p = null;

	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_dpt_cd_ListPutter() {
		if (Cnd_ap_dpt_cd_p == null) {
			Cnd_ap_dpt_cd_p = createCnd_ap_dpt_cd_ListPutter(Cnd_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Cnd_ap_dpt_cd_p;
	}
	
	
	/** [Cnd_prsppl_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_loc_cd_p = null;

	/**
	 * [Cnd_prsppl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_loc_cd_ListPutter() {
		if (Cnd_prsppl_loc_cd_p == null) {
			Cnd_prsppl_loc_cd_p = createCnd_prsppl_loc_cd_ListPutter(Cnd_prsppl_loc_cd, "prsppl_loc_cd", "prsppl_loc_nm");

		}
		return Cnd_prsppl_loc_cd_p;
	}
	
	
	/** [Cnd_prsppl_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_str_ln_cd_p = null;

	/**
	 * [Cnd_prsppl_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_str_ln_cd_ListPutter() {
		if (Cnd_prsppl_str_ln_cd_p == null) {
			Cnd_prsppl_str_ln_cd_p = createCnd_prsppl_str_ln_cd_ListPutter(Cnd_prsppl_str_ln_cd, "prsppl_str_ln_cd", "prsppl_str_ln_nm");

		}
		return Cnd_prsppl_str_ln_cd_p;
	}
	
	
	/** [Cnd_prsppl_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_wg_cd_p = null;

	/**
	 * [Cnd_prsppl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_wg_cd_ListPutter() {
		if (Cnd_prsppl_wg_cd_p == null) {
			Cnd_prsppl_wg_cd_p = createCnd_prsppl_wg_cd_ListPutter(Cnd_prsppl_wg_cd, "prsppl_wg_cd", "prsppl_wg_nm");

		}
		return Cnd_prsppl_wg_cd_p;
	}
	
	
	/** [Cnd_prsppl_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_lg_grp_cd_p = null;

	/**
	 * [Cnd_prsppl_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_lg_grp_cd_ListPutter() {
		if (Cnd_prsppl_lg_grp_cd_p == null) {
			Cnd_prsppl_lg_grp_cd_p = createCnd_prsppl_lg_grp_cd_ListPutter(Cnd_prsppl_lg_grp_cd, "prsppl_lg_grp_cd", "prsppl_lg_grp_nm");

		}
		return Cnd_prsppl_lg_grp_cd_p;
	}
	
	
	/** [Cnd_prsppl_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_site_cd_p = null;

	/**
	 * [Cnd_prsppl_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_site_cd_ListPutter() {
		if (Cnd_prsppl_site_cd_p == null) {
			Cnd_prsppl_site_cd_p = createCnd_prsppl_site_cd_ListPutter(Cnd_prsppl_site_cd, "prsppl_site_cd", "prsppl_site_nm");

		}
		return Cnd_prsppl_site_cd_p;
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
	
	
	/** [Cnd_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_id_typ_p = null;

	/**
	 * [Cnd_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_id_typ_ListPutter() {
		if (Cnd_stk_id_typ_p == null) {
			Cnd_stk_id_typ_p = createCnd_stk_id_typ_ListPutter(Cnd_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Cnd_stk_id_typ_p;
	}
	
	
	/** [Cnd_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prov_basis_typ_p = null;

	/**
	 * [Cnd_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_basis_typ_ListPutter() {
		if (Cnd_prov_basis_typ_p == null) {
			Cnd_prov_basis_typ_p = createCnd_prov_basis_typ_ListPutter(Cnd_prov_basis_typ, "prov_basis_typ", "prov_basis_typ_nm");

		}
		return Cnd_prov_basis_typ_p;
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
	
	
	/** [Cnd_prov_src_act_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prov_src_act_typ_p = null;

	/**
	 * [Cnd_prov_src_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_src_act_typ_ListPutter() {
		if (Cnd_prov_src_act_typ_p == null) {
			Cnd_prov_src_act_typ_p = createCnd_prov_src_act_typ_ListPutter(Cnd_prov_src_act_typ, "prov_src_act_typ", "prov_src_act_typ_nm");

		}
		return Cnd_prov_src_act_typ_p;
	}
	
	
	/** [Cnd_prov_src_schd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prov_src_schd_typ_p = null;

	/**
	 * [Cnd_prov_src_schd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_src_schd_typ_ListPutter() {
		if (Cnd_prov_src_schd_typ_p == null) {
			Cnd_prov_src_schd_typ_p = createCnd_prov_src_schd_typ_ListPutter(Cnd_prov_src_schd_typ, "prov_src_schd_typ", "prov_src_schd_typ_nm");

		}
		return Cnd_prov_src_schd_typ_p;
	}
	
	
	/** [Dtl_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ap_dpt_cd_p = null;

	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_dpt_cd_ListPutter() {
		if (Dtl_ap_dpt_cd_p == null) {
			Dtl_ap_dpt_cd_p = createDtl_ap_dpt_cd_ListPutter(columnDtl_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Dtl_ap_dpt_cd_p;
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
	
	
	/** [Dtl_xfr_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_xfr_rsn_cd_p = null;

	/**
	 * [Dtl_xfr_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_xfr_rsn_cd_ListPutter() {
		if (Dtl_xfr_rsn_cd_p == null) {
			Dtl_xfr_rsn_cd_p = createDtl_xfr_rsn_cd_ListPutter(columnDtl_xfr_rsn_cd, "xfr_rsn_cd", "xfr_rsn_nm","acxfr_gi_flg");

		}
		return Dtl_xfr_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ProvDtlModReg create(){
		MSBEP_ProvDtlModReg p = new MSBEP_ProvDtlModReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ProvDtlModReg create(String name){
		MSBEP_ProvDtlModReg p = new MSBEP_ProvDtlModReg(name);
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
		MSBEP_ProvDtlModReg_MC.jbfInitScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitSrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitTop((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitFold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitTab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitTab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitTab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitSubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitDlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitPrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitCnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitCtrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitRPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitBulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitUpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitUpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitXrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitTaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitDtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitBtn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbfInitEdi((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitSrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitTop((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitFold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitTab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitTab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitTab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitSubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitDlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitPrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitCnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitCtrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitRPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitBulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitUpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitUpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitXrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitTaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitDtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitBtn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.jbInitEdi((MSBEP_ProvDtlModReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchTyp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.SrchTypPanel = p.beansFactory.createPanel("SrchTyp");
		p.SrchTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ProvDtlModReg p) {
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
	protected static void jbfInitTab1(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [ProvTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProvTyp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.ProvTypPanel = p.beansFactory.createPanel("ProvTyp");
		p.ProvTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SubconSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSubconSts(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.SubconStsPanel = p.beansFactory.createPanel("SubconSts");
		p.SubconStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvPrnt(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.DlvPrntPanel = p.beansFactory.createPanel("DlvPrnt");
		p.DlvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrspplGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrspplGrp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.PrspplGrpPanel = p.beansFactory.createPanel("PrspplGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF_ACT = p.beansFactory.createRadioButton("Cnd.ope_REF_ACT");
		p.Cnd_ope_REF_SCHD = p.beansFactory.createRadioButton("Cnd.ope_REF_SCHD");
		p.Cnd_prov = p.beansFactory.createCheckBox("Cnd.prov");
		p.Cnd_prov_rtn = p.beansFactory.createCheckBox("Cnd.prov_rtn");
		p.Cnd_ffr_prov_flg = p.beansFactory.createCheckBox("Cnd.ffr_prov_flg");
		p.Cnd_onr_prov_flg = p.beansFactory.createCheckBox("Cnd.onr_prov_flg");
		p.Cnd_subcon_flg = p.beansFactory.createCheckBox("Cnd.subcon_flg");
		p.Cnd_not_subcon_flg = p.beansFactory.createCheckBox("Cnd.not_subcon_flg");
		p.Cnd_dlv_not_prnted = p.beansFactory.createCheckBox("Cnd.dlv_not_prnted");
		p.Cnd_dlv_prnted = p.beansFactory.createCheckBox("Cnd.dlv_prnted");
		p.Cnd_on_edi_flg = p.beansFactory.createCheckBox("Cnd.on_edi_flg");
		p.Cnd_off_edi_flg = p.beansFactory.createCheckBox("Cnd.off_edi_flg");
		p.Cnd_accpt_dt_fr_Label = p.beansFactory.createLabel("Cnd.accpt_dt_fr_Label");
		p.Cnd_accpt_dt_fr = p.beansFactory.createDateField("Cnd.accpt_dt_fr");
		p.Cnd_accpt_dt_fr.setLabel(p.Cnd_accpt_dt_fr_Label);
		p.Cnd_accpt_dt_to_Label = p.beansFactory.createLabel("Cnd.accpt_dt_to_Label");
		p.Cnd_accpt_dt_to = p.beansFactory.createDateField("Cnd.accpt_dt_to");
		p.Cnd_accpt_dt_to.setLabel(p.Cnd_accpt_dt_to_Label);
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
		p.Cnd_accpt_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.accpt_schd_dt_fr_Label");
		p.Cnd_accpt_schd_dt_fr = p.beansFactory.createDateField("Cnd.accpt_schd_dt_fr");
		p.Cnd_accpt_schd_dt_fr.setLabel(p.Cnd_accpt_schd_dt_fr_Label);
		p.Cnd_accpt_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.accpt_schd_dt_to_Label");
		p.Cnd_accpt_schd_dt_to = p.beansFactory.createDateField("Cnd.accpt_schd_dt_to");
		p.Cnd_accpt_schd_dt_to.setLabel(p.Cnd_accpt_schd_dt_to_Label);
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_prsppl_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_cd_Label");
		p.Cnd_prsppl_cd = p.beansFactory.createTextField("Cnd.prsppl_cd");
		p.Cnd_prsppl_cd.setLabel(p.Cnd_prsppl_cd_Label);
		p.Cnd_prsppl_nm = p.beansFactory.createTextField("Cnd.prsppl_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_prsppl_loc_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_loc_cd_Label");
		p.Cnd_prsppl_loc_cd = p.beansFactory.createTextField("Cnd.prsppl_loc_cd");
		p.Cnd_prsppl_loc_cd.setLabel(p.Cnd_prsppl_loc_cd_Label);
		p.Cnd_prsppl_loc_nm = p.beansFactory.createTextField("Cnd.prsppl_loc_nm");
		p.Cnd_prsppl_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_str_ln_cd_Label");
		p.Cnd_prsppl_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.prsppl_str_ln_cd");
		p.Cnd_prsppl_str_ln_cd.setLabel(p.Cnd_prsppl_str_ln_cd_Label);
		p.Cnd_prsppl_str_ln_nm = p.beansFactory.createTextField("Cnd.prsppl_str_ln_nm");
		p.Cnd_prsppl_wg_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_wg_cd_Label");
		p.Cnd_prsppl_wg_cd = p.beansFactory.createTextComboBox("Cnd.prsppl_wg_cd");
		p.Cnd_prsppl_wg_cd.setLabel(p.Cnd_prsppl_wg_cd_Label);
		p.Cnd_prsppl_wg_nm = p.beansFactory.createTextField("Cnd.prsppl_wg_nm");
		p.Cnd_prsppl_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_lg_grp_cd_Label");
		p.Cnd_prsppl_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.prsppl_lg_grp_cd");
		p.Cnd_prsppl_lg_grp_cd.setLabel(p.Cnd_prsppl_lg_grp_cd_Label);
		p.Cnd_prsppl_lg_grp_nm = p.beansFactory.createTextField("Cnd.prsppl_lg_grp_nm");
		p.Cnd_prsppl_site_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_site_cd_Label");
		p.Cnd_prsppl_site_cd = p.beansFactory.createTextComboBox("Cnd.prsppl_site_cd");
		p.Cnd_prsppl_site_cd.setLabel(p.Cnd_prsppl_site_cd_Label);
		p.Cnd_prsppl_site_nm = p.beansFactory.createTextField("Cnd.prsppl_site_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_stk_id_typ_Label = p.beansFactory.createLabel("Cnd.stk_id_typ_Label");
		p.Cnd_stk_id_typ = p.beansFactory.createTextComboBox("Cnd.stk_id_typ");
		p.Cnd_stk_id_typ.setLabel(p.Cnd_stk_id_typ_Label);
		p.Cnd_stk_id_typ_nm = p.beansFactory.createTextField("Cnd.stk_id_typ_nm");
		p.Cnd_prov_basis_typ_Label = p.beansFactory.createLabel("Cnd.prov_basis_typ_Label");
		p.Cnd_prov_basis_typ = p.beansFactory.createTextComboBox("Cnd.prov_basis_typ");
		p.Cnd_prov_basis_typ.setLabel(p.Cnd_prov_basis_typ_Label);
		p.Cnd_prov_basis_typ_nm = p.beansFactory.createTextField("Cnd.prov_basis_typ_nm");
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_dlv_slip_d_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_d_no_Label");
		p.Cnd_dlv_slip_d_no = p.beansFactory.createTextField("Cnd.dlv_slip_d_no");
		p.Cnd_dlv_slip_d_no.setLabel(p.Cnd_dlv_slip_d_no_Label);
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_foreign_flg = p.beansFactory.createCheckBox("Cnd.foreign_flg");
		p.Cnd_tax_cd_Label = p.beansFactory.createLabel("Cnd.tax_cd_Label");
		p.Cnd_tax_cd = p.beansFactory.createTextComboBox("Cnd.tax_cd");
		p.Cnd_tax_cd.setLabel(p.Cnd_tax_cd_Label);
		p.Cnd_tax_nm = p.beansFactory.createTextField("Cnd.tax_nm");
		p.Cnd_prov_src_act_typ_Label = p.beansFactory.createLabel("Cnd.prov_src_act_typ_Label");
		p.Cnd_prov_src_act_typ = p.beansFactory.createTextComboBox("Cnd.prov_src_act_typ");
		p.Cnd_prov_src_act_typ.setLabel(p.Cnd_prov_src_act_typ_Label);
		p.Cnd_prov_src_act_typ_nm = p.beansFactory.createTextField("Cnd.prov_src_act_typ_nm");
		p.Cnd_prov_src_act_no_Label = p.beansFactory.createLabel("Cnd.prov_src_act_no_Label");
		p.Cnd_prov_src_act_no = p.beansFactory.createTextField("Cnd.prov_src_act_no");
		p.Cnd_prov_src_act_no.setLabel(p.Cnd_prov_src_act_no_Label);
		p.Cnd_prov_act_no_Label = p.beansFactory.createLabel("Cnd.prov_act_no_Label");
		p.Cnd_prov_act_no = p.beansFactory.createTextField("Cnd.prov_act_no");
		p.Cnd_prov_act_no.setLabel(p.Cnd_prov_act_no_Label);
		p.Cnd_prov_src_schd_typ_Label = p.beansFactory.createLabel("Cnd.prov_src_schd_typ_Label");
		p.Cnd_prov_src_schd_typ = p.beansFactory.createTextComboBox("Cnd.prov_src_schd_typ");
		p.Cnd_prov_src_schd_typ.setLabel(p.Cnd_prov_src_schd_typ_Label);
		p.Cnd_prov_src_schd_typ_nm = p.beansFactory.createTextField("Cnd.prov_src_schd_typ_nm");
		p.Cnd_prov_src_schd_no1_Label = p.beansFactory.createLabel("Cnd.prov_src_schd_no1_Label");
		p.Cnd_prov_src_schd_no1 = p.beansFactory.createTextField("Cnd.prov_src_schd_no1");
		p.Cnd_prov_src_schd_no1.setLabel(p.Cnd_prov_src_schd_no1_Label);
		p.Cnd_prov_src_schd_no2_Label = p.beansFactory.createLabel("Cnd.prov_src_schd_no2_Label");
		p.Cnd_prov_src_schd_no2 = p.beansFactory.createTextField("Cnd.prov_src_schd_no2");
		p.Cnd_prov_src_schd_no2.setLabel(p.Cnd_prov_src_schd_no2_Label);
		p.Cnd_prov_schd_no_Label = p.beansFactory.createLabel("Cnd.prov_schd_no_Label");
		p.Cnd_prov_schd_no = p.beansFactory.createTextField("Cnd.prov_schd_no");
		p.Cnd_prov_schd_no.setLabel(p.Cnd_prov_schd_no_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
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
		p.Cnd_dis_can_disp_flg = p.beansFactory.createCheckBox("Cnd.dis_can_disp_flg");
		p.Cnd_sign_rev_flg = p.beansFactory.createCheckBox("Cnd.sign_rev_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSetTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSetTab(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.BulkSetTabPanel = p.beansFactory.createPanel("BulkSetTab");
		p.BulkSetTabTab = p.beansFactory.createTabbedPane("BulkSetTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [UpriXrate]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpriXrate(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.UpriXratePanel = p.beansFactory.createPanel("UpriXrate");
		// ブロックの項目の初期化
	}

	/**
	 * [UpriBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpriBulkSet(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.UpriBulkSetPanel = p.beansFactory.createPanel("UpriBulkSet");
		p.UpriBulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.UpriBulkSet_upri_dt_Label = p.beansFactory.createLabel("UpriBulkSet.upri_dt_Label");
		p.UpriBulkSet_upri_dt = p.beansFactory.createDateField("UpriBulkSet.upri_dt");
		p.UpriBulkSet_upri_dt.setLabel(p.UpriBulkSet_upri_dt_Label);
		p.UpriBulkSet_upri_replace = p.beansFactory.createButton("UpriBulkSet.upri_replace");
	}

	/**
	 * [XrateBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitXrateBulkSet(MSBEP_ProvDtlModReg p) {
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
	protected static void jbfInitTaxBulkSet(MSBEP_ProvDtlModReg p) {
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
	protected static void jbfInitDtl(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_accpt_dt = p.beansFactory.createTableColumn("Dtl.accpt_dt", MCColumnType.DATE);
		p.columnDtl_ac_ym = p.beansFactory.createTableColumn("Dtl.ac_ym", MCColumnType.DATE);
		p.columnDtl_ac_dt = p.beansFactory.createTableColumn("Dtl.ac_dt", MCColumnType.DATE);
		p.columnDtl_base_ac_dt = p.beansFactory.createTableColumn("Dtl.base_ac_dt", MCColumnType.DATE);
		p.columnDtl_can_ac_dt = p.beansFactory.createTableColumn("Dtl.can_ac_dt", MCColumnType.DATE);
		p.columnDtl_accpt_schd_dt = p.beansFactory.createTableColumn("Dtl.accpt_schd_dt", MCColumnType.DATE);
		p.columnDtl_prsppl_cd = p.beansFactory.createTableColumn("Dtl.prsppl_cd", MCColumnType.TEXT);
		p.columnDtl_prsppl_nm = p.beansFactory.createTableColumn("Dtl.prsppl_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_prsppl_loc_cd = p.beansFactory.createTableColumn("Dtl.prsppl_loc_cd", MCColumnType.TEXT);
		p.columnDtl_prsppl_loc_nm = p.beansFactory.createTableColumn("Dtl.prsppl_loc_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd = p.beansFactory.createTableColumn("Dtl.str_ln_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_nm = p.beansFactory.createTableColumn("Dtl.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Dtl.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnDtl_prsppl_wg_cd = p.beansFactory.createTableColumn("Dtl.prsppl_wg_cd", MCColumnType.TEXT);
		p.columnDtl_prsppl_wg_nm = p.beansFactory.createTableColumn("Dtl.prsppl_wg_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_no = p.beansFactory.createTableColumn("Dtl.lot_no", MCColumnType.TEXT);
		p.columnDtl_sublot_no = p.beansFactory.createTableColumn("Dtl.sublot_no", MCColumnType.TEXT);
		p.columnDtl_ver_no = p.beansFactory.createTableColumn("Dtl.ver_no", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ = p.beansFactory.createTableColumn("Dtl.stk_id_typ", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_prov_typ = p.beansFactory.createTableColumn("Dtl.prov_typ", MCColumnType.TEXT);
		p.columnDtl_prov_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prov_basis_typ = p.beansFactory.createTableColumn("Dtl.prov_basis_typ", MCColumnType.TEXT);
		p.columnDtl_prov_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_base_cur_cd = p.beansFactory.createTableColumn("Dtl.base_cur_cd", MCColumnType.TEXT);
		p.columnDtl_base_cur_nm = p.beansFactory.createTableColumn("Dtl.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl_xrate_cd = p.beansFactory.createTableColumn("Dtl.xrate_cd", MCColumnType.TEXT);
		p.columnDtl_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl.ptax_cur_cd", MCColumnType.TEXT);
		p.columnDtl_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl_ptax_xrate = p.beansFactory.createTableColumn("Dtl.ptax_xrate", MCColumnType.NUMBER);
		p.columnDtl_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_xfr_rsn_cd = p.beansFactory.createTableColumn("Dtl.xfr_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_xfr_rsn_nm = p.beansFactory.createTableColumn("Dtl.xfr_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_acxfr_gi_flg = p.beansFactory.createTableColumn("Dtl.acxfr_gi_flg", MCColumnType.CHECK);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_prnted_flg = p.beansFactory.createTableColumn("Dtl.dlv_prnted_flg", MCColumnType.CHECK);
		p.columnDtl_prov_src_act_typ = p.beansFactory.createTableColumn("Dtl.prov_src_act_typ", MCColumnType.TEXT);
		p.columnDtl_prov_src_act_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_src_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prov_src_act_no = p.beansFactory.createTableColumn("Dtl.prov_src_act_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_no = p.beansFactory.createTableColumn("Dtl.purc_act_no", MCColumnType.TEXT);
		p.columnDtl_purc_ret_act_no = p.beansFactory.createTableColumn("Dtl.purc_ret_act_no", MCColumnType.TEXT);
		p.columnDtl_mfg_act_no = p.beansFactory.createTableColumn("Dtl.mfg_act_no", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_prov_act_no = p.beansFactory.createTableColumn("Dtl.prov_act_no", MCColumnType.TEXT);
		p.columnDtl_prov_act_rev = p.beansFactory.createTableColumn("Dtl.prov_act_rev", MCColumnType.NUMBER);
		p.columnDtl_edi_flg = p.beansFactory.createTableColumn("Dtl.edi_flg", MCColumnType.CHECK);
		p.columnDtl_iv_trd_flg = p.beansFactory.createTableColumn("Dtl.iv_trd_flg", MCColumnType.CHECK);
		p.columnDtl_prov_src_schd_typ = p.beansFactory.createTableColumn("Dtl.prov_src_schd_typ", MCColumnType.TEXT);
		p.columnDtl_prov_src_schd_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_src_schd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prov_src_schd_no1 = p.beansFactory.createTableColumn("Dtl.prov_src_schd_no1", MCColumnType.TEXT);
		p.columnDtl_prov_src_schd_no2 = p.beansFactory.createTableColumn("Dtl.prov_src_schd_no2", MCColumnType.TEXT);
		p.columnDtl_prov_schd_no = p.beansFactory.createTableColumn("Dtl.prov_schd_no", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
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
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_prov_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.prov_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_prov_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.prov_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_xrate_rnd_typ = p.beansFactory.createTableColumn("Dtl.xrate_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_wtax_rnd_typ = p.beansFactory.createTableColumn("Dtl.wtax_rnd_typ", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_prnt_out_flg = p.beansFactory.createCheckBox("Btn.prnt_out_flg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.SrchTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchTyp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.SrchTypPanel.setBorder(p.SrchTypTitledBorder);
		p.add(p.SrchTypPanel);
		p.SrchTypPanel.setNextBeans(p.TopPanel);
		p.SrchTypPanel.setValueCheck(false);
		p.SrchTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchTypPanel.setLayoutPosition("NNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitFold(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitTab1(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.ProvTypPanel, null);
		p.Tab1Panel.setLastBeans(p.ProvTypPanel);
		p.ProvTypPanel.setNextBeans(p.SubconStsPanel);
		p.Tab1Panel.add(p.SubconStsPanel, null);
		p.SubconStsPanel.setNextBeans(p.DlvPrntPanel);
		p.Tab1Panel.add(p.DlvPrntPanel, null);
		p.DlvPrntPanel.setNextBeans(p.EdiPanel);
		p.Tab1Panel.add(p.EdiPanel, null);
		p.EdiPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.PrspplGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.PrspplGrpPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.ItmGrpPanel, null);
		p.Tab3Panel.setLastBeans(p.ItmGrpPanel);
	}

	/**
	 * [ProvTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProvTyp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.ProvTypPanel.setBorder(p.ProvTypTitledBorder);
		p.ProvTypPanel.setValueCheck(false);
		p.ProvTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ProvTypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SubconSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSubconSts(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.SubconStsPanel.setBorder(p.SubconStsTitledBorder);
		p.SubconStsPanel.setValueCheck(false);
		p.SubconStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SubconStsPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvPrnt(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.DlvPrntPanel.setBorder(p.DlvPrntTitledBorder);
		p.DlvPrntPanel.setValueCheck(false);
		p.DlvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvPrntPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PrspplGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrspplGrp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ProvDtlModReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_REF_ACT);
		p.Cnd_ope_REF_ACT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF_ACT);
		p.ScreenOpePanel.add(p.Cnd_ope_REF_ACT);
		p.Cnd_ope_REF_ACT.setNextBeans(p.Cnd_ope_REF_SCHD);
		p.Cnd_ope_REF_SCHD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF_SCHD);
		p.ScreenOpePanel.add(p.Cnd_ope_REF_SCHD);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ope_META);
		p.SrchTypPanel.add(p.Cnd_prov);
		p.SrchTypPanel.setLastBeans(p.Cnd_prov);
		p.Cnd_prov.setNextBeans(p.Cnd_prov_rtn);
		p.Cnd_prov.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_META);
		p.SrchTypPanel.add(p.Cnd_prov_rtn);
		p.Cnd_prov_rtn.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_rtn_META);
		p.ProvTypPanel.add(p.Cnd_ffr_prov_flg);
		p.ProvTypPanel.setLastBeans(p.Cnd_ffr_prov_flg);
		p.Cnd_ffr_prov_flg.setNextBeans(p.Cnd_onr_prov_flg);
		p.Cnd_ffr_prov_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ffr_prov_flg_META);
		p.ProvTypPanel.add(p.Cnd_onr_prov_flg);
		p.Cnd_onr_prov_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.onr_prov_flg_META);
		p.SubconStsPanel.add(p.Cnd_subcon_flg);
		p.SubconStsPanel.setLastBeans(p.Cnd_subcon_flg);
		p.Cnd_subcon_flg.setNextBeans(p.Cnd_not_subcon_flg);
		p.Cnd_subcon_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.subcon_flg_META);
		p.SubconStsPanel.add(p.Cnd_not_subcon_flg);
		p.Cnd_not_subcon_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.not_subcon_flg_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_not_prnted);
		p.DlvPrntPanel.setLastBeans(p.Cnd_dlv_not_prnted);
		p.Cnd_dlv_not_prnted.setNextBeans(p.Cnd_dlv_prnted);
		p.Cnd_dlv_not_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.dlv_not_prnted_META);
		p.DlvPrntPanel.add(p.Cnd_dlv_prnted);
		p.Cnd_dlv_prnted.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.dlv_prnted_META);
		p.EdiPanel.add(p.Cnd_on_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_on_edi_flg);
		p.Cnd_on_edi_flg.setNextBeans(p.Cnd_off_edi_flg);
		p.Cnd_on_edi_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.on_edi_flg_META);
		p.EdiPanel.add(p.Cnd_off_edi_flg);
		p.Cnd_off_edi_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.off_edi_flg_META);
		p.CndPanel.add(p.Cnd_accpt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_accpt_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_accpt_dt_fr);
		p.Cnd_accpt_dt_fr.setNextBeans(p.Cnd_accpt_dt_to);
		p.Cnd_accpt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.accpt_dt_fr_META);
		p.Cnd_accpt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_accpt_dt_to_Label);
		p.CndPanel.add(p.Cnd_accpt_dt_to);
		p.Cnd_accpt_dt_to.setNextBeans(p.Cnd_ac_ym_fr);
		p.Cnd_accpt_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.accpt_dt_to_META);
		p.Cnd_accpt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_arr_act_dt_p_PPanel);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_arr_act_dt_p_PPanel);
		p.Cnd_arr_act_dt_p_PPanel.setNextBeans(p.Cnd_accpt_schd_dt_fr);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_fr);
		p.Cnd_accpt_schd_dt_fr.setNextBeans(p.Cnd_accpt_schd_dt_to);
		p.Cnd_accpt_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.accpt_schd_dt_fr_META);
		p.Cnd_accpt_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_to);
		p.Cnd_accpt_schd_dt_to.setNextBeans(p.Cnd_arr_schd_dt_p_PPanel);
		p.Cnd_accpt_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.accpt_schd_dt_to_META);
		p.Cnd_accpt_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_arr_schd_dt_p_PPanel);
		p.Cnd_arr_schd_dt_p_PPanel.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_prsppl_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_prsppl_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_cd);
		p.Cnd_prsppl_cd.setNextBeans(p.Cnd_prsppl_nm);
		p.Cnd_prsppl_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_cd_META);
		p.Cnd_prsppl_cd.addLinkBeans(p.Cnd_prsppl_nm);
		p.Cnd_prsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_cd, true);
		p.CndPanel.add(p.Cnd_prsppl_nm);
		p.Cnd_prsppl_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_prsppl_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_nm, true);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_prsppl_loc_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.CndPanel.add(p.Cnd_prsppl_loc_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_loc_cd);
		p.Cnd_prsppl_loc_cd.setNextBeans(p.Cnd_prsppl_loc_nm);
		p.Cnd_prsppl_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_loc_cd_META);
		p.Cnd_prsppl_loc_cd.addLinkBeans(p.Cnd_prsppl_loc_nm);
		p.Cnd_prsppl_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_loc_cd, true);
		p.CndPanel.add(p.Cnd_prsppl_loc_nm);
		p.Cnd_prsppl_loc_nm.setNextBeans(p.Cnd_prsppl_str_ln_cd);
		p.Cnd_prsppl_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_loc_nm, true);
		p.Cnd_prsppl_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_str_ln_cd, true);
		p.Cnd_prsppl_str_ln_cd.setLinkBeans(p.Cnd_prsppl_str_ln_nm);
		p.CndPanel.add(p.Cnd_prsppl_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_str_ln_cd);
		p.Cnd_prsppl_str_ln_cd.setNextBeans(p.Cnd_prsppl_str_ln_nm);
		p.Cnd_prsppl_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_prsppl_str_ln_nm);
		p.Cnd_prsppl_str_ln_nm.setNextBeans(p.Cnd_prsppl_wg_cd);
		p.Cnd_prsppl_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_str_ln_nm, true);
		p.Cnd_prsppl_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_wg_cd, true);
		p.Cnd_prsppl_wg_cd.setLinkBeans(p.Cnd_prsppl_wg_nm);
		p.CndPanel.add(p.Cnd_prsppl_wg_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_wg_cd);
		p.Cnd_prsppl_wg_cd.setNextBeans(p.Cnd_prsppl_wg_nm);
		p.Cnd_prsppl_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_wg_cd_META);
		p.CndPanel.add(p.Cnd_prsppl_wg_nm);
		p.Cnd_prsppl_wg_nm.setNextBeans(p.Cnd_prsppl_lg_grp_cd);
		p.Cnd_prsppl_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_wg_nm, true);
		p.Cnd_prsppl_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_lg_grp_cd, true);
		p.Cnd_prsppl_lg_grp_cd.setLinkBeans(p.Cnd_prsppl_lg_grp_nm);
		p.CndPanel.add(p.Cnd_prsppl_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_lg_grp_cd);
		p.Cnd_prsppl_lg_grp_cd.setNextBeans(p.Cnd_prsppl_lg_grp_nm);
		p.Cnd_prsppl_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_prsppl_lg_grp_nm);
		p.Cnd_prsppl_lg_grp_nm.setNextBeans(p.Cnd_prsppl_site_cd);
		p.Cnd_prsppl_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_lg_grp_nm, true);
		p.Cnd_prsppl_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_site_cd, true);
		p.Cnd_prsppl_site_cd.setLinkBeans(p.Cnd_prsppl_site_nm);
		p.CndPanel.add(p.Cnd_prsppl_site_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_site_cd);
		p.Cnd_prsppl_site_cd.setNextBeans(p.Cnd_prsppl_site_nm);
		p.Cnd_prsppl_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_site_cd_META);
		p.CndPanel.add(p.Cnd_prsppl_site_nm);
		p.Cnd_prsppl_site_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_prsppl_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prsppl_site_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_site_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
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
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_gd_cd);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_stk_id_typ);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.Cnd_stk_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_id_typ, true);
		p.Cnd_stk_id_typ.setLinkBeans(p.Cnd_stk_id_typ_nm);
		p.CndPanel.add(p.Cnd_stk_id_typ_Label);
		p.CndPanel.add(p.Cnd_stk_id_typ);
		p.Cnd_stk_id_typ.setNextBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.stk_id_typ_META);
		p.CndPanel.add(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ_nm.setNextBeans(p.Cnd_prov_basis_typ);
		p.Cnd_stk_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.stk_id_typ_nm_META);
		p.Cnd_prov_basis_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_basis_typ, true);
		p.Cnd_prov_basis_typ.setLinkBeans(p.Cnd_prov_basis_typ_nm);
		p.CndPanel.add(p.Cnd_prov_basis_typ_Label);
		p.CndPanel.add(p.Cnd_prov_basis_typ);
		p.Cnd_prov_basis_typ.setNextBeans(p.Cnd_prov_basis_typ_nm);
		p.Cnd_prov_basis_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_basis_typ_META);
		p.CndPanel.add(p.Cnd_prov_basis_typ_nm);
		p.Cnd_prov_basis_typ_nm.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_prov_basis_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_basis_typ_nm_META);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_dlv_slip_d_no);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_d_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_d_no);
		p.Cnd_dlv_slip_d_no.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_dlv_slip_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.dlv_slip_d_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_d_no, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_foreign_flg);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_foreign_flg);
		p.Cnd_foreign_flg.setNextBeans(p.Cnd_tax_cd);
		p.Cnd_foreign_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.foreign_flg_META);
		p.Cnd_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_cd, true);
		p.Cnd_tax_cd.setLinkBeans(p.Cnd_tax_nm);
		p.CndPanel.add(p.Cnd_tax_cd_Label);
		p.CndPanel.add(p.Cnd_tax_cd);
		p.Cnd_tax_cd.setNextBeans(p.Cnd_tax_nm);
		p.Cnd_tax_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.tax_cd_META);
		p.CndPanel.add(p.Cnd_tax_nm);
		p.Cnd_tax_nm.setNextBeans(p.Cnd_prov_src_act_typ);
		p.Cnd_tax_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.tax_nm_META);
		p.setPluralValueEnable(p.Cnd_tax_nm, true);
		p.Cnd_prov_src_act_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_src_act_typ, true);
		p.Cnd_prov_src_act_typ.setLinkBeans(p.Cnd_prov_src_act_typ_nm);
		p.CndPanel.add(p.Cnd_prov_src_act_typ_Label);
		p.CndPanel.add(p.Cnd_prov_src_act_typ);
		p.Cnd_prov_src_act_typ.setNextBeans(p.Cnd_prov_src_act_typ_nm);
		p.Cnd_prov_src_act_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_act_typ_META);
		p.CndPanel.add(p.Cnd_prov_src_act_typ_nm);
		p.Cnd_prov_src_act_typ_nm.setNextBeans(p.Cnd_prov_src_act_no);
		p.Cnd_prov_src_act_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_act_typ_nm_META);
		p.CndPanel.add(p.Cnd_prov_src_act_no_Label);
		p.CndPanel.add(p.Cnd_prov_src_act_no);
		p.Cnd_prov_src_act_no.setNextBeans(p.Cnd_prov_act_no);
		p.Cnd_prov_src_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_act_no_META);
		p.setPluralValueEnable(p.Cnd_prov_src_act_no, true);
		p.CndPanel.add(p.Cnd_prov_act_no_Label);
		p.CndPanel.add(p.Cnd_prov_act_no);
		p.Cnd_prov_act_no.setNextBeans(p.Cnd_prov_src_schd_typ);
		p.Cnd_prov_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_act_no_META);
		p.setPluralValueEnable(p.Cnd_prov_act_no, true);
		p.Cnd_prov_src_schd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_src_schd_typ, true);
		p.Cnd_prov_src_schd_typ.setLinkBeans(p.Cnd_prov_src_schd_typ_nm);
		p.CndPanel.add(p.Cnd_prov_src_schd_typ_Label);
		p.CndPanel.add(p.Cnd_prov_src_schd_typ);
		p.Cnd_prov_src_schd_typ.setNextBeans(p.Cnd_prov_src_schd_typ_nm);
		p.Cnd_prov_src_schd_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_schd_typ_META);
		p.CndPanel.add(p.Cnd_prov_src_schd_typ_nm);
		p.Cnd_prov_src_schd_typ_nm.setNextBeans(p.Cnd_prov_src_schd_no1);
		p.Cnd_prov_src_schd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_schd_typ_nm_META);
		p.CndPanel.add(p.Cnd_prov_src_schd_no1_Label);
		p.CndPanel.add(p.Cnd_prov_src_schd_no1);
		p.Cnd_prov_src_schd_no1.setNextBeans(p.Cnd_prov_src_schd_no2);
		p.Cnd_prov_src_schd_no1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_schd_no1_META);
		p.setPluralValueEnable(p.Cnd_prov_src_schd_no1, true);
		p.CndPanel.add(p.Cnd_prov_src_schd_no2_Label);
		p.CndPanel.add(p.Cnd_prov_src_schd_no2);
		p.Cnd_prov_src_schd_no2.setNextBeans(p.Cnd_prov_schd_no);
		p.Cnd_prov_src_schd_no2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_src_schd_no2_META);
		p.setPluralValueEnable(p.Cnd_prov_src_schd_no2, true);
		p.CndPanel.add(p.Cnd_prov_schd_no_Label);
		p.CndPanel.add(p.Cnd_prov_schd_no);
		p.Cnd_prov_schd_no.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_prov_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.prov_schd_no_META);
		p.setPluralValueEnable(p.Cnd_prov_schd_no, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dis_can_disp_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dis_can_disp_flg);
		p.Cnd_dis_can_disp_flg.setNextBeans(p.Cnd_sign_rev_flg);
		p.Cnd_dis_can_disp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.dis_can_disp_flg_META);
		p.CndPanel.add(p.Cnd_sign_rev_flg);
		p.Cnd_sign_rev_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1160.CndR.sign_rev_flg_META);
		p.PrspplGrpPanel.add(p.Cnd_prsppl_grp_p_PPanel);
		p.PrspplGrpPanel.setLastBeans(p.Cnd_prsppl_grp_p_PPanel);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitRPnl(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitBulkSet(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitBulkSetTab(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitUpriXrate(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitUpriBulkSet(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.UpriBulkSetPanel.setBorder(p.UpriBulkSetTitledBorder);
		p.UpriBulkSetPanel.setValueCheck(false);
		p.UpriBulkSetPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.UpriBulkSetPanel.add(p.UpriBulkSet_upri_dt_Label);
		p.UpriBulkSetPanel.add(p.UpriBulkSet_upri_dt);
		p.UpriBulkSetPanel.setLastBeans(p.UpriBulkSet_upri_dt);
		p.UpriBulkSet_upri_dt.setNextBeans(p.UpriBulkSet_upri_replace);
		p.UpriBulkSet_upri_dt.setRow(p.getUpriBulkSetR(), mcframe.clientMSBE.MSBEP1160.UpriBulkSetR.upri_dt_META);
		p.UpriBulkSet_upri_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.UpriBulkSetPanel.add(p.UpriBulkSet_upri_replace);
	}

	/**
	 * [XrateBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitXrateBulkSet(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.XrateBulkSetPanel.setBorder(p.XrateBulkSetTitledBorder);
		p.XrateBulkSetPanel.setValueCheck(false);
		p.XrateBulkSetPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.XrateBulkSetPanel.add(p.XrateBulkSet_xrate_dt_Label);
		p.XrateBulkSetPanel.add(p.XrateBulkSet_xrate_dt);
		p.XrateBulkSetPanel.setLastBeans(p.XrateBulkSet_xrate_dt);
		p.XrateBulkSet_xrate_dt.setNextBeans(p.XrateBulkSet_xrate_replace);
		p.XrateBulkSet_xrate_dt.setRow(p.getXrateBulkSetR(), mcframe.clientMSBE.MSBEP1160.XrateBulkSetR.xrate_dt_META);
		p.XrateBulkSet_xrate_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.XrateBulkSetPanel.add(p.XrateBulkSet_xrate_replace);
	}

	/**
	 * [TaxBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTaxBulkSet(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.TaxBulkSetPanel.setBorder(p.TaxBulkSetTitledBorder);
		p.TaxBulkSetPanel.setValueCheck(false);
		p.TaxBulkSetPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.TaxBulkSetPanel.add(p.TaxBulkSet_tax_dt_Label);
		p.TaxBulkSetPanel.add(p.TaxBulkSet_tax_dt);
		p.TaxBulkSetPanel.setLastBeans(p.TaxBulkSet_tax_dt);
		p.TaxBulkSet_tax_dt.setNextBeans(p.TaxBulkSet_tax_replace);
		p.TaxBulkSet_tax_dt.setRow(p.getTaxBulkSetR(), mcframe.clientMSBE.MSBEP1160.TaxBulkSetR.tax_dt_META);
		p.TaxBulkSet_tax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.TaxBulkSetPanel.add(p.TaxBulkSet_tax_replace);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_ProvDtlModReg p) {
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
	protected static void jbInitBtn(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
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
		p.Btn_prnt_out_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1160.BtnR.prnt_out_flg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1160.BtnR.indiv_prnt_flg_META);
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBEP_ProvDtlModReg p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("NWXCXCXCXC");
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
		MSBEP_ProvDtlModReg_MC.mcInitScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitSrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitTop((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitFold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitTab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitTab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitTab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitSubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitDlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitPrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitCnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitCtrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitRPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitBulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitUpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitUpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitXrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitTaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitDtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitBtn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.mcInitEdi((MSBEP_ProvDtlModReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH_Edi((MSBEP_ProvDtlModReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitUPD_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitUPD_Edi((MSBEP_ProvDtlModReg)this);

		// [PRNT]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitPRNT_Edi((MSBEP_ProvDtlModReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitFIX__U_Edi((MSBEP_ProvDtlModReg)this);

		// [SRCH_ACT]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__ACT_Edi((MSBEP_ProvDtlModReg)this);

		// [REF_ACT]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__ACT_Edi((MSBEP_ProvDtlModReg)this);

		// [SRCH_SCHD]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitSRCH__SCHD_Edi((MSBEP_ProvDtlModReg)this);

		// [REF_SCHD]ステータスのモードの設定
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_ScreenOpe((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_SrchTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Top((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Fold((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Tab1((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Tab2((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Tab3((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_ProvTyp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_SubconSts((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_DlvPrnt((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_PrspplGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_ItmGrp((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Cnd((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Ctrl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_RPnl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_BulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_BulkSetTab((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_UpriXrate((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_UpriBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_XrateBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_TaxBulkSet((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Dtl((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Btn((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_UpriSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_XrateSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_TaxSrch((MSBEP_ProvDtlModReg)this);
		MSBEP_ProvDtlModReg_MC.statusInitREF__SCHD_Edi((MSBEP_ProvDtlModReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [SrchTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchTyp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ProvDtlModReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [ProvTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProvTyp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [SubconSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSubconSts(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [DlvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvPrnt(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [PrspplGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrspplGrp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ProvDtlModReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF_ACT.addAllListener(p);
		p.Cnd_ope_REF_SCHD.addAllListener(p);
		p.Cnd_prov.addAllListener(p);
		p.Cnd_prov_rtn.addAllListener(p);
		p.Cnd_ffr_prov_flg.addAllListener(p);
		p.Cnd_onr_prov_flg.addAllListener(p);
		p.Cnd_subcon_flg.addAllListener(p);
		p.Cnd_not_subcon_flg.addAllListener(p);
		p.Cnd_dlv_not_prnted.addAllListener(p);
		p.Cnd_dlv_prnted.addAllListener(p);
		p.Cnd_on_edi_flg.addAllListener(p);
		p.Cnd_off_edi_flg.addAllListener(p);
		p.Cnd_accpt_dt_fr.setListListener(p);
		p.Cnd_accpt_dt_fr.addAllListener(p);
		p.Cnd_accpt_dt_to.setListListener(p);
		p.Cnd_accpt_dt_to.addAllListener(p);
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_accpt_schd_dt_fr.setListListener(p);
		p.Cnd_accpt_schd_dt_fr.addAllListener(p);
		p.Cnd_accpt_schd_dt_to.setListListener(p);
		p.Cnd_accpt_schd_dt_to.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_prsppl_cd.setListListener(p);
		p.Cnd_prsppl_cd.addAllListener(p);
		p.Cnd_prsppl_nm.setListListener(p);
		p.Cnd_prsppl_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_prsppl_loc_cd.setListListener(p);
		p.Cnd_prsppl_loc_cd.addAllListener(p);
		p.Cnd_prsppl_loc_nm.setListListener(p);
		p.Cnd_prsppl_loc_nm.addAllListener(p);
		p.Cnd_prsppl_str_ln_cd.setListListener(p);
		p.Cnd_prsppl_str_ln_cd.addAllListener(p);
		p.Cnd_prsppl_str_ln_nm.setListListener(p);
		p.Cnd_prsppl_str_ln_nm.addAllListener(p);
		p.Cnd_prsppl_wg_cd.setListListener(p);
		p.Cnd_prsppl_wg_cd.addAllListener(p);
		p.Cnd_prsppl_wg_nm.setListListener(p);
		p.Cnd_prsppl_wg_nm.addAllListener(p);
		p.Cnd_prsppl_lg_grp_cd.setListListener(p);
		p.Cnd_prsppl_lg_grp_cd.addAllListener(p);
		p.Cnd_prsppl_lg_grp_nm.setListListener(p);
		p.Cnd_prsppl_lg_grp_nm.addAllListener(p);
		p.Cnd_prsppl_site_cd.setListListener(p);
		p.Cnd_prsppl_site_cd.addAllListener(p);
		p.Cnd_prsppl_site_nm.setListListener(p);
		p.Cnd_prsppl_site_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_stk_id_typ.setListListener(p);
		p.Cnd_stk_id_typ.addAllListener(p);
		p.Cnd_stk_id_typ_nm.setListListener(p);
		p.Cnd_stk_id_typ_nm.addAllListener(p);
		p.Cnd_prov_basis_typ.setListListener(p);
		p.Cnd_prov_basis_typ.addAllListener(p);
		p.Cnd_prov_basis_typ_nm.setListListener(p);
		p.Cnd_prov_basis_typ_nm.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_dlv_slip_d_no.setListListener(p);
		p.Cnd_dlv_slip_d_no.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_foreign_flg.addAllListener(p);
		p.Cnd_tax_cd.setListListener(p);
		p.Cnd_tax_cd.addAllListener(p);
		p.Cnd_tax_nm.setListListener(p);
		p.Cnd_tax_nm.addAllListener(p);
		p.Cnd_prov_src_act_typ.setListListener(p);
		p.Cnd_prov_src_act_typ.addAllListener(p);
		p.Cnd_prov_src_act_typ_nm.setListListener(p);
		p.Cnd_prov_src_act_typ_nm.addAllListener(p);
		p.Cnd_prov_src_act_no.setListListener(p);
		p.Cnd_prov_src_act_no.addAllListener(p);
		p.Cnd_prov_act_no.setListListener(p);
		p.Cnd_prov_act_no.addAllListener(p);
		p.Cnd_prov_src_schd_typ.setListListener(p);
		p.Cnd_prov_src_schd_typ.addAllListener(p);
		p.Cnd_prov_src_schd_typ_nm.setListListener(p);
		p.Cnd_prov_src_schd_typ_nm.addAllListener(p);
		p.Cnd_prov_src_schd_no1.setListListener(p);
		p.Cnd_prov_src_schd_no1.addAllListener(p);
		p.Cnd_prov_src_schd_no2.setListListener(p);
		p.Cnd_prov_src_schd_no2.addAllListener(p);
		p.Cnd_prov_schd_no.setListListener(p);
		p.Cnd_prov_schd_no.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_dis_can_disp_flg.addAllListener(p);
		p.Cnd_sign_rev_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_ProvDtlModReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_ProvDtlModReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [BulkSetTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSetTab(MSBEP_ProvDtlModReg p) {
		p.BulkSetTabTab.addAllListener(p);
	}

	/**
	 *  [UpriXrate]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpriXrate(MSBEP_ProvDtlModReg p) {
	}

	/**
	 *  [UpriBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpriBulkSet(MSBEP_ProvDtlModReg p) {
		p.UpriBulkSet_upri_dt.setListListener(p);
		p.UpriBulkSet_upri_dt.addAllListener(p);
		p.UpriBulkSet_upri_replace.addAllListener(p);
		p.UpriBulkSet_upri_replace.setAPMethodName("doUpriBulkSet_upri_replace");
	}

	/**
	 *  [XrateBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitXrateBulkSet(MSBEP_ProvDtlModReg p) {
		p.XrateBulkSet_xrate_dt.setListListener(p);
		p.XrateBulkSet_xrate_dt.addAllListener(p);
		p.XrateBulkSet_xrate_replace.addAllListener(p);
		p.XrateBulkSet_xrate_replace.setAPMethodName("doXrateBulkSet_xrate_replace");
	}

	/**
	 *  [TaxBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTaxBulkSet(MSBEP_ProvDtlModReg p) {
		p.TaxBulkSet_tax_dt.setListListener(p);
		p.TaxBulkSet_tax_dt.addAllListener(p);
		p.TaxBulkSet_tax_replace.addAllListener(p);
		p.TaxBulkSet_tax_replace.setAPMethodName("doTaxBulkSet_tax_replace");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_ProvDtlModReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_accpt_dt.addAllListener(p);
		p.columnDtl_accpt_dt.setListListener(p);
		p.columnDtl_ac_ym.addAllListener(p);
		p.columnDtl_ac_ym.setListListener(p);
		p.columnDtl_ac_dt.addAllListener(p);
		p.columnDtl_ac_dt.setListListener(p);
		p.columnDtl_base_ac_dt.addAllListener(p);
		p.columnDtl_base_ac_dt.setListListener(p);
		p.columnDtl_can_ac_dt.addAllListener(p);
		p.columnDtl_can_ac_dt.setListListener(p);
		p.columnDtl_accpt_schd_dt.addAllListener(p);
		p.columnDtl_accpt_schd_dt.setListListener(p);
		p.columnDtl_prsppl_cd.addAllListener(p);
		p.columnDtl_prsppl_cd.setListListener(p);
		p.columnDtl_prsppl_nm.addAllListener(p);
		p.columnDtl_prsppl_nm.setListListener(p);
		p.columnDtl_ap_dpt_cd.addAllListener(p);
		p.columnDtl_ap_dpt_cd.setListListener(p);
		p.columnDtl_ap_dpt_nm.addAllListener(p);
		p.columnDtl_ap_dpt_nm.setListListener(p);
		p.columnDtl_prsppl_loc_cd.addAllListener(p);
		p.columnDtl_prsppl_loc_cd.setListListener(p);
		p.columnDtl_prsppl_loc_nm.addAllListener(p);
		p.columnDtl_prsppl_loc_nm.setListListener(p);
		p.columnDtl_str_ln_cd.addAllListener(p);
		p.columnDtl_str_ln_cd.setListListener(p);
		p.columnDtl_str_ln_nm.addAllListener(p);
		p.columnDtl_str_ln_nm.setListListener(p);
		p.columnDtl_str_ln_cd_none_flg.addAllListener(p);
		p.columnDtl_prsppl_wg_cd.addAllListener(p);
		p.columnDtl_prsppl_wg_cd.setListListener(p);
		p.columnDtl_prsppl_wg_nm.addAllListener(p);
		p.columnDtl_prsppl_wg_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_lot_no.addAllListener(p);
		p.columnDtl_lot_no.setListListener(p);
		p.columnDtl_sublot_no.addAllListener(p);
		p.columnDtl_sublot_no.setListListener(p);
		p.columnDtl_ver_no.addAllListener(p);
		p.columnDtl_ver_no.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_stk_id_typ.addAllListener(p);
		p.columnDtl_stk_id_typ.setListListener(p);
		p.columnDtl_stk_id_typ_nm.addAllListener(p);
		p.columnDtl_stk_id_typ_nm.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_prov_typ.addAllListener(p);
		p.columnDtl_prov_typ.setListListener(p);
		p.columnDtl_prov_typ_nm.addAllListener(p);
		p.columnDtl_prov_typ_nm.setListListener(p);
		p.columnDtl_prov_basis_typ.addAllListener(p);
		p.columnDtl_prov_basis_typ.setListListener(p);
		p.columnDtl_prov_basis_typ_nm.addAllListener(p);
		p.columnDtl_prov_basis_typ_nm.setListListener(p);
		p.columnDtl_trd_cur_cd.addAllListener(p);
		p.columnDtl_trd_cur_cd.setListListener(p);
		p.columnDtl_trd_cur_nm.addAllListener(p);
		p.columnDtl_trd_cur_nm.setListListener(p);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_xfr_rsn_cd.addAllListener(p);
		p.columnDtl_xfr_rsn_cd.setListListener(p);
		p.columnDtl_xfr_rsn_nm.addAllListener(p);
		p.columnDtl_xfr_rsn_nm.setListListener(p);
		p.columnDtl_acxfr_gi_flg.addAllListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_dlv_prnted_flg.addAllListener(p);
		p.columnDtl_prov_src_act_typ.addAllListener(p);
		p.columnDtl_prov_src_act_typ.setListListener(p);
		p.columnDtl_prov_src_act_typ_nm.addAllListener(p);
		p.columnDtl_prov_src_act_typ_nm.setListListener(p);
		p.columnDtl_prov_src_act_no.addAllListener(p);
		p.columnDtl_prov_src_act_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_purc_act_no.addAllListener(p);
		p.columnDtl_purc_act_no.setListListener(p);
		p.columnDtl_purc_ret_act_no.addAllListener(p);
		p.columnDtl_purc_ret_act_no.setListListener(p);
		p.columnDtl_mfg_act_no.addAllListener(p);
		p.columnDtl_mfg_act_no.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_prov_act_no.addAllListener(p);
		p.columnDtl_prov_act_no.setListListener(p);
		p.columnDtl_prov_act_rev.addAllListener(p);
		p.columnDtl_prov_act_rev.setListListener(p);
		p.columnDtl_edi_flg.addAllListener(p);
		p.columnDtl_iv_trd_flg.addAllListener(p);
		p.columnDtl_prov_src_schd_typ.addAllListener(p);
		p.columnDtl_prov_src_schd_typ.setListListener(p);
		p.columnDtl_prov_src_schd_typ_nm.addAllListener(p);
		p.columnDtl_prov_src_schd_typ_nm.setListListener(p);
		p.columnDtl_prov_src_schd_no1.addAllListener(p);
		p.columnDtl_prov_src_schd_no1.setListListener(p);
		p.columnDtl_prov_src_schd_no2.addAllListener(p);
		p.columnDtl_prov_src_schd_no2.setListListener(p);
		p.columnDtl_prov_schd_no.addAllListener(p);
		p.columnDtl_prov_schd_no.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
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
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_prov_amt_rnd_typ.addAllListener(p);
		p.columnDtl_prov_amt_rnd_typ.setListListener(p);
		p.columnDtl_prov_tax_rnd_typ.addAllListener(p);
		p.columnDtl_prov_tax_rnd_typ.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ProvDtlModReg p) {
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
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
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBEP_ProvDtlModReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_edi_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_accpt_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_accpt_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_accpt_schd_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_prsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_prnted_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
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
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_accpt_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_accpt_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, UPD, MCMode.ENABLE);
		p.UpriBulkSet_upri_replace.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.XrateBulkSet_xrate_replace.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.TaxBulkSet_tax_replace.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slip_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_base_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_can_ac_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_accpt_schd_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_prsppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_xfr_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_prnted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_on_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_accpt_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_accpt_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_accpt_schd_dt_to.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_loc_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prov_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prov_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnDtl_slip_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_accpt_schd_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_prsppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_act_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_dlv_prnted_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_prov_act_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

	}

	/**
	 * [PRNT]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [PRNT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_on_edi_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_accpt_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_accpt_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_accpt_schd_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_accpt_schd_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_prsppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [FIX_U]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_on_edi_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_accpt_dt_fr.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_accpt_dt_to.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_loc_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prov_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_schd_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, SRCH_ACT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, SRCH_ACT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, SRCH_ACT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_accpt_schd_dt.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_prsppl_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_act_qty_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_dlv_prnted_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_act_rev.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no1.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no2.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_schd_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dlv_prnted.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_on_edi_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_accpt_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_accpt_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_accpt_schd_dt_to.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_loc_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prov_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_prov_schd_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_sign_rev_flg.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_ACT, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, REF_ACT, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, REF_ACT, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, REF_ACT, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_can_ac_dt.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_accpt_schd_dt.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_prsppl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_act_qty_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_dlv_prnted_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_src_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_prov_act_rev.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no1.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_no2.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_schd_no.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [REF_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_on_edi_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_off_edi_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_accpt_dt_fr.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_accpt_dt_to.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prsppl_loc_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prov_src_schd_no2.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_prov_schd_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, SRCH_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, SRCH_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, SRCH_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ac_ym.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ac_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_ac_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_can_ac_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_accpt_schd_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_prsppl_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prsppl_loc_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_act_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_xrate.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnted_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_act_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_po_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_purc_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_act_rev.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_edi_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_schd_no1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_schd_no2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Edi(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ScreenOpe(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[SrchTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_SrchTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Top(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Fold(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab1(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab2(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab3(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[ProvTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ProvTyp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_SubconSts(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[DlvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_DlvPrnt(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[PrspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_PrspplGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ItmGrp(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Cnd(MSBEP_ProvDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_prov.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prov_rtn.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ffr_prov_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_onr_prov_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dlv_not_prnted.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_dlv_prnted.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_on_edi_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_off_edi_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_accpt_dt_fr.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_accpt_dt_to.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_arr_act_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_accpt_schd_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prsppl_loc_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_loc_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_str_ln_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_wg_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_wg_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_lg_grp_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_site_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prsppl_site_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_tax_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prov_src_act_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_typ.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prov_src_schd_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_prov_src_schd_no1.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prov_src_schd_no2.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_prov_schd_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_prsppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Ctrl(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_RPnl(MSBEP_ProvDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_SCHD, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_BulkSet(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[BulkSetTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_BulkSetTab(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[UpriXrate]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_UpriXrate(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[UpriBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_UpriBulkSet(MSBEP_ProvDtlModReg p){
		p.UpriBulkSet_upri_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.UpriBulkSet_upri_replace.putMode(p, REF_SCHD, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[XrateBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_XrateBulkSet(MSBEP_ProvDtlModReg p){
		p.XrateBulkSet_xrate_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.XrateBulkSet_xrate_replace.putMode(p, REF_SCHD, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[TaxBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_TaxBulkSet(MSBEP_ProvDtlModReg p){
		p.TaxBulkSet_tax_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.TaxBulkSet_tax_replace.putMode(p, REF_SCHD, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Dtl(MSBEP_ProvDtlModReg p){
		p.columnDtl_check.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_accpt_dt.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ac_ym.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ac_dt.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_ac_dt.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_can_ac_dt.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_arr_acr_tm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnDtl_accpt_schd_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_arr_schd_tm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_prsppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prsppl_loc_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_loc_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prsppl_wg_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_act_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_xrate.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_xfr_rsn_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_xfr_rsn_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnted_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_act_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_act_typ_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_po_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_purc_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_act_rev.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_edi_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_src_schd_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_schd_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_schd_no1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_src_schd_no2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Dtl_prsppl_Grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_amt_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_prov_tax_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Btn(MSBEP_ProvDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_UpriSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[XrateSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_XrateSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[TaxSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_TaxSrch(MSBEP_ProvDtlModReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Edi(MSBEP_ProvDtlModReg p){

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
		MSBEP_ProvDtlModReg_MC.setTableConfigDtl((MSBEP_ProvDtlModReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_ProvDtlModReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_slip_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.slip_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_sts_typ_nm);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_accpt_dt.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.accpt_dt_META);
		p.columnDtl_accpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_accpt_dt);
		p.columnDtl_ac_ym.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ac_ym_META);
		p.columnDtl_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_ym);
		p.columnDtl_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ac_dt_META);
		p.columnDtl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dt);
		p.columnDtl_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_ac_dt_META);
		p.columnDtl_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_ac_dt);
		p.columnDtl_can_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.can_ac_dt_META);
		p.columnDtl_can_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_can_ac_dt);
		p.DtlTable.addTable(p.Dtl_arr_acr_tm_p_PPanel.YmdHmTable);
		p.columnDtl_accpt_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.accpt_schd_dt_META);
		p.columnDtl_accpt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_accpt_schd_dt);
		p.DtlTable.addTable(p.Dtl_arr_schd_tm_p_PPanel.YmdHmTable);
		p.columnDtl_prsppl_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prsppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prsppl_cd);
		p.columnDtl_prsppl_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prsppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prsppl_nm);
		p.columnDtl_ap_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ap_dpt_cd_META);
		p.columnDtl_ap_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_ap_dpt_cd.addLinkBeans(p.columnDtl_ap_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_cd);
		p.columnDtl_ap_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ap_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_nm);
		p.columnDtl_prsppl_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prsppl_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prsppl_loc_cd);
		p.columnDtl_prsppl_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prsppl_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prsppl_loc_nm);
		p.columnDtl_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.str_ln_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd);
		p.columnDtl_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.str_ln_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_nm);
		p.columnDtl_str_ln_cd_none_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.str_ln_cd_none_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd_none_flg);
		p.columnDtl_prsppl_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prsppl_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prsppl_wg_cd);
		p.columnDtl_prsppl_wg_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prsppl_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prsppl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_lot_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no);
		p.columnDtl_sublot_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no);
		p.columnDtl_ver_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ver_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_no);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.columnDtl_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.stk_id_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ);
		p.columnDtl_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.stk_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ_nm);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.DtlTable.addTable(p.Dtl_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_act_qty_p_PPanel.QtyTable);
		p.columnDtl_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_typ);
		p.columnDtl_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_typ_nm);
		p.columnDtl_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_basis_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_basis_typ);
		p.columnDtl_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_basis_typ_nm);
		p.columnDtl_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_cd);
		p.columnDtl_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_nm);
		p.DtlTable.addTable(p.Dtl_trd_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_rate, p.columnDtl_tax_typ, p.columnDtl_inc_tax_flg);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_upri_p_PPanel.UpriTable);
		p.columnDtl_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_cd);
		p.columnDtl_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_nm);
		p.DtlTable.addTable(p.Dtl_xrate_p_PPanel.XrateTable);
		p.columnDtl_xrate_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_cd);
		p.columnDtl_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.columnDtl_ptax_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ptax_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_cd);
		p.columnDtl_ptax_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ptax_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_nm);
		p.columnDtl_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ptax_xrate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_xrate);
		p.columnDtl_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ptax_xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.DtlTable.addTable(p.Dtl_wtax_amt_p_PPanel.AmtTable);
		p.columnDtl_xfr_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.xfr_rsn_cd_META);
		p.columnDtl_xfr_rsn_cd.addLinkBeans(p.columnDtl_xfr_rsn_nm,p.columnDtl_acxfr_gi_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_rsn_cd);
		p.columnDtl_xfr_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.xfr_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_rsn_nm);
		p.columnDtl_acxfr_gi_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.acxfr_gi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acxfr_gi_flg);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_dlv_prnted_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.dlv_prnted_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_prnted_flg);
		p.columnDtl_prov_src_act_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_act_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_act_typ);
		p.columnDtl_prov_src_act_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_act_typ_nm);
		p.columnDtl_prov_src_act_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_act_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_purc_act_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.purc_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_no);
		p.columnDtl_purc_ret_act_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.purc_ret_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_act_no);
		p.columnDtl_mfg_act_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.mfg_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_act_no);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_act_no);
		p.columnDtl_prov_act_rev.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_act_rev);
		p.columnDtl_edi_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.edi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_flg);
		p.columnDtl_iv_trd_flg.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.iv_trd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_trd_flg);
		p.columnDtl_prov_src_schd_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_schd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_schd_typ);
		p.columnDtl_prov_src_schd_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_schd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_schd_typ_nm);
		p.columnDtl_prov_src_schd_no1.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_schd_no1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_schd_no1);
		p.columnDtl_prov_src_schd_no2.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_src_schd_no2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_src_schd_no2);
		p.columnDtl_prov_schd_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_schd_no);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.DtlTable.addTable(p.Dtl_prsppl_Grp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_itm_grp_p_PPanel.ItmGrpTable);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.columnDtl_prov_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_amt_rnd_typ);
		p.columnDtl_prov_tax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.prov_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_tax_rnd_typ);
		p.columnDtl_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_amt_dec_place);
		p.columnDtl_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.trd_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_upri_dec_place);
		p.columnDtl_base_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_amt_dec_place);
		p.columnDtl_base_cur_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.base_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_upri_dec_place);
		p.columnDtl_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ptax_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_amt_dec_place);
		p.columnDtl_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.ptax_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_upri_dec_place);
		p.columnDtl_xrate_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.xrate_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_rnd_typ);
		p.columnDtl_wtax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1160.DtlR.wtax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rnd_typ);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_prsppl_cd.getListConfig().setPutter(getCnd_prsppl_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_prsppl_loc_cd.getListConfig().setPutter(getCnd_prsppl_loc_cd_ListPutter());
		Cnd_prsppl_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_str_ln_cd.getListConfig().setPutter(getCnd_prsppl_str_ln_cd_ListPutter());
		Cnd_prsppl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_wg_cd.getListConfig().setPutter(getCnd_prsppl_wg_cd_ListPutter());
		Cnd_prsppl_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_lg_grp_cd.getListConfig().setPutter(getCnd_prsppl_lg_grp_cd_ListPutter());
		Cnd_prsppl_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_site_cd.getListConfig().setPutter(getCnd_prsppl_site_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_id_typ.getListConfig().setPutter(getCnd_stk_id_typ_ListPutter());
		Cnd_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_basis_typ.getListConfig().setPutter(getCnd_prov_basis_typ_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_cd.getListConfig().setPutter(getCnd_tax_cd_ListPutter());
		Cnd_prov_src_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_src_act_typ.getListConfig().setPutter(getCnd_prov_src_act_typ_ListPutter());
		Cnd_prov_src_schd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_src_schd_typ.getListConfig().setPutter(getCnd_prov_src_schd_typ_ListPutter());
		columnDtl_ap_dpt_cd.getListConfig().setPutter(getDtl_ap_dpt_cd_ListPutter());
		columnDtl_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cur_cd.getListConfig().setPutter(getDtl_trd_cur_cd_ListPutter());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnDtl_xfr_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_xfr_rsn_cd.getListConfig().setPutter(getDtl_xfr_rsn_cd_ListPutter());
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACTStatus() {
		status = SRCH_ACT;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACTStatus() {
		status = REF_ACT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SCHDStatus() {
		status = SRCH_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHDStatus() {
		status = REF_SCHD;
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
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (SRCH_ACT.equals(status)) {
			setSRCH_ACTStatus();
		}
		else if (REF_ACT.equals(status)) {
			setREF_ACTStatus();
		}
		else if (SRCH_SCHD.equals(status)) {
			setSRCH_SCHDStatus();
		}
		else if (REF_SCHD.equals(status)) {
			setREF_SCHDStatus();
		}
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
	 * [Cnd_prsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
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
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SloStkGd");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
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
		lp.setListLogicId("MA.MAUAP0010.ProvTax");
		return lp;
	}
	 
	/**
	 * [Cnd_prov_src_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_src_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ProvSrcActTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_prov_src_schd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_src_schd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ProvSrcSchdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		lp.setListLogicId("MA.MAUAP0010.ProvTax");
		return lp;
	}

	/**
	 * [Dtl_xfr_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_xfr_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.XfrBizRsn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_prsppl_cd) return getCnd_prsppl_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_prsppl_loc_cd) return getCnd_prsppl_loc_cd(row, info);
		if(combo == Cnd_prsppl_str_ln_cd) return getCnd_prsppl_str_ln_cd(row, info);
		if(combo == Cnd_prsppl_wg_cd) return getCnd_prsppl_wg_cd(row, info);
		if(combo == Cnd_prsppl_lg_grp_cd) return getCnd_prsppl_lg_grp_cd(row, info);
		if(combo == Cnd_prsppl_site_cd) return getCnd_prsppl_site_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_stk_id_typ) return getCnd_stk_id_typ(row, info);
		if(combo == Cnd_prov_basis_typ) return getCnd_prov_basis_typ(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_tax_cd) return getCnd_tax_cd(row, info);
		if(combo == Cnd_prov_src_act_typ) return getCnd_prov_src_act_typ(row, info);
		if(combo == Cnd_prov_src_schd_typ) return getCnd_prov_src_schd_typ(row, info);
		if(combo == columnDtl_ap_dpt_cd) return getDtl_ap_dpt_cd(row, info);
		if(combo == columnDtl_trd_cur_cd) return getDtl_trd_cur_cd(row, info);
		if(combo == Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnDtl_xfr_rsn_cd) return getDtl_xfr_rsn_cd(row, info);
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
		else if (ap == XrateBulkSet_xrate_replace) doXrateBulkSet_xrate_replace(info);
		else if (ap == TaxBulkSet_tax_replace) doTaxBulkSet_tax_replace(info);
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
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
		if (vc == Cnd_prov) return doCnd_prov_VC(info);
		if (vc == Cnd_prov_rtn) return doCnd_prov_rtn_VC(info);
		if (vc == Cnd_ffr_prov_flg) return doCnd_ffr_prov_flg_VC(info);
		if (vc == Cnd_onr_prov_flg) return doCnd_onr_prov_flg_VC(info);
		if (vc == Cnd_subcon_flg) return doCnd_subcon_flg_VC(info);
		if (vc == Cnd_not_subcon_flg) return doCnd_not_subcon_flg_VC(info);
		if (vc == Cnd_dlv_not_prnted) return doCnd_dlv_not_prnted_VC(info);
		if (vc == Cnd_dlv_prnted) return doCnd_dlv_prnted_VC(info);
		if (vc == Cnd_on_edi_flg) return doCnd_on_edi_flg_VC(info);
		if (vc == Cnd_off_edi_flg) return doCnd_off_edi_flg_VC(info);
		if (vc == Cnd_accpt_dt_fr) return doCnd_accpt_dt_fr_VC(info);
		if (vc == Cnd_accpt_dt_to) return doCnd_accpt_dt_to_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_accpt_schd_dt_fr) return doCnd_accpt_schd_dt_fr_VC(info);
		if (vc == Cnd_accpt_schd_dt_to) return doCnd_accpt_schd_dt_to_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_prsppl_cd) return doCnd_prsppl_cd_VC(info);
		if (vc == Cnd_prsppl_nm) return doCnd_prsppl_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_prsppl_loc_cd) return doCnd_prsppl_loc_cd_VC(info);
		if (vc == Cnd_prsppl_loc_nm) return doCnd_prsppl_loc_nm_VC(info);
		if (vc == Cnd_prsppl_str_ln_cd) return doCnd_prsppl_str_ln_cd_VC(info);
		if (vc == Cnd_prsppl_str_ln_nm) return doCnd_prsppl_str_ln_nm_VC(info);
		if (vc == Cnd_prsppl_wg_cd) return doCnd_prsppl_wg_cd_VC(info);
		if (vc == Cnd_prsppl_wg_nm) return doCnd_prsppl_wg_nm_VC(info);
		if (vc == Cnd_prsppl_lg_grp_cd) return doCnd_prsppl_lg_grp_cd_VC(info);
		if (vc == Cnd_prsppl_lg_grp_nm) return doCnd_prsppl_lg_grp_nm_VC(info);
		if (vc == Cnd_prsppl_site_cd) return doCnd_prsppl_site_cd_VC(info);
		if (vc == Cnd_prsppl_site_nm) return doCnd_prsppl_site_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_stk_id_typ) return doCnd_stk_id_typ_VC(info);
		if (vc == Cnd_stk_id_typ_nm) return doCnd_stk_id_typ_nm_VC(info);
		if (vc == Cnd_prov_basis_typ) return doCnd_prov_basis_typ_VC(info);
		if (vc == Cnd_prov_basis_typ_nm) return doCnd_prov_basis_typ_nm_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_dlv_slip_d_no) return doCnd_dlv_slip_d_no_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_foreign_flg) return doCnd_foreign_flg_VC(info);
		if (vc == Cnd_tax_cd) return doCnd_tax_cd_VC(info);
		if (vc == Cnd_tax_nm) return doCnd_tax_nm_VC(info);
		if (vc == Cnd_prov_src_act_typ) return doCnd_prov_src_act_typ_VC(info);
		if (vc == Cnd_prov_src_act_typ_nm) return doCnd_prov_src_act_typ_nm_VC(info);
		if (vc == Cnd_prov_src_act_no) return doCnd_prov_src_act_no_VC(info);
		if (vc == Cnd_prov_act_no) return doCnd_prov_act_no_VC(info);
		if (vc == Cnd_prov_src_schd_typ) return doCnd_prov_src_schd_typ_VC(info);
		if (vc == Cnd_prov_src_schd_typ_nm) return doCnd_prov_src_schd_typ_nm_VC(info);
		if (vc == Cnd_prov_src_schd_no1) return doCnd_prov_src_schd_no1_VC(info);
		if (vc == Cnd_prov_src_schd_no2) return doCnd_prov_src_schd_no2_VC(info);
		if (vc == Cnd_prov_schd_no) return doCnd_prov_schd_no_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dis_can_disp_flg) return doCnd_dis_can_disp_flg_VC(info);
		if (vc == Cnd_sign_rev_flg) return doCnd_sign_rev_flg_VC(info);
		if (vc == UpriBulkSet_upri_dt) return doUpriBulkSet_upri_dt_VC(info);
		if (vc == XrateBulkSet_xrate_dt) return doXrateBulkSet_xrate_dt_VC(info);
		if (vc == TaxBulkSet_tax_dt) return doTaxBulkSet_tax_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_slip_sts_typ_nm) return doDtl_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_accpt_dt) return doDtl_accpt_dt_VC(info);
		if (vc == columnDtl_ac_ym) return doDtl_ac_ym_VC(info);
		if (vc == columnDtl_ac_dt) return doDtl_ac_dt_VC(info);
		if (vc == columnDtl_base_ac_dt) return doDtl_base_ac_dt_VC(info);
		if (vc == columnDtl_can_ac_dt) return doDtl_can_ac_dt_VC(info);
		if (vc == columnDtl_accpt_schd_dt) return doDtl_accpt_schd_dt_VC(info);
		if (vc == columnDtl_prsppl_cd) return doDtl_prsppl_cd_VC(info);
		if (vc == columnDtl_prsppl_nm) return doDtl_prsppl_nm_VC(info);
		if (vc == columnDtl_ap_dpt_cd) return doDtl_ap_dpt_cd_VC(info);
		if (vc == columnDtl_ap_dpt_nm) return doDtl_ap_dpt_nm_VC(info);
		if (vc == columnDtl_prsppl_loc_cd) return doDtl_prsppl_loc_cd_VC(info);
		if (vc == columnDtl_prsppl_loc_nm) return doDtl_prsppl_loc_nm_VC(info);
		if (vc == columnDtl_str_ln_cd) return doDtl_str_ln_cd_VC(info);
		if (vc == columnDtl_str_ln_nm) return doDtl_str_ln_nm_VC(info);
		if (vc == columnDtl_str_ln_cd_none_flg) return doDtl_str_ln_cd_none_flg_VC(info);
		if (vc == columnDtl_prsppl_wg_cd) return doDtl_prsppl_wg_cd_VC(info);
		if (vc == columnDtl_prsppl_wg_nm) return doDtl_prsppl_wg_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_lot_no) return doDtl_lot_no_VC(info);
		if (vc == columnDtl_sublot_no) return doDtl_sublot_no_VC(info);
		if (vc == columnDtl_ver_no) return doDtl_ver_no_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_stk_id_typ) return doDtl_stk_id_typ_VC(info);
		if (vc == columnDtl_stk_id_typ_nm) return doDtl_stk_id_typ_nm_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_prov_typ) return doDtl_prov_typ_VC(info);
		if (vc == columnDtl_prov_typ_nm) return doDtl_prov_typ_nm_VC(info);
		if (vc == columnDtl_prov_basis_typ) return doDtl_prov_basis_typ_VC(info);
		if (vc == columnDtl_prov_basis_typ_nm) return doDtl_prov_basis_typ_nm_VC(info);
		if (vc == columnDtl_trd_cur_cd) return doDtl_trd_cur_cd_VC(info);
		if (vc == columnDtl_trd_cur_nm) return doDtl_trd_cur_nm_VC(info);
		if (vc == columnDtl_base_cur_cd) return doDtl_base_cur_cd_VC(info);
		if (vc == columnDtl_base_cur_nm) return doDtl_base_cur_nm_VC(info);
		if (vc == columnDtl_xrate_cd) return doDtl_xrate_cd_VC(info);
		if (vc == columnDtl_xrate_inpt_flg) return doDtl_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_ptax_cur_cd) return doDtl_ptax_cur_cd_VC(info);
		if (vc == columnDtl_ptax_cur_nm) return doDtl_ptax_cur_nm_VC(info);
		if (vc == columnDtl_ptax_xrate) return doDtl_ptax_xrate_VC(info);
		if (vc == columnDtl_ptax_xrate_inpt_flg) return doDtl_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_xfr_rsn_cd) return doDtl_xfr_rsn_cd_VC(info);
		if (vc == columnDtl_xfr_rsn_nm) return doDtl_xfr_rsn_nm_VC(info);
		if (vc == columnDtl_acxfr_gi_flg) return doDtl_acxfr_gi_flg_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_dlv_prnted_flg) return doDtl_dlv_prnted_flg_VC(info);
		if (vc == columnDtl_prov_src_act_typ) return doDtl_prov_src_act_typ_VC(info);
		if (vc == columnDtl_prov_src_act_typ_nm) return doDtl_prov_src_act_typ_nm_VC(info);
		if (vc == columnDtl_prov_src_act_no) return doDtl_prov_src_act_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_purc_act_no) return doDtl_purc_act_no_VC(info);
		if (vc == columnDtl_purc_ret_act_no) return doDtl_purc_ret_act_no_VC(info);
		if (vc == columnDtl_mfg_act_no) return doDtl_mfg_act_no_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_prov_act_no) return doDtl_prov_act_no_VC(info);
		if (vc == columnDtl_prov_act_rev) return doDtl_prov_act_rev_VC(info);
		if (vc == columnDtl_edi_flg) return doDtl_edi_flg_VC(info);
		if (vc == columnDtl_iv_trd_flg) return doDtl_iv_trd_flg_VC(info);
		if (vc == columnDtl_prov_src_schd_typ) return doDtl_prov_src_schd_typ_VC(info);
		if (vc == columnDtl_prov_src_schd_typ_nm) return doDtl_prov_src_schd_typ_nm_VC(info);
		if (vc == columnDtl_prov_src_schd_no1) return doDtl_prov_src_schd_no1_VC(info);
		if (vc == columnDtl_prov_src_schd_no2) return doDtl_prov_src_schd_no2_VC(info);
		if (vc == columnDtl_prov_schd_no) return doDtl_prov_schd_no_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
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
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_prov_amt_rnd_typ) return doDtl_prov_amt_rnd_typ_VC(info);
		if (vc == columnDtl_prov_tax_rnd_typ) return doDtl_prov_tax_rnd_typ_VC(info);
		if (vc == columnDtl_trd_cur_amt_dec_place) return doDtl_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_trd_cur_upri_dec_place) return doDtl_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_base_cur_amt_dec_place) return doDtl_base_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_base_cur_upri_dec_place) return doDtl_base_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_ptax_cur_amt_dec_place) return doDtl_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_ptax_cur_upri_dec_place) return doDtl_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_xrate_rnd_typ) return doDtl_xrate_rnd_typ_VC(info);
		if (vc == columnDtl_wtax_rnd_typ) return doDtl_wtax_rnd_typ_VC(info);
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
	 * [Cnd]パネルの[prov]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_rtn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_rtn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ffr_prov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ffr_prov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[onr_prov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_onr_prov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_subcon_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[accpt_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_site_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_basis_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_src_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_src_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_src_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_schd_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_src_schd_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_schd_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[accpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_accpt_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_ac_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[accpt_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_accpt_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prsppl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prsppl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prsppl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prsppl_wg_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_basis_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acxfr_gi_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_act_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_trd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_schd_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_src_schd_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_schd_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_tax_rnd_typ_VC(MCEventInfo info){
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
		else if (nc == Cnd_prov) doCnd_prov_NC(info);
		else if (nc == Cnd_prov_rtn) doCnd_prov_rtn_NC(info);
		else if (nc == Cnd_ffr_prov_flg) doCnd_ffr_prov_flg_NC(info);
		else if (nc == Cnd_onr_prov_flg) doCnd_onr_prov_flg_NC(info);
		else if (nc == Cnd_subcon_flg) doCnd_subcon_flg_NC(info);
		else if (nc == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NC(info);
		else if (nc == Cnd_dlv_not_prnted) doCnd_dlv_not_prnted_NC(info);
		else if (nc == Cnd_dlv_prnted) doCnd_dlv_prnted_NC(info);
		else if (nc == Cnd_on_edi_flg) doCnd_on_edi_flg_NC(info);
		else if (nc == Cnd_off_edi_flg) doCnd_off_edi_flg_NC(info);
		else if (nc == Cnd_accpt_dt_fr) doCnd_accpt_dt_fr_NC(info);
		else if (nc == Cnd_accpt_dt_to) doCnd_accpt_dt_to_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NC(info);
		else if (nc == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_prsppl_cd) doCnd_prsppl_cd_NC(info);
		else if (nc == Cnd_prsppl_nm) doCnd_prsppl_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_prsppl_loc_cd) doCnd_prsppl_loc_cd_NC(info);
		else if (nc == Cnd_prsppl_loc_nm) doCnd_prsppl_loc_nm_NC(info);
		else if (nc == Cnd_prsppl_str_ln_cd) doCnd_prsppl_str_ln_cd_NC(info);
		else if (nc == Cnd_prsppl_str_ln_nm) doCnd_prsppl_str_ln_nm_NC(info);
		else if (nc == Cnd_prsppl_wg_cd) doCnd_prsppl_wg_cd_NC(info);
		else if (nc == Cnd_prsppl_wg_nm) doCnd_prsppl_wg_nm_NC(info);
		else if (nc == Cnd_prsppl_lg_grp_cd) doCnd_prsppl_lg_grp_cd_NC(info);
		else if (nc == Cnd_prsppl_lg_grp_nm) doCnd_prsppl_lg_grp_nm_NC(info);
		else if (nc == Cnd_prsppl_site_cd) doCnd_prsppl_site_cd_NC(info);
		else if (nc == Cnd_prsppl_site_nm) doCnd_prsppl_site_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_stk_id_typ) doCnd_stk_id_typ_NC(info);
		else if (nc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NC(info);
		else if (nc == Cnd_prov_basis_typ) doCnd_prov_basis_typ_NC(info);
		else if (nc == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_dlv_slip_d_no) doCnd_dlv_slip_d_no_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_foreign_flg) doCnd_foreign_flg_NC(info);
		else if (nc == Cnd_tax_cd) doCnd_tax_cd_NC(info);
		else if (nc == Cnd_tax_nm) doCnd_tax_nm_NC(info);
		else if (nc == Cnd_prov_src_act_typ) doCnd_prov_src_act_typ_NC(info);
		else if (nc == Cnd_prov_src_act_typ_nm) doCnd_prov_src_act_typ_nm_NC(info);
		else if (nc == Cnd_prov_src_act_no) doCnd_prov_src_act_no_NC(info);
		else if (nc == Cnd_prov_act_no) doCnd_prov_act_no_NC(info);
		else if (nc == Cnd_prov_src_schd_typ) doCnd_prov_src_schd_typ_NC(info);
		else if (nc == Cnd_prov_src_schd_typ_nm) doCnd_prov_src_schd_typ_nm_NC(info);
		else if (nc == Cnd_prov_src_schd_no1) doCnd_prov_src_schd_no1_NC(info);
		else if (nc == Cnd_prov_src_schd_no2) doCnd_prov_src_schd_no2_NC(info);
		else if (nc == Cnd_prov_schd_no) doCnd_prov_schd_no_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NC(info);
		else if (nc == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NC(info);
		else if (nc == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_NC(info);
		else if (nc == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_NC(info);
		else if (nc == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_accpt_dt) doDtl_accpt_dt_NC(info);
		else if (nc == columnDtl_ac_ym) doDtl_ac_ym_NC(info);
		else if (nc == columnDtl_ac_dt) doDtl_ac_dt_NC(info);
		else if (nc == columnDtl_base_ac_dt) doDtl_base_ac_dt_NC(info);
		else if (nc == columnDtl_can_ac_dt) doDtl_can_ac_dt_NC(info);
		else if (nc == columnDtl_accpt_schd_dt) doDtl_accpt_schd_dt_NC(info);
		else if (nc == columnDtl_prsppl_cd) doDtl_prsppl_cd_NC(info);
		else if (nc == columnDtl_prsppl_nm) doDtl_prsppl_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NC(info);
		else if (nc == columnDtl_prsppl_loc_cd) doDtl_prsppl_loc_cd_NC(info);
		else if (nc == columnDtl_prsppl_loc_nm) doDtl_prsppl_loc_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd) doDtl_str_ln_cd_NC(info);
		else if (nc == columnDtl_str_ln_nm) doDtl_str_ln_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
		else if (nc == columnDtl_prsppl_wg_cd) doDtl_prsppl_wg_cd_NC(info);
		else if (nc == columnDtl_prsppl_wg_nm) doDtl_prsppl_wg_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_lot_no) doDtl_lot_no_NC(info);
		else if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		else if (nc == columnDtl_ver_no) doDtl_ver_no_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_stk_id_typ) doDtl_stk_id_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_prov_typ) doDtl_prov_typ_NC(info);
		else if (nc == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NC(info);
		else if (nc == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NC(info);
		else if (nc == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NC(info);
		else if (nc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NC(info);
		else if (nc == columnDtl_base_cur_cd) doDtl_base_cur_cd_NC(info);
		else if (nc == columnDtl_base_cur_nm) doDtl_base_cur_nm_NC(info);
		else if (nc == columnDtl_xrate_cd) doDtl_xrate_cd_NC(info);
		else if (nc == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NC(info);
		else if (nc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NC(info);
		else if (nc == columnDtl_ptax_xrate) doDtl_ptax_xrate_NC(info);
		else if (nc == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_xfr_rsn_cd) doDtl_xfr_rsn_cd_NC(info);
		else if (nc == columnDtl_xfr_rsn_nm) doDtl_xfr_rsn_nm_NC(info);
		else if (nc == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_dlv_prnted_flg) doDtl_dlv_prnted_flg_NC(info);
		else if (nc == columnDtl_prov_src_act_typ) doDtl_prov_src_act_typ_NC(info);
		else if (nc == columnDtl_prov_src_act_typ_nm) doDtl_prov_src_act_typ_nm_NC(info);
		else if (nc == columnDtl_prov_src_act_no) doDtl_prov_src_act_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_purc_act_no) doDtl_purc_act_no_NC(info);
		else if (nc == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_NC(info);
		else if (nc == columnDtl_mfg_act_no) doDtl_mfg_act_no_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_prov_act_no) doDtl_prov_act_no_NC(info);
		else if (nc == columnDtl_prov_act_rev) doDtl_prov_act_rev_NC(info);
		else if (nc == columnDtl_edi_flg) doDtl_edi_flg_NC(info);
		else if (nc == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NC(info);
		else if (nc == columnDtl_prov_src_schd_typ) doDtl_prov_src_schd_typ_NC(info);
		else if (nc == columnDtl_prov_src_schd_typ_nm) doDtl_prov_src_schd_typ_nm_NC(info);
		else if (nc == columnDtl_prov_src_schd_no1) doDtl_prov_src_schd_no1_NC(info);
		else if (nc == columnDtl_prov_src_schd_no2) doDtl_prov_src_schd_no2_NC(info);
		else if (nc == columnDtl_prov_schd_no) doDtl_prov_schd_no_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
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
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_prov_amt_rnd_typ) doDtl_prov_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_prov_tax_rnd_typ) doDtl_prov_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NC(info);
		else if (nc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NC(info);
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
	 * [Cnd]パネルの[prov]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_rtn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_rtn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ffr_prov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ffr_prov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[onr_prov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_onr_prov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_subcon_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_src_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[accpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_rnd_typ_NC(MCEventInfo info){
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
		else if (ne == Cnd_prov) doCnd_prov_NE(info);
		else if (ne == Cnd_prov_rtn) doCnd_prov_rtn_NE(info);
		else if (ne == Cnd_ffr_prov_flg) doCnd_ffr_prov_flg_NE(info);
		else if (ne == Cnd_onr_prov_flg) doCnd_onr_prov_flg_NE(info);
		else if (ne == Cnd_subcon_flg) doCnd_subcon_flg_NE(info);
		else if (ne == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NE(info);
		else if (ne == Cnd_dlv_not_prnted) doCnd_dlv_not_prnted_NE(info);
		else if (ne == Cnd_dlv_prnted) doCnd_dlv_prnted_NE(info);
		else if (ne == Cnd_on_edi_flg) doCnd_on_edi_flg_NE(info);
		else if (ne == Cnd_off_edi_flg) doCnd_off_edi_flg_NE(info);
		else if (ne == Cnd_accpt_dt_fr) doCnd_accpt_dt_fr_NE(info);
		else if (ne == Cnd_accpt_dt_to) doCnd_accpt_dt_to_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NE(info);
		else if (ne == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_prsppl_cd) doCnd_prsppl_cd_NE(info);
		else if (ne == Cnd_prsppl_nm) doCnd_prsppl_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_prsppl_loc_cd) doCnd_prsppl_loc_cd_NE(info);
		else if (ne == Cnd_prsppl_loc_nm) doCnd_prsppl_loc_nm_NE(info);
		else if (ne == Cnd_prsppl_str_ln_cd) doCnd_prsppl_str_ln_cd_NE(info);
		else if (ne == Cnd_prsppl_str_ln_nm) doCnd_prsppl_str_ln_nm_NE(info);
		else if (ne == Cnd_prsppl_wg_cd) doCnd_prsppl_wg_cd_NE(info);
		else if (ne == Cnd_prsppl_wg_nm) doCnd_prsppl_wg_nm_NE(info);
		else if (ne == Cnd_prsppl_lg_grp_cd) doCnd_prsppl_lg_grp_cd_NE(info);
		else if (ne == Cnd_prsppl_lg_grp_nm) doCnd_prsppl_lg_grp_nm_NE(info);
		else if (ne == Cnd_prsppl_site_cd) doCnd_prsppl_site_cd_NE(info);
		else if (ne == Cnd_prsppl_site_nm) doCnd_prsppl_site_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_stk_id_typ) doCnd_stk_id_typ_NE(info);
		else if (ne == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NE(info);
		else if (ne == Cnd_prov_basis_typ) doCnd_prov_basis_typ_NE(info);
		else if (ne == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_dlv_slip_d_no) doCnd_dlv_slip_d_no_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_foreign_flg) doCnd_foreign_flg_NE(info);
		else if (ne == Cnd_tax_cd) doCnd_tax_cd_NE(info);
		else if (ne == Cnd_tax_nm) doCnd_tax_nm_NE(info);
		else if (ne == Cnd_prov_src_act_typ) doCnd_prov_src_act_typ_NE(info);
		else if (ne == Cnd_prov_src_act_typ_nm) doCnd_prov_src_act_typ_nm_NE(info);
		else if (ne == Cnd_prov_src_act_no) doCnd_prov_src_act_no_NE(info);
		else if (ne == Cnd_prov_act_no) doCnd_prov_act_no_NE(info);
		else if (ne == Cnd_prov_src_schd_typ) doCnd_prov_src_schd_typ_NE(info);
		else if (ne == Cnd_prov_src_schd_typ_nm) doCnd_prov_src_schd_typ_nm_NE(info);
		else if (ne == Cnd_prov_src_schd_no1) doCnd_prov_src_schd_no1_NE(info);
		else if (ne == Cnd_prov_src_schd_no2) doCnd_prov_src_schd_no2_NE(info);
		else if (ne == Cnd_prov_schd_no) doCnd_prov_schd_no_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NE(info);
		else if (ne == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NE(info);
		else if (ne == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_NE(info);
		else if (ne == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_NE(info);
		else if (ne == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_accpt_dt) doDtl_accpt_dt_NE(info);
		else if (ne == columnDtl_ac_ym) doDtl_ac_ym_NE(info);
		else if (ne == columnDtl_ac_dt) doDtl_ac_dt_NE(info);
		else if (ne == columnDtl_base_ac_dt) doDtl_base_ac_dt_NE(info);
		else if (ne == columnDtl_can_ac_dt) doDtl_can_ac_dt_NE(info);
		else if (ne == columnDtl_accpt_schd_dt) doDtl_accpt_schd_dt_NE(info);
		else if (ne == columnDtl_prsppl_cd) doDtl_prsppl_cd_NE(info);
		else if (ne == columnDtl_prsppl_nm) doDtl_prsppl_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NE(info);
		else if (ne == columnDtl_prsppl_loc_cd) doDtl_prsppl_loc_cd_NE(info);
		else if (ne == columnDtl_prsppl_loc_nm) doDtl_prsppl_loc_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd) doDtl_str_ln_cd_NE(info);
		else if (ne == columnDtl_str_ln_nm) doDtl_str_ln_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NE(info);
		else if (ne == columnDtl_prsppl_wg_cd) doDtl_prsppl_wg_cd_NE(info);
		else if (ne == columnDtl_prsppl_wg_nm) doDtl_prsppl_wg_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_lot_no) doDtl_lot_no_NE(info);
		else if (ne == columnDtl_sublot_no) doDtl_sublot_no_NE(info);
		else if (ne == columnDtl_ver_no) doDtl_ver_no_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_stk_id_typ) doDtl_stk_id_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_prov_typ) doDtl_prov_typ_NE(info);
		else if (ne == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NE(info);
		else if (ne == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NE(info);
		else if (ne == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NE(info);
		else if (ne == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NE(info);
		else if (ne == columnDtl_base_cur_cd) doDtl_base_cur_cd_NE(info);
		else if (ne == columnDtl_base_cur_nm) doDtl_base_cur_nm_NE(info);
		else if (ne == columnDtl_xrate_cd) doDtl_xrate_cd_NE(info);
		else if (ne == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NE(info);
		else if (ne == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NE(info);
		else if (ne == columnDtl_ptax_xrate) doDtl_ptax_xrate_NE(info);
		else if (ne == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_xfr_rsn_cd) doDtl_xfr_rsn_cd_NE(info);
		else if (ne == columnDtl_xfr_rsn_nm) doDtl_xfr_rsn_nm_NE(info);
		else if (ne == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_dlv_prnted_flg) doDtl_dlv_prnted_flg_NE(info);
		else if (ne == columnDtl_prov_src_act_typ) doDtl_prov_src_act_typ_NE(info);
		else if (ne == columnDtl_prov_src_act_typ_nm) doDtl_prov_src_act_typ_nm_NE(info);
		else if (ne == columnDtl_prov_src_act_no) doDtl_prov_src_act_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_purc_act_no) doDtl_purc_act_no_NE(info);
		else if (ne == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_NE(info);
		else if (ne == columnDtl_mfg_act_no) doDtl_mfg_act_no_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_prov_act_no) doDtl_prov_act_no_NE(info);
		else if (ne == columnDtl_prov_act_rev) doDtl_prov_act_rev_NE(info);
		else if (ne == columnDtl_edi_flg) doDtl_edi_flg_NE(info);
		else if (ne == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NE(info);
		else if (ne == columnDtl_prov_src_schd_typ) doDtl_prov_src_schd_typ_NE(info);
		else if (ne == columnDtl_prov_src_schd_typ_nm) doDtl_prov_src_schd_typ_nm_NE(info);
		else if (ne == columnDtl_prov_src_schd_no1) doDtl_prov_src_schd_no1_NE(info);
		else if (ne == columnDtl_prov_src_schd_no2) doDtl_prov_src_schd_no2_NE(info);
		else if (ne == columnDtl_prov_schd_no) doDtl_prov_schd_no_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
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
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_prov_amt_rnd_typ) doDtl_prov_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_prov_tax_rnd_typ) doDtl_prov_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NE(info);
		else if (ne == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NE(info);
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
	 * [Cnd]パネルの[prov]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_rtn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_rtn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ffr_prov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ffr_prov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[onr_prov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_onr_prov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_subcon_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_src_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[accpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_rnd_typ_NE(MCEventInfo info){
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
		else if (nx == Cnd_prov) doCnd_prov_NX(info);
		else if (nx == Cnd_prov_rtn) doCnd_prov_rtn_NX(info);
		else if (nx == Cnd_ffr_prov_flg) doCnd_ffr_prov_flg_NX(info);
		else if (nx == Cnd_onr_prov_flg) doCnd_onr_prov_flg_NX(info);
		else if (nx == Cnd_subcon_flg) doCnd_subcon_flg_NX(info);
		else if (nx == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NX(info);
		else if (nx == Cnd_dlv_not_prnted) doCnd_dlv_not_prnted_NX(info);
		else if (nx == Cnd_dlv_prnted) doCnd_dlv_prnted_NX(info);
		else if (nx == Cnd_on_edi_flg) doCnd_on_edi_flg_NX(info);
		else if (nx == Cnd_off_edi_flg) doCnd_off_edi_flg_NX(info);
		else if (nx == Cnd_accpt_dt_fr) doCnd_accpt_dt_fr_NX(info);
		else if (nx == Cnd_accpt_dt_to) doCnd_accpt_dt_to_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NX(info);
		else if (nx == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_prsppl_cd) doCnd_prsppl_cd_NX(info);
		else if (nx == Cnd_prsppl_nm) doCnd_prsppl_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_prsppl_loc_cd) doCnd_prsppl_loc_cd_NX(info);
		else if (nx == Cnd_prsppl_loc_nm) doCnd_prsppl_loc_nm_NX(info);
		else if (nx == Cnd_prsppl_str_ln_cd) doCnd_prsppl_str_ln_cd_NX(info);
		else if (nx == Cnd_prsppl_str_ln_nm) doCnd_prsppl_str_ln_nm_NX(info);
		else if (nx == Cnd_prsppl_wg_cd) doCnd_prsppl_wg_cd_NX(info);
		else if (nx == Cnd_prsppl_wg_nm) doCnd_prsppl_wg_nm_NX(info);
		else if (nx == Cnd_prsppl_lg_grp_cd) doCnd_prsppl_lg_grp_cd_NX(info);
		else if (nx == Cnd_prsppl_lg_grp_nm) doCnd_prsppl_lg_grp_nm_NX(info);
		else if (nx == Cnd_prsppl_site_cd) doCnd_prsppl_site_cd_NX(info);
		else if (nx == Cnd_prsppl_site_nm) doCnd_prsppl_site_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_stk_id_typ) doCnd_stk_id_typ_NX(info);
		else if (nx == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NX(info);
		else if (nx == Cnd_prov_basis_typ) doCnd_prov_basis_typ_NX(info);
		else if (nx == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_dlv_slip_d_no) doCnd_dlv_slip_d_no_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_foreign_flg) doCnd_foreign_flg_NX(info);
		else if (nx == Cnd_tax_cd) doCnd_tax_cd_NX(info);
		else if (nx == Cnd_tax_nm) doCnd_tax_nm_NX(info);
		else if (nx == Cnd_prov_src_act_typ) doCnd_prov_src_act_typ_NX(info);
		else if (nx == Cnd_prov_src_act_typ_nm) doCnd_prov_src_act_typ_nm_NX(info);
		else if (nx == Cnd_prov_src_act_no) doCnd_prov_src_act_no_NX(info);
		else if (nx == Cnd_prov_act_no) doCnd_prov_act_no_NX(info);
		else if (nx == Cnd_prov_src_schd_typ) doCnd_prov_src_schd_typ_NX(info);
		else if (nx == Cnd_prov_src_schd_typ_nm) doCnd_prov_src_schd_typ_nm_NX(info);
		else if (nx == Cnd_prov_src_schd_no1) doCnd_prov_src_schd_no1_NX(info);
		else if (nx == Cnd_prov_src_schd_no2) doCnd_prov_src_schd_no2_NX(info);
		else if (nx == Cnd_prov_schd_no) doCnd_prov_schd_no_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NX(info);
		else if (nx == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NX(info);
		else if (nx == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_NX(info);
		else if (nx == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_NX(info);
		else if (nx == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_accpt_dt) doDtl_accpt_dt_NX(info);
		else if (nx == columnDtl_ac_ym) doDtl_ac_ym_NX(info);
		else if (nx == columnDtl_ac_dt) doDtl_ac_dt_NX(info);
		else if (nx == columnDtl_base_ac_dt) doDtl_base_ac_dt_NX(info);
		else if (nx == columnDtl_can_ac_dt) doDtl_can_ac_dt_NX(info);
		else if (nx == columnDtl_accpt_schd_dt) doDtl_accpt_schd_dt_NX(info);
		else if (nx == columnDtl_prsppl_cd) doDtl_prsppl_cd_NX(info);
		else if (nx == columnDtl_prsppl_nm) doDtl_prsppl_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NX(info);
		else if (nx == columnDtl_prsppl_loc_cd) doDtl_prsppl_loc_cd_NX(info);
		else if (nx == columnDtl_prsppl_loc_nm) doDtl_prsppl_loc_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd) doDtl_str_ln_cd_NX(info);
		else if (nx == columnDtl_str_ln_nm) doDtl_str_ln_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NX(info);
		else if (nx == columnDtl_prsppl_wg_cd) doDtl_prsppl_wg_cd_NX(info);
		else if (nx == columnDtl_prsppl_wg_nm) doDtl_prsppl_wg_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_lot_no) doDtl_lot_no_NX(info);
		else if (nx == columnDtl_sublot_no) doDtl_sublot_no_NX(info);
		else if (nx == columnDtl_ver_no) doDtl_ver_no_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_stk_id_typ) doDtl_stk_id_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_prov_typ) doDtl_prov_typ_NX(info);
		else if (nx == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NX(info);
		else if (nx == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NX(info);
		else if (nx == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NX(info);
		else if (nx == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NX(info);
		else if (nx == columnDtl_base_cur_cd) doDtl_base_cur_cd_NX(info);
		else if (nx == columnDtl_base_cur_nm) doDtl_base_cur_nm_NX(info);
		else if (nx == columnDtl_xrate_cd) doDtl_xrate_cd_NX(info);
		else if (nx == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NX(info);
		else if (nx == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NX(info);
		else if (nx == columnDtl_ptax_xrate) doDtl_ptax_xrate_NX(info);
		else if (nx == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_xfr_rsn_cd) doDtl_xfr_rsn_cd_NX(info);
		else if (nx == columnDtl_xfr_rsn_nm) doDtl_xfr_rsn_nm_NX(info);
		else if (nx == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_dlv_prnted_flg) doDtl_dlv_prnted_flg_NX(info);
		else if (nx == columnDtl_prov_src_act_typ) doDtl_prov_src_act_typ_NX(info);
		else if (nx == columnDtl_prov_src_act_typ_nm) doDtl_prov_src_act_typ_nm_NX(info);
		else if (nx == columnDtl_prov_src_act_no) doDtl_prov_src_act_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_purc_act_no) doDtl_purc_act_no_NX(info);
		else if (nx == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_NX(info);
		else if (nx == columnDtl_mfg_act_no) doDtl_mfg_act_no_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_prov_act_no) doDtl_prov_act_no_NX(info);
		else if (nx == columnDtl_prov_act_rev) doDtl_prov_act_rev_NX(info);
		else if (nx == columnDtl_edi_flg) doDtl_edi_flg_NX(info);
		else if (nx == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NX(info);
		else if (nx == columnDtl_prov_src_schd_typ) doDtl_prov_src_schd_typ_NX(info);
		else if (nx == columnDtl_prov_src_schd_typ_nm) doDtl_prov_src_schd_typ_nm_NX(info);
		else if (nx == columnDtl_prov_src_schd_no1) doDtl_prov_src_schd_no1_NX(info);
		else if (nx == columnDtl_prov_src_schd_no2) doDtl_prov_src_schd_no2_NX(info);
		else if (nx == columnDtl_prov_schd_no) doDtl_prov_schd_no_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
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
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_prov_amt_rnd_typ) doDtl_prov_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_prov_tax_rnd_typ) doDtl_prov_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NX(info);
		else if (nx == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NX(info);
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
	 * [Cnd]パネルの[prov]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_rtn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_rtn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ffr_prov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ffr_prov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[onr_prov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_onr_prov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_subcon_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_src_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[accpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_rnd_typ_NX(MCEventInfo info){
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
		if (lc == Cnd_accpt_dt_fr) doCnd_accpt_dt_fr_LC(info);
		else if (lc == Cnd_accpt_dt_to) doCnd_accpt_dt_to_LC(info);
		else if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_LC(info);
		else if (lc == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_prsppl_cd) doCnd_prsppl_cd_LC(info);
		else if (lc == Cnd_prsppl_nm) doCnd_prsppl_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_prsppl_loc_cd) doCnd_prsppl_loc_cd_LC(info);
		else if (lc == Cnd_prsppl_loc_nm) doCnd_prsppl_loc_nm_LC(info);
		else if (lc == Cnd_prsppl_str_ln_cd) doCnd_prsppl_str_ln_cd_LC(info);
		else if (lc == Cnd_prsppl_str_ln_nm) doCnd_prsppl_str_ln_nm_LC(info);
		else if (lc == Cnd_prsppl_wg_cd) doCnd_prsppl_wg_cd_LC(info);
		else if (lc == Cnd_prsppl_wg_nm) doCnd_prsppl_wg_nm_LC(info);
		else if (lc == Cnd_prsppl_lg_grp_cd) doCnd_prsppl_lg_grp_cd_LC(info);
		else if (lc == Cnd_prsppl_lg_grp_nm) doCnd_prsppl_lg_grp_nm_LC(info);
		else if (lc == Cnd_prsppl_site_cd) doCnd_prsppl_site_cd_LC(info);
		else if (lc == Cnd_prsppl_site_nm) doCnd_prsppl_site_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_stk_id_typ) doCnd_stk_id_typ_LC(info);
		else if (lc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_LC(info);
		else if (lc == Cnd_prov_basis_typ) doCnd_prov_basis_typ_LC(info);
		else if (lc == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_dlv_slip_d_no) doCnd_dlv_slip_d_no_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_tax_cd) doCnd_tax_cd_LC(info);
		else if (lc == Cnd_tax_nm) doCnd_tax_nm_LC(info);
		else if (lc == Cnd_prov_src_act_typ) doCnd_prov_src_act_typ_LC(info);
		else if (lc == Cnd_prov_src_act_typ_nm) doCnd_prov_src_act_typ_nm_LC(info);
		else if (lc == Cnd_prov_src_act_no) doCnd_prov_src_act_no_LC(info);
		else if (lc == Cnd_prov_act_no) doCnd_prov_act_no_LC(info);
		else if (lc == Cnd_prov_src_schd_typ) doCnd_prov_src_schd_typ_LC(info);
		else if (lc == Cnd_prov_src_schd_typ_nm) doCnd_prov_src_schd_typ_nm_LC(info);
		else if (lc == Cnd_prov_src_schd_no1) doCnd_prov_src_schd_no1_LC(info);
		else if (lc == Cnd_prov_src_schd_no2) doCnd_prov_src_schd_no2_LC(info);
		else if (lc == Cnd_prov_schd_no) doCnd_prov_schd_no_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == UpriBulkSet_upri_dt) doUpriBulkSet_upri_dt_LC(info);
		else if (lc == XrateBulkSet_xrate_dt) doXrateBulkSet_xrate_dt_LC(info);
		else if (lc == TaxBulkSet_tax_dt) doTaxBulkSet_tax_dt_LC(info);
		else if (lc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_accpt_dt) doDtl_accpt_dt_LC(info);
		else if (lc == columnDtl_ac_ym) doDtl_ac_ym_LC(info);
		else if (lc == columnDtl_ac_dt) doDtl_ac_dt_LC(info);
		else if (lc == columnDtl_base_ac_dt) doDtl_base_ac_dt_LC(info);
		else if (lc == columnDtl_can_ac_dt) doDtl_can_ac_dt_LC(info);
		else if (lc == columnDtl_accpt_schd_dt) doDtl_accpt_schd_dt_LC(info);
		else if (lc == columnDtl_prsppl_cd) doDtl_prsppl_cd_LC(info);
		else if (lc == columnDtl_prsppl_nm) doDtl_prsppl_nm_LC(info);
		else if (lc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_LC(info);
		else if (lc == columnDtl_prsppl_loc_cd) doDtl_prsppl_loc_cd_LC(info);
		else if (lc == columnDtl_prsppl_loc_nm) doDtl_prsppl_loc_nm_LC(info);
		else if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		else if (lc == columnDtl_str_ln_nm) doDtl_str_ln_nm_LC(info);
		else if (lc == columnDtl_prsppl_wg_cd) doDtl_prsppl_wg_cd_LC(info);
		else if (lc == columnDtl_prsppl_wg_nm) doDtl_prsppl_wg_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		else if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		else if (lc == columnDtl_ver_no) doDtl_ver_no_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_stk_id_typ) doDtl_stk_id_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_prov_typ) doDtl_prov_typ_LC(info);
		else if (lc == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_LC(info);
		else if (lc == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_LC(info);
		else if (lc == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_LC(info);
		else if (lc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_LC(info);
		else if (lc == columnDtl_base_cur_cd) doDtl_base_cur_cd_LC(info);
		else if (lc == columnDtl_base_cur_nm) doDtl_base_cur_nm_LC(info);
		else if (lc == columnDtl_xrate_cd) doDtl_xrate_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_LC(info);
		else if (lc == columnDtl_ptax_xrate) doDtl_ptax_xrate_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_xfr_rsn_cd) doDtl_xfr_rsn_cd_LC(info);
		else if (lc == columnDtl_xfr_rsn_nm) doDtl_xfr_rsn_nm_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_prov_src_act_typ) doDtl_prov_src_act_typ_LC(info);
		else if (lc == columnDtl_prov_src_act_typ_nm) doDtl_prov_src_act_typ_nm_LC(info);
		else if (lc == columnDtl_prov_src_act_no) doDtl_prov_src_act_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_purc_act_no) doDtl_purc_act_no_LC(info);
		else if (lc == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_LC(info);
		else if (lc == columnDtl_mfg_act_no) doDtl_mfg_act_no_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_prov_act_no) doDtl_prov_act_no_LC(info);
		else if (lc == columnDtl_prov_act_rev) doDtl_prov_act_rev_LC(info);
		else if (lc == columnDtl_prov_src_schd_typ) doDtl_prov_src_schd_typ_LC(info);
		else if (lc == columnDtl_prov_src_schd_typ_nm) doDtl_prov_src_schd_typ_nm_LC(info);
		else if (lc == columnDtl_prov_src_schd_no1) doDtl_prov_src_schd_no1_LC(info);
		else if (lc == columnDtl_prov_src_schd_no2) doDtl_prov_src_schd_no2_LC(info);
		else if (lc == columnDtl_prov_schd_no) doDtl_prov_schd_no_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
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
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_prov_amt_rnd_typ) doDtl_prov_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_prov_tax_rnd_typ) doDtl_prov_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_LC(info);
		else if (lc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_LC(info);
	}

	/**
	 * [Cnd]パネルの[accpt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[accpt_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_site_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_src_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_src_schd_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_src_schd_no2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[accpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dt_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[can_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_can_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prsppl_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prsppl_wg_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_src_schd_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_src_schd_no2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_rnd_typ_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_loc_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_wg_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_site_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
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
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSloStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_id_typ]の作成メソッド
	 */
	public MCList getCnd_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prov_basis_typ]の作成メソッド
	 */
	public MCList getCnd_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prov_src_act_typ]の作成メソッド
	 */
	public MCList getCnd_prov_src_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getProvSrcActTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prov_src_schd_typ]の作成メソッド
	 */
	public MCList getCnd_prov_src_schd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getProvSrcSchdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ap_dpt_cd(MCRow row, MCEventInfo info){
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_xfr_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_xfr_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXfrBizRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1160.Srch01")) {
			return new MS_MSBEL1160_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1160.Upd01")) {
			return new MS_MSBEL1160_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1160.Sprt01")) {
			return new MS_MSBEL1160_Sprt01Bridge();
		}
		if (id.equals("MS.MSBEL1160.Sprt02")) {
			return new MS_MSBEL1160_Sprt02Bridge();
		}
		if (id.equals("MS.MSBEL1160.Sprt03")) {
			return new MS_MSBEL1160_Sprt03Bridge();
		}
		if (id.equals("MS.MSBEL1160.Prnt01")) {
			return new MS_MSBEL1160_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1160_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1160_Srch01Bridge() {
			p_MS_MSBEL1160_Srch01 = new MCParam(PDef.MS_MSBEL1160_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1160_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1160.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));

			p_MS_MSBEL1160_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1160_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1160_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1160_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1160_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1160.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1160.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1160.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1160_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1160_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)p_MS_MSBEL1160_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1160_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1160_Upd01Bridge() {
			p_MS_MSBEL1160_Upd01 = new MCParam(PDef.MS_MSBEL1160_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1160_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1160.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));

			p_MS_MSBEL1160_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1160_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1160_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1160_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1160_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1160_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1160.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1160.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1160.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1160.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1160_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1160_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)p_MS_MSBEL1160_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1160_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1160_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1160_Sprt01Bridge() {
			p_MS_MSBEL1160_Sprt01 = new MCParam(PDef.MS_MSBEL1160_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1160_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.UpriSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.UpriSrchR.class));

			p_MS_MSBEL1160_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1160_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1160_Sprt01.addUpBlock(getUpriSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1160_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1160_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1160_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.UpriSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1160_Sprt01;
		}

		protected void show() {
			setUpriSrchL((MCList<mcframe.clientMSBE.MSBEP1160.UpriSrchR>)p_MS_MSBEL1160_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1160_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1160_Sprt02;

		/** コンストラクタ */
		protected MS_MSBEL1160_Sprt02Bridge() {
			p_MS_MSBEL1160_Sprt02 = new MCParam(PDef.MS_MSBEL1160_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1160_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.XrateSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.XrateSrchR.class));

			p_MS_MSBEL1160_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1160_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1160_Sprt02.addUpBlock(getXrateSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1160_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1160_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1160_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.XrateSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1160_Sprt02;
		}

		protected void show() {
			setXrateSrchL((MCList<mcframe.clientMSBE.MSBEP1160.XrateSrchR>)p_MS_MSBEL1160_Sprt02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1160_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Sprt03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1160_Sprt03;

		/** コンストラクタ */
		protected MS_MSBEL1160_Sprt03Bridge() {
			p_MS_MSBEL1160_Sprt03 = new MCParam(PDef.MS_MSBEL1160_Sprt03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1160_Sprt03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.TaxSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.TaxSrchR.class));

			p_MS_MSBEL1160_Sprt03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1160_Sprt03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1160_Sprt03.addUpBlock(getTaxSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1160_Sprt03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1160_Sprt03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1160_Sprt03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.TaxSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1160_Sprt03;
		}

		protected void show() {
			setTaxSrchL((MCList<mcframe.clientMSBE.MSBEP1160.TaxSrchR>)p_MS_MSBEL1160_Sprt03.getContainerParam().getDownBlock(0));
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
	/**
	 * [MS_MSBEL1160_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1160_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1160_Prnt01Bridge() {
			p_MS_MSBEL1160_Prnt01 = new MCParam(PDef.MS_MSBEL1160_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1160_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1160.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));

			p_MS_MSBEL1160_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1160_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1160_Prnt01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1160_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1160_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1160_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1160.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1160.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1160.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1160.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1160_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1160.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1160_Prnt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1160.DtlR>)p_MS_MSBEL1160_Prnt01.getContainerParam().getDownBlock(0));
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
}