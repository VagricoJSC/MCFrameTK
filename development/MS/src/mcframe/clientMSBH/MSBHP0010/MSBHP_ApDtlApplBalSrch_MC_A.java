package mcframe.clientMSBH.MSBHP0010;

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
import mcframe.clientMSBH.MSBHP0010.MSBHP_ApDtlApplBalSrch_MC.MS_MSBHL0010_Srch01Caller;

/**
 * 画面"MSBHP_ApDtlApplBalSrch"パネルクラスです。<p>
 *
 * 未消込の買掛金を明細単位の一覧形式で照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_ApDtlApplBalSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBHP0010";

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
	// [Chk]ブロック関連のField定義
	public MCPanel ChkPanel = null;
	public MCTitledBorder ChkTitledBorder = null;
	// [Chk]ブロックの項目のField定義
	// [Upri]ブロック関連のField定義
	public MCPanel UpriPanel = null;
	public MCTitledBorder UpriTitledBorder = null;
	// [Upri]ブロックの項目のField定義
	// [Crryovr]ブロック関連のField定義
	public MCPanel CrryovrPanel = null;
	public MCTitledBorder CrryovrTitledBorder = null;
	// [Crryovr]ブロックの項目のField定義
	// [PaySpot]ブロック関連のField定義
	public MCPanel PaySpotPanel = null;
	public MCTitledBorder PaySpotTitledBorder = null;
	// [PaySpot]ブロックの項目のField定義
	// [Subcon]ブロック関連のField定義
	public MCPanel SubconPanel = null;
	public MCTitledBorder SubconTitledBorder = null;
	// [Subcon]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Bsppl]ブロック関連のField定義
	public MCPanel BspplPanel = null;
	// [Bsppl]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Asppl]ブロック関連のField定義
	public MCPanel AspplPanel = null;
	// [Asppl]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Sppl]ブロック関連のField定義
	public MCPanel SpplPanel = null;
	// [Sppl]ブロックの項目のField定義
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [Itm]ブロック関連のField定義
	public MCPanel ItmPanel = null;
	// [Itm]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * PAY,View (to be paid),PA;AP,View (accounts payable),AP; PAY,参照する（支払対象）,PAY;AP,参照する（買掛）,AP;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PAY = null;
	public MCRadioButton Cnd_ope_AP = null;
	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public MCCheckBox Cnd_unchk_flg = null;
	/**
	 * Collated 照合済.<p>
	 *
	 */
	public MCCheckBox Cnd_chk_flg = null;
	/**
	 * Unit price 本単価.<p>
	 *
	 */
	public MCCheckBox Cnd_upri_flg = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCCheckBox Cnd_interim_flg = null;
	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public MCCheckBox Cnd_crryovr_flg = null;
	/**
	 * Except for carry-over 繰越分以外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_crryovr_flg = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_spot_flg = null;
	/**
	 * Other than payment per transaction 都度支払以外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_pay_spot_flg = null;
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
	public MCLabel Cnd_pay_schd_dt_fr_Label = null;
	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_dt_fr = null;
	public MCLabel Cnd_pay_schd_dt_to_Label = null;
	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_dt_to = null;
	public MCLabel Cnd_bsppl_cl_dt_fr_Label = null;
	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_bsppl_cl_dt_fr = null;
	public MCLabel Cnd_bsppl_cl_dt_to_Label = null;
	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_bsppl_cl_dt_to = null;
	public MCLabel Cnd_act_dt_fr_Label = null;
	/**
	 * Actual date FROM 実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_act_dt_fr = null;
	public MCLabel Cnd_act_dt_to_Label = null;
	/**
	 * Actual date TO 実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_act_dt_to = null;
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
	public MCLabel Cnd_pass_days_Label = null;
	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public MCNumberField Cnd_pass_days = null;
	public MCLabel Cnd_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_nm = null;
	public MCLabel Cnd_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Cnd_asppl_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_nm = null;
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
	public MCLabel Cnd_pay_sts_typ_Label = null;
	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_pay_sts_typ = null;
	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_pay_sts_typ_nm = null;
	public MCLabel Cnd_pay_mtd_typ_Label = null;
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_pay_mtd_typ = null;
	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public MCTextField Cnd_pay_mtd_typ_nm = null;
	public MCLabel Cnd_pay_chk_no_Label = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_chk_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_d_no = null;
	public MCLabel Cnd_purc_act_no_Label = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_act_no = null;
	public MCLabel Cnd_purc_act_d_no_Label = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_act_d_no = null;
	public MCLabel Cnd_bp_dlv_slip_no_Label = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_dlv_slip_no = null;
	public MCLabel Cnd_bp_dlv_slip_d_no_Label = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_dlv_slip_d_no = null;
	public MCLabel Cnd_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_no = null;
	public MCLabel Cnd_rcpt_iv_mng_no_Label = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_mng_no = null;
	public MCLabel Cnd_ap_d_no_Label = null;
	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ap_d_no = null;
	public MCLabel Cnd_pay_schd_d_print_rmrks_Label = null;
	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public MCTextField Cnd_pay_schd_d_print_rmrks = null;
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
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public MCCheckBox Cnd_accrued_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bsppl_grp_p_PPanel;
	public MCLabel Cnd_bsppl_grp_lab1;	// [Cnd]の[bsppl_grp_p.bp_grp_lab1]を[Cnd_bsppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg1;	// [Cnd]の[bsppl_grp_p.bp_grp_flg1]を[Cnd_bsppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd1;	// [Cnd]の[bsppl_grp_p.bp_grp_cd1]を[Cnd_bsppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm1;	// [Cnd]の[bsppl_grp_p.bp_grp_nm1]を[Cnd_bsppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab2;	// [Cnd]の[bsppl_grp_p.bp_grp_lab2]を[Cnd_bsppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg2;	// [Cnd]の[bsppl_grp_p.bp_grp_flg2]を[Cnd_bsppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd2;	// [Cnd]の[bsppl_grp_p.bp_grp_cd2]を[Cnd_bsppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm2;	// [Cnd]の[bsppl_grp_p.bp_grp_nm2]を[Cnd_bsppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab3;	// [Cnd]の[bsppl_grp_p.bp_grp_lab3]を[Cnd_bsppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg3;	// [Cnd]の[bsppl_grp_p.bp_grp_flg3]を[Cnd_bsppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd3;	// [Cnd]の[bsppl_grp_p.bp_grp_cd3]を[Cnd_bsppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm3;	// [Cnd]の[bsppl_grp_p.bp_grp_nm3]を[Cnd_bsppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab4;	// [Cnd]の[bsppl_grp_p.bp_grp_lab4]を[Cnd_bsppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg4;	// [Cnd]の[bsppl_grp_p.bp_grp_flg4]を[Cnd_bsppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd4;	// [Cnd]の[bsppl_grp_p.bp_grp_cd4]を[Cnd_bsppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm4;	// [Cnd]の[bsppl_grp_p.bp_grp_nm4]を[Cnd_bsppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab5;	// [Cnd]の[bsppl_grp_p.bp_grp_lab5]を[Cnd_bsppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg5;	// [Cnd]の[bsppl_grp_p.bp_grp_flg5]を[Cnd_bsppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd5;	// [Cnd]の[bsppl_grp_p.bp_grp_cd5]を[Cnd_bsppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm5;	// [Cnd]の[bsppl_grp_p.bp_grp_nm5]を[Cnd_bsppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab6;	// [Cnd]の[bsppl_grp_p.bp_grp_lab6]を[Cnd_bsppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg6;	// [Cnd]の[bsppl_grp_p.bp_grp_flg6]を[Cnd_bsppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd6;	// [Cnd]の[bsppl_grp_p.bp_grp_cd6]を[Cnd_bsppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm6;	// [Cnd]の[bsppl_grp_p.bp_grp_nm6]を[Cnd_bsppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab7;	// [Cnd]の[bsppl_grp_p.bp_grp_lab7]を[Cnd_bsppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg7;	// [Cnd]の[bsppl_grp_p.bp_grp_flg7]を[Cnd_bsppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd7;	// [Cnd]の[bsppl_grp_p.bp_grp_cd7]を[Cnd_bsppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm7;	// [Cnd]の[bsppl_grp_p.bp_grp_nm7]を[Cnd_bsppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab8;	// [Cnd]の[bsppl_grp_p.bp_grp_lab8]を[Cnd_bsppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg8;	// [Cnd]の[bsppl_grp_p.bp_grp_flg8]を[Cnd_bsppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd8;	// [Cnd]の[bsppl_grp_p.bp_grp_cd8]を[Cnd_bsppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm8;	// [Cnd]の[bsppl_grp_p.bp_grp_nm8]を[Cnd_bsppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab9;	// [Cnd]の[bsppl_grp_p.bp_grp_lab9]を[Cnd_bsppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg9;	// [Cnd]の[bsppl_grp_p.bp_grp_flg9]を[Cnd_bsppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd9;	// [Cnd]の[bsppl_grp_p.bp_grp_cd9]を[Cnd_bsppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm9;	// [Cnd]の[bsppl_grp_p.bp_grp_nm9]を[Cnd_bsppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab10;	// [Cnd]の[bsppl_grp_p.bp_grp_lab10]を[Cnd_bsppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg10;	// [Cnd]の[bsppl_grp_p.bp_grp_flg10]を[Cnd_bsppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd10;	// [Cnd]の[bsppl_grp_p.bp_grp_cd10]を[Cnd_bsppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm10;	// [Cnd]の[bsppl_grp_p.bp_grp_nm10]を[Cnd_bsppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_asppl_grp_p_PPanel;
	public MCLabel Cnd_asppl_grp_lab1;	// [Cnd]の[asppl_grp_p.bp_grp_lab1]を[Cnd_asppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg1;	// [Cnd]の[asppl_grp_p.bp_grp_flg1]を[Cnd_asppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd1;	// [Cnd]の[asppl_grp_p.bp_grp_cd1]を[Cnd_asppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm1;	// [Cnd]の[asppl_grp_p.bp_grp_nm1]を[Cnd_asppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab2;	// [Cnd]の[asppl_grp_p.bp_grp_lab2]を[Cnd_asppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg2;	// [Cnd]の[asppl_grp_p.bp_grp_flg2]を[Cnd_asppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd2;	// [Cnd]の[asppl_grp_p.bp_grp_cd2]を[Cnd_asppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm2;	// [Cnd]の[asppl_grp_p.bp_grp_nm2]を[Cnd_asppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab3;	// [Cnd]の[asppl_grp_p.bp_grp_lab3]を[Cnd_asppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg3;	// [Cnd]の[asppl_grp_p.bp_grp_flg3]を[Cnd_asppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd3;	// [Cnd]の[asppl_grp_p.bp_grp_cd3]を[Cnd_asppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm3;	// [Cnd]の[asppl_grp_p.bp_grp_nm3]を[Cnd_asppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab4;	// [Cnd]の[asppl_grp_p.bp_grp_lab4]を[Cnd_asppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg4;	// [Cnd]の[asppl_grp_p.bp_grp_flg4]を[Cnd_asppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd4;	// [Cnd]の[asppl_grp_p.bp_grp_cd4]を[Cnd_asppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm4;	// [Cnd]の[asppl_grp_p.bp_grp_nm4]を[Cnd_asppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab5;	// [Cnd]の[asppl_grp_p.bp_grp_lab5]を[Cnd_asppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg5;	// [Cnd]の[asppl_grp_p.bp_grp_flg5]を[Cnd_asppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd5;	// [Cnd]の[asppl_grp_p.bp_grp_cd5]を[Cnd_asppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm5;	// [Cnd]の[asppl_grp_p.bp_grp_nm5]を[Cnd_asppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab6;	// [Cnd]の[asppl_grp_p.bp_grp_lab6]を[Cnd_asppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg6;	// [Cnd]の[asppl_grp_p.bp_grp_flg6]を[Cnd_asppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd6;	// [Cnd]の[asppl_grp_p.bp_grp_cd6]を[Cnd_asppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm6;	// [Cnd]の[asppl_grp_p.bp_grp_nm6]を[Cnd_asppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab7;	// [Cnd]の[asppl_grp_p.bp_grp_lab7]を[Cnd_asppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg7;	// [Cnd]の[asppl_grp_p.bp_grp_flg7]を[Cnd_asppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd7;	// [Cnd]の[asppl_grp_p.bp_grp_cd7]を[Cnd_asppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm7;	// [Cnd]の[asppl_grp_p.bp_grp_nm7]を[Cnd_asppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab8;	// [Cnd]の[asppl_grp_p.bp_grp_lab8]を[Cnd_asppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg8;	// [Cnd]の[asppl_grp_p.bp_grp_flg8]を[Cnd_asppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd8;	// [Cnd]の[asppl_grp_p.bp_grp_cd8]を[Cnd_asppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm8;	// [Cnd]の[asppl_grp_p.bp_grp_nm8]を[Cnd_asppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab9;	// [Cnd]の[asppl_grp_p.bp_grp_lab9]を[Cnd_asppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg9;	// [Cnd]の[asppl_grp_p.bp_grp_flg9]を[Cnd_asppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd9;	// [Cnd]の[asppl_grp_p.bp_grp_cd9]を[Cnd_asppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm9;	// [Cnd]の[asppl_grp_p.bp_grp_nm9]を[Cnd_asppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab10;	// [Cnd]の[asppl_grp_p.bp_grp_lab10]を[Cnd_asppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg10;	// [Cnd]の[asppl_grp_p.bp_grp_flg10]を[Cnd_asppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd10;	// [Cnd]の[asppl_grp_p.bp_grp_cd10]を[Cnd_asppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm10;	// [Cnd]の[asppl_grp_p.bp_grp_nm10]を[Cnd_asppl_grp_nm10]としてエイリアス定義。
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
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_nm = null;
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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_nm = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ_nm = null;
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
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_nm = null;
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_dt = null;
	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_day = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_basis_dt = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt = null;
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_dt = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Elapsed days 経過日数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pass_days = null;
	/**
	 * Collated 照合済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chk_flg = null;
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_po_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_po_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_po_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_po_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_tax_amt_p.amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_cur_dscnt_amt_p.amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
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
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnRslt_outsrc_flg = null;
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnRslt_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_upri;// [Rslt]の[trd_cur_proc_upri_p.upri]を[columnRslt_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_upri;// [Rslt]の[trd_cur_onr_prov_upri_p.upri]を[columnRslt_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_amt;// [Rslt]の[trd_cur_proc_amt_p.amt]を[columnRslt_trd_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_amt;// [Rslt]の[trd_cur_onr_prov_amt_p.amt]を[columnRslt_trd_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
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
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_upri_dec_place = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
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
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_crryovr_times = null;
	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_sts_typ = null;
	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_sts_typ_nm = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_spot_flg = null;
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_typ = null;
	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_mtd_typ_nm = null;
	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_crryovr_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_upri_dec_place = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_upri;// [Rslt]の[base_cur_proc_upri_p.upri]を[columnRslt_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_upri;// [Rslt]の[base_cur_onr_prov_upri_p.upri]を[columnRslt_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_amt;// [Rslt]の[base_cur_proc_amt_p.amt]を[columnRslt_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_amt;// [Rslt]の[base_cur_onr_prov_amt_p.amt]を[columnRslt_base_cur_onr_prov_amt]としてエイリアス定義。
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
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
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
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
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_mng_no = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_nm = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_nm = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_nm = null;
	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_d_no = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_no = null;
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_mng_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_d_no = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_no = null;
	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_seq = null;
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_rev = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_d_no = null;
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_d_seq = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_purc_ac_dt = null;
	/**
	 * Original AP details No. 元買掛明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_org_ap_d_no = null;
	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_crryovr_ap_d_no = null;
	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_crryovr_src_ap_d_no = null;
	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_pay_schd_no = null;
	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_rcv_bill_no = null;
	/**
	 * Transfer source AP settlement method cd. 振替元債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_ap_sttl_cd = null;
	/**
	 * Transfer source debt settlement method name 振替元債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_ap_sttl_nm = null;
	/**
	 * Transfer source AP settlement type 振替元債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_ap_sttl_typ = null;
	/**
	 * Transfer source AP settlement type name 振替元債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_ap_sttl_typ_nm = null;
	/**
	 * Transfer source AP supplier cd. 振替元買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_asppl_cd = null;
	/**
	 * Transfer source AP supplier name 振替元買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_asppl_nm = null;
	/**
	 * Transfer source AP dept. cd. 振替元債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_ap_dpt_cd = null;
	/**
	 * Transfer source AP dept. name 振替元債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_ap_dpt_nm = null;
	/**
	 * Transfer source scheduled payee cd. 振替元支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_bsppl_cd = null;
	/**
	 * Transfer source scheduled payee name 振替元支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_bsppl_nm = null;
	/**
	 * Cd. of dept. in charge of transfer source scheduled payee 振替元支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of transfer source scheduled payee 振替元支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_bsppl_dpt_nm = null;
	/**
	 * Transfer source sales project No. 振替元案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_wrk_no = null;
	/**
	 * Transfer source sales project name 振替元案件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_src_wrk_nm = null;
	/**
	 * For payment 支払対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_valid_flg = null;
	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_d_print_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bsppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_bsppl_grp_cd1;// [Rslt]の[bsppl_grp_p.bp_grp_cd1]を[columnRslt_bsppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm1;// [Rslt]の[bsppl_grp_p.bp_grp_nm1]を[columnRslt_bsppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd2;// [Rslt]の[bsppl_grp_p.bp_grp_cd2]を[columnRslt_bsppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm2;// [Rslt]の[bsppl_grp_p.bp_grp_nm2]を[columnRslt_bsppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd3;// [Rslt]の[bsppl_grp_p.bp_grp_cd3]を[columnRslt_bsppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm3;// [Rslt]の[bsppl_grp_p.bp_grp_nm3]を[columnRslt_bsppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd4;// [Rslt]の[bsppl_grp_p.bp_grp_cd4]を[columnRslt_bsppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm4;// [Rslt]の[bsppl_grp_p.bp_grp_nm4]を[columnRslt_bsppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd5;// [Rslt]の[bsppl_grp_p.bp_grp_cd5]を[columnRslt_bsppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm5;// [Rslt]の[bsppl_grp_p.bp_grp_nm5]を[columnRslt_bsppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd6;// [Rslt]の[bsppl_grp_p.bp_grp_cd6]を[columnRslt_bsppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm6;// [Rslt]の[bsppl_grp_p.bp_grp_nm6]を[columnRslt_bsppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd7;// [Rslt]の[bsppl_grp_p.bp_grp_cd7]を[columnRslt_bsppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm7;// [Rslt]の[bsppl_grp_p.bp_grp_nm7]を[columnRslt_bsppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd8;// [Rslt]の[bsppl_grp_p.bp_grp_cd8]を[columnRslt_bsppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm8;// [Rslt]の[bsppl_grp_p.bp_grp_nm8]を[columnRslt_bsppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd9;// [Rslt]の[bsppl_grp_p.bp_grp_cd9]を[columnRslt_bsppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm9;// [Rslt]の[bsppl_grp_p.bp_grp_nm9]を[columnRslt_bsppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd10;// [Rslt]の[bsppl_grp_p.bp_grp_cd10]を[columnRslt_bsppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm10;// [Rslt]の[bsppl_grp_p.bp_grp_nm10]を[columnRslt_bsppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_asppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_asppl_grp_cd1;// [Rslt]の[asppl_grp_p.bp_grp_cd1]を[columnRslt_asppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm1;// [Rslt]の[asppl_grp_p.bp_grp_nm1]を[columnRslt_asppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd2;// [Rslt]の[asppl_grp_p.bp_grp_cd2]を[columnRslt_asppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm2;// [Rslt]の[asppl_grp_p.bp_grp_nm2]を[columnRslt_asppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd3;// [Rslt]の[asppl_grp_p.bp_grp_cd3]を[columnRslt_asppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm3;// [Rslt]の[asppl_grp_p.bp_grp_nm3]を[columnRslt_asppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd4;// [Rslt]の[asppl_grp_p.bp_grp_cd4]を[columnRslt_asppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm4;// [Rslt]の[asppl_grp_p.bp_grp_nm4]を[columnRslt_asppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd5;// [Rslt]の[asppl_grp_p.bp_grp_cd5]を[columnRslt_asppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm5;// [Rslt]の[asppl_grp_p.bp_grp_nm5]を[columnRslt_asppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd6;// [Rslt]の[asppl_grp_p.bp_grp_cd6]を[columnRslt_asppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm6;// [Rslt]の[asppl_grp_p.bp_grp_nm6]を[columnRslt_asppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd7;// [Rslt]の[asppl_grp_p.bp_grp_cd7]を[columnRslt_asppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm7;// [Rslt]の[asppl_grp_p.bp_grp_nm7]を[columnRslt_asppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd8;// [Rslt]の[asppl_grp_p.bp_grp_cd8]を[columnRslt_asppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm8;// [Rslt]の[asppl_grp_p.bp_grp_nm8]を[columnRslt_asppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd9;// [Rslt]の[asppl_grp_p.bp_grp_cd9]を[columnRslt_asppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm9;// [Rslt]の[asppl_grp_p.bp_grp_nm9]を[columnRslt_asppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd10;// [Rslt]の[asppl_grp_p.bp_grp_cd10]を[columnRslt_asppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm10;// [Rslt]の[asppl_grp_p.bp_grp_nm10]を[columnRslt_asppl_grp_nm10]としてエイリアス定義。
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
	 * Payment schedule entry 支払予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0030 = null;
	/** [SRCH_PAY]モードを表す定数 */
	public static final String SRCH_PAY = "SRCH_PAY";
	/** [REF_PAY]モードを表す定数 */
	public static final String REF_PAY = "REF_PAY";
	/** [SRCH_AP]モードを表す定数 */
	public static final String SRCH_AP = "SRCH_AP";
	/** [REF_AP]モードを表す定数 */
	public static final String REF_AP = "REF_AP";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_PAY, REF_PAY, SRCH_AP, REF_AP};
	
	/** [MS_MSBHL0010_Srch01]のCallerの作成 */
	protected MSBHP_ApDtlApplBalSrch_MC.MS_MSBHL0010_Srch01Caller createMS_MSBHL0010_Srch01() {
		MSBHP_ApDtlApplBalSrch_MC.MS_MSBHL0010_Srch01Caller<MSBHP_ApDtlApplBalSrch, MS_MSBHL0010_Srch01Bridge>
		caller = ((MSBHP_ApDtlApplBalSrch_MC)this).new MS_MSBHL0010_Srch01Caller<MSBHP_ApDtlApplBalSrch, MS_MSBHL0010_Srch01Bridge>(
					(MSBHP_ApDtlApplBalSrch)this, new MS_MSBHL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0010_Srch01]の呼び出し */
	protected void callMS_MSBHL0010_Srch01() {
		MCCaller caller = createMS_MSBHL0010_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0010.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0010.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0010.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(ChkPanel);
		ret.add(UpriPanel);
		ret.add(CrryovrPanel);
		ret.add(PaySpotPanel);
		ret.add(SubconPanel);
		ret.add(Tab2Panel);
		ret.add(BspplPanel);
		ret.add(Tab3Panel);
		ret.add(AspplPanel);
		ret.add(Tab4Panel);
		ret.add(SpplPanel);
		ret.add(Tab5Panel);
		ret.add(ItmPanel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_ApDtlApplBalSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_ApDtlApplBalSrch_MC_A(String name) {
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
		MSBHP_ApDtlApplBalSrch_MC.jbCreateScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateTop((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateFold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateTab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateChk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateUpri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateCrryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreatePaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateSubcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateTab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateBsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateTab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateAsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateTab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateSppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateTab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateItm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateCnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateLPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateCtrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateRPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateRslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbCreateBtn((MSBHP_ApDtlApplBalSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Chk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateChk(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Upri]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpri(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Crryovr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCrryovr(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [PaySpot]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePaySpot(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Subcon]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSubcon(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Bsppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBsppl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Asppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAsppl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Sppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSppl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Itm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItm(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_ApDtlApplBalSrch p) {
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
		p.Cnd_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bsppl_grp_p());
		p.Cnd_bsppl_grp_p_PPanel.setName("Cnd.bsppl_grp_p");
		p.Cnd_bsppl_grp_lab1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bsppl_grp_lab1.addAliasName("Cnd.bsppl_grp_lab1", p);
		p.Cnd_bsppl_grp_flg1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bsppl_grp_flg1.addAliasName("Cnd.bsppl_grp_flg1", p);
		p.Cnd_bsppl_grp_cd1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bsppl_grp_cd1.addAliasName("Cnd.bsppl_grp_cd1", p);
		p.Cnd_bsppl_grp_nm1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bsppl_grp_nm1.addAliasName("Cnd.bsppl_grp_nm1", p);
		p.Cnd_bsppl_grp_lab2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bsppl_grp_lab2.addAliasName("Cnd.bsppl_grp_lab2", p);
		p.Cnd_bsppl_grp_flg2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bsppl_grp_flg2.addAliasName("Cnd.bsppl_grp_flg2", p);
		p.Cnd_bsppl_grp_cd2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bsppl_grp_cd2.addAliasName("Cnd.bsppl_grp_cd2", p);
		p.Cnd_bsppl_grp_nm2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bsppl_grp_nm2.addAliasName("Cnd.bsppl_grp_nm2", p);
		p.Cnd_bsppl_grp_lab3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bsppl_grp_lab3.addAliasName("Cnd.bsppl_grp_lab3", p);
		p.Cnd_bsppl_grp_flg3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bsppl_grp_flg3.addAliasName("Cnd.bsppl_grp_flg3", p);
		p.Cnd_bsppl_grp_cd3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bsppl_grp_cd3.addAliasName("Cnd.bsppl_grp_cd3", p);
		p.Cnd_bsppl_grp_nm3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bsppl_grp_nm3.addAliasName("Cnd.bsppl_grp_nm3", p);
		p.Cnd_bsppl_grp_lab4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bsppl_grp_lab4.addAliasName("Cnd.bsppl_grp_lab4", p);
		p.Cnd_bsppl_grp_flg4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bsppl_grp_flg4.addAliasName("Cnd.bsppl_grp_flg4", p);
		p.Cnd_bsppl_grp_cd4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bsppl_grp_cd4.addAliasName("Cnd.bsppl_grp_cd4", p);
		p.Cnd_bsppl_grp_nm4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bsppl_grp_nm4.addAliasName("Cnd.bsppl_grp_nm4", p);
		p.Cnd_bsppl_grp_lab5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bsppl_grp_lab5.addAliasName("Cnd.bsppl_grp_lab5", p);
		p.Cnd_bsppl_grp_flg5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bsppl_grp_flg5.addAliasName("Cnd.bsppl_grp_flg5", p);
		p.Cnd_bsppl_grp_cd5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bsppl_grp_cd5.addAliasName("Cnd.bsppl_grp_cd5", p);
		p.Cnd_bsppl_grp_nm5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bsppl_grp_nm5.addAliasName("Cnd.bsppl_grp_nm5", p);
		p.Cnd_bsppl_grp_lab6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bsppl_grp_lab6.addAliasName("Cnd.bsppl_grp_lab6", p);
		p.Cnd_bsppl_grp_flg6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bsppl_grp_flg6.addAliasName("Cnd.bsppl_grp_flg6", p);
		p.Cnd_bsppl_grp_cd6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bsppl_grp_cd6.addAliasName("Cnd.bsppl_grp_cd6", p);
		p.Cnd_bsppl_grp_nm6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bsppl_grp_nm6.addAliasName("Cnd.bsppl_grp_nm6", p);
		p.Cnd_bsppl_grp_lab7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bsppl_grp_lab7.addAliasName("Cnd.bsppl_grp_lab7", p);
		p.Cnd_bsppl_grp_flg7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bsppl_grp_flg7.addAliasName("Cnd.bsppl_grp_flg7", p);
		p.Cnd_bsppl_grp_cd7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bsppl_grp_cd7.addAliasName("Cnd.bsppl_grp_cd7", p);
		p.Cnd_bsppl_grp_nm7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bsppl_grp_nm7.addAliasName("Cnd.bsppl_grp_nm7", p);
		p.Cnd_bsppl_grp_lab8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bsppl_grp_lab8.addAliasName("Cnd.bsppl_grp_lab8", p);
		p.Cnd_bsppl_grp_flg8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bsppl_grp_flg8.addAliasName("Cnd.bsppl_grp_flg8", p);
		p.Cnd_bsppl_grp_cd8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bsppl_grp_cd8.addAliasName("Cnd.bsppl_grp_cd8", p);
		p.Cnd_bsppl_grp_nm8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bsppl_grp_nm8.addAliasName("Cnd.bsppl_grp_nm8", p);
		p.Cnd_bsppl_grp_lab9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bsppl_grp_lab9.addAliasName("Cnd.bsppl_grp_lab9", p);
		p.Cnd_bsppl_grp_flg9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bsppl_grp_flg9.addAliasName("Cnd.bsppl_grp_flg9", p);
		p.Cnd_bsppl_grp_cd9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bsppl_grp_cd9.addAliasName("Cnd.bsppl_grp_cd9", p);
		p.Cnd_bsppl_grp_nm9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bsppl_grp_nm9.addAliasName("Cnd.bsppl_grp_nm9", p);
		p.Cnd_bsppl_grp_lab10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bsppl_grp_lab10.addAliasName("Cnd.bsppl_grp_lab10", p);
		p.Cnd_bsppl_grp_flg10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bsppl_grp_flg10.addAliasName("Cnd.bsppl_grp_flg10", p);
		p.Cnd_bsppl_grp_cd10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bsppl_grp_cd10.addAliasName("Cnd.bsppl_grp_cd10", p);
		p.Cnd_bsppl_grp_nm10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bsppl_grp_nm10.addAliasName("Cnd.bsppl_grp_nm10", p);
		p.Cnd_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().asppl_grp_p());
		p.Cnd_asppl_grp_p_PPanel.setName("Cnd.asppl_grp_p");
		p.Cnd_asppl_grp_lab1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_asppl_grp_lab1.addAliasName("Cnd.asppl_grp_lab1", p);
		p.Cnd_asppl_grp_flg1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_asppl_grp_flg1.addAliasName("Cnd.asppl_grp_flg1", p);
		p.Cnd_asppl_grp_cd1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_asppl_grp_cd1.addAliasName("Cnd.asppl_grp_cd1", p);
		p.Cnd_asppl_grp_nm1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_asppl_grp_nm1.addAliasName("Cnd.asppl_grp_nm1", p);
		p.Cnd_asppl_grp_lab2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_asppl_grp_lab2.addAliasName("Cnd.asppl_grp_lab2", p);
		p.Cnd_asppl_grp_flg2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_asppl_grp_flg2.addAliasName("Cnd.asppl_grp_flg2", p);
		p.Cnd_asppl_grp_cd2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_asppl_grp_cd2.addAliasName("Cnd.asppl_grp_cd2", p);
		p.Cnd_asppl_grp_nm2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_asppl_grp_nm2.addAliasName("Cnd.asppl_grp_nm2", p);
		p.Cnd_asppl_grp_lab3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_asppl_grp_lab3.addAliasName("Cnd.asppl_grp_lab3", p);
		p.Cnd_asppl_grp_flg3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_asppl_grp_flg3.addAliasName("Cnd.asppl_grp_flg3", p);
		p.Cnd_asppl_grp_cd3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_asppl_grp_cd3.addAliasName("Cnd.asppl_grp_cd3", p);
		p.Cnd_asppl_grp_nm3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_asppl_grp_nm3.addAliasName("Cnd.asppl_grp_nm3", p);
		p.Cnd_asppl_grp_lab4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_asppl_grp_lab4.addAliasName("Cnd.asppl_grp_lab4", p);
		p.Cnd_asppl_grp_flg4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_asppl_grp_flg4.addAliasName("Cnd.asppl_grp_flg4", p);
		p.Cnd_asppl_grp_cd4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_asppl_grp_cd4.addAliasName("Cnd.asppl_grp_cd4", p);
		p.Cnd_asppl_grp_nm4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_asppl_grp_nm4.addAliasName("Cnd.asppl_grp_nm4", p);
		p.Cnd_asppl_grp_lab5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_asppl_grp_lab5.addAliasName("Cnd.asppl_grp_lab5", p);
		p.Cnd_asppl_grp_flg5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_asppl_grp_flg5.addAliasName("Cnd.asppl_grp_flg5", p);
		p.Cnd_asppl_grp_cd5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_asppl_grp_cd5.addAliasName("Cnd.asppl_grp_cd5", p);
		p.Cnd_asppl_grp_nm5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_asppl_grp_nm5.addAliasName("Cnd.asppl_grp_nm5", p);
		p.Cnd_asppl_grp_lab6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_asppl_grp_lab6.addAliasName("Cnd.asppl_grp_lab6", p);
		p.Cnd_asppl_grp_flg6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_asppl_grp_flg6.addAliasName("Cnd.asppl_grp_flg6", p);
		p.Cnd_asppl_grp_cd6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_asppl_grp_cd6.addAliasName("Cnd.asppl_grp_cd6", p);
		p.Cnd_asppl_grp_nm6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_asppl_grp_nm6.addAliasName("Cnd.asppl_grp_nm6", p);
		p.Cnd_asppl_grp_lab7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_asppl_grp_lab7.addAliasName("Cnd.asppl_grp_lab7", p);
		p.Cnd_asppl_grp_flg7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_asppl_grp_flg7.addAliasName("Cnd.asppl_grp_flg7", p);
		p.Cnd_asppl_grp_cd7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_asppl_grp_cd7.addAliasName("Cnd.asppl_grp_cd7", p);
		p.Cnd_asppl_grp_nm7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_asppl_grp_nm7.addAliasName("Cnd.asppl_grp_nm7", p);
		p.Cnd_asppl_grp_lab8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_asppl_grp_lab8.addAliasName("Cnd.asppl_grp_lab8", p);
		p.Cnd_asppl_grp_flg8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_asppl_grp_flg8.addAliasName("Cnd.asppl_grp_flg8", p);
		p.Cnd_asppl_grp_cd8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_asppl_grp_cd8.addAliasName("Cnd.asppl_grp_cd8", p);
		p.Cnd_asppl_grp_nm8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_asppl_grp_nm8.addAliasName("Cnd.asppl_grp_nm8", p);
		p.Cnd_asppl_grp_lab9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_asppl_grp_lab9.addAliasName("Cnd.asppl_grp_lab9", p);
		p.Cnd_asppl_grp_flg9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_asppl_grp_flg9.addAliasName("Cnd.asppl_grp_flg9", p);
		p.Cnd_asppl_grp_cd9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_asppl_grp_cd9.addAliasName("Cnd.asppl_grp_cd9", p);
		p.Cnd_asppl_grp_nm9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_asppl_grp_nm9.addAliasName("Cnd.asppl_grp_nm9", p);
		p.Cnd_asppl_grp_lab10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_asppl_grp_lab10.addAliasName("Cnd.asppl_grp_lab10", p);
		p.Cnd_asppl_grp_flg10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_asppl_grp_flg10.addAliasName("Cnd.asppl_grp_flg10", p);
		p.Cnd_asppl_grp_cd10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_asppl_grp_cd10.addAliasName("Cnd.asppl_grp_cd10", p);
		p.Cnd_asppl_grp_nm10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_asppl_grp_nm10.addAliasName("Cnd.asppl_grp_nm10", p);
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
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_ApDtlApplBalSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_ApDtlApplBalSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$itm_p);
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
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$sno_p);
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
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_po_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_po_wrk_no.addAliasName("Rslt.po_wrk_no", p);
		p.columnRslt_po_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_po_wrk_nm.addAliasName("Rslt.po_wrk_nm", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_proc_upri_p);
		p.Rslt_trd_cur_proc_upri_p_PPanel.setName("Rslt.trd_cur_proc_upri_p");
		p.columnRslt_trd_cur_proc_upri = p.Rslt_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_proc_upri.addAliasName("Rslt.trd_cur_proc_upri", p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_onr_prov_upri_p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.setName("Rslt.trd_cur_onr_prov_upri_p");
		p.columnRslt_trd_cur_onr_prov_upri = p.Rslt_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_onr_prov_upri.addAliasName("Rslt.trd_cur_onr_prov_upri", p);
		p.Rslt_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_proc_amt_p);
		p.Rslt_trd_cur_proc_amt_p_PPanel.setName("Rslt.trd_cur_proc_amt_p");
		p.columnRslt_trd_cur_proc_amt = p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_proc_amt.addAliasName("Rslt.trd_cur_proc_amt", p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_cur_onr_prov_amt_p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.setName("Rslt.trd_cur_onr_prov_amt_p");
		p.columnRslt_trd_cur_onr_prov_amt = p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_onr_prov_amt.addAliasName("Rslt.trd_cur_onr_prov_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_proc_upri_p);
		p.Rslt_base_cur_proc_upri_p_PPanel.setName("Rslt.base_cur_proc_upri_p");
		p.columnRslt_base_cur_proc_upri = p.Rslt_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_proc_upri.addAliasName("Rslt.base_cur_proc_upri", p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_onr_prov_upri_p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.setName("Rslt.base_cur_onr_prov_upri_p");
		p.columnRslt_base_cur_onr_prov_upri = p.Rslt_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_onr_prov_upri.addAliasName("Rslt.base_cur_onr_prov_upri", p);
		p.Rslt_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_proc_amt_p);
		p.Rslt_base_cur_proc_amt_p_PPanel.setName("Rslt.base_cur_proc_amt_p");
		p.columnRslt_base_cur_proc_amt = p.Rslt_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_proc_amt.addAliasName("Rslt.base_cur_proc_amt", p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_cur_onr_prov_amt_p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.setName("Rslt.base_cur_onr_prov_amt_p");
		p.columnRslt_base_cur_onr_prov_amt = p.Rslt_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_onr_prov_amt.addAliasName("Rslt.base_cur_onr_prov_amt", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$bsppl_grp_p);
		p.Rslt_bsppl_grp_p_PPanel.setName("Rslt.bsppl_grp_p");
		p.columnRslt_bsppl_grp_cd1 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bsppl_grp_cd1.addAliasName("Rslt.bsppl_grp_cd1", p);
		p.columnRslt_bsppl_grp_nm1 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bsppl_grp_nm1.addAliasName("Rslt.bsppl_grp_nm1", p);
		p.columnRslt_bsppl_grp_cd2 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bsppl_grp_cd2.addAliasName("Rslt.bsppl_grp_cd2", p);
		p.columnRslt_bsppl_grp_nm2 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bsppl_grp_nm2.addAliasName("Rslt.bsppl_grp_nm2", p);
		p.columnRslt_bsppl_grp_cd3 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bsppl_grp_cd3.addAliasName("Rslt.bsppl_grp_cd3", p);
		p.columnRslt_bsppl_grp_nm3 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bsppl_grp_nm3.addAliasName("Rslt.bsppl_grp_nm3", p);
		p.columnRslt_bsppl_grp_cd4 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bsppl_grp_cd4.addAliasName("Rslt.bsppl_grp_cd4", p);
		p.columnRslt_bsppl_grp_nm4 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bsppl_grp_nm4.addAliasName("Rslt.bsppl_grp_nm4", p);
		p.columnRslt_bsppl_grp_cd5 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bsppl_grp_cd5.addAliasName("Rslt.bsppl_grp_cd5", p);
		p.columnRslt_bsppl_grp_nm5 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bsppl_grp_nm5.addAliasName("Rslt.bsppl_grp_nm5", p);
		p.columnRslt_bsppl_grp_cd6 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bsppl_grp_cd6.addAliasName("Rslt.bsppl_grp_cd6", p);
		p.columnRslt_bsppl_grp_nm6 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bsppl_grp_nm6.addAliasName("Rslt.bsppl_grp_nm6", p);
		p.columnRslt_bsppl_grp_cd7 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bsppl_grp_cd7.addAliasName("Rslt.bsppl_grp_cd7", p);
		p.columnRslt_bsppl_grp_nm7 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bsppl_grp_nm7.addAliasName("Rslt.bsppl_grp_nm7", p);
		p.columnRslt_bsppl_grp_cd8 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bsppl_grp_cd8.addAliasName("Rslt.bsppl_grp_cd8", p);
		p.columnRslt_bsppl_grp_nm8 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bsppl_grp_nm8.addAliasName("Rslt.bsppl_grp_nm8", p);
		p.columnRslt_bsppl_grp_cd9 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bsppl_grp_cd9.addAliasName("Rslt.bsppl_grp_cd9", p);
		p.columnRslt_bsppl_grp_nm9 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bsppl_grp_nm9.addAliasName("Rslt.bsppl_grp_nm9", p);
		p.columnRslt_bsppl_grp_cd10 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bsppl_grp_cd10.addAliasName("Rslt.bsppl_grp_cd10", p);
		p.columnRslt_bsppl_grp_nm10 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bsppl_grp_nm10.addAliasName("Rslt.bsppl_grp_nm10", p);
		p.Rslt_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$asppl_grp_p);
		p.Rslt_asppl_grp_p_PPanel.setName("Rslt.asppl_grp_p");
		p.columnRslt_asppl_grp_cd1 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_asppl_grp_cd1.addAliasName("Rslt.asppl_grp_cd1", p);
		p.columnRslt_asppl_grp_nm1 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_asppl_grp_nm1.addAliasName("Rslt.asppl_grp_nm1", p);
		p.columnRslt_asppl_grp_cd2 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_asppl_grp_cd2.addAliasName("Rslt.asppl_grp_cd2", p);
		p.columnRslt_asppl_grp_nm2 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_asppl_grp_nm2.addAliasName("Rslt.asppl_grp_nm2", p);
		p.columnRslt_asppl_grp_cd3 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_asppl_grp_cd3.addAliasName("Rslt.asppl_grp_cd3", p);
		p.columnRslt_asppl_grp_nm3 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_asppl_grp_nm3.addAliasName("Rslt.asppl_grp_nm3", p);
		p.columnRslt_asppl_grp_cd4 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_asppl_grp_cd4.addAliasName("Rslt.asppl_grp_cd4", p);
		p.columnRslt_asppl_grp_nm4 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_asppl_grp_nm4.addAliasName("Rslt.asppl_grp_nm4", p);
		p.columnRslt_asppl_grp_cd5 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_asppl_grp_cd5.addAliasName("Rslt.asppl_grp_cd5", p);
		p.columnRslt_asppl_grp_nm5 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_asppl_grp_nm5.addAliasName("Rslt.asppl_grp_nm5", p);
		p.columnRslt_asppl_grp_cd6 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_asppl_grp_cd6.addAliasName("Rslt.asppl_grp_cd6", p);
		p.columnRslt_asppl_grp_nm6 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_asppl_grp_nm6.addAliasName("Rslt.asppl_grp_nm6", p);
		p.columnRslt_asppl_grp_cd7 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_asppl_grp_cd7.addAliasName("Rslt.asppl_grp_cd7", p);
		p.columnRslt_asppl_grp_nm7 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_asppl_grp_nm7.addAliasName("Rslt.asppl_grp_nm7", p);
		p.columnRslt_asppl_grp_cd8 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_asppl_grp_cd8.addAliasName("Rslt.asppl_grp_cd8", p);
		p.columnRslt_asppl_grp_nm8 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_asppl_grp_nm8.addAliasName("Rslt.asppl_grp_nm8", p);
		p.columnRslt_asppl_grp_cd9 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_asppl_grp_cd9.addAliasName("Rslt.asppl_grp_cd9", p);
		p.columnRslt_asppl_grp_nm9 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_asppl_grp_nm9.addAliasName("Rslt.asppl_grp_nm9", p);
		p.columnRslt_asppl_grp_cd10 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_asppl_grp_cd10.addAliasName("Rslt.asppl_grp_cd10", p);
		p.columnRslt_asppl_grp_nm10 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_asppl_grp_nm10.addAliasName("Rslt.asppl_grp_nm10", p);
		p.Rslt_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$sppl_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBH.MSBHP0010.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBHP_ApDtlApplBalSrch p) {
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

	
	/** [Cnd_bsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_cd_p = null;

	/**
	 * [Cnd_bsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_cd_ListPutter() {
		if (Cnd_bsppl_cd_p == null) {
			Cnd_bsppl_cd_p = createCnd_bsppl_cd_ListPutter(Cnd_bsppl_cd, "bsppl_cd", "bsppl_nm");

		}
		return Cnd_bsppl_cd_p;
	}
	
	
	/** [Cnd_asppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_asppl_cd_p = null;

	/**
	 * [Cnd_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asppl_cd_ListPutter() {
		if (Cnd_asppl_cd_p == null) {
			Cnd_asppl_cd_p = createCnd_asppl_cd_ListPutter(Cnd_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return Cnd_asppl_cd_p;
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
	
	
	/** [Cnd_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_dpt_cd_p = null;

	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_dpt_cd_ListPutter() {
		if (Cnd_bsppl_dpt_cd_p == null) {
			Cnd_bsppl_dpt_cd_p = createCnd_bsppl_dpt_cd_ListPutter(Cnd_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return Cnd_bsppl_dpt_cd_p;
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
	
	
	/** [Cnd_pay_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_pay_sts_typ_p = null;

	/**
	 * [Cnd_pay_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_sts_typ_ListPutter() {
		if (Cnd_pay_sts_typ_p == null) {
			Cnd_pay_sts_typ_p = createCnd_pay_sts_typ_ListPutter(Cnd_pay_sts_typ, "pay_sts_typ", "pay_sts_typ_nm");

		}
		return Cnd_pay_sts_typ_p;
	}
	
	
	/** [Cnd_pay_mtd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_pay_mtd_typ_p = null;

	/**
	 * [Cnd_pay_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_mtd_typ_ListPutter() {
		if (Cnd_pay_mtd_typ_p == null) {
			Cnd_pay_mtd_typ_p = createCnd_pay_mtd_typ_ListPutter(Cnd_pay_mtd_typ, "pay_mtd_typ", "pay_mtd_typ_nm");

		}
		return Cnd_pay_mtd_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_ApDtlApplBalSrch create(){
		MSBHP_ApDtlApplBalSrch p = new MSBHP_ApDtlApplBalSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_ApDtlApplBalSrch create(String name){
		MSBHP_ApDtlApplBalSrch p = new MSBHP_ApDtlApplBalSrch(name);
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
		MSBHP_ApDtlApplBalSrch_MC.jbfInitScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitTop((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitFold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitTab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitChk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitUpri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitCrryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitPaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitSubcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitTab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitBsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitTab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitAsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitTab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitSppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitTab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitItm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitCnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitLPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitCtrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitRPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitRslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbfInitBtn((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitTop((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitFold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitTab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitChk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitUpri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitCrryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitPaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitSubcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitTab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitBsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitTab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitAsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitTab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitSppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitTab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitItm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitCnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitLPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitCtrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitRPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitRslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.jbInitBtn((MSBHP_ApDtlApplBalSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_ApDtlApplBalSrch p) {
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
	protected static void jbfInitTab1(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Chk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitChk(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.ChkPanel = p.beansFactory.createPanel("Chk");
		p.ChkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Upri]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpri(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.UpriPanel = p.beansFactory.createPanel("Upri");
		p.UpriTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Crryovr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCrryovr(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CrryovrPanel = p.beansFactory.createPanel("Crryovr");
		p.CrryovrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PaySpot]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPaySpot(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.PaySpotPanel = p.beansFactory.createPanel("PaySpot");
		p.PaySpotTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Subcon]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSubcon(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.SubconPanel = p.beansFactory.createPanel("Subcon");
		p.SubconTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBsppl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.BspplPanel = p.beansFactory.createPanel("Bsppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Asppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAsppl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.AspplPanel = p.beansFactory.createPanel("Asppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Sppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSppl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.SpplPanel = p.beansFactory.createPanel("Sppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItm(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.ItmPanel = p.beansFactory.createPanel("Itm");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PAY = p.beansFactory.createRadioButton("Cnd.ope_PAY");
		p.Cnd_ope_AP = p.beansFactory.createRadioButton("Cnd.ope_AP");
		p.Cnd_unchk_flg = p.beansFactory.createCheckBox("Cnd.unchk_flg");
		p.Cnd_chk_flg = p.beansFactory.createCheckBox("Cnd.chk_flg");
		p.Cnd_upri_flg = p.beansFactory.createCheckBox("Cnd.upri_flg");
		p.Cnd_interim_flg = p.beansFactory.createCheckBox("Cnd.interim_flg");
		p.Cnd_crryovr_flg = p.beansFactory.createCheckBox("Cnd.crryovr_flg");
		p.Cnd_not_crryovr_flg = p.beansFactory.createCheckBox("Cnd.not_crryovr_flg");
		p.Cnd_pay_spot_flg = p.beansFactory.createCheckBox("Cnd.pay_spot_flg");
		p.Cnd_not_pay_spot_flg = p.beansFactory.createCheckBox("Cnd.not_pay_spot_flg");
		p.Cnd_subcon_flg = p.beansFactory.createCheckBox("Cnd.subcon_flg");
		p.Cnd_not_subcon_flg = p.beansFactory.createCheckBox("Cnd.not_subcon_flg");
		p.Cnd_pay_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.pay_schd_dt_fr_Label");
		p.Cnd_pay_schd_dt_fr = p.beansFactory.createDateField("Cnd.pay_schd_dt_fr");
		p.Cnd_pay_schd_dt_fr.setLabel(p.Cnd_pay_schd_dt_fr_Label);
		p.Cnd_pay_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_schd_dt_to_Label");
		p.Cnd_pay_schd_dt_to = p.beansFactory.createDateField("Cnd.pay_schd_dt_to");
		p.Cnd_pay_schd_dt_to.setLabel(p.Cnd_pay_schd_dt_to_Label);
		p.Cnd_bsppl_cl_dt_fr_Label = p.beansFactory.createLabel("Cnd.bsppl_cl_dt_fr_Label");
		p.Cnd_bsppl_cl_dt_fr = p.beansFactory.createDateField("Cnd.bsppl_cl_dt_fr");
		p.Cnd_bsppl_cl_dt_fr.setLabel(p.Cnd_bsppl_cl_dt_fr_Label);
		p.Cnd_bsppl_cl_dt_to_Label = p.beansFactory.createLabel("Cnd.bsppl_cl_dt_to_Label");
		p.Cnd_bsppl_cl_dt_to = p.beansFactory.createDateField("Cnd.bsppl_cl_dt_to");
		p.Cnd_bsppl_cl_dt_to.setLabel(p.Cnd_bsppl_cl_dt_to_Label);
		p.Cnd_act_dt_fr_Label = p.beansFactory.createLabel("Cnd.act_dt_fr_Label");
		p.Cnd_act_dt_fr = p.beansFactory.createDateField("Cnd.act_dt_fr");
		p.Cnd_act_dt_fr.setLabel(p.Cnd_act_dt_fr_Label);
		p.Cnd_act_dt_to_Label = p.beansFactory.createLabel("Cnd.act_dt_to_Label");
		p.Cnd_act_dt_to = p.beansFactory.createDateField("Cnd.act_dt_to");
		p.Cnd_act_dt_to.setLabel(p.Cnd_act_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_pass_days_Label = p.beansFactory.createLabel("Cnd.pass_days_Label");
		p.Cnd_pass_days = p.beansFactory.createNumberField("Cnd.pass_days");
		p.Cnd_pass_days.setLabel(p.Cnd_pass_days_Label);
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_asppl_cd_Label = p.beansFactory.createLabel("Cnd.asppl_cd_Label");
		p.Cnd_asppl_cd = p.beansFactory.createTextField("Cnd.asppl_cd");
		p.Cnd_asppl_cd.setLabel(p.Cnd_asppl_cd_Label);
		p.Cnd_asppl_nm = p.beansFactory.createTextField("Cnd.asppl_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_pay_sts_typ_Label = p.beansFactory.createLabel("Cnd.pay_sts_typ_Label");
		p.Cnd_pay_sts_typ = p.beansFactory.createTextComboBox("Cnd.pay_sts_typ");
		p.Cnd_pay_sts_typ.setLabel(p.Cnd_pay_sts_typ_Label);
		p.Cnd_pay_sts_typ_nm = p.beansFactory.createTextField("Cnd.pay_sts_typ_nm");
		p.Cnd_pay_mtd_typ_Label = p.beansFactory.createLabel("Cnd.pay_mtd_typ_Label");
		p.Cnd_pay_mtd_typ = p.beansFactory.createTextComboBox("Cnd.pay_mtd_typ");
		p.Cnd_pay_mtd_typ.setLabel(p.Cnd_pay_mtd_typ_Label);
		p.Cnd_pay_mtd_typ_nm = p.beansFactory.createTextField("Cnd.pay_mtd_typ_nm");
		p.Cnd_pay_chk_no_Label = p.beansFactory.createLabel("Cnd.pay_chk_no_Label");
		p.Cnd_pay_chk_no = p.beansFactory.createTextField("Cnd.pay_chk_no");
		p.Cnd_pay_chk_no.setLabel(p.Cnd_pay_chk_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_purc_act_no_Label = p.beansFactory.createLabel("Cnd.purc_act_no_Label");
		p.Cnd_purc_act_no = p.beansFactory.createTextField("Cnd.purc_act_no");
		p.Cnd_purc_act_no.setLabel(p.Cnd_purc_act_no_Label);
		p.Cnd_purc_act_d_no_Label = p.beansFactory.createLabel("Cnd.purc_act_d_no_Label");
		p.Cnd_purc_act_d_no = p.beansFactory.createTextField("Cnd.purc_act_d_no");
		p.Cnd_purc_act_d_no.setLabel(p.Cnd_purc_act_d_no_Label);
		p.Cnd_bp_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.bp_dlv_slip_no_Label");
		p.Cnd_bp_dlv_slip_no = p.beansFactory.createTextField("Cnd.bp_dlv_slip_no");
		p.Cnd_bp_dlv_slip_no.setLabel(p.Cnd_bp_dlv_slip_no_Label);
		p.Cnd_bp_dlv_slip_d_no_Label = p.beansFactory.createLabel("Cnd.bp_dlv_slip_d_no_Label");
		p.Cnd_bp_dlv_slip_d_no = p.beansFactory.createTextField("Cnd.bp_dlv_slip_d_no");
		p.Cnd_bp_dlv_slip_d_no.setLabel(p.Cnd_bp_dlv_slip_d_no_Label);
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_mng_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_mng_no_Label");
		p.Cnd_rcpt_iv_mng_no = p.beansFactory.createTextField("Cnd.rcpt_iv_mng_no");
		p.Cnd_rcpt_iv_mng_no.setLabel(p.Cnd_rcpt_iv_mng_no_Label);
		p.Cnd_ap_d_no_Label = p.beansFactory.createLabel("Cnd.ap_d_no_Label");
		p.Cnd_ap_d_no = p.beansFactory.createTextField("Cnd.ap_d_no");
		p.Cnd_ap_d_no.setLabel(p.Cnd_ap_d_no_Label);
		p.Cnd_pay_schd_d_print_rmrks_Label = p.beansFactory.createLabel("Cnd.pay_schd_d_print_rmrks_Label");
		p.Cnd_pay_schd_d_print_rmrks = p.beansFactory.createTextField("Cnd.pay_schd_d_print_rmrks");
		p.Cnd_pay_schd_d_print_rmrks.setLabel(p.Cnd_pay_schd_d_print_rmrks_Label);
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
		p.Cnd_accrued_flg = p.beansFactory.createCheckBox("Cnd.accrued_flg");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_typ = p.beansFactory.createTableColumn("Rslt.ap_typ", MCColumnType.TEXT);
		p.columnRslt_ap_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slip_sts_typ = p.beansFactory.createTableColumn("Rslt.slip_sts_typ", MCColumnType.TEXT);
		p.columnRslt_slip_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cl_dt = p.beansFactory.createTableColumn("Rslt.bsppl_cl_dt", MCColumnType.DATE);
		p.columnRslt_bsppl_cl_day = p.beansFactory.createTableColumn("Rslt.bsppl_cl_day", MCColumnType.NUMBER);
		p.columnRslt_pay_basis_dt = p.beansFactory.createTableColumn("Rslt.pay_basis_dt", MCColumnType.DATE);
		p.columnRslt_pay_schd_dt = p.beansFactory.createTableColumn("Rslt.pay_schd_dt", MCColumnType.DATE);
		p.columnRslt_act_dt = p.beansFactory.createTableColumn("Rslt.act_dt", MCColumnType.DATE);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_pass_days = p.beansFactory.createTableColumn("Rslt.pass_days", MCColumnType.NUMBER);
		p.columnRslt_chk_flg = p.beansFactory.createTableColumn("Rslt.chk_flg", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_outsrc_flg = p.beansFactory.createTableColumn("Rslt.outsrc_flg", MCColumnType.CHECK);
		p.columnRslt_repurc_obli_flg = p.beansFactory.createTableColumn("Rslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_subcon_flg = p.beansFactory.createTableColumn("Rslt.subcon_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_pay_crryovr_times = p.beansFactory.createTableColumn("Rslt.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnRslt_pay_sts_typ = p.beansFactory.createTableColumn("Rslt.pay_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pay_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pay_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_pay_spot_flg = p.beansFactory.createTableColumn("Rslt.pay_spot_flg", MCColumnType.CHECK);
		p.columnRslt_pay_mtd_typ = p.beansFactory.createTableColumn("Rslt.pay_mtd_typ", MCColumnType.TEXT);
		p.columnRslt_pay_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.pay_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_crryovr_flg = p.beansFactory.createTableColumn("Rslt.crryovr_flg", MCColumnType.CHECK);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_bp_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_purc_usr_cd = p.beansFactory.createTableColumn("Rslt.purc_usr_cd", MCColumnType.TEXT);
		p.columnRslt_purc_usr_nm = p.beansFactory.createTableColumn("Rslt.purc_usr_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_cd = p.beansFactory.createTableColumn("Rslt.sppl_itm_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_nm = p.beansFactory.createTableColumn("Rslt.sppl_itm_nm", MCColumnType.TEXT);
		p.columnRslt_ap_d_no = p.beansFactory.createTableColumn("Rslt.ap_d_no", MCColumnType.TEXT);
		p.columnRslt_pay_chk_no = p.beansFactory.createTableColumn("Rslt.pay_chk_no", MCColumnType.TEXT);
		p.columnRslt_pay_chk_mng_no = p.beansFactory.createTableColumn("Rslt.pay_chk_mng_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_act_no = p.beansFactory.createTableColumn("Rslt.purc_act_no", MCColumnType.TEXT);
		p.columnRslt_purc_act_seq = p.beansFactory.createTableColumn("Rslt.purc_act_seq", MCColumnType.NUMBER);
		p.columnRslt_purc_act_rev = p.beansFactory.createTableColumn("Rslt.purc_act_rev", MCColumnType.NUMBER);
		p.columnRslt_purc_act_d_no = p.beansFactory.createTableColumn("Rslt.purc_act_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_act_d_seq = p.beansFactory.createTableColumn("Rslt.purc_act_d_seq", MCColumnType.NUMBER);
		p.columnRslt_base_purc_ac_dt = p.beansFactory.createTableColumn("Rslt.base_purc_ac_dt", MCColumnType.DATE);
		p.columnRslt_org_ap_d_no = p.beansFactory.createTableColumn("Rslt.org_ap_d_no", MCColumnType.TEXT);
		p.columnRslt_crryovr_ap_d_no = p.beansFactory.createTableColumn("Rslt.crryovr_ap_d_no", MCColumnType.TEXT);
		p.columnRslt_crryovr_src_ap_d_no = p.beansFactory.createTableColumn("Rslt.crryovr_src_ap_d_no", MCColumnType.TEXT);
		p.columnRslt_sw_src_pay_schd_no = p.beansFactory.createTableColumn("Rslt.sw_src_pay_schd_no", MCColumnType.TEXT);
		p.columnRslt_sw_src_rcv_bill_no = p.beansFactory.createTableColumn("Rslt.sw_src_rcv_bill_no", MCColumnType.TEXT);
		p.columnRslt_sw_src_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.sw_src_ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_sw_src_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.sw_src_ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_sw_src_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.sw_src_ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_sw_src_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.sw_src_ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sw_src_asppl_cd = p.beansFactory.createTableColumn("Rslt.sw_src_asppl_cd", MCColumnType.TEXT);
		p.columnRslt_sw_src_asppl_nm = p.beansFactory.createTableColumn("Rslt.sw_src_asppl_nm", MCColumnType.TEXT);
		p.columnRslt_sw_src_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.sw_src_ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sw_src_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.sw_src_ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sw_src_bsppl_cd = p.beansFactory.createTableColumn("Rslt.sw_src_bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_sw_src_bsppl_nm = p.beansFactory.createTableColumn("Rslt.sw_src_bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_sw_src_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.sw_src_bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sw_src_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.sw_src_bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sw_src_wrk_no = p.beansFactory.createTableColumn("Rslt.sw_src_wrk_no", MCColumnType.TEXT);
		p.columnRslt_sw_src_wrk_nm = p.beansFactory.createTableColumn("Rslt.sw_src_wrk_nm", MCColumnType.TEXT);
		p.columnRslt_valid_flg = p.beansFactory.createTableColumn("Rslt.valid_flg", MCColumnType.CHECK);
		p.columnRslt_pay_schd_d_print_rmrks = p.beansFactory.createTableColumn("Rslt.pay_schd_d_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
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
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0030 = p.beansFactory.createButton("Btn.open_MSBHP0030", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBHP_ApDtlApplBalSrch p) {
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
	protected static void jbInitTop(MSBHP_ApDtlApplBalSrch p) {
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
	protected static void jbInitFold(MSBHP_ApDtlApplBalSrch p) {
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
	protected static void jbInitTab1(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.ChkPanel, null);
		p.Tab1Panel.setLastBeans(p.ChkPanel);
		p.ChkPanel.setNextBeans(p.UpriPanel);
		p.Tab1Panel.add(p.UpriPanel, null);
		p.UpriPanel.setNextBeans(p.CrryovrPanel);
		p.Tab1Panel.add(p.CrryovrPanel, null);
		p.CrryovrPanel.setNextBeans(p.PaySpotPanel);
		p.Tab1Panel.add(p.PaySpotPanel, null);
		p.PaySpotPanel.setNextBeans(p.SubconPanel);
		p.Tab1Panel.add(p.SubconPanel, null);
		p.SubconPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Chk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitChk(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.ChkPanel.setBorder(p.ChkTitledBorder);
		p.ChkPanel.setValueCheck(false);
		p.ChkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ChkPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Upri]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpri(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.UpriPanel.setBorder(p.UpriTitledBorder);
		p.UpriPanel.setValueCheck(false);
		p.UpriPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.UpriPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Crryovr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCrryovr(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CrryovrPanel.setBorder(p.CrryovrTitledBorder);
		p.CrryovrPanel.setValueCheck(false);
		p.CrryovrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CrryovrPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PaySpot]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPaySpot(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.PaySpotPanel.setBorder(p.PaySpotTitledBorder);
		p.PaySpotPanel.setValueCheck(false);
		p.PaySpotPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PaySpotPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Subcon]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSubcon(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.SubconPanel.setBorder(p.SubconTitledBorder);
		p.SubconPanel.setValueCheck(false);
		p.SubconPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SubconPanel.setLayoutPosition("NWXCXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.BspplPanel, null);
		p.Tab2Panel.setLastBeans(p.BspplPanel);
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBsppl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.BspplPanel.setValueCheck(false);
		p.BspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.AspplPanel, null);
		p.Tab3Panel.setLastBeans(p.AspplPanel);
	}

	/**
	 * [Asppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAsppl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.AspplPanel.setValueCheck(false);
		p.AspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.SpplPanel, null);
		p.Tab4Panel.setLastBeans(p.SpplPanel);
	}

	/**
	 * [Sppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSppl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.SpplPanel.setValueCheck(false);
		p.SpplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab5Panel.setValueCheck(false);
		p.Tab5Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab5Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab5Panel.add(p.ItmPanel, null);
		p.Tab5Panel.setLastBeans(p.ItmPanel);
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItm(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.ItmPanel.setValueCheck(false);
		p.ItmPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PAY);
		p.Cnd_ope_PAY.setActionCommand("PAY");
		p.Cnd_ope_Group.add(p.Cnd_ope_PAY);
		p.ScreenOpePanel.add(p.Cnd_ope_PAY);
		p.Cnd_ope_PAY.setNextBeans(p.Cnd_ope_AP);
		p.Cnd_ope_AP.setActionCommand("AP");
		p.Cnd_ope_Group.add(p.Cnd_ope_AP);
		p.ScreenOpePanel.add(p.Cnd_ope_AP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.ope_META);
		p.ChkPanel.add(p.Cnd_unchk_flg);
		p.ChkPanel.setLastBeans(p.Cnd_unchk_flg);
		p.Cnd_unchk_flg.setNextBeans(p.Cnd_chk_flg);
		p.Cnd_unchk_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.unchk_flg_META);
		p.ChkPanel.add(p.Cnd_chk_flg);
		p.Cnd_chk_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.chk_flg_META);
		p.UpriPanel.add(p.Cnd_upri_flg);
		p.UpriPanel.setLastBeans(p.Cnd_upri_flg);
		p.Cnd_upri_flg.setNextBeans(p.Cnd_interim_flg);
		p.Cnd_upri_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.upri_flg_META);
		p.UpriPanel.add(p.Cnd_interim_flg);
		p.Cnd_interim_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.interim_flg_META);
		p.CrryovrPanel.add(p.Cnd_crryovr_flg);
		p.CrryovrPanel.setLastBeans(p.Cnd_crryovr_flg);
		p.Cnd_crryovr_flg.setNextBeans(p.Cnd_not_crryovr_flg);
		p.Cnd_crryovr_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.crryovr_flg_META);
		p.CrryovrPanel.add(p.Cnd_not_crryovr_flg);
		p.Cnd_not_crryovr_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.not_crryovr_flg_META);
		p.PaySpotPanel.add(p.Cnd_pay_spot_flg);
		p.PaySpotPanel.setLastBeans(p.Cnd_pay_spot_flg);
		p.Cnd_pay_spot_flg.setNextBeans(p.Cnd_not_pay_spot_flg);
		p.Cnd_pay_spot_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_spot_flg_META);
		p.PaySpotPanel.add(p.Cnd_not_pay_spot_flg);
		p.Cnd_not_pay_spot_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.not_pay_spot_flg_META);
		p.SubconPanel.add(p.Cnd_subcon_flg);
		p.SubconPanel.setLastBeans(p.Cnd_subcon_flg);
		p.Cnd_subcon_flg.setNextBeans(p.Cnd_not_subcon_flg);
		p.Cnd_subcon_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.subcon_flg_META);
		p.SubconPanel.add(p.Cnd_not_subcon_flg);
		p.Cnd_not_subcon_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.not_subcon_flg_META);
		p.CndPanel.add(p.Cnd_pay_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pay_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_pay_schd_dt_fr);
		p.Cnd_pay_schd_dt_fr.setNextBeans(p.Cnd_pay_schd_dt_to);
		p.Cnd_pay_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_schd_dt_fr_META);
		p.Cnd_pay_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_schd_dt_to);
		p.Cnd_pay_schd_dt_to.setNextBeans(p.Cnd_bsppl_cl_dt_fr);
		p.Cnd_pay_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_schd_dt_to_META);
		p.Cnd_pay_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_fr_Label);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_fr);
		p.Cnd_bsppl_cl_dt_fr.setNextBeans(p.Cnd_bsppl_cl_dt_to);
		p.Cnd_bsppl_cl_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bsppl_cl_dt_fr_META);
		p.Cnd_bsppl_cl_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_to_Label);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_to);
		p.Cnd_bsppl_cl_dt_to.setNextBeans(p.Cnd_act_dt_fr);
		p.Cnd_bsppl_cl_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bsppl_cl_dt_to_META);
		p.Cnd_bsppl_cl_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_dt_fr_Label);
		p.CndPanel.add(p.Cnd_act_dt_fr);
		p.Cnd_act_dt_fr.setNextBeans(p.Cnd_act_dt_to);
		p.Cnd_act_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.act_dt_fr_META);
		p.Cnd_act_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_dt_to_Label);
		p.CndPanel.add(p.Cnd_act_dt_to);
		p.Cnd_act_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_act_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.act_dt_to_META);
		p.Cnd_act_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_pass_days);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pass_days_Label);
		p.CndPanel.add(p.Cnd_pass_days);
		p.Cnd_pass_days.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_pass_days.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pass_days_META);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_asppl_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_asppl_cd_Label);
		p.CndPanel.add(p.Cnd_asppl_cd);
		p.Cnd_asppl_cd.setNextBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.asppl_cd_META);
		p.Cnd_asppl_cd.addLinkBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asppl_cd, true);
		p.CndPanel.add(p.Cnd_asppl_nm);
		p.Cnd_asppl_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_asppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.asppl_nm_META);
		p.setPluralValueEnable(p.Cnd_asppl_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
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
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_pay_sts_typ);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.Cnd_pay_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_sts_typ, true);
		p.Cnd_pay_sts_typ.setLinkBeans(p.Cnd_pay_sts_typ_nm);
		p.CndPanel.add(p.Cnd_pay_sts_typ_Label);
		p.CndPanel.add(p.Cnd_pay_sts_typ);
		p.Cnd_pay_sts_typ.setNextBeans(p.Cnd_pay_sts_typ_nm);
		p.Cnd_pay_sts_typ.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_sts_typ_META);
		p.CndPanel.add(p.Cnd_pay_sts_typ_nm);
		p.Cnd_pay_sts_typ_nm.setNextBeans(p.Cnd_pay_mtd_typ);
		p.Cnd_pay_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_sts_typ_nm_META);
		p.Cnd_pay_mtd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_mtd_typ, true);
		p.Cnd_pay_mtd_typ.setLinkBeans(p.Cnd_pay_mtd_typ_nm);
		p.CndPanel.add(p.Cnd_pay_mtd_typ_Label);
		p.CndPanel.add(p.Cnd_pay_mtd_typ);
		p.Cnd_pay_mtd_typ.setNextBeans(p.Cnd_pay_mtd_typ_nm);
		p.Cnd_pay_mtd_typ.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_mtd_typ_META);
		p.CndPanel.add(p.Cnd_pay_mtd_typ_nm);
		p.Cnd_pay_mtd_typ_nm.setNextBeans(p.Cnd_pay_chk_no);
		p.Cnd_pay_mtd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_mtd_typ_nm_META);
		p.CndPanel.add(p.Cnd_pay_chk_no_Label);
		p.CndPanel.add(p.Cnd_pay_chk_no);
		p.Cnd_pay_chk_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_pay_chk_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_chk_no_META);
		p.setPluralValueEnable(p.Cnd_pay_chk_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_purc_act_d_no);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.CndPanel.add(p.Cnd_purc_act_d_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_d_no);
		p.Cnd_purc_act_d_no.setNextBeans(p.Cnd_bp_dlv_slip_no);
		p.Cnd_purc_act_d_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.purc_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_d_no, true);
		p.CndPanel.add(p.Cnd_bp_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_bp_dlv_slip_no);
		p.Cnd_bp_dlv_slip_no.setNextBeans(p.Cnd_bp_dlv_slip_d_no);
		p.Cnd_bp_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bp_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_bp_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_bp_dlv_slip_d_no_Label);
		p.CndPanel.add(p.Cnd_bp_dlv_slip_d_no);
		p.Cnd_bp_dlv_slip_d_no.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_bp_dlv_slip_d_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.bp_dlv_slip_d_no_META);
		p.setPluralValueEnable(p.Cnd_bp_dlv_slip_d_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_ap_d_no);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.rcpt_iv_mng_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_mng_no, true);
		p.CndPanel.add(p.Cnd_ap_d_no_Label);
		p.CndPanel.add(p.Cnd_ap_d_no);
		p.Cnd_ap_d_no.setNextBeans(p.Cnd_pay_schd_d_print_rmrks);
		p.Cnd_ap_d_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.ap_d_no_META);
		p.setPluralValueEnable(p.Cnd_ap_d_no, true);
		p.CndPanel.add(p.Cnd_pay_schd_d_print_rmrks_Label);
		p.CndPanel.add(p.Cnd_pay_schd_d_print_rmrks);
		p.Cnd_pay_schd_d_print_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_pay_schd_d_print_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.pay_schd_d_print_rmrks_META);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.intr_rmrks_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_accrued_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.sub_char3_META);
		p.CndPanel.add(p.Cnd_accrued_flg);
		p.Cnd_accrued_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0010.CndR.accrued_flg_META);
		p.BspplPanel.add(p.Cnd_bsppl_grp_p_PPanel);
		p.BspplPanel.setLastBeans(p.Cnd_bsppl_grp_p_PPanel);
		p.AspplPanel.add(p.Cnd_asppl_grp_p_PPanel);
		p.AspplPanel.setLastBeans(p.Cnd_asppl_grp_p_PPanel);
		p.SpplPanel.add(p.Cnd_sppl_grp_p_PPanel);
		p.SpplPanel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
		p.ItmPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_ApDtlApplBalSrch p) {
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
	protected static void jbInitRPnl(MSBHP_ApDtlApplBalSrch p) {
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
	protected static void jbInitRslt(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBHP_ApDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0030);
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
		MSBHP_ApDtlApplBalSrch_MC.mcInitScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitTop((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitFold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitTab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitChk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitUpri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitCrryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitPaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitSubcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitTab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitBsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitTab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitAsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitTab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitSppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitTab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitItm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitCnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitLPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitCtrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitRPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitRslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.mcInitBtn((MSBHP_ApDtlApplBalSrch)this);

		// [SRCH_PAY]ステータスのモードの設定
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_ScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Top((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Fold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Tab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Chk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Upri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Crryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_PaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Subcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Tab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Bsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Tab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Asppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Tab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Sppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Tab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Itm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Cnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_LPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Ctrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_RPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Rslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__PAY_Btn((MSBHP_ApDtlApplBalSrch)this);

		// [REF_PAY]ステータスのモードの設定
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_ScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Top((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Fold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Tab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Chk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Upri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Crryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_PaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Subcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Tab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Bsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Tab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Asppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Tab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Sppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Tab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Itm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Cnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_LPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Ctrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_RPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Rslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__PAY_Btn((MSBHP_ApDtlApplBalSrch)this);

		// [SRCH_AP]ステータスのモードの設定
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_ScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Top((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Fold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Tab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Chk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Upri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Crryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_PaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Subcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Tab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Bsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Tab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Asppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Tab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Sppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Tab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Itm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Cnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_LPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Ctrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_RPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Rslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitSRCH__AP_Btn((MSBHP_ApDtlApplBalSrch)this);

		// [REF_AP]ステータスのモードの設定
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_ScreenOpe((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Top((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Fold((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Tab1((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Chk((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Upri((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Crryovr((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_PaySpot((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Subcon((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Tab2((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Bsppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Tab3((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Asppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Tab4((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Sppl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Tab5((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Itm((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Cnd((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_LPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Ctrl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_RPnl((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Rslt((MSBHP_ApDtlApplBalSrch)this);
		MSBHP_ApDtlApplBalSrch_MC.statusInitREF__AP_Btn((MSBHP_ApDtlApplBalSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_ApDtlApplBalSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Chk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitChk(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Upri]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpri(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Crryovr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCrryovr(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [PaySpot]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPaySpot(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Subcon]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSubcon(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Bsppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBsppl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Asppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAsppl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Sppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSppl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Itm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItm(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_ApDtlApplBalSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PAY.addAllListener(p);
		p.Cnd_ope_AP.addAllListener(p);
		p.Cnd_unchk_flg.addAllListener(p);
		p.Cnd_chk_flg.addAllListener(p);
		p.Cnd_upri_flg.addAllListener(p);
		p.Cnd_interim_flg.addAllListener(p);
		p.Cnd_crryovr_flg.addAllListener(p);
		p.Cnd_not_crryovr_flg.addAllListener(p);
		p.Cnd_pay_spot_flg.addAllListener(p);
		p.Cnd_not_pay_spot_flg.addAllListener(p);
		p.Cnd_subcon_flg.addAllListener(p);
		p.Cnd_not_subcon_flg.addAllListener(p);
		p.Cnd_pay_schd_dt_fr.setListListener(p);
		p.Cnd_pay_schd_dt_fr.addAllListener(p);
		p.Cnd_pay_schd_dt_to.setListListener(p);
		p.Cnd_pay_schd_dt_to.addAllListener(p);
		p.Cnd_bsppl_cl_dt_fr.setListListener(p);
		p.Cnd_bsppl_cl_dt_fr.addAllListener(p);
		p.Cnd_bsppl_cl_dt_to.setListListener(p);
		p.Cnd_bsppl_cl_dt_to.addAllListener(p);
		p.Cnd_act_dt_fr.setListListener(p);
		p.Cnd_act_dt_fr.addAllListener(p);
		p.Cnd_act_dt_to.setListListener(p);
		p.Cnd_act_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_pass_days.setListListener(p);
		p.Cnd_pass_days.addAllListener(p);
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_asppl_cd.setListListener(p);
		p.Cnd_asppl_cd.addAllListener(p);
		p.Cnd_asppl_nm.setListListener(p);
		p.Cnd_asppl_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_pay_sts_typ.setListListener(p);
		p.Cnd_pay_sts_typ.addAllListener(p);
		p.Cnd_pay_sts_typ_nm.setListListener(p);
		p.Cnd_pay_sts_typ_nm.addAllListener(p);
		p.Cnd_pay_mtd_typ.setListListener(p);
		p.Cnd_pay_mtd_typ.addAllListener(p);
		p.Cnd_pay_mtd_typ_nm.setListListener(p);
		p.Cnd_pay_mtd_typ_nm.addAllListener(p);
		p.Cnd_pay_chk_no.setListListener(p);
		p.Cnd_pay_chk_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_purc_act_d_no.setListListener(p);
		p.Cnd_purc_act_d_no.addAllListener(p);
		p.Cnd_bp_dlv_slip_no.setListListener(p);
		p.Cnd_bp_dlv_slip_no.addAllListener(p);
		p.Cnd_bp_dlv_slip_d_no.setListListener(p);
		p.Cnd_bp_dlv_slip_d_no.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_ap_d_no.setListListener(p);
		p.Cnd_ap_d_no.addAllListener(p);
		p.Cnd_pay_schd_d_print_rmrks.setListListener(p);
		p.Cnd_pay_schd_d_print_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_accrued_flg.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBHP_ApDtlApplBalSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_ApDtlApplBalSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBHP_ApDtlApplBalSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_ApDtlApplBalSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_ap_typ.addAllListener(p);
		p.columnRslt_ap_typ.setListListener(p);
		p.columnRslt_ap_typ_nm.addAllListener(p);
		p.columnRslt_ap_typ_nm.setListListener(p);
		p.columnRslt_slip_sts_typ.addAllListener(p);
		p.columnRslt_slip_sts_typ.setListListener(p);
		p.columnRslt_slip_sts_typ_nm.addAllListener(p);
		p.columnRslt_slip_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.columnRslt_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_bsppl_cl_dt.addAllListener(p);
		p.columnRslt_bsppl_cl_dt.setListListener(p);
		p.columnRslt_bsppl_cl_day.addAllListener(p);
		p.columnRslt_bsppl_cl_day.setListListener(p);
		p.columnRslt_pay_basis_dt.addAllListener(p);
		p.columnRslt_pay_basis_dt.setListListener(p);
		p.columnRslt_pay_schd_dt.addAllListener(p);
		p.columnRslt_pay_schd_dt.setListListener(p);
		p.columnRslt_act_dt.addAllListener(p);
		p.columnRslt_act_dt.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_pass_days.addAllListener(p);
		p.columnRslt_pass_days.setListListener(p);
		p.columnRslt_chk_flg.addAllListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_outsrc_flg.addAllListener(p);
		p.columnRslt_repurc_obli_flg.addAllListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_upri_dec_place.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_subcon_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_pay_crryovr_times.addAllListener(p);
		p.columnRslt_pay_crryovr_times.setListListener(p);
		p.columnRslt_pay_sts_typ.addAllListener(p);
		p.columnRslt_pay_sts_typ.setListListener(p);
		p.columnRslt_pay_sts_typ_nm.addAllListener(p);
		p.columnRslt_pay_sts_typ_nm.setListListener(p);
		p.columnRslt_pay_spot_flg.addAllListener(p);
		p.columnRslt_pay_mtd_typ.addAllListener(p);
		p.columnRslt_pay_mtd_typ.setListListener(p);
		p.columnRslt_pay_mtd_typ_nm.addAllListener(p);
		p.columnRslt_pay_mtd_typ_nm.setListListener(p);
		p.columnRslt_crryovr_flg.addAllListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_base_cur_upri_dec_place.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
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
		p.columnRslt_bp_dlv_slip_no.addAllListener(p);
		p.columnRslt_bp_dlv_slip_no.setListListener(p);
		p.columnRslt_bp_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_bp_dlv_slip_d_no.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_rcpt_iv_mng_no.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_purc_usr_cd.addAllListener(p);
		p.columnRslt_purc_usr_cd.setListListener(p);
		p.columnRslt_purc_usr_nm.addAllListener(p);
		p.columnRslt_purc_usr_nm.setListListener(p);
		p.columnRslt_sppl_itm_cd.addAllListener(p);
		p.columnRslt_sppl_itm_cd.setListListener(p);
		p.columnRslt_sppl_itm_nm.addAllListener(p);
		p.columnRslt_sppl_itm_nm.setListListener(p);
		p.columnRslt_ap_d_no.addAllListener(p);
		p.columnRslt_ap_d_no.setListListener(p);
		p.columnRslt_pay_chk_no.addAllListener(p);
		p.columnRslt_pay_chk_no.setListListener(p);
		p.columnRslt_pay_chk_mng_no.addAllListener(p);
		p.columnRslt_pay_chk_mng_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_purc_act_no.addAllListener(p);
		p.columnRslt_purc_act_no.setListListener(p);
		p.columnRslt_purc_act_seq.addAllListener(p);
		p.columnRslt_purc_act_seq.setListListener(p);
		p.columnRslt_purc_act_rev.addAllListener(p);
		p.columnRslt_purc_act_rev.setListListener(p);
		p.columnRslt_purc_act_d_no.addAllListener(p);
		p.columnRslt_purc_act_d_no.setListListener(p);
		p.columnRslt_purc_act_d_seq.addAllListener(p);
		p.columnRslt_purc_act_d_seq.setListListener(p);
		p.columnRslt_base_purc_ac_dt.addAllListener(p);
		p.columnRslt_base_purc_ac_dt.setListListener(p);
		p.columnRslt_org_ap_d_no.addAllListener(p);
		p.columnRslt_org_ap_d_no.setListListener(p);
		p.columnRslt_crryovr_ap_d_no.addAllListener(p);
		p.columnRslt_crryovr_ap_d_no.setListListener(p);
		p.columnRslt_crryovr_src_ap_d_no.addAllListener(p);
		p.columnRslt_crryovr_src_ap_d_no.setListListener(p);
		p.columnRslt_sw_src_pay_schd_no.addAllListener(p);
		p.columnRslt_sw_src_pay_schd_no.setListListener(p);
		p.columnRslt_sw_src_rcv_bill_no.addAllListener(p);
		p.columnRslt_sw_src_rcv_bill_no.setListListener(p);
		p.columnRslt_sw_src_ap_sttl_cd.addAllListener(p);
		p.columnRslt_sw_src_ap_sttl_cd.setListListener(p);
		p.columnRslt_sw_src_ap_sttl_nm.addAllListener(p);
		p.columnRslt_sw_src_ap_sttl_nm.setListListener(p);
		p.columnRslt_sw_src_ap_sttl_typ.addAllListener(p);
		p.columnRslt_sw_src_ap_sttl_typ.setListListener(p);
		p.columnRslt_sw_src_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_sw_src_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_sw_src_asppl_cd.addAllListener(p);
		p.columnRslt_sw_src_asppl_cd.setListListener(p);
		p.columnRslt_sw_src_asppl_nm.addAllListener(p);
		p.columnRslt_sw_src_asppl_nm.setListListener(p);
		p.columnRslt_sw_src_ap_dpt_cd.addAllListener(p);
		p.columnRslt_sw_src_ap_dpt_cd.setListListener(p);
		p.columnRslt_sw_src_ap_dpt_nm.addAllListener(p);
		p.columnRslt_sw_src_ap_dpt_nm.setListListener(p);
		p.columnRslt_sw_src_bsppl_cd.addAllListener(p);
		p.columnRslt_sw_src_bsppl_cd.setListListener(p);
		p.columnRslt_sw_src_bsppl_nm.addAllListener(p);
		p.columnRslt_sw_src_bsppl_nm.setListListener(p);
		p.columnRslt_sw_src_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_sw_src_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_sw_src_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_sw_src_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_sw_src_wrk_no.addAllListener(p);
		p.columnRslt_sw_src_wrk_no.setListListener(p);
		p.columnRslt_sw_src_wrk_nm.addAllListener(p);
		p.columnRslt_sw_src_wrk_nm.setListListener(p);
		p.columnRslt_valid_flg.addAllListener(p);
		p.columnRslt_pay_schd_d_print_rmrks.addAllListener(p);
		p.columnRslt_pay_schd_d_print_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBHP_ApDtlApplBalSrch p) {
		p.Btn_open_MSBHP0030.addAllListener(p);
		p.Btn_open_MSBHP0030.setAPMethodName("doBtn_open_MSBHP0030");
	}

	/**
	 * [SRCH_PAY]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_ScreenOpe(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Top(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Fold(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Tab1(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Chk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Chk(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Upri(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Crryovr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Crryovr(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[PaySpot]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_PaySpot(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Subcon]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Subcon(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Tab2(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Bsppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Tab3(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Asppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Tab4(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Sppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Sppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Tab5(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Itm(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Cnd(MSBHP_ApDtlApplBalSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_chk_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_upri_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_crryovr_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_not_crryovr_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_not_pay_spot_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_subcon_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_PAY, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_fr.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_act_dt_fr.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_act_dt_to.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_pass_days.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_pay_sts_typ.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_pay_sts_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Cnd_pay_mtd_typ.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_pay_mtd_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Cnd_pay_chk_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_d_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_ap_d_no.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PAY, MCMode.ENABLE);
		p.Cnd_accrued_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PAY]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_LPnl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Ctrl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_PAY]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_RPnl(MSBHP_ApDtlApplBalSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PAY, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PAY]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Rslt(MSBHP_ApDtlApplBalSrch p){
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_act_dt.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pass_days.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_chk_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_crryovr_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_bp_dlv_slip_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_seq.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_purc_act_rev.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_seq.putMode(p, SRCH_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_org_ap_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_crryovr_ap_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_crryovr_src_ap_d_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_pay_schd_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_rcv_bill_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_cd.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_valid_flg.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PAY, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PAY, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PAY]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PAY_Btn(MSBHP_ApDtlApplBalSrch p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_PAY, MCMode.DISABLE);

	}

	/**
	 * [REF_PAY]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_ScreenOpe(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Top(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Fold(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Tab1(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Chk]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Chk(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Upri(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Crryovr]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Crryovr(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[PaySpot]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_PaySpot(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Subcon]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Subcon(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Tab2(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Bsppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Tab3(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Asppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Tab4(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Sppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Sppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Tab5(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Itm(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Cnd(MSBHP_ApDtlApplBalSrch p){
		p.Cnd_ope_Group.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_chk_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_upri_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_crryovr_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_not_crryovr_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_not_pay_spot_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_subcon_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_not_subcon_flg.putMode(p, REF_PAY, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_fr.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_act_dt_fr.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_act_dt_to.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_pass_days.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF_PAY, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_pay_sts_typ.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_pay_sts_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Cnd_pay_mtd_typ.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_pay_mtd_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Cnd_pay_chk_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_d_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_ap_d_no.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_PAY, MCMode.ENABLE);
		p.Cnd_accrued_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_PAY]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_LPnl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Ctrl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_PAY]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_RPnl(MSBHP_ApDtlApplBalSrch p){
		p.RPnl_dwnld.putMode(p, REF_PAY, MCMode.ENABLE);

	}

	/**
	 * [REF_PAY]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Rslt(MSBHP_ApDtlApplBalSrch p){
		p.columnRslt_ap_dpt_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_act_dt.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pass_days.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_chk_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_PAY, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_PAY, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_crryovr_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_bp_dlv_slip_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ap_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_seq.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_purc_act_rev.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_seq.putMode(p, REF_PAY, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_org_ap_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_crryovr_ap_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_crryovr_src_ap_d_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_pay_schd_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_rcv_bill_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_cd.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_no.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_valid_flg.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_PAY, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_PAY, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_PAY, MCMode.READ_ONLY);

	}

	/**
	 * [REF_PAY]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__PAY_Btn(MSBHP_ApDtlApplBalSrch p){
		p.Btn_open_MSBHP0030.putMode(p, REF_PAY, MCMode.ENABLE);

	}

	/**
	 * [SRCH_AP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_ScreenOpe(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Top(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Fold(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Tab1(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Chk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Chk(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Upri(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Crryovr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Crryovr(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[PaySpot]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_PaySpot(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Subcon]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Subcon(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Tab2(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Bsppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Tab3(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Asppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Tab4(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Sppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Sppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Tab5(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Itm(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Cnd(MSBHP_ApDtlApplBalSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_AP, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_chk_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_upri_flg.putMode(p, SRCH_AP, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, SRCH_AP, MCMode.REQUIRED);
		p.Cnd_crryovr_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_not_crryovr_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_pay_spot_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_not_pay_spot_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_subcon_flg.putMode(p, SRCH_AP, MCMode.REQUIRED);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_AP, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_fr.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_to.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_act_dt_fr.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_act_dt_to.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_pass_days.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_asppl_cd.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_AP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_pay_sts_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_pay_sts_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_pay_mtd_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_pay_mtd_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_pay_chk_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_d_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_ap_d_no.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_accrued_flg.putMode(p, SRCH_AP, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_AP]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_LPnl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Ctrl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [SRCH_AP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_RPnl(MSBHP_ApDtlApplBalSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_AP, MCMode.ENABLE);

	}

	/**
	 * [SRCH_AP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Rslt(MSBHP_ApDtlApplBalSrch p){
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_act_dt.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pass_days.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_chk_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_AP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_AP, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_crryovr_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_bp_dlv_slip_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_seq.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_purc_act_rev.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_seq.putMode(p, SRCH_AP, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_org_ap_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_crryovr_ap_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_crryovr_src_ap_d_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_pay_schd_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_rcv_bill_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_cd.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_valid_flg.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_AP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_AP, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_AP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AP_Btn(MSBHP_ApDtlApplBalSrch p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_AP, MCMode.DISABLE);

	}

	/**
	 * [REF_AP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_ScreenOpe(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Top(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Fold(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Tab1(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Chk]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Chk(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Upri]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Upri(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Crryovr]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Crryovr(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[PaySpot]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_PaySpot(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Subcon]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Subcon(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Tab2(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Bsppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Tab3(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Asppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Tab4(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Sppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Sppl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Tab5(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Itm(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Cnd(MSBHP_ApDtlApplBalSrch p){
		p.Cnd_ope_Group.putMode(p, REF_AP, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_chk_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_upri_flg.putMode(p, REF_AP, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, REF_AP, MCMode.REQUIRED);
		p.Cnd_crryovr_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_not_crryovr_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_pay_spot_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_not_pay_spot_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_subcon_flg.putMode(p, REF_AP, MCMode.REQUIRED);
		p.Cnd_not_subcon_flg.putMode(p, REF_AP, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_fr.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_to.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_to.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_act_dt_fr.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_act_dt_to.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_pass_days.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_asppl_cd.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF_AP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_cd.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_pay_sts_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_pay_sts_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_pay_mtd_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_pay_mtd_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_pay_chk_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_bp_dlv_slip_d_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_ap_d_no.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_accrued_flg.putMode(p, REF_AP, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_AP]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_LPnl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Ctrl(MSBHP_ApDtlApplBalSrch p){

	}

	/**
	 * [REF_AP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_RPnl(MSBHP_ApDtlApplBalSrch p){
		p.RPnl_dwnld.putMode(p, REF_AP, MCMode.ENABLE);

	}

	/**
	 * [REF_AP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Rslt(MSBHP_ApDtlApplBalSrch p){
		p.columnRslt_ap_dpt_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_act_dt.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pass_days.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_chk_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_AP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_AP, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_subcon_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_mtd_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_crryovr_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_bp_dlv_slip_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_bp_dlv_slip_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ap_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_seq.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_purc_act_rev.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_seq.putMode(p, REF_AP, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_org_ap_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_crryovr_ap_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_crryovr_src_ap_d_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_pay_schd_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_rcv_bill_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_sttl_typ_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_asppl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_ap_dpt_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_cd.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_bsppl_dpt_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_no.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sw_src_wrk_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_valid_flg.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_AP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_AP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_AP, MCMode.READ_ONLY);

	}

	/**
	 * [REF_AP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__AP_Btn(MSBHP_ApDtlApplBalSrch p){
		p.Btn_open_MSBHP0030.putMode(p, REF_AP, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_PAY;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBHP_ApDtlApplBalSrch_MC.setTableConfigRslt((MSBHP_ApDtlApplBalSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_ApDtlApplBalSrch p) {
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ap_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ);
		p.columnRslt_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ap_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ_nm);
		p.columnRslt_slip_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.slip_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ);
		p.columnRslt_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.slip_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.columnRslt_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_cd);
		p.columnRslt_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_nm);
		p.columnRslt_bsppl_cl_dt.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bsppl_cl_dt_META);
		p.columnRslt_bsppl_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_dt);
		p.columnRslt_bsppl_cl_day.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bsppl_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_day);
		p.columnRslt_pay_basis_dt.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_basis_dt_META);
		p.columnRslt_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_basis_dt);
		p.columnRslt_pay_schd_dt.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_schd_dt_META);
		p.columnRslt_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt);
		p.columnRslt_act_dt.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.act_dt_META);
		p.columnRslt_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_act_dt);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_pass_days.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pass_days_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pass_days);
		p.columnRslt_chk_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.chk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chk_flg);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_outsrc_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.outsrc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_outsrc_flg);
		p.columnRslt_repurc_obli_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.repurc_obli_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_repurc_obli_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_upri_dec_place);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_subcon_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.subcon_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_subcon_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_pay_crryovr_times.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_crryovr_times_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_crryovr_times);
		p.columnRslt_pay_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ);
		p.columnRslt_pay_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ_nm);
		p.columnRslt_pay_spot_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_spot_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_spot_flg);
		p.columnRslt_pay_mtd_typ.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_mtd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_typ);
		p.columnRslt_pay_mtd_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_mtd_typ_nm);
		p.columnRslt_crryovr_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.crryovr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_crryovr_flg);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_upri_dec_place.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_upri_dec_place);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_amt_p_PPanel.AmtTable);
		p.Rslt_base_cur_proc_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_bp_dlv_slip_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bp_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_dlv_slip_no);
		p.columnRslt_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.bp_dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_dlv_slip_d_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.columnRslt_purc_usr_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_cd);
		p.columnRslt_purc_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_nm);
		p.columnRslt_sppl_itm_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sppl_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_cd);
		p.columnRslt_sppl_itm_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sppl_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_nm);
		p.columnRslt_ap_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ap_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_d_no);
		p.columnRslt_pay_chk_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_chk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_no);
		p.columnRslt_pay_chk_mng_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_chk_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_mng_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_no);
		p.columnRslt_purc_act_seq.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_act_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_seq);
		p.columnRslt_purc_act_rev.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_rev);
		p.columnRslt_purc_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_d_no);
		p.columnRslt_purc_act_d_seq.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.purc_act_d_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_d_seq);
		p.columnRslt_base_purc_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.base_purc_ac_dt_META);
		p.columnRslt_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_purc_ac_dt);
		p.columnRslt_org_ap_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.org_ap_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_org_ap_d_no);
		p.columnRslt_crryovr_ap_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.crryovr_ap_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_crryovr_ap_d_no);
		p.columnRslt_crryovr_src_ap_d_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.crryovr_src_ap_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_crryovr_src_ap_d_no);
		p.columnRslt_sw_src_pay_schd_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_pay_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_pay_schd_no);
		p.columnRslt_sw_src_rcv_bill_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_rcv_bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_rcv_bill_no);
		p.columnRslt_sw_src_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_ap_sttl_cd);
		p.columnRslt_sw_src_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_ap_sttl_nm);
		p.columnRslt_sw_src_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_ap_sttl_typ);
		p.columnRslt_sw_src_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_ap_sttl_typ_nm);
		p.columnRslt_sw_src_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_asppl_cd);
		p.columnRslt_sw_src_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_asppl_nm);
		p.columnRslt_sw_src_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_ap_dpt_cd);
		p.columnRslt_sw_src_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_ap_dpt_nm);
		p.columnRslt_sw_src_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_bsppl_cd);
		p.columnRslt_sw_src_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_bsppl_nm);
		p.columnRslt_sw_src_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_bsppl_dpt_cd);
		p.columnRslt_sw_src_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_bsppl_dpt_nm);
		p.columnRslt_sw_src_wrk_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_wrk_no);
		p.columnRslt_sw_src_wrk_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sw_src_wrk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_src_wrk_nm);
		p.columnRslt_valid_flg.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.valid_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_valid_flg);
		p.columnRslt_pay_schd_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.pay_schd_d_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_d_print_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_bsppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_asppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_sppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0010.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_asppl_cd.getListConfig().setPutter(getCnd_asppl_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_pay_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pay_sts_typ.getListConfig().setPutter(getCnd_pay_sts_typ_ListPutter());
		Cnd_pay_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pay_mtd_typ.getListConfig().setPutter(getCnd_pay_mtd_typ_ListPutter());
	}

	/**
	 * この画面を[SRCH_PAY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PAYStatus() {
		status = SRCH_PAY;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_PAY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_PAYStatus() {
		status = REF_PAY;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_AP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_APStatus() {
		status = SRCH_AP;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_AP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_APStatus() {
		status = REF_AP;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_PAY.equals(status)) {
			setSRCH_PAYStatus();
		}
		else if (REF_PAY.equals(status)) {
			setREF_PAYStatus();
		}
		else if (SRCH_AP.equals(status)) {
			setSRCH_APStatus();
		}
		else if (REF_AP.equals(status)) {
			setREF_APStatus();
		}
	}

	/**
	 * [Cnd_bsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApWg");
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
	 * [Cnd_pay_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PayStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PayMtdTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_asppl_cd) return getCnd_asppl_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_pay_sts_typ) return getCnd_pay_sts_typ(row, info);
		if(combo == Cnd_pay_mtd_typ) return getCnd_pay_mtd_typ(row, info);
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
		else if (ap == Btn_open_MSBHP0030) doBtn_open_MSBHP0030(info);
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
	 * [Btn]パネルの[open_MSBHP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0030(MCEventInfo info);

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
		if (vc == Cnd_unchk_flg) return doCnd_unchk_flg_VC(info);
		if (vc == Cnd_chk_flg) return doCnd_chk_flg_VC(info);
		if (vc == Cnd_upri_flg) return doCnd_upri_flg_VC(info);
		if (vc == Cnd_interim_flg) return doCnd_interim_flg_VC(info);
		if (vc == Cnd_crryovr_flg) return doCnd_crryovr_flg_VC(info);
		if (vc == Cnd_not_crryovr_flg) return doCnd_not_crryovr_flg_VC(info);
		if (vc == Cnd_pay_spot_flg) return doCnd_pay_spot_flg_VC(info);
		if (vc == Cnd_not_pay_spot_flg) return doCnd_not_pay_spot_flg_VC(info);
		if (vc == Cnd_subcon_flg) return doCnd_subcon_flg_VC(info);
		if (vc == Cnd_not_subcon_flg) return doCnd_not_subcon_flg_VC(info);
		if (vc == Cnd_pay_schd_dt_fr) return doCnd_pay_schd_dt_fr_VC(info);
		if (vc == Cnd_pay_schd_dt_to) return doCnd_pay_schd_dt_to_VC(info);
		if (vc == Cnd_bsppl_cl_dt_fr) return doCnd_bsppl_cl_dt_fr_VC(info);
		if (vc == Cnd_bsppl_cl_dt_to) return doCnd_bsppl_cl_dt_to_VC(info);
		if (vc == Cnd_act_dt_fr) return doCnd_act_dt_fr_VC(info);
		if (vc == Cnd_act_dt_to) return doCnd_act_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_pass_days) return doCnd_pass_days_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_asppl_cd) return doCnd_asppl_cd_VC(info);
		if (vc == Cnd_asppl_nm) return doCnd_asppl_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_pay_sts_typ) return doCnd_pay_sts_typ_VC(info);
		if (vc == Cnd_pay_sts_typ_nm) return doCnd_pay_sts_typ_nm_VC(info);
		if (vc == Cnd_pay_mtd_typ) return doCnd_pay_mtd_typ_VC(info);
		if (vc == Cnd_pay_mtd_typ_nm) return doCnd_pay_mtd_typ_nm_VC(info);
		if (vc == Cnd_pay_chk_no) return doCnd_pay_chk_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_purc_act_d_no) return doCnd_purc_act_d_no_VC(info);
		if (vc == Cnd_bp_dlv_slip_no) return doCnd_bp_dlv_slip_no_VC(info);
		if (vc == Cnd_bp_dlv_slip_d_no) return doCnd_bp_dlv_slip_d_no_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Cnd_ap_d_no) return doCnd_ap_d_no_VC(info);
		if (vc == Cnd_pay_schd_d_print_rmrks) return doCnd_pay_schd_d_print_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_accrued_flg) return doCnd_accrued_flg_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_ap_typ) return doRslt_ap_typ_VC(info);
		if (vc == columnRslt_ap_typ_nm) return doRslt_ap_typ_nm_VC(info);
		if (vc == columnRslt_slip_sts_typ) return doRslt_slip_sts_typ_VC(info);
		if (vc == columnRslt_slip_sts_typ_nm) return doRslt_slip_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_bsppl_dpt_cd) return doRslt_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_bsppl_dpt_nm) return doRslt_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_bsppl_cl_dt) return doRslt_bsppl_cl_dt_VC(info);
		if (vc == columnRslt_bsppl_cl_day) return doRslt_bsppl_cl_day_VC(info);
		if (vc == columnRslt_pay_basis_dt) return doRslt_pay_basis_dt_VC(info);
		if (vc == columnRslt_pay_schd_dt) return doRslt_pay_schd_dt_VC(info);
		if (vc == columnRslt_act_dt) return doRslt_act_dt_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_pass_days) return doRslt_pass_days_VC(info);
		if (vc == columnRslt_chk_flg) return doRslt_chk_flg_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_outsrc_flg) return doRslt_outsrc_flg_VC(info);
		if (vc == columnRslt_repurc_obli_flg) return doRslt_repurc_obli_flg_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_upri_dec_place) return doRslt_trd_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_subcon_flg) return doRslt_subcon_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_pay_crryovr_times) return doRslt_pay_crryovr_times_VC(info);
		if (vc == columnRslt_pay_sts_typ) return doRslt_pay_sts_typ_VC(info);
		if (vc == columnRslt_pay_sts_typ_nm) return doRslt_pay_sts_typ_nm_VC(info);
		if (vc == columnRslt_pay_spot_flg) return doRslt_pay_spot_flg_VC(info);
		if (vc == columnRslt_pay_mtd_typ) return doRslt_pay_mtd_typ_VC(info);
		if (vc == columnRslt_pay_mtd_typ_nm) return doRslt_pay_mtd_typ_nm_VC(info);
		if (vc == columnRslt_crryovr_flg) return doRslt_crryovr_flg_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_upri_dec_place) return doRslt_base_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_bp_dlv_slip_no) return doRslt_bp_dlv_slip_no_VC(info);
		if (vc == columnRslt_bp_dlv_slip_d_no) return doRslt_bp_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_purc_usr_cd) return doRslt_purc_usr_cd_VC(info);
		if (vc == columnRslt_purc_usr_nm) return doRslt_purc_usr_nm_VC(info);
		if (vc == columnRslt_sppl_itm_cd) return doRslt_sppl_itm_cd_VC(info);
		if (vc == columnRslt_sppl_itm_nm) return doRslt_sppl_itm_nm_VC(info);
		if (vc == columnRslt_ap_d_no) return doRslt_ap_d_no_VC(info);
		if (vc == columnRslt_pay_chk_no) return doRslt_pay_chk_no_VC(info);
		if (vc == columnRslt_pay_chk_mng_no) return doRslt_pay_chk_mng_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_purc_act_no) return doRslt_purc_act_no_VC(info);
		if (vc == columnRslt_purc_act_seq) return doRslt_purc_act_seq_VC(info);
		if (vc == columnRslt_purc_act_rev) return doRslt_purc_act_rev_VC(info);
		if (vc == columnRslt_purc_act_d_no) return doRslt_purc_act_d_no_VC(info);
		if (vc == columnRslt_purc_act_d_seq) return doRslt_purc_act_d_seq_VC(info);
		if (vc == columnRslt_base_purc_ac_dt) return doRslt_base_purc_ac_dt_VC(info);
		if (vc == columnRslt_org_ap_d_no) return doRslt_org_ap_d_no_VC(info);
		if (vc == columnRslt_crryovr_ap_d_no) return doRslt_crryovr_ap_d_no_VC(info);
		if (vc == columnRslt_crryovr_src_ap_d_no) return doRslt_crryovr_src_ap_d_no_VC(info);
		if (vc == columnRslt_sw_src_pay_schd_no) return doRslt_sw_src_pay_schd_no_VC(info);
		if (vc == columnRslt_sw_src_rcv_bill_no) return doRslt_sw_src_rcv_bill_no_VC(info);
		if (vc == columnRslt_sw_src_ap_sttl_cd) return doRslt_sw_src_ap_sttl_cd_VC(info);
		if (vc == columnRslt_sw_src_ap_sttl_nm) return doRslt_sw_src_ap_sttl_nm_VC(info);
		if (vc == columnRslt_sw_src_ap_sttl_typ) return doRslt_sw_src_ap_sttl_typ_VC(info);
		if (vc == columnRslt_sw_src_ap_sttl_typ_nm) return doRslt_sw_src_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_sw_src_asppl_cd) return doRslt_sw_src_asppl_cd_VC(info);
		if (vc == columnRslt_sw_src_asppl_nm) return doRslt_sw_src_asppl_nm_VC(info);
		if (vc == columnRslt_sw_src_ap_dpt_cd) return doRslt_sw_src_ap_dpt_cd_VC(info);
		if (vc == columnRslt_sw_src_ap_dpt_nm) return doRslt_sw_src_ap_dpt_nm_VC(info);
		if (vc == columnRslt_sw_src_bsppl_cd) return doRslt_sw_src_bsppl_cd_VC(info);
		if (vc == columnRslt_sw_src_bsppl_nm) return doRslt_sw_src_bsppl_nm_VC(info);
		if (vc == columnRslt_sw_src_bsppl_dpt_cd) return doRslt_sw_src_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_sw_src_bsppl_dpt_nm) return doRslt_sw_src_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_sw_src_wrk_no) return doRslt_sw_src_wrk_no_VC(info);
		if (vc == columnRslt_sw_src_wrk_nm) return doRslt_sw_src_wrk_nm_VC(info);
		if (vc == columnRslt_valid_flg) return doRslt_valid_flg_VC(info);
		if (vc == columnRslt_pay_schd_d_print_rmrks) return doRslt_pay_schd_d_print_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
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
	 * [Cnd]パネルの[unchk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unchk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upri_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[crryovr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_crryovr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_crryovr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_crryovr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_pay_spot_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cl_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cl_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pass_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pass_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_chk_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_dlv_slip_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_d_print_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[accrued_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accrued_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pass_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pass_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chk_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_interim_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_repurc_obli_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_upri_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[crryovr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_crryovr_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_upri_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_chk_mng_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_purc_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[org_ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_org_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[crryovr_ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_crryovr_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[crryovr_src_ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_crryovr_src_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_pay_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_rcv_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_rcv_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_src_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[valid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_valid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_d_print_rmrks_VC(MCEventInfo info){
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
		else if (nc == Cnd_unchk_flg) doCnd_unchk_flg_NC(info);
		else if (nc == Cnd_chk_flg) doCnd_chk_flg_NC(info);
		else if (nc == Cnd_upri_flg) doCnd_upri_flg_NC(info);
		else if (nc == Cnd_interim_flg) doCnd_interim_flg_NC(info);
		else if (nc == Cnd_crryovr_flg) doCnd_crryovr_flg_NC(info);
		else if (nc == Cnd_not_crryovr_flg) doCnd_not_crryovr_flg_NC(info);
		else if (nc == Cnd_pay_spot_flg) doCnd_pay_spot_flg_NC(info);
		else if (nc == Cnd_not_pay_spot_flg) doCnd_not_pay_spot_flg_NC(info);
		else if (nc == Cnd_subcon_flg) doCnd_subcon_flg_NC(info);
		else if (nc == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NC(info);
		else if (nc == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_NC(info);
		else if (nc == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NC(info);
		else if (nc == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NC(info);
		else if (nc == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NC(info);
		else if (nc == Cnd_act_dt_fr) doCnd_act_dt_fr_NC(info);
		else if (nc == Cnd_act_dt_to) doCnd_act_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_pass_days) doCnd_pass_days_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_asppl_cd) doCnd_asppl_cd_NC(info);
		else if (nc == Cnd_asppl_nm) doCnd_asppl_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_pay_sts_typ) doCnd_pay_sts_typ_NC(info);
		else if (nc == Cnd_pay_sts_typ_nm) doCnd_pay_sts_typ_nm_NC(info);
		else if (nc == Cnd_pay_mtd_typ) doCnd_pay_mtd_typ_NC(info);
		else if (nc == Cnd_pay_mtd_typ_nm) doCnd_pay_mtd_typ_nm_NC(info);
		else if (nc == Cnd_pay_chk_no) doCnd_pay_chk_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_purc_act_d_no) doCnd_purc_act_d_no_NC(info);
		else if (nc == Cnd_bp_dlv_slip_no) doCnd_bp_dlv_slip_no_NC(info);
		else if (nc == Cnd_bp_dlv_slip_d_no) doCnd_bp_dlv_slip_d_no_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Cnd_ap_d_no) doCnd_ap_d_no_NC(info);
		else if (nc == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_accrued_flg) doCnd_accrued_flg_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_ap_typ) doRslt_ap_typ_NC(info);
		else if (nc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NC(info);
		else if (nc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NC(info);
		else if (nc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NC(info);
		else if (nc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NC(info);
		else if (nc == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_NC(info);
		else if (nc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NC(info);
		else if (nc == columnRslt_act_dt) doRslt_act_dt_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_pass_days) doRslt_pass_days_NC(info);
		else if (nc == columnRslt_chk_flg) doRslt_chk_flg_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_outsrc_flg) doRslt_outsrc_flg_NC(info);
		else if (nc == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_subcon_flg) doRslt_subcon_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_NC(info);
		else if (nc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NC(info);
		else if (nc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NC(info);
		else if (nc == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NC(info);
		else if (nc == columnRslt_pay_mtd_typ) doRslt_pay_mtd_typ_NC(info);
		else if (nc == columnRslt_pay_mtd_typ_nm) doRslt_pay_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_crryovr_flg) doRslt_crryovr_flg_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_NC(info);
		else if (nc == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NC(info);
		else if (nc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NC(info);
		else if (nc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NC(info);
		else if (nc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NC(info);
		else if (nc == columnRslt_ap_d_no) doRslt_ap_d_no_NC(info);
		else if (nc == columnRslt_pay_chk_no) doRslt_pay_chk_no_NC(info);
		else if (nc == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_purc_act_no) doRslt_purc_act_no_NC(info);
		else if (nc == columnRslt_purc_act_seq) doRslt_purc_act_seq_NC(info);
		else if (nc == columnRslt_purc_act_rev) doRslt_purc_act_rev_NC(info);
		else if (nc == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NC(info);
		else if (nc == columnRslt_purc_act_d_seq) doRslt_purc_act_d_seq_NC(info);
		else if (nc == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NC(info);
		else if (nc == columnRslt_org_ap_d_no) doRslt_org_ap_d_no_NC(info);
		else if (nc == columnRslt_crryovr_ap_d_no) doRslt_crryovr_ap_d_no_NC(info);
		else if (nc == columnRslt_crryovr_src_ap_d_no) doRslt_crryovr_src_ap_d_no_NC(info);
		else if (nc == columnRslt_sw_src_pay_schd_no) doRslt_sw_src_pay_schd_no_NC(info);
		else if (nc == columnRslt_sw_src_rcv_bill_no) doRslt_sw_src_rcv_bill_no_NC(info);
		else if (nc == columnRslt_sw_src_ap_sttl_cd) doRslt_sw_src_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_sw_src_ap_sttl_nm) doRslt_sw_src_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_sw_src_ap_sttl_typ) doRslt_sw_src_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_sw_src_ap_sttl_typ_nm) doRslt_sw_src_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_sw_src_asppl_cd) doRslt_sw_src_asppl_cd_NC(info);
		else if (nc == columnRslt_sw_src_asppl_nm) doRslt_sw_src_asppl_nm_NC(info);
		else if (nc == columnRslt_sw_src_ap_dpt_cd) doRslt_sw_src_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_sw_src_ap_dpt_nm) doRslt_sw_src_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_sw_src_bsppl_cd) doRslt_sw_src_bsppl_cd_NC(info);
		else if (nc == columnRslt_sw_src_bsppl_nm) doRslt_sw_src_bsppl_nm_NC(info);
		else if (nc == columnRslt_sw_src_bsppl_dpt_cd) doRslt_sw_src_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_sw_src_bsppl_dpt_nm) doRslt_sw_src_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_sw_src_wrk_no) doRslt_sw_src_wrk_no_NC(info);
		else if (nc == columnRslt_sw_src_wrk_nm) doRslt_sw_src_wrk_nm_NC(info);
		else if (nc == columnRslt_valid_flg) doRslt_valid_flg_NC(info);
		else if (nc == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
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
	 * [Cnd]パネルの[unchk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unchk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[crryovr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_crryovr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_crryovr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_crryovr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_pay_spot_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pass_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pass_days_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[accrued_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accrued_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pass_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pass_days_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chk_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_src_ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_src_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_pay_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_rcv_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_rcv_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_unchk_flg) doCnd_unchk_flg_NE(info);
		else if (ne == Cnd_chk_flg) doCnd_chk_flg_NE(info);
		else if (ne == Cnd_upri_flg) doCnd_upri_flg_NE(info);
		else if (ne == Cnd_interim_flg) doCnd_interim_flg_NE(info);
		else if (ne == Cnd_crryovr_flg) doCnd_crryovr_flg_NE(info);
		else if (ne == Cnd_not_crryovr_flg) doCnd_not_crryovr_flg_NE(info);
		else if (ne == Cnd_pay_spot_flg) doCnd_pay_spot_flg_NE(info);
		else if (ne == Cnd_not_pay_spot_flg) doCnd_not_pay_spot_flg_NE(info);
		else if (ne == Cnd_subcon_flg) doCnd_subcon_flg_NE(info);
		else if (ne == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NE(info);
		else if (ne == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_NE(info);
		else if (ne == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NE(info);
		else if (ne == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NE(info);
		else if (ne == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NE(info);
		else if (ne == Cnd_act_dt_fr) doCnd_act_dt_fr_NE(info);
		else if (ne == Cnd_act_dt_to) doCnd_act_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_pass_days) doCnd_pass_days_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_asppl_cd) doCnd_asppl_cd_NE(info);
		else if (ne == Cnd_asppl_nm) doCnd_asppl_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_pay_sts_typ) doCnd_pay_sts_typ_NE(info);
		else if (ne == Cnd_pay_sts_typ_nm) doCnd_pay_sts_typ_nm_NE(info);
		else if (ne == Cnd_pay_mtd_typ) doCnd_pay_mtd_typ_NE(info);
		else if (ne == Cnd_pay_mtd_typ_nm) doCnd_pay_mtd_typ_nm_NE(info);
		else if (ne == Cnd_pay_chk_no) doCnd_pay_chk_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_purc_act_d_no) doCnd_purc_act_d_no_NE(info);
		else if (ne == Cnd_bp_dlv_slip_no) doCnd_bp_dlv_slip_no_NE(info);
		else if (ne == Cnd_bp_dlv_slip_d_no) doCnd_bp_dlv_slip_d_no_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Cnd_ap_d_no) doCnd_ap_d_no_NE(info);
		else if (ne == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_accrued_flg) doCnd_accrued_flg_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_ap_typ) doRslt_ap_typ_NE(info);
		else if (ne == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NE(info);
		else if (ne == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NE(info);
		else if (ne == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NE(info);
		else if (ne == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NE(info);
		else if (ne == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_NE(info);
		else if (ne == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NE(info);
		else if (ne == columnRslt_act_dt) doRslt_act_dt_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_pass_days) doRslt_pass_days_NE(info);
		else if (ne == columnRslt_chk_flg) doRslt_chk_flg_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_outsrc_flg) doRslt_outsrc_flg_NE(info);
		else if (ne == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_subcon_flg) doRslt_subcon_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_NE(info);
		else if (ne == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NE(info);
		else if (ne == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NE(info);
		else if (ne == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NE(info);
		else if (ne == columnRslt_pay_mtd_typ) doRslt_pay_mtd_typ_NE(info);
		else if (ne == columnRslt_pay_mtd_typ_nm) doRslt_pay_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_crryovr_flg) doRslt_crryovr_flg_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_NE(info);
		else if (ne == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NE(info);
		else if (ne == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NE(info);
		else if (ne == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NE(info);
		else if (ne == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NE(info);
		else if (ne == columnRslt_ap_d_no) doRslt_ap_d_no_NE(info);
		else if (ne == columnRslt_pay_chk_no) doRslt_pay_chk_no_NE(info);
		else if (ne == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_purc_act_no) doRslt_purc_act_no_NE(info);
		else if (ne == columnRslt_purc_act_seq) doRslt_purc_act_seq_NE(info);
		else if (ne == columnRslt_purc_act_rev) doRslt_purc_act_rev_NE(info);
		else if (ne == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NE(info);
		else if (ne == columnRslt_purc_act_d_seq) doRslt_purc_act_d_seq_NE(info);
		else if (ne == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NE(info);
		else if (ne == columnRslt_org_ap_d_no) doRslt_org_ap_d_no_NE(info);
		else if (ne == columnRslt_crryovr_ap_d_no) doRslt_crryovr_ap_d_no_NE(info);
		else if (ne == columnRslt_crryovr_src_ap_d_no) doRslt_crryovr_src_ap_d_no_NE(info);
		else if (ne == columnRslt_sw_src_pay_schd_no) doRslt_sw_src_pay_schd_no_NE(info);
		else if (ne == columnRslt_sw_src_rcv_bill_no) doRslt_sw_src_rcv_bill_no_NE(info);
		else if (ne == columnRslt_sw_src_ap_sttl_cd) doRslt_sw_src_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_sw_src_ap_sttl_nm) doRslt_sw_src_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_sw_src_ap_sttl_typ) doRslt_sw_src_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_sw_src_ap_sttl_typ_nm) doRslt_sw_src_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_sw_src_asppl_cd) doRslt_sw_src_asppl_cd_NE(info);
		else if (ne == columnRslt_sw_src_asppl_nm) doRslt_sw_src_asppl_nm_NE(info);
		else if (ne == columnRslt_sw_src_ap_dpt_cd) doRslt_sw_src_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_sw_src_ap_dpt_nm) doRslt_sw_src_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_sw_src_bsppl_cd) doRslt_sw_src_bsppl_cd_NE(info);
		else if (ne == columnRslt_sw_src_bsppl_nm) doRslt_sw_src_bsppl_nm_NE(info);
		else if (ne == columnRslt_sw_src_bsppl_dpt_cd) doRslt_sw_src_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_sw_src_bsppl_dpt_nm) doRslt_sw_src_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_sw_src_wrk_no) doRslt_sw_src_wrk_no_NE(info);
		else if (ne == columnRslt_sw_src_wrk_nm) doRslt_sw_src_wrk_nm_NE(info);
		else if (ne == columnRslt_valid_flg) doRslt_valid_flg_NE(info);
		else if (ne == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
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
	 * [Cnd]パネルの[unchk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unchk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[crryovr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_crryovr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_crryovr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_crryovr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_pay_spot_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pass_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pass_days_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[accrued_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accrued_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pass_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pass_days_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chk_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_src_ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_src_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_pay_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_rcv_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_rcv_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_unchk_flg) doCnd_unchk_flg_NX(info);
		else if (nx == Cnd_chk_flg) doCnd_chk_flg_NX(info);
		else if (nx == Cnd_upri_flg) doCnd_upri_flg_NX(info);
		else if (nx == Cnd_interim_flg) doCnd_interim_flg_NX(info);
		else if (nx == Cnd_crryovr_flg) doCnd_crryovr_flg_NX(info);
		else if (nx == Cnd_not_crryovr_flg) doCnd_not_crryovr_flg_NX(info);
		else if (nx == Cnd_pay_spot_flg) doCnd_pay_spot_flg_NX(info);
		else if (nx == Cnd_not_pay_spot_flg) doCnd_not_pay_spot_flg_NX(info);
		else if (nx == Cnd_subcon_flg) doCnd_subcon_flg_NX(info);
		else if (nx == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NX(info);
		else if (nx == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_NX(info);
		else if (nx == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NX(info);
		else if (nx == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NX(info);
		else if (nx == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NX(info);
		else if (nx == Cnd_act_dt_fr) doCnd_act_dt_fr_NX(info);
		else if (nx == Cnd_act_dt_to) doCnd_act_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_pass_days) doCnd_pass_days_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_asppl_cd) doCnd_asppl_cd_NX(info);
		else if (nx == Cnd_asppl_nm) doCnd_asppl_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_pay_sts_typ) doCnd_pay_sts_typ_NX(info);
		else if (nx == Cnd_pay_sts_typ_nm) doCnd_pay_sts_typ_nm_NX(info);
		else if (nx == Cnd_pay_mtd_typ) doCnd_pay_mtd_typ_NX(info);
		else if (nx == Cnd_pay_mtd_typ_nm) doCnd_pay_mtd_typ_nm_NX(info);
		else if (nx == Cnd_pay_chk_no) doCnd_pay_chk_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_purc_act_d_no) doCnd_purc_act_d_no_NX(info);
		else if (nx == Cnd_bp_dlv_slip_no) doCnd_bp_dlv_slip_no_NX(info);
		else if (nx == Cnd_bp_dlv_slip_d_no) doCnd_bp_dlv_slip_d_no_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Cnd_ap_d_no) doCnd_ap_d_no_NX(info);
		else if (nx == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_accrued_flg) doCnd_accrued_flg_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_ap_typ) doRslt_ap_typ_NX(info);
		else if (nx == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NX(info);
		else if (nx == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NX(info);
		else if (nx == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NX(info);
		else if (nx == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NX(info);
		else if (nx == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_NX(info);
		else if (nx == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NX(info);
		else if (nx == columnRslt_act_dt) doRslt_act_dt_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_pass_days) doRslt_pass_days_NX(info);
		else if (nx == columnRslt_chk_flg) doRslt_chk_flg_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_outsrc_flg) doRslt_outsrc_flg_NX(info);
		else if (nx == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_subcon_flg) doRslt_subcon_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_NX(info);
		else if (nx == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NX(info);
		else if (nx == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NX(info);
		else if (nx == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NX(info);
		else if (nx == columnRslt_pay_mtd_typ) doRslt_pay_mtd_typ_NX(info);
		else if (nx == columnRslt_pay_mtd_typ_nm) doRslt_pay_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_crryovr_flg) doRslt_crryovr_flg_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_NX(info);
		else if (nx == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NX(info);
		else if (nx == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NX(info);
		else if (nx == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NX(info);
		else if (nx == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NX(info);
		else if (nx == columnRslt_ap_d_no) doRslt_ap_d_no_NX(info);
		else if (nx == columnRslt_pay_chk_no) doRslt_pay_chk_no_NX(info);
		else if (nx == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_purc_act_no) doRslt_purc_act_no_NX(info);
		else if (nx == columnRslt_purc_act_seq) doRslt_purc_act_seq_NX(info);
		else if (nx == columnRslt_purc_act_rev) doRslt_purc_act_rev_NX(info);
		else if (nx == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NX(info);
		else if (nx == columnRslt_purc_act_d_seq) doRslt_purc_act_d_seq_NX(info);
		else if (nx == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NX(info);
		else if (nx == columnRslt_org_ap_d_no) doRslt_org_ap_d_no_NX(info);
		else if (nx == columnRslt_crryovr_ap_d_no) doRslt_crryovr_ap_d_no_NX(info);
		else if (nx == columnRslt_crryovr_src_ap_d_no) doRslt_crryovr_src_ap_d_no_NX(info);
		else if (nx == columnRslt_sw_src_pay_schd_no) doRslt_sw_src_pay_schd_no_NX(info);
		else if (nx == columnRslt_sw_src_rcv_bill_no) doRslt_sw_src_rcv_bill_no_NX(info);
		else if (nx == columnRslt_sw_src_ap_sttl_cd) doRslt_sw_src_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_sw_src_ap_sttl_nm) doRslt_sw_src_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_sw_src_ap_sttl_typ) doRslt_sw_src_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_sw_src_ap_sttl_typ_nm) doRslt_sw_src_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_sw_src_asppl_cd) doRslt_sw_src_asppl_cd_NX(info);
		else if (nx == columnRslt_sw_src_asppl_nm) doRslt_sw_src_asppl_nm_NX(info);
		else if (nx == columnRslt_sw_src_ap_dpt_cd) doRslt_sw_src_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_sw_src_ap_dpt_nm) doRslt_sw_src_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_sw_src_bsppl_cd) doRslt_sw_src_bsppl_cd_NX(info);
		else if (nx == columnRslt_sw_src_bsppl_nm) doRslt_sw_src_bsppl_nm_NX(info);
		else if (nx == columnRslt_sw_src_bsppl_dpt_cd) doRslt_sw_src_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_sw_src_bsppl_dpt_nm) doRslt_sw_src_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_sw_src_wrk_no) doRslt_sw_src_wrk_no_NX(info);
		else if (nx == columnRslt_sw_src_wrk_nm) doRslt_sw_src_wrk_nm_NX(info);
		else if (nx == columnRslt_valid_flg) doRslt_valid_flg_NX(info);
		else if (nx == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
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
	 * [Cnd]パネルの[unchk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unchk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[crryovr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_crryovr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_crryovr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_crryovr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_pay_spot_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pass_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pass_days_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[accrued_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accrued_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pass_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pass_days_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chk_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_src_ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_src_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_pay_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_rcv_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_rcv_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_LC(info);
		else if (lc == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_LC(info);
		else if (lc == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_LC(info);
		else if (lc == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_LC(info);
		else if (lc == Cnd_act_dt_fr) doCnd_act_dt_fr_LC(info);
		else if (lc == Cnd_act_dt_to) doCnd_act_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_pass_days) doCnd_pass_days_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_asppl_cd) doCnd_asppl_cd_LC(info);
		else if (lc == Cnd_asppl_nm) doCnd_asppl_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_pay_sts_typ) doCnd_pay_sts_typ_LC(info);
		else if (lc == Cnd_pay_sts_typ_nm) doCnd_pay_sts_typ_nm_LC(info);
		else if (lc == Cnd_pay_mtd_typ) doCnd_pay_mtd_typ_LC(info);
		else if (lc == Cnd_pay_mtd_typ_nm) doCnd_pay_mtd_typ_nm_LC(info);
		else if (lc == Cnd_pay_chk_no) doCnd_pay_chk_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Cnd_purc_act_d_no) doCnd_purc_act_d_no_LC(info);
		else if (lc == Cnd_bp_dlv_slip_no) doCnd_bp_dlv_slip_no_LC(info);
		else if (lc == Cnd_bp_dlv_slip_d_no) doCnd_bp_dlv_slip_d_no_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Cnd_ap_d_no) doCnd_ap_d_no_LC(info);
		else if (lc == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_ap_typ) doRslt_ap_typ_LC(info);
		else if (lc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_LC(info);
		else if (lc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_LC(info);
		else if (lc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_LC(info);
		else if (lc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_LC(info);
		else if (lc == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_LC(info);
		else if (lc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_LC(info);
		else if (lc == columnRslt_act_dt) doRslt_act_dt_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_pass_days) doRslt_pass_days_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_LC(info);
		else if (lc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_LC(info);
		else if (lc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_LC(info);
		else if (lc == columnRslt_pay_mtd_typ) doRslt_pay_mtd_typ_LC(info);
		else if (lc == columnRslt_pay_mtd_typ_nm) doRslt_pay_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_bp_dlv_slip_no) doRslt_bp_dlv_slip_no_LC(info);
		else if (lc == columnRslt_bp_dlv_slip_d_no) doRslt_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_LC(info);
		else if (lc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_LC(info);
		else if (lc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_LC(info);
		else if (lc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_LC(info);
		else if (lc == columnRslt_ap_d_no) doRslt_ap_d_no_LC(info);
		else if (lc == columnRslt_pay_chk_no) doRslt_pay_chk_no_LC(info);
		else if (lc == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_purc_act_no) doRslt_purc_act_no_LC(info);
		else if (lc == columnRslt_purc_act_seq) doRslt_purc_act_seq_LC(info);
		else if (lc == columnRslt_purc_act_rev) doRslt_purc_act_rev_LC(info);
		else if (lc == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_LC(info);
		else if (lc == columnRslt_purc_act_d_seq) doRslt_purc_act_d_seq_LC(info);
		else if (lc == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_LC(info);
		else if (lc == columnRslt_org_ap_d_no) doRslt_org_ap_d_no_LC(info);
		else if (lc == columnRslt_crryovr_ap_d_no) doRslt_crryovr_ap_d_no_LC(info);
		else if (lc == columnRslt_crryovr_src_ap_d_no) doRslt_crryovr_src_ap_d_no_LC(info);
		else if (lc == columnRslt_sw_src_pay_schd_no) doRslt_sw_src_pay_schd_no_LC(info);
		else if (lc == columnRslt_sw_src_rcv_bill_no) doRslt_sw_src_rcv_bill_no_LC(info);
		else if (lc == columnRslt_sw_src_ap_sttl_cd) doRslt_sw_src_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_sw_src_ap_sttl_nm) doRslt_sw_src_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_sw_src_ap_sttl_typ) doRslt_sw_src_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_sw_src_ap_sttl_typ_nm) doRslt_sw_src_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_sw_src_asppl_cd) doRslt_sw_src_asppl_cd_LC(info);
		else if (lc == columnRslt_sw_src_asppl_nm) doRslt_sw_src_asppl_nm_LC(info);
		else if (lc == columnRslt_sw_src_ap_dpt_cd) doRslt_sw_src_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_sw_src_ap_dpt_nm) doRslt_sw_src_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_sw_src_bsppl_cd) doRslt_sw_src_bsppl_cd_LC(info);
		else if (lc == columnRslt_sw_src_bsppl_nm) doRslt_sw_src_bsppl_nm_LC(info);
		else if (lc == columnRslt_sw_src_bsppl_dpt_cd) doRslt_sw_src_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_sw_src_bsppl_dpt_nm) doRslt_sw_src_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_sw_src_wrk_no) doRslt_sw_src_wrk_no_LC(info);
		else if (lc == columnRslt_sw_src_wrk_nm) doRslt_sw_src_wrk_nm_LC(info);
		else if (lc == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pass_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pass_days_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pass_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pass_days_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crryovr_src_ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crryovr_src_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_pay_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_rcv_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_rcv_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_src_wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_src_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asppl_cd]の作成メソッド
	 */
	public MCList getCnd_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_pay_sts_typ]の作成メソッド
	 */
	public MCList getCnd_pay_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPayStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_mtd_typ]の作成メソッド
	 */
	public MCList getCnd_pay_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPayMtdTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0010.Srch01")) {
			return new MS_MSBHL0010_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0010_Srch01Bridge() {
			p_MS_MSBHL0010_Srch01 = new MCParam(PDef.MS_MSBHL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0010.RsltR.class));

			p_MS_MSBHL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0010.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0010_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0010.RsltR>)p_MS_MSBHL0010_Srch01.getContainerParam().getDownBlock(0));
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