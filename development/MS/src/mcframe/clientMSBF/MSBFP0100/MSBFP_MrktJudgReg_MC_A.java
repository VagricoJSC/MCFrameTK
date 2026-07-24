package mcframe.clientMSBF.MSBFP0100;

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
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Srch01Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Srch02Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Imp01Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Upd01Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Upd02Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Del01Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Del02Caller;
import mcframe.clientMSBF.MSBFP0100.MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Prnt01Caller;

/**
 * 画面"MSBFP_MrktJudgReg"パネルクラスです。<p>
 *
 * 一覧形式での市場出荷判定の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_MrktJudgReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBFP0100";

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
	// [JudgStsTyp]ブロック関連のField定義
	public MCPanel JudgStsTypPanel = null;
	public MCTitledBorder JudgStsTypTitledBorder = null;
	// [JudgStsTyp]ブロックの項目のField定義
	// [InputTyp]ブロック関連のField定義
	public MCPanel InputTypPanel = null;
	public MCTitledBorder InputTypTitledBorder = null;
	// [InputTyp]ブロックの項目のField定義
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
	// [PrntFlg]ブロック関連のField定義
	public MCPanel PrntFlgPanel = null;
	public MCTitledBorder PrntFlgTitledBorder = null;
	// [PrntFlg]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,UPD;UPD_JUDG,Decide,UPD_JUDG;DEL,Cancel,DEL;DEL_JUDG,Cancel decision,DEL_JUDG;REF,View,REF;PRNT,Issue record sheet,PRNT UPD,登録・訂正する,UPD;UPD_JUDG,判定する,UPD_JUDG;DEL,取り消す,DEL;DEL_JUDG,判定を取り消す,DEL_JUDG;REF,参照する,REF;PRNT,記録書発行,PRNT.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_UPD_JUDG = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_DEL_JUDG = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	/**
	 * Undecided 未判定.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public MCCheckBox Cnd_acpt_flg = null;
	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_not_acpt_flg = null;
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
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	public MCLabel Cnd_ntfy_nm_Label = null;
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public MCTextField Cnd_ntfy_nm = null;
	public MCLabel Cnd_vld_dt_fr_Label = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_fr = null;
	public MCLabel Cnd_vld_dt_to_Label = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_to = null;
	public MCLabel Cnd_mrkt_judg_no_Label = null;
	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mrkt_judg_no = null;
	public MCLabel Cnd_judg_dt_fr_Label = null;
	/**
	 * Decision date FROM 判定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_judg_dt_fr = null;
	public MCLabel Cnd_judg_dt_to_Label = null;
	/**
	 * Decision date TO 判定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_judg_dt_to = null;
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
	public MCLabel Cnd_judg_usr_cd_Label = null;
	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_judg_usr_cd = null;
	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public MCTextField Cnd_judg_usr_nm = null;
	public MCLabel Cnd_judg_dpt_cd_Label = null;
	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_judg_dpt_cd = null;
	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public MCTextField Cnd_judg_dpt_nm = null;
	/**
	 * Main PIC only 主担当のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_main_flg = null;
	public MCLabel Cnd_mfg_so_aprv_typ_Label = null;
	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_so_aprv_typ = null;
	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_so_aprv_typ_nm = null;
	public MCLabel Cnd_quality_mng_typ_Label = null;
	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public MCTextComboBox Cnd_quality_mng_typ = null;
	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public MCTextField Cnd_quality_mng_typ_nm = null;
	public MCLabel Cnd_mfg_mng_typ_Label = null;
	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_mng_typ = null;
	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_mng_typ_nm = null;
	public MCLabel Cnd_deviant_typ_Label = null;
	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public MCTextComboBox Cnd_deviant_typ = null;
	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public MCTextField Cnd_deviant_typ_nm = null;
	public MCLabel Cnd_deviant_msr_typ_Label = null;
	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public MCTextComboBox Cnd_deviant_msr_typ = null;
	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public MCTextField Cnd_deviant_msr_typ_nm = null;
	public MCLabel Cnd_prod_itm_info_typ_Label = null;
	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public MCTextComboBox Cnd_prod_itm_info_typ = null;
	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public MCTextField Cnd_prod_itm_info_typ_nm = null;
	public MCLabel Cnd_chd_itm_info_typ_Label = null;
	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_info_typ = null;
	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_info_typ_nm = null;
	/**
	 * Not input 未入力.<p>
	 *
	 */
	public MCCheckBox Cnd_not_input_flg = null;
	/**
	 * Input completed 入力済.<p>
	 *
	 */
	public MCCheckBox Cnd_input_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_mrkt_judg_not_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_mrkt_judg_prnt_flg = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Remarks 特記事項.<p>
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
	public MCLabel BulkSet_judg_dt_Label = null;
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDateField BulkSet_judg_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_judg_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_judg_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_judg_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_judg_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_judg_usr_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_judg_usr_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_judg_usr_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_judg_usr_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H BulkSet_judg_rsn_p_PPanel;
	public MCTextComboBox BulkSet_judg_rsn;	// [BulkSet]の[judg_rsn_p.txt]を[BulkSet_judg_rsn]としてエイリアス定義。
	public MCLabel BulkSet_intr_rmrks_Label = null;
	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public MCTextField BulkSet_intr_rmrks = null;
	/**
	 * Column clear 項目クリア.<p>
	 *
	 */
	public MCCheckBox BulkSet_all_clear_flg = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0100.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acpt_flg = null;
	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_acpt_flg = null;
	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_no = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ_nm = null;
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
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_sublot_no]としてエイリアス定義。
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
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt = null;
	/**
	 * Update date 更新日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_mrkt_upd_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_mrkt_upd_usr_cd;// [Rslt]の[mrkt_upd_usr_dpt_p.usr_cd]を[columnRslt_mrkt_upd_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_mrkt_upd_usr_nm;// [Rslt]の[mrkt_upd_usr_dpt_p.usr_nm]を[columnRslt_mrkt_upd_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_mrkt_upd_usr_dpt_cd;// [Rslt]の[mrkt_upd_usr_dpt_p.dpt_cd]を[columnRslt_mrkt_upd_usr_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_mrkt_upd_usr_dpt_nm;// [Rslt]の[mrkt_upd_usr_dpt_p.dpt_nm]を[columnRslt_mrkt_upd_usr_dpt_nm]としてエイリアス定義。
	/**
	 * Main PIC (Decision) 主担当（判定）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_main_flg = null;
	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_prnt_flg = null;
	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_prnt_tm = null;
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_judg_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_judg_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_judg_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_judg_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_judg_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_judg_usr_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_judg_usr_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_judg_usr_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_judg_usr_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D Rslt_judg_rsn_p_PPanel;
	public MCColumnConfig columnRslt_judg_rsn;// [Rslt]の[judg_rsn_p.txt]を[columnRslt_judg_rsn]としてエイリアス定義。
	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_so_aprv_typ = null;
	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_so_aprv_typ_nm = null;
	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_mng_typ = null;
	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_mng_typ_nm = null;
	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_mng_typ = null;
	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_mng_typ_nm = null;
	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_deviant_typ = null;
	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_deviant_typ_nm = null;
	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public MCColumnConfig columnRslt_deviant_msr_typ = null;
	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_deviant_msr_typ_nm = null;
	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prod_itm_info_typ = null;
	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prod_itm_info_typ_nm = null;
	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_info_typ = null;
	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_info_typ_nm = null;
	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Input completed 入力済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_input_flg = null;
	/**
	 * Add 追加.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_flg = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Mfg. list 製造一覧.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1070 = null;
	/**
	 * Inspection result list 検査実績一覧.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0060 = null;
	/**
	 * Lot T (Investigation) ロットＴ（原因調査）.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0120 = null;
	/**
	 * Auto-acquire 自動取得.<p>
	 *
	 */
	public MCButton Btn_auto_sel = null;
	/**
	 * Record sheet 記録書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Allow all 全許可.<p>
	 *
	 */
	public MCButton Btn_select_acpt = null;
	/**
	 * Prohibit All 全禁止.<p>
	 *
	 */
	public MCButton Btn_select_not_acpt = null;
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
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_judg = null;
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_judg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH_UPD_JUDG]モードを表す定数 */
	public static final String SRCH_UPD_JUDG = "SRCH_UPD_JUDG";
	/** [UPD_JUDG]モードを表す定数 */
	public static final String UPD_JUDG = "UPD_JUDG";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH_DEL_JUDG]モードを表す定数 */
	public static final String SRCH_DEL_JUDG = "SRCH_DEL_JUDG";
	/** [DEL_JUDG]モードを表す定数 */
	public static final String DEL_JUDG = "DEL_JUDG";
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
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH_UPD_JUDG, UPD_JUDG, SRCH_DEL, DEL, SRCH_DEL_JUDG, DEL_JUDG, SRCH, REF, SRCH_PRNT, PRNT};
	
	/** [MS_MSBFL0100_Srch01]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Srch01Caller createMS_MSBFL0100_Srch01() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Srch01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Srch01Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Srch01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Srch01Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Srch01]の呼び出し */
	protected void callMS_MSBFL0100_Srch01() {
		MCCaller caller = createMS_MSBFL0100_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0100_Srch02]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Srch02Caller createMS_MSBFL0100_Srch02() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Srch02Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Srch02Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Srch02Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Srch02Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Srch02]の呼び出し */
	protected void callMS_MSBFL0100_Srch02() {
		MCCaller caller = createMS_MSBFL0100_Srch02();
		caller.exec();
	}
	/** [MS_MSBFL0100_Imp01]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Imp01Caller createMS_MSBFL0100_Imp01() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Imp01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Imp01Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Imp01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Imp01Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Imp01]の呼び出し */
	protected void callMS_MSBFL0100_Imp01() {
		MCCaller caller = createMS_MSBFL0100_Imp01();
		caller.exec();
	}
	/** [MS_MSBFL0100_Upd01]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Upd01Caller createMS_MSBFL0100_Upd01() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Upd01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Upd01Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Upd01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Upd01Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Upd01]の呼び出し */
	protected void callMS_MSBFL0100_Upd01() {
		MCCaller caller = createMS_MSBFL0100_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0100_Upd02]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Upd02Caller createMS_MSBFL0100_Upd02() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Upd02Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Upd02Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Upd02Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Upd02Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Upd02]の呼び出し */
	protected void callMS_MSBFL0100_Upd02() {
		MCCaller caller = createMS_MSBFL0100_Upd02();
		caller.exec();
	}
	/** [MS_MSBFL0100_Del01]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Del01Caller createMS_MSBFL0100_Del01() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Del01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Del01Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Del01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Del01Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Del01]の呼び出し */
	protected void callMS_MSBFL0100_Del01() {
		MCCaller caller = createMS_MSBFL0100_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0100_Del02]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Del02Caller createMS_MSBFL0100_Del02() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Del02Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Del02Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Del02Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Del02Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Del02Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Del02]の呼び出し */
	protected void callMS_MSBFL0100_Del02() {
		MCCaller caller = createMS_MSBFL0100_Del02();
		caller.exec();
	}
	/** [MS_MSBFL0100_Prnt01]のCallerの作成 */
	protected MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Prnt01Caller createMS_MSBFL0100_Prnt01() {
		MSBFP_MrktJudgReg_MC.MS_MSBFL0100_Prnt01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Prnt01Bridge>
		caller = ((MSBFP_MrktJudgReg_MC)this).new MS_MSBFL0100_Prnt01Caller<MSBFP_MrktJudgReg, MS_MSBFL0100_Prnt01Bridge>(
					(MSBFP_MrktJudgReg)this, new MS_MSBFL0100_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBFL0100_Prnt01]の呼び出し */
	protected void callMS_MSBFL0100_Prnt01() {
		MCCaller caller = createMS_MSBFL0100_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0100.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0100.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0100.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0100.BtnR aBtnR;
	/** [RsltTyp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR> aRsltTypL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0100.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0100.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBF.MSBFP0100.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0100.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0100.BulkSetR createBulkSetR() {
		return mcframe.clientMSBF.MSBFP0100.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBF.MSBFP0100.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0100.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBF.MSBFP0100.RsltR createRsltR() {
		return mcframe.clientMSBF.MSBFP0100.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0100.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBF.MSBFP0100.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0100.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0100.BtnR createBtnR() {
		return mcframe.clientMSBF.MSBFP0100.BtnR.create();
	}

	/**
	 * コピーによってaRsltTypLを設定します。
	 *
	 * aRsltTypLのインスタンスは変更されません。
	 *
	 * @param dataset RsltTypL
	 */
	public void setRsltTypL(MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR> aList) {
		if (getRsltTypL() != aList) {
			getRsltTypL().setAll(aList);
		}
	}

	/**
	 * [RsltTyp]ブロックのコンテナaRsltTypLを返します。
	 *
	 * @return RsltTypL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR> getRsltTypL() {
		return aRsltTypL;
	}

	/**
	 * aRsltTypRを作成します。
	 *
	 * @return RsltTypR
	 */
	public mcframe.clientMSBF.MSBFP0100.RsltTypR createRsltTypR() {
		return mcframe.clientMSBF.MSBFP0100.RsltTypR.create();
	}

	/**
	 * aRsltTypLを作成します。
	 *
	 * @return RsltTypL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR> createRsltTypL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0100.RsltTypR.class);
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
		if(!MCCollectionUtil.contains(ret, getRsltTypL())) ret.add(getRsltTypL());
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
		if(aCnt == getRsltTypL()) return "RsltTyp";
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
		if(bId.equals("RsltTyp")) return getRsltTypL();
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
		ret.add(JudgStsTypPanel);
		ret.add(InputTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(PrntFlgPanel);
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
	public MSBFP_MrktJudgReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();
		aRsltTypL = createRsltTypL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_MrktJudgReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
		aRsltTypL = createRsltTypL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_MrktJudgReg_MC.jbCreateScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateJudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateInputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateTop((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateFold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateTab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateTab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreatePrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateCnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateCnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateCtrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateRPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateBulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateRslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbCreateEastBtn((MSBFP_MrktJudgReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [JudgStsTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateJudgStsTyp(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [InputTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInputTyp(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [PrntFlg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrntFlg(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_MrktJudgReg p) {
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
	protected static void jbCreateCnd2(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBFP_MrktJudgReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBFP_MrktJudgReg p) {
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_judg_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_judg_usr_cd.addAliasName("BulkSet.judg_usr_cd", p);
		p.BulkSet_judg_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_judg_usr_nm.addAliasName("BulkSet.judg_usr_nm", p);
		p.BulkSet_judg_usr_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_judg_usr_dpt_cd.addAliasName("BulkSet.judg_usr_dpt_cd", p);
		p.BulkSet_judg_usr_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_judg_usr_dpt_nm.addAliasName("BulkSet.judg_usr_dpt_nm", p);
		p.BulkSet_judg_rsn_p_PPanel = mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.create(p.getBulkSetR().judg_rsn_p());
		p.BulkSet_judg_rsn_p_PPanel.setName("BulkSet.judg_rsn_p");
		p.BulkSet_judg_rsn = p.BulkSet_judg_rsn_p_PPanel.Txt_txt;
		p.BulkSet_judg_rsn.addAliasName("BulkSet.judg_rsn", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBFP_MrktJudgReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$itm_p);
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
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$mrkt_upd_usr_dpt_p);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.setName("Rslt.mrkt_upd_usr_dpt_p");
		p.columnRslt_mrkt_upd_usr_cd = p.Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_mrkt_upd_usr_cd.addAliasName("Rslt.mrkt_upd_usr_cd", p);
		p.columnRslt_mrkt_upd_usr_nm = p.Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_mrkt_upd_usr_nm.addAliasName("Rslt.mrkt_upd_usr_nm", p);
		p.columnRslt_mrkt_upd_usr_dpt_cd = p.Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_mrkt_upd_usr_dpt_cd.addAliasName("Rslt.mrkt_upd_usr_dpt_cd", p);
		p.columnRslt_mrkt_upd_usr_dpt_nm = p.Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_mrkt_upd_usr_dpt_nm.addAliasName("Rslt.mrkt_upd_usr_dpt_nm", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_judg_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_judg_usr_cd.addAliasName("Rslt.judg_usr_cd", p);
		p.columnRslt_judg_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_judg_usr_nm.addAliasName("Rslt.judg_usr_nm", p);
		p.columnRslt_judg_usr_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_judg_usr_dpt_cd.addAliasName("Rslt.judg_usr_dpt_cd", p);
		p.columnRslt_judg_usr_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_judg_usr_dpt_nm.addAliasName("Rslt.judg_usr_dpt_nm", p);
		p.Rslt_judg_rsn_p_PPanel = mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$judg_rsn_p);
		p.Rslt_judg_rsn_p_PPanel.setName("Rslt.judg_rsn_p");
		p.columnRslt_judg_rsn = p.Rslt_judg_rsn_p_PPanel.columnTxt_txt;
		p.columnRslt_judg_rsn.addAliasName("Rslt.judg_rsn", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBF.MSBFP0100.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_MrktJudgReg p) {
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
	
	
	/** [Cnd_judg_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_judg_usr_cd_p = null;

	/**
	 * [Cnd_judg_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_judg_usr_cd_ListPutter() {
		if (Cnd_judg_usr_cd_p == null) {
			Cnd_judg_usr_cd_p = createCnd_judg_usr_cd_ListPutter(Cnd_judg_usr_cd, "judg_usr_cd", "judg_usr_nm");

		}
		return Cnd_judg_usr_cd_p;
	}
	
	
	/** [Cnd_judg_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_judg_dpt_cd_p = null;

	/**
	 * [Cnd_judg_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_judg_dpt_cd_ListPutter() {
		if (Cnd_judg_dpt_cd_p == null) {
			Cnd_judg_dpt_cd_p = createCnd_judg_dpt_cd_ListPutter(Cnd_judg_dpt_cd, "judg_dpt_cd", "judg_dpt_nm");

		}
		return Cnd_judg_dpt_cd_p;
	}
	
	
	/** [Cnd_mfg_so_aprv_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_so_aprv_typ_p = null;

	/**
	 * [Cnd_mfg_so_aprv_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_so_aprv_typ_ListPutter() {
		if (Cnd_mfg_so_aprv_typ_p == null) {
			Cnd_mfg_so_aprv_typ_p = createCnd_mfg_so_aprv_typ_ListPutter(Cnd_mfg_so_aprv_typ, "mfg_so_aprv_typ", "mfg_so_aprv_typ_nm");

		}
		return Cnd_mfg_so_aprv_typ_p;
	}
	
	
	/** [Cnd_quality_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_quality_mng_typ_p = null;

	/**
	 * [Cnd_quality_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_quality_mng_typ_ListPutter() {
		if (Cnd_quality_mng_typ_p == null) {
			Cnd_quality_mng_typ_p = createCnd_quality_mng_typ_ListPutter(Cnd_quality_mng_typ, "quality_mng_typ", "quality_mng_typ_nm");

		}
		return Cnd_quality_mng_typ_p;
	}
	
	
	/** [Cnd_mfg_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_mng_typ_p = null;

	/**
	 * [Cnd_mfg_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_mng_typ_ListPutter() {
		if (Cnd_mfg_mng_typ_p == null) {
			Cnd_mfg_mng_typ_p = createCnd_mfg_mng_typ_ListPutter(Cnd_mfg_mng_typ, "mfg_mng_typ", "mfg_mng_typ_nm");

		}
		return Cnd_mfg_mng_typ_p;
	}
	
	
	/** [Cnd_deviant_typ_ListPutter]の定義 */
	private MCListPutter Cnd_deviant_typ_p = null;

	/**
	 * [Cnd_deviant_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_deviant_typ_ListPutter() {
		if (Cnd_deviant_typ_p == null) {
			Cnd_deviant_typ_p = createCnd_deviant_typ_ListPutter(Cnd_deviant_typ, "deviant_typ", "deviant_typ_nm");

		}
		return Cnd_deviant_typ_p;
	}
	
	
	/** [Cnd_deviant_msr_typ_ListPutter]の定義 */
	private MCListPutter Cnd_deviant_msr_typ_p = null;

	/**
	 * [Cnd_deviant_msr_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_deviant_msr_typ_ListPutter() {
		if (Cnd_deviant_msr_typ_p == null) {
			Cnd_deviant_msr_typ_p = createCnd_deviant_msr_typ_ListPutter(Cnd_deviant_msr_typ, "deviant_msr_typ", "deviant_msr_typ_nm");

		}
		return Cnd_deviant_msr_typ_p;
	}
	
	
	/** [Cnd_prod_itm_info_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prod_itm_info_typ_p = null;

	/**
	 * [Cnd_prod_itm_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prod_itm_info_typ_ListPutter() {
		if (Cnd_prod_itm_info_typ_p == null) {
			Cnd_prod_itm_info_typ_p = createCnd_prod_itm_info_typ_ListPutter(Cnd_prod_itm_info_typ, "prod_itm_info_typ", "prod_itm_info_typ_nm");

		}
		return Cnd_prod_itm_info_typ_p;
	}
	
	
	/** [Cnd_chd_itm_info_typ_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_info_typ_p = null;

	/**
	 * [Cnd_chd_itm_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_info_typ_ListPutter() {
		if (Cnd_chd_itm_info_typ_p == null) {
			Cnd_chd_itm_info_typ_p = createCnd_chd_itm_info_typ_ListPutter(Cnd_chd_itm_info_typ, "chd_itm_info_typ", "chd_itm_info_typ_nm");

		}
		return Cnd_chd_itm_info_typ_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "judg_usr_dpt_cd", "judg_usr_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","base_unit_cd","base_unit_nm","base_unit_dec_place","lot_mng_typ","sublot_mng_typ");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","base_unit_cd","base_unit_nm","base_unit_dec_place","lot_mng_typ","sublot_mng_typ");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","base_unit_cd","base_unit_nm","base_unit_dec_place","lot_mng_typ","sublot_mng_typ");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","lot_mng_typ","sublot_mng_typ");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_site_cd_ListPutter]の定義 */
	private MCListPutter Rslt_site_cd_p = null;

	/**
	 * [Rslt_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_site_cd_ListPutter() {
		if (Rslt_site_cd_p == null) {
			Rslt_site_cd_p = createRslt_site_cd_ListPutter(columnRslt_site_cd, "site_cd", "site_nm");

		}
		return Rslt_site_cd_p;
	}
	
	
	/** [Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "mrkt_upd_usr_dpt_cd", "mrkt_upd_usr_dpt_nm");
		}
		return Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "judg_usr_dpt_cd", "judg_usr_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_mfg_so_aprv_typ_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_so_aprv_typ_p = null;

	/**
	 * [Rslt_mfg_so_aprv_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_so_aprv_typ_ListPutter() {
		if (Rslt_mfg_so_aprv_typ_p == null) {
			Rslt_mfg_so_aprv_typ_p = createRslt_mfg_so_aprv_typ_ListPutter(columnRslt_mfg_so_aprv_typ, "mfg_so_aprv_typ", "mfg_so_aprv_typ_nm");

		}
		return Rslt_mfg_so_aprv_typ_p;
	}
	
	
	/** [Rslt_quality_mng_typ_ListPutter]の定義 */
	private MCListPutter Rslt_quality_mng_typ_p = null;

	/**
	 * [Rslt_quality_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_quality_mng_typ_ListPutter() {
		if (Rslt_quality_mng_typ_p == null) {
			Rslt_quality_mng_typ_p = createRslt_quality_mng_typ_ListPutter(columnRslt_quality_mng_typ, "quality_mng_typ", "quality_mng_typ_nm");

		}
		return Rslt_quality_mng_typ_p;
	}
	
	
	/** [Rslt_mfg_mng_typ_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_mng_typ_p = null;

	/**
	 * [Rslt_mfg_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_mng_typ_ListPutter() {
		if (Rslt_mfg_mng_typ_p == null) {
			Rslt_mfg_mng_typ_p = createRslt_mfg_mng_typ_ListPutter(columnRslt_mfg_mng_typ, "mfg_mng_typ", "mfg_mng_typ_nm");

		}
		return Rslt_mfg_mng_typ_p;
	}
	
	
	/** [Rslt_deviant_typ_ListPutter]の定義 */
	private MCListPutter Rslt_deviant_typ_p = null;

	/**
	 * [Rslt_deviant_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_deviant_typ_ListPutter() {
		if (Rslt_deviant_typ_p == null) {
			Rslt_deviant_typ_p = createRslt_deviant_typ_ListPutter(columnRslt_deviant_typ, "deviant_typ", "deviant_typ_nm");

		}
		return Rslt_deviant_typ_p;
	}
	
	
	/** [Rslt_deviant_msr_typ_ListPutter]の定義 */
	private MCListPutter Rslt_deviant_msr_typ_p = null;

	/**
	 * [Rslt_deviant_msr_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_deviant_msr_typ_ListPutter() {
		if (Rslt_deviant_msr_typ_p == null) {
			Rslt_deviant_msr_typ_p = createRslt_deviant_msr_typ_ListPutter(columnRslt_deviant_msr_typ, "deviant_msr_typ", "deviant_msr_typ_nm");

		}
		return Rslt_deviant_msr_typ_p;
	}
	
	
	/** [Rslt_prod_itm_info_typ_ListPutter]の定義 */
	private MCListPutter Rslt_prod_itm_info_typ_p = null;

	/**
	 * [Rslt_prod_itm_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_prod_itm_info_typ_ListPutter() {
		if (Rslt_prod_itm_info_typ_p == null) {
			Rslt_prod_itm_info_typ_p = createRslt_prod_itm_info_typ_ListPutter(columnRslt_prod_itm_info_typ, "prod_itm_info_typ", "prod_itm_info_typ_nm");

		}
		return Rslt_prod_itm_info_typ_p;
	}
	
	
	/** [Rslt_chd_itm_info_typ_ListPutter]の定義 */
	private MCListPutter Rslt_chd_itm_info_typ_p = null;

	/**
	 * [Rslt_chd_itm_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_chd_itm_info_typ_ListPutter() {
		if (Rslt_chd_itm_info_typ_p == null) {
			Rslt_chd_itm_info_typ_p = createRslt_chd_itm_info_typ_ListPutter(columnRslt_chd_itm_info_typ, "chd_itm_info_typ", "chd_itm_info_typ_nm");

		}
		return Rslt_chd_itm_info_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_MrktJudgReg create(){
		MSBFP_MrktJudgReg p = new MSBFP_MrktJudgReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_MrktJudgReg create(String name){
		MSBFP_MrktJudgReg p = new MSBFP_MrktJudgReg(name);
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
		MSBFP_MrktJudgReg_MC.jbfInitScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitJudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitInputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitTop((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitFold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitTab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitTab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitPrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitCnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitCnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitCtrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitRPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitBulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitRslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbfInitEastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitJudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitInputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitTop((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitFold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitTab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitTab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitPrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitCnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitCnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitCtrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitRPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitBulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitRslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.jbInitEastBtn((MSBFP_MrktJudgReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [JudgStsTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitJudgStsTyp(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.JudgStsTypPanel = p.beansFactory.createPanel("JudgStsTyp");
		p.JudgStsTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [InputTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInputTyp(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.InputTypPanel = p.beansFactory.createPanel("InputTyp");
		p.InputTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBFP_MrktJudgReg p) {
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
	protected static void jbfInitTab1(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [PrntFlg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrntFlg(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.PrntFlgPanel = p.beansFactory.createPanel("PrntFlg");
		p.PrntFlgTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_UPD_JUDG = p.beansFactory.createRadioButton("Cnd.ope_UPD_JUDG");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_DEL_JUDG = p.beansFactory.createRadioButton("Cnd.ope_DEL_JUDG");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_acpt_flg = p.beansFactory.createCheckBox("Cnd.acpt_flg");
		p.Cnd_not_acpt_flg = p.beansFactory.createCheckBox("Cnd.not_acpt_flg");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_ntfy_nm_Label = p.beansFactory.createLabel("Cnd.ntfy_nm_Label");
		p.Cnd_ntfy_nm = p.beansFactory.createTextField("Cnd.ntfy_nm");
		p.Cnd_ntfy_nm.setLabel(p.Cnd_ntfy_nm_Label);
		p.Cnd_vld_dt_fr_Label = p.beansFactory.createLabel("Cnd.vld_dt_fr_Label");
		p.Cnd_vld_dt_fr = p.beansFactory.createDateField("Cnd.vld_dt_fr");
		p.Cnd_vld_dt_fr.setLabel(p.Cnd_vld_dt_fr_Label);
		p.Cnd_vld_dt_to_Label = p.beansFactory.createLabel("Cnd.vld_dt_to_Label");
		p.Cnd_vld_dt_to = p.beansFactory.createDateField("Cnd.vld_dt_to");
		p.Cnd_vld_dt_to.setLabel(p.Cnd_vld_dt_to_Label);
		p.Cnd_mrkt_judg_no_Label = p.beansFactory.createLabel("Cnd.mrkt_judg_no_Label");
		p.Cnd_mrkt_judg_no = p.beansFactory.createTextField("Cnd.mrkt_judg_no");
		p.Cnd_mrkt_judg_no.setLabel(p.Cnd_mrkt_judg_no_Label);
		p.Cnd_judg_dt_fr_Label = p.beansFactory.createLabel("Cnd.judg_dt_fr_Label");
		p.Cnd_judg_dt_fr = p.beansFactory.createDateField("Cnd.judg_dt_fr");
		p.Cnd_judg_dt_fr.setLabel(p.Cnd_judg_dt_fr_Label);
		p.Cnd_judg_dt_to_Label = p.beansFactory.createLabel("Cnd.judg_dt_to_Label");
		p.Cnd_judg_dt_to = p.beansFactory.createDateField("Cnd.judg_dt_to");
		p.Cnd_judg_dt_to.setLabel(p.Cnd_judg_dt_to_Label);
		p.Cnd_upd_ts_fr_Label = p.beansFactory.createLabel("Cnd.upd_ts_fr_Label");
		p.Cnd_upd_ts_fr = p.beansFactory.createTimestampField("Cnd.upd_ts_fr");
		p.Cnd_upd_ts_fr.setLabel(p.Cnd_upd_ts_fr_Label);
		p.Cnd_upd_ts_to_Label = p.beansFactory.createLabel("Cnd.upd_ts_to_Label");
		p.Cnd_upd_ts_to = p.beansFactory.createTimestampField("Cnd.upd_ts_to");
		p.Cnd_upd_ts_to.setLabel(p.Cnd_upd_ts_to_Label);
		p.Cnd_judg_usr_cd_Label = p.beansFactory.createLabel("Cnd.judg_usr_cd_Label");
		p.Cnd_judg_usr_cd = p.beansFactory.createTextField("Cnd.judg_usr_cd");
		p.Cnd_judg_usr_cd.setLabel(p.Cnd_judg_usr_cd_Label);
		p.Cnd_judg_usr_nm = p.beansFactory.createTextField("Cnd.judg_usr_nm");
		p.Cnd_judg_dpt_cd_Label = p.beansFactory.createLabel("Cnd.judg_dpt_cd_Label");
		p.Cnd_judg_dpt_cd = p.beansFactory.createTextField("Cnd.judg_dpt_cd");
		p.Cnd_judg_dpt_cd.setLabel(p.Cnd_judg_dpt_cd_Label);
		p.Cnd_judg_dpt_nm = p.beansFactory.createTextField("Cnd.judg_dpt_nm");
		p.Cnd_main_flg = p.beansFactory.createCheckBox("Cnd.main_flg");
		p.Cnd_mfg_so_aprv_typ_Label = p.beansFactory.createLabel("Cnd.mfg_so_aprv_typ_Label");
		p.Cnd_mfg_so_aprv_typ = p.beansFactory.createTextComboBox("Cnd.mfg_so_aprv_typ");
		p.Cnd_mfg_so_aprv_typ.setLabel(p.Cnd_mfg_so_aprv_typ_Label);
		p.Cnd_mfg_so_aprv_typ_nm = p.beansFactory.createTextField("Cnd.mfg_so_aprv_typ_nm");
		p.Cnd_quality_mng_typ_Label = p.beansFactory.createLabel("Cnd.quality_mng_typ_Label");
		p.Cnd_quality_mng_typ = p.beansFactory.createTextComboBox("Cnd.quality_mng_typ");
		p.Cnd_quality_mng_typ.setLabel(p.Cnd_quality_mng_typ_Label);
		p.Cnd_quality_mng_typ_nm = p.beansFactory.createTextField("Cnd.quality_mng_typ_nm");
		p.Cnd_mfg_mng_typ_Label = p.beansFactory.createLabel("Cnd.mfg_mng_typ_Label");
		p.Cnd_mfg_mng_typ = p.beansFactory.createTextComboBox("Cnd.mfg_mng_typ");
		p.Cnd_mfg_mng_typ.setLabel(p.Cnd_mfg_mng_typ_Label);
		p.Cnd_mfg_mng_typ_nm = p.beansFactory.createTextField("Cnd.mfg_mng_typ_nm");
		p.Cnd_deviant_typ_Label = p.beansFactory.createLabel("Cnd.deviant_typ_Label");
		p.Cnd_deviant_typ = p.beansFactory.createTextComboBox("Cnd.deviant_typ");
		p.Cnd_deviant_typ.setLabel(p.Cnd_deviant_typ_Label);
		p.Cnd_deviant_typ_nm = p.beansFactory.createTextField("Cnd.deviant_typ_nm");
		p.Cnd_deviant_msr_typ_Label = p.beansFactory.createLabel("Cnd.deviant_msr_typ_Label");
		p.Cnd_deviant_msr_typ = p.beansFactory.createTextComboBox("Cnd.deviant_msr_typ");
		p.Cnd_deviant_msr_typ.setLabel(p.Cnd_deviant_msr_typ_Label);
		p.Cnd_deviant_msr_typ_nm = p.beansFactory.createTextField("Cnd.deviant_msr_typ_nm");
		p.Cnd_prod_itm_info_typ_Label = p.beansFactory.createLabel("Cnd.prod_itm_info_typ_Label");
		p.Cnd_prod_itm_info_typ = p.beansFactory.createTextComboBox("Cnd.prod_itm_info_typ");
		p.Cnd_prod_itm_info_typ.setLabel(p.Cnd_prod_itm_info_typ_Label);
		p.Cnd_prod_itm_info_typ_nm = p.beansFactory.createTextField("Cnd.prod_itm_info_typ_nm");
		p.Cnd_chd_itm_info_typ_Label = p.beansFactory.createLabel("Cnd.chd_itm_info_typ_Label");
		p.Cnd_chd_itm_info_typ = p.beansFactory.createTextComboBox("Cnd.chd_itm_info_typ");
		p.Cnd_chd_itm_info_typ.setLabel(p.Cnd_chd_itm_info_typ_Label);
		p.Cnd_chd_itm_info_typ_nm = p.beansFactory.createTextField("Cnd.chd_itm_info_typ_nm");
		p.Cnd_not_input_flg = p.beansFactory.createCheckBox("Cnd.not_input_flg");
		p.Cnd_input_flg = p.beansFactory.createCheckBox("Cnd.input_flg");
		p.Cnd_mrkt_judg_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.mrkt_judg_not_prnt_flg");
		p.Cnd_mrkt_judg_prnt_flg = p.beansFactory.createCheckBox("Cnd.mrkt_judg_prnt_flg");
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
	protected static void jbfInitCnd2(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_judg_dt_Label = p.beansFactory.createLabel("BulkSet.judg_dt_Label");
		p.BulkSet_judg_dt = p.beansFactory.createDateField("BulkSet.judg_dt");
		p.BulkSet_judg_dt.setLabel(p.BulkSet_judg_dt_Label);
		p.BulkSet_intr_rmrks_Label = p.beansFactory.createLabel("BulkSet.intr_rmrks_Label");
		p.BulkSet_intr_rmrks = p.beansFactory.createTextField("BulkSet.intr_rmrks");
		p.BulkSet_intr_rmrks.setLabel(p.BulkSet_intr_rmrks_Label);
		p.BulkSet_all_clear_flg = p.beansFactory.createCheckBox("BulkSet.all_clear_flg");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_acpt_flg = p.beansFactory.createTableColumn("Rslt.acpt_flg", MCColumnType.CHECK);
		p.columnRslt_not_acpt_flg = p.beansFactory.createTableColumn("Rslt.not_acpt_flg", MCColumnType.CHECK);
		p.columnRslt_mrkt_judg_no = p.beansFactory.createTableColumn("Rslt.mrkt_judg_no", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ntfy_nm = p.beansFactory.createTableColumn("Rslt.ntfy_nm", MCColumnType.TEXT);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_vld_dt = p.beansFactory.createTableColumn("Rslt.vld_dt", MCColumnType.DATE);
		p.columnRslt_upd_dt = p.beansFactory.createTableColumn("Rslt.upd_dt", MCColumnType.DATE);
		p.columnRslt_main_flg = p.beansFactory.createTableColumn("Rslt.main_flg", MCColumnType.CHECK);
		p.columnRslt_mrkt_judg_prnt_flg = p.beansFactory.createTableColumn("Rslt.mrkt_judg_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_mrkt_judg_prnt_tm = p.beansFactory.createTableColumn("Rslt.mrkt_judg_prnt_tm", MCColumnType.DATE);
		p.columnRslt_judg_dt = p.beansFactory.createTableColumn("Rslt.judg_dt", MCColumnType.DATE);
		p.columnRslt_mfg_so_aprv_typ = p.beansFactory.createTableColumn("Rslt.mfg_so_aprv_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_mfg_so_aprv_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_so_aprv_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_mng_typ = p.beansFactory.createTableColumn("Rslt.quality_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_quality_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_mng_typ = p.beansFactory.createTableColumn("Rslt.mfg_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_mfg_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_deviant_typ = p.beansFactory.createTableColumn("Rslt.deviant_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_deviant_typ_nm = p.beansFactory.createTableColumn("Rslt.deviant_typ_nm", MCColumnType.TEXT);
		p.columnRslt_deviant_msr_typ = p.beansFactory.createTableColumn("Rslt.deviant_msr_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_deviant_msr_typ_nm = p.beansFactory.createTableColumn("Rslt.deviant_msr_typ_nm", MCColumnType.TEXT);
		p.columnRslt_prod_itm_info_typ = p.beansFactory.createTableColumn("Rslt.prod_itm_info_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_prod_itm_info_typ_nm = p.beansFactory.createTableColumn("Rslt.prod_itm_info_typ_nm", MCColumnType.TEXT);
		p.columnRslt_chd_itm_info_typ = p.beansFactory.createTableColumn("Rslt.chd_itm_info_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_chd_itm_info_typ_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_info_typ_nm", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_input_flg = p.beansFactory.createTableColumn("Rslt.input_flg", MCColumnType.CHECK);
		p.columnRslt_add_flg = p.beansFactory.createTableColumn("Rslt.add_flg", MCColumnType.CHECK);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1070 = p.beansFactory.createButton("Btn.open_MSBCP1070", "open");
		p.Btn_open_MSBFP0060 = p.beansFactory.createButton("Btn.open_MSBFP0060", "open");
		p.Btn_open_MSBFP0120 = p.beansFactory.createButton("Btn.open_MSBFP0120", "open");
		p.Btn_auto_sel = p.beansFactory.createButton("Btn.auto_sel");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_acpt = p.beansFactory.createButton("Btn.select_acpt");
		p.Btn_select_not_acpt = p.beansFactory.createButton("Btn.select_not_acpt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_judg = p.beansFactory.createButton("Btn.upd_judg", "upd");
		p.Btn_prnt_flg = p.beansFactory.createCheckBox("Btn.prnt_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_del_judg = p.beansFactory.createButton("Btn.del_judg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.JudgStsTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [JudgStsTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitJudgStsTyp(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.JudgStsTypPanel.setBorder(p.JudgStsTypTitledBorder);
		p.add(p.JudgStsTypPanel);
		p.JudgStsTypPanel.setNextBeans(p.InputTypPanel);
		p.JudgStsTypPanel.setValueCheck(false);
		p.JudgStsTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.JudgStsTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [InputTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInputTyp(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.InputTypPanel.setBorder(p.InputTypTitledBorder);
		p.add(p.InputTypPanel);
		p.InputTypPanel.setNextBeans(p.TopPanel);
		p.InputTypPanel.setValueCheck(false);
		p.InputTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InputTypPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBFP_MrktJudgReg p) {
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
	protected static void jbInitFold(MSBFP_MrktJudgReg p) {
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
	protected static void jbInitTab1(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.PrntFlgPanel);
		p.Tab1Panel.add(p.PrntFlgPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [PrntFlg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrntFlg(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.PrntFlgPanel.setBorder(p.PrntFlgTitledBorder);
		p.PrntFlgPanel.setValueCheck(false);
		p.PrntFlgPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrntFlgPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_MrktJudgReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_UPD_JUDG);
		p.Cnd_ope_UPD_JUDG.setActionCommand("UPD_JUDG");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_JUDG);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_JUDG);
		p.Cnd_ope_UPD_JUDG.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("DEL");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_DEL_JUDG);
		p.Cnd_ope_DEL_JUDG.setActionCommand("DEL_JUDG");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_JUDG);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_JUDG);
		p.Cnd_ope_DEL_JUDG.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("PRNT");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.ope_META);
		p.JudgStsTypPanel.add(p.Cnd_opn_flg);
		p.JudgStsTypPanel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_acpt_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.opn_flg_META);
		p.JudgStsTypPanel.add(p.Cnd_acpt_flg);
		p.Cnd_acpt_flg.setNextBeans(p.Cnd_not_acpt_flg);
		p.Cnd_acpt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.acpt_flg_META);
		p.JudgStsTypPanel.add(p.Cnd_not_acpt_flg);
		p.Cnd_not_acpt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.not_acpt_flg_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
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
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_ntfy_nm);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_ntfy_nm_Label);
		p.CndPanel.add(p.Cnd_ntfy_nm);
		p.Cnd_ntfy_nm.setNextBeans(p.Cnd_vld_dt_fr);
		p.Cnd_ntfy_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.ntfy_nm_META);
		p.setPluralValueEnable(p.Cnd_ntfy_nm, true);
		p.CndPanel.add(p.Cnd_vld_dt_fr_Label);
		p.CndPanel.add(p.Cnd_vld_dt_fr);
		p.Cnd_vld_dt_fr.setNextBeans(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.vld_dt_fr_META);
		p.Cnd_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_vld_dt_to_Label);
		p.CndPanel.add(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_to.setNextBeans(p.Cnd_mrkt_judg_no);
		p.Cnd_vld_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.vld_dt_to_META);
		p.Cnd_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mrkt_judg_no_Label);
		p.CndPanel.add(p.Cnd_mrkt_judg_no);
		p.Cnd_mrkt_judg_no.setNextBeans(p.Cnd_judg_dt_fr);
		p.Cnd_mrkt_judg_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mrkt_judg_no_META);
		p.setPluralValueEnable(p.Cnd_mrkt_judg_no, true);
		p.CndPanel.add(p.Cnd_judg_dt_fr_Label);
		p.CndPanel.add(p.Cnd_judg_dt_fr);
		p.Cnd_judg_dt_fr.setNextBeans(p.Cnd_judg_dt_to);
		p.Cnd_judg_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.judg_dt_fr_META);
		p.Cnd_judg_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_judg_dt_to_Label);
		p.CndPanel.add(p.Cnd_judg_dt_to);
		p.Cnd_judg_dt_to.setNextBeans(p.Cnd_upd_ts_fr);
		p.Cnd_judg_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.judg_dt_to_META);
		p.Cnd_judg_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_fr_Label);
		p.CndPanel.add(p.Cnd_upd_ts_fr);
		p.Cnd_upd_ts_fr.setNextBeans(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.upd_ts_fr_META);
		p.Cnd_upd_ts_fr.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_to_Label);
		p.CndPanel.add(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_to.setNextBeans(p.Cnd_judg_usr_cd);
		p.Cnd_upd_ts_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.upd_ts_to_META);
		p.Cnd_upd_ts_to.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_judg_usr_cd_Label);
		p.CndPanel.add(p.Cnd_judg_usr_cd);
		p.Cnd_judg_usr_cd.setNextBeans(p.Cnd_judg_usr_nm);
		p.Cnd_judg_usr_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.judg_usr_cd_META);
		p.Cnd_judg_usr_cd.addLinkBeans(p.Cnd_judg_usr_nm);
		p.Cnd_judg_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_judg_usr_cd, true);
		p.CndPanel.add(p.Cnd_judg_usr_nm);
		p.Cnd_judg_usr_nm.setNextBeans(p.Cnd_judg_dpt_cd);
		p.Cnd_judg_usr_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.judg_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_judg_usr_nm, true);
		p.CndPanel.add(p.Cnd_judg_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_judg_dpt_cd);
		p.Cnd_judg_dpt_cd.setNextBeans(p.Cnd_judg_dpt_nm);
		p.Cnd_judg_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.judg_dpt_cd_META);
		p.Cnd_judg_dpt_cd.addLinkBeans(p.Cnd_judg_dpt_nm);
		p.Cnd_judg_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_judg_dpt_cd, true);
		p.CndPanel.add(p.Cnd_judg_dpt_nm);
		p.Cnd_judg_dpt_nm.setNextBeans(p.Cnd_main_flg);
		p.Cnd_judg_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.judg_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_judg_dpt_nm, true);
		p.CndPanel.add(p.Cnd_main_flg);
		p.Cnd_main_flg.setNextBeans(p.Cnd_mfg_so_aprv_typ);
		p.Cnd_main_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.main_flg_META);
		p.Cnd_mfg_so_aprv_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_so_aprv_typ, true);
		p.Cnd_mfg_so_aprv_typ.setLinkBeans(p.Cnd_mfg_so_aprv_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_so_aprv_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_so_aprv_typ);
		p.Cnd_mfg_so_aprv_typ.setNextBeans(p.Cnd_mfg_so_aprv_typ_nm);
		p.Cnd_mfg_so_aprv_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mfg_so_aprv_typ_META);
		p.CndPanel.add(p.Cnd_mfg_so_aprv_typ_nm);
		p.Cnd_mfg_so_aprv_typ_nm.setNextBeans(p.Cnd_quality_mng_typ);
		p.Cnd_mfg_so_aprv_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mfg_so_aprv_typ_nm_META);
		p.Cnd_quality_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_mng_typ, true);
		p.Cnd_quality_mng_typ.setLinkBeans(p.Cnd_quality_mng_typ_nm);
		p.CndPanel.add(p.Cnd_quality_mng_typ_Label);
		p.CndPanel.add(p.Cnd_quality_mng_typ);
		p.Cnd_quality_mng_typ.setNextBeans(p.Cnd_quality_mng_typ_nm);
		p.Cnd_quality_mng_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.quality_mng_typ_META);
		p.CndPanel.add(p.Cnd_quality_mng_typ_nm);
		p.Cnd_quality_mng_typ_nm.setNextBeans(p.Cnd_mfg_mng_typ);
		p.Cnd_quality_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.quality_mng_typ_nm_META);
		p.Cnd_mfg_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_mng_typ, true);
		p.Cnd_mfg_mng_typ.setLinkBeans(p.Cnd_mfg_mng_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_mng_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_mng_typ);
		p.Cnd_mfg_mng_typ.setNextBeans(p.Cnd_mfg_mng_typ_nm);
		p.Cnd_mfg_mng_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mfg_mng_typ_META);
		p.CndPanel.add(p.Cnd_mfg_mng_typ_nm);
		p.Cnd_mfg_mng_typ_nm.setNextBeans(p.Cnd_deviant_typ);
		p.Cnd_mfg_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mfg_mng_typ_nm_META);
		p.Cnd_deviant_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_deviant_typ, true);
		p.Cnd_deviant_typ.setLinkBeans(p.Cnd_deviant_typ_nm);
		p.CndPanel.add(p.Cnd_deviant_typ_Label);
		p.CndPanel.add(p.Cnd_deviant_typ);
		p.Cnd_deviant_typ.setNextBeans(p.Cnd_deviant_typ_nm);
		p.Cnd_deviant_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.deviant_typ_META);
		p.CndPanel.add(p.Cnd_deviant_typ_nm);
		p.Cnd_deviant_typ_nm.setNextBeans(p.Cnd_deviant_msr_typ);
		p.Cnd_deviant_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.deviant_typ_nm_META);
		p.Cnd_deviant_msr_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_deviant_msr_typ, true);
		p.Cnd_deviant_msr_typ.setLinkBeans(p.Cnd_deviant_msr_typ_nm);
		p.CndPanel.add(p.Cnd_deviant_msr_typ_Label);
		p.CndPanel.add(p.Cnd_deviant_msr_typ);
		p.Cnd_deviant_msr_typ.setNextBeans(p.Cnd_deviant_msr_typ_nm);
		p.Cnd_deviant_msr_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.deviant_msr_typ_META);
		p.CndPanel.add(p.Cnd_deviant_msr_typ_nm);
		p.Cnd_deviant_msr_typ_nm.setNextBeans(p.Cnd_prod_itm_info_typ);
		p.Cnd_deviant_msr_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.deviant_msr_typ_nm_META);
		p.Cnd_prod_itm_info_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prod_itm_info_typ, true);
		p.Cnd_prod_itm_info_typ.setLinkBeans(p.Cnd_prod_itm_info_typ_nm);
		p.CndPanel.add(p.Cnd_prod_itm_info_typ_Label);
		p.CndPanel.add(p.Cnd_prod_itm_info_typ);
		p.Cnd_prod_itm_info_typ.setNextBeans(p.Cnd_prod_itm_info_typ_nm);
		p.Cnd_prod_itm_info_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.prod_itm_info_typ_META);
		p.CndPanel.add(p.Cnd_prod_itm_info_typ_nm);
		p.Cnd_prod_itm_info_typ_nm.setNextBeans(p.Cnd_chd_itm_info_typ);
		p.Cnd_prod_itm_info_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.prod_itm_info_typ_nm_META);
		p.Cnd_chd_itm_info_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_info_typ, true);
		p.Cnd_chd_itm_info_typ.setLinkBeans(p.Cnd_chd_itm_info_typ_nm);
		p.CndPanel.add(p.Cnd_chd_itm_info_typ_Label);
		p.CndPanel.add(p.Cnd_chd_itm_info_typ);
		p.Cnd_chd_itm_info_typ.setNextBeans(p.Cnd_chd_itm_info_typ_nm);
		p.Cnd_chd_itm_info_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.chd_itm_info_typ_META);
		p.CndPanel.add(p.Cnd_chd_itm_info_typ_nm);
		p.Cnd_chd_itm_info_typ_nm.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_chd_itm_info_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.chd_itm_info_typ_nm_META);
		p.InputTypPanel.add(p.Cnd_not_input_flg);
		p.InputTypPanel.setLastBeans(p.Cnd_not_input_flg);
		p.Cnd_not_input_flg.setNextBeans(p.Cnd_input_flg);
		p.Cnd_not_input_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.not_input_flg_META);
		p.InputTypPanel.add(p.Cnd_input_flg);
		p.Cnd_input_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.input_flg_META);
		p.PrntFlgPanel.add(p.Cnd_mrkt_judg_not_prnt_flg);
		p.PrntFlgPanel.setLastBeans(p.Cnd_mrkt_judg_not_prnt_flg);
		p.Cnd_mrkt_judg_not_prnt_flg.setNextBeans(p.Cnd_mrkt_judg_prnt_flg);
		p.Cnd_mrkt_judg_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mrkt_judg_not_prnt_flg_META);
		p.PrntFlgPanel.add(p.Cnd_mrkt_judg_prnt_flg);
		p.Cnd_mrkt_judg_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.mrkt_judg_prnt_flg_META);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0100.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBFP_MrktJudgReg p) {
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
	protected static void jbInitRPnl(MSBFP_MrktJudgReg p) {
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
	protected static void jbInitBulkSet(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_judg_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_judg_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_judg_dt);
		p.BulkSet_judg_dt.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_judg_dt.setRow(p.getBulkSetR(), mcframe.clientMSBF.MSBFP0100.BulkSetR.judg_dt_META);
		p.BulkSet_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_judg_rsn_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_judg_usr_dpt_nm);
		p.BulkSetPanel.add(p.BulkSet_judg_rsn_p_PPanel);
		p.BulkSet_judg_rsn_p_PPanel.setNextBeans(p.BulkSet_intr_rmrks);
		p.BulkSetPanel.add(p.BulkSet_intr_rmrks_Label);
		p.BulkSetPanel.add(p.BulkSet_intr_rmrks);
		p.BulkSet_intr_rmrks.setNextBeans(p.BulkSet_all_clear_flg);
		p.BulkSet_intr_rmrks.setRow(p.getBulkSetR(), mcframe.clientMSBF.MSBFP0100.BulkSetR.intr_rmrks_META);
		p.BulkSetPanel.add(p.BulkSet_all_clear_flg);
		p.BulkSet_all_clear_flg.setRow(p.getBulkSetR(), mcframe.clientMSBF.MSBFP0100.BulkSetR.all_clear_flg_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBFP_MrktJudgReg p) {
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
	protected static void jbInitBtn(MSBFP_MrktJudgReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1070.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP1070);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP1070);
		p.Btn_open_MSBCP1070.setNextBeans(p.Btn_open_MSBFP0060);
		p.Btn_open_MSBFP0060.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBFP0060);
		p.Btn_open_MSBFP0060.setNextBeans(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setNextBeans(p.Btn_auto_sel);
		p.Btn_auto_sel.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_auto_sel);
		p.Btn_auto_sel.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F18);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_acpt);
		p.Btn_select_acpt.setFunctionKey(MCFunctionKey.F19);
		p.BtnPanel.add(p.Btn_select_acpt);
		p.Btn_select_acpt.setNextBeans(p.Btn_select_not_acpt);
		p.Btn_select_not_acpt.setFunctionKey(MCFunctionKey.F20);
		p.BtnPanel.add(p.Btn_select_not_acpt);
		p.Btn_select_not_acpt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_judg);
		p.Btn_upd_judg.setIcon("REGISTER");
		p.Btn_upd_judg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_judg);
		p.Btn_upd_judg.setNextBeans(p.Btn_prnt_flg);
		p.BtnPanel.add(p.Btn_prnt_flg);
		p.Btn_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBF.MSBFP0100.BtnR.prnt_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_del.setNextBeans(p.Btn_del_judg);
		p.Btn_del_judg.setIcon("CANCEL");
		p.Btn_del_judg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_judg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_MrktJudgReg p) {
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
		MSBFP_MrktJudgReg_MC.mcInitScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitJudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitInputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitTop((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitFold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitTab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitTab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitPrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitCnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitCnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitCtrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitRPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitBulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitRslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.mcInitEastBtn((MSBFP_MrktJudgReg)this);

		// [UPD]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitUPD_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD_RsltTyp((MSBFP_MrktJudgReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitFIX__U_RsltTyp((MSBFP_MrktJudgReg)this);

		// [SRCH_UPD_JUDG]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__UPD__JUDG_RsltTyp((MSBFP_MrktJudgReg)this);

		// [UPD_JUDG]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitUPD__JUDG_RsltTyp((MSBFP_MrktJudgReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL_RsltTyp((MSBFP_MrktJudgReg)this);

		// [DEL]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitDEL_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL_RsltTyp((MSBFP_MrktJudgReg)this);

		// [SRCH_DEL_JUDG]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__DEL__JUDG_RsltTyp((MSBFP_MrktJudgReg)this);

		// [DEL_JUDG]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitDEL__JUDG_RsltTyp((MSBFP_MrktJudgReg)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitSRCH_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH_RsltTyp((MSBFP_MrktJudgReg)this);

		// [REF]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitREF_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitREF_RsltTyp((MSBFP_MrktJudgReg)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitSRCH__PRNT_RsltTyp((MSBFP_MrktJudgReg)this);

		// [PRNT]ステータスのモードの設定
		MSBFP_MrktJudgReg_MC.statusInitPRNT_ScreenOpe((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_JudgStsTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_InputTyp((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Top((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Fold((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Tab1((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Tab2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_PrntFlg((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Cnd((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Cnd2((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Ctrl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_RPnl((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_BulkSet((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Rslt((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_Btn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_EastBtn((MSBFP_MrktJudgReg)this);
		MSBFP_MrktJudgReg_MC.statusInitPRNT_RsltTyp((MSBFP_MrktJudgReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [JudgStsTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitJudgStsTyp(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [InputTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInputTyp(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBFP_MrktJudgReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [PrntFlg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrntFlg(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_MrktJudgReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_UPD_JUDG.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_DEL_JUDG.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_acpt_flg.addAllListener(p);
		p.Cnd_not_acpt_flg.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_ntfy_nm.setListListener(p);
		p.Cnd_ntfy_nm.addAllListener(p);
		p.Cnd_vld_dt_fr.setListListener(p);
		p.Cnd_vld_dt_fr.addAllListener(p);
		p.Cnd_vld_dt_to.setListListener(p);
		p.Cnd_vld_dt_to.addAllListener(p);
		p.Cnd_mrkt_judg_no.setListListener(p);
		p.Cnd_mrkt_judg_no.addAllListener(p);
		p.Cnd_judg_dt_fr.setListListener(p);
		p.Cnd_judg_dt_fr.addAllListener(p);
		p.Cnd_judg_dt_to.setListListener(p);
		p.Cnd_judg_dt_to.addAllListener(p);
		p.Cnd_upd_ts_fr.setListListener(p);
		p.Cnd_upd_ts_fr.addAllListener(p);
		p.Cnd_upd_ts_to.setListListener(p);
		p.Cnd_upd_ts_to.addAllListener(p);
		p.Cnd_judg_usr_cd.setListListener(p);
		p.Cnd_judg_usr_cd.addAllListener(p);
		p.Cnd_judg_usr_nm.setListListener(p);
		p.Cnd_judg_usr_nm.addAllListener(p);
		p.Cnd_judg_dpt_cd.setListListener(p);
		p.Cnd_judg_dpt_cd.addAllListener(p);
		p.Cnd_judg_dpt_nm.setListListener(p);
		p.Cnd_judg_dpt_nm.addAllListener(p);
		p.Cnd_main_flg.addAllListener(p);
		p.Cnd_mfg_so_aprv_typ.setListListener(p);
		p.Cnd_mfg_so_aprv_typ.addAllListener(p);
		p.Cnd_mfg_so_aprv_typ_nm.setListListener(p);
		p.Cnd_mfg_so_aprv_typ_nm.addAllListener(p);
		p.Cnd_quality_mng_typ.setListListener(p);
		p.Cnd_quality_mng_typ.addAllListener(p);
		p.Cnd_quality_mng_typ_nm.setListListener(p);
		p.Cnd_quality_mng_typ_nm.addAllListener(p);
		p.Cnd_mfg_mng_typ.setListListener(p);
		p.Cnd_mfg_mng_typ.addAllListener(p);
		p.Cnd_mfg_mng_typ_nm.setListListener(p);
		p.Cnd_mfg_mng_typ_nm.addAllListener(p);
		p.Cnd_deviant_typ.setListListener(p);
		p.Cnd_deviant_typ.addAllListener(p);
		p.Cnd_deviant_typ_nm.setListListener(p);
		p.Cnd_deviant_typ_nm.addAllListener(p);
		p.Cnd_deviant_msr_typ.setListListener(p);
		p.Cnd_deviant_msr_typ.addAllListener(p);
		p.Cnd_deviant_msr_typ_nm.setListListener(p);
		p.Cnd_deviant_msr_typ_nm.addAllListener(p);
		p.Cnd_prod_itm_info_typ.setListListener(p);
		p.Cnd_prod_itm_info_typ.addAllListener(p);
		p.Cnd_prod_itm_info_typ_nm.setListListener(p);
		p.Cnd_prod_itm_info_typ_nm.addAllListener(p);
		p.Cnd_chd_itm_info_typ.setListListener(p);
		p.Cnd_chd_itm_info_typ.addAllListener(p);
		p.Cnd_chd_itm_info_typ_nm.setListListener(p);
		p.Cnd_chd_itm_info_typ_nm.addAllListener(p);
		p.Cnd_not_input_flg.addAllListener(p);
		p.Cnd_input_flg.addAllListener(p);
		p.Cnd_mrkt_judg_not_prnt_flg.addAllListener(p);
		p.Cnd_mrkt_judg_prnt_flg.addAllListener(p);
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
	protected static void mcInitCnd2(MSBFP_MrktJudgReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBFP_MrktJudgReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBFP_MrktJudgReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBFP_MrktJudgReg p) {
		p.BulkSet_judg_dt.setListListener(p);
		p.BulkSet_judg_dt.addAllListener(p);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_intr_rmrks.setListListener(p);
		p.BulkSet_intr_rmrks.addAllListener(p);
		p.BulkSet_all_clear_flg.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBFP_MrktJudgReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_acpt_flg.addAllListener(p);
		p.columnRslt_not_acpt_flg.addAllListener(p);
		p.columnRslt_mrkt_judg_no.addAllListener(p);
		p.columnRslt_mrkt_judg_no.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_ntfy_nm.addAllListener(p);
		p.columnRslt_ntfy_nm.setListListener(p);
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_vld_dt.addAllListener(p);
		p.columnRslt_vld_dt.setListListener(p);
		p.columnRslt_upd_dt.addAllListener(p);
		p.columnRslt_upd_dt.setListListener(p);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_main_flg.addAllListener(p);
		p.columnRslt_mrkt_judg_prnt_flg.addAllListener(p);
		p.columnRslt_mrkt_judg_prnt_tm.addAllListener(p);
		p.columnRslt_mrkt_judg_prnt_tm.setListListener(p);
		p.columnRslt_judg_dt.addAllListener(p);
		p.columnRslt_judg_dt.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_mfg_so_aprv_typ.addAllListener(p);
		p.columnRslt_mfg_so_aprv_typ.setListListener(p);
		p.columnRslt_mfg_so_aprv_typ_nm.addAllListener(p);
		p.columnRslt_mfg_so_aprv_typ_nm.setListListener(p);
		p.columnRslt_quality_mng_typ.addAllListener(p);
		p.columnRslt_quality_mng_typ.setListListener(p);
		p.columnRslt_quality_mng_typ_nm.addAllListener(p);
		p.columnRslt_quality_mng_typ_nm.setListListener(p);
		p.columnRslt_mfg_mng_typ.addAllListener(p);
		p.columnRslt_mfg_mng_typ.setListListener(p);
		p.columnRslt_mfg_mng_typ_nm.addAllListener(p);
		p.columnRslt_mfg_mng_typ_nm.setListListener(p);
		p.columnRslt_deviant_typ.addAllListener(p);
		p.columnRslt_deviant_typ.setListListener(p);
		p.columnRslt_deviant_typ_nm.addAllListener(p);
		p.columnRslt_deviant_typ_nm.setListListener(p);
		p.columnRslt_deviant_msr_typ.addAllListener(p);
		p.columnRslt_deviant_msr_typ.setListListener(p);
		p.columnRslt_deviant_msr_typ_nm.addAllListener(p);
		p.columnRslt_deviant_msr_typ_nm.setListListener(p);
		p.columnRslt_prod_itm_info_typ.addAllListener(p);
		p.columnRslt_prod_itm_info_typ.setListListener(p);
		p.columnRslt_prod_itm_info_typ_nm.addAllListener(p);
		p.columnRslt_prod_itm_info_typ_nm.setListListener(p);
		p.columnRslt_chd_itm_info_typ.addAllListener(p);
		p.columnRslt_chd_itm_info_typ.setListListener(p);
		p.columnRslt_chd_itm_info_typ_nm.addAllListener(p);
		p.columnRslt_chd_itm_info_typ_nm.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_input_flg.addAllListener(p);
		p.columnRslt_add_flg.addAllListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_MrktJudgReg p) {
		p.Btn_open_MSBCP1070.addAllListener(p);
		p.Btn_open_MSBCP1070.setAPMethodName("doBtn_open_MSBCP1070");
		p.Btn_open_MSBFP0060.addAllListener(p);
		p.Btn_open_MSBFP0060.setAPMethodName("doBtn_open_MSBFP0060");
		p.Btn_open_MSBFP0120.addAllListener(p);
		p.Btn_open_MSBFP0120.setAPMethodName("doBtn_open_MSBFP0120");
		p.Btn_auto_sel.addAllListener(p);
		p.Btn_auto_sel.setAPMethodName("doBtn_auto_sel");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_acpt.addAllListener(p);
		p.Btn_select_acpt.setAPMethodName("doBtn_select_acpt");
		p.Btn_select_not_acpt.addAllListener(p);
		p.Btn_select_not_acpt.setAPMethodName("doBtn_select_not_acpt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_judg.addAllListener(p);
		p.Btn_upd_judg.setAPMethodName("doBtn_upd_judg");
		p.Btn_prnt_flg.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_del_judg.addAllListener(p);
		p.Btn_del_judg.setAPMethodName("doBtn_del_judg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_MrktJudgReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_not_acpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_judg_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_judg_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_main_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_input_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_all_clear_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_ntfy_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_vld_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_main_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_judg_rsn_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.INVISIBLE);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_quality_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_deviant_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
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
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_judg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_not_acpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_judg_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_judg_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_main_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_input_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_acpt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_judg_rsn_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.INVISIBLE);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [FIX_U]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD_JUDG, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_not_acpt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_acpt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_not_acpt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_no.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.columnRslt_main_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD_JUDG, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_UPD_JUDG, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.Btn_upd_judg.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UPD_JUDG, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_UPD_JUDG, MCMode.INVISIBLE);
		p.Btn_del_judg.putMode(p, SRCH_UPD_JUDG, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_UPD_JUDG]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__JUDG_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_not_acpt_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_JUDG]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, UPD_JUDG, MCMode.ENABLE);

	}

	/**
	 * [UPD_JUDG]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
		p.BulkSet_intr_rmrks.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.BulkSet_all_clear_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_JUDG]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_acpt_flg.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_not_acpt_flg.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_mrkt_judg_no.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.columnRslt_main_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_quality_mng_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_deviant_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_JUDG, MCMode.REQUIRED);
		p.columnRslt_input_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_JUDG, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_JUDG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, UPD_JUDG, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, UPD_JUDG, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_select_not_acpt.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_JUDG, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD_JUDG, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_JUDG, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_JUDG, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.Btn_upd_judg.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_JUDG, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_JUDG, MCMode.INVISIBLE);
		p.Btn_del_judg.putMode(p, UPD_JUDG, MCMode.DISABLE);

	}

	/**
	 * [UPD_JUDG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [UPD_JUDG]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__JUDG_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_not_acpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_judg_dt_to.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_judg_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_main_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_judg_rsn_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_not_acpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_judg_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_upd_ts_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_judg_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_judg_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_main_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt_judg_rsn_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_judg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_JUDG, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_not_acpt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_JUDG, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.columnRslt_main_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_JUDG, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_DEL_JUDG, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DEL_JUDG, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_DEL_JUDG, MCMode.INVISIBLE);
		p.Btn_del_judg.putMode(p, SRCH_DEL_JUDG, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_DEL_JUDG]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__JUDG_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, DEL_JUDG, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_not_acpt_flg.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_JUDG]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, DEL_JUDG, MCMode.ENABLE);

	}

	/**
	 * [DEL_JUDG]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
		p.BulkSet_intr_rmrks.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.BulkSet_all_clear_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_JUDG]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, DEL_JUDG, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.columnRslt_main_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_JUDG, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_JUDG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_JUDG, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_JUDG, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, DEL_JUDG, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DEL_JUDG, MCMode.INVISIBLE);
		p.Btn_del_judg.putMode(p, DEL_JUDG, MCMode.ENABLE);

	}

	/**
	 * [DEL_JUDG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [DEL_JUDG]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__JUDG_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_acpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_input_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acpt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitREF_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_acpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_input_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [REF]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_not_acpt_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH__PRNT_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_acpt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[JudgStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_JudgStsTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[InputTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_InputTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[PrntFlg]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PrntFlg(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBFP_MrktJudgReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_acpt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ntfy_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mrkt_judg_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_judg_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_judg_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_judg_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_judg_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_judg_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_judg_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_main_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mfg_so_aprv_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_quality_mng_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_quality_mng_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_mfg_mng_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mfg_mng_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_deviant_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_deviant_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_deviant_msr_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_deviant_msr_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_prod_itm_info_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_prod_itm_info_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_chd_itm_info_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_chd_itm_info_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_input_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_input_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_mrkt_judg_not_prnt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_mrkt_judg_prnt_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBFP_MrktJudgReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBFP_MrktJudgReg p){
		p.BulkSet_judg_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_judg_rsn_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.BulkSet_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.BulkSet_all_clear_flg.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBFP_MrktJudgReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_acpt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_not_acpt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ntfy_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_main_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_prnt_tm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_judg_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_judg_rsn_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5370.MAUBP_SprtTxt_D.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_so_aprv_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_quality_mng_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mng_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_deviant_msr_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_prod_itm_info_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_info_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_input_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_add_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
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
	protected static void statusInitPRNT_Btn(MSBFP_MrktJudgReg p){
		p.Btn_open_MSBCP1070.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_auto_sel.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_acpt.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_select_not_acpt.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_radd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd_judg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Btn_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del_judg.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBFP_MrktJudgReg p){

	}

	/**
	 * [PRNT]ステータスの[RsltTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RsltTyp(MSBFP_MrktJudgReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBFP_MrktJudgReg_MC.setTableConfigRslt((MSBFP_MrktJudgReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBFP_MrktJudgReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_acpt_flg.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.acpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acpt_flg);
		p.columnRslt_not_acpt_flg.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.not_acpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_acpt_flg);
		p.columnRslt_mrkt_judg_no.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mrkt_judg_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_no);
		p.columnRslt_mrkt_judg_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mrkt_judg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ);
		p.columnRslt_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mrkt_judg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ);
		p.columnRslt_ntfy_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.ntfy_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ntfy_nm);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.site_cd_META);
		p.columnRslt_site_cd.addLinkBeans(p.columnRslt_site_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_vld_dt.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.vld_dt_META);
		p.columnRslt_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt);
		p.columnRslt_upd_dt.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_dt_META);
		p.columnRslt_upd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_dt);
		p.RsltTable.addTable(p.Rslt_mrkt_upd_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_mrkt_upd_usr_dpt_nm);
		p.columnRslt_main_flg.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.main_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_main_flg);
		p.columnRslt_mrkt_judg_prnt_flg.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mrkt_judg_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_prnt_flg);
		p.columnRslt_mrkt_judg_prnt_tm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mrkt_judg_prnt_tm_META);
		p.columnRslt_mrkt_judg_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_prnt_tm);
		p.columnRslt_judg_dt.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.judg_dt_META);
		p.columnRslt_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_judg_dt);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_judg_usr_dpt_nm);
		p.RsltTable.addTable(p.Rslt_judg_rsn_p_PPanel.TxtTable);
		p.columnRslt_mfg_so_aprv_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mfg_so_aprv_typ_META);
		p.columnRslt_mfg_so_aprv_typ.addLinkBeans(p.columnRslt_mfg_so_aprv_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_so_aprv_typ);
		p.columnRslt_mfg_so_aprv_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mfg_so_aprv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_so_aprv_typ_nm);
		p.columnRslt_quality_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.quality_mng_typ_META);
		p.columnRslt_quality_mng_typ.addLinkBeans(p.columnRslt_quality_mng_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_mng_typ);
		p.columnRslt_quality_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.quality_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_mng_typ_nm);
		p.columnRslt_mfg_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mfg_mng_typ_META);
		p.columnRslt_mfg_mng_typ.addLinkBeans(p.columnRslt_mfg_mng_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_mng_typ);
		p.columnRslt_mfg_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.mfg_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_mng_typ_nm);
		p.columnRslt_deviant_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.deviant_typ_META);
		p.columnRslt_deviant_typ.addLinkBeans(p.columnRslt_deviant_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_deviant_typ);
		p.columnRslt_deviant_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.deviant_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_deviant_typ_nm);
		p.columnRslt_deviant_msr_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.deviant_msr_typ_META);
		p.columnRslt_deviant_msr_typ.addLinkBeans(p.columnRslt_deviant_msr_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_deviant_msr_typ);
		p.columnRslt_deviant_msr_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.deviant_msr_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_deviant_msr_typ_nm);
		p.columnRslt_prod_itm_info_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.prod_itm_info_typ_META);
		p.columnRslt_prod_itm_info_typ.addLinkBeans(p.columnRslt_prod_itm_info_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_prod_itm_info_typ);
		p.columnRslt_prod_itm_info_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.prod_itm_info_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prod_itm_info_typ_nm);
		p.columnRslt_chd_itm_info_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.chd_itm_info_typ_META);
		p.columnRslt_chd_itm_info_typ.addLinkBeans(p.columnRslt_chd_itm_info_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_info_typ);
		p.columnRslt_chd_itm_info_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.chd_itm_info_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_info_typ_nm);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_input_flg.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.input_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_input_flg);
		p.columnRslt_add_flg.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.add_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_flg);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0100.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_not_acpt_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_judg_usr_cd.getListConfig().setPutter(getCnd_judg_usr_cd_ListPutter());
		Cnd_judg_dpt_cd.getListConfig().setPutter(getCnd_judg_dpt_cd_ListPutter());
		Cnd_mfg_so_aprv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_so_aprv_typ.getListConfig().setPutter(getCnd_mfg_so_aprv_typ_ListPutter());
		Cnd_quality_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_mng_typ.getListConfig().setPutter(getCnd_quality_mng_typ_ListPutter());
		Cnd_mfg_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_mng_typ.getListConfig().setPutter(getCnd_mfg_mng_typ_ListPutter());
		Cnd_deviant_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_deviant_typ.getListConfig().setPutter(getCnd_deviant_typ_ListPutter());
		Cnd_deviant_msr_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_deviant_msr_typ.getListConfig().setPutter(getCnd_deviant_msr_typ_ListPutter());
		Cnd_prod_itm_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prod_itm_info_typ.getListConfig().setPutter(getCnd_prod_itm_info_typ_ListPutter());
		Cnd_chd_itm_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_info_typ.getListConfig().setPutter(getCnd_chd_itm_info_typ_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_site_cd.getListConfig().setPutter(getRslt_site_cd_ListPutter());
		Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_mfg_so_aprv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mfg_so_aprv_typ.getListConfig().setPutter(getRslt_mfg_so_aprv_typ_ListPutter());
		columnRslt_quality_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_quality_mng_typ.getListConfig().setPutter(getRslt_quality_mng_typ_ListPutter());
		columnRslt_mfg_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mfg_mng_typ.getListConfig().setPutter(getRslt_mfg_mng_typ_ListPutter());
		columnRslt_deviant_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_deviant_typ.getListConfig().setPutter(getRslt_deviant_typ_ListPutter());
		columnRslt_deviant_msr_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_deviant_msr_typ.getListConfig().setPutter(getRslt_deviant_msr_typ_ListPutter());
		columnRslt_prod_itm_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_prod_itm_info_typ.getListConfig().setPutter(getRslt_prod_itm_info_typ_ListPutter());
		columnRslt_chd_itm_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_chd_itm_info_typ.getListConfig().setPutter(getRslt_chd_itm_info_typ_ListPutter());
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
	 * この画面を[SRCH_UPD_JUDG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPD_JUDGStatus() {
		status = SRCH_UPD_JUDG;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_JUDG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_JUDGStatus() {
		status = UPD_JUDG;
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_JUDG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_JUDGStatus() {
		status = SRCH_DEL_JUDG;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_JUDG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_JUDGStatus() {
		status = DEL_JUDG;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (SRCH_UPD_JUDG.equals(status)) {
			setSRCH_UPD_JUDGStatus();
		}
		else if (UPD_JUDG.equals(status)) {
			setUPD_JUDGStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (SRCH_DEL_JUDG.equals(status)) {
			setSRCH_DEL_JUDGStatus();
		}
		else if (DEL_JUDG.equals(status)) {
			setDEL_JUDGStatus();
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
	 * [Cnd_judg_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_judg_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_judg_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_judg_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_so_aprv_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_so_aprv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgSoAprvTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_quality_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_quality_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.QualityMngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgMngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_deviant_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_deviant_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DeviantTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_deviant_msr_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_deviant_msr_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DeviantMsrTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_prod_itm_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prod_itm_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ProdItmInfoTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ChdItmInfoTyp");
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
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Rslt_mfg_so_aprv_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_so_aprv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgSoAprvTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_quality_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_quality_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.QualityMngTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_mfg_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgMngTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_deviant_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_deviant_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DeviantTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_deviant_msr_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_deviant_msr_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DeviantMsrTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_prod_itm_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_prod_itm_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ProdItmInfoTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_chd_itm_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_chd_itm_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ChdItmInfoTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_judg_usr_cd) return getCnd_judg_usr_cd(row, info);
		if(combo == Cnd_judg_dpt_cd) return getCnd_judg_dpt_cd(row, info);
		if(combo == Cnd_mfg_so_aprv_typ) return getCnd_mfg_so_aprv_typ(row, info);
		if(combo == Cnd_quality_mng_typ) return getCnd_quality_mng_typ(row, info);
		if(combo == Cnd_mfg_mng_typ) return getCnd_mfg_mng_typ(row, info);
		if(combo == Cnd_deviant_typ) return getCnd_deviant_typ(row, info);
		if(combo == Cnd_deviant_msr_typ) return getCnd_deviant_msr_typ(row, info);
		if(combo == Cnd_prod_itm_info_typ) return getCnd_prod_itm_info_typ(row, info);
		if(combo == Cnd_chd_itm_info_typ) return getCnd_chd_itm_info_typ(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_site_cd) return getRslt_site_cd(row, info);
		if(combo == Rslt_mrkt_upd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_mfg_so_aprv_typ) return getRslt_mfg_so_aprv_typ(row, info);
		if(combo == columnRslt_quality_mng_typ) return getRslt_quality_mng_typ(row, info);
		if(combo == columnRslt_mfg_mng_typ) return getRslt_mfg_mng_typ(row, info);
		if(combo == columnRslt_deviant_typ) return getRslt_deviant_typ(row, info);
		if(combo == columnRslt_deviant_msr_typ) return getRslt_deviant_msr_typ(row, info);
		if(combo == columnRslt_prod_itm_info_typ) return getRslt_prod_itm_info_typ(row, info);
		if(combo == columnRslt_chd_itm_info_typ) return getRslt_chd_itm_info_typ(row, info);
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
		else if (ap == Btn_open_MSBCP1070) doBtn_open_MSBCP1070(info);
		else if (ap == Btn_open_MSBFP0060) doBtn_open_MSBFP0060(info);
		else if (ap == Btn_open_MSBFP0120) doBtn_open_MSBFP0120(info);
		else if (ap == Btn_auto_sel) doBtn_auto_sel(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_acpt) doBtn_select_acpt(info);
		else if (ap == Btn_select_not_acpt) doBtn_select_not_acpt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_judg) doBtn_upd_judg(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_del_judg) doBtn_del_judg(info);
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
	 * [Btn]パネルの[open_MSBCP1070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0060(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[auto_sel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_auto_sel(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_acpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_acpt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_not_acpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_not_acpt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_judg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_judg(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_judg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_judg(MCEventInfo info);

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
		if (vc == Cnd_not_acpt_flg) return doCnd_not_acpt_flg_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_ntfy_nm) return doCnd_ntfy_nm_VC(info);
		if (vc == Cnd_vld_dt_fr) return doCnd_vld_dt_fr_VC(info);
		if (vc == Cnd_vld_dt_to) return doCnd_vld_dt_to_VC(info);
		if (vc == Cnd_mrkt_judg_no) return doCnd_mrkt_judg_no_VC(info);
		if (vc == Cnd_judg_dt_fr) return doCnd_judg_dt_fr_VC(info);
		if (vc == Cnd_judg_dt_to) return doCnd_judg_dt_to_VC(info);
		if (vc == Cnd_upd_ts_fr) return doCnd_upd_ts_fr_VC(info);
		if (vc == Cnd_upd_ts_to) return doCnd_upd_ts_to_VC(info);
		if (vc == Cnd_judg_usr_cd) return doCnd_judg_usr_cd_VC(info);
		if (vc == Cnd_judg_usr_nm) return doCnd_judg_usr_nm_VC(info);
		if (vc == Cnd_judg_dpt_cd) return doCnd_judg_dpt_cd_VC(info);
		if (vc == Cnd_judg_dpt_nm) return doCnd_judg_dpt_nm_VC(info);
		if (vc == Cnd_main_flg) return doCnd_main_flg_VC(info);
		if (vc == Cnd_mfg_so_aprv_typ) return doCnd_mfg_so_aprv_typ_VC(info);
		if (vc == Cnd_mfg_so_aprv_typ_nm) return doCnd_mfg_so_aprv_typ_nm_VC(info);
		if (vc == Cnd_quality_mng_typ) return doCnd_quality_mng_typ_VC(info);
		if (vc == Cnd_quality_mng_typ_nm) return doCnd_quality_mng_typ_nm_VC(info);
		if (vc == Cnd_mfg_mng_typ) return doCnd_mfg_mng_typ_VC(info);
		if (vc == Cnd_mfg_mng_typ_nm) return doCnd_mfg_mng_typ_nm_VC(info);
		if (vc == Cnd_deviant_typ) return doCnd_deviant_typ_VC(info);
		if (vc == Cnd_deviant_typ_nm) return doCnd_deviant_typ_nm_VC(info);
		if (vc == Cnd_deviant_msr_typ) return doCnd_deviant_msr_typ_VC(info);
		if (vc == Cnd_deviant_msr_typ_nm) return doCnd_deviant_msr_typ_nm_VC(info);
		if (vc == Cnd_prod_itm_info_typ) return doCnd_prod_itm_info_typ_VC(info);
		if (vc == Cnd_prod_itm_info_typ_nm) return doCnd_prod_itm_info_typ_nm_VC(info);
		if (vc == Cnd_chd_itm_info_typ) return doCnd_chd_itm_info_typ_VC(info);
		if (vc == Cnd_chd_itm_info_typ_nm) return doCnd_chd_itm_info_typ_nm_VC(info);
		if (vc == Cnd_not_input_flg) return doCnd_not_input_flg_VC(info);
		if (vc == Cnd_input_flg) return doCnd_input_flg_VC(info);
		if (vc == Cnd_mrkt_judg_not_prnt_flg) return doCnd_mrkt_judg_not_prnt_flg_VC(info);
		if (vc == Cnd_mrkt_judg_prnt_flg) return doCnd_mrkt_judg_prnt_flg_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == BulkSet_judg_dt) return doBulkSet_judg_dt_VC(info);
		if (vc == BulkSet_intr_rmrks) return doBulkSet_intr_rmrks_VC(info);
		if (vc == BulkSet_all_clear_flg) return doBulkSet_all_clear_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_acpt_flg) return doRslt_acpt_flg_VC(info);
		if (vc == columnRslt_not_acpt_flg) return doRslt_not_acpt_flg_VC(info);
		if (vc == columnRslt_mrkt_judg_no) return doRslt_mrkt_judg_no_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ) return doRslt_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ_nm) return doRslt_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRslt_ntfy_nm) return doRslt_ntfy_nm_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_vld_dt) return doRslt_vld_dt_VC(info);
		if (vc == columnRslt_upd_dt) return doRslt_upd_dt_VC(info);
		if (vc == columnRslt_main_flg) return doRslt_main_flg_VC(info);
		if (vc == columnRslt_mrkt_judg_prnt_flg) return doRslt_mrkt_judg_prnt_flg_VC(info);
		if (vc == columnRslt_mrkt_judg_prnt_tm) return doRslt_mrkt_judg_prnt_tm_VC(info);
		if (vc == columnRslt_judg_dt) return doRslt_judg_dt_VC(info);
		if (vc == columnRslt_mfg_so_aprv_typ) return doRslt_mfg_so_aprv_typ_VC(info);
		if (vc == columnRslt_mfg_so_aprv_typ_nm) return doRslt_mfg_so_aprv_typ_nm_VC(info);
		if (vc == columnRslt_quality_mng_typ) return doRslt_quality_mng_typ_VC(info);
		if (vc == columnRslt_quality_mng_typ_nm) return doRslt_quality_mng_typ_nm_VC(info);
		if (vc == columnRslt_mfg_mng_typ) return doRslt_mfg_mng_typ_VC(info);
		if (vc == columnRslt_mfg_mng_typ_nm) return doRslt_mfg_mng_typ_nm_VC(info);
		if (vc == columnRslt_deviant_typ) return doRslt_deviant_typ_VC(info);
		if (vc == columnRslt_deviant_typ_nm) return doRslt_deviant_typ_nm_VC(info);
		if (vc == columnRslt_deviant_msr_typ) return doRslt_deviant_msr_typ_VC(info);
		if (vc == columnRslt_deviant_msr_typ_nm) return doRslt_deviant_msr_typ_nm_VC(info);
		if (vc == columnRslt_prod_itm_info_typ) return doRslt_prod_itm_info_typ_VC(info);
		if (vc == columnRslt_prod_itm_info_typ_nm) return doRslt_prod_itm_info_typ_nm_VC(info);
		if (vc == columnRslt_chd_itm_info_typ) return doRslt_chd_itm_info_typ_VC(info);
		if (vc == columnRslt_chd_itm_info_typ_nm) return doRslt_chd_itm_info_typ_nm_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_input_flg) return doRslt_input_flg_VC(info);
		if (vc == columnRslt_add_flg) return doRslt_add_flg_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
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
	 * [Cnd]パネルの[not_acpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_acpt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ntfy_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ntfy_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrkt_judg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[judg_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_judg_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[judg_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_judg_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[judg_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_judg_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[judg_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_judg_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[judg_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_judg_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[judg_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_judg_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[main_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_main_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_so_aprv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_so_aprv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[deviant_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_deviant_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[deviant_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_deviant_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_deviant_msr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_deviant_msr_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prod_itm_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prod_itm_info_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_info_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_not_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrkt_judg_not_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrkt_judg_prnt_flg_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[judg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_judg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[all_clear_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_all_clear_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_acpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_acpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[main_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_main_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_prnt_tm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_so_aprv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_so_aprv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_so_aprv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[deviant_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_deviant_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[deviant_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_deviant_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_deviant_msr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_deviant_msr_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prod_itm_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prod_itm_info_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_info_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_flg_VC(MCEventInfo info){
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
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_acpt_flg) doCnd_acpt_flg_NC(info);
		else if (nc == Cnd_not_acpt_flg) doCnd_not_acpt_flg_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_ntfy_nm) doCnd_ntfy_nm_NC(info);
		else if (nc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NC(info);
		else if (nc == Cnd_vld_dt_to) doCnd_vld_dt_to_NC(info);
		else if (nc == Cnd_mrkt_judg_no) doCnd_mrkt_judg_no_NC(info);
		else if (nc == Cnd_judg_dt_fr) doCnd_judg_dt_fr_NC(info);
		else if (nc == Cnd_judg_dt_to) doCnd_judg_dt_to_NC(info);
		else if (nc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NC(info);
		else if (nc == Cnd_upd_ts_to) doCnd_upd_ts_to_NC(info);
		else if (nc == Cnd_judg_usr_cd) doCnd_judg_usr_cd_NC(info);
		else if (nc == Cnd_judg_usr_nm) doCnd_judg_usr_nm_NC(info);
		else if (nc == Cnd_judg_dpt_cd) doCnd_judg_dpt_cd_NC(info);
		else if (nc == Cnd_judg_dpt_nm) doCnd_judg_dpt_nm_NC(info);
		else if (nc == Cnd_main_flg) doCnd_main_flg_NC(info);
		else if (nc == Cnd_mfg_so_aprv_typ) doCnd_mfg_so_aprv_typ_NC(info);
		else if (nc == Cnd_mfg_so_aprv_typ_nm) doCnd_mfg_so_aprv_typ_nm_NC(info);
		else if (nc == Cnd_quality_mng_typ) doCnd_quality_mng_typ_NC(info);
		else if (nc == Cnd_quality_mng_typ_nm) doCnd_quality_mng_typ_nm_NC(info);
		else if (nc == Cnd_mfg_mng_typ) doCnd_mfg_mng_typ_NC(info);
		else if (nc == Cnd_mfg_mng_typ_nm) doCnd_mfg_mng_typ_nm_NC(info);
		else if (nc == Cnd_deviant_typ) doCnd_deviant_typ_NC(info);
		else if (nc == Cnd_deviant_typ_nm) doCnd_deviant_typ_nm_NC(info);
		else if (nc == Cnd_deviant_msr_typ) doCnd_deviant_msr_typ_NC(info);
		else if (nc == Cnd_deviant_msr_typ_nm) doCnd_deviant_msr_typ_nm_NC(info);
		else if (nc == Cnd_prod_itm_info_typ) doCnd_prod_itm_info_typ_NC(info);
		else if (nc == Cnd_prod_itm_info_typ_nm) doCnd_prod_itm_info_typ_nm_NC(info);
		else if (nc == Cnd_chd_itm_info_typ) doCnd_chd_itm_info_typ_NC(info);
		else if (nc == Cnd_chd_itm_info_typ_nm) doCnd_chd_itm_info_typ_nm_NC(info);
		else if (nc == Cnd_not_input_flg) doCnd_not_input_flg_NC(info);
		else if (nc == Cnd_input_flg) doCnd_input_flg_NC(info);
		else if (nc == Cnd_mrkt_judg_not_prnt_flg) doCnd_mrkt_judg_not_prnt_flg_NC(info);
		else if (nc == Cnd_mrkt_judg_prnt_flg) doCnd_mrkt_judg_prnt_flg_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == BulkSet_judg_dt) doBulkSet_judg_dt_NC(info);
		else if (nc == BulkSet_intr_rmrks) doBulkSet_intr_rmrks_NC(info);
		else if (nc == BulkSet_all_clear_flg) doBulkSet_all_clear_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_acpt_flg) doRslt_acpt_flg_NC(info);
		else if (nc == columnRslt_not_acpt_flg) doRslt_not_acpt_flg_NC(info);
		else if (nc == columnRslt_mrkt_judg_no) doRslt_mrkt_judg_no_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_ntfy_nm) doRslt_ntfy_nm_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_vld_dt) doRslt_vld_dt_NC(info);
		else if (nc == columnRslt_upd_dt) doRslt_upd_dt_NC(info);
		else if (nc == columnRslt_main_flg) doRslt_main_flg_NC(info);
		else if (nc == columnRslt_mrkt_judg_prnt_flg) doRslt_mrkt_judg_prnt_flg_NC(info);
		else if (nc == columnRslt_mrkt_judg_prnt_tm) doRslt_mrkt_judg_prnt_tm_NC(info);
		else if (nc == columnRslt_judg_dt) doRslt_judg_dt_NC(info);
		else if (nc == columnRslt_mfg_so_aprv_typ) doRslt_mfg_so_aprv_typ_NC(info);
		else if (nc == columnRslt_mfg_so_aprv_typ_nm) doRslt_mfg_so_aprv_typ_nm_NC(info);
		else if (nc == columnRslt_quality_mng_typ) doRslt_quality_mng_typ_NC(info);
		else if (nc == columnRslt_quality_mng_typ_nm) doRslt_quality_mng_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_mng_typ) doRslt_mfg_mng_typ_NC(info);
		else if (nc == columnRslt_mfg_mng_typ_nm) doRslt_mfg_mng_typ_nm_NC(info);
		else if (nc == columnRslt_deviant_typ) doRslt_deviant_typ_NC(info);
		else if (nc == columnRslt_deviant_typ_nm) doRslt_deviant_typ_nm_NC(info);
		else if (nc == columnRslt_deviant_msr_typ) doRslt_deviant_msr_typ_NC(info);
		else if (nc == columnRslt_deviant_msr_typ_nm) doRslt_deviant_msr_typ_nm_NC(info);
		else if (nc == columnRslt_prod_itm_info_typ) doRslt_prod_itm_info_typ_NC(info);
		else if (nc == columnRslt_prod_itm_info_typ_nm) doRslt_prod_itm_info_typ_nm_NC(info);
		else if (nc == columnRslt_chd_itm_info_typ) doRslt_chd_itm_info_typ_NC(info);
		else if (nc == columnRslt_chd_itm_info_typ_nm) doRslt_chd_itm_info_typ_nm_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_input_flg) doRslt_input_flg_NC(info);
		else if (nc == columnRslt_add_flg) doRslt_add_flg_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
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
	 * [Cnd]パネルの[not_acpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_acpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ntfy_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[judg_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_not_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_not_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_prnt_flg_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[all_clear_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_all_clear_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_acpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_acpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[main_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_main_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_flg_NC(MCEventInfo info){
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
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_acpt_flg) doCnd_acpt_flg_NE(info);
		else if (ne == Cnd_not_acpt_flg) doCnd_not_acpt_flg_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_ntfy_nm) doCnd_ntfy_nm_NE(info);
		else if (ne == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NE(info);
		else if (ne == Cnd_vld_dt_to) doCnd_vld_dt_to_NE(info);
		else if (ne == Cnd_mrkt_judg_no) doCnd_mrkt_judg_no_NE(info);
		else if (ne == Cnd_judg_dt_fr) doCnd_judg_dt_fr_NE(info);
		else if (ne == Cnd_judg_dt_to) doCnd_judg_dt_to_NE(info);
		else if (ne == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NE(info);
		else if (ne == Cnd_upd_ts_to) doCnd_upd_ts_to_NE(info);
		else if (ne == Cnd_judg_usr_cd) doCnd_judg_usr_cd_NE(info);
		else if (ne == Cnd_judg_usr_nm) doCnd_judg_usr_nm_NE(info);
		else if (ne == Cnd_judg_dpt_cd) doCnd_judg_dpt_cd_NE(info);
		else if (ne == Cnd_judg_dpt_nm) doCnd_judg_dpt_nm_NE(info);
		else if (ne == Cnd_main_flg) doCnd_main_flg_NE(info);
		else if (ne == Cnd_mfg_so_aprv_typ) doCnd_mfg_so_aprv_typ_NE(info);
		else if (ne == Cnd_mfg_so_aprv_typ_nm) doCnd_mfg_so_aprv_typ_nm_NE(info);
		else if (ne == Cnd_quality_mng_typ) doCnd_quality_mng_typ_NE(info);
		else if (ne == Cnd_quality_mng_typ_nm) doCnd_quality_mng_typ_nm_NE(info);
		else if (ne == Cnd_mfg_mng_typ) doCnd_mfg_mng_typ_NE(info);
		else if (ne == Cnd_mfg_mng_typ_nm) doCnd_mfg_mng_typ_nm_NE(info);
		else if (ne == Cnd_deviant_typ) doCnd_deviant_typ_NE(info);
		else if (ne == Cnd_deviant_typ_nm) doCnd_deviant_typ_nm_NE(info);
		else if (ne == Cnd_deviant_msr_typ) doCnd_deviant_msr_typ_NE(info);
		else if (ne == Cnd_deviant_msr_typ_nm) doCnd_deviant_msr_typ_nm_NE(info);
		else if (ne == Cnd_prod_itm_info_typ) doCnd_prod_itm_info_typ_NE(info);
		else if (ne == Cnd_prod_itm_info_typ_nm) doCnd_prod_itm_info_typ_nm_NE(info);
		else if (ne == Cnd_chd_itm_info_typ) doCnd_chd_itm_info_typ_NE(info);
		else if (ne == Cnd_chd_itm_info_typ_nm) doCnd_chd_itm_info_typ_nm_NE(info);
		else if (ne == Cnd_not_input_flg) doCnd_not_input_flg_NE(info);
		else if (ne == Cnd_input_flg) doCnd_input_flg_NE(info);
		else if (ne == Cnd_mrkt_judg_not_prnt_flg) doCnd_mrkt_judg_not_prnt_flg_NE(info);
		else if (ne == Cnd_mrkt_judg_prnt_flg) doCnd_mrkt_judg_prnt_flg_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == BulkSet_judg_dt) doBulkSet_judg_dt_NE(info);
		else if (ne == BulkSet_intr_rmrks) doBulkSet_intr_rmrks_NE(info);
		else if (ne == BulkSet_all_clear_flg) doBulkSet_all_clear_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_acpt_flg) doRslt_acpt_flg_NE(info);
		else if (ne == columnRslt_not_acpt_flg) doRslt_not_acpt_flg_NE(info);
		else if (ne == columnRslt_mrkt_judg_no) doRslt_mrkt_judg_no_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_ntfy_nm) doRslt_ntfy_nm_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_vld_dt) doRslt_vld_dt_NE(info);
		else if (ne == columnRslt_upd_dt) doRslt_upd_dt_NE(info);
		else if (ne == columnRslt_main_flg) doRslt_main_flg_NE(info);
		else if (ne == columnRslt_mrkt_judg_prnt_flg) doRslt_mrkt_judg_prnt_flg_NE(info);
		else if (ne == columnRslt_mrkt_judg_prnt_tm) doRslt_mrkt_judg_prnt_tm_NE(info);
		else if (ne == columnRslt_judg_dt) doRslt_judg_dt_NE(info);
		else if (ne == columnRslt_mfg_so_aprv_typ) doRslt_mfg_so_aprv_typ_NE(info);
		else if (ne == columnRslt_mfg_so_aprv_typ_nm) doRslt_mfg_so_aprv_typ_nm_NE(info);
		else if (ne == columnRslt_quality_mng_typ) doRslt_quality_mng_typ_NE(info);
		else if (ne == columnRslt_quality_mng_typ_nm) doRslt_quality_mng_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_mng_typ) doRslt_mfg_mng_typ_NE(info);
		else if (ne == columnRslt_mfg_mng_typ_nm) doRslt_mfg_mng_typ_nm_NE(info);
		else if (ne == columnRslt_deviant_typ) doRslt_deviant_typ_NE(info);
		else if (ne == columnRslt_deviant_typ_nm) doRslt_deviant_typ_nm_NE(info);
		else if (ne == columnRslt_deviant_msr_typ) doRslt_deviant_msr_typ_NE(info);
		else if (ne == columnRslt_deviant_msr_typ_nm) doRslt_deviant_msr_typ_nm_NE(info);
		else if (ne == columnRslt_prod_itm_info_typ) doRslt_prod_itm_info_typ_NE(info);
		else if (ne == columnRslt_prod_itm_info_typ_nm) doRslt_prod_itm_info_typ_nm_NE(info);
		else if (ne == columnRslt_chd_itm_info_typ) doRslt_chd_itm_info_typ_NE(info);
		else if (ne == columnRslt_chd_itm_info_typ_nm) doRslt_chd_itm_info_typ_nm_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_input_flg) doRslt_input_flg_NE(info);
		else if (ne == columnRslt_add_flg) doRslt_add_flg_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
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
	 * [Cnd]パネルの[not_acpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_acpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ntfy_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[judg_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_not_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_not_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_prnt_flg_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[all_clear_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_all_clear_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[not_acpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_acpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[main_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_main_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_flg_NE(MCEventInfo info){
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
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_acpt_flg) doCnd_acpt_flg_NX(info);
		else if (nx == Cnd_not_acpt_flg) doCnd_not_acpt_flg_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_ntfy_nm) doCnd_ntfy_nm_NX(info);
		else if (nx == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NX(info);
		else if (nx == Cnd_vld_dt_to) doCnd_vld_dt_to_NX(info);
		else if (nx == Cnd_mrkt_judg_no) doCnd_mrkt_judg_no_NX(info);
		else if (nx == Cnd_judg_dt_fr) doCnd_judg_dt_fr_NX(info);
		else if (nx == Cnd_judg_dt_to) doCnd_judg_dt_to_NX(info);
		else if (nx == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NX(info);
		else if (nx == Cnd_upd_ts_to) doCnd_upd_ts_to_NX(info);
		else if (nx == Cnd_judg_usr_cd) doCnd_judg_usr_cd_NX(info);
		else if (nx == Cnd_judg_usr_nm) doCnd_judg_usr_nm_NX(info);
		else if (nx == Cnd_judg_dpt_cd) doCnd_judg_dpt_cd_NX(info);
		else if (nx == Cnd_judg_dpt_nm) doCnd_judg_dpt_nm_NX(info);
		else if (nx == Cnd_main_flg) doCnd_main_flg_NX(info);
		else if (nx == Cnd_mfg_so_aprv_typ) doCnd_mfg_so_aprv_typ_NX(info);
		else if (nx == Cnd_mfg_so_aprv_typ_nm) doCnd_mfg_so_aprv_typ_nm_NX(info);
		else if (nx == Cnd_quality_mng_typ) doCnd_quality_mng_typ_NX(info);
		else if (nx == Cnd_quality_mng_typ_nm) doCnd_quality_mng_typ_nm_NX(info);
		else if (nx == Cnd_mfg_mng_typ) doCnd_mfg_mng_typ_NX(info);
		else if (nx == Cnd_mfg_mng_typ_nm) doCnd_mfg_mng_typ_nm_NX(info);
		else if (nx == Cnd_deviant_typ) doCnd_deviant_typ_NX(info);
		else if (nx == Cnd_deviant_typ_nm) doCnd_deviant_typ_nm_NX(info);
		else if (nx == Cnd_deviant_msr_typ) doCnd_deviant_msr_typ_NX(info);
		else if (nx == Cnd_deviant_msr_typ_nm) doCnd_deviant_msr_typ_nm_NX(info);
		else if (nx == Cnd_prod_itm_info_typ) doCnd_prod_itm_info_typ_NX(info);
		else if (nx == Cnd_prod_itm_info_typ_nm) doCnd_prod_itm_info_typ_nm_NX(info);
		else if (nx == Cnd_chd_itm_info_typ) doCnd_chd_itm_info_typ_NX(info);
		else if (nx == Cnd_chd_itm_info_typ_nm) doCnd_chd_itm_info_typ_nm_NX(info);
		else if (nx == Cnd_not_input_flg) doCnd_not_input_flg_NX(info);
		else if (nx == Cnd_input_flg) doCnd_input_flg_NX(info);
		else if (nx == Cnd_mrkt_judg_not_prnt_flg) doCnd_mrkt_judg_not_prnt_flg_NX(info);
		else if (nx == Cnd_mrkt_judg_prnt_flg) doCnd_mrkt_judg_prnt_flg_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == BulkSet_judg_dt) doBulkSet_judg_dt_NX(info);
		else if (nx == BulkSet_intr_rmrks) doBulkSet_intr_rmrks_NX(info);
		else if (nx == BulkSet_all_clear_flg) doBulkSet_all_clear_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_acpt_flg) doRslt_acpt_flg_NX(info);
		else if (nx == columnRslt_not_acpt_flg) doRslt_not_acpt_flg_NX(info);
		else if (nx == columnRslt_mrkt_judg_no) doRslt_mrkt_judg_no_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_ntfy_nm) doRslt_ntfy_nm_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_vld_dt) doRslt_vld_dt_NX(info);
		else if (nx == columnRslt_upd_dt) doRslt_upd_dt_NX(info);
		else if (nx == columnRslt_main_flg) doRslt_main_flg_NX(info);
		else if (nx == columnRslt_mrkt_judg_prnt_flg) doRslt_mrkt_judg_prnt_flg_NX(info);
		else if (nx == columnRslt_mrkt_judg_prnt_tm) doRslt_mrkt_judg_prnt_tm_NX(info);
		else if (nx == columnRslt_judg_dt) doRslt_judg_dt_NX(info);
		else if (nx == columnRslt_mfg_so_aprv_typ) doRslt_mfg_so_aprv_typ_NX(info);
		else if (nx == columnRslt_mfg_so_aprv_typ_nm) doRslt_mfg_so_aprv_typ_nm_NX(info);
		else if (nx == columnRslt_quality_mng_typ) doRslt_quality_mng_typ_NX(info);
		else if (nx == columnRslt_quality_mng_typ_nm) doRslt_quality_mng_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_mng_typ) doRslt_mfg_mng_typ_NX(info);
		else if (nx == columnRslt_mfg_mng_typ_nm) doRslt_mfg_mng_typ_nm_NX(info);
		else if (nx == columnRslt_deviant_typ) doRslt_deviant_typ_NX(info);
		else if (nx == columnRslt_deviant_typ_nm) doRslt_deviant_typ_nm_NX(info);
		else if (nx == columnRslt_deviant_msr_typ) doRslt_deviant_msr_typ_NX(info);
		else if (nx == columnRslt_deviant_msr_typ_nm) doRslt_deviant_msr_typ_nm_NX(info);
		else if (nx == columnRslt_prod_itm_info_typ) doRslt_prod_itm_info_typ_NX(info);
		else if (nx == columnRslt_prod_itm_info_typ_nm) doRslt_prod_itm_info_typ_nm_NX(info);
		else if (nx == columnRslt_chd_itm_info_typ) doRslt_chd_itm_info_typ_NX(info);
		else if (nx == columnRslt_chd_itm_info_typ_nm) doRslt_chd_itm_info_typ_nm_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_input_flg) doRslt_input_flg_NX(info);
		else if (nx == columnRslt_add_flg) doRslt_add_flg_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
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
	 * [Cnd]パネルの[not_acpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_acpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ntfy_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[judg_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_not_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_not_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_prnt_flg_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[all_clear_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_all_clear_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[not_acpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_acpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[main_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_main_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_ntfy_nm) doCnd_ntfy_nm_LC(info);
		else if (lc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_LC(info);
		else if (lc == Cnd_vld_dt_to) doCnd_vld_dt_to_LC(info);
		else if (lc == Cnd_mrkt_judg_no) doCnd_mrkt_judg_no_LC(info);
		else if (lc == Cnd_judg_dt_fr) doCnd_judg_dt_fr_LC(info);
		else if (lc == Cnd_judg_dt_to) doCnd_judg_dt_to_LC(info);
		else if (lc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_LC(info);
		else if (lc == Cnd_upd_ts_to) doCnd_upd_ts_to_LC(info);
		else if (lc == Cnd_judg_usr_cd) doCnd_judg_usr_cd_LC(info);
		else if (lc == Cnd_judg_usr_nm) doCnd_judg_usr_nm_LC(info);
		else if (lc == Cnd_judg_dpt_cd) doCnd_judg_dpt_cd_LC(info);
		else if (lc == Cnd_judg_dpt_nm) doCnd_judg_dpt_nm_LC(info);
		else if (lc == Cnd_mfg_so_aprv_typ) doCnd_mfg_so_aprv_typ_LC(info);
		else if (lc == Cnd_mfg_so_aprv_typ_nm) doCnd_mfg_so_aprv_typ_nm_LC(info);
		else if (lc == Cnd_quality_mng_typ) doCnd_quality_mng_typ_LC(info);
		else if (lc == Cnd_quality_mng_typ_nm) doCnd_quality_mng_typ_nm_LC(info);
		else if (lc == Cnd_mfg_mng_typ) doCnd_mfg_mng_typ_LC(info);
		else if (lc == Cnd_mfg_mng_typ_nm) doCnd_mfg_mng_typ_nm_LC(info);
		else if (lc == Cnd_deviant_typ) doCnd_deviant_typ_LC(info);
		else if (lc == Cnd_deviant_typ_nm) doCnd_deviant_typ_nm_LC(info);
		else if (lc == Cnd_deviant_msr_typ) doCnd_deviant_msr_typ_LC(info);
		else if (lc == Cnd_deviant_msr_typ_nm) doCnd_deviant_msr_typ_nm_LC(info);
		else if (lc == Cnd_prod_itm_info_typ) doCnd_prod_itm_info_typ_LC(info);
		else if (lc == Cnd_prod_itm_info_typ_nm) doCnd_prod_itm_info_typ_nm_LC(info);
		else if (lc == Cnd_chd_itm_info_typ) doCnd_chd_itm_info_typ_LC(info);
		else if (lc == Cnd_chd_itm_info_typ_nm) doCnd_chd_itm_info_typ_nm_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_judg_dt) doBulkSet_judg_dt_LC(info);
		else if (lc == BulkSet_intr_rmrks) doBulkSet_intr_rmrks_LC(info);
		else if (lc == columnRslt_mrkt_judg_no) doRslt_mrkt_judg_no_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_ntfy_nm) doRslt_ntfy_nm_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_vld_dt) doRslt_vld_dt_LC(info);
		else if (lc == columnRslt_upd_dt) doRslt_upd_dt_LC(info);
		else if (lc == columnRslt_mrkt_judg_prnt_tm) doRslt_mrkt_judg_prnt_tm_LC(info);
		else if (lc == columnRslt_judg_dt) doRslt_judg_dt_LC(info);
		else if (lc == columnRslt_mfg_so_aprv_typ) doRslt_mfg_so_aprv_typ_LC(info);
		else if (lc == columnRslt_mfg_so_aprv_typ_nm) doRslt_mfg_so_aprv_typ_nm_LC(info);
		else if (lc == columnRslt_quality_mng_typ) doRslt_quality_mng_typ_LC(info);
		else if (lc == columnRslt_quality_mng_typ_nm) doRslt_quality_mng_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_mng_typ) doRslt_mfg_mng_typ_LC(info);
		else if (lc == columnRslt_mfg_mng_typ_nm) doRslt_mfg_mng_typ_nm_LC(info);
		else if (lc == columnRslt_deviant_typ) doRslt_deviant_typ_LC(info);
		else if (lc == columnRslt_deviant_typ_nm) doRslt_deviant_typ_nm_LC(info);
		else if (lc == columnRslt_deviant_msr_typ) doRslt_deviant_msr_typ_LC(info);
		else if (lc == columnRslt_deviant_msr_typ_nm) doRslt_deviant_msr_typ_nm_LC(info);
		else if (lc == columnRslt_prod_itm_info_typ) doRslt_prod_itm_info_typ_LC(info);
		else if (lc == columnRslt_prod_itm_info_typ_nm) doRslt_prod_itm_info_typ_nm_LC(info);
		else if (lc == columnRslt_chd_itm_info_typ) doRslt_chd_itm_info_typ_LC(info);
		else if (lc == columnRslt_chd_itm_info_typ_nm) doRslt_chd_itm_info_typ_nm_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ntfy_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ntfy_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrkt_judg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrkt_judg_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[judg_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[judg_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_judg_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_so_aprv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_so_aprv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[deviant_msr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_deviant_msr_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_itm_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_itm_info_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_info_typ_nm_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ntfy_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ntfy_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_prnt_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_so_aprv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_so_aprv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[deviant_msr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_deviant_msr_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_itm_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_itm_info_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_info_typ_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_judg_usr_cd]の作成メソッド
	 */
	public MCList getCnd_judg_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_judg_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_judg_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_so_aprv_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_so_aprv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgSoAprvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_mng_typ]の作成メソッド
	 */
	public MCList getCnd_quality_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getQualityMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_mng_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_deviant_typ]の作成メソッド
	 */
	public MCList getCnd_deviant_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDeviantTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_deviant_msr_typ]の作成メソッド
	 */
	public MCList getCnd_deviant_msr_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDeviantMsrTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prod_itm_info_typ]の作成メソッド
	 */
	public MCList getCnd_prod_itm_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getProdItmInfoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_info_typ]の作成メソッド
	 */
	public MCList getCnd_chd_itm_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getChdItmInfoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_site_cd]の作成メソッド
	 */
	public MCList getRslt_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_mrkt_upd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_so_aprv_typ]の作成メソッド
	 */
	public MCList getRslt_mfg_so_aprv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgSoAprvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_quality_mng_typ]の作成メソッド
	 */
	public MCList getRslt_quality_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getQualityMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_mng_typ]の作成メソッド
	 */
	public MCList getRslt_mfg_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_deviant_typ]の作成メソッド
	 */
	public MCList getRslt_deviant_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDeviantTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_deviant_msr_typ]の作成メソッド
	 */
	public MCList getRslt_deviant_msr_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDeviantMsrTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_prod_itm_info_typ]の作成メソッド
	 */
	public MCList getRslt_prod_itm_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getProdItmInfoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_chd_itm_info_typ]の作成メソッド
	 */
	public MCList getRslt_chd_itm_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getChdItmInfoTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0100.Srch01")) {
			return new MS_MSBFL0100_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0100.Srch02")) {
			return new MS_MSBFL0100_Srch02Bridge();
		}
		if (id.equals("MS.MSBFL0100.Imp01")) {
			return new MS_MSBFL0100_Imp01Bridge();
		}
		if (id.equals("MS.MSBFL0100.Upd01")) {
			return new MS_MSBFL0100_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0100.Upd02")) {
			return new MS_MSBFL0100_Upd02Bridge();
		}
		if (id.equals("MS.MSBFL0100.Del01")) {
			return new MS_MSBFL0100_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0100.Del02")) {
			return new MS_MSBFL0100_Del02Bridge();
		}
		if (id.equals("MS.MSBFL0100.Prnt01")) {
			return new MS_MSBFL0100_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0100_Srch01Bridge() {
			p_MS_MSBFL0100_Srch01 = new MCParam(PDef.MS_MSBFL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0100.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0100_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Srch02;

		/** コンストラクタ */
		protected MS_MSBFL0100_Srch02Bridge() {
			p_MS_MSBFL0100_Srch02 = new MCParam(PDef.MS_MSBFL0100_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltTypR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltTypR.class));

			p_MS_MSBFL0100_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Srch02.addUpBlock(getRsltTypL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltTypR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Srch02;
		}

		protected void show() {
			setRsltTypL((MCList<mcframe.clientMSBF.MSBFP0100.RsltTypR>)p_MS_MSBFL0100_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltTypL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltTypL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltTypL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0100_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Imp01;

		/** コンストラクタ */
		protected MS_MSBFL0100_Imp01Bridge() {
			p_MS_MSBFL0100_Imp01 = new MCParam(PDef.MS_MSBFL0100_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Imp01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0100_Upd01Bridge() {
			p_MS_MSBFL0100_Upd01 = new MCParam(PDef.MS_MSBFL0100_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0100_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Upd02;

		/** コンストラクタ */
		protected MS_MSBFL0100_Upd02Bridge() {
			p_MS_MSBFL0100_Upd02 = new MCParam(PDef.MS_MSBFL0100_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
			param.addUpBlock(mcframe.clientMSBF.MSBFP0100.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Upd02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0100_Upd02.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)up(0);
		}
		protected mcframe.clientMSBF.MSBFP0100.BulkSetR up1() {
			return (mcframe.clientMSBF.MSBFP0100.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Upd02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Upd02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0100_Del01Bridge() {
			p_MS_MSBFL0100_Del01 = new MCParam(PDef.MS_MSBFL0100_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Del01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0100_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Del02;

		/** コンストラクタ */
		protected MS_MSBFL0100_Del02Bridge() {
			p_MS_MSBFL0100_Del02 = new MCParam(PDef.MS_MSBFL0100_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
			param.addUpBlock(mcframe.clientMSBF.MSBFP0100.BulkSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Del02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBFL0100_Del02.addUpBlock(getBulkSetR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)up(0);
		}
		protected mcframe.clientMSBF.MSBFP0100.BulkSetR up1() {
			return (mcframe.clientMSBF.MSBFP0100.BulkSetR)up(1);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Del02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Del02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0100_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0100_Prnt01;

		/** コンストラクタ */
		protected MS_MSBFL0100_Prnt01Bridge() {
			p_MS_MSBFL0100_Prnt01 = new MCParam(PDef.MS_MSBFL0100_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0100_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));

			p_MS_MSBFL0100_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0100_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0100_Prnt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0100_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0100_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0100_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0100_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0100.RsltR>)p_MS_MSBFL0100_Prnt01.getContainerParam().getDownBlock(0));
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