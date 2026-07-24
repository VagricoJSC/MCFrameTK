package mcframe.clientMSBE.MSBEP2610;

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
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch01Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch02Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch03Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch04Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch05Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch06Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch07Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch08Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch09Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch10Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch11Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Srch12Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Upd01Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Upd02Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Upd03Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Upd04Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Del01Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Del02Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Del03Caller;
import mcframe.clientMSBE.MSBEP2610.MSBEP_StktkList_MC.MS_MSBEL2610_Prnt01Caller;

/**
 * 画面"MSBEP_StktkList"パネルクラスです。<p>
 *
 * 品目・場所別に入出庫制限を実施し、理論在庫の作成、在庫の確定を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_StktkList_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP2610";

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
	// [OpeTyp]ブロック関連のField定義
	public MCPanel OpeTypPanel = null;
	public MCTitledBorder OpeTypTitledBorder = null;
	// [OpeTyp]ブロックの項目のField定義
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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録・訂正する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * IO_L,GR/GI control (Location),1;IO_I,GR/GI control (Location item),2;TOR_M,Create logical inventory (Monthly),3;TOR_L,Create logical inventory (Location),4;TOR_I,Create logical inventory (Location item),5;FIX,Firm inventory,6 IO_L,入出庫制御（場所）,1;IO_I,入出庫制御（場所品目）,2;TOR_M,理論在庫作成（月次）,3;TOR_L,理論在庫作成（場所）,4;TOR_I,理論在庫作成（場所品目）,5;FIX,在庫確定,6.<p>
	 *
	 */
	public MCButtonGroup Cnd_tgt_Group = null;
	public MCRadioButton Cnd_tgt_IO_L = null;
	public MCRadioButton Cnd_tgt_IO_I = null;
	public MCRadioButton Cnd_tgt_TOR_M = null;
	public MCRadioButton Cnd_tgt_TOR_L = null;
	public MCRadioButton Cnd_tgt_TOR_I = null;
	public MCRadioButton Cnd_tgt_FIX = null;
	/**
	 * Awaiting (Re-start) 棚卸開始待（再開待）.<p>
	 *
	 */
	public MCCheckBox Cnd_stktk_sts_wtg = null;
	/**
	 * Taking inventory count 棚卸中.<p>
	 *
	 */
	public MCCheckBox Cnd_stktk_sts_st = null;
	/**
	 * Inventory firmed 在庫確定済.<p>
	 *
	 */
	public MCCheckBox Cnd_stktk_sts_rfl = null;
	public MCLabel Cnd_ctrl_tgt_dt_Label = null;
	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public MCDateField Cnd_ctrl_tgt_dt = null;
	public MCLabel Cnd_stktk_ym_Label = null;
	/**
	 * Inventory count month 棚卸年月.<p>
	 *
	 */
	public MCDateField Cnd_stktk_ym = null;
	public MCLabel Cnd_ctrl_tgt_dt_fr_Label = null;
	/**
	 * Control target period FROM 制御対象期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ctrl_tgt_dt_fr = null;
	public MCLabel Cnd_ctrl_tgt_dt_to_Label = null;
	/**
	 * Control target period TO 制御対象期間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ctrl_tgt_dt_to = null;
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
	public MCLabel Cnd_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_grp_nm = null;
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
	public MCLabel Cnd_act_usr_cd_Label = null;
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_cd = null;
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_nm = null;
	public MCLabel Cnd_act_dpt_cd_Label = null;
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_cd = null;
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_nm = null;
	public MCLabel Cnd_stktk_rpt_rmrks_Label = null;
	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public MCTextField Cnd_stktk_rpt_rmrks = null;
	public MCLabel Cnd_stktk_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_stktk_intr_rmrks = null;
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
	 * Inventory count sheet unissued flg. 棚卸表未発行ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_not_invlist_flg = null;
	/**
	 * Inventory count sheet issued flg. 棚卸表発行済ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_invlist_flg = null;
	/**
	 * Variance list unissued flg. 差異リスト未発行ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_not_difflist_flg = null;
	/**
	 * Variance list issued flg. 差異リスト発行済ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_difflist_flg = null;
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
	// [StktkSts]ブロック関連のField定義
	public MCPanel StktkStsPanel = null;
	public MCTitledBorder StktkStsTitledBorder = null;
	// [StktkSts]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	public MCTitledBorder BulkSetTitledBorder = null;
	// [BulkSet]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_act_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_act_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_act_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_act_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_act_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_act_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_act_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_act_dpt_nm]としてエイリアス定義。
	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public MCDateField BulkSet_ctrl_tgt_dt = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2610.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Logical inventory check not required 理論在庫チェック不要.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_chk_tor_flg = null;
	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctrl_tgt_dt = null;
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_typ = null;
	/**
	 * Inventory count classification type name 棚卸種別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_typ_nm = null;
	/**
	 * Inventory count status type 棚卸状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_sts_typ = null;
	/**
	 * Inventory count status type name 棚卸状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_sts_typ_nm = null;
	/**
	 * GR/GI control flg. 入出庫制御中ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_ctrl_flg = null;
	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_qty_keep_flg = null;
	/**
	 * Last inventory base date 前回棚卸基準日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_stktk_dt = null;
	/**
	 * Inventory count start date and time 棚卸開始日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_st_tm = null;
	/**
	 * Inventory firm date and time 在庫確定日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff_upd_tm = null;
	/**
	 * Latest inventory start date 最新棚卸開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_latest_stktk_st_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_act_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_act_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_act_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_act_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_act_dpt_nm]としてエイリアス定義。
	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_rpt_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_intr_rmrks = null;
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
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stktk_upd_cntr = null;
	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_stktk_upd_cntr = null;
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
	 * Inventory count result entry 実棚登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2620 = null;
	/**
	 * Inventory count sheet 棚卸表.<p>
	 *
	 */
	public MCButton Btn_prnt_invlist = null;
	/**
	 * Variance list 差異リスト.<p>
	 *
	 */
	public MCButton Btn_prnt_difflist = null;
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
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_flg = null;
	/**
	 * GR/GI control 入出庫制御.<p>
	 *
	 */
	public MCCheckBox Btn_add_io_ctrl_flg = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd01 = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd02 = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd03 = null;
	/**
	 * Re-create logical inventory 理論在庫再作成.<p>
	 *
	 */
	public MCButton Btn_upd04 = null;
	/**
	 * Keep counted qty. 実棚数量保持.<p>
	 *
	 */
	public MCCheckBox Btn_act_qty_keep_flg = null;
	/**
	 * Inventory count sheet 棚卸表.<p>
	 *
	 */
	public MCCheckBox Btn_invlist_flg = null;
	/**
	 * Variance list 差異リスト.<p>
	 *
	 */
	public MCCheckBox Btn_difflist_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del01 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del02 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del03 = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_UIL]モードを表す定数 */
	public static final String SRCH_UIL = "SRCH_UIL";
	/** [SRCH_UII]モードを表す定数 */
	public static final String SRCH_UII = "SRCH_UII";
	/** [SRCH_UTM]モードを表す定数 */
	public static final String SRCH_UTM = "SRCH_UTM";
	/** [SRCH_UTL]モードを表す定数 */
	public static final String SRCH_UTL = "SRCH_UTL";
	/** [SRCH_UTI]モードを表す定数 */
	public static final String SRCH_UTI = "SRCH_UTI";
	/** [SRCH_UF]モードを表す定数 */
	public static final String SRCH_UF = "SRCH_UF";
	/** [SRCH_DIL]モードを表す定数 */
	public static final String SRCH_DIL = "SRCH_DIL";
	/** [SRCH_DII]モードを表す定数 */
	public static final String SRCH_DII = "SRCH_DII";
	/** [SRCH_DTM]モードを表す定数 */
	public static final String SRCH_DTM = "SRCH_DTM";
	/** [SRCH_DTL]モードを表す定数 */
	public static final String SRCH_DTL = "SRCH_DTL";
	/** [SRCH_DTI]モードを表す定数 */
	public static final String SRCH_DTI = "SRCH_DTI";
	/** [SRCH_DF]モードを表す定数 */
	public static final String SRCH_DF = "SRCH_DF";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [UPD_UIL]モードを表す定数 */
	public static final String UPD_UIL = "UPD_UIL";
	/** [UPD_UII]モードを表す定数 */
	public static final String UPD_UII = "UPD_UII";
	/** [UPD_UTM]モードを表す定数 */
	public static final String UPD_UTM = "UPD_UTM";
	/** [UPD_UTL]モードを表す定数 */
	public static final String UPD_UTL = "UPD_UTL";
	/** [UPD_UTI]モードを表す定数 */
	public static final String UPD_UTI = "UPD_UTI";
	/** [UPD_UF]モードを表す定数 */
	public static final String UPD_UF = "UPD_UF";
	/** [DEL_DIL]モードを表す定数 */
	public static final String DEL_DIL = "DEL_DIL";
	/** [DEL_DII]モードを表す定数 */
	public static final String DEL_DII = "DEL_DII";
	/** [DEL_DTML]モードを表す定数 */
	public static final String DEL_DTML = "DEL_DTML";
	/** [DEL_DTI]モードを表す定数 */
	public static final String DEL_DTI = "DEL_DTI";
	/** [DEL_DF]モードを表す定数 */
	public static final String DEL_DF = "DEL_DF";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UIL, SRCH_UII, SRCH_UTM, SRCH_UTL, SRCH_UTI, SRCH_UF, SRCH_DIL, SRCH_DII, SRCH_DTM, SRCH_DTL, SRCH_DTI, SRCH_DF, SRCH_PRNT, SRCH_REF, UPD_UIL, UPD_UII, UPD_UTM, UPD_UTL, UPD_UTI, UPD_UF, DEL_DIL, DEL_DII, DEL_DTML, DEL_DTI, DEL_DF, PRNT, REF};
	
	/** [MS_MSBEL2610_Srch01]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch01Caller createMS_MSBEL2610_Srch01() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch01Caller<MSBEP_StktkList, MS_MSBEL2610_Srch01Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch01Caller<MSBEP_StktkList, MS_MSBEL2610_Srch01Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch01]の呼び出し */
	protected void callMS_MSBEL2610_Srch01() {
		MCCaller caller = createMS_MSBEL2610_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch02]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch02Caller createMS_MSBEL2610_Srch02() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch02Caller<MSBEP_StktkList, MS_MSBEL2610_Srch02Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch02Caller<MSBEP_StktkList, MS_MSBEL2610_Srch02Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch02]の呼び出し */
	protected void callMS_MSBEL2610_Srch02() {
		MCCaller caller = createMS_MSBEL2610_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch03]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch03Caller createMS_MSBEL2610_Srch03() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch03Caller<MSBEP_StktkList, MS_MSBEL2610_Srch03Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch03Caller<MSBEP_StktkList, MS_MSBEL2610_Srch03Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch03]の呼び出し */
	protected void callMS_MSBEL2610_Srch03() {
		MCCaller caller = createMS_MSBEL2610_Srch03();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch04]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch04Caller createMS_MSBEL2610_Srch04() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch04Caller<MSBEP_StktkList, MS_MSBEL2610_Srch04Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch04Caller<MSBEP_StktkList, MS_MSBEL2610_Srch04Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch04Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch04]の呼び出し */
	protected void callMS_MSBEL2610_Srch04() {
		MCCaller caller = createMS_MSBEL2610_Srch04();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch05]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch05Caller createMS_MSBEL2610_Srch05() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch05Caller<MSBEP_StktkList, MS_MSBEL2610_Srch05Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch05Caller<MSBEP_StktkList, MS_MSBEL2610_Srch05Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch05Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch05]の呼び出し */
	protected void callMS_MSBEL2610_Srch05() {
		MCCaller caller = createMS_MSBEL2610_Srch05();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch06]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch06Caller createMS_MSBEL2610_Srch06() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch06Caller<MSBEP_StktkList, MS_MSBEL2610_Srch06Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch06Caller<MSBEP_StktkList, MS_MSBEL2610_Srch06Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch06Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch06]の呼び出し */
	protected void callMS_MSBEL2610_Srch06() {
		MCCaller caller = createMS_MSBEL2610_Srch06();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch07]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch07Caller createMS_MSBEL2610_Srch07() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch07Caller<MSBEP_StktkList, MS_MSBEL2610_Srch07Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch07Caller<MSBEP_StktkList, MS_MSBEL2610_Srch07Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch07Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch07]の呼び出し */
	protected void callMS_MSBEL2610_Srch07() {
		MCCaller caller = createMS_MSBEL2610_Srch07();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch08]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch08Caller createMS_MSBEL2610_Srch08() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch08Caller<MSBEP_StktkList, MS_MSBEL2610_Srch08Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch08Caller<MSBEP_StktkList, MS_MSBEL2610_Srch08Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch08Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch08]の呼び出し */
	protected void callMS_MSBEL2610_Srch08() {
		MCCaller caller = createMS_MSBEL2610_Srch08();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch09]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch09Caller createMS_MSBEL2610_Srch09() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch09Caller<MSBEP_StktkList, MS_MSBEL2610_Srch09Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch09Caller<MSBEP_StktkList, MS_MSBEL2610_Srch09Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch09Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch09]の呼び出し */
	protected void callMS_MSBEL2610_Srch09() {
		MCCaller caller = createMS_MSBEL2610_Srch09();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch10]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch10Caller createMS_MSBEL2610_Srch10() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch10Caller<MSBEP_StktkList, MS_MSBEL2610_Srch10Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch10Caller<MSBEP_StktkList, MS_MSBEL2610_Srch10Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch10Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch10]の呼び出し */
	protected void callMS_MSBEL2610_Srch10() {
		MCCaller caller = createMS_MSBEL2610_Srch10();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch11]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch11Caller createMS_MSBEL2610_Srch11() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch11Caller<MSBEP_StktkList, MS_MSBEL2610_Srch11Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch11Caller<MSBEP_StktkList, MS_MSBEL2610_Srch11Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch11Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch11]の呼び出し */
	protected void callMS_MSBEL2610_Srch11() {
		MCCaller caller = createMS_MSBEL2610_Srch11();
		caller.exec();
	}
	/** [MS_MSBEL2610_Srch12]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Srch12Caller createMS_MSBEL2610_Srch12() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Srch12Caller<MSBEP_StktkList, MS_MSBEL2610_Srch12Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Srch12Caller<MSBEP_StktkList, MS_MSBEL2610_Srch12Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Srch12Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Srch12]の呼び出し */
	protected void callMS_MSBEL2610_Srch12() {
		MCCaller caller = createMS_MSBEL2610_Srch12();
		caller.exec();
	}
	/** [MS_MSBEL2610_Upd01]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Upd01Caller createMS_MSBEL2610_Upd01() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Upd01Caller<MSBEP_StktkList, MS_MSBEL2610_Upd01Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Upd01Caller<MSBEP_StktkList, MS_MSBEL2610_Upd01Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Upd01]の呼び出し */
	protected void callMS_MSBEL2610_Upd01() {
		MCCaller caller = createMS_MSBEL2610_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL2610_Upd02]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Upd02Caller createMS_MSBEL2610_Upd02() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Upd02Caller<MSBEP_StktkList, MS_MSBEL2610_Upd02Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Upd02Caller<MSBEP_StktkList, MS_MSBEL2610_Upd02Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Upd02]の呼び出し */
	protected void callMS_MSBEL2610_Upd02() {
		MCCaller caller = createMS_MSBEL2610_Upd02();
		caller.exec();
	}
	/** [MS_MSBEL2610_Upd03]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Upd03Caller createMS_MSBEL2610_Upd03() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Upd03Caller<MSBEP_StktkList, MS_MSBEL2610_Upd03Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Upd03Caller<MSBEP_StktkList, MS_MSBEL2610_Upd03Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Upd03Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Upd03]の呼び出し */
	protected void callMS_MSBEL2610_Upd03() {
		MCCaller caller = createMS_MSBEL2610_Upd03();
		caller.exec();
	}
	/** [MS_MSBEL2610_Upd04]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Upd04Caller createMS_MSBEL2610_Upd04() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Upd04Caller<MSBEP_StktkList, MS_MSBEL2610_Upd04Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Upd04Caller<MSBEP_StktkList, MS_MSBEL2610_Upd04Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Upd04Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Upd04]の呼び出し */
	protected void callMS_MSBEL2610_Upd04() {
		MCCaller caller = createMS_MSBEL2610_Upd04();
		caller.exec();
	}
	/** [MS_MSBEL2610_Del01]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Del01Caller createMS_MSBEL2610_Del01() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Del01Caller<MSBEP_StktkList, MS_MSBEL2610_Del01Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Del01Caller<MSBEP_StktkList, MS_MSBEL2610_Del01Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Del01]の呼び出し */
	protected void callMS_MSBEL2610_Del01() {
		MCCaller caller = createMS_MSBEL2610_Del01();
		caller.exec();
	}
	/** [MS_MSBEL2610_Del02]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Del02Caller createMS_MSBEL2610_Del02() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Del02Caller<MSBEP_StktkList, MS_MSBEL2610_Del02Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Del02Caller<MSBEP_StktkList, MS_MSBEL2610_Del02Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Del02Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Del02]の呼び出し */
	protected void callMS_MSBEL2610_Del02() {
		MCCaller caller = createMS_MSBEL2610_Del02();
		caller.exec();
	}
	/** [MS_MSBEL2610_Del03]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Del03Caller createMS_MSBEL2610_Del03() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Del03Caller<MSBEP_StktkList, MS_MSBEL2610_Del03Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Del03Caller<MSBEP_StktkList, MS_MSBEL2610_Del03Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Del03Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Del03]の呼び出し */
	protected void callMS_MSBEL2610_Del03() {
		MCCaller caller = createMS_MSBEL2610_Del03();
		caller.exec();
	}
	/** [MS_MSBEL2610_Prnt01]のCallerの作成 */
	protected MSBEP_StktkList_MC.MS_MSBEL2610_Prnt01Caller createMS_MSBEL2610_Prnt01() {
		MSBEP_StktkList_MC.MS_MSBEL2610_Prnt01Caller<MSBEP_StktkList, MS_MSBEL2610_Prnt01Bridge>
		caller = ((MSBEP_StktkList_MC)this).new MS_MSBEL2610_Prnt01Caller<MSBEP_StktkList, MS_MSBEL2610_Prnt01Bridge>(
					(MSBEP_StktkList)this, new MS_MSBEL2610_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL2610_Prnt01]の呼び出し */
	protected void callMS_MSBEL2610_Prnt01() {
		MCCaller caller = createMS_MSBEL2610_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2610.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2610.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2610.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2610.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2610.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2610.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2610.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2610.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBE.MSBEP2610.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP2610.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP2610.BulkSetR createBulkSetR() {
		return mcframe.clientMSBE.MSBEP2610.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2610.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2610.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2610.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2610.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2610.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBE.MSBEP2610.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP2610.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP2610.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP2610.BtnR.create();
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
		ret.add(OpeTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(StktkStsPanel);
		ret.add(CtrlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StktkList_MC_A() {
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
	public MSBEP_StktkList_MC_A(String name) {
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
		MSBEP_StktkList_MC.jbCreateScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateOpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateTop((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateFold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateTab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateTab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateCnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateCnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateStktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateCtrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateBulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateRslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateBtn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbCreateEastBtn((MSBEP_StktkList)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_StktkList p) {
	}

	/**
	 * [OpeTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOpeTyp(MSBEP_StktkList p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_StktkList p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_StktkList p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_StktkList p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_StktkList p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_StktkList p) {
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
	protected static void jbCreateCnd2(MSBEP_StktkList p) {
	}

	/**
	 * [StktkSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStktkSts(MSBEP_StktkList p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_StktkList p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_StktkList p) {
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_act_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_act_usr_cd.addAliasName("BulkSet.act_usr_cd", p);
		p.BulkSet_act_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_act_usr_nm.addAliasName("BulkSet.act_usr_nm", p);
		p.BulkSet_act_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_act_dpt_cd.addAliasName("BulkSet.act_dpt_cd", p);
		p.BulkSet_act_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_act_dpt_nm.addAliasName("BulkSet.act_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_StktkList p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2610.RsltR.$itm_p);
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
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBE.MSBEP2610.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_act_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_act_usr_cd.addAliasName("Rslt.act_usr_cd", p);
		p.columnRslt_act_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_act_usr_nm.addAliasName("Rslt.act_usr_nm", p);
		p.columnRslt_act_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_act_dpt_cd.addAliasName("Rslt.act_dpt_cd", p);
		p.columnRslt_act_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_act_dpt_nm.addAliasName("Rslt.act_dpt_nm", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP2610.RsltR.$rts_msg_p);
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
	protected static void jbCreateBtn(MSBEP_StktkList p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_StktkList p) {
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
	
	
	/** [Cnd_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_grp_cd_p = null;

	/**
	 * [Cnd_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_grp_cd_ListPutter() {
		if (Cnd_loc_grp_cd_p == null) {
			Cnd_loc_grp_cd_p = createCnd_loc_grp_cd_ListPutter(Cnd_loc_grp_cd, "loc_grp_cd", "loc_grp_nm");

		}
		return Cnd_loc_grp_cd_p;
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
	
	
	/** [Cnd_act_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_usr_cd_p = null;

	/**
	 * [Cnd_act_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_usr_cd_ListPutter() {
		if (Cnd_act_usr_cd_p == null) {
			Cnd_act_usr_cd_p = createCnd_act_usr_cd_ListPutter(Cnd_act_usr_cd, "act_usr_cd", "act_usr_nm");

		}
		return Cnd_act_usr_cd_p;
	}
	
	
	/** [Cnd_act_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_dpt_cd_p = null;

	/**
	 * [Cnd_act_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_dpt_cd_ListPutter() {
		if (Cnd_act_dpt_cd_p == null) {
			Cnd_act_dpt_cd_p = createCnd_act_dpt_cd_ListPutter(Cnd_act_dpt_cd, "act_dpt_cd", "act_dpt_nm");

		}
		return Cnd_act_dpt_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "act_dpt_cd", "act_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "act_dpt_cd", "act_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StktkList create(){
		MSBEP_StktkList p = new MSBEP_StktkList();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StktkList create(String name){
		MSBEP_StktkList p = new MSBEP_StktkList(name);
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
		MSBEP_StktkList_MC.jbfInitScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitOpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitTop((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitFold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitTab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitTab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitCnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitCnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitStktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitCtrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitBulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitRslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitBtn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbfInitEastBtn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitOpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitTop((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitFold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitTab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitTab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitCnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitCnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitStktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitCtrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitBulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitRslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitBtn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.jbInitEastBtn((MSBEP_StktkList)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OpeTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOpeTyp(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.OpeTypPanel = p.beansFactory.createPanel("OpeTyp");
		p.OpeTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_StktkList p) {
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
	protected static void jbfInitTab1(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_tgt_Group = p.beansFactory.createButtonGroup("Cnd.tgt");
		p.Cnd_tgt_IO_L = p.beansFactory.createRadioButton("Cnd.tgt_IO_L");
		p.Cnd_tgt_IO_I = p.beansFactory.createRadioButton("Cnd.tgt_IO_I");
		p.Cnd_tgt_TOR_M = p.beansFactory.createRadioButton("Cnd.tgt_TOR_M");
		p.Cnd_tgt_TOR_L = p.beansFactory.createRadioButton("Cnd.tgt_TOR_L");
		p.Cnd_tgt_TOR_I = p.beansFactory.createRadioButton("Cnd.tgt_TOR_I");
		p.Cnd_tgt_FIX = p.beansFactory.createRadioButton("Cnd.tgt_FIX");
		p.Cnd_stktk_sts_wtg = p.beansFactory.createCheckBox("Cnd.stktk_sts_wtg");
		p.Cnd_stktk_sts_st = p.beansFactory.createCheckBox("Cnd.stktk_sts_st");
		p.Cnd_stktk_sts_rfl = p.beansFactory.createCheckBox("Cnd.stktk_sts_rfl");
		p.Cnd_ctrl_tgt_dt_Label = p.beansFactory.createLabel("Cnd.ctrl_tgt_dt_Label");
		p.Cnd_ctrl_tgt_dt = p.beansFactory.createDateField("Cnd.ctrl_tgt_dt");
		p.Cnd_ctrl_tgt_dt.setLabel(p.Cnd_ctrl_tgt_dt_Label);
		p.Cnd_stktk_ym_Label = p.beansFactory.createLabel("Cnd.stktk_ym_Label");
		p.Cnd_stktk_ym = p.beansFactory.createDateField("Cnd.stktk_ym");
		p.Cnd_stktk_ym.setLabel(p.Cnd_stktk_ym_Label);
		p.Cnd_ctrl_tgt_dt_fr_Label = p.beansFactory.createLabel("Cnd.ctrl_tgt_dt_fr_Label");
		p.Cnd_ctrl_tgt_dt_fr = p.beansFactory.createDateField("Cnd.ctrl_tgt_dt_fr");
		p.Cnd_ctrl_tgt_dt_fr.setLabel(p.Cnd_ctrl_tgt_dt_fr_Label);
		p.Cnd_ctrl_tgt_dt_to_Label = p.beansFactory.createLabel("Cnd.ctrl_tgt_dt_to_Label");
		p.Cnd_ctrl_tgt_dt_to = p.beansFactory.createDateField("Cnd.ctrl_tgt_dt_to");
		p.Cnd_ctrl_tgt_dt_to.setLabel(p.Cnd_ctrl_tgt_dt_to_Label);
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_act_usr_cd_Label = p.beansFactory.createLabel("Cnd.act_usr_cd_Label");
		p.Cnd_act_usr_cd = p.beansFactory.createTextField("Cnd.act_usr_cd");
		p.Cnd_act_usr_cd.setLabel(p.Cnd_act_usr_cd_Label);
		p.Cnd_act_usr_nm = p.beansFactory.createTextField("Cnd.act_usr_nm");
		p.Cnd_act_dpt_cd_Label = p.beansFactory.createLabel("Cnd.act_dpt_cd_Label");
		p.Cnd_act_dpt_cd = p.beansFactory.createTextField("Cnd.act_dpt_cd");
		p.Cnd_act_dpt_cd.setLabel(p.Cnd_act_dpt_cd_Label);
		p.Cnd_act_dpt_nm = p.beansFactory.createTextField("Cnd.act_dpt_nm");
		p.Cnd_stktk_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.stktk_rpt_rmrks_Label");
		p.Cnd_stktk_rpt_rmrks = p.beansFactory.createTextField("Cnd.stktk_rpt_rmrks");
		p.Cnd_stktk_rpt_rmrks.setLabel(p.Cnd_stktk_rpt_rmrks_Label);
		p.Cnd_stktk_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.stktk_intr_rmrks_Label");
		p.Cnd_stktk_intr_rmrks = p.beansFactory.createTextField("Cnd.stktk_intr_rmrks");
		p.Cnd_stktk_intr_rmrks.setLabel(p.Cnd_stktk_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_not_invlist_flg = p.beansFactory.createCheckBox("Cnd.not_invlist_flg");
		p.Cnd_invlist_flg = p.beansFactory.createCheckBox("Cnd.invlist_flg");
		p.Cnd_not_difflist_flg = p.beansFactory.createCheckBox("Cnd.not_difflist_flg");
		p.Cnd_difflist_flg = p.beansFactory.createCheckBox("Cnd.difflist_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [StktkSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStktkSts(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.StktkStsPanel = p.beansFactory.createPanel("StktkSts");
		p.StktkStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		p.BulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.BulkSet_ctrl_tgt_dt = p.beansFactory.createDateField("BulkSet.ctrl_tgt_dt");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_not_chk_tor_flg = p.beansFactory.createTableColumn("Rslt.not_chk_tor_flg", MCColumnType.CHECK);
		p.columnRslt_ctrl_tgt_dt = p.beansFactory.createTableColumn("Rslt.ctrl_tgt_dt", MCColumnType.DATE);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_cd = p.beansFactory.createTableColumn("Rslt.alloc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_nm = p.beansFactory.createTableColumn("Rslt.alloc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_stktk_typ = p.beansFactory.createTableColumn("Rslt.stktk_typ", MCColumnType.TEXT);
		p.columnRslt_stktk_typ_nm = p.beansFactory.createTableColumn("Rslt.stktk_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stktk_sts_typ = p.beansFactory.createTableColumn("Rslt.stktk_sts_typ", MCColumnType.TEXT);
		p.columnRslt_stktk_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.stktk_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_ctrl_flg = p.beansFactory.createTableColumn("Rslt.io_ctrl_flg", MCColumnType.CHECK);
		p.columnRslt_act_qty_keep_flg = p.beansFactory.createTableColumn("Rslt.act_qty_keep_flg", MCColumnType.CHECK);
		p.columnRslt_last_stktk_dt = p.beansFactory.createTableColumn("Rslt.last_stktk_dt", MCColumnType.DATE);
		p.columnRslt_stktk_st_tm = p.beansFactory.createTableColumn("Rslt.stktk_st_tm", MCColumnType.DATE);
		p.columnRslt_diff_upd_tm = p.beansFactory.createTableColumn("Rslt.diff_upd_tm", MCColumnType.DATE);
		p.columnRslt_latest_stktk_st_dt = p.beansFactory.createTableColumn("Rslt.latest_stktk_st_dt", MCColumnType.DATE);
		p.columnRslt_stktk_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.stktk_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_stktk_intr_rmrks = p.beansFactory.createTableColumn("Rslt.stktk_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_stktk_upd_cntr = p.beansFactory.createTableColumn("Rslt.stktk_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_pre_stktk_upd_cntr = p.beansFactory.createTableColumn("Rslt.pre_stktk_upd_cntr", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2620 = p.beansFactory.createButton("Btn.open_MSBEP2620", "open");
		p.Btn_prnt_invlist = p.beansFactory.createButton("Btn.prnt_invlist", "prnt");
		p.Btn_prnt_difflist = p.beansFactory.createButton("Btn.prnt_difflist", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_prnt_flg = p.beansFactory.createCheckBox("Btn.prnt_flg");
		p.Btn_add_io_ctrl_flg = p.beansFactory.createCheckBox("Btn.add_io_ctrl_flg");
		p.Btn_upd01 = p.beansFactory.createButton("Btn.upd01", "upd");
		p.Btn_upd02 = p.beansFactory.createButton("Btn.upd02", "upd");
		p.Btn_upd03 = p.beansFactory.createButton("Btn.upd03", "upd");
		p.Btn_upd04 = p.beansFactory.createButton("Btn.upd04", "upd");
		p.Btn_act_qty_keep_flg = p.beansFactory.createCheckBox("Btn.act_qty_keep_flg");
		p.Btn_invlist_flg = p.beansFactory.createCheckBox("Btn.invlist_flg");
		p.Btn_difflist_flg = p.beansFactory.createCheckBox("Btn.difflist_flg");
		p.Btn_del01 = p.beansFactory.createButton("Btn.del01", "del");
		p.Btn_del02 = p.beansFactory.createButton("Btn.del02", "del");
		p.Btn_del03 = p.beansFactory.createButton("Btn.del03", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.OpeTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [OpeTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOpeTyp(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.OpeTypPanel.setBorder(p.OpeTypTitledBorder);
		p.add(p.OpeTypPanel);
		p.OpeTypPanel.setNextBeans(p.TopPanel);
		p.OpeTypPanel.setValueCheck(false);
		p.OpeTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OpeTypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_StktkList p) {
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_StktkList p) {
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
	protected static void jbInitTab1(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.StktkStsPanel, null);
		p.Tab1Panel.setLastBeans(p.StktkStsPanel);
		p.StktkStsPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_StktkList p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.ope_META);
		p.OpeTypPanel.setLastBeans(p.Cnd_tgt_Group);
		p.Cnd_tgt_Group.setFirstBeans(p.Cnd_tgt_IO_L);
		p.Cnd_tgt_IO_L.setActionCommand("1");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_IO_L);
		p.OpeTypPanel.add(p.Cnd_tgt_IO_L);
		p.Cnd_tgt_IO_L.setNextBeans(p.Cnd_tgt_IO_I);
		p.Cnd_tgt_IO_I.setActionCommand("2");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_IO_I);
		p.OpeTypPanel.add(p.Cnd_tgt_IO_I);
		p.Cnd_tgt_IO_I.setNextBeans(p.Cnd_tgt_TOR_M);
		p.Cnd_tgt_TOR_M.setActionCommand("3");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_TOR_M);
		p.OpeTypPanel.add(p.Cnd_tgt_TOR_M);
		p.Cnd_tgt_TOR_M.setNextBeans(p.Cnd_tgt_TOR_L);
		p.Cnd_tgt_TOR_L.setActionCommand("4");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_TOR_L);
		p.OpeTypPanel.add(p.Cnd_tgt_TOR_L);
		p.Cnd_tgt_TOR_L.setNextBeans(p.Cnd_tgt_TOR_I);
		p.Cnd_tgt_TOR_I.setActionCommand("5");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_TOR_I);
		p.OpeTypPanel.add(p.Cnd_tgt_TOR_I);
		p.Cnd_tgt_TOR_I.setNextBeans(p.Cnd_tgt_FIX);
		p.Cnd_tgt_FIX.setActionCommand("6");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_FIX);
		p.OpeTypPanel.add(p.Cnd_tgt_FIX);
		p.Cnd_tgt_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.tgt_META);
		p.StktkStsPanel.add(p.Cnd_stktk_sts_wtg);
		p.StktkStsPanel.setLastBeans(p.Cnd_stktk_sts_wtg);
		p.Cnd_stktk_sts_wtg.setNextBeans(p.Cnd_stktk_sts_st);
		p.Cnd_stktk_sts_wtg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.stktk_sts_wtg_META);
		p.StktkStsPanel.add(p.Cnd_stktk_sts_st);
		p.Cnd_stktk_sts_st.setNextBeans(p.Cnd_stktk_sts_rfl);
		p.Cnd_stktk_sts_st.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.stktk_sts_st_META);
		p.StktkStsPanel.add(p.Cnd_stktk_sts_rfl);
		p.Cnd_stktk_sts_rfl.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.stktk_sts_rfl_META);
		p.CndPanel.add(p.Cnd_ctrl_tgt_dt_Label);
		p.CndPanel.add(p.Cnd_ctrl_tgt_dt);
		p.CndPanel.setLastBeans(p.Cnd_ctrl_tgt_dt);
		p.Cnd_ctrl_tgt_dt.setNextBeans(p.Cnd_stktk_ym);
		p.Cnd_ctrl_tgt_dt.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.ctrl_tgt_dt_META);
		p.Cnd_ctrl_tgt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_stktk_ym_Label);
		p.CndPanel.add(p.Cnd_stktk_ym);
		p.Cnd_stktk_ym.setNextBeans(p.Cnd_ctrl_tgt_dt_fr);
		p.Cnd_stktk_ym.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.stktk_ym_META);
		p.Cnd_stktk_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ctrl_tgt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ctrl_tgt_dt_fr);
		p.Cnd_ctrl_tgt_dt_fr.setNextBeans(p.Cnd_ctrl_tgt_dt_to);
		p.Cnd_ctrl_tgt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.ctrl_tgt_dt_fr_META);
		p.Cnd_ctrl_tgt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ctrl_tgt_dt_to_Label);
		p.CndPanel.add(p.Cnd_ctrl_tgt_dt_to);
		p.Cnd_ctrl_tgt_dt_to.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_ctrl_tgt_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.ctrl_tgt_dt_to_META);
		p.Cnd_ctrl_tgt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_act_usr_cd);
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
		p.CndPanel.add(p.Cnd_act_usr_cd_Label);
		p.CndPanel.add(p.Cnd_act_usr_cd);
		p.Cnd_act_usr_cd.setNextBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.act_usr_cd_META);
		p.Cnd_act_usr_cd.addLinkBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_usr_cd, true);
		p.CndPanel.add(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_nm.setNextBeans(p.Cnd_act_dpt_cd);
		p.Cnd_act_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.act_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_act_usr_nm, true);
		p.CndPanel.add(p.Cnd_act_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_act_dpt_cd);
		p.Cnd_act_dpt_cd.setNextBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.act_dpt_cd_META);
		p.Cnd_act_dpt_cd.addLinkBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_dpt_cd, true);
		p.CndPanel.add(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_nm.setNextBeans(p.Cnd_stktk_rpt_rmrks);
		p.Cnd_act_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.act_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_act_dpt_nm, true);
		p.CndPanel.add(p.Cnd_stktk_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_stktk_rpt_rmrks);
		p.Cnd_stktk_rpt_rmrks.setNextBeans(p.Cnd_stktk_intr_rmrks);
		p.Cnd_stktk_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.stktk_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_stktk_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_stktk_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_stktk_intr_rmrks);
		p.Cnd_stktk_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_stktk_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.stktk_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_stktk_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_not_invlist_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_not_invlist_flg);
		p.Cnd_not_invlist_flg.setNextBeans(p.Cnd_invlist_flg);
		p.Cnd_not_invlist_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.not_invlist_flg_META);
		p.CndPanel.add(p.Cnd_invlist_flg);
		p.Cnd_invlist_flg.setNextBeans(p.Cnd_not_difflist_flg);
		p.Cnd_invlist_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.invlist_flg_META);
		p.CndPanel.add(p.Cnd_not_difflist_flg);
		p.Cnd_not_difflist_flg.setNextBeans(p.Cnd_difflist_flg);
		p.Cnd_not_difflist_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.not_difflist_flg_META);
		p.CndPanel.add(p.Cnd_difflist_flg);
		p.Cnd_difflist_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2610.CndR.difflist_flg_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [StktkSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStktkSts(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.StktkStsPanel.setBorder(p.StktkStsTitledBorder);
		p.StktkStsPanel.setValueCheck(false);
		p.StktkStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StktkStsPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setBorder(p.BulkSetTitledBorder);
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_ctrl_tgt_dt);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_act_dpt_nm);
		p.BulkSetPanel.add(p.BulkSet_ctrl_tgt_dt);
		p.BulkSet_ctrl_tgt_dt.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP2610.BulkSetR.ctrl_tgt_dt_META);
		p.BulkSet_ctrl_tgt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_StktkList p) {
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
	protected static void jbInitBtn(MSBEP_StktkList p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2620.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP2620);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP2620);
		p.Btn_open_MSBEP2620.setNextBeans(p.Btn_prnt_invlist);
		p.Btn_prnt_invlist.setIcon("PRINT");
		p.Btn_prnt_invlist.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_prnt_invlist);
		p.Btn_prnt_invlist.setNextBeans(p.Btn_prnt_difflist);
		p.Btn_prnt_difflist.setIcon("PRINT");
		p.Btn_prnt_difflist.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_prnt_difflist);
		p.Btn_prnt_difflist.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_prnt_flg);
		p.BtnPanel.add(p.Btn_prnt_flg);
		p.Btn_prnt_flg.setNextBeans(p.Btn_add_io_ctrl_flg);
		p.Btn_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2610.BtnR.prnt_flg_META);
		p.BtnPanel.add(p.Btn_add_io_ctrl_flg);
		p.Btn_add_io_ctrl_flg.setNextBeans(p.Btn_upd01);
		p.Btn_add_io_ctrl_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2610.BtnR.add_io_ctrl_flg_META);
		p.Btn_upd01.setIcon("REGISTER");
		p.Btn_upd01.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd01);
		p.Btn_upd01.setNextBeans(p.Btn_upd02);
		p.Btn_upd02.setIcon("REGISTER");
		p.Btn_upd02.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd02);
		p.Btn_upd02.setNextBeans(p.Btn_upd03);
		p.Btn_upd03.setIcon("REGISTER");
		p.Btn_upd03.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd03);
		p.Btn_upd03.setNextBeans(p.Btn_upd04);
		p.Btn_upd04.setIcon("REGISTER");
		p.Btn_upd04.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_upd04);
		p.Btn_upd04.setNextBeans(p.Btn_invlist_flg);
		p.EastBtnPanel.add(p.Btn_act_qty_keep_flg);
		p.EastBtnPanel.setLastBeans(p.Btn_act_qty_keep_flg);
		p.Btn_act_qty_keep_flg.setNextBeans(p.Btn_del01);
		p.Btn_act_qty_keep_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2610.BtnR.act_qty_keep_flg_META);
		p.BtnPanel.add(p.Btn_invlist_flg);
		p.Btn_invlist_flg.setNextBeans(p.Btn_difflist_flg);
		p.Btn_invlist_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2610.BtnR.invlist_flg_META);
		p.BtnPanel.add(p.Btn_difflist_flg);
		p.Btn_difflist_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2610.BtnR.difflist_flg_META);
		p.Btn_del01.setIcon("CANCEL");
		p.Btn_del01.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del01);
		p.Btn_del01.setNextBeans(p.Btn_del02);
		p.Btn_del02.setIcon("CANCEL");
		p.Btn_del02.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del02);
		p.Btn_del02.setNextBeans(p.Btn_del03);
		p.Btn_del03.setIcon("CANCEL");
		p.Btn_del03.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del03);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_StktkList p) {
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
		MSBEP_StktkList_MC.mcInitScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitOpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitTop((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitFold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitTab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitTab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitCnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitCnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitStktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitCtrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitBulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitRslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitBtn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.mcInitEastBtn((MSBEP_StktkList)this);

		// [SRCH_UIL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__UIL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UIL_EastBtn((MSBEP_StktkList)this);

		// [SRCH_UII]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__UII_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UII_EastBtn((MSBEP_StktkList)this);

		// [SRCH_UTM]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__UTM_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTM_EastBtn((MSBEP_StktkList)this);

		// [SRCH_UTL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__UTL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTL_EastBtn((MSBEP_StktkList)this);

		// [SRCH_UTI]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__UTI_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UTI_EastBtn((MSBEP_StktkList)this);

		// [SRCH_UF]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__UF_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__UF_EastBtn((MSBEP_StktkList)this);

		// [SRCH_DIL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__DIL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DIL_EastBtn((MSBEP_StktkList)this);

		// [SRCH_DII]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__DII_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DII_EastBtn((MSBEP_StktkList)this);

		// [SRCH_DTM]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__DTM_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTM_EastBtn((MSBEP_StktkList)this);

		// [SRCH_DTL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__DTL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTL_EastBtn((MSBEP_StktkList)this);

		// [SRCH_DTI]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__DTI_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DTI_EastBtn((MSBEP_StktkList)this);

		// [SRCH_DF]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__DF_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__DF_EastBtn((MSBEP_StktkList)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__PRNT_EastBtn((MSBEP_StktkList)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitSRCH__REF_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitSRCH__REF_EastBtn((MSBEP_StktkList)this);

		// [UPD_UIL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitUPD__UIL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UIL_EastBtn((MSBEP_StktkList)this);

		// [UPD_UII]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitUPD__UII_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UII_EastBtn((MSBEP_StktkList)this);

		// [UPD_UTM]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitUPD__UTM_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTM_EastBtn((MSBEP_StktkList)this);

		// [UPD_UTL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitUPD__UTL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTL_EastBtn((MSBEP_StktkList)this);

		// [UPD_UTI]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitUPD__UTI_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UTI_EastBtn((MSBEP_StktkList)this);

		// [UPD_UF]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitUPD__UF_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitUPD__UF_EastBtn((MSBEP_StktkList)this);

		// [DEL_DIL]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitDEL__DIL_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DIL_EastBtn((MSBEP_StktkList)this);

		// [DEL_DII]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitDEL__DII_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DII_EastBtn((MSBEP_StktkList)this);

		// [DEL_DTML]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitDEL__DTML_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTML_EastBtn((MSBEP_StktkList)this);

		// [DEL_DTI]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitDEL__DTI_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DTI_EastBtn((MSBEP_StktkList)this);

		// [DEL_DF]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitDEL__DF_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitDEL__DF_EastBtn((MSBEP_StktkList)this);

		// [PRNT]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitPRNT_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitPRNT_EastBtn((MSBEP_StktkList)this);

		// [REF]ステータスのモードの設定
		MSBEP_StktkList_MC.statusInitREF_ScreenOpe((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_OpeTyp((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Top((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Fold((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Tab1((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Tab2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Cnd((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Cnd2((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_StktkSts((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Ctrl((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_BulkSet((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Rslt((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_Btn((MSBEP_StktkList)this);
		MSBEP_StktkList_MC.statusInitREF_EastBtn((MSBEP_StktkList)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_StktkList p) {
	}

	/**
	 *  [OpeTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOpeTyp(MSBEP_StktkList p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_StktkList p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_StktkList p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_StktkList p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_StktkList p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_StktkList p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_tgt_Group.addAllListener(p);
		p.Cnd_tgt_IO_L.addAllListener(p);
		p.Cnd_tgt_IO_I.addAllListener(p);
		p.Cnd_tgt_TOR_M.addAllListener(p);
		p.Cnd_tgt_TOR_L.addAllListener(p);
		p.Cnd_tgt_TOR_I.addAllListener(p);
		p.Cnd_tgt_FIX.addAllListener(p);
		p.Cnd_stktk_sts_wtg.addAllListener(p);
		p.Cnd_stktk_sts_st.addAllListener(p);
		p.Cnd_stktk_sts_rfl.addAllListener(p);
		p.Cnd_ctrl_tgt_dt.setListListener(p);
		p.Cnd_ctrl_tgt_dt.addAllListener(p);
		p.Cnd_stktk_ym.setListListener(p);
		p.Cnd_stktk_ym.addAllListener(p);
		p.Cnd_ctrl_tgt_dt_fr.setListListener(p);
		p.Cnd_ctrl_tgt_dt_fr.addAllListener(p);
		p.Cnd_ctrl_tgt_dt_to.setListListener(p);
		p.Cnd_ctrl_tgt_dt_to.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_act_usr_cd.setListListener(p);
		p.Cnd_act_usr_cd.addAllListener(p);
		p.Cnd_act_usr_nm.setListListener(p);
		p.Cnd_act_usr_nm.addAllListener(p);
		p.Cnd_act_dpt_cd.setListListener(p);
		p.Cnd_act_dpt_cd.addAllListener(p);
		p.Cnd_act_dpt_nm.setListListener(p);
		p.Cnd_act_dpt_nm.addAllListener(p);
		p.Cnd_stktk_rpt_rmrks.setListListener(p);
		p.Cnd_stktk_rpt_rmrks.addAllListener(p);
		p.Cnd_stktk_intr_rmrks.setListListener(p);
		p.Cnd_stktk_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_not_invlist_flg.addAllListener(p);
		p.Cnd_invlist_flg.addAllListener(p);
		p.Cnd_not_difflist_flg.addAllListener(p);
		p.Cnd_difflist_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBEP_StktkList p) {
	}

	/**
	 *  [StktkSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStktkSts(MSBEP_StktkList p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_StktkList p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_StktkList p) {
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_ctrl_tgt_dt.setListListener(p);
		p.BulkSet_ctrl_tgt_dt.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_StktkList p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_not_chk_tor_flg.addAllListener(p);
		p.columnRslt_ctrl_tgt_dt.addAllListener(p);
		p.columnRslt_ctrl_tgt_dt.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_loc_grp_cd.addAllListener(p);
		p.columnRslt_loc_grp_cd.setListListener(p);
		p.columnRslt_loc_grp_nm.addAllListener(p);
		p.columnRslt_loc_grp_nm.setListListener(p);
		p.columnRslt_alloc_grp_cd.addAllListener(p);
		p.columnRslt_alloc_grp_cd.setListListener(p);
		p.columnRslt_alloc_grp_nm.addAllListener(p);
		p.columnRslt_alloc_grp_nm.setListListener(p);
		p.columnRslt_stktk_typ.addAllListener(p);
		p.columnRslt_stktk_typ.setListListener(p);
		p.columnRslt_stktk_typ_nm.addAllListener(p);
		p.columnRslt_stktk_typ_nm.setListListener(p);
		p.columnRslt_stktk_sts_typ.addAllListener(p);
		p.columnRslt_stktk_sts_typ.setListListener(p);
		p.columnRslt_stktk_sts_typ_nm.addAllListener(p);
		p.columnRslt_stktk_sts_typ_nm.setListListener(p);
		p.columnRslt_io_ctrl_flg.addAllListener(p);
		p.columnRslt_act_qty_keep_flg.addAllListener(p);
		p.columnRslt_last_stktk_dt.addAllListener(p);
		p.columnRslt_last_stktk_dt.setListListener(p);
		p.columnRslt_stktk_st_tm.addAllListener(p);
		p.columnRslt_stktk_st_tm.setListListener(p);
		p.columnRslt_diff_upd_tm.addAllListener(p);
		p.columnRslt_diff_upd_tm.setListListener(p);
		p.columnRslt_latest_stktk_st_dt.addAllListener(p);
		p.columnRslt_latest_stktk_st_dt.setListListener(p);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_stktk_rpt_rmrks.addAllListener(p);
		p.columnRslt_stktk_rpt_rmrks.setListListener(p);
		p.columnRslt_stktk_intr_rmrks.addAllListener(p);
		p.columnRslt_stktk_intr_rmrks.setListListener(p);
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
		p.columnRslt_stktk_upd_cntr.addAllListener(p);
		p.columnRslt_stktk_upd_cntr.setListListener(p);
		p.columnRslt_pre_stktk_upd_cntr.addAllListener(p);
		p.columnRslt_pre_stktk_upd_cntr.setListListener(p);
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
	protected static void mcInitBtn(MSBEP_StktkList p) {
		p.Btn_open_MSBEP2620.addAllListener(p);
		p.Btn_open_MSBEP2620.setAPMethodName("doBtn_open_MSBEP2620");
		p.Btn_prnt_invlist.addAllListener(p);
		p.Btn_prnt_invlist.setAPMethodName("doBtn_prnt_invlist");
		p.Btn_prnt_difflist.addAllListener(p);
		p.Btn_prnt_difflist.setAPMethodName("doBtn_prnt_difflist");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_prnt_flg.addAllListener(p);
		p.Btn_add_io_ctrl_flg.addAllListener(p);
		p.Btn_upd01.addAllListener(p);
		p.Btn_upd01.setAPMethodName("doBtn_upd01");
		p.Btn_upd02.addAllListener(p);
		p.Btn_upd02.setAPMethodName("doBtn_upd02");
		p.Btn_upd03.addAllListener(p);
		p.Btn_upd03.setAPMethodName("doBtn_upd03");
		p.Btn_upd04.addAllListener(p);
		p.Btn_upd04.setAPMethodName("doBtn_upd04");
		p.Btn_act_qty_keep_flg.addAllListener(p);
		p.Btn_invlist_flg.addAllListener(p);
		p.Btn_difflist_flg.addAllListener(p);
		p.Btn_del01.addAllListener(p);
		p.Btn_del01.setAPMethodName("doBtn_del01");
		p.Btn_del02.addAllListener(p);
		p.Btn_del02.setAPMethodName("doBtn_del02");
		p.Btn_del03.addAllListener(p);
		p.Btn_del03.setAPMethodName("doBtn_del03");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_StktkList p) {
	}

	/**
	 * [SRCH_UIL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_UIL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_UIL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_UIL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UIL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_UIL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UIL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_UIL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UIL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_UIL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_UIL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UIL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UIL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_UIL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_UIL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_UIL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_UIL, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_UIL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UIL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UIL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_UII, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_UII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_UII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_UII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_UII, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_UII, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UII]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UII]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_UII, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UII]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_UII, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UII, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_UII, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_UII, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UII, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UII]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_UII, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_UII, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_UII, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_UII, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_UII, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UII]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UII_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_UTM, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_UTM, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_UTM, MCMode.REQUIRED);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_UTM, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_UTM]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTM]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_UTM, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UTM]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_UTM, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UTM, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_UTM, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_UTM, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UTM, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UTM]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_UTM, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_UTM, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_UTM, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_UTM, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_UTM, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UTM]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTM_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_UTL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_UTL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_UTL, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_UTL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_UTL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_UTL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_UTL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_UTL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_UTL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_UTL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_UTL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_UTL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_UTL, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_UTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_UTI, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_UTI, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_UTI, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_UTI, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UTI]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UTI]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_UTI, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UTI]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_UTI, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UTI, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_UTI, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_UTI, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UTI, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UTI]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_UTI, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_UTI, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_UTI, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_UTI, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_UTI, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UTI]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UTI_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_UF, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_UF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_UF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_UF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_UF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_UF, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_UF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_UF, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_UF, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_UF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_UF, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_UF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UF_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_DIL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_DIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_DIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_DIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_DIL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_DIL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DIL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_DIL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DIL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_DIL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DIL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_DIL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_DIL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DIL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DIL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_DIL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_DIL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_DIL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_DIL, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_DIL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DIL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DIL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_DII, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_DII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_DII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_DII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_DII, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DII]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DII]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_DII, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DII]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_DII, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DII, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_DII, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_DII, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DII, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DII]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_DII, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_DII, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_DII, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_DII, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_DII, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DII]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DII_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_DTM, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_DTM, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_DTM, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_DTM]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTM]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_DTM, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DTM]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_DTM, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DTM, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_DTM, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_DTM, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DTM, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DTM]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_DTM, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_DTM, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_DTM, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_DTM, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_DTM, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DTM]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTM_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_DTL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH__DTL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_DTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_DTI, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_DTI, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_DTI, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DTI]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DTI]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_DTI, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DTI]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_DTI, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DTI, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_DTI, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_DTI, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DTI, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DTI]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_DTI, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_DTI, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_DTI, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_DTI, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_DTI, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DTI]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTI_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_DF, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_DF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_DF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_DF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_DF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_DF, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_DF, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_DF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_DF, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_DF, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_DF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_DF, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_DF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DF_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH__PRNT_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_PRNT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_wtg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ctrl_tgt_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [SRCH_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del02.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del03.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Top(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, UPD_UIL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, UPD_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, UPD_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, UPD_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, UPD_UIL, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [UPD_UIL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UIL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_ctrl_tgt_dt.putMode(p, UPD_UIL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_UIL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, UPD_UIL, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_UIL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_UIL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_UIL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, UPD_UIL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, UPD_UIL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, UPD_UIL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, UPD_UIL, MCMode.ENABLE);
		p.Btn_upd02.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.Btn_upd03.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.Btn_upd04.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.Btn_act_qty_keep_flg.putMode(p, UPD_UIL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, UPD_UIL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, UPD_UIL, MCMode.DISABLE);
		p.Btn_del02.putMode(p, UPD_UIL, MCMode.DISABLE);
		p.Btn_del03.putMode(p, UPD_UIL, MCMode.DISABLE);

	}

	/**
	 * [UPD_UIL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UIL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Top(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Fold(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, UPD_UII, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, UPD_UII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, UPD_UII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, UPD_UII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, UPD_UII, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_UII]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UII]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_ctrl_tgt_dt.putMode(p, UPD_UII, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_UII]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, UPD_UII, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, UPD_UII, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_UII, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_UII, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_UII]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, UPD_UII, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, UPD_UII, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, UPD_UII, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, UPD_UII, MCMode.ENABLE);
		p.Btn_upd02.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.Btn_upd03.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.Btn_upd04.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.Btn_act_qty_keep_flg.putMode(p, UPD_UII, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, UPD_UII, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, UPD_UII, MCMode.DISABLE);
		p.Btn_del02.putMode(p, UPD_UII, MCMode.DISABLE);
		p.Btn_del03.putMode(p, UPD_UII, MCMode.DISABLE);

	}

	/**
	 * [UPD_UII]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UII_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Top(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Fold(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, UPD_UTM, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, UPD_UTM, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, UPD_UTM, MCMode.REQUIRED);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [UPD_UTM]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTM]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_ctrl_tgt_dt.putMode(p, UPD_UTM, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_UTM]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, UPD_UTM, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.columnRslt_stktk_intr_rmrks.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_UTM, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_UTM, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_UTM]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, UPD_UTM, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, UPD_UTM, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, UPD_UTM, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_UTM, MCMode.REQUIRED);
		p.Btn_add_io_ctrl_flg.putMode(p, UPD_UTM, MCMode.REQUIRED);
		p.Btn_upd01.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.Btn_upd02.putMode(p, UPD_UTM, MCMode.ENABLE);
		p.Btn_upd03.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.Btn_upd04.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.Btn_act_qty_keep_flg.putMode(p, UPD_UTM, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, UPD_UTM, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, UPD_UTM, MCMode.DISABLE);
		p.Btn_del02.putMode(p, UPD_UTM, MCMode.DISABLE);
		p.Btn_del03.putMode(p, UPD_UTM, MCMode.DISABLE);

	}

	/**
	 * [UPD_UTM]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTM_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Top(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, UPD_UTL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, UPD_UTL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, UPD_UTL, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [UPD_UTL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_ctrl_tgt_dt.putMode(p, UPD_UTL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_UTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, UPD_UTL, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.columnRslt_stktk_intr_rmrks.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_UTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_UTL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_UTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, UPD_UTL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, UPD_UTL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, UPD_UTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_UTL, MCMode.REQUIRED);
		p.Btn_add_io_ctrl_flg.putMode(p, UPD_UTL, MCMode.REQUIRED);
		p.Btn_upd01.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.Btn_upd02.putMode(p, UPD_UTL, MCMode.ENABLE);
		p.Btn_upd03.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.Btn_upd04.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.Btn_act_qty_keep_flg.putMode(p, UPD_UTL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, UPD_UTL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, UPD_UTL, MCMode.DISABLE);
		p.Btn_del02.putMode(p, UPD_UTL, MCMode.DISABLE);
		p.Btn_del03.putMode(p, UPD_UTL, MCMode.DISABLE);

	}

	/**
	 * [UPD_UTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Top(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Fold(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, UPD_UTI, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, UPD_UTI, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, UPD_UTI, MCMode.REQUIRED);
		p.Cnd_stktk_ym.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_UTI]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UTI]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_ctrl_tgt_dt.putMode(p, UPD_UTI, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_UTI]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, UPD_UTI, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.columnRslt_stktk_intr_rmrks.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_UTI, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_UTI, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_UTI]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, UPD_UTI, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, UPD_UTI, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, UPD_UTI, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_UTI, MCMode.REQUIRED);
		p.Btn_add_io_ctrl_flg.putMode(p, UPD_UTI, MCMode.REQUIRED);
		p.Btn_upd01.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.Btn_upd02.putMode(p, UPD_UTI, MCMode.ENABLE);
		p.Btn_upd03.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.Btn_upd04.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.Btn_act_qty_keep_flg.putMode(p, UPD_UTI, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, UPD_UTI, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, UPD_UTI, MCMode.DISABLE);
		p.Btn_del02.putMode(p, UPD_UTI, MCMode.DISABLE);
		p.Btn_del03.putMode(p, UPD_UTI, MCMode.DISABLE);

	}

	/**
	 * [UPD_UTI]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UTI_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Top(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Fold(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, UPD_UF, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, UPD_UF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_UF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [UPD_UF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_ctrl_tgt_dt.putMode(p, UPD_UF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_UF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, UPD_UF, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, UPD_UF, MCMode.REQUIRED);
		p.columnRslt_ctrl_tgt_dt.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, UPD_UF, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_UF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, UPD_UF, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, UPD_UF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_UF, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_UF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_prnt_invlist.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_prnt_difflist.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, UPD_UF, MCMode.INVISIBLE);
		p.Btn_upd02.putMode(p, UPD_UF, MCMode.INVISIBLE);
		p.Btn_upd03.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_upd04.putMode(p, UPD_UF, MCMode.ENABLE);
		p.Btn_act_qty_keep_flg.putMode(p, UPD_UF, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, UPD_UF, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, UPD_UF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, UPD_UF, MCMode.DISABLE);
		p.Btn_del02.putMode(p, UPD_UF, MCMode.DISABLE);
		p.Btn_del03.putMode(p, UPD_UF, MCMode.DISABLE);

	}

	/**
	 * [UPD_UF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__UF_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Top(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Fold(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, DEL_DIL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, DEL_DIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, DEL_DIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, DEL_DIL, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [DEL_DIL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DIL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, DEL_DIL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DIL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, DEL_DIL, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, DEL_DIL, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_DIL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, DEL_DIL, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, DEL_DIL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_DIL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_DIL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, DEL_DIL, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, DEL_DIL, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, DEL_DIL, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, DEL_DIL, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, DEL_DIL, MCMode.ENABLE);
		p.Btn_del02.putMode(p, DEL_DIL, MCMode.INVISIBLE);
		p.Btn_del03.putMode(p, DEL_DIL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DIL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DIL_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Top(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Fold(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, DEL_DII, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, DEL_DII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, DEL_DII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, DEL_DII, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_DII]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DII]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, DEL_DII, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DII]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, DEL_DII, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, DEL_DII, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, DEL_DII, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_DII, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, DEL_DII, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, DEL_DII, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_DII, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_DII]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_prnt_invlist.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, DEL_DII, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, DEL_DII, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, DEL_DII, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, DEL_DII, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, DEL_DII, MCMode.ENABLE);
		p.Btn_del02.putMode(p, DEL_DII, MCMode.INVISIBLE);
		p.Btn_del03.putMode(p, DEL_DII, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DII]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DII_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Top(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Fold(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, DEL_DTML, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, DEL_DTML, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [DEL_DTML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTML]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, DEL_DTML, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DTML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, DEL_DTML, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, DEL_DTML, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.columnRslt_stktk_intr_rmrks.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_DTML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, DEL_DTML, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, DEL_DTML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_DTML, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_DTML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Btn_prnt_invlist.putMode(p, DEL_DTML, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, DEL_DTML, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, DEL_DTML, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, DEL_DTML, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, DEL_DTML, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, DEL_DTML, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, DEL_DTML, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, DEL_DTML, MCMode.REQUIRED);
		p.Btn_invlist_flg.putMode(p, DEL_DTML, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, DEL_DTML, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, DEL_DTML, MCMode.INVISIBLE);
		p.Btn_del02.putMode(p, DEL_DTML, MCMode.ENABLE);
		p.Btn_del03.putMode(p, DEL_DTML, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DTML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTML_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Top(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Fold(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, DEL_DTI, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, DEL_DTI, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_DTI]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DTI]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, DEL_DTI, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DTI]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, DEL_DTI, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, DEL_DTI, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.columnRslt_stktk_intr_rmrks.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_DTI, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, DEL_DTI, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, DEL_DTI, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_DTI, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_DTI]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Btn_prnt_invlist.putMode(p, DEL_DTI, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, DEL_DTI, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, DEL_DTI, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, DEL_DTI, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, DEL_DTI, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, DEL_DTI, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, DEL_DTI, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, DEL_DTI, MCMode.REQUIRED);
		p.Btn_invlist_flg.putMode(p, DEL_DTI, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, DEL_DTI, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, DEL_DTI, MCMode.INVISIBLE);
		p.Btn_del02.putMode(p, DEL_DTI, MCMode.ENABLE);
		p.Btn_del03.putMode(p, DEL_DTI, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DTI]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DTI_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Top(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Fold(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, DEL_DF, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, DEL_DF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_wtg.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_rfl.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_DF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [DEL_DF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, DEL_DF, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_DF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, DEL_DF, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, DEL_DF, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_DF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_DF, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_DF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Btn_prnt_invlist.putMode(p, DEL_DF, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, DEL_DF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_DF, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, DEL_DF, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, DEL_DF, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, DEL_DF, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, DEL_DF, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, DEL_DF, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.Btn_del02.putMode(p, DEL_DF, MCMode.INVISIBLE);
		p.Btn_del03.putMode(p, DEL_DF, MCMode.ENABLE);

	}

	/**
	 * [DEL_DF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__DF_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_wtg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_st.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ctrl_tgt_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_not_chk_tor_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.columnRslt_stktk_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
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
	protected static void statusInitPRNT_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_invlist.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_difflist.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del02.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del03.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_OpeTyp(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_StktkList p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stktk_sts_wtg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_st.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_stktk_sts_rfl.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ctrl_tgt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stktk_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ctrl_tgt_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctrl_tgt_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_act_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stktk_rpt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stktk_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_invlist_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_invlist_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_difflist_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_difflist_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[StktkSts]ブロックのモードの設定
	 */
	protected static void statusInitREF_StktkSts(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_StktkList p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBEP_StktkList p){
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_ctrl_tgt_dt.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_StktkList p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_not_chk_tor_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ctrl_tgt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_stktk_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_ctrl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_qty_keep_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_last_stktk_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_st_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff_upd_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_latest_stktk_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_stktk_rpt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stktk_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pre_stktk_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Btn(MSBEP_StktkList p){
		p.Btn_open_MSBEP2620.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_invlist.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_difflist.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_add_io_ctrl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_upd01.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd03.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd04.putMode(p, REF, MCMode.DISABLE);
		p.Btn_act_qty_keep_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_invlist_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_difflist_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del02.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del03.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_StktkList p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_UIL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_StktkList_MC.setTableConfigRslt((MSBEP_StktkList)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_StktkList p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_not_chk_tor_flg.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.not_chk_tor_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_chk_tor_flg);
		p.columnRslt_ctrl_tgt_dt.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.ctrl_tgt_dt_META);
		p.columnRslt_ctrl_tgt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ctrl_tgt_dt);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.columnRslt_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_cd);
		p.columnRslt_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_nm);
		p.columnRslt_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.alloc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_cd);
		p.columnRslt_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.alloc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_stktk_typ.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_typ);
		p.columnRslt_stktk_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_typ_nm);
		p.columnRslt_stktk_sts_typ.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_sts_typ);
		p.columnRslt_stktk_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_sts_typ_nm);
		p.columnRslt_io_ctrl_flg.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.io_ctrl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_ctrl_flg);
		p.columnRslt_act_qty_keep_flg.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.act_qty_keep_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_qty_keep_flg);
		p.columnRslt_last_stktk_dt.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.last_stktk_dt_META);
		p.columnRslt_last_stktk_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_last_stktk_dt);
		p.columnRslt_stktk_st_tm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_st_tm_META);
		p.columnRslt_stktk_st_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_st_tm);
		p.columnRslt_diff_upd_tm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.diff_upd_tm_META);
		p.columnRslt_diff_upd_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_diff_upd_tm);
		p.columnRslt_latest_stktk_st_dt.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.latest_stktk_st_dt_META);
		p.columnRslt_latest_stktk_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_latest_stktk_st_dt);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_act_dpt_nm);
		p.columnRslt_stktk_rpt_rmrks.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_rpt_rmrks);
		p.columnRslt_stktk_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_stktk_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.stktk_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stktk_upd_cntr);
		p.columnRslt_pre_stktk_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.pre_stktk_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_stktk_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP2610.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_act_usr_cd.getListConfig().setPutter(getCnd_act_usr_cd_ListPutter());
		Cnd_act_dpt_cd.getListConfig().setPutter(getCnd_act_dpt_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_UIL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UILStatus() {
		status = SRCH_UIL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UII]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UIIStatus() {
		status = SRCH_UII;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UTM]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UTMStatus() {
		status = SRCH_UTM;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UTLStatus() {
		status = SRCH_UTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UTI]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UTIStatus() {
		status = SRCH_UTI;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UFStatus() {
		status = SRCH_UF;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DIL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DILStatus() {
		status = SRCH_DIL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DII]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DIIStatus() {
		status = SRCH_DII;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DTM]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DTMStatus() {
		status = SRCH_DTM;
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
	 * この画面を[SRCH_DTI]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DTIStatus() {
		status = SRCH_DTI;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DFStatus() {
		status = SRCH_DF;
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
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_UIL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UILStatus() {
		status = UPD_UIL;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_UII]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UIIStatus() {
		status = UPD_UII;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_UTM]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UTMStatus() {
		status = UPD_UTM;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_UTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UTLStatus() {
		status = UPD_UTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_UTI]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UTIStatus() {
		status = UPD_UTI;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_UF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UFStatus() {
		status = UPD_UF;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_DIL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_DILStatus() {
		status = DEL_DIL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_DII]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_DIIStatus() {
		status = DEL_DII;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_DTML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_DTMLStatus() {
		status = DEL_DTML;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_DTI]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_DTIStatus() {
		status = DEL_DTI;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_DF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_DFStatus() {
		status = DEL_DF;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_UIL.equals(status)) {
			setSRCH_UILStatus();
		}
		else if (SRCH_UII.equals(status)) {
			setSRCH_UIIStatus();
		}
		else if (SRCH_UTM.equals(status)) {
			setSRCH_UTMStatus();
		}
		else if (SRCH_UTL.equals(status)) {
			setSRCH_UTLStatus();
		}
		else if (SRCH_UTI.equals(status)) {
			setSRCH_UTIStatus();
		}
		else if (SRCH_UF.equals(status)) {
			setSRCH_UFStatus();
		}
		else if (SRCH_DIL.equals(status)) {
			setSRCH_DILStatus();
		}
		else if (SRCH_DII.equals(status)) {
			setSRCH_DIIStatus();
		}
		else if (SRCH_DTM.equals(status)) {
			setSRCH_DTMStatus();
		}
		else if (SRCH_DTL.equals(status)) {
			setSRCH_DTLStatus();
		}
		else if (SRCH_DTI.equals(status)) {
			setSRCH_DTIStatus();
		}
		else if (SRCH_DF.equals(status)) {
			setSRCH_DFStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (UPD_UIL.equals(status)) {
			setUPD_UILStatus();
		}
		else if (UPD_UII.equals(status)) {
			setUPD_UIIStatus();
		}
		else if (UPD_UTM.equals(status)) {
			setUPD_UTMStatus();
		}
		else if (UPD_UTL.equals(status)) {
			setUPD_UTLStatus();
		}
		else if (UPD_UTI.equals(status)) {
			setUPD_UTIStatus();
		}
		else if (UPD_UF.equals(status)) {
			setUPD_UFStatus();
		}
		else if (DEL_DIL.equals(status)) {
			setDEL_DILStatus();
		}
		else if (DEL_DII.equals(status)) {
			setDEL_DIIStatus();
		}
		else if (DEL_DTML.equals(status)) {
			setDEL_DTMLStatus();
		}
		else if (DEL_DTI.equals(status)) {
			setDEL_DTIStatus();
		}
		else if (DEL_DF.equals(status)) {
			setDEL_DFStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
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
	 * [Cnd_act_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_act_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_act_usr_cd) return getCnd_act_usr_cd(row, info);
		if(combo == Cnd_act_dpt_cd) return getCnd_act_dpt_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
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
		else if (ap == Btn_open_MSBEP2620) doBtn_open_MSBEP2620(info);
		else if (ap == Btn_prnt_invlist) doBtn_prnt_invlist(info);
		else if (ap == Btn_prnt_difflist) doBtn_prnt_difflist(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd01) doBtn_upd01(info);
		else if (ap == Btn_upd02) doBtn_upd02(info);
		else if (ap == Btn_upd03) doBtn_upd03(info);
		else if (ap == Btn_upd04) doBtn_upd04(info);
		else if (ap == Btn_del01) doBtn_del01(info);
		else if (ap == Btn_del02) doBtn_del02(info);
		else if (ap == Btn_del03) doBtn_del03(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP2620]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2620(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_invlist]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_invlist(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_difflist]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_difflist(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd01(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd02(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd03]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd03(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd04]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd04(MCEventInfo info);

	/**
	 * [Btn]パネルの[del01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del01(MCEventInfo info);

	/**
	 * [Btn]パネルの[del02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del02(MCEventInfo info);

	/**
	 * [Btn]パネルの[del03]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del03(MCEventInfo info);

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
		if (vc == Cnd_tgt_Group) return doCnd_tgt_VC(info);
		if (vc == Cnd_stktk_sts_wtg) return doCnd_stktk_sts_wtg_VC(info);
		if (vc == Cnd_stktk_sts_st) return doCnd_stktk_sts_st_VC(info);
		if (vc == Cnd_stktk_sts_rfl) return doCnd_stktk_sts_rfl_VC(info);
		if (vc == Cnd_ctrl_tgt_dt) return doCnd_ctrl_tgt_dt_VC(info);
		if (vc == Cnd_stktk_ym) return doCnd_stktk_ym_VC(info);
		if (vc == Cnd_ctrl_tgt_dt_fr) return doCnd_ctrl_tgt_dt_fr_VC(info);
		if (vc == Cnd_ctrl_tgt_dt_to) return doCnd_ctrl_tgt_dt_to_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_act_usr_cd) return doCnd_act_usr_cd_VC(info);
		if (vc == Cnd_act_usr_nm) return doCnd_act_usr_nm_VC(info);
		if (vc == Cnd_act_dpt_cd) return doCnd_act_dpt_cd_VC(info);
		if (vc == Cnd_act_dpt_nm) return doCnd_act_dpt_nm_VC(info);
		if (vc == Cnd_stktk_rpt_rmrks) return doCnd_stktk_rpt_rmrks_VC(info);
		if (vc == Cnd_stktk_intr_rmrks) return doCnd_stktk_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_not_invlist_flg) return doCnd_not_invlist_flg_VC(info);
		if (vc == Cnd_invlist_flg) return doCnd_invlist_flg_VC(info);
		if (vc == Cnd_not_difflist_flg) return doCnd_not_difflist_flg_VC(info);
		if (vc == Cnd_difflist_flg) return doCnd_difflist_flg_VC(info);
		if (vc == BulkSet_ctrl_tgt_dt) return doBulkSet_ctrl_tgt_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_not_chk_tor_flg) return doRslt_not_chk_tor_flg_VC(info);
		if (vc == columnRslt_ctrl_tgt_dt) return doRslt_ctrl_tgt_dt_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_loc_grp_cd) return doRslt_loc_grp_cd_VC(info);
		if (vc == columnRslt_loc_grp_nm) return doRslt_loc_grp_nm_VC(info);
		if (vc == columnRslt_alloc_grp_cd) return doRslt_alloc_grp_cd_VC(info);
		if (vc == columnRslt_alloc_grp_nm) return doRslt_alloc_grp_nm_VC(info);
		if (vc == columnRslt_stktk_typ) return doRslt_stktk_typ_VC(info);
		if (vc == columnRslt_stktk_typ_nm) return doRslt_stktk_typ_nm_VC(info);
		if (vc == columnRslt_stktk_sts_typ) return doRslt_stktk_sts_typ_VC(info);
		if (vc == columnRslt_stktk_sts_typ_nm) return doRslt_stktk_sts_typ_nm_VC(info);
		if (vc == columnRslt_io_ctrl_flg) return doRslt_io_ctrl_flg_VC(info);
		if (vc == columnRslt_act_qty_keep_flg) return doRslt_act_qty_keep_flg_VC(info);
		if (vc == columnRslt_last_stktk_dt) return doRslt_last_stktk_dt_VC(info);
		if (vc == columnRslt_stktk_st_tm) return doRslt_stktk_st_tm_VC(info);
		if (vc == columnRslt_diff_upd_tm) return doRslt_diff_upd_tm_VC(info);
		if (vc == columnRslt_latest_stktk_st_dt) return doRslt_latest_stktk_st_dt_VC(info);
		if (vc == columnRslt_stktk_rpt_rmrks) return doRslt_stktk_rpt_rmrks_VC(info);
		if (vc == columnRslt_stktk_intr_rmrks) return doRslt_stktk_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_stktk_upd_cntr) return doRslt_stktk_upd_cntr_VC(info);
		if (vc == columnRslt_pre_stktk_upd_cntr) return doRslt_pre_stktk_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == Btn_prnt_flg) return doBtn_prnt_flg_VC(info);
		if (vc == Btn_add_io_ctrl_flg) return doBtn_add_io_ctrl_flg_VC(info);
		if (vc == Btn_act_qty_keep_flg) return doBtn_act_qty_keep_flg_VC(info);
		if (vc == Btn_invlist_flg) return doBtn_invlist_flg_VC(info);
		if (vc == Btn_difflist_flg) return doBtn_difflist_flg_VC(info);
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
	 * [Cnd]パネルの[tgt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stktk_sts_wtg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stktk_sts_wtg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stktk_sts_st]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stktk_sts_st_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stktk_sts_rfl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stktk_sts_rfl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctrl_tgt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stktk_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stktk_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctrl_tgt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctrl_tgt_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stktk_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stktk_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stktk_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stktk_intr_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_invlist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_invlist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[invlist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_invlist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_difflist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_difflist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[difflist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_difflist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ctrl_tgt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ctrl_tgt_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_chk_tor_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_chk_tor_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctrl_tgt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctrl_tgt_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_ctrl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_ctrl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_qty_keep_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_qty_keep_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_stktk_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_stktk_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_st_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_st_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff_upd_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff_upd_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[latest_stktk_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_latest_stktk_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stktk_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stktk_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stktk_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_stktk_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_stktk_upd_cntr_VC(MCEventInfo info){
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
	 * [Btn]パネルの[add_io_ctrl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_add_io_ctrl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[act_qty_keep_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_act_qty_keep_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[invlist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_invlist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[difflist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_difflist_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_tgt_Group) doCnd_tgt_NC(info);
		else if (nc == Cnd_stktk_sts_wtg) doCnd_stktk_sts_wtg_NC(info);
		else if (nc == Cnd_stktk_sts_st) doCnd_stktk_sts_st_NC(info);
		else if (nc == Cnd_stktk_sts_rfl) doCnd_stktk_sts_rfl_NC(info);
		else if (nc == Cnd_ctrl_tgt_dt) doCnd_ctrl_tgt_dt_NC(info);
		else if (nc == Cnd_stktk_ym) doCnd_stktk_ym_NC(info);
		else if (nc == Cnd_ctrl_tgt_dt_fr) doCnd_ctrl_tgt_dt_fr_NC(info);
		else if (nc == Cnd_ctrl_tgt_dt_to) doCnd_ctrl_tgt_dt_to_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_act_usr_cd) doCnd_act_usr_cd_NC(info);
		else if (nc == Cnd_act_usr_nm) doCnd_act_usr_nm_NC(info);
		else if (nc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NC(info);
		else if (nc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NC(info);
		else if (nc == Cnd_stktk_rpt_rmrks) doCnd_stktk_rpt_rmrks_NC(info);
		else if (nc == Cnd_stktk_intr_rmrks) doCnd_stktk_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_not_invlist_flg) doCnd_not_invlist_flg_NC(info);
		else if (nc == Cnd_invlist_flg) doCnd_invlist_flg_NC(info);
		else if (nc == Cnd_not_difflist_flg) doCnd_not_difflist_flg_NC(info);
		else if (nc == Cnd_difflist_flg) doCnd_difflist_flg_NC(info);
		else if (nc == BulkSet_ctrl_tgt_dt) doBulkSet_ctrl_tgt_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_not_chk_tor_flg) doRslt_not_chk_tor_flg_NC(info);
		else if (nc == columnRslt_ctrl_tgt_dt) doRslt_ctrl_tgt_dt_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NC(info);
		else if (nc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NC(info);
		else if (nc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NC(info);
		else if (nc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NC(info);
		else if (nc == columnRslt_stktk_typ) doRslt_stktk_typ_NC(info);
		else if (nc == columnRslt_stktk_typ_nm) doRslt_stktk_typ_nm_NC(info);
		else if (nc == columnRslt_stktk_sts_typ) doRslt_stktk_sts_typ_NC(info);
		else if (nc == columnRslt_stktk_sts_typ_nm) doRslt_stktk_sts_typ_nm_NC(info);
		else if (nc == columnRslt_io_ctrl_flg) doRslt_io_ctrl_flg_NC(info);
		else if (nc == columnRslt_act_qty_keep_flg) doRslt_act_qty_keep_flg_NC(info);
		else if (nc == columnRslt_last_stktk_dt) doRslt_last_stktk_dt_NC(info);
		else if (nc == columnRslt_stktk_st_tm) doRslt_stktk_st_tm_NC(info);
		else if (nc == columnRslt_diff_upd_tm) doRslt_diff_upd_tm_NC(info);
		else if (nc == columnRslt_latest_stktk_st_dt) doRslt_latest_stktk_st_dt_NC(info);
		else if (nc == columnRslt_stktk_rpt_rmrks) doRslt_stktk_rpt_rmrks_NC(info);
		else if (nc == columnRslt_stktk_intr_rmrks) doRslt_stktk_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_stktk_upd_cntr) doRslt_stktk_upd_cntr_NC(info);
		else if (nc == columnRslt_pre_stktk_upd_cntr) doRslt_pre_stktk_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == Btn_prnt_flg) doBtn_prnt_flg_NC(info);
		else if (nc == Btn_add_io_ctrl_flg) doBtn_add_io_ctrl_flg_NC(info);
		else if (nc == Btn_act_qty_keep_flg) doBtn_act_qty_keep_flg_NC(info);
		else if (nc == Btn_invlist_flg) doBtn_invlist_flg_NC(info);
		else if (nc == Btn_difflist_flg) doBtn_difflist_flg_NC(info);
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
	 * [Cnd]パネルの[tgt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_wtg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_wtg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_st]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_st_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_rfl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_rfl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_intr_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_invlist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_invlist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[invlist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_invlist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_difflist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_difflist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[difflist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_difflist_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ctrl_tgt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ctrl_tgt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_chk_tor_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_chk_tor_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctrl_tgt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctrl_tgt_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_ctrl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_ctrl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_qty_keep_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_qty_keep_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_stktk_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_stktk_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_st_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_st_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_upd_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_upd_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_stktk_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_stktk_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stktk_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_stktk_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_stktk_upd_cntr_NC(MCEventInfo info){
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
	 * [Btn]パネルの[add_io_ctrl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_add_io_ctrl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[act_qty_keep_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_act_qty_keep_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[invlist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_invlist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[difflist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_difflist_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_tgt_Group) doCnd_tgt_NE(info);
		else if (ne == Cnd_stktk_sts_wtg) doCnd_stktk_sts_wtg_NE(info);
		else if (ne == Cnd_stktk_sts_st) doCnd_stktk_sts_st_NE(info);
		else if (ne == Cnd_stktk_sts_rfl) doCnd_stktk_sts_rfl_NE(info);
		else if (ne == Cnd_ctrl_tgt_dt) doCnd_ctrl_tgt_dt_NE(info);
		else if (ne == Cnd_stktk_ym) doCnd_stktk_ym_NE(info);
		else if (ne == Cnd_ctrl_tgt_dt_fr) doCnd_ctrl_tgt_dt_fr_NE(info);
		else if (ne == Cnd_ctrl_tgt_dt_to) doCnd_ctrl_tgt_dt_to_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_act_usr_cd) doCnd_act_usr_cd_NE(info);
		else if (ne == Cnd_act_usr_nm) doCnd_act_usr_nm_NE(info);
		else if (ne == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NE(info);
		else if (ne == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NE(info);
		else if (ne == Cnd_stktk_rpt_rmrks) doCnd_stktk_rpt_rmrks_NE(info);
		else if (ne == Cnd_stktk_intr_rmrks) doCnd_stktk_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_not_invlist_flg) doCnd_not_invlist_flg_NE(info);
		else if (ne == Cnd_invlist_flg) doCnd_invlist_flg_NE(info);
		else if (ne == Cnd_not_difflist_flg) doCnd_not_difflist_flg_NE(info);
		else if (ne == Cnd_difflist_flg) doCnd_difflist_flg_NE(info);
		else if (ne == BulkSet_ctrl_tgt_dt) doBulkSet_ctrl_tgt_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_not_chk_tor_flg) doRslt_not_chk_tor_flg_NE(info);
		else if (ne == columnRslt_ctrl_tgt_dt) doRslt_ctrl_tgt_dt_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NE(info);
		else if (ne == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NE(info);
		else if (ne == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NE(info);
		else if (ne == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NE(info);
		else if (ne == columnRslt_stktk_typ) doRslt_stktk_typ_NE(info);
		else if (ne == columnRslt_stktk_typ_nm) doRslt_stktk_typ_nm_NE(info);
		else if (ne == columnRslt_stktk_sts_typ) doRslt_stktk_sts_typ_NE(info);
		else if (ne == columnRslt_stktk_sts_typ_nm) doRslt_stktk_sts_typ_nm_NE(info);
		else if (ne == columnRslt_io_ctrl_flg) doRslt_io_ctrl_flg_NE(info);
		else if (ne == columnRslt_act_qty_keep_flg) doRslt_act_qty_keep_flg_NE(info);
		else if (ne == columnRslt_last_stktk_dt) doRslt_last_stktk_dt_NE(info);
		else if (ne == columnRslt_stktk_st_tm) doRslt_stktk_st_tm_NE(info);
		else if (ne == columnRslt_diff_upd_tm) doRslt_diff_upd_tm_NE(info);
		else if (ne == columnRslt_latest_stktk_st_dt) doRslt_latest_stktk_st_dt_NE(info);
		else if (ne == columnRslt_stktk_rpt_rmrks) doRslt_stktk_rpt_rmrks_NE(info);
		else if (ne == columnRslt_stktk_intr_rmrks) doRslt_stktk_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_stktk_upd_cntr) doRslt_stktk_upd_cntr_NE(info);
		else if (ne == columnRslt_pre_stktk_upd_cntr) doRslt_pre_stktk_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == Btn_prnt_flg) doBtn_prnt_flg_NE(info);
		else if (ne == Btn_add_io_ctrl_flg) doBtn_add_io_ctrl_flg_NE(info);
		else if (ne == Btn_act_qty_keep_flg) doBtn_act_qty_keep_flg_NE(info);
		else if (ne == Btn_invlist_flg) doBtn_invlist_flg_NE(info);
		else if (ne == Btn_difflist_flg) doBtn_difflist_flg_NE(info);
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
	 * [Cnd]パネルの[tgt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_wtg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_wtg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_st]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_st_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_rfl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_rfl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[act_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_intr_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[not_invlist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_invlist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[invlist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_invlist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_difflist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_difflist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[difflist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_difflist_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ctrl_tgt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ctrl_tgt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_chk_tor_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_chk_tor_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctrl_tgt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctrl_tgt_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_ctrl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_ctrl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_qty_keep_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_qty_keep_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_stktk_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_stktk_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_st_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_st_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_upd_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_upd_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_stktk_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_stktk_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stktk_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_stktk_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_stktk_upd_cntr_NE(MCEventInfo info){
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
	 * [Btn]パネルの[add_io_ctrl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_add_io_ctrl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[act_qty_keep_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_act_qty_keep_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[invlist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_invlist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[difflist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_difflist_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_tgt_Group) doCnd_tgt_NX(info);
		else if (nx == Cnd_stktk_sts_wtg) doCnd_stktk_sts_wtg_NX(info);
		else if (nx == Cnd_stktk_sts_st) doCnd_stktk_sts_st_NX(info);
		else if (nx == Cnd_stktk_sts_rfl) doCnd_stktk_sts_rfl_NX(info);
		else if (nx == Cnd_ctrl_tgt_dt) doCnd_ctrl_tgt_dt_NX(info);
		else if (nx == Cnd_stktk_ym) doCnd_stktk_ym_NX(info);
		else if (nx == Cnd_ctrl_tgt_dt_fr) doCnd_ctrl_tgt_dt_fr_NX(info);
		else if (nx == Cnd_ctrl_tgt_dt_to) doCnd_ctrl_tgt_dt_to_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_act_usr_cd) doCnd_act_usr_cd_NX(info);
		else if (nx == Cnd_act_usr_nm) doCnd_act_usr_nm_NX(info);
		else if (nx == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NX(info);
		else if (nx == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NX(info);
		else if (nx == Cnd_stktk_rpt_rmrks) doCnd_stktk_rpt_rmrks_NX(info);
		else if (nx == Cnd_stktk_intr_rmrks) doCnd_stktk_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_not_invlist_flg) doCnd_not_invlist_flg_NX(info);
		else if (nx == Cnd_invlist_flg) doCnd_invlist_flg_NX(info);
		else if (nx == Cnd_not_difflist_flg) doCnd_not_difflist_flg_NX(info);
		else if (nx == Cnd_difflist_flg) doCnd_difflist_flg_NX(info);
		else if (nx == BulkSet_ctrl_tgt_dt) doBulkSet_ctrl_tgt_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_not_chk_tor_flg) doRslt_not_chk_tor_flg_NX(info);
		else if (nx == columnRslt_ctrl_tgt_dt) doRslt_ctrl_tgt_dt_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NX(info);
		else if (nx == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NX(info);
		else if (nx == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NX(info);
		else if (nx == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NX(info);
		else if (nx == columnRslt_stktk_typ) doRslt_stktk_typ_NX(info);
		else if (nx == columnRslt_stktk_typ_nm) doRslt_stktk_typ_nm_NX(info);
		else if (nx == columnRslt_stktk_sts_typ) doRslt_stktk_sts_typ_NX(info);
		else if (nx == columnRslt_stktk_sts_typ_nm) doRslt_stktk_sts_typ_nm_NX(info);
		else if (nx == columnRslt_io_ctrl_flg) doRslt_io_ctrl_flg_NX(info);
		else if (nx == columnRslt_act_qty_keep_flg) doRslt_act_qty_keep_flg_NX(info);
		else if (nx == columnRslt_last_stktk_dt) doRslt_last_stktk_dt_NX(info);
		else if (nx == columnRslt_stktk_st_tm) doRslt_stktk_st_tm_NX(info);
		else if (nx == columnRslt_diff_upd_tm) doRslt_diff_upd_tm_NX(info);
		else if (nx == columnRslt_latest_stktk_st_dt) doRslt_latest_stktk_st_dt_NX(info);
		else if (nx == columnRslt_stktk_rpt_rmrks) doRslt_stktk_rpt_rmrks_NX(info);
		else if (nx == columnRslt_stktk_intr_rmrks) doRslt_stktk_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_stktk_upd_cntr) doRslt_stktk_upd_cntr_NX(info);
		else if (nx == columnRslt_pre_stktk_upd_cntr) doRslt_pre_stktk_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == Btn_prnt_flg) doBtn_prnt_flg_NX(info);
		else if (nx == Btn_add_io_ctrl_flg) doBtn_add_io_ctrl_flg_NX(info);
		else if (nx == Btn_act_qty_keep_flg) doBtn_act_qty_keep_flg_NX(info);
		else if (nx == Btn_invlist_flg) doBtn_invlist_flg_NX(info);
		else if (nx == Btn_difflist_flg) doBtn_difflist_flg_NX(info);
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
	 * [Cnd]パネルの[tgt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_wtg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_wtg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_st]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_st_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_sts_rfl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_sts_rfl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[act_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_intr_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[not_invlist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_invlist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[invlist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_invlist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_difflist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_difflist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[difflist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_difflist_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ctrl_tgt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ctrl_tgt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_chk_tor_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_chk_tor_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctrl_tgt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctrl_tgt_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_ctrl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_ctrl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_qty_keep_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_qty_keep_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_stktk_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_stktk_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_st_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_st_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_upd_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_upd_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_stktk_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_stktk_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stktk_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_stktk_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_stktk_upd_cntr_NX(MCEventInfo info){
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
	 * [Btn]パネルの[add_io_ctrl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_add_io_ctrl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[act_qty_keep_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_act_qty_keep_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[invlist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_invlist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[difflist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_difflist_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ctrl_tgt_dt) doCnd_ctrl_tgt_dt_LC(info);
		else if (lc == Cnd_stktk_ym) doCnd_stktk_ym_LC(info);
		else if (lc == Cnd_ctrl_tgt_dt_fr) doCnd_ctrl_tgt_dt_fr_LC(info);
		else if (lc == Cnd_ctrl_tgt_dt_to) doCnd_ctrl_tgt_dt_to_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_act_usr_cd) doCnd_act_usr_cd_LC(info);
		else if (lc == Cnd_act_usr_nm) doCnd_act_usr_nm_LC(info);
		else if (lc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_LC(info);
		else if (lc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_LC(info);
		else if (lc == Cnd_stktk_rpt_rmrks) doCnd_stktk_rpt_rmrks_LC(info);
		else if (lc == Cnd_stktk_intr_rmrks) doCnd_stktk_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_ctrl_tgt_dt) doBulkSet_ctrl_tgt_dt_LC(info);
		else if (lc == columnRslt_ctrl_tgt_dt) doRslt_ctrl_tgt_dt_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_LC(info);
		else if (lc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_LC(info);
		else if (lc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_LC(info);
		else if (lc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_LC(info);
		else if (lc == columnRslt_stktk_typ) doRslt_stktk_typ_LC(info);
		else if (lc == columnRslt_stktk_typ_nm) doRslt_stktk_typ_nm_LC(info);
		else if (lc == columnRslt_stktk_sts_typ) doRslt_stktk_sts_typ_LC(info);
		else if (lc == columnRslt_stktk_sts_typ_nm) doRslt_stktk_sts_typ_nm_LC(info);
		else if (lc == columnRslt_last_stktk_dt) doRslt_last_stktk_dt_LC(info);
		else if (lc == columnRslt_stktk_st_tm) doRslt_stktk_st_tm_LC(info);
		else if (lc == columnRslt_diff_upd_tm) doRslt_diff_upd_tm_LC(info);
		else if (lc == columnRslt_latest_stktk_st_dt) doRslt_latest_stktk_st_dt_LC(info);
		else if (lc == columnRslt_stktk_rpt_rmrks) doRslt_stktk_rpt_rmrks_LC(info);
		else if (lc == columnRslt_stktk_intr_rmrks) doRslt_stktk_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_stktk_upd_cntr) doRslt_stktk_upd_cntr_LC(info);
		else if (lc == columnRslt_pre_stktk_upd_cntr) doRslt_pre_stktk_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctrl_tgt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctrl_tgt_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stktk_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stktk_intr_rmrks_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[ctrl_tgt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ctrl_tgt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctrl_tgt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctrl_tgt_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_stktk_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_stktk_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_st_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_st_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_upd_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_upd_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[latest_stktk_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_latest_stktk_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stktk_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stktk_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stktk_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_stktk_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_stktk_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
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
	 * コンボ／リストのリスト[Cnd_act_usr_cd]の作成メソッド
	 */
	public MCList getCnd_act_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_act_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
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
		if (id.equals("MS.MSBEL2610.Srch01")) {
			return new MS_MSBEL2610_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch02")) {
			return new MS_MSBEL2610_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch03")) {
			return new MS_MSBEL2610_Srch03Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch04")) {
			return new MS_MSBEL2610_Srch04Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch05")) {
			return new MS_MSBEL2610_Srch05Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch06")) {
			return new MS_MSBEL2610_Srch06Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch07")) {
			return new MS_MSBEL2610_Srch07Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch08")) {
			return new MS_MSBEL2610_Srch08Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch09")) {
			return new MS_MSBEL2610_Srch09Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch10")) {
			return new MS_MSBEL2610_Srch10Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch11")) {
			return new MS_MSBEL2610_Srch11Bridge();
		}
		if (id.equals("MS.MSBEL2610.Srch12")) {
			return new MS_MSBEL2610_Srch12Bridge();
		}
		if (id.equals("MS.MSBEL2610.Upd01")) {
			return new MS_MSBEL2610_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL2610.Upd02")) {
			return new MS_MSBEL2610_Upd02Bridge();
		}
		if (id.equals("MS.MSBEL2610.Upd03")) {
			return new MS_MSBEL2610_Upd03Bridge();
		}
		if (id.equals("MS.MSBEL2610.Upd04")) {
			return new MS_MSBEL2610_Upd04Bridge();
		}
		if (id.equals("MS.MSBEL2610.Del01")) {
			return new MS_MSBEL2610_Del01Bridge();
		}
		if (id.equals("MS.MSBEL2610.Del02")) {
			return new MS_MSBEL2610_Del02Bridge();
		}
		if (id.equals("MS.MSBEL2610.Del03")) {
			return new MS_MSBEL2610_Del03Bridge();
		}
		if (id.equals("MS.MSBEL2610.Prnt01")) {
			return new MS_MSBEL2610_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2610_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch01Bridge() {
			p_MS_MSBEL2610_Srch01 = new MCParam(PDef.MS_MSBEL2610_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch02Bridge() {
			p_MS_MSBEL2610_Srch02 = new MCParam(PDef.MS_MSBEL2610_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch03;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch03Bridge() {
			p_MS_MSBEL2610_Srch03 = new MCParam(PDef.MS_MSBEL2610_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch04;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch04Bridge() {
			p_MS_MSBEL2610_Srch04 = new MCParam(PDef.MS_MSBEL2610_Srch04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch04.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch04.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch04;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch04.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch05]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch05Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch05;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch05Bridge() {
			p_MS_MSBEL2610_Srch05 = new MCParam(PDef.MS_MSBEL2610_Srch05_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch05_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch05 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch05.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch05.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch05.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch05.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch05.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch05;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch05.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch06]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch06Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch06;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch06Bridge() {
			p_MS_MSBEL2610_Srch06 = new MCParam(PDef.MS_MSBEL2610_Srch06_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch06_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch06 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch06.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch06.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch06.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch06.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch06.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch06;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch06.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch07]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch07Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch07;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch07Bridge() {
			p_MS_MSBEL2610_Srch07 = new MCParam(PDef.MS_MSBEL2610_Srch07_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch07_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch07 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch07.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch07.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch07.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch07.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch07.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch07;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch07.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch08]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch08Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch08;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch08Bridge() {
			p_MS_MSBEL2610_Srch08 = new MCParam(PDef.MS_MSBEL2610_Srch08_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch08_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch08 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch08.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch08.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch08.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch08.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch08.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch08;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch08.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch09]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch09Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch09;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch09Bridge() {
			p_MS_MSBEL2610_Srch09 = new MCParam(PDef.MS_MSBEL2610_Srch09_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch09_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch09 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch09.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch09.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch09.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch09.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch09.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch09;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch09.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch10]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch10Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch10;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch10Bridge() {
			p_MS_MSBEL2610_Srch10 = new MCParam(PDef.MS_MSBEL2610_Srch10_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch10_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch10 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch10.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch10.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch10.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch10.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch10.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch10;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch10.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch11]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch11Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch11;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch11Bridge() {
			p_MS_MSBEL2610_Srch11 = new MCParam(PDef.MS_MSBEL2610_Srch11_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch11_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch11 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch11.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch11.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch11.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch11.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch11.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch11;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch11.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Srch12]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch12Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Srch12;

		/** コンストラクタ */
		protected MS_MSBEL2610_Srch12Bridge() {
			p_MS_MSBEL2610_Srch12 = new MCParam(PDef.MS_MSBEL2610_Srch12_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Srch12_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Srch12 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Srch12.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Srch12.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Srch12.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Srch12.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2610.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2610.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Srch12.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Srch12;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Srch12.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL2610_Upd01Bridge() {
			p_MS_MSBEL2610_Upd01 = new MCParam(PDef.MS_MSBEL2610_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Upd02;

		/** コンストラクタ */
		protected MS_MSBEL2610_Upd02Bridge() {
			p_MS_MSBEL2610_Upd02 = new MCParam(PDef.MS_MSBEL2610_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Upd02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL2610_Upd02.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP2610.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP2610.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Upd02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Upd02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Upd03;

		/** コンストラクタ */
		protected MS_MSBEL2610_Upd03Bridge() {
			p_MS_MSBEL2610_Upd03 = new MCParam(PDef.MS_MSBEL2610_Upd03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Upd03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Upd03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Upd03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Upd03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Upd03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Upd03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Upd03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Upd03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Upd03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Upd04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Upd04;

		/** コンストラクタ */
		protected MS_MSBEL2610_Upd04Bridge() {
			p_MS_MSBEL2610_Upd04 = new MCParam(PDef.MS_MSBEL2610_Upd04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Upd04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Upd04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Upd04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Upd04.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Upd04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Upd04.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Upd04.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Upd04;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Upd04.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Del01;

		/** コンストラクタ */
		protected MS_MSBEL2610_Del01Bridge() {
			p_MS_MSBEL2610_Del01 = new MCParam(PDef.MS_MSBEL2610_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Del02;

		/** コンストラクタ */
		protected MS_MSBEL2610_Del02Bridge() {
			p_MS_MSBEL2610_Del02 = new MCParam(PDef.MS_MSBEL2610_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Del02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL2610_Del02.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP2610.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP2610.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Del02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Del02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Del03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Del03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Del03;

		/** コンストラクタ */
		protected MS_MSBEL2610_Del03Bridge() {
			p_MS_MSBEL2610_Del03 = new MCParam(PDef.MS_MSBEL2610_Del03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Del03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Del03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Del03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Del03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Del03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Del03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Del03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Del03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Del03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2610_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2610_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL2610_Prnt01Bridge() {
			p_MS_MSBEL2610_Prnt01 = new MCParam(PDef.MS_MSBEL2610_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2610_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP2610.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));

			p_MS_MSBEL2610_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2610_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2610_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL2610_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2610_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2610_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP2610.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP2610.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2610.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2610_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2610.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2610_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2610.RsltR>)p_MS_MSBEL2610_Prnt01.getContainerParam().getDownBlock(0));
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