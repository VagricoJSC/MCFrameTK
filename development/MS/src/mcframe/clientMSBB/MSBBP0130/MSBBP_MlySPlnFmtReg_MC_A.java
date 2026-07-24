package mcframe.clientMSBB.MSBBP0130;

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
import mcframe.clientMSBB.MSBBP0130.MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Srch01Caller;
import mcframe.clientMSBB.MSBBP0130.MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Srch02Caller;
import mcframe.clientMSBB.MSBBP0130.MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Sprt01Caller;
import mcframe.clientMSBB.MSBBP0130.MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Imp01Caller;
import mcframe.clientMSBB.MSBBP0130.MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Upd01Caller;
import mcframe.clientMSBB.MSBBP0130.MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Del01Caller;

/**
 * 画面"MSBBP_MlySPlnFmtReg"パネルクラスです。<p>
 *
 * 月次販売計画の立案対象（部門・品目・得意先）を登録する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_MlySPlnFmtReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP0130";

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
	 * UPD,Create/Modify;COPY,Create by copying;DEL,Cancel;REF,View UPD,登録・訂正する;COPY,コピー登録する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_COPY = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_spln_st_ym_fr_Label = null;
	/**
	 * Sales start month FROM 販売開始年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_spln_st_ym_fr = null;
	public MCLabel Cnd_spln_st_ym_to_Label = null;
	/**
	 * Sales start month TO 販売開始年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_spln_st_ym_to = null;
	public MCLabel Cnd_spln_end_ym_fr_Label = null;
	/**
	 * Sales end month FROM 販売終了年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_spln_end_ym_fr = null;
	public MCLabel Cnd_spln_end_ym_to_Label = null;
	/**
	 * Sales end month TO 販売終了年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_spln_end_ym_to = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
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
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_spln_itm_cd_Label = null;
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_spln_itm_cd = null;
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public MCTextField Cnd_spln_itm_nm = null;
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_spln_st_ym_Label = null;
	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public MCDateField BulkSet_spln_st_ym = null;
	public MCLabel BulkSet_spln_end_ym_Label = null;
	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public MCDateField BulkSet_spln_end_ym = null;
	public MCLabel BulkSet_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField BulkSet_dpt_nm = null;
	public MCLabel BulkSet_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField BulkSet_cst_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H BulkSet_wrk_no_p_PPanel;
	public MCTextField BulkSet_wrk_no;	// [BulkSet]の[wrk_no_p.wrk_no]を[BulkSet_wrk_no]としてエイリアス定義。
	public MCTextField BulkSet_wrk_nm;	// [BulkSet]の[wrk_no_p.wrk_nm]を[BulkSet_wrk_nm]としてエイリアス定義。
	public MCLabel BulkSet_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox BulkSet_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField BulkSet_cur_nm = null;
	public MCLabel BulkSet_spln_set_typ_Label = null;
	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public MCTextComboBox BulkSet_spln_set_typ = null;
	/**
	 * Sales plan setting type name 販売計画設定区分名.<p>
	 *
	 */
	public MCTextField BulkSet_spln_set_typ_nm = null;
	/**
	 * Aggregated by customer 得意先別集計.<p>
	 *
	 */
	public MCLabel BulkSet_cst_cd_unit = null;
	/**
	 * Aggregated by customer on 得意先別集計オン.<p>
	 *
	 */
	public MCCheckBox BulkSet_cst_cd_unit_t_flg = null;
	/**
	 * Aggregated by customer off 得意先別集計オフ.<p>
	 *
	 */
	public MCCheckBox BulkSet_cst_cd_unit_f_flg = null;
	/**
	 * Aggregation by sales project 案件別集計.<p>
	 *
	 */
	public MCLabel BulkSet_wrk_no_unit = null;
	/**
	 * Aggregation by sales project on 案件別集計オン.<p>
	 *
	 */
	public MCCheckBox BulkSet_wrk_no_unit_t_flg = null;
	/**
	 * Aggregation by sales project off 案件別集計オフ.<p>
	 *
	 */
	public MCCheckBox BulkSet_wrk_no_unit_f_flg = null;
	/**
	 * Apply 反映.<p>
	 *
	 */
	public MCButton BulkSet_setting = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP0130.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_st_ym = null;
	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_end_ym = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
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
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_itm_cd = null;
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_set_typ = null;
	/**
	 * Sales plan setting type name 販売計画設定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_set_typ_nm = null;
	/**
	 * Aggregated by customer 得意先別集計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd_unit_flg = null;
	/**
	 * Aggregation by sales project 案件別集計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_no_unit_flg = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fmt_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fmt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fmt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fmt_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Sales plan configuration No. 販売計画構成ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_fmt_no = null;
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
	 * Correct overlapping period 重複期間補正.<p>
	 *
	 */
	public MCButton Btn_sprt_dup_term = null;
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
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH_DEL, DEL, SRCH, REF};
	
	/** [MS_MSBBL0130_Srch01]のCallerの作成 */
	protected MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Srch01Caller createMS_MSBBL0130_Srch01() {
		MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Srch01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Srch01Bridge>
		caller = ((MSBBP_MlySPlnFmtReg_MC)this).new MS_MSBBL0130_Srch01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Srch01Bridge>(
					(MSBBP_MlySPlnFmtReg)this, new MS_MSBBL0130_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL0130_Srch01]の呼び出し */
	protected void callMS_MSBBL0130_Srch01() {
		MCCaller caller = createMS_MSBBL0130_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL0130_Srch02]のCallerの作成 */
	protected MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Srch02Caller createMS_MSBBL0130_Srch02() {
		MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Srch02Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Srch02Bridge>
		caller = ((MSBBP_MlySPlnFmtReg_MC)this).new MS_MSBBL0130_Srch02Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Srch02Bridge>(
					(MSBBP_MlySPlnFmtReg)this, new MS_MSBBL0130_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL0130_Srch02]の呼び出し */
	protected void callMS_MSBBL0130_Srch02() {
		MCCaller caller = createMS_MSBBL0130_Srch02();
		caller.exec();
	}
	/** [MS_MSBBL0130_Sprt01]のCallerの作成 */
	protected MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Sprt01Caller createMS_MSBBL0130_Sprt01() {
		MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Sprt01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Sprt01Bridge>
		caller = ((MSBBP_MlySPlnFmtReg_MC)this).new MS_MSBBL0130_Sprt01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Sprt01Bridge>(
					(MSBBP_MlySPlnFmtReg)this, new MS_MSBBL0130_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBBL0130_Sprt01]の呼び出し */
	protected void callMS_MSBBL0130_Sprt01() {
		MCCaller caller = createMS_MSBBL0130_Sprt01();
		caller.exec();
	}
	/** [MS_MSBBL0130_Imp01]のCallerの作成 */
	protected MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Imp01Caller createMS_MSBBL0130_Imp01() {
		MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Imp01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Imp01Bridge>
		caller = ((MSBBP_MlySPlnFmtReg_MC)this).new MS_MSBBL0130_Imp01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Imp01Bridge>(
					(MSBBP_MlySPlnFmtReg)this, new MS_MSBBL0130_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBBL0130_Imp01]の呼び出し */
	protected void callMS_MSBBL0130_Imp01() {
		MCCaller caller = createMS_MSBBL0130_Imp01();
		caller.exec();
	}
	/** [MS_MSBBL0130_Upd01]のCallerの作成 */
	protected MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Upd01Caller createMS_MSBBL0130_Upd01() {
		MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Upd01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Upd01Bridge>
		caller = ((MSBBP_MlySPlnFmtReg_MC)this).new MS_MSBBL0130_Upd01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Upd01Bridge>(
					(MSBBP_MlySPlnFmtReg)this, new MS_MSBBL0130_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL0130_Upd01]の呼び出し */
	protected void callMS_MSBBL0130_Upd01() {
		MCCaller caller = createMS_MSBBL0130_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL0130_Del01]のCallerの作成 */
	protected MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Del01Caller createMS_MSBBL0130_Del01() {
		MSBBP_MlySPlnFmtReg_MC.MS_MSBBL0130_Del01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Del01Bridge>
		caller = ((MSBBP_MlySPlnFmtReg_MC)this).new MS_MSBBL0130_Del01Caller<MSBBP_MlySPlnFmtReg, MS_MSBBL0130_Del01Bridge>(
					(MSBBP_MlySPlnFmtReg)this, new MS_MSBBL0130_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL0130_Del01]の呼び出し */
	protected void callMS_MSBBL0130_Del01() {
		MCCaller caller = createMS_MSBBL0130_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0130.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0130.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0130.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP0130.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0130.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0130.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP0130.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBB.MSBBP0130.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBB.MSBBP0130.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBB.MSBBP0130.BulkSetR createBulkSetR() {
		return mcframe.clientMSBB.MSBBP0130.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP0130.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0130.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP0130.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP0130.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0130.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
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
	public MSBBP_MlySPlnFmtReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_MlySPlnFmtReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_MlySPlnFmtReg_MC.jbCreateScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateTop((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateFold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateTab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateTab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateTab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateCnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateCnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateCnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateCtrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateBulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateRslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateBtn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbCreateEastBtn((MSBBP_MlySPlnFmtReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_MlySPlnFmtReg p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_MlySPlnFmtReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBBP_MlySPlnFmtReg p) {
		p.BulkSet_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getBulkSetR().wrk_no_p());
		p.BulkSet_wrk_no_p_PPanel.setName("BulkSet.wrk_no_p");
		p.BulkSet_wrk_no = p.BulkSet_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.BulkSet_wrk_no.addAliasName("BulkSet.wrk_no", p);
		p.BulkSet_wrk_nm = p.BulkSet_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.BulkSet_wrk_nm.addAliasName("BulkSet.wrk_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_MlySPlnFmtReg p) {
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBB.MSBBP0130.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP0130.RsltR.$itm_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP0130.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_MlySPlnFmtReg p) {
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

	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
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
	
	
	/** [Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p = null;

	/**
	 * [Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter() {
		if (Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p == null) {
			Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p = createCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(Cnd_wrk_no_p_PPanel.WrkNo_wrk_no, "wrk_no", "wrk_nm");
		}
		return Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p;
	}
	
	
	/** [Cnd_spln_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_spln_itm_cd_p = null;

	/**
	 * [Cnd_spln_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_spln_itm_cd_ListPutter() {
		if (Cnd_spln_itm_cd_p == null) {
			Cnd_spln_itm_cd_p = createCnd_spln_itm_cd_ListPutter(Cnd_spln_itm_cd, "spln_itm_cd", "spln_itm_nm");

		}
		return Cnd_spln_itm_cd_p;
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
	
	
	/** [BulkSet_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_dpt_cd_p = null;

	/**
	 * [BulkSet_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_dpt_cd_ListPutter() {
		if (BulkSet_dpt_cd_p == null) {
			BulkSet_dpt_cd_p = createBulkSet_dpt_cd_ListPutter(BulkSet_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return BulkSet_dpt_cd_p;
	}
	
	
	/** [BulkSet_cst_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_cst_cd_p = null;

	/**
	 * [BulkSet_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_cst_cd_ListPutter() {
		if (BulkSet_cst_cd_p == null) {
			BulkSet_cst_cd_p = createBulkSet_cst_cd_ListPutter(BulkSet_cst_cd, "cst_cd", "cst_nm");

		}
		return BulkSet_cst_cd_p;
	}
	
	
	/** [BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_p = null;

	/**
	 * [BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter() {
		if (BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_p == null) {
			BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_p = createBulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(BulkSet_wrk_no_p_PPanel.WrkNo_wrk_no, "wrk_no", "wrk_nm");
		}
		return BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_p;
	}
	
	
	/** [BulkSet_cur_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_cur_cd_p = null;

	/**
	 * [BulkSet_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_cur_cd_ListPutter() {
		if (BulkSet_cur_cd_p == null) {
			BulkSet_cur_cd_p = createBulkSet_cur_cd_ListPutter(BulkSet_cur_cd, "cur_cd", "cur_nm");

		}
		return BulkSet_cur_cd_p;
	}
	
	
	/** [BulkSet_spln_set_typ_ListPutter]の定義 */
	private MCListPutter BulkSet_spln_set_typ_p = null;

	/**
	 * [BulkSet_spln_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_spln_set_typ_ListPutter() {
		if (BulkSet_spln_set_typ_p == null) {
			BulkSet_spln_set_typ_p = createBulkSet_spln_set_typ_ListPutter(BulkSet_spln_set_typ, "spln_set_typ", "spln_set_typ_nm");

		}
		return BulkSet_spln_set_typ_p;
	}
	
	
	/** [Rslt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dpt_cd_p = null;

	/**
	 * [Rslt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dpt_cd_ListPutter() {
		if (Rslt_dpt_cd_p == null) {
			Rslt_dpt_cd_p = createRslt_dpt_cd_ListPutter(columnRslt_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Rslt_dpt_cd_p;
	}
	
	
	/** [Rslt_cst_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cst_cd_p = null;

	/**
	 * [Rslt_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cst_cd_ListPutter() {
		if (Rslt_cst_cd_p == null) {
			Rslt_cst_cd_p = createRslt_cst_cd_ListPutter(columnRslt_cst_cd, "cst_cd", "cst_nm","cur_cd");

		}
		return Rslt_cst_cd_p;
	}
	
	
	/** [Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_p = null;

	/**
	 * [Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter() {
		if (Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_p == null) {
			Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_p = createRslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter(Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no, "wrk_no", "wrk_nm");
		}
		return Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_p;
	}
	
	
	/** [Rslt_spln_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_spln_itm_cd_p = null;

	/**
	 * [Rslt_spln_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_spln_itm_cd_ListPutter() {
		if (Rslt_spln_itm_cd_p == null) {
			Rslt_spln_itm_cd_p = createRslt_spln_itm_cd_ListPutter(columnRslt_spln_itm_cd, "spln_itm_cd", "spln_itm_nm","spln_set_typ");

		}
		return Rslt_spln_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cur_cd_p = null;

	/**
	 * [Rslt_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cur_cd_ListPutter() {
		if (Rslt_cur_cd_p == null) {
			Rslt_cur_cd_p = createRslt_cur_cd_ListPutter(columnRslt_cur_cd, "cur_cd", "cur_nm");

		}
		return Rslt_cur_cd_p;
	}
	
	
	/** [Rslt_spln_set_typ_ListPutter]の定義 */
	private MCListPutter Rslt_spln_set_typ_p = null;

	/**
	 * [Rslt_spln_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_spln_set_typ_ListPutter() {
		if (Rslt_spln_set_typ_p == null) {
			Rslt_spln_set_typ_p = createRslt_spln_set_typ_ListPutter(columnRslt_spln_set_typ, "spln_set_typ", "spln_set_typ_nm");

		}
		return Rslt_spln_set_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_MlySPlnFmtReg create(){
		MSBBP_MlySPlnFmtReg p = new MSBBP_MlySPlnFmtReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_MlySPlnFmtReg create(String name){
		MSBBP_MlySPlnFmtReg p = new MSBBP_MlySPlnFmtReg(name);
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
		MSBBP_MlySPlnFmtReg_MC.jbfInitScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitTop((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitFold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitTab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitTab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitTab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitCnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitCnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitCnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitCtrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitBulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitRslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitBtn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbfInitEastBtn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitTop((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitFold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitTab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitTab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitTab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitCnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitCnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitCnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitCtrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitBulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitRslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitBtn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.jbInitEastBtn((MSBBP_MlySPlnFmtReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbfInitTab1(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_COPY = p.beansFactory.createRadioButton("Cnd.ope_COPY");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_spln_st_ym_fr_Label = p.beansFactory.createLabel("Cnd.spln_st_ym_fr_Label");
		p.Cnd_spln_st_ym_fr = p.beansFactory.createDateField("Cnd.spln_st_ym_fr");
		p.Cnd_spln_st_ym_fr.setLabel(p.Cnd_spln_st_ym_fr_Label);
		p.Cnd_spln_st_ym_to_Label = p.beansFactory.createLabel("Cnd.spln_st_ym_to_Label");
		p.Cnd_spln_st_ym_to = p.beansFactory.createDateField("Cnd.spln_st_ym_to");
		p.Cnd_spln_st_ym_to.setLabel(p.Cnd_spln_st_ym_to_Label);
		p.Cnd_spln_end_ym_fr_Label = p.beansFactory.createLabel("Cnd.spln_end_ym_fr_Label");
		p.Cnd_spln_end_ym_fr = p.beansFactory.createDateField("Cnd.spln_end_ym_fr");
		p.Cnd_spln_end_ym_fr.setLabel(p.Cnd_spln_end_ym_fr_Label);
		p.Cnd_spln_end_ym_to_Label = p.beansFactory.createLabel("Cnd.spln_end_ym_to_Label");
		p.Cnd_spln_end_ym_to = p.beansFactory.createDateField("Cnd.spln_end_ym_to");
		p.Cnd_spln_end_ym_to.setLabel(p.Cnd_spln_end_ym_to_Label);
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_spln_itm_cd_Label = p.beansFactory.createLabel("Cnd.spln_itm_cd_Label");
		p.Cnd_spln_itm_cd = p.beansFactory.createTextField("Cnd.spln_itm_cd");
		p.Cnd_spln_itm_cd.setLabel(p.Cnd_spln_itm_cd_Label);
		p.Cnd_spln_itm_nm = p.beansFactory.createTextField("Cnd.spln_itm_nm");
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
	protected static void jbfInitCnd2(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_spln_st_ym_Label = p.beansFactory.createLabel("BulkSet.spln_st_ym_Label");
		p.BulkSet_spln_st_ym = p.beansFactory.createDateField("BulkSet.spln_st_ym");
		p.BulkSet_spln_st_ym.setLabel(p.BulkSet_spln_st_ym_Label);
		p.BulkSet_spln_end_ym_Label = p.beansFactory.createLabel("BulkSet.spln_end_ym_Label");
		p.BulkSet_spln_end_ym = p.beansFactory.createDateField("BulkSet.spln_end_ym");
		p.BulkSet_spln_end_ym.setLabel(p.BulkSet_spln_end_ym_Label);
		p.BulkSet_dpt_cd_Label = p.beansFactory.createLabel("BulkSet.dpt_cd_Label");
		p.BulkSet_dpt_cd = p.beansFactory.createTextField("BulkSet.dpt_cd");
		p.BulkSet_dpt_cd.setLabel(p.BulkSet_dpt_cd_Label);
		p.BulkSet_dpt_nm = p.beansFactory.createTextField("BulkSet.dpt_nm");
		p.BulkSet_cst_cd_Label = p.beansFactory.createLabel("BulkSet.cst_cd_Label");
		p.BulkSet_cst_cd = p.beansFactory.createTextField("BulkSet.cst_cd");
		p.BulkSet_cst_cd.setLabel(p.BulkSet_cst_cd_Label);
		p.BulkSet_cst_nm = p.beansFactory.createTextField("BulkSet.cst_nm");
		p.BulkSet_cur_cd_Label = p.beansFactory.createLabel("BulkSet.cur_cd_Label");
		p.BulkSet_cur_cd = p.beansFactory.createTextComboBox("BulkSet.cur_cd");
		p.BulkSet_cur_cd.setLabel(p.BulkSet_cur_cd_Label);
		p.BulkSet_cur_nm = p.beansFactory.createTextField("BulkSet.cur_nm");
		p.BulkSet_spln_set_typ_Label = p.beansFactory.createLabel("BulkSet.spln_set_typ_Label");
		p.BulkSet_spln_set_typ = p.beansFactory.createTextComboBox("BulkSet.spln_set_typ");
		p.BulkSet_spln_set_typ.setLabel(p.BulkSet_spln_set_typ_Label);
		p.BulkSet_spln_set_typ_nm = p.beansFactory.createTextField("BulkSet.spln_set_typ_nm");
		p.BulkSet_cst_cd_unit = p.beansFactory.createLabel("BulkSet.cst_cd_unit");
		p.BulkSet_cst_cd_unit_t_flg = p.beansFactory.createCheckBox("BulkSet.cst_cd_unit_t_flg");
		p.BulkSet_cst_cd_unit_f_flg = p.beansFactory.createCheckBox("BulkSet.cst_cd_unit_f_flg");
		p.BulkSet_wrk_no_unit = p.beansFactory.createLabel("BulkSet.wrk_no_unit");
		p.BulkSet_wrk_no_unit_t_flg = p.beansFactory.createCheckBox("BulkSet.wrk_no_unit_t_flg");
		p.BulkSet_wrk_no_unit_f_flg = p.beansFactory.createCheckBox("BulkSet.wrk_no_unit_f_flg");
		p.BulkSet_setting = p.beansFactory.createButton("BulkSet.setting");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_spln_st_ym = p.beansFactory.createTableColumn("Rslt.spln_st_ym", MCColumnType.DATE);
		p.columnRslt_spln_end_ym = p.beansFactory.createTableColumn("Rslt.spln_end_ym", MCColumnType.DATE);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_spln_itm_cd = p.beansFactory.createTableColumn("Rslt.spln_itm_cd", MCColumnType.TEXT);
		p.columnRslt_spln_itm_nm = p.beansFactory.createTableColumn("Rslt.spln_itm_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_spln_set_typ = p.beansFactory.createTableColumn("Rslt.spln_set_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_spln_set_typ_nm = p.beansFactory.createTableColumn("Rslt.spln_set_typ_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd_unit_flg = p.beansFactory.createTableColumn("Rslt.cst_cd_unit_flg", MCColumnType.CHECK);
		p.columnRslt_wrk_no_unit_flg = p.beansFactory.createTableColumn("Rslt.wrk_no_unit_flg", MCColumnType.CHECK);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_fmt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.fmt_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_fmt_sub_char1 = p.beansFactory.createTableColumn("Rslt.fmt_sub_char1", MCColumnType.TEXT);
		p.columnRslt_fmt_sub_char2 = p.beansFactory.createTableColumn("Rslt.fmt_sub_char2", MCColumnType.TEXT);
		p.columnRslt_fmt_sub_char3 = p.beansFactory.createTableColumn("Rslt.fmt_sub_char3", MCColumnType.TEXT);
		p.columnRslt_spln_fmt_no = p.beansFactory.createTableColumn("Rslt.spln_fmt_no", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_sprt_dup_term = p.beansFactory.createButton("Btn.sprt_dup_term");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbInitTop(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbInitFold(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbInitTab1(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbInitTab3(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbInitCnd(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_COPY);
		p.Cnd_ope_COPY.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_COPY);
		p.ScreenOpePanel.add(p.Cnd_ope_COPY);
		p.Cnd_ope_COPY.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.ope_META);
		p.CndPanel.add(p.Cnd_spln_st_ym_fr_Label);
		p.CndPanel.add(p.Cnd_spln_st_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_spln_st_ym_fr);
		p.Cnd_spln_st_ym_fr.setNextBeans(p.Cnd_spln_st_ym_to);
		p.Cnd_spln_st_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.spln_st_ym_fr_META);
		p.Cnd_spln_st_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_spln_st_ym_to_Label);
		p.CndPanel.add(p.Cnd_spln_st_ym_to);
		p.Cnd_spln_st_ym_to.setNextBeans(p.Cnd_spln_end_ym_fr);
		p.Cnd_spln_st_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.spln_st_ym_to_META);
		p.Cnd_spln_st_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_spln_end_ym_fr_Label);
		p.CndPanel.add(p.Cnd_spln_end_ym_fr);
		p.Cnd_spln_end_ym_fr.setNextBeans(p.Cnd_spln_end_ym_to);
		p.Cnd_spln_end_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.spln_end_ym_fr_META);
		p.Cnd_spln_end_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_spln_end_ym_to_Label);
		p.CndPanel.add(p.Cnd_spln_end_ym_to);
		p.Cnd_spln_end_ym_to.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_spln_end_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.spln_end_ym_to_META);
		p.Cnd_spln_end_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_spln_itm_cd);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no, true);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.Cnd_wrk_nm);
		p.setPluralValueEnable(p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_spln_itm_cd_Label);
		p.CndPanel.add(p.Cnd_spln_itm_cd);
		p.Cnd_spln_itm_cd.setNextBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.spln_itm_cd_META);
		p.Cnd_spln_itm_cd.addLinkBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_spln_itm_cd, true);
		p.CndPanel.add(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_spln_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.spln_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_spln_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_intr_rmrks);
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
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0130.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.Cnd3Panel.add(p.Cnd_bp_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_spln_st_ym_Label);
		p.BulkSetPanel.add(p.BulkSet_spln_st_ym);
		p.BulkSetPanel.setLastBeans(p.BulkSet_spln_st_ym);
		p.BulkSet_spln_st_ym.setNextBeans(p.BulkSet_spln_end_ym);
		p.BulkSet_spln_st_ym.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.spln_st_ym_META);
		p.BulkSet_spln_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_spln_end_ym_Label);
		p.BulkSetPanel.add(p.BulkSet_spln_end_ym);
		p.BulkSet_spln_end_ym.setNextBeans(p.BulkSet_dpt_cd);
		p.BulkSet_spln_end_ym.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.spln_end_ym_META);
		p.BulkSet_spln_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_dpt_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_dpt_cd);
		p.BulkSet_dpt_cd.setNextBeans(p.BulkSet_dpt_nm);
		p.BulkSet_dpt_cd.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.dpt_cd_META);
		p.BulkSet_dpt_cd.addLinkBeans(p.BulkSet_dpt_nm);
		p.BulkSet_dpt_cd.setListType(MCListType.STRICT);
		p.BulkSetPanel.add(p.BulkSet_dpt_nm);
		p.BulkSet_dpt_nm.setNextBeans(p.BulkSet_cst_cd);
		p.BulkSet_dpt_nm.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.dpt_nm_META);
		p.BulkSetPanel.add(p.BulkSet_cst_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_cst_cd);
		p.BulkSet_cst_cd.setNextBeans(p.BulkSet_cst_nm);
		p.BulkSet_cst_cd.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.cst_cd_META);
		p.BulkSet_cst_cd.addLinkBeans(p.BulkSet_cst_nm);
		p.BulkSet_cst_cd.setListType(MCListType.STRICT);
		p.BulkSetPanel.add(p.BulkSet_cst_nm);
		p.BulkSet_cst_nm.setNextBeans(p.BulkSet_wrk_no_p_PPanel);
		p.BulkSet_cst_nm.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.cst_nm_META);
		p.BulkSetPanel.add(p.BulkSet_wrk_no_p_PPanel);
		p.BulkSet_wrk_no_p_PPanel.setNextBeans(p.BulkSet_cur_cd);
		p.BulkSet_wrk_no_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.BulkSet_wrk_nm);
		p.BulkSet_cur_cd.setListType(MCListType.STRICT);
		p.BulkSet_cur_cd.setLinkBeans(p.BulkSet_cur_nm);
		p.BulkSetPanel.add(p.BulkSet_cur_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_cur_cd);
		p.BulkSet_cur_cd.setNextBeans(p.BulkSet_cur_nm);
		p.BulkSet_cur_cd.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.cur_cd_META);
		p.BulkSetPanel.add(p.BulkSet_cur_nm);
		p.BulkSet_cur_nm.setNextBeans(p.BulkSet_spln_set_typ);
		p.BulkSet_cur_nm.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.cur_nm_META);
		p.BulkSet_spln_set_typ.setListType(MCListType.STRICT);
		p.BulkSet_spln_set_typ.setLinkBeans(p.BulkSet_spln_set_typ_nm);
		p.BulkSetPanel.add(p.BulkSet_spln_set_typ_Label);
		p.BulkSetPanel.add(p.BulkSet_spln_set_typ);
		p.BulkSet_spln_set_typ.setNextBeans(p.BulkSet_spln_set_typ_nm);
		p.BulkSet_spln_set_typ.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.spln_set_typ_META);
		p.BulkSetPanel.add(p.BulkSet_spln_set_typ_nm);
		p.BulkSet_spln_set_typ_nm.setNextBeans(p.BulkSet_cst_cd_unit_t_flg);
		p.BulkSet_spln_set_typ_nm.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.spln_set_typ_nm_META);
		p.BulkSetPanel.add(p.BulkSet_cst_cd_unit);
		p.BulkSetPanel.add(p.BulkSet_cst_cd_unit_t_flg);
		p.BulkSet_cst_cd_unit_t_flg.setNextBeans(p.BulkSet_cst_cd_unit_f_flg);
		p.BulkSet_cst_cd_unit_t_flg.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.cst_cd_unit_t_flg_META);
		p.BulkSetPanel.add(p.BulkSet_cst_cd_unit_f_flg);
		p.BulkSet_cst_cd_unit_f_flg.setNextBeans(p.BulkSet_wrk_no_unit_t_flg);
		p.BulkSet_cst_cd_unit_f_flg.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.cst_cd_unit_f_flg_META);
		p.BulkSetPanel.add(p.BulkSet_wrk_no_unit);
		p.BulkSetPanel.add(p.BulkSet_wrk_no_unit_t_flg);
		p.BulkSet_wrk_no_unit_t_flg.setNextBeans(p.BulkSet_wrk_no_unit_f_flg);
		p.BulkSet_wrk_no_unit_t_flg.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.wrk_no_unit_t_flg_META);
		p.BulkSetPanel.add(p.BulkSet_wrk_no_unit_f_flg);
		p.BulkSet_wrk_no_unit_f_flg.setNextBeans(p.BulkSet_setting);
		p.BulkSet_wrk_no_unit_f_flg.setRow(p.getBulkSetR(), mcframe.clientMSBB.MSBBP0130.BulkSetR.wrk_no_unit_f_flg_META);
		p.BulkSet_setting.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_setting);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBBP_MlySPlnFmtReg p) {
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
	protected static void jbInitBtn(MSBBP_MlySPlnFmtReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_sprt_dup_term.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_sprt_dup_term);
		p.BtnPanel.setLastBeans(p.Btn_sprt_dup_term);
		p.Btn_sprt_dup_term.setNextBeans(p.Btn_select_all);
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
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_MlySPlnFmtReg p) {
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
		MSBBP_MlySPlnFmtReg_MC.mcInitScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitTop((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitFold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitTab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitTab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitTab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitCnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitCnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitCnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitCtrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitBulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitRslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitBtn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.mcInitEastBtn((MSBBP_MlySPlnFmtReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_ScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Top((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Fold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Tab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Tab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Tab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Cnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Cnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Cnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Ctrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_BulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Rslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_Btn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitUPD_EastBtn((MSBBP_MlySPlnFmtReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Top((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Fold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Tab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Tab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Tab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Cnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Cnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Cnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Ctrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_BulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Rslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_Btn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitFIX__U_EastBtn((MSBBP_MlySPlnFmtReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Top((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Fold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Tab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Tab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Tab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Cnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Cnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Cnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Ctrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_BulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Rslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_Btn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH__DEL_EastBtn((MSBBP_MlySPlnFmtReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_ScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Top((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Fold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Tab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Tab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Tab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Cnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Cnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Cnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Ctrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_BulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Rslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_Btn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitDEL_EastBtn((MSBBP_MlySPlnFmtReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_ScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Top((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Fold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Tab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Tab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Tab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Cnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Cnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Cnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Ctrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_BulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Rslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_Btn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitSRCH_EastBtn((MSBBP_MlySPlnFmtReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_ScreenOpe((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Top((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Fold((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Tab1((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Tab2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Tab3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Cnd((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Cnd2((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Cnd3((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Ctrl((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_BulkSet((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Rslt((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_Btn((MSBBP_MlySPlnFmtReg)this);
		MSBBP_MlySPlnFmtReg_MC.statusInitREF_EastBtn((MSBBP_MlySPlnFmtReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_MlySPlnFmtReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_MlySPlnFmtReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_COPY.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_spln_st_ym_fr.setListListener(p);
		p.Cnd_spln_st_ym_fr.addAllListener(p);
		p.Cnd_spln_st_ym_to.setListListener(p);
		p.Cnd_spln_st_ym_to.addAllListener(p);
		p.Cnd_spln_end_ym_fr.setListListener(p);
		p.Cnd_spln_end_ym_fr.addAllListener(p);
		p.Cnd_spln_end_ym_to.setListListener(p);
		p.Cnd_spln_end_ym_to.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_spln_itm_cd.setListListener(p);
		p.Cnd_spln_itm_cd.addAllListener(p);
		p.Cnd_spln_itm_nm.setListListener(p);
		p.Cnd_spln_itm_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
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
	protected static void mcInitCnd2(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_MlySPlnFmtReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBBP_MlySPlnFmtReg p) {
		p.BulkSet_spln_st_ym.setListListener(p);
		p.BulkSet_spln_st_ym.addAllListener(p);
		p.BulkSet_spln_end_ym.setListListener(p);
		p.BulkSet_spln_end_ym.addAllListener(p);
		p.BulkSet_dpt_cd.setListListener(p);
		p.BulkSet_dpt_cd.addAllListener(p);
		p.BulkSet_dpt_nm.setListListener(p);
		p.BulkSet_dpt_nm.addAllListener(p);
		p.BulkSet_cst_cd.setListListener(p);
		p.BulkSet_cst_cd.addAllListener(p);
		p.BulkSet_cst_nm.setListListener(p);
		p.BulkSet_cst_nm.addAllListener(p);
		p.BulkSet_wrk_no_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_cur_cd.setListListener(p);
		p.BulkSet_cur_cd.addAllListener(p);
		p.BulkSet_cur_nm.setListListener(p);
		p.BulkSet_cur_nm.addAllListener(p);
		p.BulkSet_spln_set_typ.setListListener(p);
		p.BulkSet_spln_set_typ.addAllListener(p);
		p.BulkSet_spln_set_typ_nm.setListListener(p);
		p.BulkSet_spln_set_typ_nm.addAllListener(p);
		p.BulkSet_cst_cd_unit_t_flg.addAllListener(p);
		p.BulkSet_cst_cd_unit_f_flg.addAllListener(p);
		p.BulkSet_wrk_no_unit_t_flg.addAllListener(p);
		p.BulkSet_wrk_no_unit_f_flg.addAllListener(p);
		p.BulkSet_setting.addAllListener(p);
		p.BulkSet_setting.setAPMethodName("doBulkSet_setting");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_MlySPlnFmtReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_spln_st_ym.addAllListener(p);
		p.columnRslt_spln_st_ym.setListListener(p);
		p.columnRslt_spln_end_ym.addAllListener(p);
		p.columnRslt_spln_end_ym.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_spln_itm_cd.addAllListener(p);
		p.columnRslt_spln_itm_cd.setListListener(p);
		p.columnRslt_spln_itm_nm.addAllListener(p);
		p.columnRslt_spln_itm_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_spln_set_typ.addAllListener(p);
		p.columnRslt_spln_set_typ.setListListener(p);
		p.columnRslt_spln_set_typ_nm.addAllListener(p);
		p.columnRslt_spln_set_typ_nm.setListListener(p);
		p.columnRslt_cst_cd_unit_flg.addAllListener(p);
		p.columnRslt_wrk_no_unit_flg.addAllListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_fmt_intr_rmrks.addAllListener(p);
		p.columnRslt_fmt_intr_rmrks.setListListener(p);
		p.columnRslt_fmt_sub_char1.addAllListener(p);
		p.columnRslt_fmt_sub_char1.setListListener(p);
		p.columnRslt_fmt_sub_char2.addAllListener(p);
		p.columnRslt_fmt_sub_char2.setListListener(p);
		p.columnRslt_fmt_sub_char3.addAllListener(p);
		p.columnRslt_fmt_sub_char3.setListListener(p);
		p.columnRslt_spln_fmt_no.addAllListener(p);
		p.columnRslt_spln_fmt_no.setListListener(p);
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
	protected static void mcInitBtn(MSBBP_MlySPlnFmtReg p) {
		p.Btn_sprt_dup_term.addAllListener(p);
		p.Btn_sprt_dup_term.setAPMethodName("doBtn_sprt_dup_term");
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
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_MlySPlnFmtReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_MlySPlnFmtReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_spln_st_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_st_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_end_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_end_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_spln_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBBP_MlySPlnFmtReg p){
		p.BulkSet_spln_st_ym.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_spln_end_ym.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE);
		p.BulkSet_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_spln_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.BulkSet_cst_cd_unit_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.BulkSet_wrk_no_unit_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.BulkSet_wrk_no_unit_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.BulkSet_setting.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBBP_MlySPlnFmtReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_spln_st_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_spln_end_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.ENABLE);
		p.columnRslt_spln_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_spln_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnRslt_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_spln_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd_unit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wrk_no_unit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_fmt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_fmt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_fmt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_fmt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_spln_fmt_no.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_Btn(MSBBP_MlySPlnFmtReg p){
		p.Btn_sprt_dup_term.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_MlySPlnFmtReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_spln_st_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_st_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_end_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_end_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_spln_itm_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBBP_MlySPlnFmtReg p){
		p.BulkSet_spln_st_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_spln_end_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.BulkSet_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_t_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_f_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_t_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_f_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBBP_MlySPlnFmtReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_st_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_cd_unit_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wrk_no_unit_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fmt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_spln_fmt_no.putMode(p, FIX_U, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__U_Btn(MSBBP_MlySPlnFmtReg p){
		p.Btn_sprt_dup_term.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBBP_MlySPlnFmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_spln_st_ym_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_st_ym_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_end_ym_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_end_ym_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_spln_itm_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBBP_MlySPlnFmtReg p){
		p.BulkSet_spln_st_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_spln_end_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.BulkSet_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_t_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_f_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_t_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_f_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBBP_MlySPlnFmtReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_st_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd_unit_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wrk_no_unit_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_spln_fmt_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH__DEL_Btn(MSBBP_MlySPlnFmtReg p){
		p.Btn_sprt_dup_term.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_MlySPlnFmtReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_spln_st_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_st_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_end_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_end_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_spln_itm_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBBP_MlySPlnFmtReg p){
		p.BulkSet_spln_st_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_spln_end_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.BulkSet_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_t_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_f_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_t_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_f_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBBP_MlySPlnFmtReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_spln_st_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd_unit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wrk_no_unit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_spln_fmt_no.putMode(p, DEL, MCMode.INVISIBLE);
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
	protected static void statusInitDEL_Btn(MSBBP_MlySPlnFmtReg p){
		p.Btn_sprt_dup_term.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_MlySPlnFmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_spln_st_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_st_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_end_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_end_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_spln_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBBP_MlySPlnFmtReg p){
		p.BulkSet_spln_st_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_spln_end_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.BulkSet_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_t_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_f_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_t_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_f_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBBP_MlySPlnFmtReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_spln_st_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd_unit_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wrk_no_unit_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fmt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_spln_fmt_no.putMode(p, SRCH, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH_Btn(MSBBP_MlySPlnFmtReg p){
		p.Btn_sprt_dup_term.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_MlySPlnFmtReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_spln_st_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_st_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_end_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_end_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_spln_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBBP_MlySPlnFmtReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBBP_MlySPlnFmtReg p){
		p.BulkSet_spln_st_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_spln_end_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.BulkSet_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_spln_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_t_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_cst_cd_unit_f_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_t_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_wrk_no_unit_f_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_setting.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBBP_MlySPlnFmtReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_spln_st_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd_unit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wrk_no_unit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fmt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fmt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_spln_fmt_no.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Btn(MSBBP_MlySPlnFmtReg p){
		p.Btn_sprt_dup_term.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_MlySPlnFmtReg p){

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
		MSBBP_MlySPlnFmtReg_MC.setTableConfigRslt((MSBBP_MlySPlnFmtReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_MlySPlnFmtReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_spln_st_ym.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_st_ym_META);
		p.columnRslt_spln_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_st_ym);
		p.columnRslt_spln_end_ym.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_end_ym_META);
		p.columnRslt_spln_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_end_ym);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.dpt_cd_META);
		p.columnRslt_dpt_cd.setListType(MCListType.STRICT);
		p.columnRslt_dpt_cd.addLinkBeans(p.columnRslt_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.cst_cd_META);
		p.columnRslt_cst_cd.setListType(MCListType.STRICT);
		p.columnRslt_cst_cd.addLinkBeans(p.columnRslt_cst_nm,p.columnRslt_cur_cd);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no.setLinkBeans(p.columnRslt_wrk_nm);
		p.columnRslt_spln_itm_cd.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_itm_cd_META);
		p.columnRslt_spln_itm_cd.setListType(MCListType.STRICT);
		p.columnRslt_spln_itm_cd.addLinkBeans(p.columnRslt_spln_itm_nm,p.columnRslt_spln_set_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_itm_cd);
		p.columnRslt_spln_itm_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_itm_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.cur_cd_META);
		p.columnRslt_cur_cd.addLinkBeans(p.columnRslt_cur_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_spln_set_typ.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_set_typ_META);
		p.columnRslt_spln_set_typ.addLinkBeans(p.columnRslt_spln_set_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_set_typ);
		p.columnRslt_spln_set_typ_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_set_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_set_typ_nm);
		p.columnRslt_cst_cd_unit_flg.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.cst_cd_unit_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd_unit_flg);
		p.columnRslt_wrk_no_unit_flg.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.wrk_no_unit_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no_unit_flg);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_fmt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.fmt_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fmt_intr_rmrks);
		p.columnRslt_fmt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.fmt_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fmt_sub_char1);
		p.columnRslt_fmt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.fmt_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fmt_sub_char2);
		p.columnRslt_fmt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.fmt_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fmt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_spln_fmt_no.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.spln_fmt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_fmt_no);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP0130.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter());
		Cnd_spln_itm_cd.getListConfig().setPutter(getCnd_spln_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		BulkSet_dpt_cd.getListConfig().setPutter(getBulkSet_dpt_cd_ListPutter());
		BulkSet_cst_cd.getListConfig().setPutter(getBulkSet_cst_cd_ListPutter());
		BulkSet_wrk_no_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getBulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter());
		BulkSet_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_cur_cd.getListConfig().setPutter(getBulkSet_cur_cd_ListPutter());
		BulkSet_spln_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_spln_set_typ.getListConfig().setPutter(getBulkSet_spln_set_typ_ListPutter());
		columnRslt_dpt_cd.getListConfig().setPutter(getRslt_dpt_cd_ListPutter());
		columnRslt_cst_cd.getListConfig().setPutter(getRslt_cst_cd_ListPutter());
		Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no.getListConfig().setPutter(getRslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter());
		columnRslt_spln_itm_cd.getListConfig().setPutter(getRslt_spln_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_cur_cd.getListConfig().setPutter(getRslt_cur_cd_ListPutter());
		columnRslt_spln_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_spln_set_typ.getListConfig().setPutter(getRslt_spln_set_typ_ListPutter());
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
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [Cnd_spln_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_spln_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SplnItm");
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
	 * [BulkSet_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [BulkSet_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [BulkSet_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [BulkSet_spln_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_spln_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SplnSetTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rslt_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wrk_no_p_PPanel_columnWrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [Rslt_spln_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_spln_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SplnItm");
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
	 * [Rslt_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_spln_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_spln_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SplnSetTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_wrk_no_p_PPanel.WrkNo_wrk_no) return getCnd_wrk_no_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == Cnd_spln_itm_cd) return getCnd_spln_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == BulkSet_dpt_cd) return getBulkSet_dpt_cd(row, info);
		if(combo == BulkSet_cst_cd) return getBulkSet_cst_cd(row, info);
		if(combo == BulkSet_wrk_no_p_PPanel.WrkNo_wrk_no) return getBulkSet_wrk_no_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == BulkSet_cur_cd) return getBulkSet_cur_cd(row, info);
		if(combo == BulkSet_spln_set_typ) return getBulkSet_spln_set_typ(row, info);
		if(combo == columnRslt_dpt_cd) return getRslt_dpt_cd(row, info);
		if(combo == columnRslt_cst_cd) return getRslt_cst_cd(row, info);
		if(combo == Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no) return getRslt_wrk_no_p_PPanel_columnWrkNo_wrk_no(row, info);
		if(combo == columnRslt_spln_itm_cd) return getRslt_spln_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_cur_cd) return getRslt_cur_cd(row, info);
		if(combo == columnRslt_spln_set_typ) return getRslt_spln_set_typ(row, info);
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
		else if (ap == BulkSet_setting) doBulkSet_setting(info);
		else if (ap == Btn_sprt_dup_term) doBtn_sprt_dup_term(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[setting]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_setting(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_dup_term]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_dup_term(MCEventInfo info);

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
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_spln_st_ym_fr) return doCnd_spln_st_ym_fr_VC(info);
		if (vc == Cnd_spln_st_ym_to) return doCnd_spln_st_ym_to_VC(info);
		if (vc == Cnd_spln_end_ym_fr) return doCnd_spln_end_ym_fr_VC(info);
		if (vc == Cnd_spln_end_ym_to) return doCnd_spln_end_ym_to_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_spln_itm_cd) return doCnd_spln_itm_cd_VC(info);
		if (vc == Cnd_spln_itm_nm) return doCnd_spln_itm_nm_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == BulkSet_spln_st_ym) return doBulkSet_spln_st_ym_VC(info);
		if (vc == BulkSet_spln_end_ym) return doBulkSet_spln_end_ym_VC(info);
		if (vc == BulkSet_dpt_cd) return doBulkSet_dpt_cd_VC(info);
		if (vc == BulkSet_dpt_nm) return doBulkSet_dpt_nm_VC(info);
		if (vc == BulkSet_cst_cd) return doBulkSet_cst_cd_VC(info);
		if (vc == BulkSet_cst_nm) return doBulkSet_cst_nm_VC(info);
		if (vc == BulkSet_cur_cd) return doBulkSet_cur_cd_VC(info);
		if (vc == BulkSet_cur_nm) return doBulkSet_cur_nm_VC(info);
		if (vc == BulkSet_spln_set_typ) return doBulkSet_spln_set_typ_VC(info);
		if (vc == BulkSet_spln_set_typ_nm) return doBulkSet_spln_set_typ_nm_VC(info);
		if (vc == BulkSet_cst_cd_unit_t_flg) return doBulkSet_cst_cd_unit_t_flg_VC(info);
		if (vc == BulkSet_cst_cd_unit_f_flg) return doBulkSet_cst_cd_unit_f_flg_VC(info);
		if (vc == BulkSet_wrk_no_unit_t_flg) return doBulkSet_wrk_no_unit_t_flg_VC(info);
		if (vc == BulkSet_wrk_no_unit_f_flg) return doBulkSet_wrk_no_unit_f_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_spln_st_ym) return doRslt_spln_st_ym_VC(info);
		if (vc == columnRslt_spln_end_ym) return doRslt_spln_end_ym_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_spln_itm_cd) return doRslt_spln_itm_cd_VC(info);
		if (vc == columnRslt_spln_itm_nm) return doRslt_spln_itm_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_spln_set_typ) return doRslt_spln_set_typ_VC(info);
		if (vc == columnRslt_spln_set_typ_nm) return doRslt_spln_set_typ_nm_VC(info);
		if (vc == columnRslt_cst_cd_unit_flg) return doRslt_cst_cd_unit_flg_VC(info);
		if (vc == columnRslt_wrk_no_unit_flg) return doRslt_wrk_no_unit_flg_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_fmt_intr_rmrks) return doRslt_fmt_intr_rmrks_VC(info);
		if (vc == columnRslt_fmt_sub_char1) return doRslt_fmt_sub_char1_VC(info);
		if (vc == columnRslt_fmt_sub_char2) return doRslt_fmt_sub_char2_VC(info);
		if (vc == columnRslt_fmt_sub_char3) return doRslt_fmt_sub_char3_VC(info);
		if (vc == columnRslt_spln_fmt_no) return doRslt_spln_fmt_no_VC(info);
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
	 * [Cnd]パネルの[spln_st_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_st_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_st_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_st_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_end_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_end_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_itm_nm_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[spln_st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_spln_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[spln_end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_spln_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_spln_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_spln_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cst_cd_unit_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cst_cd_unit_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_wrk_no_unit_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_wrk_no_unit_f_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cd_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_unit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_no_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_no_unit_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[fmt_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fmt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fmt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fmt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fmt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_fmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_fmt_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_spln_st_ym_fr) doCnd_spln_st_ym_fr_NC(info);
		else if (nc == Cnd_spln_st_ym_to) doCnd_spln_st_ym_to_NC(info);
		else if (nc == Cnd_spln_end_ym_fr) doCnd_spln_end_ym_fr_NC(info);
		else if (nc == Cnd_spln_end_ym_to) doCnd_spln_end_ym_to_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NC(info);
		else if (nc == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == BulkSet_spln_st_ym) doBulkSet_spln_st_ym_NC(info);
		else if (nc == BulkSet_spln_end_ym) doBulkSet_spln_end_ym_NC(info);
		else if (nc == BulkSet_dpt_cd) doBulkSet_dpt_cd_NC(info);
		else if (nc == BulkSet_dpt_nm) doBulkSet_dpt_nm_NC(info);
		else if (nc == BulkSet_cst_cd) doBulkSet_cst_cd_NC(info);
		else if (nc == BulkSet_cst_nm) doBulkSet_cst_nm_NC(info);
		else if (nc == BulkSet_cur_cd) doBulkSet_cur_cd_NC(info);
		else if (nc == BulkSet_cur_nm) doBulkSet_cur_nm_NC(info);
		else if (nc == BulkSet_spln_set_typ) doBulkSet_spln_set_typ_NC(info);
		else if (nc == BulkSet_spln_set_typ_nm) doBulkSet_spln_set_typ_nm_NC(info);
		else if (nc == BulkSet_cst_cd_unit_t_flg) doBulkSet_cst_cd_unit_t_flg_NC(info);
		else if (nc == BulkSet_cst_cd_unit_f_flg) doBulkSet_cst_cd_unit_f_flg_NC(info);
		else if (nc == BulkSet_wrk_no_unit_t_flg) doBulkSet_wrk_no_unit_t_flg_NC(info);
		else if (nc == BulkSet_wrk_no_unit_f_flg) doBulkSet_wrk_no_unit_f_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_spln_st_ym) doRslt_spln_st_ym_NC(info);
		else if (nc == columnRslt_spln_end_ym) doRslt_spln_end_ym_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_NC(info);
		else if (nc == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_spln_set_typ) doRslt_spln_set_typ_NC(info);
		else if (nc == columnRslt_spln_set_typ_nm) doRslt_spln_set_typ_nm_NC(info);
		else if (nc == columnRslt_cst_cd_unit_flg) doRslt_cst_cd_unit_flg_NC(info);
		else if (nc == columnRslt_wrk_no_unit_flg) doRslt_wrk_no_unit_flg_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_fmt_intr_rmrks) doRslt_fmt_intr_rmrks_NC(info);
		else if (nc == columnRslt_fmt_sub_char1) doRslt_fmt_sub_char1_NC(info);
		else if (nc == columnRslt_fmt_sub_char2) doRslt_fmt_sub_char2_NC(info);
		else if (nc == columnRslt_fmt_sub_char3) doRslt_fmt_sub_char3_NC(info);
		else if (nc == columnRslt_spln_fmt_no) doRslt_spln_fmt_no_NC(info);
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
	 * [Cnd]パネルの[spln_st_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_st_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[spln_st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_unit_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_unit_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wrk_no_unit_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wrk_no_unit_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_fmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_fmt_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_spln_st_ym_fr) doCnd_spln_st_ym_fr_NE(info);
		else if (ne == Cnd_spln_st_ym_to) doCnd_spln_st_ym_to_NE(info);
		else if (ne == Cnd_spln_end_ym_fr) doCnd_spln_end_ym_fr_NE(info);
		else if (ne == Cnd_spln_end_ym_to) doCnd_spln_end_ym_to_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NE(info);
		else if (ne == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == BulkSet_spln_st_ym) doBulkSet_spln_st_ym_NE(info);
		else if (ne == BulkSet_spln_end_ym) doBulkSet_spln_end_ym_NE(info);
		else if (ne == BulkSet_dpt_cd) doBulkSet_dpt_cd_NE(info);
		else if (ne == BulkSet_dpt_nm) doBulkSet_dpt_nm_NE(info);
		else if (ne == BulkSet_cst_cd) doBulkSet_cst_cd_NE(info);
		else if (ne == BulkSet_cst_nm) doBulkSet_cst_nm_NE(info);
		else if (ne == BulkSet_cur_cd) doBulkSet_cur_cd_NE(info);
		else if (ne == BulkSet_cur_nm) doBulkSet_cur_nm_NE(info);
		else if (ne == BulkSet_spln_set_typ) doBulkSet_spln_set_typ_NE(info);
		else if (ne == BulkSet_spln_set_typ_nm) doBulkSet_spln_set_typ_nm_NE(info);
		else if (ne == BulkSet_cst_cd_unit_t_flg) doBulkSet_cst_cd_unit_t_flg_NE(info);
		else if (ne == BulkSet_cst_cd_unit_f_flg) doBulkSet_cst_cd_unit_f_flg_NE(info);
		else if (ne == BulkSet_wrk_no_unit_t_flg) doBulkSet_wrk_no_unit_t_flg_NE(info);
		else if (ne == BulkSet_wrk_no_unit_f_flg) doBulkSet_wrk_no_unit_f_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_spln_st_ym) doRslt_spln_st_ym_NE(info);
		else if (ne == columnRslt_spln_end_ym) doRslt_spln_end_ym_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_NE(info);
		else if (ne == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_spln_set_typ) doRslt_spln_set_typ_NE(info);
		else if (ne == columnRslt_spln_set_typ_nm) doRslt_spln_set_typ_nm_NE(info);
		else if (ne == columnRslt_cst_cd_unit_flg) doRslt_cst_cd_unit_flg_NE(info);
		else if (ne == columnRslt_wrk_no_unit_flg) doRslt_wrk_no_unit_flg_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_fmt_intr_rmrks) doRslt_fmt_intr_rmrks_NE(info);
		else if (ne == columnRslt_fmt_sub_char1) doRslt_fmt_sub_char1_NE(info);
		else if (ne == columnRslt_fmt_sub_char2) doRslt_fmt_sub_char2_NE(info);
		else if (ne == columnRslt_fmt_sub_char3) doRslt_fmt_sub_char3_NE(info);
		else if (ne == columnRslt_spln_fmt_no) doRslt_spln_fmt_no_NE(info);
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
	 * [Cnd]パネルの[spln_st_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_st_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[spln_st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_unit_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_unit_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wrk_no_unit_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wrk_no_unit_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_fmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_fmt_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_spln_st_ym_fr) doCnd_spln_st_ym_fr_NX(info);
		else if (nx == Cnd_spln_st_ym_to) doCnd_spln_st_ym_to_NX(info);
		else if (nx == Cnd_spln_end_ym_fr) doCnd_spln_end_ym_fr_NX(info);
		else if (nx == Cnd_spln_end_ym_to) doCnd_spln_end_ym_to_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NX(info);
		else if (nx == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == BulkSet_spln_st_ym) doBulkSet_spln_st_ym_NX(info);
		else if (nx == BulkSet_spln_end_ym) doBulkSet_spln_end_ym_NX(info);
		else if (nx == BulkSet_dpt_cd) doBulkSet_dpt_cd_NX(info);
		else if (nx == BulkSet_dpt_nm) doBulkSet_dpt_nm_NX(info);
		else if (nx == BulkSet_cst_cd) doBulkSet_cst_cd_NX(info);
		else if (nx == BulkSet_cst_nm) doBulkSet_cst_nm_NX(info);
		else if (nx == BulkSet_cur_cd) doBulkSet_cur_cd_NX(info);
		else if (nx == BulkSet_cur_nm) doBulkSet_cur_nm_NX(info);
		else if (nx == BulkSet_spln_set_typ) doBulkSet_spln_set_typ_NX(info);
		else if (nx == BulkSet_spln_set_typ_nm) doBulkSet_spln_set_typ_nm_NX(info);
		else if (nx == BulkSet_cst_cd_unit_t_flg) doBulkSet_cst_cd_unit_t_flg_NX(info);
		else if (nx == BulkSet_cst_cd_unit_f_flg) doBulkSet_cst_cd_unit_f_flg_NX(info);
		else if (nx == BulkSet_wrk_no_unit_t_flg) doBulkSet_wrk_no_unit_t_flg_NX(info);
		else if (nx == BulkSet_wrk_no_unit_f_flg) doBulkSet_wrk_no_unit_f_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_spln_st_ym) doRslt_spln_st_ym_NX(info);
		else if (nx == columnRslt_spln_end_ym) doRslt_spln_end_ym_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_NX(info);
		else if (nx == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_spln_set_typ) doRslt_spln_set_typ_NX(info);
		else if (nx == columnRslt_spln_set_typ_nm) doRslt_spln_set_typ_nm_NX(info);
		else if (nx == columnRslt_cst_cd_unit_flg) doRslt_cst_cd_unit_flg_NX(info);
		else if (nx == columnRslt_wrk_no_unit_flg) doRslt_wrk_no_unit_flg_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_fmt_intr_rmrks) doRslt_fmt_intr_rmrks_NX(info);
		else if (nx == columnRslt_fmt_sub_char1) doRslt_fmt_sub_char1_NX(info);
		else if (nx == columnRslt_fmt_sub_char2) doRslt_fmt_sub_char2_NX(info);
		else if (nx == columnRslt_fmt_sub_char3) doRslt_fmt_sub_char3_NX(info);
		else if (nx == columnRslt_spln_fmt_no) doRslt_spln_fmt_no_NX(info);
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
	 * [Cnd]パネルの[spln_st_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_st_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[spln_st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_unit_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd_unit_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_unit_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wrk_no_unit_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wrk_no_unit_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wrk_no_unit_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_fmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_fmt_no_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_spln_st_ym_fr) doCnd_spln_st_ym_fr_LC(info);
		else if (lc == Cnd_spln_st_ym_to) doCnd_spln_st_ym_to_LC(info);
		else if (lc == Cnd_spln_end_ym_fr) doCnd_spln_end_ym_fr_LC(info);
		else if (lc == Cnd_spln_end_ym_to) doCnd_spln_end_ym_to_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_spln_itm_cd) doCnd_spln_itm_cd_LC(info);
		else if (lc == Cnd_spln_itm_nm) doCnd_spln_itm_nm_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_spln_st_ym) doBulkSet_spln_st_ym_LC(info);
		else if (lc == BulkSet_spln_end_ym) doBulkSet_spln_end_ym_LC(info);
		else if (lc == BulkSet_dpt_cd) doBulkSet_dpt_cd_LC(info);
		else if (lc == BulkSet_dpt_nm) doBulkSet_dpt_nm_LC(info);
		else if (lc == BulkSet_cst_cd) doBulkSet_cst_cd_LC(info);
		else if (lc == BulkSet_cst_nm) doBulkSet_cst_nm_LC(info);
		else if (lc == BulkSet_cur_cd) doBulkSet_cur_cd_LC(info);
		else if (lc == BulkSet_cur_nm) doBulkSet_cur_nm_LC(info);
		else if (lc == BulkSet_spln_set_typ) doBulkSet_spln_set_typ_LC(info);
		else if (lc == BulkSet_spln_set_typ_nm) doBulkSet_spln_set_typ_nm_LC(info);
		else if (lc == columnRslt_spln_st_ym) doRslt_spln_st_ym_LC(info);
		else if (lc == columnRslt_spln_end_ym) doRslt_spln_end_ym_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_LC(info);
		else if (lc == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_spln_set_typ) doRslt_spln_set_typ_LC(info);
		else if (lc == columnRslt_spln_set_typ_nm) doRslt_spln_set_typ_nm_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_fmt_intr_rmrks) doRslt_fmt_intr_rmrks_LC(info);
		else if (lc == columnRslt_fmt_sub_char1) doRslt_fmt_sub_char1_LC(info);
		else if (lc == columnRslt_fmt_sub_char2) doRslt_fmt_sub_char2_LC(info);
		else if (lc == columnRslt_fmt_sub_char3) doRslt_fmt_sub_char3_LC(info);
		else if (lc == columnRslt_spln_fmt_no) doRslt_spln_fmt_no_LC(info);
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
	 * [Cnd]パネルの[spln_st_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_st_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_st_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_end_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_end_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[spln_st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[spln_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_spln_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fmt_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fmt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_fmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_fmt_no_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_wrk_no_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getCnd_wrk_no_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_spln_itm_cd]の作成メソッド
	 */
	public MCList getCnd_spln_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSplnItm(row, info);
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
	 * コンボ／リストのリスト[BulkSet_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_cst_cd]の作成メソッド
	 */
	public MCList getBulkSet_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_wrk_no_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getBulkSet_wrk_no_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_cur_cd]の作成メソッド
	 */
	public MCList getBulkSet_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_spln_set_typ]の作成メソッド
	 */
	public MCList getBulkSet_spln_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSplnSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_cst_cd]の作成メソッド
	 */
	public MCList getRslt_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_wrk_no_p_PPanel_columnWrkNo_wrk_no]の作成メソッド
	 */
	public MCList getRslt_wrk_no_p_PPanel_columnWrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_spln_itm_cd]の作成メソッド
	 */
	public MCList getRslt_spln_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSplnItm(row, info);
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
	 * コンボ／リストのリスト[columnRslt_cur_cd]の作成メソッド
	 */
	public MCList getRslt_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_spln_set_typ]の作成メソッド
	 */
	public MCList getRslt_spln_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSplnSetTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL0130.Srch01")) {
			return new MS_MSBBL0130_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL0130.Srch02")) {
			return new MS_MSBBL0130_Srch02Bridge();
		}
		if (id.equals("MS.MSBBL0130.Sprt01")) {
			return new MS_MSBBL0130_Sprt01Bridge();
		}
		if (id.equals("MS.MSBBL0130.Imp01")) {
			return new MS_MSBBL0130_Imp01Bridge();
		}
		if (id.equals("MS.MSBBL0130.Upd01")) {
			return new MS_MSBBL0130_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL0130.Del01")) {
			return new MS_MSBBL0130_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0130_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL0130_Srch01Bridge() {
			p_MS_MSBBL0130_Srch01 = new MCParam(PDef.MS_MSBBL0130_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0130_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));

			p_MS_MSBBL0130_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0130_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0130_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0130_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0130_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0130.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0130.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0130_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0130_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)p_MS_MSBBL0130_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL0130_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0130_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL0130_Srch02Bridge() {
			p_MS_MSBBL0130_Srch02 = new MCParam(PDef.MS_MSBBL0130_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0130_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));

			p_MS_MSBBL0130_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0130_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0130_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0130_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0130_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0130.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0130.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0130_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0130_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)p_MS_MSBBL0130_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL0130_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0130_Sprt01;

		/** コンストラクタ */
		protected MS_MSBBL0130_Sprt01Bridge() {
			p_MS_MSBBL0130_Sprt01 = new MCParam(PDef.MS_MSBBL0130_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0130_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));

			p_MS_MSBBL0130_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0130_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0130_Sprt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0130_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0130_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0130_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0130_Sprt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)p_MS_MSBBL0130_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL0130_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0130_Imp01;

		/** コンストラクタ */
		protected MS_MSBBL0130_Imp01Bridge() {
			p_MS_MSBBL0130_Imp01 = new MCParam(PDef.MS_MSBBL0130_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0130_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));

			p_MS_MSBBL0130_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0130_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0130_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0130_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0130_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0130_Imp01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0130_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)p_MS_MSBBL0130_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL0130_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0130_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL0130_Upd01Bridge() {
			p_MS_MSBBL0130_Upd01 = new MCParam(PDef.MS_MSBBL0130_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0130_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));

			p_MS_MSBBL0130_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0130_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0130_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0130_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0130_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0130_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0130_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)p_MS_MSBBL0130_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL0130_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0130_Del01;

		/** コンストラクタ */
		protected MS_MSBBL0130_Del01Bridge() {
			p_MS_MSBBL0130_Del01 = new MCParam(PDef.MS_MSBBL0130_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0130_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));

			p_MS_MSBBL0130_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0130_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0130_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0130_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0130_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0130_Del01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0130_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0130.RsltR>)p_MS_MSBBL0130_Del01.getContainerParam().getDownBlock(0));
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