package mcframe.clientMSBF.MSBFP0030;

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
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Srch01Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Srch02Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Ins01Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Upd01Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Del01Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Del02Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Prnt01Caller;
import mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Prnt02Caller;

/**
 * 画面"MSBFP_InspInstLstReg"パネルクラスです。<p>
 *
 * 一覧形式での検査指図の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_InspInstLstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBFP0030";

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
	// [InspStsTyp]ブロック関連のField定義
	public MCPanel InspStsTypPanel = null;
	public MCTitledBorder InspStsTypTitledBorder = null;
	// [InspStsTyp]ブロックの項目のField定義
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
	// [InspLstPrntFlg]ブロック関連のField定義
	public MCPanel InspLstPrntFlgPanel = null;
	public MCTitledBorder InspLstPrntFlgTitledBorder = null;
	// [InspLstPrntFlg]ブロックの項目のField定義
	// [InspRsltPrntFlg]ブロック関連のField定義
	public MCPanel InspRsltPrntFlgPanel = null;
	public MCTitledBorder InspRsltPrntFlgTitledBorder = null;
	// [InspRsltPrntFlg]ブロックの項目のField定義
	// [Lims]ブロック関連のField定義
	public MCPanel LimsPanel = null;
	public MCTitledBorder LimsTitledBorder = null;
	// [Lims]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Order,UPD;APRV,Approve,APRV;DEL,Cancel order,DEL;DEL_APRV,Cancel approval,DEL_APRV;REF,View,REF;PRNT_LST,Issue order list,PRNT_LST;PRNT_RSLT,Issue score,PRNT_RSLT UPD,指図する,UPD;APRV,承認する,APRV;DEL,指図を取り消す,DEL;DEL_APRV,承認を取り消す,DEL_APRV;REF,参照する,REF;PRNT_LST,指図リスト発行,PRNT_LST;PRNT_RSLT,成績書発行,PRNT_RSLT.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_APRV = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_DEL_APRV = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_PRNT_LST = null;
	public MCRadioButton Cnd_ope_PRNT_RSLT = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_sts_typ_schd = null;
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_sts_typ_yet = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_sts_typ_ord = null;
	/**
	 * In process 着手中.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_sts_typ_str = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_sts_typ_jdg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_schd_st_dt_p_PPanel;
	public MCDateField Cnd_schd_st_dt_fr;	// [Cnd]の[schd_st_dt_p.ymd_fr]を[Cnd_schd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_schd_st_hm_fr;	// [Cnd]の[schd_st_dt_p.hm_fr]を[Cnd_schd_st_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_schd_st_dt_to;	// [Cnd]の[schd_st_dt_p.ymd_to]を[Cnd_schd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_schd_st_hm_to;	// [Cnd]の[schd_st_dt_p.hm_to]を[Cnd_schd_st_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_schd_end_dt_p_PPanel;
	public MCDateField Cnd_schd_end_dt_fr;	// [Cnd]の[schd_end_dt_p.ymd_fr]を[Cnd_schd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_schd_end_hm_fr;	// [Cnd]の[schd_end_dt_p.hm_fr]を[Cnd_schd_end_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_schd_end_dt_to;	// [Cnd]の[schd_end_dt_p.ymd_to]を[Cnd_schd_end_dt_to]としてエイリアス定義。
	public MCDateField Cnd_schd_end_hm_to;	// [Cnd]の[schd_end_dt_p.hm_to]を[Cnd_schd_end_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_st_dt_p_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[st_dt_p.ymd_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_hm_fr;	// [Cnd]の[st_dt_p.hm_fr]を[Cnd_st_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[st_dt_p.ymd_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_st_hm_to;	// [Cnd]の[st_dt_p.hm_to]を[Cnd_st_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_end_dt_p_PPanel;
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[end_dt_p.ymd_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_hm_fr;	// [Cnd]の[end_dt_p.hm_fr]を[Cnd_end_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[end_dt_p.ymd_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_hm_to;	// [Cnd]の[end_dt_p.hm_to]を[Cnd_end_hm_to]としてエイリアス定義。
	public MCLabel Cnd_inst_dt_fr_Label = null;
	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_inst_dt_fr = null;
	public MCLabel Cnd_inst_dt_to_Label = null;
	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_inst_dt_to = null;
	public MCLabel Cnd_aprv_dt_fr_Label = null;
	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_dt_fr = null;
	public MCLabel Cnd_aprv_dt_to_Label = null;
	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_dt_to = null;
	public MCLabel Cnd_upd_ts_fr_Label = null;
	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public MCTimestampField Cnd_upd_ts_fr = null;
	public MCLabel Cnd_upd_ts_to_Label = null;
	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public MCTimestampField Cnd_upd_ts_to = null;
	public MCLabel Cnd_insp_lst_prnt_tm_fr_Label = null;
	/**
	 * List issue date and time FROM リスト発行日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_insp_lst_prnt_tm_fr = null;
	public MCLabel Cnd_insp_lst_prnt_tm_to_Label = null;
	/**
	 * List issue date and time TO リスト発行日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_insp_lst_prnt_tm_to = null;
	public MCLabel Cnd_insp_rslt_prnt_tm_fr_Label = null;
	/**
	 * Score issued date and time FROM 成績書発行日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_insp_rslt_prnt_tm_fr = null;
	public MCLabel Cnd_insp_rslt_prnt_tm_to_Label = null;
	/**
	 * Score issued date and time TO 成績書発行日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_insp_rslt_prnt_tm_to = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
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
	public MCLabel Cnd_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_nm = null;
	public MCLabel Cnd_mfg_str_ln_cd_Label = null;
	/**
	 * Mfg. rack/line 製造棚・ライン.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_str_ln_nm = null;
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
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
	public MCLabel Cnd_insp_typ_Label = null;
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_insp_typ = null;
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public MCTextField Cnd_insp_typ_nm = null;
	public MCLabel Cnd_insp_ptn_cd_Label = null;
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCTextField Cnd_insp_ptn_nm = null;
	public MCLabel Cnd_insp_mtd_typ_Label = null;
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_insp_mtd_typ = null;
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public MCTextField Cnd_insp_mtd_typ_nm = null;
	public MCLabel Cnd_insp_aprv_sts_typ_Label = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_insp_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_insp_aprv_sts_typ_nm = null;
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
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCCheckBox Cnd_ver_flg = null;
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
	public MCLabel Cnd_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_lot_no = null;
	public MCLabel Cnd_insp_no_Label = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_insp_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
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
	public MCLabel Cnd_mfg_inst_no_Label = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_no = null;
	public MCLabel Cnd_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_d_no = null;
	public MCLabel Cnd_insp_schd_no_Label = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_insp_schd_no = null;
	public MCLabel Cnd_insp_lst_no_Label = null;
	/**
	 * Inspection order list No. 検査指図リストＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_insp_lst_no = null;
	public MCLabel Cnd_insp_cnt_rmrks_Label = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_insp_cnt_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Order internal remarks 指図内部備考.<p>
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
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_lst_not_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_lst_prnt_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_rslt_not_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_rslt_prnt_flg = null;
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
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_lims_tgt_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_lims_tgt_flg = null;
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [SpplGrp]ブロック関連のField定義
	public MCPanel SpplGrpPanel = null;
	// [SpplGrp]ブロックの項目のField定義
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
	public MCTabbedPane BulkSetTab = null;
	// [BulkSet]ブロックの項目のField定義
	// [InspBulkSet]ブロック関連のField定義
	public MCPanel InspBulkSetPanel = null;
	// [InspBulkSet]ブロックの項目のField定義
	public MCLabel InspBulkSet_inst_dt_Label = null;
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDateField InspBulkSet_inst_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H InspBulkSet_inst_usr_dpt_p_PPanel;
	public MCTextField InspBulkSet_inst_usr_cd;	// [InspBulkSet]の[inst_usr_dpt_p.usr_cd]を[InspBulkSet_inst_usr_cd]としてエイリアス定義。
	public MCTextField InspBulkSet_inst_usr_nm;	// [InspBulkSet]の[inst_usr_dpt_p.usr_nm]を[InspBulkSet_inst_usr_nm]としてエイリアス定義。
	public MCTextComboBox InspBulkSet_inst_dpt_cd;	// [InspBulkSet]の[inst_usr_dpt_p.dpt_cd]を[InspBulkSet_inst_dpt_cd]としてエイリアス定義。
	public MCTextField InspBulkSet_inst_dpt_nm;	// [InspBulkSet]の[inst_usr_dpt_p.dpt_nm]を[InspBulkSet_inst_dpt_nm]としてエイリアス定義。
	// [AprvBulkSet]ブロック関連のField定義
	public MCPanel AprvBulkSetPanel = null;
	// [AprvBulkSet]ブロックの項目のField定義
	public MCLabel AprvBulkSet_aprv_dt_Label = null;
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDateField AprvBulkSet_aprv_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H AprvBulkSet_aprv_usr_dpt_p_PPanel;
	public MCTextField AprvBulkSet_aprv_usr_cd;	// [AprvBulkSet]の[aprv_usr_dpt_p.usr_cd]を[AprvBulkSet_aprv_usr_cd]としてエイリアス定義。
	public MCTextField AprvBulkSet_aprv_usr_nm;	// [AprvBulkSet]の[aprv_usr_dpt_p.usr_nm]を[AprvBulkSet_aprv_usr_nm]としてエイリアス定義。
	public MCTextComboBox AprvBulkSet_aprv_dpt_cd;	// [AprvBulkSet]の[aprv_usr_dpt_p.dpt_cd]を[AprvBulkSet_aprv_dpt_cd]としてエイリアス定義。
	public MCTextField AprvBulkSet_aprv_dpt_nm;	// [AprvBulkSet]の[aprv_usr_dpt_p.dpt_nm]を[AprvBulkSet_aprv_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H AprvBulkSet_aprv_rsn_p_PPanel;
	public MCTextComboBox AprvBulkSet_aprv_rsn;	// [AprvBulkSet]の[aprv_rsn_p.txt]を[AprvBulkSet_aprv_rsn]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_sts_typ = null;
	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_no = null;
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
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_not_yield_qty_p_PPanel;
	public MCColumnConfig columnRslt_not_yield_qty;// [Rslt]の[not_yield_qty_p.qty]を[columnRslt_not_yield_qty]としてエイリアス定義。
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
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_lt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_st_dt_p_PPanel;
	public MCColumnConfig columnRslt_st_dt;// [Rslt]の[st_dt_p.ymd]を[columnRslt_st_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_st_hm;// [Rslt]の[st_dt_p.hm]を[columnRslt_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_end_dt_p_PPanel;
	public MCColumnConfig columnRslt_end_dt;// [Rslt]の[end_dt_p.ymd]を[columnRslt_end_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_end_hm;// [Rslt]の[end_dt_p.hm]を[columnRslt_end_hm]としてエイリアス定義。
	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt_now = null;
	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_up_flg = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_flg = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_sts_typ_nm = null;
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_aprv_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_aprv_usr_cd;// [Rslt]の[aprv_usr_dpt_p.usr_cd]を[columnRslt_aprv_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_aprv_usr_nm;// [Rslt]の[aprv_usr_dpt_p.usr_nm]を[columnRslt_aprv_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_aprv_dpt_cd;// [Rslt]の[aprv_usr_dpt_p.dpt_cd]を[columnRslt_aprv_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_aprv_dpt_nm;// [Rslt]の[aprv_usr_dpt_p.dpt_nm]を[columnRslt_aprv_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D Rslt_aprv_rsn_p_PPanel;
	public MCColumnConfig columnRslt_aprv_rsn;// [Rslt]の[aprv_rsn_p.txt]を[columnRslt_aprv_rsn]としてエイリアス定義。
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_cnt_rmrks = null;
	/**
	 * Order internal remarks 指図内部備考.<p>
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
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_rmrks = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_typ = null;
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_typ_nm = null;
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_ptn_nm = null;
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_mtd_typ = null;
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_mtd_typ_nm = null;
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std_req_flg = null;
	/**
	 * Check required 確認必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std_cnf_req_flg = null;
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_flg = null;
	/**
	 * Schedule aggregation 予定まとめ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_schd_flg = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_to_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_to_site_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd_none_flg = null;
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_nm = null;
	/**
	 * Mfg. rack/line 製造棚・ライン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_nm = null;
	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_cd_none_flg = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_bind_typ = null;
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_bind_typ_nm = null;
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dt = null;
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_usr_cd = null;
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_usr_nm = null;
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dpt_cd = null;
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dpt_nm = null;
	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_freq = null;
	/**
	 * Inspection order list issue date and time 検査指図リスト発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_lst_prnt_tm = null;
	/**
	 * Inspection order list issued 検査指図リスト発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_lst_prnt_flg = null;
	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_rslt_prnt_tm = null;
	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_rslt_prnt_flg = null;
	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_prmt_insp_flg = null;
	public MCColumnConfig columnRslt_insp_inst_issue_typ = null;
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_std_no = null;
	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lims_flg = null;
	/**
	 * For LIMS ＬＩＭＳ対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_for_lims_flg = null;
	/**
	 * Last LIMS 前回ＬＩＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_lims_flg = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_schd_no = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_no = null;
	/**
	 * Reference inspection No. 参照検査ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_own_insp_no = null;
	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_no1 = null;
	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_no2 = null;
	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_no3 = null;
	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_no4 = null;
	/**
	 * Inspection order list No. 検査指図リストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_lst_no = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_upd_cntr = null;
	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_upd_cntr = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_master_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Inspection order 検査指図.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0040 = null;
	/**
	 * Specific inspection result 規格検査実績.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0050 = null;
	/**
	 * Inspection result 検査実績.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0070 = null;
	/**
	 * Prior inspection schedule 先行検査予定.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0020 = null;
	/**
	 * Order list 指図リスト.<p>
	 *
	 */
	public MCButton Btn_prnt_insp_lst = null;
	/**
	 * Inspection report 検査成績書.<p>
	 *
	 */
	public MCButton Btn_prnt_insp_rslt = null;
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
	public MCButton Btn_upd_inst = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_aprv = null;
	/**
	 * Inspection report immediate issue 検査成績書即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_inst = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_aprv = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_UPD_INST]モードを表す定数 */
	public static final String SRCH_UPD_INST = "SRCH_UPD_INST";
	/** [UPD_INST]モードを表す定数 */
	public static final String UPD_INST = "UPD_INST";
	/** [SRCH_UPD_APRV]モードを表す定数 */
	public static final String SRCH_UPD_APRV = "SRCH_UPD_APRV";
	/** [UPD_APRV]モードを表す定数 */
	public static final String UPD_APRV = "UPD_APRV";
	/** [SRCH_DEL_INST]モードを表す定数 */
	public static final String SRCH_DEL_INST = "SRCH_DEL_INST";
	/** [DEL_INST]モードを表す定数 */
	public static final String DEL_INST = "DEL_INST";
	/** [SRCH_DEL_APRV]モードを表す定数 */
	public static final String SRCH_DEL_APRV = "SRCH_DEL_APRV";
	/** [DEL_APRV]モードを表す定数 */
	public static final String DEL_APRV = "DEL_APRV";
	/** [SRCH_INSPLIST_PRNT]モードを表す定数 */
	public static final String SRCH_INSPLIST_PRNT = "SRCH_INSPLIST_PRNT";
	/** [INSPLIST_PRNT]モードを表す定数 */
	public static final String INSPLIST_PRNT = "INSPLIST_PRNT";
	/** [SRCH_INSPRSLT_PRNT]モードを表す定数 */
	public static final String SRCH_INSPRSLT_PRNT = "SRCH_INSPRSLT_PRNT";
	/** [INSPRSLT_PRNT]モードを表す定数 */
	public static final String INSPRSLT_PRNT = "INSPRSLT_PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_REF, REF, SRCH_UPD_INST, UPD_INST, SRCH_UPD_APRV, UPD_APRV, SRCH_DEL_INST, DEL_INST, SRCH_DEL_APRV, DEL_APRV, SRCH_INSPLIST_PRNT, INSPLIST_PRNT, SRCH_INSPRSLT_PRNT, INSPRSLT_PRNT};
	
	/** [MS_MSBFL0030_Srch01]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Srch01Caller createMS_MSBFL0030_Srch01() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Srch01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Srch01Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Srch01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Srch01Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Srch01]の呼び出し */
	protected void callMS_MSBFL0030_Srch01() {
		MCCaller caller = createMS_MSBFL0030_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0030_Srch02]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Srch02Caller createMS_MSBFL0030_Srch02() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Srch02Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Srch02Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Srch02Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Srch02Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Srch02]の呼び出し */
	protected void callMS_MSBFL0030_Srch02() {
		MCCaller caller = createMS_MSBFL0030_Srch02();
		caller.exec();
	}
	/** [MS_MSBFL0030_Ins01]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Ins01Caller createMS_MSBFL0030_Ins01() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Ins01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Ins01Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Ins01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Ins01Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Ins01]の呼び出し */
	protected void callMS_MSBFL0030_Ins01() {
		MCCaller caller = createMS_MSBFL0030_Ins01();
		caller.exec();
	}
	/** [MS_MSBFL0030_Upd01]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Upd01Caller createMS_MSBFL0030_Upd01() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Upd01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Upd01Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Upd01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Upd01Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Upd01]の呼び出し */
	protected void callMS_MSBFL0030_Upd01() {
		MCCaller caller = createMS_MSBFL0030_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0030_Del01]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Del01Caller createMS_MSBFL0030_Del01() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Del01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Del01Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Del01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Del01Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Del01]の呼び出し */
	protected void callMS_MSBFL0030_Del01() {
		MCCaller caller = createMS_MSBFL0030_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0030_Del02]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Del02Caller createMS_MSBFL0030_Del02() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Del02Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Del02Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Del02Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Del02Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Del02Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Del02]の呼び出し */
	protected void callMS_MSBFL0030_Del02() {
		MCCaller caller = createMS_MSBFL0030_Del02();
		caller.exec();
	}
	/** [MS_MSBFL0030_Prnt01]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Prnt01Caller createMS_MSBFL0030_Prnt01() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Prnt01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Prnt01Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Prnt01Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Prnt01Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Prnt01]の呼び出し */
	protected void callMS_MSBFL0030_Prnt01() {
		MCCaller caller = createMS_MSBFL0030_Prnt01();
		caller.exec();
	}
	/** [MS_MSBFL0030_Prnt02]のCallerの作成 */
	protected MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Prnt02Caller createMS_MSBFL0030_Prnt02() {
		MSBFP_InspInstLstReg_MC.MS_MSBFL0030_Prnt02Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Prnt02Bridge>
		caller = ((MSBFP_InspInstLstReg_MC)this).new MS_MSBFL0030_Prnt02Caller<MSBFP_InspInstLstReg, MS_MSBFL0030_Prnt02Bridge>(
					(MSBFP_InspInstLstReg)this, new MS_MSBFL0030_Prnt02Bridge());
		return caller;
	}
	/** [MS_MSBFL0030_Prnt02]の呼び出し */
	protected void callMS_MSBFL0030_Prnt02() {
		MCCaller caller = createMS_MSBFL0030_Prnt02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0030.CndR aCndR;
	/** [InspBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0030.InspBulkSetR aInspBulkSetR;
	/** [AprvBulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0030.AprvBulkSetR aAprvBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0030.RsltR> aRsltL;
	/** [RsltSchd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR> aRsltSchdL;
	/** [MasterInfo]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0030.MasterInfoR aMasterInfoR;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0030.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0030.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0030.CndR.create();
	}

	/**
	 * 項目コピーによってaInspBulkSetRを設定します。
	 *
	 * aInspBulkSetRのインスタンスは変更されません。
	 *
	 * @param row InspBulkSetR
	 */
	public void setInspBulkSetR(mcframe.clientMSBF.MSBFP0030.InspBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getInspBulkSetR(), row);
		}
	}

	/**
	 * [InspBulkSet]ブロックのコンテナaInspBulkSetRを返します。
	 *
	 * @return InspBulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0030.InspBulkSetR getInspBulkSetR() {
		return aInspBulkSetR;
	}

	/**
	 * aInspBulkSetRを作成します。
	 *
	 * @return InspBulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0030.InspBulkSetR createInspBulkSetR() {
		return mcframe.clientMSBF.MSBFP0030.InspBulkSetR.create();
	}

	/**
	 * 項目コピーによってaAprvBulkSetRを設定します。
	 *
	 * aAprvBulkSetRのインスタンスは変更されません。
	 *
	 * @param row AprvBulkSetR
	 */
	public void setAprvBulkSetR(mcframe.clientMSBF.MSBFP0030.AprvBulkSetR row) {
		if (row != null) {
			MCRow.copyall(getAprvBulkSetR(), row);
		}
	}

	/**
	 * [AprvBulkSet]ブロックのコンテナaAprvBulkSetRを返します。
	 *
	 * @return AprvBulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0030.AprvBulkSetR getAprvBulkSetR() {
		return aAprvBulkSetR;
	}

	/**
	 * aAprvBulkSetRを作成します。
	 *
	 * @return AprvBulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0030.AprvBulkSetR createAprvBulkSetR() {
		return mcframe.clientMSBF.MSBFP0030.AprvBulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBF.MSBFP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBF.MSBFP0030.RsltR createRsltR() {
		return mcframe.clientMSBF.MSBFP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class);
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
	 * コピーによってaRsltSchdLを設定します。
	 *
	 * aRsltSchdLのインスタンスは変更されません。
	 *
	 * @param dataset RsltSchdL
	 */
	public void setRsltSchdL(MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR> aList) {
		if (getRsltSchdL() != aList) {
			getRsltSchdL().setAll(aList);
		}
	}

	/**
	 * [RsltSchd]ブロックのコンテナaRsltSchdLを返します。
	 *
	 * @return RsltSchdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR> getRsltSchdL() {
		return aRsltSchdL;
	}

	/**
	 * aRsltSchdRを作成します。
	 *
	 * @return RsltSchdR
	 */
	public mcframe.clientMSBF.MSBFP0030.RsltSchdR createRsltSchdR() {
		return mcframe.clientMSBF.MSBFP0030.RsltSchdR.create();
	}

	/**
	 * aRsltSchdLを作成します。
	 *
	 * @return RsltSchdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR> createRsltSchdL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0030.RsltSchdR.class);
	}

	/**
	 * 項目コピーによってaMasterInfoRを設定します。
	 *
	 * aMasterInfoRのインスタンスは変更されません。
	 *
	 * @param row MasterInfoR
	 */
	public void setMasterInfoR(mcframe.clientMSBF.MSBFP0030.MasterInfoR row) {
		if (row != null) {
			MCRow.copyall(getMasterInfoR(), row);
		}
	}

	/**
	 * [MasterInfo]ブロックのコンテナaMasterInfoRを返します。
	 *
	 * @return MasterInfoR
	 */
	public mcframe.clientMSBF.MSBFP0030.MasterInfoR getMasterInfoR() {
		return aMasterInfoR;
	}

	/**
	 * aMasterInfoRを作成します。
	 *
	 * @return MasterInfoR
	 */
	public mcframe.clientMSBF.MSBFP0030.MasterInfoR createMasterInfoR() {
		return mcframe.clientMSBF.MSBFP0030.MasterInfoR.create();
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBF.MSBFP0030.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0030.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0030.BtnR createBtnR() {
		return mcframe.clientMSBF.MSBFP0030.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getInspBulkSetR())) ret.add(getInspBulkSetR());
		if(!MCCollectionUtil.contains(ret, getAprvBulkSetR())) ret.add(getAprvBulkSetR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltSchdL())) ret.add(getRsltSchdL());
		if(!MCCollectionUtil.contains(ret, getMasterInfoR())) ret.add(getMasterInfoR());
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
		if(aCnt == getInspBulkSetR()) return "InspBulkSet";
		if(aCnt == getAprvBulkSetR()) return "AprvBulkSet";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRsltSchdL()) return "RsltSchd";
		if(aCnt == getMasterInfoR()) return "MasterInfo";
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
		if(bId.equals("InspBulkSet")) return getInspBulkSetR();
		if(bId.equals("AprvBulkSet")) return getAprvBulkSetR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("RsltSchd")) return getRsltSchdL();
		if(bId.equals("MasterInfo")) return getMasterInfoR();
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
		ret.add(InspStsTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(InspLstPrntFlgPanel);
		ret.add(InspRsltPrntFlgPanel);
		ret.add(LimsPanel);
		ret.add(CndPanel);
		ret.add(ItmGrpPanel);
		ret.add(SpplGrpPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(InspBulkSetPanel);
		ret.add(AprvBulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspInstLstReg_MC_A() {
		aCndR = createCndR();
		aInspBulkSetR = createInspBulkSetR();
		aAprvBulkSetR = createAprvBulkSetR();
		aRsltL = createRsltL();
		aRsltSchdL = createRsltSchdL();
		aMasterInfoR = createMasterInfoR();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_InspInstLstReg_MC_A(String name) {
		aCndR = createCndR();
		aInspBulkSetR = createInspBulkSetR();
		aAprvBulkSetR = createAprvBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aRsltSchdL = createRsltSchdL();
		aMasterInfoR = createMasterInfoR();
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_InspInstLstReg_MC.jbCreateScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateInspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateTop((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateFold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateTab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateTab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateTab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateInspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateInspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateLims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateCnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateSpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateCtrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateRPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateInspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateAprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateRslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateBtn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbCreateEastBtn((MSBFP_InspInstLstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [InspStsTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInspStsTyp(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [InspLstPrntFlg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInspLstPrntFlg(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [InspRsltPrntFlg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInspRsltPrntFlg(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Lims]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLims(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_InspInstLstReg p) {
		p.Cnd_schd_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().schd_st_dt_p());
		p.Cnd_schd_st_dt_p_PPanel.setName("Cnd.schd_st_dt_p");
		p.Cnd_schd_st_dt_fr = p.Cnd_schd_st_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_schd_st_dt_fr.addAliasName("Cnd.schd_st_dt_fr", p);
		p.Cnd_schd_st_hm_fr = p.Cnd_schd_st_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_schd_st_hm_fr.addAliasName("Cnd.schd_st_hm_fr", p);
		p.Cnd_schd_st_dt_to = p.Cnd_schd_st_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_schd_st_dt_to.addAliasName("Cnd.schd_st_dt_to", p);
		p.Cnd_schd_st_hm_to = p.Cnd_schd_st_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_schd_st_hm_to.addAliasName("Cnd.schd_st_hm_to", p);
		p.Cnd_schd_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().schd_end_dt_p());
		p.Cnd_schd_end_dt_p_PPanel.setName("Cnd.schd_end_dt_p");
		p.Cnd_schd_end_dt_fr = p.Cnd_schd_end_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_schd_end_dt_fr.addAliasName("Cnd.schd_end_dt_fr", p);
		p.Cnd_schd_end_hm_fr = p.Cnd_schd_end_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_schd_end_hm_fr.addAliasName("Cnd.schd_end_hm_fr", p);
		p.Cnd_schd_end_dt_to = p.Cnd_schd_end_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_schd_end_dt_to.addAliasName("Cnd.schd_end_dt_to", p);
		p.Cnd_schd_end_hm_to = p.Cnd_schd_end_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_schd_end_hm_to.addAliasName("Cnd.schd_end_hm_to", p);
		p.Cnd_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().st_dt_p());
		p.Cnd_st_dt_p_PPanel.setName("Cnd.st_dt_p");
		p.Cnd_st_dt_fr = p.Cnd_st_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_hm_fr = p.Cnd_st_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_st_hm_fr.addAliasName("Cnd.st_hm_fr", p);
		p.Cnd_st_dt_to = p.Cnd_st_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_st_hm_to = p.Cnd_st_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_st_hm_to.addAliasName("Cnd.st_hm_to", p);
		p.Cnd_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().end_dt_p());
		p.Cnd_end_dt_p_PPanel.setName("Cnd.end_dt_p");
		p.Cnd_end_dt_fr = p.Cnd_end_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_hm_fr = p.Cnd_end_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_end_hm_fr.addAliasName("Cnd.end_hm_fr", p);
		p.Cnd_end_dt_to = p.Cnd_end_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
		p.Cnd_end_hm_to = p.Cnd_end_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_end_hm_to.addAliasName("Cnd.end_hm_to", p);
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
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [SpplGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplGrp(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBFP_InspInstLstReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [InspBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInspBulkSet(MSBFP_InspInstLstReg p) {
		p.InspBulkSet_inst_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getInspBulkSetR().inst_usr_dpt_p());
		p.InspBulkSet_inst_usr_dpt_p_PPanel.setName("InspBulkSet.inst_usr_dpt_p");
		p.InspBulkSet_inst_usr_cd = p.InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.InspBulkSet_inst_usr_cd.addAliasName("InspBulkSet.inst_usr_cd", p);
		p.InspBulkSet_inst_usr_nm = p.InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.InspBulkSet_inst_usr_nm.addAliasName("InspBulkSet.inst_usr_nm", p);
		p.InspBulkSet_inst_dpt_cd = p.InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.InspBulkSet_inst_dpt_cd.addAliasName("InspBulkSet.inst_dpt_cd", p);
		p.InspBulkSet_inst_dpt_nm = p.InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.InspBulkSet_inst_dpt_nm.addAliasName("InspBulkSet.inst_dpt_nm", p);
	}

	/**
	 * [AprvBulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvBulkSet(MSBFP_InspInstLstReg p) {
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getAprvBulkSetR().aprv_usr_dpt_p());
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.setName("AprvBulkSet.aprv_usr_dpt_p");
		p.AprvBulkSet_aprv_usr_cd = p.AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.AprvBulkSet_aprv_usr_cd.addAliasName("AprvBulkSet.aprv_usr_cd", p);
		p.AprvBulkSet_aprv_usr_nm = p.AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.AprvBulkSet_aprv_usr_nm.addAliasName("AprvBulkSet.aprv_usr_nm", p);
		p.AprvBulkSet_aprv_dpt_cd = p.AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.AprvBulkSet_aprv_dpt_cd.addAliasName("AprvBulkSet.aprv_dpt_cd", p);
		p.AprvBulkSet_aprv_dpt_nm = p.AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.AprvBulkSet_aprv_dpt_nm.addAliasName("AprvBulkSet.aprv_dpt_nm", p);
		p.AprvBulkSet_aprv_rsn_p_PPanel = mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.create(p.getAprvBulkSetR().aprv_rsn_p());
		p.AprvBulkSet_aprv_rsn_p_PPanel.setName("AprvBulkSet.aprv_rsn_p");
		p.AprvBulkSet_aprv_rsn = p.AprvBulkSet_aprv_rsn_p_PPanel.Txt_txt;
		p.AprvBulkSet_aprv_rsn.addAliasName("AprvBulkSet.aprv_rsn", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBFP_InspInstLstReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$itm_p);
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
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_not_yield_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$not_yield_qty_p);
		p.Rslt_not_yield_qty_p_PPanel.setName("Rslt.not_yield_qty_p");
		p.columnRslt_not_yield_qty = p.Rslt_not_yield_qty_p_PPanel.columnQty_qty;
		p.columnRslt_not_yield_qty.addAliasName("Rslt.not_yield_qty", p);
		p.Rslt_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$st_dt_p);
		p.Rslt_st_dt_p_PPanel.setName("Rslt.st_dt_p");
		p.columnRslt_st_dt = p.Rslt_st_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_st_dt.addAliasName("Rslt.st_dt", p);
		p.columnRslt_st_hm = p.Rslt_st_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_st_hm.addAliasName("Rslt.st_hm", p);
		p.Rslt_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$end_dt_p);
		p.Rslt_end_dt_p_PPanel.setName("Rslt.end_dt_p");
		p.columnRslt_end_dt = p.Rslt_end_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_end_dt.addAliasName("Rslt.end_dt", p);
		p.columnRslt_end_hm = p.Rslt_end_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_end_hm.addAliasName("Rslt.end_hm", p);
		p.Rslt_aprv_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$aprv_usr_dpt_p);
		p.Rslt_aprv_usr_dpt_p_PPanel.setName("Rslt.aprv_usr_dpt_p");
		p.columnRslt_aprv_usr_cd = p.Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_aprv_usr_cd.addAliasName("Rslt.aprv_usr_cd", p);
		p.columnRslt_aprv_usr_nm = p.Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_aprv_usr_nm.addAliasName("Rslt.aprv_usr_nm", p);
		p.columnRslt_aprv_dpt_cd = p.Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_aprv_dpt_cd.addAliasName("Rslt.aprv_dpt_cd", p);
		p.columnRslt_aprv_dpt_nm = p.Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_aprv_dpt_nm.addAliasName("Rslt.aprv_dpt_nm", p);
		p.Rslt_aprv_rsn_p_PPanel = mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$aprv_rsn_p);
		p.Rslt_aprv_rsn_p_PPanel.setName("Rslt.aprv_rsn_p");
		p.columnRslt_aprv_rsn = p.Rslt_aprv_rsn_p_PPanel.columnTxt_txt;
		p.columnRslt_aprv_rsn.addAliasName("Rslt.aprv_rsn", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$sno_wrk_no_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$sppl_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBF.MSBFP0030.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_InspInstLstReg p) {
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

	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
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
	
	
	/** [Cnd_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_cd_p = null;

	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_cd_ListPutter() {
		if (Cnd_mfg_loc_cd_p == null) {
			Cnd_mfg_loc_cd_p = createCnd_mfg_loc_cd_ListPutter(Cnd_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Cnd_mfg_loc_cd_p;
	}
	
	
	/** [Cnd_mfg_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_str_ln_cd_p = null;

	/**
	 * [Cnd_mfg_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_str_ln_cd_ListPutter() {
		if (Cnd_mfg_str_ln_cd_p == null) {
			Cnd_mfg_str_ln_cd_p = createCnd_mfg_str_ln_cd_ListPutter(Cnd_mfg_str_ln_cd, "mfg_str_ln_cd", "mfg_str_ln_nm");

		}
		return Cnd_mfg_str_ln_cd_p;
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
	
	
	/** [Cnd_maker_cd_ListPutter]の定義 */
	private MCListPutter Cnd_maker_cd_p = null;

	/**
	 * [Cnd_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_cd_ListPutter() {
		if (Cnd_maker_cd_p == null) {
			Cnd_maker_cd_p = createCnd_maker_cd_ListPutter(Cnd_maker_cd, "maker_cd", "maker_nm");

		}
		return Cnd_maker_cd_p;
	}
	
	
	/** [Cnd_insp_typ_ListPutter]の定義 */
	private MCListPutter Cnd_insp_typ_p = null;

	/**
	 * [Cnd_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_insp_typ_ListPutter() {
		if (Cnd_insp_typ_p == null) {
			Cnd_insp_typ_p = createCnd_insp_typ_ListPutter(Cnd_insp_typ, "insp_typ", "insp_typ_nm");

		}
		return Cnd_insp_typ_p;
	}
	
	
	/** [Cnd_insp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_insp_ptn_cd_p = null;

	/**
	 * [Cnd_insp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_insp_ptn_cd_ListPutter() {
		if (Cnd_insp_ptn_cd_p == null) {
			Cnd_insp_ptn_cd_p = createCnd_insp_ptn_cd_ListPutter(Cnd_insp_ptn_cd, "insp_ptn_cd", "insp_ptn_nm");

		}
		return Cnd_insp_ptn_cd_p;
	}
	
	
	/** [Cnd_insp_mtd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_insp_mtd_typ_p = null;

	/**
	 * [Cnd_insp_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_insp_mtd_typ_ListPutter() {
		if (Cnd_insp_mtd_typ_p == null) {
			Cnd_insp_mtd_typ_p = createCnd_insp_mtd_typ_ListPutter(Cnd_insp_mtd_typ, "insp_mtd_typ", "insp_mtd_typ_nm");

		}
		return Cnd_insp_mtd_typ_p;
	}
	
	
	/** [Cnd_insp_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_insp_aprv_sts_typ_p = null;

	/**
	 * [Cnd_insp_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_insp_aprv_sts_typ_ListPutter() {
		if (Cnd_insp_aprv_sts_typ_p == null) {
			Cnd_insp_aprv_sts_typ_p = createCnd_insp_aprv_sts_typ_ListPutter(Cnd_insp_aprv_sts_typ, "insp_aprv_sts_typ", "insp_aprv_sts_typ_nm");

		}
		return Cnd_insp_aprv_sts_typ_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","ver_flg","itm_sub1","itm_sub2","itm_sub3");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","ver_flg","itm_sub2","itm_sub3");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","ver_flg","itm_sub3");
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
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","ver_flg");
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
	
	
	/** [InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getInspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createInspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");
		}
		return InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getAprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createAprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");
		}
		return AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_insp_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_insp_sts_typ_p = null;

	/**
	 * [Rslt_insp_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_insp_sts_typ_ListPutter() {
		if (Rslt_insp_sts_typ_p == null) {
			Rslt_insp_sts_typ_p = createRslt_insp_sts_typ_ListPutter(columnRslt_insp_sts_typ, "insp_sts_typ");

		}
		return Rslt_insp_sts_typ_p;
	}
	
	
	/** [Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");
		}
		return Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_insp_typ_ListPutter]の定義 */
	private MCListPutter Rslt_insp_typ_p = null;

	/**
	 * [Rslt_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_insp_typ_ListPutter() {
		if (Rslt_insp_typ_p == null) {
			Rslt_insp_typ_p = createRslt_insp_typ_ListPutter(columnRslt_insp_typ, "insp_typ");

		}
		return Rslt_insp_typ_p;
	}
	
	
	/** [Rslt_insp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_insp_ptn_cd_p = null;

	/**
	 * [Rslt_insp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_insp_ptn_cd_ListPutter() {
		if (Rslt_insp_ptn_cd_p == null) {
			Rslt_insp_ptn_cd_p = createRslt_insp_ptn_cd_ListPutter(columnRslt_insp_ptn_cd, "insp_ptn_cd", "insp_ptn_nm");

		}
		return Rslt_insp_ptn_cd_p;
	}
	
	
	/** [Rslt_insp_mtd_typ_ListPutter]の定義 */
	private MCListPutter Rslt_insp_mtd_typ_p = null;

	/**
	 * [Rslt_insp_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_insp_mtd_typ_ListPutter() {
		if (Rslt_insp_mtd_typ_p == null) {
			Rslt_insp_mtd_typ_p = createRslt_insp_mtd_typ_ListPutter(columnRslt_insp_mtd_typ, "insp_mtd_typ", "insp_mtd_typ_nm");

		}
		return Rslt_insp_mtd_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_InspInstLstReg create(){
		MSBFP_InspInstLstReg p = new MSBFP_InspInstLstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_InspInstLstReg create(String name){
		MSBFP_InspInstLstReg p = new MSBFP_InspInstLstReg(name);
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
		MSBFP_InspInstLstReg_MC.jbfInitScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitInspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitTop((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitFold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitTab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitTab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitTab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitInspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitInspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitLims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitCnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitSpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitCtrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitRPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitInspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitAprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitRslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitBtn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbfInitEastBtn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitInspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitTop((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitFold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitTab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitTab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitTab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitInspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitInspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitLims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitCnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitSpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitCtrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitRPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitInspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitAprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitRslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitBtn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.jbInitEastBtn((MSBFP_InspInstLstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [InspStsTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInspStsTyp(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspStsTypPanel = p.beansFactory.createPanel("InspStsTyp");
		p.InspStsTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBFP_InspInstLstReg p) {
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
	protected static void jbfInitTab1(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [InspLstPrntFlg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInspLstPrntFlg(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspLstPrntFlgPanel = p.beansFactory.createPanel("InspLstPrntFlg");
		p.InspLstPrntFlgTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [InspRsltPrntFlg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInspRsltPrntFlg(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspRsltPrntFlgPanel = p.beansFactory.createPanel("InspRsltPrntFlg");
		p.InspRsltPrntFlgTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Lims]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLims(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.LimsPanel = p.beansFactory.createPanel("Lims");
		p.LimsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_APRV = p.beansFactory.createRadioButton("Cnd.ope_APRV");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_DEL_APRV = p.beansFactory.createRadioButton("Cnd.ope_DEL_APRV");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT_LST = p.beansFactory.createRadioButton("Cnd.ope_PRNT_LST");
		p.Cnd_ope_PRNT_RSLT = p.beansFactory.createRadioButton("Cnd.ope_PRNT_RSLT");
		p.Cnd_insp_sts_typ_schd = p.beansFactory.createCheckBox("Cnd.insp_sts_typ_schd");
		p.Cnd_insp_sts_typ_yet = p.beansFactory.createCheckBox("Cnd.insp_sts_typ_yet");
		p.Cnd_insp_sts_typ_ord = p.beansFactory.createCheckBox("Cnd.insp_sts_typ_ord");
		p.Cnd_insp_sts_typ_str = p.beansFactory.createCheckBox("Cnd.insp_sts_typ_str");
		p.Cnd_insp_sts_typ_jdg = p.beansFactory.createCheckBox("Cnd.insp_sts_typ_jdg");
		p.Cnd_inst_dt_fr_Label = p.beansFactory.createLabel("Cnd.inst_dt_fr_Label");
		p.Cnd_inst_dt_fr = p.beansFactory.createDateField("Cnd.inst_dt_fr");
		p.Cnd_inst_dt_fr.setLabel(p.Cnd_inst_dt_fr_Label);
		p.Cnd_inst_dt_to_Label = p.beansFactory.createLabel("Cnd.inst_dt_to_Label");
		p.Cnd_inst_dt_to = p.beansFactory.createDateField("Cnd.inst_dt_to");
		p.Cnd_inst_dt_to.setLabel(p.Cnd_inst_dt_to_Label);
		p.Cnd_aprv_dt_fr_Label = p.beansFactory.createLabel("Cnd.aprv_dt_fr_Label");
		p.Cnd_aprv_dt_fr = p.beansFactory.createDateField("Cnd.aprv_dt_fr");
		p.Cnd_aprv_dt_fr.setLabel(p.Cnd_aprv_dt_fr_Label);
		p.Cnd_aprv_dt_to_Label = p.beansFactory.createLabel("Cnd.aprv_dt_to_Label");
		p.Cnd_aprv_dt_to = p.beansFactory.createDateField("Cnd.aprv_dt_to");
		p.Cnd_aprv_dt_to.setLabel(p.Cnd_aprv_dt_to_Label);
		p.Cnd_upd_ts_fr_Label = p.beansFactory.createLabel("Cnd.upd_ts_fr_Label");
		p.Cnd_upd_ts_fr = p.beansFactory.createTimestampField("Cnd.upd_ts_fr");
		p.Cnd_upd_ts_fr.setLabel(p.Cnd_upd_ts_fr_Label);
		p.Cnd_upd_ts_to_Label = p.beansFactory.createLabel("Cnd.upd_ts_to_Label");
		p.Cnd_upd_ts_to = p.beansFactory.createTimestampField("Cnd.upd_ts_to");
		p.Cnd_upd_ts_to.setLabel(p.Cnd_upd_ts_to_Label);
		p.Cnd_insp_lst_prnt_tm_fr_Label = p.beansFactory.createLabel("Cnd.insp_lst_prnt_tm_fr_Label");
		p.Cnd_insp_lst_prnt_tm_fr = p.beansFactory.createDateField("Cnd.insp_lst_prnt_tm_fr");
		p.Cnd_insp_lst_prnt_tm_fr.setLabel(p.Cnd_insp_lst_prnt_tm_fr_Label);
		p.Cnd_insp_lst_prnt_tm_to_Label = p.beansFactory.createLabel("Cnd.insp_lst_prnt_tm_to_Label");
		p.Cnd_insp_lst_prnt_tm_to = p.beansFactory.createDateField("Cnd.insp_lst_prnt_tm_to");
		p.Cnd_insp_lst_prnt_tm_to.setLabel(p.Cnd_insp_lst_prnt_tm_to_Label);
		p.Cnd_insp_rslt_prnt_tm_fr_Label = p.beansFactory.createLabel("Cnd.insp_rslt_prnt_tm_fr_Label");
		p.Cnd_insp_rslt_prnt_tm_fr = p.beansFactory.createDateField("Cnd.insp_rslt_prnt_tm_fr");
		p.Cnd_insp_rslt_prnt_tm_fr.setLabel(p.Cnd_insp_rslt_prnt_tm_fr_Label);
		p.Cnd_insp_rslt_prnt_tm_to_Label = p.beansFactory.createLabel("Cnd.insp_rslt_prnt_tm_to_Label");
		p.Cnd_insp_rslt_prnt_tm_to = p.beansFactory.createDateField("Cnd.insp_rslt_prnt_tm_to");
		p.Cnd_insp_rslt_prnt_tm_to.setLabel(p.Cnd_insp_rslt_prnt_tm_to_Label);
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_mfg_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.mfg_str_ln_cd_Label");
		p.Cnd_mfg_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.mfg_str_ln_cd");
		p.Cnd_mfg_str_ln_cd.setLabel(p.Cnd_mfg_str_ln_cd_Label);
		p.Cnd_mfg_str_ln_nm = p.beansFactory.createTextField("Cnd.mfg_str_ln_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_insp_typ_Label = p.beansFactory.createLabel("Cnd.insp_typ_Label");
		p.Cnd_insp_typ = p.beansFactory.createTextComboBox("Cnd.insp_typ");
		p.Cnd_insp_typ.setLabel(p.Cnd_insp_typ_Label);
		p.Cnd_insp_typ_nm = p.beansFactory.createTextField("Cnd.insp_typ_nm");
		p.Cnd_insp_ptn_cd_Label = p.beansFactory.createLabel("Cnd.insp_ptn_cd_Label");
		p.Cnd_insp_ptn_cd = p.beansFactory.createTextComboBox("Cnd.insp_ptn_cd");
		p.Cnd_insp_ptn_cd.setLabel(p.Cnd_insp_ptn_cd_Label);
		p.Cnd_insp_ptn_nm = p.beansFactory.createTextField("Cnd.insp_ptn_nm");
		p.Cnd_insp_mtd_typ_Label = p.beansFactory.createLabel("Cnd.insp_mtd_typ_Label");
		p.Cnd_insp_mtd_typ = p.beansFactory.createTextComboBox("Cnd.insp_mtd_typ");
		p.Cnd_insp_mtd_typ.setLabel(p.Cnd_insp_mtd_typ_Label);
		p.Cnd_insp_mtd_typ_nm = p.beansFactory.createTextField("Cnd.insp_mtd_typ_nm");
		p.Cnd_insp_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.insp_aprv_sts_typ_Label");
		p.Cnd_insp_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.insp_aprv_sts_typ");
		p.Cnd_insp_aprv_sts_typ.setLabel(p.Cnd_insp_aprv_sts_typ_Label);
		p.Cnd_insp_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.insp_aprv_sts_typ_nm");
		p.Cnd_ver_flg = p.beansFactory.createCheckBox("Cnd.ver_flg");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_bp_lot_no_Label = p.beansFactory.createLabel("Cnd.bp_lot_no_Label");
		p.Cnd_bp_lot_no = p.beansFactory.createTextField("Cnd.bp_lot_no");
		p.Cnd_bp_lot_no.setLabel(p.Cnd_bp_lot_no_Label);
		p.Cnd_insp_no_Label = p.beansFactory.createLabel("Cnd.insp_no_Label");
		p.Cnd_insp_no = p.beansFactory.createTextField("Cnd.insp_no");
		p.Cnd_insp_no.setLabel(p.Cnd_insp_no_Label);
		p.Cnd_inst_usr_cd_Label = p.beansFactory.createLabel("Cnd.inst_usr_cd_Label");
		p.Cnd_inst_usr_cd = p.beansFactory.createTextField("Cnd.inst_usr_cd");
		p.Cnd_inst_usr_cd.setLabel(p.Cnd_inst_usr_cd_Label);
		p.Cnd_inst_usr_nm = p.beansFactory.createTextField("Cnd.inst_usr_nm");
		p.Cnd_inst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.inst_dpt_cd_Label");
		p.Cnd_inst_dpt_cd = p.beansFactory.createTextField("Cnd.inst_dpt_cd");
		p.Cnd_inst_dpt_cd.setLabel(p.Cnd_inst_dpt_cd_Label);
		p.Cnd_inst_dpt_nm = p.beansFactory.createTextField("Cnd.inst_dpt_nm");
		p.Cnd_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.mfg_inst_no_Label");
		p.Cnd_mfg_inst_no = p.beansFactory.createTextField("Cnd.mfg_inst_no");
		p.Cnd_mfg_inst_no.setLabel(p.Cnd_mfg_inst_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_insp_schd_no_Label = p.beansFactory.createLabel("Cnd.insp_schd_no_Label");
		p.Cnd_insp_schd_no = p.beansFactory.createTextField("Cnd.insp_schd_no");
		p.Cnd_insp_schd_no.setLabel(p.Cnd_insp_schd_no_Label);
		p.Cnd_insp_lst_no_Label = p.beansFactory.createLabel("Cnd.insp_lst_no_Label");
		p.Cnd_insp_lst_no = p.beansFactory.createTextField("Cnd.insp_lst_no");
		p.Cnd_insp_lst_no.setLabel(p.Cnd_insp_lst_no_Label);
		p.Cnd_insp_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.insp_cnt_rmrks_Label");
		p.Cnd_insp_cnt_rmrks = p.beansFactory.createTextField("Cnd.insp_cnt_rmrks");
		p.Cnd_insp_cnt_rmrks.setLabel(p.Cnd_insp_cnt_rmrks_Label);
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
		p.Cnd_insp_lst_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.insp_lst_not_prnt_flg");
		p.Cnd_insp_lst_prnt_flg = p.beansFactory.createCheckBox("Cnd.insp_lst_prnt_flg");
		p.Cnd_insp_rslt_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.insp_rslt_not_prnt_flg");
		p.Cnd_insp_rslt_prnt_flg = p.beansFactory.createCheckBox("Cnd.insp_rslt_prnt_flg");
		p.Cnd_lims_tgt_flg = p.beansFactory.createCheckBox("Cnd.lims_tgt_flg");
		p.Cnd_not_lims_tgt_flg = p.beansFactory.createCheckBox("Cnd.not_lims_tgt_flg");
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplGrp(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.SpplGrpPanel = p.beansFactory.createPanel("SpplGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		p.BulkSetTab = p.beansFactory.createTabbedPane("BulkSet.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [InspBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInspBulkSet(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspBulkSetPanel = p.beansFactory.createPanel("InspBulkSet");
		// ブロックの項目の初期化
		p.InspBulkSet_inst_dt_Label = p.beansFactory.createLabel("InspBulkSet.inst_dt_Label");
		p.InspBulkSet_inst_dt = p.beansFactory.createDateField("InspBulkSet.inst_dt");
		p.InspBulkSet_inst_dt.setLabel(p.InspBulkSet_inst_dt_Label);
	}

	/**
	 * [AprvBulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvBulkSet(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.AprvBulkSetPanel = p.beansFactory.createPanel("AprvBulkSet");
		// ブロックの項目の初期化
		p.AprvBulkSet_aprv_dt_Label = p.beansFactory.createLabel("AprvBulkSet.aprv_dt_Label");
		p.AprvBulkSet_aprv_dt = p.beansFactory.createDateField("AprvBulkSet.aprv_dt");
		p.AprvBulkSet_aprv_dt.setLabel(p.AprvBulkSet_aprv_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_insp_sts_typ = p.beansFactory.createTableColumn("Rslt.insp_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_insp_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ver_no = p.beansFactory.createTableColumn("Rslt.ver_no", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_insp_lt = p.beansFactory.createTableColumn("Rslt.insp_lt", MCColumnType.NUMBER);
		p.columnRslt_vld_dt_now = p.beansFactory.createTableColumn("Rslt.vld_dt_now", MCColumnType.DATE);
		p.columnRslt_lmt_up_flg = p.beansFactory.createTableColumn("Rslt.lmt_up_flg", MCColumnType.CHECK);
		p.columnRslt_insp_aprv_flg = p.beansFactory.createTableColumn("Rslt.insp_aprv_flg", MCColumnType.CHECK);
		p.columnRslt_insp_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.insp_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_insp_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_dt = p.beansFactory.createTableColumn("Rslt.aprv_dt", MCColumnType.DATE);
		p.columnRslt_insp_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.insp_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_lot_rmrks = p.beansFactory.createTableColumn("Rslt.lot_rmrks", MCColumnType.TEXT);
		p.columnRslt_insp_typ = p.beansFactory.createTableColumn("Rslt.insp_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_insp_ptn_cd = p.beansFactory.createTableColumn("Rslt.insp_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_insp_ptn_nm = p.beansFactory.createTableColumn("Rslt.insp_ptn_nm", MCColumnType.TEXT);
		p.columnRslt_insp_mtd_typ = p.beansFactory.createTableColumn("Rslt.insp_mtd_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_insp_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_std_req_flg = p.beansFactory.createTableColumn("Rslt.std_req_flg", MCColumnType.CHECK);
		p.columnRslt_std_cnf_req_flg = p.beansFactory.createTableColumn("Rslt.std_cnf_req_flg", MCColumnType.CHECK);
		p.columnRslt_plnt_aprv_flg = p.beansFactory.createTableColumn("Rslt.plnt_aprv_flg", MCColumnType.CHECK);
		p.columnRslt_col_schd_flg = p.beansFactory.createTableColumn("Rslt.col_schd_flg", MCColumnType.CHECK);
		p.columnRslt_to_site_cd = p.beansFactory.createTableColumn("Rslt.to_site_cd", MCColumnType.TEXT);
		p.columnRslt_to_site_nm = p.beansFactory.createTableColumn("Rslt.to_site_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_cd = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_nm = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_insp_bind_typ = p.beansFactory.createTableColumn("Rslt.insp_bind_typ", MCColumnType.TEXT);
		p.columnRslt_insp_bind_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_bind_typ_nm", MCColumnType.TEXT);
		p.columnRslt_inst_dt = p.beansFactory.createTableColumn("Rslt.inst_dt", MCColumnType.DATE);
		p.columnRslt_inst_usr_cd = p.beansFactory.createTableColumn("Rslt.inst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_inst_usr_nm = p.beansFactory.createTableColumn("Rslt.inst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_inst_dpt_cd = p.beansFactory.createTableColumn("Rslt.inst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_inst_dpt_nm = p.beansFactory.createTableColumn("Rslt.inst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_insp_freq = p.beansFactory.createTableColumn("Rslt.insp_freq", MCColumnType.NUMBER);
		p.columnRslt_insp_lst_prnt_tm = p.beansFactory.createTableColumn("Rslt.insp_lst_prnt_tm", MCColumnType.DATE);
		p.columnRslt_insp_lst_prnt_flg = p.beansFactory.createTableColumn("Rslt.insp_lst_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_insp_rslt_prnt_tm = p.beansFactory.createTableColumn("Rslt.insp_rslt_prnt_tm", MCColumnType.DATE);
		p.columnRslt_insp_rslt_prnt_flg = p.beansFactory.createTableColumn("Rslt.insp_rslt_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_in_prmt_insp_flg = p.beansFactory.createTableColumn("Rslt.in_prmt_insp_flg", MCColumnType.CHECK);
		p.columnRslt_insp_inst_issue_typ = p.beansFactory.createTableColumn("Rslt.insp_inst_issue_typ", MCColumnType.TEXT);
		p.columnRslt_insp_std_no = p.beansFactory.createTableColumn("Rslt.insp_std_no", MCColumnType.TEXT);
		p.columnRslt_lims_flg = p.beansFactory.createTableColumn("Rslt.lims_flg", MCColumnType.CHECK);
		p.columnRslt_for_lims_flg = p.beansFactory.createTableColumn("Rslt.for_lims_flg", MCColumnType.CHECK);
		p.columnRslt_last_lims_flg = p.beansFactory.createTableColumn("Rslt.last_lims_flg", MCColumnType.CHECK);
		p.columnRslt_insp_schd_no = p.beansFactory.createTableColumn("Rslt.insp_schd_no", MCColumnType.TEXT);
		p.columnRslt_insp_no = p.beansFactory.createTableColumn("Rslt.insp_no", MCColumnType.TEXT);
		p.columnRslt_own_insp_no = p.beansFactory.createTableColumn("Rslt.own_insp_no", MCColumnType.TEXT);
		p.columnRslt_src_no1 = p.beansFactory.createTableColumn("Rslt.src_no1", MCColumnType.TEXT);
		p.columnRslt_src_no2 = p.beansFactory.createTableColumn("Rslt.src_no2", MCColumnType.TEXT);
		p.columnRslt_src_no3 = p.beansFactory.createTableColumn("Rslt.src_no3", MCColumnType.TEXT);
		p.columnRslt_src_no4 = p.beansFactory.createTableColumn("Rslt.src_no4", MCColumnType.TEXT);
		p.columnRslt_insp_lst_no = p.beansFactory.createTableColumn("Rslt.insp_lst_no", MCColumnType.TEXT);
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
		p.columnRslt_schd_upd_cntr = p.beansFactory.createTableColumn("Rslt.schd_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_inst_upd_cntr = p.beansFactory.createTableColumn("Rslt.inst_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_master_dt = p.beansFactory.createTableColumn("Rslt.master_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0040 = p.beansFactory.createButton("Btn.open_MSBFP0040", "open");
		p.Btn_open_MSBFP0050 = p.beansFactory.createButton("Btn.open_MSBFP0050", "open");
		p.Btn_open_MSBFP0070 = p.beansFactory.createButton("Btn.open_MSBFP0070", "open");
		p.Btn_open_MSBFP0020 = p.beansFactory.createButton("Btn.open_MSBFP0020", "open");
		p.Btn_prnt_insp_lst = p.beansFactory.createButton("Btn.prnt_insp_lst", "prnt");
		p.Btn_prnt_insp_rslt = p.beansFactory.createButton("Btn.prnt_insp_rslt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_inst = p.beansFactory.createButton("Btn.upd_inst", "upd");
		p.Btn_upd_aprv = p.beansFactory.createButton("Btn.upd_aprv", "upd");
		p.Btn_prnt_flg = p.beansFactory.createCheckBox("Btn.prnt_flg");
		p.Btn_del_inst = p.beansFactory.createButton("Btn.del_inst", "del");
		p.Btn_del_aprv = p.beansFactory.createButton("Btn.del_aprv", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.InspStsTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [InspStsTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInspStsTyp(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspStsTypPanel.setBorder(p.InspStsTypTitledBorder);
		p.add(p.InspStsTypPanel);
		p.InspStsTypPanel.setNextBeans(p.TopPanel);
		p.InspStsTypPanel.setValueCheck(false);
		p.InspStsTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InspStsTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBFP_InspInstLstReg p) {
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
	protected static void jbInitFold(MSBFP_InspInstLstReg p) {
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
	protected static void jbInitTab1(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.InspLstPrntFlgPanel);
		p.Tab1Panel.add(p.InspLstPrntFlgPanel, null);
		p.InspLstPrntFlgPanel.setNextBeans(p.InspRsltPrntFlgPanel);
		p.Tab1Panel.add(p.InspRsltPrntFlgPanel, null);
		p.InspRsltPrntFlgPanel.setNextBeans(p.LimsPanel);
		p.Tab1Panel.add(p.LimsPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SpplGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.SpplGrpPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.ItmGrpPanel, null);
		p.Tab3Panel.setLastBeans(p.ItmGrpPanel);
	}

	/**
	 * [InspLstPrntFlg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInspLstPrntFlg(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspLstPrntFlgPanel.setBorder(p.InspLstPrntFlgTitledBorder);
		p.InspLstPrntFlgPanel.setValueCheck(false);
		p.InspLstPrntFlgPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InspLstPrntFlgPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [InspRsltPrntFlg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInspRsltPrntFlg(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspRsltPrntFlgPanel.setBorder(p.InspRsltPrntFlgTitledBorder);
		p.InspRsltPrntFlgPanel.setValueCheck(false);
		p.InspRsltPrntFlgPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InspRsltPrntFlgPanel.setLayoutPosition("SWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Lims]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLims(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.LimsPanel.setBorder(p.LimsTitledBorder);
		p.LimsPanel.setValueCheck(false);
		p.LimsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LimsPanel.setLayoutPosition("SWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("UPD");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_APRV);
		p.Cnd_ope_APRV.setActionCommand("APRV");
		p.Cnd_ope_Group.add(p.Cnd_ope_APRV);
		p.ScreenOpePanel.add(p.Cnd_ope_APRV);
		p.Cnd_ope_APRV.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("DEL");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_DEL_APRV);
		p.Cnd_ope_DEL_APRV.setActionCommand("DEL_APRV");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_APRV);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_APRV);
		p.Cnd_ope_DEL_APRV.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT_LST);
		p.Cnd_ope_PRNT_LST.setActionCommand("PRNT_LST");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT_LST);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT_LST);
		p.Cnd_ope_PRNT_LST.setNextBeans(p.Cnd_ope_PRNT_RSLT);
		p.Cnd_ope_PRNT_RSLT.setActionCommand("PRNT_RSLT");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT_RSLT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT_RSLT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.ope_META);
		p.InspStsTypPanel.add(p.Cnd_insp_sts_typ_schd);
		p.InspStsTypPanel.setLastBeans(p.Cnd_insp_sts_typ_schd);
		p.Cnd_insp_sts_typ_schd.setNextBeans(p.Cnd_insp_sts_typ_yet);
		p.Cnd_insp_sts_typ_schd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_sts_typ_schd_META);
		p.InspStsTypPanel.add(p.Cnd_insp_sts_typ_yet);
		p.Cnd_insp_sts_typ_yet.setNextBeans(p.Cnd_insp_sts_typ_ord);
		p.Cnd_insp_sts_typ_yet.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_sts_typ_yet_META);
		p.InspStsTypPanel.add(p.Cnd_insp_sts_typ_ord);
		p.Cnd_insp_sts_typ_ord.setNextBeans(p.Cnd_insp_sts_typ_str);
		p.Cnd_insp_sts_typ_ord.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_sts_typ_ord_META);
		p.InspStsTypPanel.add(p.Cnd_insp_sts_typ_str);
		p.Cnd_insp_sts_typ_str.setNextBeans(p.Cnd_insp_sts_typ_jdg);
		p.Cnd_insp_sts_typ_str.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_sts_typ_str_META);
		p.InspStsTypPanel.add(p.Cnd_insp_sts_typ_jdg);
		p.Cnd_insp_sts_typ_jdg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_sts_typ_jdg_META);
		p.CndPanel.add(p.Cnd_schd_st_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_schd_st_dt_p_PPanel);
		p.Cnd_schd_st_dt_p_PPanel.setNextBeans(p.Cnd_schd_end_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_schd_end_dt_p_PPanel);
		p.Cnd_schd_end_dt_p_PPanel.setNextBeans(p.Cnd_st_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_st_dt_p_PPanel);
		p.Cnd_st_dt_p_PPanel.setNextBeans(p.Cnd_end_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_end_dt_p_PPanel);
		p.Cnd_end_dt_p_PPanel.setNextBeans(p.Cnd_inst_dt_fr);
		p.CndPanel.add(p.Cnd_inst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_inst_dt_fr);
		p.Cnd_inst_dt_fr.setNextBeans(p.Cnd_inst_dt_to);
		p.Cnd_inst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.inst_dt_fr_META);
		p.Cnd_inst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inst_dt_to_Label);
		p.CndPanel.add(p.Cnd_inst_dt_to);
		p.Cnd_inst_dt_to.setNextBeans(p.Cnd_aprv_dt_fr);
		p.Cnd_inst_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.inst_dt_to_META);
		p.Cnd_inst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_aprv_dt_fr);
		p.Cnd_aprv_dt_fr.setNextBeans(p.Cnd_aprv_dt_to);
		p.Cnd_aprv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.aprv_dt_fr_META);
		p.Cnd_aprv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_dt_to_Label);
		p.CndPanel.add(p.Cnd_aprv_dt_to);
		p.Cnd_aprv_dt_to.setNextBeans(p.Cnd_upd_ts_fr);
		p.Cnd_aprv_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.aprv_dt_to_META);
		p.Cnd_aprv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_fr_Label);
		p.CndPanel.add(p.Cnd_upd_ts_fr);
		p.Cnd_upd_ts_fr.setNextBeans(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.upd_ts_fr_META);
		p.Cnd_upd_ts_fr.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_to_Label);
		p.CndPanel.add(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_to.setNextBeans(p.Cnd_insp_lst_prnt_tm_fr);
		p.Cnd_upd_ts_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.upd_ts_to_META);
		p.Cnd_upd_ts_to.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_insp_lst_prnt_tm_fr_Label);
		p.CndPanel.add(p.Cnd_insp_lst_prnt_tm_fr);
		p.Cnd_insp_lst_prnt_tm_fr.setNextBeans(p.Cnd_insp_lst_prnt_tm_to);
		p.Cnd_insp_lst_prnt_tm_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_lst_prnt_tm_fr_META);
		p.Cnd_insp_lst_prnt_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_insp_lst_prnt_tm_to_Label);
		p.CndPanel.add(p.Cnd_insp_lst_prnt_tm_to);
		p.Cnd_insp_lst_prnt_tm_to.setNextBeans(p.Cnd_insp_rslt_prnt_tm_fr);
		p.Cnd_insp_lst_prnt_tm_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_lst_prnt_tm_to_META);
		p.Cnd_insp_lst_prnt_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_insp_rslt_prnt_tm_fr_Label);
		p.CndPanel.add(p.Cnd_insp_rslt_prnt_tm_fr);
		p.Cnd_insp_rslt_prnt_tm_fr.setNextBeans(p.Cnd_insp_rslt_prnt_tm_to);
		p.Cnd_insp_rslt_prnt_tm_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_rslt_prnt_tm_fr_META);
		p.Cnd_insp_rslt_prnt_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_insp_rslt_prnt_tm_to_Label);
		p.CndPanel.add(p.Cnd_insp_rslt_prnt_tm_to);
		p.Cnd_insp_rslt_prnt_tm_to.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_insp_rslt_prnt_tm_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_rslt_prnt_tm_to_META);
		p.Cnd_insp_rslt_prnt_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_mfg_str_ln_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.Cnd_mfg_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_str_ln_cd, true);
		p.Cnd_mfg_str_ln_cd.setLinkBeans(p.Cnd_mfg_str_ln_nm);
		p.CndPanel.add(p.Cnd_mfg_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_str_ln_cd);
		p.Cnd_mfg_str_ln_cd.setNextBeans(p.Cnd_mfg_str_ln_nm);
		p.Cnd_mfg_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.mfg_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_mfg_str_ln_nm);
		p.Cnd_mfg_str_ln_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_mfg_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.mfg_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_insp_typ);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.Cnd_insp_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_insp_typ, true);
		p.Cnd_insp_typ.setLinkBeans(p.Cnd_insp_typ_nm);
		p.CndPanel.add(p.Cnd_insp_typ_Label);
		p.CndPanel.add(p.Cnd_insp_typ);
		p.Cnd_insp_typ.setNextBeans(p.Cnd_insp_typ_nm);
		p.Cnd_insp_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_typ_META);
		p.CndPanel.add(p.Cnd_insp_typ_nm);
		p.Cnd_insp_typ_nm.setNextBeans(p.Cnd_insp_ptn_cd);
		p.Cnd_insp_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_typ_nm_META);
		p.Cnd_insp_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_insp_ptn_cd, true);
		p.Cnd_insp_ptn_cd.setLinkBeans(p.Cnd_insp_ptn_nm);
		p.CndPanel.add(p.Cnd_insp_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_insp_ptn_cd);
		p.Cnd_insp_ptn_cd.setNextBeans(p.Cnd_insp_ptn_nm);
		p.Cnd_insp_ptn_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_ptn_cd_META);
		p.CndPanel.add(p.Cnd_insp_ptn_nm);
		p.Cnd_insp_ptn_nm.setNextBeans(p.Cnd_insp_mtd_typ);
		p.Cnd_insp_ptn_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_insp_ptn_nm, true);
		p.Cnd_insp_mtd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_insp_mtd_typ, true);
		p.Cnd_insp_mtd_typ.setLinkBeans(p.Cnd_insp_mtd_typ_nm);
		p.CndPanel.add(p.Cnd_insp_mtd_typ_Label);
		p.CndPanel.add(p.Cnd_insp_mtd_typ);
		p.Cnd_insp_mtd_typ.setNextBeans(p.Cnd_insp_mtd_typ_nm);
		p.Cnd_insp_mtd_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_mtd_typ_META);
		p.CndPanel.add(p.Cnd_insp_mtd_typ_nm);
		p.Cnd_insp_mtd_typ_nm.setNextBeans(p.Cnd_insp_aprv_sts_typ);
		p.Cnd_insp_mtd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_mtd_typ_nm_META);
		p.Cnd_insp_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_insp_aprv_sts_typ, true);
		p.Cnd_insp_aprv_sts_typ.setLinkBeans(p.Cnd_insp_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_insp_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_insp_aprv_sts_typ);
		p.Cnd_insp_aprv_sts_typ.setNextBeans(p.Cnd_insp_aprv_sts_typ_nm);
		p.Cnd_insp_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_insp_aprv_sts_typ_nm);
		p.Cnd_insp_aprv_sts_typ_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_insp_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_aprv_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_ver_flg,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_ver_flg,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_ver_flg,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm,p.Cnd_ver_flg);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_flg);
		p.Cnd_ver_flg.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.ver_flg_META);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_bp_lot_no);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_bp_lot_no_Label);
		p.CndPanel.add(p.Cnd_bp_lot_no);
		p.Cnd_bp_lot_no.setNextBeans(p.Cnd_insp_no);
		p.Cnd_bp_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.bp_lot_no_META);
		p.setPluralValueEnable(p.Cnd_bp_lot_no, true);
		p.CndPanel.add(p.Cnd_insp_no_Label);
		p.CndPanel.add(p.Cnd_insp_no);
		p.Cnd_insp_no.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_insp_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_no_META);
		p.setPluralValueEnable(p.Cnd_insp_no, true);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_inst_usr_cd);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.CndPanel.add(p.Cnd_inst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_inst_usr_cd);
		p.Cnd_inst_usr_cd.setNextBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.inst_usr_cd_META);
		p.Cnd_inst_usr_cd.addLinkBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_usr_cd, true);
		p.CndPanel.add(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_nm.setNextBeans(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.inst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_usr_nm, true);
		p.CndPanel.add(p.Cnd_inst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_dpt_cd.setNextBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.inst_dpt_cd_META);
		p.Cnd_inst_dpt_cd.addLinkBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_nm.setNextBeans(p.Cnd_mfg_inst_no);
		p.Cnd_inst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.inst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_dpt_nm, true);
		p.CndPanel.add(p.Cnd_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_no);
		p.Cnd_mfg_inst_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_insp_schd_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_insp_schd_no_Label);
		p.CndPanel.add(p.Cnd_insp_schd_no);
		p.Cnd_insp_schd_no.setNextBeans(p.Cnd_insp_lst_no);
		p.Cnd_insp_schd_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_schd_no_META);
		p.setPluralValueEnable(p.Cnd_insp_schd_no, true);
		p.CndPanel.add(p.Cnd_insp_lst_no_Label);
		p.CndPanel.add(p.Cnd_insp_lst_no);
		p.Cnd_insp_lst_no.setNextBeans(p.Cnd_insp_cnt_rmrks);
		p.Cnd_insp_lst_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_lst_no_META);
		p.setPluralValueEnable(p.Cnd_insp_lst_no, true);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks);
		p.Cnd_insp_cnt_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_insp_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_insp_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.InspLstPrntFlgPanel.add(p.Cnd_insp_lst_not_prnt_flg);
		p.InspLstPrntFlgPanel.setLastBeans(p.Cnd_insp_lst_not_prnt_flg);
		p.Cnd_insp_lst_not_prnt_flg.setNextBeans(p.Cnd_insp_lst_prnt_flg);
		p.Cnd_insp_lst_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_lst_not_prnt_flg_META);
		p.InspLstPrntFlgPanel.add(p.Cnd_insp_lst_prnt_flg);
		p.Cnd_insp_lst_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_lst_prnt_flg_META);
		p.InspRsltPrntFlgPanel.add(p.Cnd_insp_rslt_not_prnt_flg);
		p.InspRsltPrntFlgPanel.setLastBeans(p.Cnd_insp_rslt_not_prnt_flg);
		p.Cnd_insp_rslt_not_prnt_flg.setNextBeans(p.Cnd_insp_rslt_prnt_flg);
		p.Cnd_insp_rslt_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_rslt_not_prnt_flg_META);
		p.InspRsltPrntFlgPanel.add(p.Cnd_insp_rslt_prnt_flg);
		p.Cnd_insp_rslt_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.insp_rslt_prnt_flg_META);
		p.SpplGrpPanel.add(p.Cnd_sppl_grp_p_PPanel);
		p.SpplGrpPanel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.LimsPanel.add(p.Cnd_lims_tgt_flg);
		p.LimsPanel.setLastBeans(p.Cnd_lims_tgt_flg);
		p.Cnd_lims_tgt_flg.setNextBeans(p.Cnd_not_lims_tgt_flg);
		p.Cnd_lims_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.lims_tgt_flg_META);
		p.LimsPanel.add(p.Cnd_not_lims_tgt_flg);
		p.Cnd_not_lims_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0030.CndR.not_lims_tgt_flg_META);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel.setValueCheck(false);
		p.ItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplGrp(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.SpplGrpPanel.setValueCheck(false);
		p.SpplGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBFP_InspInstLstReg p) {
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
	protected static void jbInitRPnl(MSBFP_InspInstLstReg p) {
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
	protected static void jbInitBulkSet(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.add(p.BulkSetTab);
		p.BulkSetPanel.setLastBeans(p.BulkSetTab);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetTab.add(p.InspBulkSetPanel, "BulkSet.tab4");
		p.BulkSetTab.setLastBeans(p.InspBulkSetPanel);
		p.InspBulkSetPanel.setNextBeans(p.AprvBulkSetPanel);
		p.BulkSetTab.add(p.AprvBulkSetPanel, "BulkSet.tab5");
	}

	/**
	 * [InspBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInspBulkSet(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.InspBulkSetPanel.setNextBeans(p.AprvBulkSetPanel);
		// ブロックの項目の初期化
		p.InspBulkSetPanel.add(p.InspBulkSet_inst_dt_Label);
		p.InspBulkSetPanel.add(p.InspBulkSet_inst_dt);
		p.InspBulkSetPanel.setLastBeans(p.InspBulkSet_inst_dt);
		p.InspBulkSet_inst_dt.setNextBeans(p.InspBulkSet_inst_usr_dpt_p_PPanel);
		p.InspBulkSet_inst_dt.setRow(p.getInspBulkSetR(), mcframe.clientMSBF.MSBFP0030.InspBulkSetR.inst_dt_META);
		p.InspBulkSet_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.InspBulkSetPanel.add(p.InspBulkSet_inst_usr_dpt_p_PPanel);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.InspBulkSet_inst_dpt_nm);
	}

	/**
	 * [AprvBulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvBulkSet(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
		p.AprvBulkSetPanel.add(p.AprvBulkSet_aprv_dt_Label);
		p.AprvBulkSetPanel.add(p.AprvBulkSet_aprv_dt);
		p.AprvBulkSetPanel.setLastBeans(p.AprvBulkSet_aprv_dt);
		p.AprvBulkSet_aprv_dt.setNextBeans(p.AprvBulkSet_aprv_usr_dpt_p_PPanel);
		p.AprvBulkSet_aprv_dt.setRow(p.getAprvBulkSetR(), mcframe.clientMSBF.MSBFP0030.AprvBulkSetR.aprv_dt_META);
		p.AprvBulkSet_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AprvBulkSetPanel.add(p.AprvBulkSet_aprv_usr_dpt_p_PPanel);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.setNextBeans(p.AprvBulkSet_aprv_rsn_p_PPanel);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.AprvBulkSet_aprv_dpt_nm);
		p.AprvBulkSetPanel.add(p.AprvBulkSet_aprv_rsn_p_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBFP_InspInstLstReg p) {
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
	protected static void jbInitBtn(MSBFP_InspInstLstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBFP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBFP0040);
		p.Btn_open_MSBFP0040.setNextBeans(p.Btn_open_MSBFP0050);
		p.Btn_open_MSBFP0050.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBFP0050);
		p.Btn_open_MSBFP0050.setNextBeans(p.Btn_open_MSBFP0070);
		p.Btn_open_MSBFP0070.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBFP0070);
		p.Btn_open_MSBFP0070.setNextBeans(p.Btn_open_MSBFP0020);
		p.Btn_open_MSBFP0020.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBFP0020);
		p.Btn_open_MSBFP0020.setNextBeans(p.Btn_prnt_insp_lst);
		p.Btn_prnt_insp_lst.setIcon("PRINT");
		p.Btn_prnt_insp_lst.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt_insp_lst);
		p.Btn_prnt_insp_lst.setNextBeans(p.Btn_prnt_insp_rslt);
		p.Btn_prnt_insp_rslt.setIcon("PRINT");
		p.Btn_prnt_insp_rslt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt_insp_rslt);
		p.Btn_prnt_insp_rslt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_inst);
		p.Btn_upd_inst.setIcon("REGISTER");
		p.Btn_upd_inst.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_inst);
		p.Btn_upd_inst.setNextBeans(p.Btn_upd_aprv);
		p.Btn_upd_aprv.setIcon("REGISTER");
		p.Btn_upd_aprv.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_aprv);
		p.Btn_upd_aprv.setNextBeans(p.Btn_prnt_flg);
		p.BtnPanel.add(p.Btn_prnt_flg);
		p.Btn_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBF.MSBFP0030.BtnR.prnt_flg_META);
		p.Btn_del_inst.setIcon("CANCEL");
		p.Btn_del_inst.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_inst);
		p.EastBtnPanel.add(p.Btn_del_inst);
		p.Btn_del_inst.setNextBeans(p.Btn_del_aprv);
		p.Btn_del_aprv.setIcon("CANCEL");
		p.Btn_del_aprv.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_aprv);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_InspInstLstReg p) {
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
		MSBFP_InspInstLstReg_MC.mcInitScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitInspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitTop((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitFold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitTab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitTab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitTab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitInspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitInspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitLims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitCnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitSpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitCtrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitRPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitInspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitAprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitRslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitBtn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.mcInitEastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__REF_EastBtn((MSBFP_InspInstLstReg)this);

		// [REF]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitREF_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitREF_EastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_UPD_INST]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__INST_EastBtn((MSBFP_InspInstLstReg)this);

		// [UPD_INST]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__INST_EastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_UPD_APRV]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__UPD__APRV_EastBtn((MSBFP_InspInstLstReg)this);

		// [UPD_APRV]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitUPD__APRV_EastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_DEL_INST]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__INST_EastBtn((MSBFP_InspInstLstReg)this);

		// [DEL_INST]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__INST_EastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_DEL_APRV]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__DEL__APRV_EastBtn((MSBFP_InspInstLstReg)this);

		// [DEL_APRV]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitDEL__APRV_EastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_INSPLIST_PRNT]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPLIST__PRNT_EastBtn((MSBFP_InspInstLstReg)this);

		// [INSPLIST_PRNT]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPLIST__PRNT_EastBtn((MSBFP_InspInstLstReg)this);

		// [SRCH_INSPRSLT_PRNT]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitSRCH__INSPRSLT__PRNT_EastBtn((MSBFP_InspInstLstReg)this);

		// [INSPRSLT_PRNT]ステータスのモードの設定
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_ScreenOpe((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_InspStsTyp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Top((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Fold((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Tab1((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Tab2((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Tab3((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_InspLstPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_InspRsltPrntFlg((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Lims((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Cnd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_ItmGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_SpplGrp((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Ctrl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_RPnl((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_BulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_InspBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_AprvBulkSet((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Rslt((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_RsltSchd((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_MasterInfo((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_Btn((MSBFP_InspInstLstReg)this);
		MSBFP_InspInstLstReg_MC.statusInitINSPRSLT__PRNT_EastBtn((MSBFP_InspInstLstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [InspStsTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInspStsTyp(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBFP_InspInstLstReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [InspLstPrntFlg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInspLstPrntFlg(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [InspRsltPrntFlg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInspRsltPrntFlg(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Lims]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLims(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_InspInstLstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_APRV.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_DEL_APRV.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT_LST.addAllListener(p);
		p.Cnd_ope_PRNT_RSLT.addAllListener(p);
		p.Cnd_insp_sts_typ_schd.addAllListener(p);
		p.Cnd_insp_sts_typ_yet.addAllListener(p);
		p.Cnd_insp_sts_typ_ord.addAllListener(p);
		p.Cnd_insp_sts_typ_str.addAllListener(p);
		p.Cnd_insp_sts_typ_jdg.addAllListener(p);
		p.Cnd_inst_dt_fr.setListListener(p);
		p.Cnd_inst_dt_fr.addAllListener(p);
		p.Cnd_inst_dt_to.setListListener(p);
		p.Cnd_inst_dt_to.addAllListener(p);
		p.Cnd_aprv_dt_fr.setListListener(p);
		p.Cnd_aprv_dt_fr.addAllListener(p);
		p.Cnd_aprv_dt_to.setListListener(p);
		p.Cnd_aprv_dt_to.addAllListener(p);
		p.Cnd_upd_ts_fr.setListListener(p);
		p.Cnd_upd_ts_fr.addAllListener(p);
		p.Cnd_upd_ts_to.setListListener(p);
		p.Cnd_upd_ts_to.addAllListener(p);
		p.Cnd_insp_lst_prnt_tm_fr.setListListener(p);
		p.Cnd_insp_lst_prnt_tm_fr.addAllListener(p);
		p.Cnd_insp_lst_prnt_tm_to.setListListener(p);
		p.Cnd_insp_lst_prnt_tm_to.addAllListener(p);
		p.Cnd_insp_rslt_prnt_tm_fr.setListListener(p);
		p.Cnd_insp_rslt_prnt_tm_fr.addAllListener(p);
		p.Cnd_insp_rslt_prnt_tm_to.setListListener(p);
		p.Cnd_insp_rslt_prnt_tm_to.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_mfg_str_ln_cd.setListListener(p);
		p.Cnd_mfg_str_ln_cd.addAllListener(p);
		p.Cnd_mfg_str_ln_nm.setListListener(p);
		p.Cnd_mfg_str_ln_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_insp_typ.setListListener(p);
		p.Cnd_insp_typ.addAllListener(p);
		p.Cnd_insp_typ_nm.setListListener(p);
		p.Cnd_insp_typ_nm.addAllListener(p);
		p.Cnd_insp_ptn_cd.setListListener(p);
		p.Cnd_insp_ptn_cd.addAllListener(p);
		p.Cnd_insp_ptn_nm.setListListener(p);
		p.Cnd_insp_ptn_nm.addAllListener(p);
		p.Cnd_insp_mtd_typ.setListListener(p);
		p.Cnd_insp_mtd_typ.addAllListener(p);
		p.Cnd_insp_mtd_typ_nm.setListListener(p);
		p.Cnd_insp_mtd_typ_nm.addAllListener(p);
		p.Cnd_insp_aprv_sts_typ.setListListener(p);
		p.Cnd_insp_aprv_sts_typ.addAllListener(p);
		p.Cnd_insp_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_insp_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ver_flg.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_bp_lot_no.setListListener(p);
		p.Cnd_bp_lot_no.addAllListener(p);
		p.Cnd_insp_no.setListListener(p);
		p.Cnd_insp_no.addAllListener(p);
		p.Cnd_inst_usr_cd.setListListener(p);
		p.Cnd_inst_usr_cd.addAllListener(p);
		p.Cnd_inst_usr_nm.setListListener(p);
		p.Cnd_inst_usr_nm.addAllListener(p);
		p.Cnd_inst_dpt_cd.setListListener(p);
		p.Cnd_inst_dpt_cd.addAllListener(p);
		p.Cnd_inst_dpt_nm.setListListener(p);
		p.Cnd_inst_dpt_nm.addAllListener(p);
		p.Cnd_mfg_inst_no.setListListener(p);
		p.Cnd_mfg_inst_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_insp_schd_no.setListListener(p);
		p.Cnd_insp_schd_no.addAllListener(p);
		p.Cnd_insp_lst_no.setListListener(p);
		p.Cnd_insp_lst_no.addAllListener(p);
		p.Cnd_insp_cnt_rmrks.setListListener(p);
		p.Cnd_insp_cnt_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_insp_lst_not_prnt_flg.addAllListener(p);
		p.Cnd_insp_lst_prnt_flg.addAllListener(p);
		p.Cnd_insp_rslt_not_prnt_flg.addAllListener(p);
		p.Cnd_insp_rslt_prnt_flg.addAllListener(p);
		p.Cnd_lims_tgt_flg.addAllListener(p);
		p.Cnd_not_lims_tgt_flg.addAllListener(p);
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [SpplGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplGrp(MSBFP_InspInstLstReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBFP_InspInstLstReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBFP_InspInstLstReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBFP_InspInstLstReg p) {
		p.BulkSetTab.addAllListener(p);
	}

	/**
	 *  [InspBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInspBulkSet(MSBFP_InspInstLstReg p) {
		p.InspBulkSet_inst_dt.setListListener(p);
		p.InspBulkSet_inst_dt.addAllListener(p);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [AprvBulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvBulkSet(MSBFP_InspInstLstReg p) {
		p.AprvBulkSet_aprv_dt.setListListener(p);
		p.AprvBulkSet_aprv_dt.addAllListener(p);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBFP_InspInstLstReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_insp_sts_typ.addAllListener(p);
		p.columnRslt_insp_sts_typ.setListListener(p);
		p.columnRslt_insp_sts_typ_nm.addAllListener(p);
		p.columnRslt_insp_sts_typ_nm.setListListener(p);
		p.columnRslt_ver_no.addAllListener(p);
		p.columnRslt_ver_no.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_insp_lt.addAllListener(p);
		p.columnRslt_insp_lt.setListListener(p);
		p.columnRslt_vld_dt_now.addAllListener(p);
		p.columnRslt_vld_dt_now.setListListener(p);
		p.columnRslt_lmt_up_flg.addAllListener(p);
		p.columnRslt_insp_aprv_flg.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ.setListListener(p);
		p.columnRslt_insp_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_dt.addAllListener(p);
		p.columnRslt_aprv_dt.setListListener(p);
		p.Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_insp_cnt_rmrks.addAllListener(p);
		p.columnRslt_insp_cnt_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_lot_rmrks.addAllListener(p);
		p.columnRslt_lot_rmrks.setListListener(p);
		p.columnRslt_insp_typ.addAllListener(p);
		p.columnRslt_insp_typ.setListListener(p);
		p.columnRslt_insp_typ_nm.addAllListener(p);
		p.columnRslt_insp_typ_nm.setListListener(p);
		p.columnRslt_insp_ptn_cd.addAllListener(p);
		p.columnRslt_insp_ptn_cd.setListListener(p);
		p.columnRslt_insp_ptn_nm.addAllListener(p);
		p.columnRslt_insp_ptn_nm.setListListener(p);
		p.columnRslt_insp_mtd_typ.addAllListener(p);
		p.columnRslt_insp_mtd_typ.setListListener(p);
		p.columnRslt_insp_mtd_typ_nm.addAllListener(p);
		p.columnRslt_insp_mtd_typ_nm.setListListener(p);
		p.columnRslt_std_req_flg.addAllListener(p);
		p.columnRslt_std_cnf_req_flg.addAllListener(p);
		p.columnRslt_plnt_aprv_flg.addAllListener(p);
		p.columnRslt_col_schd_flg.addAllListener(p);
		p.columnRslt_to_site_cd.addAllListener(p);
		p.columnRslt_to_site_cd.setListListener(p);
		p.columnRslt_to_site_nm.addAllListener(p);
		p.columnRslt_to_site_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_mfg_str_ln_cd.addAllListener(p);
		p.columnRslt_mfg_str_ln_cd.setListListener(p);
		p.columnRslt_mfg_str_ln_nm.addAllListener(p);
		p.columnRslt_mfg_str_ln_nm.setListListener(p);
		p.columnRslt_mfg_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_bp_lot_no.addAllListener(p);
		p.columnRslt_bp_lot_no.setListListener(p);
		p.columnRslt_insp_bind_typ.addAllListener(p);
		p.columnRslt_insp_bind_typ.setListListener(p);
		p.columnRslt_insp_bind_typ_nm.addAllListener(p);
		p.columnRslt_insp_bind_typ_nm.setListListener(p);
		p.columnRslt_inst_dt.addAllListener(p);
		p.columnRslt_inst_dt.setListListener(p);
		p.columnRslt_inst_usr_cd.addAllListener(p);
		p.columnRslt_inst_usr_cd.setListListener(p);
		p.columnRslt_inst_usr_nm.addAllListener(p);
		p.columnRslt_inst_usr_nm.setListListener(p);
		p.columnRslt_inst_dpt_cd.addAllListener(p);
		p.columnRslt_inst_dpt_cd.setListListener(p);
		p.columnRslt_inst_dpt_nm.addAllListener(p);
		p.columnRslt_inst_dpt_nm.setListListener(p);
		p.columnRslt_insp_freq.addAllListener(p);
		p.columnRslt_insp_freq.setListListener(p);
		p.columnRslt_insp_lst_prnt_tm.addAllListener(p);
		p.columnRslt_insp_lst_prnt_tm.setListListener(p);
		p.columnRslt_insp_lst_prnt_flg.addAllListener(p);
		p.columnRslt_insp_rslt_prnt_tm.addAllListener(p);
		p.columnRslt_insp_rslt_prnt_tm.setListListener(p);
		p.columnRslt_insp_rslt_prnt_flg.addAllListener(p);
		p.columnRslt_in_prmt_insp_flg.addAllListener(p);
		p.columnRslt_insp_inst_issue_typ.addAllListener(p);
		p.columnRslt_insp_inst_issue_typ.setListListener(p);
		p.columnRslt_insp_std_no.addAllListener(p);
		p.columnRslt_insp_std_no.setListListener(p);
		p.columnRslt_lims_flg.addAllListener(p);
		p.columnRslt_for_lims_flg.addAllListener(p);
		p.columnRslt_last_lims_flg.addAllListener(p);
		p.columnRslt_insp_schd_no.addAllListener(p);
		p.columnRslt_insp_schd_no.setListListener(p);
		p.columnRslt_insp_no.addAllListener(p);
		p.columnRslt_insp_no.setListListener(p);
		p.columnRslt_own_insp_no.addAllListener(p);
		p.columnRslt_own_insp_no.setListListener(p);
		p.columnRslt_src_no1.addAllListener(p);
		p.columnRslt_src_no1.setListListener(p);
		p.columnRslt_src_no2.addAllListener(p);
		p.columnRslt_src_no2.setListListener(p);
		p.columnRslt_src_no3.addAllListener(p);
		p.columnRslt_src_no3.setListListener(p);
		p.columnRslt_src_no4.addAllListener(p);
		p.columnRslt_src_no4.setListListener(p);
		p.columnRslt_insp_lst_no.addAllListener(p);
		p.columnRslt_insp_lst_no.setListListener(p);
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
		p.columnRslt_schd_upd_cntr.addAllListener(p);
		p.columnRslt_schd_upd_cntr.setListListener(p);
		p.columnRslt_inst_upd_cntr.addAllListener(p);
		p.columnRslt_inst_upd_cntr.setListListener(p);
		p.columnRslt_master_dt.addAllListener(p);
		p.columnRslt_master_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_InspInstLstReg p) {
		p.Btn_open_MSBFP0040.addAllListener(p);
		p.Btn_open_MSBFP0040.setAPMethodName("doBtn_open_MSBFP0040");
		p.Btn_open_MSBFP0050.addAllListener(p);
		p.Btn_open_MSBFP0050.setAPMethodName("doBtn_open_MSBFP0050");
		p.Btn_open_MSBFP0070.addAllListener(p);
		p.Btn_open_MSBFP0070.setAPMethodName("doBtn_open_MSBFP0070");
		p.Btn_open_MSBFP0020.addAllListener(p);
		p.Btn_open_MSBFP0020.setAPMethodName("doBtn_open_MSBFP0020");
		p.Btn_prnt_insp_lst.addAllListener(p);
		p.Btn_prnt_insp_lst.setAPMethodName("doBtn_prnt_insp_lst");
		p.Btn_prnt_insp_rslt.addAllListener(p);
		p.Btn_prnt_insp_rslt.setAPMethodName("doBtn_prnt_insp_rslt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_inst.addAllListener(p);
		p.Btn_upd_inst.setAPMethodName("doBtn_upd_inst");
		p.Btn_upd_aprv.addAllListener(p);
		p.Btn_upd_aprv.setAPMethodName("doBtn_upd_aprv");
		p.Btn_prnt_flg.addAllListener(p);
		p.Btn_del_inst.addAllListener(p);
		p.Btn_del_inst.setAPMethodName("doBtn_del_inst");
		p.Btn_del_aprv.addAllListener(p);
		p.Btn_del_aprv.setAPMethodName("doBtn_del_aprv");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_InspInstLstReg p) {
	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitREF_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitREF_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_yet.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_ord.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_str.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_sts_typ_jdg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_for_lims_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_schd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD_INST, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_dt_to.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD_INST, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_aprv_dt.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_UPD_INST, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_UPD_INST, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_UPD_INST, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_UPD_INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD_INST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD_INST, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_UPD_INST, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UPD_INST, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_UPD_INST, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, SRCH_UPD_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__INST_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_dt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_end_dt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_inst_dt_fr.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_dt_to.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_fr.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_mtd_typ.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_lst_prnt_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, UPD_INST, MCMode.ENABLE);

	}

	/**
	 * [UPD_INST]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, UPD_INST, MCMode.ENABLE);

	}

	/**
	 * [UPD_INST]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [UPD_INST]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [UPD_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_end_dt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_vld_dt_now.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_aprv_dt.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_INST, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_INST, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD_INST, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD_INST, MCMode.ENABLE);
		p.columnRslt_lot_rmrks.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.columnRslt_insp_ptn_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.columnRslt_col_schd_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, UPD_INST, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_INST, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_INST, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_INST]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, UPD_INST, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, UPD_INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_upd_inst.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, UPD_INST, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, UPD_INST, MCMode.ENABLE);
		p.Btn_del_inst.putMode(p, UPD_INST, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, UPD_INST, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INST_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD_APRV, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD_APRV, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_UPD_APRV, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD_APRV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_UPD_APRV, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_UPD_APRV, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_UPD_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD_APRV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD_APRV, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.Btn_upd_aprv.putMode(p, SRCH_UPD_APRV, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UPD_APRV, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_UPD_APRV, MCMode.INVISIBLE);
		p.Btn_del_aprv.putMode(p, SRCH_UPD_APRV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__APRV_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [UPD_APRV]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);

	}

	/**
	 * [UPD_APRV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_upd_inst.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Btn_upd_aprv.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Btn_del_aprv.putMode(p, UPD_APRV, MCMode.DISABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_INST, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_INST, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_DEL_INST, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_DEL_INST, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_DEL_INST, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_DEL_INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_INST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_INST, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);
		p.Btn_upd_aprv.putMode(p, SRCH_DEL_INST, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DEL_INST, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_DEL_INST, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, SRCH_DEL_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INST_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, DEL_INST, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL_INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, DEL_INST, MCMode.ENABLE);

	}

	/**
	 * [DEL_INST]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, DEL_INST, MCMode.ENABLE);

	}

	/**
	 * [DEL_INST]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL_INST]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [DEL_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, DEL_INST, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, DEL_INST, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, DEL_INST, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_INST]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, DEL_INST, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, DEL_INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_upd_inst.putMode(p, DEL_INST, MCMode.INVISIBLE);
		p.Btn_upd_aprv.putMode(p, DEL_INST, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DEL_INST, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, DEL_INST, MCMode.ENABLE);
		p.Btn_del_aprv.putMode(p, DEL_INST, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INST_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_APRV, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_APRV, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_DEL_APRV, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.Btn_upd_aprv.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.Btn_del_aprv.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_RPnl(MSBFP_InspInstLstReg p){
		p.RPnl_dwnld.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL_APRV]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);

	}

	/**
	 * [DEL_APRV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.columnRslt_for_lims_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_upd_inst.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Btn_upd_aprv.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Btn_del_aprv.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INSPLIST_PRNT, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_RPnl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_INSPLIST_PRNT, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, SRCH_INSPLIST_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INSPLIST_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPLIST__PRNT_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, INSPLIST_PRNT, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_RPnl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, INSPLIST_PRNT, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_for_lims_flg.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INSPLIST_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_prnt_insp_rslt.putMode(p, INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INSPLIST_PRNT, MCMode.ENABLE);
		p.Btn_upd_inst.putMode(p, INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, INSPLIST_PRNT, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, INSPLIST_PRNT, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, INSPLIST_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [INSPLIST_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINSPLIST__PRNT_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_mtd_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_RPnl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_for_lims_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_upd_inst.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, SRCH_INSPRSLT_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INSPRSLT_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSPRSLT__PRNT_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_ScreenOpe(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[InspStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_InspStsTyp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Top(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Fold(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Tab1(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Tab2(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Tab3(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[InspLstPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_InspLstPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[InspRsltPrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_InspRsltPrntFlg(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Lims]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Lims(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Cnd(MSBFP_InspInstLstReg p){
		p.Cnd_ope_Group.putMode(p, INSPRSLT_PRNT, MCMode.REQUIRED);
		p.Cnd_insp_sts_typ_schd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_yet.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_ord.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_str.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_sts_typ_jdg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_schd_end_dt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_st_dt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_dt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_fr.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_tm_to.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_fr.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_tm_to.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_ptn_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_ptn_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_mtd_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_mtd_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_insp_aprv_sts_typ.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_aprv_sts_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_inst_usr_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_no.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_not_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_lst_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_not_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_insp_rslt_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_lims_tgt_flg.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Cnd_not_lims_tgt_flg.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_ItmGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_SpplGrp(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Ctrl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_RPnl(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_BulkSet(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[InspBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_InspBulkSet(MSBFP_InspInstLstReg p){
		p.InspBulkSet_inst_dt.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.InspBulkSet_inst_usr_dpt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[AprvBulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_AprvBulkSet(MSBFP_InspInstLstReg p){
		p.AprvBulkSet_aprv_dt.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.AprvBulkSet_aprv_usr_dpt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.AprvBulkSet_aprv_rsn_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Rslt(MSBFP_InspInstLstReg p){
		p.columnRslt_check.putMode(p, INSPRSLT_PRNT, MCMode.REQUIRED);
		p.columnRslt_insp_sts_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_yield_qty_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_lt.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_st_dt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_vld_dt_now.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_aprv_usr_dpt_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_ptn_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_req_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_std_cnf_req_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_col_schd_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_to_site_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_bind_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_freq.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_tm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_tm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_rslt_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_prmt_insp_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_inst_issue_typ.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_std_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lims_flg.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_for_lims_flg.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_last_lims_flg.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_own_insp_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no1.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no2.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no3.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_no4.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_lst_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INSPRSLT_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_upd_cntr.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_inst_upd_cntr.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[RsltSchd]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_RsltSchd(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[MasterInfo]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_MasterInfo(MSBFP_InspInstLstReg p){

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_Btn(MSBFP_InspInstLstReg p){
		p.Btn_open_MSBFP0040.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0050.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0070.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0020.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_prnt_insp_lst.putMode(p, INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_prnt_insp_rslt.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INSPRSLT_PRNT, MCMode.ENABLE);
		p.Btn_upd_inst.putMode(p, INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, INSPRSLT_PRNT, MCMode.READ_ONLY);
		p.Btn_del_inst.putMode(p, INSPRSLT_PRNT, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, INSPRSLT_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [INSPRSLT_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINSPRSLT__PRNT_EastBtn(MSBFP_InspInstLstReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_UPD_INST;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBFP_InspInstLstReg_MC.setTableConfigRslt((MSBFP_InspInstLstReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBFP_InspInstLstReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_insp_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_sts_typ);
		p.columnRslt_insp_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_ver_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.ver_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_no);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_not_yield_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_insp_lt.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_lt);
		p.RsltTable.addTable(p.Rslt_st_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_end_dt_p_PPanel.YmdHmTable);
		p.columnRslt_vld_dt_now.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.vld_dt_now_META);
		p.columnRslt_vld_dt_now.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt_now);
		p.columnRslt_lmt_up_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.lmt_up_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_up_flg);
		p.columnRslt_insp_aprv_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_flg);
		p.columnRslt_insp_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_sts_typ);
		p.columnRslt_insp_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_sts_typ_nm);
		p.columnRslt_aprv_dt.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.aprv_dt_META);
		p.columnRslt_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_dt);
		p.RsltTable.addTable(p.Rslt_aprv_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_aprv_dpt_nm);
		p.RsltTable.addTable(p.Rslt_aprv_rsn_p_PPanel.TxtTable);
		p.columnRslt_insp_cnt_rmrks.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_cnt_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_lot_rmrks.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.lot_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_rmrks);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_typ);
		p.columnRslt_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_typ_nm);
		p.columnRslt_insp_ptn_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_ptn_cd_META);
		p.columnRslt_insp_ptn_cd.addLinkBeans(p.columnRslt_insp_ptn_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_ptn_cd);
		p.columnRslt_insp_ptn_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_ptn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_ptn_nm);
		p.columnRslt_insp_mtd_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_mtd_typ_META);
		p.columnRslt_insp_mtd_typ.addLinkBeans(p.columnRslt_insp_mtd_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_mtd_typ);
		p.columnRslt_insp_mtd_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_mtd_typ_nm);
		p.columnRslt_std_req_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.std_req_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std_req_flg);
		p.columnRslt_std_cnf_req_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.std_cnf_req_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std_cnf_req_flg);
		p.columnRslt_plnt_aprv_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.plnt_aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_flg);
		p.columnRslt_col_schd_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.col_schd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_schd_flg);
		p.columnRslt_to_site_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.to_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_to_site_cd);
		p.columnRslt_to_site_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.to_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_to_site_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_str_ln_cd_none_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd_none_flg);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_mfg_str_ln_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.mfg_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_cd);
		p.columnRslt_mfg_str_ln_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.mfg_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_nm);
		p.columnRslt_mfg_str_ln_cd_none_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.mfg_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_cd_none_flg);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.columnRslt_insp_bind_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_bind_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_bind_typ);
		p.columnRslt_insp_bind_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_bind_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_bind_typ_nm);
		p.columnRslt_inst_dt.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.inst_dt_META);
		p.columnRslt_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dt);
		p.columnRslt_inst_usr_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.inst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_usr_cd);
		p.columnRslt_inst_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.inst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_usr_nm);
		p.columnRslt_inst_dpt_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.inst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dpt_cd);
		p.columnRslt_inst_dpt_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.inst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dpt_nm);
		p.columnRslt_insp_freq.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_freq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_freq);
		p.columnRslt_insp_lst_prnt_tm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_lst_prnt_tm_META);
		p.columnRslt_insp_lst_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_lst_prnt_tm);
		p.columnRslt_insp_lst_prnt_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_lst_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_lst_prnt_flg);
		p.columnRslt_insp_rslt_prnt_tm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_rslt_prnt_tm_META);
		p.columnRslt_insp_rslt_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_rslt_prnt_tm);
		p.columnRslt_insp_rslt_prnt_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_rslt_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_rslt_prnt_flg);
		p.columnRslt_in_prmt_insp_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.in_prmt_insp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_prmt_insp_flg);
		p.columnRslt_insp_inst_issue_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_inst_issue_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_inst_issue_typ);
		p.columnRslt_insp_std_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_std_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_std_no);
		p.columnRslt_lims_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.lims_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lims_flg);
		p.columnRslt_for_lims_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.for_lims_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_for_lims_flg);
		p.columnRslt_last_lims_flg.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.last_lims_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_last_lims_flg);
		p.columnRslt_insp_schd_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_schd_no);
		p.columnRslt_insp_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_no);
		p.columnRslt_own_insp_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.own_insp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_own_insp_no);
		p.columnRslt_src_no1.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.src_no1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_no1);
		p.columnRslt_src_no2.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.src_no2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_no2);
		p.columnRslt_src_no3.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.src_no3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_no3);
		p.columnRslt_src_no4.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.src_no4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_no4);
		p.columnRslt_insp_lst_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.insp_lst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_lst_no);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_sppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_schd_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.schd_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_upd_cntr);
		p.columnRslt_inst_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.inst_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_upd_cntr);
		p.columnRslt_master_dt.setMeta(mcframe.clientMSBF.MSBFP0030.RsltR.master_dt_META);
		p.columnRslt_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_master_dt);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_mfg_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_str_ln_cd.getListConfig().setPutter(getCnd_mfg_str_ln_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_insp_typ.getListConfig().setPutter(getCnd_insp_typ_ListPutter());
		Cnd_insp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_insp_ptn_cd.getListConfig().setPutter(getCnd_insp_ptn_cd_ListPutter());
		Cnd_insp_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_insp_mtd_typ.getListConfig().setPutter(getCnd_insp_mtd_typ_ListPutter());
		Cnd_insp_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_insp_aprv_sts_typ.getListConfig().setPutter(getCnd_insp_aprv_sts_typ_ListPutter());
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
		Cnd_inst_usr_cd.getListConfig().setPutter(getCnd_inst_usr_cd_ListPutter());
		Cnd_inst_dpt_cd.getListConfig().setPutter(getCnd_inst_dpt_cd_ListPutter());
		InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getInspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getAprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnRslt_insp_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_insp_sts_typ.getListConfig().setPutter(getRslt_insp_sts_typ_ListPutter());
		Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_insp_typ.getListConfig().setPutter(getRslt_insp_typ_ListPutter());
		columnRslt_insp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_insp_ptn_cd.getListConfig().setPutter(getRslt_insp_ptn_cd_ListPutter());
		columnRslt_insp_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_insp_mtd_typ.getListConfig().setPutter(getRslt_insp_mtd_typ_ListPutter());
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UPD_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPD_INSTStatus() {
		status = SRCH_UPD_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_INSTStatus() {
		status = UPD_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UPD_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPD_APRVStatus() {
		status = SRCH_UPD_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_APRVStatus() {
		status = UPD_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_INSTStatus() {
		status = SRCH_DEL_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_INSTStatus() {
		status = DEL_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_APRVStatus() {
		status = SRCH_DEL_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_APRVStatus() {
		status = DEL_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_INSPLIST_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSPLIST_PRNTStatus() {
		status = SRCH_INSPLIST_PRNT;
		setAllStatus(status);
	}

	/**
	 * この画面を[INSPLIST_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSPLIST_PRNTStatus() {
		status = INSPLIST_PRNT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_INSPRSLT_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSPRSLT_PRNTStatus() {
		status = SRCH_INSPRSLT_PRNT;
		setAllStatus(status);
	}

	/**
	 * この画面を[INSPRSLT_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSPRSLT_PRNTStatus() {
		status = INSPRSLT_PRNT;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_UPD_INST.equals(status)) {
			setSRCH_UPD_INSTStatus();
		}
		else if (UPD_INST.equals(status)) {
			setUPD_INSTStatus();
		}
		else if (SRCH_UPD_APRV.equals(status)) {
			setSRCH_UPD_APRVStatus();
		}
		else if (UPD_APRV.equals(status)) {
			setUPD_APRVStatus();
		}
		else if (SRCH_DEL_INST.equals(status)) {
			setSRCH_DEL_INSTStatus();
		}
		else if (DEL_INST.equals(status)) {
			setDEL_INSTStatus();
		}
		else if (SRCH_DEL_APRV.equals(status)) {
			setSRCH_DEL_APRVStatus();
		}
		else if (DEL_APRV.equals(status)) {
			setDEL_APRVStatus();
		}
		else if (SRCH_INSPLIST_PRNT.equals(status)) {
			setSRCH_INSPLIST_PRNTStatus();
		}
		else if (INSPLIST_PRNT.equals(status)) {
			setINSPLIST_PRNTStatus();
		}
		else if (SRCH_INSPRSLT_PRNT.equals(status)) {
			setSRCH_INSPRSLT_PRNTStatus();
		}
		else if (INSPRSLT_PRNT.equals(status)) {
			setINSPRSLT_PRNTStatus();
		}
	}

	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InspTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_insp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_insp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_insp_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_insp_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspMtdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_insp_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_insp_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InspAprvStsTyp");
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
	 * [InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createInspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createAprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_insp_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_insp_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_insp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_insp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmInspPtn");
		return lp;
	}
	 
	/**
	 * [Rslt_insp_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_insp_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspMtdTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_mfg_str_ln_cd) return getCnd_mfg_str_ln_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_insp_typ) return getCnd_insp_typ(row, info);
		if(combo == Cnd_insp_ptn_cd) return getCnd_insp_ptn_cd(row, info);
		if(combo == Cnd_insp_mtd_typ) return getCnd_insp_mtd_typ(row, info);
		if(combo == Cnd_insp_aprv_sts_typ) return getCnd_insp_aprv_sts_typ(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_inst_usr_cd) return getCnd_inst_usr_cd(row, info);
		if(combo == Cnd_inst_dpt_cd) return getCnd_inst_dpt_cd(row, info);
		if(combo == InspBulkSet_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getInspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == AprvBulkSet_aprv_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getAprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_insp_sts_typ) return getRslt_insp_sts_typ(row, info);
		if(combo == Rslt_aprv_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_insp_typ) return getRslt_insp_typ(row, info);
		if(combo == columnRslt_insp_ptn_cd) return getRslt_insp_ptn_cd(row, info);
		if(combo == columnRslt_insp_mtd_typ) return getRslt_insp_mtd_typ(row, info);
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
		else if (ap == Btn_open_MSBFP0040) doBtn_open_MSBFP0040(info);
		else if (ap == Btn_open_MSBFP0050) doBtn_open_MSBFP0050(info);
		else if (ap == Btn_open_MSBFP0070) doBtn_open_MSBFP0070(info);
		else if (ap == Btn_open_MSBFP0020) doBtn_open_MSBFP0020(info);
		else if (ap == Btn_prnt_insp_lst) doBtn_prnt_insp_lst(info);
		else if (ap == Btn_prnt_insp_rslt) doBtn_prnt_insp_rslt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_inst) doBtn_upd_inst(info);
		else if (ap == Btn_upd_aprv) doBtn_upd_aprv(info);
		else if (ap == Btn_del_inst) doBtn_del_inst(info);
		else if (ap == Btn_del_aprv) doBtn_del_aprv(info);
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
	 * [Btn]パネルの[open_MSBFP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0020]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0020(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_insp_lst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_insp_lst(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_insp_rslt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_insp_rslt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_inst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_inst(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_aprv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_aprv(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_inst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_inst(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_aprv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_aprv(MCEventInfo info);

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
		if (vc == BulkSetTab) return doBulkSet_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_insp_sts_typ_schd) return doCnd_insp_sts_typ_schd_VC(info);
		if (vc == Cnd_insp_sts_typ_yet) return doCnd_insp_sts_typ_yet_VC(info);
		if (vc == Cnd_insp_sts_typ_ord) return doCnd_insp_sts_typ_ord_VC(info);
		if (vc == Cnd_insp_sts_typ_str) return doCnd_insp_sts_typ_str_VC(info);
		if (vc == Cnd_insp_sts_typ_jdg) return doCnd_insp_sts_typ_jdg_VC(info);
		if (vc == Cnd_inst_dt_fr) return doCnd_inst_dt_fr_VC(info);
		if (vc == Cnd_inst_dt_to) return doCnd_inst_dt_to_VC(info);
		if (vc == Cnd_aprv_dt_fr) return doCnd_aprv_dt_fr_VC(info);
		if (vc == Cnd_aprv_dt_to) return doCnd_aprv_dt_to_VC(info);
		if (vc == Cnd_upd_ts_fr) return doCnd_upd_ts_fr_VC(info);
		if (vc == Cnd_upd_ts_to) return doCnd_upd_ts_to_VC(info);
		if (vc == Cnd_insp_lst_prnt_tm_fr) return doCnd_insp_lst_prnt_tm_fr_VC(info);
		if (vc == Cnd_insp_lst_prnt_tm_to) return doCnd_insp_lst_prnt_tm_to_VC(info);
		if (vc == Cnd_insp_rslt_prnt_tm_fr) return doCnd_insp_rslt_prnt_tm_fr_VC(info);
		if (vc == Cnd_insp_rslt_prnt_tm_to) return doCnd_insp_rslt_prnt_tm_to_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_mfg_str_ln_cd) return doCnd_mfg_str_ln_cd_VC(info);
		if (vc == Cnd_mfg_str_ln_nm) return doCnd_mfg_str_ln_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_insp_typ) return doCnd_insp_typ_VC(info);
		if (vc == Cnd_insp_typ_nm) return doCnd_insp_typ_nm_VC(info);
		if (vc == Cnd_insp_ptn_cd) return doCnd_insp_ptn_cd_VC(info);
		if (vc == Cnd_insp_ptn_nm) return doCnd_insp_ptn_nm_VC(info);
		if (vc == Cnd_insp_mtd_typ) return doCnd_insp_mtd_typ_VC(info);
		if (vc == Cnd_insp_mtd_typ_nm) return doCnd_insp_mtd_typ_nm_VC(info);
		if (vc == Cnd_insp_aprv_sts_typ) return doCnd_insp_aprv_sts_typ_VC(info);
		if (vc == Cnd_insp_aprv_sts_typ_nm) return doCnd_insp_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_ver_flg) return doCnd_ver_flg_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_bp_lot_no) return doCnd_bp_lot_no_VC(info);
		if (vc == Cnd_insp_no) return doCnd_insp_no_VC(info);
		if (vc == Cnd_inst_usr_cd) return doCnd_inst_usr_cd_VC(info);
		if (vc == Cnd_inst_usr_nm) return doCnd_inst_usr_nm_VC(info);
		if (vc == Cnd_inst_dpt_cd) return doCnd_inst_dpt_cd_VC(info);
		if (vc == Cnd_inst_dpt_nm) return doCnd_inst_dpt_nm_VC(info);
		if (vc == Cnd_mfg_inst_no) return doCnd_mfg_inst_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_insp_schd_no) return doCnd_insp_schd_no_VC(info);
		if (vc == Cnd_insp_lst_no) return doCnd_insp_lst_no_VC(info);
		if (vc == Cnd_insp_cnt_rmrks) return doCnd_insp_cnt_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_insp_lst_not_prnt_flg) return doCnd_insp_lst_not_prnt_flg_VC(info);
		if (vc == Cnd_insp_lst_prnt_flg) return doCnd_insp_lst_prnt_flg_VC(info);
		if (vc == Cnd_insp_rslt_not_prnt_flg) return doCnd_insp_rslt_not_prnt_flg_VC(info);
		if (vc == Cnd_insp_rslt_prnt_flg) return doCnd_insp_rslt_prnt_flg_VC(info);
		if (vc == Cnd_lims_tgt_flg) return doCnd_lims_tgt_flg_VC(info);
		if (vc == Cnd_not_lims_tgt_flg) return doCnd_not_lims_tgt_flg_VC(info);
		if (vc == InspBulkSet_inst_dt) return doInspBulkSet_inst_dt_VC(info);
		if (vc == AprvBulkSet_aprv_dt) return doAprvBulkSet_aprv_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_insp_sts_typ) return doRslt_insp_sts_typ_VC(info);
		if (vc == columnRslt_insp_sts_typ_nm) return doRslt_insp_sts_typ_nm_VC(info);
		if (vc == columnRslt_ver_no) return doRslt_ver_no_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_insp_lt) return doRslt_insp_lt_VC(info);
		if (vc == columnRslt_vld_dt_now) return doRslt_vld_dt_now_VC(info);
		if (vc == columnRslt_lmt_up_flg) return doRslt_lmt_up_flg_VC(info);
		if (vc == columnRslt_insp_aprv_flg) return doRslt_insp_aprv_flg_VC(info);
		if (vc == columnRslt_insp_aprv_sts_typ) return doRslt_insp_aprv_sts_typ_VC(info);
		if (vc == columnRslt_insp_aprv_sts_typ_nm) return doRslt_insp_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_dt) return doRslt_aprv_dt_VC(info);
		if (vc == columnRslt_insp_cnt_rmrks) return doRslt_insp_cnt_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_lot_rmrks) return doRslt_lot_rmrks_VC(info);
		if (vc == columnRslt_insp_typ) return doRslt_insp_typ_VC(info);
		if (vc == columnRslt_insp_typ_nm) return doRslt_insp_typ_nm_VC(info);
		if (vc == columnRslt_insp_ptn_cd) return doRslt_insp_ptn_cd_VC(info);
		if (vc == columnRslt_insp_ptn_nm) return doRslt_insp_ptn_nm_VC(info);
		if (vc == columnRslt_insp_mtd_typ) return doRslt_insp_mtd_typ_VC(info);
		if (vc == columnRslt_insp_mtd_typ_nm) return doRslt_insp_mtd_typ_nm_VC(info);
		if (vc == columnRslt_std_req_flg) return doRslt_std_req_flg_VC(info);
		if (vc == columnRslt_std_cnf_req_flg) return doRslt_std_cnf_req_flg_VC(info);
		if (vc == columnRslt_plnt_aprv_flg) return doRslt_plnt_aprv_flg_VC(info);
		if (vc == columnRslt_col_schd_flg) return doRslt_col_schd_flg_VC(info);
		if (vc == columnRslt_to_site_cd) return doRslt_to_site_cd_VC(info);
		if (vc == columnRslt_to_site_nm) return doRslt_to_site_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_str_ln_cd_none_flg) return doRslt_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_mfg_str_ln_cd) return doRslt_mfg_str_ln_cd_VC(info);
		if (vc == columnRslt_mfg_str_ln_nm) return doRslt_mfg_str_ln_nm_VC(info);
		if (vc == columnRslt_mfg_str_ln_cd_none_flg) return doRslt_mfg_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_insp_bind_typ) return doRslt_insp_bind_typ_VC(info);
		if (vc == columnRslt_insp_bind_typ_nm) return doRslt_insp_bind_typ_nm_VC(info);
		if (vc == columnRslt_inst_dt) return doRslt_inst_dt_VC(info);
		if (vc == columnRslt_inst_usr_cd) return doRslt_inst_usr_cd_VC(info);
		if (vc == columnRslt_inst_usr_nm) return doRslt_inst_usr_nm_VC(info);
		if (vc == columnRslt_inst_dpt_cd) return doRslt_inst_dpt_cd_VC(info);
		if (vc == columnRslt_inst_dpt_nm) return doRslt_inst_dpt_nm_VC(info);
		if (vc == columnRslt_insp_freq) return doRslt_insp_freq_VC(info);
		if (vc == columnRslt_insp_lst_prnt_tm) return doRslt_insp_lst_prnt_tm_VC(info);
		if (vc == columnRslt_insp_lst_prnt_flg) return doRslt_insp_lst_prnt_flg_VC(info);
		if (vc == columnRslt_insp_rslt_prnt_tm) return doRslt_insp_rslt_prnt_tm_VC(info);
		if (vc == columnRslt_insp_rslt_prnt_flg) return doRslt_insp_rslt_prnt_flg_VC(info);
		if (vc == columnRslt_in_prmt_insp_flg) return doRslt_in_prmt_insp_flg_VC(info);
		if (vc == columnRslt_insp_inst_issue_typ) return doRslt_insp_inst_issue_typ_VC(info);
		if (vc == columnRslt_insp_std_no) return doRslt_insp_std_no_VC(info);
		if (vc == columnRslt_lims_flg) return doRslt_lims_flg_VC(info);
		if (vc == columnRslt_for_lims_flg) return doRslt_for_lims_flg_VC(info);
		if (vc == columnRslt_last_lims_flg) return doRslt_last_lims_flg_VC(info);
		if (vc == columnRslt_insp_schd_no) return doRslt_insp_schd_no_VC(info);
		if (vc == columnRslt_insp_no) return doRslt_insp_no_VC(info);
		if (vc == columnRslt_own_insp_no) return doRslt_own_insp_no_VC(info);
		if (vc == columnRslt_src_no1) return doRslt_src_no1_VC(info);
		if (vc == columnRslt_src_no2) return doRslt_src_no2_VC(info);
		if (vc == columnRslt_src_no3) return doRslt_src_no3_VC(info);
		if (vc == columnRslt_src_no4) return doRslt_src_no4_VC(info);
		if (vc == columnRslt_insp_lst_no) return doRslt_insp_lst_no_VC(info);
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
		if (vc == columnRslt_schd_upd_cntr) return doRslt_schd_upd_cntr_VC(info);
		if (vc == columnRslt_inst_upd_cntr) return doRslt_inst_upd_cntr_VC(info);
		if (vc == columnRslt_master_dt) return doRslt_master_dt_VC(info);
		if (vc == Btn_prnt_flg) return doBtn_prnt_flg_VC(info);
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
	 * [BulkSet]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_sts_typ_schd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_sts_typ_schd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_yet]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_sts_typ_yet_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_ord]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_sts_typ_ord_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_str]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_sts_typ_str_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_jdg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_sts_typ_jdg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upd_ts_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upd_ts_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_lst_prnt_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_lst_prnt_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_rslt_prnt_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_rslt_prnt_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ver_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_lst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_lst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_lst_not_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_lst_not_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_lst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_rslt_not_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_rslt_not_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_rslt_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lims_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lims_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_lims_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_lims_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InspBulkSet]パネルの[inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInspBulkSet_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AprvBulkSet]パネルの[aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAprvBulkSet_aprv_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt_now]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_now_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_up_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std_cnf_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std_cnf_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[to_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_to_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_none_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_cd_none_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_bind_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_bind_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_bind_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_freq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_freq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_lst_prnt_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_lst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_rslt_prnt_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_rslt_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_prmt_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_inst_issue_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_inst_issue_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_std_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_std_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[for_lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_for_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[own_insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_own_insp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_no3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_no3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_no4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_no4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_lst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_lst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_master_dt_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == BulkSetTab) doBulkSet_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_insp_sts_typ_schd) doCnd_insp_sts_typ_schd_NC(info);
		else if (nc == Cnd_insp_sts_typ_yet) doCnd_insp_sts_typ_yet_NC(info);
		else if (nc == Cnd_insp_sts_typ_ord) doCnd_insp_sts_typ_ord_NC(info);
		else if (nc == Cnd_insp_sts_typ_str) doCnd_insp_sts_typ_str_NC(info);
		else if (nc == Cnd_insp_sts_typ_jdg) doCnd_insp_sts_typ_jdg_NC(info);
		else if (nc == Cnd_inst_dt_fr) doCnd_inst_dt_fr_NC(info);
		else if (nc == Cnd_inst_dt_to) doCnd_inst_dt_to_NC(info);
		else if (nc == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NC(info);
		else if (nc == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NC(info);
		else if (nc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NC(info);
		else if (nc == Cnd_upd_ts_to) doCnd_upd_ts_to_NC(info);
		else if (nc == Cnd_insp_lst_prnt_tm_fr) doCnd_insp_lst_prnt_tm_fr_NC(info);
		else if (nc == Cnd_insp_lst_prnt_tm_to) doCnd_insp_lst_prnt_tm_to_NC(info);
		else if (nc == Cnd_insp_rslt_prnt_tm_fr) doCnd_insp_rslt_prnt_tm_fr_NC(info);
		else if (nc == Cnd_insp_rslt_prnt_tm_to) doCnd_insp_rslt_prnt_tm_to_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NC(info);
		else if (nc == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_insp_typ) doCnd_insp_typ_NC(info);
		else if (nc == Cnd_insp_typ_nm) doCnd_insp_typ_nm_NC(info);
		else if (nc == Cnd_insp_ptn_cd) doCnd_insp_ptn_cd_NC(info);
		else if (nc == Cnd_insp_ptn_nm) doCnd_insp_ptn_nm_NC(info);
		else if (nc == Cnd_insp_mtd_typ) doCnd_insp_mtd_typ_NC(info);
		else if (nc == Cnd_insp_mtd_typ_nm) doCnd_insp_mtd_typ_nm_NC(info);
		else if (nc == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_NC(info);
		else if (nc == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_ver_flg) doCnd_ver_flg_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_bp_lot_no) doCnd_bp_lot_no_NC(info);
		else if (nc == Cnd_insp_no) doCnd_insp_no_NC(info);
		else if (nc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NC(info);
		else if (nc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NC(info);
		else if (nc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NC(info);
		else if (nc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NC(info);
		else if (nc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_insp_schd_no) doCnd_insp_schd_no_NC(info);
		else if (nc == Cnd_insp_lst_no) doCnd_insp_lst_no_NC(info);
		else if (nc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_insp_lst_not_prnt_flg) doCnd_insp_lst_not_prnt_flg_NC(info);
		else if (nc == Cnd_insp_lst_prnt_flg) doCnd_insp_lst_prnt_flg_NC(info);
		else if (nc == Cnd_insp_rslt_not_prnt_flg) doCnd_insp_rslt_not_prnt_flg_NC(info);
		else if (nc == Cnd_insp_rslt_prnt_flg) doCnd_insp_rslt_prnt_flg_NC(info);
		else if (nc == Cnd_lims_tgt_flg) doCnd_lims_tgt_flg_NC(info);
		else if (nc == Cnd_not_lims_tgt_flg) doCnd_not_lims_tgt_flg_NC(info);
		else if (nc == InspBulkSet_inst_dt) doInspBulkSet_inst_dt_NC(info);
		else if (nc == AprvBulkSet_aprv_dt) doAprvBulkSet_aprv_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_NC(info);
		else if (nc == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_NC(info);
		else if (nc == columnRslt_ver_no) doRslt_ver_no_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_insp_lt) doRslt_insp_lt_NC(info);
		else if (nc == columnRslt_vld_dt_now) doRslt_vld_dt_now_NC(info);
		else if (nc == columnRslt_lmt_up_flg) doRslt_lmt_up_flg_NC(info);
		else if (nc == columnRslt_insp_aprv_flg) doRslt_insp_aprv_flg_NC(info);
		else if (nc == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_dt) doRslt_aprv_dt_NC(info);
		else if (nc == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_lot_rmrks) doRslt_lot_rmrks_NC(info);
		else if (nc == columnRslt_insp_typ) doRslt_insp_typ_NC(info);
		else if (nc == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_NC(info);
		else if (nc == columnRslt_insp_ptn_cd) doRslt_insp_ptn_cd_NC(info);
		else if (nc == columnRslt_insp_ptn_nm) doRslt_insp_ptn_nm_NC(info);
		else if (nc == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NC(info);
		else if (nc == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_std_req_flg) doRslt_std_req_flg_NC(info);
		else if (nc == columnRslt_std_cnf_req_flg) doRslt_std_cnf_req_flg_NC(info);
		else if (nc == columnRslt_plnt_aprv_flg) doRslt_plnt_aprv_flg_NC(info);
		else if (nc == columnRslt_col_schd_flg) doRslt_col_schd_flg_NC(info);
		else if (nc == columnRslt_to_site_cd) doRslt_to_site_cd_NC(info);
		else if (nc == columnRslt_to_site_nm) doRslt_to_site_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NC(info);
		else if (nc == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NC(info);
		else if (nc == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_insp_bind_typ) doRslt_insp_bind_typ_NC(info);
		else if (nc == columnRslt_insp_bind_typ_nm) doRslt_insp_bind_typ_nm_NC(info);
		else if (nc == columnRslt_inst_dt) doRslt_inst_dt_NC(info);
		else if (nc == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NC(info);
		else if (nc == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NC(info);
		else if (nc == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NC(info);
		else if (nc == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NC(info);
		else if (nc == columnRslt_insp_freq) doRslt_insp_freq_NC(info);
		else if (nc == columnRslt_insp_lst_prnt_tm) doRslt_insp_lst_prnt_tm_NC(info);
		else if (nc == columnRslt_insp_lst_prnt_flg) doRslt_insp_lst_prnt_flg_NC(info);
		else if (nc == columnRslt_insp_rslt_prnt_tm) doRslt_insp_rslt_prnt_tm_NC(info);
		else if (nc == columnRslt_insp_rslt_prnt_flg) doRslt_insp_rslt_prnt_flg_NC(info);
		else if (nc == columnRslt_in_prmt_insp_flg) doRslt_in_prmt_insp_flg_NC(info);
		else if (nc == columnRslt_insp_inst_issue_typ) doRslt_insp_inst_issue_typ_NC(info);
		else if (nc == columnRslt_insp_std_no) doRslt_insp_std_no_NC(info);
		else if (nc == columnRslt_lims_flg) doRslt_lims_flg_NC(info);
		else if (nc == columnRslt_for_lims_flg) doRslt_for_lims_flg_NC(info);
		else if (nc == columnRslt_last_lims_flg) doRslt_last_lims_flg_NC(info);
		else if (nc == columnRslt_insp_schd_no) doRslt_insp_schd_no_NC(info);
		else if (nc == columnRslt_insp_no) doRslt_insp_no_NC(info);
		else if (nc == columnRslt_own_insp_no) doRslt_own_insp_no_NC(info);
		else if (nc == columnRslt_src_no1) doRslt_src_no1_NC(info);
		else if (nc == columnRslt_src_no2) doRslt_src_no2_NC(info);
		else if (nc == columnRslt_src_no3) doRslt_src_no3_NC(info);
		else if (nc == columnRslt_src_no4) doRslt_src_no4_NC(info);
		else if (nc == columnRslt_insp_lst_no) doRslt_insp_lst_no_NC(info);
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
		else if (nc == columnRslt_schd_upd_cntr) doRslt_schd_upd_cntr_NC(info);
		else if (nc == columnRslt_inst_upd_cntr) doRslt_inst_upd_cntr_NC(info);
		else if (nc == columnRslt_master_dt) doRslt_master_dt_NC(info);
		else if (nc == Btn_prnt_flg) doBtn_prnt_flg_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_sts_typ_schd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_schd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_yet]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_yet_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_ord]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_ord_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_str]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_str_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_jdg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_jdg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_lst_not_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_not_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_not_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_not_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lims_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lims_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_lims_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_lims_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [InspBulkSet]パネルの[inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInspBulkSet_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [AprvBulkSet]パネルの[aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAprvBulkSet_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_now]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_now_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_up_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_cnf_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_cnf_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_freq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_freq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_prmt_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_inst_issue_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_inst_issue_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_std_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_std_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[own_insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_own_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == BulkSetTab) doBulkSet_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_insp_sts_typ_schd) doCnd_insp_sts_typ_schd_NE(info);
		else if (ne == Cnd_insp_sts_typ_yet) doCnd_insp_sts_typ_yet_NE(info);
		else if (ne == Cnd_insp_sts_typ_ord) doCnd_insp_sts_typ_ord_NE(info);
		else if (ne == Cnd_insp_sts_typ_str) doCnd_insp_sts_typ_str_NE(info);
		else if (ne == Cnd_insp_sts_typ_jdg) doCnd_insp_sts_typ_jdg_NE(info);
		else if (ne == Cnd_inst_dt_fr) doCnd_inst_dt_fr_NE(info);
		else if (ne == Cnd_inst_dt_to) doCnd_inst_dt_to_NE(info);
		else if (ne == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NE(info);
		else if (ne == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NE(info);
		else if (ne == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NE(info);
		else if (ne == Cnd_upd_ts_to) doCnd_upd_ts_to_NE(info);
		else if (ne == Cnd_insp_lst_prnt_tm_fr) doCnd_insp_lst_prnt_tm_fr_NE(info);
		else if (ne == Cnd_insp_lst_prnt_tm_to) doCnd_insp_lst_prnt_tm_to_NE(info);
		else if (ne == Cnd_insp_rslt_prnt_tm_fr) doCnd_insp_rslt_prnt_tm_fr_NE(info);
		else if (ne == Cnd_insp_rslt_prnt_tm_to) doCnd_insp_rslt_prnt_tm_to_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NE(info);
		else if (ne == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_insp_typ) doCnd_insp_typ_NE(info);
		else if (ne == Cnd_insp_typ_nm) doCnd_insp_typ_nm_NE(info);
		else if (ne == Cnd_insp_ptn_cd) doCnd_insp_ptn_cd_NE(info);
		else if (ne == Cnd_insp_ptn_nm) doCnd_insp_ptn_nm_NE(info);
		else if (ne == Cnd_insp_mtd_typ) doCnd_insp_mtd_typ_NE(info);
		else if (ne == Cnd_insp_mtd_typ_nm) doCnd_insp_mtd_typ_nm_NE(info);
		else if (ne == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_NE(info);
		else if (ne == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_ver_flg) doCnd_ver_flg_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_bp_lot_no) doCnd_bp_lot_no_NE(info);
		else if (ne == Cnd_insp_no) doCnd_insp_no_NE(info);
		else if (ne == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NE(info);
		else if (ne == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NE(info);
		else if (ne == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NE(info);
		else if (ne == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NE(info);
		else if (ne == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_insp_schd_no) doCnd_insp_schd_no_NE(info);
		else if (ne == Cnd_insp_lst_no) doCnd_insp_lst_no_NE(info);
		else if (ne == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_insp_lst_not_prnt_flg) doCnd_insp_lst_not_prnt_flg_NE(info);
		else if (ne == Cnd_insp_lst_prnt_flg) doCnd_insp_lst_prnt_flg_NE(info);
		else if (ne == Cnd_insp_rslt_not_prnt_flg) doCnd_insp_rslt_not_prnt_flg_NE(info);
		else if (ne == Cnd_insp_rslt_prnt_flg) doCnd_insp_rslt_prnt_flg_NE(info);
		else if (ne == Cnd_lims_tgt_flg) doCnd_lims_tgt_flg_NE(info);
		else if (ne == Cnd_not_lims_tgt_flg) doCnd_not_lims_tgt_flg_NE(info);
		else if (ne == InspBulkSet_inst_dt) doInspBulkSet_inst_dt_NE(info);
		else if (ne == AprvBulkSet_aprv_dt) doAprvBulkSet_aprv_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_NE(info);
		else if (ne == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_NE(info);
		else if (ne == columnRslt_ver_no) doRslt_ver_no_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_insp_lt) doRslt_insp_lt_NE(info);
		else if (ne == columnRslt_vld_dt_now) doRslt_vld_dt_now_NE(info);
		else if (ne == columnRslt_lmt_up_flg) doRslt_lmt_up_flg_NE(info);
		else if (ne == columnRslt_insp_aprv_flg) doRslt_insp_aprv_flg_NE(info);
		else if (ne == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_dt) doRslt_aprv_dt_NE(info);
		else if (ne == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_lot_rmrks) doRslt_lot_rmrks_NE(info);
		else if (ne == columnRslt_insp_typ) doRslt_insp_typ_NE(info);
		else if (ne == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_NE(info);
		else if (ne == columnRslt_insp_ptn_cd) doRslt_insp_ptn_cd_NE(info);
		else if (ne == columnRslt_insp_ptn_nm) doRslt_insp_ptn_nm_NE(info);
		else if (ne == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NE(info);
		else if (ne == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_std_req_flg) doRslt_std_req_flg_NE(info);
		else if (ne == columnRslt_std_cnf_req_flg) doRslt_std_cnf_req_flg_NE(info);
		else if (ne == columnRslt_plnt_aprv_flg) doRslt_plnt_aprv_flg_NE(info);
		else if (ne == columnRslt_col_schd_flg) doRslt_col_schd_flg_NE(info);
		else if (ne == columnRslt_to_site_cd) doRslt_to_site_cd_NE(info);
		else if (ne == columnRslt_to_site_nm) doRslt_to_site_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NE(info);
		else if (ne == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NE(info);
		else if (ne == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_insp_bind_typ) doRslt_insp_bind_typ_NE(info);
		else if (ne == columnRslt_insp_bind_typ_nm) doRslt_insp_bind_typ_nm_NE(info);
		else if (ne == columnRslt_inst_dt) doRslt_inst_dt_NE(info);
		else if (ne == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NE(info);
		else if (ne == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NE(info);
		else if (ne == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NE(info);
		else if (ne == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NE(info);
		else if (ne == columnRslt_insp_freq) doRslt_insp_freq_NE(info);
		else if (ne == columnRslt_insp_lst_prnt_tm) doRslt_insp_lst_prnt_tm_NE(info);
		else if (ne == columnRslt_insp_lst_prnt_flg) doRslt_insp_lst_prnt_flg_NE(info);
		else if (ne == columnRslt_insp_rslt_prnt_tm) doRslt_insp_rslt_prnt_tm_NE(info);
		else if (ne == columnRslt_insp_rslt_prnt_flg) doRslt_insp_rslt_prnt_flg_NE(info);
		else if (ne == columnRslt_in_prmt_insp_flg) doRslt_in_prmt_insp_flg_NE(info);
		else if (ne == columnRslt_insp_inst_issue_typ) doRslt_insp_inst_issue_typ_NE(info);
		else if (ne == columnRslt_insp_std_no) doRslt_insp_std_no_NE(info);
		else if (ne == columnRslt_lims_flg) doRslt_lims_flg_NE(info);
		else if (ne == columnRslt_for_lims_flg) doRslt_for_lims_flg_NE(info);
		else if (ne == columnRslt_last_lims_flg) doRslt_last_lims_flg_NE(info);
		else if (ne == columnRslt_insp_schd_no) doRslt_insp_schd_no_NE(info);
		else if (ne == columnRslt_insp_no) doRslt_insp_no_NE(info);
		else if (ne == columnRslt_own_insp_no) doRslt_own_insp_no_NE(info);
		else if (ne == columnRslt_src_no1) doRslt_src_no1_NE(info);
		else if (ne == columnRslt_src_no2) doRslt_src_no2_NE(info);
		else if (ne == columnRslt_src_no3) doRslt_src_no3_NE(info);
		else if (ne == columnRslt_src_no4) doRslt_src_no4_NE(info);
		else if (ne == columnRslt_insp_lst_no) doRslt_insp_lst_no_NE(info);
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
		else if (ne == columnRslt_schd_upd_cntr) doRslt_schd_upd_cntr_NE(info);
		else if (ne == columnRslt_inst_upd_cntr) doRslt_inst_upd_cntr_NE(info);
		else if (ne == columnRslt_master_dt) doRslt_master_dt_NE(info);
		else if (ne == Btn_prnt_flg) doBtn_prnt_flg_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_sts_typ_schd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_schd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_yet]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_yet_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_ord]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_ord_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_str]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_str_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_jdg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_jdg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_lst_not_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_not_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_not_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_not_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lims_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lims_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_lims_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_lims_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [InspBulkSet]パネルの[inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInspBulkSet_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [AprvBulkSet]パネルの[aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAprvBulkSet_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_now]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_now_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_up_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_cnf_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_cnf_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_freq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_freq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_prmt_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_inst_issue_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_inst_issue_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_std_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_std_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[own_insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_own_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == BulkSetTab) doBulkSet_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_insp_sts_typ_schd) doCnd_insp_sts_typ_schd_NX(info);
		else if (nx == Cnd_insp_sts_typ_yet) doCnd_insp_sts_typ_yet_NX(info);
		else if (nx == Cnd_insp_sts_typ_ord) doCnd_insp_sts_typ_ord_NX(info);
		else if (nx == Cnd_insp_sts_typ_str) doCnd_insp_sts_typ_str_NX(info);
		else if (nx == Cnd_insp_sts_typ_jdg) doCnd_insp_sts_typ_jdg_NX(info);
		else if (nx == Cnd_inst_dt_fr) doCnd_inst_dt_fr_NX(info);
		else if (nx == Cnd_inst_dt_to) doCnd_inst_dt_to_NX(info);
		else if (nx == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NX(info);
		else if (nx == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NX(info);
		else if (nx == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NX(info);
		else if (nx == Cnd_upd_ts_to) doCnd_upd_ts_to_NX(info);
		else if (nx == Cnd_insp_lst_prnt_tm_fr) doCnd_insp_lst_prnt_tm_fr_NX(info);
		else if (nx == Cnd_insp_lst_prnt_tm_to) doCnd_insp_lst_prnt_tm_to_NX(info);
		else if (nx == Cnd_insp_rslt_prnt_tm_fr) doCnd_insp_rslt_prnt_tm_fr_NX(info);
		else if (nx == Cnd_insp_rslt_prnt_tm_to) doCnd_insp_rslt_prnt_tm_to_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NX(info);
		else if (nx == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_insp_typ) doCnd_insp_typ_NX(info);
		else if (nx == Cnd_insp_typ_nm) doCnd_insp_typ_nm_NX(info);
		else if (nx == Cnd_insp_ptn_cd) doCnd_insp_ptn_cd_NX(info);
		else if (nx == Cnd_insp_ptn_nm) doCnd_insp_ptn_nm_NX(info);
		else if (nx == Cnd_insp_mtd_typ) doCnd_insp_mtd_typ_NX(info);
		else if (nx == Cnd_insp_mtd_typ_nm) doCnd_insp_mtd_typ_nm_NX(info);
		else if (nx == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_NX(info);
		else if (nx == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_ver_flg) doCnd_ver_flg_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_bp_lot_no) doCnd_bp_lot_no_NX(info);
		else if (nx == Cnd_insp_no) doCnd_insp_no_NX(info);
		else if (nx == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NX(info);
		else if (nx == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NX(info);
		else if (nx == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NX(info);
		else if (nx == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NX(info);
		else if (nx == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_insp_schd_no) doCnd_insp_schd_no_NX(info);
		else if (nx == Cnd_insp_lst_no) doCnd_insp_lst_no_NX(info);
		else if (nx == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_insp_lst_not_prnt_flg) doCnd_insp_lst_not_prnt_flg_NX(info);
		else if (nx == Cnd_insp_lst_prnt_flg) doCnd_insp_lst_prnt_flg_NX(info);
		else if (nx == Cnd_insp_rslt_not_prnt_flg) doCnd_insp_rslt_not_prnt_flg_NX(info);
		else if (nx == Cnd_insp_rslt_prnt_flg) doCnd_insp_rslt_prnt_flg_NX(info);
		else if (nx == Cnd_lims_tgt_flg) doCnd_lims_tgt_flg_NX(info);
		else if (nx == Cnd_not_lims_tgt_flg) doCnd_not_lims_tgt_flg_NX(info);
		else if (nx == InspBulkSet_inst_dt) doInspBulkSet_inst_dt_NX(info);
		else if (nx == AprvBulkSet_aprv_dt) doAprvBulkSet_aprv_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_NX(info);
		else if (nx == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_NX(info);
		else if (nx == columnRslt_ver_no) doRslt_ver_no_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_insp_lt) doRslt_insp_lt_NX(info);
		else if (nx == columnRslt_vld_dt_now) doRslt_vld_dt_now_NX(info);
		else if (nx == columnRslt_lmt_up_flg) doRslt_lmt_up_flg_NX(info);
		else if (nx == columnRslt_insp_aprv_flg) doRslt_insp_aprv_flg_NX(info);
		else if (nx == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_dt) doRslt_aprv_dt_NX(info);
		else if (nx == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_lot_rmrks) doRslt_lot_rmrks_NX(info);
		else if (nx == columnRslt_insp_typ) doRslt_insp_typ_NX(info);
		else if (nx == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_NX(info);
		else if (nx == columnRslt_insp_ptn_cd) doRslt_insp_ptn_cd_NX(info);
		else if (nx == columnRslt_insp_ptn_nm) doRslt_insp_ptn_nm_NX(info);
		else if (nx == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NX(info);
		else if (nx == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_std_req_flg) doRslt_std_req_flg_NX(info);
		else if (nx == columnRslt_std_cnf_req_flg) doRslt_std_cnf_req_flg_NX(info);
		else if (nx == columnRslt_plnt_aprv_flg) doRslt_plnt_aprv_flg_NX(info);
		else if (nx == columnRslt_col_schd_flg) doRslt_col_schd_flg_NX(info);
		else if (nx == columnRslt_to_site_cd) doRslt_to_site_cd_NX(info);
		else if (nx == columnRslt_to_site_nm) doRslt_to_site_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NX(info);
		else if (nx == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NX(info);
		else if (nx == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_insp_bind_typ) doRslt_insp_bind_typ_NX(info);
		else if (nx == columnRslt_insp_bind_typ_nm) doRslt_insp_bind_typ_nm_NX(info);
		else if (nx == columnRslt_inst_dt) doRslt_inst_dt_NX(info);
		else if (nx == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NX(info);
		else if (nx == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NX(info);
		else if (nx == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NX(info);
		else if (nx == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NX(info);
		else if (nx == columnRslt_insp_freq) doRslt_insp_freq_NX(info);
		else if (nx == columnRslt_insp_lst_prnt_tm) doRslt_insp_lst_prnt_tm_NX(info);
		else if (nx == columnRslt_insp_lst_prnt_flg) doRslt_insp_lst_prnt_flg_NX(info);
		else if (nx == columnRslt_insp_rslt_prnt_tm) doRslt_insp_rslt_prnt_tm_NX(info);
		else if (nx == columnRslt_insp_rslt_prnt_flg) doRslt_insp_rslt_prnt_flg_NX(info);
		else if (nx == columnRslt_in_prmt_insp_flg) doRslt_in_prmt_insp_flg_NX(info);
		else if (nx == columnRslt_insp_inst_issue_typ) doRslt_insp_inst_issue_typ_NX(info);
		else if (nx == columnRslt_insp_std_no) doRslt_insp_std_no_NX(info);
		else if (nx == columnRslt_lims_flg) doRslt_lims_flg_NX(info);
		else if (nx == columnRslt_for_lims_flg) doRslt_for_lims_flg_NX(info);
		else if (nx == columnRslt_last_lims_flg) doRslt_last_lims_flg_NX(info);
		else if (nx == columnRslt_insp_schd_no) doRslt_insp_schd_no_NX(info);
		else if (nx == columnRslt_insp_no) doRslt_insp_no_NX(info);
		else if (nx == columnRslt_own_insp_no) doRslt_own_insp_no_NX(info);
		else if (nx == columnRslt_src_no1) doRslt_src_no1_NX(info);
		else if (nx == columnRslt_src_no2) doRslt_src_no2_NX(info);
		else if (nx == columnRslt_src_no3) doRslt_src_no3_NX(info);
		else if (nx == columnRslt_src_no4) doRslt_src_no4_NX(info);
		else if (nx == columnRslt_insp_lst_no) doRslt_insp_lst_no_NX(info);
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
		else if (nx == columnRslt_schd_upd_cntr) doRslt_schd_upd_cntr_NX(info);
		else if (nx == columnRslt_inst_upd_cntr) doRslt_inst_upd_cntr_NX(info);
		else if (nx == columnRslt_master_dt) doRslt_master_dt_NX(info);
		else if (nx == Btn_prnt_flg) doBtn_prnt_flg_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_sts_typ_schd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_schd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_yet]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_yet_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_ord]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_ord_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_str]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_str_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_sts_typ_jdg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_sts_typ_jdg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_lst_not_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_not_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_not_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_not_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lims_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lims_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_lims_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_lims_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [InspBulkSet]パネルの[inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInspBulkSet_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [AprvBulkSet]パネルの[aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAprvBulkSet_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_now]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_now_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_up_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_cnf_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_cnf_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_freq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_freq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_prmt_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_inst_issue_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_inst_issue_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_std_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_std_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[own_insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_own_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_inst_dt_fr) doCnd_inst_dt_fr_LC(info);
		else if (lc == Cnd_inst_dt_to) doCnd_inst_dt_to_LC(info);
		else if (lc == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_LC(info);
		else if (lc == Cnd_aprv_dt_to) doCnd_aprv_dt_to_LC(info);
		else if (lc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_LC(info);
		else if (lc == Cnd_upd_ts_to) doCnd_upd_ts_to_LC(info);
		else if (lc == Cnd_insp_lst_prnt_tm_fr) doCnd_insp_lst_prnt_tm_fr_LC(info);
		else if (lc == Cnd_insp_lst_prnt_tm_to) doCnd_insp_lst_prnt_tm_to_LC(info);
		else if (lc == Cnd_insp_rslt_prnt_tm_fr) doCnd_insp_rslt_prnt_tm_fr_LC(info);
		else if (lc == Cnd_insp_rslt_prnt_tm_to) doCnd_insp_rslt_prnt_tm_to_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_LC(info);
		else if (lc == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_insp_typ) doCnd_insp_typ_LC(info);
		else if (lc == Cnd_insp_typ_nm) doCnd_insp_typ_nm_LC(info);
		else if (lc == Cnd_insp_ptn_cd) doCnd_insp_ptn_cd_LC(info);
		else if (lc == Cnd_insp_ptn_nm) doCnd_insp_ptn_nm_LC(info);
		else if (lc == Cnd_insp_mtd_typ) doCnd_insp_mtd_typ_LC(info);
		else if (lc == Cnd_insp_mtd_typ_nm) doCnd_insp_mtd_typ_nm_LC(info);
		else if (lc == Cnd_insp_aprv_sts_typ) doCnd_insp_aprv_sts_typ_LC(info);
		else if (lc == Cnd_insp_aprv_sts_typ_nm) doCnd_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_bp_lot_no) doCnd_bp_lot_no_LC(info);
		else if (lc == Cnd_insp_no) doCnd_insp_no_LC(info);
		else if (lc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_LC(info);
		else if (lc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_LC(info);
		else if (lc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_LC(info);
		else if (lc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_LC(info);
		else if (lc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_insp_schd_no) doCnd_insp_schd_no_LC(info);
		else if (lc == Cnd_insp_lst_no) doCnd_insp_lst_no_LC(info);
		else if (lc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == InspBulkSet_inst_dt) doInspBulkSet_inst_dt_LC(info);
		else if (lc == AprvBulkSet_aprv_dt) doAprvBulkSet_aprv_dt_LC(info);
		else if (lc == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_LC(info);
		else if (lc == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_LC(info);
		else if (lc == columnRslt_ver_no) doRslt_ver_no_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_insp_lt) doRslt_insp_lt_LC(info);
		else if (lc == columnRslt_vld_dt_now) doRslt_vld_dt_now_LC(info);
		else if (lc == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_aprv_dt) doRslt_aprv_dt_LC(info);
		else if (lc == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_lot_rmrks) doRslt_lot_rmrks_LC(info);
		else if (lc == columnRslt_insp_typ) doRslt_insp_typ_LC(info);
		else if (lc == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_LC(info);
		else if (lc == columnRslt_insp_ptn_cd) doRslt_insp_ptn_cd_LC(info);
		else if (lc == columnRslt_insp_ptn_nm) doRslt_insp_ptn_nm_LC(info);
		else if (lc == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_LC(info);
		else if (lc == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_to_site_cd) doRslt_to_site_cd_LC(info);
		else if (lc == columnRslt_to_site_nm) doRslt_to_site_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_LC(info);
		else if (lc == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_insp_bind_typ) doRslt_insp_bind_typ_LC(info);
		else if (lc == columnRslt_insp_bind_typ_nm) doRslt_insp_bind_typ_nm_LC(info);
		else if (lc == columnRslt_inst_dt) doRslt_inst_dt_LC(info);
		else if (lc == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_LC(info);
		else if (lc == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_LC(info);
		else if (lc == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_LC(info);
		else if (lc == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_LC(info);
		else if (lc == columnRslt_insp_freq) doRslt_insp_freq_LC(info);
		else if (lc == columnRslt_insp_lst_prnt_tm) doRslt_insp_lst_prnt_tm_LC(info);
		else if (lc == columnRslt_insp_rslt_prnt_tm) doRslt_insp_rslt_prnt_tm_LC(info);
		else if (lc == columnRslt_insp_inst_issue_typ) doRslt_insp_inst_issue_typ_LC(info);
		else if (lc == columnRslt_insp_std_no) doRslt_insp_std_no_LC(info);
		else if (lc == columnRslt_insp_schd_no) doRslt_insp_schd_no_LC(info);
		else if (lc == columnRslt_insp_no) doRslt_insp_no_LC(info);
		else if (lc == columnRslt_own_insp_no) doRslt_own_insp_no_LC(info);
		else if (lc == columnRslt_src_no1) doRslt_src_no1_LC(info);
		else if (lc == columnRslt_src_no2) doRslt_src_no2_LC(info);
		else if (lc == columnRslt_src_no3) doRslt_src_no3_LC(info);
		else if (lc == columnRslt_src_no4) doRslt_src_no4_LC(info);
		else if (lc == columnRslt_insp_lst_no) doRslt_insp_lst_no_LC(info);
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
		else if (lc == columnRslt_schd_upd_cntr) doRslt_schd_upd_cntr_LC(info);
		else if (lc == columnRslt_inst_upd_cntr) doRslt_inst_upd_cntr_LC(info);
		else if (lc == columnRslt_master_dt) doRslt_master_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_prnt_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_prnt_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_rslt_prnt_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_rslt_prnt_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_lst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_lst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_LC(MCEventInfo info){
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
	 * [InspBulkSet]パネルの[inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInspBulkSet_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [AprvBulkSet]パネルの[aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAprvBulkSet_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_now]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_now_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_bind_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_bind_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_freq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_freq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_prnt_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_rslt_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_rslt_prnt_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_inst_issue_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_inst_issue_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_std_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_std_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[own_insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_own_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_no4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_no4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lst_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_insp_typ]の作成メソッド
	 */
	public MCList getCnd_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_insp_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_insp_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_insp_mtd_typ]の作成メソッド
	 */
	public MCList getCnd_insp_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_insp_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_insp_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInspAprvStsTyp(row, info);
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
	 * コンボ／リストのリスト[InspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getInspBulkSet_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[AprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getAprvBulkSet_aprv_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_insp_sts_typ]の作成メソッド
	 */
	public MCList getRslt_insp_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Rslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_aprv_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_insp_typ]の作成メソッド
	 */
	public MCList getRslt_insp_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_insp_ptn_cd]の作成メソッド
	 */
	public MCList getRslt_insp_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmInspPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_insp_mtd_typ]の作成メソッド
	 */
	public MCList getRslt_insp_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspMtdTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0030.Srch01")) {
			return new MS_MSBFL0030_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0030.Srch02")) {
			return new MS_MSBFL0030_Srch02Bridge();
		}
		if (id.equals("MS.MSBFL0030.Ins01")) {
			return new MS_MSBFL0030_Ins01Bridge();
		}
		if (id.equals("MS.MSBFL0030.Upd01")) {
			return new MS_MSBFL0030_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0030.Del01")) {
			return new MS_MSBFL0030_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0030.Del02")) {
			return new MS_MSBFL0030_Del02Bridge();
		}
		if (id.equals("MS.MSBFL0030.Prnt01")) {
			return new MS_MSBFL0030_Prnt01Bridge();
		}
		if (id.equals("MS.MSBFL0030.Prnt02")) {
			return new MS_MSBFL0030_Prnt02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0030_Srch01Bridge() {
			p_MS_MSBFL0030_Srch01 = new MCParam(PDef.MS_MSBFL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltSchdR.class));

			p_MS_MSBFL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0030.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			p_MS_MSBFL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltSchdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Srch01.getContainerParam().getDownBlock(0));
			setRsltSchdL((MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR>)p_MS_MSBFL0030_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getRsltSchdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getRsltSchdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Srch02;

		/** コンストラクタ */
		protected MS_MSBFL0030_Srch02Bridge() {
			p_MS_MSBFL0030_Srch02 = new MCParam(PDef.MS_MSBFL0030_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0030.MasterInfoR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0030.MasterInfoR.create());

			p_MS_MSBFL0030_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Srch02.addUpBlock(getMasterInfoR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0030.MasterInfoR up0() {
			return (mcframe.clientMSBF.MSBFP0030.MasterInfoR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0030.MasterInfoR down0() {
			return (mcframe.clientMSBF.MSBFP0030.MasterInfoR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Srch02.addDownBlock(mcframe.clientMSBF.MSBFP0030.MasterInfoR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Srch02;
		}

		protected void show() {
			setMasterInfoR((mcframe.clientMSBF.MSBFP0030.MasterInfoR)p_MS_MSBFL0030_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getMasterInfoR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getMasterInfoR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getMasterInfoR());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Ins01;

		/** コンストラクタ */
		protected MS_MSBFL0030_Ins01Bridge() {
			p_MS_MSBFL0030_Ins01 = new MCParam(PDef.MS_MSBFL0030_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));

			p_MS_MSBFL0030_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Ins01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Ins01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0030_Upd01Bridge() {
			p_MS_MSBFL0030_Upd01 = new MCParam(PDef.MS_MSBFL0030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			param.addUpBlock(mcframe.clientMSBF.MSBFP0030.AprvBulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));

			p_MS_MSBFL0030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0030_Upd01.addUpBlock(getAprvBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)up(0);
		}
		protected mcframe.clientMSBF.MSBFP0030.AprvBulkSetR up1() {
			return (mcframe.clientMSBF.MSBFP0030.AprvBulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getAprvBulkSetR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0030_Del01Bridge() {
			p_MS_MSBFL0030_Del01 = new MCParam(PDef.MS_MSBFL0030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltSchdR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));

			p_MS_MSBFL0030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0030_Del01.addUpBlock(getRsltSchdL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltSchdR>)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Del01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getRsltSchdL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0030_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Del02;

		/** コンストラクタ */
		protected MS_MSBFL0030_Del02Bridge() {
			p_MS_MSBFL0030_Del02 = new MCParam(PDef.MS_MSBFL0030_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			param.addUpBlock(mcframe.clientMSBF.MSBFP0030.AprvBulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));

			p_MS_MSBFL0030_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Del02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0030_Del02.addUpBlock(getAprvBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)up(0);
		}
		protected mcframe.clientMSBF.MSBFP0030.AprvBulkSetR up1() {
			return (mcframe.clientMSBF.MSBFP0030.AprvBulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Del02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Del02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getAprvBulkSetR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0030_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Prnt01;

		/** コンストラクタ */
		protected MS_MSBFL0030_Prnt01Bridge() {
			p_MS_MSBFL0030_Prnt01 = new MCParam(PDef.MS_MSBFL0030_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));

			p_MS_MSBFL0030_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Prnt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Prnt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0030_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Prnt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0030_Prnt02;

		/** コンストラクタ */
		protected MS_MSBFL0030_Prnt02Bridge() {
			p_MS_MSBFL0030_Prnt02 = new MCParam(PDef.MS_MSBFL0030_Prnt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0030_Prnt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));

			p_MS_MSBFL0030_Prnt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0030_Prnt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0030_Prnt02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0030_Prnt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0030_Prnt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0030_Prnt02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0030_Prnt02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0030.RsltR>)p_MS_MSBFL0030_Prnt02.getContainerParam().getDownBlock(0));
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
}