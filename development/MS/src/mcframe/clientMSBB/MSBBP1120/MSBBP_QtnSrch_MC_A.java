package mcframe.clientMSBB.MSBBP1120;

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
import mcframe.clientMSBB.MSBBP1120.MSBBP_QtnSrch_MC.MS_MSBBL1120_Srch01Caller;
import mcframe.clientMSBB.MSBBP1120.MSBBP_QtnSrch_MC.MS_MSBBL1120_Prnt01Caller;

/**
 * 画面"MSBBP_QtnSrch"パネルクラスです。<p>
 *
 * 見積を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_QtnSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1120";

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
	// [Qtn_typ]ブロック関連のField定義
	public MCPanel Qtn_typPanel = null;
	public MCTitledBorder Qtn_typTitledBorder = null;
	// [Qtn_typ]ブロックの項目のField定義
	// [Qtn_sts_typ]ブロック関連のField定義
	public MCPanel Qtn_sts_typPanel = null;
	public MCTitledBorder Qtn_sts_typTitledBorder = null;
	// [Qtn_sts_typ]ブロックの項目のField定義
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
	// [Aprv_sts_typ]ブロック関連のField定義
	public MCPanel Aprv_sts_typPanel = null;
	public MCTitledBorder Aprv_sts_typTitledBorder = null;
	// [Aprv_sts_typ]ブロックの項目のField定義
	// [QtnPrnt]ブロック関連のField定義
	public MCPanel QtnPrntPanel = null;
	public MCTitledBorder QtnPrntTitledBorder = null;
	// [QtnPrnt]ブロックの項目のField定義
	// [Iv]ブロック関連のField定義
	public MCPanel IvPanel = null;
	public MCTitledBorder IvTitledBorder = null;
	// [Iv]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
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
	 * PRNT,Issue report;REF,View; PRNT,帳票発行する;REF,参照する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * DTL,Details,DTL;HDR,Header,HDR DTL,明細,DTL;HDR,ヘッダ,HDR.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_Group = null;
	public MCRadioButton Cnd_disp_DTL = null;
	public MCRadioButton Cnd_disp_HDR = null;
	/**
	 * Creating 作成中.<p>
	 *
	 */
	public MCCheckBox Cnd_creating = null;
	/**
	 * Temporary quotation 仮見積.<p>
	 *
	 */
	public MCCheckBox Cnd_pre_qtn = null;
	/**
	 * Quotation 本見積.<p>
	 *
	 */
	public MCCheckBox Cnd_qtn = null;
	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public MCCheckBox Cnd_non = null;
	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public MCCheckBox Cnd_part = null;
	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public MCCheckBox Cnd_compl = null;
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public MCCheckBox Cnd_opn = null;
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_fix = null;
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_acpt = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCCheckBox Cnd_rjct = null;
	/**
	 * Denied 否認.<p>
	 *
	 */
	public MCCheckBox Cnd_last_rjct = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_excld = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_yet = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_prnt = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_trgt_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_not_trgt_flg = null;
	public MCLabel Cnd_qtn_dt_fr_Label = null;
	/**
	 * Quotation date FROM 見積日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_qtn_dt_fr = null;
	public MCLabel Cnd_qtn_dt_to_Label = null;
	/**
	 * Quotation date TO 見積日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_qtn_dt_to = null;
	public MCLabel Cnd_valid_dt_fr_Label = null;
	/**
	 * Quotation expiration date FROM 見積有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_valid_dt_fr = null;
	public MCLabel Cnd_valid_dt_to_Label = null;
	/**
	 * Quotation expiration date TO 見積有効期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_valid_dt_to = null;
	public MCLabel Cnd_rcpt_dt_fr_Label = null;
	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcpt_dt_fr = null;
	public MCLabel Cnd_rcpt_dt_to_Label = null;
	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcpt_dt_to = null;
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
	public MCLabel Cnd_rcpt_usr_cd_Label = null;
	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_usr_cd = null;
	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_usr_nm = null;
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
	public MCLabel Cnd_qtn_no_Label = null;
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_qtn_no = null;
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_qtn_rev = null;
	public MCLabel Cnd_cst_qtn_rqst_no_Label = null;
	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_qtn_rqst_no = null;
	public MCLabel Cnd_cst_qtn_rqst_d_no_Label = null;
	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_qtn_rqst_d_no = null;
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
	public MCLabel Cnd_qtn_term_cd_Label = null;
	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_qtn_term_cd = null;
	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public MCTextField Cnd_qtn_term_nm = null;
	public MCLabel Cnd_qtn_rslt_rsn_cd_Label = null;
	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_qtn_rslt_rsn_cd = null;
	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public MCTextField Cnd_qtn_rslt_rsn_nm = null;
	public MCLabel Cnd_qtn_d_rslt_rsn_cd_Label = null;
	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_qtn_d_rslt_rsn_cd = null;
	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public MCTextField Cnd_qtn_d_rslt_rsn_nm = null;
	public MCLabel Cnd_qtn_rmrks_Label = null;
	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public MCTextField Cnd_qtn_rmrks = null;
	public MCLabel Cnd_qtn_d_rmrks_Label = null;
	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public MCTextField Cnd_qtn_d_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_d_rmrks = null;
	public MCLabel Cnd_qtn_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_qtn_sub_char1 = null;
	public MCLabel Cnd_qtn_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_qtn_sub_char2 = null;
	public MCLabel Cnd_qtn_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_qtn_sub_char3 = null;
	public MCLabel Cnd_qtn_d_sub_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_qtn_d_sub_char1 = null;
	public MCLabel Cnd_qtn_d_sub_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_qtn_d_sub_char2 = null;
	public MCLabel Cnd_qtn_d_sub_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_qtn_d_sub_char3 = null;
	/**
	 * Including failed order 失注含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_failure_flg = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
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
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1120.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Quotation status type 見積状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_sts_typ = null;
	/**
	 * Quotation status type name 見積状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_sts_typ_nm = null;
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
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
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_prnt_seq = null;
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_no = null;
	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_dt = null;
	/**
	 * Quotation expiration date 見積有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_valid_dt = null;
	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_typ = null;
	/**
	 * Quotation type name 見積区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_typ_nm = null;
	/**
	 * Failed order 失注.<p>
	 *
	 */
	public MCColumnConfig columnRslt_failure_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_prnt_flg = null;
	/**
	 * Quotation issue date 見積書発行日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_prnt_dt = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_no = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_sts_typ_nm = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_flg = null;
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
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_upri_dec_place = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
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
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_term_cd = null;
	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_term_nm = null;
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
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_qtn_rqst_no = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_dt = null;
	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_usr_cd = null;
	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_usr_nm = null;
	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_rslt_rsn_cd = null;
	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_rslt_rsn_nm = null;
	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_rslt_rsn_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_sub_char3 = null;
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
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
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
	public MCColumnConfig columnRslt_trd_qty_dec_place = null;
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
	public MCColumnConfig columnRslt_base_qty_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_std_sls_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_std_sls_upri;// [Rslt]の[trd_cur_std_sls_upri_p.upri]を[columnRslt_trd_cur_std_sls_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_std_sls_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_std_sls_amt;// [Rslt]の[trd_cur_std_sls_amt_p.amt]を[columnRslt_trd_cur_std_sls_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_std_sls_inc_tax_amt;// [Rslt]の[trd_cur_std_sls_inc_tax_amt_p.amt]を[columnRslt_trd_cur_std_sls_inc_tax_amt]としてエイリアス定義。
	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri_rate = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_cur_inc_tax_amt_p.amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
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
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_fix_flg = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_std_sls_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_std_sls_tax_amt;// [Rslt]の[trd_cur_std_sls_tax_amt_p.amt]を[columnRslt_trd_cur_std_sls_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_tax_amt_p.amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_std_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_std_upri;// [Rslt]の[base_cur_std_upri_p.upri]を[columnRslt_base_cur_std_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_std_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_std_amt;// [Rslt]の[base_cur_std_amt_p.amt]を[columnRslt_base_cur_std_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_std_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_std_inc_tax_amt;// [Rslt]の[base_cur_std_inc_tax_amt_p.amt]を[columnRslt_base_cur_std_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_std_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_std_tax_amt;// [Rslt]の[base_cur_std_tax_amt_p.amt]を[columnRslt_base_cur_std_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_inc_tax_amt;// [Rslt]の[base_cur_inc_tax_amt_p.amt]を[columnRslt_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_itm_grp_no = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_dlv_p_PPanel;
	public MCColumnConfig columnRslt_dlv_cd;// [Rslt]の[dlv_p.bp_cd]を[columnRslt_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_nm;// [Rslt]の[dlv_p.bp_nm]を[columnRslt_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_sundry_flg;// [Rslt]の[dlv_p.dlv_sundry_flg]を[columnRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_zip_cd;// [Rslt]の[dlv_p.zip_cd]を[columnRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr1;// [Rslt]の[dlv_p.addr1]を[columnRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr2;// [Rslt]の[dlv_p.addr2]を[columnRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr3;// [Rslt]の[dlv_p.addr3]を[columnRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr4;// [Rslt]の[dlv_p.addr4]を[columnRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_dpt;// [Rslt]の[dlv_p.dlv_cntct_dpt]を[columnRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_psn;// [Rslt]の[dlv_p.dlv_cntct_psn]を[columnRslt_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_tel;// [Rslt]の[dlv_p.tel]を[columnRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_fax;// [Rslt]の[dlv_p.fax]を[columnRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntry_cd;// [Rslt]の[dlv_p.cntry_cd]を[columnRslt_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntry_nm;// [Rslt]の[dlv_p.cntry_nm]を[columnRslt_dlv_cntry_nm]としてエイリアス定義。
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
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_d_rmrks = null;
	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_rslt_rsn_cd = null;
	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_rslt_rsn_nm = null;
	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_rslt_rsn_rmrks = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_slo_trnst_qty_p_PPanel;
	public MCColumnConfig columnRslt_slo_trnst_qty;// [Rslt]の[slo_trnst_qty_p.qty]を[columnRslt_slo_trnst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sls_trnst_qty_p_PPanel;
	public MCColumnConfig columnRslt_sls_trnst_qty;// [Rslt]の[sls_trnst_qty_p.qty]を[columnRslt_sls_trnst_qty]としてエイリアス定義。
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qtn_d_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
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
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
	/**
	 * Sales result entry 売上実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1310 = null;
	/**
	 * Quotation entry 見積登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1110 = null;
	/**
	 * Quotation 見積書.<p>
	 *
	 */
	public MCButton Btn_prnt_qtn = null;
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
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";
	/** [SRCH_HDR]モードを表す定数 */
	public static final String SRCH_HDR = "SRCH_HDR";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";
	/** [SRCH_DTL]モードを表す定数 */
	public static final String SRCH_DTL = "SRCH_DTL";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_PRNT, PRNT, SRCH_HDR, REF_HDR, SRCH_DTL, REF_DTL};
	
	/** [MS_MSBBL1120_Srch01]のCallerの作成 */
	protected MSBBP_QtnSrch_MC.MS_MSBBL1120_Srch01Caller createMS_MSBBL1120_Srch01() {
		MSBBP_QtnSrch_MC.MS_MSBBL1120_Srch01Caller<MSBBP_QtnSrch, MS_MSBBL1120_Srch01Bridge>
		caller = ((MSBBP_QtnSrch_MC)this).new MS_MSBBL1120_Srch01Caller<MSBBP_QtnSrch, MS_MSBBL1120_Srch01Bridge>(
					(MSBBP_QtnSrch)this, new MS_MSBBL1120_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1120_Srch01]の呼び出し */
	protected void callMS_MSBBL1120_Srch01() {
		MCCaller caller = createMS_MSBBL1120_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1120_Prnt01]のCallerの作成 */
	protected MSBBP_QtnSrch_MC.MS_MSBBL1120_Prnt01Caller createMS_MSBBL1120_Prnt01() {
		MSBBP_QtnSrch_MC.MS_MSBBL1120_Prnt01Caller<MSBBP_QtnSrch, MS_MSBBL1120_Prnt01Bridge>
		caller = ((MSBBP_QtnSrch_MC)this).new MS_MSBBL1120_Prnt01Caller<MSBBP_QtnSrch, MS_MSBBL1120_Prnt01Bridge>(
					(MSBBP_QtnSrch)this, new MS_MSBBL1120_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1120_Prnt01]の呼び出し */
	protected void callMS_MSBBL1120_Prnt01() {
		MCCaller caller = createMS_MSBBL1120_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1120.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1120.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1120.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1120.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1120.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP1120.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1120.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP1120.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP1120.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1120.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1120.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBB.MSBBP1120.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1120.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBB.MSBBP1120.BtnR createBtnR() {
		return mcframe.clientMSBB.MSBBP1120.BtnR.create();
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
		ret.add(DispUnitPanel);
		ret.add(Qtn_typPanel);
		ret.add(Qtn_sts_typPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Aprv_sts_typPanel);
		ret.add(QtnPrntPanel);
		ret.add(IvPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(DlvCndPanel);
		ret.add(CstCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_QtnSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_QtnSrch_MC_A(String name) {
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
		MSBBP_QtnSrch_MC.jbCreateScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateDispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateQtn_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateQtn_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateTop((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateFold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateTab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateAprv_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateQtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateIv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateTab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateTab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateTab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateDlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateCstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateCtrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateRPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateRslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbCreateBtn((MSBBP_QtnSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_QtnSrch p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBBP_QtnSrch p) {
	}

	/**
	 * [Qtn_typ]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateQtn_typ(MSBBP_QtnSrch p) {
	}

	/**
	 * [Qtn_sts_typ]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateQtn_sts_typ(MSBBP_QtnSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_QtnSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_QtnSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_QtnSrch p) {
	}

	/**
	 * [Aprv_sts_typ]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprv_sts_typ(MSBBP_QtnSrch p) {
	}

	/**
	 * [QtnPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateQtnPrnt(MSBBP_QtnSrch p) {
	}

	/**
	 * [Iv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIv(MSBBP_QtnSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_QtnSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_QtnSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_QtnSrch p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBBP_QtnSrch p) {
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBBP_QtnSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBBP_QtnSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_QtnSrch p) {
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
	protected static void jbCreateCtrl(MSBBP_QtnSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_QtnSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_QtnSrch p) {
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$itm_p);
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
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_std_sls_upri_p);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.setName("Rslt.trd_cur_std_sls_upri_p");
		p.columnRslt_trd_cur_std_sls_upri = p.Rslt_trd_cur_std_sls_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_std_sls_upri.addAliasName("Rslt.trd_cur_std_sls_upri", p);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_std_sls_amt_p);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.setName("Rslt.trd_cur_std_sls_amt_p");
		p.columnRslt_trd_cur_std_sls_amt = p.Rslt_trd_cur_std_sls_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_std_sls_amt.addAliasName("Rslt.trd_cur_std_sls_amt", p);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_std_sls_inc_tax_amt_p);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_std_sls_inc_tax_amt_p");
		p.columnRslt_trd_cur_std_sls_inc_tax_amt = p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_std_sls_inc_tax_amt.addAliasName("Rslt.trd_cur_std_sls_inc_tax_amt", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_inc_tax_amt_p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_inc_tax_amt_p");
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_std_sls_tax_amt_p);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.setName("Rslt.trd_cur_std_sls_tax_amt_p");
		p.columnRslt_trd_cur_std_sls_tax_amt = p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_std_sls_tax_amt.addAliasName("Rslt.trd_cur_std_sls_tax_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_base_cur_std_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_std_upri_p);
		p.Rslt_base_cur_std_upri_p_PPanel.setName("Rslt.base_cur_std_upri_p");
		p.columnRslt_base_cur_std_upri = p.Rslt_base_cur_std_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_std_upri.addAliasName("Rslt.base_cur_std_upri", p);
		p.Rslt_base_cur_std_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_std_amt_p);
		p.Rslt_base_cur_std_amt_p_PPanel.setName("Rslt.base_cur_std_amt_p");
		p.columnRslt_base_cur_std_amt = p.Rslt_base_cur_std_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_std_amt.addAliasName("Rslt.base_cur_std_amt", p);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_std_inc_tax_amt_p);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.setName("Rslt.base_cur_std_inc_tax_amt_p");
		p.columnRslt_base_cur_std_inc_tax_amt = p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_std_inc_tax_amt.addAliasName("Rslt.base_cur_std_inc_tax_amt", p);
		p.Rslt_base_cur_std_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_std_tax_amt_p);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.setName("Rslt.base_cur_std_tax_amt_p");
		p.columnRslt_base_cur_std_tax_amt = p.Rslt_base_cur_std_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_std_tax_amt.addAliasName("Rslt.base_cur_std_tax_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_inc_tax_amt_p);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.setName("Rslt.base_cur_inc_tax_amt_p");
		p.columnRslt_base_cur_inc_tax_amt = p.Rslt_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_inc_tax_amt.addAliasName("Rslt.base_cur_inc_tax_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$dlv_p);
		p.Rslt_dlv_p_PPanel.setName("Rslt.dlv_p");
		p.columnRslt_dlv_cd = p.Rslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_dlv_cd.addAliasName("Rslt.dlv_cd", p);
		p.columnRslt_dlv_nm = p.Rslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_dlv_nm.addAliasName("Rslt.dlv_nm", p);
		p.columnRslt_dlv_sundry_flg = p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_dlv_sundry_flg.addAliasName("Rslt.dlv_sundry_flg", p);
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
		p.columnRslt_dlv_cntry_cd = p.Rslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_dlv_cntry_cd.addAliasName("Rslt.dlv_cntry_cd", p);
		p.columnRslt_dlv_cntry_nm = p.Rslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_dlv_cntry_nm.addAliasName("Rslt.dlv_cntry_nm", p);
		p.Rslt_slo_trnst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$slo_trnst_qty_p);
		p.Rslt_slo_trnst_qty_p_PPanel.setName("Rslt.slo_trnst_qty_p");
		p.columnRslt_slo_trnst_qty = p.Rslt_slo_trnst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_slo_trnst_qty.addAliasName("Rslt.slo_trnst_qty", p);
		p.Rslt_sls_trnst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$sls_trnst_qty_p);
		p.Rslt_sls_trnst_qty_p_PPanel.setName("Rslt.sls_trnst_qty_p");
		p.columnRslt_sls_trnst_qty = p.Rslt_sls_trnst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_sls_trnst_qty.addAliasName("Rslt.sls_trnst_qty", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$cst_grp_p);
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
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$dlv_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBB.MSBBP1120.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBBP_QtnSrch p) {
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
	
	
	/** [Cnd_rcpt_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rcpt_usr_cd_p = null;

	/**
	 * [Cnd_rcpt_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rcpt_usr_cd_ListPutter() {
		if (Cnd_rcpt_usr_cd_p == null) {
			Cnd_rcpt_usr_cd_p = createCnd_rcpt_usr_cd_ListPutter(Cnd_rcpt_usr_cd, "rcpt_usr_cd", "rcpt_usr_nm");

		}
		return Cnd_rcpt_usr_cd_p;
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
			Cnd_dest_cd2_p = createCnd_dest_cd2_ListPutter(Cnd_dest_cd2, "dest_cd2", "dest_nm1");

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
			Cnd_dest_cd3_p = createCnd_dest_cd3_ListPutter(Cnd_dest_cd3, "dest_cd3", "dest_nm1");

		}
		return Cnd_dest_cd3_p;
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
	
	
	/** [Cnd_qtn_term_cd_ListPutter]の定義 */
	private MCListPutter Cnd_qtn_term_cd_p = null;

	/**
	 * [Cnd_qtn_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_qtn_term_cd_ListPutter() {
		if (Cnd_qtn_term_cd_p == null) {
			Cnd_qtn_term_cd_p = createCnd_qtn_term_cd_ListPutter(Cnd_qtn_term_cd, "qtn_term_cd", "qtn_term_nm");

		}
		return Cnd_qtn_term_cd_p;
	}
	
	
	/** [Cnd_qtn_rslt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_qtn_rslt_rsn_cd_p = null;

	/**
	 * [Cnd_qtn_rslt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_qtn_rslt_rsn_cd_ListPutter() {
		if (Cnd_qtn_rslt_rsn_cd_p == null) {
			Cnd_qtn_rslt_rsn_cd_p = createCnd_qtn_rslt_rsn_cd_ListPutter(Cnd_qtn_rslt_rsn_cd, "qtn_rslt_rsn_cd", "qtn_rslt_rsn_nm");

		}
		return Cnd_qtn_rslt_rsn_cd_p;
	}
	
	
	/** [Cnd_qtn_d_rslt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_qtn_d_rslt_rsn_cd_p = null;

	/**
	 * [Cnd_qtn_d_rslt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_qtn_d_rslt_rsn_cd_ListPutter() {
		if (Cnd_qtn_d_rslt_rsn_cd_p == null) {
			Cnd_qtn_d_rslt_rsn_cd_p = createCnd_qtn_d_rslt_rsn_cd_ListPutter(Cnd_qtn_d_rslt_rsn_cd, "qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_nm");

		}
		return Cnd_qtn_d_rslt_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_QtnSrch create(){
		MSBBP_QtnSrch p = new MSBBP_QtnSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_QtnSrch create(String name){
		MSBBP_QtnSrch p = new MSBBP_QtnSrch(name);
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
		MSBBP_QtnSrch_MC.jbfInitScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitDispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitQtn_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitQtn_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitTop((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitFold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitTab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitAprv_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitQtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitIv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitTab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitTab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitTab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitDlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitCstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitCtrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitRPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitRslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbfInitBtn((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitDispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitQtn_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitQtn_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitTop((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitFold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitTab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitAprv_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitQtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitIv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitTab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitTab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitTab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitDlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitCstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitCtrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitRPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitRslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.jbInitBtn((MSBBP_QtnSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Qtn_typ]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitQtn_typ(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Qtn_typPanel = p.beansFactory.createPanel("Qtn_typ");
		p.Qtn_typTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Qtn_sts_typ]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitQtn_sts_typ(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Qtn_sts_typPanel = p.beansFactory.createPanel("Qtn_sts_typ");
		p.Qtn_sts_typTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_QtnSrch p) {
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
	protected static void jbfInitTab1(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Aprv_sts_typ]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprv_sts_typ(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Aprv_sts_typPanel = p.beansFactory.createPanel("Aprv_sts_typ");
		p.Aprv_sts_typTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [QtnPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitQtnPrnt(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.QtnPrntPanel = p.beansFactory.createPanel("QtnPrnt");
		p.QtnPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIv(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.IvPanel = p.beansFactory.createPanel("Iv");
		p.IvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_disp_Group = p.beansFactory.createButtonGroup("Cnd.disp");
		p.Cnd_disp_DTL = p.beansFactory.createRadioButton("Cnd.disp_DTL");
		p.Cnd_disp_HDR = p.beansFactory.createRadioButton("Cnd.disp_HDR");
		p.Cnd_creating = p.beansFactory.createCheckBox("Cnd.creating");
		p.Cnd_pre_qtn = p.beansFactory.createCheckBox("Cnd.pre_qtn");
		p.Cnd_qtn = p.beansFactory.createCheckBox("Cnd.qtn");
		p.Cnd_non = p.beansFactory.createCheckBox("Cnd.non");
		p.Cnd_part = p.beansFactory.createCheckBox("Cnd.part");
		p.Cnd_compl = p.beansFactory.createCheckBox("Cnd.compl");
		p.Cnd_opn = p.beansFactory.createCheckBox("Cnd.opn");
		p.Cnd_fix = p.beansFactory.createCheckBox("Cnd.fix");
		p.Cnd_acpt = p.beansFactory.createCheckBox("Cnd.acpt");
		p.Cnd_rjct = p.beansFactory.createCheckBox("Cnd.rjct");
		p.Cnd_last_rjct = p.beansFactory.createCheckBox("Cnd.last_rjct");
		p.Cnd_excld = p.beansFactory.createCheckBox("Cnd.excld");
		p.Cnd_yet = p.beansFactory.createCheckBox("Cnd.yet");
		p.Cnd_prnt = p.beansFactory.createCheckBox("Cnd.prnt");
		p.Cnd_iv_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_trgt_flg");
		p.Cnd_iv_not_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_not_trgt_flg");
		p.Cnd_qtn_dt_fr_Label = p.beansFactory.createLabel("Cnd.qtn_dt_fr_Label");
		p.Cnd_qtn_dt_fr = p.beansFactory.createDateField("Cnd.qtn_dt_fr");
		p.Cnd_qtn_dt_fr.setLabel(p.Cnd_qtn_dt_fr_Label);
		p.Cnd_qtn_dt_to_Label = p.beansFactory.createLabel("Cnd.qtn_dt_to_Label");
		p.Cnd_qtn_dt_to = p.beansFactory.createDateField("Cnd.qtn_dt_to");
		p.Cnd_qtn_dt_to.setLabel(p.Cnd_qtn_dt_to_Label);
		p.Cnd_valid_dt_fr_Label = p.beansFactory.createLabel("Cnd.valid_dt_fr_Label");
		p.Cnd_valid_dt_fr = p.beansFactory.createDateField("Cnd.valid_dt_fr");
		p.Cnd_valid_dt_fr.setLabel(p.Cnd_valid_dt_fr_Label);
		p.Cnd_valid_dt_to_Label = p.beansFactory.createLabel("Cnd.valid_dt_to_Label");
		p.Cnd_valid_dt_to = p.beansFactory.createDateField("Cnd.valid_dt_to");
		p.Cnd_valid_dt_to.setLabel(p.Cnd_valid_dt_to_Label);
		p.Cnd_rcpt_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcpt_dt_fr_Label");
		p.Cnd_rcpt_dt_fr = p.beansFactory.createDateField("Cnd.rcpt_dt_fr");
		p.Cnd_rcpt_dt_fr.setLabel(p.Cnd_rcpt_dt_fr_Label);
		p.Cnd_rcpt_dt_to_Label = p.beansFactory.createLabel("Cnd.rcpt_dt_to_Label");
		p.Cnd_rcpt_dt_to = p.beansFactory.createDateField("Cnd.rcpt_dt_to");
		p.Cnd_rcpt_dt_to.setLabel(p.Cnd_rcpt_dt_to_Label);
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
		p.Cnd_rcpt_usr_cd_Label = p.beansFactory.createLabel("Cnd.rcpt_usr_cd_Label");
		p.Cnd_rcpt_usr_cd = p.beansFactory.createTextField("Cnd.rcpt_usr_cd");
		p.Cnd_rcpt_usr_cd.setLabel(p.Cnd_rcpt_usr_cd_Label);
		p.Cnd_rcpt_usr_nm = p.beansFactory.createTextField("Cnd.rcpt_usr_nm");
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
		p.Cnd_qtn_no_Label = p.beansFactory.createLabel("Cnd.qtn_no_Label");
		p.Cnd_qtn_no = p.beansFactory.createTextField("Cnd.qtn_no");
		p.Cnd_qtn_no.setLabel(p.Cnd_qtn_no_Label);
		p.Cnd_qtn_rev = p.beansFactory.createNumberField("Cnd.qtn_rev");
		p.Cnd_cst_qtn_rqst_no_Label = p.beansFactory.createLabel("Cnd.cst_qtn_rqst_no_Label");
		p.Cnd_cst_qtn_rqst_no = p.beansFactory.createTextField("Cnd.cst_qtn_rqst_no");
		p.Cnd_cst_qtn_rqst_no.setLabel(p.Cnd_cst_qtn_rqst_no_Label);
		p.Cnd_cst_qtn_rqst_d_no_Label = p.beansFactory.createLabel("Cnd.cst_qtn_rqst_d_no_Label");
		p.Cnd_cst_qtn_rqst_d_no = p.beansFactory.createTextField("Cnd.cst_qtn_rqst_d_no");
		p.Cnd_cst_qtn_rqst_d_no.setLabel(p.Cnd_cst_qtn_rqst_d_no_Label);
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_qtn_term_cd_Label = p.beansFactory.createLabel("Cnd.qtn_term_cd_Label");
		p.Cnd_qtn_term_cd = p.beansFactory.createTextComboBox("Cnd.qtn_term_cd");
		p.Cnd_qtn_term_cd.setLabel(p.Cnd_qtn_term_cd_Label);
		p.Cnd_qtn_term_nm = p.beansFactory.createTextField("Cnd.qtn_term_nm");
		p.Cnd_qtn_rslt_rsn_cd_Label = p.beansFactory.createLabel("Cnd.qtn_rslt_rsn_cd_Label");
		p.Cnd_qtn_rslt_rsn_cd = p.beansFactory.createTextComboBox("Cnd.qtn_rslt_rsn_cd");
		p.Cnd_qtn_rslt_rsn_cd.setLabel(p.Cnd_qtn_rslt_rsn_cd_Label);
		p.Cnd_qtn_rslt_rsn_nm = p.beansFactory.createTextField("Cnd.qtn_rslt_rsn_nm");
		p.Cnd_qtn_d_rslt_rsn_cd_Label = p.beansFactory.createLabel("Cnd.qtn_d_rslt_rsn_cd_Label");
		p.Cnd_qtn_d_rslt_rsn_cd = p.beansFactory.createTextComboBox("Cnd.qtn_d_rslt_rsn_cd");
		p.Cnd_qtn_d_rslt_rsn_cd.setLabel(p.Cnd_qtn_d_rslt_rsn_cd_Label);
		p.Cnd_qtn_d_rslt_rsn_nm = p.beansFactory.createTextField("Cnd.qtn_d_rslt_rsn_nm");
		p.Cnd_qtn_rmrks_Label = p.beansFactory.createLabel("Cnd.qtn_rmrks_Label");
		p.Cnd_qtn_rmrks = p.beansFactory.createTextField("Cnd.qtn_rmrks");
		p.Cnd_qtn_rmrks.setLabel(p.Cnd_qtn_rmrks_Label);
		p.Cnd_qtn_d_rmrks_Label = p.beansFactory.createLabel("Cnd.qtn_d_rmrks_Label");
		p.Cnd_qtn_d_rmrks = p.beansFactory.createTextField("Cnd.qtn_d_rmrks");
		p.Cnd_qtn_d_rmrks.setLabel(p.Cnd_qtn_d_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_d_rmrks_Label");
		p.Cnd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.intr_d_rmrks");
		p.Cnd_intr_d_rmrks.setLabel(p.Cnd_intr_d_rmrks_Label);
		p.Cnd_qtn_sub_char1_Label = p.beansFactory.createLabel("Cnd.qtn_sub_char1_Label");
		p.Cnd_qtn_sub_char1 = p.beansFactory.createTextField("Cnd.qtn_sub_char1");
		p.Cnd_qtn_sub_char1.setLabel(p.Cnd_qtn_sub_char1_Label);
		p.Cnd_qtn_sub_char2_Label = p.beansFactory.createLabel("Cnd.qtn_sub_char2_Label");
		p.Cnd_qtn_sub_char2 = p.beansFactory.createTextField("Cnd.qtn_sub_char2");
		p.Cnd_qtn_sub_char2.setLabel(p.Cnd_qtn_sub_char2_Label);
		p.Cnd_qtn_sub_char3_Label = p.beansFactory.createLabel("Cnd.qtn_sub_char3_Label");
		p.Cnd_qtn_sub_char3 = p.beansFactory.createTextField("Cnd.qtn_sub_char3");
		p.Cnd_qtn_sub_char3.setLabel(p.Cnd_qtn_sub_char3_Label);
		p.Cnd_qtn_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.qtn_d_sub_char1_Label");
		p.Cnd_qtn_d_sub_char1 = p.beansFactory.createTextField("Cnd.qtn_d_sub_char1");
		p.Cnd_qtn_d_sub_char1.setLabel(p.Cnd_qtn_d_sub_char1_Label);
		p.Cnd_qtn_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.qtn_d_sub_char2_Label");
		p.Cnd_qtn_d_sub_char2 = p.beansFactory.createTextField("Cnd.qtn_d_sub_char2");
		p.Cnd_qtn_d_sub_char2.setLabel(p.Cnd_qtn_d_sub_char2_Label);
		p.Cnd_qtn_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.qtn_d_sub_char3_Label");
		p.Cnd_qtn_d_sub_char3 = p.beansFactory.createTextField("Cnd.qtn_d_sub_char3");
		p.Cnd_qtn_d_sub_char3.setLabel(p.Cnd_qtn_d_sub_char3_Label);
		p.Cnd_inc_failure_flg = p.beansFactory.createCheckBox("Cnd.inc_failure_flg");
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_qtn_sts_typ = p.beansFactory.createTableColumn("Rslt.qtn_sts_typ", MCColumnType.TEXT);
		p.columnRslt_qtn_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.qtn_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_qtn_no = p.beansFactory.createTableColumn("Rslt.qtn_no", MCColumnType.TEXT);
		p.columnRslt_qtn_rev = p.beansFactory.createTableColumn("Rslt.qtn_rev", MCColumnType.NUMBER);
		p.columnRslt_qtn_prnt_seq = p.beansFactory.createTableColumn("Rslt.qtn_prnt_seq", MCColumnType.NUMBER);
		p.columnRslt_qtn_d_no = p.beansFactory.createTableColumn("Rslt.qtn_d_no", MCColumnType.TEXT);
		p.columnRslt_qtn_dt = p.beansFactory.createTableColumn("Rslt.qtn_dt", MCColumnType.DATE);
		p.columnRslt_valid_dt = p.beansFactory.createTableColumn("Rslt.valid_dt", MCColumnType.DATE);
		p.columnRslt_qtn_typ = p.beansFactory.createTableColumn("Rslt.qtn_typ", MCColumnType.TEXT);
		p.columnRslt_qtn_typ_nm = p.beansFactory.createTableColumn("Rslt.qtn_typ_nm", MCColumnType.TEXT);
		p.columnRslt_failure_flg = p.beansFactory.createTableColumn("Rslt.failure_flg", MCColumnType.CHECK);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_qtn_prnt_flg = p.beansFactory.createTableColumn("Rslt.qtn_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_qtn_prnt_dt = p.beansFactory.createTableColumn("Rslt.qtn_prnt_dt", MCColumnType.DATE);
		p.columnRslt_aprv_no = p.beansFactory.createTableColumn("Rslt.aprv_no", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_flg = p.beansFactory.createTableColumn("Rslt.aprv_flg", MCColumnType.CHECK);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_sls_usr_cd = p.beansFactory.createTableColumn("Rslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnRslt_sls_usr_nm = p.beansFactory.createTableColumn("Rslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_qtn_term_cd = p.beansFactory.createTableColumn("Rslt.qtn_term_cd", MCColumnType.TEXT);
		p.columnRslt_qtn_term_nm = p.beansFactory.createTableColumn("Rslt.qtn_term_nm", MCColumnType.TEXT);
		p.columnRslt_trnspt_cd = p.beansFactory.createTableColumn("Rslt.trnspt_cd", MCColumnType.TEXT);
		p.columnRslt_trnspt_nm = p.beansFactory.createTableColumn("Rslt.trnspt_nm", MCColumnType.TEXT);
		p.columnRslt_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_cst_qtn_rqst_no = p.beansFactory.createTableColumn("Rslt.cst_qtn_rqst_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_dt = p.beansFactory.createTableColumn("Rslt.rcpt_dt", MCColumnType.DATE);
		p.columnRslt_rcpt_usr_cd = p.beansFactory.createTableColumn("Rslt.rcpt_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rcpt_usr_nm = p.beansFactory.createTableColumn("Rslt.rcpt_usr_nm", MCColumnType.TEXT);
		p.columnRslt_qtn_rmrks = p.beansFactory.createTableColumn("Rslt.qtn_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_qtn_rslt_rsn_cd = p.beansFactory.createTableColumn("Rslt.qtn_rslt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_qtn_rslt_rsn_nm = p.beansFactory.createTableColumn("Rslt.qtn_rslt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_qtn_rslt_rsn_rmrks = p.beansFactory.createTableColumn("Rslt.qtn_rslt_rsn_rmrks", MCColumnType.TEXT);
		p.columnRslt_qtn_sub_char1 = p.beansFactory.createTableColumn("Rslt.qtn_sub_char1", MCColumnType.TEXT);
		p.columnRslt_qtn_sub_char2 = p.beansFactory.createTableColumn("Rslt.qtn_sub_char2", MCColumnType.TEXT);
		p.columnRslt_qtn_sub_char3 = p.beansFactory.createTableColumn("Rslt.qtn_sub_char3", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_cntry_org_cd = p.beansFactory.createTableColumn("Rslt.cntry_org_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_org_nm = p.beansFactory.createTableColumn("Rslt.cntry_org_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_qty_dec_place = p.beansFactory.createTableColumn("Rslt.trd_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_qty_dec_place = p.beansFactory.createTableColumn("Rslt.base_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_upri_rate = p.beansFactory.createTableColumn("Rslt.upri_rate", MCColumnType.NUMBER);
		p.columnRslt_dscnt_rsn_cd = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_dscnt_rsn_nm = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_tax_fix_flg = p.beansFactory.createTableColumn("Rslt.tax_fix_flg", MCColumnType.CHECK);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_set_itm_grp_no = p.beansFactory.createTableColumn("Rslt.set_itm_grp_no", MCColumnType.NUMBER);
		p.columnRslt_dest_cd1 = p.beansFactory.createTableColumn("Rslt.dest_cd1", MCColumnType.TEXT);
		p.columnRslt_dest_nm1 = p.beansFactory.createTableColumn("Rslt.dest_nm1", MCColumnType.TEXT);
		p.columnRslt_dest_cd2 = p.beansFactory.createTableColumn("Rslt.dest_cd2", MCColumnType.TEXT);
		p.columnRslt_dest_nm2 = p.beansFactory.createTableColumn("Rslt.dest_nm2", MCColumnType.TEXT);
		p.columnRslt_dest_cd3 = p.beansFactory.createTableColumn("Rslt.dest_cd3", MCColumnType.TEXT);
		p.columnRslt_dest_nm3 = p.beansFactory.createTableColumn("Rslt.dest_nm3", MCColumnType.TEXT);
		p.columnRslt_qtn_d_rmrks = p.beansFactory.createTableColumn("Rslt.qtn_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_qtn_d_rslt_rsn_cd = p.beansFactory.createTableColumn("Rslt.qtn_d_rslt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_qtn_d_rslt_rsn_nm = p.beansFactory.createTableColumn("Rslt.qtn_d_rslt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_qtn_d_rslt_rsn_rmrks = p.beansFactory.createTableColumn("Rslt.qtn_d_rslt_rsn_rmrks", MCColumnType.TEXT);
		p.columnRslt_qtn_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.qtn_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_qtn_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.qtn_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_qtn_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.qtn_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
		p.Btn_open_MSBBP1310 = p.beansFactory.createButton("Btn.open_MSBBP1310", "open");
		p.Btn_open_MSBBP1110 = p.beansFactory.createButton("Btn.open_MSBBP1110", "open");
		p.Btn_prnt_qtn = p.beansFactory.createButton("Btn.prnt_qtn", "prnt");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_QtnSrch p) {
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
	protected static void jbInitDispUnit(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.Qtn_typPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Qtn_typ]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitQtn_typ(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Qtn_typPanel.setBorder(p.Qtn_typTitledBorder);
		p.add(p.Qtn_typPanel);
		p.Qtn_typPanel.setNextBeans(p.Qtn_sts_typPanel);
		p.Qtn_typPanel.setValueCheck(false);
		p.Qtn_typPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Qtn_typPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Qtn_sts_typ]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitQtn_sts_typ(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Qtn_sts_typPanel.setBorder(p.Qtn_sts_typTitledBorder);
		p.add(p.Qtn_sts_typPanel);
		p.Qtn_sts_typPanel.setNextBeans(p.TopPanel);
		p.Qtn_sts_typPanel.setValueCheck(false);
		p.Qtn_sts_typPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Qtn_sts_typPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_QtnSrch p) {
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
	protected static void jbInitFold(MSBBP_QtnSrch p) {
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
	protected static void jbInitTab1(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.Aprv_sts_typPanel, null);
		p.Tab1Panel.setLastBeans(p.Aprv_sts_typPanel);
		p.Aprv_sts_typPanel.setNextBeans(p.QtnPrntPanel);
		p.Tab1Panel.add(p.QtnPrntPanel, null);
		p.QtnPrntPanel.setNextBeans(p.IvPanel);
		p.Tab1Panel.add(p.IvPanel, null);
		p.IvPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Aprv_sts_typ]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprv_sts_typ(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Aprv_sts_typPanel.setBorder(p.Aprv_sts_typTitledBorder);
		p.Aprv_sts_typPanel.setValueCheck(false);
		p.Aprv_sts_typPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Aprv_sts_typPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [QtnPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitQtnPrnt(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.QtnPrntPanel.setBorder(p.QtnPrntTitledBorder);
		p.QtnPrntPanel.setValueCheck(false);
		p.QtnPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.QtnPrntPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIv(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.IvPanel.setBorder(p.IvTitledBorder);
		p.IvPanel.setValueCheck(false);
		p.IvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvPanel.setLayoutPosition("NWXCX");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_QtnSrch p) {
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
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_QtnSrch p) {
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
	protected static void jbInitTab4(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_disp_Group);
		p.Cnd_disp_Group.setFirstBeans(p.Cnd_disp_DTL);
		p.Cnd_disp_DTL.setActionCommand("DTL");
		p.Cnd_disp_Group.add(p.Cnd_disp_DTL);
		p.DispUnitPanel.add(p.Cnd_disp_DTL);
		p.Cnd_disp_DTL.setNextBeans(p.Cnd_disp_HDR);
		p.Cnd_disp_HDR.setActionCommand("HDR");
		p.Cnd_disp_Group.add(p.Cnd_disp_HDR);
		p.DispUnitPanel.add(p.Cnd_disp_HDR);
		p.Cnd_disp_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.disp_META);
		p.Qtn_typPanel.add(p.Cnd_creating);
		p.Qtn_typPanel.setLastBeans(p.Cnd_creating);
		p.Cnd_creating.setNextBeans(p.Cnd_pre_qtn);
		p.Cnd_creating.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.creating_META);
		p.Qtn_typPanel.add(p.Cnd_pre_qtn);
		p.Cnd_pre_qtn.setNextBeans(p.Cnd_qtn);
		p.Cnd_pre_qtn.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.pre_qtn_META);
		p.Qtn_typPanel.add(p.Cnd_qtn);
		p.Cnd_qtn.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_META);
		p.Qtn_sts_typPanel.add(p.Cnd_non);
		p.Qtn_sts_typPanel.setLastBeans(p.Cnd_non);
		p.Cnd_non.setNextBeans(p.Cnd_part);
		p.Cnd_non.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.non_META);
		p.Qtn_sts_typPanel.add(p.Cnd_part);
		p.Cnd_part.setNextBeans(p.Cnd_compl);
		p.Cnd_part.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.part_META);
		p.Qtn_sts_typPanel.add(p.Cnd_compl);
		p.Cnd_compl.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.compl_META);
		p.Aprv_sts_typPanel.add(p.Cnd_opn);
		p.Aprv_sts_typPanel.setLastBeans(p.Cnd_opn);
		p.Cnd_opn.setNextBeans(p.Cnd_fix);
		p.Cnd_opn.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.opn_META);
		p.Aprv_sts_typPanel.add(p.Cnd_fix);
		p.Cnd_fix.setNextBeans(p.Cnd_acpt);
		p.Cnd_fix.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.fix_META);
		p.Aprv_sts_typPanel.add(p.Cnd_acpt);
		p.Cnd_acpt.setNextBeans(p.Cnd_rjct);
		p.Cnd_acpt.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.acpt_META);
		p.Aprv_sts_typPanel.add(p.Cnd_rjct);
		p.Cnd_rjct.setNextBeans(p.Cnd_last_rjct);
		p.Cnd_rjct.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.rjct_META);
		p.Aprv_sts_typPanel.add(p.Cnd_last_rjct);
		p.Cnd_last_rjct.setNextBeans(p.Cnd_excld);
		p.Cnd_last_rjct.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.last_rjct_META);
		p.Aprv_sts_typPanel.add(p.Cnd_excld);
		p.Cnd_excld.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.excld_META);
		p.QtnPrntPanel.add(p.Cnd_yet);
		p.QtnPrntPanel.setLastBeans(p.Cnd_yet);
		p.Cnd_yet.setNextBeans(p.Cnd_prnt);
		p.Cnd_yet.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.yet_META);
		p.QtnPrntPanel.add(p.Cnd_prnt);
		p.Cnd_prnt.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.prnt_META);
		p.IvPanel.add(p.Cnd_iv_trgt_flg);
		p.IvPanel.setLastBeans(p.Cnd_iv_trgt_flg);
		p.Cnd_iv_trgt_flg.setNextBeans(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.iv_trgt_flg_META);
		p.IvPanel.add(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_not_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.iv_not_trgt_flg_META);
		p.CndPanel.add(p.Cnd_qtn_dt_fr_Label);
		p.CndPanel.add(p.Cnd_qtn_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_qtn_dt_fr);
		p.Cnd_qtn_dt_fr.setNextBeans(p.Cnd_qtn_dt_to);
		p.Cnd_qtn_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_dt_fr_META);
		p.Cnd_qtn_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_qtn_dt_to_Label);
		p.CndPanel.add(p.Cnd_qtn_dt_to);
		p.Cnd_qtn_dt_to.setNextBeans(p.Cnd_valid_dt_fr);
		p.Cnd_qtn_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_dt_to_META);
		p.Cnd_qtn_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_valid_dt_fr_Label);
		p.CndPanel.add(p.Cnd_valid_dt_fr);
		p.Cnd_valid_dt_fr.setNextBeans(p.Cnd_valid_dt_to);
		p.Cnd_valid_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.valid_dt_fr_META);
		p.Cnd_valid_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_valid_dt_to_Label);
		p.CndPanel.add(p.Cnd_valid_dt_to);
		p.Cnd_valid_dt_to.setNextBeans(p.Cnd_rcpt_dt_fr);
		p.Cnd_valid_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.valid_dt_to_META);
		p.Cnd_valid_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcpt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcpt_dt_fr);
		p.Cnd_rcpt_dt_fr.setNextBeans(p.Cnd_rcpt_dt_to);
		p.Cnd_rcpt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.rcpt_dt_fr_META);
		p.Cnd_rcpt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcpt_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcpt_dt_to);
		p.Cnd_rcpt_dt_to.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_rcpt_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.rcpt_dt_to_META);
		p.Cnd_rcpt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_rcpt_usr_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_rcpt_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rcpt_usr_cd);
		p.Cnd_rcpt_usr_cd.setNextBeans(p.Cnd_rcpt_usr_nm);
		p.Cnd_rcpt_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.rcpt_usr_cd_META);
		p.Cnd_rcpt_usr_cd.addLinkBeans(p.Cnd_rcpt_usr_nm);
		p.Cnd_rcpt_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcpt_usr_cd, true);
		p.CndPanel.add(p.Cnd_rcpt_usr_nm);
		p.Cnd_rcpt_usr_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_rcpt_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.rcpt_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rcpt_usr_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_qtn_no);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.CndPanel.add(p.Cnd_qtn_no_Label);
		p.CndPanel.add(p.Cnd_qtn_no);
		p.Cnd_qtn_no.setNextBeans(p.Cnd_qtn_rev);
		p.Cnd_qtn_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_no_META);
		p.setPluralValueEnable(p.Cnd_qtn_no, true);
		p.CndPanel.add(p.Cnd_qtn_rev);
		p.Cnd_qtn_rev.setNextBeans(p.Cnd_cst_qtn_rqst_no);
		p.Cnd_qtn_rev.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_rev_META);
		p.CndPanel.add(p.Cnd_cst_qtn_rqst_no_Label);
		p.CndPanel.add(p.Cnd_cst_qtn_rqst_no);
		p.Cnd_cst_qtn_rqst_no.setNextBeans(p.Cnd_cst_qtn_rqst_d_no);
		p.Cnd_cst_qtn_rqst_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.cst_qtn_rqst_no_META);
		p.setPluralValueEnable(p.Cnd_cst_qtn_rqst_no, true);
		p.CndPanel.add(p.Cnd_cst_qtn_rqst_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_qtn_rqst_d_no);
		p.Cnd_cst_qtn_rqst_d_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_cst_qtn_rqst_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.cst_qtn_rqst_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_qtn_rqst_d_no, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
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
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.trd_nm_META);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_qtn_term_cd);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.Cnd_qtn_term_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_qtn_term_cd, true);
		p.Cnd_qtn_term_cd.setLinkBeans(p.Cnd_qtn_term_nm);
		p.CndPanel.add(p.Cnd_qtn_term_cd_Label);
		p.CndPanel.add(p.Cnd_qtn_term_cd);
		p.Cnd_qtn_term_cd.setNextBeans(p.Cnd_qtn_term_nm);
		p.Cnd_qtn_term_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_term_cd_META);
		p.CndPanel.add(p.Cnd_qtn_term_nm);
		p.Cnd_qtn_term_nm.setNextBeans(p.Cnd_qtn_rslt_rsn_cd);
		p.Cnd_qtn_term_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_term_nm_META);
		p.setPluralValueEnable(p.Cnd_qtn_term_nm, true);
		p.Cnd_qtn_rslt_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_qtn_rslt_rsn_cd, true);
		p.Cnd_qtn_rslt_rsn_cd.setLinkBeans(p.Cnd_qtn_rslt_rsn_nm);
		p.CndPanel.add(p.Cnd_qtn_rslt_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_qtn_rslt_rsn_cd);
		p.Cnd_qtn_rslt_rsn_cd.setNextBeans(p.Cnd_qtn_rslt_rsn_nm);
		p.Cnd_qtn_rslt_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_rslt_rsn_cd_META);
		p.CndPanel.add(p.Cnd_qtn_rslt_rsn_nm);
		p.Cnd_qtn_rslt_rsn_nm.setNextBeans(p.Cnd_qtn_d_rslt_rsn_cd);
		p.Cnd_qtn_rslt_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_rslt_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_qtn_rslt_rsn_nm, true);
		p.Cnd_qtn_d_rslt_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_qtn_d_rslt_rsn_cd, true);
		p.Cnd_qtn_d_rslt_rsn_cd.setLinkBeans(p.Cnd_qtn_d_rslt_rsn_nm);
		p.CndPanel.add(p.Cnd_qtn_d_rslt_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_qtn_d_rslt_rsn_cd);
		p.Cnd_qtn_d_rslt_rsn_cd.setNextBeans(p.Cnd_qtn_d_rslt_rsn_nm);
		p.Cnd_qtn_d_rslt_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_d_rslt_rsn_cd_META);
		p.CndPanel.add(p.Cnd_qtn_d_rslt_rsn_nm);
		p.Cnd_qtn_d_rslt_rsn_nm.setNextBeans(p.Cnd_qtn_rmrks);
		p.Cnd_qtn_d_rslt_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_d_rslt_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_qtn_d_rslt_rsn_nm, true);
		p.CndPanel.add(p.Cnd_qtn_rmrks_Label);
		p.CndPanel.add(p.Cnd_qtn_rmrks);
		p.Cnd_qtn_rmrks.setNextBeans(p.Cnd_qtn_d_rmrks);
		p.Cnd_qtn_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_rmrks_META);
		p.setPluralValueEnable(p.Cnd_qtn_rmrks, true);
		p.CndPanel.add(p.Cnd_qtn_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_qtn_d_rmrks);
		p.Cnd_qtn_d_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_qtn_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_qtn_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_qtn_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_qtn_sub_char1_Label);
		p.CndPanel.add(p.Cnd_qtn_sub_char1);
		p.Cnd_qtn_sub_char1.setNextBeans(p.Cnd_qtn_sub_char2);
		p.Cnd_qtn_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_qtn_sub_char1, true);
		p.CndPanel.add(p.Cnd_qtn_sub_char2_Label);
		p.CndPanel.add(p.Cnd_qtn_sub_char2);
		p.Cnd_qtn_sub_char2.setNextBeans(p.Cnd_qtn_sub_char3);
		p.Cnd_qtn_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_qtn_sub_char2, true);
		p.CndPanel.add(p.Cnd_qtn_sub_char3_Label);
		p.CndPanel.add(p.Cnd_qtn_sub_char3);
		p.Cnd_qtn_sub_char3.setNextBeans(p.Cnd_qtn_d_sub_char1);
		p.Cnd_qtn_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_qtn_sub_char3, true);
		p.CndPanel.add(p.Cnd_qtn_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_qtn_d_sub_char1);
		p.Cnd_qtn_d_sub_char1.setNextBeans(p.Cnd_qtn_d_sub_char2);
		p.Cnd_qtn_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_qtn_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_qtn_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_qtn_d_sub_char2);
		p.Cnd_qtn_d_sub_char2.setNextBeans(p.Cnd_qtn_d_sub_char3);
		p.Cnd_qtn_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_qtn_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_qtn_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_qtn_d_sub_char3);
		p.Cnd_qtn_d_sub_char3.setNextBeans(p.Cnd_inc_failure_flg);
		p.Cnd_qtn_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.qtn_d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_qtn_d_sub_char3, true);
		p.CndPanel.add(p.Cnd_inc_failure_flg);
		p.Cnd_inc_failure_flg.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_inc_failure_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.inc_failure_flg_META);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1120.CndR.inc_can_flg_META);
		p.CstCndPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstCndPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_QtnSrch p) {
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
	protected static void jbInitRPnl(MSBBP_QtnSrch p) {
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
	protected static void jbInitRslt(MSBBP_QtnSrch p) {
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
	protected static void jbInitBtn(MSBBP_QtnSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setNextBeans(p.Btn_open_MSBBP1310);
		p.Btn_open_MSBBP1310.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBBP1310);
		p.Btn_open_MSBBP1310.setNextBeans(p.Btn_open_MSBBP1110);
		p.Btn_open_MSBBP1110.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBBP1110);
		p.Btn_open_MSBBP1110.setNextBeans(p.Btn_prnt_qtn);
		p.Btn_prnt_qtn.setIcon("PRINT");
		p.Btn_prnt_qtn.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt_qtn);
		p.Btn_prnt_qtn.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setNextBeans(p.Btn_select_all);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBB.MSBBP1120.BtnR.indiv_prnt_flg_META);
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
		MSBBP_QtnSrch_MC.mcInitScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitDispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitQtn_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitQtn_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitTop((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitFold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitTab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitAprv_sts_typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitQtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitIv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitTab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitTab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitTab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitDlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitCstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitCtrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitRPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitRslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.mcInitBtn((MSBBP_QtnSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_DispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Qtn__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Qtn__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Top((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Fold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Tab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Aprv__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_QtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Iv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Tab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Tab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Tab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_DlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_CstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_ItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Cnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_RPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Rslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__PRNT_Btn((MSBBP_QtnSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBBP_QtnSrch_MC.statusInitPRNT_ScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_DispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Qtn__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Qtn__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Top((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Fold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Tab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Aprv__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_QtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Iv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Tab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Tab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Tab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_DlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_CstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_ItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Cnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Ctrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_RPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Rslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitPRNT_Btn((MSBBP_QtnSrch)this);

		// [SRCH_HDR]ステータスのモードの設定
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_ScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_DispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Qtn__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Qtn__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Top((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Fold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Tab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Aprv__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_QtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Iv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Tab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Tab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Tab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_DlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_CstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_ItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Cnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Ctrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_RPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Rslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__HDR_Btn((MSBBP_QtnSrch)this);

		// [REF_HDR]ステータスのモードの設定
		MSBBP_QtnSrch_MC.statusInitREF__HDR_ScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_DispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Qtn__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Qtn__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Top((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Fold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Tab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Aprv__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_QtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Iv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Tab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Tab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Tab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_DlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_CstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_ItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Cnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Ctrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_RPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Rslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__HDR_Btn((MSBBP_QtnSrch)this);

		// [SRCH_DTL]ステータスのモードの設定
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_ScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_DispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Qtn__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Qtn__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Top((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Fold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Tab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Aprv__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_QtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Iv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Tab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Tab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Tab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_DlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_CstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_ItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Cnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Ctrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_RPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Rslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitSRCH__DTL_Btn((MSBBP_QtnSrch)this);

		// [REF_DTL]ステータスのモードの設定
		MSBBP_QtnSrch_MC.statusInitREF__DTL_ScreenOpe((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_DispUnit((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Qtn__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Qtn__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Top((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Fold((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Tab1((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Aprv__sts__typ((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_QtnPrnt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Iv((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Tab2((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Tab3((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Tab4((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_DlvCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_CstCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_ItmCnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Cnd((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Ctrl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_RPnl((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Rslt((MSBBP_QtnSrch)this);
		MSBBP_QtnSrch_MC.statusInitREF__DTL_Btn((MSBBP_QtnSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_QtnSrch p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Qtn_typ]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitQtn_typ(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Qtn_sts_typ]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitQtn_sts_typ(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_QtnSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Aprv_sts_typ]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprv_sts_typ(MSBBP_QtnSrch p) {
	}

	/**
	 *  [QtnPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitQtnPrnt(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Iv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIv(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_QtnSrch p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBBP_QtnSrch p) {
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBBP_QtnSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBBP_QtnSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_QtnSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_disp_Group.addAllListener(p);
		p.Cnd_disp_DTL.addAllListener(p);
		p.Cnd_disp_HDR.addAllListener(p);
		p.Cnd_creating.addAllListener(p);
		p.Cnd_pre_qtn.addAllListener(p);
		p.Cnd_qtn.addAllListener(p);
		p.Cnd_non.addAllListener(p);
		p.Cnd_part.addAllListener(p);
		p.Cnd_compl.addAllListener(p);
		p.Cnd_opn.addAllListener(p);
		p.Cnd_fix.addAllListener(p);
		p.Cnd_acpt.addAllListener(p);
		p.Cnd_rjct.addAllListener(p);
		p.Cnd_last_rjct.addAllListener(p);
		p.Cnd_excld.addAllListener(p);
		p.Cnd_yet.addAllListener(p);
		p.Cnd_prnt.addAllListener(p);
		p.Cnd_iv_trgt_flg.addAllListener(p);
		p.Cnd_iv_not_trgt_flg.addAllListener(p);
		p.Cnd_qtn_dt_fr.setListListener(p);
		p.Cnd_qtn_dt_fr.addAllListener(p);
		p.Cnd_qtn_dt_to.setListListener(p);
		p.Cnd_qtn_dt_to.addAllListener(p);
		p.Cnd_valid_dt_fr.setListListener(p);
		p.Cnd_valid_dt_fr.addAllListener(p);
		p.Cnd_valid_dt_to.setListListener(p);
		p.Cnd_valid_dt_to.addAllListener(p);
		p.Cnd_rcpt_dt_fr.setListListener(p);
		p.Cnd_rcpt_dt_fr.addAllListener(p);
		p.Cnd_rcpt_dt_to.setListListener(p);
		p.Cnd_rcpt_dt_to.addAllListener(p);
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
		p.Cnd_rcpt_usr_cd.setListListener(p);
		p.Cnd_rcpt_usr_cd.addAllListener(p);
		p.Cnd_rcpt_usr_nm.setListListener(p);
		p.Cnd_rcpt_usr_nm.addAllListener(p);
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
		p.Cnd_qtn_no.setListListener(p);
		p.Cnd_qtn_no.addAllListener(p);
		p.Cnd_qtn_rev.setListListener(p);
		p.Cnd_qtn_rev.addAllListener(p);
		p.Cnd_cst_qtn_rqst_no.setListListener(p);
		p.Cnd_cst_qtn_rqst_no.addAllListener(p);
		p.Cnd_cst_qtn_rqst_d_no.setListListener(p);
		p.Cnd_cst_qtn_rqst_d_no.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_qtn_term_cd.setListListener(p);
		p.Cnd_qtn_term_cd.addAllListener(p);
		p.Cnd_qtn_term_nm.setListListener(p);
		p.Cnd_qtn_term_nm.addAllListener(p);
		p.Cnd_qtn_rslt_rsn_cd.setListListener(p);
		p.Cnd_qtn_rslt_rsn_cd.addAllListener(p);
		p.Cnd_qtn_rslt_rsn_nm.setListListener(p);
		p.Cnd_qtn_rslt_rsn_nm.addAllListener(p);
		p.Cnd_qtn_d_rslt_rsn_cd.setListListener(p);
		p.Cnd_qtn_d_rslt_rsn_cd.addAllListener(p);
		p.Cnd_qtn_d_rslt_rsn_nm.setListListener(p);
		p.Cnd_qtn_d_rslt_rsn_nm.addAllListener(p);
		p.Cnd_qtn_rmrks.setListListener(p);
		p.Cnd_qtn_rmrks.addAllListener(p);
		p.Cnd_qtn_d_rmrks.setListListener(p);
		p.Cnd_qtn_d_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_intr_d_rmrks.setListListener(p);
		p.Cnd_intr_d_rmrks.addAllListener(p);
		p.Cnd_qtn_sub_char1.setListListener(p);
		p.Cnd_qtn_sub_char1.addAllListener(p);
		p.Cnd_qtn_sub_char2.setListListener(p);
		p.Cnd_qtn_sub_char2.addAllListener(p);
		p.Cnd_qtn_sub_char3.setListListener(p);
		p.Cnd_qtn_sub_char3.addAllListener(p);
		p.Cnd_qtn_d_sub_char1.setListListener(p);
		p.Cnd_qtn_d_sub_char1.addAllListener(p);
		p.Cnd_qtn_d_sub_char2.setListListener(p);
		p.Cnd_qtn_d_sub_char2.addAllListener(p);
		p.Cnd_qtn_d_sub_char3.setListListener(p);
		p.Cnd_qtn_d_sub_char3.addAllListener(p);
		p.Cnd_inc_failure_flg.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_QtnSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_QtnSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_QtnSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_qtn_sts_typ.addAllListener(p);
		p.columnRslt_qtn_sts_typ.setListListener(p);
		p.columnRslt_qtn_sts_typ_nm.addAllListener(p);
		p.columnRslt_qtn_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_qtn_no.addAllListener(p);
		p.columnRslt_qtn_no.setListListener(p);
		p.columnRslt_qtn_rev.addAllListener(p);
		p.columnRslt_qtn_rev.setListListener(p);
		p.columnRslt_qtn_prnt_seq.addAllListener(p);
		p.columnRslt_qtn_prnt_seq.setListListener(p);
		p.columnRslt_qtn_d_no.addAllListener(p);
		p.columnRslt_qtn_d_no.setListListener(p);
		p.columnRslt_qtn_dt.addAllListener(p);
		p.columnRslt_qtn_dt.setListListener(p);
		p.columnRslt_valid_dt.addAllListener(p);
		p.columnRslt_valid_dt.setListListener(p);
		p.columnRslt_qtn_typ.addAllListener(p);
		p.columnRslt_qtn_typ.setListListener(p);
		p.columnRslt_qtn_typ_nm.addAllListener(p);
		p.columnRslt_qtn_typ_nm.setListListener(p);
		p.columnRslt_failure_flg.addAllListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_qtn_prnt_flg.addAllListener(p);
		p.columnRslt_qtn_prnt_dt.addAllListener(p);
		p.columnRslt_qtn_prnt_dt.setListListener(p);
		p.columnRslt_aprv_no.addAllListener(p);
		p.columnRslt_aprv_no.setListListener(p);
		p.columnRslt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_aprv_sts_typ.setListListener(p);
		p.columnRslt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_flg.addAllListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_sls_usr_cd.addAllListener(p);
		p.columnRslt_sls_usr_cd.setListListener(p);
		p.columnRslt_sls_usr_nm.addAllListener(p);
		p.columnRslt_sls_usr_nm.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_upri_dec_place.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_base_cur_upri_dec_place.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_qtn_term_cd.addAllListener(p);
		p.columnRslt_qtn_term_cd.setListListener(p);
		p.columnRslt_qtn_term_nm.addAllListener(p);
		p.columnRslt_qtn_term_nm.setListListener(p);
		p.columnRslt_trnspt_cd.addAllListener(p);
		p.columnRslt_trnspt_cd.setListListener(p);
		p.columnRslt_trnspt_nm.addAllListener(p);
		p.columnRslt_trnspt_nm.setListListener(p);
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
		p.columnRslt_tterm_cd3.addAllListener(p);
		p.columnRslt_tterm_cd3.setListListener(p);
		p.columnRslt_tterm_nm3.addAllListener(p);
		p.columnRslt_tterm_nm3.setListListener(p);
		p.columnRslt_tterm_rmrks3.addAllListener(p);
		p.columnRslt_tterm_rmrks3.setListListener(p);
		p.columnRslt_cst_qtn_rqst_no.addAllListener(p);
		p.columnRslt_cst_qtn_rqst_no.setListListener(p);
		p.columnRslt_rcpt_dt.addAllListener(p);
		p.columnRslt_rcpt_dt.setListListener(p);
		p.columnRslt_rcpt_usr_cd.addAllListener(p);
		p.columnRslt_rcpt_usr_cd.setListListener(p);
		p.columnRslt_rcpt_usr_nm.addAllListener(p);
		p.columnRslt_rcpt_usr_nm.setListListener(p);
		p.columnRslt_qtn_rmrks.addAllListener(p);
		p.columnRslt_qtn_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_qtn_rslt_rsn_cd.addAllListener(p);
		p.columnRslt_qtn_rslt_rsn_cd.setListListener(p);
		p.columnRslt_qtn_rslt_rsn_nm.addAllListener(p);
		p.columnRslt_qtn_rslt_rsn_nm.setListListener(p);
		p.columnRslt_qtn_rslt_rsn_rmrks.addAllListener(p);
		p.columnRslt_qtn_rslt_rsn_rmrks.setListListener(p);
		p.columnRslt_qtn_sub_char1.addAllListener(p);
		p.columnRslt_qtn_sub_char1.setListListener(p);
		p.columnRslt_qtn_sub_char2.addAllListener(p);
		p.columnRslt_qtn_sub_char2.setListListener(p);
		p.columnRslt_qtn_sub_char3.addAllListener(p);
		p.columnRslt_qtn_sub_char3.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_asset_mng_typ_nm.addAllListener(p);
		p.columnRslt_asset_mng_typ_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_cntry_org_cd.addAllListener(p);
		p.columnRslt_cntry_org_cd.setListListener(p);
		p.columnRslt_cntry_org_nm.addAllListener(p);
		p.columnRslt_cntry_org_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_qty_dec_place.addAllListener(p);
		p.columnRslt_trd_qty_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_qty_dec_place.addAllListener(p);
		p.columnRslt_base_qty_dec_place.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_upri_rate.addAllListener(p);
		p.columnRslt_upri_rate.setListListener(p);
		p.columnRslt_dscnt_rsn_cd.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.setListListener(p);
		p.columnRslt_dscnt_rsn_nm.addAllListener(p);
		p.columnRslt_dscnt_rsn_nm.setListListener(p);
		p.columnRslt_tax_fix_flg.addAllListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_tax_rate.addAllListener(p);
		p.columnRslt_tax_rate.setListListener(p);
		p.columnRslt_set_itm_grp_no.addAllListener(p);
		p.columnRslt_set_itm_grp_no.setListListener(p);
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
		p.columnRslt_qtn_d_rmrks.addAllListener(p);
		p.columnRslt_qtn_d_rmrks.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_qtn_d_rslt_rsn_cd.addAllListener(p);
		p.columnRslt_qtn_d_rslt_rsn_cd.setListListener(p);
		p.columnRslt_qtn_d_rslt_rsn_nm.addAllListener(p);
		p.columnRslt_qtn_d_rslt_rsn_nm.setListListener(p);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.addAllListener(p);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.setListListener(p);
		p.columnRslt_qtn_d_sub_char1.addAllListener(p);
		p.columnRslt_qtn_d_sub_char1.setListListener(p);
		p.columnRslt_qtn_d_sub_char2.addAllListener(p);
		p.columnRslt_qtn_d_sub_char2.setListListener(p);
		p.columnRslt_qtn_d_sub_char3.addAllListener(p);
		p.columnRslt_qtn_d_sub_char3.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
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
	protected static void mcInitBtn(MSBBP_QtnSrch p) {
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
		p.Btn_open_MSBBP1310.addAllListener(p);
		p.Btn_open_MSBBP1310.setAPMethodName("doBtn_open_MSBBP1310");
		p.Btn_open_MSBBP1110.addAllListener(p);
		p.Btn_open_MSBBP1110.setAPMethodName("doBtn_open_MSBBP1110");
		p.Btn_prnt_qtn.addAllListener(p);
		p.Btn_prnt_qtn.setAPMethodName("doBtn_prnt_qtn");
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_DispUnit(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Qtn_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Qtn__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Qtn_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Qtn__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Aprv_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Aprv__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[QtnPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_QtnPrnt(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Iv(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab4(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_DlvCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_CstCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ItmCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBBP_QtnSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_disp_Group.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_creating.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_pre_qtn.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_qtn.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_non.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_part.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_compl.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_opn.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_fix.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rjct.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_last_rjct.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_excld.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_yet.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_prnt.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_qtn_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_valid_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_valid_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_rev.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_d_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_term_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_term_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_d_rslt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_failure_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBBP_QtnSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBBP_QtnSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sts_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_seq.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_valid_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_failure_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_cst_qtn_rqst_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_upri_rate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_std_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_slo_trnst_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_trnst_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_qtn_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
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

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBBP_QtnSrch p){
		p.Btn_open_MSBBP1210.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBBP1110.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DispUnit(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Qtn_typ]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Qtn__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Qtn_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Qtn__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Aprv_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Aprv__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[QtnPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_QtnPrnt(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Iv(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DlvCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CstCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBBP_QtnSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_disp_Group.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_creating.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pre_qtn.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_qtn.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_non.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_part.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_compl.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_opn.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_fix.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rjct.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_last_rjct.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_excld.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_yet.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_prnt.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_qtn_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_valid_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_valid_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_rev.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_term_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_term_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_d_rslt_rsn_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_failure_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBBP_QtnSrch p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBBP_QtnSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBBP_QtnSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_qtn_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_valid_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_failure_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_cst_qtn_rqst_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_upri_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_std_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_slo_trnst_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_trnst_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_qtn_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
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

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBBP_QtnSrch p){
		p.Btn_open_MSBBP1210.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBBP1310.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBBP1110.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_qtn.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ScreenOpe(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DispUnit(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Qtn_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Qtn__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Qtn_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Qtn__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Top(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab1(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Aprv_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Aprv__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[QtnPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_QtnPrnt(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Iv(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab2(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab3(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab4(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DlvCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_CstCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ItmCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Cnd(MSBBP_QtnSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_disp_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_creating.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_pre_qtn.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_qtn.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_non.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_part.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_compl.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_opn.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_fix.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_acpt.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_rjct.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_last_rjct.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_excld.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_yet.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_prnt.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_qtn_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_valid_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_valid_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_usr_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_usr_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
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
		p.Cnd_qtn_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_rev.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_term_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_term_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_d_rslt_rsn_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_d_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_sub_char1.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_sub_char2.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_sub_char3.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_failure_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Ctrl(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_RPnl(MSBBP_QtnSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Rslt(MSBBP_QtnSrch p){
		p.columnRslt_check.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sts_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_sts_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_valid_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_failure_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_cst_qtn_rqst_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_upri_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_std_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_slo_trnst_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_trnst_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_qtn_d_sub_char1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Btn(MSBBP_QtnSrch p){
		p.Btn_open_MSBBP1210.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1110.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ScreenOpe(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DispUnit(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Qtn_typ]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Qtn__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Qtn_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Qtn__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Aprv_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Aprv__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[QtnPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_QtnPrnt(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Iv(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab4(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DlvCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_CstCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBBP_QtnSrch p){
		p.Cnd_ope_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_disp_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_creating.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pre_qtn.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_qtn.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_non.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_part.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_compl.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_opn.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_fix.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_acpt.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rjct.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_last_rjct.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_excld.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_yet.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_prnt.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_qtn_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_valid_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_valid_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_usr_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_usr_nm.putMode(p, REF_HDR, MCMode.ENABLE);
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
		p.Cnd_qtn_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_rev.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_term_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_term_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_d_rslt_rsn_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_sub_char1.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_sub_char2.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_sub_char3.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_qtn_d_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_failure_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBBP_QtnSrch p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Rslt(MSBBP_QtnSrch p){
		p.columnRslt_check.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sts_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_sts_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_valid_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_failure_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_cst_qtn_rqst_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_upri_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_std_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_set_itm_grp_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_slo_trnst_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_trnst_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_qtn_d_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
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

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBBP_QtnSrch p){
		p.Btn_open_MSBBP1210.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBBP1310.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBBP1110.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_prnt_qtn.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ScreenOpe(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_DispUnit(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Qtn_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Qtn__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Qtn_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Qtn__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Top(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fold(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab1(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Aprv_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Aprv__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[QtnPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_QtnPrnt(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Iv(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab2(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab3(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab4(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_DlvCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_CstCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ItmCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Cnd(MSBBP_QtnSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_disp_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_creating.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_pre_qtn.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_qtn.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_non.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_part.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_compl.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_opn.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_fix.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_acpt.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_rjct.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_last_rjct.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_excld.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_yet.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_prnt.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_qtn_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_valid_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_valid_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_usr_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_usr_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rev.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_term_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_term_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_inc_failure_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Ctrl(MSBBP_QtnSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_RPnl(MSBBP_QtnSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Rslt(MSBBP_QtnSrch p){
		p.columnRslt_check.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sts_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_qtn_sts_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_seq.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_valid_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_failure_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_cst_qtn_rqst_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_upri_rate.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_std_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_std_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rslt_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rslt_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_slo_trnst_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_trnst_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_qtn_d_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Btn(MSBBP_QtnSrch p){
		p.Btn_open_MSBBP1210.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1110.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ScreenOpe(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DispUnit(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Qtn_typ]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Qtn__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Qtn_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Qtn__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Aprv_sts_typ]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Aprv__sts__typ(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[QtnPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_QtnPrnt(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Iv(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab4(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DlvCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_CstCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmCnd(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBBP_QtnSrch p){
		p.Cnd_ope_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_disp_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_creating.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pre_qtn.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_qtn.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_non.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_part.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_compl.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_opn.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_fix.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_acpt.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rjct.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_last_rjct.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_excld.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_yet.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_prnt.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_qtn_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_valid_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_valid_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_usr_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_usr_nm.putMode(p, REF_DTL, MCMode.ENABLE);
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
		p.Cnd_qtn_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rev.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_qtn_rqst_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_term_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_term_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rslt_rsn_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_rslt_rsn_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_qtn_d_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_inc_failure_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBBP_QtnSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBBP_QtnSrch p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Rslt(MSBBP_QtnSrch p){
		p.columnRslt_check.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sts_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_qtn_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_qtn_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_qtn_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_valid_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_failure_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_prnt_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_term_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_cst_qtn_rqst_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_rslt_rsn_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_std_sls_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_std_sls_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_upri_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_std_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_std_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_std_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rslt_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rslt_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_slo_trnst_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_trnst_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_qtn_d_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qtn_d_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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

	}

	/**
	 * [REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Btn(MSBBP_QtnSrch p){
		p.Btn_open_MSBBP1210.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBBP1310.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBBP1110.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_prnt_qtn.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_DTL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_QtnSrch_MC.setTableConfigRslt((MSBBP_QtnSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_QtnSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_qtn_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_sts_typ);
		p.columnRslt_qtn_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_sts_typ_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_qtn_no.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_no);
		p.columnRslt_qtn_rev.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_rev);
		p.columnRslt_qtn_prnt_seq.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_prnt_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_prnt_seq);
		p.columnRslt_qtn_d_no.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_no);
		p.columnRslt_qtn_dt.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_dt_META);
		p.columnRslt_qtn_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_dt);
		p.columnRslt_valid_dt.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.valid_dt_META);
		p.columnRslt_valid_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_valid_dt);
		p.columnRslt_qtn_typ.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_typ);
		p.columnRslt_qtn_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_typ_nm);
		p.columnRslt_failure_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.failure_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_failure_flg);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_qtn_prnt_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_prnt_flg);
		p.columnRslt_qtn_prnt_dt.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_prnt_dt_META);
		p.columnRslt_qtn_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_prnt_dt);
		p.columnRslt_aprv_no.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.aprv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_no);
		p.columnRslt_aprv_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ);
		p.columnRslt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ_nm);
		p.columnRslt_aprv_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_flg);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_sls_usr_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.sls_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_cd);
		p.columnRslt_sls_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.sls_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_nm);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_upri_dec_place);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_upri_dec_place);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_qtn_term_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_term_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_term_cd);
		p.columnRslt_qtn_term_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_term_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_term_nm);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_tterm_cd1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd1);
		p.columnRslt_tterm_nm1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm1);
		p.columnRslt_tterm_rmrks1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks1);
		p.columnRslt_tterm_cd2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd2);
		p.columnRslt_tterm_nm2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm2);
		p.columnRslt_tterm_rmrks2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks2);
		p.columnRslt_tterm_cd3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd3);
		p.columnRslt_tterm_nm3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm3);
		p.columnRslt_tterm_rmrks3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks3);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_cst_qtn_rqst_no.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cst_qtn_rqst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_qtn_rqst_no);
		p.columnRslt_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.rcpt_dt_META);
		p.columnRslt_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_dt);
		p.columnRslt_rcpt_usr_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.rcpt_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_usr_cd);
		p.columnRslt_rcpt_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.rcpt_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_usr_nm);
		p.columnRslt_qtn_rmrks.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_qtn_rslt_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_rslt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_rslt_rsn_cd);
		p.columnRslt_qtn_rslt_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_rslt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_rslt_rsn_nm);
		p.columnRslt_qtn_rslt_rsn_rmrks.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_rslt_rsn_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_rslt_rsn_rmrks);
		p.columnRslt_qtn_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_sub_char1);
		p.columnRslt_qtn_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_sub_char2);
		p.columnRslt_qtn_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_sub_char3);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.asset_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_cntry_org_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cntry_org_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_cd);
		p.columnRslt_cntry_org_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.cntry_org_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_qty_dec_place.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.trd_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_qty_dec_place);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_qty_dec_place.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.base_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_qty_dec_place);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_std_sls_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_std_sls_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_upri_rate.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upri_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_dscnt_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dscnt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_cd);
		p.columnRslt_dscnt_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dscnt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_nm);
		p.columnRslt_tax_fix_flg.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tax_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_fix_flg);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_std_sls_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_std_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_std_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_std_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_std_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_set_itm_grp_no.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.set_itm_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_itm_grp_no);
		p.RsltTable.addTable(p.Rslt_dlv_p_PPanel.DlvTable);
		p.columnRslt_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dest_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd1);
		p.columnRslt_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dest_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm1);
		p.columnRslt_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dest_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd2);
		p.columnRslt_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dest_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm2);
		p.columnRslt_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dest_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd3);
		p.columnRslt_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.dest_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm3);
		p.columnRslt_qtn_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_rmrks);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_qtn_d_rslt_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_rslt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_rslt_rsn_cd);
		p.columnRslt_qtn_d_rslt_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_rslt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_rslt_rsn_nm);
		p.columnRslt_qtn_d_rslt_rsn_rmrks.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_rslt_rsn_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_rslt_rsn_rmrks);
		p.RsltTable.addTable(p.Rslt_slo_trnst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sls_trnst_qty_p_PPanel.QtyTable);
		p.columnRslt_qtn_d_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_sub_char1);
		p.columnRslt_qtn_d_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_sub_char2);
		p.columnRslt_qtn_d_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.qtn_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qtn_d_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1120.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
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
		Cnd_rcpt_usr_cd.getListConfig().setPutter(getCnd_rcpt_usr_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_qtn_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_qtn_term_cd.getListConfig().setPutter(getCnd_qtn_term_cd_ListPutter());
		Cnd_qtn_rslt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_qtn_rslt_rsn_cd.getListConfig().setPutter(getCnd_qtn_rslt_rsn_cd_ListPutter());
		Cnd_qtn_d_rslt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_qtn_d_rslt_rsn_cd.getListConfig().setPutter(getCnd_qtn_d_rslt_rsn_cd_ListPutter());
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
	 * この画面を[SRCH_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_HDRStatus() {
		status = SRCH_HDR;
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
	 * この画面を[SRCH_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DTLStatus() {
		status = SRCH_DTL;
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
		if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
		else if (SRCH_HDR.equals(status)) {
			setSRCH_HDRStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
		else if (SRCH_DTL.equals(status)) {
			setSRCH_DTLStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
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
	 * [Cnd_rcpt_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcpt_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
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
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Cnd_qtn_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_qtn_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnTerm");
		return lp;
	}
	 
	/**
	 * [Cnd_qtn_rslt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_qtn_rslt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnRsltRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_qtn_d_rslt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_qtn_d_rslt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnRsltRsn");
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
		if(combo == Cnd_rcpt_usr_cd) return getCnd_rcpt_usr_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_qtn_term_cd) return getCnd_qtn_term_cd(row, info);
		if(combo == Cnd_qtn_rslt_rsn_cd) return getCnd_qtn_rslt_rsn_cd(row, info);
		if(combo == Cnd_qtn_d_rslt_rsn_cd) return getCnd_qtn_d_rslt_rsn_cd(row, info);
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
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
		else if (ap == Btn_open_MSBBP1310) doBtn_open_MSBBP1310(info);
		else if (ap == Btn_open_MSBBP1110) doBtn_open_MSBBP1110(info);
		else if (ap == Btn_prnt_qtn) doBtn_prnt_qtn(info);
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
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1310(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1110(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_qtn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_qtn(MCEventInfo info);

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
		if (vc == Cnd_disp_Group) return doCnd_disp_VC(info);
		if (vc == Cnd_creating) return doCnd_creating_VC(info);
		if (vc == Cnd_pre_qtn) return doCnd_pre_qtn_VC(info);
		if (vc == Cnd_qtn) return doCnd_qtn_VC(info);
		if (vc == Cnd_non) return doCnd_non_VC(info);
		if (vc == Cnd_part) return doCnd_part_VC(info);
		if (vc == Cnd_compl) return doCnd_compl_VC(info);
		if (vc == Cnd_opn) return doCnd_opn_VC(info);
		if (vc == Cnd_fix) return doCnd_fix_VC(info);
		if (vc == Cnd_acpt) return doCnd_acpt_VC(info);
		if (vc == Cnd_rjct) return doCnd_rjct_VC(info);
		if (vc == Cnd_last_rjct) return doCnd_last_rjct_VC(info);
		if (vc == Cnd_excld) return doCnd_excld_VC(info);
		if (vc == Cnd_yet) return doCnd_yet_VC(info);
		if (vc == Cnd_prnt) return doCnd_prnt_VC(info);
		if (vc == Cnd_iv_trgt_flg) return doCnd_iv_trgt_flg_VC(info);
		if (vc == Cnd_iv_not_trgt_flg) return doCnd_iv_not_trgt_flg_VC(info);
		if (vc == Cnd_qtn_dt_fr) return doCnd_qtn_dt_fr_VC(info);
		if (vc == Cnd_qtn_dt_to) return doCnd_qtn_dt_to_VC(info);
		if (vc == Cnd_valid_dt_fr) return doCnd_valid_dt_fr_VC(info);
		if (vc == Cnd_valid_dt_to) return doCnd_valid_dt_to_VC(info);
		if (vc == Cnd_rcpt_dt_fr) return doCnd_rcpt_dt_fr_VC(info);
		if (vc == Cnd_rcpt_dt_to) return doCnd_rcpt_dt_to_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_rcpt_usr_cd) return doCnd_rcpt_usr_cd_VC(info);
		if (vc == Cnd_rcpt_usr_nm) return doCnd_rcpt_usr_nm_VC(info);
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
		if (vc == Cnd_qtn_no) return doCnd_qtn_no_VC(info);
		if (vc == Cnd_qtn_rev) return doCnd_qtn_rev_VC(info);
		if (vc == Cnd_cst_qtn_rqst_no) return doCnd_cst_qtn_rqst_no_VC(info);
		if (vc == Cnd_cst_qtn_rqst_d_no) return doCnd_cst_qtn_rqst_d_no_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_qtn_term_cd) return doCnd_qtn_term_cd_VC(info);
		if (vc == Cnd_qtn_term_nm) return doCnd_qtn_term_nm_VC(info);
		if (vc == Cnd_qtn_rslt_rsn_cd) return doCnd_qtn_rslt_rsn_cd_VC(info);
		if (vc == Cnd_qtn_rslt_rsn_nm) return doCnd_qtn_rslt_rsn_nm_VC(info);
		if (vc == Cnd_qtn_d_rslt_rsn_cd) return doCnd_qtn_d_rslt_rsn_cd_VC(info);
		if (vc == Cnd_qtn_d_rslt_rsn_nm) return doCnd_qtn_d_rslt_rsn_nm_VC(info);
		if (vc == Cnd_qtn_rmrks) return doCnd_qtn_rmrks_VC(info);
		if (vc == Cnd_qtn_d_rmrks) return doCnd_qtn_d_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_qtn_sub_char1) return doCnd_qtn_sub_char1_VC(info);
		if (vc == Cnd_qtn_sub_char2) return doCnd_qtn_sub_char2_VC(info);
		if (vc == Cnd_qtn_sub_char3) return doCnd_qtn_sub_char3_VC(info);
		if (vc == Cnd_qtn_d_sub_char1) return doCnd_qtn_d_sub_char1_VC(info);
		if (vc == Cnd_qtn_d_sub_char2) return doCnd_qtn_d_sub_char2_VC(info);
		if (vc == Cnd_qtn_d_sub_char3) return doCnd_qtn_d_sub_char3_VC(info);
		if (vc == Cnd_inc_failure_flg) return doCnd_inc_failure_flg_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_qtn_sts_typ) return doRslt_qtn_sts_typ_VC(info);
		if (vc == columnRslt_qtn_sts_typ_nm) return doRslt_qtn_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_qtn_no) return doRslt_qtn_no_VC(info);
		if (vc == columnRslt_qtn_rev) return doRslt_qtn_rev_VC(info);
		if (vc == columnRslt_qtn_prnt_seq) return doRslt_qtn_prnt_seq_VC(info);
		if (vc == columnRslt_qtn_d_no) return doRslt_qtn_d_no_VC(info);
		if (vc == columnRslt_qtn_dt) return doRslt_qtn_dt_VC(info);
		if (vc == columnRslt_valid_dt) return doRslt_valid_dt_VC(info);
		if (vc == columnRslt_qtn_typ) return doRslt_qtn_typ_VC(info);
		if (vc == columnRslt_qtn_typ_nm) return doRslt_qtn_typ_nm_VC(info);
		if (vc == columnRslt_failure_flg) return doRslt_failure_flg_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_qtn_prnt_flg) return doRslt_qtn_prnt_flg_VC(info);
		if (vc == columnRslt_qtn_prnt_dt) return doRslt_qtn_prnt_dt_VC(info);
		if (vc == columnRslt_aprv_no) return doRslt_aprv_no_VC(info);
		if (vc == columnRslt_aprv_sts_typ) return doRslt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_aprv_sts_typ_nm) return doRslt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_flg) return doRslt_aprv_flg_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_sls_usr_cd) return doRslt_sls_usr_cd_VC(info);
		if (vc == columnRslt_sls_usr_nm) return doRslt_sls_usr_nm_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_upri_dec_place) return doRslt_trd_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_upri_dec_place) return doRslt_base_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_qtn_term_cd) return doRslt_qtn_term_cd_VC(info);
		if (vc == columnRslt_qtn_term_nm) return doRslt_qtn_term_nm_VC(info);
		if (vc == columnRslt_trnspt_cd) return doRslt_trnspt_cd_VC(info);
		if (vc == columnRslt_trnspt_nm) return doRslt_trnspt_nm_VC(info);
		if (vc == columnRslt_tterm_cd1) return doRslt_tterm_cd1_VC(info);
		if (vc == columnRslt_tterm_nm1) return doRslt_tterm_nm1_VC(info);
		if (vc == columnRslt_tterm_rmrks1) return doRslt_tterm_rmrks1_VC(info);
		if (vc == columnRslt_tterm_cd2) return doRslt_tterm_cd2_VC(info);
		if (vc == columnRslt_tterm_nm2) return doRslt_tterm_nm2_VC(info);
		if (vc == columnRslt_tterm_rmrks2) return doRslt_tterm_rmrks2_VC(info);
		if (vc == columnRslt_tterm_cd3) return doRslt_tterm_cd3_VC(info);
		if (vc == columnRslt_tterm_nm3) return doRslt_tterm_nm3_VC(info);
		if (vc == columnRslt_tterm_rmrks3) return doRslt_tterm_rmrks3_VC(info);
		if (vc == columnRslt_cst_qtn_rqst_no) return doRslt_cst_qtn_rqst_no_VC(info);
		if (vc == columnRslt_rcpt_dt) return doRslt_rcpt_dt_VC(info);
		if (vc == columnRslt_rcpt_usr_cd) return doRslt_rcpt_usr_cd_VC(info);
		if (vc == columnRslt_rcpt_usr_nm) return doRslt_rcpt_usr_nm_VC(info);
		if (vc == columnRslt_qtn_rmrks) return doRslt_qtn_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_qtn_rslt_rsn_cd) return doRslt_qtn_rslt_rsn_cd_VC(info);
		if (vc == columnRslt_qtn_rslt_rsn_nm) return doRslt_qtn_rslt_rsn_nm_VC(info);
		if (vc == columnRslt_qtn_rslt_rsn_rmrks) return doRslt_qtn_rslt_rsn_rmrks_VC(info);
		if (vc == columnRslt_qtn_sub_char1) return doRslt_qtn_sub_char1_VC(info);
		if (vc == columnRslt_qtn_sub_char2) return doRslt_qtn_sub_char2_VC(info);
		if (vc == columnRslt_qtn_sub_char3) return doRslt_qtn_sub_char3_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ_nm) return doRslt_asset_mng_typ_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_cntry_org_cd) return doRslt_cntry_org_cd_VC(info);
		if (vc == columnRslt_cntry_org_nm) return doRslt_cntry_org_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_qty_dec_place) return doRslt_trd_qty_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_qty_dec_place) return doRslt_base_qty_dec_place_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_upri_rate) return doRslt_upri_rate_VC(info);
		if (vc == columnRslt_dscnt_rsn_cd) return doRslt_dscnt_rsn_cd_VC(info);
		if (vc == columnRslt_dscnt_rsn_nm) return doRslt_dscnt_rsn_nm_VC(info);
		if (vc == columnRslt_tax_fix_flg) return doRslt_tax_fix_flg_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_set_itm_grp_no) return doRslt_set_itm_grp_no_VC(info);
		if (vc == columnRslt_dest_cd1) return doRslt_dest_cd1_VC(info);
		if (vc == columnRslt_dest_nm1) return doRslt_dest_nm1_VC(info);
		if (vc == columnRslt_dest_cd2) return doRslt_dest_cd2_VC(info);
		if (vc == columnRslt_dest_nm2) return doRslt_dest_nm2_VC(info);
		if (vc == columnRslt_dest_cd3) return doRslt_dest_cd3_VC(info);
		if (vc == columnRslt_dest_nm3) return doRslt_dest_nm3_VC(info);
		if (vc == columnRslt_qtn_d_rmrks) return doRslt_qtn_d_rmrks_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_qtn_d_rslt_rsn_cd) return doRslt_qtn_d_rslt_rsn_cd_VC(info);
		if (vc == columnRslt_qtn_d_rslt_rsn_nm) return doRslt_qtn_d_rslt_rsn_nm_VC(info);
		if (vc == columnRslt_qtn_d_rslt_rsn_rmrks) return doRslt_qtn_d_rslt_rsn_rmrks_VC(info);
		if (vc == columnRslt_qtn_d_sub_char1) return doRslt_qtn_d_sub_char1_VC(info);
		if (vc == columnRslt_qtn_d_sub_char2) return doRslt_qtn_d_sub_char2_VC(info);
		if (vc == columnRslt_qtn_d_sub_char3) return doRslt_qtn_d_sub_char3_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
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
	 * [Cnd]パネルの[disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[creating]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_creating_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_qtn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_qtn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[compl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_compl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[opn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rjct]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rjct_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[last_rjct]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_last_rjct_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[excld]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_excld_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yet]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yet_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_trgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_not_trgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[valid_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_valid_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[valid_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_valid_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_usr_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_qtn_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_qtn_rqst_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_rslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_rslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_d_rslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_d_rslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_failure_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_failure_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_prnt_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_prnt_seq_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[valid_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_valid_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[failure_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_failure_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_prnt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_term_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_qtn_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_qtn_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_rslt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_rslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_rslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_rslt_rsn_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_itm_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_qty_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_qty_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri_rate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_fix_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[set_itm_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_itm_grp_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_d_rslt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_rslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_rslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_rslt_rsn_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qtn_d_sub_char3_VC(MCEventInfo info){
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
		else if (nc == Cnd_disp_Group) doCnd_disp_NC(info);
		else if (nc == Cnd_creating) doCnd_creating_NC(info);
		else if (nc == Cnd_pre_qtn) doCnd_pre_qtn_NC(info);
		else if (nc == Cnd_qtn) doCnd_qtn_NC(info);
		else if (nc == Cnd_non) doCnd_non_NC(info);
		else if (nc == Cnd_part) doCnd_part_NC(info);
		else if (nc == Cnd_compl) doCnd_compl_NC(info);
		else if (nc == Cnd_opn) doCnd_opn_NC(info);
		else if (nc == Cnd_fix) doCnd_fix_NC(info);
		else if (nc == Cnd_acpt) doCnd_acpt_NC(info);
		else if (nc == Cnd_rjct) doCnd_rjct_NC(info);
		else if (nc == Cnd_last_rjct) doCnd_last_rjct_NC(info);
		else if (nc == Cnd_excld) doCnd_excld_NC(info);
		else if (nc == Cnd_yet) doCnd_yet_NC(info);
		else if (nc == Cnd_prnt) doCnd_prnt_NC(info);
		else if (nc == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NC(info);
		else if (nc == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NC(info);
		else if (nc == Cnd_qtn_dt_fr) doCnd_qtn_dt_fr_NC(info);
		else if (nc == Cnd_qtn_dt_to) doCnd_qtn_dt_to_NC(info);
		else if (nc == Cnd_valid_dt_fr) doCnd_valid_dt_fr_NC(info);
		else if (nc == Cnd_valid_dt_to) doCnd_valid_dt_to_NC(info);
		else if (nc == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NC(info);
		else if (nc == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_rcpt_usr_cd) doCnd_rcpt_usr_cd_NC(info);
		else if (nc == Cnd_rcpt_usr_nm) doCnd_rcpt_usr_nm_NC(info);
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
		else if (nc == Cnd_qtn_no) doCnd_qtn_no_NC(info);
		else if (nc == Cnd_qtn_rev) doCnd_qtn_rev_NC(info);
		else if (nc == Cnd_cst_qtn_rqst_no) doCnd_cst_qtn_rqst_no_NC(info);
		else if (nc == Cnd_cst_qtn_rqst_d_no) doCnd_cst_qtn_rqst_d_no_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_qtn_term_cd) doCnd_qtn_term_cd_NC(info);
		else if (nc == Cnd_qtn_term_nm) doCnd_qtn_term_nm_NC(info);
		else if (nc == Cnd_qtn_rslt_rsn_cd) doCnd_qtn_rslt_rsn_cd_NC(info);
		else if (nc == Cnd_qtn_rslt_rsn_nm) doCnd_qtn_rslt_rsn_nm_NC(info);
		else if (nc == Cnd_qtn_d_rslt_rsn_cd) doCnd_qtn_d_rslt_rsn_cd_NC(info);
		else if (nc == Cnd_qtn_d_rslt_rsn_nm) doCnd_qtn_d_rslt_rsn_nm_NC(info);
		else if (nc == Cnd_qtn_rmrks) doCnd_qtn_rmrks_NC(info);
		else if (nc == Cnd_qtn_d_rmrks) doCnd_qtn_d_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_qtn_sub_char1) doCnd_qtn_sub_char1_NC(info);
		else if (nc == Cnd_qtn_sub_char2) doCnd_qtn_sub_char2_NC(info);
		else if (nc == Cnd_qtn_sub_char3) doCnd_qtn_sub_char3_NC(info);
		else if (nc == Cnd_qtn_d_sub_char1) doCnd_qtn_d_sub_char1_NC(info);
		else if (nc == Cnd_qtn_d_sub_char2) doCnd_qtn_d_sub_char2_NC(info);
		else if (nc == Cnd_qtn_d_sub_char3) doCnd_qtn_d_sub_char3_NC(info);
		else if (nc == Cnd_inc_failure_flg) doCnd_inc_failure_flg_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_qtn_sts_typ) doRslt_qtn_sts_typ_NC(info);
		else if (nc == columnRslt_qtn_sts_typ_nm) doRslt_qtn_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_qtn_no) doRslt_qtn_no_NC(info);
		else if (nc == columnRslt_qtn_rev) doRslt_qtn_rev_NC(info);
		else if (nc == columnRslt_qtn_prnt_seq) doRslt_qtn_prnt_seq_NC(info);
		else if (nc == columnRslt_qtn_d_no) doRslt_qtn_d_no_NC(info);
		else if (nc == columnRslt_qtn_dt) doRslt_qtn_dt_NC(info);
		else if (nc == columnRslt_valid_dt) doRslt_valid_dt_NC(info);
		else if (nc == columnRslt_qtn_typ) doRslt_qtn_typ_NC(info);
		else if (nc == columnRslt_qtn_typ_nm) doRslt_qtn_typ_nm_NC(info);
		else if (nc == columnRslt_failure_flg) doRslt_failure_flg_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_qtn_prnt_flg) doRslt_qtn_prnt_flg_NC(info);
		else if (nc == columnRslt_qtn_prnt_dt) doRslt_qtn_prnt_dt_NC(info);
		else if (nc == columnRslt_aprv_no) doRslt_aprv_no_NC(info);
		else if (nc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_flg) doRslt_aprv_flg_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NC(info);
		else if (nc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_qtn_term_cd) doRslt_qtn_term_cd_NC(info);
		else if (nc == columnRslt_qtn_term_nm) doRslt_qtn_term_nm_NC(info);
		else if (nc == columnRslt_trnspt_cd) doRslt_trnspt_cd_NC(info);
		else if (nc == columnRslt_trnspt_nm) doRslt_trnspt_nm_NC(info);
		else if (nc == columnRslt_tterm_cd1) doRslt_tterm_cd1_NC(info);
		else if (nc == columnRslt_tterm_nm1) doRslt_tterm_nm1_NC(info);
		else if (nc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_tterm_cd2) doRslt_tterm_cd2_NC(info);
		else if (nc == columnRslt_tterm_nm2) doRslt_tterm_nm2_NC(info);
		else if (nc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_tterm_cd3) doRslt_tterm_cd3_NC(info);
		else if (nc == columnRslt_tterm_nm3) doRslt_tterm_nm3_NC(info);
		else if (nc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_cst_qtn_rqst_no) doRslt_cst_qtn_rqst_no_NC(info);
		else if (nc == columnRslt_rcpt_dt) doRslt_rcpt_dt_NC(info);
		else if (nc == columnRslt_rcpt_usr_cd) doRslt_rcpt_usr_cd_NC(info);
		else if (nc == columnRslt_rcpt_usr_nm) doRslt_rcpt_usr_nm_NC(info);
		else if (nc == columnRslt_qtn_rmrks) doRslt_qtn_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_qtn_rslt_rsn_cd) doRslt_qtn_rslt_rsn_cd_NC(info);
		else if (nc == columnRslt_qtn_rslt_rsn_nm) doRslt_qtn_rslt_rsn_nm_NC(info);
		else if (nc == columnRslt_qtn_rslt_rsn_rmrks) doRslt_qtn_rslt_rsn_rmrks_NC(info);
		else if (nc == columnRslt_qtn_sub_char1) doRslt_qtn_sub_char1_NC(info);
		else if (nc == columnRslt_qtn_sub_char2) doRslt_qtn_sub_char2_NC(info);
		else if (nc == columnRslt_qtn_sub_char3) doRslt_qtn_sub_char3_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NC(info);
		else if (nc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_upri_rate) doRslt_upri_rate_NC(info);
		else if (nc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NC(info);
		else if (nc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NC(info);
		else if (nc == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NC(info);
		else if (nc == columnRslt_dest_cd1) doRslt_dest_cd1_NC(info);
		else if (nc == columnRslt_dest_nm1) doRslt_dest_nm1_NC(info);
		else if (nc == columnRslt_dest_cd2) doRslt_dest_cd2_NC(info);
		else if (nc == columnRslt_dest_nm2) doRslt_dest_nm2_NC(info);
		else if (nc == columnRslt_dest_cd3) doRslt_dest_cd3_NC(info);
		else if (nc == columnRslt_dest_nm3) doRslt_dest_nm3_NC(info);
		else if (nc == columnRslt_qtn_d_rmrks) doRslt_qtn_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_qtn_d_rslt_rsn_cd) doRslt_qtn_d_rslt_rsn_cd_NC(info);
		else if (nc == columnRslt_qtn_d_rslt_rsn_nm) doRslt_qtn_d_rslt_rsn_nm_NC(info);
		else if (nc == columnRslt_qtn_d_rslt_rsn_rmrks) doRslt_qtn_d_rslt_rsn_rmrks_NC(info);
		else if (nc == columnRslt_qtn_d_sub_char1) doRslt_qtn_d_sub_char1_NC(info);
		else if (nc == columnRslt_qtn_d_sub_char2) doRslt_qtn_d_sub_char2_NC(info);
		else if (nc == columnRslt_qtn_d_sub_char3) doRslt_qtn_d_sub_char3_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
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
	 * [Cnd]パネルの[disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[creating]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_creating_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_qtn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_qtn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[compl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_compl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excld]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excld_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yet]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yet_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_trgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_trgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_d_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_failure_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_failure_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_prnt_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[failure_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_failure_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_qtn_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_qtn_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
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
		else if (ne == Cnd_disp_Group) doCnd_disp_NE(info);
		else if (ne == Cnd_creating) doCnd_creating_NE(info);
		else if (ne == Cnd_pre_qtn) doCnd_pre_qtn_NE(info);
		else if (ne == Cnd_qtn) doCnd_qtn_NE(info);
		else if (ne == Cnd_non) doCnd_non_NE(info);
		else if (ne == Cnd_part) doCnd_part_NE(info);
		else if (ne == Cnd_compl) doCnd_compl_NE(info);
		else if (ne == Cnd_opn) doCnd_opn_NE(info);
		else if (ne == Cnd_fix) doCnd_fix_NE(info);
		else if (ne == Cnd_acpt) doCnd_acpt_NE(info);
		else if (ne == Cnd_rjct) doCnd_rjct_NE(info);
		else if (ne == Cnd_last_rjct) doCnd_last_rjct_NE(info);
		else if (ne == Cnd_excld) doCnd_excld_NE(info);
		else if (ne == Cnd_yet) doCnd_yet_NE(info);
		else if (ne == Cnd_prnt) doCnd_prnt_NE(info);
		else if (ne == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NE(info);
		else if (ne == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NE(info);
		else if (ne == Cnd_qtn_dt_fr) doCnd_qtn_dt_fr_NE(info);
		else if (ne == Cnd_qtn_dt_to) doCnd_qtn_dt_to_NE(info);
		else if (ne == Cnd_valid_dt_fr) doCnd_valid_dt_fr_NE(info);
		else if (ne == Cnd_valid_dt_to) doCnd_valid_dt_to_NE(info);
		else if (ne == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NE(info);
		else if (ne == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_rcpt_usr_cd) doCnd_rcpt_usr_cd_NE(info);
		else if (ne == Cnd_rcpt_usr_nm) doCnd_rcpt_usr_nm_NE(info);
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
		else if (ne == Cnd_qtn_no) doCnd_qtn_no_NE(info);
		else if (ne == Cnd_qtn_rev) doCnd_qtn_rev_NE(info);
		else if (ne == Cnd_cst_qtn_rqst_no) doCnd_cst_qtn_rqst_no_NE(info);
		else if (ne == Cnd_cst_qtn_rqst_d_no) doCnd_cst_qtn_rqst_d_no_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_qtn_term_cd) doCnd_qtn_term_cd_NE(info);
		else if (ne == Cnd_qtn_term_nm) doCnd_qtn_term_nm_NE(info);
		else if (ne == Cnd_qtn_rslt_rsn_cd) doCnd_qtn_rslt_rsn_cd_NE(info);
		else if (ne == Cnd_qtn_rslt_rsn_nm) doCnd_qtn_rslt_rsn_nm_NE(info);
		else if (ne == Cnd_qtn_d_rslt_rsn_cd) doCnd_qtn_d_rslt_rsn_cd_NE(info);
		else if (ne == Cnd_qtn_d_rslt_rsn_nm) doCnd_qtn_d_rslt_rsn_nm_NE(info);
		else if (ne == Cnd_qtn_rmrks) doCnd_qtn_rmrks_NE(info);
		else if (ne == Cnd_qtn_d_rmrks) doCnd_qtn_d_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_qtn_sub_char1) doCnd_qtn_sub_char1_NE(info);
		else if (ne == Cnd_qtn_sub_char2) doCnd_qtn_sub_char2_NE(info);
		else if (ne == Cnd_qtn_sub_char3) doCnd_qtn_sub_char3_NE(info);
		else if (ne == Cnd_qtn_d_sub_char1) doCnd_qtn_d_sub_char1_NE(info);
		else if (ne == Cnd_qtn_d_sub_char2) doCnd_qtn_d_sub_char2_NE(info);
		else if (ne == Cnd_qtn_d_sub_char3) doCnd_qtn_d_sub_char3_NE(info);
		else if (ne == Cnd_inc_failure_flg) doCnd_inc_failure_flg_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_qtn_sts_typ) doRslt_qtn_sts_typ_NE(info);
		else if (ne == columnRslt_qtn_sts_typ_nm) doRslt_qtn_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_qtn_no) doRslt_qtn_no_NE(info);
		else if (ne == columnRslt_qtn_rev) doRslt_qtn_rev_NE(info);
		else if (ne == columnRslt_qtn_prnt_seq) doRslt_qtn_prnt_seq_NE(info);
		else if (ne == columnRslt_qtn_d_no) doRslt_qtn_d_no_NE(info);
		else if (ne == columnRslt_qtn_dt) doRslt_qtn_dt_NE(info);
		else if (ne == columnRslt_valid_dt) doRslt_valid_dt_NE(info);
		else if (ne == columnRslt_qtn_typ) doRslt_qtn_typ_NE(info);
		else if (ne == columnRslt_qtn_typ_nm) doRslt_qtn_typ_nm_NE(info);
		else if (ne == columnRslt_failure_flg) doRslt_failure_flg_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_qtn_prnt_flg) doRslt_qtn_prnt_flg_NE(info);
		else if (ne == columnRslt_qtn_prnt_dt) doRslt_qtn_prnt_dt_NE(info);
		else if (ne == columnRslt_aprv_no) doRslt_aprv_no_NE(info);
		else if (ne == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_flg) doRslt_aprv_flg_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NE(info);
		else if (ne == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_qtn_term_cd) doRslt_qtn_term_cd_NE(info);
		else if (ne == columnRslt_qtn_term_nm) doRslt_qtn_term_nm_NE(info);
		else if (ne == columnRslt_trnspt_cd) doRslt_trnspt_cd_NE(info);
		else if (ne == columnRslt_trnspt_nm) doRslt_trnspt_nm_NE(info);
		else if (ne == columnRslt_tterm_cd1) doRslt_tterm_cd1_NE(info);
		else if (ne == columnRslt_tterm_nm1) doRslt_tterm_nm1_NE(info);
		else if (ne == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_tterm_cd2) doRslt_tterm_cd2_NE(info);
		else if (ne == columnRslt_tterm_nm2) doRslt_tterm_nm2_NE(info);
		else if (ne == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_tterm_cd3) doRslt_tterm_cd3_NE(info);
		else if (ne == columnRslt_tterm_nm3) doRslt_tterm_nm3_NE(info);
		else if (ne == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_cst_qtn_rqst_no) doRslt_cst_qtn_rqst_no_NE(info);
		else if (ne == columnRslt_rcpt_dt) doRslt_rcpt_dt_NE(info);
		else if (ne == columnRslt_rcpt_usr_cd) doRslt_rcpt_usr_cd_NE(info);
		else if (ne == columnRslt_rcpt_usr_nm) doRslt_rcpt_usr_nm_NE(info);
		else if (ne == columnRslt_qtn_rmrks) doRslt_qtn_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_qtn_rslt_rsn_cd) doRslt_qtn_rslt_rsn_cd_NE(info);
		else if (ne == columnRslt_qtn_rslt_rsn_nm) doRslt_qtn_rslt_rsn_nm_NE(info);
		else if (ne == columnRslt_qtn_rslt_rsn_rmrks) doRslt_qtn_rslt_rsn_rmrks_NE(info);
		else if (ne == columnRslt_qtn_sub_char1) doRslt_qtn_sub_char1_NE(info);
		else if (ne == columnRslt_qtn_sub_char2) doRslt_qtn_sub_char2_NE(info);
		else if (ne == columnRslt_qtn_sub_char3) doRslt_qtn_sub_char3_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NE(info);
		else if (ne == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_upri_rate) doRslt_upri_rate_NE(info);
		else if (ne == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NE(info);
		else if (ne == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NE(info);
		else if (ne == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NE(info);
		else if (ne == columnRslt_dest_cd1) doRslt_dest_cd1_NE(info);
		else if (ne == columnRslt_dest_nm1) doRslt_dest_nm1_NE(info);
		else if (ne == columnRslt_dest_cd2) doRslt_dest_cd2_NE(info);
		else if (ne == columnRslt_dest_nm2) doRslt_dest_nm2_NE(info);
		else if (ne == columnRslt_dest_cd3) doRslt_dest_cd3_NE(info);
		else if (ne == columnRslt_dest_nm3) doRslt_dest_nm3_NE(info);
		else if (ne == columnRslt_qtn_d_rmrks) doRslt_qtn_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_qtn_d_rslt_rsn_cd) doRslt_qtn_d_rslt_rsn_cd_NE(info);
		else if (ne == columnRslt_qtn_d_rslt_rsn_nm) doRslt_qtn_d_rslt_rsn_nm_NE(info);
		else if (ne == columnRslt_qtn_d_rslt_rsn_rmrks) doRslt_qtn_d_rslt_rsn_rmrks_NE(info);
		else if (ne == columnRslt_qtn_d_sub_char1) doRslt_qtn_d_sub_char1_NE(info);
		else if (ne == columnRslt_qtn_d_sub_char2) doRslt_qtn_d_sub_char2_NE(info);
		else if (ne == columnRslt_qtn_d_sub_char3) doRslt_qtn_d_sub_char3_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
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
	 * [Cnd]パネルの[disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[creating]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_creating_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_qtn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_qtn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[compl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_compl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excld]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excld_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yet]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yet_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_trgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_trgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_d_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_failure_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_failure_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_prnt_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[failure_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_failure_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_qtn_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_qtn_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
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
		else if (nx == Cnd_disp_Group) doCnd_disp_NX(info);
		else if (nx == Cnd_creating) doCnd_creating_NX(info);
		else if (nx == Cnd_pre_qtn) doCnd_pre_qtn_NX(info);
		else if (nx == Cnd_qtn) doCnd_qtn_NX(info);
		else if (nx == Cnd_non) doCnd_non_NX(info);
		else if (nx == Cnd_part) doCnd_part_NX(info);
		else if (nx == Cnd_compl) doCnd_compl_NX(info);
		else if (nx == Cnd_opn) doCnd_opn_NX(info);
		else if (nx == Cnd_fix) doCnd_fix_NX(info);
		else if (nx == Cnd_acpt) doCnd_acpt_NX(info);
		else if (nx == Cnd_rjct) doCnd_rjct_NX(info);
		else if (nx == Cnd_last_rjct) doCnd_last_rjct_NX(info);
		else if (nx == Cnd_excld) doCnd_excld_NX(info);
		else if (nx == Cnd_yet) doCnd_yet_NX(info);
		else if (nx == Cnd_prnt) doCnd_prnt_NX(info);
		else if (nx == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NX(info);
		else if (nx == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NX(info);
		else if (nx == Cnd_qtn_dt_fr) doCnd_qtn_dt_fr_NX(info);
		else if (nx == Cnd_qtn_dt_to) doCnd_qtn_dt_to_NX(info);
		else if (nx == Cnd_valid_dt_fr) doCnd_valid_dt_fr_NX(info);
		else if (nx == Cnd_valid_dt_to) doCnd_valid_dt_to_NX(info);
		else if (nx == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NX(info);
		else if (nx == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_rcpt_usr_cd) doCnd_rcpt_usr_cd_NX(info);
		else if (nx == Cnd_rcpt_usr_nm) doCnd_rcpt_usr_nm_NX(info);
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
		else if (nx == Cnd_qtn_no) doCnd_qtn_no_NX(info);
		else if (nx == Cnd_qtn_rev) doCnd_qtn_rev_NX(info);
		else if (nx == Cnd_cst_qtn_rqst_no) doCnd_cst_qtn_rqst_no_NX(info);
		else if (nx == Cnd_cst_qtn_rqst_d_no) doCnd_cst_qtn_rqst_d_no_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_qtn_term_cd) doCnd_qtn_term_cd_NX(info);
		else if (nx == Cnd_qtn_term_nm) doCnd_qtn_term_nm_NX(info);
		else if (nx == Cnd_qtn_rslt_rsn_cd) doCnd_qtn_rslt_rsn_cd_NX(info);
		else if (nx == Cnd_qtn_rslt_rsn_nm) doCnd_qtn_rslt_rsn_nm_NX(info);
		else if (nx == Cnd_qtn_d_rslt_rsn_cd) doCnd_qtn_d_rslt_rsn_cd_NX(info);
		else if (nx == Cnd_qtn_d_rslt_rsn_nm) doCnd_qtn_d_rslt_rsn_nm_NX(info);
		else if (nx == Cnd_qtn_rmrks) doCnd_qtn_rmrks_NX(info);
		else if (nx == Cnd_qtn_d_rmrks) doCnd_qtn_d_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_qtn_sub_char1) doCnd_qtn_sub_char1_NX(info);
		else if (nx == Cnd_qtn_sub_char2) doCnd_qtn_sub_char2_NX(info);
		else if (nx == Cnd_qtn_sub_char3) doCnd_qtn_sub_char3_NX(info);
		else if (nx == Cnd_qtn_d_sub_char1) doCnd_qtn_d_sub_char1_NX(info);
		else if (nx == Cnd_qtn_d_sub_char2) doCnd_qtn_d_sub_char2_NX(info);
		else if (nx == Cnd_qtn_d_sub_char3) doCnd_qtn_d_sub_char3_NX(info);
		else if (nx == Cnd_inc_failure_flg) doCnd_inc_failure_flg_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_qtn_sts_typ) doRslt_qtn_sts_typ_NX(info);
		else if (nx == columnRslt_qtn_sts_typ_nm) doRslt_qtn_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_qtn_no) doRslt_qtn_no_NX(info);
		else if (nx == columnRslt_qtn_rev) doRslt_qtn_rev_NX(info);
		else if (nx == columnRslt_qtn_prnt_seq) doRslt_qtn_prnt_seq_NX(info);
		else if (nx == columnRslt_qtn_d_no) doRslt_qtn_d_no_NX(info);
		else if (nx == columnRslt_qtn_dt) doRslt_qtn_dt_NX(info);
		else if (nx == columnRslt_valid_dt) doRslt_valid_dt_NX(info);
		else if (nx == columnRslt_qtn_typ) doRslt_qtn_typ_NX(info);
		else if (nx == columnRslt_qtn_typ_nm) doRslt_qtn_typ_nm_NX(info);
		else if (nx == columnRslt_failure_flg) doRslt_failure_flg_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_qtn_prnt_flg) doRslt_qtn_prnt_flg_NX(info);
		else if (nx == columnRslt_qtn_prnt_dt) doRslt_qtn_prnt_dt_NX(info);
		else if (nx == columnRslt_aprv_no) doRslt_aprv_no_NX(info);
		else if (nx == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_flg) doRslt_aprv_flg_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NX(info);
		else if (nx == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_qtn_term_cd) doRslt_qtn_term_cd_NX(info);
		else if (nx == columnRslt_qtn_term_nm) doRslt_qtn_term_nm_NX(info);
		else if (nx == columnRslt_trnspt_cd) doRslt_trnspt_cd_NX(info);
		else if (nx == columnRslt_trnspt_nm) doRslt_trnspt_nm_NX(info);
		else if (nx == columnRslt_tterm_cd1) doRslt_tterm_cd1_NX(info);
		else if (nx == columnRslt_tterm_nm1) doRslt_tterm_nm1_NX(info);
		else if (nx == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_tterm_cd2) doRslt_tterm_cd2_NX(info);
		else if (nx == columnRslt_tterm_nm2) doRslt_tterm_nm2_NX(info);
		else if (nx == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_tterm_cd3) doRslt_tterm_cd3_NX(info);
		else if (nx == columnRslt_tterm_nm3) doRslt_tterm_nm3_NX(info);
		else if (nx == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_cst_qtn_rqst_no) doRslt_cst_qtn_rqst_no_NX(info);
		else if (nx == columnRslt_rcpt_dt) doRslt_rcpt_dt_NX(info);
		else if (nx == columnRslt_rcpt_usr_cd) doRslt_rcpt_usr_cd_NX(info);
		else if (nx == columnRslt_rcpt_usr_nm) doRslt_rcpt_usr_nm_NX(info);
		else if (nx == columnRslt_qtn_rmrks) doRslt_qtn_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_qtn_rslt_rsn_cd) doRslt_qtn_rslt_rsn_cd_NX(info);
		else if (nx == columnRslt_qtn_rslt_rsn_nm) doRslt_qtn_rslt_rsn_nm_NX(info);
		else if (nx == columnRslt_qtn_rslt_rsn_rmrks) doRslt_qtn_rslt_rsn_rmrks_NX(info);
		else if (nx == columnRslt_qtn_sub_char1) doRslt_qtn_sub_char1_NX(info);
		else if (nx == columnRslt_qtn_sub_char2) doRslt_qtn_sub_char2_NX(info);
		else if (nx == columnRslt_qtn_sub_char3) doRslt_qtn_sub_char3_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NX(info);
		else if (nx == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_upri_rate) doRslt_upri_rate_NX(info);
		else if (nx == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NX(info);
		else if (nx == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NX(info);
		else if (nx == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NX(info);
		else if (nx == columnRslt_dest_cd1) doRslt_dest_cd1_NX(info);
		else if (nx == columnRslt_dest_nm1) doRslt_dest_nm1_NX(info);
		else if (nx == columnRslt_dest_cd2) doRslt_dest_cd2_NX(info);
		else if (nx == columnRslt_dest_nm2) doRslt_dest_nm2_NX(info);
		else if (nx == columnRslt_dest_cd3) doRslt_dest_cd3_NX(info);
		else if (nx == columnRslt_dest_nm3) doRslt_dest_nm3_NX(info);
		else if (nx == columnRslt_qtn_d_rmrks) doRslt_qtn_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_qtn_d_rslt_rsn_cd) doRslt_qtn_d_rslt_rsn_cd_NX(info);
		else if (nx == columnRslt_qtn_d_rslt_rsn_nm) doRslt_qtn_d_rslt_rsn_nm_NX(info);
		else if (nx == columnRslt_qtn_d_rslt_rsn_rmrks) doRslt_qtn_d_rslt_rsn_rmrks_NX(info);
		else if (nx == columnRslt_qtn_d_sub_char1) doRslt_qtn_d_sub_char1_NX(info);
		else if (nx == columnRslt_qtn_d_sub_char2) doRslt_qtn_d_sub_char2_NX(info);
		else if (nx == columnRslt_qtn_d_sub_char3) doRslt_qtn_d_sub_char3_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
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
	 * [Cnd]パネルの[disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[creating]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_creating_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_qtn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_qtn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[compl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_compl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excld]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excld_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yet]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yet_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_trgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_trgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_d_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_failure_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_failure_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_prnt_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[failure_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_failure_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_qtn_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_qtn_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
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
		if (lc == Cnd_qtn_dt_fr) doCnd_qtn_dt_fr_LC(info);
		else if (lc == Cnd_qtn_dt_to) doCnd_qtn_dt_to_LC(info);
		else if (lc == Cnd_valid_dt_fr) doCnd_valid_dt_fr_LC(info);
		else if (lc == Cnd_valid_dt_to) doCnd_valid_dt_to_LC(info);
		else if (lc == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_LC(info);
		else if (lc == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_rcpt_usr_cd) doCnd_rcpt_usr_cd_LC(info);
		else if (lc == Cnd_rcpt_usr_nm) doCnd_rcpt_usr_nm_LC(info);
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
		else if (lc == Cnd_qtn_no) doCnd_qtn_no_LC(info);
		else if (lc == Cnd_qtn_rev) doCnd_qtn_rev_LC(info);
		else if (lc == Cnd_cst_qtn_rqst_no) doCnd_cst_qtn_rqst_no_LC(info);
		else if (lc == Cnd_cst_qtn_rqst_d_no) doCnd_cst_qtn_rqst_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_qtn_term_cd) doCnd_qtn_term_cd_LC(info);
		else if (lc == Cnd_qtn_term_nm) doCnd_qtn_term_nm_LC(info);
		else if (lc == Cnd_qtn_rslt_rsn_cd) doCnd_qtn_rslt_rsn_cd_LC(info);
		else if (lc == Cnd_qtn_rslt_rsn_nm) doCnd_qtn_rslt_rsn_nm_LC(info);
		else if (lc == Cnd_qtn_d_rslt_rsn_cd) doCnd_qtn_d_rslt_rsn_cd_LC(info);
		else if (lc == Cnd_qtn_d_rslt_rsn_nm) doCnd_qtn_d_rslt_rsn_nm_LC(info);
		else if (lc == Cnd_qtn_rmrks) doCnd_qtn_rmrks_LC(info);
		else if (lc == Cnd_qtn_d_rmrks) doCnd_qtn_d_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_qtn_sub_char1) doCnd_qtn_sub_char1_LC(info);
		else if (lc == Cnd_qtn_sub_char2) doCnd_qtn_sub_char2_LC(info);
		else if (lc == Cnd_qtn_sub_char3) doCnd_qtn_sub_char3_LC(info);
		else if (lc == Cnd_qtn_d_sub_char1) doCnd_qtn_d_sub_char1_LC(info);
		else if (lc == Cnd_qtn_d_sub_char2) doCnd_qtn_d_sub_char2_LC(info);
		else if (lc == Cnd_qtn_d_sub_char3) doCnd_qtn_d_sub_char3_LC(info);
		else if (lc == columnRslt_qtn_sts_typ) doRslt_qtn_sts_typ_LC(info);
		else if (lc == columnRslt_qtn_sts_typ_nm) doRslt_qtn_sts_typ_nm_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_qtn_no) doRslt_qtn_no_LC(info);
		else if (lc == columnRslt_qtn_rev) doRslt_qtn_rev_LC(info);
		else if (lc == columnRslt_qtn_prnt_seq) doRslt_qtn_prnt_seq_LC(info);
		else if (lc == columnRslt_qtn_d_no) doRslt_qtn_d_no_LC(info);
		else if (lc == columnRslt_qtn_dt) doRslt_qtn_dt_LC(info);
		else if (lc == columnRslt_valid_dt) doRslt_valid_dt_LC(info);
		else if (lc == columnRslt_qtn_typ) doRslt_qtn_typ_LC(info);
		else if (lc == columnRslt_qtn_typ_nm) doRslt_qtn_typ_nm_LC(info);
		else if (lc == columnRslt_qtn_prnt_dt) doRslt_qtn_prnt_dt_LC(info);
		else if (lc == columnRslt_aprv_no) doRslt_aprv_no_LC(info);
		else if (lc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		else if (lc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_upri_dec_place) doRslt_base_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_qtn_term_cd) doRslt_qtn_term_cd_LC(info);
		else if (lc == columnRslt_qtn_term_nm) doRslt_qtn_term_nm_LC(info);
		else if (lc == columnRslt_trnspt_cd) doRslt_trnspt_cd_LC(info);
		else if (lc == columnRslt_trnspt_nm) doRslt_trnspt_nm_LC(info);
		else if (lc == columnRslt_tterm_cd1) doRslt_tterm_cd1_LC(info);
		else if (lc == columnRslt_tterm_nm1) doRslt_tterm_nm1_LC(info);
		else if (lc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_tterm_cd2) doRslt_tterm_cd2_LC(info);
		else if (lc == columnRslt_tterm_nm2) doRslt_tterm_nm2_LC(info);
		else if (lc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_tterm_cd3) doRslt_tterm_cd3_LC(info);
		else if (lc == columnRslt_tterm_nm3) doRslt_tterm_nm3_LC(info);
		else if (lc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_cst_qtn_rqst_no) doRslt_cst_qtn_rqst_no_LC(info);
		else if (lc == columnRslt_rcpt_dt) doRslt_rcpt_dt_LC(info);
		else if (lc == columnRslt_rcpt_usr_cd) doRslt_rcpt_usr_cd_LC(info);
		else if (lc == columnRslt_rcpt_usr_nm) doRslt_rcpt_usr_nm_LC(info);
		else if (lc == columnRslt_qtn_rmrks) doRslt_qtn_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_qtn_rslt_rsn_cd) doRslt_qtn_rslt_rsn_cd_LC(info);
		else if (lc == columnRslt_qtn_rslt_rsn_nm) doRslt_qtn_rslt_rsn_nm_LC(info);
		else if (lc == columnRslt_qtn_rslt_rsn_rmrks) doRslt_qtn_rslt_rsn_rmrks_LC(info);
		else if (lc == columnRslt_qtn_sub_char1) doRslt_qtn_sub_char1_LC(info);
		else if (lc == columnRslt_qtn_sub_char2) doRslt_qtn_sub_char2_LC(info);
		else if (lc == columnRslt_qtn_sub_char3) doRslt_qtn_sub_char3_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_LC(info);
		else if (lc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_upri_rate) doRslt_upri_rate_LC(info);
		else if (lc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_LC(info);
		else if (lc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_tax_rate) doRslt_tax_rate_LC(info);
		else if (lc == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_LC(info);
		else if (lc == columnRslt_dest_cd1) doRslt_dest_cd1_LC(info);
		else if (lc == columnRslt_dest_nm1) doRslt_dest_nm1_LC(info);
		else if (lc == columnRslt_dest_cd2) doRslt_dest_cd2_LC(info);
		else if (lc == columnRslt_dest_nm2) doRslt_dest_nm2_LC(info);
		else if (lc == columnRslt_dest_cd3) doRslt_dest_cd3_LC(info);
		else if (lc == columnRslt_dest_nm3) doRslt_dest_nm3_LC(info);
		else if (lc == columnRslt_qtn_d_rmrks) doRslt_qtn_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_qtn_d_rslt_rsn_cd) doRslt_qtn_d_rslt_rsn_cd_LC(info);
		else if (lc == columnRslt_qtn_d_rslt_rsn_nm) doRslt_qtn_d_rslt_rsn_nm_LC(info);
		else if (lc == columnRslt_qtn_d_rslt_rsn_rmrks) doRslt_qtn_d_rslt_rsn_rmrks_LC(info);
		else if (lc == columnRslt_qtn_d_sub_char1) doRslt_qtn_d_sub_char1_LC(info);
		else if (lc == columnRslt_qtn_d_sub_char2) doRslt_qtn_d_sub_char2_LC(info);
		else if (lc == columnRslt_qtn_d_sub_char3) doRslt_qtn_d_sub_char3_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
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
	 * [Cnd]パネルの[qtn_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[valid_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_valid_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_usr_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_qtn_rqst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_qtn_rqst_d_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[qtn_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rslt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rslt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_prnt_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[valid_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_valid_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_prnt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_term_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_qtn_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_qtn_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_rslt_rsn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_rslt_rsn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upri_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[set_itm_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[qtn_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_rslt_rsn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_rslt_rsn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qtn_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qtn_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_rcpt_usr_cd]の作成メソッド
	 */
	public MCList getCnd_rcpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
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
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_qtn_term_cd]の作成メソッド
	 */
	public MCList getCnd_qtn_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_qtn_rslt_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_qtn_rslt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnRsltRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_qtn_d_rslt_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_qtn_d_rslt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnRsltRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1120.Srch01")) {
			return new MS_MSBBL1120_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1120.Prnt01")) {
			return new MS_MSBBL1120_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1120_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1120_Srch01Bridge() {
			p_MS_MSBBL1120_Srch01 = new MCParam(PDef.MS_MSBBL1120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1120.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1120.RsltR.class));

			p_MS_MSBBL1120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1120.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1120.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1120.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1120_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1120.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1120_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1120.RsltR>)p_MS_MSBBL1120_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1120_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1120_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1120_Prnt01;

		/** コンストラクタ */
		protected MS_MSBBL1120_Prnt01Bridge() {
			p_MS_MSBBL1120_Prnt01 = new MCParam(PDef.MS_MSBBL1120_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1120_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1120.RsltR.class));
			param.addUpBlock(mcframe.clientMSBB.MSBBP1120.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1120.RsltR.class));

			p_MS_MSBBL1120_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1120_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1120_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBBL1120_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1120_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1120_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1120.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1120.RsltR>)up(0);
		}
		protected mcframe.clientMSBB.MSBBP1120.BtnR up1() {
			return (mcframe.clientMSBB.MSBBP1120.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1120.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1120_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1120.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1120_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1120.RsltR>)p_MS_MSBBL1120_Prnt01.getContainerParam().getDownBlock(0));
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