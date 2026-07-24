package mcframe.clientMSBF.MSBFP0080;

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
import mcframe.clientMSBF.MSBFP0080.MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Srch01Caller;
import mcframe.clientMSBF.MSBFP0080.MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Upd01Caller;
import mcframe.clientMSBF.MSBFP0080.MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Upd02Caller;
import mcframe.clientMSBF.MSBFP0080.MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Del01Caller;
import mcframe.clientMSBF.MSBFP0080.MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Prnt01Caller;

/**
 * 画面"MSBFP_PlntAprvReg"パネルクラスです。<p>
 *
 * 工場出荷の承認画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_PlntAprvReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBFP0080";

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
	// [AprvStsTyp]ブロック関連のField定義
	public MCPanel AprvStsTypPanel = null;
	public MCTitledBorder AprvStsTypTitledBorder = null;
	// [AprvStsTyp]ブロックの項目のField定義
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
	// [PlntAprvPrnt]ブロック関連のField定義
	public MCPanel PlntAprvPrntPanel = null;
	public MCTitledBorder PlntAprvPrntTitledBorder = null;
	// [PlntAprvPrnt]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * APRV_RJCT,Approve/Reject,APRV_RJCT;DEL_APRV,Cancel approval,DEL_APRV;DEL_RJCT,Cancel rejection,DEL_RJCT;UPD,Update,UPD;REF,View,REF;PRNT,Issue record sheet,PRNT APRV_RJCT,承認・却下する,APRV_RJCT;DEL_APRV,承認を取り消す,DEL_APRV;DEL_RJCT,却下を取り消す,DEL_RJCT;UPD,更新する,UPD;REF,参照する,REF;PRNT,記録書発行,PRNT.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_APRV_RJCT = null;
	public MCRadioButton Cnd_ope_DEL_APRV = null;
	public MCRadioButton Cnd_ope_DEL_RJCT = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Approved 承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_acpt_flg = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCCheckBox Cnd_rjct_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_not_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_prnt_flg = null;
	public MCLabel Cnd_aprv_dt_fr_Label = null;
	/**
	 * Shipping approval date FROM 出荷承認日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_dt_fr = null;
	public MCLabel Cnd_aprv_dt_to_Label = null;
	/**
	 * Shipping approval date TO 出荷承認日ＴＯ.<p>
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
	public MCLabel Cnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public MCTextComboBox Cnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_site_nm = null;
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
	public MCLabel Cnd_ntfy_nm_Label = null;
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public MCTextField Cnd_ntfy_nm = null;
	public MCLabel Cnd_mfg_aprv_sts_typ_Label = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_aprv_sts_typ_nm = null;
	public MCLabel Cnd_aprv_usr_cd_Label = null;
	/**
	 * Approver 承認者.<p>
	 *
	 */
	public MCTextField Cnd_aprv_usr_cd = null;
	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_usr_nm = null;
	public MCLabel Cnd_aprv_dpt_cd_Label = null;
	/**
	 * Approval dept. 承認部門.<p>
	 *
	 */
	public MCTextField Cnd_aprv_dpt_cd = null;
	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_dpt_nm = null;
	public MCLabel Cnd_plnt_aprv_no_Label = null;
	/**
	 * Factory release approval No. 工場出荷承認ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_plnt_aprv_no = null;
	/**
	 * Display lot trace results ロットトレース結果表示.<p>
	 *
	 */
	public MCCheckBox Cnd_trace_disp_flg = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Factory release approval internal remarks 工場出荷承認内部備考.<p>
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
	public MCLabel BulkSet_aprv_dt_Label = null;
	/**
	 * Shipping approval date 出荷承認日.<p>
	 *
	 */
	public MCDateField BulkSet_aprv_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_aprv_usr_p_PPanel;
	public MCTextField BulkSet_aprv_usr_cd;	// [BulkSet]の[aprv_usr_p.usr_cd]を[BulkSet_aprv_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_aprv_usr_nm;	// [BulkSet]の[aprv_usr_p.usr_nm]を[BulkSet_aprv_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_aprv_dpt_cd;	// [BulkSet]の[aprv_usr_p.dpt_cd]を[BulkSet_aprv_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_aprv_dpt_nm;	// [BulkSet]の[aprv_usr_p.dpt_nm]を[BulkSet_aprv_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H BulkSet_aprv_rsn_p_PPanel;
	public MCTextComboBox BulkSet_aprv_rsn;	// [BulkSet]の[aprv_rsn_p.txt]を[BulkSet_aprv_rsn]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0080.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Approval 承認.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acpt_flg = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rjct_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ntfy_nm = null;
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_no = null;
	public mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D Rslt_aprv_rsn_p_PPanel;
	public MCColumnConfig columnRslt_aprv_rsn;// [Rslt]の[aprv_rsn_p.txt]を[columnRslt_aprv_rsn]としてエイリアス定義。
	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_skip_chk_ship_flg = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ_nm = null;
	/**
	 * Shipping approval date 出荷承認日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_aprv_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_aprv_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_aprv_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_aprv_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_aprv_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_aprv_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_aprv_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_aprv_dpt_nm]としてエイリアス定義。
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_qty = null;
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
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ_nm = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_no = null;
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
	 * Factory release approval internal remarks 工場出荷承認内部備考.<p>
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
	 * Factory release approval No. 工場出荷承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_no = null;
	/**
	 * Record sheet of factory release issued 工場出荷記録書発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_prnt_flg = null;
	/**
	 * Record sheet of factory release issue date and time 工場出荷記録書発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_prnt_tm = null;
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
	 * Decision date 判定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_judg_dt = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_nm = null;
	/**
	 * Component inspection type 構成品検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_itm_insp_typ = null;
	/**
	 * Component inspection type name 構成品検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_itm_insp_typ_nm = null;
	/**
	 * Component conforming type 構成品良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_itm_quality_typ = null;
	/**
	 * Component conforming type name 構成品良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_itm_quality_typ_nm = null;
	/**
	 * Component mfg. authorization type 構成品製造承認区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_itm_mfg_aprv_typ = null;
	/**
	 * Component mfg. authorization type name 構成品製造承認区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_itm_mfg_aprv_typ_nm = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Specific inspection result 規格検査実績.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0050 = null;
	/**
	 * Lot T (Cause) ロットＴ（原因）.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0120 = null;
	/**
	 * Factory release approval record sheet 工場出荷承認記録書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Approve all 全承認.<p>
	 *
	 */
	public MCButton Btn_select_acpt = null;
	/**
	 * Reject all 全却下.<p>
	 *
	 */
	public MCButton Btn_select_rjct = null;
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
	public MCButton Btn_upd_aprv = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Approval record sheet of factory release immediate issue 工場出荷承認記録書即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_aprv_prnt_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_aprv = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_rjct = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_APRV_RJCT]モードを表す定数 */
	public static final String SRCH_APRV_RJCT = "SRCH_APRV_RJCT";
	/** [APRV_RJCT]モードを表す定数 */
	public static final String APRV_RJCT = "APRV_RJCT";
	/** [SRCH_DEL_APRV]モードを表す定数 */
	public static final String SRCH_DEL_APRV = "SRCH_DEL_APRV";
	/** [DEL_APRV]モードを表す定数 */
	public static final String DEL_APRV = "DEL_APRV";
	/** [SRCH_DEL_RJCT]モードを表す定数 */
	public static final String SRCH_DEL_RJCT = "SRCH_DEL_RJCT";
	/** [DEL_RJCT]モードを表す定数 */
	public static final String DEL_RJCT = "DEL_RJCT";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_APRV_RJCT, APRV_RJCT, SRCH_DEL_APRV, DEL_APRV, SRCH_DEL_RJCT, DEL_RJCT, SRCH_UPD, UPD, SRCH, REF, SRCH_PRNT, PRNT};
	
	/** [MS_MSBFL0080_Srch01]のCallerの作成 */
	protected MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Srch01Caller createMS_MSBFL0080_Srch01() {
		MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Srch01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Srch01Bridge>
		caller = ((MSBFP_PlntAprvReg_MC)this).new MS_MSBFL0080_Srch01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Srch01Bridge>(
					(MSBFP_PlntAprvReg)this, new MS_MSBFL0080_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0080_Srch01]の呼び出し */
	protected void callMS_MSBFL0080_Srch01() {
		MCCaller caller = createMS_MSBFL0080_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0080_Upd01]のCallerの作成 */
	protected MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Upd01Caller createMS_MSBFL0080_Upd01() {
		MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Upd01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Upd01Bridge>
		caller = ((MSBFP_PlntAprvReg_MC)this).new MS_MSBFL0080_Upd01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Upd01Bridge>(
					(MSBFP_PlntAprvReg)this, new MS_MSBFL0080_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0080_Upd01]の呼び出し */
	protected void callMS_MSBFL0080_Upd01() {
		MCCaller caller = createMS_MSBFL0080_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0080_Upd02]のCallerの作成 */
	protected MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Upd02Caller createMS_MSBFL0080_Upd02() {
		MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Upd02Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Upd02Bridge>
		caller = ((MSBFP_PlntAprvReg_MC)this).new MS_MSBFL0080_Upd02Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Upd02Bridge>(
					(MSBFP_PlntAprvReg)this, new MS_MSBFL0080_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBFL0080_Upd02]の呼び出し */
	protected void callMS_MSBFL0080_Upd02() {
		MCCaller caller = createMS_MSBFL0080_Upd02();
		caller.exec();
	}
	/** [MS_MSBFL0080_Del01]のCallerの作成 */
	protected MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Del01Caller createMS_MSBFL0080_Del01() {
		MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Del01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Del01Bridge>
		caller = ((MSBFP_PlntAprvReg_MC)this).new MS_MSBFL0080_Del01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Del01Bridge>(
					(MSBFP_PlntAprvReg)this, new MS_MSBFL0080_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0080_Del01]の呼び出し */
	protected void callMS_MSBFL0080_Del01() {
		MCCaller caller = createMS_MSBFL0080_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0080_Prnt01]のCallerの作成 */
	protected MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Prnt01Caller createMS_MSBFL0080_Prnt01() {
		MSBFP_PlntAprvReg_MC.MS_MSBFL0080_Prnt01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Prnt01Bridge>
		caller = ((MSBFP_PlntAprvReg_MC)this).new MS_MSBFL0080_Prnt01Caller<MSBFP_PlntAprvReg, MS_MSBFL0080_Prnt01Bridge>(
					(MSBFP_PlntAprvReg)this, new MS_MSBFL0080_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBFL0080_Prnt01]の呼び出し */
	protected void callMS_MSBFL0080_Prnt01() {
		MCCaller caller = createMS_MSBFL0080_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0080.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0080.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0080.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0080.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0080.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0080.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBF.MSBFP0080.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0080.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0080.BulkSetR createBulkSetR() {
		return mcframe.clientMSBF.MSBFP0080.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBF.MSBFP0080.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0080.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBF.MSBFP0080.RsltR createRsltR() {
		return mcframe.clientMSBF.MSBFP0080.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0080.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBF.MSBFP0080.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0080.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0080.BtnR createBtnR() {
		return mcframe.clientMSBF.MSBFP0080.BtnR.create();
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
		ret.add(AprvStsTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(PlntAprvPrntPanel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
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
	public MSBFP_PlntAprvReg_MC_A() {
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
	public MSBFP_PlntAprvReg_MC_A(String name) {
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
		MSBFP_PlntAprvReg_MC.jbCreateScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateAprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateTop((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateFold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateTab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateTab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreatePlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateCnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateCnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateCtrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateRPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateBulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateRslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateBtn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbCreateEastBtn((MSBFP_PlntAprvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [AprvStsTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvStsTyp(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [PlntAprvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePlntAprvPrnt(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_PlntAprvReg p) {
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
	protected static void jbCreateCnd2(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBFP_PlntAprvReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBFP_PlntAprvReg p) {
		p.BulkSet_aprv_usr_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().aprv_usr_p());
		p.BulkSet_aprv_usr_p_PPanel.setName("BulkSet.aprv_usr_p");
		p.BulkSet_aprv_usr_cd = p.BulkSet_aprv_usr_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_aprv_usr_cd.addAliasName("BulkSet.aprv_usr_cd", p);
		p.BulkSet_aprv_usr_nm = p.BulkSet_aprv_usr_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_aprv_usr_nm.addAliasName("BulkSet.aprv_usr_nm", p);
		p.BulkSet_aprv_dpt_cd = p.BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_aprv_dpt_cd.addAliasName("BulkSet.aprv_dpt_cd", p);
		p.BulkSet_aprv_dpt_nm = p.BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_aprv_dpt_nm.addAliasName("BulkSet.aprv_dpt_nm", p);
		p.BulkSet_aprv_rsn_p_PPanel = mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.create(p.getBulkSetR().aprv_rsn_p());
		p.BulkSet_aprv_rsn_p_PPanel.setName("BulkSet.aprv_rsn_p");
		p.BulkSet_aprv_rsn = p.BulkSet_aprv_rsn_p_PPanel.Txt_txt;
		p.BulkSet_aprv_rsn.addAliasName("BulkSet.aprv_rsn", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBFP_PlntAprvReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0080.RsltR.$itm_p);
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
		p.Rslt_aprv_rsn_p_PPanel = mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.create(mcframe.clientMSBF.MSBFP0080.RsltR.$aprv_rsn_p);
		p.Rslt_aprv_rsn_p_PPanel.setName("Rslt.aprv_rsn_p");
		p.columnRslt_aprv_rsn = p.Rslt_aprv_rsn_p_PPanel.columnTxt_txt;
		p.columnRslt_aprv_rsn.addAliasName("Rslt.aprv_rsn", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBF.MSBFP0080.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_aprv_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_aprv_usr_cd.addAliasName("Rslt.aprv_usr_cd", p);
		p.columnRslt_aprv_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_aprv_usr_nm.addAliasName("Rslt.aprv_usr_nm", p);
		p.columnRslt_aprv_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_aprv_dpt_cd.addAliasName("Rslt.aprv_dpt_cd", p);
		p.columnRslt_aprv_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_aprv_dpt_nm.addAliasName("Rslt.aprv_dpt_nm", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBF.MSBFP0080.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBF.MSBFP0080.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_PlntAprvReg p) {
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
	
	
	/** [Cnd_mfg_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_aprv_sts_typ_p = null;

	/**
	 * [Cnd_mfg_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_aprv_sts_typ_ListPutter() {
		if (Cnd_mfg_aprv_sts_typ_p == null) {
			Cnd_mfg_aprv_sts_typ_p = createCnd_mfg_aprv_sts_typ_ListPutter(Cnd_mfg_aprv_sts_typ, "mfg_aprv_sts_typ", "mfg_aprv_sts_typ_nm");

		}
		return Cnd_mfg_aprv_sts_typ_p;
	}
	
	
	/** [Cnd_aprv_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_usr_cd_p = null;

	/**
	 * [Cnd_aprv_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_usr_cd_ListPutter() {
		if (Cnd_aprv_usr_cd_p == null) {
			Cnd_aprv_usr_cd_p = createCnd_aprv_usr_cd_ListPutter(Cnd_aprv_usr_cd, "aprv_usr_cd", "aprv_usr_nm");

		}
		return Cnd_aprv_usr_cd_p;
	}
	
	
	/** [Cnd_aprv_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_dpt_cd_p = null;

	/**
	 * [Cnd_aprv_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_dpt_cd_ListPutter() {
		if (Cnd_aprv_dpt_cd_p == null) {
			Cnd_aprv_dpt_cd_p = createCnd_aprv_dpt_cd_ListPutter(Cnd_aprv_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");

		}
		return Cnd_aprv_dpt_cd_p;
	}
	
	
	/** [BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");
		}
		return BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_PlntAprvReg create(){
		MSBFP_PlntAprvReg p = new MSBFP_PlntAprvReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_PlntAprvReg create(String name){
		MSBFP_PlntAprvReg p = new MSBFP_PlntAprvReg(name);
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
		MSBFP_PlntAprvReg_MC.jbfInitScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitAprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitTop((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitFold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitTab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitTab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitPlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitCnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitCnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitCtrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitRPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitBulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitRslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitBtn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbfInitEastBtn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitAprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitTop((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitFold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitTab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitTab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitPlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitCnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitCnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitCtrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitRPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitBulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitRslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitBtn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.jbInitEastBtn((MSBFP_PlntAprvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [AprvStsTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvStsTyp(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.AprvStsTypPanel = p.beansFactory.createPanel("AprvStsTyp");
		p.AprvStsTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBFP_PlntAprvReg p) {
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
	protected static void jbfInitTab1(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [PlntAprvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPlntAprvPrnt(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.PlntAprvPrntPanel = p.beansFactory.createPanel("PlntAprvPrnt");
		p.PlntAprvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_APRV_RJCT = p.beansFactory.createRadioButton("Cnd.ope_APRV_RJCT");
		p.Cnd_ope_DEL_APRV = p.beansFactory.createRadioButton("Cnd.ope_DEL_APRV");
		p.Cnd_ope_DEL_RJCT = p.beansFactory.createRadioButton("Cnd.ope_DEL_RJCT");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_acpt_flg = p.beansFactory.createCheckBox("Cnd.acpt_flg");
		p.Cnd_rjct_flg = p.beansFactory.createCheckBox("Cnd.rjct_flg");
		p.Cnd_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_prnt_flg");
		p.Cnd_prnt_flg = p.beansFactory.createCheckBox("Cnd.prnt_flg");
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
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_ntfy_nm_Label = p.beansFactory.createLabel("Cnd.ntfy_nm_Label");
		p.Cnd_ntfy_nm = p.beansFactory.createTextField("Cnd.ntfy_nm");
		p.Cnd_ntfy_nm.setLabel(p.Cnd_ntfy_nm_Label);
		p.Cnd_mfg_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.mfg_aprv_sts_typ_Label");
		p.Cnd_mfg_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.mfg_aprv_sts_typ");
		p.Cnd_mfg_aprv_sts_typ.setLabel(p.Cnd_mfg_aprv_sts_typ_Label);
		p.Cnd_mfg_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.mfg_aprv_sts_typ_nm");
		p.Cnd_aprv_usr_cd_Label = p.beansFactory.createLabel("Cnd.aprv_usr_cd_Label");
		p.Cnd_aprv_usr_cd = p.beansFactory.createTextField("Cnd.aprv_usr_cd");
		p.Cnd_aprv_usr_cd.setLabel(p.Cnd_aprv_usr_cd_Label);
		p.Cnd_aprv_usr_nm = p.beansFactory.createTextField("Cnd.aprv_usr_nm");
		p.Cnd_aprv_dpt_cd_Label = p.beansFactory.createLabel("Cnd.aprv_dpt_cd_Label");
		p.Cnd_aprv_dpt_cd = p.beansFactory.createTextField("Cnd.aprv_dpt_cd");
		p.Cnd_aprv_dpt_cd.setLabel(p.Cnd_aprv_dpt_cd_Label);
		p.Cnd_aprv_dpt_nm = p.beansFactory.createTextField("Cnd.aprv_dpt_nm");
		p.Cnd_plnt_aprv_no_Label = p.beansFactory.createLabel("Cnd.plnt_aprv_no_Label");
		p.Cnd_plnt_aprv_no = p.beansFactory.createTextField("Cnd.plnt_aprv_no");
		p.Cnd_plnt_aprv_no.setLabel(p.Cnd_plnt_aprv_no_Label);
		p.Cnd_trace_disp_flg = p.beansFactory.createCheckBox("Cnd.trace_disp_flg");
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
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_aprv_dt_Label = p.beansFactory.createLabel("BulkSet.aprv_dt_Label");
		p.BulkSet_aprv_dt = p.beansFactory.createDateField("BulkSet.aprv_dt");
		p.BulkSet_aprv_dt.setLabel(p.BulkSet_aprv_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_acpt_flg = p.beansFactory.createTableColumn("Rslt.acpt_flg", MCColumnType.CHECK);
		p.columnRslt_rjct_flg = p.beansFactory.createTableColumn("Rslt.rjct_flg", MCColumnType.CHECK);
		p.columnRslt_ntfy_nm = p.beansFactory.createTableColumn("Rslt.ntfy_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_ver_no = p.beansFactory.createTableColumn("Rslt.ver_no", MCColumnType.TEXT);
		p.columnRslt_skip_chk_ship_flg = p.beansFactory.createTableColumn("Rslt.skip_chk_ship_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_dt = p.beansFactory.createTableColumn("Rslt.aprv_dt", MCColumnType.DATE);
		p.columnRslt_vld_dt = p.beansFactory.createTableColumn("Rslt.vld_dt", MCColumnType.DATE);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_base_unit_qty = p.beansFactory.createTableColumn("Rslt.base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_insp_no = p.beansFactory.createTableColumn("Rslt.insp_no", MCColumnType.TEXT);
		p.columnRslt_insp_typ = p.beansFactory.createTableColumn("Rslt.insp_typ", MCColumnType.TEXT);
		p.columnRslt_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_no = p.beansFactory.createTableColumn("Rslt.plnt_aprv_no", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_prnt_flg = p.beansFactory.createTableColumn("Rslt.plnt_aprv_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_plnt_aprv_prnt_tm = p.beansFactory.createTableColumn("Rslt.plnt_aprv_prnt_tm", MCColumnType.DATE);
		p.columnRslt_insp_mtd_typ = p.beansFactory.createTableColumn("Rslt.insp_mtd_typ", MCColumnType.TEXT);
		p.columnRslt_insp_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_judg_dt = p.beansFactory.createTableColumn("Rslt.judg_dt", MCColumnType.DATE);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_comp_itm_insp_typ = p.beansFactory.createTableColumn("Rslt.comp_itm_insp_typ", MCColumnType.TEXT);
		p.columnRslt_comp_itm_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.comp_itm_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_comp_itm_quality_typ = p.beansFactory.createTableColumn("Rslt.comp_itm_quality_typ", MCColumnType.TEXT);
		p.columnRslt_comp_itm_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.comp_itm_quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_comp_itm_mfg_aprv_typ = p.beansFactory.createTableColumn("Rslt.comp_itm_mfg_aprv_typ", MCColumnType.TEXT);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm = p.beansFactory.createTableColumn("Rslt.comp_itm_mfg_aprv_typ_nm", MCColumnType.TEXT);
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
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0050 = p.beansFactory.createButton("Btn.open_MSBFP0050", "open");
		p.Btn_open_MSBFP0120 = p.beansFactory.createButton("Btn.open_MSBFP0120", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_acpt = p.beansFactory.createButton("Btn.select_acpt", "select_acpt");
		p.Btn_select_rjct = p.beansFactory.createButton("Btn.select_rjct", "select_rjct");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_aprv = p.beansFactory.createButton("Btn.upd_aprv", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_aprv_prnt_flg = p.beansFactory.createCheckBox("Btn.aprv_prnt_flg");
		p.Btn_del_aprv = p.beansFactory.createButton("Btn.del_aprv", "del");
		p.Btn_del_rjct = p.beansFactory.createButton("Btn.del_rjct", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.AprvStsTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvStsTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvStsTyp(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.AprvStsTypPanel.setBorder(p.AprvStsTypTitledBorder);
		p.add(p.AprvStsTypPanel);
		p.AprvStsTypPanel.setNextBeans(p.TopPanel);
		p.AprvStsTypPanel.setValueCheck(false);
		p.AprvStsTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AprvStsTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBFP_PlntAprvReg p) {
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
	protected static void jbInitFold(MSBFP_PlntAprvReg p) {
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.PlntAprvPrntPanel);
		p.Tab1Panel.add(p.PlntAprvPrntPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [PlntAprvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPlntAprvPrnt(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.PlntAprvPrntPanel.setBorder(p.PlntAprvPrntTitledBorder);
		p.PlntAprvPrntPanel.setValueCheck(false);
		p.PlntAprvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PlntAprvPrntPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_APRV_RJCT);
		p.Cnd_ope_APRV_RJCT.setActionCommand("APRV_RJCT");
		p.Cnd_ope_Group.add(p.Cnd_ope_APRV_RJCT);
		p.ScreenOpePanel.add(p.Cnd_ope_APRV_RJCT);
		p.Cnd_ope_APRV_RJCT.setNextBeans(p.Cnd_ope_DEL_APRV);
		p.Cnd_ope_DEL_APRV.setActionCommand("DEL_APRV");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_APRV);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_APRV);
		p.Cnd_ope_DEL_APRV.setNextBeans(p.Cnd_ope_DEL_RJCT);
		p.Cnd_ope_DEL_RJCT.setActionCommand("DEL_RJCT");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_RJCT);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_RJCT);
		p.Cnd_ope_DEL_RJCT.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("UPD");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("PRNT");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.ope_META);
		p.AprvStsTypPanel.add(p.Cnd_opn_flg);
		p.AprvStsTypPanel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_acpt_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.opn_flg_META);
		p.AprvStsTypPanel.add(p.Cnd_acpt_flg);
		p.Cnd_acpt_flg.setNextBeans(p.Cnd_rjct_flg);
		p.Cnd_acpt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.acpt_flg_META);
		p.AprvStsTypPanel.add(p.Cnd_rjct_flg);
		p.Cnd_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.rjct_flg_META);
		p.PlntAprvPrntPanel.add(p.Cnd_not_prnt_flg);
		p.PlntAprvPrntPanel.setLastBeans(p.Cnd_not_prnt_flg);
		p.Cnd_not_prnt_flg.setNextBeans(p.Cnd_prnt_flg);
		p.Cnd_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.not_prnt_flg_META);
		p.PlntAprvPrntPanel.add(p.Cnd_prnt_flg);
		p.Cnd_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.prnt_flg_META);
		p.CndPanel.add(p.Cnd_aprv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_aprv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_aprv_dt_fr);
		p.Cnd_aprv_dt_fr.setNextBeans(p.Cnd_aprv_dt_to);
		p.Cnd_aprv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.aprv_dt_fr_META);
		p.Cnd_aprv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_dt_to_Label);
		p.CndPanel.add(p.Cnd_aprv_dt_to);
		p.Cnd_aprv_dt_to.setNextBeans(p.Cnd_upd_ts_fr);
		p.Cnd_aprv_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.aprv_dt_to_META);
		p.Cnd_aprv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_fr_Label);
		p.CndPanel.add(p.Cnd_upd_ts_fr);
		p.Cnd_upd_ts_fr.setNextBeans(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.upd_ts_fr_META);
		p.Cnd_upd_ts_fr.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_to_Label);
		p.CndPanel.add(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_upd_ts_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.upd_ts_to_META);
		p.Cnd_upd_ts_to.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.site_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_ntfy_nm);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_ntfy_nm_Label);
		p.CndPanel.add(p.Cnd_ntfy_nm);
		p.Cnd_ntfy_nm.setNextBeans(p.Cnd_mfg_aprv_sts_typ);
		p.Cnd_ntfy_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.ntfy_nm_META);
		p.setPluralValueEnable(p.Cnd_ntfy_nm, true);
		p.Cnd_mfg_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_aprv_sts_typ, true);
		p.Cnd_mfg_aprv_sts_typ.setLinkBeans(p.Cnd_mfg_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ);
		p.Cnd_mfg_aprv_sts_typ.setNextBeans(p.Cnd_mfg_aprv_sts_typ_nm);
		p.Cnd_mfg_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.mfg_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ_nm);
		p.Cnd_mfg_aprv_sts_typ_nm.setNextBeans(p.Cnd_aprv_usr_cd);
		p.Cnd_mfg_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.mfg_aprv_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_aprv_usr_cd_Label);
		p.CndPanel.add(p.Cnd_aprv_usr_cd);
		p.Cnd_aprv_usr_cd.setNextBeans(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.aprv_usr_cd_META);
		p.Cnd_aprv_usr_cd.addLinkBeans(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_usr_cd, true);
		p.CndPanel.add(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_nm.setNextBeans(p.Cnd_aprv_dpt_cd);
		p.Cnd_aprv_usr_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.aprv_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_aprv_usr_nm, true);
		p.CndPanel.add(p.Cnd_aprv_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_aprv_dpt_cd);
		p.Cnd_aprv_dpt_cd.setNextBeans(p.Cnd_aprv_dpt_nm);
		p.Cnd_aprv_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.aprv_dpt_cd_META);
		p.Cnd_aprv_dpt_cd.addLinkBeans(p.Cnd_aprv_dpt_nm);
		p.Cnd_aprv_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_dpt_cd, true);
		p.CndPanel.add(p.Cnd_aprv_dpt_nm);
		p.Cnd_aprv_dpt_nm.setNextBeans(p.Cnd_plnt_aprv_no);
		p.Cnd_aprv_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.aprv_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_aprv_dpt_nm, true);
		p.CndPanel.add(p.Cnd_plnt_aprv_no_Label);
		p.CndPanel.add(p.Cnd_plnt_aprv_no);
		p.Cnd_plnt_aprv_no.setNextBeans(p.Cnd_trace_disp_flg);
		p.Cnd_plnt_aprv_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.plnt_aprv_no_META);
		p.setPluralValueEnable(p.Cnd_plnt_aprv_no, true);
		p.CndPanel.add(p.Cnd_trace_disp_flg);
		p.Cnd_trace_disp_flg.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trace_disp_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.trace_disp_flg_META);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0080.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBFP_PlntAprvReg p) {
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
	protected static void jbInitRPnl(MSBFP_PlntAprvReg p) {
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
	protected static void jbInitBulkSet(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_aprv_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_aprv_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_aprv_dt);
		p.BulkSet_aprv_dt.setNextBeans(p.BulkSet_aprv_usr_p_PPanel);
		p.BulkSet_aprv_dt.setRow(p.getBulkSetR(), mcframe.clientMSBF.MSBFP0080.BulkSetR.aprv_dt_META);
		p.BulkSet_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_aprv_usr_p_PPanel);
		p.BulkSet_aprv_usr_p_PPanel.setNextBeans(p.BulkSet_aprv_rsn_p_PPanel);
		p.BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_aprv_dpt_nm);
		p.BulkSetPanel.add(p.BulkSet_aprv_rsn_p_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBFP_PlntAprvReg p) {
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
	protected static void jbInitBtn(MSBFP_PlntAprvReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0050.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBFP0050);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBFP0050);
		p.Btn_open_MSBFP0050.setNextBeans(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_acpt);
		p.Btn_select_acpt.setIcon("SELECT_ALL");
		p.Btn_select_acpt.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_select_acpt);
		p.Btn_select_acpt.setNextBeans(p.Btn_select_rjct);
		p.Btn_select_rjct.setIcon("SELECT_ALL");
		p.Btn_select_rjct.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_select_rjct);
		p.Btn_select_rjct.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_aprv);
		p.Btn_upd_aprv.setIcon("REGISTER");
		p.Btn_upd_aprv.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_aprv);
		p.Btn_upd_aprv.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_aprv_prnt_flg);
		p.BtnPanel.add(p.Btn_aprv_prnt_flg);
		p.Btn_aprv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBF.MSBFP0080.BtnR.aprv_prnt_flg_META);
		p.Btn_del_aprv.setIcon("CANCEL");
		p.Btn_del_aprv.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_aprv);
		p.EastBtnPanel.add(p.Btn_del_aprv);
		p.Btn_del_aprv.setNextBeans(p.Btn_del_rjct);
		p.Btn_del_rjct.setIcon("CANCEL");
		p.Btn_del_rjct.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_rjct);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_PlntAprvReg p) {
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
		MSBFP_PlntAprvReg_MC.mcInitScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitAprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitTop((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitFold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitTab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitTab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitPlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitCnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitCnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitCtrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitRPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitBulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitRslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitBtn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.mcInitEastBtn((MSBFP_PlntAprvReg)this);

		// [SRCH_APRV_RJCT]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__APRV__RJCT_EastBtn((MSBFP_PlntAprvReg)this);

		// [APRV_RJCT]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitAPRV__RJCT_EastBtn((MSBFP_PlntAprvReg)this);

		// [SRCH_DEL_APRV]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__APRV_EastBtn((MSBFP_PlntAprvReg)this);

		// [DEL_APRV]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__APRV_EastBtn((MSBFP_PlntAprvReg)this);

		// [SRCH_DEL_RJCT]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__DEL__RJCT_EastBtn((MSBFP_PlntAprvReg)this);

		// [DEL_RJCT]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitDEL__RJCT_EastBtn((MSBFP_PlntAprvReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__UPD_EastBtn((MSBFP_PlntAprvReg)this);

		// [UPD]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitUPD_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitUPD_EastBtn((MSBFP_PlntAprvReg)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitSRCH_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH_EastBtn((MSBFP_PlntAprvReg)this);

		// [REF]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitREF_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitREF_EastBtn((MSBFP_PlntAprvReg)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitSRCH__PRNT_EastBtn((MSBFP_PlntAprvReg)this);

		// [PRNT]ステータスのモードの設定
		MSBFP_PlntAprvReg_MC.statusInitPRNT_ScreenOpe((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_AprvStsTyp((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Top((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Fold((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Tab1((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Tab2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_PlntAprvPrnt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Cnd((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Cnd2((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Ctrl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_RPnl((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_BulkSet((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Rslt((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_Btn((MSBFP_PlntAprvReg)this);
		MSBFP_PlntAprvReg_MC.statusInitPRNT_EastBtn((MSBFP_PlntAprvReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [AprvStsTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvStsTyp(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBFP_PlntAprvReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [PlntAprvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPlntAprvPrnt(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_PlntAprvReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_APRV_RJCT.addAllListener(p);
		p.Cnd_ope_DEL_APRV.addAllListener(p);
		p.Cnd_ope_DEL_RJCT.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_acpt_flg.addAllListener(p);
		p.Cnd_rjct_flg.addAllListener(p);
		p.Cnd_not_prnt_flg.addAllListener(p);
		p.Cnd_prnt_flg.addAllListener(p);
		p.Cnd_aprv_dt_fr.setListListener(p);
		p.Cnd_aprv_dt_fr.addAllListener(p);
		p.Cnd_aprv_dt_to.setListListener(p);
		p.Cnd_aprv_dt_to.addAllListener(p);
		p.Cnd_upd_ts_fr.setListListener(p);
		p.Cnd_upd_ts_fr.addAllListener(p);
		p.Cnd_upd_ts_to.setListListener(p);
		p.Cnd_upd_ts_to.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_ntfy_nm.setListListener(p);
		p.Cnd_ntfy_nm.addAllListener(p);
		p.Cnd_mfg_aprv_sts_typ.setListListener(p);
		p.Cnd_mfg_aprv_sts_typ.addAllListener(p);
		p.Cnd_mfg_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_aprv_usr_cd.setListListener(p);
		p.Cnd_aprv_usr_cd.addAllListener(p);
		p.Cnd_aprv_usr_nm.setListListener(p);
		p.Cnd_aprv_usr_nm.addAllListener(p);
		p.Cnd_aprv_dpt_cd.setListListener(p);
		p.Cnd_aprv_dpt_cd.addAllListener(p);
		p.Cnd_aprv_dpt_nm.setListListener(p);
		p.Cnd_aprv_dpt_nm.addAllListener(p);
		p.Cnd_plnt_aprv_no.setListListener(p);
		p.Cnd_plnt_aprv_no.addAllListener(p);
		p.Cnd_trace_disp_flg.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBFP_PlntAprvReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBFP_PlntAprvReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBFP_PlntAprvReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBFP_PlntAprvReg p) {
		p.BulkSet_aprv_dt.setListListener(p);
		p.BulkSet_aprv_dt.addAllListener(p);
		p.BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBFP_PlntAprvReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_acpt_flg.addAllListener(p);
		p.columnRslt_rjct_flg.addAllListener(p);
		p.columnRslt_ntfy_nm.addAllListener(p);
		p.columnRslt_ntfy_nm.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_ver_no.addAllListener(p);
		p.columnRslt_ver_no.setListListener(p);
		p.columnRslt_skip_chk_ship_flg.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_dt.addAllListener(p);
		p.columnRslt_aprv_dt.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_vld_dt.addAllListener(p);
		p.columnRslt_vld_dt.setListListener(p);
		p.columnRslt_bp_lot_no.addAllListener(p);
		p.columnRslt_bp_lot_no.setListListener(p);
		p.columnRslt_base_unit_qty.addAllListener(p);
		p.columnRslt_base_unit_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_insp_no.addAllListener(p);
		p.columnRslt_insp_no.setListListener(p);
		p.columnRslt_insp_typ.addAllListener(p);
		p.columnRslt_insp_typ.setListListener(p);
		p.columnRslt_insp_typ_nm.addAllListener(p);
		p.columnRslt_insp_typ_nm.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_plnt_aprv_no.addAllListener(p);
		p.columnRslt_plnt_aprv_no.setListListener(p);
		p.columnRslt_plnt_aprv_prnt_flg.addAllListener(p);
		p.columnRslt_plnt_aprv_prnt_tm.addAllListener(p);
		p.columnRslt_plnt_aprv_prnt_tm.setListListener(p);
		p.columnRslt_insp_mtd_typ.addAllListener(p);
		p.columnRslt_insp_mtd_typ.setListListener(p);
		p.columnRslt_insp_mtd_typ_nm.addAllListener(p);
		p.columnRslt_insp_mtd_typ_nm.setListListener(p);
		p.columnRslt_judg_dt.addAllListener(p);
		p.columnRslt_judg_dt.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_comp_itm_insp_typ.addAllListener(p);
		p.columnRslt_comp_itm_insp_typ.setListListener(p);
		p.columnRslt_comp_itm_insp_typ_nm.addAllListener(p);
		p.columnRslt_comp_itm_insp_typ_nm.setListListener(p);
		p.columnRslt_comp_itm_quality_typ.addAllListener(p);
		p.columnRslt_comp_itm_quality_typ.setListListener(p);
		p.columnRslt_comp_itm_quality_typ_nm.addAllListener(p);
		p.columnRslt_comp_itm_quality_typ_nm.setListListener(p);
		p.columnRslt_comp_itm_mfg_aprv_typ.addAllListener(p);
		p.columnRslt_comp_itm_mfg_aprv_typ.setListListener(p);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.addAllListener(p);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_PlntAprvReg p) {
		p.Btn_open_MSBFP0050.addAllListener(p);
		p.Btn_open_MSBFP0050.setAPMethodName("doBtn_open_MSBFP0050");
		p.Btn_open_MSBFP0120.addAllListener(p);
		p.Btn_open_MSBFP0120.setAPMethodName("doBtn_open_MSBFP0120");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_acpt.addAllListener(p);
		p.Btn_select_acpt.setAPMethodName("doBtn_select_acpt");
		p.Btn_select_rjct.addAllListener(p);
		p.Btn_select_rjct.setAPMethodName("doBtn_select_rjct");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_aprv.addAllListener(p);
		p.Btn_upd_aprv.setAPMethodName("doBtn_upd_aprv");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_aprv_prnt_flg.addAllListener(p);
		p.Btn_del_aprv.addAllListener(p);
		p.Btn_del_aprv.setAPMethodName("doBtn_del_aprv");
		p.Btn_del_rjct.addAllListener(p);
		p.Btn_del_rjct.setAPMethodName("doBtn_del_rjct");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_PlntAprvReg p) {
	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_APRV_RJCT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_prnt_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_plnt_aprv_no.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_acpt_flg.putMode(p, SRCH_APRV_RJCT, MCMode.REQUIRED);
		p.columnRslt_rjct_flg.putMode(p, SRCH_APRV_RJCT, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_APRV_RJCT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_APRV_RJCT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);
		p.Btn_aprv_prnt_flg.putMode(p, SRCH_APRV_RJCT, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, SRCH_APRV_RJCT, MCMode.DISABLE);
		p.Btn_del_rjct.putMode(p, SRCH_APRV_RJCT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_APRV_RJCT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APRV__RJCT_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, APRV_RJCT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_prnt_flg.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_fr.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dt_to.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dpt_cd.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_dpt_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Cnd_plnt_aprv_no.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, APRV_RJCT, MCMode.ENABLE);

	}

	/**
	 * [APRV_RJCT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [APRV_RJCT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, APRV_RJCT, MCMode.ENABLE);

	}

	/**
	 * [APRV_RJCT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, APRV_RJCT, MCMode.REQUIRED);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);

	}

	/**
	 * [APRV_RJCT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_acpt_flg.putMode(p, APRV_RJCT, MCMode.REQUIRED);
		p.columnRslt_rjct_flg.putMode(p, APRV_RJCT, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.columnRslt_plnt_aprv_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(APRV_RJCT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, APRV_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, APRV_RJCT, MCMode.INVISIBLE);

	}

	/**
	 * [APRV_RJCT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, APRV_RJCT, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_select_rjct.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, APRV_RJCT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, APRV_RJCT, MCMode.INVISIBLE);
		p.Btn_aprv_prnt_flg.putMode(p, APRV_RJCT, MCMode.ENABLE);
		p.Btn_del_aprv.putMode(p, APRV_RJCT, MCMode.DISABLE);
		p.Btn_del_rjct.putMode(p, APRV_RJCT, MCMode.INVISIBLE);

	}

	/**
	 * [APRV_RJCT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitAPRV__RJCT_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_APRV, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
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

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_APRV, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_APRV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_DEL_APRV, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);
		p.Btn_aprv_prnt_flg.putMode(p, SRCH_DEL_APRV, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, SRCH_DEL_APRV, MCMode.DISABLE);
		p.Btn_del_rjct.putMode(p, SRCH_DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__APRV_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_APRV, MCMode.ENABLE);
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

	}

	/**
	 * [DEL_APRV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);

	}

	/**
	 * [DEL_APRV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.columnRslt_plnt_aprv_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Btn_aprv_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Btn_del_rjct.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_RJCT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_RJCT, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_RJCT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_DEL_RJCT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.Btn_aprv_prnt_flg.putMode(p, SRCH_DEL_RJCT, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, SRCH_DEL_RJCT, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, SRCH_DEL_RJCT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL_RJCT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__RJCT_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, DEL_RJCT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, DEL_RJCT, MCMode.ENABLE);

	}

	/**
	 * [DEL_RJCT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [DEL_RJCT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, DEL_RJCT, MCMode.ENABLE);

	}

	/**
	 * [DEL_RJCT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);

	}

	/**
	 * [DEL_RJCT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, DEL_RJCT, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.columnRslt_plnt_aprv_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_RJCT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_RJCT, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_RJCT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, DEL_RJCT, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, DEL_RJCT, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, DEL_RJCT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_RJCT, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, DEL_RJCT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.Btn_aprv_prnt_flg.putMode(p, DEL_RJCT, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, DEL_RJCT, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, DEL_RJCT, MCMode.ENABLE);

	}

	/**
	 * [DEL_RJCT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__RJCT_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_aprv_prnt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_plnt_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_aprv_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acpt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_aprv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rjct_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
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

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
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
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_aprv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_aprv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, SRCH_PRNT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[AprvStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_AprvStsTyp(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[PlntAprvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PlntAprvPrnt(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBFP_PlntAprvReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prnt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_plnt_aprv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trace_disp_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBFP_PlntAprvReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBFP_PlntAprvReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBFP_PlntAprvReg p){
		p.BulkSet_aprv_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.BulkSet_aprv_usr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_aprv_rsn_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBFP_PlntAprvReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rjct_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_aprv_rsn_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_skip_chk_ship_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_prnt_tm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_comp_itm_insp_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_insp_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_quality_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBFP_PlntAprvReg p){
		p.Btn_open_MSBFP0050.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_acpt.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_select_rjct.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_aprv_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_del_aprv.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Btn_del_rjct.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBFP_PlntAprvReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_APRV_RJCT;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBFP_PlntAprvReg_MC.setTableConfigRslt((MSBFP_PlntAprvReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBFP_PlntAprvReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_acpt_flg.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.acpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acpt_flg);
		p.columnRslt_rjct_flg.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.rjct_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rjct_flg);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_ntfy_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ntfy_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ntfy_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_ver_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ver_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_no);
		p.RsltTable.addTable(p.Rslt_aprv_rsn_p_PPanel.TxtTable);
		p.columnRslt_skip_chk_ship_flg.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.skip_chk_ship_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_skip_chk_ship_flg);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.mfg_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_aprv_dt.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.aprv_dt_META);
		p.columnRslt_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_dt);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_aprv_dpt_nm);
		p.columnRslt_vld_dt.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.vld_dt_META);
		p.columnRslt_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.columnRslt_base_unit_qty.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_plnt_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.plnt_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ);
		p.columnRslt_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.plnt_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ_nm);
		p.columnRslt_insp_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.insp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_no);
		p.columnRslt_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_typ);
		p.columnRslt_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_typ_nm);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_plnt_aprv_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.plnt_aprv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_no);
		p.columnRslt_plnt_aprv_prnt_flg.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.plnt_aprv_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_prnt_flg);
		p.columnRslt_plnt_aprv_prnt_tm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.plnt_aprv_prnt_tm_META);
		p.columnRslt_plnt_aprv_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_prnt_tm);
		p.columnRslt_insp_mtd_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.insp_mtd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_mtd_typ);
		p.columnRslt_insp_mtd_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.insp_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_mtd_typ_nm);
		p.columnRslt_judg_dt.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.judg_dt_META);
		p.columnRslt_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_judg_dt);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_comp_itm_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.comp_itm_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_itm_insp_typ);
		p.columnRslt_comp_itm_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.comp_itm_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_itm_insp_typ_nm);
		p.columnRslt_comp_itm_quality_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.comp_itm_quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_itm_quality_typ);
		p.columnRslt_comp_itm_quality_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.comp_itm_quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_itm_quality_typ_nm);
		p.columnRslt_comp_itm_mfg_aprv_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.comp_itm_mfg_aprv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_itm_mfg_aprv_typ);
		p.columnRslt_comp_itm_mfg_aprv_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.comp_itm_mfg_aprv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_itm_mfg_aprv_typ_nm);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0080.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
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
		Cnd_mfg_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_aprv_sts_typ.getListConfig().setPutter(getCnd_mfg_aprv_sts_typ_ListPutter());
		Cnd_aprv_usr_cd.getListConfig().setPutter(getCnd_aprv_usr_cd_ListPutter());
		Cnd_aprv_dpt_cd.getListConfig().setPutter(getCnd_aprv_dpt_cd_ListPutter());
		BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_APRV_RJCT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_APRV_RJCTStatus() {
		status = SRCH_APRV_RJCT;
		setAllStatus(status);
	}

	/**
	 * この画面を[APRV_RJCT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setAPRV_RJCTStatus() {
		status = APRV_RJCT;
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
	 * この画面を[SRCH_DEL_RJCT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_RJCTStatus() {
		status = SRCH_DEL_RJCT;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_RJCT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_RJCTStatus() {
		status = DEL_RJCT;
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
		if (SRCH_APRV_RJCT.equals(status)) {
			setSRCH_APRV_RJCTStatus();
		}
		else if (APRV_RJCT.equals(status)) {
			setAPRV_RJCTStatus();
		}
		else if (SRCH_DEL_APRV.equals(status)) {
			setSRCH_DEL_APRVStatus();
		}
		else if (DEL_APRV.equals(status)) {
			setDEL_APRVStatus();
		}
		else if (SRCH_DEL_RJCT.equals(status)) {
			setSRCH_DEL_RJCTStatus();
		}
		else if (DEL_RJCT.equals(status)) {
			setDEL_RJCTStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
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
	 * [Cnd_mfg_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_mfg_aprv_sts_typ) return getCnd_mfg_aprv_sts_typ(row, info);
		if(combo == Cnd_aprv_usr_cd) return getCnd_aprv_usr_cd(row, info);
		if(combo == Cnd_aprv_dpt_cd) return getCnd_aprv_dpt_cd(row, info);
		if(combo == BulkSet_aprv_usr_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd(row, info);
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
		else if (ap == Btn_open_MSBFP0050) doBtn_open_MSBFP0050(info);
		else if (ap == Btn_open_MSBFP0120) doBtn_open_MSBFP0120(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_acpt) doBtn_select_acpt(info);
		else if (ap == Btn_select_rjct) doBtn_select_rjct(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_aprv) doBtn_upd_aprv(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del_aprv) doBtn_del_aprv(info);
		else if (ap == Btn_del_rjct) doBtn_del_rjct(info);
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
	 * [Btn]パネルの[open_MSBFP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_acpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_acpt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_rjct]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_rjct(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_aprv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_aprv(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_aprv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_aprv(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_rjct]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_rjct(MCEventInfo info);

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
		if (vc == Cnd_opn_flg) return doCnd_opn_flg_VC(info);
		if (vc == Cnd_acpt_flg) return doCnd_acpt_flg_VC(info);
		if (vc == Cnd_rjct_flg) return doCnd_rjct_flg_VC(info);
		if (vc == Cnd_not_prnt_flg) return doCnd_not_prnt_flg_VC(info);
		if (vc == Cnd_prnt_flg) return doCnd_prnt_flg_VC(info);
		if (vc == Cnd_aprv_dt_fr) return doCnd_aprv_dt_fr_VC(info);
		if (vc == Cnd_aprv_dt_to) return doCnd_aprv_dt_to_VC(info);
		if (vc == Cnd_upd_ts_fr) return doCnd_upd_ts_fr_VC(info);
		if (vc == Cnd_upd_ts_to) return doCnd_upd_ts_to_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_ntfy_nm) return doCnd_ntfy_nm_VC(info);
		if (vc == Cnd_mfg_aprv_sts_typ) return doCnd_mfg_aprv_sts_typ_VC(info);
		if (vc == Cnd_mfg_aprv_sts_typ_nm) return doCnd_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_aprv_usr_cd) return doCnd_aprv_usr_cd_VC(info);
		if (vc == Cnd_aprv_usr_nm) return doCnd_aprv_usr_nm_VC(info);
		if (vc == Cnd_aprv_dpt_cd) return doCnd_aprv_dpt_cd_VC(info);
		if (vc == Cnd_aprv_dpt_nm) return doCnd_aprv_dpt_nm_VC(info);
		if (vc == Cnd_plnt_aprv_no) return doCnd_plnt_aprv_no_VC(info);
		if (vc == Cnd_trace_disp_flg) return doCnd_trace_disp_flg_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == BulkSet_aprv_dt) return doBulkSet_aprv_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_acpt_flg) return doRslt_acpt_flg_VC(info);
		if (vc == columnRslt_rjct_flg) return doRslt_rjct_flg_VC(info);
		if (vc == columnRslt_ntfy_nm) return doRslt_ntfy_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_ver_no) return doRslt_ver_no_VC(info);
		if (vc == columnRslt_skip_chk_ship_flg) return doRslt_skip_chk_ship_flg_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_dt) return doRslt_aprv_dt_VC(info);
		if (vc == columnRslt_vld_dt) return doRslt_vld_dt_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_base_unit_qty) return doRslt_base_unit_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ) return doRslt_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ_nm) return doRslt_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_insp_no) return doRslt_insp_no_VC(info);
		if (vc == columnRslt_insp_typ) return doRslt_insp_typ_VC(info);
		if (vc == columnRslt_insp_typ_nm) return doRslt_insp_typ_nm_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_plnt_aprv_no) return doRslt_plnt_aprv_no_VC(info);
		if (vc == columnRslt_plnt_aprv_prnt_flg) return doRslt_plnt_aprv_prnt_flg_VC(info);
		if (vc == columnRslt_plnt_aprv_prnt_tm) return doRslt_plnt_aprv_prnt_tm_VC(info);
		if (vc == columnRslt_insp_mtd_typ) return doRslt_insp_mtd_typ_VC(info);
		if (vc == columnRslt_insp_mtd_typ_nm) return doRslt_insp_mtd_typ_nm_VC(info);
		if (vc == columnRslt_judg_dt) return doRslt_judg_dt_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_comp_itm_insp_typ) return doRslt_comp_itm_insp_typ_VC(info);
		if (vc == columnRslt_comp_itm_insp_typ_nm) return doRslt_comp_itm_insp_typ_nm_VC(info);
		if (vc == columnRslt_comp_itm_quality_typ) return doRslt_comp_itm_quality_typ_VC(info);
		if (vc == columnRslt_comp_itm_quality_typ_nm) return doRslt_comp_itm_quality_typ_nm_VC(info);
		if (vc == columnRslt_comp_itm_mfg_aprv_typ) return doRslt_comp_itm_mfg_aprv_typ_VC(info);
		if (vc == columnRslt_comp_itm_mfg_aprv_typ_nm) return doRslt_comp_itm_mfg_aprv_typ_nm_VC(info);
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
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == Btn_aprv_prnt_flg) return doBtn_aprv_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prnt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ntfy_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ntfy_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_plnt_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trace_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trace_disp_flg_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_aprv_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[acpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ntfy_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[skip_chk_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_skip_chk_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_prnt_tm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[judg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_judg_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_itm_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_itm_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_itm_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_itm_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_itm_mfg_aprv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_itm_mfg_aprv_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[aprv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_aprv_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_acpt_flg) doCnd_acpt_flg_NC(info);
		else if (nc == Cnd_rjct_flg) doCnd_rjct_flg_NC(info);
		else if (nc == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NC(info);
		else if (nc == Cnd_prnt_flg) doCnd_prnt_flg_NC(info);
		else if (nc == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NC(info);
		else if (nc == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NC(info);
		else if (nc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NC(info);
		else if (nc == Cnd_upd_ts_to) doCnd_upd_ts_to_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_ntfy_nm) doCnd_ntfy_nm_NC(info);
		else if (nc == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NC(info);
		else if (nc == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NC(info);
		else if (nc == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NC(info);
		else if (nc == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_NC(info);
		else if (nc == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_NC(info);
		else if (nc == Cnd_plnt_aprv_no) doCnd_plnt_aprv_no_NC(info);
		else if (nc == Cnd_trace_disp_flg) doCnd_trace_disp_flg_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == BulkSet_aprv_dt) doBulkSet_aprv_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_acpt_flg) doRslt_acpt_flg_NC(info);
		else if (nc == columnRslt_rjct_flg) doRslt_rjct_flg_NC(info);
		else if (nc == columnRslt_ntfy_nm) doRslt_ntfy_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_ver_no) doRslt_ver_no_NC(info);
		else if (nc == columnRslt_skip_chk_ship_flg) doRslt_skip_chk_ship_flg_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_dt) doRslt_aprv_dt_NC(info);
		else if (nc == columnRslt_vld_dt) doRslt_vld_dt_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_base_unit_qty) doRslt_base_unit_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_insp_no) doRslt_insp_no_NC(info);
		else if (nc == columnRslt_insp_typ) doRslt_insp_typ_NC(info);
		else if (nc == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_plnt_aprv_no) doRslt_plnt_aprv_no_NC(info);
		else if (nc == columnRslt_plnt_aprv_prnt_flg) doRslt_plnt_aprv_prnt_flg_NC(info);
		else if (nc == columnRslt_plnt_aprv_prnt_tm) doRslt_plnt_aprv_prnt_tm_NC(info);
		else if (nc == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NC(info);
		else if (nc == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_judg_dt) doRslt_judg_dt_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_comp_itm_insp_typ) doRslt_comp_itm_insp_typ_NC(info);
		else if (nc == columnRslt_comp_itm_insp_typ_nm) doRslt_comp_itm_insp_typ_nm_NC(info);
		else if (nc == columnRslt_comp_itm_quality_typ) doRslt_comp_itm_quality_typ_NC(info);
		else if (nc == columnRslt_comp_itm_quality_typ_nm) doRslt_comp_itm_quality_typ_nm_NC(info);
		else if (nc == columnRslt_comp_itm_mfg_aprv_typ) doRslt_comp_itm_mfg_aprv_typ_NC(info);
		else if (nc == columnRslt_comp_itm_mfg_aprv_typ_nm) doRslt_comp_itm_mfg_aprv_typ_nm_NC(info);
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
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == Btn_aprv_prnt_flg) doBtn_aprv_prnt_flg_NC(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ntfy_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trace_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trace_disp_flg_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[skip_chk_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_skip_chk_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_tm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[aprv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_aprv_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_acpt_flg) doCnd_acpt_flg_NE(info);
		else if (ne == Cnd_rjct_flg) doCnd_rjct_flg_NE(info);
		else if (ne == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NE(info);
		else if (ne == Cnd_prnt_flg) doCnd_prnt_flg_NE(info);
		else if (ne == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NE(info);
		else if (ne == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NE(info);
		else if (ne == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NE(info);
		else if (ne == Cnd_upd_ts_to) doCnd_upd_ts_to_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_ntfy_nm) doCnd_ntfy_nm_NE(info);
		else if (ne == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NE(info);
		else if (ne == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NE(info);
		else if (ne == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NE(info);
		else if (ne == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_NE(info);
		else if (ne == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_NE(info);
		else if (ne == Cnd_plnt_aprv_no) doCnd_plnt_aprv_no_NE(info);
		else if (ne == Cnd_trace_disp_flg) doCnd_trace_disp_flg_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == BulkSet_aprv_dt) doBulkSet_aprv_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_acpt_flg) doRslt_acpt_flg_NE(info);
		else if (ne == columnRslt_rjct_flg) doRslt_rjct_flg_NE(info);
		else if (ne == columnRslt_ntfy_nm) doRslt_ntfy_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_ver_no) doRslt_ver_no_NE(info);
		else if (ne == columnRslt_skip_chk_ship_flg) doRslt_skip_chk_ship_flg_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_dt) doRslt_aprv_dt_NE(info);
		else if (ne == columnRslt_vld_dt) doRslt_vld_dt_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_base_unit_qty) doRslt_base_unit_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_insp_no) doRslt_insp_no_NE(info);
		else if (ne == columnRslt_insp_typ) doRslt_insp_typ_NE(info);
		else if (ne == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_plnt_aprv_no) doRslt_plnt_aprv_no_NE(info);
		else if (ne == columnRslt_plnt_aprv_prnt_flg) doRslt_plnt_aprv_prnt_flg_NE(info);
		else if (ne == columnRslt_plnt_aprv_prnt_tm) doRslt_plnt_aprv_prnt_tm_NE(info);
		else if (ne == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NE(info);
		else if (ne == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_judg_dt) doRslt_judg_dt_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_comp_itm_insp_typ) doRslt_comp_itm_insp_typ_NE(info);
		else if (ne == columnRslt_comp_itm_insp_typ_nm) doRslt_comp_itm_insp_typ_nm_NE(info);
		else if (ne == columnRslt_comp_itm_quality_typ) doRslt_comp_itm_quality_typ_NE(info);
		else if (ne == columnRslt_comp_itm_quality_typ_nm) doRslt_comp_itm_quality_typ_nm_NE(info);
		else if (ne == columnRslt_comp_itm_mfg_aprv_typ) doRslt_comp_itm_mfg_aprv_typ_NE(info);
		else if (ne == columnRslt_comp_itm_mfg_aprv_typ_nm) doRslt_comp_itm_mfg_aprv_typ_nm_NE(info);
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
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == Btn_aprv_prnt_flg) doBtn_aprv_prnt_flg_NE(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[not_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ntfy_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trace_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trace_disp_flg_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[skip_chk_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_skip_chk_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_tm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[aprv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_aprv_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_acpt_flg) doCnd_acpt_flg_NX(info);
		else if (nx == Cnd_rjct_flg) doCnd_rjct_flg_NX(info);
		else if (nx == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NX(info);
		else if (nx == Cnd_prnt_flg) doCnd_prnt_flg_NX(info);
		else if (nx == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NX(info);
		else if (nx == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NX(info);
		else if (nx == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NX(info);
		else if (nx == Cnd_upd_ts_to) doCnd_upd_ts_to_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_ntfy_nm) doCnd_ntfy_nm_NX(info);
		else if (nx == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NX(info);
		else if (nx == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NX(info);
		else if (nx == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NX(info);
		else if (nx == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_NX(info);
		else if (nx == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_NX(info);
		else if (nx == Cnd_plnt_aprv_no) doCnd_plnt_aprv_no_NX(info);
		else if (nx == Cnd_trace_disp_flg) doCnd_trace_disp_flg_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == BulkSet_aprv_dt) doBulkSet_aprv_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_acpt_flg) doRslt_acpt_flg_NX(info);
		else if (nx == columnRslt_rjct_flg) doRslt_rjct_flg_NX(info);
		else if (nx == columnRslt_ntfy_nm) doRslt_ntfy_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_ver_no) doRslt_ver_no_NX(info);
		else if (nx == columnRslt_skip_chk_ship_flg) doRslt_skip_chk_ship_flg_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_dt) doRslt_aprv_dt_NX(info);
		else if (nx == columnRslt_vld_dt) doRslt_vld_dt_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_base_unit_qty) doRslt_base_unit_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_insp_no) doRslt_insp_no_NX(info);
		else if (nx == columnRslt_insp_typ) doRslt_insp_typ_NX(info);
		else if (nx == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_plnt_aprv_no) doRslt_plnt_aprv_no_NX(info);
		else if (nx == columnRslt_plnt_aprv_prnt_flg) doRslt_plnt_aprv_prnt_flg_NX(info);
		else if (nx == columnRslt_plnt_aprv_prnt_tm) doRslt_plnt_aprv_prnt_tm_NX(info);
		else if (nx == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NX(info);
		else if (nx == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_judg_dt) doRslt_judg_dt_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_comp_itm_insp_typ) doRslt_comp_itm_insp_typ_NX(info);
		else if (nx == columnRslt_comp_itm_insp_typ_nm) doRslt_comp_itm_insp_typ_nm_NX(info);
		else if (nx == columnRslt_comp_itm_quality_typ) doRslt_comp_itm_quality_typ_NX(info);
		else if (nx == columnRslt_comp_itm_quality_typ_nm) doRslt_comp_itm_quality_typ_nm_NX(info);
		else if (nx == columnRslt_comp_itm_mfg_aprv_typ) doRslt_comp_itm_mfg_aprv_typ_NX(info);
		else if (nx == columnRslt_comp_itm_mfg_aprv_typ_nm) doRslt_comp_itm_mfg_aprv_typ_nm_NX(info);
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
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == Btn_aprv_prnt_flg) doBtn_aprv_prnt_flg_NX(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[not_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ntfy_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trace_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trace_disp_flg_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[skip_chk_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_skip_chk_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_tm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[aprv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_aprv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_LC(info);
		else if (lc == Cnd_aprv_dt_to) doCnd_aprv_dt_to_LC(info);
		else if (lc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_LC(info);
		else if (lc == Cnd_upd_ts_to) doCnd_upd_ts_to_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_ntfy_nm) doCnd_ntfy_nm_LC(info);
		else if (lc == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_LC(info);
		else if (lc == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_LC(info);
		else if (lc == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_LC(info);
		else if (lc == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_LC(info);
		else if (lc == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_LC(info);
		else if (lc == Cnd_plnt_aprv_no) doCnd_plnt_aprv_no_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_aprv_dt) doBulkSet_aprv_dt_LC(info);
		else if (lc == columnRslt_ntfy_nm) doRslt_ntfy_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_ver_no) doRslt_ver_no_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_aprv_dt) doRslt_aprv_dt_LC(info);
		else if (lc == columnRslt_vld_dt) doRslt_vld_dt_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_base_unit_qty) doRslt_base_unit_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_insp_no) doRslt_insp_no_LC(info);
		else if (lc == columnRslt_insp_typ) doRslt_insp_typ_LC(info);
		else if (lc == columnRslt_insp_typ_nm) doRslt_insp_typ_nm_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_plnt_aprv_no) doRslt_plnt_aprv_no_LC(info);
		else if (lc == columnRslt_plnt_aprv_prnt_tm) doRslt_plnt_aprv_prnt_tm_LC(info);
		else if (lc == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_LC(info);
		else if (lc == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_judg_dt) doRslt_judg_dt_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_comp_itm_insp_typ) doRslt_comp_itm_insp_typ_LC(info);
		else if (lc == columnRslt_comp_itm_insp_typ_nm) doRslt_comp_itm_insp_typ_nm_LC(info);
		else if (lc == columnRslt_comp_itm_quality_typ) doRslt_comp_itm_quality_typ_LC(info);
		else if (lc == columnRslt_comp_itm_quality_typ_nm) doRslt_comp_itm_quality_typ_nm_LC(info);
		else if (lc == columnRslt_comp_itm_mfg_aprv_typ) doRslt_comp_itm_mfg_aprv_typ_LC(info);
		else if (lc == columnRslt_comp_itm_mfg_aprv_typ_nm) doRslt_comp_itm_mfg_aprv_typ_nm_LC(info);
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
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
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
	 * [Cnd]パネルの[ntfy_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plnt_aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plnt_aprv_no_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[plnt_aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_prnt_tm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_itm_mfg_aprv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_itm_mfg_aprv_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_mfg_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_usr_cd]の作成メソッド
	 */
	public MCList getCnd_aprv_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_aprv_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_aprv_usr_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0080.Srch01")) {
			return new MS_MSBFL0080_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0080.Upd01")) {
			return new MS_MSBFL0080_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0080.Upd02")) {
			return new MS_MSBFL0080_Upd02Bridge();
		}
		if (id.equals("MS.MSBFL0080.Del01")) {
			return new MS_MSBFL0080_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0080.Prnt01")) {
			return new MS_MSBFL0080_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0080_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0080_Srch01Bridge() {
			p_MS_MSBFL0080_Srch01 = new MCParam(PDef.MS_MSBFL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0080.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));

			p_MS_MSBFL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0080_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0080.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0080.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0080_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)p_MS_MSBFL0080_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0080_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0080_Upd01Bridge() {
			p_MS_MSBFL0080_Upd01 = new MCParam(PDef.MS_MSBFL0080_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0080_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
			param.addUpBlock(mcframe.clientMSBF.MSBFP0080.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));

			p_MS_MSBFL0080_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0080_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0080_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0080_Upd01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0080_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0080_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)up(0);
		}
		protected mcframe.clientMSBF.MSBFP0080.BulkSetR up1() {
			return (mcframe.clientMSBF.MSBFP0080.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0080_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0080_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)p_MS_MSBFL0080_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0080_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0080_Upd02;

		/** コンストラクタ */
		protected MS_MSBFL0080_Upd02Bridge() {
			p_MS_MSBFL0080_Upd02 = new MCParam(PDef.MS_MSBFL0080_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0080_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));

			p_MS_MSBFL0080_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0080_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0080_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0080_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0080_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0080_Upd02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0080_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)p_MS_MSBFL0080_Upd02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0080_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0080_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0080_Del01Bridge() {
			p_MS_MSBFL0080_Del01 = new MCParam(PDef.MS_MSBFL0080_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0080_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
			param.addUpBlock(mcframe.clientMSBF.MSBFP0080.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));

			p_MS_MSBFL0080_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0080_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0080_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0080_Del01.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0080_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0080_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)up(0);
		}
		protected mcframe.clientMSBF.MSBFP0080.BulkSetR up1() {
			return (mcframe.clientMSBF.MSBFP0080.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0080_Del01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0080_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)p_MS_MSBFL0080_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0080_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0080_Prnt01;

		/** コンストラクタ */
		protected MS_MSBFL0080_Prnt01Bridge() {
			p_MS_MSBFL0080_Prnt01 = new MCParam(PDef.MS_MSBFL0080_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0080_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));

			p_MS_MSBFL0080_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0080_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0080_Prnt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0080_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0080_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0080.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0080_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0080_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0080.RsltR>)p_MS_MSBFL0080_Prnt01.getContainerParam().getDownBlock(0));
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