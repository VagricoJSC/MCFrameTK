package mcframe.clientMSBE.MSBEP1760;

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
import mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg_MC.MS_MSBEL1760_Srch01Caller;
import mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg_MC.MS_MSBEL1760_Upd01Caller;
import mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg_MC.MS_MSBEL1760_Del01Caller;

/**
 * 画面"MSBEP_ExActListReg"パネルクラスです。<p>
 *
 * 出荷実績をもとに輸出実績を登録・訂正・取消する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ExActListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1760";

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
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [RqstCnd]ブロック関連のField定義
	public MCPanel RqstCndPanel = null;
	// [RqstCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_cmpl_schd_dt_fr_Label = null;
	/**
	 * Completion (Scheduled) date FROM 完了（予定）日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_cmpl_schd_dt_fr = null;
	public MCLabel Cnd_cmpl_schd_dt_to_Label = null;
	/**
	 * Completion (Scheduled) date TO 完了（予定）日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_cmpl_schd_dt_to = null;
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
	public MCLabel Cnd_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_typ_nm = null;
	public MCLabel Cnd_dlv_id_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_nm = null;
	public MCLabel Cnd_ship_rqst_id_typ_Label = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_typ_nm = null;
	public MCLabel Cnd_ship_rqst_id_cd_Label = null;
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_cd = null;
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_nm = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_ship_rqst_no_Label = null;
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_no = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_rqst_grp_p_PPanel;
	public MCLabel Cnd_rqst_grp_lab1;	// [Cnd]の[rqst_grp_p.bp_grp_lab1]を[Cnd_rqst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg1;	// [Cnd]の[rqst_grp_p.bp_grp_flg1]を[Cnd_rqst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd1;	// [Cnd]の[rqst_grp_p.bp_grp_cd1]を[Cnd_rqst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm1;	// [Cnd]の[rqst_grp_p.bp_grp_nm1]を[Cnd_rqst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab2;	// [Cnd]の[rqst_grp_p.bp_grp_lab2]を[Cnd_rqst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg2;	// [Cnd]の[rqst_grp_p.bp_grp_flg2]を[Cnd_rqst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd2;	// [Cnd]の[rqst_grp_p.bp_grp_cd2]を[Cnd_rqst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm2;	// [Cnd]の[rqst_grp_p.bp_grp_nm2]を[Cnd_rqst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab3;	// [Cnd]の[rqst_grp_p.bp_grp_lab3]を[Cnd_rqst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg3;	// [Cnd]の[rqst_grp_p.bp_grp_flg3]を[Cnd_rqst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd3;	// [Cnd]の[rqst_grp_p.bp_grp_cd3]を[Cnd_rqst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm3;	// [Cnd]の[rqst_grp_p.bp_grp_nm3]を[Cnd_rqst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab4;	// [Cnd]の[rqst_grp_p.bp_grp_lab4]を[Cnd_rqst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg4;	// [Cnd]の[rqst_grp_p.bp_grp_flg4]を[Cnd_rqst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd4;	// [Cnd]の[rqst_grp_p.bp_grp_cd4]を[Cnd_rqst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm4;	// [Cnd]の[rqst_grp_p.bp_grp_nm4]を[Cnd_rqst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab5;	// [Cnd]の[rqst_grp_p.bp_grp_lab5]を[Cnd_rqst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg5;	// [Cnd]の[rqst_grp_p.bp_grp_flg5]を[Cnd_rqst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd5;	// [Cnd]の[rqst_grp_p.bp_grp_cd5]を[Cnd_rqst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm5;	// [Cnd]の[rqst_grp_p.bp_grp_nm5]を[Cnd_rqst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab6;	// [Cnd]の[rqst_grp_p.bp_grp_lab6]を[Cnd_rqst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg6;	// [Cnd]の[rqst_grp_p.bp_grp_flg6]を[Cnd_rqst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd6;	// [Cnd]の[rqst_grp_p.bp_grp_cd6]を[Cnd_rqst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm6;	// [Cnd]の[rqst_grp_p.bp_grp_nm6]を[Cnd_rqst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab7;	// [Cnd]の[rqst_grp_p.bp_grp_lab7]を[Cnd_rqst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg7;	// [Cnd]の[rqst_grp_p.bp_grp_flg7]を[Cnd_rqst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd7;	// [Cnd]の[rqst_grp_p.bp_grp_cd7]を[Cnd_rqst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm7;	// [Cnd]の[rqst_grp_p.bp_grp_nm7]を[Cnd_rqst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab8;	// [Cnd]の[rqst_grp_p.bp_grp_lab8]を[Cnd_rqst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg8;	// [Cnd]の[rqst_grp_p.bp_grp_flg8]を[Cnd_rqst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd8;	// [Cnd]の[rqst_grp_p.bp_grp_cd8]を[Cnd_rqst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm8;	// [Cnd]の[rqst_grp_p.bp_grp_nm8]を[Cnd_rqst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab9;	// [Cnd]の[rqst_grp_p.bp_grp_lab9]を[Cnd_rqst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg9;	// [Cnd]の[rqst_grp_p.bp_grp_flg9]を[Cnd_rqst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd9;	// [Cnd]の[rqst_grp_p.bp_grp_cd9]を[Cnd_rqst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm9;	// [Cnd]の[rqst_grp_p.bp_grp_nm9]を[Cnd_rqst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_rqst_grp_lab10;	// [Cnd]の[rqst_grp_p.bp_grp_lab10]を[Cnd_rqst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_rqst_grp_flg10;	// [Cnd]の[rqst_grp_p.bp_grp_flg10]を[Cnd_rqst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_rqst_grp_cd10;	// [Cnd]の[rqst_grp_p.bp_grp_cd10]を[Cnd_rqst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_rqst_grp_nm10;	// [Cnd]の[rqst_grp_p.bp_grp_nm10]を[Cnd_rqst_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_cmpl_dt_Label = null;
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDateField BulkSet_cmpl_dt = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H BulkSet_ac_dt_p_PPanel;
	public MCDateField BulkSet_ac_dt;	// [BulkSet]の[ac_dt_p.ac_dt]を[BulkSet_ac_dt]としてエイリアス定義。
	public MCLabel BulkSet_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField BulkSet_bill_basis_dt = null;
	public MCLabel BulkSet_rcv_schd_dt_Label = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDateField BulkSet_rcv_schd_dt = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1760.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cmpl_schd_dt = null;
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cmpl_dt = null;
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_ac_dt;// [Rslt]の[ac_dt_p.ac_dt]を[columnRslt_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D Rslt_can_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_can_ac_dt_for_input;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_input]を[columnRslt_can_ac_dt_for_input]としてエイリアス定義。
	public MCColumnConfig columnRslt_can_ac_dt;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_call]を[columnRslt_can_ac_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ac_dt_after_srch;// [Rslt]の[can_ac_dt_p.ac_dt_after_srch]を[columnRslt_ac_dt_after_srch]としてエイリアス定義。
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_dt = null;
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_schd_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_basis_dt = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_schd_dt = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ_nm = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_nm = null;
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cntry_cd = null;
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cntry_nm = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_typ_nm = null;
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_cd = null;
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_nm = null;
	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bl_no = null;
	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bl_dt = null;
	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bl_rmrks = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tdlv_nm = null;
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
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vssl_flght = null;
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_cd = null;
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_nm = null;
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_etd_dt = null;
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
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_iv_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_iv_amt;// [Rslt]の[ttl_iv_amt_p.amt]を[columnRslt_ttl_iv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_ncv_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_ncv_amt;// [Rslt]の[ttl_ncv_amt_p.amt]を[columnRslt_ttl_ncv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_base_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_base_amt;// [Rslt]の[ttl_base_amt_p.amt]を[columnRslt_ttl_base_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_freight_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_freight_amt;// [Rslt]の[ttl_freight_amt_p.amt]を[columnRslt_ttl_freight_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_insurance_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_insurance_amt;// [Rslt]の[ttl_insurance_amt_p.amt]を[columnRslt_ttl_insurance_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_other_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_other_amt;// [Rslt]の[ttl_other_amt_p.amt]を[columnRslt_ttl_other_amt]としてエイリアス定義。
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
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_typ = null;
	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_upd_cntr = null;
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_cststk_flg = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * I/V entry Ｉ／Ｖ登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1730 = null;
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
	public MCButton Btn_ins = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, UPD, DEL, REF};
	
	/** [MS_MSBEL1760_Srch01]のCallerの作成 */
	protected MSBEP_ExActListReg_MC.MS_MSBEL1760_Srch01Caller createMS_MSBEL1760_Srch01() {
		MSBEP_ExActListReg_MC.MS_MSBEL1760_Srch01Caller<MSBEP_ExActListReg, MS_MSBEL1760_Srch01Bridge>
		caller = ((MSBEP_ExActListReg_MC)this).new MS_MSBEL1760_Srch01Caller<MSBEP_ExActListReg, MS_MSBEL1760_Srch01Bridge>(
					(MSBEP_ExActListReg)this, new MS_MSBEL1760_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1760_Srch01]の呼び出し */
	protected void callMS_MSBEL1760_Srch01() {
		MCCaller caller = createMS_MSBEL1760_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1760_Upd01]のCallerの作成 */
	protected MSBEP_ExActListReg_MC.MS_MSBEL1760_Upd01Caller createMS_MSBEL1760_Upd01() {
		MSBEP_ExActListReg_MC.MS_MSBEL1760_Upd01Caller<MSBEP_ExActListReg, MS_MSBEL1760_Upd01Bridge>
		caller = ((MSBEP_ExActListReg_MC)this).new MS_MSBEL1760_Upd01Caller<MSBEP_ExActListReg, MS_MSBEL1760_Upd01Bridge>(
					(MSBEP_ExActListReg)this, new MS_MSBEL1760_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1760_Upd01]の呼び出し */
	protected void callMS_MSBEL1760_Upd01() {
		MCCaller caller = createMS_MSBEL1760_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1760_Del01]のCallerの作成 */
	protected MSBEP_ExActListReg_MC.MS_MSBEL1760_Del01Caller createMS_MSBEL1760_Del01() {
		MSBEP_ExActListReg_MC.MS_MSBEL1760_Del01Caller<MSBEP_ExActListReg, MS_MSBEL1760_Del01Bridge>
		caller = ((MSBEP_ExActListReg_MC)this).new MS_MSBEL1760_Del01Caller<MSBEP_ExActListReg, MS_MSBEL1760_Del01Bridge>(
					(MSBEP_ExActListReg)this, new MS_MSBEL1760_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1760_Del01]の呼び出し */
	protected void callMS_MSBEL1760_Del01() {
		MCCaller caller = createMS_MSBEL1760_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1760.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1760.HdrR aHdrR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1760.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1760.RsltR> aRsltL;
	/** [ShipPrCnt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> aShipPrCntL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1760.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1760.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1760.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1760.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP1760.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1760.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1760.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP1760.HdrR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBE.MSBEP1760.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1760.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1760.BulkSetR createBulkSetR() {
		return mcframe.clientMSBE.MSBEP1760.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1760.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1760.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1760.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1760.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1760.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class);
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
	 * コピーによってaShipPrCntLを設定します。
	 *
	 * aShipPrCntLのインスタンスは変更されません。
	 *
	 * @param dataset ShipPrCntL
	 */
	public void setShipPrCntL(MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> aList) {
		if (getShipPrCntL() != aList) {
			getShipPrCntL().setAll(aList);
		}
	}

	/**
	 * [ShipPrCnt]ブロックのコンテナaShipPrCntLを返します。
	 *
	 * @return ShipPrCntL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> getShipPrCntL() {
		return aShipPrCntL;
	}

	/**
	 * aShipPrCntRを作成します。
	 *
	 * @return ShipPrCntR
	 */
	public mcframe.clientMSBE.MSBEP1760.ShipPrCntR createShipPrCntR() {
		return mcframe.clientMSBE.MSBEP1760.ShipPrCntR.create();
	}

	/**
	 * aShipPrCntLを作成します。
	 *
	 * @return ShipPrCntL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> createShipPrCntL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1760.ShipPrCntR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getShipPrCntL())) ret.add(getShipPrCntL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getShipPrCntL()) return "ShipPrCnt";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("ShipPrCnt")) return getShipPrCntL();
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
		ret.add(DlvCndPanel);
		ret.add(RqstCndPanel);
		ret.add(CndPanel);
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
	public MSBEP_ExActListReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		aShipPrCntL = createShipPrCntL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ExActListReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aShipPrCntL = createShipPrCntL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_ExActListReg_MC.jbCreateScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateTop((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateFold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateTab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateTab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateTab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateDlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateRqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateCtrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateBulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateRslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateBtn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbCreateEastBtn((MSBEP_ExActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ExActListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ExActListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ExActListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_ExActListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_ExActListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_ExActListReg p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBEP_ExActListReg p) {
	}

	/**
	 * [RqstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqstCnd(MSBEP_ExActListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ExActListReg p) {
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
		p.Cnd_rqst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().rqst_grp_p());
		p.Cnd_rqst_grp_p_PPanel.setName("Cnd.rqst_grp_p");
		p.Cnd_rqst_grp_lab1 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_rqst_grp_lab1.addAliasName("Cnd.rqst_grp_lab1", p);
		p.Cnd_rqst_grp_flg1 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_rqst_grp_flg1.addAliasName("Cnd.rqst_grp_flg1", p);
		p.Cnd_rqst_grp_cd1 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_rqst_grp_cd1.addAliasName("Cnd.rqst_grp_cd1", p);
		p.Cnd_rqst_grp_nm1 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_rqst_grp_nm1.addAliasName("Cnd.rqst_grp_nm1", p);
		p.Cnd_rqst_grp_lab2 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_rqst_grp_lab2.addAliasName("Cnd.rqst_grp_lab2", p);
		p.Cnd_rqst_grp_flg2 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_rqst_grp_flg2.addAliasName("Cnd.rqst_grp_flg2", p);
		p.Cnd_rqst_grp_cd2 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_rqst_grp_cd2.addAliasName("Cnd.rqst_grp_cd2", p);
		p.Cnd_rqst_grp_nm2 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_rqst_grp_nm2.addAliasName("Cnd.rqst_grp_nm2", p);
		p.Cnd_rqst_grp_lab3 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_rqst_grp_lab3.addAliasName("Cnd.rqst_grp_lab3", p);
		p.Cnd_rqst_grp_flg3 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_rqst_grp_flg3.addAliasName("Cnd.rqst_grp_flg3", p);
		p.Cnd_rqst_grp_cd3 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_rqst_grp_cd3.addAliasName("Cnd.rqst_grp_cd3", p);
		p.Cnd_rqst_grp_nm3 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_rqst_grp_nm3.addAliasName("Cnd.rqst_grp_nm3", p);
		p.Cnd_rqst_grp_lab4 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_rqst_grp_lab4.addAliasName("Cnd.rqst_grp_lab4", p);
		p.Cnd_rqst_grp_flg4 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_rqst_grp_flg4.addAliasName("Cnd.rqst_grp_flg4", p);
		p.Cnd_rqst_grp_cd4 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_rqst_grp_cd4.addAliasName("Cnd.rqst_grp_cd4", p);
		p.Cnd_rqst_grp_nm4 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_rqst_grp_nm4.addAliasName("Cnd.rqst_grp_nm4", p);
		p.Cnd_rqst_grp_lab5 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_rqst_grp_lab5.addAliasName("Cnd.rqst_grp_lab5", p);
		p.Cnd_rqst_grp_flg5 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_rqst_grp_flg5.addAliasName("Cnd.rqst_grp_flg5", p);
		p.Cnd_rqst_grp_cd5 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_rqst_grp_cd5.addAliasName("Cnd.rqst_grp_cd5", p);
		p.Cnd_rqst_grp_nm5 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_rqst_grp_nm5.addAliasName("Cnd.rqst_grp_nm5", p);
		p.Cnd_rqst_grp_lab6 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_rqst_grp_lab6.addAliasName("Cnd.rqst_grp_lab6", p);
		p.Cnd_rqst_grp_flg6 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_rqst_grp_flg6.addAliasName("Cnd.rqst_grp_flg6", p);
		p.Cnd_rqst_grp_cd6 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_rqst_grp_cd6.addAliasName("Cnd.rqst_grp_cd6", p);
		p.Cnd_rqst_grp_nm6 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_rqst_grp_nm6.addAliasName("Cnd.rqst_grp_nm6", p);
		p.Cnd_rqst_grp_lab7 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_rqst_grp_lab7.addAliasName("Cnd.rqst_grp_lab7", p);
		p.Cnd_rqst_grp_flg7 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_rqst_grp_flg7.addAliasName("Cnd.rqst_grp_flg7", p);
		p.Cnd_rqst_grp_cd7 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_rqst_grp_cd7.addAliasName("Cnd.rqst_grp_cd7", p);
		p.Cnd_rqst_grp_nm7 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_rqst_grp_nm7.addAliasName("Cnd.rqst_grp_nm7", p);
		p.Cnd_rqst_grp_lab8 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_rqst_grp_lab8.addAliasName("Cnd.rqst_grp_lab8", p);
		p.Cnd_rqst_grp_flg8 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_rqst_grp_flg8.addAliasName("Cnd.rqst_grp_flg8", p);
		p.Cnd_rqst_grp_cd8 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_rqst_grp_cd8.addAliasName("Cnd.rqst_grp_cd8", p);
		p.Cnd_rqst_grp_nm8 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_rqst_grp_nm8.addAliasName("Cnd.rqst_grp_nm8", p);
		p.Cnd_rqst_grp_lab9 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_rqst_grp_lab9.addAliasName("Cnd.rqst_grp_lab9", p);
		p.Cnd_rqst_grp_flg9 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_rqst_grp_flg9.addAliasName("Cnd.rqst_grp_flg9", p);
		p.Cnd_rqst_grp_cd9 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_rqst_grp_cd9.addAliasName("Cnd.rqst_grp_cd9", p);
		p.Cnd_rqst_grp_nm9 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_rqst_grp_nm9.addAliasName("Cnd.rqst_grp_nm9", p);
		p.Cnd_rqst_grp_lab10 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_rqst_grp_lab10.addAliasName("Cnd.rqst_grp_lab10", p);
		p.Cnd_rqst_grp_flg10 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_rqst_grp_flg10.addAliasName("Cnd.rqst_grp_flg10", p);
		p.Cnd_rqst_grp_cd10 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_rqst_grp_cd10.addAliasName("Cnd.rqst_grp_cd10", p);
		p.Cnd_rqst_grp_nm10 = p.Cnd_rqst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_rqst_grp_nm10.addAliasName("Cnd.rqst_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_ExActListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_ExActListReg p) {
		p.BulkSet_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getBulkSetR().ac_dt_p());
		p.BulkSet_ac_dt_p_PPanel.setName("BulkSet.ac_dt_p");
		p.BulkSet_ac_dt = p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt;
		p.BulkSet_ac_dt.addAliasName("BulkSet.ac_dt", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_ExActListReg p) {
		p.Rslt_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ac_dt_p);
		p.Rslt_ac_dt_p_PPanel.setName("Rslt.ac_dt_p");
		p.columnRslt_ac_dt = p.Rslt_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_ac_dt.addAliasName("Rslt.ac_dt", p);
		p.Rslt_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$can_ac_dt_p);
		p.Rslt_can_ac_dt_p_PPanel.setName("Rslt.can_ac_dt_p");
		p.columnRslt_can_ac_dt_for_input = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_input;
		p.columnRslt_can_ac_dt_for_input.addAliasName("Rslt.can_ac_dt_for_input", p);
		p.columnRslt_can_ac_dt = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_call;
		p.columnRslt_can_ac_dt.addAliasName("Rslt.can_ac_dt", p);
		p.columnRslt_ac_dt_after_srch = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_ac_dt_after_srch;
		p.columnRslt_ac_dt_after_srch.addAliasName("Rslt.ac_dt_after_srch", p);
		p.Rslt_ttl_iv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ttl_iv_amt_p);
		p.Rslt_ttl_iv_amt_p_PPanel.setName("Rslt.ttl_iv_amt_p");
		p.columnRslt_ttl_iv_amt = p.Rslt_ttl_iv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_iv_amt.addAliasName("Rslt.ttl_iv_amt", p);
		p.Rslt_ttl_ncv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ttl_ncv_amt_p);
		p.Rslt_ttl_ncv_amt_p_PPanel.setName("Rslt.ttl_ncv_amt_p");
		p.columnRslt_ttl_ncv_amt = p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_ncv_amt.addAliasName("Rslt.ttl_ncv_amt", p);
		p.Rslt_ttl_base_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ttl_base_amt_p);
		p.Rslt_ttl_base_amt_p_PPanel.setName("Rslt.ttl_base_amt_p");
		p.columnRslt_ttl_base_amt = p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_base_amt.addAliasName("Rslt.ttl_base_amt", p);
		p.Rslt_ttl_freight_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ttl_freight_amt_p);
		p.Rslt_ttl_freight_amt_p_PPanel.setName("Rslt.ttl_freight_amt_p");
		p.columnRslt_ttl_freight_amt = p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_freight_amt.addAliasName("Rslt.ttl_freight_amt", p);
		p.Rslt_ttl_insurance_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ttl_insurance_amt_p);
		p.Rslt_ttl_insurance_amt_p_PPanel.setName("Rslt.ttl_insurance_amt_p");
		p.columnRslt_ttl_insurance_amt = p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_insurance_amt.addAliasName("Rslt.ttl_insurance_amt", p);
		p.Rslt_ttl_other_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$ttl_other_amt_p);
		p.Rslt_ttl_other_amt_p_PPanel.setName("Rslt.ttl_other_amt_p");
		p.columnRslt_ttl_other_amt = p.Rslt_ttl_other_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_other_amt.addAliasName("Rslt.ttl_other_amt", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1760.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ExActListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_ExActListReg p) {
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
	
	
	/** [Cnd_dlv_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_typ_p = null;

	/**
	 * [Cnd_dlv_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_typ_ListPutter() {
		if (Cnd_dlv_id_typ_p == null) {
			Cnd_dlv_id_typ_p = createCnd_dlv_id_typ_ListPutter(Cnd_dlv_id_typ, "dlv_id_typ", "dlv_id_typ_nm");

		}
		return Cnd_dlv_id_typ_p;
	}
	
	
	/** [Cnd_dlv_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_cd_p = null;

	/**
	 * [Cnd_dlv_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_cd_ListPutter() {
		if (Cnd_dlv_id_cd_p == null) {
			Cnd_dlv_id_cd_p = createCnd_dlv_id_cd_ListPutter(Cnd_dlv_id_cd, "dlv_id_cd", "dlv_id_nm");

		}
		return Cnd_dlv_id_cd_p;
	}
	
	
	/** [Cnd_ship_rqst_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_typ_p = null;

	/**
	 * [Cnd_ship_rqst_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_typ_ListPutter() {
		if (Cnd_ship_rqst_id_typ_p == null) {
			Cnd_ship_rqst_id_typ_p = createCnd_ship_rqst_id_typ_ListPutter(Cnd_ship_rqst_id_typ, "ship_rqst_id_typ", "ship_rqst_id_typ_nm");

		}
		return Cnd_ship_rqst_id_typ_p;
	}
	
	
	/** [Cnd_ship_rqst_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_cd_p = null;

	/**
	 * [Cnd_ship_rqst_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_cd_ListPutter() {
		if (Cnd_ship_rqst_id_cd_p == null) {
			Cnd_ship_rqst_id_cd_p = createCnd_ship_rqst_id_cd_ListPutter(Cnd_ship_rqst_id_cd, "ship_rqst_id_cd", "ship_rqst_id_nm");

		}
		return Cnd_ship_rqst_id_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ExActListReg create(){
		MSBEP_ExActListReg p = new MSBEP_ExActListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ExActListReg create(String name){
		MSBEP_ExActListReg p = new MSBEP_ExActListReg(name);
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
		MSBEP_ExActListReg_MC.jbfInitScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitTop((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitFold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitTab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitTab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitTab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitDlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitRqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitCtrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitBulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitRslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitBtn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbfInitEastBtn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitTop((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitFold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitTab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitTab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitTab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitDlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitRqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitCtrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitBulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitRslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitBtn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.jbInitEastBtn((MSBEP_ExActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ExActListReg p) {
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
	protected static void jbfInitTab1(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [RqstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqstCnd(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.RqstCndPanel = p.beansFactory.createPanel("RqstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmpl_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.cmpl_schd_dt_fr_Label");
		p.Cnd_cmpl_schd_dt_fr = p.beansFactory.createDateField("Cnd.cmpl_schd_dt_fr");
		p.Cnd_cmpl_schd_dt_fr.setLabel(p.Cnd_cmpl_schd_dt_fr_Label);
		p.Cnd_cmpl_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.cmpl_schd_dt_to_Label");
		p.Cnd_cmpl_schd_dt_to = p.beansFactory.createDateField("Cnd.cmpl_schd_dt_to");
		p.Cnd_cmpl_schd_dt_to.setLabel(p.Cnd_cmpl_schd_dt_to_Label);
		p.Cnd_tdlv_cd_Label = p.beansFactory.createLabel("Cnd.tdlv_cd_Label");
		p.Cnd_tdlv_cd = p.beansFactory.createTextField("Cnd.tdlv_cd");
		p.Cnd_tdlv_cd.setLabel(p.Cnd_tdlv_cd_Label);
		p.Cnd_tdlv_nm = p.beansFactory.createTextField("Cnd.tdlv_nm");
		p.Cnd_dlv_id_typ_Label = p.beansFactory.createLabel("Cnd.dlv_id_typ_Label");
		p.Cnd_dlv_id_typ = p.beansFactory.createTextComboBox("Cnd.dlv_id_typ");
		p.Cnd_dlv_id_typ.setLabel(p.Cnd_dlv_id_typ_Label);
		p.Cnd_dlv_id_typ_nm = p.beansFactory.createTextField("Cnd.dlv_id_typ_nm");
		p.Cnd_dlv_id_cd_Label = p.beansFactory.createLabel("Cnd.dlv_id_cd_Label");
		p.Cnd_dlv_id_cd = p.beansFactory.createTextField("Cnd.dlv_id_cd");
		p.Cnd_dlv_id_cd.setLabel(p.Cnd_dlv_id_cd_Label);
		p.Cnd_dlv_id_nm = p.beansFactory.createTextField("Cnd.dlv_id_nm");
		p.Cnd_ship_rqst_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_typ_Label");
		p.Cnd_ship_rqst_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_rqst_id_typ");
		p.Cnd_ship_rqst_id_typ.setLabel(p.Cnd_ship_rqst_id_typ_Label);
		p.Cnd_ship_rqst_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_typ_nm");
		p.Cnd_ship_rqst_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_cd_Label");
		p.Cnd_ship_rqst_id_cd = p.beansFactory.createTextField("Cnd.ship_rqst_id_cd");
		p.Cnd_ship_rqst_id_cd.setLabel(p.Cnd_ship_rqst_id_cd_Label);
		p.Cnd_ship_rqst_id_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_nm");
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_ship_rqst_no_Label = p.beansFactory.createLabel("Cnd.ship_rqst_no_Label");
		p.Cnd_ship_rqst_no = p.beansFactory.createTextField("Cnd.ship_rqst_no");
		p.Cnd_ship_rqst_no.setLabel(p.Cnd_ship_rqst_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
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
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_cmpl_dt_Label = p.beansFactory.createLabel("BulkSet.cmpl_dt_Label");
		p.BulkSet_cmpl_dt = p.beansFactory.createDateField("BulkSet.cmpl_dt");
		p.BulkSet_cmpl_dt.setLabel(p.BulkSet_cmpl_dt_Label);
		p.BulkSet_bill_basis_dt_Label = p.beansFactory.createLabel("BulkSet.bill_basis_dt_Label");
		p.BulkSet_bill_basis_dt = p.beansFactory.createDateField("BulkSet.bill_basis_dt");
		p.BulkSet_bill_basis_dt.setLabel(p.BulkSet_bill_basis_dt_Label);
		p.BulkSet_rcv_schd_dt_Label = p.beansFactory.createLabel("BulkSet.rcv_schd_dt_Label");
		p.BulkSet_rcv_schd_dt = p.beansFactory.createDateField("BulkSet.rcv_schd_dt");
		p.BulkSet_rcv_schd_dt.setLabel(p.BulkSet_rcv_schd_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_cmpl_schd_dt = p.beansFactory.createTableColumn("Rslt.cmpl_schd_dt", MCColumnType.DATE);
		p.columnRslt_cmpl_dt = p.beansFactory.createTableColumn("Rslt.cmpl_dt", MCColumnType.DATE);
		p.columnRslt_arr_schd_dt = p.beansFactory.createTableColumn("Rslt.arr_schd_dt", MCColumnType.DATE);
		p.columnRslt_sls_schd_dt = p.beansFactory.createTableColumn("Rslt.sls_schd_dt", MCColumnType.DATE);
		p.columnRslt_bill_basis_dt = p.beansFactory.createTableColumn("Rslt.bill_basis_dt", MCColumnType.DATE);
		p.columnRslt_rcv_schd_dt = p.beansFactory.createTableColumn("Rslt.rcv_schd_dt", MCColumnType.DATE);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_cd = p.beansFactory.createTableColumn("Rslt.dlv_id_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_id_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_cntry_cd = p.beansFactory.createTableColumn("Rslt.dlv_cntry_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_cntry_nm = p.beansFactory.createTableColumn("Rslt.dlv_cntry_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_typ = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_typ", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_cd = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_nm", MCColumnType.TEXT);
		p.columnRslt_bl_no = p.beansFactory.createTableColumn("Rslt.bl_no", MCColumnType.TEXT);
		p.columnRslt_bl_dt = p.beansFactory.createTableColumn("Rslt.bl_dt", MCColumnType.DATE);
		p.columnRslt_bl_rmrks = p.beansFactory.createTableColumn("Rslt.bl_rmrks", MCColumnType.TEXT);
		p.columnRslt_tdlv_cd = p.beansFactory.createTableColumn("Rslt.tdlv_cd", MCColumnType.TEXT);
		p.columnRslt_tdlv_nm = p.beansFactory.createTableColumn("Rslt.tdlv_nm", MCColumnType.TEXT);
		p.columnRslt_trnspt_cd = p.beansFactory.createTableColumn("Rslt.trnspt_cd", MCColumnType.TEXT);
		p.columnRslt_trnspt_nm = p.beansFactory.createTableColumn("Rslt.trnspt_nm", MCColumnType.TEXT);
		p.columnRslt_vssl_flght = p.beansFactory.createTableColumn("Rslt.vssl_flght", MCColumnType.TEXT);
		p.columnRslt_load_port_cd = p.beansFactory.createTableColumn("Rslt.load_port_cd", MCColumnType.TEXT);
		p.columnRslt_load_port_nm = p.beansFactory.createTableColumn("Rslt.load_port_nm", MCColumnType.TEXT);
		p.columnRslt_etd_dt = p.beansFactory.createTableColumn("Rslt.etd_dt", MCColumnType.DATE);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_bill_cl_typ = p.beansFactory.createTableColumn("Rslt.bill_cl_typ", MCColumnType.TEXT);
		p.columnRslt_iv_upd_cntr = p.beansFactory.createTableColumn("Rslt.iv_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_sls_cststk_flg = p.beansFactory.createTableColumn("Rslt.sls_cststk_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1730 = p.beansFactory.createButton("Btn.open_MSBEP1730", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ExActListReg p) {
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
	protected static void jbInitTop(MSBEP_ExActListReg p) {
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
	protected static void jbInitFold(MSBEP_ExActListReg p) {
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
	protected static void jbInitTab1(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.DlvCndPanel, null);
		p.Tab2Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.RqstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.RqstCndPanel);
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [RqstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqstCnd(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.RqstCndPanel.setValueCheck(false);
		p.RqstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RqstCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ExActListReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.ope_META);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_cmpl_schd_dt_fr);
		p.Cnd_cmpl_schd_dt_fr.setNextBeans(p.Cnd_cmpl_schd_dt_to);
		p.Cnd_cmpl_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.cmpl_schd_dt_fr_META);
		p.Cnd_cmpl_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_cmpl_schd_dt_to);
		p.Cnd_cmpl_schd_dt_to.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_cmpl_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.cmpl_schd_dt_to_META);
		p.Cnd_cmpl_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_dlv_id_typ);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.tdlv_nm_META);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.dlv_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.dlv_id_cd_META);
		p.Cnd_dlv_id_cd.addLinkBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_ship_rqst_id_typ);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.Cnd_ship_rqst_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_typ, true);
		p.Cnd_ship_rqst_id_typ.setLinkBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ);
		p.Cnd_ship_rqst_id_typ.setNextBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.ship_rqst_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ_nm.setNextBeans(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.ship_rqst_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_cd.setNextBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.ship_rqst_id_cd_META);
		p.Cnd_ship_rqst_id_cd.addLinkBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_nm.setNextBeans(p.Cnd_iv_no);
		p.Cnd_ship_rqst_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.ship_rqst_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_nm, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_ship_rqst_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_ship_rqst_no_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_no);
		p.Cnd_ship_rqst_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_ship_rqst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.ship_rqst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1760.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.RqstCndPanel.add(p.Cnd_rqst_grp_p_PPanel);
		p.RqstCndPanel.setLastBeans(p.Cnd_rqst_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_ExActListReg p) {
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
	protected static void jbInitBulkSet(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_cmpl_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_cmpl_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_cmpl_dt);
		p.BulkSet_cmpl_dt.setNextBeans(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_cmpl_dt.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1760.BulkSetR.cmpl_dt_META);
		p.BulkSet_cmpl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_ac_dt_p_PPanel.setNextBeans(p.BulkSet_bill_basis_dt);
		p.BulkSetPanel.add(p.BulkSet_bill_basis_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_bill_basis_dt);
		p.BulkSet_bill_basis_dt.setNextBeans(p.BulkSet_rcv_schd_dt);
		p.BulkSet_bill_basis_dt.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1760.BulkSetR.bill_basis_dt_META);
		p.BulkSet_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_rcv_schd_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_rcv_schd_dt);
		p.BulkSet_rcv_schd_dt.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1760.BulkSetR.rcv_schd_dt_META);
		p.BulkSet_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_ExActListReg p) {
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
	protected static void jbInitBtn(MSBEP_ExActListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1730.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1730);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1730);
		p.Btn_open_MSBEP1730.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MSBEP_ExActListReg p) {
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
		MSBEP_ExActListReg_MC.mcInitScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitTop((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitFold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitTab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitTab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitTab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitDlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitRqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitCtrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitBulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitRslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitBtn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.mcInitEastBtn((MSBEP_ExActListReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_ExActListReg_MC.statusInitSRCH_ScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Top((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Fold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Tab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Tab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Tab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_DlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_RqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Cnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Hdr((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Ctrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_BulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Rslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_ShipPrCnt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_Btn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitSRCH_EastBtn((MSBEP_ExActListReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_ExActListReg_MC.statusInitINS_ScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Top((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Fold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Tab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Tab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Tab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_DlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_RqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Cnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Hdr((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Ctrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_BulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Rslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_ShipPrCnt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_Btn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitINS_EastBtn((MSBEP_ExActListReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ExActListReg_MC.statusInitUPD_ScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Top((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Fold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Tab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Tab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Tab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_DlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_RqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Cnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Hdr((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Ctrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_BulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Rslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_ShipPrCnt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_Btn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitUPD_EastBtn((MSBEP_ExActListReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_ExActListReg_MC.statusInitDEL_ScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Top((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Fold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Tab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Tab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Tab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_DlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_RqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Cnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Hdr((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Ctrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_BulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Rslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_ShipPrCnt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_Btn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitDEL_EastBtn((MSBEP_ExActListReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_ExActListReg_MC.statusInitREF_ScreenOpe((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Top((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Fold((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Tab1((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Tab2((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Tab3((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_DlvCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_RqstCnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Cnd((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Hdr((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Ctrl((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_BulkSet((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Rslt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_ShipPrCnt((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_Btn((MSBEP_ExActListReg)this);
		MSBEP_ExActListReg_MC.statusInitREF_EastBtn((MSBEP_ExActListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ExActListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ExActListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ExActListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_ExActListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_ExActListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_ExActListReg p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBEP_ExActListReg p) {
	}

	/**
	 *  [RqstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqstCnd(MSBEP_ExActListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ExActListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmpl_schd_dt_fr.setListListener(p);
		p.Cnd_cmpl_schd_dt_fr.addAllListener(p);
		p.Cnd_cmpl_schd_dt_to.setListListener(p);
		p.Cnd_cmpl_schd_dt_to.addAllListener(p);
		p.Cnd_tdlv_cd.setListListener(p);
		p.Cnd_tdlv_cd.addAllListener(p);
		p.Cnd_tdlv_nm.setListListener(p);
		p.Cnd_tdlv_nm.addAllListener(p);
		p.Cnd_dlv_id_typ.setListListener(p);
		p.Cnd_dlv_id_typ.addAllListener(p);
		p.Cnd_dlv_id_typ_nm.setListListener(p);
		p.Cnd_dlv_id_typ_nm.addAllListener(p);
		p.Cnd_dlv_id_cd.setListListener(p);
		p.Cnd_dlv_id_cd.addAllListener(p);
		p.Cnd_dlv_id_nm.setListListener(p);
		p.Cnd_dlv_id_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_typ.setListListener(p);
		p.Cnd_ship_rqst_id_typ.addAllListener(p);
		p.Cnd_ship_rqst_id_typ_nm.setListListener(p);
		p.Cnd_ship_rqst_id_typ_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_cd.setListListener(p);
		p.Cnd_ship_rqst_id_cd.addAllListener(p);
		p.Cnd_ship_rqst_id_nm.setListListener(p);
		p.Cnd_ship_rqst_id_nm.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_ship_rqst_no.setListListener(p);
		p.Cnd_ship_rqst_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_ExActListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_ExActListReg p) {
		p.BulkSet_cmpl_dt.setListListener(p);
		p.BulkSet_cmpl_dt.addAllListener(p);
		p.BulkSet_bill_basis_dt.setListListener(p);
		p.BulkSet_bill_basis_dt.addAllListener(p);
		p.BulkSet_rcv_schd_dt.setListListener(p);
		p.BulkSet_rcv_schd_dt.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_ExActListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_cmpl_schd_dt.addAllListener(p);
		p.columnRslt_cmpl_schd_dt.setListListener(p);
		p.columnRslt_cmpl_dt.addAllListener(p);
		p.columnRslt_cmpl_dt.setListListener(p);
		p.columnRslt_arr_schd_dt.addAllListener(p);
		p.columnRslt_arr_schd_dt.setListListener(p);
		p.columnRslt_sls_schd_dt.addAllListener(p);
		p.columnRslt_sls_schd_dt.setListListener(p);
		p.columnRslt_bill_basis_dt.addAllListener(p);
		p.columnRslt_bill_basis_dt.setListListener(p);
		p.columnRslt_rcv_schd_dt.addAllListener(p);
		p.columnRslt_rcv_schd_dt.setListListener(p);
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_cd.addAllListener(p);
		p.columnRslt_dlv_id_cd.setListListener(p);
		p.columnRslt_dlv_id_nm.addAllListener(p);
		p.columnRslt_dlv_id_nm.setListListener(p);
		p.columnRslt_dlv_cntry_cd.addAllListener(p);
		p.columnRslt_dlv_cntry_cd.setListListener(p);
		p.columnRslt_dlv_cntry_nm.addAllListener(p);
		p.columnRslt_dlv_cntry_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_typ.addAllListener(p);
		p.columnRslt_ship_rqst_id_typ.setListListener(p);
		p.columnRslt_ship_rqst_id_typ_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_typ_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_cd.addAllListener(p);
		p.columnRslt_ship_rqst_id_cd.setListListener(p);
		p.columnRslt_ship_rqst_id_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_nm.setListListener(p);
		p.columnRslt_bl_no.addAllListener(p);
		p.columnRslt_bl_no.setListListener(p);
		p.columnRslt_bl_dt.addAllListener(p);
		p.columnRslt_bl_dt.setListListener(p);
		p.columnRslt_bl_rmrks.addAllListener(p);
		p.columnRslt_bl_rmrks.setListListener(p);
		p.columnRslt_tdlv_cd.addAllListener(p);
		p.columnRslt_tdlv_cd.setListListener(p);
		p.columnRslt_tdlv_nm.addAllListener(p);
		p.columnRslt_tdlv_nm.setListListener(p);
		p.columnRslt_trnspt_cd.addAllListener(p);
		p.columnRslt_trnspt_cd.setListListener(p);
		p.columnRslt_trnspt_nm.addAllListener(p);
		p.columnRslt_trnspt_nm.setListListener(p);
		p.columnRslt_vssl_flght.addAllListener(p);
		p.columnRslt_vssl_flght.setListListener(p);
		p.columnRslt_load_port_cd.addAllListener(p);
		p.columnRslt_load_port_cd.setListListener(p);
		p.columnRslt_load_port_nm.addAllListener(p);
		p.columnRslt_load_port_nm.setListListener(p);
		p.columnRslt_etd_dt.addAllListener(p);
		p.columnRslt_etd_dt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_bill_cl_typ.addAllListener(p);
		p.columnRslt_bill_cl_typ.setListListener(p);
		p.columnRslt_iv_upd_cntr.addAllListener(p);
		p.columnRslt_iv_upd_cntr.setListListener(p);
		p.columnRslt_sls_cststk_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ExActListReg p) {
		p.Btn_open_MSBEP1730.addAllListener(p);
		p.Btn_open_MSBEP1730.setAPMethodName("doBtn_open_MSBEP1730");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_ExActListReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[RqstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RqstCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_ExActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rqst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_ExActListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBEP_ExActListReg p){
		p.BulkSet_cmpl_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_bill_basis_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.BulkSet_rcv_schd_dt.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_ExActListReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cmpl_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.ENABLE);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_arr_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tdlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tdlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_iv_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ShipPrCnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipPrCnt(MSBEP_ExActListReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_ExActListReg p){
		p.Btn_open_MSBEP1730.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DlvCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[RqstCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_RqstCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_ExActListReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rqst_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBEP_ExActListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBEP_ExActListReg p){
		p.BulkSet_cmpl_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_bill_basis_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_rcv_schd_dt.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBEP_ExActListReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cmpl_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_arr_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_sls_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_bill_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_rcv_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_dlv_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_bl_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_bl_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_tdlv_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_tdlv_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_iv_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[ShipPrCnt]ブロックのモードの設定
	 */
	protected static void statusInitINS_ShipPrCnt(MSBEP_ExActListReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_ExActListReg p){
		p.Btn_open_MSBEP1730.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[RqstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RqstCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ExActListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rqst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_ExActListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBEP_ExActListReg p){
		p.BulkSet_cmpl_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_bill_basis_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rcv_schd_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBEP_ExActListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cmpl_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnRslt_arr_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sls_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_bill_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_rcv_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_bl_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_bl_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_tdlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_tdlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ShipPrCnt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipPrCnt(MSBEP_ExActListReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ExActListReg p){
		p.Btn_open_MSBEP1730.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DlvCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[RqstCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RqstCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_ExActListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rqst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBEP_ExActListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBEP_ExActListReg p){
		p.BulkSet_cmpl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBEP_ExActListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cmpl_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnRslt_arr_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_tdlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_tdlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[ShipPrCnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipPrCnt(MSBEP_ExActListReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_ExActListReg p){
		p.Btn_open_MSBEP1730.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DlvCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[RqstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RqstCnd(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_ExActListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmpl_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cmpl_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rqst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_ExActListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBEP_ExActListReg p){
		p.BulkSet_cmpl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_ExActListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cmpl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cmpl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_arr_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bl_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tdlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tdlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ttl_iv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_ncv_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_base_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_freight_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_insurance_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_other_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_iv_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ShipPrCnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipPrCnt(MSBEP_ExActListReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_ExActListReg p){
		p.Btn_open_MSBEP1730.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_ExActListReg p){

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
		MSBEP_ExActListReg_MC.setTableConfigRslt((MSBEP_ExActListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_ExActListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_cmpl_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.cmpl_schd_dt_META);
		p.columnRslt_cmpl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_cmpl_schd_dt);
		p.columnRslt_cmpl_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.cmpl_dt_META);
		p.columnRslt_cmpl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_cmpl_dt);
		p.RsltTable.addTable(p.Rslt_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_can_ac_dt_p_PPanel.CanAcDtTable);
		p.columnRslt_arr_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.arr_schd_dt_META);
		p.columnRslt_arr_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_dt);
		p.columnRslt_sls_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.sls_schd_dt_META);
		p.columnRslt_sls_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_schd_dt);
		p.columnRslt_bill_basis_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.bill_basis_dt_META);
		p.columnRslt_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_basis_dt);
		p.columnRslt_rcv_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.rcv_schd_dt_META);
		p.columnRslt_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_dt);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.columnRslt_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.dlv_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_cd);
		p.columnRslt_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.dlv_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_nm);
		p.columnRslt_dlv_cntry_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.dlv_cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cntry_cd);
		p.columnRslt_dlv_cntry_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.dlv_cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cntry_nm);
		p.columnRslt_ship_rqst_id_typ.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.ship_rqst_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_typ);
		p.columnRslt_ship_rqst_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.ship_rqst_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_typ_nm);
		p.columnRslt_ship_rqst_id_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.ship_rqst_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_cd);
		p.columnRslt_ship_rqst_id_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.ship_rqst_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_nm);
		p.columnRslt_bl_no.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.bl_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bl_no);
		p.columnRslt_bl_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.bl_dt_META);
		p.columnRslt_bl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bl_dt);
		p.columnRslt_bl_rmrks.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.bl_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bl_rmrks);
		p.columnRslt_tdlv_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.tdlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tdlv_cd);
		p.columnRslt_tdlv_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.tdlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tdlv_nm);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_vssl_flght.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.vssl_flght_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vssl_flght);
		p.columnRslt_load_port_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.load_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_cd);
		p.columnRslt_load_port_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.load_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_nm);
		p.columnRslt_etd_dt.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.etd_dt_META);
		p.columnRslt_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_etd_dt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_ttl_iv_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_ncv_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_base_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_freight_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_insurance_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_other_amt_p_PPanel.AmtTable);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_bill_cl_typ.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.bill_cl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_typ);
		p.columnRslt_iv_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.iv_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_upd_cntr);
		p.columnRslt_sls_cststk_flg.setMeta(mcframe.clientMSBE.MSBEP1760.RsltR.sls_cststk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_cststk_flg);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_id_typ.getListConfig().setPutter(getCnd_dlv_id_typ_ListPutter());
		Cnd_dlv_id_cd.getListConfig().setPutter(getCnd_dlv_id_cd_ListPutter());
		Cnd_ship_rqst_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_rqst_id_typ.getListConfig().setPutter(getCnd_ship_rqst_id_typ_ListPutter());
		Cnd_ship_rqst_id_cd.getListConfig().setPutter(getCnd_ship_rqst_id_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
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
	 * [Cnd_dlv_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DlvIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.DlvId");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_rqst_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipRqstIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_rqst_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipRqstId");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_dlv_id_typ) return getCnd_dlv_id_typ(row, info);
		if(combo == Cnd_dlv_id_cd) return getCnd_dlv_id_cd(row, info);
		if(combo == Cnd_ship_rqst_id_typ) return getCnd_ship_rqst_id_typ(row, info);
		if(combo == Cnd_ship_rqst_id_cd) return getCnd_ship_rqst_id_cd(row, info);
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
		else if (ap == Btn_open_MSBEP1730) doBtn_open_MSBEP1730(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1730]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1730(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == Cnd_cmpl_schd_dt_fr) return doCnd_cmpl_schd_dt_fr_VC(info);
		if (vc == Cnd_cmpl_schd_dt_to) return doCnd_cmpl_schd_dt_to_VC(info);
		if (vc == Cnd_tdlv_cd) return doCnd_tdlv_cd_VC(info);
		if (vc == Cnd_tdlv_nm) return doCnd_tdlv_nm_VC(info);
		if (vc == Cnd_dlv_id_typ) return doCnd_dlv_id_typ_VC(info);
		if (vc == Cnd_dlv_id_typ_nm) return doCnd_dlv_id_typ_nm_VC(info);
		if (vc == Cnd_dlv_id_cd) return doCnd_dlv_id_cd_VC(info);
		if (vc == Cnd_dlv_id_nm) return doCnd_dlv_id_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_typ) return doCnd_ship_rqst_id_typ_VC(info);
		if (vc == Cnd_ship_rqst_id_typ_nm) return doCnd_ship_rqst_id_typ_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_cd) return doCnd_ship_rqst_id_cd_VC(info);
		if (vc == Cnd_ship_rqst_id_nm) return doCnd_ship_rqst_id_nm_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_ship_rqst_no) return doCnd_ship_rqst_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == BulkSet_cmpl_dt) return doBulkSet_cmpl_dt_VC(info);
		if (vc == BulkSet_bill_basis_dt) return doBulkSet_bill_basis_dt_VC(info);
		if (vc == BulkSet_rcv_schd_dt) return doBulkSet_rcv_schd_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_cmpl_schd_dt) return doRslt_cmpl_schd_dt_VC(info);
		if (vc == columnRslt_cmpl_dt) return doRslt_cmpl_dt_VC(info);
		if (vc == columnRslt_arr_schd_dt) return doRslt_arr_schd_dt_VC(info);
		if (vc == columnRslt_sls_schd_dt) return doRslt_sls_schd_dt_VC(info);
		if (vc == columnRslt_bill_basis_dt) return doRslt_bill_basis_dt_VC(info);
		if (vc == columnRslt_rcv_schd_dt) return doRslt_rcv_schd_dt_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_cd) return doRslt_dlv_id_cd_VC(info);
		if (vc == columnRslt_dlv_id_nm) return doRslt_dlv_id_nm_VC(info);
		if (vc == columnRslt_dlv_cntry_cd) return doRslt_dlv_cntry_cd_VC(info);
		if (vc == columnRslt_dlv_cntry_nm) return doRslt_dlv_cntry_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_typ) return doRslt_ship_rqst_id_typ_VC(info);
		if (vc == columnRslt_ship_rqst_id_typ_nm) return doRslt_ship_rqst_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_cd) return doRslt_ship_rqst_id_cd_VC(info);
		if (vc == columnRslt_ship_rqst_id_nm) return doRslt_ship_rqst_id_nm_VC(info);
		if (vc == columnRslt_bl_no) return doRslt_bl_no_VC(info);
		if (vc == columnRslt_bl_dt) return doRslt_bl_dt_VC(info);
		if (vc == columnRslt_bl_rmrks) return doRslt_bl_rmrks_VC(info);
		if (vc == columnRslt_tdlv_cd) return doRslt_tdlv_cd_VC(info);
		if (vc == columnRslt_tdlv_nm) return doRslt_tdlv_nm_VC(info);
		if (vc == columnRslt_trnspt_cd) return doRslt_trnspt_cd_VC(info);
		if (vc == columnRslt_trnspt_nm) return doRslt_trnspt_nm_VC(info);
		if (vc == columnRslt_vssl_flght) return doRslt_vssl_flght_VC(info);
		if (vc == columnRslt_load_port_cd) return doRslt_load_port_cd_VC(info);
		if (vc == columnRslt_load_port_nm) return doRslt_load_port_nm_VC(info);
		if (vc == columnRslt_etd_dt) return doRslt_etd_dt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_bill_cl_typ) return doRslt_bill_cl_typ_VC(info);
		if (vc == columnRslt_iv_upd_cntr) return doRslt_iv_upd_cntr_VC(info);
		if (vc == columnRslt_sls_cststk_flg) return doRslt_sls_cststk_flg_VC(info);
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
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_no_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[cmpl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cmpl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rcv_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cmpl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cmpl_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tdlv_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[vssl_flght]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vssl_flght_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[etd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_etd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_cststk_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_NC(info);
		else if (nc == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_NC(info);
		else if (nc == Cnd_tdlv_cd) doCnd_tdlv_cd_NC(info);
		else if (nc == Cnd_tdlv_nm) doCnd_tdlv_nm_NC(info);
		else if (nc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NC(info);
		else if (nc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NC(info);
		else if (nc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NC(info);
		else if (nc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NC(info);
		else if (nc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == BulkSet_cmpl_dt) doBulkSet_cmpl_dt_NC(info);
		else if (nc == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_NC(info);
		else if (nc == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_NC(info);
		else if (nc == columnRslt_cmpl_dt) doRslt_cmpl_dt_NC(info);
		else if (nc == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_NC(info);
		else if (nc == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_NC(info);
		else if (nc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NC(info);
		else if (nc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NC(info);
		else if (nc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NC(info);
		else if (nc == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_NC(info);
		else if (nc == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NC(info);
		else if (nc == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NC(info);
		else if (nc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NC(info);
		else if (nc == columnRslt_bl_no) doRslt_bl_no_NC(info);
		else if (nc == columnRslt_bl_dt) doRslt_bl_dt_NC(info);
		else if (nc == columnRslt_bl_rmrks) doRslt_bl_rmrks_NC(info);
		else if (nc == columnRslt_tdlv_cd) doRslt_tdlv_cd_NC(info);
		else if (nc == columnRslt_tdlv_nm) doRslt_tdlv_nm_NC(info);
		else if (nc == columnRslt_trnspt_cd) doRslt_trnspt_cd_NC(info);
		else if (nc == columnRslt_trnspt_nm) doRslt_trnspt_nm_NC(info);
		else if (nc == columnRslt_vssl_flght) doRslt_vssl_flght_NC(info);
		else if (nc == columnRslt_load_port_cd) doRslt_load_port_cd_NC(info);
		else if (nc == columnRslt_load_port_nm) doRslt_load_port_nm_NC(info);
		else if (nc == columnRslt_etd_dt) doRslt_etd_dt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_NC(info);
		else if (nc == columnRslt_iv_upd_cntr) doRslt_iv_upd_cntr_NC(info);
		else if (nc == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NC(info);
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
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[cmpl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cmpl_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[vssl_flght]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_NE(info);
		else if (ne == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_NE(info);
		else if (ne == Cnd_tdlv_cd) doCnd_tdlv_cd_NE(info);
		else if (ne == Cnd_tdlv_nm) doCnd_tdlv_nm_NE(info);
		else if (ne == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NE(info);
		else if (ne == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NE(info);
		else if (ne == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NE(info);
		else if (ne == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NE(info);
		else if (ne == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == BulkSet_cmpl_dt) doBulkSet_cmpl_dt_NE(info);
		else if (ne == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_NE(info);
		else if (ne == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_NE(info);
		else if (ne == columnRslt_cmpl_dt) doRslt_cmpl_dt_NE(info);
		else if (ne == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_NE(info);
		else if (ne == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_NE(info);
		else if (ne == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NE(info);
		else if (ne == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NE(info);
		else if (ne == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NE(info);
		else if (ne == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_NE(info);
		else if (ne == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NE(info);
		else if (ne == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NE(info);
		else if (ne == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NE(info);
		else if (ne == columnRslt_bl_no) doRslt_bl_no_NE(info);
		else if (ne == columnRslt_bl_dt) doRslt_bl_dt_NE(info);
		else if (ne == columnRslt_bl_rmrks) doRslt_bl_rmrks_NE(info);
		else if (ne == columnRslt_tdlv_cd) doRslt_tdlv_cd_NE(info);
		else if (ne == columnRslt_tdlv_nm) doRslt_tdlv_nm_NE(info);
		else if (ne == columnRslt_trnspt_cd) doRslt_trnspt_cd_NE(info);
		else if (ne == columnRslt_trnspt_nm) doRslt_trnspt_nm_NE(info);
		else if (ne == columnRslt_vssl_flght) doRslt_vssl_flght_NE(info);
		else if (ne == columnRslt_load_port_cd) doRslt_load_port_cd_NE(info);
		else if (ne == columnRslt_load_port_nm) doRslt_load_port_nm_NE(info);
		else if (ne == columnRslt_etd_dt) doRslt_etd_dt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_NE(info);
		else if (ne == columnRslt_iv_upd_cntr) doRslt_iv_upd_cntr_NE(info);
		else if (ne == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NE(info);
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
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[cmpl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cmpl_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[vssl_flght]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_NX(info);
		else if (nx == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_NX(info);
		else if (nx == Cnd_tdlv_cd) doCnd_tdlv_cd_NX(info);
		else if (nx == Cnd_tdlv_nm) doCnd_tdlv_nm_NX(info);
		else if (nx == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NX(info);
		else if (nx == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NX(info);
		else if (nx == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NX(info);
		else if (nx == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NX(info);
		else if (nx == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == BulkSet_cmpl_dt) doBulkSet_cmpl_dt_NX(info);
		else if (nx == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_NX(info);
		else if (nx == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_NX(info);
		else if (nx == columnRslt_cmpl_dt) doRslt_cmpl_dt_NX(info);
		else if (nx == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_NX(info);
		else if (nx == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_NX(info);
		else if (nx == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NX(info);
		else if (nx == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NX(info);
		else if (nx == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NX(info);
		else if (nx == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_NX(info);
		else if (nx == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NX(info);
		else if (nx == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NX(info);
		else if (nx == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NX(info);
		else if (nx == columnRslt_bl_no) doRslt_bl_no_NX(info);
		else if (nx == columnRslt_bl_dt) doRslt_bl_dt_NX(info);
		else if (nx == columnRslt_bl_rmrks) doRslt_bl_rmrks_NX(info);
		else if (nx == columnRslt_tdlv_cd) doRslt_tdlv_cd_NX(info);
		else if (nx == columnRslt_tdlv_nm) doRslt_tdlv_nm_NX(info);
		else if (nx == columnRslt_trnspt_cd) doRslt_trnspt_cd_NX(info);
		else if (nx == columnRslt_trnspt_nm) doRslt_trnspt_nm_NX(info);
		else if (nx == columnRslt_vssl_flght) doRslt_vssl_flght_NX(info);
		else if (nx == columnRslt_load_port_cd) doRslt_load_port_cd_NX(info);
		else if (nx == columnRslt_load_port_nm) doRslt_load_port_nm_NX(info);
		else if (nx == columnRslt_etd_dt) doRslt_etd_dt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_NX(info);
		else if (nx == columnRslt_iv_upd_cntr) doRslt_iv_upd_cntr_NX(info);
		else if (nx == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NX(info);
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
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[cmpl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cmpl_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[vssl_flght]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_cmpl_schd_dt_fr) doCnd_cmpl_schd_dt_fr_LC(info);
		else if (lc == Cnd_cmpl_schd_dt_to) doCnd_cmpl_schd_dt_to_LC(info);
		else if (lc == Cnd_tdlv_cd) doCnd_tdlv_cd_LC(info);
		else if (lc == Cnd_tdlv_nm) doCnd_tdlv_nm_LC(info);
		else if (lc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_LC(info);
		else if (lc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_LC(info);
		else if (lc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_LC(info);
		else if (lc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_LC(info);
		else if (lc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_ship_rqst_no) doCnd_ship_rqst_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_cmpl_dt) doBulkSet_cmpl_dt_LC(info);
		else if (lc == BulkSet_bill_basis_dt) doBulkSet_bill_basis_dt_LC(info);
		else if (lc == BulkSet_rcv_schd_dt) doBulkSet_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_cmpl_schd_dt) doRslt_cmpl_schd_dt_LC(info);
		else if (lc == columnRslt_cmpl_dt) doRslt_cmpl_dt_LC(info);
		else if (lc == columnRslt_arr_schd_dt) doRslt_arr_schd_dt_LC(info);
		else if (lc == columnRslt_sls_schd_dt) doRslt_sls_schd_dt_LC(info);
		else if (lc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_LC(info);
		else if (lc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_LC(info);
		else if (lc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_LC(info);
		else if (lc == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_LC(info);
		else if (lc == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_LC(info);
		else if (lc == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_LC(info);
		else if (lc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_LC(info);
		else if (lc == columnRslt_bl_no) doRslt_bl_no_LC(info);
		else if (lc == columnRslt_bl_dt) doRslt_bl_dt_LC(info);
		else if (lc == columnRslt_bl_rmrks) doRslt_bl_rmrks_LC(info);
		else if (lc == columnRslt_tdlv_cd) doRslt_tdlv_cd_LC(info);
		else if (lc == columnRslt_tdlv_nm) doRslt_tdlv_nm_LC(info);
		else if (lc == columnRslt_trnspt_cd) doRslt_trnspt_cd_LC(info);
		else if (lc == columnRslt_trnspt_nm) doRslt_trnspt_nm_LC(info);
		else if (lc == columnRslt_vssl_flght) doRslt_vssl_flght_LC(info);
		else if (lc == columnRslt_load_port_cd) doRslt_load_port_cd_LC(info);
		else if (lc == columnRslt_load_port_nm) doRslt_load_port_nm_LC(info);
		else if (lc == columnRslt_etd_dt) doRslt_etd_dt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_LC(info);
		else if (lc == columnRslt_iv_upd_cntr) doRslt_iv_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[cmpl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cmpl_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cmpl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cmpl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[vssl_flght]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_cd]の作成メソッド
	 */
	public MCList getCnd_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_typ]の作成メソッド
	 */
	public MCList getCnd_dlv_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDlvIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getDlvId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_typ]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipRqstIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_cd]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipRqstId(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1760.Srch01")) {
			return new MS_MSBEL1760_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1760.Upd01")) {
			return new MS_MSBEL1760_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1760.Del01")) {
			return new MS_MSBEL1760_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1760_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1760_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1760_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1760_Srch01Bridge() {
			p_MS_MSBEL1760_Srch01 = new MCParam(PDef.MS_MSBEL1760_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1760_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1760.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.ShipPrCntR.class));

			p_MS_MSBEL1760_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1760_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1760_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1760_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1760_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1760.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1760.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1760.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1760_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));
			p_MS_MSBEL1760_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.ShipPrCntR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1760_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)p_MS_MSBEL1760_Srch01.getContainerParam().getDownBlock(0));
			setShipPrCntL((MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR>)p_MS_MSBEL1760_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getShipPrCntL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getShipPrCntL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1760_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1760_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1760_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1760_Upd01Bridge() {
			p_MS_MSBEL1760_Upd01 = new MCParam(PDef.MS_MSBEL1760_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1760_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1760.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.ShipPrCntR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));

			p_MS_MSBEL1760_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1760_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1760_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL1760_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1760_Upd01.addUpBlock(getShipPrCntL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1760_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1760_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1760.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1760.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1760.RsltR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR>)up(2);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1760.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1760_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1760_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)p_MS_MSBEL1760_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRsltL());
			result.add(getShipPrCntL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1760_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1760_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1760_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1760_Del01Bridge() {
			p_MS_MSBEL1760_Del01 = new MCParam(PDef.MS_MSBEL1760_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1760_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.ShipPrCntR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));

			p_MS_MSBEL1760_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1760_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1760_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1760_Del01.addUpBlock(getShipPrCntL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1760_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1760_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1760.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.ShipPrCntR>)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1760.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1760_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1760.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1760_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1760.RsltR>)p_MS_MSBEL1760_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getShipPrCntL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}