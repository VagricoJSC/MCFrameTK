package mcframe.clientMSBD.MSBDP0230;

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
import mcframe.clientMSBD.MSBDP0230.MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Srch01Caller;
import mcframe.clientMSBD.MSBDP0230.MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Srch02Caller;
import mcframe.clientMSBD.MSBDP0230.MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Imp01Caller;
import mcframe.clientMSBD.MSBDP0230.MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Upd01Caller;
import mcframe.clientMSBD.MSBDP0230.MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Del01Caller;
import mcframe.clientMSBD.MSBDP0230.MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Prnt01Caller;

/**
 * 画面"MSBDP_DlvInstListReg"パネルクラスです。<p>
 *
 * 入荷予定をもとにして納入指示を一括で登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_DlvInstListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBDP0230";

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
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
	// [DlvInstPrnt]ブロック関連のField定義
	public MCPanel DlvInstPrntPanel = null;
	public MCTitledBorder DlvInstPrntTitledBorder = null;
	// [DlvInstPrnt]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue report INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
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
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_not_dlv_inst_prnt_flg = null;
	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_inst_prnt_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_arr_schd_dt_p_PPanel;
	public MCDateField Cnd_arr_schd_dt_fr;	// [Cnd]の[arr_schd_dt_p.ymd_fr]を[Cnd_arr_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_hm_fr;	// [Cnd]の[arr_schd_dt_p.hm_fr]を[Cnd_arr_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_dt_to;	// [Cnd]の[arr_schd_dt_p.ymd_to]を[Cnd_arr_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_hm_to;	// [Cnd]の[arr_schd_dt_p.hm_to]を[Cnd_arr_schd_hm_to]としてエイリアス定義。
	public MCLabel Cnd_po_dt_fr_Label = null;
	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_po_dt_fr = null;
	public MCLabel Cnd_po_dt_to_Label = null;
	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_po_dt_to = null;
	public MCLabel Cnd_dlv_inst_dt_fr_Label = null;
	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dlv_inst_dt_fr = null;
	public MCLabel Cnd_dlv_inst_dt_to_Label = null;
	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dlv_inst_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_rqst_dt_frto_p_PPanel;
	public MCDateField Cnd_dlv_rqst_dt_fr;	// [Cnd]の[dlv_rqst_dt_frto_p.ymd_fr]を[Cnd_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_fr;	// [Cnd]の[dlv_rqst_dt_frto_p.hm_fr]を[Cnd_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_dt_to;	// [Cnd]の[dlv_rqst_dt_frto_p.ymd_to]を[Cnd_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_to;	// [Cnd]の[dlv_rqst_dt_frto_p.hm_to]を[Cnd_dlv_rqst_hm_to]としてエイリアス定義。
	public MCLabel Cnd_purc_sts_typ_Label = null;
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_sts_typ = null;
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_purc_sts_typ_nm = null;
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
	public MCLabel Cnd_in_to_loc_cd_Label = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_loc_nm = null;
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
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
	public MCLabel Cnd_dlv_inst_grp_no_Label = null;
	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_inst_grp_no = null;
	public MCLabel Cnd_dlv_inst_no_Label = null;
	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_inst_no = null;
	public MCLabel Cnd_dlv_inst_d_no_Label = null;
	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_inst_d_no = null;
	/**
	 * Search delivery order received date 納入指示受領検索.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_inst_rcpt_flg = null;
	public MCLabel Cnd_dlv_inst_print_rmrks_Label = null;
	/**
	 * Delivery order remarks 納入指示書備考.<p>
	 *
	 */
	public MCTextField Cnd_dlv_inst_print_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_dlv_inst_print_d_rmrks_Label = null;
	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public MCTextField Cnd_dlv_inst_print_d_rmrks = null;
	public MCLabel Cnd_dtl_intr_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_dtl_intr_rmrks = null;
	public MCLabel Cnd_dlv_slip_d_rmrks_Label = null;
	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_d_rmrks = null;
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
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_can_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[bp_grp_p.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[bp_grp_p.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[bp_grp_p.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[bp_grp_p.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[bp_grp_p.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[bp_grp_p.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[bp_grp_p.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[bp_grp_p.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[bp_grp_p.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[bp_grp_p.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBD.MSBDP0230.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_no = null;
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_no = null;
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_pr_no = null;
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_sts_typ = null;
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_sts_typ_nm = null;
	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_dt = null;
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
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_nm = null;
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
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_trd_unit_cd = null;
	/**
	 * PO unit name 発注単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_src_trd_unit_qty;// [Rslt]の[qty_p.qty]を[columnRslt_src_trd_unit_qty]としてエイリアス定義。
	/**
	 * PO transaction unit number of decimal places 発注取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_trd_unit_dec_place = null;
	/**
	 * PO transaction unit rounding type 発注取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_trd_unit_rnd_typ = null;
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_dt = null;
	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_hm = null;
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_dt = null;
	/**
	 * Delivery order issue date and time 納入指示書発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_print_dt = null;
	/**
	 * Delivery order remarks 納入指示書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_print_rmrks = null;
	/**
	 * Delivery order issued 納入指示書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_printed_flg = null;
	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_no = null;
	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_rev = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_grp_no = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnRslt_dlv_rqst_dt;// [Rslt]の[dlv_rqst_tm_p.ymd]を[columnRslt_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_rqst_hm;// [Rslt]の[dlv_rqst_tm_p.hm]を[columnRslt_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_dt = null;
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sync_flg = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_loc_nm = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_in_to_str_ln_cd;// [Rslt]の[str_ln_p.str_ln_cd]を[columnRslt_in_to_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_str_ln_nm;// [Rslt]の[str_ln_p.str_ln_nm]を[columnRslt_in_to_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_str_ln_cd_none_flg;// [Rslt]の[str_ln_p.str_ln_cd_none_flg]を[columnRslt_in_to_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Subcontractor 外注発注先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_outsrc_sppl_cd = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_loc_wg_cd = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_cd = null;
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_loc_cal_cd = null;
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
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
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
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rcpt_iv_qty_p_PPanel;
	public MCColumnConfig columnRslt_rcpt_iv_qty;// [Rslt]の[rcpt_iv_qty_p.qty]を[columnRslt_rcpt_iv_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_arr_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_arr_qty;// [Rslt]の[arr_act_qty_p.qty]を[columnRslt_arr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_arr_act_abort_qty_p_PPanel;
	public MCColumnConfig columnRslt_act_abort_qty;// [Rslt]の[arr_act_abort_qty_p.qty]を[columnRslt_act_abort_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_purc_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_purc_act_qty;// [Rslt]の[purc_act_qty_p.qty]を[columnRslt_purc_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_purc_abort_qty_p_PPanel;
	public MCColumnConfig columnRslt_purc_abort_qty;// [Rslt]の[purc_abort_qty_p.qty]を[columnRslt_purc_abort_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_accpt_dfct_qty_p_PPanel;
	public MCColumnConfig columnRslt_accpt_dfct_qty;// [Rslt]の[accpt_dfct_qty_p.qty]を[columnRslt_accpt_dfct_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_purc_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_purc_schd_qty;// [Rslt]の[base_unit_purc_schd_qty_p.qty]を[columnRslt_base_unit_purc_schd_qty]としてエイリアス定義。
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_no = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_d_no = null;
	/**
	 * Cancel details 明細取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_can_flg = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_print_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_intr_rmrks = null;
	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_d_rmrks = null;
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
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_d_no = null;
	public mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D Rslt_dlv_p_PPanel;
	public MCColumnConfig columnRslt_inst_dlv_cd;// [Rslt]の[dlv_p.bp_cd]を[columnRslt_inst_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_nm;// [Rslt]の[dlv_p.bp_nm]を[columnRslt_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_sundry_flg;// [Rslt]の[dlv_p.dlv_sundry_flg]を[columnRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_pri_prnt_flg;// [Rslt]の[dlv_p.pri_prnt_flg]を[columnRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_show_dtl;// [Rslt]の[dlv_p.show_dtl]を[columnRslt_dlv_show_dtl]としてエイリアス定義。
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
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tdlv_req_flg = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_tdlv_p_PPanel;
	public MCColumnConfig columnRslt_tdlv_cd;// [Rslt]の[tdlv_p.bp_cd]を[columnRslt_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_nm;// [Rslt]の[tdlv_p.bp_nm]を[columnRslt_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_sundry_flg;// [Rslt]の[tdlv_p.dlv_sundry_flg]を[columnRslt_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_show_dtl;// [Rslt]の[tdlv_p.show_dtl]を[columnRslt_tdlv_show_dtl]としてエイリアス定義。
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
	 * Delivery order 納入指示書.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_print_flg = null;
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_print_flg = null;
	/**
	 * Direct delivery delivery note 仕入直送納品書.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_print_flg = null;
	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_crnt_edi_dlv_inst_flg = null;
	/**
	 * Last EDI 前回ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_flg = null;
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
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_printed_flg = null;
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_no = null;
	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_rev = null;
	/**
	 * Direct delivery delivery note issued 仕入直送納品書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_printed_flg = null;
	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_dlv_slip_d_no = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_prms_dlv_tm_p_PPanel;
	public MCColumnConfig columnRslt_prms_dlv_dt;// [Rslt]の[prms_dlv_tm_p.ymd]を[columnRslt_prms_dlv_dt]としてエイリアス定義。
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_assort_typ = null;
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_tgt_flg = null;
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_inst_rcpt_no = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bp_grp_p_PPanel;
	public MCColumnConfig columnRslt_bp_grp_cd1;// [Rslt]の[bp_grp_p.bp_grp_cd1]を[columnRslt_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm1;// [Rslt]の[bp_grp_p.bp_grp_nm1]を[columnRslt_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd2;// [Rslt]の[bp_grp_p.bp_grp_cd2]を[columnRslt_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm2;// [Rslt]の[bp_grp_p.bp_grp_nm2]を[columnRslt_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd3;// [Rslt]の[bp_grp_p.bp_grp_cd3]を[columnRslt_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm3;// [Rslt]の[bp_grp_p.bp_grp_nm3]を[columnRslt_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd4;// [Rslt]の[bp_grp_p.bp_grp_cd4]を[columnRslt_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm4;// [Rslt]の[bp_grp_p.bp_grp_nm4]を[columnRslt_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd5;// [Rslt]の[bp_grp_p.bp_grp_cd5]を[columnRslt_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm5;// [Rslt]の[bp_grp_p.bp_grp_nm5]を[columnRslt_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd6;// [Rslt]の[bp_grp_p.bp_grp_cd6]を[columnRslt_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm6;// [Rslt]の[bp_grp_p.bp_grp_nm6]を[columnRslt_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd7;// [Rslt]の[bp_grp_p.bp_grp_cd7]を[columnRslt_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm7;// [Rslt]の[bp_grp_p.bp_grp_nm7]を[columnRslt_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd8;// [Rslt]の[bp_grp_p.bp_grp_cd8]を[columnRslt_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm8;// [Rslt]の[bp_grp_p.bp_grp_nm8]を[columnRslt_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd9;// [Rslt]の[bp_grp_p.bp_grp_cd9]を[columnRslt_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm9;// [Rslt]の[bp_grp_p.bp_grp_nm9]を[columnRslt_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd10;// [Rslt]の[bp_grp_p.bp_grp_cd10]を[columnRslt_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm10;// [Rslt]の[bp_grp_p.bp_grp_nm10]を[columnRslt_bp_grp_nm10]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_rtn_sts_typ_nm;// [Rslt]の[rts_msg_p.rtn_sts_typ_nm]を[columnRslt_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_msg_id;// [Rslt]の[rts_msg_p.msg_id]を[columnRslt_msg_id]としてエイリアス定義。
	public MCColumnConfig columnRslt_msg;// [Rslt]の[rts_msg_p.msg]を[columnRslt_msg]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Purchase delivery date adjustment entry 購買納期調整登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0120 = null;
	/**
	 * Issue purchase delivery note 購買納品書発行.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0250 = null;
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
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Report 帳票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	/**
	 * Select issue delivery order 納入指示書発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_dlv_inst_print = null;
	/**
	 * Select all issue delivery order 納入指示書発行全選択.<p>
	 *
	 */
	public MCButton Btn_dlv_inst_print_select_all = null;
	/**
	 * Release all issue delivery order 納入指示書発行全解除.<p>
	 *
	 */
	public MCButton Btn_dlv_inst_print_deselect_all = null;
	/**
	 * Select issue delivery note 納品書発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_dlv_slip_print = null;
	/**
	 * Select all issue delivery note 納品書発行全選択.<p>
	 *
	 */
	public MCButton Btn_dlv_slip_print_select_all = null;
	/**
	 * Release all issue delivery note 納品書発行全解除.<p>
	 *
	 */
	public MCButton Btn_dlv_slip_print_deselect_all = null;
	/**
	 * Select issue direct delivery delivery note 仕入直送納品書発行選択.<p>
	 *
	 */
	public MCLabel Btn_label_purc_ddlv_dlv_slip_print = null;
	/**
	 * Select all issue direct delivery delivery note 仕入直送納品書発行全選択.<p>
	 *
	 */
	public MCButton Btn_purc_ddlv_dlv_slip_print_select_all = null;
	/**
	 * Release all issue direct delivery delivery note 仕入直送納品書発行全解除.<p>
	 *
	 */
	public MCButton Btn_purc_ddlv_dlv_slip_print_deselect_all = null;
	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public MCLabel Btn_label_dlv_inst = null;
	/**
	 * Select all current EDI delivery order 今回ＥＤＩ納入指示全選択.<p>
	 *
	 */
	public MCButton Btn_edi_dlv_inst_select_all = null;
	/**
	 * Release all current EDI delivery order 今回ＥＤＩ納入指示全解除.<p>
	 *
	 */
	public MCButton Btn_edi_dlv_inst_deselect_all = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	// [EastBtn1]ブロック関連のField定義
	public MCPanel EastBtn1Panel = null;
	// [EastBtn1]ブロックの項目のField定義
	// [EastBtn2]ブロック関連のField定義
	public MCPanel EastBtn2Panel = null;
	// [EastBtn2]ブロックの項目のField定義
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, UPD, DEL, FIX_I, SRCH, REF, PRNT};
	
	/** [MS_MSBDL0230_Srch01]のCallerの作成 */
	protected MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Srch01Caller createMS_MSBDL0230_Srch01() {
		MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Srch01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Srch01Bridge>
		caller = ((MSBDP_DlvInstListReg_MC)this).new MS_MSBDL0230_Srch01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Srch01Bridge>(
					(MSBDP_DlvInstListReg)this, new MS_MSBDL0230_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0230_Srch01]の呼び出し */
	protected void callMS_MSBDL0230_Srch01() {
		MCCaller caller = createMS_MSBDL0230_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0230_Srch02]のCallerの作成 */
	protected MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Srch02Caller createMS_MSBDL0230_Srch02() {
		MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Srch02Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Srch02Bridge>
		caller = ((MSBDP_DlvInstListReg_MC)this).new MS_MSBDL0230_Srch02Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Srch02Bridge>(
					(MSBDP_DlvInstListReg)this, new MS_MSBDL0230_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0230_Srch02]の呼び出し */
	protected void callMS_MSBDL0230_Srch02() {
		MCCaller caller = createMS_MSBDL0230_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0230_Imp01]のCallerの作成 */
	protected MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Imp01Caller createMS_MSBDL0230_Imp01() {
		MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Imp01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Imp01Bridge>
		caller = ((MSBDP_DlvInstListReg_MC)this).new MS_MSBDL0230_Imp01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Imp01Bridge>(
					(MSBDP_DlvInstListReg)this, new MS_MSBDL0230_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBDL0230_Imp01]の呼び出し */
	protected void callMS_MSBDL0230_Imp01() {
		MCCaller caller = createMS_MSBDL0230_Imp01();
		caller.exec();
	}
	/** [MS_MSBDL0230_Upd01]のCallerの作成 */
	protected MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Upd01Caller createMS_MSBDL0230_Upd01() {
		MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Upd01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Upd01Bridge>
		caller = ((MSBDP_DlvInstListReg_MC)this).new MS_MSBDL0230_Upd01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Upd01Bridge>(
					(MSBDP_DlvInstListReg)this, new MS_MSBDL0230_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0230_Upd01]の呼び出し */
	protected void callMS_MSBDL0230_Upd01() {
		MCCaller caller = createMS_MSBDL0230_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0230_Del01]のCallerの作成 */
	protected MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Del01Caller createMS_MSBDL0230_Del01() {
		MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Del01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Del01Bridge>
		caller = ((MSBDP_DlvInstListReg_MC)this).new MS_MSBDL0230_Del01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Del01Bridge>(
					(MSBDP_DlvInstListReg)this, new MS_MSBDL0230_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0230_Del01]の呼び出し */
	protected void callMS_MSBDL0230_Del01() {
		MCCaller caller = createMS_MSBDL0230_Del01();
		caller.exec();
	}
	/** [MS_MSBDL0230_Prnt01]のCallerの作成 */
	protected MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Prnt01Caller createMS_MSBDL0230_Prnt01() {
		MSBDP_DlvInstListReg_MC.MS_MSBDL0230_Prnt01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Prnt01Bridge>
		caller = ((MSBDP_DlvInstListReg_MC)this).new MS_MSBDL0230_Prnt01Caller<MSBDP_DlvInstListReg, MS_MSBDL0230_Prnt01Bridge>(
					(MSBDP_DlvInstListReg)this, new MS_MSBDL0230_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0230_Prnt01]の呼び出し */
	protected void callMS_MSBDL0230_Prnt01() {
		MCCaller caller = createMS_MSBDL0230_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0230.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0230.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0230.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0230.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0230.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0230.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0230.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBD.MSBDP0230.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0230.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBD.MSBDP0230.RsltR createRsltR() {
		return mcframe.clientMSBD.MSBDP0230.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0230.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBD.MSBDP0230.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0230.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0230.BtnR createBtnR() {
		return mcframe.clientMSBD.MSBDP0230.BtnR.create();
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
		ret.add(TOPPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(EdiPanel);
		ret.add(DlvInstPrntPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtn1Panel);
		ret.add(EastBtn2Panel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_DlvInstListReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_DlvInstListReg_MC_A(String name) {
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
		MSBDP_DlvInstListReg_MC.jbCreateScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateTOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateFold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateTab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateEdi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateDlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateTab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateTab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateCnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateCnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateCnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateCtrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateRPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateRslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateBtn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateEastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateEastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbCreateEastBtn((MSBDP_DlvInstListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [TOP]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTOP(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [DlvInstPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvInstPrnt(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_DlvInstListReg p) {
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
		p.Cnd_dlv_rqst_dt_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_rqst_dt_frto_p());
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.setName("Cnd.dlv_rqst_dt_frto_p");
		p.Cnd_dlv_rqst_dt_fr = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_rqst_dt_fr.addAliasName("Cnd.dlv_rqst_dt_fr", p);
		p.Cnd_dlv_rqst_hm_fr = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_rqst_hm_fr.addAliasName("Cnd.dlv_rqst_hm_fr", p);
		p.Cnd_dlv_rqst_dt_to = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_rqst_dt_to.addAliasName("Cnd.dlv_rqst_dt_to", p);
		p.Cnd_dlv_rqst_hm_to = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_rqst_hm_to.addAliasName("Cnd.dlv_rqst_hm_to", p);
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
		p.Cnd_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp_p());
		p.Cnd_bp_grp_p_PPanel.setName("Cnd.bp_grp_p");
		p.Cnd_bp_grp_lab1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
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
	protected static void jbCreateCnd2(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_DlvInstListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBDP_DlvInstListReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$itm_p);
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
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_src_trd_unit_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_src_trd_unit_qty.addAliasName("Rslt.src_trd_unit_qty", p);
		p.Rslt_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$dlv_rqst_tm_p);
		p.Rslt_dlv_rqst_tm_p_PPanel.setName("Rslt.dlv_rqst_tm_p");
		p.columnRslt_dlv_rqst_dt = p.Rslt_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_rqst_dt.addAliasName("Rslt.dlv_rqst_dt", p);
		p.columnRslt_dlv_rqst_hm = p.Rslt_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_rqst_hm.addAliasName("Rslt.dlv_rqst_hm", p);
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_in_to_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_in_to_str_ln_cd.addAliasName("Rslt.in_to_str_ln_cd", p);
		p.columnRslt_in_to_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_in_to_str_ln_nm.addAliasName("Rslt.in_to_str_ln_nm", p);
		p.columnRslt_in_to_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_in_to_str_ln_cd_none_flg.addAliasName("Rslt.in_to_str_ln_cd_none_flg", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_rcpt_iv_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$rcpt_iv_qty_p);
		p.Rslt_rcpt_iv_qty_p_PPanel.setName("Rslt.rcpt_iv_qty_p");
		p.columnRslt_rcpt_iv_qty = p.Rslt_rcpt_iv_qty_p_PPanel.columnQty_qty;
		p.columnRslt_rcpt_iv_qty.addAliasName("Rslt.rcpt_iv_qty", p);
		p.Rslt_arr_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$arr_act_qty_p);
		p.Rslt_arr_act_qty_p_PPanel.setName("Rslt.arr_act_qty_p");
		p.columnRslt_arr_qty = p.Rslt_arr_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_arr_qty.addAliasName("Rslt.arr_qty", p);
		p.Rslt_arr_act_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$arr_act_abort_qty_p);
		p.Rslt_arr_act_abort_qty_p_PPanel.setName("Rslt.arr_act_abort_qty_p");
		p.columnRslt_act_abort_qty = p.Rslt_arr_act_abort_qty_p_PPanel.columnQty_qty;
		p.columnRslt_act_abort_qty.addAliasName("Rslt.act_abort_qty", p);
		p.Rslt_purc_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$purc_act_qty_p);
		p.Rslt_purc_act_qty_p_PPanel.setName("Rslt.purc_act_qty_p");
		p.columnRslt_purc_act_qty = p.Rslt_purc_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_purc_act_qty.addAliasName("Rslt.purc_act_qty", p);
		p.Rslt_purc_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$purc_abort_qty_p);
		p.Rslt_purc_abort_qty_p_PPanel.setName("Rslt.purc_abort_qty_p");
		p.columnRslt_purc_abort_qty = p.Rslt_purc_abort_qty_p_PPanel.columnQty_qty;
		p.columnRslt_purc_abort_qty.addAliasName("Rslt.purc_abort_qty", p);
		p.Rslt_accpt_dfct_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$accpt_dfct_qty_p);
		p.Rslt_accpt_dfct_qty_p_PPanel.setName("Rslt.accpt_dfct_qty_p");
		p.columnRslt_accpt_dfct_qty = p.Rslt_accpt_dfct_qty_p_PPanel.columnQty_qty;
		p.columnRslt_accpt_dfct_qty.addAliasName("Rslt.accpt_dfct_qty", p);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$base_unit_purc_schd_qty_p);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.setName("Rslt.base_unit_purc_schd_qty_p");
		p.columnRslt_base_unit_purc_schd_qty = p.Rslt_base_unit_purc_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_purc_schd_qty.addAliasName("Rslt.base_unit_purc_schd_qty", p);
		p.Rslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$dlv_p);
		p.Rslt_dlv_p_PPanel.setName("Rslt.dlv_p");
		p.columnRslt_inst_dlv_cd = p.Rslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_inst_dlv_cd.addAliasName("Rslt.inst_dlv_cd", p);
		p.columnRslt_dlv_nm = p.Rslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_dlv_nm.addAliasName("Rslt.dlv_nm", p);
		p.columnRslt_dlv_sundry_flg = p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_dlv_sundry_flg.addAliasName("Rslt.dlv_sundry_flg", p);
		p.columnRslt_pri_prnt_flg = p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_pri_prnt_flg.addAliasName("Rslt.pri_prnt_flg", p);
		p.columnRslt_dlv_show_dtl = p.Rslt_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt_dlv_show_dtl.addAliasName("Rslt.dlv_show_dtl", p);
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
		p.Rslt_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$tdlv_p);
		p.Rslt_tdlv_p_PPanel.setName("Rslt.tdlv_p");
		p.columnRslt_tdlv_cd = p.Rslt_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_tdlv_cd.addAliasName("Rslt.tdlv_cd", p);
		p.columnRslt_tdlv_nm = p.Rslt_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_tdlv_nm.addAliasName("Rslt.tdlv_nm", p);
		p.columnRslt_tdlv_sundry_flg = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_tdlv_sundry_flg.addAliasName("Rslt.tdlv_sundry_flg", p);
		p.columnRslt_tdlv_show_dtl = p.Rslt_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt_tdlv_show_dtl.addAliasName("Rslt.tdlv_show_dtl", p);
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
		p.Rslt_prms_dlv_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$prms_dlv_tm_p);
		p.Rslt_prms_dlv_tm_p_PPanel.setName("Rslt.prms_dlv_tm_p");
		p.columnRslt_prms_dlv_dt = p.Rslt_prms_dlv_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_prms_dlv_dt.addAliasName("Rslt.prms_dlv_dt", p);
		p.Rslt_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$bp_grp_p);
		p.Rslt_bp_grp_p_PPanel.setName("Rslt.bp_grp_p");
		p.columnRslt_bp_grp_cd1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bp_grp_cd1.addAliasName("Rslt.bp_grp_cd1", p);
		p.columnRslt_bp_grp_nm1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bp_grp_nm1.addAliasName("Rslt.bp_grp_nm1", p);
		p.columnRslt_bp_grp_cd2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bp_grp_cd2.addAliasName("Rslt.bp_grp_cd2", p);
		p.columnRslt_bp_grp_nm2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bp_grp_nm2.addAliasName("Rslt.bp_grp_nm2", p);
		p.columnRslt_bp_grp_cd3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bp_grp_cd3.addAliasName("Rslt.bp_grp_cd3", p);
		p.columnRslt_bp_grp_nm3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bp_grp_nm3.addAliasName("Rslt.bp_grp_nm3", p);
		p.columnRslt_bp_grp_cd4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bp_grp_cd4.addAliasName("Rslt.bp_grp_cd4", p);
		p.columnRslt_bp_grp_nm4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bp_grp_nm4.addAliasName("Rslt.bp_grp_nm4", p);
		p.columnRslt_bp_grp_cd5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bp_grp_cd5.addAliasName("Rslt.bp_grp_cd5", p);
		p.columnRslt_bp_grp_nm5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bp_grp_nm5.addAliasName("Rslt.bp_grp_nm5", p);
		p.columnRslt_bp_grp_cd6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bp_grp_cd6.addAliasName("Rslt.bp_grp_cd6", p);
		p.columnRslt_bp_grp_nm6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bp_grp_nm6.addAliasName("Rslt.bp_grp_nm6", p);
		p.columnRslt_bp_grp_cd7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bp_grp_cd7.addAliasName("Rslt.bp_grp_cd7", p);
		p.columnRslt_bp_grp_nm7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bp_grp_nm7.addAliasName("Rslt.bp_grp_nm7", p);
		p.columnRslt_bp_grp_cd8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bp_grp_cd8.addAliasName("Rslt.bp_grp_cd8", p);
		p.columnRslt_bp_grp_nm8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bp_grp_nm8.addAliasName("Rslt.bp_grp_nm8", p);
		p.columnRslt_bp_grp_cd9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bp_grp_cd9.addAliasName("Rslt.bp_grp_cd9", p);
		p.columnRslt_bp_grp_nm9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bp_grp_nm9.addAliasName("Rslt.bp_grp_nm9", p);
		p.columnRslt_bp_grp_cd10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bp_grp_cd10.addAliasName("Rslt.bp_grp_cd10", p);
		p.columnRslt_bp_grp_nm10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bp_grp_nm10.addAliasName("Rslt.bp_grp_nm10", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$itm_grp_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBD.MSBDP0230.RsltR.$rts_msg_p);
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
	protected static void jbCreateBtn(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [EastBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn1(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [EastBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn2(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_DlvInstListReg p) {
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

	
	/** [Cnd_purc_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_purc_sts_typ_p = null;

	/**
	 * [Cnd_purc_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_sts_typ_ListPutter() {
		if (Cnd_purc_sts_typ_p == null) {
			Cnd_purc_sts_typ_p = createCnd_purc_sts_typ_ListPutter(Cnd_purc_sts_typ, "purc_sts_typ", "purc_sts_typ_nm");

		}
		return Cnd_purc_sts_typ_p;
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
	
	
	/** [Cnd_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_loc_cd_p = null;

	/**
	 * [Cnd_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_loc_cd_ListPutter() {
		if (Cnd_in_to_loc_cd_p == null) {
			Cnd_in_to_loc_cd_p = createCnd_in_to_loc_cd_ListPutter(Cnd_in_to_loc_cd, "in_to_loc_cd", "in_to_loc_nm");

		}
		return Cnd_in_to_loc_cd_p;
	}
	
	
	/** [Cnd_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_str_ln_cd_p = null;

	/**
	 * [Cnd_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_str_ln_cd_ListPutter() {
		if (Cnd_str_ln_cd_p == null) {
			Cnd_str_ln_cd_p = createCnd_str_ln_cd_ListPutter(Cnd_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return Cnd_str_ln_cd_p;
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
	
	
	/** [Rslt_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_in_to_loc_cd_p = null;

	/**
	 * [Rslt_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_in_to_loc_cd_ListPutter() {
		if (Rslt_in_to_loc_cd_p == null) {
			Rslt_in_to_loc_cd_p = createRslt_in_to_loc_cd_ListPutter(columnRslt_in_to_loc_cd, "in_to_loc_cd", "in_to_loc_nm","in_to_str_ln_tgt_flg","in_to_loc_wg_cd","site_cd","in_to_loc_cal_cd","outsrc_sppl_cd","in_to_str_ln_cd","in_to_str_ln_cd_none_flg");

		}
		return Rslt_in_to_loc_cd_p;
	}
	
	
	/** [Rslt_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_unit_cd_p = null;

	/**
	 * [Rslt_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_unit_cd_ListPutter() {
		if (Rslt_trd_unit_cd_p == null) {
			Rslt_trd_unit_cd_p = createRslt_trd_unit_cd_ListPutter(columnRslt_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_rnd_typ","trd_unit_conv_base_qty","trd_unit_conv_qty");

		}
		return Rslt_trd_unit_cd_p;
	}
	
	
	/** [Rslt_mfg_inst_no_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_inst_no_p = null;

	/**
	 * [Rslt_mfg_inst_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_inst_no_ListPutter() {
		if (Rslt_mfg_inst_no_p == null) {
			Rslt_mfg_inst_no_p = createRslt_mfg_inst_no_ListPutter(columnRslt_mfg_inst_no, "mfg_inst_no", "dlv_rqst_dt","dlv_rqst_hm");

		}
		return Rslt_mfg_inst_no_p;
	}
	
	
	/** [Rslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dlv_p_PPanel_columnDlv_bp_cd_p = null;

	/**
	 * [Rslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter() {
		if (Rslt_dlv_p_PPanel_columnDlv_bp_cd_p == null) {
			Rslt_dlv_p_PPanel_columnDlv_bp_cd_p = createRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(Rslt_dlv_p_PPanel.columnDlv_bp_cd, "inst_dlv_cd", "dlv_nm","dlv_sundry_flg","pri_prnt_flg","dlv_zip_cd","dlv_addr1","dlv_addr2","dlv_addr3","dlv_addr4","dlv_cntry_cd","dlv_cntry_nm","dlv_tel","dlv_fax","dlv_cntct_dpt","dlv_cntct_psn","dlv_lg_grp_cd","tdlv_req_flg");
		}
		return Rslt_dlv_p_PPanel_columnDlv_bp_cd_p;
	}
	
	
	/** [Rslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_tdlv_p_PPanel_columnDlv_bp_cd_p = null;

	/**
	 * [Rslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter() {
		if (Rslt_tdlv_p_PPanel_columnDlv_bp_cd_p == null) {
			Rslt_tdlv_p_PPanel_columnDlv_bp_cd_p = createRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter(Rslt_tdlv_p_PPanel.columnDlv_bp_cd, "tdlv_cd", "tdlv_nm","tdlv_sundry_flg","tdlv_cntct_dpt","tdlv_cntct_psn","tdlv_zip_cd","tdlv_addr1","tdlv_addr2","tdlv_addr3","tdlv_addr4","tdlv_tel","tdlv_fax","tdlv_lg_grp_cd","tdlv_cntry_cd","tdlv_cntry_nm");
		}
		return Rslt_tdlv_p_PPanel_columnDlv_bp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_DlvInstListReg create(){
		MSBDP_DlvInstListReg p = new MSBDP_DlvInstListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_DlvInstListReg create(String name){
		MSBDP_DlvInstListReg p = new MSBDP_DlvInstListReg(name);
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
		MSBDP_DlvInstListReg_MC.jbfInitScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitTOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitFold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitTab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitEdi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitDlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitTab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitTab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitCnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitCnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitCnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitCtrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitRPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitRslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitBtn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitEastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitEastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbfInitEastBtn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitTOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitFold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitTab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitEdi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitDlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitTab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitTab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitCnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitCnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitCnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitCtrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitRPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitRslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitBtn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitEastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitEastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.jbInitEastBtn((MSBDP_DlvInstListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTOP(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.TOPPanel = p.beansFactory.createPanel("TOP");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_DlvInstListReg p) {
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
	protected static void jbfInitTab1(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvInstPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvInstPrnt(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.DlvInstPrntPanel = p.beansFactory.createPanel("DlvInstPrnt");
		p.DlvInstPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_edi_flg = p.beansFactory.createCheckBox("Cnd.edi_flg");
		p.Cnd_not_edi_flg = p.beansFactory.createCheckBox("Cnd.not_edi_flg");
		p.Cnd_not_dlv_inst_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_dlv_inst_prnt_flg");
		p.Cnd_dlv_inst_prnt_flg = p.beansFactory.createCheckBox("Cnd.dlv_inst_prnt_flg");
		p.Cnd_po_dt_fr_Label = p.beansFactory.createLabel("Cnd.po_dt_fr_Label");
		p.Cnd_po_dt_fr = p.beansFactory.createDateField("Cnd.po_dt_fr");
		p.Cnd_po_dt_fr.setLabel(p.Cnd_po_dt_fr_Label);
		p.Cnd_po_dt_to_Label = p.beansFactory.createLabel("Cnd.po_dt_to_Label");
		p.Cnd_po_dt_to = p.beansFactory.createDateField("Cnd.po_dt_to");
		p.Cnd_po_dt_to.setLabel(p.Cnd_po_dt_to_Label);
		p.Cnd_dlv_inst_dt_fr_Label = p.beansFactory.createLabel("Cnd.dlv_inst_dt_fr_Label");
		p.Cnd_dlv_inst_dt_fr = p.beansFactory.createDateField("Cnd.dlv_inst_dt_fr");
		p.Cnd_dlv_inst_dt_fr.setLabel(p.Cnd_dlv_inst_dt_fr_Label);
		p.Cnd_dlv_inst_dt_to_Label = p.beansFactory.createLabel("Cnd.dlv_inst_dt_to_Label");
		p.Cnd_dlv_inst_dt_to = p.beansFactory.createDateField("Cnd.dlv_inst_dt_to");
		p.Cnd_dlv_inst_dt_to.setLabel(p.Cnd_dlv_inst_dt_to_Label);
		p.Cnd_purc_sts_typ_Label = p.beansFactory.createLabel("Cnd.purc_sts_typ_Label");
		p.Cnd_purc_sts_typ = p.beansFactory.createTextComboBox("Cnd.purc_sts_typ");
		p.Cnd_purc_sts_typ.setLabel(p.Cnd_purc_sts_typ_Label);
		p.Cnd_purc_sts_typ_nm = p.beansFactory.createTextField("Cnd.purc_sts_typ_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_in_to_loc_cd_Label = p.beansFactory.createLabel("Cnd.in_to_loc_cd_Label");
		p.Cnd_in_to_loc_cd = p.beansFactory.createTextComboBox("Cnd.in_to_loc_cd");
		p.Cnd_in_to_loc_cd.setLabel(p.Cnd_in_to_loc_cd_Label);
		p.Cnd_in_to_loc_nm = p.beansFactory.createTextField("Cnd.in_to_loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_dlv_inst_grp_no_Label = p.beansFactory.createLabel("Cnd.dlv_inst_grp_no_Label");
		p.Cnd_dlv_inst_grp_no = p.beansFactory.createTextField("Cnd.dlv_inst_grp_no");
		p.Cnd_dlv_inst_grp_no.setLabel(p.Cnd_dlv_inst_grp_no_Label);
		p.Cnd_dlv_inst_no_Label = p.beansFactory.createLabel("Cnd.dlv_inst_no_Label");
		p.Cnd_dlv_inst_no = p.beansFactory.createTextField("Cnd.dlv_inst_no");
		p.Cnd_dlv_inst_no.setLabel(p.Cnd_dlv_inst_no_Label);
		p.Cnd_dlv_inst_d_no_Label = p.beansFactory.createLabel("Cnd.dlv_inst_d_no_Label");
		p.Cnd_dlv_inst_d_no = p.beansFactory.createTextField("Cnd.dlv_inst_d_no");
		p.Cnd_dlv_inst_d_no.setLabel(p.Cnd_dlv_inst_d_no_Label);
		p.Cnd_dlv_inst_rcpt_flg = p.beansFactory.createCheckBox("Cnd.dlv_inst_rcpt_flg");
		p.Cnd_dlv_inst_print_rmrks_Label = p.beansFactory.createLabel("Cnd.dlv_inst_print_rmrks_Label");
		p.Cnd_dlv_inst_print_rmrks = p.beansFactory.createTextField("Cnd.dlv_inst_print_rmrks");
		p.Cnd_dlv_inst_print_rmrks.setLabel(p.Cnd_dlv_inst_print_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_dlv_inst_print_d_rmrks_Label = p.beansFactory.createLabel("Cnd.dlv_inst_print_d_rmrks_Label");
		p.Cnd_dlv_inst_print_d_rmrks = p.beansFactory.createTextField("Cnd.dlv_inst_print_d_rmrks");
		p.Cnd_dlv_inst_print_d_rmrks.setLabel(p.Cnd_dlv_inst_print_d_rmrks_Label);
		p.Cnd_dtl_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.dtl_intr_rmrks_Label");
		p.Cnd_dtl_intr_rmrks = p.beansFactory.createTextField("Cnd.dtl_intr_rmrks");
		p.Cnd_dtl_intr_rmrks.setLabel(p.Cnd_dtl_intr_rmrks_Label);
		p.Cnd_dlv_slip_d_rmrks_Label = p.beansFactory.createLabel("Cnd.dlv_slip_d_rmrks_Label");
		p.Cnd_dlv_slip_d_rmrks = p.beansFactory.createTextField("Cnd.dlv_slip_d_rmrks");
		p.Cnd_dlv_slip_d_rmrks.setLabel(p.Cnd_dlv_slip_d_rmrks_Label);
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
		p.Cnd_incl_can_flg = p.beansFactory.createCheckBox("Cnd.incl_can_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_no = p.beansFactory.createTableColumn("Rslt.purc_schd_no", MCColumnType.TEXT);
		p.columnRslt_arr_schd_no = p.beansFactory.createTableColumn("Rslt.arr_schd_no", MCColumnType.TEXT);
		p.columnRslt_arr_pr_no = p.beansFactory.createTableColumn("Rslt.arr_pr_no", MCColumnType.TEXT);
		p.columnRslt_purc_sts_typ = p.beansFactory.createTableColumn("Rslt.purc_sts_typ", MCColumnType.TEXT);
		p.columnRslt_purc_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_po_dt = p.beansFactory.createTableColumn("Rslt.po_dt", MCColumnType.DATE);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_src_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.src_trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_src_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.src_trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_src_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.src_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_src_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.src_trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_arr_schd_dt = p.beansFactory.createTableColumn("Rslt.arr_schd_dt", MCColumnType.DATE);
		p.columnRslt_arr_schd_hm = p.beansFactory.createTableColumn("Rslt.arr_schd_hm", MCColumnType.DATE);
		p.columnRslt_dlv_inst_dt = p.beansFactory.createTableColumn("Rslt.dlv_inst_dt", MCColumnType.DATE);
		p.columnRslt_dlv_inst_print_dt = p.beansFactory.createTableColumn("Rslt.dlv_inst_print_dt", MCColumnType.DATE);
		p.columnRslt_dlv_inst_print_rmrks = p.beansFactory.createTableColumn("Rslt.dlv_inst_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_dlv_inst_printed_flg = p.beansFactory.createTableColumn("Rslt.dlv_inst_printed_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_inst_no = p.beansFactory.createTableColumn("Rslt.dlv_inst_no", MCColumnType.TEXT);
		p.columnRslt_dlv_inst_rev = p.beansFactory.createTableColumn("Rslt.dlv_inst_rev", MCColumnType.NUMBER);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_inst_grp_no = p.beansFactory.createTableColumn("Rslt.dlv_inst_grp_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_dt = p.beansFactory.createTableColumn("Rslt.purc_schd_dt", MCColumnType.DATE);
		p.columnRslt_sync_flg = p.beansFactory.createTableColumn("Rslt.sync_flg", MCColumnType.CHECK);
		p.columnRslt_in_to_loc_cd = p.beansFactory.createTableColumn("Rslt.in_to_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_in_to_loc_nm = p.beansFactory.createTableColumn("Rslt.in_to_loc_nm", MCColumnType.TEXT);
		p.columnRslt_in_to_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.in_to_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_outsrc_sppl_cd = p.beansFactory.createTableColumn("Rslt.outsrc_sppl_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Rslt.in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_loc_cal_cd = p.beansFactory.createTableColumn("Rslt.in_to_loc_cal_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT_COMBO);
		p.columnRslt_purc_act_d_no = p.beansFactory.createTableColumn("Rslt.purc_act_d_no", MCColumnType.TEXT);
		p.columnRslt_dtl_can_flg = p.beansFactory.createTableColumn("Rslt.dtl_can_flg", MCColumnType.CHECK);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_dlv_inst_print_d_rmrks = p.beansFactory.createTableColumn("Rslt.dlv_inst_print_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_dtl_intr_rmrks = p.beansFactory.createTableColumn("Rslt.dtl_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_d_rmrks = p.beansFactory.createTableColumn("Rslt.dlv_slip_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char1 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char1", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char2 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char2", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char3 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char3", MCColumnType.TEXT);
		p.columnRslt_dlv_inst_d_no = p.beansFactory.createTableColumn("Rslt.dlv_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_tdlv_req_flg = p.beansFactory.createTableColumn("Rslt.tdlv_req_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_inst_print_flg = p.beansFactory.createTableColumn("Rslt.dlv_inst_print_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_slip_print_flg = p.beansFactory.createTableColumn("Rslt.dlv_slip_print_flg", MCColumnType.CHECK);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_print_flg", MCColumnType.CHECK);
		p.columnRslt_crnt_edi_dlv_inst_flg = p.beansFactory.createTableColumn("Rslt.crnt_edi_dlv_inst_flg", MCColumnType.CHECK);
		p.columnRslt_edi_flg = p.beansFactory.createTableColumn("Rslt.edi_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_seq = p.beansFactory.createTableColumn("Rslt.dlv_slip_seq", MCColumnType.NUMBER);
		p.columnRslt_dlv_slip_rev = p.beansFactory.createTableColumn("Rslt.dlv_slip_rev", MCColumnType.NUMBER);
		p.columnRslt_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_printed_flg = p.beansFactory.createTableColumn("Rslt.dlv_slip_printed_flg", MCColumnType.CHECK);
		p.columnRslt_purc_ddlv_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_purc_ddlv_dlv_slip_rev = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_rev", MCColumnType.NUMBER);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_printed_flg", MCColumnType.CHECK);
		p.columnRslt_purc_ddlv_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.purc_ddlv_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_assort_typ = p.beansFactory.createTableColumn("Rslt.assort_typ", MCColumnType.TEXT);
		p.columnRslt_edi_tgt_flg = p.beansFactory.createTableColumn("Rslt.edi_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_inst_rcpt_no = p.beansFactory.createTableColumn("Rslt.dlv_inst_rcpt_no", MCColumnType.TEXT);
		p.columnRslt_slo_dt = p.beansFactory.createTableColumn("Rslt.slo_dt", MCColumnType.DATE);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0120 = p.beansFactory.createButton("Btn.open_MSBDP0120", "open");
		p.Btn_open_MSBDP0250 = p.beansFactory.createButton("Btn.open_MSBDP0250", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_label_dlv_inst_print = p.beansFactory.createLabel("Btn.label_dlv_inst_print");
		p.Btn_dlv_inst_print_select_all = p.beansFactory.createButton("Btn.dlv_inst_print_select_all", "no_border");
		p.Btn_dlv_inst_print_deselect_all = p.beansFactory.createButton("Btn.dlv_inst_print_deselect_all", "no_border");
		p.Btn_label_dlv_slip_print = p.beansFactory.createLabel("Btn.label_dlv_slip_print");
		p.Btn_dlv_slip_print_select_all = p.beansFactory.createButton("Btn.dlv_slip_print_select_all", "no_border");
		p.Btn_dlv_slip_print_deselect_all = p.beansFactory.createButton("Btn.dlv_slip_print_deselect_all", "no_border");
		p.Btn_label_purc_ddlv_dlv_slip_print = p.beansFactory.createLabel("Btn.label_purc_ddlv_dlv_slip_print");
		p.Btn_purc_ddlv_dlv_slip_print_select_all = p.beansFactory.createButton("Btn.purc_ddlv_dlv_slip_print_select_all", "no_border");
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all = p.beansFactory.createButton("Btn.purc_ddlv_dlv_slip_print_deselect_all", "no_border");
		p.Btn_label_dlv_inst = p.beansFactory.createLabel("Btn.label_dlv_inst");
		p.Btn_edi_dlv_inst_select_all = p.beansFactory.createButton("Btn.edi_dlv_inst_select_all", "no_border");
		p.Btn_edi_dlv_inst_deselect_all = p.beansFactory.createButton("Btn.edi_dlv_inst_deselect_all", "no_border");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [EastBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn1(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.EastBtn1Panel = p.beansFactory.createPanel("EastBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn2(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.EastBtn2Panel = p.beansFactory.createPanel("EastBtn2");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TOPPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTOP(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.add(p.TOPPanel);
		p.TOPPanel.setNextBeans(p.RsltPanel);
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TOPPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBDP_DlvInstListReg p) {
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
	protected static void jbInitTab1(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.EdiPanel, null);
		p.Tab1Panel.setLastBeans(p.EdiPanel);
		p.EdiPanel.setNextBeans(p.DlvInstPrntPanel);
		p.Tab1Panel.add(p.DlvInstPrntPanel, null);
		p.DlvInstPrntPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvInstPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvInstPrnt(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.DlvInstPrntPanel.setBorder(p.DlvInstPrntTitledBorder);
		p.DlvInstPrntPanel.setValueCheck(false);
		p.DlvInstPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvInstPrntPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBDP_DlvInstListReg p) {
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
	protected static void jbInitTab3(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.ope_META);
		p.EdiPanel.add(p.Cnd_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_edi_flg);
		p.Cnd_edi_flg.setNextBeans(p.Cnd_not_edi_flg);
		p.Cnd_edi_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.edi_flg_META);
		p.EdiPanel.add(p.Cnd_not_edi_flg);
		p.Cnd_not_edi_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.not_edi_flg_META);
		p.DlvInstPrntPanel.add(p.Cnd_not_dlv_inst_prnt_flg);
		p.DlvInstPrntPanel.setLastBeans(p.Cnd_not_dlv_inst_prnt_flg);
		p.Cnd_not_dlv_inst_prnt_flg.setNextBeans(p.Cnd_dlv_inst_prnt_flg);
		p.Cnd_not_dlv_inst_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.not_dlv_inst_prnt_flg_META);
		p.DlvInstPrntPanel.add(p.Cnd_dlv_inst_prnt_flg);
		p.Cnd_dlv_inst_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_prnt_flg_META);
		p.CndPanel.add(p.Cnd_arr_schd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_arr_schd_dt_p_PPanel);
		p.Cnd_arr_schd_dt_p_PPanel.setNextBeans(p.Cnd_po_dt_fr);
		p.CndPanel.add(p.Cnd_po_dt_fr_Label);
		p.CndPanel.add(p.Cnd_po_dt_fr);
		p.Cnd_po_dt_fr.setNextBeans(p.Cnd_po_dt_to);
		p.Cnd_po_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.po_dt_fr_META);
		p.Cnd_po_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_po_dt_to_Label);
		p.CndPanel.add(p.Cnd_po_dt_to);
		p.Cnd_po_dt_to.setNextBeans(p.Cnd_dlv_inst_dt_fr);
		p.Cnd_po_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.po_dt_to_META);
		p.Cnd_po_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_inst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_dt_fr);
		p.Cnd_dlv_inst_dt_fr.setNextBeans(p.Cnd_dlv_inst_dt_to);
		p.Cnd_dlv_inst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_dt_fr_META);
		p.Cnd_dlv_inst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_inst_dt_to_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_dt_to);
		p.Cnd_dlv_inst_dt_to.setNextBeans(p.Cnd_dlv_rqst_dt_frto_p_PPanel);
		p.Cnd_dlv_inst_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_dt_to_META);
		p.Cnd_dlv_inst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_frto_p_PPanel);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.setNextBeans(p.Cnd_purc_sts_typ);
		p.Cnd_purc_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_sts_typ, true);
		p.Cnd_purc_sts_typ.setLinkBeans(p.Cnd_purc_sts_typ_nm);
		p.CndPanel.add(p.Cnd_purc_sts_typ_Label);
		p.CndPanel.add(p.Cnd_purc_sts_typ);
		p.Cnd_purc_sts_typ.setNextBeans(p.Cnd_purc_sts_typ_nm);
		p.Cnd_purc_sts_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.purc_sts_typ_META);
		p.CndPanel.add(p.Cnd_purc_sts_typ_nm);
		p.Cnd_purc_sts_typ_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_purc_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.purc_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_in_to_loc_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_in_to_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_loc_cd, true);
		p.Cnd_in_to_loc_cd.setLinkBeans(p.Cnd_in_to_loc_nm);
		p.CndPanel.add(p.Cnd_in_to_loc_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_loc_cd);
		p.Cnd_in_to_loc_cd.setNextBeans(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.in_to_loc_cd_META);
		p.CndPanel.add(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_in_to_loc_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.in_to_loc_nm_META);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.str_ln_nm_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_po_no);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_dlv_inst_grp_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_dlv_inst_grp_no_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_grp_no);
		p.Cnd_dlv_inst_grp_no.setNextBeans(p.Cnd_dlv_inst_no);
		p.Cnd_dlv_inst_grp_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_grp_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_inst_grp_no, true);
		p.CndPanel.add(p.Cnd_dlv_inst_no_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_no);
		p.Cnd_dlv_inst_no.setNextBeans(p.Cnd_dlv_inst_d_no);
		p.Cnd_dlv_inst_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_inst_no, true);
		p.CndPanel.add(p.Cnd_dlv_inst_d_no_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_d_no);
		p.Cnd_dlv_inst_d_no.setNextBeans(p.Cnd_dlv_inst_rcpt_flg);
		p.Cnd_dlv_inst_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_d_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_inst_d_no, true);
		p.CndPanel.add(p.Cnd_dlv_inst_rcpt_flg);
		p.Cnd_dlv_inst_rcpt_flg.setNextBeans(p.Cnd_dlv_inst_print_rmrks);
		p.Cnd_dlv_inst_rcpt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_rcpt_flg_META);
		p.CndPanel.add(p.Cnd_dlv_inst_print_rmrks_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_print_rmrks);
		p.Cnd_dlv_inst_print_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_dlv_inst_print_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_print_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dlv_inst_print_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_dlv_inst_print_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_dlv_inst_print_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_print_d_rmrks);
		p.Cnd_dlv_inst_print_d_rmrks.setNextBeans(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dlv_inst_print_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_inst_print_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dlv_inst_print_d_rmrks, true);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dtl_intr_rmrks.setNextBeans(p.Cnd_dlv_slip_d_rmrks);
		p.Cnd_dtl_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dtl_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dtl_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_dlv_slip_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_d_rmrks);
		p.Cnd_dlv_slip_d_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_dlv_slip_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dlv_slip_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_d_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setNextBeans(p.Cnd_incl_can_flg);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.CndPanel.add(p.Cnd_incl_can_flg);
		p.Cnd_incl_can_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0230.CndR.incl_can_flg_META);
		p.Cnd2Panel.add(p.Cnd_bp_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
		p.Cnd3Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_DlvInstListReg p) {
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
	protected static void jbInitRPnl(MSBDP_DlvInstListReg p) {
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
	protected static void jbInitRslt(MSBDP_DlvInstListReg p) {
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
	protected static void jbInitBtn(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtn1Panel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0120.setFunctionKey(MCFunctionKey.F3);
		p.EastBtn1Panel.setLastBeans(p.Btn_open_MSBDP0120);
		p.EastBtn1Panel.add(p.Btn_open_MSBDP0120);
		p.Btn_open_MSBDP0120.setNextBeans(p.Btn_open_MSBDP0250);
		p.Btn_open_MSBDP0250.setFunctionKey(MCFunctionKey.F4);
		p.EastBtn1Panel.add(p.Btn_open_MSBDP0250);
		p.Btn_open_MSBDP0250.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.EastBtn1Panel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.EastBtn1Panel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.EastBtn1Panel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.EastBtn1Panel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F9);
		p.EastBtn1Panel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.EastBtn1Panel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.EastBtn2Panel.add(p.Btn_label_dlv_inst_print);
		p.Btn_dlv_inst_print_select_all.setIcon("SELECT_ALL");
		p.Btn_dlv_inst_print_select_all.setFunctionKey(MCFunctionKey.F15);
		p.EastBtn2Panel.setLastBeans(p.Btn_dlv_inst_print_select_all);
		p.EastBtn2Panel.add(p.Btn_dlv_inst_print_select_all);
		p.Btn_dlv_inst_print_select_all.setNextBeans(p.Btn_dlv_inst_print_deselect_all);
		p.Btn_dlv_inst_print_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_dlv_inst_print_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.EastBtn2Panel.add(p.Btn_dlv_inst_print_deselect_all);
		p.Btn_dlv_inst_print_deselect_all.setNextBeans(p.Btn_dlv_slip_print_select_all);
		p.EastBtn2Panel.add(p.Btn_label_dlv_slip_print);
		p.Btn_dlv_slip_print_select_all.setIcon("SELECT_ALL");
		p.Btn_dlv_slip_print_select_all.setFunctionKey(MCFunctionKey.F18);
		p.EastBtn2Panel.add(p.Btn_dlv_slip_print_select_all);
		p.Btn_dlv_slip_print_select_all.setNextBeans(p.Btn_dlv_slip_print_deselect_all);
		p.Btn_dlv_slip_print_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_dlv_slip_print_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.EastBtn2Panel.add(p.Btn_dlv_slip_print_deselect_all);
		p.Btn_dlv_slip_print_deselect_all.setNextBeans(p.Btn_purc_ddlv_dlv_slip_print_select_all);
		p.EastBtn2Panel.add(p.Btn_label_purc_ddlv_dlv_slip_print);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.setIcon("SELECT_ALL");
		p.Btn_purc_ddlv_dlv_slip_print_select_all.setFunctionKey(MCFunctionKey.F20);
		p.EastBtn2Panel.add(p.Btn_purc_ddlv_dlv_slip_print_select_all);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.setNextBeans(p.Btn_purc_ddlv_dlv_slip_print_deselect_all);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.setFunctionKey(MCFunctionKey.F21);
		p.EastBtn2Panel.add(p.Btn_purc_ddlv_dlv_slip_print_deselect_all);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.setNextBeans(p.Btn_edi_dlv_inst_select_all);
		p.EastBtn2Panel.add(p.Btn_label_dlv_inst);
		p.Btn_edi_dlv_inst_select_all.setIcon("SELECT_ALL");
		p.Btn_edi_dlv_inst_select_all.setFunctionKey(MCFunctionKey.F7);
		p.EastBtn2Panel.add(p.Btn_edi_dlv_inst_select_all);
		p.Btn_edi_dlv_inst_select_all.setNextBeans(p.Btn_edi_dlv_inst_deselect_all);
		p.Btn_edi_dlv_inst_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_edi_dlv_inst_deselect_all.setFunctionKey(MCFunctionKey.F8);
		p.EastBtn2Panel.add(p.Btn_edi_dlv_inst_deselect_all);
		p.Btn_edi_dlv_inst_deselect_all.setNextBeans(p.Btn_indiv_prnt_flg);
		p.EastBtn2Panel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBD.MSBDP0230.BtnR.indiv_prnt_flg_META);
	}

	/**
	 * [EastBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn1(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtn1Panel);
		p.EastBtn1Panel.setNextBeans(p.EastBtn2Panel);
		p.EastBtn1Panel.setValueCheck(false);
		p.EastBtn1Panel.setLayoutPosition("SWN");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn2(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtn2Panel);
		p.EastBtn2Panel.setNextBeans(p.EastBtnPanel);
		p.EastBtn2Panel.setValueCheck(false);
		p.EastBtn2Panel.setLayoutPosition("SWN");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_DlvInstListReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SEN");
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
		MSBDP_DlvInstListReg_MC.mcInitScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitTOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitFold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitTab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitEdi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitDlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitTab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitTab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitCnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitCnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitCnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitCtrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitRPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitRslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitBtn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitEastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitEastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.mcInitEastBtn((MSBDP_DlvInstListReg)this);

		// [INS]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitINS_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitINS_EastBtn((MSBDP_DlvInstListReg)this);

		// [UPD]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitUPD_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitUPD_EastBtn((MSBDP_DlvInstListReg)this);

		// [DEL]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitDEL_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitDEL_EastBtn((MSBDP_DlvInstListReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitFIX__I_EastBtn((MSBDP_DlvInstListReg)this);

		// [SRCH]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitSRCH_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitSRCH_EastBtn((MSBDP_DlvInstListReg)this);

		// [REF]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitREF_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitREF_EastBtn((MSBDP_DlvInstListReg)this);

		// [PRNT]ステータスのモードの設定
		MSBDP_DlvInstListReg_MC.statusInitPRNT_ScreenOpe((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_TOP((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Fold((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Tab1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Edi((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_DlvInstPrnt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Tab2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Tab3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Cnd((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Cnd2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Cnd3((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Ctrl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_RPnl((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Rslt((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_Btn((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_EastBtn1((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_EastBtn2((MSBDP_DlvInstListReg)this);
		MSBDP_DlvInstListReg_MC.statusInitPRNT_EastBtn((MSBDP_DlvInstListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [TOP]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTOP(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_DlvInstListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [DlvInstPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvInstPrnt(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_DlvInstListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_edi_flg.addAllListener(p);
		p.Cnd_not_edi_flg.addAllListener(p);
		p.Cnd_not_dlv_inst_prnt_flg.addAllListener(p);
		p.Cnd_dlv_inst_prnt_flg.addAllListener(p);
		p.Cnd_po_dt_fr.setListListener(p);
		p.Cnd_po_dt_fr.addAllListener(p);
		p.Cnd_po_dt_to.setListListener(p);
		p.Cnd_po_dt_to.addAllListener(p);
		p.Cnd_dlv_inst_dt_fr.setListListener(p);
		p.Cnd_dlv_inst_dt_fr.addAllListener(p);
		p.Cnd_dlv_inst_dt_to.setListListener(p);
		p.Cnd_dlv_inst_dt_to.addAllListener(p);
		p.Cnd_purc_sts_typ.setListListener(p);
		p.Cnd_purc_sts_typ.addAllListener(p);
		p.Cnd_purc_sts_typ_nm.setListListener(p);
		p.Cnd_purc_sts_typ_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_in_to_loc_cd.setListListener(p);
		p.Cnd_in_to_loc_cd.addAllListener(p);
		p.Cnd_in_to_loc_nm.setListListener(p);
		p.Cnd_in_to_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_dlv_inst_grp_no.setListListener(p);
		p.Cnd_dlv_inst_grp_no.addAllListener(p);
		p.Cnd_dlv_inst_no.setListListener(p);
		p.Cnd_dlv_inst_no.addAllListener(p);
		p.Cnd_dlv_inst_d_no.setListListener(p);
		p.Cnd_dlv_inst_d_no.addAllListener(p);
		p.Cnd_dlv_inst_rcpt_flg.addAllListener(p);
		p.Cnd_dlv_inst_print_rmrks.setListListener(p);
		p.Cnd_dlv_inst_print_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_dlv_inst_print_d_rmrks.setListListener(p);
		p.Cnd_dlv_inst_print_d_rmrks.addAllListener(p);
		p.Cnd_dtl_intr_rmrks.setListListener(p);
		p.Cnd_dtl_intr_rmrks.addAllListener(p);
		p.Cnd_dlv_slip_d_rmrks.setListListener(p);
		p.Cnd_dlv_slip_d_rmrks.addAllListener(p);
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
		p.Cnd_incl_can_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_DlvInstListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBDP_DlvInstListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBDP_DlvInstListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_purc_schd_no.addAllListener(p);
		p.columnRslt_purc_schd_no.setListListener(p);
		p.columnRslt_arr_schd_no.addAllListener(p);
		p.columnRslt_arr_schd_no.setListListener(p);
		p.columnRslt_arr_pr_no.addAllListener(p);
		p.columnRslt_arr_pr_no.setListListener(p);
		p.columnRslt_purc_sts_typ.addAllListener(p);
		p.columnRslt_purc_sts_typ.setListListener(p);
		p.columnRslt_purc_sts_typ_nm.addAllListener(p);
		p.columnRslt_purc_sts_typ_nm.setListListener(p);
		p.columnRslt_po_dt.addAllListener(p);
		p.columnRslt_po_dt.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_src_trd_unit_cd.addAllListener(p);
		p.columnRslt_src_trd_unit_cd.setListListener(p);
		p.columnRslt_src_trd_unit_nm.addAllListener(p);
		p.columnRslt_src_trd_unit_nm.setListListener(p);
		p.columnRslt_src_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_src_trd_unit_dec_place.setListListener(p);
		p.columnRslt_src_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_src_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_arr_schd_dt.addAllListener(p);
		p.columnRslt_arr_schd_dt.setListListener(p);
		p.columnRslt_arr_schd_hm.addAllListener(p);
		p.columnRslt_arr_schd_hm.setListListener(p);
		p.columnRslt_dlv_inst_dt.addAllListener(p);
		p.columnRslt_dlv_inst_dt.setListListener(p);
		p.columnRslt_dlv_inst_print_dt.addAllListener(p);
		p.columnRslt_dlv_inst_print_dt.setListListener(p);
		p.columnRslt_dlv_inst_print_rmrks.addAllListener(p);
		p.columnRslt_dlv_inst_print_rmrks.setListListener(p);
		p.columnRslt_dlv_inst_printed_flg.addAllListener(p);
		p.columnRslt_dlv_inst_no.addAllListener(p);
		p.columnRslt_dlv_inst_no.setListListener(p);
		p.columnRslt_dlv_inst_rev.addAllListener(p);
		p.columnRslt_dlv_inst_rev.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_dlv_inst_grp_no.addAllListener(p);
		p.columnRslt_dlv_inst_grp_no.setListListener(p);
		p.columnRslt_purc_schd_dt.addAllListener(p);
		p.columnRslt_purc_schd_dt.setListListener(p);
		p.columnRslt_sync_flg.addAllListener(p);
		p.columnRslt_in_to_loc_cd.addAllListener(p);
		p.columnRslt_in_to_loc_cd.setListListener(p);
		p.columnRslt_in_to_loc_nm.addAllListener(p);
		p.columnRslt_in_to_loc_nm.setListListener(p);
		p.columnRslt_in_to_str_ln_tgt_flg.addAllListener(p);
		p.columnRslt_outsrc_sppl_cd.addAllListener(p);
		p.columnRslt_outsrc_sppl_cd.setListListener(p);
		p.columnRslt_in_to_loc_wg_cd.addAllListener(p);
		p.columnRslt_in_to_loc_wg_cd.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_in_to_loc_cal_cd.addAllListener(p);
		p.columnRslt_in_to_loc_cal_cd.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_purc_act_d_no.addAllListener(p);
		p.columnRslt_purc_act_d_no.setListListener(p);
		p.columnRslt_dtl_can_flg.addAllListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_dlv_inst_print_d_rmrks.addAllListener(p);
		p.columnRslt_dlv_inst_print_d_rmrks.setListListener(p);
		p.columnRslt_dtl_intr_rmrks.addAllListener(p);
		p.columnRslt_dtl_intr_rmrks.setListListener(p);
		p.columnRslt_dlv_slip_d_rmrks.addAllListener(p);
		p.columnRslt_dlv_slip_d_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_dtl_sub_char1.addAllListener(p);
		p.columnRslt_dtl_sub_char1.setListListener(p);
		p.columnRslt_dtl_sub_char2.addAllListener(p);
		p.columnRslt_dtl_sub_char2.setListListener(p);
		p.columnRslt_dtl_sub_char3.addAllListener(p);
		p.columnRslt_dtl_sub_char3.setListListener(p);
		p.columnRslt_dlv_inst_d_no.addAllListener(p);
		p.columnRslt_dlv_inst_d_no.setListListener(p);
		p.Rslt_dlv_p_PPanel.columnDlv_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_tdlv_req_flg.addAllListener(p);
		p.Rslt_tdlv_p_PPanel.columnDlv_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_dlv_inst_print_flg.addAllListener(p);
		p.columnRslt_dlv_slip_print_flg.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.addAllListener(p);
		p.columnRslt_crnt_edi_dlv_inst_flg.addAllListener(p);
		p.columnRslt_edi_flg.addAllListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_dlv_slip_seq.addAllListener(p);
		p.columnRslt_dlv_slip_seq.setListListener(p);
		p.columnRslt_dlv_slip_rev.addAllListener(p);
		p.columnRslt_dlv_slip_rev.setListListener(p);
		p.columnRslt_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_dlv_slip_d_no.setListListener(p);
		p.columnRslt_dlv_slip_printed_flg.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_no.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_no.setListListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_rev.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_rev.setListListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.setListListener(p);
		p.columnRslt_assort_typ.addAllListener(p);
		p.columnRslt_assort_typ.setListListener(p);
		p.columnRslt_edi_tgt_flg.addAllListener(p);
		p.columnRslt_dlv_inst_rcpt_no.addAllListener(p);
		p.columnRslt_dlv_inst_rcpt_no.setListListener(p);
		p.columnRslt_slo_dt.addAllListener(p);
		p.columnRslt_slo_dt.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
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
	protected static void mcInitBtn(MSBDP_DlvInstListReg p) {
		p.Btn_open_MSBDP0120.addAllListener(p);
		p.Btn_open_MSBDP0120.setAPMethodName("doBtn_open_MSBDP0120");
		p.Btn_open_MSBDP0250.addAllListener(p);
		p.Btn_open_MSBDP0250.setAPMethodName("doBtn_open_MSBDP0250");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_dlv_inst_print_select_all.addAllListener(p);
		p.Btn_dlv_inst_print_select_all.setAPMethodName("doBtn_dlv_inst_print_select_all");
		p.Btn_dlv_inst_print_deselect_all.addAllListener(p);
		p.Btn_dlv_inst_print_deselect_all.setAPMethodName("doBtn_dlv_inst_print_deselect_all");
		p.Btn_dlv_slip_print_select_all.addAllListener(p);
		p.Btn_dlv_slip_print_select_all.setAPMethodName("doBtn_dlv_slip_print_select_all");
		p.Btn_dlv_slip_print_deselect_all.addAllListener(p);
		p.Btn_dlv_slip_print_deselect_all.setAPMethodName("doBtn_dlv_slip_print_deselect_all");
		p.Btn_purc_ddlv_dlv_slip_print_select_all.addAllListener(p);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.setAPMethodName("doBtn_purc_ddlv_dlv_slip_print_select_all");
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.addAllListener(p);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.setAPMethodName("doBtn_purc_ddlv_dlv_slip_print_deselect_all");
		p.Btn_edi_dlv_inst_select_all.addAllListener(p);
		p.Btn_edi_dlv_inst_select_all.setAPMethodName("doBtn_edi_dlv_inst_select_all");
		p.Btn_edi_dlv_inst_deselect_all.addAllListener(p);
		p.Btn_edi_dlv_inst_deselect_all.setAPMethodName("doBtn_edi_dlv_inst_deselect_all");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 *  [EastBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn1(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [EastBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn2(MSBDP_DlvInstListReg p) {
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_DlvInstListReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitINS_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitINS_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitINS_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_sts_typ.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_incl_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_dlv_inst_print_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_purc_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_sync_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_in_to_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_in_to_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnRslt_outsrc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_purc_act_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dlv_inst_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.ENABLE);
		p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.ENABLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_dlv_slip_print_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_edi_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dlv_inst_print_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_purc_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sync_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_in_to_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_in_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnRslt_outsrc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_purc_act_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dlv_inst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.ENABLE);
		p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.ENABLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dlv_slip_print_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_sts_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_outsrc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_print_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_dlv_slip_print_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_edi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_sts_typ.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_d_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_I, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_outsrc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dtl_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_outsrc_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_print_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_print_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_outsrc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_print_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_print_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_TOP(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Edi(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[DlvInstPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvInstPrnt(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBDP_DlvInstListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_dlv_inst_prnt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_prnt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_po_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_po_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_po_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_grp_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_d_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_inst_print_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_inst_print_d_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_slip_d_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd3(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBDP_DlvInstListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBDP_DlvInstListReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBDP_DlvInstListReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_po_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_arr_pr_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_po_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_trd_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_src_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_src_trd_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_arr_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_hm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_printed_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_grp_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_to_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_to_str_ln_tgt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_outsrc_sppl_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_wg_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_in_to_loc_cal_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_rcpt_iv_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_act_abort_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_act_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_purc_abort_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_accpt_dfct_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_purc_schd_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dtl_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_print_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_inst_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnRslt_tdlv_req_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_print_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_dlv_slip_print_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_crnt_edi_dlv_inst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_printed_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_prms_dlv_tm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_edi_tgt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dlv_inst_rcpt_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slo_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_bp_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBDP_DlvInstListReg p){
		p.Btn_open_MSBDP0120.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_dlv_inst_print_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_dlv_inst_print_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_dlv_slip_print_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_dlv_slip_print_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_purc_ddlv_dlv_slip_print_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_edi_dlv_inst_select_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_edi_dlv_inst_deselect_all.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

	}

	/**
	 * [PRNT]ステータスの[EastBtn1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn1(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[EastBtn2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn2(MSBDP_DlvInstListReg p){

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBDP_DlvInstListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBDP_DlvInstListReg_MC.setTableConfigRslt((MSBDP_DlvInstListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBDP_DlvInstListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_purc_schd_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_no);
		p.columnRslt_arr_schd_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.arr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_no);
		p.columnRslt_arr_pr_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.arr_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_pr_no);
		p.columnRslt_purc_sts_typ.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_sts_typ);
		p.columnRslt_purc_sts_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_sts_typ_nm);
		p.columnRslt_po_dt.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.po_dt_META);
		p.columnRslt_po_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_po_dt);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_src_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.src_trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_trd_unit_cd);
		p.columnRslt_src_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.src_trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_src_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.src_trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_trd_unit_dec_place);
		p.columnRslt_src_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.src_trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_trd_unit_rnd_typ);
		p.columnRslt_arr_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.arr_schd_dt_META);
		p.columnRslt_arr_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_dt);
		p.columnRslt_arr_schd_hm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.arr_schd_hm_META);
		p.columnRslt_arr_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_hm);
		p.columnRslt_dlv_inst_dt.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_dt_META);
		p.columnRslt_dlv_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_dt);
		p.columnRslt_dlv_inst_print_dt.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_print_dt_META);
		p.columnRslt_dlv_inst_print_dt.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_print_dt);
		p.columnRslt_dlv_inst_print_rmrks.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_print_rmrks);
		p.columnRslt_dlv_inst_printed_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_printed_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_printed_flg);
		p.columnRslt_dlv_inst_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_no);
		p.columnRslt_dlv_inst_rev.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_rev);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_dlv_inst_grp_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_grp_no);
		p.RsltTable.addTable(p.Rslt_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.columnRslt_purc_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_schd_dt_META);
		p.columnRslt_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_dt);
		p.columnRslt_sync_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.sync_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sync_flg);
		p.columnRslt_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.in_to_loc_cd_META);
		p.columnRslt_in_to_loc_cd.addLinkBeans(p.columnRslt_in_to_loc_nm,p.columnRslt_in_to_str_ln_tgt_flg,p.columnRslt_in_to_loc_wg_cd,p.columnRslt_site_cd,p.columnRslt_in_to_loc_cal_cd,p.columnRslt_outsrc_sppl_cd,p.columnRslt_in_to_str_ln_cd,p.columnRslt_in_to_str_ln_cd_none_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_loc_cd);
		p.columnRslt_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.in_to_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_loc_nm);
		p.columnRslt_in_to_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.in_to_str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.columnRslt_outsrc_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.outsrc_sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_outsrc_sppl_cd);
		p.columnRslt_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.in_to_loc_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_loc_wg_cd);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_in_to_loc_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.in_to_loc_cal_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_loc_cal_cd);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.trd_unit_cd_META);
		p.columnRslt_trd_unit_cd.addLinkBeans(p.columnRslt_trd_unit_nm,p.columnRslt_trd_unit_dec_place,p.columnRslt_trd_unit_rnd_typ,p.columnRslt_trd_unit_conv_base_qty,p.columnRslt_trd_unit_conv_qty);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_rcpt_iv_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_arr_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_arr_act_abort_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_purc_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_purc_abort_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_accpt_dfct_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_purc_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.mfg_inst_no_META);
		p.columnRslt_mfg_inst_no.addLinkBeans(p.columnRslt_dlv_rqst_dt,p.columnRslt_dlv_rqst_hm);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_d_no);
		p.columnRslt_dtl_can_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dtl_can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_can_flg);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_dlv_inst_print_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_print_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_print_d_rmrks);
		p.columnRslt_dtl_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dtl_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_intr_rmrks);
		p.columnRslt_dlv_slip_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_d_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.sub_char2_META);
		p.columnRslt_sub_char2.addLinkBeans(p.columnRslt_trd_unit_nm,p.columnRslt_trd_unit_dec_place,p.columnRslt_trd_unit_rnd_typ,p.columnRslt_trd_unit_conv_base_qty,p.columnRslt_trd_unit_conv_qty);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_dtl_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dtl_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char1);
		p.columnRslt_dtl_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dtl_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char2);
		p.columnRslt_dtl_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dtl_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char3);
		p.columnRslt_dlv_inst_d_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_d_no);
		p.RsltTable.addTable(p.Rslt_dlv_p_PPanel.DlvTable);
		p.Rslt_dlv_p_PPanel.columnDlv_bp_cd.setLinkBeans(p.columnRslt_dlv_nm, p.columnRslt_dlv_sundry_flg, p.columnRslt_pri_prnt_flg, p.columnRslt_dlv_zip_cd, p.columnRslt_dlv_addr1, p.columnRslt_dlv_addr2, p.columnRslt_dlv_addr3, p.columnRslt_dlv_addr4, p.columnRslt_dlv_cntry_cd, p.columnRslt_dlv_cntry_nm, p.columnRslt_dlv_tel, p.columnRslt_dlv_fax, p.columnRslt_dlv_cntct_dpt, p.columnRslt_dlv_cntct_psn, p.columnRslt_dlv_lg_grp_cd, p.columnRslt_tdlv_req_flg);
		p.columnRslt_tdlv_req_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.tdlv_req_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tdlv_req_flg);
		p.RsltTable.addTable(p.Rslt_tdlv_p_PPanel.DlvTable);
		p.Rslt_tdlv_p_PPanel.columnDlv_bp_cd.setLinkBeans(p.columnRslt_tdlv_nm, p.columnRslt_tdlv_sundry_flg, p.columnRslt_tdlv_cntct_dpt, p.columnRslt_tdlv_cntct_psn, p.columnRslt_tdlv_zip_cd, p.columnRslt_tdlv_addr1, p.columnRslt_tdlv_addr2, p.columnRslt_tdlv_addr3, p.columnRslt_tdlv_addr4, p.columnRslt_tdlv_tel, p.columnRslt_tdlv_fax, p.columnRslt_tdlv_lg_grp_cd, p.columnRslt_tdlv_cntry_cd, p.columnRslt_tdlv_cntry_nm);
		p.columnRslt_dlv_inst_print_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_print_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_print_flg);
		p.columnRslt_dlv_slip_print_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_print_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_print_flg);
		p.columnRslt_purc_ddlv_dlv_slip_print_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_ddlv_dlv_slip_print_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_print_flg);
		p.columnRslt_crnt_edi_dlv_inst_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.crnt_edi_dlv_inst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_crnt_edi_dlv_inst_flg);
		p.columnRslt_edi_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.edi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_flg);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_dlv_slip_seq.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_seq);
		p.columnRslt_dlv_slip_rev.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_rev);
		p.columnRslt_dlv_slip_d_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_d_no);
		p.columnRslt_dlv_slip_printed_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_slip_printed_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_printed_flg);
		p.columnRslt_purc_ddlv_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_ddlv_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_no);
		p.columnRslt_purc_ddlv_dlv_slip_rev.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_ddlv_dlv_slip_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_rev);
		p.columnRslt_purc_ddlv_dlv_slip_printed_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_ddlv_dlv_slip_printed_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_printed_flg);
		p.columnRslt_purc_ddlv_dlv_slip_d_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.purc_ddlv_dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_dlv_slip_d_no);
		p.RsltTable.addTable(p.Rslt_prms_dlv_tm_p_PPanel.YmdHmTable);
		p.columnRslt_assort_typ.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.assort_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_assort_typ);
		p.columnRslt_edi_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.edi_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_tgt_flg);
		p.columnRslt_dlv_inst_rcpt_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.dlv_inst_rcpt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_inst_rcpt_no);
		p.columnRslt_slo_dt.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.slo_dt_META);
		p.columnRslt_slo_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_dt);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.RsltTable.addTable(p.Rslt_bp_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0230.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_purc_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_sts_typ.getListConfig().setPutter(getCnd_purc_sts_typ_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_in_to_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_loc_cd.getListConfig().setPutter(getCnd_in_to_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		columnRslt_in_to_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_in_to_loc_cd.getListConfig().setPutter(getRslt_in_to_loc_cd_ListPutter());
		columnRslt_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_unit_cd.getListConfig().setPutter(getRslt_trd_unit_cd_ListPutter());
		columnRslt_mfg_inst_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mfg_inst_no.getListConfig().setPutter(getRslt_mfg_inst_no_ListPutter());
		Rslt_dlv_p_PPanel.columnDlv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dlv_p_PPanel.columnDlv_bp_cd.getListConfig().setPutter(getRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter());
		Rslt_tdlv_p_PPanel.columnDlv_bp_cd.getListConfig().setPutter(getRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter());
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
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
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
	}

	/**
	 * [Cnd_purc_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PurcStsTyp");
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
	 * [Cnd_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
	 * [Rslt_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * [Rslt_mfg_inst_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_inst_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.MfgInstNo");
		return lp;
	}
	 
	/**
	 * [Rslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}

	/**
	 * [Rslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_purc_sts_typ) return getCnd_purc_sts_typ(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_in_to_loc_cd) return getCnd_in_to_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == columnRslt_in_to_loc_cd) return getRslt_in_to_loc_cd(row, info);
		if(combo == columnRslt_trd_unit_cd) return getRslt_trd_unit_cd(row, info);
		if(combo == columnRslt_mfg_inst_no) return getRslt_mfg_inst_no(row, info);
		if(combo == Rslt_dlv_p_PPanel.columnDlv_bp_cd) return getRslt_dlv_p_PPanel_columnDlv_bp_cd(row, info);
		if(combo == Rslt_tdlv_p_PPanel.columnDlv_bp_cd) return getRslt_tdlv_p_PPanel_columnDlv_bp_cd(row, info);
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
		else if (ap == Btn_open_MSBDP0120) doBtn_open_MSBDP0120(info);
		else if (ap == Btn_open_MSBDP0250) doBtn_open_MSBDP0250(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_dlv_inst_print_select_all) doBtn_dlv_inst_print_select_all(info);
		else if (ap == Btn_dlv_inst_print_deselect_all) doBtn_dlv_inst_print_deselect_all(info);
		else if (ap == Btn_dlv_slip_print_select_all) doBtn_dlv_slip_print_select_all(info);
		else if (ap == Btn_dlv_slip_print_deselect_all) doBtn_dlv_slip_print_deselect_all(info);
		else if (ap == Btn_purc_ddlv_dlv_slip_print_select_all) doBtn_purc_ddlv_dlv_slip_print_select_all(info);
		else if (ap == Btn_purc_ddlv_dlv_slip_print_deselect_all) doBtn_purc_ddlv_dlv_slip_print_deselect_all(info);
		else if (ap == Btn_edi_dlv_inst_select_all) doBtn_edi_dlv_inst_select_all(info);
		else if (ap == Btn_edi_dlv_inst_deselect_all) doBtn_edi_dlv_inst_deselect_all(info);
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
	 * [Btn]パネルの[open_MSBDP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0250(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[dlv_inst_print_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dlv_inst_print_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[dlv_inst_print_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dlv_inst_print_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[dlv_slip_print_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dlv_slip_print_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[dlv_slip_print_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dlv_slip_print_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[purc_ddlv_dlv_slip_print_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_purc_ddlv_dlv_slip_print_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[purc_ddlv_dlv_slip_print_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_purc_ddlv_dlv_slip_print_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[edi_dlv_inst_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_edi_dlv_inst_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[edi_dlv_inst_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_edi_dlv_inst_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_not_dlv_inst_prnt_flg) return doCnd_not_dlv_inst_prnt_flg_VC(info);
		if (vc == Cnd_dlv_inst_prnt_flg) return doCnd_dlv_inst_prnt_flg_VC(info);
		if (vc == Cnd_po_dt_fr) return doCnd_po_dt_fr_VC(info);
		if (vc == Cnd_po_dt_to) return doCnd_po_dt_to_VC(info);
		if (vc == Cnd_dlv_inst_dt_fr) return doCnd_dlv_inst_dt_fr_VC(info);
		if (vc == Cnd_dlv_inst_dt_to) return doCnd_dlv_inst_dt_to_VC(info);
		if (vc == Cnd_purc_sts_typ) return doCnd_purc_sts_typ_VC(info);
		if (vc == Cnd_purc_sts_typ_nm) return doCnd_purc_sts_typ_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_in_to_loc_cd) return doCnd_in_to_loc_cd_VC(info);
		if (vc == Cnd_in_to_loc_nm) return doCnd_in_to_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_dlv_inst_grp_no) return doCnd_dlv_inst_grp_no_VC(info);
		if (vc == Cnd_dlv_inst_no) return doCnd_dlv_inst_no_VC(info);
		if (vc == Cnd_dlv_inst_d_no) return doCnd_dlv_inst_d_no_VC(info);
		if (vc == Cnd_dlv_inst_rcpt_flg) return doCnd_dlv_inst_rcpt_flg_VC(info);
		if (vc == Cnd_dlv_inst_print_rmrks) return doCnd_dlv_inst_print_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_dlv_inst_print_d_rmrks) return doCnd_dlv_inst_print_d_rmrks_VC(info);
		if (vc == Cnd_dtl_intr_rmrks) return doCnd_dtl_intr_rmrks_VC(info);
		if (vc == Cnd_dlv_slip_d_rmrks) return doCnd_dlv_slip_d_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dtl_sub_char1) return doCnd_dtl_sub_char1_VC(info);
		if (vc == Cnd_dtl_sub_char2) return doCnd_dtl_sub_char2_VC(info);
		if (vc == Cnd_dtl_sub_char3) return doCnd_dtl_sub_char3_VC(info);
		if (vc == Cnd_incl_can_flg) return doCnd_incl_can_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_purc_schd_no) return doRslt_purc_schd_no_VC(info);
		if (vc == columnRslt_arr_schd_no) return doRslt_arr_schd_no_VC(info);
		if (vc == columnRslt_arr_pr_no) return doRslt_arr_pr_no_VC(info);
		if (vc == columnRslt_purc_sts_typ) return doRslt_purc_sts_typ_VC(info);
		if (vc == columnRslt_purc_sts_typ_nm) return doRslt_purc_sts_typ_nm_VC(info);
		if (vc == columnRslt_po_dt) return doRslt_po_dt_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_src_trd_unit_cd) return doRslt_src_trd_unit_cd_VC(info);
		if (vc == columnRslt_src_trd_unit_nm) return doRslt_src_trd_unit_nm_VC(info);
		if (vc == columnRslt_src_trd_unit_dec_place) return doRslt_src_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_src_trd_unit_rnd_typ) return doRslt_src_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_arr_schd_dt) return doRslt_arr_schd_dt_VC(info);
		if (vc == columnRslt_arr_schd_hm) return doRslt_arr_schd_hm_VC(info);
		if (vc == columnRslt_dlv_inst_dt) return doRslt_dlv_inst_dt_VC(info);
		if (vc == columnRslt_dlv_inst_print_dt) return doRslt_dlv_inst_print_dt_VC(info);
		if (vc == columnRslt_dlv_inst_print_rmrks) return doRslt_dlv_inst_print_rmrks_VC(info);
		if (vc == columnRslt_dlv_inst_printed_flg) return doRslt_dlv_inst_printed_flg_VC(info);
		if (vc == columnRslt_dlv_inst_no) return doRslt_dlv_inst_no_VC(info);
		if (vc == columnRslt_dlv_inst_rev) return doRslt_dlv_inst_rev_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_dlv_inst_grp_no) return doRslt_dlv_inst_grp_no_VC(info);
		if (vc == columnRslt_purc_schd_dt) return doRslt_purc_schd_dt_VC(info);
		if (vc == columnRslt_sync_flg) return doRslt_sync_flg_VC(info);
		if (vc == columnRslt_in_to_loc_cd) return doRslt_in_to_loc_cd_VC(info);
		if (vc == columnRslt_in_to_loc_nm) return doRslt_in_to_loc_nm_VC(info);
		if (vc == columnRslt_in_to_str_ln_tgt_flg) return doRslt_in_to_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_outsrc_sppl_cd) return doRslt_outsrc_sppl_cd_VC(info);
		if (vc == columnRslt_in_to_loc_wg_cd) return doRslt_in_to_loc_wg_cd_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_in_to_loc_cal_cd) return doRslt_in_to_loc_cal_cd_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_purc_act_d_no) return doRslt_purc_act_d_no_VC(info);
		if (vc == columnRslt_dtl_can_flg) return doRslt_dtl_can_flg_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_dlv_inst_print_d_rmrks) return doRslt_dlv_inst_print_d_rmrks_VC(info);
		if (vc == columnRslt_dtl_intr_rmrks) return doRslt_dtl_intr_rmrks_VC(info);
		if (vc == columnRslt_dlv_slip_d_rmrks) return doRslt_dlv_slip_d_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_dtl_sub_char1) return doRslt_dtl_sub_char1_VC(info);
		if (vc == columnRslt_dtl_sub_char2) return doRslt_dtl_sub_char2_VC(info);
		if (vc == columnRslt_dtl_sub_char3) return doRslt_dtl_sub_char3_VC(info);
		if (vc == columnRslt_dlv_inst_d_no) return doRslt_dlv_inst_d_no_VC(info);
		if (vc == columnRslt_tdlv_req_flg) return doRslt_tdlv_req_flg_VC(info);
		if (vc == columnRslt_dlv_inst_print_flg) return doRslt_dlv_inst_print_flg_VC(info);
		if (vc == columnRslt_dlv_slip_print_flg) return doRslt_dlv_slip_print_flg_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_print_flg) return doRslt_purc_ddlv_dlv_slip_print_flg_VC(info);
		if (vc == columnRslt_crnt_edi_dlv_inst_flg) return doRslt_crnt_edi_dlv_inst_flg_VC(info);
		if (vc == columnRslt_edi_flg) return doRslt_edi_flg_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_dlv_slip_seq) return doRslt_dlv_slip_seq_VC(info);
		if (vc == columnRslt_dlv_slip_rev) return doRslt_dlv_slip_rev_VC(info);
		if (vc == columnRslt_dlv_slip_d_no) return doRslt_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_dlv_slip_printed_flg) return doRslt_dlv_slip_printed_flg_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_no) return doRslt_purc_ddlv_dlv_slip_no_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_rev) return doRslt_purc_ddlv_dlv_slip_rev_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_printed_flg) return doRslt_purc_ddlv_dlv_slip_printed_flg_VC(info);
		if (vc == columnRslt_purc_ddlv_dlv_slip_d_no) return doRslt_purc_ddlv_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_assort_typ) return doRslt_assort_typ_VC(info);
		if (vc == columnRslt_edi_tgt_flg) return doRslt_edi_tgt_flg_VC(info);
		if (vc == columnRslt_dlv_inst_rcpt_no) return doRslt_dlv_inst_rcpt_no_VC(info);
		if (vc == columnRslt_slo_dt) return doRslt_slo_dt_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
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
	 * [Cnd]パネルの[not_dlv_inst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_dlv_inst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_inst_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_rcpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_print_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_inst_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_print_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_slip_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[src_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_print_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_printed_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_printed_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[outsrc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_outsrc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_loc_cal_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dtl_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_can_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_print_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tdlv_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tdlv_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_inst_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ddlv_dlv_slip_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[crnt_edi_dlv_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_crnt_edi_dlv_inst_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_printed_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_printed_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ddlv_dlv_slip_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_printed_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ddlv_dlv_slip_printed_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[assort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_assort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_tgt_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_not_dlv_inst_prnt_flg) doCnd_not_dlv_inst_prnt_flg_NC(info);
		else if (nc == Cnd_dlv_inst_prnt_flg) doCnd_dlv_inst_prnt_flg_NC(info);
		else if (nc == Cnd_po_dt_fr) doCnd_po_dt_fr_NC(info);
		else if (nc == Cnd_po_dt_to) doCnd_po_dt_to_NC(info);
		else if (nc == Cnd_dlv_inst_dt_fr) doCnd_dlv_inst_dt_fr_NC(info);
		else if (nc == Cnd_dlv_inst_dt_to) doCnd_dlv_inst_dt_to_NC(info);
		else if (nc == Cnd_purc_sts_typ) doCnd_purc_sts_typ_NC(info);
		else if (nc == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_NC(info);
		else if (nc == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_dlv_inst_grp_no) doCnd_dlv_inst_grp_no_NC(info);
		else if (nc == Cnd_dlv_inst_no) doCnd_dlv_inst_no_NC(info);
		else if (nc == Cnd_dlv_inst_d_no) doCnd_dlv_inst_d_no_NC(info);
		else if (nc == Cnd_dlv_inst_rcpt_flg) doCnd_dlv_inst_rcpt_flg_NC(info);
		else if (nc == Cnd_dlv_inst_print_rmrks) doCnd_dlv_inst_print_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_dlv_inst_print_d_rmrks) doCnd_dlv_inst_print_d_rmrks_NC(info);
		else if (nc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NC(info);
		else if (nc == Cnd_dlv_slip_d_rmrks) doCnd_dlv_slip_d_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NC(info);
		else if (nc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NC(info);
		else if (nc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NC(info);
		else if (nc == Cnd_incl_can_flg) doCnd_incl_can_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_purc_schd_no) doRslt_purc_schd_no_NC(info);
		else if (nc == columnRslt_arr_schd_no) doRslt_arr_schd_no_NC(info);
		else if (nc == columnRslt_arr_pr_no) doRslt_arr_pr_no_NC(info);
		else if (nc == columnRslt_purc_sts_typ) doRslt_purc_sts_typ_NC(info);
		else if (nc == columnRslt_purc_sts_typ_nm) doRslt_purc_sts_typ_nm_NC(info);
		else if (nc == columnRslt_po_dt) doRslt_po_dt_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_src_trd_unit_cd) doRslt_src_trd_unit_cd_NC(info);
		else if (nc == columnRslt_src_trd_unit_nm) doRslt_src_trd_unit_nm_NC(info);
		else if (nc == columnRslt_src_trd_unit_dec_place) doRslt_src_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_src_trd_unit_rnd_typ) doRslt_src_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_NC(info);
		else if (nc == columnRslt_arr_schd_hm) doRslt_arr_schd_hm_NC(info);
		else if (nc == columnRslt_dlv_inst_dt) doRslt_dlv_inst_dt_NC(info);
		else if (nc == columnRslt_dlv_inst_print_dt) doRslt_dlv_inst_print_dt_NC(info);
		else if (nc == columnRslt_dlv_inst_print_rmrks) doRslt_dlv_inst_print_rmrks_NC(info);
		else if (nc == columnRslt_dlv_inst_printed_flg) doRslt_dlv_inst_printed_flg_NC(info);
		else if (nc == columnRslt_dlv_inst_no) doRslt_dlv_inst_no_NC(info);
		else if (nc == columnRslt_dlv_inst_rev) doRslt_dlv_inst_rev_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_dlv_inst_grp_no) doRslt_dlv_inst_grp_no_NC(info);
		else if (nc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NC(info);
		else if (nc == columnRslt_sync_flg) doRslt_sync_flg_NC(info);
		else if (nc == columnRslt_in_to_loc_cd) doRslt_in_to_loc_cd_NC(info);
		else if (nc == columnRslt_in_to_loc_nm) doRslt_in_to_loc_nm_NC(info);
		else if (nc == columnRslt_in_to_str_ln_tgt_flg) doRslt_in_to_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_outsrc_sppl_cd) doRslt_outsrc_sppl_cd_NC(info);
		else if (nc == columnRslt_in_to_loc_wg_cd) doRslt_in_to_loc_wg_cd_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_in_to_loc_cal_cd) doRslt_in_to_loc_cal_cd_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NC(info);
		else if (nc == columnRslt_dtl_can_flg) doRslt_dtl_can_flg_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_dlv_inst_print_d_rmrks) doRslt_dlv_inst_print_d_rmrks_NC(info);
		else if (nc == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NC(info);
		else if (nc == columnRslt_dlv_slip_d_rmrks) doRslt_dlv_slip_d_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NC(info);
		else if (nc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NC(info);
		else if (nc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NC(info);
		else if (nc == columnRslt_dlv_inst_d_no) doRslt_dlv_inst_d_no_NC(info);
		else if (nc == columnRslt_tdlv_req_flg) doRslt_tdlv_req_flg_NC(info);
		else if (nc == columnRslt_dlv_inst_print_flg) doRslt_dlv_inst_print_flg_NC(info);
		else if (nc == columnRslt_dlv_slip_print_flg) doRslt_dlv_slip_print_flg_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_print_flg) doRslt_purc_ddlv_dlv_slip_print_flg_NC(info);
		else if (nc == columnRslt_crnt_edi_dlv_inst_flg) doRslt_crnt_edi_dlv_inst_flg_NC(info);
		else if (nc == columnRslt_edi_flg) doRslt_edi_flg_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NC(info);
		else if (nc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NC(info);
		else if (nc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_dlv_slip_printed_flg) doRslt_dlv_slip_printed_flg_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_rev) doRslt_purc_ddlv_dlv_slip_rev_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_printed_flg) doRslt_purc_ddlv_dlv_slip_printed_flg_NC(info);
		else if (nc == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_assort_typ) doRslt_assort_typ_NC(info);
		else if (nc == columnRslt_edi_tgt_flg) doRslt_edi_tgt_flg_NC(info);
		else if (nc == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_NC(info);
		else if (nc == columnRslt_slo_dt) doRslt_slo_dt_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
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
	 * [Cnd]パネルの[not_dlv_inst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_dlv_inst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_inst_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[src_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_printed_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_printed_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cal_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crnt_edi_dlv_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crnt_edi_dlv_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_printed_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_printed_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_printed_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_printed_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_not_dlv_inst_prnt_flg) doCnd_not_dlv_inst_prnt_flg_NE(info);
		else if (ne == Cnd_dlv_inst_prnt_flg) doCnd_dlv_inst_prnt_flg_NE(info);
		else if (ne == Cnd_po_dt_fr) doCnd_po_dt_fr_NE(info);
		else if (ne == Cnd_po_dt_to) doCnd_po_dt_to_NE(info);
		else if (ne == Cnd_dlv_inst_dt_fr) doCnd_dlv_inst_dt_fr_NE(info);
		else if (ne == Cnd_dlv_inst_dt_to) doCnd_dlv_inst_dt_to_NE(info);
		else if (ne == Cnd_purc_sts_typ) doCnd_purc_sts_typ_NE(info);
		else if (ne == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_NE(info);
		else if (ne == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_dlv_inst_grp_no) doCnd_dlv_inst_grp_no_NE(info);
		else if (ne == Cnd_dlv_inst_no) doCnd_dlv_inst_no_NE(info);
		else if (ne == Cnd_dlv_inst_d_no) doCnd_dlv_inst_d_no_NE(info);
		else if (ne == Cnd_dlv_inst_rcpt_flg) doCnd_dlv_inst_rcpt_flg_NE(info);
		else if (ne == Cnd_dlv_inst_print_rmrks) doCnd_dlv_inst_print_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_dlv_inst_print_d_rmrks) doCnd_dlv_inst_print_d_rmrks_NE(info);
		else if (ne == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NE(info);
		else if (ne == Cnd_dlv_slip_d_rmrks) doCnd_dlv_slip_d_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NE(info);
		else if (ne == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NE(info);
		else if (ne == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NE(info);
		else if (ne == Cnd_incl_can_flg) doCnd_incl_can_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_purc_schd_no) doRslt_purc_schd_no_NE(info);
		else if (ne == columnRslt_arr_schd_no) doRslt_arr_schd_no_NE(info);
		else if (ne == columnRslt_arr_pr_no) doRslt_arr_pr_no_NE(info);
		else if (ne == columnRslt_purc_sts_typ) doRslt_purc_sts_typ_NE(info);
		else if (ne == columnRslt_purc_sts_typ_nm) doRslt_purc_sts_typ_nm_NE(info);
		else if (ne == columnRslt_po_dt) doRslt_po_dt_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_src_trd_unit_cd) doRslt_src_trd_unit_cd_NE(info);
		else if (ne == columnRslt_src_trd_unit_nm) doRslt_src_trd_unit_nm_NE(info);
		else if (ne == columnRslt_src_trd_unit_dec_place) doRslt_src_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_src_trd_unit_rnd_typ) doRslt_src_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_NE(info);
		else if (ne == columnRslt_arr_schd_hm) doRslt_arr_schd_hm_NE(info);
		else if (ne == columnRslt_dlv_inst_dt) doRslt_dlv_inst_dt_NE(info);
		else if (ne == columnRslt_dlv_inst_print_dt) doRslt_dlv_inst_print_dt_NE(info);
		else if (ne == columnRslt_dlv_inst_print_rmrks) doRslt_dlv_inst_print_rmrks_NE(info);
		else if (ne == columnRslt_dlv_inst_printed_flg) doRslt_dlv_inst_printed_flg_NE(info);
		else if (ne == columnRslt_dlv_inst_no) doRslt_dlv_inst_no_NE(info);
		else if (ne == columnRslt_dlv_inst_rev) doRslt_dlv_inst_rev_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_dlv_inst_grp_no) doRslt_dlv_inst_grp_no_NE(info);
		else if (ne == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NE(info);
		else if (ne == columnRslt_sync_flg) doRslt_sync_flg_NE(info);
		else if (ne == columnRslt_in_to_loc_cd) doRslt_in_to_loc_cd_NE(info);
		else if (ne == columnRslt_in_to_loc_nm) doRslt_in_to_loc_nm_NE(info);
		else if (ne == columnRslt_in_to_str_ln_tgt_flg) doRslt_in_to_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_outsrc_sppl_cd) doRslt_outsrc_sppl_cd_NE(info);
		else if (ne == columnRslt_in_to_loc_wg_cd) doRslt_in_to_loc_wg_cd_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_in_to_loc_cal_cd) doRslt_in_to_loc_cal_cd_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NE(info);
		else if (ne == columnRslt_dtl_can_flg) doRslt_dtl_can_flg_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_dlv_inst_print_d_rmrks) doRslt_dlv_inst_print_d_rmrks_NE(info);
		else if (ne == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NE(info);
		else if (ne == columnRslt_dlv_slip_d_rmrks) doRslt_dlv_slip_d_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NE(info);
		else if (ne == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NE(info);
		else if (ne == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NE(info);
		else if (ne == columnRslt_dlv_inst_d_no) doRslt_dlv_inst_d_no_NE(info);
		else if (ne == columnRslt_tdlv_req_flg) doRslt_tdlv_req_flg_NE(info);
		else if (ne == columnRslt_dlv_inst_print_flg) doRslt_dlv_inst_print_flg_NE(info);
		else if (ne == columnRslt_dlv_slip_print_flg) doRslt_dlv_slip_print_flg_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_print_flg) doRslt_purc_ddlv_dlv_slip_print_flg_NE(info);
		else if (ne == columnRslt_crnt_edi_dlv_inst_flg) doRslt_crnt_edi_dlv_inst_flg_NE(info);
		else if (ne == columnRslt_edi_flg) doRslt_edi_flg_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NE(info);
		else if (ne == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NE(info);
		else if (ne == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_dlv_slip_printed_flg) doRslt_dlv_slip_printed_flg_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_rev) doRslt_purc_ddlv_dlv_slip_rev_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_printed_flg) doRslt_purc_ddlv_dlv_slip_printed_flg_NE(info);
		else if (ne == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_assort_typ) doRslt_assort_typ_NE(info);
		else if (ne == columnRslt_edi_tgt_flg) doRslt_edi_tgt_flg_NE(info);
		else if (ne == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_NE(info);
		else if (ne == columnRslt_slo_dt) doRslt_slo_dt_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
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
	 * [Cnd]パネルの[not_dlv_inst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_dlv_inst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_inst_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[src_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_printed_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_printed_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cal_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crnt_edi_dlv_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crnt_edi_dlv_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_printed_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_printed_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_printed_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_printed_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_not_dlv_inst_prnt_flg) doCnd_not_dlv_inst_prnt_flg_NX(info);
		else if (nx == Cnd_dlv_inst_prnt_flg) doCnd_dlv_inst_prnt_flg_NX(info);
		else if (nx == Cnd_po_dt_fr) doCnd_po_dt_fr_NX(info);
		else if (nx == Cnd_po_dt_to) doCnd_po_dt_to_NX(info);
		else if (nx == Cnd_dlv_inst_dt_fr) doCnd_dlv_inst_dt_fr_NX(info);
		else if (nx == Cnd_dlv_inst_dt_to) doCnd_dlv_inst_dt_to_NX(info);
		else if (nx == Cnd_purc_sts_typ) doCnd_purc_sts_typ_NX(info);
		else if (nx == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_NX(info);
		else if (nx == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_dlv_inst_grp_no) doCnd_dlv_inst_grp_no_NX(info);
		else if (nx == Cnd_dlv_inst_no) doCnd_dlv_inst_no_NX(info);
		else if (nx == Cnd_dlv_inst_d_no) doCnd_dlv_inst_d_no_NX(info);
		else if (nx == Cnd_dlv_inst_rcpt_flg) doCnd_dlv_inst_rcpt_flg_NX(info);
		else if (nx == Cnd_dlv_inst_print_rmrks) doCnd_dlv_inst_print_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_dlv_inst_print_d_rmrks) doCnd_dlv_inst_print_d_rmrks_NX(info);
		else if (nx == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NX(info);
		else if (nx == Cnd_dlv_slip_d_rmrks) doCnd_dlv_slip_d_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NX(info);
		else if (nx == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NX(info);
		else if (nx == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NX(info);
		else if (nx == Cnd_incl_can_flg) doCnd_incl_can_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_purc_schd_no) doRslt_purc_schd_no_NX(info);
		else if (nx == columnRslt_arr_schd_no) doRslt_arr_schd_no_NX(info);
		else if (nx == columnRslt_arr_pr_no) doRslt_arr_pr_no_NX(info);
		else if (nx == columnRslt_purc_sts_typ) doRslt_purc_sts_typ_NX(info);
		else if (nx == columnRslt_purc_sts_typ_nm) doRslt_purc_sts_typ_nm_NX(info);
		else if (nx == columnRslt_po_dt) doRslt_po_dt_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_src_trd_unit_cd) doRslt_src_trd_unit_cd_NX(info);
		else if (nx == columnRslt_src_trd_unit_nm) doRslt_src_trd_unit_nm_NX(info);
		else if (nx == columnRslt_src_trd_unit_dec_place) doRslt_src_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_src_trd_unit_rnd_typ) doRslt_src_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_NX(info);
		else if (nx == columnRslt_arr_schd_hm) doRslt_arr_schd_hm_NX(info);
		else if (nx == columnRslt_dlv_inst_dt) doRslt_dlv_inst_dt_NX(info);
		else if (nx == columnRslt_dlv_inst_print_dt) doRslt_dlv_inst_print_dt_NX(info);
		else if (nx == columnRslt_dlv_inst_print_rmrks) doRslt_dlv_inst_print_rmrks_NX(info);
		else if (nx == columnRslt_dlv_inst_printed_flg) doRslt_dlv_inst_printed_flg_NX(info);
		else if (nx == columnRslt_dlv_inst_no) doRslt_dlv_inst_no_NX(info);
		else if (nx == columnRslt_dlv_inst_rev) doRslt_dlv_inst_rev_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_dlv_inst_grp_no) doRslt_dlv_inst_grp_no_NX(info);
		else if (nx == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NX(info);
		else if (nx == columnRslt_sync_flg) doRslt_sync_flg_NX(info);
		else if (nx == columnRslt_in_to_loc_cd) doRslt_in_to_loc_cd_NX(info);
		else if (nx == columnRslt_in_to_loc_nm) doRslt_in_to_loc_nm_NX(info);
		else if (nx == columnRslt_in_to_str_ln_tgt_flg) doRslt_in_to_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_outsrc_sppl_cd) doRslt_outsrc_sppl_cd_NX(info);
		else if (nx == columnRslt_in_to_loc_wg_cd) doRslt_in_to_loc_wg_cd_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_in_to_loc_cal_cd) doRslt_in_to_loc_cal_cd_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NX(info);
		else if (nx == columnRslt_dtl_can_flg) doRslt_dtl_can_flg_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_dlv_inst_print_d_rmrks) doRslt_dlv_inst_print_d_rmrks_NX(info);
		else if (nx == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NX(info);
		else if (nx == columnRslt_dlv_slip_d_rmrks) doRslt_dlv_slip_d_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NX(info);
		else if (nx == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NX(info);
		else if (nx == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NX(info);
		else if (nx == columnRslt_dlv_inst_d_no) doRslt_dlv_inst_d_no_NX(info);
		else if (nx == columnRslt_tdlv_req_flg) doRslt_tdlv_req_flg_NX(info);
		else if (nx == columnRslt_dlv_inst_print_flg) doRslt_dlv_inst_print_flg_NX(info);
		else if (nx == columnRslt_dlv_slip_print_flg) doRslt_dlv_slip_print_flg_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_print_flg) doRslt_purc_ddlv_dlv_slip_print_flg_NX(info);
		else if (nx == columnRslt_crnt_edi_dlv_inst_flg) doRslt_crnt_edi_dlv_inst_flg_NX(info);
		else if (nx == columnRslt_edi_flg) doRslt_edi_flg_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NX(info);
		else if (nx == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NX(info);
		else if (nx == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_dlv_slip_printed_flg) doRslt_dlv_slip_printed_flg_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_rev) doRslt_purc_ddlv_dlv_slip_rev_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_printed_flg) doRslt_purc_ddlv_dlv_slip_printed_flg_NX(info);
		else if (nx == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_assort_typ) doRslt_assort_typ_NX(info);
		else if (nx == columnRslt_edi_tgt_flg) doRslt_edi_tgt_flg_NX(info);
		else if (nx == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_NX(info);
		else if (nx == columnRslt_slo_dt) doRslt_slo_dt_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
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
	 * [Cnd]パネルの[not_dlv_inst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_dlv_inst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_inst_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[src_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_printed_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_printed_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cal_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[crnt_edi_dlv_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_crnt_edi_dlv_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_printed_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_printed_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_printed_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_printed_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_NX(MCEventInfo info){
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
		if (lc == Cnd_po_dt_fr) doCnd_po_dt_fr_LC(info);
		else if (lc == Cnd_po_dt_to) doCnd_po_dt_to_LC(info);
		else if (lc == Cnd_dlv_inst_dt_fr) doCnd_dlv_inst_dt_fr_LC(info);
		else if (lc == Cnd_dlv_inst_dt_to) doCnd_dlv_inst_dt_to_LC(info);
		else if (lc == Cnd_purc_sts_typ) doCnd_purc_sts_typ_LC(info);
		else if (lc == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_LC(info);
		else if (lc == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_dlv_inst_grp_no) doCnd_dlv_inst_grp_no_LC(info);
		else if (lc == Cnd_dlv_inst_no) doCnd_dlv_inst_no_LC(info);
		else if (lc == Cnd_dlv_inst_d_no) doCnd_dlv_inst_d_no_LC(info);
		else if (lc == Cnd_dlv_inst_print_rmrks) doCnd_dlv_inst_print_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_dlv_inst_print_d_rmrks) doCnd_dlv_inst_print_d_rmrks_LC(info);
		else if (lc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_LC(info);
		else if (lc == Cnd_dlv_slip_d_rmrks) doCnd_dlv_slip_d_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_LC(info);
		else if (lc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_LC(info);
		else if (lc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_purc_schd_no) doRslt_purc_schd_no_LC(info);
		else if (lc == columnRslt_arr_schd_no) doRslt_arr_schd_no_LC(info);
		else if (lc == columnRslt_arr_pr_no) doRslt_arr_pr_no_LC(info);
		else if (lc == columnRslt_purc_sts_typ) doRslt_purc_sts_typ_LC(info);
		else if (lc == columnRslt_purc_sts_typ_nm) doRslt_purc_sts_typ_nm_LC(info);
		else if (lc == columnRslt_po_dt) doRslt_po_dt_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_src_trd_unit_cd) doRslt_src_trd_unit_cd_LC(info);
		else if (lc == columnRslt_src_trd_unit_nm) doRslt_src_trd_unit_nm_LC(info);
		else if (lc == columnRslt_src_trd_unit_dec_place) doRslt_src_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_src_trd_unit_rnd_typ) doRslt_src_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_LC(info);
		else if (lc == columnRslt_arr_schd_hm) doRslt_arr_schd_hm_LC(info);
		else if (lc == columnRslt_dlv_inst_dt) doRslt_dlv_inst_dt_LC(info);
		else if (lc == columnRslt_dlv_inst_print_dt) doRslt_dlv_inst_print_dt_LC(info);
		else if (lc == columnRslt_dlv_inst_print_rmrks) doRslt_dlv_inst_print_rmrks_LC(info);
		else if (lc == columnRslt_dlv_inst_no) doRslt_dlv_inst_no_LC(info);
		else if (lc == columnRslt_dlv_inst_rev) doRslt_dlv_inst_rev_LC(info);
		else if (lc == columnRslt_dlv_inst_grp_no) doRslt_dlv_inst_grp_no_LC(info);
		else if (lc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_LC(info);
		else if (lc == columnRslt_in_to_loc_cd) doRslt_in_to_loc_cd_LC(info);
		else if (lc == columnRslt_in_to_loc_nm) doRslt_in_to_loc_nm_LC(info);
		else if (lc == columnRslt_outsrc_sppl_cd) doRslt_outsrc_sppl_cd_LC(info);
		else if (lc == columnRslt_in_to_loc_wg_cd) doRslt_in_to_loc_wg_cd_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_in_to_loc_cal_cd) doRslt_in_to_loc_cal_cd_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_dlv_inst_print_d_rmrks) doRslt_dlv_inst_print_d_rmrks_LC(info);
		else if (lc == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_LC(info);
		else if (lc == columnRslt_dlv_slip_d_rmrks) doRslt_dlv_slip_d_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_LC(info);
		else if (lc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_LC(info);
		else if (lc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_LC(info);
		else if (lc == columnRslt_dlv_inst_d_no) doRslt_dlv_inst_d_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_LC(info);
		else if (lc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_LC(info);
		else if (lc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_purc_ddlv_dlv_slip_no) doRslt_purc_ddlv_dlv_slip_no_LC(info);
		else if (lc == columnRslt_purc_ddlv_dlv_slip_rev) doRslt_purc_ddlv_dlv_slip_rev_LC(info);
		else if (lc == columnRslt_purc_ddlv_dlv_slip_d_no) doRslt_purc_ddlv_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_assort_typ) doRslt_assort_typ_LC(info);
		else if (lc == columnRslt_dlv_inst_rcpt_no) doRslt_dlv_inst_rcpt_no_LC(info);
		else if (lc == columnRslt_slo_dt) doRslt_slo_dt_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
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
	 * [Cnd]パネルの[po_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_inst_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[src_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_loc_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_loc_cal_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_inst_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_inst_rcpt_no_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_purc_sts_typ]の作成メソッド
	 */
	public MCList getCnd_purc_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPurcStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_loc_cd]の作成メソッド
	 */
	public MCList getCnd_in_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
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
	 * コンボ／リストのリスト[columnRslt_in_to_loc_cd]の作成メソッド
	 */
	public MCList getRslt_in_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_inst_no]の作成メソッド
	 */
	public MCList getRslt_mfg_inst_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getMfgInstNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dlv_p_PPanel_columnDlv_bp_cd]の作成メソッド
	 */
	public MCList getRslt_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_tdlv_p_PPanel_columnDlv_bp_cd]の作成メソッド
	 */
	public MCList getRslt_tdlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0230.Srch01")) {
			return new MS_MSBDL0230_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0230.Srch02")) {
			return new MS_MSBDL0230_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0230.Imp01")) {
			return new MS_MSBDL0230_Imp01Bridge();
		}
		if (id.equals("MS.MSBDL0230.Upd01")) {
			return new MS_MSBDL0230_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0230.Del01")) {
			return new MS_MSBDL0230_Del01Bridge();
		}
		if (id.equals("MS.MSBDL0230.Prnt01")) {
			return new MS_MSBDL0230_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0230_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0230_Srch01Bridge() {
			p_MS_MSBDL0230_Srch01 = new MCParam(PDef.MS_MSBDL0230_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0230_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0230.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));

			p_MS_MSBDL0230_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0230_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0230_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0230_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0230_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0230.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0230.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0230_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0230_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)p_MS_MSBDL0230_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0230_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0230_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0230_Srch02Bridge() {
			p_MS_MSBDL0230_Srch02 = new MCParam(PDef.MS_MSBDL0230_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0230_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0230.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));

			p_MS_MSBDL0230_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0230_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0230_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0230_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0230_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0230.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0230.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0230_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0230_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)p_MS_MSBDL0230_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0230_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0230_Imp01;

		/** コンストラクタ */
		protected MS_MSBDL0230_Imp01Bridge() {
			p_MS_MSBDL0230_Imp01 = new MCParam(PDef.MS_MSBDL0230_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0230_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));

			p_MS_MSBDL0230_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0230_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0230_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0230_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0230_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0230_Imp01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0230_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)p_MS_MSBDL0230_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0230_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0230_Upd01Bridge() {
			p_MS_MSBDL0230_Upd01 = new MCParam(PDef.MS_MSBDL0230_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0230_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0230.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));

			p_MS_MSBDL0230_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0230_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0230_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0230_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0230_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0230_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0230.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0230.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0230_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0230_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)p_MS_MSBDL0230_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0230_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0230_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0230_Del01Bridge() {
			p_MS_MSBDL0230_Del01 = new MCParam(PDef.MS_MSBDL0230_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0230_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0230.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));

			p_MS_MSBDL0230_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0230_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0230_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0230_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0230_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0230_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0230.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0230.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0230_Del01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0230_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)p_MS_MSBDL0230_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0230_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0230_Prnt01;

		/** コンストラクタ */
		protected MS_MSBDL0230_Prnt01Bridge() {
			p_MS_MSBDL0230_Prnt01 = new MCParam(PDef.MS_MSBDL0230_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0230_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0230.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0230.BtnR.create());
			// Down

			p_MS_MSBDL0230_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0230_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0230_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0230_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0230_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0230_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0230.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0230.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0230.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0230.BtnR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0230_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}